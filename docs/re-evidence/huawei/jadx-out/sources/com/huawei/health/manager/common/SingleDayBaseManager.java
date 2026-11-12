package com.huawei.health.manager.common;

import android.content.Context;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import defpackage.lsl;
import health.compact.a.StepCounterSupport;

/* JADX INFO: loaded from: classes2.dex */
public abstract class SingleDayBaseManager {
    private static final String TAG = "Step_SingleDayBaseManager";
    protected Context mContext;
    protected CustomClock mEventClock;
    protected boolean mIsSupportExtendStep;
    private final Object mLockBaseMgr;

    public SingleDayBaseManager(Context context) {
        this.mContext = null;
        this.mIsSupportExtendStep = false;
        Object obj = new Object();
        this.mLockBaseMgr = obj;
        synchronized (obj) {
            CustomClock customClock = new CustomClock();
            this.mEventClock = customClock;
            customClock.b(System.currentTimeMillis());
            context = context == null ? BaseApplication.getContext() : context;
            this.mContext = context;
            this.mIsSupportExtendStep = StepCounterSupport.j(context);
        }
    }

    protected void checkDataConsistency(long j, long j2) throws Exception {
        if (!lsl.c(j, j2)) {
            LogUtil.j(TAG, "checkDataConsistency not today timestampBase=", Long.valueOf(j), " timestampArg=", Long.valueOf(j2));
            throw new Exception("not today record");
        }
        if (lsl.r(j2) == j) {
            return;
        }
        LogUtil.j(TAG, "checkDataConsistency is same day,but timeZone changed!!! ", "timestampBase=", Long.valueOf(j), " timestampArg=", Long.valueOf(j2));
        throw new Exception("same day,but timeZone changed!!!");
    }

    public void reduceClass() {
        synchronized (this.mLockBaseMgr) {
            LogUtil.j(TAG, "reduceClass");
            this.mIsSupportExtendStep = false;
        }
    }

    public static class CustomClock {
        private long e = System.currentTimeMillis();

        CustomClock() {
        }

        public void b(long j) {
            this.e = j;
        }

        public long c() {
            return this.e;
        }
    }
}
