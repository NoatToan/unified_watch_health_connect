package defpackage;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.MediaMetadata;
import android.media.browse.MediaBrowser;
import android.media.session.MediaController;
import android.media.session.PlaybackState;
import android.os.Bundle;
import android.support.v4.media.MediaMetadataCompat;
import android.view.View;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.common.utils.NetworkUtil;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.haf.localbroadcastmanager.LocalBroadcastManager;
import com.huawei.health.musicservice.api.AudioService;
import com.huawei.health.musicservice.api.IAudioPlayer;
import com.huawei.health.musicservice.mediacenter.MediaCenterCallback;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.openalliance.ad.constant.ParamConstants;
import com.huawei.ui.commonui.R;
import com.huawei.ui.commonui.dialog.NoTitleCustomAlertDialog;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.io.Serializable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes7.dex */
public class get {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f34996a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f34997b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f34998c;
    private e d;
    private Context e;
    private volatile MediaBrowser f;
    private boolean g;
    private boolean h;
    private boolean i;
    private IBaseResponseCallback j;
    private List<gdy> k;
    private Queue<Runnable> l;
    private String m;
    private MediaController n;
    private Map<String, Integer> o;
    private IAudioPlayer.PlayMode p;
    private int s;
    private List<a> t;

    public static class a {
        public void onMetadataChanged(MediaMetadata mediaMetadata) {
        }

        public void onPlaybackStateChanged(PlaybackState playbackState) {
        }
    }

    private get() {
        this.t = new CopyOnWriteArrayList();
        this.o = new ConcurrentHashMap();
        this.l = new ConcurrentLinkedDeque();
        this.s = 0;
        this.f34996a = 0;
        this.e = BaseApplication.b();
        this.k = new CopyOnWriteArrayList();
        this.j = new IBaseResponseCallback() { // from class: gfa
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public final void a(int i, Object obj) {
                LogUtil.a("MusicService_MediaCenter", "inner init errorCode:", Integer.valueOf(i));
            }
        };
    }

    public static get c() {
        return c.f35000c;
    }

    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void e(final IBaseResponseCallback iBaseResponseCallback) {
        if (!HandlerExecutor.c()) {
            HandlerExecutor.c(new Runnable() { // from class: ges
                @Override // java.lang.Runnable
                public final void run() {
                    this.e.e(iBaseResponseCallback);
                }
            });
            ReleaseLogUtil.e("R_MusicService_MediaCenter", "MediaCenter post to Main Thread");
            return;
        }
        if (iBaseResponseCallback == null) {
            ReleaseLogUtil.e("R_MusicService_MediaCenter", "callback is null");
            return;
        }
        if (q()) {
            ReleaseLogUtil.d("R_MusicService_MediaCenter", "mediaBrowser already connected before");
            iBaseResponseCallback.a(0, "mediaBrowser already connected before");
        } else {
            ReleaseLogUtil.d("R_MusicService_MediaCenter", "mediaBrowser start to connect");
            this.f = new MediaBrowser(this.e, new ComponentName(BaseApplication.b(), (Class<?>) AudioService.class), new b(iBaseResponseCallback), null);
            this.f.connect();
            p();
        }
    }

    public void k() {
        ReleaseLogUtil.d("R_MusicService_MediaCenter", "mediaCenter play");
        if (!q()) {
            this.l.add(new Runnable() { // from class: gez
                @Override // java.lang.Runnable
                public final void run() {
                    this.e.k();
                }
            });
            e(this.j);
        } else {
            this.n.getTransportControls().play();
        }
    }

    public void n() {
        ReleaseLogUtil.d("R_MusicService_MediaCenter", "mediaCenter pause");
        if (!q() && this.s == 3) {
            this.l.add(new Runnable() { // from class: gfe
                @Override // java.lang.Runnable
                public final void run() {
                    this.f35013c.n();
                }
            });
            e(this.j);
        } else {
            this.n.getTransportControls().pause();
        }
    }

    public void r() {
        ReleaseLogUtil.d("R_MusicService_MediaCenter", "mediaCenter stop");
        this.g = false;
        int i = this.s;
        if (i == 1 || i == 0) {
            ReleaseLogUtil.d("R_MusicService_MediaCenter", "mediaCenter currentStatus is STOPPED OR NONE");
        } else if (!q()) {
            this.l.add(new Runnable() { // from class: geu
                @Override // java.lang.Runnable
                public final void run() {
                    this.f35002b.r();
                }
            });
            e(this.j);
        } else {
            this.n.getTransportControls().stop();
        }
    }

    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public void b(final long j) {
        ReleaseLogUtil.d("R_MusicService_MediaCenter", "mediaCenter seekTo");
        if (!q()) {
            this.l.add(new Runnable() { // from class: gfc
                @Override // java.lang.Runnable
                public final void run() {
                    this.f35010a.b(j);
                }
            });
            e(this.j);
        } else {
            this.n.getTransportControls().seekTo(j);
        }
    }

    public void a(final List<gdy> list) {
        ReleaseLogUtil.d("R_MusicService_MediaCenter", "mediaCenter resetPlayList");
        if (!q()) {
            this.l.add(new Runnable() { // from class: gfb
                @Override // java.lang.Runnable
                public final void run() {
                    this.f35009b.e(list);
                }
            });
            e(this.j);
            return;
        }
        this.k.clear();
        if (njy.b(list)) {
            this.k.addAll(list);
        }
        this.f34996a = 0;
        Bundle bundle = new Bundle();
        bundle.putSerializable(IAudioPlayer.ParameterKeys.AUDIO_RESET_PLAY_LIST, (Serializable) list);
        LogUtil.a("MusicService_MediaCenter", "resetPlayList playList size = ", Integer.valueOf(list.size()));
        this.n.getTransportControls().sendCustomAction(IAudioPlayer.ParameterKeys.AUDIO_RESET_PLAY_LIST, bundle);
        s();
    }

    /* synthetic */ void e(List list) {
        a((List<gdy>) list);
    }

    private void s() {
        Bundle bundle = new Bundle();
        bundle.putFloat(IAudioPlayer.ParameterKeys.AUDIO_PLAY_SPEED, 1.0f);
        LogUtil.a("MusicService_MediaCenter", "reset PlaySpeed 1.0 --------");
        this.n.getTransportControls().sendCustomAction(IAudioPlayer.ParameterKeys.AUDIO_PLAY_SPEED, bundle);
    }

    public List<gdy> g() {
        return this.k;
    }

    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void d(final long j) {
        ReleaseLogUtil.d("R_MusicService_MediaCenter", "mediaCenter autoStop time:", Long.valueOf(j));
        if (!q()) {
            this.l.add(new Runnable() { // from class: gew
                @Override // java.lang.Runnable
                public final void run() {
                    this.f35004c.d(j);
                }
            });
            e(this.j);
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putLong(IAudioPlayer.ParameterKeys.AUDIO_AUTO_STOP, j);
        this.n.getTransportControls().sendCustomAction(IAudioPlayer.ParameterKeys.AUDIO_AUTO_STOP, bundle);
        this.i = true;
        this.f34998c = System.currentTimeMillis() + j;
    }

    public boolean m() {
        return this.h;
    }

    public void b(boolean z) {
        this.h = z;
        LogUtil.a("MusicService_MediaCenter", "mediaCenter setReplay replay is ", Boolean.valueOf(z));
    }

    public boolean l() {
        return this.g;
    }

    public void d(boolean z) {
        this.g = z;
    }

    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void a(final IAudioPlayer.PlayMode playMode) {
        ReleaseLogUtil.d("R_MusicService_MediaCenter", "mediaCenter setPlayMode playMode:", playMode.toString());
        if (!q()) {
            this.l.add(new Runnable() { // from class: gff
                @Override // java.lang.Runnable
                public final void run() {
                    this.f35014b.a(playMode);
                }
            });
            e(this.j);
        } else {
            this.p = playMode;
            Bundle bundle = new Bundle();
            bundle.putString(IAudioPlayer.ParameterKeys.AUDIO_PLAY_MODE, playMode.toString());
            this.n.getTransportControls().sendCustomAction(IAudioPlayer.ParameterKeys.AUDIO_PLAY_MODE, bundle);
        }
    }

    public boolean b(String str) {
        boolean zB = SharedPreferenceManager.b("MusicService", str + "-isNonWifiTipsShow", true);
        boolean zK = NetworkUtil.k();
        boolean zH = NetworkUtil.h();
        LogUtil.a("MusicService_MediaCenter", "isNetworkConnected = ", Boolean.valueOf(zH), "; isWifiConnected = ", Boolean.valueOf(zK), "; isNeedShowWifiTips = ", Boolean.valueOf(zB));
        return zH && !zK && zB;
    }

    public void d(MediaCenterCallback mediaCenterCallback, String str) {
        if (b(str)) {
            c(mediaCenterCallback, str);
        } else {
            mediaCenterCallback.onResponse(0, "noNeedToShowDialog");
        }
    }

    private void c(final MediaCenterCallback mediaCenterCallback, final String str) {
        LogUtil.a("MusicService_MediaCenter", "showWifiTipsDialog");
        Activity activityJ = BaseApplication.j();
        if (activityJ == null) {
            LogUtil.j("MusicService_MediaCenter", "context is null when show mobile data dialog.");
            return;
        }
        NoTitleCustomAlertDialog.Builder builder = new NoTitleCustomAlertDialog.Builder(activityJ);
        builder.b(R.string.IDS_use_rate_of_flow).c(R.string.IDS_continue, new View.OnClickListener() { // from class: gey
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                get.c(str, mediaCenterCallback, view);
            }
        }).a(R.string.IDS_hw_common_ui_dialog_cancel, new View.OnClickListener() { // from class: gev
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                get.d(mediaCenterCallback, view);
            }
        });
        NoTitleCustomAlertDialog noTitleCustomAlertDialogC = builder.c();
        noTitleCustomAlertDialogC.setCancelable(false);
        noTitleCustomAlertDialogC.show();
    }

    static /* synthetic */ void c(String str, MediaCenterCallback mediaCenterCallback, View view) {
        SharedPreferenceManager.a("MusicService", str + "-isNonWifiTipsShow", false);
        if (mediaCenterCallback != null) {
            mediaCenterCallback.onResponse(0, "success");
        }
    }

    static /* synthetic */ void d(MediaCenterCallback mediaCenterCallback, View view) {
        if (mediaCenterCallback != null) {
            mediaCenterCallback.onResponse(-1, ParamConstants.CallbackMethod.ON_FAIL);
        }
    }

    public IAudioPlayer.PlayMode h() {
        return this.p;
    }

    public int i() {
        return this.s;
    }

    public int j() {
        return this.f34996a;
    }

    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void d(final int i) {
        ReleaseLogUtil.d("R_MusicService_MediaCenter", "mediaCenter skipTo index:", Integer.valueOf(i));
        if (!q()) {
            this.l.add(new Runnable() { // from class: gex
                @Override // java.lang.Runnable
                public final void run() {
                    this.d.d(i);
                }
            });
            e(this.j);
        } else {
            this.n.getTransportControls().skipToQueueItem(i);
        }
    }

    public long e() {
        return this.f34997b;
    }

    public boolean o() {
        return this.i;
    }

    public long a() {
        return this.f34998c;
    }

    public void b() {
        ReleaseLogUtil.d("R_MusicService_MediaCenter", "mediaCenter disconnect");
        if (q()) {
            ReleaseLogUtil.d("R_MusicService_MediaCenter", "mediaBrowser isAvailable");
            this.f.disconnect();
        }
        this.f = null;
        this.n = null;
        t();
        u();
    }

    private void t() {
        this.g = false;
        this.o.clear();
        this.s = 0;
        this.f34996a = 0;
        this.k.clear();
        this.p = IAudioPlayer.PlayMode.SEQUENCE_PLAY;
        this.f34997b = 0L;
        this.f34998c = 0L;
        this.i = false;
        this.m = "";
    }

    public void e(a aVar) {
        this.t.add(aVar);
    }

    public void a(a aVar) {
        this.t.remove(aVar);
    }

    public void d() {
        ReleaseLogUtil.d("R_MusicService_MediaCenter", "mediaCenter cancelAutoStop");
        if (!this.i) {
            ReleaseLogUtil.d("R_MusicService_MediaCenter", "mediaCenter doesn't set autoStop");
            return;
        }
        if (!q()) {
            this.l.add(new Runnable() { // from class: gfd
                @Override // java.lang.Runnable
                public final void run() {
                    this.f35012c.d();
                }
            });
            e(this.j);
        } else {
            this.i = false;
            this.f34998c = 0L;
            this.n.getTransportControls().sendCustomAction(IAudioPlayer.ParameterKeys.AUDIO_CANCEL_AUTO_STOP, new Bundle());
        }
    }

    private void p() {
        if (this.d == null) {
            LogUtil.a("MusicService_MediaCenter", "registerLogoutBroadcast logoutBroadcastReceiver == null");
            this.d = new e();
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("com.huawei.plugin.account.logout");
            LocalBroadcastManager.getInstance().registerReceiver(this.d, intentFilter);
        }
    }

    private void u() {
        if (this.d != null) {
            LogUtil.a("MusicService_MediaCenter", "unregisterLogoutBroadcast logoutBroadcastReceiver != null");
            LocalBroadcastManager.getInstance().unregisterReceiver(this.d);
            this.d = null;
        }
    }

    public String f() {
        return this.m;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean q() {
        return this.f != null && this.f.isConnected();
    }

    static class c {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final get f35000c = new get();
    }

    class b extends MediaBrowser.ConnectionCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private IBaseResponseCallback f34999a;

        public b(IBaseResponseCallback iBaseResponseCallback) {
            this.f34999a = iBaseResponseCallback;
        }

        @Override // android.media.browse.MediaBrowser.ConnectionCallback
        public void onConnected() {
            ReleaseLogUtil.d("R_MusicService_MediaCenter", "onConnected");
            if (!get.this.q()) {
                ReleaseLogUtil.d("R_MusicService_MediaCenter", "mediaBrowser is null or not connected");
                this.f34999a.a(-1, "mediaBrowser is null or not connected");
                return;
            }
            get.this.n = new MediaController(BaseApplication.b(), get.this.f.getSessionToken());
            get.this.n.registerCallback(new d());
            while (!get.this.l.isEmpty()) {
                Runnable runnable = (Runnable) get.this.l.peek();
                if (runnable != null) {
                    runnable.run();
                    get.this.l.poll();
                }
            }
            this.f34999a.a(0, "onConnected");
        }

        @Override // android.media.browse.MediaBrowser.ConnectionCallback
        public void onConnectionFailed() {
            super.onConnectionFailed();
            ReleaseLogUtil.d("R_MusicService_MediaCenter", "onConnectionFailed");
            this.f34999a.a(-1, "onConnectionFailed");
        }
    }

    class d extends MediaController.Callback {
        private d() {
        }

        @Override // android.media.session.MediaController.Callback
        public void onPlaybackStateChanged(PlaybackState playbackState) {
            if (playbackState == null) {
                ReleaseLogUtil.e("R_MusicService_MediaCenter", "onPlaybackStateChanged state is null");
                return;
            }
            get.this.s = playbackState.getState();
            get.this.f34997b = playbackState.getPosition();
            Iterator it = get.this.t.iterator();
            while (it.hasNext()) {
                ((a) it.next()).onPlaybackStateChanged(playbackState);
            }
        }

        @Override // android.media.session.MediaController.Callback
        public void onMetadataChanged(MediaMetadata mediaMetadata) {
            if (mediaMetadata == null) {
                ReleaseLogUtil.e("R_MusicService_MediaCenter", "onMetadataChanged metadata is null");
                return;
            }
            String string = mediaMetadata.getString(MediaMetadataCompat.METADATA_KEY_MEDIA_ID);
            if (get.this.m == null || !get.this.m.equals(string)) {
                get.this.s = 0;
            }
            get.this.m = string;
            if (string != null && get.this.o.containsKey(string)) {
                get getVar = get.this;
                getVar.f34996a = ((Integer) getVar.o.get(string)).intValue();
            }
            Iterator it = get.this.t.iterator();
            while (it.hasNext()) {
                ((a) it.next()).onMetadataChanged(mediaMetadata);
            }
        }
    }

    class e extends BroadcastReceiver {
        private e() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if ("com.huawei.plugin.account.logout".equals(intent.getAction())) {
                LogUtil.a("MusicService_MediaCenter", "receive logout action , stop mediaPlayer");
                get.this.r();
                get.this.b();
            }
        }
    }
}
