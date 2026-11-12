package nw0;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lnw0/a;", "", "", "isLoading", "isAutoLoggingBehaviorsEnabled", "hasPairedDevice", "<init>", "(ZZZ)V", "impl_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f127982a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f127983b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f127984c;

    public /* synthetic */ a(boolean z14, boolean z15, boolean z16, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? false : z14, (i14 & 2) != 0 ? false : z15, (i14 & 4) != 0 ? false : z16);
    }

    public static a a(a aVar, boolean z14, boolean z15, boolean z16, int i14) {
        if ((i14 & 1) != 0) {
            z14 = aVar.f127982a;
        }
        if ((i14 & 2) != 0) {
            z15 = aVar.f127983b;
        }
        if ((i14 & 4) != 0) {
            z16 = aVar.f127984c;
        }
        aVar.getClass();
        return new a(z14, z15, z16);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f127982a == aVar.f127982a && this.f127983b == aVar.f127983b && this.f127984c == aVar.f127984c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f127984c) + q6.f.g(Boolean.hashCode(this.f127982a) * 31, 31, this.f127983b);
    }

    public final String toString() {
        return hb.a.k(com.airbnb.lottie.animation.keyframe.a.m("AutoLogBehaviorsUiState(isLoading=", ", isAutoLoggingBehaviorsEnabled=", ", hasPairedDevice=", this.f127982a, this.f127983b), this.f127984c, ")");
    }

    public a(boolean z14, boolean z15, boolean z16) {
        this.f127982a = z14;
        this.f127983b = z15;
        this.f127984c = z16;
    }

    public a() {
        this(false, false, false, 7, null);
    }
}
