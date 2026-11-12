package com.huawei.hms.hmsscankit;

import android.text.TextUtils;
import com.huawei.hms.hmsscankit.api.IOnResultCallback;
import com.huawei.hms.ml.scan.HmsScan;
import com.huawei.hms.scankit.p.o4;

/* JADX INFO: loaded from: classes10.dex */
class e extends IOnResultCallback.Stub {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final OnResultCallback f13536a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f13537b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f13538c;

    e(OnResultCallback onResultCallback, boolean z) {
        this.f13536a = onResultCallback;
        this.f13538c = z;
    }

    @Override // com.huawei.hms.hmsscankit.api.IOnResultCallback
    public void onResult(HmsScan[] hmsScanArr) {
        HmsScan hmsScan;
        o4.d("OnResultCallbackDelegat", "result callback sdk continueScan" + this.f13538c);
        if (this.f13538c) {
            this.f13536a.onResult(hmsScanArr);
            return;
        }
        if (hmsScanArr == null || hmsScanArr.length <= 0 || (hmsScan = hmsScanArr[0]) == null || TextUtils.equals(this.f13537b, hmsScan.getOriginalValue())) {
            return;
        }
        this.f13537b = hmsScanArr[0].getOriginalValue();
        o4.d("OnResultCallbackDelegat", "result callback sdk continueScan" + this.f13538c);
        this.f13536a.onResult(hmsScanArr);
    }
}
