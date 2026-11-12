package com.huawei.openalliance.ad;

import android.content.Context;
import com.huawei.hms.ads.common.inter.LoaderSpHandlerInter;

/* JADX INFO: loaded from: classes12.dex */
public class fh implements LoaderSpHandlerInter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static fh f18758a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static gk f18759b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final byte[] f18760c = new byte[0];

    @Override // com.huawei.hms.ads.common.inter.LoaderSpHandlerInter
    public void setKitloaderLastCheckTime(long j) {
        f18759b.p(j);
    }

    @Override // com.huawei.hms.ads.common.inter.LoaderSpHandlerInter
    public boolean getLoaderEngineUpdate(String str) {
        return f18759b.z(str);
    }

    @Override // com.huawei.hms.ads.common.inter.LoaderSpHandlerInter
    public int getLoaderEngineInterval(String str) {
        return f18759b.B(str);
    }

    @Override // com.huawei.hms.ads.common.inter.LoaderSpHandlerInter
    public int getLoaderEngin2KitUpdate(String str) {
        return f18759b.A(str);
    }

    @Override // com.huawei.hms.ads.common.inter.LoaderSpHandlerInter
    public long getKitloaderLastCheckTime() {
        return f18759b.cH();
    }

    private static fh b(Context context) {
        fh fhVar;
        synchronized (f18760c) {
            if (f18758a == null) {
                f18758a = new fh(context);
            }
            fhVar = f18758a;
        }
        return fhVar;
    }

    public static fh a(Context context) {
        return b(context);
    }

    private fh(Context context) {
        f18759b = fp.b(context);
    }
}
