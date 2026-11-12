package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.nfc.widget.SafeEditText;

/* JADX INFO: loaded from: classes9.dex */
public class kqg extends jqg {
    public static final ViewDataBinding.i R = null;
    public static final SparseIntArray S;
    public final ScrollView P;
    public long Q;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        S = sparseIntArray;
        sparseIntArray.put(mri.K5, 1);
        sparseIntArray.put(mri.h4, 2);
        sparseIntArray.put(mri.v5, 3);
        sparseIntArray.put(mri.t5, 4);
        sparseIntArray.put(mri.w5, 5);
        sparseIntArray.put(mri.u5, 6);
        sparseIntArray.put(mri.K0, 7);
        sparseIntArray.put(mri.I0, 8);
        sparseIntArray.put(mri.L0, 9);
        sparseIntArray.put(mri.J0, 10);
        sparseIntArray.put(mri.H3, 11);
        sparseIntArray.put(mri.C0, 12);
        sparseIntArray.put(mri.E3, 13);
        sparseIntArray.put(mri.U2, 14);
        sparseIntArray.put(mri.L, 15);
    }

    public kqg(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 0, (View) objArr[15], (CheckBox) objArr[12], (RelativeLayout) objArr[8], (ImageView) objArr[10], (TextView) objArr[7], (SafeEditText) objArr[9], (TextView) objArr[14], (TextView) objArr[13], (LinearLayout) objArr[11], (TextView) objArr[2], (RelativeLayout) objArr[4], (ImageView) objArr[6], (TextView) objArr[3], (SafeEditText) objArr[5], (TextView) objArr[1]);
        this.Q = -1L;
        ScrollView scrollView = (ScrollView) objArr[0];
        this.P = scrollView;
        scrollView.setTag(null);
        o0(view);
        H();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean F() {
        synchronized (this) {
            try {
                return this.Q != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void H() {
        synchronized (this) {
            this.Q = 1L;
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
            this.Q = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean q0(int i, Object obj) {
        return true;
    }

    public kqg(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 16, R, S));
    }
}
