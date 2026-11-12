package com.xiaomi.fitness.heartrate.camera;

import android.content.res.AssetFileDescriptor;
import android.media.AudioAttributes;
import android.media.MediaPlayer;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.view.SurfaceHolder;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.xiaomi.fitness.common.concurrent.ExecutorHelper;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.heartrate.camera.VideoPlayer;
import com.xiaomi.fitness.statistics.StatConstants;
import com.xiaomi.onetrack.OneTrack;
import com.xiaomi.wearable.hm.BroadcastsKt;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 22\u00020\u00012\u00020\u00022\u00020\u0003:\u000212B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u000fJ\u000e\u0010\u0018\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u000bJ\u0010\u0010\u001a\u001a\u00020\u00162\u0006\u0010\u001b\u001a\u00020\u0007H\u0016J\b\u0010\u001c\u001a\u00020\u0016H\u0002J$\u0010\u001d\u001a\u00020\u00162\b\u0010\u001e\u001a\u0004\u0018\u00010\u00132\b\u0010\u001f\u001a\u0004\u0018\u00010 2\b\u0010\f\u001a\u0004\u0018\u00010\rJ\u001a\u0010\u001d\u001a\u00020\u00162\u0006\u0010\u001f\u001a\u00020 2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0002J\"\u0010!\u001a\u00020\u00162\b\u0010\u001e\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010\u0019\u001a\u00020\u000bH\u0002J\u0006\u0010\"\u001a\u00020\u0016J\u0006\u0010#\u001a\u00020\u0016J\u0006\u0010$\u001a\u00020\u0016J\b\u0010%\u001a\u00020&H\u0002J\b\u0010'\u001a\u00020&H\u0002J\u000e\u0010(\u001a\u00020&2\u0006\u0010)\u001a\u00020&J \u0010,\u001a\u00020\u000b2\u0006\u0010\u001b\u001a\u00020\u00072\u0006\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u00020.H\u0016J\u0010\u00100\u001a\u00020\u00162\u0006\u0010\u001b\u001a\u00020\u0007H\u0016R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010*\u001a\u00020\u000b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b*\u0010+¨\u00063"}, d2 = {"Lcom/xiaomi/fitness/heartrate/camera/VideoPlayer;", "Landroid/media/MediaPlayer$OnErrorListener;", "Landroid/media/MediaPlayer$OnPreparedListener;", "Landroid/media/MediaPlayer$OnCompletionListener;", "<init>", "()V", "mMediaPlayer", "Landroid/media/MediaPlayer;", "mEventHandler", "Lcom/xiaomi/fitness/heartrate/camera/VideoPlayer$EventHandler;", "mIsInitialized", "", "fileName", "", "mPlayerEventListener", "Lcom/xiaomi/fitness/heartrate/camera/IPlayerEventListener;", "mIsFinished", "mIsPaused", "mSurfaceHolder", "Landroid/view/SurfaceHolder;", "mIsLoop", "setPlayerEventListener", "", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setLoop", "isLoop", "onPrepared", "mp", StatConstants.PARAM_START, OneTrack.Event.PLAY, "surfaceHolder", "afd", "Landroid/content/res/AssetFileDescriptor;", "setDataSourceImpl", "pause", BroadcastsKt.SILENT_PUSHING_STOP, "release", "duration", "", "position", "seekTo", "whereto", "isInitialized", "()Z", "onError", "what", "", "extra", "onCompletion", "EventHandler", "Companion", "heartrate_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class VideoPlayer implements MediaPlayer.OnErrorListener, MediaPlayer.OnPreparedListener, MediaPlayer.OnCompletionListener {
    private static final int EVENT_ERROR = 5;
    private static final int EVENT_FINISHED = 3;
    private static final int EVENT_INIT = 0;
    private static final int EVENT_PAUSED = 2;
    private static final int EVENT_PLAYED = 1;
    private static final int EVENT_PROGRESS = 4;
    private static final int EVENT_RESET = 6;
    private static final int EVENT_STOPPED = 7;

    @NotNull
    private static final String TAG = "VideoPlayer";

    @Nullable
    private String fileName;

    @NotNull
    private final EventHandler mEventHandler = new EventHandler(this, Looper.getMainLooper());
    private boolean mIsFinished;
    private boolean mIsInitialized;
    private boolean mIsLoop;
    private boolean mIsPaused;

    @Nullable
    private MediaPlayer mMediaPlayer;

    @Nullable
    private IPlayerEventListener mPlayerEventListener;

    @Nullable
    private SurfaceHolder mSurfaceHolder;

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/xiaomi/fitness/heartrate/camera/VideoPlayer$EventHandler;", "Landroid/os/Handler;", "mp", "Lcom/xiaomi/fitness/heartrate/camera/VideoPlayer;", "looper", "Landroid/os/Looper;", "<init>", "(Lcom/xiaomi/fitness/heartrate/camera/VideoPlayer;Landroid/os/Looper;)V", "mAudioPlayerRef", "Ljava/lang/ref/WeakReference;", "handleMessage", "", "msg", "Landroid/os/Message;", "heartrate_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class EventHandler extends Handler {

        @NotNull
        private final WeakReference<VideoPlayer> mAudioPlayerRef;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public EventHandler(@NotNull VideoPlayer mp, @Nullable Looper looper) {
            super(looper);
            Intrinsics.checkNotNullParameter(mp, "mp");
            Intrinsics.checkNotNull(looper);
            this.mAudioPlayerRef = new WeakReference<>(mp);
        }

        @Override // android.os.Handler
        public void handleMessage(@NotNull Message msg) {
            IPlayerEventListener iPlayerEventListener;
            Intrinsics.checkNotNullParameter(msg, "msg");
            super.handleMessage(msg);
            VideoPlayer videoPlayer = this.mAudioPlayerRef.get();
            if (videoPlayer == null || (iPlayerEventListener = videoPlayer.mPlayerEventListener) == null) {
                return;
            }
            String str = videoPlayer.fileName;
            switch (msg.what) {
                case 0:
                    iPlayerEventListener.onInit(str);
                    break;
                case 1:
                    iPlayerEventListener.onPlayed(str);
                    break;
                case 2:
                    iPlayerEventListener.onPaused(str);
                    break;
                case 3:
                    iPlayerEventListener.onFinished(str);
                    break;
                case 4:
                    iPlayerEventListener.onProgress(str, videoPlayer.position(), videoPlayer.duration());
                    break;
                case 5:
                    Object obj = msg.obj;
                    Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.String");
                    iPlayerEventListener.onError(str, (String) obj);
                    removeCallbacksAndMessages(null);
                    break;
                case 6:
                    Object obj2 = msg.obj;
                    Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.String");
                    iPlayerEventListener.onReset((String) obj2);
                    break;
                case 7:
                    Object obj3 = msg.obj;
                    Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type kotlin.String");
                    iPlayerEventListener.onStopped((String) obj3);
                    break;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long duration() {
        if (!isInitialized()) {
            return 0L;
        }
        MediaPlayer mediaPlayer = this.mMediaPlayer;
        Intrinsics.checkNotNull(mediaPlayer);
        return mediaPlayer.getDuration();
    }

    private final boolean isInitialized() {
        return this.mMediaPlayer != null && this.mIsInitialized;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void play$lambda$0(VideoPlayer this$0, AssetFileDescriptor afd) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(afd, "$afd");
        this$0.setDataSourceImpl(this$0.mSurfaceHolder, afd, this$0.mIsLoop);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long position() {
        if (this.mIsFinished) {
            return duration();
        }
        if (this.mMediaPlayer == null) {
            return 0L;
        }
        if (isInitialized()) {
            MediaPlayer mediaPlayer = this.mMediaPlayer;
            Intrinsics.checkNotNull(mediaPlayer);
            if (mediaPlayer.isPlaying()) {
                this.mEventHandler.sendEmptyMessageDelayed(4, 500L);
            }
        }
        MediaPlayer mediaPlayer2 = this.mMediaPlayer;
        Intrinsics.checkNotNull(mediaPlayer2);
        return mediaPlayer2.getCurrentPosition();
    }

    private final void setDataSourceImpl(SurfaceHolder surfaceHolder, AssetFileDescriptor afd, boolean isLoop) {
        MediaPlayer mediaPlayer = this.mMediaPlayer;
        if (mediaPlayer == null) {
            return;
        }
        Intrinsics.checkNotNull(mediaPlayer);
        mediaPlayer.reset();
        MediaPlayer mediaPlayer2 = this.mMediaPlayer;
        Intrinsics.checkNotNull(mediaPlayer2);
        mediaPlayer2.setOnPreparedListener(this);
        MediaPlayer mediaPlayer3 = this.mMediaPlayer;
        Intrinsics.checkNotNull(mediaPlayer3);
        mediaPlayer3.setOnCompletionListener(this);
        MediaPlayer mediaPlayer4 = this.mMediaPlayer;
        Intrinsics.checkNotNull(mediaPlayer4);
        mediaPlayer4.setOnErrorListener(this);
        try {
            AudioAttributes audioAttributesBuild = new AudioAttributes.Builder().setContentType(3).build();
            MediaPlayer mediaPlayer5 = this.mMediaPlayer;
            Intrinsics.checkNotNull(mediaPlayer5);
            mediaPlayer5.setDataSource(afd.getFileDescriptor(), afd.getStartOffset(), afd.getLength());
            MediaPlayer mediaPlayer6 = this.mMediaPlayer;
            Intrinsics.checkNotNull(mediaPlayer6);
            mediaPlayer6.setDisplay(surfaceHolder);
            MediaPlayer mediaPlayer7 = this.mMediaPlayer;
            Intrinsics.checkNotNull(mediaPlayer7);
            mediaPlayer7.setAudioAttributes(audioAttributesBuild);
            MediaPlayer mediaPlayer8 = this.mMediaPlayer;
            Intrinsics.checkNotNull(mediaPlayer8);
            mediaPlayer8.setLooping(isLoop);
            MediaPlayer mediaPlayer9 = this.mMediaPlayer;
            Intrinsics.checkNotNull(mediaPlayer9);
            mediaPlayer9.prepareAsync();
        } catch (Exception e) {
            Logger.e("VideoPlayer", "setDataSource error ", e);
            release();
        }
    }

    private final void start() {
        try {
            MediaPlayer mediaPlayer = this.mMediaPlayer;
            Intrinsics.checkNotNull(mediaPlayer);
            mediaPlayer.start();
            this.mIsPaused = false;
            this.mEventHandler.sendEmptyMessage(1);
            this.mEventHandler.sendEmptyMessage(4);
        } catch (IllegalStateException unused) {
        }
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public void onCompletion(@NotNull MediaPlayer mp) {
        Intrinsics.checkNotNullParameter(mp, "mp");
        this.mIsFinished = true;
        this.mEventHandler.removeMessages(4);
        this.mEventHandler.sendEmptyMessage(3);
    }

    @Override // android.media.MediaPlayer.OnErrorListener
    public boolean onError(@NotNull MediaPlayer mp, int what, int extra) {
        Intrinsics.checkNotNullParameter(mp, "mp");
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String str = String.format(Locale.US, "AudioPlayer Error what: %d, extra: %d, path:%s", Arrays.copyOf(new Object[]{Integer.valueOf(what), Integer.valueOf(extra), this.fileName}, 3));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        Logger.e("VideoPlayer", str);
        this.mIsInitialized = false;
        MediaPlayer mediaPlayer = this.mMediaPlayer;
        Intrinsics.checkNotNull(mediaPlayer);
        mediaPlayer.release();
        this.mMediaPlayer = null;
        this.mEventHandler.obtainMessage(5, str).sendToTarget();
        return false;
    }

    @Override // android.media.MediaPlayer.OnPreparedListener
    public void onPrepared(@NotNull MediaPlayer mp) {
        Intrinsics.checkNotNullParameter(mp, "mp");
        this.mIsInitialized = true;
        start();
    }

    public final void pause() {
        try {
            MediaPlayer mediaPlayer = this.mMediaPlayer;
            if (mediaPlayer != null) {
                Intrinsics.checkNotNull(mediaPlayer);
                mediaPlayer.pause();
                this.mIsPaused = true;
                this.mEventHandler.sendEmptyMessage(2);
            }
        } catch (IllegalStateException e) {
            Logger.e("VideoPlayer", "do pause ", e);
        }
    }

    public final void play(@Nullable SurfaceHolder surfaceHolder, @Nullable AssetFileDescriptor afd, @Nullable String fileName) {
        if (afd == null) {
            Logger.e("VideoPlayer", "source file is not exits");
            return;
        }
        if (this.mMediaPlayer == null) {
            this.mMediaPlayer = new MediaPlayer();
            this.mSurfaceHolder = surfaceHolder;
        }
        if (!TextUtils.equals(fileName, this.fileName)) {
            play(afd, fileName);
        } else if (this.mIsPaused) {
            start();
        }
    }

    public final void release() {
        MediaPlayer mediaPlayer = this.mMediaPlayer;
        if (mediaPlayer != null) {
            Intrinsics.checkNotNull(mediaPlayer);
            mediaPlayer.release();
            this.mMediaPlayer = null;
            this.mIsInitialized = false;
            this.fileName = null;
            this.mEventHandler.removeCallbacksAndMessages(null);
        }
    }

    public final long seekTo(long whereto) {
        try {
            MediaPlayer mediaPlayer = this.mMediaPlayer;
            if (mediaPlayer != null) {
                Intrinsics.checkNotNull(mediaPlayer);
                mediaPlayer.seekTo((int) whereto);
            }
        } catch (IllegalStateException e) {
            Logger.e("VideoPlayer", "do seekTo ", e);
        }
        return whereto;
    }

    public final void setLoop(boolean isLoop) {
        this.mIsLoop = isLoop;
    }

    public final void setPlayerEventListener(@Nullable IPlayerEventListener listener) {
        this.mPlayerEventListener = listener;
    }

    public final void stop() {
        try {
            if (this.mMediaPlayer == null || !isInitialized()) {
                return;
            }
            MediaPlayer mediaPlayer = this.mMediaPlayer;
            Intrinsics.checkNotNull(mediaPlayer);
            mediaPlayer.stop();
            this.mIsInitialized = false;
            this.mEventHandler.sendEmptyMessage(7);
            this.fileName = null;
        } catch (IllegalStateException e) {
            Logger.e("VideoPlayer", "do stop ", e);
        }
    }

    private final void play(final AssetFileDescriptor afd, String fileName) {
        this.fileName = fileName;
        this.mEventHandler.removeCallbacksAndMessages(null);
        this.mEventHandler.obtainMessage(0, this.fileName).sendToTarget();
        this.mIsFinished = false;
        ExecutorHelper.runInBackground(new Runnable() { // from class: frq
            @Override // java.lang.Runnable
            public final void run() {
                VideoPlayer.play$lambda$0(this.f18135a, afd);
            }
        });
    }
}
