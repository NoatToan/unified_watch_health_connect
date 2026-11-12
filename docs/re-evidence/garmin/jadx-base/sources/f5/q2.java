package f5;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0001\tB%\b\u0002\u0012\u001a\u0010\u0005\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007B\t\b\u0016¢\u0006\u0004\b\u0006\u0010\b¨\u0006\n"}, d2 = {"Lf5/q2;", "Lf5/c2;", "Lkotlin/Function2;", "Lf5/v1$a;", "", "calculation", "<init>", "(Le23/p;)V", "()V", "a", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class q2 extends c2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f69078b = new a(null);

    private q2(e23.p<? super v1.a, ? super Float, Float> pVar) {
        super(pVar, null);
    }

    @Override // f5.c2
    public final float a(float f14, c0 c0Var, c0 c0Var2) {
        float fA = ((int) (c0Var.a() & 4294967295L)) / 2.0f;
        long jFloatToRawIntBits = Float.floatToRawIntBits(f14);
        long jFloatToRawIntBits2 = ((long) Float.floatToRawIntBits(fA)) & 4294967295L;
        n4.c.a aVar = n4.c.f123541b;
        return Float.intBitsToFloat((int) (c0Var2.b0(c0Var, jFloatToRawIntBits2 | (jFloatToRawIntBits << 32)) >> 32));
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lf5/q2$a;", "", "<init>", "()V", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    public /* synthetic */ q2(e23.p pVar, p005kotlin.jvm.internal.j jVar) {
        this(pVar);
    }

    public q2() {
        this(null);
    }
}
