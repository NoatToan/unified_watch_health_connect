package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.sport.bean.LaunchViewBean;

/* JADX INFO: loaded from: classes10.dex */
public abstract class quq extends ViewDataBinding {
    public final TextView A;
    public final TextView B;
    public final TextView C;
    public final TextView D;
    public final ImageView E;
    public final TextView F;
    public final TextView G;
    public LaunchViewBean H;

    public quq(Object obj, View view, int i, TextView textView, TextView textView2, TextView textView3, TextView textView4, ImageView imageView, TextView textView5, TextView textView6) {
        super(obj, view, i);
        this.A = textView;
        this.B = textView2;
        this.C = textView3;
        this.D = textView4;
        this.E = imageView;
        this.F = textView5;
        this.G = textView6;
    }

    public abstract void A0(LaunchViewBean launchViewBean);
}
