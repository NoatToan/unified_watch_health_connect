package com.xiaomi.hm.health.device.headset.help;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.media.MediaPlayer;
import android.media.RingtoneManager;
import android.net.Uri;
import android.text.TextUtils;
import com.huami.passport.Configs;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB\u000f\u0012\u0006\u0010\u0018\u001a\u00020\u0015¢\u0006\u0004\b\u0019\u0010\u001aJ\u001c\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004J\u0018\u0010\u000b\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00022\b\u0010\n\u001a\u0004\u0018\u00010\tJ\u0006\u0010\f\u001a\u00020\u0006J\u0006\u0010\r\u001a\u00020\u0006J\u0006\u0010\u000e\u001a\u00020\u0006J\u0006\u0010\u000f\u001a\u00020\u0006J\u0006\u0010\u0010\u001a\u00020\u0002R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u001c"}, d2 = {"Lcom/xiaomi/hm/health/device/headset/help/MediaController;", "", "", "isUseDefaultRing", "", "assetMusicName", "", "setDataSource", "isAsync", "Landroid/media/MediaPlayer$OnPreparedListener;", "onPreparedListener", "prepare", "startRing", Configs.Params.RESET, "stopRing", "release", "isPlaying", "Landroid/media/MediaPlayer;", "a", "Landroid/media/MediaPlayer;", "mediaPlayer", "Landroid/content/Context;", "b", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "<init>", "(Landroid/content/Context;)V", "Companion", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class MediaController {

    @NotNull
    private static final String c = "MediaController";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    private MediaPlayer mediaPlayer;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    private Context context;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ Uri a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Uri uri) {
            super(0);
            this.a = uri;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "TYPE_RINGTONE:" + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public final /* synthetic */ Exception a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Exception exc) {
            super(0);
            this.a = exc;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "startRing Exception:" + this.a.getMessage();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<String> {
        public static final c a = new c();

        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "startRing return as mediaPlay isPlaying";
        }
    }

    public MediaController(@NotNull Context context) {
        this.context = context;
        MediaPlayer mediaPlayer = new MediaPlayer();
        this.mediaPlayer = mediaPlayer;
        mediaPlayer.setLooping(false);
    }

    public static /* synthetic */ void setDataSource$default(MediaController mediaController, boolean z, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        if ((i & 2) != 0) {
            str = null;
        }
        mediaController.setDataSource(z, str);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0015  */
    public final synchronized boolean isPlaying() {
        boolean z;
        MediaPlayer mediaPlayer = this.mediaPlayer;
        if (mediaPlayer != null) {
            z = mediaPlayer != null && mediaPlayer.isPlaying();
        }
        return z;
    }

    public final void prepare(boolean isAsync, @Nullable MediaPlayer.OnPreparedListener onPreparedListener) throws IOException {
        if (isAsync) {
            MediaPlayer mediaPlayer = this.mediaPlayer;
            if (mediaPlayer != null) {
                mediaPlayer.prepareAsync();
            }
        } else {
            MediaPlayer mediaPlayer2 = this.mediaPlayer;
            if (mediaPlayer2 != null) {
                mediaPlayer2.prepare();
            }
        }
        MediaPlayer mediaPlayer3 = this.mediaPlayer;
        if (mediaPlayer3 == null) {
            return;
        }
        mediaPlayer3.setOnPreparedListener(onPreparedListener);
    }

    public final void release() {
        MediaPlayer mediaPlayer = this.mediaPlayer;
        if (mediaPlayer != null) {
            mediaPlayer.release();
        }
        this.mediaPlayer = null;
        this.context = null;
    }

    public final synchronized void reset() {
        MediaPlayer mediaPlayer = this.mediaPlayer;
        if (mediaPlayer != null) {
            mediaPlayer.stop();
        }
        MediaPlayer mediaPlayer2 = this.mediaPlayer;
        if (mediaPlayer2 != null) {
            mediaPlayer2.reset();
        }
    }

    public final void setDataSource(boolean isUseDefaultRing, @Nullable String assetMusicName) {
        Context context = this.context;
        if (context == null) {
            return;
        }
        if (isUseDefaultRing) {
            try {
                Uri actualDefaultRingtoneUri = RingtoneManager.getActualDefaultRingtoneUri(context, 1);
                HMLog.info(c, new a(actualDefaultRingtoneUri));
                MediaPlayer mediaPlayer = this.mediaPlayer;
                if (mediaPlayer != null) {
                    mediaPlayer.setDataSource(context, actualDefaultRingtoneUri);
                }
            } catch (Exception e) {
                HMLog.info(c, new b(e));
                return;
            }
        }
        if (isUseDefaultRing || TextUtils.isEmpty(assetMusicName)) {
            return;
        }
        AssetFileDescriptor assetFileDescriptorOpenFd = context.getAssets().openFd(assetMusicName);
        MediaPlayer mediaPlayer2 = this.mediaPlayer;
        if (mediaPlayer2 == null) {
            return;
        }
        mediaPlayer2.setDataSource(assetFileDescriptorOpenFd.getFileDescriptor(), assetFileDescriptorOpenFd.getStartOffset(), assetFileDescriptorOpenFd.getLength());
    }

    public final synchronized void startRing() {
        if (isPlaying()) {
            HMLog.info(c, c.a);
            return;
        }
        MediaPlayer mediaPlayer = this.mediaPlayer;
        if (mediaPlayer != null) {
            mediaPlayer.start();
        }
    }

    public final synchronized void stopRing() {
        MediaPlayer mediaPlayer = this.mediaPlayer;
        if (mediaPlayer != null) {
            if (mediaPlayer != null) {
                mediaPlayer.stop();
            }
            release();
        }
    }
}
