package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.electronic.scale.UserinfoSelectViewModel;
import com.xiaomi.fitness.widget.RightArrowSingleLineTextView;
import com.xiaomi.fitness.widget.view.RoundImageView;

/* JADX INFO: loaded from: classes8.dex */
public class sk0 extends rk0 {
    public static final ViewDataBinding.i N = null;
    public static final SparseIntArray O;
    public long M;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        O = sparseIntArray;
        sparseIntArray.put(bri.I5, 1);
        sparseIntArray.put(bri.F5, 2);
        sparseIntArray.put(bri.G1, 3);
        sparseIntArray.put(bri.j6, 4);
        sparseIntArray.put(bri.i6, 5);
        sparseIntArray.put(bri.g6, 6);
        sparseIntArray.put(bri.U1, 7);
        sparseIntArray.put(bri.R1, 8);
        sparseIntArray.put(bri.T1, 9);
        sparseIntArray.put(bri.f4515r, 10);
    }

    public sk0(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 0, (Button) objArr[10], (LinearLayout) objArr[0], (ConstraintLayout) objArr[3], (RightArrowSingleLineTextView) objArr[8], (RightArrowSingleLineTextView) objArr[9], (RightArrowSingleLineTextView) objArr[7], (TextView) objArr[2], (TextView) objArr[1], (TextView) objArr[6], (TextView) objArr[5], (RoundImageView) objArr[4]);
        this.M = -1L;
        this.B.setTag(null);
        o0(view);
        H();
    }

    public void A0(UserinfoSelectViewModel userinfoSelectViewModel) {
        this.L = userinfoSelectViewModel;
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean F() {
        synchronized (this) {
            try {
                return this.M != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void H() {
        synchronized (this) {
            this.M = 2L;
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
            this.M = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean q0(int i, Object obj) {
        if (av1.d != i) {
            return false;
        }
        A0((UserinfoSelectViewModel) obj);
        return true;
    }

    public sk0(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 11, N, O));
    }
}
