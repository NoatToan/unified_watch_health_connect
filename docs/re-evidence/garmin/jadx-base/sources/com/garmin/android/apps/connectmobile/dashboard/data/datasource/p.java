package com.garmin.android.apps.connectmobile.dashboard.data.datasource;

import com.garmin.android.apps.connectmobile.v2;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.util.LinkedHashSet;
import p005kotlin.Metadata;
import r53.p2;
import r53.q2;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\tB\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lcom/garmin/android/apps/connectmobile/dashboard/data/datasource/p;", "Lcom/garmin/android/apps/connectmobile/dashboard/data/datasource/o;", "Lcom/garmin/android/apps/connectmobile/f0;", "Lcom/garmin/android/apps/connectmobile/dashboard/data/datasource/i2;", "api", "Lcom/garmin/android/apps/connectmobile/dashboard/data/datasource/s0;", "dashboardPreferences", "<init>", "(Lcom/garmin/android/apps/connectmobile/dashboard/data/datasource/i2;Lcom/garmin/android/apps/connectmobile/dashboard/data/datasource/s0;)V", "a", "gcm-dashboard_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class p implements o, com.garmin.android.apps.connectmobile.f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i2 f33306a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s0 f33307b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final u53.d f33308c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p2 f33309d;

    static {
        new a(null);
    }

    public p(i2 i2Var, s0 s0Var) {
        i2Var.getClass();
        s0Var.getClass();
        this.f33306a = i2Var;
        this.f33307b = s0Var;
        o53.e2 e2VarH = ge1.b.h();
        x53.c cVar = o53.s0.f129406a;
        this.f33308c = o53.c0.a(t13.g.a.C3052a.d(x53.b.f189152a, e2VarH));
        this.f33309d = q2.a(p13.l0.f134950a);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object c(p pVar, o70.c cVar, v13.c cVar2) {
        r rVar;
        pVar.getClass();
        if (cVar2 instanceof r) {
            rVar = (r) cVar2;
            int i14 = rVar.f33333c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                rVar.f33333c = i14 - Integer.MIN_VALUE;
            } else {
                rVar = new r(pVar, cVar2);
            }
        } else {
            rVar = new r(pVar, cVar2);
        }
        Object objJ = rVar.f33331a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = rVar.f33333c;
        if (i15 == 0) {
            o13.r.b(objJ);
            com.garmin.android.apps.connectmobile.a2 a2Var = com.garmin.android.apps.connectmobile.a2.DASHBOARD;
            com.garmin.android.apps.connectmobile.i2.f36769a.getClass();
            com.garmin.android.apps.connectmobile.i2.a.b(a2Var, "ActivityTrendsPreferencesDataSource", "getPromptSeen()");
            s sVar = new s(pVar, d(cVar), null);
            rVar.f33333c = 1;
            objJ = com.garmin.android.apps.connectmobile.f0.J(pVar, sVar, rVar);
            if (objJ == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objJ);
        }
        v2 v2Var = (v2) objJ;
        if (v2Var instanceof v2.b) {
            com.garmin.android.apps.connectmobile.a2 a2Var2 = com.garmin.android.apps.connectmobile.a2.DASHBOARD;
            String strF = b71.i.f("getPromptSeen() from server SUCCESS ", v2Var);
            com.garmin.android.apps.connectmobile.i2.f36769a.getClass();
            com.garmin.android.apps.connectmobile.i2.a.b(a2Var2, "ActivityTrendsPreferencesDataSource", strF);
            return ((v2.b) v2Var).f47386a;
        }
        if (!(v2Var instanceof v2.a)) {
            lc.u0.r();
            return null;
        }
        com.garmin.android.apps.connectmobile.a2 a2Var3 = com.garmin.android.apps.connectmobile.a2.DASHBOARD;
        com.garmin.android.apps.connectmobile.i2.f36769a.getClass();
        com.garmin.android.apps.connectmobile.i2.a.f(a2Var3, "ActivityTrendsPreferencesDataSource", "getPromptSeen() from server ERROR");
        return null;
    }

    public static String d(o70.c cVar) {
        String str;
        cVar.getClass();
        switch (o70.c.b.f129942a[cVar.ordinal()]) {
            case 1:
                str = "running";
                break;
            case 2:
                str = "cycling";
                break;
            case 3:
                str = "swimming";
                break;
            case 4:
                str = "walking";
                break;
            case 5:
                str = "multisport";
                break;
            case 6:
                str = "gym-fitness-equipment";
                break;
            case 7:
                str = "parasports";
                break;
            case 8:
                str = TtmlNode.COMBINE_ALL;
                break;
            default:
                lc.u0.r();
                return null;
        }
        return am.j.m("gc5.activity-trend.", str, ".prompt-seen");
    }

    @Override // com.garmin.android.apps.connectmobile.dashboard.data.datasource.o
    public final p2 a(LinkedHashSet linkedHashSet) {
        ge1.b.T(this.f33308c, null, null, new q(linkedHashSet, this, null), 3);
        return this.f33309d;
    }

    @Override // com.garmin.android.apps.connectmobile.dashboard.data.datasource.o
    public final Object b(o70.c cVar, boolean z14, v13.i iVar) {
        this.f33307b.j(cVar);
        return com.garmin.android.apps.connectmobile.f0.J(this, new t(this, cVar, new b2(d(cVar), Boolean.valueOf(z14)), null), iVar);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/dashboard/data/datasource/p$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-dashboard_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
