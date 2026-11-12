package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import androidx.core.widget.NestedScrollView;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.view.UnderstandItemView;

/* JADX INFO: loaded from: classes9.dex */
public class jla extends ila {
    public static final ViewDataBinding.i F = null;
    public static final SparseIntArray G;
    public final NestedScrollView D;
    public long E;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        G = sparseIntArray;
        sparseIntArray.put(eri.so, 1);
        sparseIntArray.put(eri.ro, 2);
        sparseIntArray.put(eri.qo, 3);
    }

    public jla(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 0, (UnderstandItemView) objArr[3], (UnderstandItemView) objArr[2], (UnderstandItemView) objArr[1]);
        this.E = -1L;
        NestedScrollView nestedScrollView = (NestedScrollView) objArr[0];
        this.D = nestedScrollView;
        nestedScrollView.setTag(null);
        o0(view);
        H();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean F() {
        synchronized (this) {
            try {
                return this.E != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void H() {
        synchronized (this) {
            this.E = 1L;
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
            this.E = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean q0(int i, Object obj) {
        return true;
    }

    public jla(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 4, F, G));
    }
}
