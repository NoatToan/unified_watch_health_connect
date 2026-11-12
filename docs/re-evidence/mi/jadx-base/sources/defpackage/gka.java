package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import androidx.constraintlayout.widget.Group;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.baseui.recyclerview.MoreRecyclerView;
import com.xiaomi.fitness.watch.face.view.FaceWaterMarkView;
import com.xiaomi.fitness.watch.face.viewmodel.FaceTabListViewModel;
import com.xiaomi.fitness.watch.face.widget.StateLayout;

/* JADX INFO: loaded from: classes10.dex */
public class gka extends fka {
    public static final ViewDataBinding.i I = null;
    public static final SparseIntArray J;
    public long H;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        J = sparseIntArray;
        sparseIntArray.put(isi.d0, 1);
        sparseIntArray.put(isi.Y1, 2);
        sparseIntArray.put(isi.V1, 3);
        sparseIntArray.put(isi.r2, 4);
        sparseIntArray.put(isi.H2, 5);
    }

    public gka(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 0, (EditText) objArr[1], (Group) objArr[3], (TextView) objArr[2], (StateLayout) objArr[0], (MoreRecyclerView) objArr[4], (FaceWaterMarkView) objArr[5]);
        this.H = -1L;
        this.D.setTag(null);
        o0(view);
        H();
    }

    public void A0(FaceTabListViewModel faceTabListViewModel) {
        this.G = faceTabListViewModel;
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean F() {
        synchronized (this) {
            try {
                return this.H != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void H() {
        synchronized (this) {
            this.H = 2L;
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
            this.H = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean q0(int i, Object obj) {
        if (tv1.d != i) {
            return false;
        }
        A0((FaceTabListViewModel) obj);
        return true;
    }

    public gka(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 6, I, J));
    }
}
