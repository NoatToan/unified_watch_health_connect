package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.nfc.widget.CardImageView;
import com.xiaomi.fitness.nfc.widget.DeviceImageView;

/* JADX INFO: loaded from: classes9.dex */
public class cng extends bng {
    public static final ViewDataBinding.i L = null;
    public static final SparseIntArray M;
    public final ScrollView I;
    public final LinearLayout J;
    public long K;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        M = sparseIntArray;
        sparseIntArray.put(mri.l5, 2);
        sparseIntArray.put(mri.H2, 3);
        sparseIntArray.put(mri.Z, 4);
        sparseIntArray.put(mri.i1, 5);
        sparseIntArray.put(mri.A4, 6);
        sparseIntArray.put(mri.c0, 7);
        sparseIntArray.put(mri.d1, 8);
        sparseIntArray.put(mri.P3, 9);
    }

    public cng(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 0, (AppCompatTextView) objArr[7], (CardImageView) objArr[4], (TextView) objArr[8], (DeviceImageView) objArr[5], (View) objArr[3], (TextView) objArr[9], (AppCompatTextView) objArr[6], (View) objArr[2]);
        this.K = -1L;
        ScrollView scrollView = (ScrollView) objArr[0];
        this.I = scrollView;
        scrollView.setTag(null);
        LinearLayout linearLayout = (LinearLayout) objArr[1];
        this.J = linearLayout;
        linearLayout.setTag(null);
        o0(view);
        H();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean F() {
        synchronized (this) {
            try {
                return this.K != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void H() {
        synchronized (this) {
            this.K = 1L;
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
            this.K = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean q0(int i, Object obj) {
        return true;
    }

    public cng(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 10, L, M));
    }
}
