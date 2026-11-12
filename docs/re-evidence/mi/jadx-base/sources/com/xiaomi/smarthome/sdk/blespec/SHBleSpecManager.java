package com.xiaomi.smarthome.sdk.blespec;

import android.content.Context;
import android.os.Bundle;
import defpackage.m5n;
import defpackage.p5n;
import defpackage.wa3;

/* JADX INFO: loaded from: classes2.dex */
public class SHBleSpecManager {
    private static SHBleSpecManager sInstance;
    private Context mContext;

    public interface IBleSpecCallback<T> {
        void onFail(int i, String str);

        void onSuccess(T t);
    }

    public static SHBleSpecManager getInstance() {
        if (sInstance == null) {
            synchronized (SHBleSpecManager.class) {
                try {
                    if (sInstance == null) {
                        sInstance = new SHBleSpecManager();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return sInstance;
    }

    public void bleSpecOperation(String str, int i, String str2, final IBleSpecCallback<Bundle> iBleSpecCallback) {
        m5n.c(str, i, str2, "", new wa3<Bundle>() { // from class: com.xiaomi.smarthome.sdk.blespec.SHBleSpecManager.1
            @Override // defpackage.wa3
            public void onFail(int i2, String str3) {
                iBleSpecCallback.onFail(i2, str3);
            }

            @Override // defpackage.wa3
            public void onSuccess(Bundle bundle) {
                iBleSpecCallback.onSuccess(bundle);
            }
        });
    }

    public void init(Context context) {
        this.mContext = context;
        p5n.i().l(context, "", null);
    }
}
