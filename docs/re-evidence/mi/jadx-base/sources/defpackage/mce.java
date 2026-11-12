package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.widget.view.DurationTextView;

/* JADX INFO: loaded from: classes9.dex */
public class mce extends lce {
    public static final ViewDataBinding.i K;
    public static final SparseIntArray L;
    public final a7e H;
    public final LinearLayout I;
    public long J;

    static {
        ViewDataBinding.i iVar = new ViewDataBinding.i(9);
        K = iVar;
        iVar.a(0, new String[]{"layout_common_icon_title"}, new int[]{1}, new int[]{jui.v6});
        SparseIntArray sparseIntArray = new SparseIntArray();
        L = sparseIntArray;
        sparseIntArray.put(eri.lk, 2);
        sparseIntArray.put(eri.p4, 3);
        sparseIntArray.put(eri.R8, 4);
        sparseIntArray.put(eri.Pa, 5);
        sparseIntArray.put(eri.vl, 6);
        sparseIntArray.put(eri.ra, 7);
        sparseIntArray.put(eri.Sa, 8);
    }

    public mce(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 0, (DurationTextView) objArr[3], (AppCompatImageView) objArr[4], (RecyclerView) objArr[7], (LinearLayout) objArr[5], (LinearLayout) objArr[8], (TextView) objArr[2], (TextView) objArr[6]);
        this.J = -1L;
        a7e a7eVar = (a7e) objArr[1];
        this.H = a7eVar;
        k0(a7eVar);
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.I = linearLayout;
        linearLayout.setTag(null);
        o0(view);
        H();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean F() {
        synchronized (this) {
            try {
                if (this.J != 0) {
                    return true;
                }
                return this.H.F();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void H() {
        synchronized (this) {
            this.J = 1L;
        }
        this.H.H();
        e0();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean W(int i, Object obj, int i2) {
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void l0(LifecycleOwner lifecycleOwner) {
        super.l0(lifecycleOwner);
        this.H.l0(lifecycleOwner);
    }

    @Override // androidx.databinding.ViewDataBinding
    public void o() {
        synchronized (this) {
            this.J = 0L;
        }
        ViewDataBinding.r(this.H);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean q0(int i, Object obj) {
        return true;
    }

    public mce(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 9, K, L));
    }
}
