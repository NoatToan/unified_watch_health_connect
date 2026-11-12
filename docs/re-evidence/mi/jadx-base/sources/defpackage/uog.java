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
import com.xiaomi.fitness.nfc.widget.MarqueeTextView;
import com.xiaomi.fitness.nfc.widget.PhoneNumVerifyView;
import com.xiaomi.fitness.nfc.widget.RechargeItemView;
import com.xiaomi.fitness.nfc.widget.ScrollEmbeddedGridView;

/* JADX INFO: loaded from: classes9.dex */
public class uog extends tog {
    public static final ViewDataBinding.i V = null;
    public static final SparseIntArray W;
    public final ScrollView T;
    public long U;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        W = sparseIntArray;
        sparseIntArray.put(mri.V0, 1);
        sparseIntArray.put(mri.Q4, 2);
        sparseIntArray.put(mri.Y2, 3);
        sparseIntArray.put(mri.O, 4);
        sparseIntArray.put(mri.w2, 5);
        sparseIntArray.put(mri.W2, 6);
        sparseIntArray.put(mri.w3, 7);
        sparseIntArray.put(mri.X2, 8);
        sparseIntArray.put(mri.D1, 9);
        sparseIntArray.put(mri.x2, 10);
        sparseIntArray.put(mri.z0, 11);
        sparseIntArray.put(mri.s0, 12);
        sparseIntArray.put(mri.t0, 13);
        sparseIntArray.put(mri.q4, 14);
        sparseIntArray.put(mri.Z0, 15);
        sparseIntArray.put(mri.V2, 16);
        sparseIntArray.put(mri.g, 17);
        sparseIntArray.put(mri.G3, 18);
        sparseIntArray.put(mri.q3, 19);
    }

    public uog(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 0, (CheckBox) objArr[17], (ImageView) objArr[4], (RechargeItemView) objArr[12], (RechargeItemView) objArr[13], (LinearLayout) objArr[11], (LinearLayout) objArr[1], (RechargeItemView) objArr[15], (ScrollEmbeddedGridView) objArr[9], (View) objArr[5], (View) objArr[10], (LinearLayout) objArr[16], (LinearLayout) objArr[6], (TextView) objArr[8], (RelativeLayout) objArr[3], (TextView) objArr[19], (PhoneNumVerifyView) objArr[7], (TextView) objArr[18], (RechargeItemView) objArr[14], (MarqueeTextView) objArr[2]);
        this.U = -1L;
        ScrollView scrollView = (ScrollView) objArr[0];
        this.T = scrollView;
        scrollView.setTag(null);
        o0(view);
        H();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean F() {
        synchronized (this) {
            try {
                return this.U != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void H() {
        synchronized (this) {
            this.U = 1L;
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
            this.U = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean q0(int i, Object obj) {
        return true;
    }

    public uog(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 20, V, W));
    }
}
