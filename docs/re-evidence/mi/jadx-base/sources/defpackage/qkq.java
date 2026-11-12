package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.userinfo.medicalid.baseui.UserInfoRightArrowSingleLineTextView;

/* JADX INFO: loaded from: classes10.dex */
public class qkq extends pkq {
    public static final ViewDataBinding.i G = null;
    public static final SparseIntArray H;
    public final RelativeLayout E;
    public long F;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        H = sparseIntArray;
        sparseIntArray.put(hsi.f20407b, 1);
        sparseIntArray.put(hsi.t, 2);
        sparseIntArray.put(hsi.u, 3);
        sparseIntArray.put(hsi.F, 4);
    }

    public qkq(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 0, (TextView) objArr[1], (EditText) objArr[2], (EditText) objArr[3], (UserInfoRightArrowSingleLineTextView) objArr[4]);
        this.F = -1L;
        RelativeLayout relativeLayout = (RelativeLayout) objArr[0];
        this.E = relativeLayout;
        relativeLayout.setTag(null);
        o0(view);
        H();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean F() {
        synchronized (this) {
            try {
                return this.F != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void H() {
        synchronized (this) {
            this.F = 1L;
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
            this.F = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean q0(int i, Object obj) {
        return true;
    }

    public qkq(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 5, G, H));
    }
}
