package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes8.dex */
public class ina extends hna {
    public static final ViewDataBinding.i F = null;
    public static final SparseIntArray G;
    public final LinearLayoutCompat D;
    public long E;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        G = sparseIntArray;
        sparseIntArray.put(zqi.y, 2);
    }

    public ina(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 0, (RecyclerView) objArr[2], (Button) objArr[1]);
        this.E = -1L;
        this.B.setTag(null);
        LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) objArr[0];
        this.D = linearLayoutCompat;
        linearLayoutCompat.setTag(null);
        o0(view);
        H();
    }

    @Override // defpackage.hna
    public void A0(Boolean bool) {
        this.C = bool;
        synchronized (this) {
            this.E |= 1;
        }
        notifyPropertyChanged(bw1.c);
        super.e0();
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
            this.E = 2L;
        }
        e0();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean W(int i, Object obj, int i2) {
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void o() {
        long j;
        synchronized (this) {
            j = this.E;
            this.E = 0L;
        }
        Boolean bool = this.C;
        long j2 = j & 3;
        int i = 0;
        if (j2 != 0) {
            boolean zJ0 = ViewDataBinding.j0(bool);
            if (j2 != 0) {
                j |= zJ0 ? 8L : 4L;
            }
            if (!zJ0) {
                i = 8;
            }
        }
        if ((j & 3) != 0) {
            this.B.setVisibility(i);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean q0(int i, Object obj) {
        if (bw1.c != i) {
            return false;
        }
        A0((Boolean) obj);
        return true;
    }

    public ina(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 3, F, G));
    }
}
