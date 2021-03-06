package hello.core.discount;

import hello.core.member.Grade;
import hello.core.member.Member;

public class FixDiscountPolicy implements DiscountPolicy{

    private int disscountFixAmount = 1000;
    @Override
    public int discount(Member memebr, int price) {
        if(memebr.getGrade() == Grade.VIP) {
            return disscountFixAmount;
        } else {
            return 0;
        }
    }
}
