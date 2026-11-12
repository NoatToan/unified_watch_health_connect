package com.huami.bluetooth.profile.channel.module.settings;

import com.alipay.sdk.m.f0.c;
import com.huami.ecg.core.model.constant.MeasureStateValue;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u0005\n\u0002\b\u0010\b\u0086\u0001\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\tB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0019\u0010\u0003\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u0012"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/settings/SettingsError;", "", "", "errorCode", "B", "getErrorCode", "()B", "<init>", "(Ljava/lang/String;IB)V", "Companion", c.p, "INVALID_PARAMETER", "UNKNOWN_GROUP", "INVALID_GROUP_VERSION", "INVALID_FIELD", "INVALID_OPERATION", "NO_MEMORY", MeasureStateValue.OTHER, "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public enum SettingsError {
    SUCCESS((byte) 1),
    INVALID_PARAMETER((byte) 2),
    UNKNOWN_GROUP((byte) 3),
    INVALID_GROUP_VERSION((byte) 4),
    INVALID_FIELD((byte) 5),
    INVALID_OPERATION((byte) 6),
    NO_MEMORY((byte) 7),
    OTHER((byte) -1);


    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private final byte errorCode;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0005\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\b"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/settings/SettingsError$Companion;", "", "", "value", "Lcom/huami/bluetooth/profile/channel/module/settings/SettingsError;", "fromValue", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Code duplicated, block: B:13:0x001d  */
        /* JADX WARN: Code duplicated, block: B:17:? A[RETURN, SYNTHETIC] */
        @NotNull
        public final SettingsError fromValue(byte value) {
            for (SettingsError settingsError : SettingsError.values()) {
                if (settingsError.getErrorCode() == value) {
                    if (settingsError == null) {
                        return SettingsError.OTHER;
                    }
                    return settingsError;
                }
            }
            settingsError = null;
            if (settingsError == null) {
                return SettingsError.OTHER;
            }
            return settingsError;
        }
    }

    SettingsError(byte b) {
        this.errorCode = b;
    }

    public final byte getErrorCode() {
        return this.errorCode;
    }
}
