package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.health.threetarget.view.ShareAccountInfoView;
import com.xiaomi.fitness.widget.SingleLineMarqueeableTextView;

/* JADX INFO: loaded from: classes9.dex */
public class xnb extends vnb {
    public static final ViewDataBinding.i S = null;
    public static final SparseIntArray T;
    public final ConstraintLayout Q;
    public long R;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        T = sparseIntArray;
        sparseIntArray.put(eri.Ze, 2);
        sparseIntArray.put(eri.n0, 3);
        sparseIntArray.put(eri.bf, 4);
        sparseIntArray.put(eri.j5, 5);
        sparseIntArray.put(eri.p0, 6);
        sparseIntArray.put(eri.l, 7);
        sparseIntArray.put(eri.uh, 8);
        sparseIntArray.put(eri.k1, 9);
        sparseIntArray.put(eri.Pi, 10);
        sparseIntArray.put(eri.db, 11);
        sparseIntArray.put(eri.dc, 12);
        sparseIntArray.put(eri.gd, 13);
        sparseIntArray.put(eri.c1, 14);
        sparseIntArray.put(eri.Tg, 15);
        sparseIntArray.put(eri.af, 16);
    }

    public xnb(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 0, (ShareAccountInfoView) objArr[7], (FrameLayout) objArr[3], (ConstraintLayout) objArr[6], (View) objArr[1], (LinearLayout) objArr[14], (TextView) objArr[9], (ImageView) objArr[5], (ImageView) objArr[11], (TextView) objArr[12], (ImageView) objArr[13], (ConstraintLayout) objArr[4], (View) objArr[2], (SingleLineMarqueeableTextView) objArr[16], (View) objArr[15], (TextView) objArr[8], (TextView) objArr[10]);
        this.R = -1L;
        this.D.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.Q = constraintLayout;
        constraintLayout.setTag(null);
        o0(view);
        H();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean F() {
        synchronized (this) {
            try {
                return this.R != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void H() {
        synchronized (this) {
            this.R = 1L;
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
            this.R = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean q0(int i, Object obj) {
        return true;
    }

    public xnb(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 17, S, T));
    }
}
