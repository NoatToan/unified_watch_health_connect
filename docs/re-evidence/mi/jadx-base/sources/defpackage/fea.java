package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import com.mi.health.data.sportmodel.view.SportPathMapView;
import com.xiaomi.fitness.detail.view.FixMapDragLayout;
import com.xiaomi.fitness.detail.view.MapScrollView;
import com.xiaomi.fitness.detail.view.SportRecordBasicInfoView;
import com.xiaomi.fitness.detail.view.SportShareBottomView;
import com.xiaomi.fitness.detail.view.SportShareLongView;
import com.xiaomi.fitness.share.view.ShareLogoContainer;

/* JADX INFO: loaded from: classes10.dex */
public abstract class fea extends ViewDataBinding {
    public final View A;
    public final FrameLayout B;
    public final LinearLayout C;
    public final AppCompatImageView D;
    public final TextView E;
    public final FixMapDragLayout F;
    public final AppCompatImageView G;
    public final ImageView H;
    public final ImageView I;
    public final ImageView J;
    public final ImageView K;
    public final ImageView L;
    public final MapScrollView M;
    public final View N;
    public final ConstraintLayout O;
    public final ConstraintLayout P;
    public final LinearLayout Q;
    public final SportShareBottomView R;
    public final ShareLogoContainer S;
    public final AppCompatImageView T;
    public final SportPathMapView U;
    public final SportRecordBasicInfoView V;
    public final AppCompatImageView W;
    public final SportShareLongView X;
    public final TextView Y;
    public final LinearLayout Z;
    public final AppCompatTextView a0;
    public final AppCompatTextView b0;
    public final TextView c0;
    public final View d0;

    public fea(Object obj, View view, int i, View view2, FrameLayout frameLayout, LinearLayout linearLayout, AppCompatImageView appCompatImageView, TextView textView, FixMapDragLayout fixMapDragLayout, AppCompatImageView appCompatImageView2, ImageView imageView, ImageView imageView2, ImageView imageView3, ImageView imageView4, ImageView imageView5, MapScrollView mapScrollView, View view3, ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, LinearLayout linearLayout2, SportShareBottomView sportShareBottomView, ShareLogoContainer shareLogoContainer, AppCompatImageView appCompatImageView3, SportPathMapView sportPathMapView, SportRecordBasicInfoView sportRecordBasicInfoView, AppCompatImageView appCompatImageView4, SportShareLongView sportShareLongView, TextView textView2, LinearLayout linearLayout3, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2, TextView textView3, View view4) {
        super(obj, view, i);
        this.A = view2;
        this.B = frameLayout;
        this.C = linearLayout;
        this.D = appCompatImageView;
        this.E = textView;
        this.F = fixMapDragLayout;
        this.G = appCompatImageView2;
        this.H = imageView;
        this.I = imageView2;
        this.J = imageView3;
        this.K = imageView4;
        this.L = imageView5;
        this.M = mapScrollView;
        this.N = view3;
        this.O = constraintLayout;
        this.P = constraintLayout2;
        this.Q = linearLayout2;
        this.R = sportShareBottomView;
        this.S = shareLogoContainer;
        this.T = appCompatImageView3;
        this.U = sportPathMapView;
        this.V = sportRecordBasicInfoView;
        this.W = appCompatImageView4;
        this.X = sportShareLongView;
        this.Y = textView2;
        this.Z = linearLayout3;
        this.a0 = appCompatTextView;
        this.b0 = appCompatTextView2;
        this.c0 = textView3;
        this.d0 = view4;
    }

    public static fea A0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return B0(layoutInflater, viewGroup, z, sk5.i());
    }

    @Deprecated
    public static fea B0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (fea) ViewDataBinding.G(layoutInflater, ivi.z, viewGroup, z, obj);
    }
}
