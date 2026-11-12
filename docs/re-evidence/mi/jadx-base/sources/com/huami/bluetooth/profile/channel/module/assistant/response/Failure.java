package com.huami.bluetooth.profile.channel.module.assistant.response;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\f\u001a\u00020\u0004HÆ\u0003J\t\u0010\r\u001a\u00020\u0006HÆ\u0003J#\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0006HÖ\u0001J\b\u0010\u0014\u001a\u00020\u0004H\u0016R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/assistant/response/Failure;", "R", "Lcom/huami/bluetooth/profile/channel/module/assistant/response/Response;", "msg", "", "code", "", "(Ljava/lang/String;I)V", "getCode", "()I", "getMsg", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "toString", "bluetooth_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final /* data */ class Failure<R> extends Response<R> {
    private final int code;

    @NotNull
    private final String msg;

    public /* synthetic */ Failure(String str, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i2 & 2) != 0 ? 0 : i);
    }

    public static /* synthetic */ Failure copy$default(Failure failure, String str, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = failure.msg;
        }
        if ((i2 & 2) != 0) {
            i = failure.code;
        }
        return failure.copy(str, i);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getMsg() {
        return this.msg;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getCode() {
        return this.code;
    }

    @NotNull
    public final Failure<R> copy(@NotNull String msg, int code) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        return new Failure<>(msg, code);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Failure)) {
            return false;
        }
        Failure failure = (Failure) other;
        return Intrinsics.areEqual(this.msg, failure.msg) && this.code == failure.code;
    }

    public final int getCode() {
        return this.code;
    }

    @NotNull
    public final String getMsg() {
        return this.msg;
    }

    public int hashCode() {
        return (this.msg.hashCode() * 31) + Integer.hashCode(this.code);
    }

    @NotNull
    public String toString() {
        return "Failure(msg='" + this.msg + "', code=" + this.code + ')';
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Failure(@NotNull String msg, int i) {
        super(null);
        Intrinsics.checkNotNullParameter(msg, "msg");
        this.msg = msg;
        this.code = i;
    }
}
