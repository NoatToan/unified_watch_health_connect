package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.widget.view.DividerView;

/* JADX INFO: loaded from: classes8.dex */
public class zh6 extends yh6 {
    public static final ViewDataBinding.i K;
    public static final SparseIntArray L;
    public final RelativeLayout I;
    public long J;

    static {
        ViewDataBinding.i iVar = new ViewDataBinding.i(9);
        K = iVar;
        iVar.a(1, new String[]{"device_settings_item_music_list"}, new int[]{2}, new int[]{eui.a1});
        SparseIntArray sparseIntArray = new SparseIntArray();
        L = sparseIntArray;
        sparseIntArray.put(zqi.N7, 3);
        sparseIntArray.put(zqi.U1, 4);
        sparseIntArray.put(zqi.B4, 5);
        sparseIntArray.put(zqi.O2, 6);
        sparseIntArray.put(zqi.D3, 7);
        sparseIntArray.put(zqi.xa, 8);
    }

    public zh6(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 1, (LinearLayout) objArr[1], (DividerView) objArr[4], (LinearLayout) objArr[6], (ImageView) objArr[7], (RecyclerView) objArr[5], (EditText) objArr[3], (mk6) objArr[2], (TextView) objArr[8]);
        this.J = -1L;
        this.A.setTag(null);
        RelativeLayout relativeLayout = (RelativeLayout) objArr[0];
        this.I = relativeLayout;
        relativeLayout.setTag(null);
        k0(this.G);
        o0(view);
        H();
    }

    public final boolean A0(mk6 mk6Var, int i) {
        if (i != bw1.f4667a) {
            return false;
        }
        synchronized (this) {
            this.J |= 1;
        }
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean F() {
        synchronized (this) {
            try {
                if (this.J != 0) {
                    return true;
                }
                return this.G.F();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void H() {
        synchronized (this) {
            this.J = 2L;
        }
        this.G.H();
        e0();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean W(int i, Object obj, int i2) {
        if (i != 0) {
            return false;
        }
        return A0((mk6) obj, i2);
    }

    @Override // androidx.databinding.ViewDataBinding
    public void l0(LifecycleOwner lifecycleOwner) {
        super.l0(lifecycleOwner);
        this.G.l0(lifecycleOwner);
    }

    @Override // androidx.databinding.ViewDataBinding
    public void o() {
        synchronized (this) {
            this.J = 0L;
        }
        ViewDataBinding.r(this.G);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean q0(int i, Object obj) {
        return true;
    }

    public zh6(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 9, K, L));
    }
}
