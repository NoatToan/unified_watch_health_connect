package com.huami.android.zxing;

import com.google.zxing.ResultPoint;
import com.google.zxing.ResultPointCallback;

/* JADX INFO: loaded from: classes5.dex */
final class c implements ResultPointCallback {
    private final ViewfinderView a;

    public c(ViewfinderView viewfinderView) {
        this.a = viewfinderView;
    }

    @Override // com.google.zxing.ResultPointCallback
    public void foundPossibleResultPoint(ResultPoint resultPoint) {
    }
}
