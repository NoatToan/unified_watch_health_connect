package com.huawei.hms.maps;

import android.content.Context;
import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes34.dex */
public class mah extends mab {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final mah f14193c = new mah(0.0f);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f14194b;

    public mah(float f) {
        this.f14194b = f > 180.0f ? f - 360.0f : f;
    }

    @Override // com.huawei.hms.maps.mab
    public Bitmap a(Context context) {
        return null;
    }
}
