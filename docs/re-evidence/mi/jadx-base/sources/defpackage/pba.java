package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.health.sleep.ui.SleepHealthBannerCardSetLayout;
import com.xiaomi.fitness.view.CardUnderstandView;

/* JADX INFO: loaded from: classes9.dex */
public class pba extends oba {
    public static final ViewDataBinding.i M;
    public static final SparseIntArray N;
    public long L;

    static {
        ViewDataBinding.i iVar = new ViewDataBinding.i(11);
        M = iVar;
        iVar.a(0, new String[]{"layout_sleep_score", "layout_sleep_day_animal_entrance", "layout_sleep_interfere_day_entry", "layout_sleep_duration", "layout_sleep_interfere_create_entry"}, new int[]{3, 4, 5, 6, 7}, new int[]{jui.K7, jui.t7, jui.B7, jui.v7, jui.A7});
        SparseIntArray sparseIntArray = new SparseIntArray();
        N = sparseIntArray;
        sparseIntArray.put(eri.fg, 1);
        sparseIntArray.put(eri.wf, 2);
        sparseIntArray.put(eri.Ff, 8);
        sparseIntArray.put(eri.b6, 9);
        sparseIntArray.put(eri.uo, 10);
    }

    public pba(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 5, (lbe) objArr[6], (jce) objArr[3], (jbe) objArr[4], (LinearLayout) objArr[0], (SleepHealthBannerCardSetLayout) objArr[9], (View) objArr[2], (RecyclerView) objArr[8], (xbe) objArr[5], (vbe) objArr[7], (View) objArr[1], (CardUnderstandView) objArr[10]);
        this.L = -1L;
        k0(this.A);
        k0(this.B);
        k0(this.C);
        this.D.setTag(null);
        k0(this.H);
        k0(this.I);
        o0(view);
        H();
    }

    public final boolean A0(lbe lbeVar, int i) {
        if (i != cv1.f14763a) {
            return false;
        }
        synchronized (this) {
            this.L |= 2;
        }
        return true;
    }

    public final boolean B0(jce jceVar, int i) {
        if (i != cv1.f14763a) {
            return false;
        }
        synchronized (this) {
            this.L |= 1;
        }
        return true;
    }

    public final boolean C0(jbe jbeVar, int i) {
        if (i != cv1.f14763a) {
            return false;
        }
        synchronized (this) {
            this.L |= 16;
        }
        return true;
    }

    public final boolean D0(xbe xbeVar, int i) {
        if (i != cv1.f14763a) {
            return false;
        }
        synchronized (this) {
            this.L |= 4;
        }
        return true;
    }

    public final boolean E0(vbe vbeVar, int i) {
        if (i != cv1.f14763a) {
            return false;
        }
        synchronized (this) {
            this.L |= 8;
        }
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean F() {
        synchronized (this) {
            try {
                if (this.L != 0) {
                    return true;
                }
                return this.B.F() || this.C.F() || this.H.F() || this.A.F() || this.I.F();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void H() {
        synchronized (this) {
            this.L = 32L;
        }
        this.B.H();
        this.C.H();
        this.H.H();
        this.A.H();
        this.I.H();
        e0();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean W(int i, Object obj, int i2) {
        if (i == 0) {
            return B0((jce) obj, i2);
        }
        if (i == 1) {
            return A0((lbe) obj, i2);
        }
        if (i == 2) {
            return D0((xbe) obj, i2);
        }
        if (i == 3) {
            return E0((vbe) obj, i2);
        }
        if (i != 4) {
            return false;
        }
        return C0((jbe) obj, i2);
    }

    @Override // androidx.databinding.ViewDataBinding
    public void l0(LifecycleOwner lifecycleOwner) {
        super.l0(lifecycleOwner);
        this.B.l0(lifecycleOwner);
        this.C.l0(lifecycleOwner);
        this.H.l0(lifecycleOwner);
        this.A.l0(lifecycleOwner);
        this.I.l0(lifecycleOwner);
    }

    @Override // androidx.databinding.ViewDataBinding
    public void o() {
        synchronized (this) {
            this.L = 0L;
        }
        ViewDataBinding.r(this.B);
        ViewDataBinding.r(this.C);
        ViewDataBinding.r(this.H);
        ViewDataBinding.r(this.A);
        ViewDataBinding.r(this.I);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean q0(int i, Object obj) {
        return true;
    }

    public pba(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 11, M, N));
    }
}
