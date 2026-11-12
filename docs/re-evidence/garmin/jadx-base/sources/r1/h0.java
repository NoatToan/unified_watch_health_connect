package r1;

import ch.qos.logback.core.CoreConstants;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0081\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lr1/h0;", "", "Lh4/d;", "alignment", "Lkotlin/Function1;", "Lg6/m;", "size", "Ls1/f0;", "animationSpec", "", "clip", "<init>", "(Lh4/d;Le23/l;Ls1/f0;Z)V", "animation"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h4.d f149094a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e23.l<g6.m, g6.m> f149095b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final s1.f0<g6.m> f149096c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f149097d;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lg6/m;", "it", "invoke-mzRDjE0", "(J)J", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    public static final class a extends p005kotlin.jvm.internal.w implements e23.l<g6.m, g6.m> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f149098a = new a();

        public a() {
            super(1);
        }

        @Override // e23.l
        public final g6.m invoke(g6.m mVar) {
            long j8 = mVar.f76013a;
            long j14 = 0;
            return g6.m.a((j14 & 4294967295L) | (j14 << 32));
        }
    }

    public /* synthetic */ h0(h4.d dVar, e23.l lVar, s1.f0 f0Var, boolean z14, int i14, p005kotlin.jvm.internal.j jVar) {
        this(dVar, (i14 & 2) != 0 ? a.f149098a : lVar, f0Var, (i14 & 8) != 0 ? true : z14);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h0)) {
            return false;
        }
        h0 h0Var = (h0) obj;
        return p005kotlin.jvm.internal.s.g(this.f149094a, h0Var.f149094a) && p005kotlin.jvm.internal.s.g(this.f149095b, h0Var.f149095b) && p005kotlin.jvm.internal.s.g(this.f149096c, h0Var.f149096c) && this.f149097d == h0Var.f149097d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f149097d) + ((this.f149096c.hashCode() + q6.f.h(this.f149094a.hashCode() * 31, this.f149095b, 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("ChangeSize(alignment=");
        sb3.append(this.f149094a);
        sb3.append(", size=");
        sb3.append(this.f149095b);
        sb3.append(", animationSpec=");
        sb3.append(this.f149096c);
        sb3.append(", clip=");
        return am.j.t(sb3, this.f149097d, CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public h0(h4.d dVar, e23.l<? super g6.m, g6.m> lVar, s1.f0<g6.m> f0Var, boolean z14) {
        this.f149094a = dVar;
        this.f149095b = lVar;
        this.f149096c = f0Var;
        this.f149097d = z14;
    }
}
