package i3;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Li3/l5;", "Lo4/r1;", "Lg6/h;", "caretSize", "<init>", "(JLkotlin/jvm/internal/j;)V", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class l5 implements o4.r1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f88829a;

    /* JADX WARN: Illegal instructions before constructor call */
    public l5(long j8, int i14, p005kotlin.jvm.internal.j jVar) {
        if ((i14 & 1) != 0) {
            vi.f90035a.getClass();
            j8 = vi.f90036b;
        }
        this(j8, null);
    }

    @Override // o4.r1
    public final o4.b1 a(long j8, g6.o oVar, g6.c cVar) {
        o4.j jVarA = o4.m.a();
        long j14 = this.f88829a;
        float fS0 = cVar.s0(g6.h.c(j14));
        float fS1 = cVar.s0(g6.h.b(j14));
        jVarA.a(0.0f, 0.0f);
        float f14 = 2;
        jVarA.c(fS0 / f14, 0.0f);
        jVarA.c(0.0f, fS1);
        jVarA.c((-fS0) / f14, 0.0f);
        jVarA.close();
        return new o4.b1.a(jVarA);
    }

    private l5(long j8) {
        this.f88829a = j8;
    }

    public /* synthetic */ l5(long j8, p005kotlin.jvm.internal.j jVar) {
        this(j8);
    }
}
