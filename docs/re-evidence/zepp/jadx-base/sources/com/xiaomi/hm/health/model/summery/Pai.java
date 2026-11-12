package com.xiaomi.hm.health.model.summery;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public class Pai {
    public String as;
    public int dp;
    public int gender;
    public int hm;
    public int hp;
    public int hrHighLimit;
    public int hrLowLimit;
    public int hrMediumLimit;
    public int lm;
    public int lp;
    public int maxHr;
    public int mm;
    public int mp;
    public String nas;
    public int rhr;
    public int tp;

    public Pai(int lp, int mp, int hp, int lm, int mm, int hm, int dp, int tp, String as, String nas, int maxHr, int rhr, int gender, int hrLowLimit, int hrMediumLimit, int hrHighLimit) {
        this.lp = lp;
        this.mp = mp;
        this.hp = hp;
        this.lm = lm;
        this.mm = mm;
        this.hm = hm;
        this.dp = dp;
        this.tp = tp;
        this.as = as;
        this.nas = nas;
        this.maxHr = maxHr;
        this.rhr = rhr;
        this.gender = gender;
        this.hrLowLimit = hrLowLimit;
        this.hrMediumLimit = hrMediumLimit;
        this.hrHighLimit = hrHighLimit;
    }

    @NotNull
    public String toString() {
        return "低分区PAI值 = " + this.lp + " 中分区PAI值 =  " + this.mp + ";高分区PAI值 = " + this.hp + ";低分区时间值 = " + this.lm + ";中分区时间值 " + this.mm + ";高分区时间值＝\u3000" + this.hm + ";每日PAI值 = " + this.dp + ";总计PAI值\u3000＝\u3000" + this.tp + ";低pai阀值 = " + this.hrLowLimit + ";中pai阀值\u3000＝\u3000" + this.hrMediumLimit + ";高pai阀值 = " + this.hrHighLimit;
    }
}
