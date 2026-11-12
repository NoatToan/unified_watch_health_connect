package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.chart.mpchart.barchart.CustomBarChart;
import com.xiaomi.fitness.homepage.viewholder.XAxisView;

/* JADX INFO: loaded from: classes9.dex */
public abstract class m7e extends ViewDataBinding {
    public final LinearLayoutCompat A;
    public final XAxisView B;
    public final CustomBarChart C;
    public final ImageView D;
    public final ImageView E;
    public final TextView F;
    public final TextView G;
    public final TextView H;

    public m7e(Object obj, View view, int i, LinearLayoutCompat linearLayoutCompat, XAxisView xAxisView, CustomBarChart customBarChart, ImageView imageView, ImageView imageView2, TextView textView, TextView textView2, TextView textView3) {
        super(obj, view, i);
        this.A = linearLayoutCompat;
        this.B = xAxisView;
        this.C = customBarChart;
        this.D = imageView;
        this.E = imageView2;
        this.F = textView;
        this.G = textView2;
        this.H = textView3;
    }

    public static m7e A0(View view) {
        return B0(view, sk5.i());
    }

    @Deprecated
    public static m7e B0(View view, Object obj) {
        return (m7e) ViewDataBinding.k(obj, view, jui.J6);
    }
}
