/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.text.SimpleDateFormat;
import java.util.Date;
import me.williandrade.exception.RuleException;
import me.williandrade.rule.BaseRule;
import me.williandrade.test.obj.TestObj;
import me.williandrade.test.rule.TypeRule;
import me.williandrade.test.rule.ValidNameRule;

/**
 *
 * @author williamandrade
 */
public class Main {

    public static void main(String[] args) throws Exception {
        TypeRule typeRule = new TypeRule();

        TestObj obj = new TestObj();
        obj.setName("William");
        obj.setType("name");

        typeRule.valid(obj);
    }

    public static void logger(String text) {
        System.out.println("[DEBUG] " + new SimpleDateFormat("dd/MM/yy hh:mm:ss").format(new Date()) + " - " + text);
    }

}
