package com.huami.devicerecorder.player;

import android.content.res.AssetFileDescriptor;
import android.media.AudioAttributes;
import android.media.MediaPlayer;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.devicerecorder.player.HMMusicPlayer;
import com.huami.devicerecorder.player.HMMusicPlayer.k;
import com.huami.tools.log.HMLog;
import com.huami.watch.companion.mediac.Command;
import java.io.FileNotFoundException;
import java.util.Timer;
import java.util.TimerTask;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.concurrent.TimersKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 /2\u00020\u0001:\u0001/B\u0007¢\u0006\u0004\b-\u0010.J\u0014\u0010\u0006\u001a\u00020\u00052\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003H\u0002J\b\u0010\u0004\u001a\u00020\u0005H\u0002J\b\u0010\b\u001a\u00020\u0007H\u0002J\u001b\u0010\u000b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\rH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\u000fJ\u0013\u0010\u0010\u001a\u00020\u0007H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u0013\u0010\u0012\u001a\u00020\u0007H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0011J\u001b\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u0013H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\u0013\u0010\u0017\u001a\u00020\u0007H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0011J\u0010\u0010\u001a\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u0018H\u0016J\b\u0010\u001b\u001a\u00020\u0005H\u0016R\u001d\u0010!\u001a\u00020\u001c8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010\"R\u0016\u0010%\u001a\u00020#8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010$R\u0018\u0010)\u001a\u0004\u0018\u00010&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(R\u0016\u0010,\u001a\u00020*8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010+\u0082\u0002\u0004\n\u0002\b\u0019¨\u00060"}, d2 = {"Lcom/huami/devicerecorder/player/HMMusicPlayer;", "Lcom/huami/devicerecorder/player/IPlayer;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "e", "", "c", "", "f", "", "path", "play", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroid/content/res/AssetFileDescriptor;", "fileDesc", "(Landroid/content/res/AssetFileDescriptor;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "pause", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", Command.RESUME, "", "position", "setPosition", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", Command.STOP, "Lcom/huami/devicerecorder/player/IPlayer$IPlayerCallback;", "callback", "setCallback", "release", "Landroid/media/MediaPlayer;", "a", "Lkotlin/Lazy;", "b", "()Landroid/media/MediaPlayer;", "player", "Lcom/huami/devicerecorder/player/IPlayer$IPlayerCallback;", "Landroid/media/MediaPlayer$OnCompletionListener;", "Landroid/media/MediaPlayer$OnCompletionListener;", "onCompleteListener", "Ljava/util/Timer;", GoogleApiAvailabilityLight.a, "Ljava/util/Timer;", "positionTimer", "Landroid/os/Handler;", "Landroid/os/Handler;", "uiHandler", "<init>", "()V", "Companion", "device-recorder_release"}, k = 1, mv = {1, 5, 1})
public final class HMMusicPlayer implements IPlayer {

    @NotNull
    private static final String f = "RecordPlayer";

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    private IPlayer.IPlayerCallback callback;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    private Timer positionTimer;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Lazy player = LazyKt__LazyJVMKt.lazy(new f());

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final MediaPlayer.OnCompletionListener onCompleteListener = new MediaPlayer.OnCompletionListener() { // from class: xa3
        @Override // android.media.MediaPlayer.OnCompletionListener
        public final void onCompletion(MediaPlayer mediaPlayer) {
            HMMusicPlayer.d(this.a, mediaPlayer);
        }
    };

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final Handler uiHandler = new Handler(Looper.getMainLooper());

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ Exception a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Exception exc) {
            super(0);
            this.a = exc;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "play record filed failed: " + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public final /* synthetic */ IllegalStateException a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(IllegalStateException illegalStateException) {
            super(0);
            this.a = illegalStateException;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "pause error: " + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<String> {
        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "pause failed as player is playing: " + HMMusicPlayer.this.b().isPlaying();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<String> {
        public final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str) {
            super(0);
            this.a = str;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "play path: " + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function0<String> {
        public final /* synthetic */ AssetFileDescriptor a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(AssetFileDescriptor assetFileDescriptor) {
            super(0);
            this.a = assetFileDescriptor;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "play asset file: " + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Landroid/media/MediaPlayer;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class f extends Lambda implements Function0<MediaPlayer> {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function0<String> {
            public final /* synthetic */ int a;
            public final /* synthetic */ int b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(int i, int i2) {
                super(0);
                this.a = i;
                this.b = i2;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return "media player error: " + this.a + " and extra: " + this.b;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class b extends Lambda implements Function0<String> {
            public final /* synthetic */ IllegalArgumentException a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(IllegalArgumentException illegalArgumentException) {
                super(0);
                this.a = illegalArgumentException;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return "setAudioAttributes error: " + this.a;
            }
        }

        public f() {
            super(0);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean c(HMMusicPlayer hMMusicPlayer, MediaPlayer mediaPlayer, MediaPlayer mediaPlayer2, int i, int i2) {
            Timer timer = hMMusicPlayer.positionTimer;
            if (timer != null) {
                timer.cancel();
            }
            mediaPlayer.reset();
            HMLog.info(HMMusicPlayer.f, new a(i, i2));
            IPlayer.IPlayerCallback iPlayerCallback = hMMusicPlayer.callback;
            if (iPlayerCallback == null) {
                return false;
            }
            iPlayerCallback.onStatusChanged(IPlayer.PlayerStatus.STATUS_ERROR);
            return false;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final MediaPlayer invoke() {
            final MediaPlayer mediaPlayer = new MediaPlayer();
            final HMMusicPlayer hMMusicPlayer = HMMusicPlayer.this;
            mediaPlayer.setOnErrorListener(new MediaPlayer.OnErrorListener() { // from class: com.huami.devicerecorder.player.a
                @Override // android.media.MediaPlayer.OnErrorListener
                public final boolean onError(MediaPlayer mediaPlayer2, int i, int i2) {
                    return HMMusicPlayer.f.c(hMMusicPlayer, mediaPlayer, mediaPlayer2, i, i2);
                }
            });
            try {
                mediaPlayer.setAudioAttributes(new AudioAttributes.Builder().setLegacyStreamType(3).build());
            } catch (IllegalArgumentException e) {
                HMLog.info(HMMusicPlayer.f, new b(e));
            }
            mediaPlayer.setOnCompletionListener(HMMusicPlayer.this.onCompleteListener);
            return mediaPlayer;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class g extends Lambda implements Function0<String> {
        public final /* synthetic */ Exception a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(Exception exc) {
            super(0);
            this.a = exc;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "release player failed: " + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class h extends Lambda implements Function0<String> {
        public final /* synthetic */ IllegalStateException a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(IllegalStateException illegalStateException) {
            super(0);
            this.a = illegalStateException;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "player resume failed: " + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class i extends Lambda implements Function0<String> {
        public final /* synthetic */ IllegalStateException a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(IllegalStateException illegalStateException) {
            super(0);
            this.a = illegalStateException;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "player failed: " + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class j extends Lambda implements Function0<String> {
        public j() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "stop failed as is playing: " + HMMusicPlayer.this.b().isPlaying();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class k implements Runnable {
        public k() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            HMMusicPlayer.this.f();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class l extends Lambda implements Function0<String> {
        public final /* synthetic */ IllegalStateException a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(IllegalStateException illegalStateException) {
            super(0);
            this.a = illegalStateException;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "player failed: " + this.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final MediaPlayer b() {
        return (MediaPlayer) this.player.getValue();
    }

    private final void c(Exception e2) {
        HMLog.info(f, new a(e2));
        if (e2 instanceof FileNotFoundException) {
            IPlayer.IPlayerCallback iPlayerCallback = this.callback;
            if (iPlayerCallback == null) {
                return;
            }
            iPlayerCallback.onStatusChanged(IPlayer.PlayerStatus.STATUS_FILE_NOT_EXIST);
            return;
        }
        IPlayer.IPlayerCallback iPlayerCallback2 = this.callback;
        if (iPlayerCallback2 == null) {
            return;
        }
        iPlayerCallback2.onStatusChanged(IPlayer.PlayerStatus.STATUS_ERROR);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(HMMusicPlayer hMMusicPlayer, MediaPlayer mediaPlayer) {
        Timer timer = hMMusicPlayer.positionTimer;
        if (timer != null) {
            timer.cancel();
        }
        hMMusicPlayer.positionTimer = null;
        hMMusicPlayer.f();
        IPlayer.IPlayerCallback iPlayerCallback = hMMusicPlayer.callback;
        if (iPlayerCallback == null) {
            return;
        }
        iPlayerCallback.onStatusChanged(IPlayer.PlayerStatus.STATUS_COMPLETE);
    }

    private final void e() {
        Timer timer = this.positionTimer;
        if (timer != null) {
            timer.cancel();
        }
        Timer timer2 = TimersKt.timer("timer", false);
        timer2.scheduleAtFixedRate(new TimerTask() { // from class: com.huami.devicerecorder.player.HMMusicPlayer$startUpdatePosition$$inlined$fixedRateTimer$1
            @Override // java.util.TimerTask, java.lang.Runnable
            public void run() {
                this.a.uiHandler.post(this.a.new k());
            }
        }, 0L, 1000L);
        this.positionTimer = timer2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean f() {
        int currentPosition = b().getCurrentPosition();
        int duration = b().getDuration();
        IPlayer.IPlayerCallback iPlayerCallback = this.callback;
        if (iPlayerCallback == null) {
            return true;
        }
        iPlayerCallback.onPositionChanged(currentPosition, duration);
        return true;
    }

    @Override // com.huami.devicerecorder.player.IPlayer
    @Nullable
    public Object pause(@NotNull Continuation<? super Boolean> continuation) {
        boolean z = true;
        if (!b().isPlaying()) {
            HMLog.info(f, new c());
            Timer timer = this.positionTimer;
            if (timer != null) {
                timer.cancel();
            }
            return Boxing.boxBoolean(true);
        }
        try {
            b().pause();
            Timer timer2 = this.positionTimer;
            if (timer2 != null) {
                timer2.cancel();
            }
        } catch (IllegalStateException e2) {
            HMLog.info(f, new b(e2));
            z = false;
        }
        return Boxing.boxBoolean(z);
    }

    @Override // com.huami.devicerecorder.player.IPlayer
    @Nullable
    public Object play(@NotNull String str, @NotNull Continuation<? super Boolean> continuation) {
        boolean z;
        Boolean boolBoxBoolean;
        HMLog.info(f, new d(str));
        synchronized (this) {
            try {
                Timer timer = this.positionTimer;
                if (timer != null) {
                    timer.cancel();
                }
                b().reset();
                b().setDataSource(str);
                b().prepare();
                b().start();
                e();
                z = true;
            } catch (Exception e2) {
                c(e2);
                z = false;
            }
            boolBoxBoolean = Boxing.boxBoolean(z);
        }
        return boolBoxBoolean;
    }

    @Override // com.huami.devicerecorder.player.IPlayer
    public void release() {
        try {
            Timer timer = this.positionTimer;
            if (timer != null) {
                timer.cancel();
            }
            this.positionTimer = null;
            this.uiHandler.removeCallbacksAndMessages(null);
            if (b().isPlaying()) {
                b().stop();
            }
            b().release();
        } catch (Exception e2) {
            HMLog.info(f, new g(e2));
        }
    }

    @Override // com.huami.devicerecorder.player.IPlayer
    @Nullable
    public Object resume(@NotNull Continuation<? super Boolean> continuation) {
        boolean z;
        try {
            b().start();
            e();
            z = true;
        } catch (IllegalStateException e2) {
            HMLog.info(f, new h(e2));
            z = false;
        }
        return Boxing.boxBoolean(z);
    }

    @Override // com.huami.devicerecorder.player.IPlayer
    public void setCallback(@NotNull IPlayer.IPlayerCallback callback) {
        this.callback = callback;
    }

    @Override // com.huami.devicerecorder.player.IPlayer
    @Nullable
    public Object setPosition(int i2, @NotNull Continuation<? super Boolean> continuation) {
        boolean z = false;
        if (b().isPlaying()) {
            try {
                b().seekTo(i2);
                z = true;
            } catch (IllegalStateException e2) {
                HMLog.info(f, new i(e2));
            }
        } else {
            HMLog.info(f, new j());
        }
        return Boxing.boxBoolean(z);
    }

    @Override // com.huami.devicerecorder.player.IPlayer
    @Nullable
    public Object stop(@NotNull Continuation<? super Boolean> continuation) {
        boolean z;
        try {
            Timer timer = this.positionTimer;
            if (timer != null) {
                timer.cancel();
            }
            b().stop();
            b().reset();
            z = true;
        } catch (IllegalStateException e2) {
            HMLog.info(f, new l(e2));
            z = false;
        }
        return Boxing.boxBoolean(z);
    }

    @Override // com.huami.devicerecorder.player.IPlayer
    @Nullable
    public Object play(@NotNull AssetFileDescriptor assetFileDescriptor, @NotNull Continuation<? super Boolean> continuation) {
        boolean z;
        Boolean boolBoxBoolean;
        HMLog.info(f, new e(assetFileDescriptor));
        synchronized (this) {
            try {
                Timer timer = this.positionTimer;
                if (timer != null) {
                    timer.cancel();
                }
                b().reset();
                b().setDataSource(assetFileDescriptor.getFileDescriptor(), assetFileDescriptor.getStartOffset(), assetFileDescriptor.getLength());
                b().prepare();
                b().start();
                e();
                z = true;
            } catch (Exception e2) {
                c(e2);
                z = false;
            }
            boolBoxBoolean = Boxing.boxBoolean(z);
        }
        return boolBoxBoolean;
    }
}
