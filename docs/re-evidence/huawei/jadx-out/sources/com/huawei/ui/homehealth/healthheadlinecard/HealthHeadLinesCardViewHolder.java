package com.huawei.ui.homehealth.healthheadlinecard;

import android.app.Activity;
import android.content.Context;
import android.media.session.PlaybackState;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.google.android.gms.common.util.BiConsumer;
import com.huawei.haf.design.pattern.ObserverManagerUtil;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.health.h5pro.H5ProClient;
import com.huawei.health.h5pro.core.H5ProLaunchOption;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.operation.h5pro.H5proUtil;
import com.huawei.operation.h5pro.jsmodules.device.DeviceManagerService;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.dialog.CustomTextAlertDialog;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.marqueetext.HealthHeadLineMarqueeTextView;
import com.huawei.ui.commonui.utils.TagResourcePolicy;
import com.huawei.ui.homehealth.R;
import com.huawei.ui.homehealth.healthheadlinecard.bottomplayer.BottomPlayerView;
import com.huawei.ui.homehealth.healthheadlinecard.utils.MediaCenterCallback;
import com.huawei.ui.homehealth.refreshcard.CardViewHolder;
import defpackage.ddq;
import defpackage.ddv;
import defpackage.gdy;
import defpackage.lmf;
import defpackage.lrd;
import defpackage.njy;
import defpackage.qjb;
import defpackage.qpx;
import defpackage.qqf;
import defpackage.qre;
import defpackage.skz;
import defpackage.slq;
import defpackage.sma;
import defpackage.smp;
import defpackage.sof;
import defpackage.sog;
import health.compact.a.CommonUtil;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes17.dex */
public class HealthHeadLinesCardViewHolder extends CardViewHolder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f25523a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile String f25524b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final smp f25525c;
    private final HealthTextView d;
    private final ImageView e;
    private sof f;
    private final ImageView h;
    private final HealthHeadLineMarqueeTextView j;

    static class c extends MediaStatusSubscriberAdapter {
        private WeakReference<HealthHeadLinesCardViewHolder> e;

        /* synthetic */ c(HealthHeadLinesCardViewHolder healthHeadLinesCardViewHolder, AnonymousClass5 anonymousClass5) {
            this(healthHeadLinesCardViewHolder);
        }

        private c(HealthHeadLinesCardViewHolder healthHeadLinesCardViewHolder) {
            this.e = new WeakReference<>(healthHeadLinesCardViewHolder);
        }

        @Override // com.huawei.ui.homehealth.healthheadlinecard.MediaStatusSubscriberAdapter, com.huawei.ui.homehealth.healthheadlinecard.MediaStatusSubscriber
        public void onPlaybackStateChanged(PlaybackState playbackState) {
            HealthHeadLinesCardViewHolder healthHeadLinesCardViewHolder = this.e.get();
            if (healthHeadLinesCardViewHolder == null) {
                LogUtil.e("HealthHeadLinesCardViewHolder", "holder ref is null");
            } else {
                healthHeadLinesCardViewHolder.d(playbackState.getState());
            }
        }

        @Override // com.huawei.ui.homehealth.healthheadlinecard.MediaStatusSubscriberAdapter, com.huawei.ui.homehealth.healthheadlinecard.MediaStatusSubscriber
        public void onMediaChanged(gdy gdyVar, int i) {
            HealthHeadLinesCardViewHolder healthHeadLinesCardViewHolder = this.e.get();
            if (healthHeadLinesCardViewHolder != null) {
                if (healthHeadLinesCardViewHolder.f25525c == null) {
                    LogUtil.e("HealthHeadLinesCardViewHolder", "mMediaCenter is null");
                    return;
                } else {
                    LogUtil.a("HealthHeadLinesCardViewHolder", "onMediaChanged audioItem = ", gdyVar, ", itemIndex = ", Integer.valueOf(i));
                    healthHeadLinesCardViewHolder.b(gdyVar);
                    return;
                }
            }
            LogUtil.e("HealthHeadLinesCardViewHolder", "holder ref is null");
        }
    }

    private void j(View view) {
        Pair<Integer, Integer> safeRegionWidth = BaseActivity.getSafeRegionWidth();
        int dimensionPixelOffset = getContext().getResources().getDimensionPixelOffset(R.dimen.defaultPaddingStart);
        int dimensionPixelOffset2 = getContext().getResources().getDimensionPixelOffset(R.dimen.defaultPaddingEnd);
        if (view.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
            marginLayoutParams.setMarginStart(dimensionPixelOffset + ((Integer) safeRegionWidth.first).intValue());
            marginLayoutParams.setMarginEnd(dimensionPixelOffset2 + ((Integer) safeRegionWidth.second).intValue());
            view.setLayoutParams(marginLayoutParams);
        }
    }

    HealthHeadLinesCardViewHolder(HealthHeadLinesCardData healthHeadLinesCardData, View view, Context context, boolean z) {
        super(view, context, z);
        this.f25525c = smp.b();
        j(view);
        this.j = (HealthHeadLineMarqueeTextView) view.findViewById(R.id.health_headline_song_name);
        this.d = (HealthTextView) view.findViewById(R.id.health_headline_description);
        this.e = (ImageView) view.findViewById(R.id.health_headlines_cover);
        ImageView imageView = (ImageView) view.findViewById(R.id.health_headlines_play_or_pause);
        this.h = imageView;
        view.setOnClickListener(new View.OnClickListener() { // from class: slo
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.d.e(view2);
            }
        });
        view.setOnLongClickListener(new View.OnLongClickListener() { // from class: slp
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view2) {
                return this.d.b(view2);
            }
        });
        imageView.setOnClickListener(new View.OnClickListener() { // from class: slm
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.d.a(view2);
            }
        });
        d();
    }

    public /* synthetic */ void e(View view) {
        LoginInit.getInstance(BaseApplication.getContext()).browsingToLogin(new IBaseResponseCallback() { // from class: sll
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public final void a(int i, Object obj) {
                this.f48328c.c(i, obj);
            }
        }, "");
    }

    public /* synthetic */ void c(int i, Object obj) {
        if (i != 0) {
            LogUtil.j("HealthHeadLinesCardViewHolder", "getViewClickListener errorCode = ", Integer.valueOf(i));
            return;
        }
        if (this.f != null) {
            LogUtil.a("HealthHeadLinesCardViewHolder", "enter the H5 detail page, start destroying bar");
            this.f.b();
            this.f = null;
        }
        a();
    }

    public /* synthetic */ boolean b(View view) {
        LogUtil.a("HealthHeadLinesCardViewHolder", "OnLongClickListener true");
        c();
        e(1);
        return true;
    }

    private void d() {
        this.f25525c.e(new c(this, null));
    }

    public void a(gdy gdyVar, int i) {
        b(gdyVar);
        d(i);
    }

    /* JADX INFO: renamed from: com.huawei.ui.homehealth.healthheadlinecard.HealthHeadLinesCardViewHolder$5, reason: invalid class name */
    public class AnonymousClass5 implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ gdy f25532b;

        AnonymousClass5(gdy gdyVar) {
            this.f25532b = gdyVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            HealthHeadLinesCardViewHolder.this.f25524b = this.f25532b.h();
            HealthHeadLinesCardViewHolder.this.j.setText(this.f25532b.o());
            HealthHeadLinesCardViewHolder.this.d.setText(this.f25532b.k());
            if (HealthHeadLinesCardViewHolder.this.f25523a == null || !HealthHeadLinesCardViewHolder.this.f25523a.equals(this.f25532b.g())) {
                HealthHeadLinesCardViewHolder.this.e.setImageDrawable(null);
                ImageView imageView = HealthHeadLinesCardViewHolder.this.e;
                String strG = this.f25532b.g();
                int i = qqf.d;
                String strH = this.f25532b.h();
                final gdy gdyVar = this.f25532b;
                qqf.e(imageView, strG, i, strH, new TagResourcePolicy() { // from class: slu
                    @Override // com.huawei.ui.commonui.utils.TagResourcePolicy
                    public final boolean filterTagResource(String str) {
                        return this.e.c(gdyVar, str);
                    }
                });
                HealthHeadLinesCardViewHolder.this.f25523a = this.f25532b.g();
            }
            LogUtil.a("HealthHeadLinesCardViewHolder", "refreshUi, media info = ", this.f25532b);
        }

        public /* synthetic */ boolean c(gdy gdyVar, String str) {
            return TextUtils.equals(HealthHeadLinesCardViewHolder.this.f25524b, gdyVar.h());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(gdy gdyVar) {
        HandlerExecutor.b(new AnonymousClass5(gdyVar));
    }

    public void d(final int i) {
        HandlerExecutor.b(new Runnable() { // from class: com.huawei.ui.homehealth.healthheadlinecard.HealthHeadLinesCardViewHolder.1
            @Override // java.lang.Runnable
            public void run() {
                LogUtil.a("HealthHeadLinesCardViewHolder", "refreshPlaybackStateUi, playState:", Integer.valueOf(i));
                if (i == 6) {
                    LogUtil.a("HealthHeadLinesCardViewHolder", "playState is loading, don't change the icon");
                    return;
                }
                HealthHeadLinesCardViewHolder.this.h.setImageResource(i == 3 ? R.drawable.ic_pause_hh : R.drawable.ic_play_hh);
                lrd.b(HealthHeadLinesCardViewHolder.this.h, qre.f(i == 3 ? R.string.IDS_motiontrack_offlinemap_download_pause : R.string.IDS_bolt_button_playback));
                HealthHeadLinesCardViewHolder.this.j.setSelected(i == 3);
            }
        });
    }

    private void c() {
        LogUtil.a("HealthHeadLinesCardViewHolder", "showDialog");
        CustomTextAlertDialog.Builder builder = new CustomTextAlertDialog.Builder(getContext());
        builder.a(R.string.IDS_health_headlines_title);
        builder.b(R.string.IDS_health_headlines_toast_text);
        builder.b((Boolean) true);
        builder.a(R.string.IDS_highland_cancel, new View.OnClickListener() { // from class: slh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.d.d(view);
            }
        });
        builder.e(R.string.IDS_not_display, new View.OnClickListener() { // from class: slg
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f48326c.c(view);
            }
        });
        CustomTextAlertDialog customTextAlertDialogB = builder.b();
        customTextAlertDialogB.setCancelable(false);
        customTextAlertDialogB.show();
    }

    public /* synthetic */ void d(View view) {
        LogUtil.a("HealthHeadLinesCardViewHolder", "cancel");
        e(2);
    }

    public /* synthetic */ void c(View view) {
        LogUtil.a("HealthHeadLinesCardViewHolder", "healthHeadlines not display");
        if (TextUtils.equals(smp.b().p(), "headLine")) {
            LogUtil.a("HealthHeadLinesCardViewHolder", "hide headline card, set pause when playing health headline.");
            smp.b().a(-1);
        }
        slq.c(false);
        ObserverManagerUtil.e("HOME_RECYCLE_VIEW_MOVE", false, false);
        e(3);
    }

    public void e() {
        LogUtil.a("HealthHeadLinesCardViewHolder", "onDestroy");
        smp.b().c(new gdy());
        smp.b().c();
    }

    private void a() {
        LogUtil.a("HealthHeadLinesCardViewHolder", "goToH5Page");
        ddv ddvVarB = ddv.b();
        gdy gdyVarJ = smp.b().j();
        String strD = gdyVarJ != null ? gdyVarJ.d() : "";
        H5proUtil.initH5pro();
        H5ProClient.startH5MiniProgram(getContext(), "com.huawei.health.h5.health-headlines", new H5ProLaunchOption.Builder().addCustomizeJsModule("healthHeadlines", sma.class).addCustomizeJsModule("innerapi", ddvVarB.getCommonJsModule("innerapi")).addCustomizeJsModule("achievement", ddq.d().getCommonJsModule("achievement")).addCustomizeArg("clickPosition", "normal").addCustomizeArg("date", strD).addCustomizeArg("enterPosition", "2").setImmerse().setStatusBarTextBlack(true).enableSlowWholeDocumentDraw().showStatusBar().build());
        H5ProClient.getServiceManager().registerService(DeviceManagerService.class);
    }

    private void e(int i) {
        HashMap map = new HashMap(16);
        map.put("click", 1);
        map.put("event", Integer.valueOf(i));
        LogUtil.a("HealthHeadLinesCardViewHolder", "HEALTH_HEADLINES_CLOSE_1100054 healthHeadLinesMap = ", map);
        lmf.d().c(getContext(), AnalyticsValue.HEALTH_HEADLINES_CLOSE_1100054.value(), map, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(final int i) {
        if (!HandlerExecutor.d()) {
            HandlerExecutor.c(new Runnable() { // from class: com.huawei.ui.homehealth.healthheadlinecard.HealthHeadLinesCardViewHolder.2
                @Override // java.lang.Runnable
                public void run() {
                    HealthHeadLinesCardViewHolder.this.a(i);
                }
            });
        } else {
            this.h.setImageResource(i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(View view) {
        LoginInit.getInstance(BaseApplication.getContext()).browsingToLogin(new IBaseResponseCallback() { // from class: slt
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public final void a(int i, Object obj) {
                this.f48334c.a(i, obj);
            }
        }, "");
    }

    public /* synthetic */ void a(int i, Object obj) {
        if (i != 0) {
            LogUtil.e("HealthHeadLinesCardViewHolder", "playOrPauseIconClickEvent login reject");
        } else {
            b();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(final gdy gdyVar) {
        HandlerExecutor.b(new Runnable() { // from class: com.huawei.ui.homehealth.healthheadlinecard.HealthHeadLinesCardViewHolder.3
            @Override // java.lang.Runnable
            public void run() {
                if ((qjb.c().b() instanceof BottomPlayerView) || !(HealthHeadLinesCardViewHolder.this.getContext() instanceof Activity)) {
                    return;
                }
                Activity activity = (Activity) HealthHeadLinesCardViewHolder.this.getContext();
                LogUtil.a("HealthHeadLinesCardViewHolder", "new a control object and display Minibar");
                HealthHeadLinesCardViewHolder.this.f = new sof(activity);
                ViewGroup viewGroup = (ViewGroup) activity.findViewById(android.R.id.content);
                if (viewGroup != null) {
                    HealthHeadLinesCardViewHolder.this.f.b(viewGroup, gdyVar);
                } else {
                    LogUtil.j("HealthHeadLinesCardViewHolder", "rootLayout is null, unable to display Minibar in advance");
                }
            }
        });
    }

    private void b() {
        final smp smpVarB = smp.b();
        List<gdy> listU = smpVarB.u();
        if (njy.e(listU)) {
            LogUtil.a("HealthHeadLinesCardViewHolder", "playList is empty, need to setPlayList again!");
            final BiConsumer biConsumer = new BiConsumer() { // from class: sln
                @Override // com.google.android.gms.common.util.BiConsumer
                public final void accept(Object obj, Object obj2) {
                    this.f48329b.e(smpVarB, (List) obj, (List) obj2);
                }
            };
            sog.d(new MediaCenterCallback() { // from class: com.huawei.ui.homehealth.healthheadlinecard.HealthHeadLinesCardViewHolder.4
                @Override // com.huawei.ui.homehealth.healthheadlinecard.utils.MediaCenterCallback
                public void onResponse(int i, String str) {
                    LogUtil.a("HealthHeadLinesCardViewHolder", "checkWifiDialogBeforePlay when play = ", Integer.valueOf(i));
                    if (i == 0) {
                        skz.d(biConsumer, "", 0, "");
                    } else {
                        LogUtil.a("HealthHeadLinesCardViewHolder", "check mobile data dialog click cancel");
                    }
                }
            });
            return;
        }
        if ("headLine" != smpVarB.p()) {
            smpVarB.d(listU, smpVarB.d(), smpVarB.f(), null);
            smpVarB.y();
            a(com.huawei.ui.commonui.R.drawable.ic_pause_hh);
            int iF = smpVarB.f();
            if (iF >= 0 && iF < listU.size()) {
                e(listU.get(iF));
            } else {
                e(smpVarB.j());
            }
            smpVarB.b(smpVarB.f(), 1);
            return;
        }
        int iA = smpVarB.a();
        LogUtil.a("HealthHeadLinesCardViewHolder", "playOrPauseIconClickEvent state: ", Integer.valueOf(iA));
        if (iA != 3) {
            if (!CommonUtil.ab(getContext())) {
                qpx.b(getContext(), getContext().getResources().getString(com.huawei.ui.main.R.string.IDS_network_connect_error));
                return;
            } else {
                sog.d(new MediaCenterCallback() { // from class: com.huawei.ui.homehealth.healthheadlinecard.HealthHeadLinesCardViewHolder.10
                    @Override // com.huawei.ui.homehealth.healthheadlinecard.utils.MediaCenterCallback
                    public void onResponse(int i, String str) {
                        LogUtil.a("HealthHeadLinesCardViewHolder", "checkWifiDialogBeforePlay when play = ", Integer.valueOf(i));
                        if (i == 0) {
                            HealthHeadLinesCardViewHolder.this.a(com.huawei.ui.commonui.R.drawable.ic_pause_hh);
                            HealthHeadLinesCardViewHolder.this.e(smpVarB.j());
                            smpVarB.c(1);
                            return;
                        }
                        LogUtil.a("HealthHeadLinesCardViewHolder", "check mobile data dialog click cancel");
                    }
                });
                lrd.b(this.h, qre.f(R.string.IDS_motiontrack_offlinemap_download_pause));
                return;
            }
        }
        lrd.b(this.h, qre.f(R.string.IDS_bolt_button_playback));
        a(com.huawei.ui.commonui.R.drawable.ic_play_hh);
        smpVarB.ac();
    }

    public /* synthetic */ void e(smp smpVar, List list, List list2) {
        if (njy.e(list)) {
            LogUtil.e("HealthHeadLinesCardViewHolder", "audioItems is empty");
            return;
        }
        smpVar.d(list, list2, smpVar.f(), null);
        smpVar.y();
        a(com.huawei.ui.commonui.R.drawable.ic_pause_hh);
        if (!list.isEmpty()) {
            e((gdy) list.get(0));
        }
        smpVar.b(0L, 1);
    }
}
