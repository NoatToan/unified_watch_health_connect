package com.huawei.openalliance.ad;

import android.content.Context;
import android.view.View;
import com.huawei.openalliance.ad.beans.metadata.Om;
import com.iab.omid.library.huawei.Omid;
import com.iab.omid.library.huawei.adsession.AdSession;
import com.iab.omid.library.huawei.adsession.AdSessionConfiguration;
import com.iab.omid.library.huawei.adsession.AdSessionContext;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public class lx implements mq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static boolean f19508a = mi.a("com.iab.omid.library.huawei.adsession.AdSession");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<AdSession> f19509b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f19510c;

    Context e() {
        return this.f19510c;
    }

    @Override // com.huawei.openalliance.ad.mq
    public void d() {
        if (!this.f19509b.isEmpty()) {
            try {
                Iterator<AdSession> it = this.f19509b.iterator();
                while (it.hasNext()) {
                    it.next().finish();
                    hw.a("AdsessionAgent", " adSession finish");
                }
            } catch (Throwable unused) {
                hw.b("AdsessionAgent", "finish, fail");
            }
        }
        this.f19509b.clear();
    }

    @Override // com.huawei.openalliance.ad.mq
    public void c() {
        if (this.f19509b.isEmpty()) {
            return;
        }
        try {
            for (AdSession adSession : this.f19509b) {
                hw.a("AdsessionAgent", "adsession start");
                adSession.start();
            }
        } catch (Throwable unused) {
            hw.b("AdsessionAgent", "start, fail");
        }
    }

    List<AdSession> b() {
        return this.f19509b;
    }

    @Override // com.huawei.openalliance.ad.mq
    public void a(View view, mp mpVar, String str) {
        if (this.f19509b.isEmpty() || mpVar == null || !mp.a()) {
            return;
        }
        try {
            Iterator<AdSession> it = this.f19509b.iterator();
            while (it.hasNext()) {
                it.next().addFriendlyObstruction(view, mp.a(mpVar), str);
            }
        } catch (Throwable unused) {
            hw.b("AdsessionAgent", "addFriendlyObstruction-f, fail");
        }
    }

    @Override // com.huawei.openalliance.ad.mq
    public void a(View view) {
        if (this.f19509b.isEmpty()) {
            return;
        }
        try {
            Iterator<AdSession> it = this.f19509b.iterator();
            while (it.hasNext()) {
                it.next().registerAdView(view);
            }
        } catch (Throwable unused) {
            hw.b("AdsessionAgent", "registerAdView, fail");
        }
    }

    public void a(Context context, List<Om> list, mm mmVar) throws Throwable {
        if (!a() || context == null || list == null) {
            hw.b("AdsessionAgent", "not available, not init");
            return;
        }
        if (list.isEmpty() || mmVar == null) {
            hw.b("AdsessionAgent", "oms is empty or sessionWrapper is null, not init");
            return;
        }
        hw.b("AdsessionAgent", "init");
        this.f19510c = context;
        a(list, mmVar);
    }

    private static boolean a(Context context) {
        Omid.activate(context);
        return true;
    }

    public static boolean a() {
        return f19508a;
    }

    private void a(List<Om> list, mm mmVar) throws Throwable {
        if (!mt.a()) {
            hw.b("AdsessionAgent", "init VerficationScriptResourceWrapper failed");
            return;
        }
        for (Om om : list) {
            hw.b("AdsessionAgent", "Init Verfication Script");
            mt mtVar = new mt();
            mtVar.a(om);
            a(mmVar, mtVar);
        }
    }

    private void a(AdSessionContext adSessionContext, mm mmVar) {
        String str;
        try {
            if (!mm.a() || mmVar == null) {
                str = "init AdSession failed";
            } else {
                AdSessionConfiguration adSessionConfigurationB = mmVar.b();
                if (adSessionConfigurationB == null) {
                    str = "adSessionConfiguration is null";
                } else {
                    hw.b("AdsessionAgent", "initAdSession");
                    AdSession adSessionCreateAdSession = a(this.f19510c) ? AdSession.createAdSession(adSessionConfigurationB, adSessionContext) : null;
                    if (adSessionCreateAdSession != null) {
                        this.f19509b.add(adSessionCreateAdSession);
                        return;
                    }
                    str = "adSession is null";
                }
            }
            hw.b("AdsessionAgent", str);
        } catch (Throwable unused) {
            hw.c("AdsessionAgent", "initAdSession error");
        }
    }

    private void a(mm mmVar, mt mtVar) throws Throwable {
        String str;
        if (mtVar == null) {
            str = "init AdSessionContext failed";
        } else {
            if (!mn.a()) {
                return;
            }
            AdSessionContext adSessionContextA = new mn(this.f19510c).a(mtVar, null);
            if (adSessionContextA != null) {
                a(adSessionContextA, mmVar);
                return;
            }
            str = "adSessionContext is null";
        }
        hw.b("AdsessionAgent", str);
    }
}
