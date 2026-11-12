package com.huawei.ui.homehealth.healthheadlinecard.bottomplayer;

import android.content.Context;
import android.media.session.PlaybackState;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.health.h5pro.H5ProClient;
import com.huawei.health.h5pro.core.H5ProLaunchOption;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwdevice.phoneprocess.mgr.exercise.HwExerciseConstants;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.R;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.progressindicator.HealthProgressIndicator;
import com.huawei.ui.commonui.utils.TagResourcePolicy;
import com.huawei.ui.homehealth.healthheadlinecard.MediaStatusSubscriber;
import com.huawei.ui.homehealth.healthheadlinecard.MediaStatusSubscriberAdapter;
import com.huawei.ui.homehealth.healthheadlinecard.utils.MediaCenterCallback;
import defpackage.ddq;
import defpackage.ddv;
import defpackage.gdy;
import defpackage.lmf;
import defpackage.lrd;
import defpackage.qjb;
import defpackage.qpx;
import defpackage.qqf;
import defpackage.qre;
import defpackage.sma;
import defpackage.smp;
import defpackage.sog;
import health.compact.a.CommonUtil;
import java.lang.ref.WeakReference;
import java.util.HashMap;

/* JADX INFO: loaded from: classes17.dex */
public class BottomPlayerView extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ImageView f25544a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f25545b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ImageView f25546c;
    private ImageView d;
    private sma e;
    private ImageView f;
    private HealthTextView g;
    private volatile String h;
    private smp i;
    private MediaStatusSubscriber j;
    private View k;
    private HealthTextView l;
    private HealthProgressIndicator m;
    private int n;

    private int d(int i) {
        return i == 3 ? 1 : 0;
    }

    public BottomPlayerView(Context context, sma smaVar) {
        super(context);
        this.n = -1;
        this.i = smp.b();
        this.h = "";
        this.j = new MediaStatusSubscriberAdapter() { // from class: com.huawei.ui.homehealth.healthheadlinecard.bottomplayer.BottomPlayerView.4
            @Override // com.huawei.ui.homehealth.healthheadlinecard.MediaStatusSubscriberAdapter, com.huawei.ui.homehealth.healthheadlinecard.MediaStatusSubscriber
            public void onPlaybackStateChanged(PlaybackState playbackState) {
                BottomPlayerView bottomPlayerView = BottomPlayerView.this;
                bottomPlayerView.e(bottomPlayerView.i.q());
                if (playbackState.getState() == 1) {
                    BottomPlayerView.this.a(0.0f);
                }
            }

            @Override // com.huawei.ui.homehealth.healthheadlinecard.MediaStatusSubscriberAdapter, com.huawei.ui.homehealth.healthheadlinecard.MediaStatusSubscriber
            public void onMediaChanged(gdy gdyVar, int i) {
                LogUtil.a("BottomPlayerView", "onMediaChanged audioItem = ", gdyVar, ", itemIndex = ", Integer.valueOf(i));
                BottomPlayerView.this.c(gdyVar);
            }

            @Override // com.huawei.ui.homehealth.healthheadlinecard.MediaStatusSubscriberAdapter, com.huawei.ui.homehealth.healthheadlinecard.MediaStatusSubscriber
            public void onProgressChanged(int i, int i2, float f, int i3) {
                BottomPlayerView.this.a(f);
            }
        };
        this.f25545b = context;
        this.e = smaVar;
        View viewInflate = inflate(getContext(), R.layout.commonui_bottom_player_layout, this);
        this.k = viewInflate;
        this.l = (HealthTextView) viewInflate.findViewById(R.id.float_music_name);
        this.g = (HealthTextView) this.k.findViewById(R.id.float_music_artist);
        this.f25544a = (ImageView) this.k.findViewById(R.id.float_music_image);
        this.f25546c = (ImageView) this.k.findViewById(R.id.float_play_button);
        this.f = (ImageView) this.k.findViewById(R.id.float_list_button);
        this.d = (ImageView) this.k.findViewById(R.id.control_close);
        HealthProgressIndicator healthProgressIndicator = (HealthProgressIndicator) this.k.findViewById(R.id.bottom_player_media_indicator);
        this.m = healthProgressIndicator;
        healthProgressIndicator.setWaitingAnimationEnabled(false);
        this.k.setClickable(true);
        c();
        j();
    }

    public BottomPlayerView(Context context) {
        super(context);
        this.n = -1;
        this.i = smp.b();
        this.h = "";
        this.j = new MediaStatusSubscriberAdapter() { // from class: com.huawei.ui.homehealth.healthheadlinecard.bottomplayer.BottomPlayerView.4
            @Override // com.huawei.ui.homehealth.healthheadlinecard.MediaStatusSubscriberAdapter, com.huawei.ui.homehealth.healthheadlinecard.MediaStatusSubscriber
            public void onPlaybackStateChanged(PlaybackState playbackState) {
                BottomPlayerView bottomPlayerView = BottomPlayerView.this;
                bottomPlayerView.e(bottomPlayerView.i.q());
                if (playbackState.getState() == 1) {
                    BottomPlayerView.this.a(0.0f);
                }
            }

            @Override // com.huawei.ui.homehealth.healthheadlinecard.MediaStatusSubscriberAdapter, com.huawei.ui.homehealth.healthheadlinecard.MediaStatusSubscriber
            public void onMediaChanged(gdy gdyVar, int i) {
                LogUtil.a("BottomPlayerView", "onMediaChanged audioItem = ", gdyVar, ", itemIndex = ", Integer.valueOf(i));
                BottomPlayerView.this.c(gdyVar);
            }

            @Override // com.huawei.ui.homehealth.healthheadlinecard.MediaStatusSubscriberAdapter, com.huawei.ui.homehealth.healthheadlinecard.MediaStatusSubscriber
            public void onProgressChanged(int i, int i2, float f, int i3) {
                BottomPlayerView.this.a(f);
            }
        };
        this.f25545b = context;
        View viewInflate = inflate(getContext(), R.layout.commonui_bottom_player_layout, this);
        this.k = viewInflate;
        this.l = (HealthTextView) viewInflate.findViewById(R.id.float_music_name);
        this.g = (HealthTextView) this.k.findViewById(R.id.float_music_artist);
        this.f25544a = (ImageView) this.k.findViewById(R.id.float_music_image);
        this.f25546c = (ImageView) this.k.findViewById(R.id.float_play_button);
        this.f = (ImageView) this.k.findViewById(R.id.float_list_button);
        this.d = (ImageView) this.k.findViewById(R.id.control_close);
        HealthProgressIndicator healthProgressIndicator = (HealthProgressIndicator) this.k.findViewById(R.id.bottom_player_media_indicator);
        this.m = healthProgressIndicator;
        healthProgressIndicator.setWaitingAnimationEnabled(false);
        this.k.setClickable(true);
        c();
        j();
    }

    public BottomPlayerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.n = -1;
        this.i = smp.b();
        this.h = "";
        this.j = new MediaStatusSubscriberAdapter() { // from class: com.huawei.ui.homehealth.healthheadlinecard.bottomplayer.BottomPlayerView.4
            @Override // com.huawei.ui.homehealth.healthheadlinecard.MediaStatusSubscriberAdapter, com.huawei.ui.homehealth.healthheadlinecard.MediaStatusSubscriber
            public void onPlaybackStateChanged(PlaybackState playbackState) {
                BottomPlayerView bottomPlayerView = BottomPlayerView.this;
                bottomPlayerView.e(bottomPlayerView.i.q());
                if (playbackState.getState() == 1) {
                    BottomPlayerView.this.a(0.0f);
                }
            }

            @Override // com.huawei.ui.homehealth.healthheadlinecard.MediaStatusSubscriberAdapter, com.huawei.ui.homehealth.healthheadlinecard.MediaStatusSubscriber
            public void onMediaChanged(gdy gdyVar, int i) {
                LogUtil.a("BottomPlayerView", "onMediaChanged audioItem = ", gdyVar, ", itemIndex = ", Integer.valueOf(i));
                BottomPlayerView.this.c(gdyVar);
            }

            @Override // com.huawei.ui.homehealth.healthheadlinecard.MediaStatusSubscriberAdapter, com.huawei.ui.homehealth.healthheadlinecard.MediaStatusSubscriber
            public void onProgressChanged(int i, int i2, float f, int i3) {
                BottomPlayerView.this.a(f);
            }
        };
    }

    public BottomPlayerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.n = -1;
        this.i = smp.b();
        this.h = "";
        this.j = new MediaStatusSubscriberAdapter() { // from class: com.huawei.ui.homehealth.healthheadlinecard.bottomplayer.BottomPlayerView.4
            @Override // com.huawei.ui.homehealth.healthheadlinecard.MediaStatusSubscriberAdapter, com.huawei.ui.homehealth.healthheadlinecard.MediaStatusSubscriber
            public void onPlaybackStateChanged(PlaybackState playbackState) {
                BottomPlayerView bottomPlayerView = BottomPlayerView.this;
                bottomPlayerView.e(bottomPlayerView.i.q());
                if (playbackState.getState() == 1) {
                    BottomPlayerView.this.a(0.0f);
                }
            }

            @Override // com.huawei.ui.homehealth.healthheadlinecard.MediaStatusSubscriberAdapter, com.huawei.ui.homehealth.healthheadlinecard.MediaStatusSubscriber
            public void onMediaChanged(gdy gdyVar, int i2) {
                LogUtil.a("BottomPlayerView", "onMediaChanged audioItem = ", gdyVar, ", itemIndex = ", Integer.valueOf(i2));
                BottomPlayerView.this.c(gdyVar);
            }

            @Override // com.huawei.ui.homehealth.healthheadlinecard.MediaStatusSubscriberAdapter, com.huawei.ui.homehealth.healthheadlinecard.MediaStatusSubscriber
            public void onProgressChanged(int i2, int i3, float f, int i4) {
                BottomPlayerView.this.a(f);
            }
        };
    }

    private void c() {
        LogUtil.a("BottomPlayerView", "miniPlayer setClickListener, this = ", this);
        d();
        g();
        a();
        b();
    }

    private void j() {
        this.i.e(this.j);
    }

    public void e() {
        this.i.b(this.j);
    }

    public void b(gdy gdyVar, int i, float f) {
        c(gdyVar);
        e(i);
        a(f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(final int i) {
        HandlerExecutor.b(new Runnable() { // from class: com.huawei.ui.homehealth.healthheadlinecard.bottomplayer.BottomPlayerView.1
            @Override // java.lang.Runnable
            public void run() {
                int i2;
                int i3;
                int i4 = i;
                if (i4 != 6) {
                    if (i4 == 3) {
                        i2 = R.drawable.icon_bottom_player_play;
                        i3 = R.string.accessibility_pause;
                    } else {
                        i2 = R.drawable.icon_bottom_player_pause;
                        i3 = R.string.IDS_bolt_button_playback;
                    }
                    BottomPlayerView.this.f25546c.setImageDrawable(qre.c(i2));
                    lrd.c(BottomPlayerView.this.f25546c, 1);
                    lrd.b(BottomPlayerView.this.f25546c, qre.f(i3));
                    return;
                }
                LogUtil.a("BottomPlayerView", "playState is loading, don't change the icon");
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(gdy gdyVar) {
        LogUtil.a("BottomPlayerView", "refreshMediaInfo mMediaId = ", this.h, ", audioItem = ", gdyVar, ", this = ", this);
        this.h = gdyVar.h();
        HandlerExecutor.b(new AnonymousClass2(gdyVar, new WeakReference(this.f25544a)));
    }

    /* JADX INFO: renamed from: com.huawei.ui.homehealth.healthheadlinecard.bottomplayer.BottomPlayerView$2, reason: invalid class name */
    public class AnonymousClass2 implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ WeakReference f25548a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ gdy f25549c;

        AnonymousClass2(gdy gdyVar, WeakReference weakReference) {
            this.f25549c = gdyVar;
            this.f25548a = weakReference;
        }

        @Override // java.lang.Runnable
        public void run() {
            BottomPlayerView.this.l.setText(this.f25549c.o());
            BottomPlayerView.this.g.setText(this.f25549c.k());
            qqf.e((ImageView) this.f25548a.get(), this.f25549c.g(), qqf.e, this.f25549c.h(), new TagResourcePolicy() { // from class: sod
                @Override // com.huawei.ui.commonui.utils.TagResourcePolicy
                public final boolean filterTagResource(String str) {
                    return this.e.c(str);
                }
            });
        }

        public /* synthetic */ boolean c(String str) {
            return BottomPlayerView.this.h.equals(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(final float f) {
        HandlerExecutor.b(new Runnable() { // from class: com.huawei.ui.homehealth.healthheadlinecard.bottomplayer.BottomPlayerView.3
            @Override // java.lang.Runnable
            public void run() {
                BottomPlayerView.this.setPlayerProgress((int) (f * 100.0f));
            }
        });
    }

    private void d() {
        this.f25546c.setOnClickListener(new View.OnClickListener() { // from class: soa
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.d.c(view);
            }
        });
    }

    public /* synthetic */ void c(View view) {
        if (this.i.q() != 3) {
            if (!CommonUtil.ab(getContext())) {
                qpx.b(getContext(), getContext().getResources().getString(com.huawei.ui.main.R.string.IDS_network_connect_error));
                return;
            } else {
                sog.d(new MediaCenterCallback() { // from class: com.huawei.ui.homehealth.healthheadlinecard.bottomplayer.BottomPlayerView.5
                    @Override // com.huawei.ui.homehealth.healthheadlinecard.utils.MediaCenterCallback
                    public void onResponse(int i, String str) {
                        LogUtil.a("BottomPlayerView", "checkWifiDialogBeforePlay when play = ", Integer.valueOf(i));
                        if (i == 0) {
                            BottomPlayerView.this.i.z();
                            BottomPlayerView.this.b(3);
                        } else {
                            LogUtil.a("BottomPlayerView", "check mobile data dialog click cancel");
                        }
                    }
                });
                return;
            }
        }
        this.i.ac();
        b(4);
    }

    private void g() {
        this.k.setOnClickListener(new View.OnClickListener() { // from class: soe
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f48455b.d(view);
            }
        });
    }

    public /* synthetic */ void d(View view) {
        LogUtil.a("BottomPlayerView", "jumpToPlayPage");
        e(false);
    }

    private void a() {
        this.f.setOnClickListener(new View.OnClickListener() { // from class: soh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f48459a.b(view);
            }
        });
    }

    public /* synthetic */ void b(View view) {
        LogUtil.a("BottomPlayerView", "jumpToListPage");
        e(true);
        b(5);
    }

    private void e(boolean z) {
        LogUtil.a("BottomPlayerView", "passParams isPlayList: ", Boolean.valueOf(z));
        int iH = this.i.h();
        boolean z2 = true;
        if (iH == 7) {
            a(iH, z, false, true);
            return;
        }
        if (iH != 8 && iH != 9) {
            z2 = false;
        }
        a(iH, z, z2, false);
    }

    private void b() {
        this.d.setOnClickListener(new View.OnClickListener() { // from class: snz
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f48447a.e(view);
            }
        });
    }

    public /* synthetic */ void e(View view) {
        LogUtil.a("BottomPlayerView", "closeMiniPlayer this = ", this);
        sma smaVar = this.e;
        if (smaVar != null) {
            smaVar.c();
        } else {
            e();
            ViewParent parent = getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this);
                LogUtil.a("BottomPlayerView", "mBottomPlayerView removed from parent view tree successfully.");
            } else {
                setVisibility(8);
            }
            qjb.c().d(false);
            qjb.c().c((View) null);
        }
        smp.b().j(-5);
        b(6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlayerProgress(int i) {
        LogUtil.a("BottomPlayerView", "setPlayerProgress progress = ", Integer.valueOf(i), " mProgress ", Integer.valueOf(this.n), ", this = ", this);
        if (this.n == i) {
            return;
        }
        this.n = i;
        this.m.setProgress(i);
    }

    private void a(int i, boolean z, boolean z2, boolean z3) {
        String strH = this.i.j().h();
        String strT = this.i.t();
        String strI = this.i.i();
        int iD = d(this.i.q());
        LogUtil.a("BottomPlayerView", "passIdToPlayPage workoutId: ", strH, " type: ", Integer.valueOf(i), " topicId: ", strT, " lecturerId:", strI, " isPlayList: ", Boolean.valueOf(z), " isTopic: ", Boolean.valueOf(z2), " isLecturer: ", Boolean.valueOf(z3), " playStatus: ", Integer.valueOf(iD));
        ddv ddvVarB = ddv.b();
        H5ProLaunchOption.Builder builder = new H5ProLaunchOption.Builder();
        int i2 = i;
        if (i2 == 1) {
            i2 = 2;
        }
        builder.addPath("#/audio-detail").addCustomizeJsModule("healthHeadlines", sma.class).addCustomizeJsModule("innerapi", ddvVarB.getCommonJsModule("innerapi")).addCustomizeJsModule("achievement", ddq.d().getCommonJsModule("achievement")).addCustomizeArg(HwExerciseConstants.METHOD_PARAM_WORKOUT_ID, strH).addCustomizeArg("type", String.valueOf(i2)).addCustomizeArg("miniPlayerPlayStatus", String.valueOf(iD)).setImmerse().setStatusBarTextBlack(true).enableSlowWholeDocumentDraw().showStatusBar();
        builder.addCustomizeArg("clickPosition", z ? "list" : "normal");
        if (z2) {
            builder.addCustomizeArg("topicId", strT);
        }
        if (z3) {
            builder.addCustomizeArg("lecturerId", strI);
        }
        H5ProClient.startH5MiniProgram(this.f25545b, "com.huawei.health.h5.health-headlines", builder.build());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(int i) {
        HashMap map = new HashMap(16);
        map.put("click", 1);
        map.put("controlType", 1);
        map.put("event", Integer.valueOf(i));
        map.put("serviceType", 1);
        LogUtil.a("BottomPlayerView", "HEALTH_HEADLINES_CONTROL_USE_1100060 healthHeadLinesMap = ", map, ", this = ", this);
        lmf.d().c(this.f25545b, AnalyticsValue.HEALTH_HEADLINES_CONTROL_USE_1100060.value(), map, 0);
    }
}
