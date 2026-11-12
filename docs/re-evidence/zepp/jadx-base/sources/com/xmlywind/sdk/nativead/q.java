package com.xmlywind.sdk.nativead;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.xmlywind.logger.SigmobLog;
import com.xmlywind.sdk.base.models.BaseAdUnit;
import com.xmlywind.sdk.base.models.ClickCommon;
import com.xmlywind.sdk.base.models.SigImage;
import com.xmlywind.sdk.base.models.SigMacroCommon;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes22.dex */
public class q implements View.OnClickListener, View.OnTouchListener, SigEmptyView.a, c.a, r {
    private static Map<Integer, Integer> d = new HashMap();
    private boolean A;
    private List<View> B;
    private long C;
    public s a;
    public BaseAdUnit b;
    public g c;
    private Context e;
    private SigNativeAdVideo f;
    private SigEmptyView g;
    private List<View> h;
    private List<View> i;
    private c j;
    private SigAppInfoView k;
    private MotionEvent l;
    private b m;
    private n n;
    private boolean o;
    private ViewGroup p;
    private ViewGroup.LayoutParams q;
    private Bitmap r;
    private com.xmlywind.sdk.base.views.e s;
    private boolean t;
    private k u;
    private boolean v;
    private boolean w;
    private boolean x = true;
    private boolean y = false;
    private boolean z;

    private void E() {
        try {
            if (this.s == null && F() != null) {
                com.xmlywind.sdk.base.views.e eVar = new com.xmlywind.sdk.base.views.e(F().getContext(), this.b);
                this.s = eVar;
                eVar.a(new com.xmlywind.sdk.base.views.e.b() { // from class: com.xmlywind.sdk.nativead.q.5
                    @Override // com.xmlywind.sdk.base.views.e.b
                    public void a() {
                        if (q.this.s != null) {
                            q.this.s.dismiss();
                            q.this.s.c();
                            q.this.s = null;
                            q.this.t = false;
                        }
                        q.this.b.getClickCommon().click_scene = "preview";
                        if (q.this.f != null) {
                            q.this.q().c();
                        }
                        q.this.j().a(com.xmlywind.sdk.base.common.a.AD_FOUR_ELEMENTS_CLOSE, 0);
                    }

                    @Override // com.xmlywind.sdk.base.views.e.b
                    public void a(String str, String str2) {
                        q.this.b.getClickCommon().click_area = ClickCommon.CLICK_AREA_BTN;
                        q.this.b.getClickCommon().click_scene = "appinfo";
                        q.this.b.getClickCommon().is_final_click = true;
                        b bVarU = q.this.u();
                        q qVar = q.this;
                        bVarU.a(qVar.b, qVar.e, str, com.xmlywind.sdk.base.a.PREVIEW, str2, true);
                    }

                    @Override // com.xmlywind.sdk.base.views.e.b
                    public void b() {
                        if (q.this.f != null) {
                            q.this.q().a();
                        }
                        q.this.j().a(com.xmlywind.sdk.base.common.a.AD_FOUR_ELEMENTS_SHOW, 0);
                    }
                });
            }
            com.xmlywind.sdk.base.views.e eVar2 = this.s;
            if (eVar2 == null || !eVar2.a() || this.t) {
                return;
            }
            this.b.getClickCommon().click_area = "appinfo";
            this.s.show();
            this.t = true;
        } catch (Exception e) {
            SigmobLog.e("openFourElements fail:" + e.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public View F() {
        View view;
        SigEmptyView sigEmptyView = this.g;
        if (sigEmptyView == null || (view = (View) sigEmptyView.getParent()) == null) {
            return null;
        }
        return view;
    }

    private boolean G() {
        return (TextUtils.isEmpty(this.b.getHtmlData()) && TextUtils.isEmpty(this.b.getHtmlUrl())) ? false : true;
    }

    private View a(List<View> list, MotionEvent motionEvent) {
        for (View view : list) {
            if (com.xmlywind.sdk.common.utils.r.a(view, motionEvent)) {
                return view;
            }
        }
        return null;
    }

    private SigNativeAdVideo a(ViewGroup viewGroup) {
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt instanceof SigNativeAdVideo) {
                return (SigNativeAdVideo) childAt;
            }
        }
        return null;
    }

    private void a(int i, MotionEvent motionEvent) {
        boolean z;
        com.xmlywind.sdk.base.common.d.b(this.b);
        com.xmlywind.sdk.common.utils.q qVarA = com.xmlywind.sdk.common.utils.q.a(F(), motionEvent);
        com.xmlywind.sdk.common.utils.q qVarA2 = com.xmlywind.sdk.common.utils.q.a(F(), this.l);
        this.b.getClickCommon().down = qVarA2;
        this.b.getClickCommon().up = qVarA2;
        this.b.getClickCommon().click_scene = "preview";
        if (i != 1) {
            if (i == 2) {
                boolean zG = G();
                this.b.getClickCommon().click_area = ClickCommon.CLICK_AREA_MATERIAL;
                if (zG) {
                    this.b.getClickCommon().is_final_click = false;
                    j().a(com.xmlywind.sdk.base.common.a.AD_CLICK, 0);
                    v();
                    return;
                }
                z = true;
            } else if (i != 3) {
                return;
            } else {
                z = false;
            }
            if (!z) {
                this.b.getClickCommon().click_area = ClickCommon.CLICK_AREA_BTN;
            }
            if (this.a.g() == 1 || this.b.getMaterial().interaction_type.intValue() != com.xmlywind.sdk.videoAd.f.DownloadType.a()) {
                this.b.getClickCommon().is_final_click = true;
                u().a(this.e, qVarA2, qVarA, com.xmlywind.sdk.base.a.PREVIEW, this.b);
                return;
            }
        } else {
            this.b.getClickCommon().click_area = "appinfo";
        }
        this.b.getClickCommon().is_final_click = false;
        j().a(com.xmlywind.sdk.base.common.a.AD_CLICK, 0);
        E();
    }

    public static void a(View view, int i, int i2) {
        ViewGroup.LayoutParams layoutParams;
        if (view.getParent() instanceof FrameLayout) {
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) view.getLayoutParams();
            layoutParams2.width = i;
            layoutParams2.height = i2;
            layoutParams = layoutParams2;
        } else if (view.getParent() instanceof RelativeLayout) {
            RelativeLayout.LayoutParams layoutParams3 = (RelativeLayout.LayoutParams) view.getLayoutParams();
            layoutParams3.width = i;
            layoutParams3.height = i2;
            layoutParams = layoutParams3;
        } else {
            if (!(view.getParent() instanceof LinearLayout)) {
                return;
            }
            LinearLayout.LayoutParams layoutParams4 = (LinearLayout.LayoutParams) view.getLayoutParams();
            layoutParams4.width = i;
            layoutParams4.height = i2;
            layoutParams = layoutParams4;
        }
        view.setLayoutParams(layoutParams);
        view.requestLayout();
    }

    private SigEmptyView b(ViewGroup viewGroup) {
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt instanceof SigEmptyView) {
                return (SigEmptyView) childAt;
            }
        }
        return null;
    }

    public void A() {
        SigNativeAdVideo sigNativeAdVideo;
        if (this.p != null && (sigNativeAdVideo = this.f) != null) {
            ViewParent parent = sigNativeAdVideo.getParent();
            if (parent != null) {
                ((ViewGroup) parent).removeView(this.f);
            }
            this.p.removeAllViews();
            ViewGroup.LayoutParams layoutParams = this.q;
            if (layoutParams != null) {
                this.p.addView(this.f, layoutParams);
            } else {
                this.p.addView(this.f);
            }
            if (!this.i.contains(this.f)) {
                this.i.add(this.f);
            }
        }
        this.p = null;
        this.q = null;
    }

    public void B() {
        i iVarQ;
        if (this.o || (iVarQ = q()) == null) {
            return;
        }
        iVarQ.b();
    }

    public void C() {
        i iVarQ;
        if (this.o || (iVarQ = q()) == null) {
            return;
        }
        iVarQ.d();
    }

    public k a(Activity activity) {
        if (this.u == null) {
            this.u = new a(activity, this.b);
        }
        return this.u;
    }

    @Override // com.xmlywind.sdk.base.common.k.c
    public void a() {
        if (u() != null) {
            u().a(this.e, this.b);
        }
    }

    public void a(Context context, BaseAdUnit baseAdUnit, s sVar) {
        this.e = context;
        this.b = baseAdUnit;
        this.a = sVar;
        com.xmlywind.sdk.common.utils.g.a(context).a(k().getAd_source_logo(), new com.xmlywind.sdk.common.utils.g.a() { // from class: com.xmlywind.sdk.nativead.q.1
            @Override // com.xmlywind.sdk.common.utils.g.a
            public void a() {
            }

            @Override // com.xmlywind.sdk.common.utils.g.a
            public void a(Bitmap bitmap) {
                q.this.r = bitmap;
            }
        });
    }

    public void a(final ViewGroup viewGroup, final g gVar) {
        final SigNativeAdVideo sigNativeAdVideoA = a(viewGroup);
        if (sigNativeAdVideoA != null) {
            this.f = sigNativeAdVideoA;
        } else {
            com.xmlywind.sdk.common.utils.r.a(this.f);
            this.f = new SigNativeAdVideo(this.e);
        }
        viewGroup.post(new Runnable() { // from class: com.xmlywind.sdk.nativead.q.2
            @Override // java.lang.Runnable
            public void run() {
                int width = viewGroup.getWidth();
                int height = viewGroup.getHeight();
                int iO = q.this.o();
                DisplayMetrics displayMetricsAi = com.xmlywind.sdk.common.a.n().ai();
                int iMax = Math.max(displayMetricsAi.widthPixels, displayMetricsAi.heightPixels) / 2;
                int iR = q.this.r();
                Integer num = (Integer) q.d.get(Integer.valueOf(viewGroup.hashCode()));
                if (num != null) {
                    height = num.intValue();
                } else {
                    q.d.put(Integer.valueOf(viewGroup.hashCode()), Integer.valueOf(viewGroup.getHeight()));
                }
                if (height == 0) {
                    q.a(viewGroup, width, (int) (((double) width) / (((double) iO) / ((double) Math.min(iR, iMax)))));
                }
                if (sigNativeAdVideoA == null) {
                    com.xmlywind.sdk.common.utils.r.a(q.this.f);
                    viewGroup.addView(q.this.f);
                }
            }
        });
        if (!this.i.contains(this.f)) {
            this.i.add(this.f);
        }
        if (!this.b.equals(this.f.getAdUnit())) {
            this.f.a(this);
        }
        final i sigVideoAdController = this.f.getSigVideoAdController();
        if (sigVideoAdController != null) {
            sigVideoAdController.a(new h() { // from class: com.xmlywind.sdk.nativead.q.3
                @Override // com.xmlywind.sdk.nativead.h
                public void a() {
                    q.this.j().a(com.xmlywind.sdk.base.common.a.AD_NATIVE_VIDEO_RESTART, 0);
                }

                @Override // com.xmlywind.sdk.nativead.g
                public void onProgressUpdate(long j, long j2) {
                    g gVar2 = gVar;
                    if (gVar2 != null) {
                        gVar2.onProgressUpdate(j, j2);
                    }
                    q.this.b.getVideoCommon().end_time = sigVideoAdController.h();
                    b bVarU = q.this.u();
                    if (bVarU != null) {
                        for (com.xmlywind.sdk.base.common.e eVar : bVarU.a(j, j2)) {
                            q.this.j().a(eVar.o(), sigVideoAdController.h());
                            eVar.k();
                        }
                    }
                }

                @Override // com.xmlywind.sdk.nativead.g
                public void onVideoAdComplete() {
                    g gVar2 = gVar;
                    if (gVar2 != null) {
                        gVar2.onVideoAdComplete();
                    }
                    q.this.b.getVideoCommon().end_time = sigVideoAdController.e();
                    q.this.b.getVideoCommon().is_last = 1;
                    q.this.j().a(com.xmlywind.sdk.base.common.a.AD_COMPLETE, sigVideoAdController.h());
                    q.this.j().a(com.xmlywind.sdk.base.common.a.AD_VIDEO_LINK, 0);
                    q.this.y = false;
                    q.this.w = false;
                }

                @Override // com.xmlywind.sdk.nativead.g
                public void onVideoAdPaused() {
                    g gVar2 = gVar;
                    if (gVar2 != null) {
                        gVar2.onVideoAdPaused();
                    }
                    q.this.y = true;
                    q.this.j().a(com.xmlywind.sdk.base.common.a.AD_NATIVE_VIDEO_PAUSE, 0);
                    q.this.j().a(com.xmlywind.sdk.base.common.a.AD_VIDEO_LINK, 0);
                }

                @Override // com.xmlywind.sdk.nativead.g
                public void onVideoAdResume() {
                    g gVar2 = gVar;
                    if (gVar2 != null) {
                        gVar2.onVideoAdResume();
                    }
                    q.this.y = false;
                    q.this.b.getVideoCommon().type = 2;
                    q.this.b.getVideoCommon().is_first = 0;
                    q.this.b.getVideoCommon().begin_time = sigVideoAdController.h();
                    q.this.w = false;
                    q.this.j().a(com.xmlywind.sdk.base.common.a.AD_NATIVE_VIDEO_START, sigVideoAdController.h());
                }

                @Override // com.xmlywind.sdk.nativead.g
                public void onVideoAdStartPlay() {
                    View viewF = q.this.F();
                    if (viewF != null) {
                        q.this.b.setAdSize(viewF.getWidth(), viewF.getHeight());
                    }
                    q.this.b.getVideoCommon().video_time = sigVideoAdController.e();
                    q.this.b.getVideoCommon().is_first = 1;
                    q.this.b.getVideoCommon().is_last = 0;
                    q.this.b.getVideoCommon().end_time = 0;
                    q.this.b.getVideoCommon().is_auto_play = q.this.u().j() ? 1 : 2;
                    if (q.this.o) {
                        q.this.b.getVideoCommon().scene = 3;
                    } else {
                        q.this.b.getVideoCommon().scene = 1;
                    }
                    if (q.this.x) {
                        q.this.b.getVideoCommon().type = 1;
                        q.this.x = false;
                    } else {
                        q.this.b.getVideoCommon().type = 3;
                    }
                    g gVar2 = gVar;
                    if (gVar2 != null) {
                        gVar2.onVideoAdStartPlay();
                    }
                    q.this.w = false;
                    q.this.y = false;
                    q.this.j().a(com.xmlywind.sdk.base.common.a.AD_NATIVE_VIDEO_START, 0);
                }

                @Override // com.xmlywind.sdk.nativead.g
                public void onVideoError(int i, int i2) {
                    q.this.w = false;
                    q.this.y = false;
                    g gVar2 = gVar;
                    if (gVar2 != null) {
                        gVar2.onVideoError(i, i2);
                    }
                }

                @Override // com.xmlywind.sdk.nativead.g
                public void onVideoLoad() {
                    g gVar2 = gVar;
                    if (gVar2 != null) {
                        gVar2.onVideoLoad();
                    }
                }
            });
        }
    }

    public void a(ViewGroup viewGroup, List<View> list, n nVar) {
        int i;
        s sVarL;
        String str;
        SigEmptyView sigEmptyView;
        ViewGroup.LayoutParams layoutParams;
        if (viewGroup == null) {
            if (nVar == null) {
                return;
            }
            i = 600502;
            sVarL = l();
            str = "ad container is empty";
        } else {
            if (list != null && !list.isEmpty()) {
                u().a(new com.xmlywind.sdk.base.common.s() { // from class: com.xmlywind.sdk.nativead.q.4
                    @Override // com.xmlywind.sdk.base.common.s
                    public void a() {
                        if (q.this.n != null) {
                            q.this.n.onAdClicked(q.this.a);
                        }
                    }
                });
                this.h = list;
                if (this.i == null) {
                    this.i = new ArrayList();
                }
                if (this.h.contains(viewGroup)) {
                    this.h.remove(viewGroup);
                }
                u().a(viewGroup.getContext(), this.b, (com.xmlywind.sdk.base.views.e.b) null);
                viewGroup.setDescendantFocusability(393216);
                this.n = nVar;
                n().a(this.e, (Map<String, Object>) null, this.b);
                SigEmptyView sigEmptyView2 = this.g;
                if (sigEmptyView2 == null) {
                    SigEmptyView sigEmptyViewB = b(viewGroup);
                    this.g = sigEmptyViewB;
                    if (sigEmptyViewB == null) {
                        sigEmptyView = new SigEmptyView(this.e);
                        this.g = sigEmptyView;
                        layoutParams = new ViewGroup.LayoutParams(0, 0);
                    }
                    this.g.a(u().h(), u().i(), this);
                    a(list, this);
                    return;
                }
                com.xmlywind.sdk.common.utils.r.a(sigEmptyView2);
                sigEmptyView = this.g;
                layoutParams = new ViewGroup.LayoutParams(0, 0);
                viewGroup.addView(sigEmptyView, layoutParams);
                this.g.a(u().h(), u().i(), this);
                a(list, this);
                return;
            }
            if (nVar == null) {
                return;
            }
            i = 600503;
            sVarL = l();
            str = "click view list is empty";
        }
        nVar.onAdError(i, str, sVarL);
    }

    @Override // com.xmlywind.sdk.base.common.k.b
    public void a(BaseAdUnit baseAdUnit) {
    }

    @Override // com.xmlywind.sdk.base.common.k.b
    public void a(BaseAdUnit baseAdUnit, String str) {
    }

    public void a(List<ImageView> list, int i) {
        List<SigImage> listF = l().f();
        if (list == null || listF == null) {
            return;
        }
        int iMin = Math.min(list.size(), listF.size());
        for (int i2 = 0; i2 < iMin; i2++) {
            SigImage sigImage = listF.get(i2);
            ImageView imageView = list.get(i2);
            if (!this.i.contains(imageView)) {
                this.i.add(imageView);
            }
            List<View> list2 = this.B;
            if (list2 == null) {
                this.B = new ArrayList();
            } else {
                list2.clear();
            }
            this.B.add(imageView);
            com.xmlywind.sdk.base.common.d.a(this.e).a(sigImage.imageUrl).a(i).b(i).a(imageView);
        }
    }

    public void a(List<View> list, View.OnTouchListener onTouchListener) {
        if (list != null) {
            for (View view : list) {
                view.setOnClickListener(null);
                view.setOnTouchListener(null);
                view.setOnTouchListener(onTouchListener);
            }
        }
    }

    @Override // com.xmlywind.sdk.nativead.SigEmptyView.a
    public void a(boolean z) {
        if (z == this.v) {
            return;
        }
        if (!this.o) {
            com.xmlywind.sdk.base.common.d.f().e(this.b);
            if (z) {
                n nVar = this.n;
                if (nVar != null) {
                    nVar.onAdShow(l());
                }
                j().a(com.xmlywind.sdk.base.common.a.AD_NATIVE_SHOW, 0);
            }
        }
        this.v = z;
    }

    @Override // com.xmlywind.sdk.base.common.k.c
    public void b() {
        if (u() != null) {
            u().b(this.e, this.b);
        }
    }

    @Override // com.xmlywind.sdk.base.common.k.b
    public void b(BaseAdUnit baseAdUnit) {
    }

    @Override // com.xmlywind.sdk.nativead.c.a
    public void c() {
        SigmobLog.d("----------onAdDetailShow----------");
        if (u() != null) {
            u().c(this.e, this.b);
        }
        this.o = true;
        n nVar = this.n;
        if (nVar != null) {
            nVar.onAdDetailShow(this.a);
        }
    }

    @Override // com.xmlywind.sdk.base.common.k.b
    public void c(BaseAdUnit baseAdUnit) {
        SigNativeAdVideo sigNativeAdVideo = this.f;
        if (sigNativeAdVideo != null) {
            ViewGroup.LayoutParams layoutParams = ((View) sigNativeAdVideo.getParent()).getLayoutParams();
            SigmobLog.d("visibilityStatusChange() called with: isVisible = [" + layoutParams.width + ":" + layoutParams.height + "]");
        }
    }

    @Override // com.xmlywind.sdk.nativead.c.a
    public void d() {
        if (u() != null) {
            u().e(this.e, this.b);
        }
        n nVar = this.n;
        if (nVar != null) {
            nVar.onAdClicked(this.a);
        }
    }

    @Override // com.xmlywind.sdk.base.common.k.b
    public void d(BaseAdUnit baseAdUnit) {
    }

    @Override // com.xmlywind.sdk.nativead.c.a
    public void e() {
        n nVar = this.n;
        if (nVar != null) {
            nVar.onAdDetailDismiss(this.a);
        }
        this.o = false;
        if (u() != null) {
            u().d(this.e, this.b);
        }
        A();
        SigAppInfoView sigAppInfoView = this.k;
        if (sigAppInfoView != null) {
            sigAppInfoView.setVisibility(0);
        }
        this.j.c(this.b);
    }

    @Override // com.xmlywind.sdk.base.common.k.b
    public void e(BaseAdUnit baseAdUnit) {
    }

    @Override // com.xmlywind.sdk.nativead.SigEmptyView.a
    public void f() {
        if (this.z) {
            q().a();
            SigmobLog.d("-----------onAdViewPauseImpression---------");
            this.z = false;
        }
    }

    @Override // com.xmlywind.sdk.nativead.SigEmptyView.a
    public void g() {
        SigNativeAdVideo sigNativeAdVideo = this.f;
        if (sigNativeAdVideo == null || sigNativeAdVideo.getParent() == null || this.o || this.z || this.w || !u().j()) {
            return;
        }
        this.z = true;
        this.v = false;
        q().c();
        SigmobLog.d("------------onAdViewStartImpression------------");
    }

    @Override // com.xmlywind.sdk.nativead.SigEmptyView.a
    public void h() {
        if (this.o || this.e == null || !this.A) {
            return;
        }
        List<View> list = this.i;
        if (list != null) {
            list.clear();
        }
        this.A = false;
        SigmobLog.d("------------onAdViewRemoved----------" + hashCode());
        i iVarQ = q();
        if (iVarQ != null) {
            iVarQ.a();
        }
        this.z = false;
        j().a(com.xmlywind.sdk.base.common.a.AD_HIDE, 0);
        if (this.x || this.y) {
            return;
        }
        j().a(com.xmlywind.sdk.base.common.a.AD_VIDEO_LINK, 0);
    }

    @Override // com.xmlywind.sdk.nativead.SigEmptyView.a
    public void i() {
        if (this.A || this.o) {
            return;
        }
        this.A = true;
        SigmobLog.d("----------onAdViewShow------------" + hashCode());
        this.w = false;
        this.z = false;
        View viewF = F();
        if (viewF != null) {
            viewF.setOnTouchListener(this);
        }
        SigNativeAdVideo sigNativeAdVideo = this.f;
        if (sigNativeAdVideo != null && !this.i.contains(sigNativeAdVideo)) {
            this.i.add(this.f);
        } else if (this.B != null) {
            if (this.i.isEmpty()) {
                this.i.addAll(this.B);
            } else {
                for (View view : this.B) {
                    if (!this.i.contains(view)) {
                        this.i.add(view);
                    }
                }
            }
        }
        j().a(com.xmlywind.sdk.base.common.a.AD_START, 0);
    }

    public com.xmlywind.sdk.base.common.v j() {
        Context context;
        com.xmlywind.sdk.base.common.v sessionManager = this.b.getSessionManager();
        if (sessionManager != null || (context = this.e) == null) {
            return sessionManager;
        }
        e eVar = new e(context.getApplicationContext());
        eVar.a(this.e, this.b);
        return eVar;
    }

    @Override // com.xmlywind.sdk.nativead.r
    public BaseAdUnit k() {
        return this.b;
    }

    @Override // com.xmlywind.sdk.nativead.r
    public s l() {
        return this.a;
    }

    @Override // com.xmlywind.sdk.nativead.r
    public SigAppInfoView m() {
        if (this.k == null && this.b.getadPrivacy() != null) {
            SigAppInfoView sigAppInfoView = new SigAppInfoView(this.e);
            this.k = sigAppInfoView;
            sigAppInfoView.setOnTouchListener(this);
            this.k.a(this.b.getAppVersion(), this.b.getCompanyName());
        }
        return this.k;
    }

    public c n() {
        if (this.j == null) {
            this.j = new c(this);
        }
        return this.j;
    }

    public int o() {
        int width;
        View viewF = F();
        if (this.f == null || viewF == null || (width = viewF.getWidth()) <= 0) {
            return 1280;
        }
        return width;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z = false;
        if (motionEvent == null) {
            return false;
        }
        if ((motionEvent.getAction() == 0 && this.C > 0 && System.currentTimeMillis() - this.C < 500) || this.n == null) {
            return false;
        }
        if (motionEvent.getAction() == 1) {
            this.b.getClickCommon().click_scene = "preview";
            if (view == this.k) {
                a(1, motionEvent);
            } else {
                int i = 3;
                if (a(this.i, motionEvent) != null) {
                    SigNativeAdVideo sigNativeAdVideo = this.f;
                    if (sigNativeAdVideo != null && sigNativeAdVideo.a(motionEvent)) {
                        z = true;
                    }
                    if (!z) {
                        i = 2;
                    }
                } else {
                    if (a(this.h, motionEvent) == null) {
                        return false;
                    }
                    this.b.getClickCommon().click_scene = "preview";
                    this.b.getClickCommon().click_area = ClickCommon.CLICK_AREA_BTN;
                }
                a(i, motionEvent);
            }
        } else {
            this.C = System.currentTimeMillis();
            this.l = motionEvent;
        }
        return true;
    }

    public View p() {
        return this.f;
    }

    public i q() {
        if (p() != null) {
            return this.f.getSigVideoAdController();
        }
        return null;
    }

    public int r() {
        View viewF = F();
        if (p() == null || viewF == null || viewF.getWidth() <= 0) {
            return 720;
        }
        return (int) (((double) viewF.getWidth()) / this.b.getAdPercent());
    }

    public void s() {
        a(this.i, (View.OnTouchListener) null);
        a(this.h, (View.OnTouchListener) null);
        this.i = null;
        this.h = null;
        this.n = null;
        this.c = null;
    }

    public void t() {
        s();
        SigNativeAdVideo sigNativeAdVideo = this.f;
        if (sigNativeAdVideo != null) {
            com.xmlywind.sdk.common.utils.r.a(sigNativeAdVideo);
            this.f.c();
            this.f = null;
        }
        BaseAdUnit baseAdUnit = this.b;
        if (baseAdUnit != null && baseAdUnit.getSessionManager() != null) {
            j().a(com.xmlywind.sdk.base.common.a.AD_HIDE, 0);
            j().a();
        }
        u().c();
        com.xmlywind.sdk.base.views.e eVar = this.s;
        if (eVar != null) {
            eVar.dismiss();
            this.s.c();
            this.s = null;
        }
        k kVar = this.u;
        if (kVar != null && (kVar instanceof a)) {
            ((a) kVar).b();
            this.u = null;
        }
        SigEmptyView sigEmptyView = this.g;
        if (sigEmptyView != null) {
            com.xmlywind.sdk.common.utils.r.a(sigEmptyView);
            this.g = null;
        }
        this.j = null;
        this.e = null;
    }

    @Override // com.xmlywind.sdk.nativead.r
    public b u() {
        if (this.m == null) {
            this.m = (b) this.b.getAdConfig();
        }
        return this.m;
    }

    public void v() {
        Bundle bundle = new Bundle();
        if (this.f != null && u().d()) {
            ViewAttr viewAttr = new ViewAttr();
            int[] iArr = new int[2];
            this.f.getLocationOnScreen(iArr);
            viewAttr.a(iArr[0]);
            viewAttr.b(iArr[1]);
            viewAttr.c(this.f.getMeasuredWidth());
            viewAttr.d(this.f.getMeasuredHeight());
            bundle.putParcelable("attr", viewAttr);
            this.p = (ViewGroup) this.f.getParent();
            this.q = this.f.getLayoutParams();
            o.a(this.f);
            SigMacroCommon macroCommon = this.b.getMacroCommon();
            if (macroCommon != null) {
                macroCommon.addMarcoKey(SigMacroCommon._SCENE_, "3");
            }
            this.o = true;
        }
        SigAppInfoView sigAppInfoView = this.k;
        if (sigAppInfoView != null) {
            sigAppInfoView.setVisibility(4);
        }
        n().a(this.e, this.b, bundle);
    }

    public String w() {
        return k().getCTAText();
    }

    public Bitmap x() {
        return this.r;
    }

    public void y() {
        i iVarQ;
        if (this.o || (iVarQ = q()) == null) {
            return;
        }
        iVarQ.c();
    }

    public void z() {
        i iVarQ;
        if (this.o || (iVarQ = q()) == null) {
            return;
        }
        this.w = true;
        iVarQ.a();
    }
}
