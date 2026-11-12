package com.xiaomi.hm.health.bt.profile.base;

import android.util.SparseArray;
import com.alipay.sdk.m.u.i;

/* JADX INFO: loaded from: classes11.dex */
public class GaitInfo {
    public static final int INDIFFERENCE = 2;
    public static final int LEFT_FOOT = 0;
    public static final int RIGHT_FOOT = 1;
    private SparseArray<Gait> a;
    private int b;

    public class Gait {
        private int a;
        private int b;

        public Gait(int touchTime, int flyTime) {
            this.a = 0;
            this.b = 0;
            this.a = touchTime;
            this.b = flyTime;
        }

        public int getFlyTime() {
            return this.b;
        }

        public int getTouchTime() {
            return this.a;
        }

        public void setFlyTime(int flyTime) {
            this.b = flyTime;
        }

        public void setTouchTime(int touchTime) {
            this.a = touchTime;
        }

        public String toString() {
            return "{touchTime=" + this.a + ",flyTime=" + this.b + i.d;
        }
    }

    public GaitInfo() {
        this.a = new SparseArray<>();
        this.b = 2;
    }

    public void addGait(int type, int touchTime, int flyTime) {
        this.a.put(type, new Gait(touchTime, flyTime));
    }

    public Gait get(int type) {
        return this.a.get(type);
    }

    public SparseArray<Gait> getGaits() {
        return this.a;
    }

    public int getType() {
        return this.b;
    }

    public void setType(int type) {
        this.b = type;
    }

    public String toString() {
        return "GaitInfo{gaits=" + this.a + ", type=" + this.b + '}';
    }

    public GaitInfo(int touchTime, int flyTime) {
        SparseArray<Gait> sparseArray = new SparseArray<>();
        this.a = sparseArray;
        this.b = 2;
        sparseArray.put(2, new Gait(touchTime, flyTime));
    }
}
