/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package me.williandrade.rule;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import me.williandrade.exception.RuleException;

/**
 *
 * @author williamandrade
 */
public abstract class BaseRule<T> implements RuleInterface<T> {

    private List<RuleInterface> rules = new ArrayList<>();

    public BaseRule() {
    }

    public BaseRule(RuleInterface... rule) {
        if (rule == null) {
            return;
        }

        rules = new ArrayList<>(Arrays.asList(rule));
    }

    public void valid(T obj) throws RuleException {
        this.logic(obj);
        for (RuleInterface rule : rules) {
            rule.logic(obj);
        }
    }

    /**
     * Do not use this method to run, use method <b>valid</b> instead
     *
     * @param obj
     * @throws RuleException
     */
    @Override
    public abstract void logic(T obj) throws RuleException;

}
