package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.core.widget.NestedScrollView;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LifecycleOwner;
import com.xiaomi.fitness.view.CardUnderstandView;
import com.xiaomi.fitness.view.TitleBarAlphaView;

/* JADX INFO: loaded from: classes9.dex */
public class dob extends cob {
    public static final ViewDataBinding.i O;
    public static final SparseIntArray P;
    public final LinearLayoutCompat L;
    public final LinearLayoutCompat M;
    public long N;

    static {
        ViewDataBinding.i iVar = new ViewDataBinding.i(13);
        O = iVar;
        iVar.a(1, new String[]{"layout_sleep_rhythm_calendar_record"}, new int[]{2}, new int[]{jui.I7});
        SparseIntArray sparseIntArray = new SparseIntArray();
        P = sparseIntArray;
        sparseIntArray.put(eri.dj, 3);
        sparseIntArray.put(eri.ic, 4);
        sparseIntArray.put(eri.P6, 5);
        sparseIntArray.put(eri.Jo, 6);
        sparseIntArray.put(eri.f4, 7);
        sparseIntArray.put(eri.g4, 8);
        sparseIntArray.put(eri.Qe, 9);
        sparseIntArray.put(eri.Q6, 10);
        sparseIntArray.put(eri.uo, 11);
        sparseIntArray.put(eri.wo, 12);
    }

    public dob(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 1, (fce) objArr[2], (View) objArr[7], (View) objArr[8], (CardUnderstandView) objArr[5], (CardUnderstandView) objArr[10], (NestedScrollView) objArr[4], (ImageView) objArr[9], (TitleBarAlphaView) objArr[3], (CardUnderstandView) objArr[11], (CardUnderstandView) objArr[12], (CardUnderstandView) objArr[6]);
        this.N = -1L;
        k0(this.A);
        LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) objArr[0];
        this.L = linearLayoutCompat;
        linearLayoutCompat.setTag(null);
        LinearLayoutCompat linearLayoutCompat2 = (LinearLayoutCompat) objArr[1];
        this.M = linearLayoutCompat2;
        linearLayoutCompat2.setTag(null);
        o0(view);
        H();
    }

    public final boolean A0(fce fceVar, int i) {
        if (i != cv1.f14763a) {
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
                return this.A.F();
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
        this.A.H();
        e0();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean W(int i, Object obj, int i2) {
        if (i != 0) {
            return false;
        }
        return A0((fce) obj, i2);
    }

    @Override // androidx.databinding.ViewDataBinding
    public void l0(LifecycleOwner lifecycleOwner) {
        super.l0(lifecycleOwner);
        this.A.l0(lifecycleOwner);
    }

    @Override // androidx.databinding.ViewDataBinding
    public void o() {
        synchronized (this) {
            this.N = 0L;
        }
        ViewDataBinding.r(this.A);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean q0(int i, Object obj) {
        return true;
    }

    public dob(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 13, O, P));
    }
}
