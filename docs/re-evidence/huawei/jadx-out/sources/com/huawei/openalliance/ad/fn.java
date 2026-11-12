package com.huawei.openalliance.ad;

import android.content.Context;
import com.huawei.openalliance.ad.db.bean.SdkCfgSha256Record;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public class fn extends es {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static fn f18808c;
    private static final byte[] d = new byte[0];
    private static final byte[] e = new byte[0];

    public void a(SdkCfgSha256Record sdkCfgSha256Record) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (sdkCfgSha256Record == null || this.f18718a == null) {
            return;
        }
        synchronized (e) {
            ArrayList arrayList = new ArrayList();
            String simpleName = a().getSimpleName();
            String strA = sdkCfgSha256Record.a();
            arrayList.add(new dh(simpleName, fq.SDKCFG_SHA256_BY_PKG.a(), new String[]{strA}, fq.SDKCFG_SHA256_BY_PKG.a(), new String[]{strA}, sdkCfgSha256Record.d(this.f18718a)));
            c(arrayList);
        }
        hw.a("SdkCfgSha256RecordDao", "insertOrUpdateContents duration: %s ms", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis));
    }

    public String a(String str) {
        SdkCfgSha256Record sdkCfgSha256RecordB = b(str);
        if (sdkCfgSha256RecordB != null) {
            return sdkCfgSha256RecordB.b();
        }
        return null;
    }

    protected Class<? extends SdkCfgSha256Record> a() {
        return SdkCfgSha256Record.class;
    }

    private SdkCfgSha256Record b(String str) {
        List listA = a(SdkCfgSha256Record.class, null, fq.SDKCFG_SHA256_BY_PKG, new String[]{str}, null, null);
        if (!com.huawei.openalliance.ad.utils.bm.a(listA)) {
            return (SdkCfgSha256Record) listA.get(0);
        }
        hw.a("SdkCfgSha256RecordDao", "no match sha256");
        return null;
    }

    public static fn a(Context context) {
        fn fnVar;
        synchronized (d) {
            if (f18808c == null) {
                f18808c = new fn(context);
            }
            fnVar = f18808c;
        }
        return fnVar;
    }

    private fn(Context context) {
        super(context);
    }
}
