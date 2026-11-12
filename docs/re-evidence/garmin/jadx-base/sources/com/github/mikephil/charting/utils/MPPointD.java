package com.github.mikephil.charting.utils;

import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public class MPPointD extends ObjectPool.Poolable {
    private static ObjectPool<MPPointD> pool;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public double f52826x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public double f52827y;

    static {
        ObjectPool<MPPointD> objectPoolCreate = ObjectPool.create(64, new MPPointD(0.0d, 0.0d));
        pool = objectPoolCreate;
        objectPoolCreate.setReplenishPercentage(0.5f);
    }

    private MPPointD(double d14, double d15) {
        this.f52826x = d14;
        this.f52827y = d15;
    }

    public static MPPointD getInstance(double d14, double d15) {
        MPPointD mPPointD = (MPPointD) pool.get();
        mPPointD.f52826x = d14;
        mPPointD.f52827y = d15;
        return mPPointD;
    }

    public static void recycleInstance(MPPointD mPPointD) {
        pool.recycle(mPPointD);
    }

    public static void recycleInstances(List<MPPointD> list) {
        pool.recycle(list);
    }

    @Override // com.github.mikephil.charting.utils.ObjectPool.Poolable
    public ObjectPool.Poolable instantiate() {
        return new MPPointD(0.0d, 0.0d);
    }

    public String toString() {
        return "MPPointD, x: " + this.f52826x + ", y: " + this.f52827y;
    }
}
