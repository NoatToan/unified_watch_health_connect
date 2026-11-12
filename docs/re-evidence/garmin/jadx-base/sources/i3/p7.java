package i3;

import p005kotlin.Metadata;
import p005kotlin.math.MathKt;

/* JADX INFO: loaded from: classes.dex */
public final class p7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f5.p f89279a = new f5.p(b.f89284a);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final f5.n2 f89280b = new f5.n2(a.f89283a);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final p3.y3 f89281c = new p3.y3(new i01.j(17));

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final p3.y3 f89282d = new p3.y3(new i01.j(18));

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class a extends p005kotlin.jvm.internal.q implements e23.p<Integer, Integer, Integer> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f89283a = new a();

        public a() {
            super(2, MathKt.class, "min", "min(II)I", 1);
        }

        @Override // e23.p
        public final Integer invoke(Integer num, Integer num2) {
            return Integer.valueOf(Math.min(num.intValue(), num2.intValue()));
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class b extends p005kotlin.jvm.internal.q implements e23.p<Integer, Integer, Integer> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f89284a = new b();

        public b() {
            super(2, MathKt.class, "min", "min(II)I", 1);
        }

        @Override // e23.p
        public final Integer invoke(Integer num, Integer num2) {
            return Integer.valueOf(Math.min(num.intValue(), num2.intValue()));
        }
    }
}
