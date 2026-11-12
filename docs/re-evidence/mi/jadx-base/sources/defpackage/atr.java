package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LifecycleOwner;
import com.xiaomi.xms.wearable.widget.ExpandableTextView;

/* JADX INFO: loaded from: classes2.dex */
public class atr extends zsr {
    public static final ViewDataBinding.i N;
    public static final SparseIntArray O;
    public final LinearLayout L;
    public long M;

    static {
        ViewDataBinding.i iVar = new ViewDataBinding.i(12);
        N = iVar;
        iVar.a(0, new String[]{"xms_view_third_app_bottom_view"}, new int[]{1}, new int[]{wvi.l});
        SparseIntArray sparseIntArray = new SparseIntArray();
        O = sparseIntArray;
        sparseIntArray.put(psi.d, 2);
        sparseIntArray.put(psi.f, 3);
        sparseIntArray.put(psi.l, 4);
        sparseIntArray.put(psi.e, 5);
        sparseIntArray.put(psi.q, 6);
        sparseIntArray.put(psi.O, 7);
        sparseIntArray.put(psi.I, 8);
        sparseIntArray.put(psi.N, 9);
        sparseIntArray.put(psi.j, 10);
        sparseIntArray.put(psi.C, 11);
    }

    public atr(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 1, (ImageView) objArr[2], (TextView) objArr[5], (TextView) objArr[3], (otr) objArr[1], (ExpandableTextView) objArr[10], (View) objArr[4], (ExpandableTextView) objArr[6], (ExpandableTextView) objArr[11], (ExpandableTextView) objArr[8], (ExpandableTextView) objArr[9], (ExpandableTextView) objArr[7]);
        this.M = -1L;
        k0(this.D);
        LinearLayout linearLayout = (LinearLayout) objArr[0];
        this.L = linearLayout;
        linearLayout.setTag(null);
        o0(view);
        H();
    }

    public final boolean A0(otr otrVar, int i) {
        if (i != wv1.f38389a) {
            return false;
        }
        synchronized (this) {
            this.M |= 1;
        }
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean F() {
        synchronized (this) {
            try {
                if (this.M != 0) {
                    return true;
                }
                return this.D.F();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void H() {
        synchronized (this) {
            this.M = 2L;
        }
        this.D.H();
        e0();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean W(int i, Object obj, int i2) {
        if (i != 0) {
            return false;
        }
        return A0((otr) obj, i2);
    }

    @Override // androidx.databinding.ViewDataBinding
    public void l0(LifecycleOwner lifecycleOwner) {
        super.l0(lifecycleOwner);
        this.D.l0(lifecycleOwner);
    }

    @Override // androidx.databinding.ViewDataBinding
    public void o() {
        synchronized (this) {
            this.M = 0L;
        }
        ViewDataBinding.r(this.D);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean q0(int i, Object obj) {
        return true;
    }

    public atr(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 12, N, O));
    }
}
