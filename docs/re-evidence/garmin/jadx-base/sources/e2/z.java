package e2;

import f5.v1;
import g2.r0;
import g2.t0;
import g2.u0;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b!\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B'\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Le2/z;", "Lg2/u0;", "Le2/y;", "Lg6/a;", "constraints", "", "isVertical", "Le2/o;", "itemProvider", "Lg2/r0;", "measureScope", "<init>", "(JZLe2/o;Lg2/r0;Lkotlin/jvm/internal/j;)V", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class z extends u0<y> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o f62584b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final r0 f62585c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f62586d;

    private z(long j8, boolean z14, o oVar, r0 r0Var) {
        this.f62584b = oVar;
        this.f62585c = r0Var;
        this.f62586d = g6.b.b(z14 ? g6.a.j(j8) : Integer.MAX_VALUE, z14 ? Integer.MAX_VALUE : g6.a.i(j8), 5);
    }

    public static y d(s sVar, int i14) {
        long j8 = sVar.f62586d;
        o oVar = sVar.f62584b;
        return sVar.c(i14, oVar.getKey(i14), oVar.f(i14), sVar.b(sVar.f62585c, i14, j8), j8);
    }

    @Override // g2.u0
    public final t0 a(int i14, int i15, int i16, long j8) {
        o oVar = this.f62584b;
        return c(i14, oVar.getKey(i14), oVar.f(i14), b(this.f62585c, i14, j8), j8);
    }

    public abstract y c(int i14, Object obj, Object obj2, List<? extends v1> list, long j8);

    public /* synthetic */ z(long j8, boolean z14, o oVar, r0 r0Var, p005kotlin.jvm.internal.j jVar) {
        this(j8, z14, oVar, r0Var);
    }
}
