package com.xiaomi.fit.fitness.export.data;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tB\u0011\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\nB\u0019\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\u000bJ\b\u0010\u0011\u001a\u00020\u0007H\u0016J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0007HÆ\u0003J'\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00032\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0019"}, d2 = {"Lcom/xiaomi/fit/fitness/export/data/DataResult;", "", "isSuccess", "", "code", "", "msg", "", "<init>", "(ZILjava/lang/String;)V", "(Z)V", "(ILjava/lang/String;)V", "()Z", "getCode", "()I", "getMsg", "()Ljava/lang/String;", "toString", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "fitness-data-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class DataResult {
    private final int code;
    private final boolean isSuccess;

    @NotNull
    private final String msg;

    public DataResult(boolean z, int i, @NotNull String msg) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        this.isSuccess = z;
        this.code = i;
        this.msg = msg;
    }

    public static /* synthetic */ DataResult copy$default(DataResult dataResult, boolean z, int i, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = dataResult.isSuccess;
        }
        if ((i2 & 2) != 0) {
            i = dataResult.code;
        }
        if ((i2 & 4) != 0) {
            str = dataResult.msg;
        }
        return dataResult.copy(z, i, str);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getIsSuccess() {
        return this.isSuccess;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getCode() {
        return this.code;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getMsg() {
        return this.msg;
    }

    @NotNull
    public final DataResult copy(boolean isSuccess, int code, @NotNull String msg) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        return new DataResult(isSuccess, code, msg);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DataResult)) {
            return false;
        }
        DataResult dataResult = (DataResult) other;
        return this.isSuccess == dataResult.isSuccess && this.code == dataResult.code && Intrinsics.areEqual(this.msg, dataResult.msg);
    }

    public final int getCode() {
        return this.code;
    }

    @NotNull
    public final String getMsg() {
        return this.msg;
    }

    public int hashCode() {
        return (((Boolean.hashCode(this.isSuccess) * 31) + Integer.hashCode(this.code)) * 31) + this.msg.hashCode();
    }

    public final boolean isSuccess() {
        return this.isSuccess;
    }

    @NotNull
    public String toString() {
        boolean z = this.isSuccess;
        if (z) {
            return "isSuccess = " + z;
        }
        return "code = " + this.code + ", msg = " + this.msg;
    }

    public DataResult(boolean z) {
        this(z, !z ? 1 : 0, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DataResult(int i, @NotNull String msg) {
        this(i == 0, i, msg);
        Intrinsics.checkNotNullParameter(msg, "msg");
    }
}
