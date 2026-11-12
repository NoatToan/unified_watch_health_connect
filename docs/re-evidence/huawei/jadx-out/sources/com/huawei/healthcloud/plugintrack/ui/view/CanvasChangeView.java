package com.huawei.healthcloud.plugintrack.ui.view;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: classes10.dex */
public class CanvasChangeView extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f11239a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Canvas f11240b;

    public CanvasChangeView(Context context) {
        super(context);
        this.f11239a = new Object();
        c();
    }

    public CanvasChangeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f11239a = new Object();
        c();
    }

    private void c() {
        setWillNotDraw(false);
        b();
    }

    private void b() {
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener() { // from class: jse
                @Override // android.view.ViewTreeObserver.OnPreDrawListener
                public final boolean onPreDraw() {
                    return this.f38965c.e();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean e() {
        if (!isDirty()) {
            return true;
        }
        invalidate();
        return true;
    }

    public void setCanvas(Canvas canvas) {
        synchronized (this.f11239a) {
            this.f11240b = canvas;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        synchronized (this.f11239a) {
            Canvas canvas2 = this.f11240b;
            if (canvas2 != null) {
                super.dispatchDraw(canvas2);
            } else {
                super.dispatchDraw(canvas);
            }
        }
    }
}
