package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.AutoCompleteTextView;
import android.widget.CheckBox;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import miuix.androidbasewidget.widget.EditText;

/* JADX INFO: loaded from: classes8.dex */
public class qj0 extends pj0 {
    public static final ViewDataBinding.i V = null;
    public static final SparseIntArray W;
    public final FrameLayout T;
    public long U;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        W = sparseIntArray;
        sparseIntArray.put(bri.f2, 1);
        sparseIntArray.put(bri.P3, 2);
        sparseIntArray.put(bri.S3, 3);
        sparseIntArray.put(bri.R3, 4);
        sparseIntArray.put(bri.u5, 5);
        sparseIntArray.put(bri.R0, 6);
        sparseIntArray.put(bri.Q0, 7);
        sparseIntArray.put(bri.P2, 8);
        sparseIntArray.put(bri.O2, 9);
        sparseIntArray.put(bri.Q2, 10);
        sparseIntArray.put(bri.a3, 11);
        sparseIntArray.put(bri.g5, 12);
        sparseIntArray.put(bri.c2, 13);
        sparseIntArray.put(bri.f5, 14);
        sparseIntArray.put(bri.b2, 15);
        sparseIntArray.put(bri.C4, 16);
        sparseIntArray.put(bri.a2, 17);
        sparseIntArray.put(bri.p5, 18);
        sparseIntArray.put(bri.h4, 19);
    }

    public qj0(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 0, (EditText) objArr[7], (RelativeLayout) objArr[6], (LinearLayout) objArr[17], (LinearLayout) objArr[15], (LinearLayout) objArr[13], (LinearLayout) objArr[1], (EditText) objArr[9], (RelativeLayout) objArr[8], (CheckBox) objArr[10], (CheckBox) objArr[11], (TextView) objArr[2], (AutoCompleteTextView) objArr[4], (RelativeLayout) objArr[3], (TextView) objArr[19], (TextView) objArr[16], (TextView) objArr[14], (TextView) objArr[12], (TextView) objArr[18], (TextView) objArr[5]);
        this.U = -1L;
        FrameLayout frameLayout = (FrameLayout) objArr[0];
        this.T = frameLayout;
        frameLayout.setTag(null);
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

    public qj0(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 20, V, W));
    }
}
