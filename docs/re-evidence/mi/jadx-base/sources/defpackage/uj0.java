package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.databinding.ViewDataBinding;
import com.github.chrisbanes.photoview.PhotoView;
import com.xiaomi.fitness.electronic.scale.widget.BodyCompositionAnalysisView;
import com.xiaomi.fitness.electronic.scale.widget.BodyIndexScoreView;
import com.xiaomi.fitness.electronic.scale.widget.EvaluationIndexView;
import com.xiaomi.fitness.electronic.scale.widget.FatAnalysisView;
import com.xiaomi.fitness.electronic.scale.widget.SkeletalMuscleAnalysisView;

/* JADX INFO: loaded from: classes8.dex */
public class uj0 extends tj0 {
    public static final ViewDataBinding.i a0 = null;
    public static final SparseIntArray b0;
    public final ConstraintLayout Y;
    public long Z;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        b0 = sparseIntArray;
        sparseIntArray.put(bri.I6, 3);
        sparseIntArray.put(bri.w, 4);
        sparseIntArray.put(bri.o5, 5);
        sparseIntArray.put(bri.Z1, 6);
        sparseIntArray.put(bri.Q4, 7);
        sparseIntArray.put(bri.v5, 8);
        sparseIntArray.put(bri.a4, 9);
        sparseIntArray.put(bri.H4, 10);
        sparseIntArray.put(bri.X4, 11);
        sparseIntArray.put(bri.r6, 12);
        sparseIntArray.put(bri.y0, 13);
        sparseIntArray.put(bri.p6, 14);
        sparseIntArray.put(bri.y6, 15);
        sparseIntArray.put(bri.z6, 16);
        sparseIntArray.put(bri.L6, 17);
        sparseIntArray.put(bri.E5, 18);
        sparseIntArray.put(bri.r1, 19);
        sparseIntArray.put(bri.C5, 20);
        sparseIntArray.put(bri.s1, 21);
        sparseIntArray.put(bri.S2, 22);
        sparseIntArray.put(bri.u6, 23);
    }

    public uj0(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 0, (ConstraintLayout) objArr[4], (Guideline) objArr[13], (ImageView) objArr[1], (ImageView) objArr[19], (ImageView) objArr[21], (LinearLayout) objArr[6], (PhotoView) objArr[22], (TextView) objArr[9], (TextView) objArr[2], (TextView) objArr[10], (TextView) objArr[7], (TextView) objArr[11], (TextView) objArr[5], (TextView) objArr[8], (TextView) objArr[20], (TextView) objArr[18], (BodyCompositionAnalysisView) objArr[14], (BodyIndexScoreView) objArr[12], (LinearLayout) objArr[23], (EvaluationIndexView) objArr[15], (FatAnalysisView) objArr[16], (ConstraintLayout) objArr[3], (SkeletalMuscleAnalysisView) objArr[17]);
        this.Z = -1L;
        this.C.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.Y = constraintLayout;
        constraintLayout.setTag(null);
        this.I.setTag(null);
        o0(view);
        H();
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean F() {
        synchronized (this) {
            try {
                return this.Z != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void H() {
        synchronized (this) {
            this.Z = 2L;
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
            j = this.Z;
            this.Z = 0L;
        }
        View.OnClickListener onClickListener = this.X;
        if ((j & 3) != 0) {
            this.C.setOnClickListener(onClickListener);
            this.I.setOnClickListener(onClickListener);
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

    @Override // defpackage.tj0
    public void setOnClick(View.OnClickListener onClickListener) {
        this.X = onClickListener;
        synchronized (this) {
            this.Z |= 1;
        }
        notifyPropertyChanged(av1.f3480b);
        super.e0();
    }

    public uj0(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 24, a0, b0));
    }
}
