package kotlin;

import android.graphics.Matrix;
import android.view.View;
import o4.a1;
import o4.l1;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes.dex */
@p005kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Li5/e1;", "Li5/d1;", "Lo4/a1;", "tmpMatrix", "<init>", "([FLkotlin/jvm/internal/j;)V", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class e1 implements d1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float[] f91145a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int[] f91146b;

    private e1(float[] fArr) {
        this.f91145a = fArr;
        this.f91146b = new int[2];
    }

    @Override // kotlin.d1
    public final void a(View view2, float[] fArr) {
        a1.e(fArr);
        b(view2, fArr);
    }

    public final void b(View view2, float[] fArr) {
        Object parent = view2.getParent();
        boolean z14 = parent instanceof View;
        float[] fArr2 = this.f91145a;
        if (z14) {
            b((View) parent, fArr);
            float f14 = -view2.getScrollX();
            float f15 = -view2.getScrollY();
            h0.a aVar = h0.f91197a;
            a1.e(fArr2);
            a1.i(fArr2, f14, f15);
            h0.c(fArr, fArr2);
            float left = view2.getLeft();
            float top = view2.getTop();
            a1.e(fArr2);
            a1.i(fArr2, left, top);
            h0.c(fArr, fArr2);
        } else {
            int[] iArr = this.f91146b;
            view2.getLocationInWindow(iArr);
            float f16 = -view2.getScrollX();
            float f17 = -view2.getScrollY();
            h0.a aVar2 = h0.f91197a;
            a1.e(fArr2);
            a1.i(fArr2, f16, f17);
            h0.c(fArr, fArr2);
            float f18 = iArr[0];
            float f19 = iArr[1];
            a1.e(fArr2);
            a1.i(fArr2, f18, f19);
            h0.c(fArr, fArr2);
        }
        Matrix matrix = view2.getMatrix();
        if (matrix.isIdentity()) {
            return;
        }
        l1.f(fArr2, matrix);
        h0.c(fArr, fArr2);
    }

    public /* synthetic */ e1(float[] fArr, j jVar) {
        this(fArr);
    }
}
