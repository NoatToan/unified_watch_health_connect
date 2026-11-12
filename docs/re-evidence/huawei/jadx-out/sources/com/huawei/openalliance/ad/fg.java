package com.huawei.openalliance.ad;

import android.content.Context;
import com.huawei.hms.ads.common.inter.LoaderCommonInter;
import com.huawei.openalliance.ad.constant.WhiteListPkgList;

/* JADX INFO: loaded from: classes12.dex */
public class fg implements LoaderCommonInter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static fg f18755a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final byte[] f18756c = new byte[0];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f18757b;

    @Override // com.huawei.hms.ads.common.inter.LoaderCommonInter
    public void saveReportPoint(int i, Integer num, Integer num2) {
        new com.huawei.openalliance.ad.analysis.c(this.f18757b).a(i, num, num2);
    }

    @Override // com.huawei.hms.ads.common.inter.LoaderCommonInter
    public boolean isTrustApp(String str, String str2) {
        return WhiteListPkgList.isTrustApp(this.f18757b, str, str2);
    }

    private static fg b(Context context) {
        fg fgVar;
        synchronized (f18756c) {
            if (f18755a == null) {
                f18755a = new fg(context);
            }
            fgVar = f18755a;
        }
        return fgVar;
    }

    public static fg a(Context context) {
        return b(context);
    }

    private fg(Context context) {
        this.f18757b = context;
    }
}
