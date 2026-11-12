package com.huawei.health.musicservice.api;

import android.app.PendingIntent;
import android.content.Intent;
import android.graphics.Bitmap;
import android.media.MediaMetadata;
import android.media.browse.MediaBrowser;
import android.media.session.MediaSession;
import android.media.session.PlaybackState;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.SystemClock;
import android.service.media.MediaBrowserService;
import android.support.v4.media.MediaMetadataCompat;
import android.text.TextUtils;
import com.huawei.haf.application.BaseApplication;
import com.huawei.haf.handler.ExtendHandler;
import com.huawei.haf.handler.HandlerCenter;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.huawei.operation.utils.Constants;
import defpackage.gdy;
import defpackage.geh;
import defpackage.gei;
import defpackage.gfj;
import health.compact.a.LogUtil;
import health.compact.a.ReleaseLogUtil;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class AudioService extends MediaBrowserService {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private geh f8507a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private IAudioPlayer f8508b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private MediaSession f8509c;
    private long d = 439;
    private boolean e;

    @Override // android.service.media.MediaBrowserService
    public MediaBrowserService.BrowserRoot onGetRoot(String str, int i, Bundle bundle) {
        LogUtil.b("R_AudioService", "onGetRoot packageName:", str);
        if (!str.equals(BaseApplication.d())) {
            LogUtil.d("R_AudioService", "wrong client, fail to bind to musicservice");
            return null;
        }
        return new MediaBrowserService.BrowserRoot("HuaweiHealth_AudioService", null);
    }

    @Override // android.service.media.MediaBrowserService
    public void onLoadChildren(String str, MediaBrowserService.Result<List<MediaBrowser.MediaItem>> result) {
        LogUtil.c("R_AudioService", "onLoadChildren");
    }

    @Override // android.service.media.MediaBrowserService, android.app.Service
    public void onCreate() {
        LogUtil.b("R_AudioService", "onCreate");
        super.onCreate();
        MediaSession mediaSession = new MediaSession(this, "R_AudioService");
        this.f8509c = mediaSession;
        mediaSession.setFlags(3);
        this.f8509c.setCallback(new d(this, null));
        IAudioPlayer iAudioPlayerD = gei.d(this);
        this.f8508b = iAudioPlayerD;
        iAudioPlayerD.setCallback(new e());
        setSessionToken(this.f8509c.getSessionToken());
        this.f8507a = new geh(this, this.f8509c.getSessionToken());
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        LogUtil.b("R_AudioService", "onStartCommand");
        return super.onStartCommand(intent, i, i2);
    }

    @Override // android.service.media.MediaBrowserService, android.app.Service
    public IBinder onBind(Intent intent) {
        LogUtil.b("R_AudioService", "onBind");
        return super.onBind(intent);
    }

    @Override // android.app.Service
    public void onRebind(Intent intent) {
        LogUtil.b("R_AudioService", "onRebind");
        super.onRebind(intent);
    }

    @Override // android.app.Service
    public boolean onUnbind(Intent intent) {
        LogUtil.b("R_AudioService", "onUnbind");
        return super.onUnbind(intent);
    }

    @Override // android.app.Service
    public void onDestroy() {
        LogUtil.b("R_AudioService", "onDestroy");
        this.f8508b.release();
        this.f8509c.release();
        stopForeground(true);
        super.onDestroy();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        if (this.e) {
            return;
        }
        this.e = true;
        this.f8509c.setActive(gfj.e());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        this.e = false;
        this.f8509c.setActive(false);
    }

    public class e implements IAudioPlayer.AudioPlayerCallBack {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private volatile gdy f8512b = new gdy();
        private long e = 0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f8511a = false;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final ExtendHandler f8513c = HandlerCenter.e("AudioMsgDelay");

        e() {
        }

        @Override // com.huawei.health.musicservice.api.IAudioPlayer.AudioPlayerCallBack
        /* JADX INFO: renamed from: onStatusChanged, reason: merged with bridge method [inline-methods] */
        public void e(final IAudioPlayer.PlayStatus playStatus, final gdy gdyVar) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            long j = jElapsedRealtime - this.e;
            String strO = Constants.NULL;
            if (j <= 50) {
                StringBuilder sb = new StringBuilder("calling too fast, delay to 50ms later, onStatusChanged: ");
                sb.append(playStatus);
                sb.append(", audioItem: ");
                if (gdyVar != null) {
                    strO = gdyVar.o();
                }
                sb.append(strO);
                LogUtil.b("R_AudioService", sb.toString());
                this.f8513c.postTask(new Runnable() { // from class: gef
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f34966a.e(playStatus, gdyVar);
                    }
                }, 50L);
            }
            this.e = jElapsedRealtime;
            StringBuilder sb2 = new StringBuilder("onStatusChanged: ");
            sb2.append(playStatus);
            sb2.append(", audioItem: ");
            if (gdyVar != null) {
                strO = gdyVar.o();
            }
            sb2.append(strO);
            LogUtil.b("R_AudioService", sb2.toString());
            AudioService.this.a();
            a(gdyVar);
            switch (AnonymousClass5.e[playStatus.ordinal()]) {
                case 1:
                    AudioService.this.f8509c.setPlaybackState(a(3, gdyVar));
                    AudioService.this.f8507a.d(gdyVar, true);
                    break;
                case 2:
                    AudioService.this.f8509c.setPlaybackState(a(2, gdyVar));
                    AudioService.this.f8507a.d(gdyVar, false);
                    break;
                case 3:
                case 4:
                    AudioService.this.f8507a.e();
                    AudioService.this.f8509c.setPlaybackState(a(1, gdyVar));
                    AudioService.this.stopSelf();
                    AudioService.this.stopForeground(true);
                    break;
                case 5:
                    AudioService.this.f8509c.setPlaybackState(a(10, gdyVar));
                    AudioService.this.f8507a.e();
                    break;
                case 6:
                    AudioService.this.f8509c.setPlaybackState(a(9, gdyVar));
                    AudioService.this.f8507a.e();
                    break;
                case 7:
                    AudioService.this.f8509c.setPlaybackState(a(11, gdyVar));
                    AudioService.this.f8507a.e();
                    break;
                case 8:
                    AudioService.this.f8509c.setPlaybackState(a(6, gdyVar));
                    break;
                case 9:
                    AudioService.this.e();
                    break;
                case 10:
                    AudioService.this.f8509c.setPlaybackState(a(7, gdyVar));
                    break;
                default:
                    LogUtil.e("R_AudioService", "undefined status: " + playStatus);
                    AudioService.this.f8507a.e();
                    break;
            }
        }

        @Override // com.huawei.health.musicservice.api.IAudioPlayer.AudioPlayerCallBack
        public void onProgressChanged(gdy gdyVar, long j) {
            a(gdyVar);
            PlaybackState.Builder builder = new PlaybackState.Builder();
            builder.setState(3, j, 1.0f);
            builder.setActions(AudioService.this.d);
            if (gdyVar != null) {
                Bundle bundle = new Bundle();
                bundle.putString("category", gdyVar.c());
                bundle.putString("mediaId", gdyVar.h());
                builder.setExtras(bundle);
            }
            AudioService.this.f8509c.setPlaybackState(builder.build());
        }

        private void a(gdy gdyVar) {
            boolean z;
            if (gdyVar == null) {
                return;
            }
            if (this.f8512b.equals(gdyVar)) {
                z = false;
            } else {
                LogUtil.b("R_AudioService", "audio changed, ", this.f8512b.o(), " -> ", gdyVar.o());
                this.f8512b = gdyVar;
                z = true;
            }
            if (z) {
                e(gdyVar);
                d(gdyVar);
            }
            try {
                Thread.sleep(50L);
            } catch (InterruptedException unused) {
                LogUtil.d("R_AudioService", "sleep interrupted...");
            }
            c(gdyVar, z);
        }

        private void d(gdy gdyVar) {
            if (TextUtils.isEmpty(gdyVar.e())) {
                LogUtil.e("R_AudioService", "audioItem don't have deeplink");
                return;
            }
            Intent intent = new Intent(CommonConstant.ACTION.HWID_SCHEME_URL, Uri.parse(gdyVar.e()));
            intent.setPackage("com.huawei.health");
            intent.setFlags(603979776);
            AudioService.this.f8507a.a(PendingIntent.getActivity(BaseApplication.b(), 0, intent, 67108864));
        }

        private void e(gdy gdyVar) {
            LogUtil.b("R_AudioService", "notify metadata without bitmap");
            this.f8512b = gdyVar;
            AudioService.this.f8507a.d(gdyVar, true);
            MediaMetadata.Builder builderPutString = new MediaMetadata.Builder().putString(MediaMetadataCompat.METADATA_KEY_TITLE, gdyVar.o()).putString(MediaMetadataCompat.METADATA_KEY_ARTIST, gdyVar.k()).putString(MediaMetadataCompat.METADATA_KEY_MEDIA_ID, gdyVar.h()).putString(MediaMetadataCompat.METADATA_KEY_GENRE, gdyVar.c());
            if (!"generativeSleepMusic".equals(gdyVar.c())) {
                builderPutString.putLong(MediaMetadataCompat.METADATA_KEY_DURATION, gdyVar.a() * 1000);
            }
            AudioService.this.f8509c.setMetadata(builderPutString.build());
        }

        private void c(final gdy gdyVar, boolean z) {
            if (z) {
                this.f8511a = false;
            }
            if (this.f8511a) {
                return;
            }
            LogUtil.b("R_AudioService", "notify metadata with bitmap");
            ThreadPoolManager.c().b("R_AudioService", new Runnable() { // from class: gec
                @Override // java.lang.Runnable
                public final void run() {
                    this.e.b(gdyVar);
                }
            });
        }

        public /* synthetic */ void b(gdy gdyVar) {
            final MediaMetadata.Builder builderPutString = new MediaMetadata.Builder().putString(MediaMetadataCompat.METADATA_KEY_TITLE, gdyVar.o()).putString(MediaMetadataCompat.METADATA_KEY_ARTIST, gdyVar.k()).putString(MediaMetadataCompat.METADATA_KEY_MEDIA_ID, gdyVar.h()).putString(MediaMetadataCompat.METADATA_KEY_DISPLAY_ICON_URI, TextUtils.isEmpty(gdyVar.g()) ? "null_icon_uri" : gdyVar.g()).putString(MediaMetadataCompat.METADATA_KEY_GENRE, gdyVar.c());
            if (!"generativeSleepMusic".equals(gdyVar.c())) {
                builderPutString.putLong(MediaMetadataCompat.METADATA_KEY_DURATION, gdyVar.a() * 1000);
            }
            Bitmap bitmapE = gfj.e(gdyVar.g());
            if (bitmapE == null) {
                this.f8511a = false;
                ReleaseLogUtil.c("R_AudioService", "query icon bitmap failed, will try when next status comes...");
            } else {
                this.f8511a = true;
                builderPutString.putBitmap(MediaMetadataCompat.METADATA_KEY_ALBUM_ART, bitmapE);
            }
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: geg
                @Override // java.lang.Runnable
                public final void run() {
                    this.d.c(builderPutString);
                }
            });
        }

        public /* synthetic */ void c(MediaMetadata.Builder builder) {
            AudioService.this.f8509c.setMetadata(builder.build());
        }

        private PlaybackState a(int i, gdy gdyVar) {
            PlaybackState.Builder builder = new PlaybackState.Builder();
            long jF = 0;
            if (gdyVar != null) {
                if (i != 1 && i != 0) {
                    jF = gdyVar.f();
                }
                Bundle bundle = new Bundle();
                bundle.putString("category", gdyVar.c());
                bundle.putString("mediaId", gdyVar.h());
                builder.setExtras(bundle);
            }
            LogUtil.c("R_AudioService", "createPlaybackState, state: " + i + ", position: " + jF);
            builder.setState(i, jF, 1.0f);
            builder.setActions(AudioService.this.d);
            return builder.build();
        }
    }

    /* JADX INFO: renamed from: com.huawei.health.musicservice.api.AudioService$5, reason: invalid class name */
    static /* synthetic */ class AnonymousClass5 {
        static final /* synthetic */ int[] e;

        static {
            int[] iArr = new int[IAudioPlayer.PlayStatus.values().length];
            e = iArr;
            try {
                iArr[IAudioPlayer.PlayStatus.PLAYING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                e[IAudioPlayer.PlayStatus.PAUSED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                e[IAudioPlayer.PlayStatus.STOPPED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                e[IAudioPlayer.PlayStatus.RELEASED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                e[IAudioPlayer.PlayStatus.SKIP_TO_NEXT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                e[IAudioPlayer.PlayStatus.SKIP_TO_PREV.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                e[IAudioPlayer.PlayStatus.SKIP_TO_INDEX.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                e[IAudioPlayer.PlayStatus.BUFFERING.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                e[IAudioPlayer.PlayStatus.FOCUS_LOSS.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                e[IAudioPlayer.PlayStatus.FAILED.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    class d extends MediaSession.Callback {
        private d() {
        }

        /* synthetic */ d(AudioService audioService, AnonymousClass5 anonymousClass5) {
            this();
        }

        @Override // android.media.session.MediaSession.Callback
        public void onPlay() {
            LogUtil.b("R_AudioService", "receive command, play");
            AudioService.this.f8508b.play();
        }

        @Override // android.media.session.MediaSession.Callback
        public void onPause() {
            LogUtil.b("R_AudioService", "receive command, pause");
            AudioService.this.f8508b.pause();
        }

        @Override // android.media.session.MediaSession.Callback
        public void onSkipToNext() {
            LogUtil.b("R_AudioService", "receive command, skipToNext");
            AudioService.this.f8508b.playNext();
        }

        @Override // android.media.session.MediaSession.Callback
        public void onSkipToPrevious() {
            LogUtil.b("R_AudioService", "receive command, skipToPrevious");
            AudioService.this.f8508b.playPrevious();
        }

        @Override // android.media.session.MediaSession.Callback
        public void onStop() {
            LogUtil.b("R_AudioService", "receive command, stop");
            AudioService.this.e();
            AudioService.this.f8508b.stop();
        }

        @Override // android.media.session.MediaSession.Callback
        public void onSeekTo(long j) {
            LogUtil.b("R_AudioService", "receive command, seek to " + j);
            AudioService.this.f8508b.seekTo((int) j);
        }

        @Override // android.media.session.MediaSession.Callback
        public void onSkipToQueueItem(long j) {
            LogUtil.b("R_AudioService", "receive command, skip to " + j);
            AudioService.this.f8508b.play((int) j);
        }

        @Override // android.media.session.MediaSession.Callback
        public void onCustomAction(String str, Bundle bundle) {
            LogUtil.b("R_AudioService", "receive command, custom action: " + str);
            if (bundle == null) {
                LogUtil.d("R_AudioService", "bundle extra is null");
            } else {
                c(str, bundle);
            }
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code duplicated, block: B:25:0x0046  */
        private void c(String str, Bundle bundle) {
            byte b2;
            str.hashCode();
            switch (str) {
                case "audio_notification":
                    b2 = 0;
                    break;
                case "audio_usage":
                    b2 = 1;
                    break;
                case "audio_add_play_list":
                    b2 = 2;
                    break;
                case "audio_play_mode":
                    b2 = 3;
                    break;
                case "audio_set_play_list":
                    b2 = 4;
                    break;
                default:
                    b2 = -1;
                    break;
            }
            if (b2 == 0) {
                PendingIntent pendingIntent = (PendingIntent) bundle.getParcelable(IAudioPlayer.ParameterKeys.AUDIO_NOTIFICATION);
                if (pendingIntent != null) {
                    AudioService.this.f8507a.a(pendingIntent);
                    return;
                } else {
                    LogUtil.d("R_AudioService", "get PendingIntent from bundle extra is null");
                    AudioService.this.f8507a.a((PendingIntent) null);
                    return;
                }
            }
            if (b2 == 1) {
                AudioService.this.f8508b.setUsage(bundle.getInt(IAudioPlayer.ParameterKeys.AUDIO_USAGE));
                return;
            }
            if (b2 == 2) {
                Serializable serializable = bundle.getSerializable(IAudioPlayer.ParameterKeys.AUDIO_ADD_PLAY_LIST);
                if (b(serializable)) {
                    AudioService.this.f8508b.addPlayList((ArrayList) serializable);
                    return;
                } else {
                    LogUtil.d("R_AudioService", "add play list failed");
                    return;
                }
            }
            if (b2 == 3) {
                AudioService.this.f8508b.setPlayMode(IAudioPlayer.PlayMode.valueOf(bundle.getString(IAudioPlayer.ParameterKeys.AUDIO_PLAY_MODE)));
            } else {
                if (b2 != 4) {
                    d(str, bundle);
                    return;
                }
                Serializable serializable2 = bundle.getSerializable(IAudioPlayer.ParameterKeys.AUDIO_SET_PLAY_LIST);
                if (b(serializable2)) {
                    AudioService.this.f8508b.setPlayList((ArrayList) serializable2);
                } else {
                    LogUtil.d("R_AudioService", "set play list failed");
                }
            }
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code duplicated, block: B:33:0x0059  */
        private void d(String str, Bundle bundle) {
            str.hashCode();
            switch (str) {
                case "audio_play_speed":
                    AudioService.this.f8508b.setPlaySpeed(bundle.getFloat(IAudioPlayer.ParameterKeys.AUDIO_PLAY_SPEED));
                    break;
                case "audio_media_button_receiver":
                    Serializable serializable = bundle.getSerializable(IAudioPlayer.ParameterKeys.AUDIO_MEDIA_BUTTON_RECEIVER);
                    if (serializable instanceof Class) {
                        AudioService.this.f8509c.setMediaButtonReceiver(PendingIntent.getBroadcast(AudioService.this, 0, new Intent(AudioService.this, (Class<?>) serializable), 67108864));
                        break;
                    }
                    break;
                case "audio_cancel_auto_stop":
                    AudioService.this.f8508b.cancelAutoStop();
                    break;
                case "audio_auto_stop":
                    AudioService.this.f8508b.autoStop(bundle.getLong(IAudioPlayer.ParameterKeys.AUDIO_AUTO_STOP));
                    break;
                case "audio_reset_play_list":
                    Serializable serializable2 = bundle.getSerializable(IAudioPlayer.ParameterKeys.AUDIO_RESET_PLAY_LIST);
                    if (b(serializable2)) {
                        AudioService.this.f8508b.resetPlayList((ArrayList) serializable2);
                        break;
                    } else {
                        LogUtil.d("R_AudioService", "set play list failed");
                        break;
                    }
                    break;
                case "audio_support_actions":
                    AudioService.this.d = bundle.getLong(IAudioPlayer.ParameterKeys.AUDIO_SUPPORT_ACTIONS);
                    break;
                case "audio_delete_item":
                    Serializable serializable3 = bundle.getSerializable(IAudioPlayer.ParameterKeys.AUDIO_DELETE_ITEM);
                    if (serializable3 instanceof gdy) {
                        AudioService.this.f8508b.removeItem((gdy) serializable3);
                        break;
                    } else {
                        LogUtil.d("R_AudioService", "remove item failed");
                        break;
                    }
                    break;
                default:
                    LogUtil.e("R_AudioService", "undefined action: " + str);
                    break;
            }
        }

        private boolean b(Object obj) {
            if (!(obj instanceof ArrayList)) {
                LogUtil.e("R_AudioService", "listCheck failed, input is not ArrayList");
                return false;
            }
            ArrayList arrayList = (ArrayList) obj;
            if (arrayList.isEmpty()) {
                LogUtil.e("R_AudioService", "listCheck failed, list is empty");
                return false;
            }
            if (arrayList.get(0) instanceof gdy) {
                return true;
            }
            LogUtil.e("R_AudioService", "listCheck failed, list is empty");
            return false;
        }

        @Override // android.media.session.MediaSession.Callback
        public boolean onMediaButtonEvent(Intent intent) {
            if (!gfj.e()) {
                LogUtil.b("R_AudioService", "receive media button event, but not in media center, do nothing...");
                return true;
            }
            return super.onMediaButtonEvent(intent);
        }
    }
}
