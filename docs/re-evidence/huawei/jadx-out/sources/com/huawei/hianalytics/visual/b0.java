package com.huawei.hianalytics.visual;

import android.webkit.JavascriptInterface;
import com.huawei.hianalytics.core.log.HiLog;

/* JADX INFO: loaded from: classes33.dex */
public final class b0 {
    @JavascriptInterface
    public void haVisualizedLog(String str) {
        HiLog.d("HAWebViewVisualInterface_JS", str);
    }
}
