package ck0;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0081\b\u0018\u00002\u00020\u0001B\u001d\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lck0/e;", "", "", "hasSeenExclusiveOffersScreen", "internalNotificationsEnabled", "<init>", "(ZLjava/lang/Boolean;)V", "gcm-gcplus_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f27826a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Boolean f27827b;

    public /* synthetic */ e(boolean z14, Boolean bool, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? true : z14, (i14 & 2) != 0 ? null : bool);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f27826a == eVar.f27826a && p005kotlin.jvm.internal.s.g(this.f27827b, eVar.f27827b);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f27826a) * 31;
        Boolean bool = this.f27827b;
        return iHashCode + (bool == null ? 0 : bool.hashCode());
    }

    public final String toString() {
        return "EnableNotificationsDialogData(hasSeenExclusiveOffersScreen=" + this.f27826a + ", internalNotificationsEnabled=" + this.f27827b + ")";
    }

    public e(boolean z14, Boolean bool) {
        this.f27826a = z14;
        this.f27827b = bool;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public e() {
        this(false, null, 3, 0 == true ? 1 : 0);
    }
}
