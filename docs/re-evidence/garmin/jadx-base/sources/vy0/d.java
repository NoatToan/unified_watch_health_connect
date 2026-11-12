package vy0;

import p005kotlin.Metadata;
import p13.j0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lvy0/d;", "", "", "isWheelchairModeEnabled", "Lvy0/q$a;", "moreItems", "<init>", "(ZLvy0/q$a;)V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f180700a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q.a f180701b;

    public d(boolean z14, q.a aVar, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? false : z14, (i14 & 2) != 0 ? new q.a(j0.f134944a) : aVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f180700a == dVar.f180700a && p005kotlin.jvm.internal.s.g(this.f180701b, dVar.f180701b);
    }

    public final int hashCode() {
        return this.f180701b.f180765a.hashCode() + (Boolean.hashCode(this.f180700a) * 31);
    }

    public final String toString() {
        return "FeatureUiState(isWheelchairModeEnabled=" + this.f180700a + ", moreItems=" + this.f180701b + ")";
    }

    public d(boolean z14, q.a aVar) {
        aVar.getClass();
        this.f180700a = z14;
        this.f180701b = aVar;
    }

    public d() {
        this(false, null, 3, null);
    }
}
