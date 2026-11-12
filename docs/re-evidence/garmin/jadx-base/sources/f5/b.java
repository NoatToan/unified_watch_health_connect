package f5;

import p005kotlin.Metadata;
import p005kotlin.math.MathKt;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p f68892a = new p(a.f68894a);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final p f68893b = new p(C1425b.f68895a);

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final /* synthetic */ class a extends p005kotlin.jvm.internal.q implements e23.p<Integer, Integer, Integer> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f68894a = new a();

        public a() {
            super(2, MathKt.class, "min", "min(II)I", 1);
        }

        @Override // e23.p
        public final Integer invoke(Integer num, Integer num2) {
            return Integer.valueOf(Math.min(num.intValue(), num2.intValue()));
        }
    }

    /* JADX INFO: renamed from: f5.b$b, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final /* synthetic */ class C1425b extends p005kotlin.jvm.internal.q implements e23.p<Integer, Integer, Integer> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C1425b f68895a = new C1425b();

        public C1425b() {
            super(2, MathKt.class, "max", "max(II)I", 1);
        }

        @Override // e23.p
        public final Integer invoke(Integer num, Integer num2) {
            return Integer.valueOf(Math.max(num.intValue(), num2.intValue()));
        }
    }
}
