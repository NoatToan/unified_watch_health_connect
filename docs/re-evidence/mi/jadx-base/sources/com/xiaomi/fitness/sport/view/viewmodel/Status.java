package com.xiaomi.fitness.sport.view.viewmodel;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0014"}, d2 = {"Lcom/xiaomi/fitness/sport/view/viewmodel/Status;", "", "code", "", "success", "", "<init>", "(IZ)V", "getCode", "()I", "getSuccess", "()Z", "component1", "component2", "copy", "equals", "other", "hashCode", "toString", "", "sport_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class Status {
    private final int code;
    private final boolean success;

    public Status(int i, boolean z) {
        this.code = i;
        this.success = z;
    }

    public static /* synthetic */ Status copy$default(Status status, int i, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = status.code;
        }
        if ((i2 & 2) != 0) {
            z = status.success;
        }
        return status.copy(i, z);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getCode() {
        return this.code;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getSuccess() {
        return this.success;
    }

    @NotNull
    public final Status copy(int code, boolean success) {
        return new Status(code, success);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Status)) {
            return false;
        }
        Status status = (Status) other;
        return this.code == status.code && this.success == status.success;
    }

    public final int getCode() {
        return this.code;
    }

    public final boolean getSuccess() {
        return this.success;
    }

    public int hashCode() {
        return (Integer.hashCode(this.code) * 31) + Boolean.hashCode(this.success);
    }

    @NotNull
    public String toString() {
        return "Status(code=" + this.code + ", success=" + this.success + ")";
    }
}
