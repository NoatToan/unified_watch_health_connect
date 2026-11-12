package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.detail.view.MapScrollView;
import com.xiaomi.fitness.detail.view.SportEnvironmentalView;
import com.xiaomi.fitness.detail.view.SportRecordBasicInfoView;
import com.xiaomi.fitness.detail.view.SportShareBottomView;
import com.xiaomi.fitness.detail.view.SportShareLongView;
import com.xiaomi.fitness.detail.view.SportTargetView;
import com.xiaomi.fitness.share.view.ShareLogoContainer;

/* JADX INFO: loaded from: classes10.dex */
public abstract class qda extends ViewDataBinding {
    public final FrameLayout A;
    public final ImageView B;
    public final ImageView C;
    public final ImageView D;
    public final MapScrollView E;
    public final View F;
    public final LinearLayout G;
    public final LinearLayout H;
    public final SportShareBottomView I;
    public final ShareLogoContainer J;
    public final SportEnvironmentalView K;
    public final SportRecordBasicInfoView L;
    public final SportShareLongView M;
    public final SportTargetView N;
    public final TextView O;
    public final TextView P;
    public final TextView Q;

    public qda(Object obj, View view, int i, FrameLayout frameLayout, ImageView imageView, ImageView imageView2, ImageView imageView3, MapScrollView mapScrollView, View view2, LinearLayout linearLayout, LinearLayout linearLayout2, SportShareBottomView sportShareBottomView, ShareLogoContainer shareLogoContainer, SportEnvironmentalView sportEnvironmentalView, SportRecordBasicInfoView sportRecordBasicInfoView, SportShareLongView sportShareLongView, SportTargetView sportTargetView, TextView textView, TextView textView2, TextView textView3) {
        super(obj, view, i);
        this.A = frameLayout;
        this.B = imageView;
        this.C = imageView2;
        this.D = imageView3;
        this.E = mapScrollView;
        this.F = view2;
        this.G = linearLayout;
        this.H = linearLayout2;
        this.I = sportShareBottomView;
        this.J = shareLogoContainer;
        this.K = sportEnvironmentalView;
        this.L = sportRecordBasicInfoView;
        this.M = sportShareLongView;
        this.N = sportTargetView;
        this.O = textView;
        this.P = textView2;
        this.Q = textView3;
    }
}
