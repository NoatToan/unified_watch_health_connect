package defpackage;

import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.databinding.ViewDataBinding;
import com.mi.health.sport.TrackMapView;
import com.mi.health.sport.TrackShareRoutineView;
import com.xiaomi.fitness.baseui.widget.SportDetailItemView;
import com.xiaomi.fitness.chart.mpchart.linechart.CustomLineChart;
import com.xiaomi.fitness.route.track.ext.Report;
import com.xiaomi.fitness.widget.view.DataTitleSimpleView;

/* JADX INFO: loaded from: classes8.dex */
public abstract class d3g extends ViewDataBinding {
    public final ImageView A;
    public final CustomLineChart B;
    public final FrameLayout C;
    public final LinearLayout D;
    public final DataTitleSimpleView E;
    public final SportDetailItemView F;
    public final SportDetailItemView G;
    public final TextView H;
    public final ImageView I;
    public final LinearLayout J;
    public final NestedScrollView K;
    public final ImageView L;
    public final o2g M;
    public final Button N;
    public final f3g O;
    public final TrackShareRoutineView P;
    public final ConstraintLayout Q;
    public final TextView R;
    public final TextView S;
    public final TextView T;
    public final ImageView U;
    public final TextView V;
    public final TextView W;
    public final ImageView X;
    public final TextView Y;
    public final TextView Z;
    public final ImageView a0;
    public final TextView b0;
    public final TextView c0;
    public final ImageView d0;
    public final TextView e0;
    public final TrackMapView f0;
    public final TextView g0;
    public Report h0;

    public d3g(Object obj, View view, int i, ImageView imageView, CustomLineChart customLineChart, FrameLayout frameLayout, LinearLayout linearLayout, DataTitleSimpleView dataTitleSimpleView, SportDetailItemView sportDetailItemView, SportDetailItemView sportDetailItemView2, TextView textView, ImageView imageView2, LinearLayout linearLayout2, NestedScrollView nestedScrollView, ImageView imageView3, o2g o2gVar, Button button, f3g f3gVar, TrackShareRoutineView trackShareRoutineView, ConstraintLayout constraintLayout, TextView textView2, TextView textView3, TextView textView4, ImageView imageView4, TextView textView5, TextView textView6, ImageView imageView5, TextView textView7, TextView textView8, ImageView imageView6, TextView textView9, TextView textView10, ImageView imageView7, TextView textView11, TrackMapView trackMapView, TextView textView12) {
        super(obj, view, i);
        this.A = imageView;
        this.B = customLineChart;
        this.C = frameLayout;
        this.D = linearLayout;
        this.E = dataTitleSimpleView;
        this.F = sportDetailItemView;
        this.G = sportDetailItemView2;
        this.H = textView;
        this.I = imageView2;
        this.J = linearLayout2;
        this.K = nestedScrollView;
        this.L = imageView3;
        this.M = o2gVar;
        this.N = button;
        this.O = f3gVar;
        this.P = trackShareRoutineView;
        this.Q = constraintLayout;
        this.R = textView2;
        this.S = textView3;
        this.T = textView4;
        this.U = imageView4;
        this.V = textView5;
        this.W = textView6;
        this.X = imageView5;
        this.Y = textView7;
        this.Z = textView8;
        this.a0 = imageView6;
        this.b0 = textView9;
        this.c0 = textView10;
        this.d0 = imageView7;
        this.e0 = textView11;
        this.f0 = trackMapView;
        this.g0 = textView12;
    }

    public abstract void A0(Report report);
}
