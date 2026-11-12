package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.devicesettings.bluttooth.music.MusicSettingsViewModel;

/* JADX INFO: loaded from: classes8.dex */
public class bm6 extends am6 {
    public static final ViewDataBinding.i L = null;
    public static final SparseIntArray M;
    public final ConstraintLayout J;
    public long K;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        M = sparseIntArray;
        sparseIntArray.put(zqi.Y9, 1);
        sparseIntArray.put(zqi.K, 2);
        sparseIntArray.put(zqi.Z9, 3);
        sparseIntArray.put(zqi.c5, 4);
        sparseIntArray.put(zqi.a5, 5);
        sparseIntArray.put(zqi.B8, 6);
        sparseIntArray.put(zqi.P2, 7);
        sparseIntArray.put(zqi.C3, 8);
    }

    public bm6(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 0, (AppCompatImageButton) objArr[2], (ConstraintLayout) objArr[7], (AppCompatImageView) objArr[8], (AppCompatImageButton) objArr[5], (AppCompatImageButton) objArr[4], (RecyclerView) objArr[6], (Toolbar) objArr[1], (TextView) objArr[3]);
        this.K = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.J = constraintLayout;
        constraintLayout.setTag(null);
        o0(view);
        H();
    }

    public void A0(MusicSettingsViewModel musicSettingsViewModel) {
        this.I = musicSettingsViewModel;
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean F() {
        synchronized (this) {
            try {
                return this.K != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public void H() {
        synchronized (this) {
            this.K = 2L;
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
            this.K = 0L;
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

    public bm6(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 9, L, M));
    }
}
