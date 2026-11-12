package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.electronic.scale.widget.banner.EcoBanner;
import miuix.androidbasewidget.widget.ProgressBar;

/* JADX INFO: loaded from: classes8.dex */
public class ck0 extends bk0 {
    public static final ViewDataBinding.i I0 = null;
    public static final SparseIntArray J0;
    public final FrameLayout G0;
    public long H0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        J0 = sparseIntArray;
        sparseIntArray.put(bri.w7, 1);
        sparseIntArray.put(bri.H1, 2);
        sparseIntArray.put(bri.t2, 3);
        sparseIntArray.put(bri.x2, 4);
        sparseIntArray.put(bri.B2, 5);
        sparseIntArray.put(bri.e, 6);
        sparseIntArray.put(bri.s2, 7);
        sparseIntArray.put(bri.C1, 8);
        sparseIntArray.put(bri.r2, 9);
        sparseIntArray.put(bri.n3, 10);
        sparseIntArray.put(bri.g7, 11);
        sparseIntArray.put(bri.B3, 12);
        sparseIntArray.put(bri.j7, 13);
        sparseIntArray.put(bri.L1, 14);
        sparseIntArray.put(bri.w2, 15);
        sparseIntArray.put(bri.A2, 16);
        sparseIntArray.put(bri.E2, 17);
        sparseIntArray.put(bri.I4, 18);
        sparseIntArray.put(bri.J4, 19);
        sparseIntArray.put(bri.r4, 20);
        sparseIntArray.put(bri.V0, 21);
        sparseIntArray.put(bri.K4, 22);
        sparseIntArray.put(bri.s4, 23);
        sparseIntArray.put(bri.W0, 24);
        sparseIntArray.put(bri.L4, 25);
        sparseIntArray.put(bri.t4, 26);
        sparseIntArray.put(bri.X0, 27);
        sparseIntArray.put(bri.M4, 28);
        sparseIntArray.put(bri.u4, 29);
        sparseIntArray.put(bri.Y0, 30);
        sparseIntArray.put(bri.N4, 31);
        sparseIntArray.put(bri.v4, 32);
        sparseIntArray.put(bri.Z0, 33);
        sparseIntArray.put(bri.O4, 34);
        sparseIntArray.put(bri.w4, 35);
        sparseIntArray.put(bri.a1, 36);
        sparseIntArray.put(bri.y1, 37);
        sparseIntArray.put(bri.j3, 38);
        sparseIntArray.put(bri.i3, 39);
        sparseIntArray.put(bri.i7, 40);
        sparseIntArray.put(bri.J1, 41);
        sparseIntArray.put(bri.v2, 42);
        sparseIntArray.put(bri.z2, 43);
        sparseIntArray.put(bri.D2, 44);
        sparseIntArray.put(bri.z1, 45);
        sparseIntArray.put(bri.l3, 46);
        sparseIntArray.put(bri.h3, 47);
        sparseIntArray.put(bri.h7, 48);
        sparseIntArray.put(bri.I1, 49);
        sparseIntArray.put(bri.u2, 50);
        sparseIntArray.put(bri.y2, 51);
        sparseIntArray.put(bri.C2, 52);
        sparseIntArray.put(bri.m3, 53);
        sparseIntArray.put(bri.k3, 54);
        sparseIntArray.put(bri.C7, 55);
        sparseIntArray.put(bri.q3, 56);
        sparseIntArray.put(bri.o3, 57);
        sparseIntArray.put(bri.T6, 58);
    }

    public ck0(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 0, (EcoBanner) objArr[6], (ImageView) objArr[21], (ImageView) objArr[24], (ImageView) objArr[27], (ImageView) objArr[30], (ImageView) objArr[33], (ImageView) objArr[36], (LinearLayout) objArr[37], (LinearLayout) objArr[45], (LinearLayout) objArr[8], (LinearLayout) objArr[2], (LinearLayout) objArr[49], (LinearLayout) objArr[41], (LinearLayout) objArr[14], (ProgressBar) objArr[9], (TextView) objArr[7], (TextView) objArr[3], (TextView) objArr[50], (TextView) objArr[42], (TextView) objArr[15], (TextView) objArr[4], (TextView) objArr[51], (TextView) objArr[43], (TextView) objArr[16], (TextView) objArr[5], (TextView) objArr[52], (TextView) objArr[44], (TextView) objArr[17], (Button) objArr[47], (Button) objArr[39], (Button) objArr[38], (Button) objArr[54], (Button) objArr[46], (TextView) objArr[53], (Button) objArr[10], (TextView) objArr[57], (TextView) objArr[56], (ScrollView) objArr[12], (TextView) objArr[20], (TextView) objArr[23], (TextView) objArr[26], (TextView) objArr[29], (TextView) objArr[32], (TextView) objArr[35], (TextView) objArr[18], (TextView) objArr[19], (TextView) objArr[22], (TextView) objArr[25], (TextView) objArr[28], (TextView) objArr[31], (TextView) objArr[34], (Button) objArr[58], (LinearLayout) objArr[11], (RelativeLayout) objArr[48], (RelativeLayout) objArr[40], (TextView) objArr[13], (LinearLayout) objArr[1], (RelativeLayout) objArr[55]);
        this.H0 = -1L;
        FrameLayout frameLayout = (FrameLayout) objArr[0];
        this.G0 = frameLayout;
        frameLayout.setTag(null);
        o0(view);
        H();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean F() {
        synchronized (this) {
            try {
                return this.H0 != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void H() {
        synchronized (this) {
            this.H0 = 1L;
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
            this.H0 = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean q0(int i, Object obj) {
        return true;
    }

    public ck0(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 59, I0, J0));
    }
}
