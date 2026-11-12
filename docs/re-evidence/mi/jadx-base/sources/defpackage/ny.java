package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.widget.RightArrowBindingSingleLineTextView;
import com.xiaomi.fitness.widget.RightArrowBindingTwoLineTextView;
import com.xiaomi.fitness.widget.SwitchButtonBindingTwoLineTextView;
import miuix.core.widget.NestedScrollView;
import miuix.springback.view.SpringBackLayout;

/* JADX INFO: loaded from: classes7.dex */
public class ny extends my {
    public static final ViewDataBinding.i X = null;
    public static final SparseIntArray Y;
    public final SpringBackLayout V;
    public long W;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        Y = sparseIntArray;
        sparseIntArray.put(uqi.L, 1);
        sparseIntArray.put(uqi.f36029a, 2);
        sparseIntArray.put(uqi.u, 3);
        sparseIntArray.put(uqi.N, 4);
        sparseIntArray.put(uqi.M, 5);
        sparseIntArray.put(uqi.B, 6);
        sparseIntArray.put(uqi.f36032r, 7);
        sparseIntArray.put(uqi.f36030b, 8);
        sparseIntArray.put(uqi.o, 9);
        sparseIntArray.put(uqi.common_agreement, 10);
        sparseIntArray.put(uqi.common_privacy, 11);
        sparseIntArray.put(uqi.common_privacy_brief, 12);
        sparseIntArray.put(uqi.A, 13);
        sparseIntArray.put(uqi.n, 14);
        sparseIntArray.put(uqi.O, 15);
        sparseIntArray.put(uqi.G, 16);
        sparseIntArray.put(uqi.d0, 17);
        sparseIntArray.put(uqi.c, 18);
        sparseIntArray.put(uqi.H, 19);
        sparseIntArray.put(uqi.I, 20);
        sparseIntArray.put(uqi.y, 21);
    }

    public ny(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 0, (ConstraintLayout) objArr[2], (ConstraintLayout) objArr[8], (RightArrowBindingTwoLineTextView) objArr[18], (RightArrowBindingSingleLineTextView) objArr[14], (RightArrowBindingSingleLineTextView) objArr[9], (RightArrowBindingSingleLineTextView) objArr[10], (RightArrowBindingSingleLineTextView) objArr[11], (RightArrowBindingSingleLineTextView) objArr[12], (View) objArr[7], (ImageView) objArr[3], (RightArrowBindingSingleLineTextView) objArr[21], (RightArrowBindingSingleLineTextView) objArr[13], (TextView) objArr[6], (RightArrowBindingSingleLineTextView) objArr[16], (SwitchButtonBindingTwoLineTextView) objArr[19], (SwitchButtonBindingTwoLineTextView) objArr[20], (NestedScrollView) objArr[1], (TextView) objArr[5], (TextView) objArr[4], (RightArrowBindingSingleLineTextView) objArr[15], (RightArrowBindingSingleLineTextView) objArr[17]);
        this.W = -1L;
        SpringBackLayout springBackLayout = (SpringBackLayout) objArr[0];
        this.V = springBackLayout;
        springBackLayout.setTag(null);
        o0(view);
        H();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean F() {
        synchronized (this) {
            try {
                return this.W != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void H() {
        synchronized (this) {
            this.W = 1L;
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
            this.W = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean q0(int i, Object obj) {
        return true;
    }

    public ny(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 22, X, Y));
    }
}
