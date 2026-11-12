package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.widget.view.DividerView;

/* JADX INFO: loaded from: classes5.dex */
public class bh0 extends ah0 {
    public static final ViewDataBinding.i O = null;
    public static final SparseIntArray P;
    public final FrameLayout M;
    public long N;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        P = sparseIntArray;
        sparseIntArray.put(mqi.e, 1);
        sparseIntArray.put(mqi.c, 2);
        sparseIntArray.put(mqi.j, 3);
        sparseIntArray.put(mqi.f, 4);
        sparseIntArray.put(mqi.f27103b, 5);
        sparseIntArray.put(mqi.l, 6);
        sparseIntArray.put(mqi.f27104k, 7);
        sparseIntArray.put(mqi.f27102a, 8);
        sparseIntArray.put(mqi.i, 9);
        sparseIntArray.put(mqi.d, 10);
        sparseIntArray.put(mqi.h, 11);
        sparseIntArray.put(mqi.g, 12);
    }

    public bh0(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 0, (DividerView) objArr[8], (ImageView) objArr[5], (ImageView) objArr[2], (ScrollView) objArr[10], (RelativeLayout) objArr[1], (LinearLayout) objArr[4], (TextView) objArr[12], (TextView) objArr[11], (TextView) objArr[9], (TextView) objArr[3], (TextView) objArr[7], (TextView) objArr[6]);
        this.N = -1L;
        FrameLayout frameLayout = (FrameLayout) objArr[0];
        this.M = frameLayout;
        frameLayout.setTag(null);
        o0(view);
        H();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean F() {
        synchronized (this) {
            try {
                return this.N != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void H() {
        synchronized (this) {
            this.N = 1L;
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
            this.N = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean q0(int i, Object obj) {
        return true;
    }

    public bh0(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 13, O, P));
    }
}
