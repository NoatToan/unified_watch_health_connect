package com.huami.sleepassistant.lib.ui.breathe.begins.utils;

import android.content.Context;
import android.content.Intent;
import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import android.media.MediaPlayer;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.firebase.crashlytics.internal.settings.network.DefaultSettingsSpiCall;
import com.huami.tools.analytics.DbUtils;
import com.xiaomi.hm.health.Constant;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 !2\u00020\u0001:\u0002!\"B\u0011\b\u0002\u0012\u0006\u0010\u0015\u001a\u00020\u000f¢\u0006\u0004\b \u0010\u0014J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\u0012\u0010\u0007\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016J\u0006\u0010\b\u001a\u00020\u0002J\u000e\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tJ\u0006\u0010\f\u001a\u00020\u0002J\u0006\u0010\r\u001a\u00020\u0002J\u0006\u0010\u000e\u001a\u00020\u0002R\"\u0010\u0015\u001a\u00020\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00050\u00168\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0017R\u0016\u0010\u001b\u001a\u00020\u00058\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001f\u001a\u00020\u001c8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006#"}, d2 = {"Lcom/huami/sleepassistant/lib/ui/breathe/begins/utils/BreatheMediaPlayUtils;", "Landroid/media/MediaPlayer$OnCompletionListener;", "", "a", "b", "Landroid/media/MediaPlayer;", Constant.PAI_KEY_MEDIUM_ZONE_PAI, "onCompletion", "playBackgroundMusic", "Lcom/huami/sleepassistant/lib/ui/breathe/begins/utils/BreatheMediaPlayUtils$PlayType;", "type", "playTypeMusic", "pauseMediaPlayer", "restartMediaPlayer", "finishAll", "Landroid/content/Context;", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "setContext", "(Landroid/content/Context;)V", DbUtils.Const.Table.CONTEXT, "", "Ljava/util/List;", "mediaPlayBackgroundList", "c", "Landroid/media/MediaPlayer;", "beepMediaPlayer", "Landroid/content/res/AssetManager;", GoogleApiAvailabilityLight.a, "Landroid/content/res/AssetManager;", "assetManager", "<init>", "Companion", "PlayType", "lib_release"}, k = 1, mv = {1, 5, 1})
public final class BreatheMediaPlayUtils implements MediaPlayer.OnCompletionListener {

    @NotNull
    public static final String BREATHE_PAUSE_ACTION = "com.huami.sleep.breathonpause";

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private static BreatheMediaPlayUtils e;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private Context context;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final List<MediaPlayer> mediaPlayBackgroundList;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final MediaPlayer beepMediaPlayer;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final AssetManager assetManager;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0016\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0018\u0010\t\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Lcom/huami/sleepassistant/lib/ui/breathe/begins/utils/BreatheMediaPlayUtils$Companion;", "", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Lcom/huami/sleepassistant/lib/ui/breathe/begins/utils/BreatheMediaPlayUtils;", "getInstance", "", "BREATHE_PAUSE_ACTION", "Ljava/lang/String;", DefaultSettingsSpiCall.n, "Lcom/huami/sleepassistant/lib/ui/breathe/begins/utils/BreatheMediaPlayUtils;", "<init>", "()V", "lib_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final synchronized BreatheMediaPlayUtils getInstance(@NotNull Context context) {
            if (BreatheMediaPlayUtils.e == null) {
                BreatheMediaPlayUtils.e = new BreatheMediaPlayUtils(context, null);
            }
            return BreatheMediaPlayUtils.e;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/huami/sleepassistant/lib/ui/breathe/begins/utils/BreatheMediaPlayUtils$PlayType;", "", "<init>", "(Ljava/lang/String;I)V", "INHALE", "HOLD_YOUR_BREATH", "EXPIRATION", "lib_release"}, k = 1, mv = {1, 5, 1})
    public enum PlayType {
        INHALE,
        HOLD_YOUR_BREATH,
        EXPIRATION
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PlayType.values().length];
            iArr[PlayType.INHALE.ordinal()] = 1;
            iArr[PlayType.HOLD_YOUR_BREATH.ordinal()] = 2;
            iArr[PlayType.EXPIRATION.ordinal()] = 3;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private BreatheMediaPlayUtils(Context context) {
        this.context = context;
        this.mediaPlayBackgroundList = new ArrayList();
        int i = 0;
        while (true) {
            int i2 = i + 1;
            MediaPlayer mediaPlayer = new MediaPlayer();
            mediaPlayer.setLooping(true);
            mediaPlayer.reset();
            mediaPlayer.setOnCompletionListener(this);
            this.mediaPlayBackgroundList.add(i, mediaPlayer);
            if (i2 > 1) {
                MediaPlayer mediaPlayer2 = new MediaPlayer();
                mediaPlayer2.setLooping(false);
                mediaPlayer2.reset();
                Unit unit = Unit.INSTANCE;
                this.beepMediaPlayer = mediaPlayer2;
                this.assetManager = this.context.getAssets();
                return;
            }
            i = i2;
        }
    }

    public /* synthetic */ BreatheMediaPlayUtils(Context context, DefaultConstructorMarker defaultConstructorMarker) {
        this(context);
    }

    private final void a() {
        int size = this.mediaPlayBackgroundList.size() - 1;
        if (size < 0) {
            return;
        }
        int i = 0;
        while (true) {
            int i2 = i + 1;
            this.mediaPlayBackgroundList.get(i).reset();
            if (i2 > size) {
                return;
            } else {
                i = i2;
            }
        }
    }

    private final void b() {
        this.beepMediaPlayer.reset();
    }

    public final void finishAll() {
        b();
        a();
    }

    @NotNull
    public final Context getContext() {
        return this.context;
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public void onCompletion(@Nullable MediaPlayer mp) {
        if (mp == null) {
            return;
        }
        mp.start();
    }

    public final void pauseMediaPlayer() {
        if (this.beepMediaPlayer.isPlaying()) {
            this.beepMediaPlayer.pause();
        }
        int i = 0;
        int size = this.mediaPlayBackgroundList.size() - 1;
        if (size < 0) {
            return;
        }
        while (true) {
            int i2 = i + 1;
            this.mediaPlayBackgroundList.get(i).pause();
            if (i2 > size) {
                return;
            } else {
                i = i2;
            }
        }
    }

    public final void playBackgroundMusic() throws IOException {
        int size = this.mediaPlayBackgroundList.size() - 1;
        if (size < 0) {
            return;
        }
        int i = 0;
        while (true) {
            int i2 = i + 1;
            this.mediaPlayBackgroundList.get(i).reset();
            if (i == 0) {
                AssetFileDescriptor assetFileDescriptorOpenFd = this.assetManager.openFd("breathing_training/background_music/music1.mp3");
                this.mediaPlayBackgroundList.get(i).setDataSource(assetFileDescriptorOpenFd.getFileDescriptor(), assetFileDescriptorOpenFd.getStartOffset(), assetFileDescriptorOpenFd.getLength());
            } else {
                AssetFileDescriptor assetFileDescriptorOpenFd2 = this.assetManager.openFd("breathing_training/background_music/music2.mp3");
                this.mediaPlayBackgroundList.get(i).setDataSource(assetFileDescriptorOpenFd2.getFileDescriptor(), assetFileDescriptorOpenFd2.getStartOffset(), assetFileDescriptorOpenFd2.getLength());
            }
            this.mediaPlayBackgroundList.get(i).prepare();
            this.mediaPlayBackgroundList.get(i).start();
            if (i2 > size) {
                return;
            } else {
                i = i2;
            }
        }
    }

    public final void playTypeMusic(@NotNull PlayType type) throws IOException {
        AssetFileDescriptor assetFileDescriptorOpenFd;
        Intent intent = new Intent();
        intent.setAction("com.huami.sleep.breathonpause");
        LocalBroadcastManager.getInstance(this.context).sendBroadcast(intent);
        this.beepMediaPlayer.reset();
        int i = WhenMappings.$EnumSwitchMapping$0[type.ordinal()];
        if (i == 1) {
            assetFileDescriptorOpenFd = this.assetManager.openFd("breathing_training/prompt/Inhale.mp3");
        } else if (i == 2) {
            assetFileDescriptorOpenFd = this.assetManager.openFd("breathing_training/prompt/hold_your_breath.mp3");
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            assetFileDescriptorOpenFd = this.assetManager.openFd("breathing_training/prompt/expiration.mp3");
        }
        this.beepMediaPlayer.setDataSource(assetFileDescriptorOpenFd.getFileDescriptor(), assetFileDescriptorOpenFd.getStartOffset(), assetFileDescriptorOpenFd.getLength());
        this.beepMediaPlayer.prepare();
        this.beepMediaPlayer.start();
    }

    public final void restartMediaPlayer() {
        this.beepMediaPlayer.start();
        int size = this.mediaPlayBackgroundList.size() - 1;
        if (size < 0) {
            return;
        }
        int i = 0;
        while (true) {
            int i2 = i + 1;
            this.mediaPlayBackgroundList.get(i).start();
            if (i2 > size) {
                return;
            } else {
                i = i2;
            }
        }
    }

    public final void setContext(@NotNull Context context) {
        this.context = context;
    }
}
