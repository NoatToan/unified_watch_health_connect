package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.mi.health.sport.SportLaunchMapView;
import com.xiaomi.fitness.sport.view.widget.GpsSignalView;

/* JADX INFO: loaded from: classes10.dex */
public abstract class vl0 extends ViewDataBinding {
    public final TextView A;
    public final RecyclerView B;
    public final ConstraintLayout C;
    public final ConstraintLayout D;
    public final RecyclerView E;
    public final ConstraintLayout F;
    public final RelativeLayout G;
    public final GpsSignalView H;
    public final TextView I;
    public final AppCompatImageView J;
    public final SportLaunchMapView K;
    public final CardView L;
    public final AppCompatTextView M;
    public final ImageView N;
    public final TextView O;
    public final ConstraintLayout P;
    public final TextView Q;
    public final TextView R;
    public final TextView S;
    public final ImageView T;

    public vl0(Object obj, View view, int i, TextView textView, RecyclerView recyclerView, ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, RecyclerView recyclerView2, ConstraintLayout constraintLayout3, RelativeLayout relativeLayout, GpsSignalView gpsSignalView, TextView textView2, AppCompatImageView appCompatImageView, SportLaunchMapView sportLaunchMapView, CardView cardView, AppCompatTextView appCompatTextView, ImageView imageView, TextView textView3, ConstraintLayout constraintLayout4, TextView textView4, TextView textView5, TextView textView6, ImageView imageView2) {
        super(obj, view, i);
        this.A = textView;
        this.B = recyclerView;
        this.C = constraintLayout;
        this.D = constraintLayout2;
        this.E = recyclerView2;
        this.F = constraintLayout3;
        this.G = relativeLayout;
        this.H = gpsSignalView;
        this.I = textView2;
        this.J = appCompatImageView;
        this.K = sportLaunchMapView;
        this.L = cardView;
        this.M = appCompatTextView;
        this.N = imageView;
        this.O = textView3;
        this.P = constraintLayout4;
        this.Q = textView4;
        this.R = textView5;
        this.S = textView6;
        this.T = imageView2;
    }
}
