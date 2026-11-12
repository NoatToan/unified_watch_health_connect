package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.sport.view.justdance.JDViewBindingAdapter;
import com.xiaomi.fitness.sport.view.justdance.PlayerData;

/* JADX INFO: loaded from: classes10.dex */
public class lpn extends kpn {
    public static final ViewDataBinding.i L = null;
    public static final SparseIntArray M = null;
    public final ConstraintLayout I;
    public final View J;
    public long K;

    public lpn(rk5 rk5Var, View view, Object[] objArr) {
        super(rk5Var, view, 0, (TextView) objArr[3], (ImageView) objArr[1], (TextView) objArr[6], (TextView) objArr[7], (TextView) objArr[2], (TextView) objArr[5], (View) objArr[4]);
        this.K = -1L;
        this.A.setTag(null);
        this.B.setTag(null);
        this.C.setTag(null);
        this.D.setTag(null);
        ConstraintLayout constraintLayout = (ConstraintLayout) objArr[0];
        this.I = constraintLayout;
        constraintLayout.setTag(null);
        View view2 = (View) objArr[8];
        this.J = view2;
        view2.setTag(null);
        this.E.setTag(null);
        this.F.setTag(null);
        this.G.setTag(null);
        o0(view);
        H();
    }

    public void A0(PlayerData playerData) {
        this.H = playerData;
        synchronized (this) {
            this.K |= 1;
        }
        notifyPropertyChanged(nv1.j);
        super.e0();
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
        long j;
        String name;
        int colorInt;
        String score;
        String alias;
        String calories;
        String avatarImg;
        synchronized (this) {
            j = this.K;
            this.K = 0L;
        }
        PlayerData playerData = this.H;
        long j2 = j & 3;
        if (j2 == 0 || playerData == null) {
            name = null;
            colorInt = 0;
            score = null;
            alias = null;
            calories = null;
            avatarImg = null;
        } else {
            name = playerData.getName();
            score = playerData.getScore();
            alias = playerData.getAlias();
            colorInt = playerData.getColorInt();
            avatarImg = playerData.getAvatarImg();
            calories = playerData.getCalories();
        }
        if (j2 != 0) {
            r8p.b(this.A, alias);
            JDViewBindingAdapter.setIcon(this.B, avatarImg);
            JDViewBindingAdapter.setBackgroundColor(this.B, colorInt);
            r8p.b(this.C, calories);
            JDViewBindingAdapter.setTextViewColor(this.C, colorInt);
            JDViewBindingAdapter.setTextViewColor(this.D, colorInt);
            JDViewBindingAdapter.setTextPlurals(this.D, calories);
            JDViewBindingAdapter.setNoBackgroundColor(this.J, colorInt);
            r8p.b(this.E, name);
            JDViewBindingAdapter.setTextViewColor(this.E, colorInt);
            r8p.b(this.F, score);
            JDViewBindingAdapter.setTextViewColor(this.F, colorInt);
            JDViewBindingAdapter.setNoBackgroundColor(this.G, colorInt);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public boolean q0(int i, Object obj) {
        if (nv1.j != i) {
            return false;
        }
        A0((PlayerData) obj);
        return true;
    }

    public lpn(rk5 rk5Var, View view) {
        this(rk5Var, view, ViewDataBinding.P(rk5Var, view, 9, L, M));
    }
}
