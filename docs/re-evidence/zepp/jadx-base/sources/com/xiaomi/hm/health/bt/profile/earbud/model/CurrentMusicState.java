package com.xiaomi.hm.health.bt.profile.earbud.model;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.xiaomi.hm.health.bt.gatt.GattUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\f\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R\"\u0010\u000b\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\"\u0010\u000f\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u0006\u001a\u0004\b\r\u0010\b\"\u0004\b\u000e\u0010\nR\"\u0010\u0013\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0006\u001a\u0004\b\u0011\u0010\b\"\u0004\b\u0012\u0010\nR$\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00148F@BX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R$\u0010\u001a\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00148F@BX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001a\u0010\u0017\"\u0004\b\u0005\u0010\u0019R$\u0010\u001b\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00148F@BX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001b\u0010\u0017\"\u0004\b\f\u0010\u0019R$\u0010\u001c\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00148F@BX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001c\u0010\u0017\"\u0004\b\u0010\u0010\u0019¨\u0006 "}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/earbud/model/CurrentMusicState;", "", "", "toString", "", "a", LogUtil.I, "getState", "()I", "setState", "(I)V", "state", "b", "getMode", "setMode", "mode", "c", "getMusicId", "setMusicId", "musicId", "", "value", "isPlay", "()Z", GoogleApiAvailabilityLight.a, "(Z)V", "isModeNormal", "isModeRest", "isModeTomato", "<init>", "()V", "Companion", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class CurrentMusicState {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int MODE_NORMAL = 0;
    public static final int MODE_REST = 1;
    public static final int MODE_TOMATO = 2;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private int state;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private int mode;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private int musicId;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002R\u0016\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0016\u0010\t\u001a\u00020\u00068\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\bR\u0016\u0010\n\u001a\u00020\u00068\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\b¨\u0006\r"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/earbud/model/CurrentMusicState$Companion;", "", "", "data", "Lcom/xiaomi/hm/health/bt/profile/earbud/model/CurrentMusicState;", "from", "", "MODE_NORMAL", LogUtil.I, "MODE_REST", "MODE_TOMATO", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Nullable
        public final CurrentMusicState from(@Nullable byte[] data) {
            if (data == null || data.length != 6) {
                return null;
            }
            CurrentMusicState currentMusicState = new CurrentMusicState();
            currentMusicState.setState(data[0] & 255);
            currentMusicState.setMode(data[1] & 255);
            currentMusicState.setMusicId(GattUtils.bytesToInt(data, 2, 4));
            return currentMusicState;
        }
    }

    private final void a(boolean z) {
    }

    private final void b(boolean z) {
    }

    private final void c(boolean z) {
    }

    private final void d(boolean z) {
    }

    public final int getMode() {
        return this.mode;
    }

    public final int getMusicId() {
        return this.musicId;
    }

    public final int getState() {
        return this.state;
    }

    public final boolean isModeNormal() {
        return this.mode == 0;
    }

    public final boolean isModeRest() {
        return this.mode == 1;
    }

    public final boolean isModeTomato() {
        return this.mode == 2;
    }

    public final boolean isPlay() {
        return this.state == 1;
    }

    public final void setMode(int i) {
        this.mode = i;
    }

    public final void setMusicId(int i) {
        this.musicId = i;
    }

    public final void setState(int i) {
        this.state = i;
    }

    @NotNull
    public String toString() {
        return "EarbudCurrentMusicState{state:" + this.state + ",mode:" + this.mode + ",musicId:" + this.musicId + '}';
    }
}
