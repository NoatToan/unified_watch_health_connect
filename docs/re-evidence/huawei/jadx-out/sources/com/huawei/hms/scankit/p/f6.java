package com.huawei.hms.scankit.p;

import android.hardware.Camera;

/* JADX INFO: loaded from: classes34.dex */
public class f6 implements Camera.PreviewCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private j0.d f16087a;

    public f6(j0.d dVar) {
        this.f16087a = dVar;
    }

    @Override // android.hardware.Camera.PreviewCallback
    public void onPreviewFrame(byte[] bArr, Camera camera) {
        this.f16087a.a(bArr);
    }
}
