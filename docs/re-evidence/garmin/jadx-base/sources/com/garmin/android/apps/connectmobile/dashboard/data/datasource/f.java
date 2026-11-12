package com.garmin.android.apps.connectmobile.dashboard.data.datasource;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/garmin/android/apps/connectmobile/dashboard/data/datasource/f;", "", "Lyz1/d;", "status", "Lo13/p;", "Lff2/a;", "Lo4/v0;", "data", "<init>", "(Lyz1/d;Lo13/p;)V", "gcm-dashboard_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yz1.d f33190a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o13.p<ff2.a, o4.v0> f33191b;

    /* JADX WARN: Multi-variable type inference failed */
    public f(yz1.d dVar, o13.p<ff2.a, ? extends o4.v0> pVar) {
        dVar.getClass();
        this.f33190a = dVar;
        this.f33191b = pVar;
    }

    public static f a(f fVar, yz1.d dVar) {
        o13.p<ff2.a, o4.v0> pVar = fVar.f33191b;
        fVar.getClass();
        return new f(dVar, pVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return p005kotlin.jvm.internal.s.g(this.f33190a, fVar.f33190a) && p005kotlin.jvm.internal.s.g(this.f33191b, fVar.f33191b);
    }

    public final int hashCode() {
        int iHashCode = this.f33190a.hashCode() * 31;
        o13.p<ff2.a, o4.v0> pVar = this.f33191b;
        return iHashCode + (pVar == null ? 0 : pVar.hashCode());
    }

    public final String toString() {
        return "ActiveCampaignResponse(status=" + this.f33190a + ", data=" + this.f33191b + ")";
    }

    public /* synthetic */ f(yz1.d dVar, o13.p pVar, int i14, p005kotlin.jvm.internal.j jVar) {
        this(dVar, (i14 & 2) != 0 ? null : pVar);
    }
}
