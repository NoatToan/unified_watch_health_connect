package kotlin;

import android.view.View;
import android.view.ViewParent;
import e23.l;
import p005kotlin.jvm.internal.w;
import x5.g0;

/* JADX INFO: loaded from: classes.dex */
public final class h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f91197a = a.f91198a;

    @p005kotlin.Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lx5/g0;", "it", "invoke", "(Lx5/g0;)Lx5/g0;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class a extends w implements l<g0, g0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f91198a = new a();

        public a() {
            super(1);
        }

        @Override // e23.l
        public final g0 invoke(g0 g0Var) {
            return g0Var;
        }
    }

    public static final boolean a(View view2, View view3) {
        if (view3.equals(view2)) {
            return false;
        }
        for (ViewParent parent = view3.getParent(); parent != null; parent = parent.getParent()) {
            if (parent == view2) {
                return true;
            }
        }
        return false;
    }

    public static final float b(int i14, float[] fArr, float[] fArr2, int i15) {
        int i16 = i14 * 4;
        return (fArr[i16 + 3] * fArr2[12 + i15]) + (fArr[i16 + 2] * fArr2[8 + i15]) + (fArr[i16 + 1] * fArr2[4 + i15]) + (fArr[i16] * fArr2[i15]);
    }

    public static final void c(float[] fArr, float[] fArr2) {
        float fB = b(0, fArr2, fArr, 0);
        float fB2 = b(0, fArr2, fArr, 1);
        float fB3 = b(0, fArr2, fArr, 2);
        float fB4 = b(0, fArr2, fArr, 3);
        float fB5 = b(1, fArr2, fArr, 0);
        float fB6 = b(1, fArr2, fArr, 1);
        float fB7 = b(1, fArr2, fArr, 2);
        float fB8 = b(1, fArr2, fArr, 3);
        float fB9 = b(2, fArr2, fArr, 0);
        float fB10 = b(2, fArr2, fArr, 1);
        float fB11 = b(2, fArr2, fArr, 2);
        float fB12 = b(2, fArr2, fArr, 3);
        float fB13 = b(3, fArr2, fArr, 0);
        float fB14 = b(3, fArr2, fArr, 1);
        float fB15 = b(3, fArr2, fArr, 2);
        float fB16 = b(3, fArr2, fArr, 3);
        fArr[0] = fB;
        fArr[1] = fB2;
        fArr[2] = fB3;
        fArr[3] = fB4;
        fArr[4] = fB5;
        fArr[5] = fB6;
        fArr[6] = fB7;
        fArr[7] = fB8;
        fArr[8] = fB9;
        fArr[9] = fB10;
        fArr[10] = fB11;
        fArr[11] = fB12;
        fArr[12] = fB13;
        fArr[13] = fB14;
        fArr[14] = fB15;
        fArr[15] = fB16;
    }
}
