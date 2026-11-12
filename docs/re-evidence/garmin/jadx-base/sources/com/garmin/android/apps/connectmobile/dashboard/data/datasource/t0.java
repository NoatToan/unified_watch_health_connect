package com.garmin.android.apps.connectmobile.dashboard.data.datasource;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import org.joda.time.DateTime;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/dashboard/data/datasource/t0;", "Lcom/garmin/android/apps/connectmobile/dashboard/data/datasource/s0;", "Lf12/l;", "userSettings", "<init>", "(Lf12/l;)V", "a", "gcm-dashboard_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class t0 implements s0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f33354b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f12.l f33355a;

    static {
        new a(null);
    }

    public t0(f12.l lVar) {
        lVar.getClass();
        this.f33355a = lVar;
    }

    @Override // com.garmin.android.apps.connectmobile.dashboard.data.datasource.s0
    public final void a(String str) {
        str.getClass();
        List<String> listK = k();
        if (listK.contains(str)) {
            return;
        }
        ArrayList arrayList = new ArrayList(listK);
        arrayList.add(0, String.valueOf(DateTime.now().getMillis()));
        arrayList.add(str);
        String strK0 = p13.h0.k0(arrayList, ",", null, null, null, 62);
        com.garmin.android.apps.connectmobile.a2 a2Var = com.garmin.android.apps.connectmobile.a2.DASHBOARD;
        String strJ = androidx.room.a0.j("dismissCardForToday ", str, " -> new list ", strK0);
        com.garmin.android.apps.connectmobile.i2.f36769a.getClass();
        com.garmin.android.apps.connectmobile.i2.a.b(a2Var, "DashboardPreferences", strJ);
        this.f33355a.S("today_dismissed_cards", strK0);
    }

    @Override // com.garmin.android.apps.connectmobile.dashboard.data.datasource.s0
    public final r53.b b() {
        return r53.s.f(new x0(this, null));
    }

    @Override // com.garmin.android.apps.connectmobile.dashboard.data.datasource.s0
    public final r53.b c() {
        return r53.s.f(new v0(this, null));
    }

    @Override // com.garmin.android.apps.connectmobile.dashboard.data.datasource.s0
    public final void d(j70.a0 a0Var) {
        a0Var.getClass();
        f12.l lVar = this.f33355a;
        Set<String> setF1 = p13.h0.f1(lVar.L1("whats_new_cards"));
        setF1.remove(a0Var.f97475a);
        lVar.X1("whats_new_cards", setF1);
    }

    @Override // com.garmin.android.apps.connectmobile.dashboard.data.datasource.s0
    public final r53.b e() {
        return r53.s.f(new w0(this, null));
    }

    @Override // com.garmin.android.apps.connectmobile.dashboard.data.datasource.s0
    public final Set<String> f() {
        Set<String> setD0 = this.f33355a.D0("dismissed_battery_low_cards", null);
        return setD0 == null ? p13.l0.f134950a : setD0;
    }

    @Override // com.garmin.android.apps.connectmobile.dashboard.data.datasource.s0
    public final void g(Set<String> set) {
        set.getClass();
        this.f33355a.X1("dismissed_battery_low_cards", set);
    }

    @Override // com.garmin.android.apps.connectmobile.dashboard.data.datasource.s0
    public final ArrayList h() {
        Iterable<String> iterableB1;
        Set<String> setD0 = this.f33355a.D0("dismissed_activity_trend_prompts", p13.l0.f134950a);
        if (setD0 == null || (iterableB1 = p13.h0.b1(setD0)) == null) {
            iterableB1 = p13.j0.f134944a;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : iterableB1) {
            o70.c.f129930b.getClass();
            o70.c cVarA = o70.c.a.a(str);
            if (cVarA != null) {
                arrayList.add(cVarA);
            }
        }
        return arrayList;
    }

    @Override // com.garmin.android.apps.connectmobile.dashboard.data.datasource.s0
    public final void i(j70.a0... a0VarArr) {
        f12.l lVar = this.f33355a;
        Set<String> setF1 = p13.h0.f1(lVar.L1("whats_new_cards"));
        ArrayList arrayList = new ArrayList(a0VarArr.length);
        for (j70.a0 a0Var : a0VarArr) {
            arrayList.add(a0Var.f97475a);
        }
        setF1.addAll(arrayList);
        lVar.X1("whats_new_cards", setF1);
    }

    @Override // com.garmin.android.apps.connectmobile.dashboard.data.datasource.s0
    public final void j(o70.c cVar) {
        cVar.getClass();
        f12.l lVar = this.f33355a;
        Set<String> setF1 = p13.h0.f1(lVar.L1("dismissed_activity_trend_prompts"));
        setF1.add(cVar.f129941a);
        lVar.X1("dismissed_activity_trend_prompts", setF1);
    }

    public final List<String> k() {
        String str;
        String strA4 = this.f33355a.A4("today_dismissed_cards", null);
        List listW = strA4 != null ? d53.w.W(strA4, new String[]{","}) : null;
        if (listW == null || (str = (String) p13.h0.d0(listW)) == null) {
            return p13.j0.f134944a;
        }
        return !g22.k.k(new DateTime(Long.parseLong(str))) ? p13.j0.f134944a : listW.subList(1, listW.size());
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0006¨\u0006\u000b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/dashboard/data/datasource/t0$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "TODAY_DISMISSED_CARDS_KEY", "DISMISSED_ACTIVITY_TREND_PROMPTS_KEY", "WHATS_NEW_CARDS_KEY", "DISMISSED_BATTERY_LOW_CARDS_KEY", "gcm-dashboard_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
