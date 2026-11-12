package kotlin;

import a5.a;
import android.view.View;
import androidx.core.view.g1;
import androidx.core.view.s0;
import androidx.core.view.v;
import g6.s;
import java.util.WeakHashMap;
import n4.c;
import t13.d;

/* JADX INFO: loaded from: classes.dex */
@p005kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Li5/w2;", "La5/a;", "Landroid/view/View;", "view", "", "minFlingVelocity", "<init>", "(Landroid/view/View;F)V", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class w2 implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f91614a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v f91615b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int[] f91616c;

    public w2(View view2, float f14) {
        this.f91614a = view2;
        v vVar = new v(view2);
        vVar.g(true);
        this.f91615b = vVar;
        this.f91616c = new int[2];
        WeakHashMap<View, g1> weakHashMap = s0.f6563a;
        view2.setNestedScrollingEnabled(true);
    }

    @Override // a5.a
    /* JADX INFO: renamed from: onPostFling-RZ2iAVY */
    public final Object mo1onPostFlingRZ2iAVY(long j8, long j14, d<? super s> dVar) {
        v vVar = this.f91615b;
        if (vVar.f(0)) {
            vVar.i(0);
        }
        if (vVar.f(1)) {
            vVar.i(1);
        }
        s.f76026b.getClass();
        return s.a(0L);
    }

    @Override // a5.a
    /* JADX INFO: renamed from: onPostScroll-DzOQY0M */
    public final long mo2onPostScrollDzOQY0M(long j8, long j14, int i14) {
        if (!this.f91615b.h(x2.a(j14), x2.c(i14))) {
            c.f123541b.getClass();
            return 0L;
        }
        int[] iArr = this.f91616c;
        p13.s.n(0, iArr);
        int iD = x2.d(Float.intBitsToFloat((int) (j14 >> 32)));
        int iD2 = x2.d(Float.intBitsToFloat((int) (j14 & 4294967295L)));
        this.f91615b.d(x2.d(Float.intBitsToFloat((int) (j8 >> 32))), x2.d(Float.intBitsToFloat((int) (j8 & 4294967295L))), iD, iD2, null, x2.c(i14), this.f91616c);
        return x2.b(iD, iD2, iArr, j14);
    }

    @Override // a5.a
    /* JADX INFO: renamed from: onPreFling-QWom1Mo */
    public final Object mo3onPreFlingQWom1Mo(long j8, d<? super s> dVar) {
        float fC = s.c(j8) * (-1.0f);
        float fD = s.d(j8) * (-1.0f);
        v vVar = this.f91615b;
        if (!vVar.b(fC, fD) && !vVar.a(s.c(j8) * (-1.0f), s.d(j8) * (-1.0f), true)) {
            s.f76026b.getClass();
            j8 = 0;
        }
        return s.a(j8);
    }

    @Override // a5.a
    /* JADX INFO: renamed from: onPreScroll-OzD1aCk */
    public final long mo4onPreScrollOzD1aCk(long j8, int i14) {
        if (!this.f91615b.h(x2.a(j8), x2.c(i14))) {
            c.f123541b.getClass();
            return 0L;
        }
        int[] iArr = this.f91616c;
        p13.s.n(0, iArr);
        int iD = x2.d(Float.intBitsToFloat((int) (j8 >> 32)));
        int iD2 = x2.d(Float.intBitsToFloat((int) (4294967295L & j8)));
        this.f91615b.c(iD, iD2, this.f91616c, null, x2.c(i14));
        return x2.b(iD, iD2, iArr, j8);
    }
}
