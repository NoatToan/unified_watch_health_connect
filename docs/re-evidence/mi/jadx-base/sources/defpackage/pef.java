package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.medal.medallist.MedalViewModel;
import com.xiaomi.fitness.widget.SlidableScrollView;

/* JADX INFO: loaded from: classes9.dex */
public class pef extends nef {
    public static final ViewDataBinding.i H = null;
    public static final SparseIntArray I;
    public final SlidableScrollView F;
    public long G;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        I = sparseIntArray;
        sparseIntArray.put(iri.a0, 1);
    }

    public pef(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 0, null, null, null, (RecyclerView) objArr[1]);
        this.G = -1L;
        SlidableScrollView slidableScrollView = (SlidableScrollView) objArr[0];
        this.F = slidableScrollView;
        slidableScrollView.setTag(null);
        o0(view);
        H();
    }

    public void A0(MedalViewModel medalViewModel) {
        this.E = medalViewModel;
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean F() {
        synchronized (this) {
            try {
                return this.G != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void H() {
        synchronized (this) {
            this.G = 2L;
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
            this.G = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean q0(int i, Object obj) {
        if (fv1.c != i) {
            return false;
        }
        A0((MedalViewModel) obj);
        return true;
    }

    public pef(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 2, H, I));
    }
}
