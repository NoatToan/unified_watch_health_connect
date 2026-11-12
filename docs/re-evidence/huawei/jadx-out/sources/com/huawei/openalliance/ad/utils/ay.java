package com.huawei.openalliance.ad.utils;

import android.content.Context;
import android.text.TextUtils;
import android.webkit.JavascriptInterface;
import com.huawei.openalliance.ad.db.bean.ContentRecord;
import com.huawei.openalliance.ad.hw;
import com.huawei.openalliance.ad.pc;
import com.huawei.openalliance.ad.sw;

/* JADX INFO: loaded from: classes12.dex */
public class ay {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private pc f20443a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ContentRecord f20444b;

    @JavascriptInterface
    public void eventReport(String str, String str2, boolean z) {
        a(str, str2, z);
    }

    @JavascriptInterface
    public void eventReport(String str, String str2) {
        a(str, str2, false);
    }

    private boolean a(ContentRecord contentRecord) {
        if (contentRecord == null) {
            return false;
        }
        return "2".equals(contentRecord.af()) || "1".equals(contentRecord.af());
    }

    private void a(String str, String str2, boolean z) {
        hw.b("ILandingJs", "call event report from js");
        if (!a(this.f20444b)) {
            hw.c("ILandingJs", "has no permission to report event");
        } else if (TextUtils.isEmpty(str2)) {
            hw.c("ILandingJs", "additionalinfo is null");
        } else {
            this.f20443a.a(str, str2, z);
        }
    }

    public ay(Context context, ContentRecord contentRecord) {
        this.f20444b = contentRecord;
        this.f20443a = new pc(context, sw.a(context, contentRecord.f()), contentRecord);
    }
}
