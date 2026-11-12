package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;
import com.mi.health.data.sportmodel.view.SportPathMapView;
import com.xiaomi.fitness.detail.view.FixMapDragLayout;
import com.xiaomi.fitness.detail.view.MapScrollView;
import com.xiaomi.fitness.detail.view.SportRecordBasicInfoView;
import com.xiaomi.fitness.detail.view.SportShareBottomView;
import com.xiaomi.fitness.detail.view.SportShareLongView;
import com.xiaomi.fitness.share.view.ShareLogoContainer;

/* JADX INFO: loaded from: classes10.dex */
public abstract class aha extends ViewDataBinding {
    public final View A;
    public final View B;
    public final FixMapDragLayout C;
    public final AppCompatImageView D;
    public final ImageView E;
    public final ImageView F;
    public final ImageView G;
    public final ImageView H;
    public final ImageView I;
    public final TabLayout J;
    public final MapScrollView K;
    public final View L;
    public final ConstraintLayout M;
    public final ConstraintLayout N;
    public final LinearLayout O;
    public final RecyclerView P;
    public final SportShareBottomView Q;
    public final ShareLogoContainer R;
    public final AppCompatImageView S;
    public final SportPathMapView T;
    public final SportRecordBasicInfoView U;
    public final AppCompatImageView V;
    public final SportShareLongView W;
    public final TextView X;
    public final LinearLayout Y;
    public final AppCompatTextView Z;
    public final AppCompatTextView a0;
    public final TextView b0;
    public final ViewPager2 c0;

    public aha(Object obj, View view, int i, View view2, View view3, FixMapDragLayout fixMapDragLayout, AppCompatImageView appCompatImageView, ImageView imageView, ImageView imageView2, ImageView imageView3, ImageView imageView4, ImageView imageView5, TabLayout tabLayout, MapScrollView mapScrollView, View view4, ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, LinearLayout linearLayout, RecyclerView recyclerView, SportShareBottomView sportShareBottomView, ShareLogoContainer shareLogoContainer, AppCompatImageView appCompatImageView2, SportPathMapView sportPathMapView, SportRecordBasicInfoView sportRecordBasicInfoView, AppCompatImageView appCompatImageView3, SportShareLongView sportShareLongView, TextView textView, LinearLayout linearLayout2, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2, TextView textView2, ViewPager2 viewPager2) {
        super(obj, view, i);
        this.A = view2;
        this.B = view3;
        this.C = fixMapDragLayout;
        this.D = appCompatImageView;
        this.E = imageView;
        this.F = imageView2;
        this.G = imageView3;
        this.H = imageView4;
        this.I = imageView5;
        this.J = tabLayout;
        this.K = mapScrollView;
        this.L = view4;
        this.M = constraintLayout;
        this.N = constraintLayout2;
        this.O = linearLayout;
        this.P = recyclerView;
        this.Q = sportShareBottomView;
        this.R = shareLogoContainer;
        this.S = appCompatImageView2;
        this.T = sportPathMapView;
        this.U = sportRecordBasicInfoView;
        this.V = appCompatImageView3;
        this.W = sportShareLongView;
        this.X = textView;
        this.Y = linearLayout2;
        this.Z = appCompatTextView;
        this.a0 = appCompatTextView2;
        this.b0 = textView2;
        this.c0 = viewPager2;
    }

    public static aha A0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return B0(layoutInflater, viewGroup, z, sk5.i());
    }

    @Deprecated
    public static aha B0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (aha) ViewDataBinding.G(layoutInflater, ivi.c0, viewGroup, z, obj);
    }
}
