package com.huawei.ui.device.interactors;

import android.content.Context;
import com.huawei.hwlogsmodel.LogUtil;
import defpackage.lws;

/* JADX INFO: loaded from: classes16.dex */
public class UploadMaintLogInteractor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private lws f24956a;

    public UploadMaintLogInteractor(Context context) {
        this.f24956a = lws.c(context);
    }

    public void d(boolean z, String str) {
        LogUtil.d("UploadMaintLogInteractor", "startUploadLogFile()");
        this.f24956a.c(z, str);
    }
}
