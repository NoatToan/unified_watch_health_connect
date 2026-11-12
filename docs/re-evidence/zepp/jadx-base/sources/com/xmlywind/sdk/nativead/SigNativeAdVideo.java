package com.xmlywind.sdk.nativead;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.xmlywind.sdk.base.models.BaseAdUnit;
import com.xmlywind.sdk.videoplayer.VideoAdView;
import java.io.File;
import java.util.LinkedList;

/* JADX INFO: loaded from: classes22.dex */
public class SigNativeAdVideo extends SigNativeAdView implements h, com.xmlywind.sdk.videoplayer.a {
    public static LinkedList<ViewGroup> b = new LinkedList<>();
    public static long c = 0;
    private VideoAdView e;
    private SigAppView f;
    private i g;
    private Bitmap h;
    private Bitmap i;
    private ViewGroup j;
    private long k;

    /* JADX INFO: renamed from: com.xmlywind.sdk.nativead.SigNativeAdVideo$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[f.values().length];
            a = iArr;
            try {
                iArr[f.PREVIEW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[f.DETAIL_PAGE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[f.DETAIL_PAGE_END.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public SigNativeAdVideo(Context context) {
        super(context);
        this.h = null;
        this.i = null;
        this.j = null;
        getVideoAdView().setVideoAdViewListener(this);
        this.j = new RelativeLayout(getContext());
        getVideoAdView().setVideoAdStatusListener(this);
        com.xmlywind.sdk.blurkit.a.a(getContext());
    }

    private void a(Activity activity) {
        activity.getWindow().getDecorView().setSystemUiVisibility(Build.VERSION.SDK_INT >= 21 ? 5894 : 4);
    }

    private void a(ViewGroup viewGroup) {
        SigAppInfoView sigAppInfoView = null;
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt instanceof SigAppInfoView) {
                sigAppInfoView = (SigAppInfoView) childAt;
            }
        }
        if (sigAppInfoView != null) {
            com.xmlywind.sdk.common.utils.r.a(sigAppInfoView);
        }
    }

    private void f() {
        if (this.f != null) {
            ViewGroup appContainer = getVideoAdView().getAppContainer();
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
            layoutParams.addRule(13);
            appContainer.addView(this.f, layoutParams);
        }
    }

    private void g() {
        Bitmap textureBitmap;
        if (getVideoAdView() == null || (textureBitmap = getVideoAdView().getTextureBitmap()) == null) {
            return;
        }
        Bitmap bitmapA = com.xmlywind.sdk.blurkit.a.a().a(textureBitmap, 25);
        getVideoAdView().getBlurImageView().setImageBitmap(bitmapA);
        getVideoAdView().getAppContainer().setVisibility(0);
        this.h = textureBitmap;
        this.i = bitmapA;
    }

    private void h() {
        SigAppInfoView appInfoView = getAppInfoView();
        if (appInfoView != null) {
            com.xmlywind.sdk.common.utils.r.a(appInfoView);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
            layoutParams.setMargins(0, 0, 0, com.xmlywind.sdk.common.utils.c.c(5.0f, getContext()));
            layoutParams.addRule(12);
            addView(appInfoView, layoutParams);
        }
    }

    @Override // com.xmlywind.sdk.nativead.h
    public void a() {
        if (getSigAdVideoStatusListener() != null) {
            getSigAdVideoStatusListener().a();
        }
    }

    @Override // com.xmlywind.sdk.nativead.SigNativeAdView
    public void a(r rVar) {
        super.a(rVar);
        BaseAdUnit adUnit = getAdUnit();
        if (adUnit != null) {
            a(this);
            File videoProxyFile = adUnit.getVideoProxyFile();
            if (videoProxyFile == null || !videoProxyFile.exists()) {
                getVideoAdView().setUp(adUnit.getProxyVideoUrl());
            } else {
                getVideoAdView().setUp(videoProxyFile.getAbsolutePath());
            }
            setUIStyle(f.PREVIEW);
            if (TextUtils.isEmpty(adUnit.getVideoThumbUrl())) {
                getVideoAdView().a(true);
            } else {
                com.xmlywind.sdk.common.utils.g.a(getContext()).a(adUnit.getVideoThumbUrl()).a(getVideoAdView().getThumbView());
            }
            getAppView().a(adUnit.getIconUrl(), adUnit.getTitle(), adUnit.getCTAText());
            getVideoAdView().setSoundChange(getAdConfig().f());
        }
    }

    @Override // com.xmlywind.sdk.nativead.SigAdView
    public boolean a(MotionEvent motionEvent) {
        SigAppView sigAppView = this.f;
        if (sigAppView == null || sigAppView.getParent() == null || this.f.getVisibility() != 0) {
            return false;
        }
        return com.xmlywind.sdk.common.utils.r.a(this.f.getCtaView(), motionEvent);
    }

    @Override // com.xmlywind.sdk.nativead.SigAdView
    public boolean b() {
        if (b.size() != 0 && getVideoAdView() != null) {
            getVideoAdView().s();
        } else {
            if (b.size() != 0 || getVideoAdView() == null || getVideoAdView().i == 0) {
                return false;
            }
            getVideoAdView().n();
        }
        return true;
    }

    @Override // com.xmlywind.sdk.nativead.SigNativeAdView, com.xmlywind.sdk.nativead.SigAdView
    public void c() {
        super.c();
        com.xmlywind.sdk.common.utils.i.a(this.h);
        com.xmlywind.sdk.common.utils.i.a(this.i);
        i sigVideoAdController = getSigVideoAdController();
        if (sigVideoAdController != null) {
            sigVideoAdController.g();
        }
        VideoAdView videoAdView = this.e;
        if (videoAdView != null) {
            videoAdView.a();
            this.e = null;
        }
    }

    @Override // com.xmlywind.sdk.videoplayer.a
    public void d() {
        ViewGroup viewGroup = (ViewGroup) this.j.getParent();
        if (viewGroup != null) {
            viewGroup.removeView(this.j);
        }
        Activity activityB = com.xmlywind.sdk.videoplayer.b.b(b.getLast().getContext());
        if (activityB != null) {
            activityB.getWindow().getDecorView().setSystemUiVisibility(0);
        }
        if (getVideoAdView().getVideoHeight() < getVideoAdView().getVideoWidth() && activityB != null) {
            activityB.setRequestedOrientation(1);
        }
        b.getLast().removeAllViews();
        b.getLast().addView(this.j, new FrameLayout.LayoutParams(-1, -1));
        b.pop();
    }

    @Override // com.xmlywind.sdk.videoplayer.a
    public void e() {
        ViewGroup viewGroup = (ViewGroup) this.j.getParent();
        viewGroup.removeView(this.j);
        b.add(viewGroup);
        Activity activityB = com.xmlywind.sdk.videoplayer.b.b(viewGroup.getContext());
        if (activityB != null) {
            a(activityB);
            ((ViewGroup) activityB.getWindow().getDecorView()).addView(this.j, new FrameLayout.LayoutParams(-1, -1));
            if (getVideoAdView().getVideoHeight() < getVideoAdView().getVideoWidth()) {
                activityB.setRequestedOrientation(6);
            }
        }
    }

    public SigAppView getAppView() {
        if (this.f == null) {
            this.f = new SigAppView(getContext());
        }
        return this.f;
    }

    public h getSigAdVideoStatusListener() {
        i iVar = this.g;
        if (iVar != null) {
            return iVar.f();
        }
        return null;
    }

    @Override // com.xmlywind.sdk.nativead.SigAdView
    public i getSigVideoAdController() {
        if (this.g == null) {
            this.g = new j(getVideoAdView());
        }
        return this.g;
    }

    public VideoAdView getVideoAdView() {
        if (this.e == null) {
            this.e = new VideoAdView(getContext());
        }
        return this.e;
    }

    public ViewGroup getVideoContainer() {
        return this.j;
    }

    @Override // com.xmlywind.sdk.nativead.SigNativeAdView
    public double getVideoDuration() {
        return getVideoAdView() != null ? getVideoAdView().getDuration() / 1000.0f : super.getVideoDuration();
    }

    @Override // com.xmlywind.sdk.nativead.SigNativeAdView
    public double getVideoProgress() {
        return getVideoAdView() != null ? ((getVideoAdView().getCurrentPositionWhenPlaying() * 1.0f) / getVideoAdView().getDuration()) / 100.0f : super.getVideoProgress();
    }

    public int getVideoSurferViewHeight() {
        if (getVideoAdView() != null) {
            return getVideoAdView().getVideoSurferViewHeight();
        }
        return 0;
    }

    @Override // com.xmlywind.sdk.nativead.g
    public void onProgressUpdate(long j, long j2) {
        if (getSigAdVideoStatusListener() != null) {
            getSigAdVideoStatusListener().onProgressUpdate(j, j2);
        }
        if (j > 0) {
            this.k = j2;
        }
    }

    @Override // com.xmlywind.sdk.nativead.g
    public void onVideoAdComplete() {
        if (getSigAdVideoStatusListener() != null) {
            getSigAdVideoStatusListener().onVideoAdComplete();
        }
        g();
        f fVar = this.a;
        if (fVar != f.PREVIEW) {
            if (fVar == f.DETAIL_PAGE) {
                setUIStyle(f.DETAIL_PAGE_END);
            }
        } else {
            if (getAppView().getParent() == null) {
                f();
            }
            getAppView().setVisibility(0);
            getVideoAdView().a(com.xmlywind.sdk.videoplayer.c.RETRY, true);
        }
    }

    @Override // com.xmlywind.sdk.nativead.g
    public void onVideoAdPaused() {
        if (getSigAdVideoStatusListener() != null) {
            getSigAdVideoStatusListener().onVideoAdPaused();
        }
    }

    @Override // com.xmlywind.sdk.nativead.g
    public void onVideoAdResume() {
        if (getSigAdVideoStatusListener() != null) {
            getSigAdVideoStatusListener().onVideoAdResume();
        }
    }

    @Override // com.xmlywind.sdk.nativead.g
    public void onVideoAdStartPlay() {
        SigAppView sigAppView = this.f;
        if (sigAppView != null) {
            com.xmlywind.sdk.common.utils.r.a(sigAppView);
            getVideoAdView().getAppContainer().setVisibility(4);
        }
        com.xmlywind.sdk.common.utils.i.a(this.h);
        com.xmlywind.sdk.common.utils.i.a(this.i);
        getAdUnit().updateRealAdPercent((getVideoAdView().getVideoWidth() * 1.0f) / getVideoAdView().getVideoHeight());
        f fVar = this.a;
        if (fVar == f.DETAIL_PAGE_END) {
            fVar = f.DETAIL_PAGE;
        }
        setUIStyle(fVar);
        if (getSigAdVideoStatusListener() != null) {
            getSigAdVideoStatusListener().onVideoAdStartPlay();
        }
    }

    @Override // com.xmlywind.sdk.nativead.g
    public void onVideoError(int i, int i2) {
        if (getSigAdVideoStatusListener() != null) {
            getSigAdVideoStatusListener().onVideoError(i, i2);
        }
    }

    @Override // com.xmlywind.sdk.nativead.g
    public void onVideoLoad() {
        if (getSigAdVideoStatusListener() != null) {
            getSigAdVideoStatusListener().onVideoLoad();
        }
    }

    public void setBackClickListener(View.OnClickListener onClickListener) {
        if (getVideoAdView() != null) {
            getVideoAdView().setBackClickListener(onClickListener);
        }
    }

    @Override // com.xmlywind.sdk.nativead.SigNativeAdView
    public void setUIStyle(f fVar) {
        super.setUIStyle(fVar);
        int i = AnonymousClass1.a[fVar.ordinal()];
        if (i != 1) {
            if (i == 2) {
                if (this.f.getParent() != null) {
                    this.f.setVisibility(4);
                }
                if (this.j.getChildCount() > 0) {
                    this.j.removeAllViews();
                }
                removeView(getVideoAdView());
                this.j.addView(getVideoAdView(), new RelativeLayout.LayoutParams(-1, -1));
                getVideoAdView().setSoundChange(getAdConfig().g() || getVideoAdView().d());
                getVideoAdView().a(com.xmlywind.sdk.videoplayer.c.START, false);
                getVideoAdView().a(com.xmlywind.sdk.videoplayer.c.FULLSCREEN, true);
                getVideoAdView().a(com.xmlywind.sdk.videoplayer.c.VOLUME, true);
                getVideoAdView().a(com.xmlywind.sdk.videoplayer.c.BIGRETRY, false);
                getVideoAdView().a(com.xmlywind.sdk.videoplayer.c.RETRY, false);
            } else {
                if (i != 3) {
                    return;
                }
                if (this.f.getParent() != null) {
                    this.f.setVisibility(4);
                }
                getVideoAdView().a(com.xmlywind.sdk.videoplayer.c.START, false);
                getVideoAdView().a(com.xmlywind.sdk.videoplayer.c.FULLSCREEN, false);
                getVideoAdView().a(com.xmlywind.sdk.videoplayer.c.VOLUME, false);
                getVideoAdView().a(com.xmlywind.sdk.videoplayer.c.RETRY, false);
                getVideoAdView().a(com.xmlywind.sdk.videoplayer.c.BIGRETRY, true);
            }
            getVideoAdView().a(com.xmlywind.sdk.videoplayer.c.BACK, true);
            return;
        }
        this.j.removeAllViews();
        com.xmlywind.sdk.common.utils.r.a(this.j);
        com.xmlywind.sdk.common.utils.r.a(getVideoAdView());
        addView(getVideoAdView(), new RelativeLayout.LayoutParams(-1, -1));
        if (getVideoAdView().h == 0) {
            getVideoAdView().a(com.xmlywind.sdk.videoplayer.c.START, true);
        } else {
            getVideoAdView().a(com.xmlywind.sdk.videoplayer.c.START, false);
        }
        getVideoAdView().a(com.xmlywind.sdk.videoplayer.c.FULLSCREEN, false);
        getVideoAdView().a(com.xmlywind.sdk.videoplayer.c.VOLUME, false);
        getVideoAdView().a(com.xmlywind.sdk.videoplayer.c.BIGRETRY, false);
        VideoAdView videoAdView = getVideoAdView();
        com.xmlywind.sdk.videoplayer.c cVar = com.xmlywind.sdk.videoplayer.c.RETRY;
        videoAdView.a(cVar, false);
        getVideoAdView().a(com.xmlywind.sdk.videoplayer.c.BACK, false);
        getVideoAdView().setSoundChange(getAdConfig().f());
        if (this.f != null && (getVideoAdView().h == 6 || getVideoAdView().h == 7)) {
            if (this.f.getParent() == null) {
                f();
            }
            this.f.setVisibility(0);
            getVideoAdView().a(cVar, true);
        }
        h();
    }
}
