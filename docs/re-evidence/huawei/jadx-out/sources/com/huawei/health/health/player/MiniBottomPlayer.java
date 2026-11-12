package com.huawei.health.health.player;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.MediaMetadata;
import android.media.session.PlaybackState;
import android.os.Bundle;
import android.support.v4.media.MediaMetadataCompat;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.haf.localbroadcastmanager.LocalBroadcastManager;
import com.huawei.health.marketrouter.api.MarketRouterApi;
import com.huawei.health.musicservice.mediacenter.MediaCenterCallback;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.R;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.progressindicator.HealthProgressIndicator;
import com.huawei.ui.commonui.utils.TagResourcePolicy;
import defpackage.eyo;
import defpackage.fai;
import defpackage.gdy;
import defpackage.get;
import defpackage.gog;
import defpackage.lmf;
import defpackage.lrd;
import defpackage.njy;
import defpackage.qjb;
import defpackage.qpx;
import defpackage.qqf;
import defpackage.qre;
import health.compact.a.CommonUtil;
import health.compact.a.Services;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.lang.ref.WeakReference;
import java.util.HashMap;

/* JADX INFO: loaded from: classes7.dex */
public class MiniBottomPlayer extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ImageView f7059a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f7060b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f7061c;
    private ImageView d;
    private RelativeLayout e;
    private e f;
    private gdy g;
    private PlaybackState h;
    private ImageView i;
    private ImageView j;
    private HealthTextView k;
    private get.a l;
    private volatile String m;
    private get n;
    private HealthTextView o;
    private View q;
    private HealthProgressIndicator r;
    private int s;

    private void l() {
    }

    public MiniBottomPlayer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.s = -1;
        this.n = get.c();
        this.m = "";
        this.f7060b = 0L;
        this.l = new get.a() { // from class: com.huawei.health.health.player.MiniBottomPlayer.3
            @Override // get.a
            public void onPlaybackStateChanged(PlaybackState playbackState) {
                if (playbackState == null) {
                    LogUtil.j("MiniBottomPlayer", "onPlaybackStateChanged, state is null ,this should NOT happen...");
                    return;
                }
                Bundle extras = playbackState.getExtras();
                if (extras != null && ("sleepMusic".equals(extras.getString("category")) || TextUtils.equals("generativeSleepMusic", extras.getString("category")))) {
                    if (MiniBottomPlayer.this.h == null || MiniBottomPlayer.this.h.getState() != playbackState.getState()) {
                        ReleaseLogUtil.d("R_MiniBottomPlayer", "onPlaybackStateChanged, state.getState:", Integer.valueOf(playbackState.getState()));
                        MiniBottomPlayer miniBottomPlayer = MiniBottomPlayer.this;
                        miniBottomPlayer.c(miniBottomPlayer.n.i());
                    }
                    if (playbackState.getState() == 1) {
                        MiniBottomPlayer.this.c(0.0f);
                        MiniBottomPlayer.this.a(extras);
                    } else if (playbackState.getState() == 3 && (MiniBottomPlayer.this.h == null || MiniBottomPlayer.this.h.getState() == 3)) {
                        long currentItemDuration = MiniBottomPlayer.this.getCurrentItemDuration();
                        if (currentItemDuration > 0) {
                            MiniBottomPlayer.this.c(playbackState.getPosition() / currentItemDuration);
                        }
                    }
                    MiniBottomPlayer.this.h = playbackState;
                    return;
                }
                LogUtil.j("MiniBottomPlayer", "onPlaybackStateChanged not sleep music media");
                fai.e(false);
                MiniBottomPlayer.this.d();
            }

            @Override // get.a
            public void onMetadataChanged(MediaMetadata mediaMetadata) {
                if (mediaMetadata == null) {
                    return;
                }
                if (!"sleepMusic".equals(mediaMetadata.getString(MediaMetadataCompat.METADATA_KEY_GENRE)) && !TextUtils.equals("generativeSleepMusic", mediaMetadata.getString(MediaMetadataCompat.METADATA_KEY_GENRE))) {
                    LogUtil.j("MiniBottomPlayer", "onMetadataChanged not sleep music media");
                    fai.e(false);
                    MiniBottomPlayer.this.d();
                } else {
                    if (!TextUtils.isEmpty(mediaMetadata.getString(MediaMetadataCompat.METADATA_KEY_DISPLAY_ICON_URI))) {
                        LogUtil.a("MiniBottomPlayer", "It's the second time that onMetadataChanged callback, do not consider");
                        return;
                    }
                    MiniBottomPlayer.this.f7060b = mediaMetadata.getLong(MediaMetadataCompat.METADATA_KEY_DURATION);
                    ReleaseLogUtil.d("R_MiniBottomPlayer", "onMediaChanged mCurrentItemDuration:", Long.valueOf(MiniBottomPlayer.this.f7060b));
                    MiniBottomPlayer miniBottomPlayer = MiniBottomPlayer.this;
                    miniBottomPlayer.d(miniBottomPlayer.getCurrentAudioItem());
                }
            }
        };
    }

    public MiniBottomPlayer(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.s = -1;
        this.n = get.c();
        this.m = "";
        this.f7060b = 0L;
        this.l = new get.a() { // from class: com.huawei.health.health.player.MiniBottomPlayer.3
            @Override // get.a
            public void onPlaybackStateChanged(PlaybackState playbackState) {
                if (playbackState == null) {
                    LogUtil.j("MiniBottomPlayer", "onPlaybackStateChanged, state is null ,this should NOT happen...");
                    return;
                }
                Bundle extras = playbackState.getExtras();
                if (extras != null && ("sleepMusic".equals(extras.getString("category")) || TextUtils.equals("generativeSleepMusic", extras.getString("category")))) {
                    if (MiniBottomPlayer.this.h == null || MiniBottomPlayer.this.h.getState() != playbackState.getState()) {
                        ReleaseLogUtil.d("R_MiniBottomPlayer", "onPlaybackStateChanged, state.getState:", Integer.valueOf(playbackState.getState()));
                        MiniBottomPlayer miniBottomPlayer = MiniBottomPlayer.this;
                        miniBottomPlayer.c(miniBottomPlayer.n.i());
                    }
                    if (playbackState.getState() == 1) {
                        MiniBottomPlayer.this.c(0.0f);
                        MiniBottomPlayer.this.a(extras);
                    } else if (playbackState.getState() == 3 && (MiniBottomPlayer.this.h == null || MiniBottomPlayer.this.h.getState() == 3)) {
                        long currentItemDuration = MiniBottomPlayer.this.getCurrentItemDuration();
                        if (currentItemDuration > 0) {
                            MiniBottomPlayer.this.c(playbackState.getPosition() / currentItemDuration);
                        }
                    }
                    MiniBottomPlayer.this.h = playbackState;
                    return;
                }
                LogUtil.j("MiniBottomPlayer", "onPlaybackStateChanged not sleep music media");
                fai.e(false);
                MiniBottomPlayer.this.d();
            }

            @Override // get.a
            public void onMetadataChanged(MediaMetadata mediaMetadata) {
                if (mediaMetadata == null) {
                    return;
                }
                if (!"sleepMusic".equals(mediaMetadata.getString(MediaMetadataCompat.METADATA_KEY_GENRE)) && !TextUtils.equals("generativeSleepMusic", mediaMetadata.getString(MediaMetadataCompat.METADATA_KEY_GENRE))) {
                    LogUtil.j("MiniBottomPlayer", "onMetadataChanged not sleep music media");
                    fai.e(false);
                    MiniBottomPlayer.this.d();
                } else {
                    if (!TextUtils.isEmpty(mediaMetadata.getString(MediaMetadataCompat.METADATA_KEY_DISPLAY_ICON_URI))) {
                        LogUtil.a("MiniBottomPlayer", "It's the second time that onMetadataChanged callback, do not consider");
                        return;
                    }
                    MiniBottomPlayer.this.f7060b = mediaMetadata.getLong(MediaMetadataCompat.METADATA_KEY_DURATION);
                    ReleaseLogUtil.d("R_MiniBottomPlayer", "onMediaChanged mCurrentItemDuration:", Long.valueOf(MiniBottomPlayer.this.f7060b));
                    MiniBottomPlayer miniBottomPlayer = MiniBottomPlayer.this;
                    miniBottomPlayer.d(miniBottomPlayer.getCurrentAudioItem());
                }
            }
        };
    }

    public MiniBottomPlayer(Context context) {
        super(context);
        this.s = -1;
        this.n = get.c();
        this.m = "";
        this.f7060b = 0L;
        this.l = new get.a() { // from class: com.huawei.health.health.player.MiniBottomPlayer.3
            @Override // get.a
            public void onPlaybackStateChanged(PlaybackState playbackState) {
                if (playbackState == null) {
                    LogUtil.j("MiniBottomPlayer", "onPlaybackStateChanged, state is null ,this should NOT happen...");
                    return;
                }
                Bundle extras = playbackState.getExtras();
                if (extras != null && ("sleepMusic".equals(extras.getString("category")) || TextUtils.equals("generativeSleepMusic", extras.getString("category")))) {
                    if (MiniBottomPlayer.this.h == null || MiniBottomPlayer.this.h.getState() != playbackState.getState()) {
                        ReleaseLogUtil.d("R_MiniBottomPlayer", "onPlaybackStateChanged, state.getState:", Integer.valueOf(playbackState.getState()));
                        MiniBottomPlayer miniBottomPlayer = MiniBottomPlayer.this;
                        miniBottomPlayer.c(miniBottomPlayer.n.i());
                    }
                    if (playbackState.getState() == 1) {
                        MiniBottomPlayer.this.c(0.0f);
                        MiniBottomPlayer.this.a(extras);
                    } else if (playbackState.getState() == 3 && (MiniBottomPlayer.this.h == null || MiniBottomPlayer.this.h.getState() == 3)) {
                        long currentItemDuration = MiniBottomPlayer.this.getCurrentItemDuration();
                        if (currentItemDuration > 0) {
                            MiniBottomPlayer.this.c(playbackState.getPosition() / currentItemDuration);
                        }
                    }
                    MiniBottomPlayer.this.h = playbackState;
                    return;
                }
                LogUtil.j("MiniBottomPlayer", "onPlaybackStateChanged not sleep music media");
                fai.e(false);
                MiniBottomPlayer.this.d();
            }

            @Override // get.a
            public void onMetadataChanged(MediaMetadata mediaMetadata) {
                if (mediaMetadata == null) {
                    return;
                }
                if (!"sleepMusic".equals(mediaMetadata.getString(MediaMetadataCompat.METADATA_KEY_GENRE)) && !TextUtils.equals("generativeSleepMusic", mediaMetadata.getString(MediaMetadataCompat.METADATA_KEY_GENRE))) {
                    LogUtil.j("MiniBottomPlayer", "onMetadataChanged not sleep music media");
                    fai.e(false);
                    MiniBottomPlayer.this.d();
                } else {
                    if (!TextUtils.isEmpty(mediaMetadata.getString(MediaMetadataCompat.METADATA_KEY_DISPLAY_ICON_URI))) {
                        LogUtil.a("MiniBottomPlayer", "It's the second time that onMetadataChanged callback, do not consider");
                        return;
                    }
                    MiniBottomPlayer.this.f7060b = mediaMetadata.getLong(MediaMetadataCompat.METADATA_KEY_DURATION);
                    ReleaseLogUtil.d("R_MiniBottomPlayer", "onMediaChanged mCurrentItemDuration:", Long.valueOf(MiniBottomPlayer.this.f7060b));
                    MiniBottomPlayer miniBottomPlayer = MiniBottomPlayer.this;
                    miniBottomPlayer.d(miniBottomPlayer.getCurrentAudioItem());
                }
            }
        };
        this.f7061c = context;
        ReleaseLogUtil.d("R_MiniBottomPlayer", "MiniBottomPlayer create");
        View viewInflate = inflate(getContext(), R.layout.commonui_bottom_player_layout, this);
        this.q = viewInflate;
        this.k = (HealthTextView) viewInflate.findViewById(R.id.float_music_name);
        this.o = (HealthTextView) this.q.findViewById(R.id.float_music_artist);
        this.i = (ImageView) this.q.findViewById(R.id.float_music_image);
        this.d = (ImageView) this.q.findViewById(R.id.float_play_button);
        this.e = (RelativeLayout) this.q.findViewById(R.id.control_group);
        ImageView imageView = (ImageView) this.q.findViewById(R.id.float_list_button);
        this.j = imageView;
        imageView.setVisibility(8);
        this.f7059a = (ImageView) this.q.findViewById(R.id.control_close);
        HealthProgressIndicator healthProgressIndicator = (HealthProgressIndicator) this.q.findViewById(R.id.bottom_player_media_indicator);
        this.r = healthProgressIndicator;
        healthProgressIndicator.setWaitingAnimationEnabled(false);
        this.q.setClickable(true);
        j();
        n();
        k();
        e();
    }

    private void e() {
        a(getCurrentAudioItem(), this.n.i());
    }

    private void j() {
        LogUtil.a("MiniBottomPlayer", "miniPlayer setClickListener, this = ", this);
        h();
        g();
        f();
        i();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public gdy getCurrentAudioItem() {
        if (njy.e(this.n.g(), this.n.j())) {
            LogUtil.j("MiniBottomPlayer", "getCurrentAudioItem getPlayList error, index:", Integer.valueOf(this.n.j()));
            return null;
        }
        return this.n.g().get(this.n.j());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long getCurrentItemDuration() {
        if (this.f7060b <= 0) {
            gdy currentAudioItem = getCurrentAudioItem();
            if (currentAudioItem == null) {
                return 0L;
            }
            this.f7060b = currentAudioItem.a() * 1000;
        }
        return this.f7060b;
    }

    private void k() {
        if (this.f == null) {
            this.f = new e(this);
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.huawei.plugin.account.logout");
        LocalBroadcastManager.getInstance().registerReceiver(this.f, intentFilter);
    }

    private void o() {
        if (this.f != null) {
            LogUtil.a("MiniBottomPlayer", "unregisterLogoutBroadcastReceiver mReceiver != null");
            LocalBroadcastManager.getInstance().unregisterReceiver(this.f);
            this.f = null;
        }
    }

    private void n() {
        get getVar = this.n;
        if (getVar != null) {
            getVar.e(this.l);
        }
    }

    public void a() {
        get getVar = this.n;
        if (getVar != null) {
            getVar.a(this.l);
        }
    }

    private void a(gdy gdyVar, int i) {
        d(gdyVar);
        c(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(final int i) {
        HandlerExecutor.b(new Runnable() { // from class: com.huawei.health.health.player.MiniBottomPlayer.4
            @Override // java.lang.Runnable
            public void run() {
                int i2;
                int i3;
                MiniBottomPlayer.this.e.setVisibility(0);
                int i4 = i;
                if (i4 != 6) {
                    if (i4 == 3) {
                        i2 = R.drawable.icon_bottom_player_play;
                        i3 = R.string.accessibility_pause;
                    } else {
                        i2 = R.drawable.icon_bottom_player_pause;
                        i3 = R.string.IDS_bolt_button_playback;
                    }
                    MiniBottomPlayer.this.d.setImageDrawable(qre.c(i2));
                    lrd.c(MiniBottomPlayer.this.d, 1);
                    lrd.b(MiniBottomPlayer.this.d, qre.f(i3));
                    return;
                }
                LogUtil.a("MiniBottomPlayer", "playState is loading, don't change the icon");
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(gdy gdyVar) {
        if (gdyVar == null) {
            LogUtil.j("MiniBottomPlayer", "refreshMediaInfo audioItem is null");
            return;
        }
        LogUtil.a("MiniBottomPlayer", "refreshMediaInfo mMediaId = ", this.m, ", audioItem = ", gdyVar, ", this = ", this);
        this.m = gdyVar.h();
        HandlerExecutor.b(new AnonymousClass5(gdyVar, new WeakReference(this.i)));
    }

    /* JADX INFO: renamed from: com.huawei.health.health.player.MiniBottomPlayer$5, reason: invalid class name */
    public class AnonymousClass5 implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ WeakReference f7065a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ gdy f7066b;

        AnonymousClass5(gdy gdyVar, WeakReference weakReference) {
            this.f7066b = gdyVar;
            this.f7065a = weakReference;
        }

        @Override // java.lang.Runnable
        public void run() {
            MiniBottomPlayer.this.k.setText(this.f7066b.o());
            MiniBottomPlayer.this.o.setText(this.f7066b.k());
            qqf.e((ImageView) this.f7065a.get(), this.f7066b.g(), qqf.e, this.f7066b.h(), new TagResourcePolicy() { // from class: eyp
                @Override // com.huawei.ui.commonui.utils.TagResourcePolicy
                public final boolean filterTagResource(String str) {
                    return this.f33698b.c(str);
                }
            });
        }

        public /* synthetic */ boolean c(String str) {
            return MiniBottomPlayer.this.m.equals(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Bundle bundle) {
        if (bundle == null || !TextUtils.equals("generativeSleepMusic", bundle.getString("category"))) {
            LogUtil.j("MiniBottomPlayer", "onPlaybackStateChanged not sleep music media");
        } else {
            HandlerExecutor.b(new Runnable() { // from class: com.huawei.health.health.player.MiniBottomPlayer.1
                @Override // java.lang.Runnable
                public void run() {
                    boolean zH = BaseApplication.h();
                    LogUtil.a("MiniBottomPlayer", "refreshTextAndButton, minibar is ", Boolean.valueOf(MiniBottomPlayer.this.isShown()), " isForeground:", Boolean.valueOf(zH));
                    MiniBottomPlayer.this.a();
                    MiniBottomPlayer miniBottomPlayer = MiniBottomPlayer.this;
                    miniBottomPlayer.g = miniBottomPlayer.getCurrentAudioItem();
                    if (MiniBottomPlayer.this.isShown() || !zH) {
                        LogUtil.a("MiniBottomPlayer", "minibar listen");
                        get.c().b();
                    }
                    MiniBottomPlayer.this.e.setVisibility(8);
                    MiniBottomPlayer.this.o.setText(R.string.IDS_AIsleep_music_end);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(final float f) {
        HandlerExecutor.b(new Runnable() { // from class: com.huawei.health.health.player.MiniBottomPlayer.2
            @Override // java.lang.Runnable
            public void run() {
                int i = (int) (f * 100.0f);
                MiniBottomPlayer.this.e.setVisibility(0);
                MiniBottomPlayer.this.setPlayerProgress(i);
            }
        });
    }

    private void h() {
        this.e.setOnClickListener(new View.OnClickListener() { // from class: eyj
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.d.d(view);
            }
        });
    }

    public /* synthetic */ void d(View view) {
        if (this.n.i() != 3) {
            if (!CommonUtil.ab(getContext())) {
                qpx.b(getContext(), getContext().getResources().getString(R.string.IDS_network_connect_error));
                return;
            } else {
                this.n.d(new MediaCenterCallback() { // from class: eyl
                    @Override // com.huawei.health.musicservice.mediacenter.MediaCenterCallback
                    public final void onResponse(int i, String str) {
                        this.f33687b.b(i, str);
                    }
                }, "sleepMusic");
                return;
            }
        }
        this.n.n();
        b(4);
    }

    public /* synthetic */ void b(int i, String str) {
        LogUtil.a("MiniBottomPlayer", "checkWifiDialogBeforePlay when play = ", Integer.valueOf(i));
        if (i == 0) {
            this.n.k();
            b(3);
        } else {
            LogUtil.a("MiniBottomPlayer", "check mobile data dialog click cancel");
        }
    }

    private void g() {
        this.q.setOnClickListener(new View.OnClickListener() { // from class: eyq
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f33699c.a(view);
            }
        });
    }

    public /* synthetic */ void a(View view) {
        ReleaseLogUtil.d("R_MiniBottomPlayer", "jumpToPlayPage");
        m();
    }

    private void m() {
        String strE;
        gdy currentAudioItem = getCurrentAudioItem();
        if (currentAudioItem == null) {
            strE = "";
        } else {
            strE = TextUtils.isEmpty(currentAudioItem.j()) ? currentAudioItem.e() : currentAudioItem.j();
        }
        if (TextUtils.isEmpty(strE)) {
            LogUtil.j("MiniBottomPlayer", "jumpToPlayPage url invalid");
            gdy gdyVar = this.g;
            if (gdyVar == null) {
                LogUtil.j("MiniBottomPlayer", "mitem is null");
                return;
            }
            strE = TextUtils.isEmpty(gdyVar.j()) ? this.g.e() : this.g.j();
            if (TextUtils.isEmpty(strE)) {
                LogUtil.j("MiniBottomPlayer", "detailPageUrl is null");
                return;
            } else {
                this.g = null;
                n();
            }
        }
        if (getParent() instanceof ViewGroup) {
            ((ViewGroup) getParent()).removeView(this);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(strE);
        sb.append(strE.contains("?") ? "&playing=" : "?playing=");
        sb.append(this.n.i() == 3);
        String string = sb.toString();
        LogUtil.a("MiniBottomPlayer", "jumpToPlayPage url :", string);
        ((MarketRouterApi) Services.b("FeatureMarketing", MarketRouterApi.class)).router(string);
    }

    private void f() {
        this.j.setOnClickListener(new View.OnClickListener() { // from class: eyr
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f33700a.b(view);
            }
        });
    }

    public /* synthetic */ void b(View view) {
        LogUtil.a("MiniBottomPlayer", "jumpToListPage");
        l();
    }

    private void i() {
        this.f7059a.setOnClickListener(new View.OnClickListener() { // from class: eys
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f33701c.e(view);
            }
        });
    }

    public /* synthetic */ void e(View view) {
        LogUtil.a("MiniBottomPlayer", "closeMiniPlayer this = ", this);
        b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        get.c().r();
        b(6);
        setVisibility(8);
        qjb.c().d(false);
        d();
        gdy currentAudioItem = getCurrentAudioItem();
        if (currentAudioItem == null || !"generativeSleepMusic".equals(currentAudioItem.c())) {
            return;
        }
        LogUtil.a("MiniBottomPlayer", "minibar listen close");
        get.c().b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlayerProgress(int i) {
        int i2 = this.s;
        if (i2 == i) {
            return;
        }
        LogUtil.d("MiniBottomPlayer", "setPlayerProgress progress = ", Integer.valueOf(i), " mProgress ", Integer.valueOf(i2), ", this = ", this);
        this.s = i;
        this.r.setProgress(i);
    }

    private void b(int i) {
        HashMap map = new HashMap(16);
        map.put("click", 1);
        map.put("controlType", 1);
        map.put("event", Integer.valueOf(i));
        gog gogVarD = eyo.d().d(this.n.j());
        if (gogVarD != null) {
            map.put("serviceType", Integer.valueOf(gogVarD.b() == 1 ? 3 : 2));
        }
        LogUtil.a("MiniBottomPlayer", "HEALTH_HEADLINES_CONTROL_USE_1100060 biMap = ", map, ", this = ", this);
        lmf.d().c(this.f7061c, AnalyticsValue.HEALTH_HEADLINES_CONTROL_USE_1100060.value(), map, 0);
    }

    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void d() {
        if (!HandlerExecutor.d()) {
            HandlerExecutor.b(new Runnable() { // from class: eyk
                @Override // java.lang.Runnable
                public final void run() {
                    this.d.d();
                }
            });
            return;
        }
        LogUtil.a("MiniBottomPlayer", "releaseLayout");
        setVisibility(8);
        a();
        o();
        if (getParent() instanceof ViewGroup) {
            ((ViewGroup) getParent()).removeView(this);
        }
        View viewB = qjb.c().b();
        if (!(viewB instanceof MiniBottomPlayer)) {
            LogUtil.j("MiniBottomPlayer", "native minibar is null");
            return;
        }
        if (viewB != this) {
            LogUtil.a("MiniBottomPlayer", "release native minibar");
            MiniBottomPlayer miniBottomPlayer = (MiniBottomPlayer) viewB;
            miniBottomPlayer.setVisibility(8);
            miniBottomPlayer.a();
            miniBottomPlayer.o();
            qjb.c().d();
        }
        qjb.c().c((View) null);
        qjb.c().d(false);
    }

    static class e extends BroadcastReceiver {
        private WeakReference<MiniBottomPlayer> d;

        public e(MiniBottomPlayer miniBottomPlayer) {
            this.d = new WeakReference<>(miniBottomPlayer);
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            String action;
            ReleaseLogUtil.d("R_MiniBottomPlayer", "LogoutBroadcastReceiver onReceive()");
            MiniBottomPlayer miniBottomPlayer = this.d.get();
            if (miniBottomPlayer != null) {
                if (intent == null) {
                    LogUtil.e("MiniBottomPlayer", "onReceive mReceiver intent null");
                    return;
                }
                try {
                    action = intent.getAction();
                } catch (Exception unused) {
                    LogUtil.e("MiniBottomPlayer", "LogoutBroadcastReceiver getAction exception");
                    action = null;
                }
                if ("com.huawei.plugin.account.logout".equals(action)) {
                    miniBottomPlayer.b();
                }
            }
        }
    }
}
