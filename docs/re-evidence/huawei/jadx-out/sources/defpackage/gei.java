package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Looper;
import androidx.media3.common.AudioAttributes;
import androidx.media3.common.C;
import androidx.media3.common.MediaItem;
import androidx.media3.common.PlaybackException;
import androidx.media3.common.PlaybackParameters;
import androidx.media3.common.Player;
import androidx.media3.exoplayer.ExoPlayer;
import com.huawei.health.musicservice.api.IAudioPlayer;
import com.huawei.health.musicservice.utils.HealthEventLogger;
import com.huawei.hmf.annotation.ApiDefine;
import com.huawei.openalliance.ad.constant.ParamConstants;
import com.huawei.operation.utils.Constants;
import health.compact.a.BroadcastManagerUtil;
import health.compact.a.CommonUtil;
import health.compact.a.LocalBroadcast;
import health.compact.a.LogUtil;
import health.compact.a.ReleaseLogUtil;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;

/* JADX INFO: loaded from: classes7.dex */
@ApiDefine(uri = IAudioPlayer.class)
public class gei implements IAudioPlayer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private IAudioPlayer.AudioPlayerCallBack f34973a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private b f34974b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Context f34975c;
    private boolean e;
    private c f;
    private d g;
    private ExoPlayer h;
    private boolean i;
    private int j = 1;
    List<e> d = new ArrayList();

    static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f34983a;
        private List<gdy> e;

        public e(String str, List<gdy> list) {
            this.f34983a = str;
            this.e = list;
        }

        public List<gdy> e() {
            return this.e;
        }

        public String c() {
            return this.f34983a;
        }
    }

    private gei(Context context) {
        this.f34975c = context;
        b();
    }

    public static IAudioPlayer d(Context context) {
        return new gei(context);
    }

    private void b() {
        ReleaseLogUtil.c("R_AudioExoPlayer", "audio player init");
        ExoPlayer exoPlayerBuild = new ExoPlayer.Builder(this.f34975c).build();
        this.h = exoPlayerBuild;
        exoPlayerBuild.setAudioAttributes(e(), true);
        this.h.addListener(new a(this));
        this.h.addAnalyticsListener(new HealthEventLogger());
        this.f = new c(this);
        this.f34974b = new b(this);
        this.g = new d(this);
        c();
    }

    @Override // com.huawei.health.musicservice.api.IAudioPlayer
    public void setUsage(int i) {
        ReleaseLogUtil.c("R_AudioExoPlayer", "setUsage: " + i);
        this.j = i;
    }

    @Override // com.huawei.health.musicservice.api.IAudioPlayer
    public void setCallback(IAudioPlayer.AudioPlayerCallBack audioPlayerCallBack) {
        ReleaseLogUtil.c("R_AudioExoPlayer", "setCallback");
        this.f34973a = audioPlayerCallBack;
    }

    @Override // com.huawei.health.musicservice.api.IAudioPlayer
    public void autoStop(long j) {
        ReleaseLogUtil.c("R_AudioExoPlayer", "autoStop stopTime: ", Long.valueOf(j));
        get.c().d(false);
        this.f34974b.b(j);
    }

    @Override // com.huawei.health.musicservice.api.IAudioPlayer
    public void cancelAutoStop() {
        ReleaseLogUtil.c("R_AudioExoPlayer", "cancelAutoStop");
        this.f34974b.b();
    }

    @Override // com.huawei.health.musicservice.api.IAudioPlayer
    public void resetPlayList(List<gdy> list) {
        ReleaseLogUtil.c("R_AudioExoPlayer", "resetPlayList size:", Integer.valueOf(list.size()));
        List<MediaItem> list2 = (List) list.stream().map(new gek()).collect(Collectors.toList());
        if (this.h.getCurrentMediaItem() != null) {
            pause();
        }
        this.h.setMediaItems(list2);
        this.d.clear();
    }

    /* JADX INFO: renamed from: gei$3, reason: invalid class name */
    static /* synthetic */ class AnonymousClass3 {
        static final /* synthetic */ int[] d;

        static {
            int[] iArr = new int[IAudioPlayer.PlayMode.values().length];
            d = iArr;
            try {
                iArr[IAudioPlayer.PlayMode.PLAY_ONCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                d[IAudioPlayer.PlayMode.RANDOM_CIRCLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                d[IAudioPlayer.PlayMode.SEQUENCE_CIRCLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                d[IAudioPlayer.PlayMode.SEQUENCE_PLAY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    @Override // com.huawei.health.musicservice.api.IAudioPlayer
    public void setPlayMode(IAudioPlayer.PlayMode playMode) {
        ReleaseLogUtil.c("R_AudioExoPlayer", "setPlayMode:", playMode.toString());
        int i = AnonymousClass3.d[playMode.ordinal()];
        if (i == 1) {
            this.i = true;
            this.h.setRepeatMode(0);
            this.h.setShuffleModeEnabled(false);
            return;
        }
        if (i == 2) {
            this.i = false;
            this.h.setRepeatMode(2);
            this.h.setShuffleModeEnabled(true);
        } else if (i == 3) {
            this.i = false;
            this.h.setRepeatMode(2);
            this.h.setShuffleModeEnabled(false);
        } else {
            if (i == 4) {
                this.i = false;
                this.h.setRepeatMode(0);
                this.h.setShuffleModeEnabled(false);
                return;
            }
            ReleaseLogUtil.c("R_AudioExoPlayer", "invalid playMode");
        }
    }

    @Override // com.huawei.health.musicservice.api.IAudioPlayer
    public void setPlayList(List<gdy> list) {
        ReleaseLogUtil.c("R_AudioExoPlayer", "setPlayList, size: " + list.size());
        e(new e("SET", list));
    }

    @Override // com.huawei.health.musicservice.api.IAudioPlayer
    public void setPlaySpeed(float f) {
        ReleaseLogUtil.c("R_AudioExoPlayer", "setPlaySpeed:", Float.valueOf(f));
        this.h.setPlaybackParameters(new PlaybackParameters(f));
    }

    @Override // com.huawei.health.musicservice.api.IAudioPlayer
    public void addPlayList(List<gdy> list) {
        ReleaseLogUtil.c("R_AudioExoPlayer", "addPlayList, size: " + list.size());
        e(new e("ADD", list));
    }

    @Override // com.huawei.health.musicservice.api.IAudioPlayer
    public void removeItem(gdy gdyVar) {
        ReleaseLogUtil.c("R_AudioExoPlayer", "removeItem:", gdyVar.o());
        for (int i = 0; i < this.h.getMediaItemCount(); i++) {
            if (this.h.getMediaItemAt(i).mediaId.equals(gdyVar.h())) {
                this.h.removeMediaItem(i);
                return;
            }
        }
    }

    @Override // com.huawei.health.musicservice.api.IAudioPlayer
    public void play() {
        ReleaseLogUtil.c("R_AudioExoPlayer", "play:", d().o());
        if (this.h.getCurrentMediaItem() == null) {
            a();
        }
        if (this.h.getPlaybackState() == 1) {
            ReleaseLogUtil.c("R_AudioExoPlayer", ParamConstants.CallbackMethod.ON_PREPARE);
            this.e = false;
            e(IAudioPlayer.PlayStatus.BUFFERING, d());
            this.h.prepare();
        }
        if (this.h.getPlaybackState() == 4) {
            this.h.seekTo(0L);
        }
        this.h.play();
    }

    @Override // com.huawei.health.musicservice.api.IAudioPlayer
    public void play(int i) {
        ReleaseLogUtil.c("R_AudioExoPlayer", "play position:", Integer.valueOf(i));
        a();
        this.h.seekToDefaultPosition(i);
        play();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        ReleaseLogUtil.c("R_AudioExoPlayer", "handleLazyPlayList size: ", Integer.valueOf(this.d.size()));
        String str = (String) Optional.ofNullable(this.h.getCurrentMediaItem()).map(new Function() { // from class: gej
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((MediaItem) obj).mediaId;
            }
        }).orElse(null);
        for (int i = 0; i < this.d.size(); i++) {
            c(this.d.get(i));
        }
        int iA = a(str);
        if (iA != -1) {
            this.h.seekToDefaultPosition(iA);
        }
        this.d.clear();
    }

    private int a(String str) {
        for (int i = 0; i < this.h.getMediaItemCount(); i++) {
            if (this.h.getMediaItemAt(i).mediaId.equals(str)) {
                return i;
            }
        }
        return -1;
    }

    private void c(e eVar) {
        ReleaseLogUtil.c("R_AudioExoPlayer", "handleOperation type:", eVar.c(), "playList size:", Integer.valueOf(eVar.e().size()));
        List<MediaItem> list = (List) eVar.e().stream().map(new gek()).collect(Collectors.toList());
        if (eVar.c().equals("ADD")) {
            this.h.addMediaItems(list);
        } else if (!eVar.c().equals("SET")) {
            ReleaseLogUtil.c("R_AudioExoPlayer", "invalid operation");
        } else {
            this.h.setMediaItems(list);
        }
    }

    private void e(e eVar) {
        if (eVar.c().equals("SET")) {
            this.d.clear();
        }
        this.d.add(eVar);
    }

    @Override // com.huawei.health.musicservice.api.IAudioPlayer
    public void pause() {
        ReleaseLogUtil.c("R_AudioExoPlayer", "pause:", d().o());
        if (this.h.getPlaybackState() == 2) {
            this.f.d();
        }
        this.h.pause();
    }

    @Override // com.huawei.health.musicservice.api.IAudioPlayer
    public void playNext() {
        ReleaseLogUtil.c("R_AudioExoPlayer", "playNext now:", d().o());
        a();
        if (this.h.getMediaItemCount() == 0) {
            return;
        }
        if (this.h.hasNextMediaItem()) {
            this.h.seekToNextMediaItem();
        } else {
            this.h.seekToDefaultPosition(0);
        }
        play();
    }

    @Override // com.huawei.health.musicservice.api.IAudioPlayer
    public void playPrevious() {
        ReleaseLogUtil.c("R_AudioExoPlayer", "playPrevious now:", d().o());
        a();
        int mediaItemCount = this.h.getMediaItemCount();
        if (mediaItemCount == 0) {
            return;
        }
        if (this.h.hasPreviousMediaItem()) {
            this.h.seekToPreviousMediaItem();
        } else {
            this.h.seekToDefaultPosition(mediaItemCount - 1);
        }
        play();
    }

    @Override // com.huawei.health.musicservice.api.IAudioPlayer
    public void seekTo(int i) {
        ReleaseLogUtil.c("R_AudioExoPlayer", "seekTo targetPosition:", Integer.valueOf(i));
        long duration = this.h.getDuration();
        if (duration == C.TIME_UNSET) {
            ReleaseLogUtil.c("R_AudioExoPlayer", "duration unset");
            return;
        }
        long j = i;
        if (duration - j < 1000) {
            playNext();
        } else {
            this.h.seekTo(j);
        }
    }

    @Override // com.huawei.health.musicservice.api.IAudioPlayer
    public void setVolume(float f) {
        ReleaseLogUtil.c("R_AudioExoPlayer", "setVolume volume:", Float.valueOf(f));
        if (f < 0.0f || f > 1.0f) {
            ReleaseLogUtil.d("R_AudioExoPlayer", "wrong volume: " + f);
            return;
        }
        this.h.setVolume(f);
    }

    @Override // com.huawei.health.musicservice.api.IAudioPlayer
    public void stop() {
        ReleaseLogUtil.c("R_AudioExoPlayer", "stop:", d().o());
        this.h.stop();
        e(IAudioPlayer.PlayStatus.STOPPED, d());
    }

    @Override // com.huawei.health.musicservice.api.IAudioPlayer
    public void release() {
        this.h.release();
        this.f.a();
        this.f34974b.a();
        i();
        e(IAudioPlayer.PlayStatus.RELEASED, null);
        ReleaseLogUtil.c("R_AudioExoPlayer", "audio player released, can NOT be used again");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(IAudioPlayer.PlayStatus playStatus, gdy gdyVar) {
        StringBuilder sb = new StringBuilder("play state change to: ");
        sb.append(playStatus.toString());
        sb.append(", audioItem: ");
        sb.append(gdyVar == null ? Constants.NULL : gdyVar.o());
        ReleaseLogUtil.c("R_AudioExoPlayer", sb.toString());
        IAudioPlayer.AudioPlayerCallBack audioPlayerCallBack = this.f34973a;
        if (audioPlayerCallBack == null) {
            ReleaseLogUtil.d("R_AudioExoPlayer", "audioPlayCallback is null, no need to callback, please check.");
        } else {
            audioPlayerCallBack.e(playStatus, gdyVar);
        }
    }

    private AudioAttributes e() {
        return new AudioAttributes.Builder().setUsage(this.j).setContentType(2).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public gdy d() {
        return gdy.d(this.h.getCurrentMediaItem(), this.h.getCurrentPosition());
    }

    private void c() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("notification_play_or_pause_btn_clicked");
        intentFilter.addAction("notification_removed");
        BroadcastManagerUtil.d(this.f34975c, this.g, intentFilter, LocalBroadcast.f36595c, null);
    }

    private void i() {
        BroadcastManagerUtil.b(this.f34975c, this.g);
    }

    static class d extends BroadcastReceiver {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final WeakReference<gei> f34982b;

        public d(gei geiVar) {
            this.f34982b = new WeakReference<>(geiVar);
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            gei geiVar = this.f34982b.get();
            if (geiVar == null) {
                return;
            }
            if (intent.getAction().equals("notification_removed")) {
                ReleaseLogUtil.c("R_AudioExoPlayer", "notification removed, will stop player...");
                geiVar.stop();
            } else {
                if (intent.getAction().equals("notification_play_or_pause_btn_clicked")) {
                    if (geiVar.h.isPlaying()) {
                        ReleaseLogUtil.c("R_AudioExoPlayer", "notification button clicked, pausing...");
                        geiVar.pause();
                        return;
                    } else {
                        ReleaseLogUtil.c("R_AudioExoPlayer", "notification button clicked, resuming...");
                        geiVar.play();
                        return;
                    }
                }
                ReleaseLogUtil.b("R_AudioExoPlayer", "unknown event, this should NOT happen...");
            }
        }
    }

    static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Handler f34979a = new Handler(Looper.getMainLooper());

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final WeakReference<gei> f34980b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Runnable f34981c;
        private int d;
        private long e;

        public c(final gei geiVar) {
            this.f34980b = new WeakReference<>(geiVar);
            this.f34981c = new Runnable() { // from class: gei.c.4
                @Override // java.lang.Runnable
                public void run() {
                    gei geiVar2 = (gei) c.this.f34980b.get();
                    if (geiVar2 == null) {
                        return;
                    }
                    long duration = geiVar2.h.getDuration();
                    long currentPosition = geiVar.h.getCurrentPosition();
                    if (!geiVar2.e || !CommonUtil.ab(geiVar2.f34975c)) {
                        if (geiVar2.h.getPlaybackState() == 2 || geiVar2.e) {
                            geiVar2.e(IAudioPlayer.PlayStatus.BUFFERING, geiVar2.d());
                        } else {
                            c.this.c();
                        }
                    } else {
                        geiVar2.play();
                        c.this.c();
                    }
                    if (duration - currentPosition <= C.DEFAULT_MAX_SEEK_TO_PREVIOUS_POSITION_MS) {
                        c.this.f34979a.postDelayed(this, 100L);
                    } else {
                        c.this.f34979a.postDelayed(this, 1000L);
                    }
                }
            };
        }

        public void b() {
            ReleaseLogUtil.c("ProgressReporter", "startReport");
            Handler handler = this.f34979a;
            if (handler != null) {
                handler.removeCallbacks(this.f34981c);
                this.f34979a.post(this.f34981c);
            }
        }

        public void d() {
            ReleaseLogUtil.c("ProgressReporter", "stopReport");
            Handler handler = this.f34979a;
            if (handler != null) {
                handler.removeCallbacks(this.f34981c);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void c() {
            final gei geiVar = this.f34980b.get();
            if (geiVar == null) {
                return;
            }
            final long currentPosition = geiVar.h.getDuration() - geiVar.h.getCurrentPosition() > 500 ? geiVar.h.getCurrentPosition() : geiVar.h.getDuration();
            c(geiVar);
            Optional.ofNullable(geiVar.f34973a).ifPresent(new Consumer() { // from class: gel
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    IAudioPlayer.AudioPlayerCallBack audioPlayerCallBack = (IAudioPlayer.AudioPlayerCallBack) obj;
                    audioPlayerCallBack.onProgressChanged(geiVar.d(), currentPosition);
                }
            });
            ReleaseLogUtil.c("ProgressReporter", "progress: ", Long.valueOf(currentPosition), "/", Long.valueOf(geiVar.h.getDuration()), " MediaItem: ", geiVar.d().o());
        }

        private void c(gei geiVar) {
            long currentPosition = geiVar.h.getCurrentPosition();
            if (currentPosition == this.e && this.d < 1) {
                geiVar.h.seekTo(1 + currentPosition);
                this.d++;
            } else {
                this.d = 0;
            }
            this.e = currentPosition;
        }

        public void a() {
            d();
            this.f34979a = null;
            this.f34981c = null;
        }
    }

    static class b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final WeakReference<gei> f34978b;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Handler f34977a = new Handler(Looper.getMainLooper());
        private Runnable e = new Runnable() { // from class: gei.b.1
            @Override // java.lang.Runnable
            public void run() {
                ReleaseLogUtil.c("R_AudioScheduler", "has auto stopped");
                gei geiVar = (gei) b.this.f34978b.get();
                if (geiVar == null) {
                    return;
                }
                get.c().d(true);
                if (!geiVar.h.isPlaying()) {
                    geiVar.e(IAudioPlayer.PlayStatus.PAUSED, geiVar.d());
                }
                geiVar.pause();
            }
        };

        public b(gei geiVar) {
            this.f34978b = new WeakReference<>(geiVar);
        }

        public void b(long j) {
            Handler handler = this.f34977a;
            if (handler != null) {
                handler.removeCallbacks(this.e);
                this.f34977a.postDelayed(this.e, j);
            }
        }

        public void b() {
            Handler handler = this.f34977a;
            if (handler != null) {
                handler.removeCallbacks(this.e);
            }
        }

        public void a() {
            b();
            this.e = null;
            this.f34977a = null;
        }
    }

    static class a implements Player.Listener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f34976b = false;
        private final WeakReference<gei> d;
        private boolean e;

        public a(gei geiVar) {
            this.d = new WeakReference<>(geiVar);
        }

        @Override // androidx.media3.common.Player.Listener
        public void onMediaItemTransition(MediaItem mediaItem, int i) {
            ReleaseLogUtil.c("R_ExoPlayerListener", "onMediaItemTransition reason: ", Integer.valueOf(i));
            gei geiVar = this.d.get();
            if (geiVar == null) {
                return;
            }
            if ("generativeSleepMusic".equals(geiVar.d().c()) && i == 3) {
                this.f34976b = false;
                LogUtil.b("R_ExoPlayerListener", "onMediaItemTransition reason:3, isPlayed = false");
            }
            if (geiVar.i && i == 1) {
                geiVar.h.seekToPreviousMediaItem();
                geiVar.pause();
                this.e = true;
                geiVar.e(IAudioPlayer.PlayStatus.STOPPED, geiVar.d());
                return;
            }
            if (i == 1 || i == 0) {
                geiVar.e(IAudioPlayer.PlayStatus.SKIP_TO_NEXT, geiVar.d());
                geiVar.a();
            } else if (i == 2 && this.e) {
                this.e = false;
            } else if (i == 2) {
                geiVar.e(IAudioPlayer.PlayStatus.SKIP_TO_NEXT, geiVar.d());
            }
        }

        @Override // androidx.media3.common.Player.Listener
        public void onPlaybackStateChanged(int i) {
            gei geiVar = this.d.get();
            if (geiVar == null) {
                return;
            }
            if (i == 1) {
                ReleaseLogUtil.c("R_ExoPlayerListener", "onPlaybackStateChanged: idle");
                return;
            }
            if (i == 2) {
                ReleaseLogUtil.c("R_ExoPlayerListener", "onPlaybackStateChanged: buffering");
                return;
            }
            if (i == 3) {
                ReleaseLogUtil.c("R_ExoPlayerListener", "onPlaybackStateChanged: ready");
                return;
            }
            if (i != 4) {
                ReleaseLogUtil.c("R_ExoPlayerListener", "other state");
                return;
            }
            ReleaseLogUtil.c("R_ExoPlayerListener", "onPlaybackStateChanged: ended");
            int currentMediaItemIndex = geiVar.h.getCurrentMediaItemIndex();
            if (!geiVar.d.isEmpty()) {
                geiVar.a();
            }
            int i2 = currentMediaItemIndex + 1;
            if (geiVar.h.getMediaItemCount() > i2) {
                geiVar.h.seekToDefaultPosition(i2);
            } else {
                geiVar.e(IAudioPlayer.PlayStatus.STOPPED, geiVar.d());
            }
        }

        @Override // androidx.media3.common.Player.Listener
        public void onPlayWhenReadyChanged(boolean z, int i) {
            ReleaseLogUtil.c("R_ExoPlayerListener", "onPlayWhenReadyChanged:", Boolean.valueOf(z), " reason: ", Integer.valueOf(i));
        }

        @Override // androidx.media3.common.Player.Listener
        public void onIsPlayingChanged(boolean z) {
            gei geiVar = this.d.get();
            if (geiVar == null) {
                return;
            }
            ReleaseLogUtil.c("R_ExoPlayerListener", "onIsPlayingChanged isPlaying: ", Boolean.valueOf(z), " playbackSuppressionReason: ", Integer.valueOf(geiVar.h.getPlaybackSuppressionReason()));
            if (z) {
                this.f34976b = true;
                geiVar.f.b();
                geiVar.e(IAudioPlayer.PlayStatus.PLAYING, geiVar.d());
            }
            if (!z && geiVar.h.getPlaybackState() != 2 && !geiVar.e) {
                geiVar.f.d();
            }
            if (z || geiVar.h.getPlaybackState() != 3) {
                return;
            }
            geiVar.e(IAudioPlayer.PlayStatus.PAUSED, geiVar.d());
        }

        @Override // androidx.media3.common.Player.Listener
        public void onPlayerError(PlaybackException playbackException) {
            StringBuilder sb = new StringBuilder();
            sb.append("onPlayerError： \nerrorCode: ");
            sb.append(playbackException.errorCode);
            sb.append("\nerrorMessage: ");
            sb.append(playbackException.getMessage());
            sb.append("\nerrorCause: ");
            sb.append(playbackException.getCause());
            sb.append("\n");
            ReleaseLogUtil.b("R_ExoPlayerListener", sb);
            gei geiVar = this.d.get();
            if (geiVar == null) {
                return;
            }
            if (!this.f34976b && "generativeSleepMusic".equals(geiVar.d().c())) {
                geiVar.e(IAudioPlayer.PlayStatus.FAILED, geiVar.d());
                LogUtil.b("R_ExoPlayerListener", "onPlayerError isPlayer is false");
            } else if (playbackException.errorCode == 2001 || playbackException.errorCode == 2002) {
                geiVar.e = true;
                LogUtil.b("R_ExoPlayerListener", "isBufferingDueToNetwork = true");
            } else if ("generativeSleepMusic".equals(geiVar.d().c())) {
                geiVar.play();
            }
        }
    }
}
