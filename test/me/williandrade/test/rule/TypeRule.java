/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package me.williandrade.test.rule;

import me.williandrade.exception.RuleException;
import me.williandrade.rule.BaseRule;
import me.williandrade.test.obj.TestObj;

/**
 *
 * @author williamandrade
 */
public class TypeRule extends BaseRule<TestObj> {

    public TypeRule() {
        super(new ValidNameRule());
    }

    @Override
    public void logic(TestObj obj) throws RuleException {
        if (!obj.getType().equalsIgnoreCase("NAME")) {
            throw new RuleException("Not accepted type");
        }
    }

}
