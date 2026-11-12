package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.sport.view.widget.SportGlobalTabLayout;
import com.xiaomi.fitness.widget.view.HomeHeaderView;

/* JADX INFO: loaded from: classes10.dex */
public abstract class mmn extends ViewDataBinding {
    public final TextView A;
    public final ImageView B;
    public final View C;
    public final ImageView D;
    public final RelativeLayout E;
    public final RelativeLayout F;
    public final SportGlobalTabLayout G;
    public final smn H;
    public final HomeHeaderView I;
    public final ImageView J;
    public final View K;

    public mmn(Object obj, View view, int i, TextView textView, ImageView imageView, View view2, ImageView imageView2, RelativeLayout relativeLayout, RelativeLayout relativeLayout2, SportGlobalTabLayout sportGlobalTabLayout, smn smnVar, HomeHeaderView homeHeaderView, ImageView imageView3, View view3) {
        super(obj, view, i);
        this.A = textView;
        this.B = imageView;
        this.C = view2;
        this.D = imageView2;
        this.E = relativeLayout;
        this.F = relativeLayout2;
        this.G = sportGlobalTabLayout;
        this.H = smnVar;
        this.I = homeHeaderView;
        this.J = imageView3;
        this.K = view3;
    }
}
