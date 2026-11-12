package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatCheckedTextView;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.devicesettings.bluttooth.music.MusicSettingsViewModel;
import com.xiaomi.fitness.widget.view.DividerView;

/* JADX INFO: loaded from: classes8.dex */
public class rl6 extends ql6 {
    public static final ViewDataBinding.i P = null;
    public static final SparseIntArray Q;
    public final ConstraintLayout N;
    public long O;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        Q = sparseIntArray;
        sparseIntArray.put(zqi.Y9, 1);
        sparseIntArray.put(zqi.K, 2);
        sparseIntArray.put(zqi.Z9, 3);
        sparseIntArray.put(zqi.b5, 4);
        sparseIntArray.put(zqi.U7, 5);
        sparseIntArray.put(zqi.I1, 6);
        sparseIntArray.put(zqi.A8, 7);
        sparseIntArray.put(zqi.S7, 8);
        sparseIntArray.put(zqi.j2, 9);
        sparseIntArray.put(zqi.B8, 10);
        sparseIntArray.put(zqi.P2, 11);
        sparseIntArray.put(zqi.C3, 12);
    }

    public rl6(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 0, (AppCompatImageButton) objArr[2], (TextView) objArr[6], (DividerView) objArr[9], (ConstraintLayout) objArr[11], (AppCompatImageView) objArr[12], (AppCompatImageButton) objArr[4], (AppCompatCheckedTextView) objArr[8], (ConstraintLayout) objArr[5], (TextView) objArr[7], (RecyclerView) objArr[10], (Toolbar) objArr[1], (TextView) objArr[3]);
        this.O = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.N = constraintLayout;
        constraintLayout.setTag(null);
        o0(view);
        H();
    }

    public void A0(MusicSettingsViewModel musicSettingsViewModel) {
        this.M = musicSettingsViewModel;
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean F() {
        synchronized (this) {
            try {
                return this.O != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void H() {
        synchronized (this) {
            this.O = 2L;
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
            this.O = 0L;
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean q0(int i, Object obj) {
        if (bw1.f != i) {
            return false;
        }
        A0((MusicSettingsViewModel) obj);
        return true;
    }

    public rl6(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 13, P, Q));
    }
}
