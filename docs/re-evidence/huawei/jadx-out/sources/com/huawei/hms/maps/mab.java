package com.huawei.hms.maps;

import android.content.Context;
import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes10.dex */
public abstract class mab {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private volatile Bitmap f14190a;

    public abstract Bitmap a(Context context);

    public Bitmap b(Context context) {
        if (this.f14190a == null) {
            synchronized (this) {
                if (this.f14190a == null) {
                    this.f14190a = a(context);
                }
            }
        }
        return this.f14190a;
    }
}
