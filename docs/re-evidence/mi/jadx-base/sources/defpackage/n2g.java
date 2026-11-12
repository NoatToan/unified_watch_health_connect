package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.Button;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.LifecycleOwner;
import com.xiaomi.fitness.baseui.recyclerview.MoreRecyclerView;
import com.xiaomi.fitness.route.track.view.MyTrackLibraryViewPagerDelegate;

/* JADX INFO: loaded from: classes8.dex */
public class n2g extends m2g {
    public static final ViewDataBinding.i G;
    public static final SparseIntArray H;
    public final MyTrackLibraryViewPagerDelegate E;
    public long F;

    static {
        ViewDataBinding.i iVar = new ViewDataBinding.i(5);
        G = iVar;
        iVar.a(0, new String[]{"mine_track_no_data"}, new int[]{2}, new int[]{bvi.j});
        SparseIntArray sparseIntArray = new SparseIntArray();
        H = sparseIntArray;
        sparseIntArray.put(vri.E, 1);
        sparseIntArray.put(vri.G, 3);
        sparseIntArray.put(vri.p, 4);
    }

    public n2g(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 1, (Button) objArr[4], (j3g) objArr[2], (View) objArr[1], (MoreRecyclerView) objArr[3]);
        this.F = -1L;
        MyTrackLibraryViewPagerDelegate myTrackLibraryViewPagerDelegate = (MyTrackLibraryViewPagerDelegate) objArr[0];
        this.E = myTrackLibraryViewPagerDelegate;
        myTrackLibraryViewPagerDelegate.setTag(null);
        k0(this.B);
        o0(view);
        H();
    }

    public final boolean A0(j3g j3gVar, int i) {
        if (i != mv1.f27240a) {
            return false;
        }
        synchronized (this) {
            this.F |= 1;
        }
        return true;
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean F() {
        synchronized (this) {
            try {
                if (this.F != 0) {
                    return true;
                }
                return this.B.F();
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
        this.B.H();
        e0();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean W(int i, Object obj, int i2) {
        if (i != 0) {
            return false;
        }
        return A0((j3g) obj, i2);
    }

    @Override // androidx.databinding.ViewDataBinding
    public void l0(LifecycleOwner lifecycleOwner) {
        super.l0(lifecycleOwner);
        this.B.l0(lifecycleOwner);
    }

    @Override // androidx.databinding.ViewDataBinding
    public void o() {
        synchronized (this) {
            this.F = 0L;
        }
        ViewDataBinding.r(this.B);
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean q0(int i, Object obj) {
        return true;
    }

    public n2g(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 5, G, H));
    }
}
