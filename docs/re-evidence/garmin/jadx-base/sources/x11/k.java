package x11;

import b21.o4;
import com.google.firebase.analytics.FirebaseAnalytics;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lx11/k;", "", "Lb21/o4;", "mode", "", "isLoading", "isNextEnabled", "Li53/c;", "Lv11/b;", FirebaseAnalytics.Param.ITEMS, "<init>", "(Lb21/o4;ZZLi53/c;)V", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o4 f188430a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f188431b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f188432c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final i53.c<v11.b> f188433d;

    public k(o4 o4Var, boolean z14, boolean z15, i53.c cVar, int i14, p005kotlin.jvm.internal.j jVar) {
        this(o4Var, (i14 & 2) != 0 ? false : z14, (i14 & 4) != 0 ? true : z15, (i14 & 8) != 0 ? j53.l.b() : cVar);
    }

    public static k a(k kVar, boolean z14, boolean z15, i53.c cVar, int i14) {
        o4 o4Var = kVar.f188430a;
        if ((i14 & 2) != 0) {
            z14 = kVar.f188431b;
        }
        if ((i14 & 4) != 0) {
            z15 = kVar.f188432c;
        }
        if ((i14 & 8) != 0) {
            cVar = kVar.f188433d;
        }
        kVar.getClass();
        o4Var.getClass();
        cVar.getClass();
        return new k(o4Var, z14, z15, cVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return this.f188430a == kVar.f188430a && this.f188431b == kVar.f188431b && this.f188432c == kVar.f188432c && s.g(this.f188433d, kVar.f188433d);
    }

    public final int hashCode() {
        return this.f188433d.hashCode() + q6.f.g(q6.f.g(this.f188430a.hashCode() * 31, 31, this.f188431b), 31, this.f188432c);
    }

    public final String toString() {
        return "ImageRecognitionResultsUiState(mode=" + this.f188430a + ", isLoading=" + this.f188431b + ", isNextEnabled=" + this.f188432c + ", items=" + this.f188433d + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public k(o4 o4Var, boolean z14, boolean z15, i53.c<? extends v11.b> cVar) {
        o4Var.getClass();
        cVar.getClass();
        this.f188430a = o4Var;
        this.f188431b = z14;
        this.f188432c = z15;
        this.f188433d = cVar;
    }
}
