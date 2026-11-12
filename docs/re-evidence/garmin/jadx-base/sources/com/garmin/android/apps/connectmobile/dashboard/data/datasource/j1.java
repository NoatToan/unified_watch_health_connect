package com.garmin.android.apps.connectmobile.dashboard.data.datasource;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/dashboard/data/datasource/j1;", "", "Lyz1/d;", "status", "", "data", "<init>", "(Lyz1/d;Ljava/lang/String;)V", "gcm-dashboard_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class j1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yz1.d f33241a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f33242b;

    public j1(yz1.d dVar, String str) {
        dVar.getClass();
        this.f33241a = dVar;
        this.f33242b = str;
    }

    public static j1 a(j1 j1Var, yz1.d dVar) {
        String str = j1Var.f33242b;
        j1Var.getClass();
        return new j1(dVar, str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j1)) {
            return false;
        }
        j1 j1Var = (j1) obj;
        return p005kotlin.jvm.internal.s.g(this.f33241a, j1Var.f33241a) && p005kotlin.jvm.internal.s.g(this.f33242b, j1Var.f33242b);
    }

    public final int hashCode() {
        int iHashCode = this.f33241a.hashCode() * 31;
        String str = this.f33242b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "EcgResponse(status=" + this.f33241a + ", data=" + this.f33242b + ")";
    }

    public /* synthetic */ j1(yz1.d dVar, String str, int i14, p005kotlin.jvm.internal.j jVar) {
        this(dVar, (i14 & 2) != 0 ? null : str);
    }
}
