package androidx.core.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ProgressBar;
import p7.b;

/* JADX INFO: loaded from: classes.dex */
public class ContentLoadingProgressBar extends ProgressBar {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f6592a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f6593b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f6594c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f6595d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final b f6596e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final b f6597f;

    public ContentLoadingProgressBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f6592a = -1L;
        this.f6593b = false;
        this.f6594c = false;
        this.f6595d = false;
        this.f6596e = new b(this, 0);
        this.f6597f = new b(this, 1);
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        removeCallbacks(this.f6596e);
        removeCallbacks(this.f6597f);
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f6596e);
        removeCallbacks(this.f6597f);
    }

    public ContentLoadingProgressBar(Context context) {
        this(context, null);
    }
}
