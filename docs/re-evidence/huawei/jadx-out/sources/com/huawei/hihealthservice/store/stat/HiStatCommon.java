package com.huawei.hihealthservice.store.stat;

import android.content.Context;
import com.huawei.hihealth.HiHealthData;
import defpackage.kww;
import defpackage.kwz;
import defpackage.lkt;

/* JADX INFO: loaded from: classes10.dex */
public abstract class HiStatCommon {
    public Context mContext;
    public kww mDataStatManager;

    public abstract boolean stat(HiHealthData hiHealthData);

    public HiStatCommon(Context context) {
        if (context == null) {
            throw new lkt("HiStatCommon context = null");
        }
        this.mContext = context;
        this.mDataStatManager = kww.c(context);
    }

    protected HiStatCommon(Context context, String str) {
        if (context == null) {
            throw new lkt("HiStatCommon context = null");
        }
        this.mContext = context.getApplicationContext();
        this.mDataStatManager = kwz.d();
    }
}
