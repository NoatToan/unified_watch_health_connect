package com.huawei.openalliance.ad.views;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.huawei.hms.ads.AdCloseBtnClickListener;
import com.huawei.hms.ads.AdFeedbackExtraListener;
import com.huawei.hms.ads.AdFeedbackListener;
import com.huawei.hms.ads.ChoicesView;
import com.huawei.hms.ads.DislikeAdListener;
import com.huawei.hms.ads.dynamic.ObjectWrapper;
import com.huawei.hms.ads.uiengine.IRemoteCreator;
import com.huawei.hms.ads.uiengine.common.IMediaStateApiTransfer;
import com.huawei.hms.ads.uiengine.common.MediaStateApi;
import com.huawei.openalliance.ad.R;
import com.huawei.openalliance.ad.activity.ComplianceActivity;
import com.huawei.openalliance.ad.activity.FeedbackActivity;
import com.huawei.openalliance.ad.beans.inner.AdContentData;
import com.huawei.openalliance.ad.bx;
import com.huawei.openalliance.ad.ca;
import com.huawei.openalliance.ad.cc;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.openalliance.ad.constant.NativeSdkCallbackMethods;
import com.huawei.openalliance.ad.constant.NotifyMessageNames;
import com.huawei.openalliance.ad.constant.ParamConstants;
import com.huawei.openalliance.ad.db.bean.ContentRecord;
import com.huawei.openalliance.ad.de;
import com.huawei.openalliance.ad.df;
import com.huawei.openalliance.ad.download.app.AppStatus;
import com.huawei.openalliance.ad.fp;
import com.huawei.openalliance.ad.ft;
import com.huawei.openalliance.ad.hi;
import com.huawei.openalliance.ad.hw;
import com.huawei.openalliance.ad.inter.data.AppInfo;
import com.huawei.openalliance.ad.inter.data.FeedbackInfo;
import com.huawei.openalliance.ad.inter.data.IAd;
import com.huawei.openalliance.ad.inter.data.INativeAd;
import com.huawei.openalliance.ad.inter.data.MaterialClickInfo;
import com.huawei.openalliance.ad.inter.data.VideoInfo;
import com.huawei.openalliance.ad.jm;
import com.huawei.openalliance.ad.jq;
import com.huawei.openalliance.ad.jt;
import com.huawei.openalliance.ad.ju;
import com.huawei.openalliance.ad.jv;
import com.huawei.openalliance.ad.jx;
import com.huawei.openalliance.ad.jz;
import com.huawei.openalliance.ad.lu;
import com.huawei.openalliance.ad.lw;
import com.huawei.openalliance.ad.mh;
import com.huawei.openalliance.ad.mp;
import com.huawei.openalliance.ad.mq;
import com.huawei.openalliance.ad.mw;
import com.huawei.openalliance.ad.nm;
import com.huawei.openalliance.ad.oy;
import com.huawei.openalliance.ad.pa;
import com.huawei.openalliance.ad.pc;
import com.huawei.openalliance.ad.pl;
import com.huawei.openalliance.ad.sz;
import com.huawei.openalliance.ad.tz;
import com.huawei.openalliance.ad.uriaction.interfaces.HandleUrlCallBack;
import com.huawei.openalliance.ad.utils.as;
import com.huawei.openalliance.ad.utils.bk;
import com.huawei.openalliance.ad.utils.bm;
import com.huawei.openalliance.ad.utils.br;
import com.huawei.openalliance.ad.utils.db;
import com.huawei.openalliance.ad.utils.dg;
import com.huawei.openalliance.ad.utils.dk;
import com.huawei.openalliance.ad.utils.dq;
import com.huawei.openalliance.ad.views.interfaces.IAppDownloadButton;
import com.huawei.openalliance.ad.views.interfaces.INativeVideoView;
import com.huawei.openalliance.ad.views.interfaces.INativeWindowImageView;
import com.huawei.openalliance.ad.views.interfaces.IPPSNativeView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes12.dex */
public class PPSNativeView extends v implements jm.a, lu, IPPSNativeView {
    private AdCloseBtnClickListener A;
    private String B;
    private String C;
    private MaterialClickInfo D;
    private com.huawei.hms.ads.a.EnumC0090a E;
    private mq F;
    private IRemoteCreator G;
    private bx H;
    private View I;
    private jx J;
    private pc K;
    private ContentRecord L;
    private boolean M;
    private g N;
    private Map<String, IAppDownloadButton> O;
    private View.OnClickListener P;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected mh f20925a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f20926b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private HandleUrlCallBack f20927c;
    private ChoicesView d;
    private int e;
    private View f;
    private ImageView g;
    private com.huawei.hms.ads.a h;
    private boolean i;
    private boolean j;
    private nm k;
    private jm l;
    private com.huawei.openalliance.ad.inter.data.e m;
    private OnBtnClickListener n;
    private OnNativeAdClickListener o;
    private OnNativeAdShowListener p;
    private OnNativeAdStatusChangedListener q;
    private b r;
    private INativeVideoView s;
    private INativeWindowImageView t;
    private List<View> u;
    private boolean v;
    private final String w;
    private boolean x;
    private DislikeAdListener y;
    private AdFeedbackListener z;

    public interface OnBtnClickListener {
        void onClick();
    }

    public interface OnNativeAdClickListener {
        void onClick(View view);
    }

    public interface OnNativeAdShowListener {
        void onAdShow();
    }

    public interface OnNativeAdStatusChangedListener {
        void onStatusChanged();
    }

    public interface b {
        void a();
    }

    @Override // com.huawei.openalliance.ad.lu
    public View getOpenMeasureView() {
        return this;
    }

    public void unregister(IAppDownloadButton iAppDownloadButton) {
        if (iAppDownloadButton != null) {
            iAppDownloadButton.setPpsNativeView(null);
            iAppDownloadButton.setNativeAd(null);
        }
    }

    public void unregister() {
        s();
        hi.a(getContext()).b();
        if (!this.i) {
            a(this.f);
            this.f = null;
            this.d = null;
            a(this.h);
            this.h = null;
        }
        mh mhVar = this.f20925a;
        if (mhVar != null) {
            mhVar.b();
        }
        jx jxVar = this.J;
        if (jxVar != null) {
            jxVar.b();
            this.J = null;
        }
    }

    public void showTransparencyDialog(View view, int[] iArr) {
        if (view == null) {
            hw.c("PPSNativeView", "anchorView is null");
        }
        try {
            com.huawei.openalliance.ad.inter.data.e eVar = this.m;
            if (eVar == null) {
                hw.c("PPSNativeView", "adInfo is null");
                return;
            }
            ContentRecord contentRecordA = pl.a(eVar);
            if (a(iArr)) {
                ca.a(getContext(), view, iArr, contentRecordA);
            } else {
                ca.a(getContext(), view, contentRecordA);
            }
        } catch (Throwable th) {
            hw.c("PPSNativeView", "showTransparencyDialog has exception %s", th.getClass().getSimpleName());
        }
    }

    public void showTransparencyDialog(View view) {
        showTransparencyDialog(view, null);
    }

    public void showFeedback(View view) {
        a((Context) null, view);
    }

    public void showAdvertiserInfoDialog(View view, boolean z) {
        String str;
        if (view == null) {
            hw.c("PPSNativeView", "anchorView is null");
        }
        try {
            com.huawei.openalliance.ad.inter.data.e eVar = this.m;
            if (eVar == null) {
                str = "adInfo is null";
            } else {
                ContentRecord contentRecordA = pl.a(eVar);
                if (!bm.a(contentRecordA.aU())) {
                    ComplianceActivity.a(getContext(), view, contentRecordA, z);
                    return;
                }
                str = "advertiser Info is null";
            }
            hw.c("PPSNativeView", str);
        } catch (Throwable th) {
            hw.c("PPSNativeView", "showAdvertiserInfoDialog has exception %s", th.getClass().getSimpleName());
        }
    }

    public void setVideoInfo(VideoInfo videoInfo) {
        this.k.a(videoInfo);
    }

    public void setVideoAutoPlayNet(int i) {
        fp.b(getContext().getApplicationContext()).l(i);
    }

    public void setOnNativeAdStatusChangedListener(OnNativeAdStatusChangedListener onNativeAdStatusChangedListener) {
        this.q = onNativeAdStatusChangedListener;
    }

    public void setOnNativeAdShowListener(OnNativeAdShowListener onNativeAdShowListener) {
        this.p = onNativeAdShowListener;
    }

    public void setOnNativeAdImpressionListener(b bVar) {
        this.r = bVar;
    }

    public void setOnNativeAdClickListener(OnNativeAdClickListener onNativeAdClickListener) {
        this.o = onNativeAdClickListener;
    }

    public void setOnBtnClickListener(OnBtnClickListener onBtnClickListener) {
        this.n = onBtnClickListener;
    }

    public void setNativeAd(com.huawei.openalliance.ad.inter.data.e eVar) {
        this.m = eVar;
    }

    public void setMetaData(String str) {
        this.k.c(str);
    }

    public void setMaterialClickInfo(MaterialClickInfo materialClickInfo) {
        this.D = materialClickInfo;
    }

    public void setIsCustomDislikeThisAdEnabled(boolean z) {
        hw.a("PPSNativeView", "isCustomDislikeThisAdEnabled = " + z);
        if (this.i) {
            hw.c("PPSNativeView", "china rom should not call this method and isCustomDislikeThisAdEnabled = " + z);
            return;
        }
        this.x = z;
        if (z) {
            hw.a("PPSNativeView", "dont like default feedback!");
            return;
        }
        hw.a("PPSNativeView", "like default feedback!");
        ChoicesView choicesView = this.d;
        if (choicesView != null) {
            choicesView.a();
        }
    }

    public void setDislikeAdListener(DislikeAdListener dislikeAdListener) {
        if (this.i) {
            hw.c("PPSNativeView", "china rom should not call setChoiceViewPosition method");
        } else {
            this.y = dislikeAdListener;
        }
    }

    public void setChoiceViewPosition(int i) {
        hw.a("PPSNativeView", "setChoiceViewPosition option = %d", Integer.valueOf(i));
        if (this.m == null) {
            this.e = i;
        } else {
            a(i);
        }
    }

    public void setAdFeedbackListener(AdFeedbackListener adFeedbackListener) {
        hw.b("PPSNativeView", "setAdFeedbackListener is extra: %s", Boolean.valueOf(adFeedbackListener instanceof AdFeedbackExtraListener));
        this.z = adFeedbackListener;
    }

    public void setAdContainerSizeMatched(String str) {
        this.k.b(str);
    }

    public void setAdCloseBtnClickListener(AdCloseBtnClickListener adCloseBtnClickListener) {
        this.A = adCloseBtnClickListener;
    }

    public void resume() {
        try {
            com.huawei.hms.ads.uiengine.e eVarB = com.huawei.openalliance.ad.e.b();
            View view = this.I;
            if (view == null || eVarB == null) {
                return;
            }
            eVarB.b(ObjectWrapper.wrap(view), (Bundle) null);
        } catch (Throwable th) {
            hw.c("PPSNativeView", "resumeVideo err: %s", th.getClass().getSimpleName());
        }
    }

    public boolean register(IAppDownloadButton iAppDownloadButton) {
        boolean nativeAd;
        if (this.m == null) {
            throw new IllegalStateException("Register INativeAd first");
        }
        if (iAppDownloadButton != null) {
            iAppDownloadButton.setPpsNativeView(this);
            nativeAd = iAppDownloadButton.setNativeAd(this.m);
            iAppDownloadButton.setHandleUrlCallBack(this.f20927c);
        } else {
            nativeAd = false;
        }
        if (hw.a()) {
            hw.a("PPSNativeView", "register downloadbutton, succ:%s", Boolean.valueOf(nativeAd));
        }
        Map<String, IAppDownloadButton> map = this.O;
        if (map != null && !map.containsKey(this.m.getContentId()) && !dg.b(this.m.getContentId())) {
            this.O.put(this.m.getContentId(), iAppDownloadButton);
        }
        return nativeAd;
    }

    public void register(List<INativeAd> list) {
        hw.b("PPSNativeView", "register, adList: %s", list);
        if (bm.a(list)) {
            return;
        }
        Context applicationContext = getContext().getApplicationContext();
        if (!a(applicationContext, list.get(0).getSlotId())) {
            register(list.get(0));
            return;
        }
        if (!as.k()) {
            hw.c("PPSNativeView", "uiengine ver is lower, can't show multi ads");
            return;
        }
        this.N = new g(applicationContext, list.get(0).getSlotId());
        for (int i = 0; i < list.size(); i++) {
            a(list.get(i));
            if (i != list.size() - 1) {
                this.N.a();
            }
        }
        addView(this.N);
    }

    public void register(INativeAd iNativeAd, List<View> list, INativeWindowImageView iNativeWindowImageView) {
        register(iNativeAd);
        this.t = iNativeWindowImageView;
        if (iNativeWindowImageView != null) {
            iNativeWindowImageView.setNativeAd(iNativeAd);
            setWindowImageViewClickable(this.t);
        }
        this.u = list;
        a(list);
    }

    public void register(INativeAd iNativeAd, List<View> list, INativeVideoView iNativeVideoView) {
        register(iNativeAd);
        this.s = iNativeVideoView;
        if (iNativeVideoView != null) {
            iNativeVideoView.setPpsNativeView(this);
            iNativeVideoView.setNativeAd(iNativeAd);
            setNativeVideoViewClickable(iNativeVideoView);
            jx jxVar = this.J;
            if (jxVar != null) {
                jxVar.a(iNativeVideoView.getVideoView());
            }
        }
        this.u = list;
        a(list);
    }

    public void register(INativeAd iNativeAd, List<View> list) {
        if (iNativeAd == null) {
            return;
        }
        this.m = (com.huawei.openalliance.ad.inter.data.e) iNativeAd;
        getMonitor();
        p();
        if (!o()) {
            this.B = iNativeAd.getAdChoiceUrl();
            this.C = iNativeAd.getAdChoiceIcon();
            l();
        }
        this.l.b(this.m.getMinEffectiveShowTime(), this.m.getMinEffectiveShowRatio());
        this.k.a(this.m);
        u();
        this.k.b();
        this.u = list;
        a(list);
        a((IAd) iNativeAd);
    }

    public void register(INativeAd iNativeAd, INativeWindowImageView iNativeWindowImageView) {
        register(iNativeAd);
        this.t = iNativeWindowImageView;
        if (iNativeWindowImageView != null) {
            iNativeWindowImageView.setNativeAd(iNativeAd);
            setWindowImageViewClickable(this.t);
        }
        w();
    }

    public void register(INativeAd iNativeAd, INativeVideoView iNativeVideoView) {
        register(iNativeAd);
        this.s = iNativeVideoView;
        if (iNativeVideoView != null) {
            iNativeVideoView.setPpsNativeView(this);
            iNativeVideoView.setNativeAd(iNativeAd);
            setNativeVideoViewClickable(iNativeVideoView);
            jx jxVar = this.J;
            if (jxVar != null) {
                jxVar.a(iNativeVideoView.getVideoView());
            }
        }
        w();
    }

    public void register(INativeAd iNativeAd) {
        if (iNativeAd == null) {
            return;
        }
        a(iNativeAd);
    }

    public void pause() {
        try {
            com.huawei.hms.ads.uiengine.e eVarB = com.huawei.openalliance.ad.e.b();
            View view = this.I;
            if (view == null || eVarB == null) {
                return;
            }
            eVarB.a(ObjectWrapper.wrap(view), (Bundle) null);
        } catch (Throwable th) {
            hw.c("PPSNativeView", "pauseVideo err: %s", th.getClass().getSimpleName());
        }
    }

    @Override // android.view.View
    protected void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        jm jmVar = this.l;
        if (jmVar != null) {
            jmVar.j();
        }
        jx jxVar = this.J;
        if (jxVar != null) {
            jxVar.c();
        }
    }

    public void onViewUpdate() {
        if (hw.a()) {
            hw.a("PPSNativeView", "manual updateView");
        }
        this.l.onGlobalLayout();
    }

    public void onFeedback(int i, List<FeedbackInfo> list) {
        hw.b("PPSNativeView", "onFeedback, type: %s", Integer.valueOf(i));
        if (1 == i || 3 == i) {
            this.k.b(list);
            x();
        } else if (i == 2) {
            this.k.c(list);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f20926b = false;
        hw.b("PPSNativeView", "onDetechedFromWindow");
        jm jmVar = this.l;
        if (jmVar != null) {
            jmVar.i();
        }
        mh mhVar = this.f20925a;
        if (mhVar != null) {
            mhVar.b();
        }
    }

    public void onClose(List<String> list) {
        hw.b("PPSNativeView", "onClose with keyWords");
        this.k.a(list);
        x();
    }

    public void onClose() {
        hw.b("PPSNativeView", "onClose");
        onClose(null);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f20926b = true;
        jm jmVar = this.l;
        if (jmVar != null) {
            jmVar.h();
        }
        com.huawei.openalliance.ad.inter.data.e eVar = this.m;
        if (eVar != null) {
            a((IAd) eVar);
        }
        if (this.L != null) {
            j();
        }
        oy.a(getContext()).b(getContext());
    }

    public boolean i() {
        return this.M;
    }

    public void hideTransparencyDialog() {
        hideFeedback();
    }

    public void hideAdvertiserInfoDialog() {
        hideFeedback();
    }

    @Override // com.huawei.openalliance.ad.views.interfaces.IPPSNativeView
    public void h() {
        if (this.n != null) {
            hw.b("PPSNativeView", "notifyBtnClick");
            this.n.onClick();
        }
    }

    public void gotoWhyThisAdPage() {
        if (this.m != null) {
            com.huawei.openalliance.ad.utils.d.a(getContext(), this.m);
        } else {
            hw.c("PPSNativeView", "gotoWhyThisAdPage nativeAd is null");
        }
    }

    @Override // com.huawei.openalliance.ad.views.v
    protected String getTAG() {
        return "PPSNativeView_" + hashCode();
    }

    public com.huawei.openalliance.ad.inter.data.e getNativeAd() {
        return this.m;
    }

    public View getFeedBackView() {
        try {
            com.huawei.hms.ads.uiengine.e eVarB = com.huawei.openalliance.ad.e.b();
            View view = this.I;
            if (view == null || eVarB == null) {
                return null;
            }
            return (View) ObjectWrapper.unwrap(eVarB.a(ObjectWrapper.wrap(view)));
        } catch (Throwable th) {
            hw.c("PPSNativeView", "get anchor view err: %s", th.getClass().getSimpleName());
            return null;
        }
    }

    public MaterialClickInfo getClickInfo() {
        return this.D;
    }

    @Override // com.huawei.openalliance.ad.views.interfaces.IPPSNativeView
    public String getAdTag() {
        if (!t() || this.m.aj() == null) {
            return null;
        }
        return this.m.aj().a();
    }

    public mq getAdSessionAgent() {
        return this.F;
    }

    @Override // com.huawei.openalliance.ad.views.interfaces.f
    public IAd getAd() {
        return getNativeAd();
    }

    public void g() {
        AdCloseBtnClickListener adCloseBtnClickListener = this.A;
        if (adCloseBtnClickListener != null) {
            adCloseBtnClickListener.onCloseBtnClick();
        }
    }

    public void focusStop() {
        try {
            com.huawei.hms.ads.uiengine.e eVarB = com.huawei.openalliance.ad.e.b();
            View view = this.I;
            if (view == null || eVarB == null) {
                return;
            }
            eVarB.d(ObjectWrapper.wrap(view), null);
        } catch (Throwable th) {
            hw.c("PPSNativeView", "focusStop err: %s", th.getClass().getSimpleName());
        }
    }

    public void focusPlay() {
        try {
            com.huawei.hms.ads.uiengine.e eVarB = com.huawei.openalliance.ad.e.b();
            View view = this.I;
            if (view == null || eVarB == null) {
                return;
            }
            eVarB.c(ObjectWrapper.wrap(view), null);
        } catch (Throwable th) {
            hw.c("PPSNativeView", "focusPlay err: %s", th.getClass().getSimpleName());
        }
    }

    @Override // com.huawei.openalliance.ad.views.interfaces.IPPSNativeView
    public void f() {
        mh mhVar = this.f20925a;
        if (mhVar != null) {
            mhVar.a(mw.CLICK);
        }
    }

    public void e() {
        mh mhVar = this.f20925a;
        if (mhVar != null) {
            mhVar.b();
        }
    }

    @Override // com.huawei.openalliance.ad.views.v, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        try {
            int iA = tz.a(motionEvent);
            IAppDownloadButton iAppDownloadButtonA = a(this.m);
            if (iA == 0) {
                MaterialClickInfo materialClickInfoA = tz.a(this, motionEvent);
                this.D = materialClickInfoA;
                if (iAppDownloadButtonA != null) {
                    ((AppDownloadButton) iAppDownloadButtonA).a(materialClickInfoA);
                }
            }
            if (1 == iA) {
                tz.a(this, motionEvent, null, this.D);
                if (iAppDownloadButtonA != null) {
                    ((AppDownloadButton) iAppDownloadButtonA).a(this.D);
                }
            }
        } catch (Throwable th) {
            hw.c("PPSNativeView", "dispatchTouchEvent exception : %s", th.getClass().getSimpleName());
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // com.huawei.openalliance.ad.views.interfaces.f
    public boolean d() {
        jm jmVar = this.l;
        if (jmVar != null) {
            return jmVar.p();
        }
        return false;
    }

    public boolean c() {
        if (this.x || this.h == null) {
            return false;
        }
        setWhyAdViewStatus(com.huawei.hms.ads.a.EnumC0090a.SHOWN);
        n();
        this.h.b();
        v();
        this.j = false;
        return true;
    }

    @Override // com.huawei.openalliance.ad.views.interfaces.IPPSNativeView
    public void c(View view) {
        OnNativeAdClickListener onNativeAdClickListener = this.o;
        if (onNativeAdClickListener != null) {
            onNativeAdClickListener.onClick(view);
        }
    }

    public void b(View view) {
        a(getContext(), view);
    }

    @Override // com.huawei.openalliance.ad.jm.a
    public void b(long j, int i) {
        int playedTime;
        int playedProgress;
        int i2;
        int i3;
        Object obj;
        if (this.M) {
            return;
        }
        dq.a(this.w);
        com.huawei.openalliance.ad.inter.data.e eVar = this.m;
        if (eVar == null) {
            return;
        }
        eVar.j(false);
        if (this.m.isVideoAd() && (obj = this.s) != null && (obj instanceof NativeMediaView)) {
            NativeMediaView nativeMediaView = (NativeMediaView) obj;
            playedTime = nativeMediaView.getPlayedTime();
            playedProgress = nativeMediaView.getPlayedProgress();
        } else {
            playedTime = -1;
            playedProgress = -1;
        }
        if (hw.a()) {
            hw.a("PPSNativeView", "onAdPhyShow  duration: %s  maxShowRatio: %s  playedTime: %s  playedProgress: %s", Long.valueOf(j), Integer.valueOf(i), Integer.valueOf(playedTime), Integer.valueOf(playedProgress));
        }
        if (!this.m.isVideoAd()) {
            this.k.a(j, i);
            return;
        }
        if (playedTime <= 0) {
            i3 = 0;
            i2 = 0;
        } else {
            i2 = playedProgress;
            i3 = playedTime;
        }
        this.k.a(j, i, i3, i2);
    }

    @Override // com.huawei.openalliance.ad.jm.a
    public void b() {
        if (this.M) {
            return;
        }
        this.v = false;
        long jC = as.c();
        hw.a("PPSNativeView", "onViewPhysicalShowStart: %s", Long.valueOf(jC));
        String strValueOf = String.valueOf(jC);
        com.huawei.openalliance.ad.inter.data.e eVar = this.m;
        if (eVar == null) {
            hw.b("PPSNativeView", "nativeAd is null! please register first");
            return;
        }
        eVar.h(strValueOf);
        if (!this.m.isVideoAd() || this.m.q() == null || this.m.q().intValue() == 0) {
            this.m.h(false);
            this.m.a(false);
        }
        this.m.j(true);
        this.m.c(jC);
        if (!this.m.aa()) {
            this.m.g(true);
            if (this.q != null) {
                dq.a(new Runnable() { // from class: com.huawei.openalliance.ad.views.PPSNativeView.9
                    @Override // java.lang.Runnable
                    public void run() {
                        if (PPSNativeView.this.q != null) {
                            PPSNativeView.this.q.onStatusChanged();
                        }
                    }
                });
            }
        }
        this.k.a(strValueOf);
        this.k.a(jC);
        INativeVideoView iNativeVideoView = this.s;
        if (iNativeVideoView != null) {
            iNativeVideoView.updateContent(strValueOf);
            this.s.updateStartShowTime(jC);
        }
        IAppDownloadButton iAppDownloadButtonA = a(this.m);
        if (iAppDownloadButtonA != null) {
            iAppDownloadButtonA.updateContent(strValueOf);
            iAppDownloadButtonA.updateStartShowTime(jC);
        }
        bx bxVar = this.H;
        if (bxVar != null) {
            bxVar.a(strValueOf);
            this.H.a(jC);
        }
        mh mhVar = this.f20925a;
        if (mhVar != null) {
            mhVar.f();
        }
        this.k.a();
        bx bxVar2 = this.H;
        if (bxVar2 != null) {
            bxVar2.a(NativeSdkCallbackMethods.ATTACH_TO_WINDOW, (Bundle) null);
        }
    }

    @Override // com.huawei.openalliance.ad.views.interfaces.IPPSNativeView
    public void a(Integer num) {
        a(Long.valueOf(System.currentTimeMillis() - this.l.d()), Integer.valueOf(this.l.c()), num);
    }

    public void a(IAd iAd) {
        mh mhVar;
        hw.b("PPSNativeView", "initOmsdkResource");
        if (iAd instanceof com.huawei.openalliance.ad.inter.data.e) {
            com.huawei.openalliance.ad.inter.data.e eVar = (com.huawei.openalliance.ad.inter.data.e) iAd;
            ContentRecord contentRecordA = pl.a(eVar);
            if (a(Integer.valueOf(contentRecordA.aQ()), contentRecordA.F()) || (mhVar = this.f20925a) == null) {
                return;
            }
            mhVar.a(getContext(), contentRecordA, this, true);
            this.f20925a.a(false);
            this.f20925a.c();
            mq mqVarA = this.f20925a.a();
            this.F = mqVarA;
            if (mqVarA != null) {
                mqVarA.a(this.d, mp.OTHER, null);
                this.F.a(this.h, mp.OTHER, null);
                this.F.a(this.f, mp.OTHER, null);
            }
            a(this.f20925a, eVar);
        }
    }

    public void a(View view, int i, boolean z, com.huawei.openalliance.ad.inter.data.e eVar) {
        if (this.j) {
            this.j = false;
            if (this.M) {
                this.k.a(eVar);
            }
            hi.a(getContext()).a();
            hw.b("PPSNativeView", "onClick");
            a((Integer) 1);
            com.huawei.openalliance.ad.utils.ah.b();
            HashMap<String, String> mapB = b(eVar);
            IAppDownloadButton iAppDownloadButtonA = a(eVar);
            if (this.k.a(this.D, Integer.valueOf(i), getAdTag(), z, mapB)) {
                mh mhVar = this.f20925a;
                if (mhVar != null) {
                    mhVar.a(mw.CLICK);
                }
            } else if (iAppDownloadButtonA != null && (iAppDownloadButtonA instanceof AppDownloadButton)) {
                AppDownloadButton appDownloadButton = (AppDownloadButton) iAppDownloadButtonA;
                if (AppStatus.DOWNLOAD == appDownloadButton.getStatus() && eVar != null && eVar.isAutoDownloadApp() && pa.h(eVar.getCtrlSwitchs())) {
                    hw.b("PPSNativeView", "download app directly");
                    appDownloadButton.performClick();
                }
            }
            this.D = null;
            OnNativeAdClickListener onNativeAdClickListener = this.o;
            if (onNativeAdClickListener != null) {
                onNativeAdClickListener.onClick(view);
            }
            dq.a(new Runnable() { // from class: com.huawei.openalliance.ad.views.PPSNativeView.11
                @Override // java.lang.Runnable
                public void run() {
                    PPSNativeView.this.j = true;
                }
            }, 500L);
        }
    }

    public void a(View view, int i, String str) {
        mh mhVar;
        if (this.j) {
            this.j = false;
            hw.b("PPSNativeView", "on ad click with extra");
            if (this.M) {
                this.k.a(this.m);
            }
            hi.a(getContext()).a();
            a((Integer) 1);
            com.huawei.openalliance.ad.utils.ah.b();
            if (this.k.a(this.D, Integer.valueOf(i), getAdTag(), str, b(this.m)) && (mhVar = this.f20925a) != null) {
                mhVar.a(mw.CLICK);
            }
            this.D = null;
            OnNativeAdClickListener onNativeAdClickListener = this.o;
            if (onNativeAdClickListener != null) {
                onNativeAdClickListener.onClick(view);
            }
            dq.a(new Runnable() { // from class: com.huawei.openalliance.ad.views.PPSNativeView.2
                @Override // java.lang.Runnable
                public void run() {
                    PPSNativeView.this.j = true;
                }
            }, 500L);
        }
    }

    public void a(View view, int i, com.huawei.openalliance.ad.inter.data.e eVar) {
        a(view, i, true, eVar);
    }

    @Override // com.huawei.openalliance.ad.jm.a
    public void a(long j, int i) {
        if (this.M) {
            return;
        }
        dq.a(this.w);
        if (!this.l.a(j) || this.v) {
            return;
        }
        this.v = true;
        com.huawei.openalliance.ad.inter.data.e eVar = this.m;
        if (eVar != null) {
            if (!eVar.isVideoAd() || this.m.q() == null || this.m.q().intValue() == 0) {
                a(Long.valueOf(j), Integer.valueOf(i), (Integer) null);
            }
        }
    }

    @Override // com.huawei.openalliance.ad.jm.a
    public void a() {
        com.huawei.openalliance.ad.inter.data.e eVar;
        if (this.M || (eVar = this.m) == null) {
            return;
        }
        dq.a(new Runnable() { // from class: com.huawei.openalliance.ad.views.PPSNativeView.8
            @Override // java.lang.Runnable
            public void run() {
                com.huawei.openalliance.ad.inter.data.e eVar2 = PPSNativeView.this.m;
                if (eVar2 != null) {
                    if (!eVar2.isVideoAd() || eVar2.q() == null || eVar2.q().intValue() == 0) {
                        PPSNativeView.this.a(Long.valueOf(eVar2.getMinEffectiveShowTime()), Integer.valueOf(PPSNativeView.this.l.c()), (Integer) null);
                    }
                }
            }
        }, this.w, eVar.getMinEffectiveShowTime());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void z() {
        y();
        mh mhVar = this.f20925a;
        if (mhVar != null) {
            mhVar.j();
            this.f20925a.b();
        }
        INativeVideoView iNativeVideoView = this.s;
        if (iNativeVideoView != null) {
            iNativeVideoView.stop();
        }
        DislikeAdListener dislikeAdListener = this.y;
        if (dislikeAdListener != null) {
            dislikeAdListener.onAdDisliked();
        }
        s();
    }

    private void y() {
        final IAppDownloadButton iAppDownloadButtonA = a(this.m);
        if (iAppDownloadButtonA != null) {
            dq.a(new Runnable() { // from class: com.huawei.openalliance.ad.views.PPSNativeView.3
                @Override // java.lang.Runnable
                public void run() {
                    iAppDownloadButtonA.cancel();
                }
            });
        }
    }

    private void x() {
        y();
        a((Integer) 3);
        mh mhVar = this.f20925a;
        if (mhVar != null) {
            mhVar.j();
            this.f20925a.b();
        }
        INativeVideoView iNativeVideoView = this.s;
        if (iNativeVideoView != null) {
            iNativeVideoView.stop();
        }
        DislikeAdListener dislikeAdListener = this.y;
        if (dislikeAdListener != null) {
            dislikeAdListener.onAdDisliked();
        }
        jx jxVar = this.J;
        if (jxVar != null) {
            jxVar.b();
            this.J = null;
        }
        s();
    }

    private void w() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(this);
        this.u = arrayList;
        if (this.M) {
            a((List<View>) null);
        } else {
            a(arrayList);
        }
    }

    private void v() {
        List<View> list = this.u;
        if (list == null || list.isEmpty()) {
            return;
        }
        for (View view : this.u) {
            if (view != null) {
                view.setOnClickListener(null);
            }
        }
        setOnClickListener(null);
    }

    private void u() {
        com.huawei.openalliance.ad.inter.data.e eVar;
        if (!d() || (eVar = this.m) == null || eVar.ao()) {
            return;
        }
        hw.b("PPSNativeView", " maybe report show start.");
        b();
    }

    private boolean t() {
        com.huawei.openalliance.ad.inter.data.e eVar;
        if (this.I == null || (eVar = this.m) == null) {
            return false;
        }
        return eVar.ai() == null || 3 != this.m.ai().intValue();
    }

    private void setWindowImageViewClickable(INativeWindowImageView iNativeWindowImageView) {
        if (iNativeWindowImageView instanceof NativeWindowImageView) {
            ArrayList arrayList = new ArrayList();
            arrayList.add((NativeWindowImageView) iNativeWindowImageView);
            a(arrayList);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setWhyAdViewStatus(com.huawei.hms.ads.a.EnumC0090a enumC0090a) {
        this.E = enumC0090a;
    }

    private void setViewBackgroundColor(int i) {
        setBackgroundColor(i);
    }

    private void setNativeVideoViewClickable(INativeVideoView iNativeVideoView) {
        if (iNativeVideoView instanceof NativeVideoView) {
            ArrayList arrayList = new ArrayList();
            arrayList.add((NativeVideoView) iNativeVideoView);
            a(arrayList);
        }
    }

    private void s() {
        this.l.b();
        hi.a(getContext()).b();
        INativeVideoView iNativeVideoView = this.s;
        if (iNativeVideoView != null) {
            iNativeVideoView.setPpsNativeView(null);
        }
        this.s = null;
        this.t = null;
        this.y = null;
        this.z = null;
        v();
        r();
        g gVar = this.N;
        if (gVar != null) {
            removeView(gVar);
        }
    }

    private void r() {
        View view;
        IRemoteCreator iRemoteCreator = this.G;
        if (iRemoteCreator != null && (view = this.I) != null) {
            try {
                iRemoteCreator.destroyView(ObjectWrapper.wrap(view));
            } catch (Throwable th) {
                hw.b("PPSNativeView", "destory remote view err: %s", th.getClass().getSimpleName());
            }
        }
        if (this.m != null) {
            de.a().b(this.m.getUniqueId());
        }
        this.G = null;
        this.I = null;
        bx bxVar = this.H;
        if (bxVar != null) {
            bxVar.f();
            this.H = null;
        }
    }

    private boolean q() {
        return getWhyAdViewStatus() != com.huawei.hms.ads.a.EnumC0090a.NONE && getWhyAdViewStatus() == com.huawei.hms.ads.a.EnumC0090a.INIT;
    }

    private void p() {
        a(this.e);
        d(this.d);
        if (this.i || !q()) {
            return;
        }
        setWhyAdViewStatus(com.huawei.hms.ads.a.EnumC0090a.NONE);
        this.j = true;
        a(this, 0);
    }

    private boolean o() {
        if (!a(this.m.ai(), this.m.getCreativeType())) {
            return false;
        }
        Context applicationContext = getContext().getApplicationContext();
        a(applicationContext, AdContentData.a(applicationContext, this.m));
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n() {
        com.huawei.hms.ads.a aVar = this.h;
        if (aVar != null) {
            ViewGroup viewGroup = (ViewGroup) aVar.getParent();
            if (viewGroup != null && (viewGroup instanceof ViewGroup)) {
                a(viewGroup, 4);
            }
            this.h.setVisibility(0);
            setViewBackgroundColor(getResources().getColor(R.color.hiad_whythisad_root_bg));
        }
    }

    private void m() {
        if (this.h == null || getWhyAdViewStatus() != com.huawei.hms.ads.a.EnumC0090a.INIT) {
            com.huawei.hms.ads.a aVar = this.h;
            if (aVar != null) {
                a(aVar);
                this.h = null;
            }
            setWhyAdViewStatus(com.huawei.hms.ads.a.EnumC0090a.INIT);
            com.huawei.hms.ads.a aVar2 = new com.huawei.hms.ads.a(getContext(), this);
            this.h = aVar2;
            addView(aVar2);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(this.h.getLayoutParams());
            layoutParams.addRule(13);
            this.h.setLayoutParams(layoutParams);
        }
        this.h.setOnCloseCallBack(new com.huawei.hms.ads.b() { // from class: com.huawei.openalliance.ad.views.PPSNativeView.6
            @Override // com.huawei.hms.ads.b
            public List<String> c() {
                if (PPSNativeView.this.m != null) {
                    return PPSNativeView.this.m.getAdCloseKeyWords();
                }
                hw.c("PPSNativeView", "getKeyWords nativaAd is null");
                return null;
            }

            @Override // com.huawei.hms.ads.b
            public void b() {
                if (PPSNativeView.this.m != null) {
                    com.huawei.openalliance.ad.utils.d.a(PPSNativeView.this.getContext(), PPSNativeView.this.m);
                } else {
                    hw.c("PPSNativeView", "processWhyThisAdEvent nativaAd is null");
                }
            }

            @Override // com.huawei.hms.ads.b
            public void a(String str) {
                PPSNativeView.this.n();
                ArrayList arrayList = new ArrayList();
                if (str == null || str.isEmpty()) {
                    arrayList = null;
                } else {
                    arrayList.add(str);
                }
                PPSNativeView.this.setWhyAdViewStatus(com.huawei.hms.ads.a.EnumC0090a.DISLIKED);
                PPSNativeView.this.onClose(arrayList);
            }

            @Override // com.huawei.hms.ads.b
            public void a() {
                PPSNativeView.this.n();
            }
        });
    }

    private void l() {
        hw.a("PPSNativeView", "update choiceView start.");
        if (this.d == null) {
            hw.a("PPSNativeView", "do not need update choiceView");
            return;
        }
        if (this.h == null) {
            m();
        }
        if (!this.x && this.h != null) {
            hw.a("PPSNativeView", "cusWhyView is not null, set choiceView as close.");
            this.d.a();
        } else {
            if (TextUtils.isEmpty(this.B)) {
                return;
            }
            hw.a("PPSNativeView", "update choiceView.");
            if (TextUtils.isEmpty(this.C)) {
                this.d.b();
            } else {
                this.d.setAdChoiceIcon(this.C);
            }
        }
    }

    private void k() {
        hw.a("PPSNativeView", "initChoicesView start");
        if (this.d == null) {
            View viewInflate = LayoutInflater.from(getContext()).inflate(R.layout.hiad_choices_wrapper, (ViewGroup) null);
            this.f = viewInflate;
            this.d = (ChoicesView) viewInflate.findViewById(R.id.hiad_choices_icon);
            this.g = (ImageView) this.f.findViewById(R.id.compliance_icon);
            addView(this.f);
            View view = this.f;
            if (view != null) {
                view.setVisibility(8);
            }
        }
        setChoiceViewPosition(1);
        this.d.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.openalliance.ad.views.PPSNativeView.4
            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                if (PPSNativeView.this.c()) {
                    return;
                }
                if (PPSNativeView.this.m == null) {
                    hw.b("PPSNativeView", "adInfo is null");
                } else if (bm.a(PPSNativeView.this.m.getCompliance())) {
                    com.huawei.openalliance.ad.utils.d.a(PPSNativeView.this.getContext(), PPSNativeView.this.m);
                } else {
                    ComplianceActivity.a(PPSNativeView.this.getContext(), view2, pl.a(PPSNativeView.this.m), true);
                }
            }
        });
        this.g.setOnClickListener(new View.OnClickListener() { // from class: com.huawei.openalliance.ad.views.PPSNativeView.5
            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                if (PPSNativeView.this.x || PPSNativeView.this.m == null) {
                    return;
                }
                ComplianceActivity.a(PPSNativeView.this.getContext(), view2, pl.a(PPSNativeView.this.m), false);
            }
        });
    }

    public static void hideFeedback() {
        jq.a().a(NotifyMessageNames.FEEDBACK_RECEIVE, new Intent("com.huawei.ads.feedback.action.FINISH_FEEDBACK_ACTIVITY"));
    }

    public static void hideComplain() {
        jq.a().a(NotifyMessageNames.AD_COMPLAIN_MESSAGE_NAME, new Intent(NotifyMessageNames.AD_COMPLAIN_ACTION));
    }

    private com.huawei.hms.ads.a.EnumC0090a getWhyAdViewStatus() {
        return this.E;
    }

    private void getMonitor() {
        jx jxVar = this.J;
        if (jxVar != null) {
            jxVar.b();
            this.J = null;
        }
        com.huawei.openalliance.ad.inter.data.e eVar = this.m;
        if (eVar == null) {
            hw.b("PPSNativeView", "nativeAd is null");
            return;
        }
        if (eVar.a() != null) {
            if (this.m.a().intValue() == 1) {
                hw.b("PPSNativeView", "getMonitor");
                ContentRecord contentRecordA = pl.a(this.m);
                this.K.a(contentRecordA.b());
                this.K.a(contentRecordA);
                this.J = jv.a(getContext(), (this.m.isVideoAd() || this.m.U()) ? false : true, this.K, contentRecordA, a(this.m.ai(), this.m.getCreativeType()));
                String strA = a(this.m.av());
                this.J.a(jt.a().a(strA));
                this.J.a(strA, this.m.getEndTime());
                this.J.a(this);
                jv.a(contentRecordA.o(), this.J);
                return;
            }
        }
        hw.b("PPSNativeView", "not support mz.");
    }

    private MediaStateApi getMediaProxy() {
        if (!(this.J instanceof jz)) {
            return null;
        }
        hw.a("PPSNativeView", "custMonitor is VideoMzMonitor");
        return new ju((jz) this.J);
    }

    private void d(View view) {
        if (view == null || view.getVisibility() != 0) {
            return;
        }
        view.bringToFront();
    }

    private HashMap<String, String> b(com.huawei.openalliance.ad.inter.data.e eVar) {
        AppInfo appInfo;
        IAppDownloadButton iAppDownloadButtonA = a(eVar);
        if (!(iAppDownloadButtonA instanceof AppDownloadButton) || (appInfo = ((AppDownloadButton) iAppDownloadButtonA).getAppInfo()) == null) {
            return null;
        }
        HashMap<String, String> map = new HashMap<>();
        map.put(Constants.BF_DOWNLOAD_TXT, appInfo.k());
        map.put(Constants.AF_DOWNLOAD_TXT, appInfo.l());
        return map;
    }

    private boolean a(int[] iArr) {
        return iArr != null && iArr.length == 2;
    }

    private boolean a(Integer num, int i) {
        return (num != null && 3 == num.intValue()) || 99 == i;
    }

    private boolean a(Context context, String str) {
        Map<String, String> mapAv = fp.b(context).av();
        if (br.a(mapAv)) {
            return false;
        }
        Iterator<Map.Entry<String, String>> it = mapAv.entrySet().iterator();
        while (it.hasNext()) {
            if (it.next().getKey().equals(str)) {
                this.M = true;
                return true;
            }
        }
        return false;
    }

    private void a(List<View> list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (View view : list) {
            if (view instanceof NativeVideoView) {
                ((NativeVideoView) view).setCoverClickListener(this.P);
            } else if (view != null) {
                view.setOnClickListener(this.P);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Long l, Integer num, Integer num2) {
        hw.b("PPSNativeView", "reportAdShowEvent");
        b bVar = this.r;
        if (bVar != null) {
            bVar.a();
        }
        com.huawei.openalliance.ad.inter.data.e eVar = this.m;
        if (eVar == null) {
            return;
        }
        boolean zA = com.huawei.openalliance.ad.utils.c.a(eVar.d(), num2);
        if (!this.m.ad() || (zA && !this.m.b())) {
            if (this.M) {
                this.k.a(this.m);
            }
            hw.b("PPSNativeView", "reportAdShowEvent, customExposureType： real onAdShow");
            this.k.a(l, num, num2, getAdTag());
            if (zA) {
                this.m.a(true);
            }
            if (this.m.ad()) {
                return;
            }
            this.m.h(true);
            mh mhVar = this.f20925a;
            if (mhVar != null) {
                mhVar.e();
            }
            OnNativeAdShowListener onNativeAdShowListener = this.p;
            if (onNativeAdShowListener != null) {
                onNativeAdShowListener.onAdShow();
            }
        }
    }

    private void a(mh mhVar, com.huawei.openalliance.ad.inter.data.e eVar) {
        INativeVideoView iNativeVideoView = this.s;
        if (iNativeVideoView instanceof NativeVideoView) {
            ((NativeVideoView) iNativeVideoView).a(mhVar, eVar);
        }
    }

    private void a(INativeAd iNativeAd) {
        this.m = (com.huawei.openalliance.ad.inter.data.e) iNativeAd;
        getMonitor();
        p();
        if (!o()) {
            this.B = iNativeAd.getAdChoiceUrl();
            this.C = iNativeAd.getAdChoiceIcon();
            l();
        }
        this.l.b(this.m.getMinEffectiveShowTime(), this.m.getMinEffectiveShowRatio());
        this.k.a(this.m);
        u();
        this.k.b();
        w();
        a((IAd) iNativeAd);
        ContentRecord contentRecordA = pl.a(this.m);
        this.L = contentRecordA;
        super.setAdData(contentRecordA);
        dq.a(new Runnable() { // from class: com.huawei.openalliance.ad.views.PPSNativeView.7
            @Override // java.lang.Runnable
            public void run() {
                if (PPSNativeView.this.f20926b) {
                    PPSNativeView.this.j();
                }
            }
        }, 100L);
    }

    private void a(View view, int i) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
                viewGroup.getChildAt(i2).setVisibility(i);
            }
        }
    }

    public static void a(View view) {
        ViewGroup viewGroup;
        if (view == null || (viewGroup = (ViewGroup) view.getParent()) == null || !(viewGroup instanceof ViewGroup)) {
            return;
        }
        viewGroup.removeView(view);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0113 A[Catch: all -> 0x012d, TRY_LEAVE, TryCatch #0 {all -> 0x012d, blocks: (B:8:0x0091, B:10:0x0095, B:18:0x00cd, B:13:0x00a8, B:15:0x00ac, B:25:0x010d, B:27:0x0113, B:16:0x00bb, B:20:0x00d3, B:22:0x00ef, B:24:0x00fe, B:23:0x00f9), top: B:34:0x0091 }] */
    /* JADX WARN: Code duplicated, block: B:35:? A[RETURN, SYNTHETIC] */
    private void a(Context context, AdContentData adContentData) {
        hw.b("PPSNativeView", "showV3Ad");
        IRemoteCreator iRemoteCreatorA = com.huawei.openalliance.ad.e.a(getContext().getApplicationContext());
        this.G = iRemoteCreatorA;
        if (iRemoteCreatorA == null) {
            hw.b("PPSNativeView", "Creator is null");
            return;
        }
        this.H = new bx(context, this, this.m);
        String strB = bk.b(adContentData);
        hw.a("PPSNativeView", "showV3Ad contentJson: %s", strB);
        Bundle bundle = new Bundle();
        bundle.putBinder(ParamConstants.Param.CONTEXT, (IBinder) ObjectWrapper.wrap(getContext()));
        bundle.putString("content", strB);
        bundle.putInt("sdkVersion", 30484300);
        boolean zP = dk.p(getContext().getApplicationContext());
        if (hw.a()) {
            hw.a("PPSNativeView", "emui9Dark %s", Boolean.valueOf(zP));
        }
        bundle.putBoolean(ParamConstants.Param.EMUI9_DARK_MODE, zP);
        bundle.putBoolean(ParamConstants.Param.SHOW_V2_TPT, com.huawei.openalliance.ad.utils.c.a(getContext(), this.m.aj(), this.m.getSlotId(), this.m.e()));
        try {
            if (this.M) {
                View view = (View) ObjectWrapper.unwrap(this.G.newNativeTemplateView(bundle, this.H));
                this.I = view;
                if (view == null) {
                    hw.c("PPSNativeView", "templateView is null");
                }
                g gVar = this.N;
                if (gVar != null) {
                    gVar.a(view);
                    this.G.bindData(ObjectWrapper.wrap(this.I), strB);
                }
                if (t()) {
                    ft.a(getContext().getApplicationContext()).a(this.m.getSlotId(), System.currentTimeMillis());
                    return;
                }
                return;
            }
            View view2 = (View) ObjectWrapper.unwrap(this.G.newNativeTemplateView(bundle, this.H));
            this.I = view2;
            if (view2 != null) {
                this.f20925a = null;
                removeAllViews();
                addView(this.I);
                this.G.bindData(ObjectWrapper.wrap(this.I), strB);
                KeyEvent.Callback callback = this.I;
                if (callback instanceof IMediaStateApiTransfer) {
                    ((IMediaStateApiTransfer) callback).setProxy(getMediaProxy());
                } else {
                    hw.c("PPSNativeView", "Native template view is not a IMediaStateApiTransfer instance");
                }
                hw.b("PPSNativeView", "binddata end, slotid: %s", this.m.getSlotId());
                if (t()) {
                    ft.a(getContext().getApplicationContext()).a(this.m.getSlotId(), System.currentTimeMillis());
                    return;
                }
                return;
            }
            hw.c("PPSNativeView", "templateView is null");
        } catch (Throwable th) {
            hw.c("PPSNativeView", "create newNativeTemplateView err: %s", th.getClass().getSimpleName());
        }
    }

    private void a(Context context, View view) {
        com.huawei.openalliance.ad.views.feedback.c cVar = new com.huawei.openalliance.ad.views.feedback.c();
        cVar.a(context);
        cVar.a(view);
        cVar.b(this.z);
        cVar.a(new a(this));
        df.a(this.m);
        FeedbackActivity.a(getContext(), cVar);
    }

    private void a(Context context) {
        this.k = new nm(context, this);
        this.l = new jm(this, this);
        this.i = cc.a(context).d();
        this.K = new pc(context, new sz(context, 3));
        hw.a("PPSNativeView", "isChinaRom = %s", Boolean.valueOf(this.i));
        if (!this.i) {
            k();
        }
        nm nmVar = this.k;
        if (nmVar != null) {
            nmVar.a(this.f20927c);
        }
    }

    private void a(int i) {
        com.huawei.openalliance.ad.inter.data.e eVar;
        hw.a("PPSNativeView", "changeChoiceViewPosition option = %d", Integer.valueOf(i));
        if (this.i) {
            hw.c("PPSNativeView", "china rom should not call setChoiceViewPosition method");
            return;
        }
        if (this.f == null) {
            hw.a("PPSNativeView", "choicesView is null, error");
            return;
        }
        if (!this.x && this.g != null && (eVar = this.m) != null && !bm.a(eVar.getCompliance())) {
            this.g.setVisibility(0);
        }
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(this.f.getLayoutParams());
        int dimensionPixelOffset = getResources().getDimensionPixelOffset(R.dimen.hiad_10_dp);
        if (i != 0) {
            if (i != 2) {
                if (i == 3) {
                    layoutParams.addRule(12);
                } else if (i != 4) {
                    layoutParams.addRule(10);
                } else if (this.x) {
                    hw.a("PPSNativeView", "ADCHOICES_INVISIBLE is called and not default feedback!");
                    a(this.f, 8);
                    return;
                }
                this.f.setVisibility(0);
                this.f.setLayoutParams(layoutParams);
                this.f.bringToFront();
            }
            layoutParams.addRule(12);
            layoutParams.addRule(21);
            layoutParams.setMargins(0, 0, dimensionPixelOffset, 0);
            layoutParams.setMarginEnd(dimensionPixelOffset);
            this.f.setVisibility(0);
            this.f.setLayoutParams(layoutParams);
            this.f.bringToFront();
        }
        layoutParams.addRule(10);
        layoutParams.addRule(20);
        layoutParams.setMargins(dimensionPixelOffset, 0, 0, 0);
        layoutParams.setMarginStart(dimensionPixelOffset);
        this.f.setScaleX(-1.0f);
        this.d.setScaleX(-1.0f);
        this.f.setVisibility(0);
        this.f.setLayoutParams(layoutParams);
        this.f.bringToFront();
    }

    private String a(String str) {
        if (str == null) {
            return null;
        }
        return db.a(str);
    }

    private IAppDownloadButton a(com.huawei.openalliance.ad.inter.data.e eVar) {
        if (eVar == null) {
            hw.c("PPSNativeView", "nativeAd is null, get dwnBtn fail");
            return null;
        }
        Map<String, IAppDownloadButton> map = this.O;
        if (map == null || !map.containsKey(eVar.getContentId())) {
            return null;
        }
        return this.O.get(eVar.getContentId());
    }

    public PPSNativeView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f20927c = new HandleUrlCallBack() { // from class: com.huawei.openalliance.ad.views.PPSNativeView.1
            @Override // com.huawei.openalliance.ad.uriaction.interfaces.HandleUrlCallBack
            public void a(Bundle bundle) {
                if (PPSNativeView.this.H == null) {
                    hw.b("PPSNativeView", "nativeApi is null handleUrlResult failed");
                } else {
                    PPSNativeView.this.H.a(NativeSdkCallbackMethods.HANDLE_URL_RESULT, bundle);
                }
            }
        };
        this.f20925a = new lw();
        this.i = true;
        this.j = true;
        this.v = false;
        this.w = Constants.IMP_EVENT_MONITOR_ID + hashCode();
        this.E = com.huawei.hms.ads.a.EnumC0090a.NONE;
        this.M = false;
        this.O = new HashMap();
        this.P = new View.OnClickListener() { // from class: com.huawei.openalliance.ad.views.PPSNativeView.10
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                PPSNativeView pPSNativeView = PPSNativeView.this;
                pPSNativeView.a(view, 7, pPSNativeView.m);
            }
        };
        a(context);
    }

    static class a implements AdFeedbackListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final WeakReference<PPSNativeView> f20940a;

        @Override // com.huawei.hms.ads.AdFeedbackListener
        public void onAdFeedbackShowFailed() {
        }

        @Override // com.huawei.hms.ads.AdFeedbackListener
        public void onAdLiked() {
        }

        @Override // com.huawei.hms.ads.AdFeedbackListener
        public void onAdDisliked() {
            PPSNativeView pPSNativeView = this.f20940a.get();
            if (pPSNativeView != null) {
                pPSNativeView.z();
            }
        }

        public a(PPSNativeView pPSNativeView) {
            this.f20940a = new WeakReference<>(pPSNativeView);
        }
    }

    public PPSNativeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f20927c = new HandleUrlCallBack() { // from class: com.huawei.openalliance.ad.views.PPSNativeView.1
            @Override // com.huawei.openalliance.ad.uriaction.interfaces.HandleUrlCallBack
            public void a(Bundle bundle) {
                if (PPSNativeView.this.H == null) {
                    hw.b("PPSNativeView", "nativeApi is null handleUrlResult failed");
                } else {
                    PPSNativeView.this.H.a(NativeSdkCallbackMethods.HANDLE_URL_RESULT, bundle);
                }
            }
        };
        this.f20925a = new lw();
        this.i = true;
        this.j = true;
        this.v = false;
        this.w = Constants.IMP_EVENT_MONITOR_ID + hashCode();
        this.E = com.huawei.hms.ads.a.EnumC0090a.NONE;
        this.M = false;
        this.O = new HashMap();
        this.P = new View.OnClickListener() { // from class: com.huawei.openalliance.ad.views.PPSNativeView.10
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                PPSNativeView pPSNativeView = PPSNativeView.this;
                pPSNativeView.a(view, 7, pPSNativeView.m);
            }
        };
        a(context);
    }

    public PPSNativeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f20927c = new HandleUrlCallBack() { // from class: com.huawei.openalliance.ad.views.PPSNativeView.1
            @Override // com.huawei.openalliance.ad.uriaction.interfaces.HandleUrlCallBack
            public void a(Bundle bundle) {
                if (PPSNativeView.this.H == null) {
                    hw.b("PPSNativeView", "nativeApi is null handleUrlResult failed");
                } else {
                    PPSNativeView.this.H.a(NativeSdkCallbackMethods.HANDLE_URL_RESULT, bundle);
                }
            }
        };
        this.f20925a = new lw();
        this.i = true;
        this.j = true;
        this.v = false;
        this.w = Constants.IMP_EVENT_MONITOR_ID + hashCode();
        this.E = com.huawei.hms.ads.a.EnumC0090a.NONE;
        this.M = false;
        this.O = new HashMap();
        this.P = new View.OnClickListener() { // from class: com.huawei.openalliance.ad.views.PPSNativeView.10
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                PPSNativeView pPSNativeView = PPSNativeView.this;
                pPSNativeView.a(view, 7, pPSNativeView.m);
            }
        };
        a(context);
    }

    public PPSNativeView(Context context) {
        super(context);
        this.f20927c = new HandleUrlCallBack() { // from class: com.huawei.openalliance.ad.views.PPSNativeView.1
            @Override // com.huawei.openalliance.ad.uriaction.interfaces.HandleUrlCallBack
            public void a(Bundle bundle) {
                if (PPSNativeView.this.H == null) {
                    hw.b("PPSNativeView", "nativeApi is null handleUrlResult failed");
                } else {
                    PPSNativeView.this.H.a(NativeSdkCallbackMethods.HANDLE_URL_RESULT, bundle);
                }
            }
        };
        this.f20925a = new lw();
        this.i = true;
        this.j = true;
        this.v = false;
        this.w = Constants.IMP_EVENT_MONITOR_ID + hashCode();
        this.E = com.huawei.hms.ads.a.EnumC0090a.NONE;
        this.M = false;
        this.O = new HashMap();
        this.P = new View.OnClickListener() { // from class: com.huawei.openalliance.ad.views.PPSNativeView.10
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                PPSNativeView pPSNativeView = PPSNativeView.this;
                pPSNativeView.a(view, 7, pPSNativeView.m);
            }
        };
        a(context);
    }
}
