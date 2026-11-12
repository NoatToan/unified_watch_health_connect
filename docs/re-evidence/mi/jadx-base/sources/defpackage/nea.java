package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.detail.view.SportDetailBehaviorView;
import com.xiaomi.fitness.detail.view.SportEnvironmentalView;
import com.xiaomi.fitness.detail.view.SportFeedbackView;
import com.xiaomi.fitness.detail.view.SportRecordExtraBasicInfoView;
import com.xiaomi.fitness.detail.view.SportTargetView;

/* JADX INFO: loaded from: classes10.dex */
public class nea extends mea {
    public static final ViewDataBinding.i J0 = null;
    public static final SparseIntArray K0;
    public final FrameLayout H0;
    public long I0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        K0 = sparseIntArray;
        sparseIntArray.put(bsi.N6, 2);
        sparseIntArray.put(bsi.J9, 3);
        sparseIntArray.put(bsi.p3, 4);
        sparseIntArray.put(bsi.j0, 5);
        sparseIntArray.put(bsi.c0, 6);
        sparseIntArray.put(bsi.B6, 7);
        sparseIntArray.put(bsi.f0, 8);
        sparseIntArray.put(bsi.G6, 9);
        sparseIntArray.put(bsi.u0, 10);
        sparseIntArray.put(bsi.Z, 11);
        sparseIntArray.put(bsi.o0, 12);
        sparseIntArray.put(bsi.T, 13);
        sparseIntArray.put(bsi.a0, 14);
        sparseIntArray.put(bsi.Q, 15);
        sparseIntArray.put(bsi.h0, 16);
        sparseIntArray.put(bsi.k0, 17);
        sparseIntArray.put(bsi.g2, 18);
        sparseIntArray.put(bsi.e0, 19);
        sparseIntArray.put(bsi.d0, 20);
        sparseIntArray.put(bsi.s0, 21);
        sparseIntArray.put(bsi.r0, 22);
        sparseIntArray.put(bsi.C0, 23);
        sparseIntArray.put(bsi.t0, 24);
        sparseIntArray.put(bsi.p0, 25);
        sparseIntArray.put(bsi.m0, 26);
        sparseIntArray.put(bsi.y0, 27);
        sparseIntArray.put(bsi.F0, 28);
        sparseIntArray.put(bsi.l0, 29);
        sparseIntArray.put(bsi.g0, 30);
        sparseIntArray.put(bsi.v0, 31);
        sparseIntArray.put(bsi.z0, 32);
        sparseIntArray.put(bsi.w0, 33);
        sparseIntArray.put(bsi.x0, 34);
        sparseIntArray.put(bsi.G0, 35);
        sparseIntArray.put(bsi.H0, 36);
        sparseIntArray.put(bsi.q0, 37);
        sparseIntArray.put(bsi.b0, 38);
        sparseIntArray.put(bsi.B0, 39);
        sparseIntArray.put(bsi.R, 40);
        sparseIntArray.put(bsi.E0, 41);
        sparseIntArray.put(bsi.n0, 42);
        sparseIntArray.put(bsi.U, 43);
        sparseIntArray.put(bsi.D0, 44);
        sparseIntArray.put(bsi.V, 45);
        sparseIntArray.put(bsi.W, 46);
        sparseIntArray.put(bsi.X, 47);
        sparseIntArray.put(bsi.Y, 48);
        sparseIntArray.put(bsi.A0, 49);
        sparseIntArray.put(bsi.O, 50);
        sparseIntArray.put(bsi.u, 51);
        sparseIntArray.put(bsi.n5, 52);
        sparseIntArray.put(bsi.V1, 53);
        sparseIntArray.put(bsi.g8, 54);
        sparseIntArray.put(bsi.X1, 55);
        sparseIntArray.put(bsi.Z0, 56);
        sparseIntArray.put(bsi.U4, 57);
        sparseIntArray.put(bsi.i0, 58);
        sparseIntArray.put(bsi.j, 59);
    }

    public nea(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 0, (TextView) objArr[59], (SportDetailBehaviorView) objArr[51], (FrameLayout) objArr[50], (FrameLayout) objArr[15], (FrameLayout) objArr[40], (FrameLayout) objArr[13], (FrameLayout) objArr[43], (FrameLayout) objArr[45], (FrameLayout) objArr[46], (FrameLayout) objArr[47], (FrameLayout) objArr[48], (FrameLayout) objArr[11], (FrameLayout) objArr[14], (FrameLayout) objArr[38], (FrameLayout) objArr[6], (FrameLayout) objArr[20], (FrameLayout) objArr[19], (FrameLayout) objArr[8], (FrameLayout) objArr[30], (FrameLayout) objArr[16], (FrameLayout) objArr[58], (FrameLayout) objArr[5], (FrameLayout) objArr[17], (FrameLayout) objArr[29], (FrameLayout) objArr[26], (FrameLayout) objArr[42], (FrameLayout) objArr[12], (FrameLayout) objArr[25], (FrameLayout) objArr[37], (FrameLayout) objArr[22], (FrameLayout) objArr[21], (FrameLayout) objArr[24], (FrameLayout) objArr[10], (FrameLayout) objArr[31], (FrameLayout) objArr[33], (FrameLayout) objArr[34], (FrameLayout) objArr[27], (FrameLayout) objArr[32], (FrameLayout) objArr[49], (FrameLayout) objArr[39], (FrameLayout) objArr[23], (FrameLayout) objArr[44], (FrameLayout) objArr[41], (FrameLayout) objArr[28], (FrameLayout) objArr[35], (FrameLayout) objArr[36], (FrameLayout) objArr[56], (SportRecordExtraBasicInfoView) objArr[53], (SportFeedbackView) objArr[55], (RecyclerView) objArr[18], (FrameLayout) objArr[4], (LinearLayout) objArr[1], (FrameLayout) objArr[57], (RecyclerView) objArr[52], (View) objArr[2], (SportEnvironmentalView) objArr[7], (SportTargetView) objArr[9], (FrameLayout) objArr[54], (TextView) objArr[3]);
        this.I0 = -1L;
        this.z0.setTag(null);
        FrameLayout frameLayout = (FrameLayout) objArr[0];
        this.H0 = frameLayout;
        frameLayout.setTag(null);
        o0(view);
        H();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean F() {
        synchronized (this) {
            try {
                return this.I0 != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void H() {
        synchronized (this) {
            this.I0 = 1L;
        }
        e0();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean W(int i, Object obj, int i2) {
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void o() {
        synchronized (this) {
            this.I0 = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean q0(int i, Object obj) {
        return true;
    }

    public nea(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 60, J0, K0));
    }
}
