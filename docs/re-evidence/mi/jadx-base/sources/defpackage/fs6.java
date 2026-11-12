package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.MutableLiveData;
import com.xiaomi.fitness.device.manager.export.bean.TabContentItem;
import com.xiaomi.fitness.widget.RightArrowBindingSingleLineTextView;

/* JADX INFO: loaded from: classes8.dex */
public class fs6 extends es6 {
    public static final ViewDataBinding.i D = null;
    public static final SparseIntArray E = null;
    public long C;

    public fs6(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 1, (RightArrowBindingSingleLineTextView) objArr[0]);
        this.C = -1L;
        this.A.setTag(null);
        o0(view);
        H();
    }

    private boolean A0(MutableLiveData<String> mutableLiveData, int i) {
        if (i != zv1.f41705a) {
            return false;
        }
        synchronized (this) {
            this.C |= 1;
        }
        return true;
    }

    public void B0(TabContentItem tabContentItem) {
        this.B = tabContentItem;
        synchronized (this) {
            this.C |= 2;
        }
        notifyPropertyChanged(zv1.g);
        super.e0();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean F() {
        synchronized (this) {
            try {
                return this.C != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void H() {
        synchronized (this) {
            this.C = 4L;
        }
        e0();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean W(int i, Object obj, int i2) {
        if (i != 0) {
            return false;
        }
        return A0((MutableLiveData) obj, i2);
    }

    @Override // androidx.databinding.ViewDataBinding
    public void o() {
        long j;
        synchronized (this) {
            j = this.C;
            this.C = 0L;
        }
        TabContentItem tabContentItem = this.B;
        long j2 = j & 7;
        String value = null;
        if (j2 != 0) {
            MutableLiveData<String> rightTextWithDot = tabContentItem != null ? tabContentItem.getRightTextWithDot() : null;
            w0(0, rightTextWithDot);
            if (rightTextWithDot != null) {
                value = rightTextWithDot.getValue();
            }
        }
        if (j2 != 0) {
            this.A.setRightTextWithDot(value);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean q0(int i, Object obj) {
        if (zv1.g != i) {
            return false;
        }
        B0((TabContentItem) obj);
        return true;
    }

    public fs6(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 1, D, E));
    }
}
