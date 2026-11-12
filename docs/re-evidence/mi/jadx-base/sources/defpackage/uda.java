package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import androidx.viewpager2.widget.ViewPager2;
import com.xiaomi.fitness.detail.view.MapScrollView;
import com.xiaomi.fitness.detail.view.SportRecordBasicInfoView;
import com.xiaomi.fitness.detail.view.SportShareBottomView;
import com.xiaomi.fitness.detail.view.SportShareLongView;
import com.xiaomi.fitness.share.view.ShareLogoContainer;

/* JADX INFO: loaded from: classes10.dex */
public abstract class uda extends ViewDataBinding {
    public final FrameLayout A;
    public final ViewPager2 B;
    public final ImageView C;
    public final ImageView D;
    public final ImageView E;
    public final MapScrollView F;
    public final View G;
    public final ConstraintLayout H;
    public final LinearLayout I;
    public final LinearLayoutCompat J;
    public final SportShareBottomView K;
    public final ShareLogoContainer L;
    public final SportRecordBasicInfoView M;
    public final SportShareLongView N;
    public final TextView O;
    public final TextView P;
    public final TextView Q;

    public uda(Object obj, View view, int i, FrameLayout frameLayout, ViewPager2 viewPager2, ImageView imageView, ImageView imageView2, ImageView imageView3, MapScrollView mapScrollView, View view2, ConstraintLayout constraintLayout, LinearLayout linearLayout, LinearLayoutCompat linearLayoutCompat, SportShareBottomView sportShareBottomView, ShareLogoContainer shareLogoContainer, SportRecordBasicInfoView sportRecordBasicInfoView, SportShareLongView sportShareLongView, TextView textView, TextView textView2, TextView textView3) {
        super(obj, view, i);
        this.A = frameLayout;
        this.B = viewPager2;
        this.C = imageView;
        this.D = imageView2;
        this.E = imageView3;
        this.F = mapScrollView;
        this.G = view2;
        this.H = constraintLayout;
        this.I = linearLayout;
        this.J = linearLayoutCompat;
        this.K = sportShareBottomView;
        this.L = shareLogoContainer;
        this.M = sportRecordBasicInfoView;
        this.N = sportShareLongView;
        this.O = textView;
        this.P = textView2;
        this.Q = textView3;
    }

    public static uda A0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return B0(layoutInflater, viewGroup, z, sk5.i());
    }

    @Deprecated
    public static uda B0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (uda) ViewDataBinding.G(layoutInflater, ivi.u, viewGroup, z, obj);
    }
}
