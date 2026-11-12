package com.garmin.android.apps.connectmobile.dashboard.data.datasource;

import p005kotlin.Metadata;
import r53.p2;
import r53.q2;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/dashboard/data/datasource/b;", "Lcom/garmin/android/apps/connectmobile/dashboard/data/datasource/a;", "Lff2/c;", "campaignInteractor", "<init>", "(Lff2/c;)V", "a", "gcm-dashboard_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b implements com.garmin.android.apps.connectmobile.dashboard.data.datasource.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ff2.c f33141a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u53.d f33142b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p2 f33143c;

    static {
        new a(null);
    }

    public b(ff2.c cVar) {
        cVar.getClass();
        this.f33141a = cVar;
        o53.m1 m1VarC = g8.i.c();
        x53.c cVar2 = o53.s0.f129406a;
        this.f33142b = o53.c0.a(t13.g.a.C3052a.d(x53.b.f189152a, m1VarC));
        this.f33143c = q2.a(new f(new yz1.d(null, null, false, 6, null), null, 2, null));
    }

    @Override // com.garmin.android.apps.connectmobile.dashboard.data.datasource.a
    public final d a() {
        return new d(this.f33143c);
    }

    @Override // com.garmin.android.apps.connectmobile.dashboard.data.datasource.a
    public final p2 b() {
        p2 p2Var = this.f33143c;
        p2Var.k(null, f.a((f) p2Var.getValue(), yz1.d.a(((f) p2Var.getValue()).f33190a, yz1.u.LOADING, false, 2)));
        ge1.b.T(this.f33142b, null, null, new e(this, null), 3);
        return p2Var;
    }

    @Override // com.garmin.android.apps.connectmobile.dashboard.data.datasource.a
    public final void c() {
        p2 p2Var = this.f33143c;
        if (((f) p2Var.getValue()).f33190a.f200298a == null) {
            return;
        }
        p2Var.k(null, f.a((f) p2Var.getValue(), yz1.d.a(((f) p2Var.getValue()).f33190a, null, true, 3)));
        ge1.b.T(this.f33142b, null, null, new e(this, null), 3);
    }

    @Override // com.garmin.android.apps.connectmobile.dashboard.data.datasource.a
    public final void cancel() {
        o53.c0.c(this.f33142b, null);
    }

    @Override // com.garmin.android.apps.connectmobile.dashboard.data.datasource.a
    public final c isLoading() {
        return new c(this.f33143c);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/dashboard/data/datasource/b$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-dashboard_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
