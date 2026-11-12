package androidx.core.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ProgressBar;

/* JADX INFO: loaded from: classes.dex */
public class ContentLoadingProgressBar extends ProgressBar {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f2127a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f2128b;
    public boolean c;
    public boolean d;
    public final Runnable e;
    public final Runnable f;

    public ContentLoadingProgressBar(Context context) {
        this(context, null);
    }

    public final /* synthetic */ void c() {
        this.f2128b = false;
        this.f2127a = -1L;
        setVisibility(8);
    }

    public final /* synthetic */ void d() {
        this.c = false;
        if (this.d) {
            return;
        }
        this.f2127a = System.currentTimeMillis();
        setVisibility(0);
    }

    public final void e() {
        removeCallbacks(this.e);
        removeCallbacks(this.f);
    }

    @Override // android.widget.ProgressBar, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        e();
    }

    @Override // android.widget.ProgressBar, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        e();
    }

    public ContentLoadingProgressBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f2127a = -1L;
        this.f2128b = false;
        this.c = false;
        this.d = false;
        this.e = new Runnable() { // from class: bi4
            @Override // java.lang.Runnable
            public final void run() {
                this.f4238a.c();
            }
        };
        this.f = new Runnable() { // from class: ci4
            @Override // java.lang.Runnable
            public final void run() {
                this.f5363a.d();
            }
        };
    }
}
