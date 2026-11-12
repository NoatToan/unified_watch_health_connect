package vy0;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lvy0/e0;", "", "Lcom/garmin/android/apps/connectmobile/navigation/more/b;", "item", "Lty0/j;", "iconSource", "", "breadcrumbs", "<init>", "(Lcom/garmin/android/apps/connectmobile/navigation/more/b;Lty0/j;Ljava/lang/String;)V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.garmin.android.apps.connectmobile.navigation.more.b f180706a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ty0.j f180707b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f180708c;

    public /* synthetic */ e0(com.garmin.android.apps.connectmobile.navigation.more.b bVar, ty0.j jVar, String str, int i14, p005kotlin.jvm.internal.j jVar2) {
        this(bVar, (i14 & 2) != 0 ? null : jVar, (i14 & 4) != 0 ? null : str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e0)) {
            return false;
        }
        e0 e0Var = (e0) obj;
        return p005kotlin.jvm.internal.s.g(this.f180706a, e0Var.f180706a) && p005kotlin.jvm.internal.s.g(this.f180707b, e0Var.f180707b) && p005kotlin.jvm.internal.s.g(this.f180708c, e0Var.f180708c);
    }

    public final int hashCode() {
        int iHashCode = this.f180706a.hashCode() * 31;
        ty0.j jVar = this.f180707b;
        int iHashCode2 = (iHashCode + (jVar == null ? 0 : jVar.hashCode())) * 31;
        String str = this.f180708c;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("SearchResultItem(item=");
        sb3.append(this.f180706a);
        sb3.append(", iconSource=");
        sb3.append(this.f180707b);
        sb3.append(", breadcrumbs=");
        return am.j.o(this.f180708c, ")", sb3);
    }

    public e0(com.garmin.android.apps.connectmobile.navigation.more.b bVar, ty0.j jVar, String str) {
        bVar.getClass();
        this.f180706a = bVar;
        this.f180707b = jVar;
        this.f180708c = str;
    }
}
