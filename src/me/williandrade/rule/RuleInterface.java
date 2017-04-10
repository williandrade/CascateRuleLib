/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package me.williandrade.rule;

import me.williandrade.exception.RuleException;

/**
 *
 * @author williamandrade
 */
public interface RuleInterface<T> {

    public void logic(T obj) throws RuleException;

}
