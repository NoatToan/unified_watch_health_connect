package com.huami.bluetooth.profile.channel.module.media;

import com.baidu.ocr.sdk.utils.LogUtil;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\f\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u0017\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\f\u001a\u00020\u0004¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0019\u0010\t\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0019\u0010\f\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\u000b\u0010\b¨\u0006\u0010"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/media/AudioControl;", "", "", "toString", "", "a", LogUtil.I, "getSessionId", "()I", "sessionId", "b", "getAction", "action", "<init>", "(II)V", "Companion", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class AudioControl {
    public static final int AUDIO_CONTROL = 6;
    public static final int CONTINUE = 1;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int PAUSE = 2;
    public static final int STOP = 0;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private final int sessionId;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    private final int action;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0016\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0016\u0010\t\u001a\u00020\u00068\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\bR\u0016\u0010\n\u001a\u00020\u00068\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\bR\u0016\u0010\u000b\u001a\u00020\u00068\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\b¨\u0006\u000e"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/media/AudioControl$Companion;", "", "", "data", "Lcom/huami/bluetooth/profile/channel/module/media/AudioControl;", "fromBytes", "", "AUDIO_CONTROL", LogUtil.I, "CONTINUE", "PAUSE", "STOP", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final AudioControl fromBytes(@NotNull byte[] data) {
            byte b = data[0];
            return new AudioControl(data[1] & 255, data[2] & 255);
        }
    }

    public AudioControl(int i, int i2) {
        this.sessionId = i;
        this.action = i2;
    }

    public final int getAction() {
        return this.action;
    }

    public final int getSessionId() {
        return this.sessionId;
    }

    @NotNull
    public String toString() {
        return "AudioControl(sessionId=" + this.sessionId + ", action=" + this.action + ')';
    }
}
