package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.notify.widget.CheckBoxTextView;
import com.xiaomi.fitness.ubox.export.DeviceIconView;
import com.xiaomi.fitness.widget.SwitchButtonTwoLineTextView;
import com.xiaomi.fitness.widget.view.DividerView;
import miuix.core.widget.NestedScrollView;
import miuix.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes9.dex */
public class ezg extends dzg {
    public static final ViewDataBinding.i T = null;
    public static final SparseIntArray U;
    public final LinearLayoutCompat R;
    public long S;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        U = sparseIntArray;
        sparseIntArray.put(nri.I, 1);
        sparseIntArray.put(nri.q, 2);
        sparseIntArray.put(nri.y, 3);
        sparseIntArray.put(nri.x, 4);
        sparseIntArray.put(nri.M, 5);
        sparseIntArray.put(nri.z, 6);
        sparseIntArray.put(nri.w, 7);
        sparseIntArray.put(nri.A, 8);
        sparseIntArray.put(nri.f28296r, 9);
        sparseIntArray.put(nri.B, 10);
        sparseIntArray.put(nri.v, 11);
        sparseIntArray.put(nri.K, 12);
        sparseIntArray.put(nri.E, 13);
        sparseIntArray.put(nri.c, 14);
        sparseIntArray.put(nri.d, 15);
        sparseIntArray.put(nri.F, 16);
        sparseIntArray.put(nri.m, 17);
    }

    public ezg(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 0, (RecyclerView) objArr[14], (LinearLayout) objArr[15], (TextView) objArr[17], (DeviceIconView) objArr[2], (DividerView) objArr[9], (TextView) objArr[11], (SwitchButtonTwoLineTextView) objArr[7], (SwitchButtonTwoLineTextView) objArr[4], (LinearLayoutCompat) objArr[3], (SwitchButtonTwoLineTextView) objArr[6], (SwitchButtonTwoLineTextView) objArr[8], (LinearLayout) objArr[10], (CheckBoxTextView) objArr[13], (TextView) objArr[16], (NestedScrollView) objArr[1], (CheckBoxTextView) objArr[12], (TextView) objArr[5]);
        this.S = -1L;
        LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) objArr[0];
        this.R = linearLayoutCompat;
        linearLayoutCompat.setTag(null);
        o0(view);
        H();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean F() {
        synchronized (this) {
            try {
                return this.S != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void H() {
        synchronized (this) {
            this.S = 1L;
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
            this.S = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean q0(int i, Object obj) {
        return true;
    }

    public ezg(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 18, T, U));
    }
}
