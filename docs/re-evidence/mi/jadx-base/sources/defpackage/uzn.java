package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.amap.api.maps.MapView;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.divider.MaterialDivider;
import com.mi.health.sport.TrackShareRoutineView;

/* JADX INFO: loaded from: classes10.dex */
public abstract class uzn extends ViewDataBinding {
    public final ConstraintLayout A;
    public final AppBarLayout B;
    public final ConstraintLayout C;
    public final ConstraintLayout D;
    public final RelativeLayout E;
    public final ImageView F;
    public final CardView G;
    public final ImageView H;
    public final ImageView I;
    public final MapView J;
    public final MaterialDivider K;
    public final LinearLayout L;
    public final ConstraintLayout M;
    public final AppCompatTextView N;
    public final azk O;
    public final ozn P;
    public final yzn Q;
    public final TrackShareRoutineView R;
    public final TextView S;
    public final RelativeLayout T;
    public final szn U;

    public uzn(Object obj, View view, int i, ConstraintLayout constraintLayout, AppBarLayout appBarLayout, ConstraintLayout constraintLayout2, ConstraintLayout constraintLayout3, RelativeLayout relativeLayout, ImageView imageView, CardView cardView, ImageView imageView2, ImageView imageView3, MapView mapView, MaterialDivider materialDivider, LinearLayout linearLayout, ConstraintLayout constraintLayout4, AppCompatTextView appCompatTextView, azk azkVar, ozn oznVar, yzn yznVar, TrackShareRoutineView trackShareRoutineView, TextView textView, RelativeLayout relativeLayout2, szn sznVar) {
        super(obj, view, i);
        this.A = constraintLayout;
        this.B = appBarLayout;
        this.C = constraintLayout2;
        this.D = constraintLayout3;
        this.E = relativeLayout;
        this.F = imageView;
        this.G = cardView;
        this.H = imageView2;
        this.I = imageView3;
        this.J = mapView;
        this.K = materialDivider;
        this.L = linearLayout;
        this.M = constraintLayout4;
        this.N = appCompatTextView;
        this.O = azkVar;
        this.P = oznVar;
        this.Q = yznVar;
        this.R = trackShareRoutineView;
        this.S = textView;
        this.T = relativeLayout2;
        this.U = sznVar;
    }
}
