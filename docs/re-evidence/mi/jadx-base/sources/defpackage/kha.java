package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.core.widget.NestedScrollView;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.xiaomi.fitness.health.threetarget.model.ThreeTargetView;
import com.xiaomi.fitness.health.threetarget.view.TargetItemChartView;
import com.xiaomi.fitness.health.threetarget.view.VideoPreviewView;
import com.xiaomi.fitness.widget.view.DataTitleSimpleView;

/* JADX INFO: loaded from: classes9.dex */
public abstract class kha extends ViewDataBinding {
    public final NestedScrollView A;
    public final AppCompatImageView B;
    public final TextView C;
    public final TargetItemChartView D;
    public final TargetItemChartView E;
    public final TargetItemChartView F;
    public final TargetItemChartView G;
    public final LinearLayout H;
    public final RecyclerView I;
    public final DataTitleSimpleView J;
    public final LinearLayout K;
    public final RecyclerView L;
    public final ImageView M;
    public final LinearLayout N;
    public final VideoPreviewView O;
    public final ThreeTargetView P;
    public final ViewPager2 Q;

    public kha(Object obj, View view, int i, NestedScrollView nestedScrollView, AppCompatImageView appCompatImageView, TextView textView, TargetItemChartView targetItemChartView, TargetItemChartView targetItemChartView2, TargetItemChartView targetItemChartView3, TargetItemChartView targetItemChartView4, LinearLayout linearLayout, RecyclerView recyclerView, DataTitleSimpleView dataTitleSimpleView, LinearLayout linearLayout2, RecyclerView recyclerView2, ImageView imageView, LinearLayout linearLayout3, VideoPreviewView videoPreviewView, ThreeTargetView threeTargetView, ViewPager2 viewPager2) {
        super(obj, view, i);
        this.A = nestedScrollView;
        this.B = appCompatImageView;
        this.C = textView;
        this.D = targetItemChartView;
        this.E = targetItemChartView2;
        this.F = targetItemChartView3;
        this.G = targetItemChartView4;
        this.H = linearLayout;
        this.I = recyclerView;
        this.J = dataTitleSimpleView;
        this.K = linearLayout2;
        this.L = recyclerView2;
        this.M = imageView;
        this.N = linearLayout3;
        this.O = videoPreviewView;
        this.P = threeTargetView;
        this.Q = viewPager2;
    }

    public static kha A0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        return B0(layoutInflater, viewGroup, z, sk5.i());
    }

    @Deprecated
    public static kha B0(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z, Object obj) {
        return (kha) ViewDataBinding.G(layoutInflater, jui.h1, viewGroup, z, obj);
    }
}
