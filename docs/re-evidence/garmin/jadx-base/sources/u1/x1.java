package u1;

import android.view.View;
import android.widget.Magnifier;
import p005kotlin.Metadata;
import p005kotlin.math.MathKt;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÁ\u0002\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lu1/x1;", "Lu1/v1;", "<init>", "()V", "a", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class x1 implements v1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final x1 f167719b = new x1();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final boolean f167720c = true;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lu1/x1$a;", "Lu1/w1$a;", "Landroid/widget/Magnifier;", "magnifier", "<init>", "(Landroid/widget/Magnifier;)V", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a extends w1.a {
        public a(Magnifier magnifier) {
            super(magnifier);
        }

        @Override // u1.w1.a, u1.u1
        public final void b(long j8, long j14, float f14) {
            boolean zIsNaN = Float.isNaN(f14);
            Magnifier magnifier = this.f167707a;
            if (!zIsNaN) {
                magnifier.setZoom(f14);
            }
            if ((9223372034707292159L & j14) != 9205357640488583168L) {
                magnifier.show(Float.intBitsToFloat((int) (j8 >> 32)), Float.intBitsToFloat((int) (j8 & 4294967295L)), Float.intBitsToFloat((int) (j14 >> 32)), Float.intBitsToFloat((int) (j14 & 4294967295L)));
            } else {
                magnifier.show(Float.intBitsToFloat((int) (j8 >> 32)), Float.intBitsToFloat((int) (j8 & 4294967295L)));
            }
        }
    }

    private x1() {
    }

    @Override // u1.v1
    public final boolean a() {
        return f167720c;
    }

    @Override // u1.v1
    public final u1 b(View view2, boolean z14, long j8, float f14, float f15, boolean z15, g6.c cVar, float f16) {
        if (z14) {
            return new a(new Magnifier(view2));
        }
        long jK1 = cVar.k1(j8);
        float fS0 = cVar.s0(f14);
        float fS1 = cVar.s0(f15);
        Magnifier.Builder builder = new Magnifier.Builder(view2);
        if (jK1 != 9205357640488583168L) {
            builder.setSize(MathKt.c(Float.intBitsToFloat((int) (jK1 >> 32))), MathKt.c(Float.intBitsToFloat((int) (jK1 & 4294967295L))));
        }
        if (!Float.isNaN(fS0)) {
            builder.setCornerRadius(fS0);
        }
        if (!Float.isNaN(fS1)) {
            builder.setElevation(fS1);
        }
        if (!Float.isNaN(f16)) {
            builder.setInitialZoom(f16);
        }
        builder.setClippingEnabled(z15);
        return new a(builder.build());
    }
}
