package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.devicesettings.widget.TimePicker;
import com.xiaomi.fitness.widget.RightArrowSingleLineTextView;
import com.xiaomi.fitness.widget.SwitchButtonTwoLineTextView;

/* JADX INFO: loaded from: classes8.dex */
public class jf6 extends if6 {
    public static final ViewDataBinding.i G = null;
    public static final SparseIntArray H;
    public final NestedScrollView E;
    public long F;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        H = sparseIntArray;
        sparseIntArray.put(zqi.M9, 1);
        sparseIntArray.put(zqi.ra, 2);
        sparseIntArray.put(zqi.f41580r, 3);
        sparseIntArray.put(zqi.q, 4);
    }

    public jf6(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 0, (SwitchButtonTwoLineTextView) objArr[4], (RightArrowSingleLineTextView) objArr[3], (TimePicker) objArr[1], (TextView) objArr[2]);
        this.F = -1L;
        NestedScrollView nestedScrollView = (NestedScrollView) objArr[0];
        this.E = nestedScrollView;
        nestedScrollView.setTag(null);
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

    public jf6(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 5, G, H));
    }
}
