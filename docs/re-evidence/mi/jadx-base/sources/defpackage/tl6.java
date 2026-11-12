package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.devicesettings.bluttooth.music.MusicSettingsViewModel;
import miuix.androidbasewidget.widget.ProgressBar;

/* JADX INFO: loaded from: classes8.dex */
public class tl6 extends sl6 {
    public static final ViewDataBinding.i d0 = null;
    public static final SparseIntArray e0;
    public final ConstraintLayout b0;
    public long c0;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        e0 = sparseIntArray;
        sparseIntArray.put(zqi.Y9, 1);
        sparseIntArray.put(zqi.K, 2);
        sparseIntArray.put(zqi.Z9, 3);
        sparseIntArray.put(zqi.z5, 4);
        sparseIntArray.put(zqi.A5, 5);
        sparseIntArray.put(zqi.I5, 6);
        sparseIntArray.put(zqi.r3, 7);
        sparseIntArray.put(zqi.i1, 8);
        sparseIntArray.put(zqi.n1, 9);
        sparseIntArray.put(zqi.Y4, 10);
        sparseIntArray.put(zqi.Q1, 11);
        sparseIntArray.put(zqi.X4, 12);
        sparseIntArray.put(zqi.y5, 13);
        sparseIntArray.put(zqi.Q6, 14);
        sparseIntArray.put(zqi.P6, 15);
        sparseIntArray.put(zqi.O6, 16);
        sparseIntArray.put(zqi.N6, 17);
        sparseIntArray.put(zqi.J6, 18);
        sparseIntArray.put(zqi.h0, 19);
        sparseIntArray.put(zqi.V0, 20);
        sparseIntArray.put(zqi.K1, 21);
        sparseIntArray.put(zqi.t8, 22);
        sparseIntArray.put(zqi.J1, 23);
        sparseIntArray.put(zqi.w8, 24);
        sparseIntArray.put(zqi.P2, 25);
        sparseIntArray.put(zqi.C3, 26);
    }

    public tl6(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 0, (AppCompatImageButton) objArr[2], (TextView) objArr[19], (LinearLayoutCompat) objArr[20], (AppCompatImageView) objArr[9], (AppCompatTextView) objArr[23], (AppCompatTextView) objArr[21], (AppCompatTextView) objArr[11], (ConstraintLayout) objArr[8], (ConstraintLayout) objArr[25], (CardView) objArr[7], (AppCompatImageView) objArr[26], (ProgressBar) objArr[12], (AppCompatTextView) objArr[10], (RelativeLayout) objArr[13], (AppCompatImageButton) objArr[4], (AppCompatImageButton) objArr[5], (NestedScrollView) objArr[6], (TextView) objArr[18], (TextView) objArr[17], (ProgressBar) objArr[16], (AppCompatTextView) objArr[15], (AppCompatTextView) objArr[14], (RecyclerView) objArr[22], (RecyclerView) objArr[24], (Toolbar) objArr[1], (TextView) objArr[3]);
        this.c0 = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.b0 = constraintLayout;
        constraintLayout.setTag(null);
        o0(view);
        H();
    }

    public void A0(MusicSettingsViewModel musicSettingsViewModel) {
        this.a0 = musicSettingsViewModel;
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
            this.c0 = 2L;
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
        if (bw1.f != i) {
            return false;
        }
        A0((MusicSettingsViewModel) obj);
        return true;
    }

    public tl6(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 27, d0, e0));
    }
}
