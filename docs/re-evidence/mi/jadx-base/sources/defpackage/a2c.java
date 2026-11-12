package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.common.HealthRemindSelectCountView;
import com.xiaomi.fitness.widget.SwitchButtonBindingSingleLineTextView;
import miuix.core.widget.NestedScrollView;

/* JADX INFO: loaded from: classes9.dex */
public class a2c extends z1c {
    public static final ViewDataBinding.i G = null;
    public static final SparseIntArray H;
    public long F;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        H = sparseIntArray;
        sparseIntArray.put(eri.Vd, 1);
        sparseIntArray.put(eri.Ud, 2);
        sparseIntArray.put(eri.Wd, 3);
        sparseIntArray.put(eri.Xd, 4);
    }

    public a2c(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 0, (LinearLayoutCompat) objArr[2], (SwitchButtonBindingSingleLineTextView) objArr[1], (HealthRemindSelectCountView) objArr[3], (LinearLayoutCompat) objArr[4], (NestedScrollView) objArr[0]);
        this.F = -1L;
        this.E.setTag(null);
        o0(view);
        H();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean F() {
        synchronized (this) {
            try {
                return this.F != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void H() {
        synchronized (this) {
            this.F = 1L;
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
            this.F = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean q0(int i, Object obj) {
        return true;
    }

    public a2c(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 5, G, H));
    }
}
