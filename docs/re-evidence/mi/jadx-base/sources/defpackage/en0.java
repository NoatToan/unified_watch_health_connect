package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.databinding.ViewDataBinding;
import com.google.android.material.tabs.TabLayout;
import com.xiaomi.fitness.baseui.widget.CustomCircleProgressBar;
import miuix.androidbasewidget.widget.ProgressBar;

/* JADX INFO: loaded from: classes8.dex */
public abstract class en0 extends ViewDataBinding {
    public final FrameLayout A;
    public final TextView B;
    public final CustomCircleProgressBar C;
    public final LinearLayoutCompat D;
    public final LinearLayout E;
    public final ProgressBar F;
    public final TextView G;
    public final LinearLayout H;
    public final TabLayout I;

    public en0(Object obj, View view, int i, FrameLayout frameLayout, TextView textView, CustomCircleProgressBar customCircleProgressBar, LinearLayoutCompat linearLayoutCompat, LinearLayout linearLayout, ProgressBar progressBar, TextView textView2, LinearLayout linearLayout2, TabLayout tabLayout) {
        super(obj, view, i);
        this.A = frameLayout;
        this.B = textView;
        this.C = customCircleProgressBar;
        this.D = linearLayoutCompat;
        this.E = linearLayout;
        this.F = progressBar;
        this.G = textView2;
        this.H = linearLayout2;
        this.I = tabLayout;
    }
}
