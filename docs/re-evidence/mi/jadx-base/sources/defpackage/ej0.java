package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.widget.RightArrowBindingSingleLineTextView;
import miuix.core.widget.NestedScrollView;
import miuix.springback.view.SpringBackLayout;

/* JADX INFO: loaded from: classes8.dex */
public class ej0 extends dj0 {
    public static final ViewDataBinding.i N = null;
    public static final SparseIntArray O;
    public final SpringBackLayout L;
    public long M;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        O = sparseIntArray;
        sparseIntArray.put(bri.B3, 7);
        sparseIntArray.put(bri.v1, 8);
        sparseIntArray.put(bri.j1, 9);
        sparseIntArray.put(bri.y4, 10);
    }

    public ej0(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 0, (ImageView) objArr[9], (LinearLayout) objArr[8], (NestedScrollView) objArr[7], (RightArrowBindingSingleLineTextView) objArr[1], (TextView) objArr[10], (RightArrowBindingSingleLineTextView) objArr[3], (RightArrowBindingSingleLineTextView) objArr[2], (RightArrowBindingSingleLineTextView) objArr[5], (RightArrowBindingSingleLineTextView) objArr[4], (RightArrowBindingSingleLineTextView) objArr[6]);
        this.M = -1L;
        SpringBackLayout springBackLayout = (SpringBackLayout) objArr[0];
        this.L = springBackLayout;
        springBackLayout.setTag(null);
        this.D.setTag(null);
        this.F.setTag(null);
        this.G.setTag(null);
        this.H.setTag(null);
        this.I.setTag(null);
        this.J.setTag(null);
        o0(view);
        H();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean F() {
        synchronized (this) {
            try {
                return this.M != 0;
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
        e0();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean W(int i, Object obj, int i2) {
        return false;
    }

    @Override // androidx.databinding.ViewDataBinding
    public void o() {
        long j;
        synchronized (this) {
            j = this.M;
            this.M = 0L;
        }
        View.OnClickListener onClickListener = this.K;
        if ((j & 3) != 0) {
            this.D.setOnClickListener(onClickListener);
            this.F.setOnClickListener(onClickListener);
            this.G.setOnClickListener(onClickListener);
            this.H.setOnClickListener(onClickListener);
            this.I.setOnClickListener(onClickListener);
            this.J.setOnClickListener(onClickListener);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean q0(int i, Object obj) {
        if (av1.f3480b != i) {
            return false;
        }
        setOnClick((View.OnClickListener) obj);
        return true;
    }

    @Override // defpackage.dj0
    public void setOnClick(View.OnClickListener onClickListener) {
        this.K = onClickListener;
        synchronized (this) {
            this.M |= 1;
        }
        notifyPropertyChanged(av1.f3480b);
        super.e0();
    }

    public ej0(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 11, N, O));
    }
}
