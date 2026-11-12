package com.xiaomi.hm.health.model.summery;

/* JADX INFO: loaded from: classes21.dex */
public class Steps {
    public int activeTime;
    public int cal;
    public int dis;
    public int rn;
    public int runCal;
    public int runDist;
    public int ttl;
    public int wk;

    public Steps(int rn, int cal, int runDist, int wk, int ttl, int runCal, int dis, int watchActive) {
        this.rn = rn > 0 ? rn : 0;
        this.cal = cal <= 0 ? 0 : cal;
        this.runDist = runDist <= 0 ? 0 : runDist;
        this.wk = wk > 0 ? wk : 0;
        this.ttl = ttl <= 0 ? 0 : ttl;
        this.runCal = runCal <= 0 ? 0 : runCal;
        this.dis = dis <= 0 ? 0 : dis;
        int i = wk + rn;
        this.activeTime = i > 0 ? i : watchActive;
    }

    public String toString() {
        return "跑步时长 == " + this.rn + ";卡路里 = " + this.cal + ";跑步距离 = " + this.runDist + ";行走时长 " + this.wk + ";步数＝\u3000" + this.ttl + ";跑步消耗 = " + this.runCal + ";距离\u3000＝\u3000" + this.dis;
    }
}
