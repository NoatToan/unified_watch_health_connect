package com.garmin.android.apps.connectmobile.dashboard.data.datasource;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0001\u000bB'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Lcom/garmin/android/apps/connectmobile/dashboard/data/datasource/d2;", "Lcom/garmin/android/apps/connectmobile/dashboard/data/datasource/c2;", "Lf12/l;", "userSettings", "Lcom/garmin/android/apps/connectmobile/dashboard/data/datasource/h2;", "userGoalsDelegate", "Lcom/garmin/android/apps/connectmobile/dashboard/data/datasource/k2;", "weightGoalPregnancyCacheDataSource", "weightGoalPregnancyServerDataSource", "<init>", "(Lf12/l;Lcom/garmin/android/apps/connectmobile/dashboard/data/datasource/h2;Lcom/garmin/android/apps/connectmobile/dashboard/data/datasource/k2;Lcom/garmin/android/apps/connectmobile/dashboard/data/datasource/k2;)V", "a", "gcm-dashboard_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class d2 implements c2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f12.l f33168a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h2 f33169b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k2 f33170c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final k2 f33171d;

    static {
        new a(null);
    }

    public d2(f12.l lVar, h2 h2Var, k2 k2Var, k2 k2Var2) {
        lVar.getClass();
        h2Var.getClass();
        k2Var.getClass();
        k2Var2.getClass();
        this.f33168a = lVar;
        this.f33169b = h2Var;
        this.f33170c = k2Var;
        this.f33171d = k2Var2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0095, code lost:
    
        if (r12 == r1) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00c1, code lost:
    
        if (r12 == r1) goto L40;
     */
    @Override // com.garmin.android.apps.connectmobile.dashboard.data.datasource.c2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, boolean z14, v13.c cVar) {
        e2 e2Var;
        Object objA;
        boolean z15;
        int i14;
        String str2;
        if (cVar instanceof e2) {
            e2Var = (e2) cVar;
            int i15 = e2Var.f33189f;
            if ((i15 & Integer.MIN_VALUE) != 0) {
                e2Var.f33189f = i15 - Integer.MIN_VALUE;
            } else {
                e2Var = new e2(this, cVar);
            }
        } else {
            e2Var = new e2(this, cVar);
        }
        Object objA2 = e2Var.f33187d;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i16 = e2Var.f33189f;
        if (i16 == 0) {
            o13.r.b(objA2);
            boolean zA = this.f33169b.a(str);
            int i17 = (this.f33168a.d1() && zA) ? 1 : 0;
            if (i17 == 0) {
                return null;
            }
            e2Var.f33184a = z14;
            e2Var.f33185b = zA;
            e2Var.f33186c = i17;
            e2Var.f33189f = 1;
            objA = this.f33170c.a(e2Var);
            if (objA != aVar) {
                int i18 = i17;
                z15 = zA;
                i14 = i18;
            }
            return aVar;
        }
        if (i16 != 1) {
            if (i16 == 2) {
                o13.r.b(objA2);
                str2 = (String) objA2;
                com.garmin.android.apps.connectmobile.a2 a2Var = com.garmin.android.apps.connectmobile.a2.DASHBOARD;
                String strM = am.j.m("pregnancy weight goal = [", str2, "]");
                com.garmin.android.apps.connectmobile.i2.f36769a.getClass();
                com.garmin.android.apps.connectmobile.i2.a.b(a2Var, "PregnancyWeightGoalDataSource", strM);
                return str2;
            }
            if (i16 != 3) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objA2);
            str2 = (String) objA2;
            com.garmin.android.apps.connectmobile.a2 a2Var2 = com.garmin.android.apps.connectmobile.a2.DASHBOARD;
            String strM2 = am.j.m("pregnancy weight goal = [", str2, "]");
            com.garmin.android.apps.connectmobile.i2.f36769a.getClass();
            com.garmin.android.apps.connectmobile.i2.a.b(a2Var2, "PregnancyWeightGoalDataSource", strM2);
            return str2;
        }
        i14 = e2Var.f33186c;
        boolean z16 = e2Var.f33185b;
        boolean z17 = e2Var.f33184a;
        o13.r.b(objA2);
        z15 = z16;
        z14 = z17;
        objA = objA2;
        str2 = (String) objA;
        k2 k2Var = this.f33171d;
        if (!z14) {
            if (str2 != null) {
                com.garmin.android.apps.connectmobile.a2 a2Var3 = com.garmin.android.apps.connectmobile.a2.DASHBOARD;
                com.garmin.android.apps.connectmobile.i2.f36769a.getClass();
                com.garmin.android.apps.connectmobile.i2.a.b(a2Var3, "PregnancyWeightGoalDataSource", "fetch pregnancy weight goal from cache");
            } else {
                com.garmin.android.apps.connectmobile.a2 a2Var4 = com.garmin.android.apps.connectmobile.a2.DASHBOARD;
                com.garmin.android.apps.connectmobile.i2.f36769a.getClass();
                com.garmin.android.apps.connectmobile.i2.a.b(a2Var4, "PregnancyWeightGoalDataSource", "fetch pregnancy weight goal from server");
                e2Var.f33184a = z14;
                e2Var.f33185b = z15;
                e2Var.f33186c = i14;
                e2Var.f33189f = 3;
                objA2 = k2Var.a(e2Var);
            }
            com.garmin.android.apps.connectmobile.a2 a2Var5 = com.garmin.android.apps.connectmobile.a2.DASHBOARD;
            String strM3 = am.j.m("pregnancy weight goal = [", str2, "]");
            com.garmin.android.apps.connectmobile.i2.f36769a.getClass();
            com.garmin.android.apps.connectmobile.i2.a.b(a2Var5, "PregnancyWeightGoalDataSource", strM3);
            return str2;
        }
        com.garmin.android.apps.connectmobile.a2 a2Var6 = com.garmin.android.apps.connectmobile.a2.DASHBOARD;
        com.garmin.android.apps.connectmobile.i2.f36769a.getClass();
        com.garmin.android.apps.connectmobile.i2.a.b(a2Var6, "PregnancyWeightGoalDataSource", "fetch pregnancy weight goal from server");
        e2Var.f33184a = z14;
        e2Var.f33185b = z15;
        e2Var.f33186c = i14;
        e2Var.f33189f = 2;
        objA2 = k2Var.a(e2Var);
        return aVar;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/dashboard/data/datasource/d2$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-dashboard_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
