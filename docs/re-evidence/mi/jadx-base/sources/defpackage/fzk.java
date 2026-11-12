package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.baseui.recyclerview.MoreRecyclerView;
import com.xiaomi.fitness.route.track.view.MyTrackLibraryViewPagerDelegate;
import com.xiaomi.fitness.route.track.viewmodel.MyTrackLibraryVM;

/* JADX INFO: loaded from: classes8.dex */
public class fzk extends ezk {
    public static final ViewDataBinding.i G = null;
    public static final SparseIntArray H;
    public final MyTrackLibraryViewPagerDelegate E;
    public long F;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        H = sparseIntArray;
        sparseIntArray.put(vri.z, 1);
        sparseIntArray.put(vri.G, 2);
        sparseIntArray.put(vri.g, 3);
    }

    public fzk(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 0, (TextView) objArr[3], (View) objArr[1], (MoreRecyclerView) objArr[2]);
        this.F = -1L;
        MyTrackLibraryViewPagerDelegate myTrackLibraryViewPagerDelegate = (MyTrackLibraryViewPagerDelegate) objArr[0];
        this.E = myTrackLibraryViewPagerDelegate;
        myTrackLibraryViewPagerDelegate.setTag(null);
        o0(view);
        H();
    }

    public void A0(MyTrackLibraryVM myTrackLibraryVM) {
        this.D = myTrackLibraryVM;
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
        if (mv1.c != i) {
            return false;
        }
        A0((MyTrackLibraryVM) obj);
        return true;
    }

    public fzk(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 4, G, H));
    }
}
