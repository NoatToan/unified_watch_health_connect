package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import miuix.androidbasewidget.widget.EditText;

/* JADX INFO: loaded from: classes5.dex */
public class m5a extends l5a {
    public static final ViewDataBinding.i c0 = null;
    public static final SparseIntArray d0;
    public final ConstraintLayout a0;
    public long b0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        d0 = sparseIntArray;
        sparseIntArray.put(kqi.f, 1);
        sparseIntArray.put(kqi.u, 2);
        sparseIntArray.put(kqi.t, 3);
        sparseIntArray.put(kqi.q, 4);
        sparseIntArray.put(kqi.V, 5);
        sparseIntArray.put(kqi.U, 6);
        sparseIntArray.put(kqi.X, 7);
        sparseIntArray.put(kqi.z, 8);
        sparseIntArray.put(kqi.e0, 9);
        sparseIntArray.put(kqi.f0, 10);
        sparseIntArray.put(kqi.W, 11);
        sparseIntArray.put(kqi.y, 12);
        sparseIntArray.put(kqi.c0, 13);
        sparseIntArray.put(kqi.d0, 14);
        sparseIntArray.put(kqi.w, 15);
        sparseIntArray.put(kqi.f24194a, 16);
        sparseIntArray.put(kqi.s, 17);
        sparseIntArray.put(kqi.f24197r, 18);
        sparseIntArray.put(kqi.a0, 19);
        sparseIntArray.put(kqi.b0, 20);
        sparseIntArray.put(kqi.c, 21);
        sparseIntArray.put(kqi.p, 22);
        sparseIntArray.put(kqi.x, 23);
        sparseIntArray.put(kqi.Y, 24);
        sparseIntArray.put(kqi.Z, 25);
        sparseIntArray.put(kqi.f24195b, 26);
    }

    public m5a(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 0, (Button) objArr[16], (Button) objArr[26], (Button) objArr[21], (ConstraintLayout) objArr[1], (ConstraintLayout) objArr[22], (ConstraintLayout) objArr[4], (ImageView) objArr[18], (ConstraintLayout) objArr[17], (Button) objArr[3], (EditText) objArr[2], (Button) objArr[15], (ImageView) objArr[23], (ImageView) objArr[12], (ImageView) objArr[8], (ProgressBar) objArr[6], (TextView) objArr[5], (ConstraintLayout) objArr[11], (ConstraintLayout) objArr[7], (TextView) objArr[24], (TextView) objArr[25], (TextView) objArr[19], (TextView) objArr[20], (TextView) objArr[13], (TextView) objArr[14], (TextView) objArr[9], (TextView) objArr[10]);
        this.b0 = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.a0 = constraintLayout;
        constraintLayout.setTag(null);
        o0(view);
        H();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean F() {
        synchronized (this) {
            try {
                return this.b0 != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void H() {
        synchronized (this) {
            this.b0 = 1L;
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
            this.b0 = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean q0(int i, Object obj) {
        return true;
    }

    public m5a(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 27, c0, d0));
    }
}
