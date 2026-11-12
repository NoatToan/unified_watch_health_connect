package com.huami.bluetooth.profile.channel.module.assistant.response;

import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \u0005*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001\u0005B\t\b\u0004¢\u0006\u0004\b\u0003\u0010\u0004\u0082\u0001\u0003\u0006\u0007\b¨\u0006\t"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/assistant/response/Response;", "R", "Ljava/io/Serializable;", "<init>", "()V", "Companion", "Lcom/huami/bluetooth/profile/channel/module/assistant/response/Timeout;", "Lcom/huami/bluetooth/profile/channel/module/assistant/response/Failure;", "Lcom/huami/bluetooth/profile/channel/module/assistant/response/Success;", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public abstract class Response<R> implements Serializable {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static final long serialVersionUID = 1;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0012\u0010\u0013J!\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004\"\u0004\b\u0001\u0010\u00022\u0006\u0010\u0003\u001a\u00028\u0001¢\u0006\u0004\b\u0005\u0010\u0006J$\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00010\u000b\"\u0004\b\u0001\u0010\u00022\u0006\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\tJ\u0012\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00010\r\"\u0004\b\u0001\u0010\u0002R\u0016\u0010\u0010\u001a\u00020\u000f8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/assistant/response/Response$Companion;", "", "R", "data", "Lcom/huami/bluetooth/profile/channel/module/assistant/response/Success;", "success", "(Ljava/lang/Object;)Lcom/huami/bluetooth/profile/channel/module/assistant/response/Success;", "", "msg", "", "code", "Lcom/huami/bluetooth/profile/channel/module/assistant/response/Failure;", "fail", "Lcom/huami/bluetooth/profile/channel/module/assistant/response/Timeout;", "timeout", "", "serialVersionUID", "J", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ Failure fail$default(Companion companion, String str, int i, int i2, Object obj) {
            if ((i2 & 2) != 0) {
                i = 0;
            }
            return companion.fail(str, i);
        }

        @NotNull
        public final <R> Failure<R> fail(@NotNull String msg, int code) {
            return new Failure<>(msg, code);
        }

        @NotNull
        public final <R> Success<R> success(R data) {
            return new Success<>(data);
        }

        @NotNull
        public final <R> Timeout<R> timeout() {
            DefaultConstructorMarker defaultConstructorMarker = null;
            return new Timeout<>(defaultConstructorMarker, 1, defaultConstructorMarker);
        }
    }

    private Response() {
    }

    public /* synthetic */ Response(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
