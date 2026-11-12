package defpackage;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.views.progressbar.ReactProgressBarViewManager;

/* JADX INFO: loaded from: classes4.dex */
public class cci extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Integer f5185a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f5186b;
    public boolean c;
    public double d;
    public ProgressBar e;

    public cci(Context context) {
        super(context);
        this.f5186b = true;
        this.c = true;
    }

    public void a() {
        ProgressBar progressBar = this.e;
        if (progressBar == null) {
            throw new JSApplicationIllegalArgumentException("setStyle() not called");
        }
        progressBar.setIndeterminate(this.f5186b);
        c(this.e);
        this.e.setProgress((int) (this.d * 1000.0d));
        if (this.c) {
            this.e.setVisibility(0);
        } else {
            this.e.setVisibility(4);
        }
    }

    public void b(boolean z) {
        this.c = z;
    }

    public final void c(ProgressBar progressBar) {
        Drawable indeterminateDrawable = progressBar.isIndeterminate() ? progressBar.getIndeterminateDrawable() : progressBar.getProgressDrawable();
        if (indeterminateDrawable == null) {
            return;
        }
        Integer num = this.f5185a;
        if (num != null) {
            indeterminateDrawable.setColorFilter(num.intValue(), PorterDuff.Mode.SRC_IN);
        } else {
            indeterminateDrawable.clearColorFilter();
        }
    }

    public void d(Integer num) {
        this.f5185a = num;
    }

    public void e(boolean z) {
        this.f5186b = z;
    }

    public void f(double d) {
        this.d = d;
    }

    public void g(String str) {
        ProgressBar progressBarCreateProgressBar = ReactProgressBarViewManager.createProgressBar(getContext(), ReactProgressBarViewManager.getStyleFromString(str));
        this.e = progressBarCreateProgressBar;
        progressBarCreateProgressBar.setMax(1000);
        removeAllViews();
        addView(this.e, new ViewGroup.LayoutParams(-1, -1));
    }
}
