package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.core.widget.NestedScrollView;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.health.sleep.rhythm.rhythm.SleepRhythmDetailDiaryListView;
import com.xiaomi.fitness.health.sleep.rhythm.rhythm.SleepRhythmDetailDiaryView;
import com.xiaomi.fitness.widget.RightArrowSingleLineTextView;

/* JADX INFO: loaded from: classes9.dex */
public class vvb extends uvb {
    public static final ViewDataBinding.i d0 = null;
    public static final SparseIntArray e0;
    public final LinearLayout a0;
    public final LinearLayoutCompat b0;
    public long c0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        e0 = sparseIntArray;
        sparseIntArray.put(eri.G6, 7);
        sparseIntArray.put(eri.jg, 8);
        sparseIntArray.put(eri.If, 9);
        sparseIntArray.put(eri.c6, 10);
        sparseIntArray.put(eri.Ef, 11);
        sparseIntArray.put(eri.C6, 12);
        sparseIntArray.put(eri.D6, 13);
        sparseIntArray.put(eri.E6, 14);
        sparseIntArray.put(eri.F6, 15);
        sparseIntArray.put(eri.Q3, 16);
        sparseIntArray.put(eri.A6, 17);
        sparseIntArray.put(eri.common_divider_line, 18);
        sparseIntArray.put(eri.G1, 19);
        sparseIntArray.put(eri.y6, 20);
        sparseIntArray.put(eri.z6, 21);
        sparseIntArray.put(eri.P3, 22);
        sparseIntArray.put(eri.yg, 23);
        sparseIntArray.put(eri.ug, 24);
        sparseIntArray.put(eri.Hf, 25);
        sparseIntArray.put(eri.long_sleep_divider_line, 26);
        sparseIntArray.put(eri.Gf, 27);
    }

    public vvb(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 0, (LinearLayoutCompat) objArr[2], (RecyclerView) objArr[19], (View) objArr[18], (View) objArr[22], (RightArrowSingleLineTextView) objArr[16], (View) objArr[10], (ImageView) objArr[20], (LinearLayoutCompat) objArr[3], (ImageView) objArr[21], (RightArrowSingleLineTextView) objArr[17], (View) objArr[12], (View) objArr[13], (View) objArr[14], (View) objArr[15], (View) objArr[7], (View) objArr[26], (LinearLayout) objArr[6], (NestedScrollView) objArr[0], (View) objArr[11], (LinearLayoutCompat) objArr[5], (RecyclerView) objArr[27], (RightArrowSingleLineTextView) objArr[25], (View) objArr[9], (View) objArr[8], (SleepRhythmDetailDiaryListView) objArr[24], (SleepRhythmDetailDiaryView) objArr[23]);
        this.c0 = -1L;
        this.A.setTag(null);
        this.H.setTag(null);
        LinearLayout linearLayout = (LinearLayout) objArr[1];
        this.a0 = linearLayout;
        linearLayout.setTag(null);
        LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) objArr[4];
        this.b0 = linearLayoutCompat;
        linearLayoutCompat.setTag(null);
        this.Q.setTag(null);
        this.R.setTag(null);
        this.T.setTag(null);
        o0(view);
        H();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean F() {
        synchronized (this) {
            try {
                return this.c0 != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void H() {
        synchronized (this) {
            this.c0 = 1L;
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
            this.c0 = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean q0(int i, Object obj) {
        return true;
    }

    public vvb(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 28, d0, e0));
    }
}
