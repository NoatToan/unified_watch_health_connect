package com.huawei.openalliance.ad.views;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import com.huawei.openalliance.ad.hw;

/* JADX INFO: loaded from: classes41.dex */
public class LinkedSurfaceView extends RelativeLayout implements com.huawei.openalliance.ad.views.interfaces.u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private b f20781a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f20782b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f20783c;

    public void setVideoScaleMode(int i) {
        this.f20781a.setVideoScaleMode(i);
    }

    public void setVideoRatio(Float f) {
        this.f20781a.setVideoRatio(f);
    }

    public void setScreenOnWhilePlaying(boolean z) {
        this.f20781a.setScreenOnWhilePlaying(z);
    }

    public void setNeedPauseOnSurfaceDestory(boolean z) {
        this.f20781a.setNeedPauseOnSurfaceDestory(z);
    }

    public void setAutoScaleResizeLayoutOnVideoSizeChange(boolean z) {
        this.f20781a.setAutoScaleResizeLayoutOnVideoSizeChange(z);
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        super.onLayout(z, i, i2, i3, i4);
        if (this.f20783c == 0 && this.f20782b == 0) {
            this.f20782b = i3 - i;
            this.f20783c = i4 - i2;
        }
        if (this.f20781a.getVideoHeight() == 0 || (i5 = this.f20783c) == 0) {
            return;
        }
        this.f20781a.a(this.f20782b, i5);
        b bVar = this.f20781a;
        float videoWidth = (bVar.getVideoWidth() * 1.0f) / this.f20781a.getVideoHeight();
        int i6 = this.f20782b;
        int i7 = this.f20783c;
        bVar.a(videoWidth, (i6 * 1.0f) / i7, i6, i7);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        hw.b("LinkedSurfaceView", "onDetachedFromWindow");
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        hw.b("LinkedSurfaceView", "onAttachedToWindow");
    }

    @Override // com.huawei.openalliance.ad.views.interfaces.u
    public void c() {
        this.f20781a.c();
    }

    @Override // com.huawei.openalliance.ad.views.interfaces.u
    public void b() {
        this.f20781a.b();
    }

    @Override // com.huawei.openalliance.ad.views.interfaces.u
    public void a(h hVar) {
        this.f20781a.a(hVar);
    }

    public void a(float f, float f2, int i, int i2) {
        this.f20781a.a(f, f2, i, i2);
    }

    public void a(float f, float f2, float f3, int i, int i2) {
        super.setScaleY(f);
        super.setTranslationY(f2);
        super.setScaleX(f3);
        this.f20783c = i2;
        this.f20782b = i;
        if (this.f20781a.getVideoHeight() == 0 || i2 == 0) {
            return;
        }
        this.f20781a.a(i, i2);
        b bVar = this.f20781a;
        bVar.a((bVar.getVideoWidth() * 1.0f) / this.f20781a.getVideoHeight(), (i * 1.0f) / i2, i, i2);
    }

    public void a() {
        this.f20781a.destroyView();
    }

    private void a(Context context) {
        this.f20781a = new ak(context);
        addView(this.f20781a, new RelativeLayout.LayoutParams(-1, -1));
    }

    public LinkedSurfaceView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a(context);
    }

    public LinkedSurfaceView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a(context);
    }

    public LinkedSurfaceView(Context context) {
        super(context);
        a(context);
    }
}
