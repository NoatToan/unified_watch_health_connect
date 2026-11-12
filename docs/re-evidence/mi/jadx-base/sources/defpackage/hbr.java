package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import androidx.databinding.ViewDataBinding;
import com.xiaomi.fitness.webview.CustomWebView;

/* JADX INFO: loaded from: classes10.dex */
public abstract class hbr extends ViewDataBinding {
    public final FrameLayout A;
    public final CustomWebView B;

    public hbr(Object obj, View view, int i, FrameLayout frameLayout, CustomWebView customWebView) {
        super(obj, view, i);
        this.A = frameLayout;
        this.B = customWebView;
    }
}
