package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.electronic.scale.widget.sliding.BodyIndexSlidingView;

/* JADX INFO: loaded from: classes8.dex */
public class i68 extends h68 {
    public static final ViewDataBinding.i H = null;
    public static final SparseIntArray I;
    public final LinearLayout F;
    public long G;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        I = sparseIntArray;
        sparseIntArray.put(bri.b5, 1);
        sparseIntArray.put(bri.P5, 2);
        sparseIntArray.put(bri.f3, 3);
        sparseIntArray.put(bri.q6, 4);
        sparseIntArray.put(bri.d3, 5);
    }

    public i68(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 0, (ImageView) objArr[5], (RelativeLayout) objArr[3], (TextView) objArr[1], (TextView) objArr[2], (BodyIndexSlidingView) objArr[4]);
        this.G = -1L;
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.F = linearLayout;
        linearLayout.setTag(null);
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

    public i68(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 6, H, I));
    }
}
