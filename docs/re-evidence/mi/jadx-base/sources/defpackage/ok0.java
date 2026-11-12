package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.electronic.scale.model.UserManageViewModel;
import com.xiaomi.fitness.widget.RightArrowBindingSingleLineTextView;
import com.xiaomi.fitness.widget.view.RoundImageView;

/* JADX INFO: loaded from: classes8.dex */
public class ok0 extends nk0 {
    public static final ViewDataBinding.i L = null;
    public static final SparseIntArray M;
    public final RelativeLayout J;
    public long K;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        M = sparseIntArray;
        sparseIntArray.put(bri.S6, 1);
        sparseIntArray.put(bri.H5, 2);
        sparseIntArray.put(bri.i6, 3);
        sparseIntArray.put(bri.D3, 4);
        sparseIntArray.put(bri.f, 5);
        sparseIntArray.put(bri.K0, 6);
        sparseIntArray.put(bri.W6, 7);
        sparseIntArray.put(bri.U6, 8);
    }

    public ok0(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 0, (RightArrowBindingSingleLineTextView) objArr[5], (RightArrowBindingSingleLineTextView) objArr[6], (RightArrowBindingSingleLineTextView) objArr[4], (TextView) objArr[2], (RightArrowBindingSingleLineTextView) objArr[3], (RoundImageView) objArr[1], (Button) objArr[8], (RightArrowBindingSingleLineTextView) objArr[7]);
        this.K = -1L;
        RelativeLayout relativeLayout = (RelativeLayout) objArr[0];
        this.J = relativeLayout;
        relativeLayout.setTag(null);
        o0(view);
        H();
    }

    public void A0(UserManageViewModel userManageViewModel) {
        this.I = userManageViewModel;
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean F() {
        synchronized (this) {
            try {
                return this.K != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void H() {
        synchronized (this) {
            this.K = 2L;
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
            this.K = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean q0(int i, Object obj) {
        if (av1.d != i) {
            return false;
        }
        A0((UserManageViewModel) obj);
        return true;
    }

    public ok0(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 9, L, M));
    }
}
