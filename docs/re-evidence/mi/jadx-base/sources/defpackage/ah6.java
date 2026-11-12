package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.webview.CustomWebView;

/* JADX INFO: loaded from: classes8.dex */
public abstract class ah6 extends ViewDataBinding {
    public final FrameLayout A;
    public final ProgressBar B;
    public final CustomWebView C;

    public ah6(Object obj, View view, int i, FrameLayout frameLayout, ProgressBar progressBar, CustomWebView customWebView) {
        super(obj, view, i);
        this.A = frameLayout;
        this.B = progressBar;
        this.C = customWebView;
    }
}
