package ht2;

import p005kotlin.Metadata;
import v.e0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lht2/r;", "", "", "minutesForConfigurableDelay", "<init>", "(I)V", "in-app-update_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f85683a;

    public /* synthetic */ r(int i14, int i15, p005kotlin.jvm.internal.j jVar) {
        this((i15 & 1) != 0 ? 60 : i14);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r) && this.f85683a == ((r) obj).f85683a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f85683a);
    }

    public final String toString() {
        return e0.f(this.f85683a, "Settings(minutesForConfigurableDelay=", ")");
    }

    public r(int i14) {
        this.f85683a = i14;
    }

    public r() {
        this(0, 1, null);
    }
}
