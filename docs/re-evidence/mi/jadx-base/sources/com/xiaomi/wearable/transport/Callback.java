package com.xiaomi.wearable.transport;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u0000 \t2\u00020\u0001:\u0001\tJ$\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bH&¨\u0006\n"}, d2 = {"Lcom/xiaomi/wearable/transport/Callback;", "", "onCallback", "", "packetId", "", "code", "message", "", "Companion", "miwear-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface Callback {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;
    public static final int SEND_CMD_TIMEOUT = -4;
    public static final int SEND_CONFIRM = 1;
    public static final int SEND_FAILURE = -1;
    public static final int SEND_INVALID = -3;
    public static final int SEND_START = -2;
    public static final int SEND_SUCCESS = 0;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/xiaomi/wearable/transport/Callback$Companion;", "", "<init>", "()V", "SEND_START", "", "SEND_SUCCESS", "SEND_FAILURE", "SEND_CONFIRM", "SEND_INVALID", "SEND_CMD_TIMEOUT", "toReadableString", "", "code", "miwear-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        public static final int SEND_CMD_TIMEOUT = -4;
        public static final int SEND_CONFIRM = 1;
        public static final int SEND_FAILURE = -1;
        public static final int SEND_INVALID = -3;
        public static final int SEND_START = -2;
        public static final int SEND_SUCCESS = 0;

        private Companion() {
        }

        @NotNull
        public final String toReadableString(int code) {
            if (code == -4) {
                return "SEND_CMD_TIMEOUT";
            }
            if (code == -2) {
                return "SEND_START";
            }
            if (code == -1) {
                return "SEND_FAILURE";
            }
            if (code != 0) {
                return code != 1 ? "error callback code" : "SEND_CONFIRM";
            }
            return "SEND_SUCCESS";
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ void onCallback$default(Callback callback, int i, int i2, String str, int i3, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onCallback");
            }
            if ((i3 & 4) != 0) {
                str = null;
            }
            callback.onCallback(i, i2, str);
        }
    }

    void onCallback(int packetId, int code, @Nullable String message);
}
