package com.huawei.openalliance.ad.views;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.RelativeLayout;
import com.huawei.openalliance.ad.R;

/* JADX INFO: loaded from: classes12.dex */
public class aj extends AutoScaleSizeRelativeLayout implements com.huawei.openalliance.ad.views.interfaces.t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private LinkedSurfaceView f21142a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private PPSWLSView f21143b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private PPSSplashAdSourceView f21144c;
    private ViewStub d;
    private PPSSplashProView e;
    private PPSSplashSwipeView f;
    private PPSSplashTwistView g;
    private PPSSplashSwipeClickView h;
    private PPSSplashTwistClickView i;

    public ViewStub getViewStub() {
        return this.d;
    }

    public PPSSplashTwistView getTwistView() {
        return this.g;
    }

    public PPSSplashTwistClickView getTwistClickView() {
        return this.i;
    }

    public PPSSplashSwipeView getSwipeView() {
        return this.f;
    }

    public PPSSplashSwipeClickView getSwipeClickView() {
        return this.h;
    }

    public int getStatusBarHeight() {
        int[] iArr = new int[2];
        getLocationOnScreen(iArr);
        return iArr[1];
    }

    public PPSSplashProView getProView() {
        return this.e;
    }

    public PPSWLSView getPpswlsView() {
        return this.f21143b;
    }

    public PPSSplashAdSourceView getPpsSplashAdSourceView() {
        return this.f21144c;
    }

    public LinkedSurfaceView getLinkedVideoView() {
        return this.f21142a;
    }

    public void b() {
        removeAllViews();
        this.f21142a = null;
        this.f21143b = null;
        this.f21144c = null;
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = null;
        this.h = null;
        this.i = null;
    }

    public void a() {
        if (this.f21142a.getParent() instanceof ViewGroup) {
            ((ViewGroup) this.f21142a.getParent()).removeView(this.f21142a);
        }
    }

    private void a(Context context) {
        ((RelativeLayout) LayoutInflater.from(context).inflate(R.layout.hiad_splash_linked_video_view, this)).setBackgroundColor(0);
        this.f21142a = (LinkedSurfaceView) findViewById(R.id.hiad_linked_video_view);
        PPSWLSView pPSWLSView = (PPSWLSView) findViewById(R.id.splash_wls_view);
        this.f21143b = pPSWLSView;
        pPSWLSView.setVisibility(8);
        PPSSplashAdSourceView pPSSplashAdSourceView = (PPSSplashAdSourceView) findViewById(R.id.splash_ad_source_view);
        this.f21144c = pPSSplashAdSourceView;
        pPSSplashAdSourceView.setVisibility(8);
        this.d = (ViewStub) findViewById(R.id.hiad_logo_stub);
        this.e = (PPSSplashProView) findViewById(R.id.hiad_splash_pro_view);
        this.f = (PPSSplashSwipeView) findViewById(R.id.hiad_splash_swipe_view);
        this.g = (PPSSplashTwistView) findViewById(R.id.hiad_splash_twist_view);
        this.i = (PPSSplashTwistClickView) findViewById(R.id.hiad_splash_twist_click_view);
        this.h = (PPSSplashSwipeClickView) findViewById(R.id.hiad_splash_swipe_click_view);
        this.f21142a.setNeedPauseOnSurfaceDestory(false);
        this.f21142a.setScreenOnWhilePlaying(true);
        this.f21142a.setAutoScaleResizeLayoutOnVideoSizeChange(false);
        this.f21142a.setVideoScaleMode(2);
    }

    public aj(Context context) {
        super(context);
        a(context);
    }
}
