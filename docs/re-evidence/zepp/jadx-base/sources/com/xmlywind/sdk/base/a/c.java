package com.xmlywind.sdk.base.a;

import android.text.TextUtils;
import android.util.Log;
import com.xmlywind.logger.SigmobLog;
import com.xmlywind.sdk.base.common.e;
import com.xmlywind.sdk.base.common.t;
import com.xmlywind.sdk.base.models.BaseAdUnit;
import com.xmlywind.sdk.base.models.SigMacroCommon;
import com.xmlywind.sdk.common.SDKConfig;
import com.xmlywind.sdk.common.e.f;
import com.xmlywind.sdk.common.e.k;
import com.xmlywind.volley.i;
import com.xmlywind.volley.n;
import com.xmlywind.volley.p;
import com.xmlywind.volley.s;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes22.dex */
public class c extends k<i> {
    private static int b;
    private final a c;

    public interface a extends n.a {
        void a(i iVar);
    }

    public c(String str, int i, int i2, a aVar) {
        super(str, 0, aVar);
        this.c = aVar;
        if (i < 0) {
            i = 0;
        } else if (i > 3) {
            i = 3;
        }
        b(true);
        a((p) new com.xmlywind.volley.c(i2, 10000, i, 0.0f));
        a(false);
    }

    public c(String str, int i, a aVar) {
        this(str, i, 10000, aVar);
    }

    public static int a(BaseAdUnit baseAdUnit, String str, boolean z) {
        if (baseAdUnit == null || TextUtils.isEmpty(str) || TextUtils.isEmpty(str)) {
            return -1;
        }
        List<e> adTracker = baseAdUnit.getAdTracker(str);
        if (adTracker == null || adTracker.isEmpty()) {
            return -2;
        }
        for (e eVar : adTracker) {
            if (z) {
                eVar.a("js");
            }
            SigMacroCommon macroCommon = baseAdUnit.getMacroCommon();
            if (macroCommon instanceof SigMacroCommon) {
                macroCommon.addMarcoKey(SigMacroCommon._PLAYFIRSTFRAME_, "1");
            }
            a(eVar, baseAdUnit, false);
        }
        return 0;
    }

    public static void a(final e eVar, final BaseAdUnit baseAdUnit, boolean z) {
        if (eVar == null || eVar.h() != e.a.TRACKING_URL || eVar.l()) {
            return;
        }
        final String strMacroProcess = baseAdUnit != null ? baseAdUnit.getMacroCommon().macroProcess(eVar.j()) : eVar.j();
        if (!z) {
            eVar.k();
        }
        final boolean z2 = eVar.e() != null;
        c cVar = new c(strMacroProcess, z2 ? 0 : eVar.i().intValue(), new a() { // from class: com.xmlywind.sdk.base.a.c.1
            @Override // com.xmlywind.sdk.base.a.c.a
            public void a(i iVar) {
                t.a(eVar, strMacroProcess, baseAdUnit, iVar, (t.a) null);
                if (z2) {
                    Log.i("adtracker", "retry Send success " + c.b);
                    com.xmlywind.sdk.common.b.c.a(new Runnable() { // from class: com.xmlywind.sdk.base.a.c.1.1
                        @Override // java.lang.Runnable
                        public void run() {
                            eVar.f();
                        }
                    });
                }
            }

            @Override // com.xmlywind.volley.n.a
            public void onErrorResponse(s sVar) {
                i iVar = sVar.a;
                if (eVar.i().intValue() > 0 || z2) {
                    com.xmlywind.sdk.common.b.c.a(new Runnable() { // from class: com.xmlywind.sdk.base.a.c.1.2
                        @Override // java.lang.Runnable
                        public void run() {
                            AnonymousClass1 anonymousClass1 = AnonymousClass1.this;
                            if (!z2) {
                                eVar.b(strMacroProcess);
                                eVar.a((com.xmlywind.sdk.common.a.c.a) null);
                                return;
                            }
                            eVar.c();
                            if (eVar.b() >= SDKConfig.sharedInstance().getAdTrackerMaxRetryNum()) {
                                eVar.f();
                            } else {
                                eVar.d();
                            }
                        }
                    });
                }
                t.a(eVar, strMacroProcess, baseAdUnit, sVar);
                SigmobLog.e(sVar.getMessage());
            }
        });
        if (f.g() != null) {
            f.g().a(cVar);
        } else {
            t.a(eVar, strMacroProcess, baseAdUnit, (s) null);
            SigmobLog.e("RequestQueue is null");
        }
    }

    public static void a(BaseAdUnit baseAdUnit, com.xmlywind.sdk.base.common.a aVar) {
        a(baseAdUnit, aVar, false);
    }

    public static void a(BaseAdUnit baseAdUnit, com.xmlywind.sdk.base.common.a aVar, boolean z) {
        List<e> adTracker;
        if (aVar == null || baseAdUnit == null || TextUtils.isEmpty(aVar.a()) || (adTracker = baseAdUnit.getAdTracker(aVar.a())) == null) {
            return;
        }
        for (e eVar : adTracker) {
            SigMacroCommon macroCommon = baseAdUnit.getMacroCommon();
            if (macroCommon instanceof SigMacroCommon) {
                macroCommon.addMarcoKey(SigMacroCommon._PLAYFIRSTFRAME_, "1");
            }
            a(eVar, baseAdUnit, z);
        }
    }

    public static void a_() {
        e.b(3000L);
        f.g().a();
        Iterator<e> it2 = e.a(3000, SDKConfig.sharedInstance().getADTrackerExpiredTime()).iterator();
        while (it2.hasNext()) {
            a(it2.next(), (BaseAdUnit) null, false);
        }
        e.a(SDKConfig.sharedInstance().getADTrackerExpiredTime());
    }

    @Override // com.xmlywind.sdk.common.e.k, com.xmlywind.volley.l
    public n<i> a(i iVar) {
        return n.a(iVar, null);
    }

    @Override // com.xmlywind.volley.l
    public void a(s sVar) {
        SigmobLog.e("send tracking: " + h() + " fail");
        super.a(sVar);
    }

    @Override // com.xmlywind.volley.l
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void a(i iVar) {
        a aVar;
        synchronized (this.a) {
            aVar = this.c;
        }
        SigmobLog.i("send tracking: " + h() + " success");
        if (aVar != null) {
            aVar.a(iVar);
        }
    }

    @Override // com.xmlywind.volley.l
    public int d() {
        return 100;
    }
}
