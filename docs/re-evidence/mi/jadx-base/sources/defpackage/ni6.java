package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.baseui.dialog.ClearEditText;
import com.xiaomi.fitness.devicesettings.widget.SideBar;
import miuix.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes8.dex */
public class ni6 extends mi6 {
    public static final ViewDataBinding.i H = null;
    public static final SparseIntArray I;
    public final RelativeLayout F;
    public long G;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        I = sparseIntArray;
        sparseIntArray.put(zqi.D7, 1);
        sparseIntArray.put(zqi.C7, 2);
        sparseIntArray.put(zqi.i7, 3);
        sparseIntArray.put(zqi.V1, 4);
        sparseIntArray.put(zqi.j8, 5);
    }

    public ni6(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 0, (TextView) objArr[4], (RecyclerView) objArr[3], (RelativeLayout) objArr[2], (ClearEditText) objArr[1], (SideBar) objArr[5]);
        this.G = -1L;
        RelativeLayout relativeLayout = (RelativeLayout) objArr[0];
        this.F = relativeLayout;
        relativeLayout.setTag(null);
        o0(view);
        H();
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
            this.G = 1L;
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
        return true;
    }

    public ni6(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 6, H, I));
    }
}
