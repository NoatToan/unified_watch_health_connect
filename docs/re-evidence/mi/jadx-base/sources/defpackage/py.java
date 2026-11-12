package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.widget.SwitchButtonBindingSingleLineTextView;
import miuix.core.widget.NestedScrollView;
import miuix.springback.view.SpringBackLayout;

/* JADX INFO: loaded from: classes7.dex */
public class py extends oy {
    public static final ViewDataBinding.i L = null;
    public static final SparseIntArray M;
    public final SpringBackLayout J;
    public long K;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        M = sparseIntArray;
        sparseIntArray.put(uqi.L, 1);
        sparseIntArray.put(uqi.x, 2);
        sparseIntArray.put(uqi.t, 3);
        sparseIntArray.put(uqi.C, 4);
        sparseIntArray.put(uqi.c0, 5);
        sparseIntArray.put(uqi.b0, 6);
        sparseIntArray.put(uqi.a0, 7);
        sparseIntArray.put(uqi.w, 8);
        sparseIntArray.put(uqi.f36032r, 9);
    }

    public py(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 0, (View) objArr[9], (SwitchButtonBindingSingleLineTextView) objArr[3], (ImageView) objArr[8], (LinearLayout) objArr[2], (RelativeLayout) objArr[4], (NestedScrollView) objArr[1], (TextView) objArr[7], (TextView) objArr[6], (TextView) objArr[5]);
        this.K = -1L;
        SpringBackLayout springBackLayout = (SpringBackLayout) objArr[0];
        this.J = springBackLayout;
        springBackLayout.setTag(null);
        o0(view);
        H();
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
            this.K = 1L;
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
        return true;
    }

    public py(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 10, L, M));
    }
}
