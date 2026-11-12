package f2;

import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b!\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lf2/d0;", "", "", "isVertical", "Lf2/l0;", "slots", "", "gridItemsCount", "spaceBetweenLines", "Lf2/b0;", "measuredItemProvider", "Lf2/n0;", "spanLayoutProvider", "<init>", "(ZLf2/l0;IILf2/b0;Lf2/n0;)V", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f68191a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l0 f68192b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f68193c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f68194d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final b0 f68195e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final n0 f68196f;

    public d0(boolean z14, l0 l0Var, int i14, int i15, b0 b0Var, n0 n0Var) {
        this.f68191a = z14;
        this.f68192b = l0Var;
        this.f68193c = i14;
        this.f68194d = i15;
        this.f68195e = b0Var;
        this.f68196f = n0Var;
    }

    public final long a(int i14, int i15) {
        int i16;
        l0 l0Var = this.f68192b;
        if (i15 == 1) {
            i16 = l0Var.f68233a[i14];
        } else {
            int i17 = (i15 + i14) - 1;
            int[] iArr = l0Var.f68234b;
            i16 = (iArr[i17] + l0Var.f68233a[i17]) - iArr[i14];
        }
        if (i16 < 0) {
            i16 = 0;
        }
        if (this.f68191a) {
            g6.a.f75987b.getClass();
            if (i16 < 0) {
                g6.j.a("width must be >= 0");
            }
            return g6.b.h(i16, i16, 0, Integer.MAX_VALUE);
        }
        g6.a.f75987b.getClass();
        if (i16 < 0) {
            g6.j.a("height must be >= 0");
        }
        return g6.b.h(0, Integer.MAX_VALUE, i16, i16);
    }

    public abstract c0 b(int i14, a0[] a0VarArr, List<c> list, int i15);

    public final c0 c(int i14) {
        n0.c cVarB = this.f68196f.b(i14);
        int i15 = cVarB.f68248a;
        List<c> list = cVarB.f68249b;
        int size = list.size();
        int i16 = (size == 0 || i15 + size == this.f68193c) ? 0 : this.f68194d;
        a0[] a0VarArr = new a0[size];
        int i17 = 0;
        for (int i18 = 0; i18 < size; i18++) {
            int i19 = (int) list.get(i18).f68178a;
            a0 a0VarD = this.f68195e.d(i15 + i18, i17, i19, i16, a(i17, i19));
            i17 += i19;
            Unit unit = Unit.INSTANCE;
            a0VarArr[i18] = a0VarD;
        }
        return b(i14, a0VarArr, list, i16);
    }
}
