package com.garmin.android.apps.connectmobile.dashboard.data.datasource;

import java.util.Set;
import org.joda.time.Duration;
import org.joda.time.LocalDateTime;
import p005kotlin.Metadata;
import r53.p2;
import r53.q2;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\nB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/dashboard/data/datasource/d1;", "Lcom/garmin/android/apps/connectmobile/dashboard/data/datasource/c1;", "Lcom/garmin/android/apps/connectmobile/dashboard/data/datasource/b1;", "ecgApi", "Lcom/garmin/android/apps/connectmobile/s0;", "cacheDatabaseDelegate", "Ln70/g;", "dashboardDelegate", "<init>", "(Lcom/garmin/android/apps/connectmobile/dashboard/data/datasource/b1;Lcom/garmin/android/apps/connectmobile/s0;Ln70/g;)V", "a", "gcm-dashboard_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class d1 implements c1 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f33159i = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b1 f33160a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.garmin.android.apps.connectmobile.s0 f33161b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n70.g f33162c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final u53.d f33163d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final p2 f33164e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f33165f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public LocalDateTime f33166g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public LocalDateTime f33167h;

    static {
        new a(null);
    }

    public d1(b1 b1Var, com.garmin.android.apps.connectmobile.s0 s0Var, n70.g gVar) {
        b1Var.getClass();
        s0Var.getClass();
        gVar.getClass();
        this.f33160a = b1Var;
        this.f33161b = s0Var;
        this.f33162c = gVar;
        o53.e2 e2VarH = ge1.b.h();
        x53.c cVar = o53.s0.f129406a;
        this.f33163d = o53.c0.a(t13.g.a.C3052a.d(x53.b.f189152a, e2VarH));
        this.f33164e = q2.a(new j1(new yz1.d(null, null, false, 6, null), null, 2, null));
        this.f33165f = Duration.standardDays(1L).getMillis();
        LocalDateTime localDateTimeNow = LocalDateTime.now();
        localDateTimeNow.getClass();
        this.f33166g = localDateTimeNow;
        LocalDateTime localDateTimeNow2 = LocalDateTime.now();
        localDateTimeNow2.getClass();
        this.f33167h = localDateTimeNow2;
    }

    public static final jw.c d(d1 d1Var, LocalDateTime localDateTime) {
        com.garmin.android.apps.connectmobile.s0 s0Var = d1Var.f33161b;
        long j8 = d1Var.f33165f;
        jw.c0 c0VarA = s0Var.a(j8, j8);
        c0VarA.e("https://ghs.garmin.com/ghs/ecg/v1/ecg/daily/" + localDateTime.toString("yyyy-MM-dd"));
        return c0VarA;
    }

    @Override // com.garmin.android.apps.connectmobile.dashboard.data.datasource.c1
    public final f1 a() {
        return new f1(this.f33164e);
    }

    @Override // com.garmin.android.apps.connectmobile.dashboard.data.datasource.c1
    public final void b(boolean z14) {
        bv.b.f21239a.getClass();
        bv.b.a();
        if (com.garmin.android.apps.connectmobile.k1.f37122a.W() && this.f33162c.C()) {
            p2 p2Var = this.f33164e;
            if (((j1) p2Var.getValue()).f33241a.f200298a == null) {
                return;
            }
            if (z14) {
                p2Var.k(null, new j1(new yz1.d(yz1.u.LOADING, null, false, 6, null), null, 2, null));
            } else {
                p2Var.k(null, j1.a((j1) p2Var.getValue(), yz1.d.a(((j1) p2Var.getValue()).f33241a, null, true, 3)));
            }
            ge1.b.T(this.f33163d, null, null, new i1(this, null), 3);
        }
    }

    @Override // com.garmin.android.apps.connectmobile.dashboard.data.datasource.c1
    public final p2 c(Set set) {
        set.getClass();
        bv.b.f21239a.getClass();
        bv.b.a();
        boolean zW = com.garmin.android.apps.connectmobile.k1.f37122a.W();
        p2 p2Var = this.f33164e;
        if (!zW || !this.f33162c.C()) {
            com.garmin.android.apps.connectmobile.a2 a2Var = com.garmin.android.apps.connectmobile.a2.DASHBOARD;
            com.garmin.android.apps.connectmobile.i2.f36769a.getClass();
            com.garmin.android.apps.connectmobile.i2.a.b(a2Var, "EcgDataSource", "ECG not available");
            p2Var.k(null, new j1(new yz1.d(yz1.u.SUCCESS, yz1.c.SERVER, false, 4, null), null));
            return p2Var;
        }
        p2Var.k(null, j1.a((j1) p2Var.getValue(), yz1.d.a(((j1) p2Var.getValue()).f33241a, yz1.u.LOADING, false, 2)));
        if (set.contains(o70.f.LAST_SEVEN_DAYS)) {
            LocalDateTime localDateTimeMinusDays = LocalDateTime.now().minusDays(6);
            localDateTimeMinusDays.getClass();
            this.f33166g = localDateTimeMinusDays;
            LocalDateTime localDateTimeNow = LocalDateTime.now();
            localDateTimeNow.getClass();
            this.f33167h = localDateTimeNow;
        } else if (set.contains(o70.f.YESTERDAY)) {
            LocalDateTime localDateTimeMinusDays2 = LocalDateTime.now().minusDays(1);
            localDateTimeMinusDays2.getClass();
            this.f33166g = localDateTimeMinusDays2;
            LocalDateTime localDateTimeNow2 = LocalDateTime.now();
            localDateTimeNow2.getClass();
            this.f33167h = localDateTimeNow2;
        } else {
            LocalDateTime localDateTimeNow3 = LocalDateTime.now();
            localDateTimeNow3.getClass();
            this.f33166g = localDateTimeNow3;
            LocalDateTime localDateTimeNow4 = LocalDateTime.now();
            localDateTimeNow4.getClass();
            this.f33167h = localDateTimeNow4;
        }
        com.garmin.android.apps.connectmobile.a2 a2Var2 = com.garmin.android.apps.connectmobile.a2.DASHBOARD;
        String str = "ECG fetchData: startDate[" + this.f33166g + "] endDate[" + this.f33167h + "]";
        com.garmin.android.apps.connectmobile.i2.f36769a.getClass();
        com.garmin.android.apps.connectmobile.i2.a.b(a2Var2, "EcgDataSource", str);
        h1 h1Var = new h1(this, null);
        u53.d dVar = this.f33163d;
        ge1.b.T(dVar, null, null, h1Var, 3);
        ge1.b.T(dVar, null, null, new i1(this, null), 3);
        return p2Var;
    }

    @Override // com.garmin.android.apps.connectmobile.dashboard.data.datasource.c1
    public final void cancel() {
        o53.c0.c(this.f33163d, null);
    }

    @Override // com.garmin.android.apps.connectmobile.dashboard.data.datasource.c1
    public final e1 isLoading() {
        return new e1(this.f33164e);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/dashboard/data/datasource/d1$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "ECG_RECORDINGS_URL", "gcm-dashboard_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
