package com.huami.watch.companion.ecg.media;

import android.media.MediaPlayer;
import com.google.firebase.crashlytics.internal.settings.network.DefaultSettingsSpiCall;
import com.huami.watch.companion.ecg.media.MediaPlayHelper;
import com.huami.watch.companion.mediac.Command;
import com.huami.watch.util.Log;
import java.io.IOException;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u000e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004J$\u0010\f\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00042\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\tJ\u0006\u0010\r\u001a\u00020\u0002R$\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0018"}, d2 = {"Lcom/huami/watch/companion/ecg/media/MediaPlayHelper;", "", "", "e", "", "fileUrl", "", "getVoiceDuration", "url", "Lkotlin/Function1;", "", "callback", "start", Command.STOP, "a", "Lkotlin/jvm/functions/Function1;", "mCallback", "Landroid/media/MediaPlayer;", "b", "Landroid/media/MediaPlayer;", "mMediaPlayer", "<init>", "()V", "Companion", "ecg-companion_release"}, k = 1, mv = {1, 5, 1})
public final class MediaPlayHelper {

    @NotNull
    private static final String c = "MediaPlayer";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    private Function1<? super Boolean, Unit> mCallback;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    private MediaPlayer mMediaPlayer;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final Lazy<MediaPlayHelper> d = LazyKt__LazyJVMKt.lazy(a.a);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fR\u001d\u0010\u0007\u001a\u00020\u00028F@\u0006X\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0016\u0010\t\u001a\u00020\b8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Lcom/huami/watch/companion/ecg/media/MediaPlayHelper$Companion;", "", "Lcom/huami/watch/companion/ecg/media/MediaPlayHelper;", "instance$delegate", "Lkotlin/Lazy;", "getInstance", "()Lcom/huami/watch/companion/ecg/media/MediaPlayHelper;", DefaultSettingsSpiCall.n, "", "TAG", "Ljava/lang/String;", "<init>", "()V", "ecg-companion_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final MediaPlayHelper getInstance() {
            return (MediaPlayHelper) MediaPlayHelper.d.getValue();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/watch/companion/ecg/media/MediaPlayHelper;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<MediaPlayHelper> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final MediaPlayHelper invoke() {
            return new MediaPlayHelper();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(MediaPlayHelper mediaPlayHelper, MediaPlayer mediaPlayer) {
        mediaPlayer.start();
        Function1<? super Boolean, Unit> function1 = mediaPlayHelper.mCallback;
        if (function1 == null) {
            return;
        }
        function1.invoke(Boolean.TRUE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(MediaPlayHelper mediaPlayHelper, MediaPlayer mediaPlayer) {
        mediaPlayHelper.e();
    }

    private final void e() {
        Function1<? super Boolean, Unit> function1 = this.mCallback;
        if (function1 != null) {
            function1.invoke(Boolean.FALSE);
        }
        this.mCallback = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [android.media.MediaPlayer] */
    /* JADX WARN: Type inference failed for: r0v2, types: [long] */
    public final long getVoiceDuration(@NotNull String fileUrl) {
        int duration;
        MediaPlayer mediaPlayer = new MediaPlayer();
        try {
            try {
                mediaPlayer.setDataSource(fileUrl);
                mediaPlayer.prepare();
                duration = mediaPlayer.getDuration();
                mediaPlayer.release();
            } catch (IOException e) {
                Log.e(c, e.getMessage(), e, new Object[0]);
                mediaPlayer.release();
                duration = -1;
            }
            mediaPlayer = duration;
            return mediaPlayer;
        } catch (Throwable th) {
            mediaPlayer.release();
            throw th;
        }
    }

    public final synchronized void start(@NotNull String url, @Nullable Function1<? super Boolean, Unit> callback) {
        stop();
        this.mCallback = callback;
        MediaPlayer mediaPlayer = new MediaPlayer();
        this.mMediaPlayer = mediaPlayer;
        try {
            mediaPlayer.setDataSource(url);
            mediaPlayer.prepareAsync();
            mediaPlayer.setOnPreparedListener(new MediaPlayer.OnPreparedListener() { // from class: fx4
                @Override // android.media.MediaPlayer.OnPreparedListener
                public final void onPrepared(MediaPlayer mediaPlayer2) {
                    MediaPlayHelper.c(this.a, mediaPlayer2);
                }
            });
            mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() { // from class: ex4
                @Override // android.media.MediaPlayer.OnCompletionListener
                public final void onCompletion(MediaPlayer mediaPlayer2) {
                    MediaPlayHelper.d(this.a, mediaPlayer2);
                }
            });
        } catch (Exception e) {
            Log.e(c, e.getMessage(), e, new Object[0]);
            e();
        }
    }

    public final void stop() {
        MediaPlayer mediaPlayer = this.mMediaPlayer;
        if (mediaPlayer != null) {
            try {
                mediaPlayer.stop();
                mediaPlayer.release();
            } catch (Exception e) {
                Log.e(c, e.getMessage(), e, new Object[0]);
            }
        }
        this.mMediaPlayer = null;
        e();
    }
}
