package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.electronic.scale.util.ElectronicScaleShareHelperImpl;
import com.xiaomi.fitness.electronic.scale.view.CustomScrollView;
import com.xiaomi.fitness.electronic.scale.widget.VerticalItemView;
import com.xiaomi.fitness.widget.RightArrowBindingSingleLineTextView;
import com.xiaomi.fitness.widget.RightArrowTwoLineTextView;
import com.xiaomi.fitness.widget.SwitchButtonBindingTwoLineTextView;

/* JADX INFO: loaded from: classes8.dex */
public class wj0 extends vj0 {
    public static final ViewDataBinding.i b0 = null;
    public static final SparseIntArray c0;
    public final RelativeLayout Z;
    public long a0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        c0 = sparseIntArray;
        sparseIntArray.put(bri.G, 1);
        sparseIntArray.put(bri.A3, 2);
        sparseIntArray.put(bri.M2, 3);
        sparseIntArray.put(bri.q4, 4);
        sparseIntArray.put(bri.z3, 5);
        sparseIntArray.put(bri.N0, 6);
        sparseIntArray.put(bri.R, 7);
        sparseIntArray.put(bri.l0, 8);
        sparseIntArray.put(bri.k0, 9);
        sparseIntArray.put(bri.W, 10);
        sparseIntArray.put(bri.X, 11);
        sparseIntArray.put(bri.Y, 12);
        sparseIntArray.put(bri.z4, 13);
        sparseIntArray.put(bri.i0, 14);
        sparseIntArray.put(bri.f0, 15);
        sparseIntArray.put(bri.d0, 16);
        sparseIntArray.put(bri.g0, 17);
        sparseIntArray.put(bri.a0, 18);
        sparseIntArray.put(bri.j0, 19);
        sparseIntArray.put(bri.m0, 20);
        sparseIntArray.put(bri.Z, 21);
        sparseIntArray.put(bri.h0, 22);
        sparseIntArray.put(bri.b0, 23);
        sparseIntArray.put(bri.s, 24);
    }

    public wj0(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 0, (Button) objArr[24], (CustomScrollView) objArr[1], (TextView) objArr[7], (VerticalItemView) objArr[10], (VerticalItemView) objArr[11], (RightArrowTwoLineTextView) objArr[12], (RightArrowBindingSingleLineTextView) objArr[21], (RightArrowBindingSingleLineTextView) objArr[18], (TextView) objArr[23], (SwitchButtonBindingTwoLineTextView) objArr[16], (SwitchButtonBindingTwoLineTextView) objArr[15], (RightArrowBindingSingleLineTextView) objArr[17], (RightArrowBindingSingleLineTextView) objArr[22], (RightArrowBindingSingleLineTextView) objArr[14], (RightArrowBindingSingleLineTextView) objArr[19], (VerticalItemView) objArr[9], (VerticalItemView) objArr[8], (RightArrowBindingSingleLineTextView) objArr[20], (ImageView) objArr[6], (ImageView) objArr[3], (TextView) objArr[5], (RelativeLayout) objArr[2], (TextView) objArr[4], (TextView) objArr[13]);
        this.a0 = -1L;
        RelativeLayout relativeLayout = (RelativeLayout) objArr[0];
        this.Z = relativeLayout;
        relativeLayout.setTag(null);
        o0(view);
        H();
    }

    public void A0(ElectronicScaleShareHelperImpl electronicScaleShareHelperImpl) {
        this.Y = electronicScaleShareHelperImpl;
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean F() {
        synchronized (this) {
            try {
                return this.a0 != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void H() {
        synchronized (this) {
            this.a0 = 2L;
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
            this.a0 = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean q0(int i, Object obj) {
        if (av1.c != i) {
            return false;
        }
        A0((ElectronicScaleShareHelperImpl) obj);
        return true;
    }

    public wj0(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 25, b0, c0));
    }
}
