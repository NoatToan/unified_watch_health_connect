package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.chart.mpchart.barchart.CustomBarChart;
import com.xiaomi.fitness.homepage.viewholder.XAxisView;

/* JADX INFO: loaded from: classes9.dex */
public abstract class k7e extends ViewDataBinding {
    public final LinearLayoutCompat A;
    public final XAxisView B;
    public final CustomBarChart C;
    public final ImageView D;
    public final TextView E;
    public final TextView F;

    public k7e(Object obj, View view, int i, LinearLayoutCompat linearLayoutCompat, XAxisView xAxisView, CustomBarChart customBarChart, ImageView imageView, TextView textView, TextView textView2) {
        super(obj, view, i);
        this.A = linearLayoutCompat;
        this.B = xAxisView;
        this.C = customBarChart;
        this.D = imageView;
        this.E = textView;
        this.F = textView2;
    }

    public static k7e A0(View view) {
        return B0(view, sk5.i());
    }

    @Deprecated
    public static k7e B0(View view, Object obj) {
        return (k7e) ViewDataBinding.k(obj, view, jui.I6);
    }
}
