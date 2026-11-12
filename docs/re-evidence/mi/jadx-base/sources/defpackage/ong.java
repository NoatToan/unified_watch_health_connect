package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.nfc.widget.TSMSetRightArrowView;

/* JADX INFO: loaded from: classes9.dex */
public class ong extends nng {
    public static final ViewDataBinding.i N = null;
    public static final SparseIntArray O;
    public long M;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        O = sparseIntArray;
        sparseIntArray.put(mri.r0, 1);
        sparseIntArray.put(mri.N1, 2);
        sparseIntArray.put(mri.y4, 3);
        sparseIntArray.put(mri.x4, 4);
        sparseIntArray.put(mri.l3, 5);
        sparseIntArray.put(mri.q5, 6);
        sparseIntArray.put(mri.m3, 7);
        sparseIntArray.put(mri.N, 8);
        sparseIntArray.put(mri.W3, 9);
        sparseIntArray.put(mri.M3, 10);
        sparseIntArray.put(mri.P4, 11);
    }

    public ong(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 0, (TSMSetRightArrowView) objArr[8], (LinearLayout) objArr[1], (LinearLayout) objArr[2], (FrameLayout) objArr[0], (ListView) objArr[5], (TSMSetRightArrowView) objArr[7], (LinearLayout) objArr[10], (LinearLayout) objArr[9], (TextView) objArr[4], (ImageView) objArr[3], (TextView) objArr[11], (View) objArr[6]);
        this.M = -1L;
        this.D.setTag(null);
        o0(view);
        H();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean F() {
        synchronized (this) {
            try {
                return this.M != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void H() {
        synchronized (this) {
            this.M = 1L;
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
            this.M = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean q0(int i, Object obj) {
        return true;
    }

    public ong(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 12, N, O));
    }
}
