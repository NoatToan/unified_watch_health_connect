package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.webview.CustomWebView;

/* JADX INFO: loaded from: classes10.dex */
public abstract class jbr extends ViewDataBinding {
    public final FrameLayout A;
    public final FrameLayout B;
    public final LinearLayout C;
    public final FrameLayout D;
    public final ProgressBar E;
    public final CustomWebView F;

    public jbr(Object obj, View view, int i, FrameLayout frameLayout, FrameLayout frameLayout2, LinearLayout linearLayout, FrameLayout frameLayout3, ProgressBar progressBar, CustomWebView customWebView) {
        super(obj, view, i);
        this.A = frameLayout;
        this.B = frameLayout2;
        this.C = linearLayout;
        this.D = frameLayout3;
        this.E = progressBar;
        this.F = customWebView;
    }
}
