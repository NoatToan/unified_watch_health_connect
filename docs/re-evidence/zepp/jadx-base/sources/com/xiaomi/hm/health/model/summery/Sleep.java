package com.xiaomi.hm.health.model.summery;

import java.util.Date;

/* JADX INFO: loaded from: classes21.dex */
public class Sleep {
    public int dp;
    public int dt;
    public long ed;
    public int is;
    public int lb;
    public int lt;
    public int rhr;
    public int score;
    public int sleepMinutes;
    public long st;
    public int wc;
    public int wk;

    public Sleep(int lt, long st, int wk, int dp, long ed, int rhr, int is, int lb, int dt, int ss, int wc) {
        this.st = st;
        this.ed = ed;
        this.lt = Math.max(lt, 0);
        this.wk = Math.max(wk, 0);
        this.dp = Math.max(dp, 0);
        this.score = ss;
        this.rhr = rhr;
        this.is = is;
        this.lb = lb;
        this.dt = dt;
        this.wc = wc;
        this.sleepMinutes = ((int) (((ed - st) / 1000) / 60)) - wk;
    }

    public int getNapDuration() {
        return this.lt + this.dp + this.dt;
    }

    public String toString() {
        return "lt = " + this.lt + ";sleepStart = " + new Date(this.st).toString() + ";endSleep = " + new Date(this.ed).toString() + ";wk = " + this.wk + ";dp = " + this.dp + ";rhr = " + this.rhr + ";sleepMinutes = " + this.sleepMinutes;
    }
}
