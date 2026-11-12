package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.sport.bean.LaunchViewBean;
import com.xiaomi.fitness.sport.view.widget.GpsSignalView;
import com.xiaomi.fitness.sport.view.widget.SportMusicView;

/* JADX INFO: loaded from: classes10.dex */
public abstract class nuq extends ViewDataBinding {
    public final TextView A;
    public final TextView B;
    public final RecyclerView C;
    public final ConstraintLayout D;
    public final ConstraintLayout E;
    public final CardView F;
    public final ImageView G;
    public final CardView H;
    public final View I;
    public final ImageView J;
    public final GpsSignalView K;
    public final quq L;
    public final suq M;
    public final FrameLayout N;
    public final FrameLayout O;
    public final View P;
    public final SportMusicView Q;
    public final ImageView R;
    public LaunchViewBean S;
    public View.OnClickListener T;

    public nuq(Object obj, View view, int i, TextView textView, TextView textView2, RecyclerView recyclerView, ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, CardView cardView, ImageView imageView, CardView cardView2, View view2, ImageView imageView2, GpsSignalView gpsSignalView, quq quqVar, suq suqVar, FrameLayout frameLayout, FrameLayout frameLayout2, View view3, SportMusicView sportMusicView, ImageView imageView3) {
        super(obj, view, i);
        this.A = textView;
        this.B = textView2;
        this.C = recyclerView;
        this.D = constraintLayout;
        this.E = constraintLayout2;
        this.F = cardView;
        this.G = imageView;
        this.H = cardView2;
        this.I = view2;
        this.J = imageView2;
        this.K = gpsSignalView;
        this.L = quqVar;
        this.M = suqVar;
        this.N = frameLayout;
        this.O = frameLayout2;
        this.P = view3;
        this.Q = sportMusicView;
        this.R = imageView3;
    }

    public LaunchViewBean A0() {
        return this.S;
    }

    public abstract void B0(LaunchViewBean launchViewBean);

    public abstract void setClick(View.OnClickListener onClickListener);
}
