package com.garmin.android.apps.connectmobile.startup;

import aq1.j0;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u000eB=\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Lcom/garmin/android/apps/connectmobile/startup/j;", "", "Laq1/j0;", "status", "Ld20/c;", "locationDTO", "", "countryName", "Ls92/g;", "consentText", "Lcom/garmin/android/apps/connectmobile/userprofile/model/m;", "socialProfile", "<init>", "(Laq1/j0;Ld20/c;Ljava/lang/String;Ls92/g;Lcom/garmin/android/apps/connectmobile/userprofile/model/m;)V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class j {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f44873f = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j0 f44874a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d20.c f44875b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f44876c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final s92.g f44877d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final com.garmin.android.apps.connectmobile.userprofile.model.m f44878e;

    public /* synthetic */ j(j0 j0Var, d20.c cVar, String str, s92.g gVar, com.garmin.android.apps.connectmobile.userprofile.model.m mVar, int i14, p005kotlin.jvm.internal.j jVar) {
        this(j0Var, (i14 & 2) != 0 ? null : cVar, (i14 & 4) != 0 ? "" : str, (i14 & 8) != 0 ? null : gVar, (i14 & 16) != 0 ? null : mVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return this.f44874a == jVar.f44874a && s.g(this.f44875b, jVar.f44875b) && s.g(this.f44876c, jVar.f44876c) && s.g(this.f44877d, jVar.f44877d) && s.g(this.f44878e, jVar.f44878e);
    }

    public final int hashCode() {
        int iHashCode = this.f44874a.hashCode() * 31;
        d20.c cVar = this.f44875b;
        int iJ = wr.g.j((iHashCode + (cVar == null ? 0 : cVar.hashCode())) * 31, 31, this.f44876c);
        s92.g gVar = this.f44877d;
        int iHashCode2 = (iJ + (gVar == null ? 0 : gVar.hashCode())) * 31;
        com.garmin.android.apps.connectmobile.userprofile.model.m mVar = this.f44878e;
        return iHashCode2 + (mVar != null ? mVar.hashCode() : 0);
    }

    public final String toString() {
        return "StartupUIResource(status=" + this.f44874a + ", locationDTO=" + this.f44875b + ", countryName=" + this.f44876c + ", consentText=" + this.f44877d + ", socialProfile=" + this.f44878e + ")";
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/startup/j$a;", "", "<init>", "()V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static j a() {
            return new j(j0.CONSENT_CHECK_ENDED, null, null, null, null, 30, null);
        }

        public static j b() {
            return new j(j0.LOADING, null, null, null, null, 30, null);
        }

        private a() {
        }
    }

    public j(j0 j0Var, d20.c cVar, String str, s92.g gVar, com.garmin.android.apps.connectmobile.userprofile.model.m mVar) {
        j0Var.getClass();
        str.getClass();
        this.f44874a = j0Var;
        this.f44875b = cVar;
        this.f44876c = str;
        this.f44877d = gVar;
        this.f44878e = mVar;
    }
}
