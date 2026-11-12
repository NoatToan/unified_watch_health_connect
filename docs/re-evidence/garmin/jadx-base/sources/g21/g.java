package g21;

import c22.c3;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lg21/g;", "", "Li53/c;", "Lg21/f;", "elements", "Lc22/c3;", "titleResId", "", "isTimelineView", "<init>", "(Li53/c;Lc22/c3;Z)V", "gcm-nutrition_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i53.c<f> f75421a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c3 f75422b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f75423c;

    public g(i53.c<f> cVar, c3 c3Var, boolean z14) {
        cVar.getClass();
        c3Var.getClass();
        this.f75421a = cVar;
        this.f75422b = c3Var;
        this.f75423c = z14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.f75421a.equals(gVar.f75421a) && this.f75422b.equals(gVar.f75422b) && this.f75423c == gVar.f75423c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f75423c) + ((this.f75422b.hashCode() + (this.f75421a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("DailyListUIModel(elements=");
        sb3.append(this.f75421a);
        sb3.append(", titleResId=");
        sb3.append(this.f75422b);
        sb3.append(", isTimelineView=");
        return hb.a.k(sb3, this.f75423c, ")");
    }
}
