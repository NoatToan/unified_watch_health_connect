package u1;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lu1/s0;", "Lo4/r1;", "<init>", "()V", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class s0 implements o4.r1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final s0 f167677a = new s0();

    private s0() {
    }

    @Override // o4.r1
    public final o4.b1 a(long j8, g6.o oVar, g6.c cVar) {
        float fF0 = cVar.f0(a0.f167346a);
        return new o4.b1.b(new n4.d(0.0f, -fF0, Float.intBitsToFloat((int) (j8 >> 32)), Float.intBitsToFloat((int) (j8 & 4294967295L)) + fF0));
    }
}
