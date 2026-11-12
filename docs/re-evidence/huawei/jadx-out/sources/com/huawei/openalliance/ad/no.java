package com.huawei.openalliance.ad;

import android.content.Context;
import com.huawei.openalliance.ad.constant.EventType;
import com.huawei.openalliance.ad.db.bean.ContentRecord;
import com.huawei.openalliance.ad.inter.data.AppInfo;

/* JADX INFO: loaded from: classes12.dex */
public class no {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f19763a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ContentRecord f19764b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private cv f19765c;
    private AppInfo d;
    private int e;
    private int f;

    public void b(int i) {
        String packageName = this.d.getPackageName();
        Context context = this.f19763a;
        pc pcVar = new pc(context, sw.a(context, this.f19764b.f()));
        pcVar.a(this.f19764b);
        com.huawei.openalliance.ad.analysis.a aVar = new com.huawei.openalliance.ad.analysis.a();
        aVar.c(com.huawei.openalliance.ad.utils.dg.a(Integer.valueOf(i)));
        aVar.b(com.huawei.openalliance.ad.utils.dg.a(Integer.valueOf(this.f)));
        if (com.huawei.openalliance.ad.utils.aq.b(this.f19763a, packageName)) {
            a(this.f19763a, aVar);
        } else {
            a(this.f19763a, packageName, pcVar, aVar);
        }
    }

    public void a(String str) {
        com.huawei.openalliance.ad.analysis.a aVar = new com.huawei.openalliance.ad.analysis.a();
        aVar.b(com.huawei.openalliance.ad.utils.dg.a(Integer.valueOf(this.f)));
        this.f19765c.a(this.f19764b, str, aVar);
    }

    public void a(int i) {
        this.e = i;
    }

    private void a(Context context, String str, pc pcVar, com.huawei.openalliance.ad.analysis.a aVar) {
        com.huawei.openalliance.ad.utils.dcservice.c.a aVar2 = new com.huawei.openalliance.ad.utils.dcservice.c.a();
        AppInfo appInfo = this.d;
        if (appInfo != null) {
            aVar2.a(appInfo);
        }
        aVar2.a(this.f19764b, context).c(str);
        if (com.huawei.openalliance.ad.utils.k.a(context, str, this.d.getIntentUri(), aVar2.a())) {
            com.huawei.openalliance.ad.download.app.l.a(context, this.d);
            pcVar.a(EventType.INTENTSUCCESS, (Integer) 1, (Integer) null);
            this.f19765c.a(this.f19764b, "1", aVar);
            return;
        }
        hw.b("PPSAppActivatePresenter", "handleClick, openAppIntent failed");
        pcVar.a(EventType.INTENTFAIL, (Integer) 1, Integer.valueOf(com.huawei.openalliance.ad.utils.k.a(context, str) ? 2 : 1));
        if (!com.huawei.openalliance.ad.utils.k.a(context, str, aVar2.a())) {
            hw.b("PPSAppActivatePresenter", "handleClick, openAppMainPage failed");
            return;
        }
        pcVar.a(Integer.valueOf(this.e));
        com.huawei.openalliance.ad.download.app.l.a(context, this.d);
        this.f19765c.a(this.f19764b, "1", aVar);
    }

    private void a(Context context, com.huawei.openalliance.ad.analysis.a aVar) {
        if (new tm(context, this.f19764b).a()) {
            this.f19765c.a(this.f19764b, "1", aVar);
        }
    }

    private void a(Context context) {
        this.f19765c = new com.huawei.openalliance.ad.analysis.c(context);
        this.d = this.f19764b.ag();
    }

    public no(Context context, ContentRecord contentRecord, int i) {
        this.f19763a = context;
        this.f19764b = contentRecord;
        this.f = i;
        a(context);
    }
}
