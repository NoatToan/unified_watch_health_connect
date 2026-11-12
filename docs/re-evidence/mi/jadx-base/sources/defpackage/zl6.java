package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;

/* JADX INFO: loaded from: classes8.dex */
public class zl6 extends yl6 {
    public static final ViewDataBinding.i H = null;
    public static final SparseIntArray I;
    public long G;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        I = sparseIntArray;
        sparseIntArray.put(zqi.Z4, 2);
        sparseIntArray.put(zqi.z8, 3);
        sparseIntArray.put(zqi.y8, 4);
    }

    public zl6(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 0, (ConstraintLayout) objArr[0], (AppCompatImageView) objArr[2], (AppCompatImageView) objArr[4], (TextView) objArr[1], (TextView) objArr[3]);
        this.G = -1L;
        this.A.setTag(null);
        this.D.setTag(null);
        o0(view);
        H();
    }

    @Override // defpackage.yl6
    public void C0(elf elfVar) {
        this.F = elfVar;
        synchronized (this) {
            this.G |= 1;
        }
        notifyPropertyChanged(bw1.e);
        super.e0();
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
        long j;
        synchronized (this) {
            j = this.G;
            this.G = 0L;
        }
        elf elfVar = this.F;
        long j2 = j & 3;
        String str = (j2 == 0 || elfVar == null) ? null : elfVar.d;
        if (j2 != 0) {
            r8p.b(this.D, str);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean q0(int i, Object obj) {
        if (bw1.e != i) {
            return false;
        }
        C0((elf) obj);
        return true;
    }

    public zl6(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 5, H, I));
    }
}
