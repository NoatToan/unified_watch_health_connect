package com.huami.bluetooth.profile.channel.module.scale;

import com.baidu.ocr.sdk.utils.LogUtil;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.huami.bluetooth.profile.channel.module.scale.BalanceMeasureFailure, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u0019\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\u0018\u0010\u0019J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\t\u0010\u0005\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0006HÆ\u0003J#\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u0006HÆ\u0001J\t\u0010\u000b\u001a\u00020\u0006HÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003R\u0019\u0010\b\u001a\u00020\u00038\u0006@\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0019\u0010\t\u001a\u00020\u00068\u0006@\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001a"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/scale/BalanceMeasureFailure;", "R", "Lcom/huami/bluetooth/profile/channel/module/scale/BalanceResult;", "", "toString", "component1", "", "component2", "msg", "code", "copy", "hashCode", "", "other", "", "equals", "a", "Ljava/lang/String;", "getMsg", "()Ljava/lang/String;", "b", LogUtil.I, "getCode", "()I", "<init>", "(Ljava/lang/String;I)V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class Failure<R> extends BalanceResult<R> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    private final String msg;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    private final int code;

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
        return (this.msg.hashCode() * 31) + this.code;
    }

    @NotNull
    public String toString() {
        return "Failure(msg='" + this.msg + "', code=" + this.code + ')';
    }

    public Failure(@NotNull String str, int i) {
        super(null);
        this.msg = str;
        this.code = i;
    }
}
