package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.EditText;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.widget.RightArrowSingleLineTextView;

/* JADX INFO: loaded from: classes9.dex */
public class jvb extends ivb {
    public static final ViewDataBinding.i F = null;
    public static final SparseIntArray G;
    public final LinearLayoutCompat D;
    public long E;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        G = sparseIntArray;
        sparseIntArray.put(eri.xb, 1);
        sparseIntArray.put(eri.vb, 2);
        sparseIntArray.put(eri.zb, 3);
    }

    public jvb(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 0, (EditText) objArr[2], (EditText) objArr[1], (RightArrowSingleLineTextView) objArr[3]);
        this.E = -1L;
        LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) objArr[0];
        this.D = linearLayoutCompat;
        linearLayoutCompat.setTag(null);
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

    public jvb(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 4, F, G));
    }
}
