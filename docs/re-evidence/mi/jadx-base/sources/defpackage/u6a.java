package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.watch.face.widget.StateLayout;
import com.xiaomi.fitness.widget.view.DividerView;

/* JADX INFO: loaded from: classes10.dex */
public class u6a extends t6a {
    public static final ViewDataBinding.i O;
    public static final SparseIntArray P;
    public final ConstraintLayout L;
    public final ConstraintLayout M;
    public long N;

    static {
        ViewDataBinding.i iVar = new ViewDataBinding.i(13);
        O = iVar;
        iVar.a(1, new String[]{"face_layout_pay_uninstall_item"}, new int[]{2}, new int[]{ovi.P});
        SparseIntArray sparseIntArray = new SparseIntArray();
        P = sparseIntArray;
        sparseIntArray.put(isi.h2, 3);
        sparseIntArray.put(isi.d, 4);
        sparseIntArray.put(isi.e, 5);
        sparseIntArray.put(isi.Y0, 6);
        sparseIntArray.put(isi.N, 7);
        sparseIntArray.put(isi.J2, 8);
        sparseIntArray.put(isi.H, 9);
        sparseIntArray.put(isi.Q, 10);
        sparseIntArray.put(isi.L, 11);
        sparseIntArray.put(isi.K, 12);
    }

    public u6a(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 1, (ConstraintLayout) objArr[4], (TextView) objArr[5], (ImageView) objArr[12], (TextView) objArr[11], (ConstraintLayout) objArr[9], (TextView) objArr[7], (DividerView) objArr[10], (RecyclerView) objArr[6], (z29) objArr[2], (StateLayout) objArr[3], (TextView) objArr[8]);
        this.N = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.L = constraintLayout;
        constraintLayout.setTag(null);
        ConstraintLayout constraintLayout2 = (ConstraintLayout) objArr[1];
        this.M = constraintLayout2;
        constraintLayout2.setTag(null);
        k0(this.I);
        o0(view);
        H();
    }

    public final boolean C0(z29 z29Var, int i) {
        if (i != tv1.f35070a) {
            return false;
        }
        synchronized (this) {
            this.N |= 1;
        }
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean F() {
        synchronized (this) {
            try {
                if (this.N != 0) {
                    return true;
                }
                return this.I.F();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void H() {
        synchronized (this) {
            this.N = 2L;
        }
        this.I.H();
        e0();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean W(int i, Object obj, int i2) {
        if (i != 0) {
            return false;
        }
        return C0((z29) obj, i2);
    }

    @Override // androidx.databinding.ViewDataBinding
    public void l0(LifecycleOwner lifecycleOwner) {
        super.l0(lifecycleOwner);
        this.I.l0(lifecycleOwner);
    }

    @Override // androidx.databinding.ViewDataBinding
    public void o() {
        synchronized (this) {
            this.N = 0L;
        }
        ViewDataBinding.r(this.I);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean q0(int i, Object obj) {
        return true;
    }

    public u6a(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 13, O, P));
    }
}
