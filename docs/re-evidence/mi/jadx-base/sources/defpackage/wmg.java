package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import miuix.androidbasewidget.widget.EditText;

/* JADX INFO: loaded from: classes9.dex */
public class wmg extends vmg {
    public static final ViewDataBinding.i Y = null;
    public static final SparseIntArray Z;
    public final ConstraintLayout W;
    public long X;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        Z = sparseIntArray;
        sparseIntArray.put(mri.g0, 1);
        sparseIntArray.put(mri.b0, 2);
        sparseIntArray.put(mri.d0, 3);
        sparseIntArray.put(mri.e0, 4);
        sparseIntArray.put(mri.c0, 5);
        sparseIntArray.put(mri.F4, 6);
        sparseIntArray.put(mri.D4, 7);
        sparseIntArray.put(mri.V, 8);
        sparseIntArray.put(mri.W, 9);
        sparseIntArray.put(mri.d, 10);
        sparseIntArray.put(mri.i, 11);
        sparseIntArray.put(mri.G2, 12);
        sparseIntArray.put(mri.o3, 13);
        sparseIntArray.put(mri.n3, 14);
        sparseIntArray.put(mri.z5, 15);
        sparseIntArray.put(mri.y5, 16);
        sparseIntArray.put(mri.c3, 17);
        sparseIntArray.put(mri.d3, 18);
        sparseIntArray.put(mri.H3, 19);
        sparseIntArray.put(mri.C0, 20);
        sparseIntArray.put(mri.E3, 21);
        sparseIntArray.put(mri.U2, 22);
    }

    public wmg(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 0, (AppCompatImageView) objArr[10], (TextView) objArr[11], (AppCompatTextView) objArr[2], (AppCompatTextView) objArr[5], (AppCompatTextView) objArr[3], (AppCompatTextView) objArr[4], (ConstraintLayout) objArr[1], (ConstraintLayout) objArr[8], (EditText) objArr[9], (CheckBox) objArr[20], (LinearLayout) objArr[12], (TextView) objArr[22], (EditText) objArr[17], (ImageView) objArr[18], (ImageView) objArr[14], (EditText) objArr[13], (TextView) objArr[21], (LinearLayout) objArr[19], (TextView) objArr[7], (LinearLayout) objArr[6], (ImageView) objArr[16], (EditText) objArr[15]);
        this.X = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.W = constraintLayout;
        constraintLayout.setTag(null);
        o0(view);
        H();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean F() {
        synchronized (this) {
            try {
                return this.X != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void H() {
        synchronized (this) {
            this.X = 1L;
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
            this.X = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean q0(int i, Object obj) {
        return true;
    }

    public wmg(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 23, Y, Z));
    }
}
