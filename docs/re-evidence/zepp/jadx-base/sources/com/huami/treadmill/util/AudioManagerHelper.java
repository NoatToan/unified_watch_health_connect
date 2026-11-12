package com.huami.treadmill.util;

import android.content.Context;
import android.media.AudioManager;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.android.zxing.Intents;
import com.huami.tools.analytics.DbUtils;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.annotation.AnnotationRetention;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 )2\u00020\u0001:\u0001)B\u0011\b\u0016\u0012\u0006\u0010&\u001a\u00020%¢\u0006\u0004\b'\u0010(J\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0004\u001a\u00020\u0002J\u0006\u0010\u0005\u001a\u00020\u0002J\u000e\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0002J\u000e\u0010\t\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0002J\u000e\u0010\u000b\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u0002J\u0006\u0010\f\u001a\u00020\u0000J\u0006\u0010\r\u001a\u00020\u0000J\u000e\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u0002J\u0006\u0010\u0010\u001a\u00020\u0002J\u0006\u0010\u0011\u001a\u00020\u0002R\u0016\u0010\u0015\u001a\u00020\u00128\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0019\u001a\u00020\u00168\u0002@\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0016\u0010 \u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0016\u0010\"\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\u001fR\u0016\u0010$\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010\u001f¨\u0006*"}, d2 = {"Lcom/huami/treadmill/util/AudioManagerHelper;", "", "", "getSystemMaxVolume", "getSystemCurrentVolume", "get100CurrentVolume", "step", "setVoiceStep100", "type", "setAudioType", "flag", "setFlag", "addVoiceSystem", "subVoiceSystem", "num", "setVoice100", "addVoice100", "subVoice100", "", "a", "Ljava/lang/String;", "TAG", "", "b", "Z", "OpenLog", "Landroid/media/AudioManager;", "c", "Landroid/media/AudioManager;", "audioManager", GoogleApiAvailabilityLight.a, LogUtil.I, "NOW_AUDIO_TYPE", "e", "NOW_FLAG", "f", "VOICE_STEP_100", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "<init>", "(Landroid/content/Context;)V", "Companion", "treadmill_release"}, k = 1, mv = {1, 5, 1})
public final class AudioManagerHelper {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int FLAG_NOTHING = 0;
    public static final int FLAG_PLAY_SOUND = 4;
    public static final int FLAG_SHOW_UI = 1;
    public static final int TYPE_ALARM = 4;
    public static final int TYPE_MUSIC = 3;
    public static final int TYPE_RING = 2;

    @Nullable
    private static AudioManagerHelper g;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    private AudioManager audioManager;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private int NOW_FLAG;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final String TAG = AudioManagerHelper.class.getSimpleName();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final boolean OpenLog = true;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private int NOW_AUDIO_TYPE = 3;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private int VOICE_STEP_100 = 2;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0002\u0012\u0013B\t\b\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0016\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0016\u0010\t\u001a\u00020\u00068\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\bR\u0016\u0010\n\u001a\u00020\u00068\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\bR\u0016\u0010\u000b\u001a\u00020\u00068\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\bR\u0016\u0010\f\u001a\u00020\u00068\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\bR\u0016\u0010\r\u001a\u00020\u00068\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\bR\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0014"}, d2 = {"Lcom/huami/treadmill/util/AudioManagerHelper$Companion;", "", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Lcom/huami/treadmill/util/AudioManagerHelper;", "getInstance", "", "FLAG_NOTHING", LogUtil.I, "FLAG_PLAY_SOUND", "FLAG_SHOW_UI", "TYPE_ALARM", "TYPE_MUSIC", "TYPE_RING", "singleton", "Lcom/huami/treadmill/util/AudioManagerHelper;", "<init>", "()V", "FLAG", Intents.WifiConnect.TYPE, "treadmill_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\b\u0087\u0002\u0018\u00002\u00020\u0001B\u0000¨\u0006\u0002"}, d2 = {"Lcom/huami/treadmill/util/AudioManagerHelper$Companion$FLAG;", "", "treadmill_release"}, k = 1, mv = {1, 5, 1})
        @Retention(RetentionPolicy.SOURCE)
        @kotlin.annotation.Retention(AnnotationRetention.SOURCE)
        public @interface FLAG {
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\b\u0087\u0002\u0018\u00002\u00020\u0001B\u0000¨\u0006\u0002"}, d2 = {"Lcom/huami/treadmill/util/AudioManagerHelper$Companion$TYPE;", "", "treadmill_release"}, k = 1, mv = {1, 5, 1})
        @Retention(RetentionPolicy.SOURCE)
        @kotlin.annotation.Retention(AnnotationRetention.SOURCE)
        public @interface TYPE {
        }

        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final AudioManagerHelper getInstance(@NotNull Context context) {
            if (AudioManagerHelper.g == null) {
                synchronized (AudioManagerHelper.class) {
                    if (AudioManagerHelper.g == null) {
                        Companion companion = AudioManagerHelper.INSTANCE;
                        AudioManagerHelper.g = new AudioManagerHelper(context);
                    }
                    Unit unit = Unit.INSTANCE;
                }
            }
            return AudioManagerHelper.g;
        }
    }

    public AudioManagerHelper(@NotNull Context context) {
        Object systemService = context.getSystemService("audio");
        Objects.requireNonNull(systemService, "null cannot be cast to non-null type android.media.AudioManager");
        this.audioManager = (AudioManager) systemService;
    }

    public final int addVoice100() {
        int iCeil = (int) Math.ceil(((double) (this.VOICE_STEP_100 + get100CurrentVolume())) * ((double) getSystemMaxVolume()) * 0.01d);
        if (iCeil <= 0) {
            iCeil = 0;
        }
        if (iCeil >= 100) {
            iCeil = 100;
        }
        AudioManager audioManager = this.audioManager;
        if (audioManager != null) {
            audioManager.setStreamVolume(this.NOW_AUDIO_TYPE, iCeil, this.NOW_FLAG);
        }
        return get100CurrentVolume();
    }

    @NotNull
    public final AudioManagerHelper addVoiceSystem() {
        AudioManager audioManager = this.audioManager;
        if (audioManager != null) {
            audioManager.adjustStreamVolume(this.NOW_AUDIO_TYPE, 1, this.NOW_FLAG);
        }
        return this;
    }

    public final int get100CurrentVolume() {
        return (getSystemCurrentVolume() * 100) / getSystemMaxVolume();
    }

    public final int getSystemCurrentVolume() {
        AudioManager audioManager = this.audioManager;
        if (audioManager == null) {
            return 0;
        }
        return audioManager.getStreamVolume(this.NOW_AUDIO_TYPE);
    }

    public final int getSystemMaxVolume() {
        AudioManager audioManager = this.audioManager;
        if (audioManager == null) {
            return 0;
        }
        return audioManager.getStreamMaxVolume(this.NOW_AUDIO_TYPE);
    }

    @NotNull
    public final AudioManagerHelper setAudioType(int type) {
        this.NOW_AUDIO_TYPE = type;
        return this;
    }

    @NotNull
    public final AudioManagerHelper setFlag(int flag) {
        this.NOW_FLAG = flag;
        return this;
    }

    public final int setVoice100(int num) {
        int iCeil = (int) Math.ceil(((double) num) * ((double) getSystemMaxVolume()) * 0.01d);
        if (iCeil <= 0) {
            iCeil = 0;
        }
        if (iCeil >= 100) {
            iCeil = 100;
        }
        AudioManager audioManager = this.audioManager;
        if (audioManager != null) {
            audioManager.setStreamVolume(this.NOW_AUDIO_TYPE, iCeil, 0);
        }
        return get100CurrentVolume();
    }

    @NotNull
    public final AudioManagerHelper setVoiceStep100(int step) {
        this.VOICE_STEP_100 = step;
        return this;
    }

    public final int subVoice100() {
        int iFloor = (int) Math.floor(((double) (get100CurrentVolume() - this.VOICE_STEP_100)) * ((double) getSystemMaxVolume()) * 0.01d);
        if (iFloor <= 0) {
            iFloor = 0;
        }
        if (iFloor >= 100) {
            iFloor = 100;
        }
        AudioManager audioManager = this.audioManager;
        if (audioManager != null) {
            audioManager.setStreamVolume(this.NOW_AUDIO_TYPE, iFloor, this.NOW_FLAG);
        }
        return get100CurrentVolume();
    }

    @NotNull
    public final AudioManagerHelper subVoiceSystem() {
        AudioManager audioManager = this.audioManager;
        if (audioManager != null) {
            audioManager.adjustStreamVolume(this.NOW_AUDIO_TYPE, -1, this.NOW_FLAG);
        }
        return this;
    }
}
