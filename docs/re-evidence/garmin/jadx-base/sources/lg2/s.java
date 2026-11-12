package lg2;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Llg2/s;", "", "", "saveLoading", "resumeLoading", "discardLoading", "<init>", "(ZZZ)V", "live-session-view"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f112357a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f112358b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f112359c;

    public /* synthetic */ s(boolean z14, boolean z15, boolean z16, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? false : z14, (i14 & 2) != 0 ? false : z15, (i14 & 4) != 0 ? false : z16);
    }

    public static s a(s sVar, boolean z14, boolean z15, boolean z16, int i14) {
        if ((i14 & 1) != 0) {
            z14 = sVar.f112357a;
        }
        if ((i14 & 2) != 0) {
            z15 = sVar.f112358b;
        }
        if ((i14 & 4) != 0) {
            z16 = sVar.f112359c;
        }
        sVar.getClass();
        return new s(z14, z15, z16);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return this.f112357a == sVar.f112357a && this.f112358b == sVar.f112358b && this.f112359c == sVar.f112359c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f112359c) + q6.f.g(Boolean.hashCode(this.f112357a) * 31, 31, this.f112358b);
    }

    public final String toString() {
        return hb.a.k(com.airbnb.lottie.animation.keyframe.a.m("PausedStateButtonsLoadingState(saveLoading=", ", resumeLoading=", ", discardLoading=", this.f112357a, this.f112358b), this.f112359c, ")");
    }

    public s(boolean z14, boolean z15, boolean z16) {
        this.f112357a = z14;
        this.f112358b = z15;
        this.f112359c = z16;
    }

    public s() {
        this(false, false, false, 7, null);
    }
}
