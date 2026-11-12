package com.huawei.openalliance.ad.views;

import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.huawei.openalliance.ad.activity.ComplianceActivity;
import com.huawei.openalliance.ad.ca;
import com.huawei.openalliance.ad.constant.NotifyMessageNames;
import com.huawei.openalliance.ad.constant.PlacementPlayState;
import com.huawei.openalliance.ad.constant.RewardMethods;
import com.huawei.openalliance.ad.db.bean.ContentRecord;
import com.huawei.openalliance.ad.dn;
import com.huawei.openalliance.ad.fp;
import com.huawei.openalliance.ad.hw;
import com.huawei.openalliance.ad.inter.data.IAd;
import com.huawei.openalliance.ad.inter.data.IPlacementAd;
import com.huawei.openalliance.ad.inter.data.MaterialClickInfo;
import com.huawei.openalliance.ad.inter.data.PlacementEvent;
import com.huawei.openalliance.ad.inter.data.PlacementMediaFile;
import com.huawei.openalliance.ad.jm;
import com.huawei.openalliance.ad.jq;
import com.huawei.openalliance.ad.jv;
import com.huawei.openalliance.ad.jx;
import com.huawei.openalliance.ad.lw;
import com.huawei.openalliance.ad.media.MediaState;
import com.huawei.openalliance.ad.media.listener.MediaBufferListener;
import com.huawei.openalliance.ad.media.listener.MediaErrorListener;
import com.huawei.openalliance.ad.media.listener.MediaPlayerReleaseListener;
import com.huawei.openalliance.ad.media.listener.MuteListener;
import com.huawei.openalliance.ad.media.listener.PPSVideoRenderListener;
import com.huawei.openalliance.ad.media.listener.SegmentMediaStateListener;
import com.huawei.openalliance.ad.mh;
import com.huawei.openalliance.ad.mp;
import com.huawei.openalliance.ad.mq;
import com.huawei.openalliance.ad.mw;
import com.huawei.openalliance.ad.mx;
import com.huawei.openalliance.ad.my;
import com.huawei.openalliance.ad.nu;
import com.huawei.openalliance.ad.oy;
import com.huawei.openalliance.ad.pc;
import com.huawei.openalliance.ad.pq;
import com.huawei.openalliance.ad.ta;
import com.huawei.openalliance.ad.tz;
import com.huawei.openalliance.ad.ue;
import com.huawei.openalliance.ad.utils.as;
import com.huawei.openalliance.ad.utils.bm;
import com.huawei.openalliance.ad.utils.dg;
import com.huawei.openalliance.ad.utils.dk;
import com.huawei.openalliance.ad.utils.dq;
import com.huawei.openalliance.ad.utils.ds;
import com.huawei.openalliance.ad.views.interfaces.IPPSPlacementView;
import com.huawei.openalliance.ad.views.interfaces.IPlacementMediaChangeListener;
import com.huawei.openalliance.ad.views.interfaces.IPlacementMediaStateListener;
import com.huawei.openalliance.ad.views.interfaces.IViewLifeCycle;
import com.huawei.openalliance.ad.vv;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes12.dex */
public class PPSPlacementView extends AutoScaleSizeRelativeLayout implements jm.a, MuteListener, SegmentMediaStateListener, IPPSPlacementView, IViewLifeCycle {
    private int[] A;
    private PlacementMediaView B;
    private List<View> C;
    private boolean D;
    private com.huawei.openalliance.ad.analysis.c E;
    private boolean F;
    private int G;
    private int H;
    private long I;
    private boolean J;
    private boolean K;
    private int L;
    private ImageView M;
    private boolean N;
    private boolean O;
    private boolean P;
    private boolean Q;
    private MaterialClickInfo R;
    private dn S;
    private boolean T;
    private long U;
    private MediaPlayerReleaseListener V;
    private int W;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected mh f20941a;
    private boolean aa;
    private AudioManager ab;
    private Object ac;
    private PlacementPlayState ad;
    private ue ae;
    private List<jx> af;
    private AtomicBoolean ag;
    private List<pc> ah;
    private int ai;
    private PPSVideoRenderListener aj;
    private Handler ak;
    private SegmentMediaStateListener al;
    private View.OnTouchListener am;
    private View.OnClickListener an;
    private AudioManager.OnAudioFocusChangeListener ao;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected mh f20942b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected mh f20943c;
    int d;
    int e;
    private MaterialClickInfo f;
    private String g;
    private boolean h;
    private nu i;
    private jm j;
    private List<com.huawei.openalliance.ad.inter.data.h> k;
    private com.huawei.openalliance.ad.inter.data.h l;
    private com.huawei.openalliance.ad.inter.data.h m;
    private int n;
    private OnPlacementAdClickListener o;
    private List<View> p;
    private boolean q;
    private boolean r;
    private PlacementMediaView s;
    private PlacementMediaView t;
    private PlacementMediaView u;
    private MediaBufferListener v;
    private MuteListener w;
    private MediaErrorListener x;
    private IPlacementMediaStateListener y;
    private IPlacementMediaChangeListener z;

    /* JADX INFO: loaded from: classes41.dex */
    public interface OnPlacementAdClickListener {
        void onClick();
    }

    public void unregister() {
        dq.a(new Runnable() { // from class: com.huawei.openalliance.ad.views.PPSPlacementView.21
            @Override // java.lang.Runnable
            public void run() {
                hw.b("PPSPlacementView", "unregister");
                PPSPlacementView pPSPlacementView = PPSPlacementView.this;
                pPSPlacementView.a(pPSPlacementView.s, true);
                PPSPlacementView pPSPlacementView2 = PPSPlacementView.this;
                pPSPlacementView2.a(pPSPlacementView2.t, true);
                PPSPlacementView.this.l = null;
                PPSPlacementView.this.m = null;
                PPSPlacementView.this.k.clear();
                PPSPlacementView.this.j.b();
                PPSPlacementView.this.i.a((com.huawei.openalliance.ad.inter.data.h) null);
                PPSPlacementView.this.j();
                PPSPlacementView.this.h();
                PPSPlacementView.this.f20941a.b();
                PPSPlacementView.this.f20942b.b();
                PPSPlacementView.this.f20943c.b();
            }
        });
    }

    public void unmuteSound() {
        dq.a(new Runnable() { // from class: com.huawei.openalliance.ad.views.PPSPlacementView.9
            @Override // java.lang.Runnable
            public void run() {
                hw.b("PPSPlacementView", "unmuteSound");
                boolean z = true;
                if (PPSPlacementView.this.L == 1) {
                    PPSPlacementView.this.s();
                }
                boolean z2 = false;
                PPSPlacementView.this.D = false;
                if (PPSPlacementView.this.s != null) {
                    PPSPlacementView.this.s.d();
                    z2 = true;
                }
                if (PPSPlacementView.this.t != null) {
                    PPSPlacementView.this.t.d();
                } else {
                    z = z2;
                }
                if (PPSPlacementView.this.u != null) {
                    PPSPlacementView.this.u.d();
                } else if (!z) {
                    return;
                }
                PPSPlacementView.this.i.a(PPSPlacementView.this.D);
            }
        });
    }

    public void stop() {
        dq.a(new Runnable() { // from class: com.huawei.openalliance.ad.views.PPSPlacementView.6
            @Override // java.lang.Runnable
            public void run() {
                hw.b("PPSPlacementView", "stop");
                if (PPSPlacementView.this.B != null) {
                    PPSPlacementView.this.B.g();
                }
            }
        });
    }

    public void showTransparencyDialog(View view, int[] iArr) {
        if (view == null) {
            hw.c("PPSPlacementView", "anchorView is null");
        }
        try {
            com.huawei.openalliance.ad.inter.data.h currentAd = getCurrentAd();
            if (currentAd == null) {
                hw.c("PPSPlacementView", "adInfo is null");
                return;
            }
            ContentRecord contentRecordA = pq.a(currentAd);
            if (com.huawei.openalliance.ad.utils.ab.t(getContext())) {
                a(view, contentRecordA, iArr);
            } else if (a(iArr)) {
                ca.a(getContext(), view, iArr, contentRecordA);
            } else {
                ca.a(getContext(), view, contentRecordA);
            }
        } catch (Throwable th) {
            hw.c("PPSPlacementView", "showTransparencyDialog has exception %s", th.getClass().getSimpleName());
        }
    }

    public void showTransparencyDialog(View view) {
        showTransparencyDialog(view, null);
    }

    public void showAdvertiserInfoDialog(View view, boolean z) {
        String str;
        if (view == null) {
            hw.c("PPSPlacementView", "anchorView is null");
        }
        try {
            com.huawei.openalliance.ad.inter.data.h currentAd = getCurrentAd();
            if (currentAd == null) {
                str = "adInfo is null";
            } else {
                ContentRecord contentRecordA = pq.a(currentAd);
                if (!bm.a(contentRecordA.aU())) {
                    ComplianceActivity.a(getContext(), view, contentRecordA, z);
                    return;
                }
                str = "advertiser Info is null";
            }
            hw.c("PPSPlacementView", str);
        } catch (Throwable th) {
            hw.c("PPSPlacementView", "showAdvertiserInfoDialog has exception %s", th.getClass().getSimpleName());
        }
    }

    public void setSoundVolume(final float f) {
        dq.a(new Runnable() { // from class: com.huawei.openalliance.ad.views.PPSPlacementView.8
            @Override // java.lang.Runnable
            public void run() {
                mh mhVar;
                hw.b("PPSPlacementView", "set sound volume: %s", Float.valueOf(f));
                if (PPSPlacementView.this.B != null) {
                    PPSPlacementView.this.B.setSoundVolume(f);
                    if (PPSPlacementView.this.ad.isState(PlacementPlayState.State.SINGLE_INST)) {
                        mhVar = PPSPlacementView.this.f20943c;
                    } else {
                        mhVar = PPSPlacementView.this.ad.isState(PlacementPlayState.State.MAIN_VIEW) ? PPSPlacementView.this.f20941a : PPSPlacementView.this.f20942b;
                    }
                    mhVar.b(f);
                }
            }
        });
    }

    public void setOverlays(List<View> list) {
        this.C = list;
    }

    public void setOnPlacementAdClickListener(OnPlacementAdClickListener onPlacementAdClickListener) {
        this.o = onPlacementAdClickListener;
    }

    public void setMediaPlayerReleaseListener(MediaPlayerReleaseListener mediaPlayerReleaseListener) {
        if (mediaPlayerReleaseListener == null) {
            return;
        }
        this.V = mediaPlayerReleaseListener;
    }

    public void setAudioFocusType(int i) {
        this.L = i;
    }

    @Override // com.huawei.openalliance.ad.views.interfaces.IViewLifeCycle
    public void resumeView() {
        dq.a(new Runnable() { // from class: com.huawei.openalliance.ad.views.PPSPlacementView.10
            @Override // java.lang.Runnable
            public void run() {
                hw.b("PPSPlacementView", RewardMethods.RESUME_VIEW);
                if (PPSPlacementView.this.B != null) {
                    PPSPlacementView.this.B.resumeView();
                    PPSPlacementView.this.B.a(true, PPSPlacementView.this.D);
                    PPSPlacementView pPSPlacementView = PPSPlacementView.this;
                    pPSPlacementView.a(pPSPlacementView.getCurrentAdDuration() * 2);
                }
            }
        });
    }

    public void removePlacementMediaStateListener() {
        this.y = null;
    }

    public void removeMuteListener(MuteListener muteListener) {
        if (muteListener == null) {
            return;
        }
        PlacementMediaView placementMediaView = this.s;
        if (placementMediaView != null) {
            placementMediaView.b(muteListener);
        } else {
            this.w = null;
        }
    }

    public void removeMediaPlayerReleaseListener(MediaPlayerReleaseListener mediaPlayerReleaseListener) {
        PlacementMediaView placementMediaView = this.u;
        if (placementMediaView != null) {
            placementMediaView.a(mediaPlayerReleaseListener);
        }
        this.V = null;
    }

    public void removeMediaErrorListener(MediaErrorListener mediaErrorListener) {
        if (mediaErrorListener == null) {
            return;
        }
        PlacementMediaView placementMediaView = this.s;
        if (placementMediaView != null) {
            placementMediaView.b(mediaErrorListener);
        } else {
            this.x = null;
        }
    }

    public void removeMediaChangeListener() {
        this.z = null;
    }

    public void removeMediaBufferListener(MediaBufferListener mediaBufferListener) {
        if (mediaBufferListener == null) {
            return;
        }
        PlacementMediaView placementMediaView = this.s;
        if (placementMediaView != null) {
            placementMediaView.b(mediaBufferListener);
        } else {
            this.v = null;
        }
    }

    public void register(final List<IPlacementAd> list, final List<View> list2) {
        dq.a(new Runnable() { // from class: com.huawei.openalliance.ad.views.PPSPlacementView.19
            @Override // java.lang.Runnable
            public void run() {
                PlacementMediaView placementMediaView;
                StringBuilder sb = new StringBuilder("register:");
                List list3 = list;
                sb.append(list3 == null ? 0 : list3.size());
                hw.b("PPSPlacementView", sb.toString());
                PPSPlacementView.this.a((List<IPlacementAd>) list);
                if (bm.a(list) || bm.a(PPSPlacementView.this.k)) {
                    return;
                }
                PPSPlacementView.this.getMonitor();
                PPSPlacementView.this.n = 0;
                PPSPlacementView pPSPlacementView = PPSPlacementView.this;
                pPSPlacementView.l = pPSPlacementView.getCurrentAd();
                PPSPlacementView pPSPlacementView2 = PPSPlacementView.this;
                pPSPlacementView2.m = pPSPlacementView2.getNextAd();
                PPSPlacementView.this.e();
                PPSPlacementView.this.p = list2;
                PPSPlacementView.this.b((List<View>) list2);
                if (!PPSPlacementView.this.ad.isState(PlacementPlayState.State.SINGLE_INST)) {
                    placementMediaView = PPSPlacementView.this.s;
                } else {
                    placementMediaView = PPSPlacementView.this.u;
                }
                PPSPlacementView.this.f();
                PPSPlacementView.this.a(placementMediaView);
                if (PPSPlacementView.this.K) {
                    PPSPlacementView.this.c();
                }
            }
        });
    }

    public void register(final List<IPlacementAd> list) {
        dq.a(new Runnable() { // from class: com.huawei.openalliance.ad.views.PPSPlacementView.18
            @Override // java.lang.Runnable
            public void run() {
                PlacementMediaView placementMediaView;
                StringBuilder sb = new StringBuilder("register:");
                List list2 = list;
                sb.append(list2 == null ? 0 : list2.size());
                hw.b("PPSPlacementView", sb.toString());
                PPSPlacementView.this.a((List<IPlacementAd>) list);
                if (bm.a(list) || bm.a(PPSPlacementView.this.k)) {
                    return;
                }
                PPSPlacementView.this.getMonitor();
                PPSPlacementView.this.n = 0;
                PPSPlacementView pPSPlacementView = PPSPlacementView.this;
                pPSPlacementView.l = pPSPlacementView.getCurrentAd();
                PPSPlacementView pPSPlacementView2 = PPSPlacementView.this;
                pPSPlacementView2.m = pPSPlacementView2.getNextAd();
                PPSPlacementView.this.e();
                PPSPlacementView.this.i();
                if (!PPSPlacementView.this.ad.isState(PlacementPlayState.State.SINGLE_INST)) {
                    placementMediaView = PPSPlacementView.this.s;
                } else {
                    placementMediaView = PPSPlacementView.this.u;
                }
                PPSPlacementView.this.f();
                PPSPlacementView.this.a(placementMediaView);
                if (PPSPlacementView.this.K) {
                    PPSPlacementView.this.c();
                }
            }
        });
    }

    public void play(final boolean z) {
        dq.a(new Runnable() { // from class: com.huawei.openalliance.ad.views.PPSPlacementView.4
            @Override // java.lang.Runnable
            public void run() {
                hw.b("PPSPlacementView", "play, auto:" + z);
                if (PPSPlacementView.this.B != null) {
                    PPSPlacementView.this.B.a(z, PPSPlacementView.this.D);
                }
            }
        });
    }

    @Override // com.huawei.openalliance.ad.views.interfaces.IViewLifeCycle
    public void pauseView() {
        dq.a(new Runnable() { // from class: com.huawei.openalliance.ad.views.PPSPlacementView.11
            @Override // java.lang.Runnable
            public void run() {
                hw.b("PPSPlacementView", RewardMethods.PAUSE_VIEW);
                if (PPSPlacementView.this.B != null) {
                    PPSPlacementView.this.B.pauseView();
                    PPSPlacementView.this.B.f();
                    PPSPlacementView.this.o();
                }
            }
        });
    }

    public void pause() {
        dq.a(new Runnable() { // from class: com.huawei.openalliance.ad.views.PPSPlacementView.5
            @Override // java.lang.Runnable
            public void run() {
                hw.b("PPSPlacementView", "pause");
                if (PPSPlacementView.this.B != null) {
                    PPSPlacementView.this.B.f();
                }
            }
        });
    }

    @Override // android.view.View
    protected void onVisibilityChanged(View view, int i) {
        jx jxVar;
        super.onVisibilityChanged(view, i);
        this.j.j();
        if (this.af != null) {
            hw.a("PPSPlacementView", "actualIndex %s", Integer.valueOf(this.ai));
            int i2 = this.ai;
            if (i2 < 0 || i2 >= this.af.size() || (jxVar = this.af.get(this.ai)) == null) {
                return;
            }
            jxVar.c();
        }
    }

    @Override // com.huawei.openalliance.ad.media.listener.MuteListener
    public void onUnmute() {
        hw.b("PPSPlacementView", "onUnmute");
        this.D = false;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0068  */
    /* JADX WARN: Code duplicated, block: B:32:? A[RETURN, SYNTHETIC] */
    @Override // com.huawei.openalliance.ad.media.listener.SegmentMediaStateListener
    public void onSegmentProgress(String str, String str2, int i, int i2) {
        int i3;
        int iA;
        MediaState currentMediaState = getCurrentMediaState();
        if (currentMediaState != null && currentMediaState.isNotState(MediaState.State.PLAYING)) {
            hw.c("PPSPlacementView", "progress callback on nonPlaying state.");
            return;
        }
        String currentContentId = getCurrentContentId();
        if (str == null || str.equalsIgnoreCase(currentContentId)) {
            this.G = i;
            com.huawei.openalliance.ad.inter.data.h currentAd = getCurrentAd();
            long currentAdDuration = getCurrentAdDuration();
            boolean z = this.F;
            boolean z2 = true;
            if (z || this.H >= 0) {
                if (z && (i3 = this.H) >= 0) {
                    long j = i2 - i3;
                    this.I = j;
                    c(j, this.j.c());
                    nu nuVar = this.i;
                    if (nuVar != null) {
                        nuVar.a(i2, currentAdDuration);
                    }
                    if (this.I < currentAdDuration) {
                    }
                }
                iA = a(i2, currentAd, currentAdDuration);
                a(iA);
                if (z2) {
                    hw.b("PPSPlacementView", "time countdown finish, manual stop.");
                    a(str, str2, iA, currentAd);
                }
            }
            this.H = i2;
            this.F = true;
            z2 = false;
            iA = a(i2, currentAd, currentAdDuration);
            a(iA);
            if (z2) {
                hw.b("PPSPlacementView", "time countdown finish, manual stop.");
                a(str, str2, iA, currentAd);
            }
        }
    }

    @Override // com.huawei.openalliance.ad.media.listener.SegmentMediaStateListener
    public void onSegmentMediaStop(String str, String str2, int i) {
        hw.b("PPSPlacementView", "onSegmentMediaStop, contentId: %s, url: %s", str, ds.a(str2));
        if (str != null && str.equalsIgnoreCase(getCurrentContentId())) {
            b(i);
        }
        if (this.y == null || !str.equalsIgnoreCase(getCurrentContentId())) {
            hw.b("PPSPlacementView", "skip mediaStop callback, isListener null ? %s, currentContentId: %s", Boolean.valueOf(this.y == null), getCurrentContentId());
            return;
        }
        PlacementMediaView placementMediaView = this.B;
        if (placementMediaView instanceof ab) {
            placementMediaView.b(i);
        }
        int currentPlayTime = getCurrentPlayTime() + i;
        int[] iArr = this.A;
        int i2 = (iArr == null || iArr.length <= 0 || iArr[iArr.length - 1] <= 0) ? -1 : (int) ((currentPlayTime / iArr[iArr.length - 1]) * 100.0f);
        com.huawei.openalliance.ad.inter.data.h currentAd = getCurrentAd();
        if (currentAd != null && currentAd.isVideoAd()) {
            this.d = currentPlayTime;
            this.e = i2;
        }
        hw.b("PPSPlacementView", "meidaStop callback, playedTime: %s", Integer.valueOf(currentPlayTime));
        this.y.onMediaStop(currentPlayTime);
    }

    @Override // com.huawei.openalliance.ad.media.listener.SegmentMediaStateListener
    public void onSegmentMediaStart(String str, String str2, int i) {
        com.huawei.openalliance.ad.inter.data.h currentAd;
        hw.b("PPSPlacementView", "onSegmentMediaStart, contentId: %s, url: %s", str, ds.a(str2));
        this.F = true;
        this.H = i;
        PlacementMediaView placementMediaView = this.B;
        if (placementMediaView != null) {
            placementMediaView.setAlpha(1.0f);
        }
        if (hw.a() && (currentAd = getCurrentAd()) != null) {
            hw.a("PPSPlacementView", "customExposureType: %s , getMinEffectiveShowTime %s , getMinEffectiveVideoPlayProgress %s", currentAd.q(), Long.valueOf(currentAd.getMinEffectiveShowTime()), currentAd.r());
        }
        if (this.y != null && this.n == 0) {
            hw.b("PPSPlacementView", "need notify media start.");
            this.O = true;
        }
        if (this.z != null && this.B != null) {
            hw.b("PPSPlacementView", "mediaChange callback.");
            this.z.onSegmentMediaChange(this.B.getPlacementAd());
        }
        PlacementMediaView placementMediaView2 = this.B;
        if (placementMediaView2 instanceof ab) {
            placementMediaView2.e();
        }
    }

    @Override // com.huawei.openalliance.ad.media.listener.SegmentMediaStateListener
    public void onSegmentMediaPause(String str, String str2, int i) {
        hw.b("PPSPlacementView", "onSegmentMediaPause:" + ds.a(str2));
        if (str != null && str.equalsIgnoreCase(getCurrentContentId())) {
            b(i);
            PlacementMediaView placementMediaView = this.B;
            if (placementMediaView instanceof ab) {
                placementMediaView.c(i);
            }
        }
        if (this.y != null) {
            int currentPlayTime = getCurrentPlayTime() + i;
            int[] iArr = this.A;
            int i2 = (iArr == null || iArr.length <= 0 || iArr[iArr.length + (-1)] <= 0) ? -1 : (int) ((currentPlayTime / iArr[iArr.length - 1]) * 100.0f);
            com.huawei.openalliance.ad.inter.data.h currentAd = getCurrentAd();
            if (currentAd != null && currentAd.isVideoAd()) {
                this.d = currentPlayTime;
                this.e = i2;
            }
            hw.b("PPSPlacementView", "meidaPause callback, playedTime: %s.", Integer.valueOf(currentPlayTime));
            this.y.onMediaPause(currentPlayTime);
        }
    }

    @Override // com.huawei.openalliance.ad.media.listener.SegmentMediaStateListener
    public void onSegmentMediaError(String str, String str2, int i, int i2, int i3) {
        PlacementMediaView placementMediaView;
        PlacementMediaFile mediaFile;
        hw.b("PPSPlacementView", "onMediaError, contentId: %s, url: %s", str, ds.a(str2));
        String currentContentId = getCurrentContentId();
        if (str != null && !str.equalsIgnoreCase(currentContentId)) {
            hw.b("PPSPlacementView", "onError, contentId not match, currentConentId: %s", currentContentId);
            return;
        }
        r();
        o();
        hw.c("PPSPlacementView", "onSegmentMediaError:" + ds.a(str2) + ", playTime:" + i + ",errorCode:" + i2 + ",extra:" + i3);
        b(i);
        if (this.y != null) {
            int currentPlayTime = getCurrentPlayTime() + i;
            hw.b("PPSPlacementView", "meidaError callback, playedTime: %s", Integer.valueOf(currentPlayTime));
            this.y.onMediaError(currentPlayTime, i2, i3);
            this.y.onErrorWithContentId(i, i2, i3, str);
        }
        if (!this.P) {
            hw.b("PPSPlacementView", "error before start callback.");
            this.O = true;
        }
        this.j.o();
        this.B.a(i);
        com.huawei.openalliance.ad.inter.data.h currentAd = getCurrentAd();
        if (currentAd != null && (mediaFile = currentAd.getMediaFile()) != null) {
            this.E.a(mediaFile.getUrl(), i2, i3, pq.a(currentAd));
        }
        boolean zK = k();
        a(zK);
        if (this.y == null || !zK || this.A.length <= 0) {
            return;
        }
        hw.b("PPSPlacementView", "last ad play error");
        IPlacementMediaStateListener iPlacementMediaStateListener = this.y;
        int[] iArr = this.A;
        iPlacementMediaStateListener.onMediaCompletion(iArr[iArr.length - 1]);
        if (!this.ad.isState(PlacementPlayState.State.SINGLE_INST) || (placementMediaView = this.u) == null) {
            return;
        }
        placementMediaView.b();
    }

    @Override // com.huawei.openalliance.ad.media.listener.SegmentMediaStateListener
    public void onSegmentMediaCompletion(String str, String str2, int i) {
        PlacementMediaView placementMediaView;
        String currentContentId = getCurrentContentId();
        if (str != null && !str.equalsIgnoreCase(currentContentId)) {
            hw.b("PPSPlacementView", "onCompletion, %s not match current content id: %s", str, currentContentId);
            return;
        }
        boolean zK = k();
        if (!zK) {
            PlacementMediaView placementMediaView2 = this.B;
            if (placementMediaView2 instanceof ab) {
                this.M = placementMediaView2.getLastFrame();
                q();
            }
        }
        PlacementMediaView placementMediaView3 = this.B;
        if (placementMediaView3 instanceof ab) {
            placementMediaView3.b(i);
        }
        o();
        hw.b("PPSPlacementView", "onSegmentMediaCompletion, contentId: %s, url: %s", str, ds.a(str2));
        b(i);
        this.j.o();
        this.B.a(i);
        a(zK);
        if (this.y == null || !zK) {
            return;
        }
        int currentPlayTime = getCurrentPlayTime() + i;
        hw.b("PPSPlacementView", "onCompletion callback, playedTime: %s", Integer.valueOf(currentPlayTime));
        this.y.onMediaCompletion(currentPlayTime);
        if (this.ad.isState(PlacementPlayState.State.SINGLE_INST) && (placementMediaView = this.u) != null) {
            placementMediaView.b();
        }
        t();
    }

    @Override // com.huawei.openalliance.ad.media.listener.MuteListener
    public void onMute() {
        hw.b("PPSPlacementView", "onMute");
        this.D = true;
    }

    public void onEvent(final PlacementEvent placementEvent) {
        dq.a(new Runnable() { // from class: com.huawei.openalliance.ad.views.PPSPlacementView.14
            @Override // java.lang.Runnable
            public void run() {
                hw.b("PPSPlacementView", "onEvent:" + placementEvent.a());
                if (PlacementEvent.CLOSE == placementEvent) {
                    PPSPlacementView.this.a((Integer) 3);
                    PPSPlacementView.this.onClose();
                }
            }
        });
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        hw.b("PPSPlacementView", "onDetechedFromWindow");
        this.j.i();
        this.f20941a.b();
        this.f20942b.b();
        this.f20943c.b();
    }

    public void onClose() {
        dq.a(new Runnable() { // from class: com.huawei.openalliance.ad.views.PPSPlacementView.3
            @Override // java.lang.Runnable
            public void run() {
                mh mhVar;
                hw.b("PPSPlacementView", "onClose");
                PPSPlacementView.this.i.a();
                if (PPSPlacementView.this.ad.isState(PlacementPlayState.State.SINGLE_INST)) {
                    mhVar = PPSPlacementView.this.f20943c;
                } else {
                    mhVar = PPSPlacementView.this.ad.isState(PlacementPlayState.State.MAIN_VIEW) ? PPSPlacementView.this.f20941a : PPSPlacementView.this.f20942b;
                }
                mhVar.j();
                PPSPlacementView.this.j();
                PPSPlacementView.this.f20941a.b();
                PPSPlacementView.this.f20942b.b();
                PPSPlacementView.this.f20943c.b();
            }
        });
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        hw.a("PPSPlacementView", "onAttachedToWindow");
        this.j.h();
        oy.a(getContext()).b(getContext());
    }

    public void muteSound() {
        dq.a(new Runnable() { // from class: com.huawei.openalliance.ad.views.PPSPlacementView.7
            @Override // java.lang.Runnable
            public void run() {
                boolean z;
                hw.b("PPSPlacementView", "muteSound");
                boolean z2 = true;
                if (PPSPlacementView.this.L == 1) {
                    PPSPlacementView.this.t();
                }
                PPSPlacementView.this.D = true;
                if (PPSPlacementView.this.s != null) {
                    PPSPlacementView.this.s.c();
                    z = true;
                } else {
                    z = false;
                }
                if (PPSPlacementView.this.t != null) {
                    PPSPlacementView.this.t.c();
                } else {
                    z2 = z;
                }
                if (PPSPlacementView.this.u != null) {
                    PPSPlacementView.this.u.c();
                } else if (!z2) {
                    return;
                }
                PPSPlacementView.this.i.a(PPSPlacementView.this.D);
            }
        });
    }

    public boolean isTransparencyDialogVisible() {
        ue ueVar = this.ae;
        return ueVar != null && ueVar.getVisibility() == 0 && this.ae.getLocalVisibleRect(new Rect());
    }

    public boolean isPlaying() {
        PlacementMediaView placementMediaView = this.B;
        if (placementMediaView != null) {
            return placementMediaView.i();
        }
        return false;
    }

    public void hideTransparencyDialog() {
        jq.a().a(NotifyMessageNames.FEEDBACK_RECEIVE, new Intent("com.huawei.ads.feedback.action.FINISH_FEEDBACK_ACTIVITY"));
    }

    public void hideAdvertiserInfoDialog() {
        jq.a().a(NotifyMessageNames.FEEDBACK_RECEIVE, new Intent("com.huawei.ads.feedback.action.FINISH_FEEDBACK_ACTIVITY"));
    }

    @Override // com.huawei.openalliance.ad.views.interfaces.IPPSPlacementView
    public String getShowId() {
        return this.g;
    }

    @Override // com.huawei.openalliance.ad.views.interfaces.f
    public IAd getAd() {
        return getCurrentAd();
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        try {
            int iA = tz.a(motionEvent);
            if (iA == 0) {
                this.R = tz.a(this, motionEvent);
            }
            if (1 == iA) {
                tz.a(this, motionEvent, null, this.R);
            }
        } catch (Throwable th) {
            hw.c("PPSPlacementView", "dispatchTouchEvent exception : %s", th.getClass().getSimpleName());
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!com.huawei.openalliance.ad.utils.ab.t(getContext())) {
            return super.dispatchKeyEvent(keyEvent);
        }
        try {
            hw.a("PPSPlacementView", "keyCode:" + keyEvent.getKeyCode());
            int keyCode = keyEvent.getKeyCode();
            if (keyCode != 4) {
                if (keyCode == 23 || keyCode == 66) {
                    hw.a("PPSPlacementView", "enter--->");
                    if (isTransparencyDialogVisible()) {
                        if (keyEvent.getAction() == 0) {
                            hw.a("PPSPlacementView", "enter---> ACTION_DOWN: pressWhyThisAdClickBtn");
                            this.ae.l();
                        } else if (keyEvent.getAction() == 1) {
                            hw.a("PPSPlacementView", "enter---> ACTION_UP: outerProcessWhyEventUnified");
                            v();
                            ue ueVar = this.ae;
                            if (ueVar != null) {
                                removeView(ueVar);
                            }
                            this.ae = null;
                            return true;
                        }
                    }
                }
            } else {
                if (keyEvent.getAction() == 0) {
                    return super.dispatchKeyEvent(keyEvent);
                }
                hw.a("PPSPlacementView", "back--->");
                ue ueVar2 = this.ae;
                if (ueVar2 != null) {
                    removeView(ueVar2);
                    this.ae = null;
                    return true;
                }
            }
        } catch (Throwable th) {
            hw.c("PPSPlacementView", "dispatchKeyEvent() exception:" + th.toString());
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // com.huawei.openalliance.ad.views.interfaces.IViewLifeCycle
    public void destroyView() {
        dq.a(new Runnable() { // from class: com.huawei.openalliance.ad.views.PPSPlacementView.13
            @Override // java.lang.Runnable
            public void run() {
                hw.b("PPSPlacementView", RewardMethods.DESTROY_VIEW);
                if (PPSPlacementView.this.B != null) {
                    PPSPlacementView.this.B.g();
                    PPSPlacementView.this.B.destroyView();
                }
                PPSPlacementView.this.removeMediaChangeListener();
                PPSPlacementView.this.removePlacementMediaStateListener();
                PPSPlacementView.this.o();
                PPSPlacementView.this.f20941a.b();
                PPSPlacementView.this.f20942b.b();
                PPSPlacementView.this.f20943c.b();
                PPSPlacementView.this.j();
            }
        });
    }

    @Override // com.huawei.openalliance.ad.views.interfaces.f
    public boolean d() {
        jm jmVar = this.j;
        if (jmVar != null) {
            return jmVar.p();
        }
        return false;
    }

    @Override // com.huawei.openalliance.ad.jm.a
    public void b(long j, int i) {
        if (!this.r) {
            this.r = true;
            if (hw.a()) {
                hw.a("PPSPlacementView", "onAdPhyShow  duration: %s  maxShowRatio: %s  playedTime: %s  playedProgress: %s", Long.valueOf(j), Integer.valueOf(i), Integer.valueOf(this.d), Integer.valueOf(this.e));
            }
            com.huawei.openalliance.ad.inter.data.h currentAd = getCurrentAd();
            if (currentAd != null && currentAd.isVideoAd() && this.d <= 0) {
                this.d = 0;
                this.e = 0;
            }
            this.i.a(j, i, this.d, this.e);
        }
        this.K = false;
        this.J = false;
    }

    @Override // com.huawei.openalliance.ad.jm.a
    public void b() {
        mh mhVar;
        this.K = true;
        this.q = false;
        this.r = false;
        long jC = as.c();
        this.U = jC;
        hw.a("PPSPlacementView", "onViewPhysicalShowStart: %s", Long.valueOf(jC));
        com.huawei.openalliance.ad.inter.data.h currentAd = getCurrentAd();
        if (currentAd != null && (!currentAd.isVideoAd() || currentAd.q() == null || currentAd.q().intValue() == 0)) {
            currentAd.g(false);
            currentAd.a(false);
        }
        f();
        if (this.l != null) {
            c();
            if (this.ad.isState(PlacementPlayState.State.SINGLE_INST)) {
                mhVar = this.f20943c;
            } else {
                mhVar = this.ad.isState(PlacementPlayState.State.MAIN_VIEW) ? this.f20941a : this.f20942b;
            }
            mhVar.f();
        }
    }

    public void addPlacementMediaStateListener(IPlacementMediaStateListener iPlacementMediaStateListener) {
        if (iPlacementMediaStateListener == null) {
            return;
        }
        this.y = iPlacementMediaStateListener;
    }

    public void addMuteListener(MuteListener muteListener) {
        if (muteListener == null) {
            return;
        }
        PlacementMediaView placementMediaView = this.s;
        if (placementMediaView != null) {
            placementMediaView.a(muteListener);
        } else {
            this.w = muteListener;
        }
    }

    public void addMediaErrorListener(MediaErrorListener mediaErrorListener) {
        if (mediaErrorListener == null) {
            return;
        }
        PlacementMediaView placementMediaView = this.s;
        if (placementMediaView != null) {
            placementMediaView.a(mediaErrorListener);
        } else {
            this.x = mediaErrorListener;
        }
    }

    public void addMediaChangeListener(IPlacementMediaChangeListener iPlacementMediaChangeListener) {
        if (iPlacementMediaChangeListener == null) {
            return;
        }
        this.z = iPlacementMediaChangeListener;
    }

    public void addMediaBufferListener(MediaBufferListener mediaBufferListener) {
        if (mediaBufferListener == null) {
            return;
        }
        PlacementMediaView placementMediaView = this.s;
        if (placementMediaView != null) {
            placementMediaView.a(mediaBufferListener);
        } else {
            this.v = mediaBufferListener;
        }
    }

    @Override // com.huawei.openalliance.ad.views.interfaces.IPPSPlacementView
    public void a(Integer num) {
        a(Long.valueOf(System.currentTimeMillis() - this.j.d()), Integer.valueOf(this.j.c()), num);
    }

    @Override // com.huawei.openalliance.ad.jm.a
    public void a(long j, int i) {
        com.huawei.openalliance.ad.inter.data.h currentAd = getCurrentAd();
        if (currentAd != null) {
            Integer numQ = currentAd.q();
            if (!currentAd.isVideoAd() || numQ == null || numQ.intValue() == 0) {
                c(this.I, i);
            }
        }
    }

    @Override // com.huawei.openalliance.ad.jm.a
    public void a() {
        this.H = -1;
        this.G = -1;
        this.F = false;
    }

    private void v() {
        if (isTransparencyDialogVisible()) {
            this.ae.k();
        }
    }

    private boolean u() {
        hw.b("PPSPlacementView", "isNeedAudioFocus type: %s soundMute: %s", Integer.valueOf(this.L), Boolean.valueOf(this.D));
        int i = this.L;
        if (i == 0) {
            return true;
        }
        if (i == 2) {
            return false;
        }
        return (i == 1 && this.D) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public void t() {
        String str;
        try {
            try {
                hw.b("PPSPlacementView", "abandonAudioFocus");
                Object obj = this.ac;
                if (obj instanceof AudioFocusRequest) {
                    this.ab.abandonAudioFocusRequest((AudioFocusRequest) obj);
                }
                this.ac = null;
            } catch (IllegalStateException unused) {
                str = "abandonAudioFocus IllegalStateException";
                hw.c("PPSPlacementView", str);
            } catch (Exception e) {
                str = "abandonAudioFocus " + e.getClass().getSimpleName();
                hw.c("PPSPlacementView", str);
            }
        } finally {
            this.aa = false;
            this.W = 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void s() {
        String str;
        if (!u()) {
            hw.c("PPSPlacementView", "audio focus is not needed");
            return;
        }
        try {
            hw.b("PPSPlacementView", "requestAudioFocus");
            AudioFocusRequest audioFocusRequestBuild = new AudioFocusRequest.Builder(2).setOnAudioFocusChangeListener(this.ao).build();
            this.ac = audioFocusRequestBuild;
            this.ab.requestAudioFocus(audioFocusRequestBuild);
        } catch (IllegalStateException unused) {
            str = "requestAudioFocus IllegalStateException";
            hw.c("PPSPlacementView", str);
        } catch (Exception e) {
            str = "requestAudioFocus " + e.getClass().getSimpleName();
            hw.c("PPSPlacementView", str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void r() {
        dq.a(new Runnable() { // from class: com.huawei.openalliance.ad.views.PPSPlacementView.15
            @Override // java.lang.Runnable
            public void run() {
                if (PPSPlacementView.this.M == null) {
                    return;
                }
                try {
                    hw.b("PPSPlacementView", "hide last frame.");
                    PPSPlacementView.this.M.setVisibility(8);
                    PPSPlacementView pPSPlacementView = PPSPlacementView.this;
                    pPSPlacementView.removeView(pPSPlacementView.M);
                    PPSPlacementView.this.M = null;
                    PPSPlacementView.this.N = true;
                } catch (Throwable unused) {
                    hw.c("PPSPlacementView", "hideLastFrame error.");
                }
            }
        });
    }

    private void q() {
        if (this.M == null) {
            return;
        }
        try {
            hw.b("PPSPlacementView", "showLastFrame");
            this.N = false;
            this.M.setVisibility(0);
            this.M.setScaleType(ImageView.ScaleType.FIT_CENTER);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
            layoutParams.addRule(13);
            addView(this.M, layoutParams);
        } catch (Throwable unused) {
            hw.c("PPSPlacementView", "showLastFrame error.");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o() {
        this.Q = false;
        hw.b("PPSPlacementView", "timeout, cancel.");
        this.ak.removeMessages(1001);
    }

    private void n() {
        PlacementMediaView placementMediaView;
        hw.b("PPSPlacementView", "showNextAd");
        com.huawei.openalliance.ad.inter.data.h nextAd = getNextAd();
        if (nextAd != null) {
            this.j.b(nextAd.getMinEffectiveShowTime(), nextAd.getMinEffectiveShowRatio());
        }
        this.i.a(nextAd);
        this.i.e();
        if (this.ad.isState(PlacementPlayState.State.SINGLE_INST)) {
            this.u = b(this.u, nextAd);
            a(new PlacementPlayState(PlacementPlayState.State.SINGLE_INST), nextAd, this.u);
            a(this.u);
        } else {
            if (Math.abs(this.s.getAlpha() - 1.0f) < 0.01f) {
                this.ad.switchToState(PlacementPlayState.State.BACKUP_VIEW);
                a(this.t);
                placementMediaView = this.s;
            } else {
                this.ad.switchToState(PlacementPlayState.State.MAIN_VIEW);
                a(this.s);
                placementMediaView = this.t;
            }
            a(placementMediaView, false);
        }
        this.j.n();
        hw.b("PPSPlacementView", "show " + this.n + " ad");
    }

    private void m() {
        PlacementPlayState placementPlayState;
        com.huawei.openalliance.ad.inter.data.h hVar;
        PlacementMediaView placementMediaView;
        this.n++;
        hw.b("PPSPlacementView", "load " + this.n + " ad");
        if (getNextAd() == null || this.ad.isState(PlacementPlayState.State.SINGLE_INST)) {
            return;
        }
        if (Math.abs(this.s.getAlpha() - 1.0f) < 0.01f) {
            com.huawei.openalliance.ad.inter.data.h nextAd = getNextAd();
            this.m = nextAd;
            this.t = b(this.t, nextAd);
            placementPlayState = new PlacementPlayState(PlacementPlayState.State.BACKUP_VIEW);
            hVar = this.m;
            placementMediaView = this.t;
        } else {
            com.huawei.openalliance.ad.inter.data.h nextAd2 = getNextAd();
            this.l = nextAd2;
            this.s = b(this.s, nextAd2);
            placementPlayState = new PlacementPlayState(PlacementPlayState.State.MAIN_VIEW);
            hVar = this.l;
            placementMediaView = this.s;
        }
        a(placementPlayState, hVar, placementMediaView);
    }

    private void l() {
        ue ueVar = this.ae;
        if (ueVar != null) {
            removeView(ueVar);
            this.ae = null;
        }
    }

    private boolean k() {
        return this.n == this.k.size() - 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        List<jx> list = this.af;
        if (list != null) {
            for (jx jxVar : list) {
                if (jxVar != null) {
                    jxVar.b();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(this);
        this.p = arrayList;
        b(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        List<View> list = this.p;
        if (list == null || list.isEmpty()) {
            return;
        }
        Iterator<View> it = this.p.iterator();
        while (it.hasNext()) {
            it.next().setOnClickListener(null);
        }
        setOnClickListener(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public com.huawei.openalliance.ad.inter.data.h getNextAd() {
        if (this.n < this.k.size() - 1) {
            return this.k.get(this.n + 1);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void getMonitor() {
        if (this.ag.get()) {
            return;
        }
        this.ag.set(true);
        this.af = new ArrayList(this.k.size());
        for (com.huawei.openalliance.ad.inter.data.h hVar : this.k) {
            ContentRecord contentRecordA = pq.a(hVar);
            pc pcVar = new pc(getContext(), new ta(getContext()));
            pcVar.a(contentRecordA.b());
            pcVar.a(contentRecordA);
            this.ah.add(pcVar);
            jx jxVarA = jv.a(getContext(), hVar.isImageAd(), pcVar, contentRecordA, false);
            jv.a(contentRecordA.o(), jxVarA);
            this.af.add(jxVarA);
        }
    }

    private int getCurrentPlayTime() {
        int i = this.n;
        if (i < 1) {
            return 0;
        }
        return this.A[i - 1];
    }

    private MediaState getCurrentMediaState() {
        PlacementMediaView placementMediaView = this.B;
        if (placementMediaView == null) {
            return null;
        }
        return placementMediaView.getMediaState();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public PlacementMediaFile getCurrentMediaFile() {
        if (getCurrentAd() != null) {
            return getCurrentAd().getMediaFile();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String getCurrentContentId() {
        com.huawei.openalliance.ad.inter.data.h currentAd = getCurrentAd();
        if (currentAd == null) {
            return null;
        }
        return currentAd.getContentId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long getCurrentAdDuration() {
        PlacementMediaFile mediaFile;
        com.huawei.openalliance.ad.inter.data.h currentAd = getCurrentAd();
        if (currentAd == null || (mediaFile = currentAd.getMediaFile()) == null) {
            return 0L;
        }
        return mediaFile.getDuration();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public com.huawei.openalliance.ad.inter.data.h getCurrentAd() {
        if (this.n < this.k.size()) {
            return this.k.get(this.n);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        mh mhVar;
        if (this.h) {
            com.huawei.openalliance.ad.utils.ah.b();
            this.h = false;
            hw.b("PPSPlacementView", "onClick");
            a((Integer) 1);
            if (this.R == null) {
                this.R = this.f;
            }
            if (this.af != null) {
                hw.a("PPSPlacementView", "actualIndex %s", Integer.valueOf(this.ai));
                this.af.get(this.ai - 1);
            }
            this.i.a(this.R);
            this.f = null;
            this.R = null;
            if (this.ad.isState(PlacementPlayState.State.SINGLE_INST)) {
                mhVar = this.f20943c;
            } else {
                mhVar = this.ad.isState(PlacementPlayState.State.MAIN_VIEW) ? this.f20941a : this.f20942b;
            }
            b(mhVar);
            OnPlacementAdClickListener onPlacementAdClickListener = this.o;
            if (onPlacementAdClickListener != null) {
                onPlacementAdClickListener.onClick();
            }
            dq.a(new Runnable() { // from class: com.huawei.openalliance.ad.views.PPSPlacementView.2
                @Override // java.lang.Runnable
                public void run() {
                    PPSPlacementView.this.h = true;
                }
            }, 500L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        String strValueOf = String.valueOf(this.U);
        this.g = strValueOf;
        this.i.a(strValueOf);
        this.i.a(this.U);
        PlacementMediaView placementMediaView = this.u;
        if (placementMediaView != null) {
            placementMediaView.a(this.g);
            this.u.a(this.U);
        }
        PlacementMediaView placementMediaView2 = this.s;
        if (placementMediaView2 != null) {
            placementMediaView2.a(this.g);
            this.s.a(this.U);
        }
        PlacementMediaView placementMediaView3 = this.t;
        if (placementMediaView3 != null) {
            placementMediaView3.a(this.g);
            this.t.a(this.U);
        }
        List<com.huawei.openalliance.ad.inter.data.h> list = this.k;
        if (list != null) {
            Iterator<com.huawei.openalliance.ad.inter.data.h> it = list.iterator();
            while (it.hasNext()) {
                it.next().h(this.g);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        PlacementPlayState placementPlayState;
        com.huawei.openalliance.ad.inter.data.h hVar;
        PlacementMediaView placementMediaView;
        hw.a("PPSPlacementView", "initPlacementView, singlePlayerInst: %s", Boolean.valueOf(this.ad.isState(PlacementPlayState.State.SINGLE_INST)));
        this.j.b(this.l.getMinEffectiveShowTime(), this.l.getMinEffectiveShowRatio());
        this.i.a(this.l);
        if (this.ad.isState(PlacementPlayState.State.SINGLE_INST)) {
            PlacementMediaView placementMediaViewB = b(this.u, this.l);
            this.u = placementMediaViewB;
            placementMediaViewB.setMediaPlayerReleaseListener(this.V);
            placementPlayState = new PlacementPlayState(PlacementPlayState.State.SINGLE_INST);
            hVar = this.l;
            placementMediaView = this.u;
        } else {
            this.s = b(this.s, this.l);
            a(new PlacementPlayState(PlacementPlayState.State.MAIN_VIEW), this.l, this.s);
            this.t = b(this.t, this.m);
            placementPlayState = new PlacementPlayState(PlacementPlayState.State.BACKUP_VIEW);
            hVar = this.m;
            placementMediaView = this.t;
        }
        a(placementPlayState, hVar, placementMediaView);
    }

    private void d(mh mhVar) {
        List<View> list;
        mq mqVarA = mhVar.a();
        if (mqVarA == null || (list = this.C) == null || list.size() <= 0) {
            return;
        }
        Iterator<View> it = this.C.iterator();
        while (it.hasNext()) {
            mqVarA.a(it.next(), mp.OTHER, null);
        }
    }

    private void c(mh mhVar) {
        if (mhVar != null) {
            mhVar.e();
        }
    }

    private void c(long j, int i) {
        com.huawei.openalliance.ad.inter.data.h currentAd = getCurrentAd();
        if (currentAd != null) {
            Integer numQ = currentAd.q();
            if (currentAd.isVideoAd()) {
                if (numQ == null || numQ.intValue() == 0 || 1 == numQ.intValue()) {
                    if (this.q || j <= currentAd.getMinEffectiveShowTime()) {
                        return;
                    }
                    this.q = true;
                    hw.b("PPSPlacementView", "reportAdShowEvent, customExposureType： %s", numQ);
                } else {
                    if (2 != numQ.intValue() || currentAd.r() == null || this.q || this.G < currentAd.r().intValue()) {
                        return;
                    }
                    this.q = true;
                    hw.b("PPSPlacementView", "reportAdShowEvent, customExposureType： %s", numQ);
                }
            } else if (this.q || j <= currentAd.getMinEffectiveShowTime()) {
                return;
            } else {
                this.q = true;
            }
            a(Long.valueOf(j), Integer.valueOf(i), (Integer) null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        if (this.J) {
            return;
        }
        this.J = true;
        this.i.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(List<View> list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        for (View view : list) {
            if (view instanceof ab) {
                ((ab) view).setOnClickListener(this.an);
            } else {
                view.setOnClickListener(this.an);
                view.setOnTouchListener(this.am);
            }
        }
    }

    private void b(mh mhVar) {
        if (mhVar != null) {
            mhVar.a(mw.CLICK);
        }
    }

    private void b(int i) {
        int i2;
        if (this.F && (i2 = this.H) >= 0) {
            this.I = i - i2;
            this.F = false;
        }
        this.H = -1;
    }

    private PlacementMediaView b(PlacementMediaView placementMediaView, com.huawei.openalliance.ad.inter.data.h hVar) {
        if (hVar == null) {
            return null;
        }
        hw.a("PPSPlacementView", "init media view for content:%s", hVar.getContentId());
        boolean z = false;
        if (a(placementMediaView, hVar)) {
            a(placementMediaView, false);
        } else {
            a(placementMediaView, true);
            placementMediaView = null;
        }
        if (placementMediaView == null) {
            placementMediaView = a(hVar);
            z = true;
        }
        if (placementMediaView != null) {
            hw.b("PPSPlacementView", "meida view created");
            placementMediaView.b((SegmentMediaStateListener) this);
            MediaBufferListener mediaBufferListener = this.v;
            if (mediaBufferListener != null) {
                placementMediaView.a(mediaBufferListener);
            }
            PPSVideoRenderListener pPSVideoRenderListener = this.aj;
            if (pPSVideoRenderListener != null) {
                placementMediaView.a(pPSVideoRenderListener);
            }
            MuteListener muteListener = this.w;
            if (muteListener != null) {
                placementMediaView.a(muteListener);
            }
            placementMediaView.a((MuteListener) this);
            MediaErrorListener mediaErrorListener = this.x;
            if (mediaErrorListener != null) {
                placementMediaView.a(mediaErrorListener);
            }
            SegmentMediaStateListener segmentMediaStateListener = this.al;
            if (segmentMediaStateListener != null) {
                placementMediaView.a(segmentMediaStateListener);
            }
            if (z) {
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
                layoutParams.addRule(13);
                addView(placementMediaView, layoutParams);
            }
            placementMediaView.setAlpha(0.0f);
            placementMediaView.setPlacementAd(hVar);
            placementMediaView.setAudioFocusType(2);
        }
        return placementMediaView;
    }

    private boolean a(int[] iArr) {
        return iArr != null && iArr.length == 2;
    }

    private boolean a(PlacementMediaView placementMediaView, com.huawei.openalliance.ad.inter.data.h hVar) {
        if ((placementMediaView instanceof ab) && hVar.isVideoAd()) {
            return true;
        }
        return (placementMediaView instanceof aa) && hVar.isImageAd();
    }

    private void a(boolean z) {
        if (this.n < this.k.size() - 1) {
            l();
            n();
            if (z) {
                return;
            }
            m();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(List<IPlacementAd> list) {
        PlacementMediaFile mediaFile;
        PlacementMediaFile mediaFile2;
        if (bm.a(list)) {
            return;
        }
        ArrayList arrayList = new ArrayList(list);
        this.k.clear();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            IPlacementAd iPlacementAd = (IPlacementAd) arrayList.get(i);
            if ((iPlacementAd instanceof com.huawei.openalliance.ad.inter.data.h) && (mediaFile2 = iPlacementAd.getMediaFile()) != null) {
                dn dnVar = this.S;
                String strC = dnVar.c(dnVar.e(mediaFile2.getUrl()));
                mediaFile2.b(strC);
                if (2 == mediaFile2.getPlayMode() || com.huawei.openalliance.ad.utils.ai.b(strC)) {
                    this.k.add((com.huawei.openalliance.ad.inter.data.h) iPlacementAd);
                } else {
                    hw.b("PPSPlacementView", "has no cache, discard " + iPlacementAd.getContentId());
                }
            }
        }
        int size2 = this.k.size();
        this.A = new int[size2];
        if (bm.a(this.k)) {
            return;
        }
        Collections.sort(this.k);
        for (int i2 = 0; i2 < size2; i2++) {
            com.huawei.openalliance.ad.inter.data.h hVar = this.k.get(i2);
            int duration = (hVar == null || (mediaFile = hVar.getMediaFile()) == null) ? 0 : (int) mediaFile.getDuration();
            int[] iArr = this.A;
            if (i2 == 0) {
                iArr[i2] = duration;
            } else {
                iArr[i2] = duration + iArr[i2 - 1];
            }
        }
    }

    private void a(String str, String str2, int i, com.huawei.openalliance.ad.inter.data.h hVar) {
        if (hVar != null && hVar.q() != null) {
            Integer numQ = hVar.q();
            if (hVar.isVideoAd() && !hVar.K() && (numQ.intValue() == 1 || numQ.intValue() == 2)) {
                hw.b("PPSPlacementView", "reportAdShowEvent Media Over Completion reportAdShowEvent by customExposureType: %s", numQ);
                a((Integer) null);
            }
        }
        this.B.g();
        SegmentMediaStateListener segmentMediaStateListener = this.al;
        if (segmentMediaStateListener != null) {
            segmentMediaStateListener.onSegmentMediaCompletion(str, str2, i);
        }
        onSegmentMediaCompletion(str, str2, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(final String str, final String str2, final int i) {
        dq.a(new Runnable() { // from class: com.huawei.openalliance.ad.views.PPSPlacementView.16
            @Override // java.lang.Runnable
            public void run() {
                PPSPlacementView.this.onSegmentMediaError(str, str2, i, -1, -1);
            }
        });
    }

    private void a(Long l, Integer num, Integer num2) {
        mh mhVar;
        com.huawei.openalliance.ad.inter.data.h currentAd = getCurrentAd();
        this.i.a(dg.a(Long.valueOf(this.U)));
        this.i.a(this.U);
        if (currentAd == null) {
            return;
        }
        boolean zA = com.huawei.openalliance.ad.utils.c.a(currentAd.d(), num2);
        if (!currentAd.K() || (zA && !currentAd.b())) {
            hw.b("PPSPlacementView", "reportAdShowEvent, customExposureType： real onAdShow");
            this.i.a(l.longValue(), num.intValue(), num2);
            if (zA) {
                currentAd.a(true);
            }
            if (currentAd.K()) {
                return;
            }
            currentAd.g(true);
            if (this.ad.isState(PlacementPlayState.State.SINGLE_INST)) {
                mhVar = this.f20943c;
            } else {
                mhVar = this.ad.isState(PlacementPlayState.State.MAIN_VIEW) ? this.f20941a : this.f20942b;
            }
            c(mhVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(final PlacementMediaView placementMediaView, boolean z) {
        if (placementMediaView != null) {
            IPlacementAd placementAd = placementMediaView.getPlacementAd();
            hw.b("PPSPlacementView", "unloadMediaView, contentId: %s, remove: %s", placementAd != null ? placementAd.getContentId() : null, Boolean.valueOf(z));
            placementMediaView.g();
            placementMediaView.setPlacementAd(null);
            final ViewParent parent = placementMediaView.getParent();
            if (parent == null || !(parent instanceof ViewGroup)) {
                return;
            }
            placementMediaView.setAlpha(0.0f);
            if (z) {
                dq.a(new Runnable() { // from class: com.huawei.openalliance.ad.views.PPSPlacementView.20
                    @Override // java.lang.Runnable
                    public void run() {
                        PlacementMediaView placementMediaView2 = placementMediaView;
                        if (placementMediaView2 != null) {
                            placementMediaView2.a();
                        }
                        ViewParent viewParent = parent;
                        if (viewParent != null) {
                            ((ViewGroup) viewParent).removeView(placementMediaView);
                        }
                    }
                });
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(PlacementMediaView placementMediaView) {
        if (placementMediaView == null) {
            hw.c("PPSPlacementView", "show ad with null media view");
            return;
        }
        jx jxVar = this.af.get(this.ai);
        int i = this.ai;
        if (i > 0 && i < this.af.size()) {
            this.af.get(this.ai - 1).b();
        }
        jxVar.a(placementMediaView);
        if (placementMediaView instanceof ab) {
            jxVar.a(placementMediaView.getVideoView());
        }
        this.ai++;
        this.I = -1L;
        hw.a("PPSPlacementView", "showAd:%d", Integer.valueOf(this.n));
        this.B = placementMediaView;
        placementMediaView.setAlpha(1.0f);
        placementMediaView.a(true, this.D);
        if (!isShown()) {
            hw.c("PPSPlacementView", "view not visible, pause.");
            pauseView();
        }
        a(placementMediaView.getDuration() * 2);
    }

    private void a(mh mhVar, PlacementMediaView placementMediaView) {
        if (placementMediaView instanceof ab) {
            mhVar.a(my.a(0.0f, true, mx.STANDALONE));
            ((ab) placementMediaView).a(mhVar);
        } else if (placementMediaView instanceof aa) {
            mhVar.f();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(mh mhVar) {
        if (mhVar == null || getCurrentAd() == null || getCurrentAd().getMediaFile() == null) {
            return;
        }
        hw.b("PPSPlacementView", "om start");
        mhVar.a(getCurrentAd().getMediaFile().getDuration(), !"y".equals(getCurrentAd().getMediaFile().getSoundSwitch()));
    }

    private void a(ContentRecord contentRecord, ue ueVar, int[] iArr, int[] iArr2) {
        if (contentRecord == null || !contentRecord.bf() || dg.b(contentRecord.be())) {
            hw.b("PPSPlacementView", "addTransparencyDialog failed, switch close or empty url.");
            return;
        }
        if (as.a(iArr, 2) && as.a(iArr2, 2)) {
            if (hw.a()) {
                hw.a("PPSPlacementView", "addTransparencyDialog, loc: %s, %s", Integer.valueOf(iArr[0]), Integer.valueOf(iArr[1]));
                hw.a("PPSPlacementView", "addTransparencyDialog, size: %s, %s", Integer.valueOf(iArr2[0]), Integer.valueOf(iArr2[1]));
            }
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
            hw.b("PPSPlacementView", "添加弹框view");
            addView(ueVar, layoutParams);
            contentRecord.u(dg.e(contentRecord.ab()));
            ueVar.setScreenWidth(getMeasuredWidth());
            ueVar.setScreenHeight(getMeasuredHeight());
            ueVar.setAdContent(contentRecord);
        }
    }

    private void a(PlacementPlayState placementPlayState, IAd iAd, PlacementMediaView placementMediaView) {
        if (iAd instanceof com.huawei.openalliance.ad.inter.data.h) {
            ContentRecord contentRecordA = pq.a((com.huawei.openalliance.ad.inter.data.h) iAd);
            mh mhVarA = a(placementPlayState);
            mhVarA.a(getContext(), contentRecordA, placementMediaView, true);
            d(mhVarA);
            mhVarA.c();
            a(mhVarA, placementMediaView);
        }
    }

    private void a(View view, ContentRecord contentRecord, int[] iArr) {
        int[] iArrB = dk.b(view);
        int[] iArrC = dk.c(view);
        if (!a(iArr)) {
            iArr = iArrB;
        }
        ue ueVar = new ue(getContext(), iArr, iArrC, (Boolean) true);
        this.ae = ueVar;
        a(contentRecord, ueVar, iArr, iArrC);
    }

    private void a(Context context) {
        PlacementPlayState placementPlayState;
        PlacementPlayState.State state;
        setBackgroundColor(-16777216);
        setUseRatioInMatchParentMode(false);
        this.i = new nu(context, this);
        this.j = new jm(this, this);
        this.E = new com.huawei.openalliance.ad.analysis.c(context);
        this.S = com.huawei.openalliance.ad.dk.a(context, "normal");
        this.ab = (AudioManager) context.getSystemService("audio");
        if (fp.b(context).cz()) {
            placementPlayState = this.ad;
            state = PlacementPlayState.State.SINGLE_INST;
        } else {
            placementPlayState = this.ad;
            state = PlacementPlayState.State.MAIN_VIEW;
        }
        placementPlayState.switchToState(state);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(long j) {
        if (this.Q) {
            return;
        }
        this.Q = true;
        hw.b("PPSPlacementView", "timeout, submit: %s", Long.valueOf(j));
        this.ak.sendEmptyMessageDelayed(1001, j);
    }

    private void a(int i) {
        IPlacementMediaStateListener iPlacementMediaStateListener;
        if (i > 0 && !this.N) {
            r();
        }
        if (i <= 0 || !this.O || (iPlacementMediaStateListener = this.y) == null) {
            return;
        }
        this.O = false;
        this.P = true;
        iPlacementMediaStateListener.onMediaStart(this.H);
        s();
    }

    private PlacementMediaView a(com.huawei.openalliance.ad.inter.data.h hVar) {
        if (hVar == null) {
            hw.c("PPSPlacementView", "create media view with null ad");
            return null;
        }
        hw.a("PPSPlacementView", "create media view for content:%s", hVar.getContentId());
        if (hVar.isVideoAd()) {
            hw.b("PPSPlacementView", "create video view");
            return new ab(getContext());
        }
        if (hVar.isImageAd()) {
            hw.b("PPSPlacementView", "create image view");
            return new aa(getContext());
        }
        hw.b("PPSPlacementView", "return image view for default");
        return new aa(getContext());
    }

    private mh a(PlacementPlayState placementPlayState) {
        if (placementPlayState.isState(PlacementPlayState.State.SINGLE_INST)) {
            this.f20943c.b();
            lw lwVar = new lw();
            this.f20943c = lwVar;
            return lwVar;
        }
        if (placementPlayState.isState(PlacementPlayState.State.MAIN_VIEW)) {
            this.f20941a.b();
            lw lwVar2 = new lw();
            this.f20941a = lwVar2;
            return lwVar2;
        }
        this.f20942b.b();
        lw lwVar3 = new lw();
        this.f20942b = lwVar3;
        return lwVar3;
    }

    private int a(int i, com.huawei.openalliance.ad.inter.data.h hVar, long j) {
        if (this.y == null && !this.F && i <= 0) {
            return i;
        }
        if (i > j && j > 0) {
            i = (int) j;
        }
        int currentPlayTime = getCurrentPlayTime() + i;
        int[] iArr = this.A;
        int i2 = (iArr == null || iArr.length <= 0 || iArr[iArr.length + (-1)] <= 0) ? -1 : (int) ((currentPlayTime / iArr[iArr.length - 1]) * 100.0f);
        if (hVar != null) {
            this.d = currentPlayTime;
            this.e = i2;
        }
        IPlacementMediaStateListener iPlacementMediaStateListener = this.y;
        if (iPlacementMediaStateListener != null) {
            iPlacementMediaStateListener.onMediaProgress(i2, currentPlayTime);
        }
        return i;
    }

    /* JADX INFO: loaded from: classes41.dex */
    static class a implements AudioManager.OnAudioFocusChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private WeakReference<PPSPlacementView> f20978a;

        @Override // android.media.AudioManager.OnAudioFocusChangeListener
        public void onAudioFocusChange(final int i) {
            dq.a(new Runnable() { // from class: com.huawei.openalliance.ad.views.PPSPlacementView.a.1
                @Override // java.lang.Runnable
                public void run() {
                    PPSPlacementView pPSPlacementView = (PPSPlacementView) a.this.f20978a.get();
                    if (pPSPlacementView == null) {
                        return;
                    }
                    hw.b("PPSPlacementView", "onAudioFocusChange %d previous: %d", Integer.valueOf(i), Integer.valueOf(pPSPlacementView.W));
                    int i2 = i;
                    if (i2 == -3) {
                        a.this.b(pPSPlacementView);
                    } else if (i2 == -2 || i2 == -1) {
                        a.this.a(pPSPlacementView);
                    } else if (i2 == 1 || i2 == 2) {
                        a.this.c(pPSPlacementView);
                    }
                    pPSPlacementView.W = i;
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void c(PPSPlacementView pPSPlacementView) {
            hw.b("PPSPlacementView", "handleAudioFocusGain.");
            if (!pPSPlacementView.aa || pPSPlacementView.B == null) {
                return;
            }
            pPSPlacementView.B.d();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void b(PPSPlacementView pPSPlacementView) {
            hw.b("PPSPlacementView", "handleAudioFocusLossTransientCanDuck soundMuted: " + pPSPlacementView.D);
            if (pPSPlacementView.D || pPSPlacementView.B == null) {
                return;
            }
            pPSPlacementView.B.c();
            pPSPlacementView.aa = true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(PPSPlacementView pPSPlacementView) {
            b(pPSPlacementView);
        }

        public a(PPSPlacementView pPSPlacementView) {
            this.f20978a = new WeakReference<>(pPSPlacementView);
        }
    }

    public PPSPlacementView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f20941a = new lw();
        this.f20942b = new lw();
        this.f20943c = new lw();
        this.h = true;
        this.k = new ArrayList(4);
        this.n = 0;
        this.q = false;
        this.r = false;
        this.v = null;
        this.w = null;
        this.x = null;
        this.y = null;
        this.z = null;
        this.A = null;
        this.D = false;
        this.F = false;
        this.G = -1;
        this.H = -1;
        this.I = -1L;
        this.J = false;
        this.K = false;
        this.L = -1;
        this.M = null;
        this.N = false;
        this.O = false;
        this.P = false;
        this.Q = false;
        this.d = -1;
        this.e = -1;
        this.W = 0;
        this.aa = false;
        this.ad = new PlacementPlayState();
        this.ag = new AtomicBoolean();
        this.ah = new ArrayList();
        this.ai = 0;
        this.aj = new PPSVideoRenderListener() { // from class: com.huawei.openalliance.ad.views.PPSPlacementView.1
            @Override // com.huawei.openalliance.ad.media.listener.PPSVideoRenderListener
            public void onVideoRenderStart() {
                hw.b("PPSPlacementView", "videoRenderStart");
                PPSPlacementView.this.r();
                if (!PPSPlacementView.this.O || PPSPlacementView.this.y == null) {
                    return;
                }
                PPSPlacementView.this.O = false;
                PPSPlacementView.this.P = true;
                hw.b("PPSPlacementView", "onMediaStart callback, playTime: %s", Integer.valueOf(PPSPlacementView.this.H));
                PPSPlacementView.this.y.onMediaStart(PPSPlacementView.this.H);
                PPSPlacementView.this.s();
            }
        };
        this.ak = new Handler(Looper.myLooper(), new Handler.Callback() { // from class: com.huawei.openalliance.ad.views.PPSPlacementView.12
            @Override // android.os.Handler.Callback
            public boolean handleMessage(Message message) {
                int duration;
                com.huawei.openalliance.ad.inter.data.h currentAd = PPSPlacementView.this.getCurrentAd();
                PlacementMediaFile currentMediaFile = PPSPlacementView.this.getCurrentMediaFile();
                String url = "";
                String contentId = currentAd != null ? currentAd.getContentId() : "";
                if (currentMediaFile != null) {
                    url = currentMediaFile.getUrl();
                    duration = (int) currentMediaFile.getDuration();
                } else {
                    duration = 0;
                }
                hw.b("PPSPlacementView", "callback timeout: %s", contentId);
                if (PPSPlacementView.this.B == null) {
                    return true;
                }
                hw.b("PPSPlacementView", "notify Error");
                PPSPlacementView.this.a(contentId, url, duration);
                return true;
            }
        });
        this.al = new SegmentMediaStateListener() { // from class: com.huawei.openalliance.ad.views.PPSPlacementView.17
            @Override // com.huawei.openalliance.ad.media.listener.SegmentMediaStateListener
            public void onSegmentMediaError(String str, String str2, int i3, int i4, int i5) {
            }

            @Override // com.huawei.openalliance.ad.media.listener.SegmentMediaStateListener
            public void onSegmentProgress(String str, String str2, int i3, int i4) {
                mh mhVar;
                if ((str == null || str.equalsIgnoreCase(PPSPlacementView.this.getCurrentContentId())) && !PPSPlacementView.this.T && (PPSPlacementView.this.B instanceof ab)) {
                    if (PPSPlacementView.this.ad.isState(PlacementPlayState.State.SINGLE_INST)) {
                        mhVar = PPSPlacementView.this.f20943c;
                    } else {
                        mhVar = PPSPlacementView.this.ad.isState(PlacementPlayState.State.MAIN_VIEW) ? PPSPlacementView.this.f20941a : PPSPlacementView.this.f20942b;
                    }
                    mhVar.a(i3);
                }
            }

            @Override // com.huawei.openalliance.ad.media.listener.SegmentMediaStateListener
            public void onSegmentMediaStop(String str, String str2, int i3) {
                if (hw.a()) {
                    hw.a("PPSPlacementView", "OM onSegmentMediaStop");
                }
                if (str != null && !str.equalsIgnoreCase(PPSPlacementView.this.getCurrentContentId())) {
                    hw.b("PPSPlacementView", "OM onSegmentMediaStop not equals");
                    return;
                }
                if (PPSPlacementView.this.T) {
                    return;
                }
                PPSPlacementView.this.T = true;
                if (PPSPlacementView.this.B instanceof ab) {
                    if (PPSPlacementView.this.ad.isState(PlacementPlayState.State.SINGLE_INST)) {
                        PPSPlacementView.this.f20943c.g();
                    } else if (PPSPlacementView.this.ad.isState(PlacementPlayState.State.MAIN_VIEW)) {
                        PPSPlacementView.this.f20941a.g();
                    } else {
                        PPSPlacementView.this.f20942b.g();
                    }
                }
            }

            @Override // com.huawei.openalliance.ad.media.listener.SegmentMediaStateListener
            public void onSegmentMediaStart(String str, String str2, int i3) {
                if (hw.a()) {
                    hw.a("PPSPlacementView", "OM onSegmentMediaStart");
                }
                PPSPlacementView.this.T = false;
                if (PPSPlacementView.this.B instanceof ab) {
                    boolean zIsState = PPSPlacementView.this.ad.isState(PlacementPlayState.State.SINGLE_INST);
                    if (i3 > 0) {
                        if (zIsState) {
                            PPSPlacementView.this.f20943c.l();
                            return;
                        } else if (PPSPlacementView.this.ad.isState(PlacementPlayState.State.MAIN_VIEW)) {
                            PPSPlacementView.this.f20941a.l();
                            return;
                        } else {
                            PPSPlacementView.this.f20942b.l();
                            return;
                        }
                    }
                    if (!zIsState) {
                        if (PPSPlacementView.this.ad.isState(PlacementPlayState.State.MAIN_VIEW)) {
                            PPSPlacementView pPSPlacementView = PPSPlacementView.this;
                            pPSPlacementView.a(pPSPlacementView.f20941a);
                            return;
                        } else {
                            PPSPlacementView pPSPlacementView2 = PPSPlacementView.this;
                            pPSPlacementView2.a(pPSPlacementView2.f20942b);
                            return;
                        }
                    }
                    PPSPlacementView pPSPlacementView3 = PPSPlacementView.this;
                    pPSPlacementView3.a(pPSPlacementView3.f20943c);
                }
            }

            @Override // com.huawei.openalliance.ad.media.listener.SegmentMediaStateListener
            public void onSegmentMediaPause(String str, String str2, int i3) {
                mh mhVar;
                if (hw.a()) {
                    hw.a("PPSPlacementView", "OM onSegmentMediaPause");
                }
                if ((str == null || str.equalsIgnoreCase(PPSPlacementView.this.getCurrentContentId())) && (PPSPlacementView.this.B instanceof ab)) {
                    if (PPSPlacementView.this.ad.isState(PlacementPlayState.State.SINGLE_INST)) {
                        mhVar = PPSPlacementView.this.f20943c;
                    } else {
                        mhVar = PPSPlacementView.this.ad.isState(PlacementPlayState.State.MAIN_VIEW) ? PPSPlacementView.this.f20941a : PPSPlacementView.this.f20942b;
                    }
                    mhVar.k();
                }
            }

            @Override // com.huawei.openalliance.ad.media.listener.SegmentMediaStateListener
            public void onSegmentMediaCompletion(String str, String str2, int i3) {
                if (hw.a()) {
                    hw.a("PPSPlacementView", "OM onSegmentMediaCompletion");
                }
                if (str != null && !str.equalsIgnoreCase(PPSPlacementView.this.getCurrentContentId())) {
                    hw.b("PPSPlacementView", "OM onSegmentMediaCompletion not equals");
                    return;
                }
                if (PPSPlacementView.this.T) {
                    return;
                }
                PPSPlacementView.this.T = true;
                if (PPSPlacementView.this.B instanceof ab) {
                    if (PPSPlacementView.this.ad.isState(PlacementPlayState.State.SINGLE_INST)) {
                        PPSPlacementView.this.f20943c.g();
                    } else if (PPSPlacementView.this.ad.isState(PlacementPlayState.State.MAIN_VIEW)) {
                        PPSPlacementView.this.f20941a.g();
                    } else {
                        PPSPlacementView.this.f20942b.g();
                    }
                }
            }
        };
        this.am = new View.OnTouchListener() { // from class: com.huawei.openalliance.ad.views.PPSPlacementView.22
            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view, MotionEvent motionEvent) {
                hw.a("PPSPlacementView", "clickable.OnTouchListener.ontouch");
                try {
                    int iA = tz.a(motionEvent);
                    if (iA == 0) {
                        PPSPlacementView.this.f = tz.a(view, motionEvent);
                        PPSPlacementView.this.f.a(vv.b(PPSPlacementView.this));
                    }
                    if (1 != iA) {
                        return false;
                    }
                    tz.a(view, motionEvent, null, PPSPlacementView.this.f);
                    return false;
                } catch (Throwable th) {
                    hw.c("PPSPlacementView", "clickable.OnTouchListener.ontouch exception : %s", th.getClass().getSimpleName());
                    return false;
                }
            }
        };
        this.an = new View.OnClickListener() { // from class: com.huawei.openalliance.ad.views.PPSPlacementView.23
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                dq.a(new Runnable() { // from class: com.huawei.openalliance.ad.views.PPSPlacementView.23.1
                    @Override // java.lang.Runnable
                    public void run() {
                        PPSPlacementView.this.g();
                    }
                });
            }
        };
        this.ao = new a(this);
        a(context);
    }

    public PPSPlacementView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f20941a = new lw();
        this.f20942b = new lw();
        this.f20943c = new lw();
        this.h = true;
        this.k = new ArrayList(4);
        this.n = 0;
        this.q = false;
        this.r = false;
        this.v = null;
        this.w = null;
        this.x = null;
        this.y = null;
        this.z = null;
        this.A = null;
        this.D = false;
        this.F = false;
        this.G = -1;
        this.H = -1;
        this.I = -1L;
        this.J = false;
        this.K = false;
        this.L = -1;
        this.M = null;
        this.N = false;
        this.O = false;
        this.P = false;
        this.Q = false;
        this.d = -1;
        this.e = -1;
        this.W = 0;
        this.aa = false;
        this.ad = new PlacementPlayState();
        this.ag = new AtomicBoolean();
        this.ah = new ArrayList();
        this.ai = 0;
        this.aj = new PPSVideoRenderListener() { // from class: com.huawei.openalliance.ad.views.PPSPlacementView.1
            @Override // com.huawei.openalliance.ad.media.listener.PPSVideoRenderListener
            public void onVideoRenderStart() {
                hw.b("PPSPlacementView", "videoRenderStart");
                PPSPlacementView.this.r();
                if (!PPSPlacementView.this.O || PPSPlacementView.this.y == null) {
                    return;
                }
                PPSPlacementView.this.O = false;
                PPSPlacementView.this.P = true;
                hw.b("PPSPlacementView", "onMediaStart callback, playTime: %s", Integer.valueOf(PPSPlacementView.this.H));
                PPSPlacementView.this.y.onMediaStart(PPSPlacementView.this.H);
                PPSPlacementView.this.s();
            }
        };
        this.ak = new Handler(Looper.myLooper(), new Handler.Callback() { // from class: com.huawei.openalliance.ad.views.PPSPlacementView.12
            @Override // android.os.Handler.Callback
            public boolean handleMessage(Message message) {
                int duration;
                com.huawei.openalliance.ad.inter.data.h currentAd = PPSPlacementView.this.getCurrentAd();
                PlacementMediaFile currentMediaFile = PPSPlacementView.this.getCurrentMediaFile();
                String url = "";
                String contentId = currentAd != null ? currentAd.getContentId() : "";
                if (currentMediaFile != null) {
                    url = currentMediaFile.getUrl();
                    duration = (int) currentMediaFile.getDuration();
                } else {
                    duration = 0;
                }
                hw.b("PPSPlacementView", "callback timeout: %s", contentId);
                if (PPSPlacementView.this.B == null) {
                    return true;
                }
                hw.b("PPSPlacementView", "notify Error");
                PPSPlacementView.this.a(contentId, url, duration);
                return true;
            }
        });
        this.al = new SegmentMediaStateListener() { // from class: com.huawei.openalliance.ad.views.PPSPlacementView.17
            @Override // com.huawei.openalliance.ad.media.listener.SegmentMediaStateListener
            public void onSegmentMediaError(String str, String str2, int i3, int i4, int i5) {
            }

            @Override // com.huawei.openalliance.ad.media.listener.SegmentMediaStateListener
            public void onSegmentProgress(String str, String str2, int i3, int i4) {
                mh mhVar;
                if ((str == null || str.equalsIgnoreCase(PPSPlacementView.this.getCurrentContentId())) && !PPSPlacementView.this.T && (PPSPlacementView.this.B instanceof ab)) {
                    if (PPSPlacementView.this.ad.isState(PlacementPlayState.State.SINGLE_INST)) {
                        mhVar = PPSPlacementView.this.f20943c;
                    } else {
                        mhVar = PPSPlacementView.this.ad.isState(PlacementPlayState.State.MAIN_VIEW) ? PPSPlacementView.this.f20941a : PPSPlacementView.this.f20942b;
                    }
                    mhVar.a(i3);
                }
            }

            @Override // com.huawei.openalliance.ad.media.listener.SegmentMediaStateListener
            public void onSegmentMediaStop(String str, String str2, int i3) {
                if (hw.a()) {
                    hw.a("PPSPlacementView", "OM onSegmentMediaStop");
                }
                if (str != null && !str.equalsIgnoreCase(PPSPlacementView.this.getCurrentContentId())) {
                    hw.b("PPSPlacementView", "OM onSegmentMediaStop not equals");
                    return;
                }
                if (PPSPlacementView.this.T) {
                    return;
                }
                PPSPlacementView.this.T = true;
                if (PPSPlacementView.this.B instanceof ab) {
                    if (PPSPlacementView.this.ad.isState(PlacementPlayState.State.SINGLE_INST)) {
                        PPSPlacementView.this.f20943c.g();
                    } else if (PPSPlacementView.this.ad.isState(PlacementPlayState.State.MAIN_VIEW)) {
                        PPSPlacementView.this.f20941a.g();
                    } else {
                        PPSPlacementView.this.f20942b.g();
                    }
                }
            }

            @Override // com.huawei.openalliance.ad.media.listener.SegmentMediaStateListener
            public void onSegmentMediaStart(String str, String str2, int i3) {
                if (hw.a()) {
                    hw.a("PPSPlacementView", "OM onSegmentMediaStart");
                }
                PPSPlacementView.this.T = false;
                if (PPSPlacementView.this.B instanceof ab) {
                    boolean zIsState = PPSPlacementView.this.ad.isState(PlacementPlayState.State.SINGLE_INST);
                    if (i3 > 0) {
                        if (zIsState) {
                            PPSPlacementView.this.f20943c.l();
                            return;
                        } else if (PPSPlacementView.this.ad.isState(PlacementPlayState.State.MAIN_VIEW)) {
                            PPSPlacementView.this.f20941a.l();
                            return;
                        } else {
                            PPSPlacementView.this.f20942b.l();
                            return;
                        }
                    }
                    if (!zIsState) {
                        if (PPSPlacementView.this.ad.isState(PlacementPlayState.State.MAIN_VIEW)) {
                            PPSPlacementView pPSPlacementView = PPSPlacementView.this;
                            pPSPlacementView.a(pPSPlacementView.f20941a);
                            return;
                        } else {
                            PPSPlacementView pPSPlacementView2 = PPSPlacementView.this;
                            pPSPlacementView2.a(pPSPlacementView2.f20942b);
                            return;
                        }
                    }
                    PPSPlacementView pPSPlacementView3 = PPSPlacementView.this;
                    pPSPlacementView3.a(pPSPlacementView3.f20943c);
                }
            }

            @Override // com.huawei.openalliance.ad.media.listener.SegmentMediaStateListener
            public void onSegmentMediaPause(String str, String str2, int i3) {
                mh mhVar;
                if (hw.a()) {
                    hw.a("PPSPlacementView", "OM onSegmentMediaPause");
                }
                if ((str == null || str.equalsIgnoreCase(PPSPlacementView.this.getCurrentContentId())) && (PPSPlacementView.this.B instanceof ab)) {
                    if (PPSPlacementView.this.ad.isState(PlacementPlayState.State.SINGLE_INST)) {
                        mhVar = PPSPlacementView.this.f20943c;
                    } else {
                        mhVar = PPSPlacementView.this.ad.isState(PlacementPlayState.State.MAIN_VIEW) ? PPSPlacementView.this.f20941a : PPSPlacementView.this.f20942b;
                    }
                    mhVar.k();
                }
            }

            @Override // com.huawei.openalliance.ad.media.listener.SegmentMediaStateListener
            public void onSegmentMediaCompletion(String str, String str2, int i3) {
                if (hw.a()) {
                    hw.a("PPSPlacementView", "OM onSegmentMediaCompletion");
                }
                if (str != null && !str.equalsIgnoreCase(PPSPlacementView.this.getCurrentContentId())) {
                    hw.b("PPSPlacementView", "OM onSegmentMediaCompletion not equals");
                    return;
                }
                if (PPSPlacementView.this.T) {
                    return;
                }
                PPSPlacementView.this.T = true;
                if (PPSPlacementView.this.B instanceof ab) {
                    if (PPSPlacementView.this.ad.isState(PlacementPlayState.State.SINGLE_INST)) {
                        PPSPlacementView.this.f20943c.g();
                    } else if (PPSPlacementView.this.ad.isState(PlacementPlayState.State.MAIN_VIEW)) {
                        PPSPlacementView.this.f20941a.g();
                    } else {
                        PPSPlacementView.this.f20942b.g();
                    }
                }
            }
        };
        this.am = new View.OnTouchListener() { // from class: com.huawei.openalliance.ad.views.PPSPlacementView.22
            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view, MotionEvent motionEvent) {
                hw.a("PPSPlacementView", "clickable.OnTouchListener.ontouch");
                try {
                    int iA = tz.a(motionEvent);
                    if (iA == 0) {
                        PPSPlacementView.this.f = tz.a(view, motionEvent);
                        PPSPlacementView.this.f.a(vv.b(PPSPlacementView.this));
                    }
                    if (1 != iA) {
                        return false;
                    }
                    tz.a(view, motionEvent, null, PPSPlacementView.this.f);
                    return false;
                } catch (Throwable th) {
                    hw.c("PPSPlacementView", "clickable.OnTouchListener.ontouch exception : %s", th.getClass().getSimpleName());
                    return false;
                }
            }
        };
        this.an = new View.OnClickListener() { // from class: com.huawei.openalliance.ad.views.PPSPlacementView.23
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                dq.a(new Runnable() { // from class: com.huawei.openalliance.ad.views.PPSPlacementView.23.1
                    @Override // java.lang.Runnable
                    public void run() {
                        PPSPlacementView.this.g();
                    }
                });
            }
        };
        this.ao = new a(this);
        a(context);
    }

    public PPSPlacementView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f20941a = new lw();
        this.f20942b = new lw();
        this.f20943c = new lw();
        this.h = true;
        this.k = new ArrayList(4);
        this.n = 0;
        this.q = false;
        this.r = false;
        this.v = null;
        this.w = null;
        this.x = null;
        this.y = null;
        this.z = null;
        this.A = null;
        this.D = false;
        this.F = false;
        this.G = -1;
        this.H = -1;
        this.I = -1L;
        this.J = false;
        this.K = false;
        this.L = -1;
        this.M = null;
        this.N = false;
        this.O = false;
        this.P = false;
        this.Q = false;
        this.d = -1;
        this.e = -1;
        this.W = 0;
        this.aa = false;
        this.ad = new PlacementPlayState();
        this.ag = new AtomicBoolean();
        this.ah = new ArrayList();
        this.ai = 0;
        this.aj = new PPSVideoRenderListener() { // from class: com.huawei.openalliance.ad.views.PPSPlacementView.1
            @Override // com.huawei.openalliance.ad.media.listener.PPSVideoRenderListener
            public void onVideoRenderStart() {
                hw.b("PPSPlacementView", "videoRenderStart");
                PPSPlacementView.this.r();
                if (!PPSPlacementView.this.O || PPSPlacementView.this.y == null) {
                    return;
                }
                PPSPlacementView.this.O = false;
                PPSPlacementView.this.P = true;
                hw.b("PPSPlacementView", "onMediaStart callback, playTime: %s", Integer.valueOf(PPSPlacementView.this.H));
                PPSPlacementView.this.y.onMediaStart(PPSPlacementView.this.H);
                PPSPlacementView.this.s();
            }
        };
        this.ak = new Handler(Looper.myLooper(), new Handler.Callback() { // from class: com.huawei.openalliance.ad.views.PPSPlacementView.12
            @Override // android.os.Handler.Callback
            public boolean handleMessage(Message message) {
                int duration;
                com.huawei.openalliance.ad.inter.data.h currentAd = PPSPlacementView.this.getCurrentAd();
                PlacementMediaFile currentMediaFile = PPSPlacementView.this.getCurrentMediaFile();
                String url = "";
                String contentId = currentAd != null ? currentAd.getContentId() : "";
                if (currentMediaFile != null) {
                    url = currentMediaFile.getUrl();
                    duration = (int) currentMediaFile.getDuration();
                } else {
                    duration = 0;
                }
                hw.b("PPSPlacementView", "callback timeout: %s", contentId);
                if (PPSPlacementView.this.B == null) {
                    return true;
                }
                hw.b("PPSPlacementView", "notify Error");
                PPSPlacementView.this.a(contentId, url, duration);
                return true;
            }
        });
        this.al = new SegmentMediaStateListener() { // from class: com.huawei.openalliance.ad.views.PPSPlacementView.17
            @Override // com.huawei.openalliance.ad.media.listener.SegmentMediaStateListener
            public void onSegmentMediaError(String str, String str2, int i3, int i4, int i5) {
            }

            @Override // com.huawei.openalliance.ad.media.listener.SegmentMediaStateListener
            public void onSegmentProgress(String str, String str2, int i3, int i4) {
                mh mhVar;
                if ((str == null || str.equalsIgnoreCase(PPSPlacementView.this.getCurrentContentId())) && !PPSPlacementView.this.T && (PPSPlacementView.this.B instanceof ab)) {
                    if (PPSPlacementView.this.ad.isState(PlacementPlayState.State.SINGLE_INST)) {
                        mhVar = PPSPlacementView.this.f20943c;
                    } else {
                        mhVar = PPSPlacementView.this.ad.isState(PlacementPlayState.State.MAIN_VIEW) ? PPSPlacementView.this.f20941a : PPSPlacementView.this.f20942b;
                    }
                    mhVar.a(i3);
                }
            }

            @Override // com.huawei.openalliance.ad.media.listener.SegmentMediaStateListener
            public void onSegmentMediaStop(String str, String str2, int i3) {
                if (hw.a()) {
                    hw.a("PPSPlacementView", "OM onSegmentMediaStop");
                }
                if (str != null && !str.equalsIgnoreCase(PPSPlacementView.this.getCurrentContentId())) {
                    hw.b("PPSPlacementView", "OM onSegmentMediaStop not equals");
                    return;
                }
                if (PPSPlacementView.this.T) {
                    return;
                }
                PPSPlacementView.this.T = true;
                if (PPSPlacementView.this.B instanceof ab) {
                    if (PPSPlacementView.this.ad.isState(PlacementPlayState.State.SINGLE_INST)) {
                        PPSPlacementView.this.f20943c.g();
                    } else if (PPSPlacementView.this.ad.isState(PlacementPlayState.State.MAIN_VIEW)) {
                        PPSPlacementView.this.f20941a.g();
                    } else {
                        PPSPlacementView.this.f20942b.g();
                    }
                }
            }

            @Override // com.huawei.openalliance.ad.media.listener.SegmentMediaStateListener
            public void onSegmentMediaStart(String str, String str2, int i3) {
                if (hw.a()) {
                    hw.a("PPSPlacementView", "OM onSegmentMediaStart");
                }
                PPSPlacementView.this.T = false;
                if (PPSPlacementView.this.B instanceof ab) {
                    boolean zIsState = PPSPlacementView.this.ad.isState(PlacementPlayState.State.SINGLE_INST);
                    if (i3 > 0) {
                        if (zIsState) {
                            PPSPlacementView.this.f20943c.l();
                            return;
                        } else if (PPSPlacementView.this.ad.isState(PlacementPlayState.State.MAIN_VIEW)) {
                            PPSPlacementView.this.f20941a.l();
                            return;
                        } else {
                            PPSPlacementView.this.f20942b.l();
                            return;
                        }
                    }
                    if (!zIsState) {
                        if (PPSPlacementView.this.ad.isState(PlacementPlayState.State.MAIN_VIEW)) {
                            PPSPlacementView pPSPlacementView = PPSPlacementView.this;
                            pPSPlacementView.a(pPSPlacementView.f20941a);
                            return;
                        } else {
                            PPSPlacementView pPSPlacementView2 = PPSPlacementView.this;
                            pPSPlacementView2.a(pPSPlacementView2.f20942b);
                            return;
                        }
                    }
                    PPSPlacementView pPSPlacementView3 = PPSPlacementView.this;
                    pPSPlacementView3.a(pPSPlacementView3.f20943c);
                }
            }

            @Override // com.huawei.openalliance.ad.media.listener.SegmentMediaStateListener
            public void onSegmentMediaPause(String str, String str2, int i3) {
                mh mhVar;
                if (hw.a()) {
                    hw.a("PPSPlacementView", "OM onSegmentMediaPause");
                }
                if ((str == null || str.equalsIgnoreCase(PPSPlacementView.this.getCurrentContentId())) && (PPSPlacementView.this.B instanceof ab)) {
                    if (PPSPlacementView.this.ad.isState(PlacementPlayState.State.SINGLE_INST)) {
                        mhVar = PPSPlacementView.this.f20943c;
                    } else {
                        mhVar = PPSPlacementView.this.ad.isState(PlacementPlayState.State.MAIN_VIEW) ? PPSPlacementView.this.f20941a : PPSPlacementView.this.f20942b;
                    }
                    mhVar.k();
                }
            }

            @Override // com.huawei.openalliance.ad.media.listener.SegmentMediaStateListener
            public void onSegmentMediaCompletion(String str, String str2, int i3) {
                if (hw.a()) {
                    hw.a("PPSPlacementView", "OM onSegmentMediaCompletion");
                }
                if (str != null && !str.equalsIgnoreCase(PPSPlacementView.this.getCurrentContentId())) {
                    hw.b("PPSPlacementView", "OM onSegmentMediaCompletion not equals");
                    return;
                }
                if (PPSPlacementView.this.T) {
                    return;
                }
                PPSPlacementView.this.T = true;
                if (PPSPlacementView.this.B instanceof ab) {
                    if (PPSPlacementView.this.ad.isState(PlacementPlayState.State.SINGLE_INST)) {
                        PPSPlacementView.this.f20943c.g();
                    } else if (PPSPlacementView.this.ad.isState(PlacementPlayState.State.MAIN_VIEW)) {
                        PPSPlacementView.this.f20941a.g();
                    } else {
                        PPSPlacementView.this.f20942b.g();
                    }
                }
            }
        };
        this.am = new View.OnTouchListener() { // from class: com.huawei.openalliance.ad.views.PPSPlacementView.22
            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view, MotionEvent motionEvent) {
                hw.a("PPSPlacementView", "clickable.OnTouchListener.ontouch");
                try {
                    int iA = tz.a(motionEvent);
                    if (iA == 0) {
                        PPSPlacementView.this.f = tz.a(view, motionEvent);
                        PPSPlacementView.this.f.a(vv.b(PPSPlacementView.this));
                    }
                    if (1 != iA) {
                        return false;
                    }
                    tz.a(view, motionEvent, null, PPSPlacementView.this.f);
                    return false;
                } catch (Throwable th) {
                    hw.c("PPSPlacementView", "clickable.OnTouchListener.ontouch exception : %s", th.getClass().getSimpleName());
                    return false;
                }
            }
        };
        this.an = new View.OnClickListener() { // from class: com.huawei.openalliance.ad.views.PPSPlacementView.23
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                dq.a(new Runnable() { // from class: com.huawei.openalliance.ad.views.PPSPlacementView.23.1
                    @Override // java.lang.Runnable
                    public void run() {
                        PPSPlacementView.this.g();
                    }
                });
            }
        };
        this.ao = new a(this);
        a(context);
    }

    public PPSPlacementView(Context context) {
        super(context);
        this.f20941a = new lw();
        this.f20942b = new lw();
        this.f20943c = new lw();
        this.h = true;
        this.k = new ArrayList(4);
        this.n = 0;
        this.q = false;
        this.r = false;
        this.v = null;
        this.w = null;
        this.x = null;
        this.y = null;
        this.z = null;
        this.A = null;
        this.D = false;
        this.F = false;
        this.G = -1;
        this.H = -1;
        this.I = -1L;
        this.J = false;
        this.K = false;
        this.L = -1;
        this.M = null;
        this.N = false;
        this.O = false;
        this.P = false;
        this.Q = false;
        this.d = -1;
        this.e = -1;
        this.W = 0;
        this.aa = false;
        this.ad = new PlacementPlayState();
        this.ag = new AtomicBoolean();
        this.ah = new ArrayList();
        this.ai = 0;
        this.aj = new PPSVideoRenderListener() { // from class: com.huawei.openalliance.ad.views.PPSPlacementView.1
            @Override // com.huawei.openalliance.ad.media.listener.PPSVideoRenderListener
            public void onVideoRenderStart() {
                hw.b("PPSPlacementView", "videoRenderStart");
                PPSPlacementView.this.r();
                if (!PPSPlacementView.this.O || PPSPlacementView.this.y == null) {
                    return;
                }
                PPSPlacementView.this.O = false;
                PPSPlacementView.this.P = true;
                hw.b("PPSPlacementView", "onMediaStart callback, playTime: %s", Integer.valueOf(PPSPlacementView.this.H));
                PPSPlacementView.this.y.onMediaStart(PPSPlacementView.this.H);
                PPSPlacementView.this.s();
            }
        };
        this.ak = new Handler(Looper.myLooper(), new Handler.Callback() { // from class: com.huawei.openalliance.ad.views.PPSPlacementView.12
            @Override // android.os.Handler.Callback
            public boolean handleMessage(Message message) {
                int duration;
                com.huawei.openalliance.ad.inter.data.h currentAd = PPSPlacementView.this.getCurrentAd();
                PlacementMediaFile currentMediaFile = PPSPlacementView.this.getCurrentMediaFile();
                String url = "";
                String contentId = currentAd != null ? currentAd.getContentId() : "";
                if (currentMediaFile != null) {
                    url = currentMediaFile.getUrl();
                    duration = (int) currentMediaFile.getDuration();
                } else {
                    duration = 0;
                }
                hw.b("PPSPlacementView", "callback timeout: %s", contentId);
                if (PPSPlacementView.this.B == null) {
                    return true;
                }
                hw.b("PPSPlacementView", "notify Error");
                PPSPlacementView.this.a(contentId, url, duration);
                return true;
            }
        });
        this.al = new SegmentMediaStateListener() { // from class: com.huawei.openalliance.ad.views.PPSPlacementView.17
            @Override // com.huawei.openalliance.ad.media.listener.SegmentMediaStateListener
            public void onSegmentMediaError(String str, String str2, int i3, int i4, int i5) {
            }

            @Override // com.huawei.openalliance.ad.media.listener.SegmentMediaStateListener
            public void onSegmentProgress(String str, String str2, int i3, int i4) {
                mh mhVar;
                if ((str == null || str.equalsIgnoreCase(PPSPlacementView.this.getCurrentContentId())) && !PPSPlacementView.this.T && (PPSPlacementView.this.B instanceof ab)) {
                    if (PPSPlacementView.this.ad.isState(PlacementPlayState.State.SINGLE_INST)) {
                        mhVar = PPSPlacementView.this.f20943c;
                    } else {
                        mhVar = PPSPlacementView.this.ad.isState(PlacementPlayState.State.MAIN_VIEW) ? PPSPlacementView.this.f20941a : PPSPlacementView.this.f20942b;
                    }
                    mhVar.a(i3);
                }
            }

            @Override // com.huawei.openalliance.ad.media.listener.SegmentMediaStateListener
            public void onSegmentMediaStop(String str, String str2, int i3) {
                if (hw.a()) {
                    hw.a("PPSPlacementView", "OM onSegmentMediaStop");
                }
                if (str != null && !str.equalsIgnoreCase(PPSPlacementView.this.getCurrentContentId())) {
                    hw.b("PPSPlacementView", "OM onSegmentMediaStop not equals");
                    return;
                }
                if (PPSPlacementView.this.T) {
                    return;
                }
                PPSPlacementView.this.T = true;
                if (PPSPlacementView.this.B instanceof ab) {
                    if (PPSPlacementView.this.ad.isState(PlacementPlayState.State.SINGLE_INST)) {
                        PPSPlacementView.this.f20943c.g();
                    } else if (PPSPlacementView.this.ad.isState(PlacementPlayState.State.MAIN_VIEW)) {
                        PPSPlacementView.this.f20941a.g();
                    } else {
                        PPSPlacementView.this.f20942b.g();
                    }
                }
            }

            @Override // com.huawei.openalliance.ad.media.listener.SegmentMediaStateListener
            public void onSegmentMediaStart(String str, String str2, int i3) {
                if (hw.a()) {
                    hw.a("PPSPlacementView", "OM onSegmentMediaStart");
                }
                PPSPlacementView.this.T = false;
                if (PPSPlacementView.this.B instanceof ab) {
                    boolean zIsState = PPSPlacementView.this.ad.isState(PlacementPlayState.State.SINGLE_INST);
                    if (i3 > 0) {
                        if (zIsState) {
                            PPSPlacementView.this.f20943c.l();
                            return;
                        } else if (PPSPlacementView.this.ad.isState(PlacementPlayState.State.MAIN_VIEW)) {
                            PPSPlacementView.this.f20941a.l();
                            return;
                        } else {
                            PPSPlacementView.this.f20942b.l();
                            return;
                        }
                    }
                    if (!zIsState) {
                        if (PPSPlacementView.this.ad.isState(PlacementPlayState.State.MAIN_VIEW)) {
                            PPSPlacementView pPSPlacementView = PPSPlacementView.this;
                            pPSPlacementView.a(pPSPlacementView.f20941a);
                            return;
                        } else {
                            PPSPlacementView pPSPlacementView2 = PPSPlacementView.this;
                            pPSPlacementView2.a(pPSPlacementView2.f20942b);
                            return;
                        }
                    }
                    PPSPlacementView pPSPlacementView3 = PPSPlacementView.this;
                    pPSPlacementView3.a(pPSPlacementView3.f20943c);
                }
            }

            @Override // com.huawei.openalliance.ad.media.listener.SegmentMediaStateListener
            public void onSegmentMediaPause(String str, String str2, int i3) {
                mh mhVar;
                if (hw.a()) {
                    hw.a("PPSPlacementView", "OM onSegmentMediaPause");
                }
                if ((str == null || str.equalsIgnoreCase(PPSPlacementView.this.getCurrentContentId())) && (PPSPlacementView.this.B instanceof ab)) {
                    if (PPSPlacementView.this.ad.isState(PlacementPlayState.State.SINGLE_INST)) {
                        mhVar = PPSPlacementView.this.f20943c;
                    } else {
                        mhVar = PPSPlacementView.this.ad.isState(PlacementPlayState.State.MAIN_VIEW) ? PPSPlacementView.this.f20941a : PPSPlacementView.this.f20942b;
                    }
                    mhVar.k();
                }
            }

            @Override // com.huawei.openalliance.ad.media.listener.SegmentMediaStateListener
            public void onSegmentMediaCompletion(String str, String str2, int i3) {
                if (hw.a()) {
                    hw.a("PPSPlacementView", "OM onSegmentMediaCompletion");
                }
                if (str != null && !str.equalsIgnoreCase(PPSPlacementView.this.getCurrentContentId())) {
                    hw.b("PPSPlacementView", "OM onSegmentMediaCompletion not equals");
                    return;
                }
                if (PPSPlacementView.this.T) {
                    return;
                }
                PPSPlacementView.this.T = true;
                if (PPSPlacementView.this.B instanceof ab) {
                    if (PPSPlacementView.this.ad.isState(PlacementPlayState.State.SINGLE_INST)) {
                        PPSPlacementView.this.f20943c.g();
                    } else if (PPSPlacementView.this.ad.isState(PlacementPlayState.State.MAIN_VIEW)) {
                        PPSPlacementView.this.f20941a.g();
                    } else {
                        PPSPlacementView.this.f20942b.g();
                    }
                }
            }
        };
        this.am = new View.OnTouchListener() { // from class: com.huawei.openalliance.ad.views.PPSPlacementView.22
            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view, MotionEvent motionEvent) {
                hw.a("PPSPlacementView", "clickable.OnTouchListener.ontouch");
                try {
                    int iA = tz.a(motionEvent);
                    if (iA == 0) {
                        PPSPlacementView.this.f = tz.a(view, motionEvent);
                        PPSPlacementView.this.f.a(vv.b(PPSPlacementView.this));
                    }
                    if (1 != iA) {
                        return false;
                    }
                    tz.a(view, motionEvent, null, PPSPlacementView.this.f);
                    return false;
                } catch (Throwable th) {
                    hw.c("PPSPlacementView", "clickable.OnTouchListener.ontouch exception : %s", th.getClass().getSimpleName());
                    return false;
                }
            }
        };
        this.an = new View.OnClickListener() { // from class: com.huawei.openalliance.ad.views.PPSPlacementView.23
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                dq.a(new Runnable() { // from class: com.huawei.openalliance.ad.views.PPSPlacementView.23.1
                    @Override // java.lang.Runnable
                    public void run() {
                        PPSPlacementView.this.g();
                    }
                });
            }
        };
        this.ao = new a(this);
        a(context);
    }
}
