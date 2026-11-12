package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatCheckedTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.devicesettings.bluttooth.music.data.AddSongList;

/* JADX INFO: loaded from: classes8.dex */
public class qd6 extends pd6 {
    public static final ViewDataBinding.i F = null;
    public static final SparseIntArray G;
    public long E;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        G = sparseIntArray;
        sparseIntArray.put(zqi.u8, 2);
    }

    public qd6(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 0, (TextView) objArr[1], (AppCompatCheckedTextView) objArr[2], (ConstraintLayout) objArr[0]);
        this.E = -1L;
        this.A.setTag(null);
        this.C.setTag(null);
        o0(view);
        H();
    }

    @Override // defpackage.pd6
    public void C0(AddSongList addSongList) {
        this.D = addSongList;
        synchronized (this) {
            this.E |= 1;
        }
        notifyPropertyChanged(bw1.f4668b);
        super.e0();
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
        long j;
        synchronized (this) {
            j = this.E;
            this.E = 0L;
        }
        AddSongList addSongList = this.D;
        long j2 = j & 3;
        String str = null;
        if (j2 != 0) {
            elf songList = addSongList != null ? addSongList.getSongList() : null;
            if (songList != null) {
                str = songList.d;
            }
        }
        if (j2 != 0) {
            r8p.b(this.A, str);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean q0(int i, Object obj) {
        if (bw1.f4668b != i) {
            return false;
        }
        C0((AddSongList) obj);
        return true;
    }

    public qd6(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 3, F, G));
    }
}
