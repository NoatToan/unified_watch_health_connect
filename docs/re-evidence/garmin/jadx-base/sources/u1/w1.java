package u1;

import android.view.View;
import android.widget.Magnifier;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÁ\u0002\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lu1/w1;", "Lu1/v1;", "<init>", "()V", "a", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class w1 implements v1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final w1 f167706b = new w1();

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0017\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lu1/w1$a;", "Lu1/u1;", "Landroid/widget/Magnifier;", "magnifier", "<init>", "(Landroid/widget/Magnifier;)V", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static class a implements u1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Magnifier f167707a;

        public a(Magnifier magnifier) {
            this.f167707a = magnifier;
        }

        @Override // u1.u1
        public final long a() {
            Magnifier magnifier = this.f167707a;
            long width = (((long) magnifier.getWidth()) << 32) | (((long) magnifier.getHeight()) & 4294967295L);
            g6.m.a aVar = g6.m.f76012b;
            return width;
        }

        @Override // u1.u1
        public void b(long j8, long j14, float f14) {
            this.f167707a.show(Float.intBitsToFloat((int) (j8 >> 32)), Float.intBitsToFloat((int) (j8 & 4294967295L)));
        }

        @Override // u1.u1
        public final void c() {
            this.f167707a.update();
        }

        @Override // u1.u1
        public final void dismiss() {
            this.f167707a.dismiss();
        }
    }

    private w1() {
    }

    @Override // u1.v1
    public final boolean a() {
        return false;
    }

    @Override // u1.v1
    public final u1 b(View view2, boolean z14, long j8, float f14, float f15, boolean z15, g6.c cVar, float f16) {
        return new a(new Magnifier(view2));
    }
}
