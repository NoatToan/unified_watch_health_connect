package com.huawei.openalliance.ad.linked.view;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.huawei.openalliance.ad.R;
import com.huawei.openalliance.ad.activity.PPSActivity;
import com.huawei.openalliance.ad.gz;
import com.huawei.openalliance.ad.ha;
import com.huawei.openalliance.ad.hk;
import com.huawei.openalliance.ad.hl;
import com.huawei.openalliance.ad.hm;
import com.huawei.openalliance.ad.hw;
import com.huawei.openalliance.ad.media.MediaPlayerAgent;
import com.huawei.openalliance.ad.media.listener.MediaErrorListener;
import com.huawei.openalliance.ad.views.PPSWebView;
import com.huawei.openalliance.ad.views.VideoView;
import com.huawei.openalliance.ad.views.linkscroll.LinkScrollView;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public class c extends RelativeLayout implements hl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private gz f19480a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private hm f19481b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List<View> f19482c;
    private LinkedAppDetailView d;
    private LinkScrollView e;
    private com.huawei.openalliance.ad.views.d f;
    private int g;
    private PPSWebView h;
    private final View.OnClickListener i;
    private a j;
    private final MediaErrorListener k;

    public interface a {
        void a();

        void a(MediaPlayerAgent mediaPlayerAgent, int i, int i2, int i3);
    }

    public void setPlayModeChangeListener(PPSActivity.b bVar) {
        hm hmVar = this.f19481b;
        if (hmVar instanceof b) {
            ((b) hmVar).setPlayModeChangeListener(bVar);
        }
    }

    @Override // android.view.View
    protected void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
    }

    public gz getNativeAd() {
        return this.f19480a;
    }

    public hm getLinkedNativeVideoView() {
        return this.f19481b;
    }

    public void f() {
        LinkScrollView linkScrollView = this.e;
        if (linkScrollView != null) {
            linkScrollView.a();
            this.e = null;
        }
    }

    public void e() {
        hm hmVar = this.f19481b;
        if (hmVar != null) {
            ((b) hmVar).e();
        }
    }

    public void d() {
        hm hmVar = this.f19481b;
        if (hmVar instanceof b) {
            ((b) hmVar).f();
        }
    }

    public void c() {
        hm hmVar = this.f19481b;
        if (hmVar instanceof b) {
            ((b) hmVar).pauseView();
        }
    }

    public void b() {
        hm hmVar = this.f19481b;
        if (hmVar instanceof b) {
            ((b) hmVar).resumeView();
        }
    }

    public void a(PPSWebView pPSWebView) {
        hw.a("LinkedLandView", "registerPPSWebView");
        FrameLayout frameLayout = (FrameLayout) findViewById(R.id.linked_pps_web_view);
        com.huawei.openalliance.ad.views.d customEmuiActionBar = pPSWebView.getCustomEmuiActionBar();
        this.f = customEmuiActionBar;
        if (customEmuiActionBar != null) {
            try {
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
                layoutParams.addRule(10, -1);
                layoutParams.addRule(2, R.id.linked_native_view);
                addView(this.f, layoutParams);
                this.f.post(new Runnable() { // from class: com.huawei.openalliance.ad.linked.view.c.3
                    @Override // java.lang.Runnable
                    public void run() {
                        c cVar = c.this;
                        cVar.g = cVar.f.getHeight();
                        if (c.this.g <= 0 || c.this.e == null) {
                            return;
                        }
                        c.this.e.setPaddingRelative(0, c.this.g, 0, 0);
                        c.this.e.setBarHeight(c.this.g);
                    }
                });
            } catch (Throwable th) {
                hw.b("LinkedLandView", "setCustomeActionBar error: %s", th.getClass().getSimpleName());
            }
        }
        frameLayout.addView(pPSWebView);
        this.e.setWebView(pPSWebView.findViewById(R.id.hiad_webview));
        this.h = pPSWebView;
        k();
    }

    public void a(ha haVar) {
        hw.a("LinkedLandView", "registerLinkedAd");
        if (haVar instanceof gz) {
            this.f19480a = (gz) haVar;
            String strF = haVar.f();
            hm hmVar = this.f19481b;
            if (hmVar != null) {
                hmVar.b(strF);
            }
            LinkedAppDetailView linkedAppDetailView = this.d;
            if (linkedAppDetailView != null) {
                linkedAppDetailView.a(strF);
            }
        }
        a(getContext());
    }

    public void a(Context context) {
        this.f19481b = new b(context);
        ViewGroup viewGroup = (ViewGroup) findViewById(R.id.linked_native_view);
        a(context, viewGroup);
        hm hmVar = this.f19481b;
        if (hmVar instanceof b) {
            viewGroup.addView((b) hmVar);
            ((b) this.f19481b).setVideoReleaseListener(this.j);
            this.f19481b.setLinkedLandView(this);
            this.f19481b.setLinkedNativeAd(this.f19480a);
            setNativeVideoViewClickable(this.f19481b);
            this.d = this.f19481b.h();
        }
        i();
    }

    public void a() {
        g();
    }

    private void setviewGroupclickListener(ViewGroup viewGroup) {
        hw.b("LinkedLandView", "setviewGroupclickListener");
        if (viewGroup == null) {
            return;
        }
        viewGroup.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.openalliance.ad.linked.view.c.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                hk linkedVideoControlBridge = c.this.f19481b.getLinkedVideoControlBridge();
                if (linkedVideoControlBridge != null) {
                    linkedVideoControlBridge.x();
                    linkedVideoControlBridge.v();
                }
            }
        });
    }

    private void setNativeVideoViewClickable(hm hmVar) {
        if (hmVar instanceof b) {
            ArrayList arrayList = new ArrayList();
            arrayList.add((b) hmVar);
            a(arrayList);
        }
    }

    private void k() {
        try {
            hw.b("LinkedLandView", "calcWebViewInitialScorllHeight start");
            if (this.e == null) {
                hw.b("LinkedLandView", "calcWebViewInitialScorllHeight failed, view is null");
                return;
            }
            j();
            hw.b("LinkedLandView", "setScrollViewScrollListener");
            this.e.setOnScrollChangeListener(new View.OnScrollChangeListener() { // from class: com.huawei.openalliance.ad.linked.view.c.7
                @Override // android.view.View.OnScrollChangeListener
                public void onScrollChange(View view, int i, int i2, int i3, int i4) {
                    if (c.this.f19481b == null || c.this.f19481b.getVideoView() == null || c.this.h == null) {
                        return;
                    }
                    int height = c.this.f19481b.getVideoView().getHeight();
                    int i5 = i2 - height;
                    hw.a("LinkedLandView", "scrollChange, extraScrollHeight: %s, videoViewHeight: %s, scrollY: %s", Integer.valueOf(i5), Integer.valueOf(height), Integer.valueOf(i2));
                    if (i5 > 0) {
                        return;
                    }
                    c.this.h.setExtraScrollY(i5);
                }
            });
        } catch (Throwable th) {
            hw.d("LinkedLandView", "calcWebViewInitialScorllHeight error: %s", th.getClass().getSimpleName());
        }
    }

    private void j() {
        hm hmVar = this.f19481b;
        if (hmVar == null || hmVar.getVideoView() == null) {
            hw.b("LinkedLandView", "setVideoViewGlobalLayoutListener failed, videoView is null");
        } else {
            hw.b("LinkedLandView", "setVideoViewGlobalLayoutListener");
            this.f19481b.getVideoView().getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.huawei.openalliance.ad.linked.view.c.6
                @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                public void onGlobalLayout() {
                    if (c.this.f19481b == null || c.this.f19481b.getVideoView() == null || c.this.h == null || c.this.e == null) {
                        return;
                    }
                    int scrollY = c.this.e.getScrollY();
                    int height = c.this.f19481b.getVideoView().getHeight();
                    int i = scrollY - height;
                    hw.a("LinkedLandView", "onGlobalLayout, extraScrollHeight: %s, videoViewHeight: %s, scrollY: %s", Integer.valueOf(i), Integer.valueOf(height), Integer.valueOf(scrollY));
                    if (i > 0) {
                        return;
                    }
                    c.this.h.setExtraScrollY(i);
                }
            });
        }
    }

    private void i() {
        ArrayList arrayList = new ArrayList();
        hm hmVar = this.f19481b;
        if (hmVar instanceof b) {
            arrayList.add((b) hmVar);
        }
        this.f19482c = arrayList;
        a(arrayList);
    }

    private void h() {
        List<View> list = this.f19482c;
        if (list == null || list.isEmpty()) {
            return;
        }
        for (View view : this.f19482c) {
            if (view != null) {
                view.setOnClickListener(null);
            }
        }
        setOnClickListener(null);
    }

    private void g() {
        hm hmVar = this.f19481b;
        if (hmVar != null) {
            hmVar.g();
        }
        h();
    }

    private void b(Context context) {
        LayoutInflater.from(context).inflate(R.layout.hiad_linked_land_view, this);
        this.e = (LinkScrollView) findViewById(R.id.hiad_landpage_scroll_view);
    }

    private void a(List<View> list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (View view : list) {
            if (view instanceof b) {
                ((b) view).setCoverClickListener(this.i);
            } else if (view != null) {
                view.setOnClickListener(this.i);
            }
        }
    }

    private void a(Context context, ViewGroup viewGroup) {
        gz gzVar = this.f19480a;
        if (gzVar == null || gzVar.g() == null || this.f19480a.g().getVideoRatio() == null) {
            return;
        }
        Float videoRatio = this.f19480a.g().getVideoRatio();
        if (videoRatio.floatValue() >= 1.0f) {
            return;
        }
        VideoView videoView = this.f19481b.getVideoView();
        float fB = com.huawei.openalliance.ad.utils.d.b(context) / 1.7777778f;
        float fFloatValue = videoRatio.floatValue();
        ViewGroup.LayoutParams layoutParams = videoView.getLayoutParams();
        layoutParams.width = (int) (fFloatValue * fB);
        layoutParams.height = (int) fB;
        videoView.setLayoutParams(layoutParams);
        this.f19481b.setVideoView(videoView);
        setviewGroupclickListener(viewGroup);
    }

    public c(Context context) {
        super(context);
        this.i = new View.OnClickListener() { // from class: com.huawei.openalliance.ad.linked.view.c.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
            }
        };
        this.j = new a() { // from class: com.huawei.openalliance.ad.linked.view.c.4
            @Override // com.huawei.openalliance.ad.linked.view.c.a
            public void a(MediaPlayerAgent mediaPlayerAgent, int i, int i2, int i3) {
                hw.c("LinkedLandView", "onError, code: %s", Integer.valueOf(i2));
                if (c.this.e != null) {
                    c.this.e.scrollTo(0, 0);
                }
                if (c.this.f19481b != null) {
                    c.this.f19481b.i();
                }
            }

            @Override // com.huawei.openalliance.ad.linked.view.c.a
            public void a() {
                hw.a("LinkedLandView", "onVideoComplete");
                if (c.this.f19480a != null) {
                    if ((c.this.f19480a.k() == 1 || c.this.f19480a.k() == 18) && c.this.f19481b != null) {
                        c.this.f19481b.i();
                    }
                }
            }
        };
        this.k = new MediaErrorListener() { // from class: com.huawei.openalliance.ad.linked.view.c.5
            @Override // com.huawei.openalliance.ad.media.listener.MediaErrorListener
            public void onError(MediaPlayerAgent mediaPlayerAgent, int i, int i2, int i3) {
                if (c.this.f19481b != null) {
                    c.this.f19481b.i();
                }
            }
        };
        b(context);
    }
}
