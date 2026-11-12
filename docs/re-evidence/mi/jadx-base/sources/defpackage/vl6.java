package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatCheckedTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.devicesettings.bluttooth.music.data.AddSong;

/* JADX INFO: loaded from: classes8.dex */
public class vl6 extends ul6 {
    public static final ViewDataBinding.i G = null;
    public static final SparseIntArray H;
    public final ConstraintLayout E;
    public long F;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        H = sparseIntArray;
        sparseIntArray.put(zqi.s8, 2);
        sparseIntArray.put(zqi.x8, 3);
    }

    public vl6(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 0, (TextView) objArr[2], (TextView) objArr[1], (AppCompatCheckedTextView) objArr[3]);
        this.F = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.E = constraintLayout;
        constraintLayout.setTag(null);
        this.B.setTag(null);
        o0(view);
        H();
    }

    @Override // defpackage.ul6
    public void C0(AddSong addSong) {
        this.D = addSong;
        synchronized (this) {
            this.F |= 1;
        }
        notifyPropertyChanged(bw1.d);
        super.e0();
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
        long j;
        synchronized (this) {
            j = this.F;
            this.F = 0L;
        }
        AddSong addSong = this.D;
        long j2 = j & 3;
        String str = null;
        if (j2 != 0) {
            clf song = addSong != null ? addSong.getSong() : null;
            if (song != null) {
                str = song.d;
            }
        }
        if (j2 != 0) {
            r8p.b(this.B, str);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean q0(int i, Object obj) {
        if (bw1.d != i) {
            return false;
        }
        C0((AddSong) obj);
        return true;
    }

    public vl6(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 4, G, H));
    }
}
