package com.huawei.hms.maps;

import android.content.Context;
import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes10.dex */
public class mag extends mab {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Bitmap f14192b;

    public mag(Bitmap bitmap) {
        this.f14192b = bitmap;
    }

    @Override // com.huawei.hms.maps.mab
    public Bitmap a(Context context) {
        return this.f14192b;
    }
}
