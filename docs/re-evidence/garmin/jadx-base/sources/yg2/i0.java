package yg2;

import p005kotlin.Metadata;
import yc.l2;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001BG\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lyg2/i0;", "", "", "overline", "Lnt2/e;", "title", "Li53/c;", "subtitles", "shortSubtitles", "note", "<init>", "(Ljava/lang/String;Lnt2/e;Li53/c;Li53/c;Ljava/lang/String;)V", "live-session-view"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f197053a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final nt2.e f197054b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i53.c<nt2.e> f197055c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final i53.c<nt2.e> f197056d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f197057e;

    public i0(String str, nt2.e eVar, i53.c cVar, i53.c cVar2, String str2, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? null : str, eVar, (i14 & 4) != 0 ? j53.l.b() : cVar, (i14 & 8) != 0 ? j53.l.b() : cVar2, (i14 & 16) != 0 ? null : str2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i0)) {
            return false;
        }
        i0 i0Var = (i0) obj;
        return p005kotlin.jvm.internal.s.g(this.f197053a, i0Var.f197053a) && p005kotlin.jvm.internal.s.g(this.f197054b, i0Var.f197054b) && p005kotlin.jvm.internal.s.g(this.f197055c, i0Var.f197055c) && p005kotlin.jvm.internal.s.g(this.f197056d, i0Var.f197056d) && p005kotlin.jvm.internal.s.g(this.f197057e, i0Var.f197057e);
    }

    public final int hashCode() {
        String str = this.f197053a;
        int iA = l2.a(this.f197056d, l2.a(this.f197055c, (this.f197054b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31)) * 31, 31), 31);
        String str2 = this.f197057e;
        return iA + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("WorkoutStepStrings(overline=");
        sb3.append(this.f197053a);
        sb3.append(", title=");
        sb3.append(this.f197054b);
        sb3.append(", subtitles=");
        q6.f.w(sb3, this.f197055c, ", shortSubtitles=", this.f197056d, ", note=");
        return am.j.o(this.f197057e, ")", sb3);
    }

    public i0(String str, nt2.e eVar, i53.c<nt2.e> cVar, i53.c<nt2.e> cVar2, String str2) {
        eVar.getClass();
        cVar.getClass();
        cVar2.getClass();
        this.f197053a = str;
        this.f197054b = eVar;
        this.f197055c = cVar;
        this.f197056d = cVar2;
        this.f197057e = str2;
    }
}
