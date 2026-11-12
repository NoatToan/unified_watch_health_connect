package com.huawei.ads.adsrec;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.openplatform.abl.log.HiAdLog;
import defpackage.axi;
import defpackage.ayb;
import defpackage.ayh;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public class v implements e0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f4775b;
    private final ayh e = ayh.c();

    @Override // com.huawei.ads.adsrec.e0
    public void a(String str, Set<String> set) {
        if (TextUtils.isEmpty(str) || set == null) {
            return;
        }
        ayb aybVarE = this.e.e(this.f4775b, str);
        aybVarE.a(set);
        this.e.d(aybVarE);
    }

    @Override // com.huawei.ads.adsrec.e0
    public void a(axi axiVar) {
        HiAdLog.i("DeduplicateTask", "start to distinct");
        if (axiVar == null || TextUtils.isEmpty(axiVar.c())) {
            return;
        }
        ayb aybVarE = this.e.e(this.f4775b, axiVar.c());
        aybVarE.b(axiVar.i());
        this.e.d(aybVarE);
        HiAdLog.i("DeduplicateTask", "end to distinct");
    }

    @Override // com.huawei.ads.adsrec.e0
    public void a() {
        this.e.a();
    }

    public v(Context context) {
        this.f4775b = context;
    }
}
