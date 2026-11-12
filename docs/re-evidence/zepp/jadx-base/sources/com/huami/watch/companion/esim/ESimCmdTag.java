package com.huami.watch.companion.esim;

import com.baidu.ocr.sdk.utils.LogUtil;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0016\b\u0086\u0001\u0018\u0000 \u000f2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000fB\u0019\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\r\u0010\u000eJ\u0006\u0010\u0003\u001a\u00020\u0002R\u0019\u0010\u0004\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u0019\u0010\t\u001a\u00020\b8\u0006@\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001d¨\u0006\u001e"}, d2 = {"Lcom/huami/watch/companion/esim/ESimCmdTag;", "", "", "getValue", "type", LogUtil.I, "getType", "()I", "", "key", "Ljava/lang/String;", "getKey", "()Ljava/lang/String;", "<init>", "(Ljava/lang/String;IILjava/lang/String;)V", "Companion", "ENUM_ESIM_INFO", "ENUM_ESIM_DOWNLOAD_PROFILE", "ENUM_ESIM_SEND_REQUEST", "ENUM_ESIM_RECEIVE_RESPONSE", "ENUM_ESIM_DOWNLOAD_STATUS", "ENUM_ESIM_SWITCH_STATE", "ENUM_ESIM_DELETE", "ENUM_ESIM_SET_NAME", "ENUM_ESIM_PROFILE_LIST", "ENUM_ESIM_SHOW_QR", "ENUM_ESIM_SEND_NOTIFICATION", "ENUM_ESIM_CC", "ENUM_ESIM_VERSION", "ENUM_ESIM_CAPBILITY_REQUEST", "esim_release"}, k = 1, mv = {1, 5, 1})
public enum ESimCmdTag {
    ENUM_ESIM_INFO(1, AbsEsimOperation.TYPE_SIM_INFO),
    ENUM_ESIM_DOWNLOAD_PROFILE(2, AbsEsimOperation.TYPE_DOWNLOAD_PROFILE),
    ENUM_ESIM_SEND_REQUEST(3, AbsEsimOperation.TYPE_SEND_REQUEST),
    ENUM_ESIM_RECEIVE_RESPONSE(4, AbsEsimOperation.TYPE_RECEIVE_RESPONSE),
    ENUM_ESIM_DOWNLOAD_STATUS(5, AbsEsimOperation.TYPE_DOWNLOAD_STATUS),
    ENUM_ESIM_SWITCH_STATE(6, AbsEsimOperation.TYPE_SWITCH_PROFILE_STATE),
    ENUM_ESIM_DELETE(7, "delete"),
    ENUM_ESIM_SET_NAME(8, AbsEsimOperation.TYPE_SET_NAME),
    ENUM_ESIM_PROFILE_LIST(9, AbsEsimOperation.TYPE_PROFILE_LIST),
    ENUM_ESIM_SHOW_QR(10, AbsEsimOperation.TYPE_SHOW_QR),
    ENUM_ESIM_SEND_NOTIFICATION(11, AbsEsimOperation.TYPE_SEND_NOTIFICATION),
    ENUM_ESIM_CC(13, AbsEsimOperation.TYPE_ESIM_CC),
    ENUM_ESIM_VERSION(14, AbsEsimOperation.TYPE_ESIM_VERSION),
    ENUM_ESIM_CAPBILITY_REQUEST(17, AbsEsimOperation.TYPE_ESIM_CAPBILITY);


    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final String key;
    private final int type;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0010\u0010\b\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u0006¨\u0006\u000b"}, d2 = {"Lcom/huami/watch/companion/esim/ESimCmdTag$Companion;", "", "", "value", "Lcom/huami/watch/companion/esim/ESimCmdTag;", "fromValue", "", "key", "fromKey", "<init>", "()V", "esim_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Nullable
        public final ESimCmdTag fromKey(@NotNull String key) {
            for (ESimCmdTag eSimCmdTag : ESimCmdTag.values()) {
                if (Intrinsics.areEqual(eSimCmdTag.getKey(), key)) {
                    return eSimCmdTag;
                }
            }
            return null;
        }

        @Nullable
        public final ESimCmdTag fromValue(int value) {
            for (ESimCmdTag eSimCmdTag : ESimCmdTag.values()) {
                if (value == eSimCmdTag.getValue()) {
                    return eSimCmdTag;
                }
            }
            return null;
        }
    }

    ESimCmdTag(int i, String str) {
        this.type = i;
        this.key = str;
    }

    @NotNull
    public final String getKey() {
        return this.key;
    }

    public final int getType() {
        return this.type;
    }

    public final int getValue() {
        return this.type;
    }
}
