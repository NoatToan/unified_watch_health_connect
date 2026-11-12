package ro0;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lro0/p;", "", "", "showProgress", "showConfirmationDialog", "showErrorDialog", "<init>", "(ZZZ)V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f153867a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f153868b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f153869c;

    public /* synthetic */ p(boolean z14, boolean z15, boolean z16, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? false : z14, (i14 & 2) != 0 ? false : z15, (i14 & 4) != 0 ? false : z16);
    }

    public static p a(p pVar, boolean z14, boolean z15, boolean z16, int i14) {
        if ((i14 & 1) != 0) {
            z14 = pVar.f153867a;
        }
        if ((i14 & 2) != 0) {
            z15 = pVar.f153868b;
        }
        if ((i14 & 4) != 0) {
            z16 = pVar.f153869c;
        }
        pVar.getClass();
        return new p(z14, z15, z16);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return this.f153867a == pVar.f153867a && this.f153868b == pVar.f153868b && this.f153869c == pVar.f153869c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f153869c) + q6.f.g(Boolean.hashCode(this.f153867a) * 31, 31, this.f153868b);
    }

    public final String toString() {
        return hb.a.k(com.airbnb.lottie.animation.keyframe.a.m("ProductSupportCodeUIState(showProgress=", ", showConfirmationDialog=", ", showErrorDialog=", this.f153867a, this.f153868b), this.f153869c, ")");
    }

    public p(boolean z14, boolean z15, boolean z16) {
        this.f153867a = z14;
        this.f153868b = z15;
        this.f153869c = z16;
    }

    public p() {
        this(false, false, false, 7, null);
    }
}
