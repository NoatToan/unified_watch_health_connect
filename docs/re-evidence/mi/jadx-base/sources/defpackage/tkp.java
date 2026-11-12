package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.track.viewmodel.ExportTrackViewModel;

/* JADX INFO: loaded from: classes10.dex */
public class tkp extends skp {
    public static final ViewDataBinding.i G = null;
    public static final SparseIntArray H;
    public final ConstraintLayout E;
    public long F;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        H = sparseIntArray;
        sparseIntArray.put(bsi.T0, 1);
        sparseIntArray.put(bsi.V7, 2);
        sparseIntArray.put(bsi.Z9, 3);
    }

    public tkp(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 0, (RecyclerView) objArr[1], (TextView) objArr[2], (View) objArr[3]);
        this.F = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.E = constraintLayout;
        constraintLayout.setTag(null);
        o0(view);
        H();
    }

    public void A0(ExportTrackViewModel exportTrackViewModel) {
        this.D = exportTrackViewModel;
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
            this.F = 2L;
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
        if (qv1.f31872b != i) {
            return false;
        }
        A0((ExportTrackViewModel) obj);
        return true;
    }

    public tkp(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 4, G, H));
    }
}
