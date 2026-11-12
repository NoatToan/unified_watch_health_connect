package com.huawei.healthcloud.plugintrack.sportmusic;

import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaControllerCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.media.session.PlaybackStateCompat;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import com.android.mediacenter.localmusic.IMediaPlaybackService;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.pluginachievement.manager.model.MedalConstants;
import com.huawei.ui.commonui.R;
import defpackage.izw;
import defpackage.jaa;
import defpackage.jaq;
import defpackage.qre;
import defpackage.qrs;
import health.compact.a.CommonUtil;
import health.compact.a.LogAnonymous;
import health.compact.a.StorageParams;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class SportMusicController {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile SportMusicController f10627a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private MediaControllerCompat f10628b;
    private IBaseResponseCallback d;
    private IBaseResponseCallback m;
    private IMediaPlaybackService h = null;
    private List<MediaControllerCompat.Callback> e = new ArrayList();
    private boolean j = false;
    private boolean f = false;
    private boolean i = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private MediaControllerCompat.Callback f10629c = new MediaControllerCompat.Callback() { // from class: com.huawei.healthcloud.plugintrack.sportmusic.SportMusicController.2
        @Override // android.support.v4.media.session.MediaControllerCompat.Callback
        public void onMetadataChanged(final MediaMetadataCompat mediaMetadataCompat) {
            LogUtil.a("Track_SportMusicController", "onMetadataChanged");
            SportMusicController.this.j();
            SportMusicController.this.a(new MusicControlCommand(this) { // from class: com.huawei.healthcloud.plugintrack.sportmusic.SportMusicController.2.5
                @Override // com.huawei.healthcloud.plugintrack.sportmusic.SportMusicController.MusicControlCommand
                public void dealMusicControlCallback(MediaControllerCompat.Callback callback) {
                    callback.onMetadataChanged(mediaMetadataCompat);
                }
            });
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.Callback
        public void onPlaybackStateChanged(final PlaybackStateCompat playbackStateCompat) {
            LogUtil.a("Track_SportMusicController", "onPlaybackStateChanged");
            SportMusicController.this.a(new MusicControlCommand(this) { // from class: com.huawei.healthcloud.plugintrack.sportmusic.SportMusicController.2.1
                @Override // com.huawei.healthcloud.plugintrack.sportmusic.SportMusicController.MusicControlCommand
                public void dealMusicControlCallback(MediaControllerCompat.Callback callback) {
                    callback.onPlaybackStateChanged(playbackStateCompat);
                }
            });
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.Callback
        public void onSessionDestroyed() {
            LogUtil.a("Track_SportMusicController", "onSessionDestroyed");
            super.onSessionDestroyed();
            SportMusicController.this.i();
            SportMusicController.this.g();
            SportMusicController.this.f10628b = null;
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.Callback
        public void onSessionEvent(final String str, final Bundle bundle) {
            SportMusicController.this.a(new MusicControlCommand(this) { // from class: com.huawei.healthcloud.plugintrack.sportmusic.SportMusicController.2.3
                @Override // com.huawei.healthcloud.plugintrack.sportmusic.SportMusicController.MusicControlCommand
                public void dealMusicControlCallback(MediaControllerCompat.Callback callback) {
                    callback.onSessionEvent(str, bundle);
                }
            });
        }
    };
    private ServiceConnection g = new ServiceConnection() { // from class: com.huawei.healthcloud.plugintrack.sportmusic.SportMusicController.3
        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            LogUtil.d("Track_SportMusicController", "onServiceConnected name:", componentName);
            SportMusicController.this.i = true;
            SportMusicController.this.h = IMediaPlaybackService.Stub.asInterface(iBinder);
            try {
                MediaSessionCompat.Token mediaSessionToken = SportMusicController.this.h.getMediaSessionToken();
                if (mediaSessionToken == null) {
                    ReleaseLogUtil.e("Track_SportMusicController", "Empty token!");
                    return;
                }
                SportMusicController.this.f10628b = new MediaControllerCompat(BaseApplication.getContext(), mediaSessionToken);
                if (SportMusicController.this.f10628b != null) {
                    SportMusicController.this.f10628b.registerCallback(SportMusicController.this.f10629c);
                    SportMusicController.this.f = true;
                    if (SportMusicController.this.d != null) {
                        SportMusicController.this.d.a(0, null);
                        SportMusicController.this.d = null;
                    }
                    SportMusicController.this.j();
                    SportMusicController.this.a(new MusicControlCommand() { // from class: com.huawei.healthcloud.plugintrack.sportmusic.SportMusicController.3.4
                        @Override // com.huawei.healthcloud.plugintrack.sportmusic.SportMusicController.MusicControlCommand
                        public void dealMusicControlCallback(MediaControllerCompat.Callback callback) {
                            if (SportMusicController.this.f10628b != null) {
                                MediaMetadataCompat metadata = SportMusicController.this.f10628b.getMetadata();
                                if (metadata != null) {
                                    callback.onMetadataChanged(metadata);
                                }
                                PlaybackStateCompat playbackState = SportMusicController.this.f10628b.getPlaybackState();
                                if (playbackState != null) {
                                    callback.onPlaybackStateChanged(playbackState);
                                }
                            }
                        }
                    });
                }
            } catch (RemoteException unused) {
                LogUtil.e("Track_SportMusicController", "Make mediaControllerCompat remoteException");
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            if (SportMusicController.this.g != null && SportMusicController.this.i) {
                BaseApplication.getContext().unbindService(SportMusicController.this.g);
                SportMusicController.this.f = false;
                SportMusicController.this.i = false;
                ReleaseLogUtil.d("Track_SportMusicController", "unbindService");
            }
            if (SportMusicController.this.m != null) {
                SportMusicController.this.m.a(0, null);
            }
            LogUtil.a("Track_SportMusicController", "onServiceDisconnected name:", componentName);
        }
    };

    interface MusicControlCommand {
        void dealMusicControlCallback(MediaControllerCompat.Callback callback);
    }

    private SportMusicController() {
    }

    public void d(IBaseResponseCallback iBaseResponseCallback) {
        if (!CommonUtil.w(izw.p)) {
            ReleaseLogUtil.a("Track_SportMusicController", "isMusicAppSignature is not Authority.");
            return;
        }
        Intent intent = new Intent();
        this.d = iBaseResponseCallback;
        intent.setComponent(new ComponentName(izw.p, "com.android.mediacenter.localmusic.MediaPlaybackService"));
        ReleaseLogUtil.d("Track_SportMusicController", "bind ret = ", Boolean.valueOf(BaseApplication.getContext().bindService(intent, this.g, 1)));
    }

    public static SportMusicController c() {
        if (f10627a == null) {
            synchronized (SportMusicController.class) {
                if (f10627a == null) {
                    f10627a = new SportMusicController();
                }
            }
        }
        return f10627a;
    }

    public void e(int i) {
        jaq jaqVar = new jaq(BaseApplication.getContext(), new StorageParams(), Integer.toString(20002));
        if (jaa.f(BaseApplication.getContext()) && CommonUtil.bh() && jaa.c(BaseApplication.getContext())) {
            if (!CommonUtil.w(izw.p)) {
                ReleaseLogUtil.a("Track_SportMusicController", "isMusicAppSignature is not Authority.");
                return;
            }
            if (jaqVar.h(i) != 1) {
                return;
            }
            if (h() != null && h().getState() == 3) {
                a(1, (String) null);
            }
            String strA = jaqVar.a(i);
            String strB = jaqVar.b(i);
            if (TextUtils.isEmpty(strB)) {
                strB = "4";
            }
            LogUtil.a("Track_SportMusicController", "playListType ", strB);
            Intent intent = new Intent(CommonConstant.ACTION.HWID_SCHEME_URL, Uri.parse("hwmediacenter://com.android.mediacenter/playMusicEx?contentType=" + strB + "&contentInfo=" + strA + "&showPlayer=0&timeOut=5000&showProgressDialog=0&from=" + BaseApplication.getAppPackage()));
            intent.setPackage(izw.p);
            intent.putExtra(RemoteMessageConst.Notification.TAG, BaseApplication.getContext().getPackageName());
            try {
                if (BaseApplication.getActivity() != null) {
                    BaseApplication.getActivity().startActivity(intent);
                }
            } catch (ActivityNotFoundException unused) {
                LogUtil.e("Track_SportMusicController", "music play activity not found, check");
            }
        }
    }

    public void c(MediaControllerCompat.Callback callback) {
        if (callback != null && !this.e.contains(callback)) {
            this.e.add(callback);
        }
        MediaControllerCompat mediaControllerCompat = this.f10628b;
        if (mediaControllerCompat != null) {
            MediaMetadataCompat metadata = mediaControllerCompat.getMetadata();
            if (metadata != null && callback != null) {
                callback.onMetadataChanged(metadata);
            }
            PlaybackStateCompat playbackState = this.f10628b.getPlaybackState();
            if (playbackState == null || callback == null) {
                return;
            }
            callback.onPlaybackStateChanged(playbackState);
        }
    }

    public void d(MediaControllerCompat.Callback callback) {
        for (int i = 0; i < this.e.size(); i++) {
            if (this.e.get(i) == callback) {
                this.e.remove(i);
                return;
            }
        }
    }

    public void e(IBaseResponseCallback iBaseResponseCallback) {
        b(iBaseResponseCallback);
    }

    public void f() {
        b((IBaseResponseCallback) null);
    }

    private void b(IBaseResponseCallback iBaseResponseCallback) {
        this.m = iBaseResponseCallback;
    }

    public void j() {
        LogUtil.a("Track_SportMusicController", "getSongCollectState mController ", this.f10628b);
        MediaControllerCompat mediaControllerCompat = this.f10628b;
        if (mediaControllerCompat == null || mediaControllerCompat.getTransportControls() == null) {
            return;
        }
        this.f10628b.getTransportControls().sendCustomAction("com.huawei.music.action.LIKE_STATUS", (Bundle) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(MusicControlCommand musicControlCommand) {
        for (MediaControllerCompat.Callback callback : this.e) {
            if (callback != null) {
                musicControlCommand.dealMusicControlCallback(callback);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        a(new MusicControlCommand(this) { // from class: com.huawei.healthcloud.plugintrack.sportmusic.SportMusicController.5
            @Override // com.huawei.healthcloud.plugintrack.sportmusic.SportMusicController.MusicControlCommand
            public void dealMusicControlCallback(MediaControllerCompat.Callback callback) {
                callback.onPlaybackStateChanged(null);
            }
        });
    }

    public MediaMetadataCompat b() {
        MediaControllerCompat mediaControllerCompat = this.f10628b;
        if (mediaControllerCompat != null) {
            return mediaControllerCompat.getMetadata();
        }
        return null;
    }

    public PlaybackStateCompat h() {
        MediaControllerCompat mediaControllerCompat = this.f10628b;
        if (mediaControllerCompat != null) {
            return mediaControllerCompat.getPlaybackState();
        }
        return null;
    }

    public void e() {
        LogUtil.a("Track_SportMusicController", "destroyController");
        i();
        if (this.g != null && this.i) {
            BaseApplication.getContext().unbindService(this.g);
            this.i = false;
            this.f = false;
            LogUtil.a("Track_SportMusicController", "unbindService");
        }
        this.h = null;
    }

    public boolean a() {
        return this.f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i() {
        MediaControllerCompat mediaControllerCompat = this.f10628b;
        if (mediaControllerCompat != null) {
            mediaControllerCompat.unregisterCallback(this.f10629c);
        }
    }

    public void a(int i, String str) {
        if (this.h == null) {
            ReleaseLogUtil.e("Track_SportMusicController", "processMusicControlMsg mMediaPlayerCallbackService is null");
        } else {
            d(i, str);
        }
    }

    private void d(int i, String str) {
        if (i == 0) {
            try {
                this.h.stop();
                this.j = false;
                return;
            } catch (RemoteException e) {
                LogUtil.e("Track_SportMusicController", "processMusicControlMsg STOP_MUSIC ", LogAnonymous.b(e));
                return;
            }
        }
        if (i == 1) {
            try {
                ReleaseLogUtil.d("Track_SportMusicController", "processMusicControlMsg pause music");
                this.h.pause();
                return;
            } catch (RemoteException e2) {
                LogUtil.e("Track_SportMusicController", "processMusicControlMsg STOP_MUSIC ", LogAnonymous.b(e2));
                return;
            }
        }
        if (i == 2) {
            try {
                j();
                ReleaseLogUtil.d("Track_SportMusicController", "processMusicControlMsg play music");
                this.h.play();
                return;
            } catch (RemoteException e3) {
                LogUtil.e("Track_SportMusicController", "processMusicControlMsg PLAY_MUSIC ", LogAnonymous.b(e3));
                return;
            }
        }
        if (i == 3) {
            try {
                this.h.next();
                return;
            } catch (RemoteException e4) {
                LogUtil.e("Track_SportMusicController", "processMusicControlMsg NEXT_SONG ", LogAnonymous.b(e4));
                return;
            }
        }
        e(i, str);
    }

    private void e(int i, String str) {
        MediaControllerCompat mediaControllerCompat;
        if (i == 4) {
            try {
                this.h.prev();
                return;
            } catch (RemoteException e) {
                LogUtil.e("Track_SportMusicController", "processMusicControlMsg FORWARD_SONG ", LogAnonymous.b(e));
                return;
            }
        }
        if (i != 5 || (mediaControllerCompat = this.f10628b) == null || mediaControllerCompat.getTransportControls() == null) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString("fromPage", "HealthPlayer");
        this.f10628b.getTransportControls().sendCustomAction(str, bundle);
    }

    public void b(int i) {
        LogUtil.a("Track_SportMusicController", "pushStepRate :", Integer.valueOf(i));
        IMediaPlaybackService iMediaPlaybackService = this.h;
        if (iMediaPlaybackService != null) {
            try {
                iMediaPlaybackService.stepFrequency(i);
                return;
            } catch (RemoteException e) {
                LogUtil.e("Track_SportMusicController", "pushStepRate remoteException ", e.getMessage());
                return;
            }
        }
        ReleaseLogUtil.e("Track_SportMusicController", "pushStepRate mMediaPlayerCallbackService is NULL");
    }

    public void d(Bundle bundle) {
        if (bundle != null) {
            LogUtil.d("Track_SportMusicController", "duration = ", bundle.get("duration"), " steprate = ", bundle.get("stepRate"), " totalSteps = ", bundle.get(MedalConstants.EVENT_STEPS));
        }
        IMediaPlaybackService iMediaPlaybackService = this.h;
        if (iMediaPlaybackService == null) {
            ReleaseLogUtil.e("Track_SportMusicController", "notifyMusicToStop mMediaPlayerCallbackService is NULL");
            return;
        }
        try {
            iMediaPlaybackService.stopRunning(bundle);
            ReleaseLogUtil.d("Track_SportMusicController", "send stop command to music");
        } catch (RemoteException e) {
            LogUtil.e("Track_SportMusicController", "notifyMusicToStop remoteException ", e.getMessage());
        }
    }

    public void d(int i, int i2, boolean z) {
        Uri uri = Uri.parse(b(i, i2, z));
        if (!CommonUtil.w(izw.p)) {
            ReleaseLogUtil.a("Track_SportMusicController", "isMusicAppSignature is not Authority.");
            return;
        }
        Intent intent = new Intent(CommonConstant.ACTION.HWID_SCHEME_URL, uri);
        intent.setFlags(268599296);
        intent.setPackage(izw.p);
        intent.putExtra(RemoteMessageConst.Notification.TAG, BaseApplication.getContext().getPackageName());
        Context activity = BaseApplication.getActivity();
        try {
            String str = izw.p;
            if (activity == null) {
                activity = BaseApplication.getContext();
            }
            qrs.c(intent, str, activity, qre.f(R.string.IDS_hwh_motiontrack_music));
        } catch (ActivityNotFoundException unused) {
            LogUtil.e("Track_SportMusicController", "music running list activity not found, check");
        } catch (AndroidRuntimeException e) {
            LogUtil.e("Track_SportMusicController", "gotoMusicList ", LogAnonymous.b(e));
        } catch (SecurityException e2) {
            LogUtil.e("Track_SportMusicController", "gotoMusicList securityException", LogAnonymous.b(e2));
        }
    }

    private static boolean d(Context context) {
        IntentFilter intentFilter;
        if (context == null) {
            return false;
        }
        Intent intent = new Intent(CommonConstant.ACTION.HWID_SCHEME_URL, Uri.parse("hwmediacenter://com.android.mediacenter/showrunplaylistnew?pver=80002300&portal=qq&from=com.huawei.health"));
        intent.setFlags(268599296);
        PackageManager packageManager = context.getPackageManager();
        if (packageManager == null) {
            LogUtil.j("Track_SportMusicController", "packageManager is null");
            return false;
        }
        for (ResolveInfo resolveInfo : packageManager.queryIntentActivities(intent, 64)) {
            if (resolveInfo != null && (intentFilter = resolveInfo.filter) != null && intentFilter.hasDataPath("/showrunplaylistnew")) {
                return true;
            }
        }
        return false;
    }

    public String b(int i, int i2, boolean z) {
        boolean zD = d(BaseApplication.getContext());
        LogUtil.a("Track_SportMusicController", "music isSupportNewPath ", Boolean.valueOf(zD));
        jaq jaqVar = new jaq(BaseApplication.getContext(), new StorageParams(), Integer.toString(20002));
        String strB = jaqVar.b(i2);
        if (TextUtils.isEmpty(strB)) {
            strB = "4";
        }
        String strA = jaqVar.a(i2);
        LogUtil.a("Track_SportMusicController", "getSportMusicUrl playListType  ", strB, " isNeedPlay ", Boolean.valueOf(z));
        return (zD ? "hwmediacenter://com.android.mediacenter/showrunplaylistnew?pver=80002300&portal=qq&from=com.huawei.health" : "hwmediacenter://com.android.mediacenter/showrunplaylist?pver=80002300&portal=qq&from=com.huawei.health") + b(i, i2) + "&nopage=1&needback=1&playlistId=" + strA + e(i2, strB, z);
    }

    private String b(int i, int i2) {
        if (i2 == 264) {
            if (i == 2) {
                return "&channelid=1113";
            }
            return i == 1 ? "&channelid=1109" : "&channelid=1104";
        }
        if (i2 != 265) {
            if (i2 == 283) {
                if (i == 2) {
                    return "&channelid=1116";
                }
                return i == 1 ? "&channelid=1111" : "&channelid=1107";
            }
            switch (i2) {
                case 257:
                    if (i == 2) {
                        return "&channelid=1114";
                    }
                    return i == 1 ? "&channelid=1117" : "&channelid=1105";
                case 258:
                    if (i == 2) {
                        return "&channelid=1112";
                    }
                    if (i != 1) {
                        return "&channelid=1103";
                    }
                    return "&channelid=1108";
                case 259:
                    break;
                default:
                    LogUtil.j("Track_SportMusicController", "getNotSelectMusicUrl sportType is ", Integer.valueOf(i2));
                    return "&channelid=1103";
            }
        }
        if (i == 2) {
            return "&channelid=1115";
        }
        return i == 1 ? "&channelid=1110" : "&channelid=1106";
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0061  */
    /* JADX WARN: Instruction removed from duplicated block: B:16:0x0061, please report this as an issue */
    private String e(int i, String str, boolean z) {
        String str2 = "&playlistType=" + str + "&sceneName=";
        if (i == 137) {
            str2 = str2 + "yoga&needPlay=";
        } else if (i == 283) {
            str2 = str2 + "skipRope&needPlay=";
        } else if (i == 10001) {
            str2 = str2 + "fitness&needPlay=";
        } else if (i == 264) {
            str2 = str2 + "indoorRun&needPlay=";
        } else if (i != 265) {
            switch (i) {
                case 257:
                    str2 = str2 + "walk&needPlay=";
                    break;
                case 258:
                    str2 = str2 + "outdoorRun&needPlay=";
                    break;
                case 259:
                    str2 = str2 + "ride&needPlay=";
                    break;
                default:
                    LogUtil.j("Track_SportMusicController", "getNotSelectMusicUrl sportType is ", Integer.valueOf(i));
                    break;
            }
        } else {
            str2 = str2 + "ride&needPlay=";
        }
        return str2 + z;
    }

    public void a(boolean z) {
        this.j = z;
    }

    public boolean d() {
        return this.j;
    }
}
