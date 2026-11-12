package com.huawei.openalliance.ad.analysis;

import android.content.Context;
import com.huawei.hms.ads.analysis.DynamicLoaderAnalysis;
import com.huawei.hms.ads.analysis.IDynamicLoaderAnalysis;
import com.huawei.openalliance.ad.hw;
import com.huawei.openalliance.ad.inter.HiAd;

/* JADX INFO: loaded from: classes12.dex */
public class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static a f18256a;

    static class a implements IDynamicLoaderAnalysis {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Context f18257a;

        @Override // com.huawei.hms.ads.analysis.IDynamicLoaderAnalysis
        public void onLoaderSuccess(String str, String str2, long j) {
            if (HiAd.getInstance(this.f18257a).isEnableUserInfo()) {
                new i(this.f18257a).a(str, str2, j);
            }
        }

        @Override // com.huawei.hms.ads.analysis.IDynamicLoaderAnalysis
        public void onLoaderException(String str, String str2, int i, String str3) {
            if (HiAd.getInstance(this.f18257a).isEnableUserInfo()) {
                new i(this.f18257a).a(str, str2, i, str3);
            }
        }

        public a(Context context) {
            this.f18257a = context.getApplicationContext();
        }
    }

    public static void a(Context context) {
        try {
            if (f18256a == null) {
                f18256a = new a(context);
            }
            DynamicLoaderAnalysis.getInstance().registerDynamicLoaderAnalysis("hiadsdk", f18256a);
        } catch (Throwable th) {
            hw.c("DyLoaderAnalysisUtil", "init analysis err: %s", th.getClass().getSimpleName());
        }
    }
}
