package s5;

import o4.r1;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ls5/j;", "Lo4/r1;", "<init>", "()V", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class j implements r1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j f157227a = new j();

    private j() {
    }

    @Override // o4.r1
    public final o4.b1 a(long j8, g6.o oVar, g6.c cVar) {
        float f14 = n4.g.f(j8) / 2.0f;
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f14)) << 32) | (((long) Float.floatToRawIntBits(f14)) & 4294967295L);
        n4.a.C2318a c2318a = n4.a.f123535b;
        return new o4.b1.c(n4.f.a(n4.h.c(j8), jFloatToRawIntBits, jFloatToRawIntBits, jFloatToRawIntBits, jFloatToRawIntBits));
    }
}
