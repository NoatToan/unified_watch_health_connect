package defpackage;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioManager;
import android.media.MediaDescription;
import android.media.MediaMetadata;
import android.media.session.MediaController;
import android.media.session.MediaSession;
import android.media.session.MediaSessionManager;
import android.media.session.PlaybackState;
import android.os.BadParcelableException;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.health.manager.powerkit.PowerKitManager;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.datatypes.MusicInfo;
import com.huawei.hwdevice.phoneprocess.mgr.musiccontrol.ControlInterface;
import com.huawei.hwdevice.phoneprocess.mgr.musiccontrol.HealthMediaCallback;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.operation.OpAnalyticsUtil;
import health.compact.a.BroadcastManagerUtil;
import health.compact.a.LocalBroadcast;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes11.dex */
public class nbu extends nbq {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static nbu f42850b;
    private AudioManager j;
    private HealthMediaCallback k;
    private MediaDescription t;
    private MediaSessionManager u;
    private String v;
    private ControlInterface.MusicChangeCallback x;
    private static final Object d = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Object f42849a = new Object();
    private static List<MediaController> e = new ArrayList(16);
    private List<String> o = Arrays.asList("com.huawei.camera", "tv.danmaku.bili", "com.android.server.telecom", "com.iflytek.readassistant", "com.huawei.hicar", "com.autonavi.minimap", "com.duowan.kiwi", "com.youku.phone", "com.ss.android.article.video", "com.huawei.soundrecorder", "com.uxin.kilaaudio", "com.tencent.android.qqdownloader");
    private List<MediaController.Callback> f = new ArrayList(16);
    private HashMap<String, MediaSession.Token> h = new HashMap<>();
    private List<MediaController> i = new ArrayList(16);
    private String y = "";
    private MediaController s = null;
    private int m = -1;
    private int q = 0;
    private int r = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private HashMap<String, String> f42851c = new HashMap<>();
    private boolean l = false;
    private BroadcastReceiver g = new BroadcastReceiver() { // from class: nbu.5
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent == null) {
                LogUtil.j("MusicController", "mBroadcastReceiver, intent is null");
                return;
            }
            LogUtil.a("MusicController", "mBroadcastReceiver intent : " + intent.getAction());
            if (Constants.VOLUME_CHANGED_ACTION.equals(intent.getAction())) {
                try {
                    if (nbu.this.j == null) {
                        return;
                    }
                    int streamVolume = nbu.this.j.getStreamVolume(3);
                    LogUtil.a("MusicController", "volume：", Integer.valueOf(streamVolume));
                    if (streamVolume != nbu.this.r) {
                        if (nbu.this.x != null) {
                            nbu.this.x.onMusicChanged();
                        }
                        nbu.this.r = streamVolume;
                    }
                } catch (NullPointerException unused) {
                    LogUtil.e("MusicController", "NullPointerException IAudioService");
                }
            }
        }
    };
    private MediaSessionManager.OnActiveSessionsChangedListener p = new MediaSessionManager.OnActiveSessionsChangedListener() { // from class: nbu.2
        @Override // android.media.session.MediaSessionManager.OnActiveSessionsChangedListener
        public void onActiveSessionsChanged(List<MediaController> list) {
            LogUtil.a("MusicController", "onActiveSessionsChanged start.");
            nbu.this.i(list);
            nbu.this.j(list);
            nbu.this.h(list);
            if (list != null) {
                synchronized (nbu.d) {
                    List unused = nbu.e = list;
                }
                LogUtil.a("MusicController", "onActiveSessionsChanged activeSessionsChangedHandle");
                nbu.this.e(list);
                return;
            }
            LogUtil.a("MusicController", "onActiveSessionsChanged controllerList is null");
            nbu.this.l();
            nbu.this.d(true);
        }
    };
    private Handler n = new Handler(Looper.getMainLooper()) { // from class: nbu.4
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
            int i = message.what;
            if (i == 20) {
                LogUtil.a("MusicController", "handleMessage no music time out !");
                if (nbu.this.u != null) {
                    try {
                        nbu.this.u.removeOnActiveSessionsChangedListener(nbu.this.p);
                    } catch (SecurityException unused) {
                        LogUtil.e("MusicController", "SecurityException Missing permission to control media");
                    }
                }
                if (nbu.this.x != null) {
                    nbu.this.x.onMusicDiedTimeOut();
                }
                nbu.this.unRegisterMusicCallback();
                return;
            }
            if (i == 21) {
                LogUtil.a("MusicController", "MSG_ACTION_REGISTER_MUSIC_CONTROL");
                if (nbu.this.u != null) {
                    try {
                        nbu.this.u.addOnActiveSessionsChangedListener(nbu.this.p, new ComponentName(BaseApplication.getContext().getPackageName(), "com.huawei.bone.ui.setting.NotificationPushListener"));
                        return;
                    } catch (SecurityException unused2) {
                        LogUtil.e("MusicController", "SecurityException Missing permission to control media");
                        return;
                    }
                }
                return;
            }
            if (i == 30) {
                if (nbu.this.x != null) {
                    LogUtil.a("MusicController", "MSG_ACTION_MUSIC_UPDATE");
                    nbu.this.x.onMusicChanged();
                    return;
                }
                return;
            }
            LogUtil.j("MusicController", "mHandler default");
        }
    };

    public boolean e() {
        return this.l;
    }

    public void d(boolean z) {
        this.l = z;
    }

    private HealthMediaCallback b(MediaController mediaController) {
        return new HealthMediaCallback(mediaController.getPackageName()) { // from class: nbu.1
            @Override // android.media.session.MediaController.Callback
            public void onSessionDestroyed() {
                super.onSessionDestroyed();
            }

            @Override // android.media.session.MediaController.Callback
            public void onSessionEvent(String str, Bundle bundle) {
                super.onSessionEvent(str, bundle);
            }

            @Override // android.media.session.MediaController.Callback
            public void onPlaybackStateChanged(PlaybackState playbackState) {
                super.onPlaybackStateChanged(playbackState);
                nbu.this.c(getPackageName(), playbackState);
            }

            @Override // android.media.session.MediaController.Callback
            public void onMetadataChanged(MediaMetadata mediaMetadata) {
                super.onMetadataChanged(mediaMetadata);
                nbu.this.e(getPackageName(), mediaMetadata);
            }

            @Override // android.media.session.MediaController.Callback
            public void onQueueChanged(List<MediaSession.QueueItem> list) {
                super.onQueueChanged(list);
            }

            @Override // android.media.session.MediaController.Callback
            public void onQueueTitleChanged(CharSequence charSequence) {
                super.onQueueTitleChanged(charSequence);
            }

            @Override // android.media.session.MediaController.Callback
            public void onExtrasChanged(Bundle bundle) {
                super.onExtrasChanged(bundle);
            }

            @Override // android.media.session.MediaController.Callback
            public void onAudioInfoChanged(MediaController.PlaybackInfo playbackInfo) {
                super.onAudioInfoChanged(playbackInfo);
            }
        };
    }

    private nbu() {
        j();
        i();
    }

    private void e(CharSequence charSequence) {
        if (!e() || charSequence == null || TextUtils.equals("", charSequence)) {
            return;
        }
        LogUtil.a("MusicController", "mediaDescriptionCompat.getTitle() is not blank string");
        d(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(String str, PlaybackState playbackState) {
        LogUtil.j("MusicController", "changeState packageName:", str);
        if (this.o.contains(str)) {
            LogUtil.j("MusicController", "changeState Filtered Packages.");
            return;
        }
        if (playbackState == null) {
            LogUtil.j("MusicController", "onPlaybackStateChanged state is null.");
            return;
        }
        ReleaseLogUtil.d("R_MusicController", "onPlaybackStateChanged state :", playbackState.toString(), ",last state :", Integer.valueOf(this.q));
        int state = playbackState.getState();
        int iIntValue = this.f42851c.containsKey(str) ? Integer.valueOf(this.f42851c.get(str)).intValue() : -1;
        ReleaseLogUtil.d("R_MusicController", "lastState :", Integer.valueOf(iIntValue), ",stateCode :", Integer.valueOf(state));
        if (iIntValue != state) {
            this.f42851c.put(str, String.valueOf(state));
            if (state == 3 && !str.equals(this.s.getPackageName())) {
                LogUtil.a("MusicController", "changeState playing changeMediaSequence");
                d(str);
            }
            if (this.x != null) {
                LogUtil.a("MusicController", "changeState onMusicChanged");
                this.x.onMusicChanged();
                return;
            } else {
                LogUtil.a("MusicController", "mMusicChangeCallback == null");
                return;
            }
        }
        LogUtil.a("MusicController", "lastState equals stateCode");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(String str, MediaMetadata mediaMetadata) {
        LogUtil.j("MusicController", "onMetadataChanged packageName:", str);
        if (this.o.contains(str)) {
            LogUtil.j("MusicController", "onMetadataChanged Filtered Packages.");
            return;
        }
        try {
            if (mediaMetadata == null) {
                ReleaseLogUtil.d("R_MusicController", "onMetadataChanged metadata == null");
                return;
            }
            MediaDescription description = mediaMetadata.getDescription();
            if (description != null) {
                e(description);
                if (c(description, this.t)) {
                    LogUtil.a("MusicController", "changeMetadata not change MediaDescription");
                    return;
                }
                int iIntValue = this.f42851c.containsKey(str) ? Integer.valueOf(this.f42851c.get(str)).intValue() : -1;
                LogUtil.a("MusicController", "changeMetadata lastState:", Integer.valueOf(iIntValue));
                if (!str.equals(this.s.getPackageName()) && iIntValue == 3) {
                    LogUtil.a("MusicController", "changeMetadata changeMediaSequence");
                    d(str);
                }
                this.t = description;
                e(description.getTitle());
                if (this.x != null) {
                    LogUtil.a("MusicController", "changeMetadata onMusicChanged");
                    this.x.onMusicChanged();
                } else {
                    LogUtil.a("MusicController", "changeMetadata mMusicChangeCallback is null");
                }
            }
        } catch (BadParcelableException e2) {
            d("MusicController", "changeMetadata :" + ExceptionUtils.c(e2));
        } catch (RuntimeException e3) {
            d("MusicController", "changeMetadata :" + ExceptionUtils.c(e3));
        }
    }

    private void d(String str, String str2) {
        OpAnalyticsUtil.getInstance().setProbabilityProblemEvent(str, str2);
        ReleaseLogUtil.d("R_MusicController", str, str2);
    }

    private boolean c(MediaDescription mediaDescription, MediaDescription mediaDescription2) {
        if (mediaDescription == null && mediaDescription2 == null) {
            LogUtil.a("MusicController", "mediaDescriptions both is null");
            return true;
        }
        if (mediaDescription != null && mediaDescription2 == null) {
            LogUtil.a("MusicController", "oldMediaDescription is null");
            return false;
        }
        if (mediaDescription != null || mediaDescription2 == null) {
            return Objects.equals(mediaDescription.getTitle(), mediaDescription2.getTitle()) && Objects.equals(mediaDescription.getSubtitle(), mediaDescription2.getSubtitle());
        }
        LogUtil.a("MusicController", "newMediaDescription is null");
        return false;
    }

    public static nbu c() {
        nbu nbuVar;
        synchronized (f42849a) {
            if (f42850b == null) {
                LogUtil.a("MusicController", "getInstance() instance is null ");
                f42850b = new nbu();
            }
            nbuVar = f42850b;
        }
        return nbuVar;
    }

    private void j() {
        LogUtil.a("MusicController", "enter initMediaSession");
        Object systemService = BaseApplication.getContext().getSystemService("media_session");
        List<MediaController> activeSessions = null;
        if (systemService instanceof MediaSessionManager) {
            MediaSessionManager mediaSessionManager = (MediaSessionManager) systemService;
            this.u = mediaSessionManager;
            try {
                activeSessions = mediaSessionManager.getActiveSessions(new ComponentName(BaseApplication.getContext().getPackageName(), "com.huawei.bone.ui.setting.NotificationPushListener"));
                i(activeSessions);
                if (Looper.getMainLooper() == Looper.myLooper()) {
                    this.u.addOnActiveSessionsChangedListener(this.p, new ComponentName(BaseApplication.getContext().getPackageName(), "com.huawei.bone.ui.setting.NotificationPushListener"));
                } else {
                    this.n.sendEmptyMessage(21);
                }
            } catch (SecurityException unused) {
                LogUtil.e("MusicController", "SecurityException Missing permission to control media");
            }
        }
        if (activeSessions != null) {
            LogUtil.a("MusicController", "controllers.size:", Integer.valueOf(activeSessions.size()));
            if (activeSessions.size() > 0) {
                f();
                MediaController mediaController = activeSessions.get(0);
                this.s = mediaController;
                this.y = mediaController.getPackageName();
                HealthMediaCallback healthMediaCallbackB = b(this.s);
                this.k = healthMediaCallbackB;
                this.s.registerCallback(healthMediaCallbackB, new Handler(Looper.getMainLooper()));
                if (this.s.getPlaybackInfo() != null) {
                    LogUtil.a("MusicController", "Maxvolume:", Integer.valueOf(this.s.getPlaybackInfo().getMaxVolume()), "currentvolume : ", Integer.valueOf(this.s.getPlaybackInfo().getCurrentVolume()));
                }
                if (this.s.getPlaybackState() != null) {
                    this.k.onPlaybackStateChanged(this.s.getPlaybackState());
                    LogUtil.a("MusicController", "playbackState:", this.s.getPlaybackState());
                }
                MediaMetadata metadata = this.s.getMetadata();
                if (metadata != null) {
                    LogUtil.a("MusicController", "mHealthMediaCallback onMetadataChanged");
                    this.k.onMetadataChanged(metadata);
                    return;
                }
                return;
            }
            return;
        }
        LogUtil.a("MusicController", "controllers is null");
    }

    private void e(MediaDescription mediaDescription) {
        try {
            if (mediaDescription == null) {
                LogUtil.a("MusicController", "mediaDescription is null");
                return;
            }
            CharSequence subtitle = mediaDescription.getSubtitle();
            if (subtitle != null) {
                LogUtil.a("MusicController", "subTitle:", subtitle);
            }
            CharSequence title = mediaDescription.getTitle();
            if (title != null) {
                LogUtil.a("MusicController", "title:", title);
            }
        } catch (BadParcelableException e2) {
            OpAnalyticsUtil.getInstance().setRiskWarningEvent("MusicController", "BadParcelableException");
            LogUtil.a("MusicController", "printMediaDescription e: ", ExceptionUtils.c(e2));
        } catch (RuntimeException e3) {
            OpAnalyticsUtil.getInstance().setRiskWarningEvent("MusicController", "printMediaDescription RuntimeException:" + ExceptionUtils.c(e3));
            LogUtil.a("MusicController", "printMediaDescription RuntimeException e: ", ExceptionUtils.c(e3));
        }
    }

    private void i() {
        LogUtil.a("MusicController", "initVolume");
        Object systemService = BaseApplication.getContext().getSystemService("audio");
        if (systemService instanceof AudioManager) {
            this.j = (AudioManager) systemService;
        }
        LogUtil.a("MusicController", "registerVolumeChangeReceiver");
        BroadcastManagerUtil.d(BaseApplication.getContext(), this.g, new IntentFilter(Constants.VOLUME_CHANGED_ACTION), LocalBroadcast.f36595c, null);
    }

    private void g() {
        synchronized (d) {
            if (e != null && this.s != null) {
                ArrayList arrayList = new ArrayList(16);
                for (MediaController mediaController : e) {
                    HealthMediaCallback healthMediaCallbackB = b(mediaController);
                    String packageName = mediaController.getPackageName();
                    arrayList.add(packageName);
                    if (mediaController != null && !d(mediaController)) {
                        this.h.put(packageName, mediaController.getSessionToken());
                        mediaController.registerCallback(healthMediaCallbackB, new Handler(Looper.getMainLooper()));
                        this.f.add(healthMediaCallbackB);
                        this.i.add(mediaController);
                    }
                }
                a(arrayList);
            }
        }
    }

    private boolean d(MediaController mediaController) {
        String packageName = mediaController.getPackageName();
        return this.h.containsKey(packageName) && this.h.get(packageName).equals(mediaController.getSessionToken());
    }

    private void a(List<String> list) {
        Iterator<Map.Entry<String, MediaSession.Token>> it = this.h.entrySet().iterator();
        while (it.hasNext()) {
            String key = it.next().getKey();
            if (!list.contains(key)) {
                LogUtil.j("MusicController", "deleteUselessPacakege, packageName：", key);
                it.remove();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l() {
        List<MediaController> list = this.i;
        if (list == null || this.f == null || list.size() != this.f.size()) {
            return;
        }
        LogUtil.a("MusicController", "unRegisterCallbackList enter mControllerList.size :", Integer.valueOf(this.i.size()));
        for (int i = 0; i < this.i.size(); i++) {
            c(this.i.get(i), this.f.get(i));
        }
        this.i.clear();
        this.f.clear();
        this.h.clear();
    }

    private void c(MediaController mediaController, MediaController.Callback callback) {
        if (mediaController == null || callback == null) {
            return;
        }
        try {
            mediaController.unregisterCallback(callback);
        } catch (SecurityException e2) {
            xjt.e("safeUnregisterCallback SecurityException");
            LogUtil.e("MusicController", "safeUnregisterCallback : " + ExceptionUtils.c(e2));
        }
    }

    private void d(String str) {
        boolean z;
        LogUtil.a("MusicController", "enter changeMediaSequence packageName", str);
        int i = 0;
        while (true) {
            if (i >= e.size()) {
                z = false;
                break;
            }
            if (e.get(i) != null) {
                LogUtil.a("MusicController", "PackageName: ", e.get(i).getPackageName());
                if (str.equals(e.get(i).getPackageName())) {
                    z = true;
                    break;
                }
            }
            i++;
        }
        if (i != 0 && z) {
            MediaController mediaController = e.get(i);
            if (this.s.getSessionToken().equals(mediaController.getSessionToken())) {
                return;
            }
            e.remove(mediaController);
            e.add(0, mediaController);
            LogUtil.a("MusicController", "replace");
        }
        LogUtil.a("MusicController", "changeMediaSequence activeSessionsChangedHandle");
        e(e);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j(List<MediaController> list) {
        PlaybackState playbackState;
        if (list == null || e == null || list.size() <= 1 || e.size() == 0 || list.size() > e.size()) {
            return;
        }
        MediaController mediaController = list.get(0);
        MediaController mediaController2 = e.get(0);
        if (mediaController == null || (playbackState = mediaController.getPlaybackState()) == null || playbackState.getState() != 3) {
            String packageName = mediaController2 != null ? mediaController2.getPackageName() : null;
            if (packageName == null) {
                return;
            }
            int i = -1;
            for (int i2 = 0; i2 < list.size(); i2++) {
                MediaController mediaController3 = list.get(i2);
                if (mediaController3 != null && mediaController3.getPackageName() != null && packageName.equals(mediaController3.getPackageName())) {
                    i = i2;
                }
            }
            if (i == 0 || i == -1) {
                return;
            }
            MediaController mediaController4 = list.get(i);
            LogUtil.a("MusicController", "keepPlayOrder replace :", Integer.valueOf(i));
            list.remove(mediaController4);
            list.add(0, mediaController4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h(List<MediaController> list) {
        PlaybackState playbackState;
        if (njy.e(list) || njy.e(e)) {
            ReleaseLogUtil.e("R_MusicController", "mediaList or sMediaControllerList is empty");
            return;
        }
        MediaController mediaController = list.get(0);
        boolean z = (mediaController == null || (playbackState = mediaController.getPlaybackState()) == null || playbackState.getState() != 3) ? false : true;
        LogUtil.a("MusicController", "OnActiveSessionsChangedListener isMusicActive", Boolean.valueOf(z));
        List<MediaController> list2 = e;
        int size = list2 != null ? list2.size() : 0;
        int size2 = list.size();
        if (z || size2 <= size) {
            return;
        }
        MediaController mediaController2 = list.get(size2 - 1);
        LogUtil.a("MusicController", "OnActiveSessionsChangedListener replace");
        list.remove(mediaController2);
        list.add(0, mediaController2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(List<MediaController> list) {
        if (list == null) {
            return;
        }
        g();
        for (MediaController mediaController : list) {
            if (mediaController != null) {
                LogUtil.a("MusicController", "package name: ", mediaController.getPackageName());
            }
        }
        LogUtil.a("MusicController", "onActiveSessionsChanged size:", Integer.valueOf(list.size()));
        if (this.s != null) {
            if (this.n == null) {
                return;
            }
            LogUtil.a("MusicController", "onActiveSessionsChanged mMediaController is not null");
            if (list.size() > 0) {
                d(list);
            } else {
                this.y = "";
                this.n.removeMessages(20);
                this.n.sendEmptyMessageDelayed(20, 120000L);
                d(true);
                ControlInterface.MusicChangeCallback musicChangeCallback = this.x;
                if (musicChangeCallback != null) {
                    musicChangeCallback.onMusicChanged();
                }
            }
        } else if (list.size() > 0) {
            ReleaseLogUtil.d("R_MusicController", "onActiveSessionsChanged mMediaController is null");
            f();
            MediaController mediaController2 = list.get(0);
            this.s = mediaController2;
            HealthMediaCallback healthMediaCallbackB = b(mediaController2);
            this.k = healthMediaCallbackB;
            this.s.registerCallback(healthMediaCallbackB, new Handler(Looper.getMainLooper()));
            this.y = this.s.getPackageName();
            LogUtil.a("MusicController", "onActiveSessionsChanged packagename:", list.get(0).getPackageName());
        } else {
            LogUtil.j("MusicController", "onActiveSessionsChanged mMediaController is null");
        }
        LogUtil.a("MusicController", "mIsMusicAppDied:", Boolean.valueOf(e()));
    }

    private void d(List<MediaController> list) {
        if (list == null) {
            return;
        }
        this.n.removeMessages(20);
        d(false);
        if (g(list)) {
            this.s.unregisterCallback(this.k);
            MediaController mediaController = list.get(0);
            this.s = mediaController;
            HealthMediaCallback healthMediaCallbackB = b(mediaController);
            this.k = healthMediaCallbackB;
            this.s.registerCallback(healthMediaCallbackB, new Handler(Looper.getMainLooper()));
            this.y = this.s.getPackageName();
            ReleaseLogUtil.d("R_MusicController", "changeMediaController.");
            ControlInterface.MusicChangeCallback musicChangeCallback = this.x;
            if (musicChangeCallback != null) {
                musicChangeCallback.onMusicChanged();
            }
        }
    }

    private boolean g(List<MediaController> list) {
        MediaController mediaController = list.get(0);
        if (mediaController == null) {
            return false;
        }
        if (!TextUtils.equals(this.y, mediaController.getPackageName())) {
            return true;
        }
        if (Build.VERSION.SDK_INT >= 30) {
            LogUtil.a("MusicController", "mMediaController.getTag(): ", this.s.getTag(), "; firstController.getTag(): ", mediaController.getTag());
            return !TextUtils.equals(this.s.getTag(), mediaController.getTag());
        }
        LogUtil.a("MusicController", "mMediaSessionPackageName = ", this.y, "; firstController.getPackageName() = ", mediaController.getPackageName());
        return b(list) > 1 && (TextUtils.equals(this.y, "com.huawei.music") || TextUtils.equals(this.y, "com.android.mediacenter")) && TextUtils.equals(this.y, mediaController.getPackageName());
    }

    private int b(List<MediaController> list) {
        int i = 0;
        for (MediaController mediaController : list) {
            if (TextUtils.equals(mediaController.getPackageName(), "com.huawei.music") || TextUtils.equals(mediaController.getPackageName(), "com.android.mediacenter")) {
                i++;
            }
        }
        LogUtil.a("MusicController", "countSameController = ", Integer.valueOf(i));
        return i;
    }

    @Override // defpackage.nbq, com.huawei.hwdevice.phoneprocess.mgr.musiccontrol.ControlInterface
    public MusicInfo getMusicInfo() {
        MusicInfo musicInfo = new MusicInfo();
        if (e()) {
            this.q = 0;
            LogUtil.a("MusicController", "getMusicInfo mIsMusicAppDied is STATE_STOPPED");
            musicInfo.setPlayState(1);
        } else {
            MediaController mediaController = this.s;
            if (mediaController != null) {
                try {
                    MediaMetadata metadata = mediaController.getMetadata();
                    MediaController.PlaybackInfo playbackInfo = this.s.getPlaybackInfo();
                    LogUtil.a("MusicController", "controller package: ", this.s.getPackageName());
                    c(musicInfo, metadata);
                    if (playbackInfo != null) {
                        musicInfo.setMaxVolume(playbackInfo.getMaxVolume());
                        musicInfo.setCurrentVolume(playbackInfo.getCurrentVolume());
                        if (Build.VERSION.SDK_INT >= 35 && this.j != null && playbackInfo.getCurrentVolume() == 0) {
                            try {
                                int streamVolume = this.j.getStreamVolume(3);
                                LogUtil.a("MusicController", "getStreamVolume currentVolume: ", Integer.valueOf(streamVolume));
                                musicInfo.setCurrentVolume(streamVolume);
                            } catch (RuntimeException e2) {
                                OpAnalyticsUtil.getInstance().setProbabilityProblemEvent("MusicController", "getStreamVolume RuntimeException :" + ExceptionUtils.c(e2));
                                LogUtil.a("MusicController", "getStreamVolume RuntimeException: ", ExceptionUtils.c(e2));
                            }
                        }
                    } else {
                        musicInfo.setMaxVolume(0);
                        musicInfo.setCurrentVolume(0);
                    }
                    PlaybackState playbackState = this.s.getPlaybackState();
                    if (playbackState != null) {
                        musicInfo.setPlayState(playbackState.getState());
                        ReleaseLogUtil.d("R_MusicController", "getMusicInfo getPlaybackState().getState: ", Integer.valueOf(playbackState.getState()));
                    } else {
                        musicInfo.setPlayState(0);
                        LogUtil.a("MusicController", "musicInfo.setPlayState(0): ", Integer.valueOf(musicInfo.getPlayState()));
                    }
                } catch (RuntimeException e3) {
                    OpAnalyticsUtil.getInstance().setProbabilityProblemEvent("MusicController", "getMusicInfo RuntimeException :" + ExceptionUtils.c(e3));
                    LogUtil.a("MusicController", "getMusicInfo RuntimeException: ", ExceptionUtils.c(e3));
                }
            } else {
                ReleaseLogUtil.e("R_MusicController", "getMusicInfo mMediaController is null");
            }
        }
        a(musicInfo);
        return musicInfo;
    }

    private void c(MusicInfo musicInfo, MediaMetadata mediaMetadata) {
        try {
            if (mediaMetadata != null) {
                MediaDescription description = mediaMetadata.getDescription();
                if (description != null) {
                    CharSequence subtitle = description.getSubtitle();
                    if (subtitle != null) {
                        LogUtil.a("MusicController", "setMusicInfo subTitle: ", subtitle);
                        musicInfo.setSingerName(subtitle.toString());
                    }
                    CharSequence title = description.getTitle();
                    if (title != null) {
                        LogUtil.a("MusicController", "setMusicInfo title: ", title);
                        musicInfo.setSongName(title.toString());
                        return;
                    }
                    return;
                }
                return;
            }
            musicInfo.setSingerName("");
            musicInfo.setSongName("");
        } catch (RuntimeException e2) {
            OpAnalyticsUtil.getInstance().setProbabilityProblemEvent("MusicController", "setMusicInfo RuntimeException :" + ExceptionUtils.c(e2));
            LogUtil.a("MusicController", "setMusicInfo RuntimeException: ", ExceptionUtils.c(e2));
        }
    }

    private void a(MusicInfo musicInfo) {
        if (musicInfo == null || this.s == null) {
            return;
        }
        LogUtil.a("MusicController", "correctStatus getPlayState()", Integer.valueOf(musicInfo.getPlayState()), "mAudioManager.isMusicActive()", Boolean.valueOf(this.j.isMusicActive()));
        this.q = musicInfo.getPlayState();
        if (e() && !this.j.isMusicActive()) {
            musicInfo.setPlayState(0);
            this.q = musicInfo.getPlayState();
            ReleaseLogUtil.d("R_MusicController", "isIsMusicAppDied,real setPlayState is STATE_NONE");
            return;
        }
        if (d(musicInfo, this.s) || musicInfo.getPlayState() == 1 || musicInfo.getPlayState() == 2 || musicInfo.getPlayState() == 3) {
            return;
        }
        if (!this.j.isMusicActive()) {
            LogUtil.a("MusicController", "correctStatus setPlayState is STATE_STOPPED");
            musicInfo.setPlayState(1);
            this.q = 1;
        } else if (musicInfo.getPlayState() == 0) {
            LogUtil.a("MusicController", "real setPlayState is STATE_NONE, set STATE_PAUSED");
            musicInfo.setPlayState(2);
            this.q = musicInfo.getPlayState();
        } else {
            LogUtil.a("MusicController", "correctStatus setPlayState is STATE_PLAYING");
            musicInfo.setPlayState(3);
            this.q = 3;
        }
    }

    private boolean d(MusicInfo musicInfo, MediaController mediaController) {
        return "cn.kuwo.player".equals(mediaController.getPackageName()) && musicInfo.getPlayState() == 0;
    }

    @Override // defpackage.nbq, com.huawei.hwdevice.phoneprocess.mgr.musiccontrol.ControlInterface
    public int getPlayState() {
        AudioManager audioManager = this.j;
        return (audioManager == null || !audioManager.isMusicActive()) ? -1 : 3;
    }

    @Override // defpackage.nbq, com.huawei.hwdevice.phoneprocess.mgr.musiccontrol.ControlInterface
    public void removeMusicUpdate() {
        this.n.removeMessages(30);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:57:0x00c1  */
    private void d() {
        String packageName = this.s.getPackageName();
        LogUtil.a("MusicController", "apply mediaController:", packageName, ",moduleTag:", this.v);
        if (packageName.isEmpty()) {
            LogUtil.a("MusicController", "MediaController getPackageName is null.");
        }
        packageName.hashCode();
        switch (packageName) {
            case "com.android.mediacenter":
            case "com.huawei.music":
                if (!TextUtils.isEmpty(this.v) && !this.v.equals(packageName)) {
                    LogUtil.a("MusicController", "unapplyForResourceUse moduleTag:", this.v);
                    PowerKitManager.a().a(this.v, 100, "user-musicController");
                }
                this.v = packageName;
                PowerKitManager.a().b(packageName, 100, "user-musicController");
                break;
            case "com.tencent.qqmusic":
            case "com.luna.music":
            case "app.podcast.cosmos":
            case "com.shinyv.cnr":
            case "com.kugou.android":
            case "com.ximalaya.ting.android":
            case "com.dragon.read":
            case "cn.kuwo.player":
            case "com.netease.cloudmusic":
            case "tv.danmaku.bili":
                if (!TextUtils.isEmpty(this.v) && !this.v.equals(packageName)) {
                    LogUtil.a("MusicController", "unapplyForResourceUse moduleTag:", this.v);
                    PowerKitManager.a().a(this.v, 65535, "user-musicController");
                }
                this.v = packageName;
                PowerKitManager.a().b(packageName, 65535, "user-musicController");
                break;
            default:
                LogUtil.a("MusicController", "apply");
                break;
        }
    }

    public void e(int i) {
        if (this.s == null) {
            LogUtil.a("MusicController", "play mMediaController is null.");
            return;
        }
        d();
        this.m = i;
        try {
            if (i == 1) {
                this.s.getTransportControls().prepare();
                this.s.getTransportControls().play();
            } else {
                if (i == 2) {
                    h();
                    return;
                }
                if (i == 3) {
                    this.s.getTransportControls().skipToPrevious();
                } else if (i == 4) {
                    this.s.getTransportControls().skipToNext();
                } else {
                    LogUtil.a("MusicController", "controllerMusicChange.");
                }
            }
        } catch (RuntimeException e2) {
            OpAnalyticsUtil.getInstance().setRiskWarningEvent("MusicController", "controllerMusicChange RuntimeException:" + ExceptionUtils.c(e2));
            ReleaseLogUtil.d("R_MusicController", "controllerMusicChange RuntimeException: ", ExceptionUtils.c(e2));
        }
    }

    private void h() {
        AudioManager audioManager = this.j;
        if (audioManager != null && audioManager.isMusicActive()) {
            ReleaseLogUtil.d("R_MusicController", "STATE_PLAYING -> STATE_PAUSED");
            this.s.getTransportControls().pause();
        } else {
            HandlerExecutor.a().postDelayed(new Runnable() { // from class: nbw
                @Override // java.lang.Runnable
                public final void run() {
                    this.e.b();
                }
            }, 2000L);
            ReleaseLogUtil.d("R_MusicController", "STATE_PAUSED Delay");
        }
    }

    /* synthetic */ void b() {
        MediaController mediaController = this.s;
        if (mediaController == null || this.m != 2) {
            return;
        }
        mediaController.getTransportControls().pause();
    }

    @Override // defpackage.nbq, com.huawei.hwdevice.phoneprocess.mgr.musiccontrol.ControlInterface
    public void controlVolume(boolean z) {
        try {
            MediaController mediaController = this.s;
            if (mediaController != null) {
                if (z) {
                    mediaController.adjustVolume(1, 1);
                    return;
                } else {
                    mediaController.adjustVolume(-1, 1);
                    return;
                }
            }
            LogUtil.a("MusicController", "ControlVolume mMediaController is null");
            AudioManager audioManager = this.j;
            if (audioManager != null) {
                if (z) {
                    audioManager.adjustStreamVolume(3, 1, 1);
                } else {
                    audioManager.adjustStreamVolume(3, -1, 1);
                }
                LogUtil.a("MusicController", "end raiseVoice");
            }
        } catch (RuntimeException e2) {
            OpAnalyticsUtil.getInstance().setRiskWarningEvent("MusicController", "controlVolume RuntimeException:" + ExceptionUtils.c(e2));
            ReleaseLogUtil.d("R_MusicController", "controlVolume RuntimeException: ", ExceptionUtils.c(e2));
        }
    }

    @Override // defpackage.nbq, com.huawei.hwdevice.phoneprocess.mgr.musiccontrol.ControlInterface
    public void setVolume(int i) {
        try {
            MediaController mediaController = this.s;
            if (mediaController != null) {
                mediaController.setVolumeTo(i, 1);
                ReleaseLogUtil.d("R_MusicController", "smMediaController setVolume = ", Integer.valueOf(i));
                return;
            }
            AudioManager audioManager = this.j;
            if (audioManager != null) {
                audioManager.setStreamVolume(3, i, 1);
                ReleaseLogUtil.d("R_MusicController", "end raiseVoice. volume = ", Integer.valueOf(i));
            }
        } catch (RuntimeException e2) {
            OpAnalyticsUtil.getInstance().setRiskWarningEvent("setVolume", "controlVolume RuntimeException:" + ExceptionUtils.c(e2));
            ReleaseLogUtil.d("R_MusicController", "setVolume RuntimeException: ", ExceptionUtils.c(e2));
        }
    }

    @Override // defpackage.nbq, com.huawei.hwdevice.phoneprocess.mgr.musiccontrol.ControlInterface
    public void registerMusicCallback(ControlInterface.MusicChangeCallback musicChangeCallback) {
        List<MediaController> activeSessions;
        LogUtil.a("MusicController", "enter registerMusicCallback");
        if (this.x == null) {
            MediaSessionManager mediaSessionManager = this.u;
            if (mediaSessionManager != null) {
                try {
                    activeSessions = mediaSessionManager.getActiveSessions(new ComponentName(BaseApplication.getContext().getPackageName(), "com.huawei.bone.ui.setting.NotificationPushListener"));
                } catch (SecurityException unused) {
                    LogUtil.e("MusicController", "SecurityException Missing permission to control media");
                    activeSessions = null;
                }
                i(activeSessions);
                if (activeSessions != null && activeSessions.size() > 0) {
                    f();
                    MediaController mediaController = activeSessions.get(0);
                    this.s = mediaController;
                    HealthMediaCallback healthMediaCallbackB = b(mediaController);
                    this.k = healthMediaCallbackB;
                    this.s.registerCallback(healthMediaCallbackB, new Handler(Looper.getMainLooper()));
                    this.y = this.s.getPackageName();
                }
                try {
                    this.u.removeOnActiveSessionsChangedListener(this.p);
                    this.u.addOnActiveSessionsChangedListener(this.p, new ComponentName(BaseApplication.getContext().getPackageName(), "com.huawei.bone.ui.setting.NotificationPushListener"), new Handler(Looper.getMainLooper()));
                } catch (SecurityException unused2) {
                    LogUtil.e("MusicController", "SecurityException Missing permission to control media");
                }
                if (this.p != null) {
                    LogUtil.a("MusicController", "init Sessions onActiveSessionsChanged");
                    this.p.onActiveSessionsChanged(activeSessions);
                }
            }
            try {
                BaseApplication.getContext().registerReceiver(this.g, new IntentFilter(Constants.VOLUME_CHANGED_ACTION));
            } catch (Exception e2) {
                LogUtil.e("MusicController", "Failed to register broadcast receiver:", ExceptionUtils.c(e2));
            }
            LogUtil.a("MusicController", "mMusicChangeCallback is null ,do registCallback");
        }
        this.x = musicChangeCallback;
        this.t = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i(List<MediaController> list) {
        if (list == null || list.size() < 1) {
            return;
        }
        f(list);
    }

    private void f(List<MediaController> list) {
        ArrayList arrayList = new ArrayList();
        for (MediaController mediaController : list) {
            if (mediaController != null) {
                String packageName = mediaController.getPackageName();
                if (this.o.contains(packageName)) {
                    ReleaseLogUtil.d("R_MusicController", "removeController packageName:" + packageName);
                    arrayList.add(mediaController);
                } else if (Build.VERSION.SDK_INT >= 30 && "com.dragon.read".equals(packageName) && "Audio".equals(mediaController.getTag())) {
                    ReleaseLogUtil.d("MusicController", "removeController  packageName:" + packageName, " tag:" + mediaController.getTag());
                    arrayList.add(mediaController);
                }
            }
        }
        if (njy.b(arrayList)) {
            ReleaseLogUtil.d("R_MusicController", "removeController size:" + arrayList.size());
            list.removeAll(arrayList);
        }
    }

    private void f() {
        MediaController mediaController = this.s;
        if (mediaController != null) {
            mediaController.unregisterCallback(this.k);
        }
    }

    @Override // defpackage.nbq, com.huawei.hwdevice.phoneprocess.mgr.musiccontrol.ControlInterface
    public void unRegisterMusicCallback() {
        MediaSessionManager.OnActiveSessionsChangedListener onActiveSessionsChangedListener;
        LogUtil.a("MusicController", "enter unRegisterMusicCallback");
        this.x = null;
        MediaController mediaController = this.s;
        if (mediaController != null) {
            mediaController.unregisterCallback(this.k);
        }
        l();
        MediaSessionManager mediaSessionManager = this.u;
        if (mediaSessionManager != null && (onActiveSessionsChangedListener = this.p) != null) {
            try {
                mediaSessionManager.removeOnActiveSessionsChangedListener(onActiveSessionsChangedListener);
            } catch (SecurityException unused) {
                LogUtil.e("MusicController", "SecurityException Missing permission to control media");
            }
        }
        if (this.f42851c != null) {
            LogUtil.a("MusicController", "lastStateMap clear");
            this.f42851c.clear();
        }
        this.t = null;
        try {
            BaseApplication.getContext().unregisterReceiver(this.g);
        } catch (Exception e2) {
            xjt.e("unRegisterMusicCallback fail");
            LogUtil.e("MusicController", "unregister broadcast ", ExceptionUtils.c(e2));
        }
        this.n.removeCallbacksAndMessages(null);
        LogUtil.a("MusicController", "end unRegisterMusicCallback");
    }
}
