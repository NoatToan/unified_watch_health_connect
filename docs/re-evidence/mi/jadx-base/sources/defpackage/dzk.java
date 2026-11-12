package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.baseui.recyclerview.MoreRecyclerView;
import com.xiaomi.fitness.route.track.view.MyTrackLibraryViewPagerDelegate;
import com.xiaomi.fitness.route.track.viewmodel.MyTrackLibraryVM;

/* JADX INFO: loaded from: classes8.dex */
public class dzk extends czk {
    public static final ViewDataBinding.i F = null;
    public static final SparseIntArray G;
    public final MyTrackLibraryViewPagerDelegate D;
    public long E;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        G = sparseIntArray;
        sparseIntArray.put(vri.z, 1);
        sparseIntArray.put(vri.G, 2);
    }

    public dzk(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 0, (View) objArr[1], (MoreRecyclerView) objArr[2]);
        this.E = -1L;
        MyTrackLibraryViewPagerDelegate myTrackLibraryViewPagerDelegate = (MyTrackLibraryViewPagerDelegate) objArr[0];
        this.D = myTrackLibraryViewPagerDelegate;
        myTrackLibraryViewPagerDelegate.setTag(null);
        o0(view);
        H();
    }

    public void A0(MyTrackLibraryVM myTrackLibraryVM) {
        this.C = myTrackLibraryVM;
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean F() {
        synchronized (this) {
            try {
                return this.E != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void H() {
        synchronized (this) {
            this.E = 2L;
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
            this.E = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean q0(int i, Object obj) {
        if (mv1.c != i) {
            return false;
        }
        A0((MyTrackLibraryVM) obj);
        return true;
    }

    public dzk(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 3, F, G));
    }
}
