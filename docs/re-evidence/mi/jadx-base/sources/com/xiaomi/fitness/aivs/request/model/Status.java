package com.xiaomi.fitness.aivs.request.model;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0014"}, d2 = {"Lcom/xiaomi/fitness/aivs/request/model/Status;", "", "code", "", "error_type", "", "<init>", "(ILjava/lang/String;)V", "getCode", "()I", "getError_type", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "aivs_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class Status {
    private final int code;

    @NotNull
    private final String error_type;

    public Status(int i, @NotNull String error_type) {
        Intrinsics.checkNotNullParameter(error_type, "error_type");
        this.code = i;
        this.error_type = error_type;
    }

    public static /* synthetic */ Status copy$default(Status status, int i, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = status.code;
        }
        if ((i2 & 2) != 0) {
            str = status.error_type;
        }
        return status.copy(i, str);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getCode() {
        return this.code;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getError_type() {
        return this.error_type;
    }

    @NotNull
    public final Status copy(int code, @NotNull String error_type) {
        Intrinsics.checkNotNullParameter(error_type, "error_type");
        return new Status(code, error_type);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Status)) {
            return false;
        }
        Status status = (Status) other;
        return this.code == status.code && Intrinsics.areEqual(this.error_type, status.error_type);
    }

    public final int getCode() {
        return this.code;
    }

    @NotNull
    public final String getError_type() {
        return this.error_type;
    }

    public int hashCode() {
        return (Integer.hashCode(this.code) * 31) + this.error_type.hashCode();
    }

    @NotNull
    public String toString() {
        return "Status(code=" + this.code + ", error_type=" + this.error_type + ")";
    }
}
