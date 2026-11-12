package com.github.mikephil.charting.utils;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public class MPPointF extends ObjectPool.Poolable {
    public static final Parcelable.Creator<MPPointF> CREATOR;
    private static ObjectPool<MPPointF> pool;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public float f52828x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public float f52829y;

    static {
        ObjectPool<MPPointF> objectPoolCreate = ObjectPool.create(32, new MPPointF(0.0f, 0.0f));
        pool = objectPoolCreate;
        objectPoolCreate.setReplenishPercentage(0.5f);
        CREATOR = new Parcelable.Creator<MPPointF>() { // from class: com.github.mikephil.charting.utils.MPPointF.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public MPPointF createFromParcel(Parcel parcel) {
                MPPointF mPPointF = new MPPointF(0.0f, 0.0f);
                mPPointF.my_readFromParcel(parcel);
                return mPPointF;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public MPPointF[] newArray(int i14) {
                return new MPPointF[i14];
            }
        };
    }

    public MPPointF(float f14, float f15) {
        this.f52828x = f14;
        this.f52829y = f15;
    }

    public static MPPointF getInstance(MPPointF mPPointF) {
        MPPointF mPPointF2 = (MPPointF) pool.get();
        mPPointF2.f52828x = mPPointF.f52828x;
        mPPointF2.f52829y = mPPointF.f52829y;
        return mPPointF2;
    }

    public static void recycleInstance(MPPointF mPPointF) {
        pool.recycle(mPPointF);
    }

    public static void recycleInstances(List<MPPointF> list) {
        pool.recycle(list);
    }

    public float getX() {
        return this.f52828x;
    }

    public float getY() {
        return this.f52829y;
    }

    @Override // com.github.mikephil.charting.utils.ObjectPool.Poolable
    public ObjectPool.Poolable instantiate() {
        return new MPPointF(0.0f, 0.0f);
    }

    public void my_readFromParcel(Parcel parcel) {
        this.f52828x = parcel.readFloat();
        this.f52829y = parcel.readFloat();
    }

    public MPPointF() {
    }

    public static MPPointF getInstance() {
        return (MPPointF) pool.get();
    }

    public static MPPointF getInstance(float f14, float f15) {
        MPPointF mPPointF = (MPPointF) pool.get();
        mPPointF.f52828x = f14;
        mPPointF.f52829y = f15;
        return mPPointF;
    }
}
