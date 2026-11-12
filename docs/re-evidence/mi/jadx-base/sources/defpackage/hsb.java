package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.health.curse.view.CurseSetItemView;
import com.xiaomi.fitness.widget.SwitchButtonSingleLineTextView;

/* JADX INFO: loaded from: classes9.dex */
public class hsb extends gsb {
    public static final ViewDataBinding.i I = null;
    public static final SparseIntArray J;
    public final LinearLayout G;
    public long H;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        J = sparseIntArray;
        sparseIntArray.put(eri.oh, 1);
        sparseIntArray.put(eri.S7, 2);
        sparseIntArray.put(eri.f8, 3);
        sparseIntArray.put(eri.C9, 4);
        sparseIntArray.put(eri.Vc, 5);
        sparseIntArray.put(eri.lh, 6);
    }

    public hsb(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 0, (CurseSetItemView) objArr[2], (CurseSetItemView) objArr[3], (CurseSetItemView) objArr[4], (SwitchButtonSingleLineTextView) objArr[5], (Button) objArr[6], (ConstraintLayout) objArr[1]);
        this.H = -1L;
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.G = linearLayout;
        linearLayout.setTag(null);
        o0(view);
        H();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean F() {
        synchronized (this) {
            try {
                return this.H != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void H() {
        synchronized (this) {
            this.H = 1L;
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
            this.H = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean q0(int i, Object obj) {
        return true;
    }

    public hsb(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 7, I, J));
    }
}
