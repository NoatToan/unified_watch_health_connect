package com.xiaomi.fitness.electronic.scale.export.bean;

import java.io.Serializable;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\u000f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J-\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cHÖ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001e\u001a\u00020\u0005HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u001f"}, d2 = {"Lcom/xiaomi/fitness/electronic/scale/export/bean/SharedUser;", "Ljava/io/Serializable;", "code", "", "message", "", "data", "", "Lcom/xiaomi/fitness/electronic/scale/export/bean/ShareAccount;", "<init>", "(ILjava/lang/String;Ljava/util/List;)V", "getCode", "()I", "setCode", "(I)V", "getMessage", "()Ljava/lang/String;", "setMessage", "(Ljava/lang/String;)V", "getData", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "toString", "electronic-scale-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class SharedUser implements Serializable {
    private int code;

    @NotNull
    private final List<ShareAccount> data;

    @NotNull
    private String message;

    public SharedUser(int i, @NotNull String message, @NotNull List<ShareAccount> data) {
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(data, "data");
        this.code = i;
        this.message = message;
        this.data = data;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SharedUser copy$default(SharedUser sharedUser, int i, String str, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = sharedUser.code;
        }
        if ((i2 & 2) != 0) {
            str = sharedUser.message;
        }
        if ((i2 & 4) != 0) {
            list = sharedUser.data;
        }
        return sharedUser.copy(i, str, list);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getCode() {
        return this.code;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    @NotNull
    public final List<ShareAccount> component3() {
        return this.data;
    }

    @NotNull
    public final SharedUser copy(int code, @NotNull String message, @NotNull List<ShareAccount> data) {
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(data, "data");
        return new SharedUser(code, message, data);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SharedUser)) {
            return false;
        }
        SharedUser sharedUser = (SharedUser) other;
        return this.code == sharedUser.code && Intrinsics.areEqual(this.message, sharedUser.message) && Intrinsics.areEqual(this.data, sharedUser.data);
    }

    public final int getCode() {
        return this.code;
    }

    @NotNull
    public final List<ShareAccount> getData() {
        return this.data;
    }

    @NotNull
    public final String getMessage() {
        return this.message;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.code) * 31) + this.message.hashCode()) * 31) + this.data.hashCode();
    }

    public final void setCode(int i) {
        this.code = i;
    }

    public final void setMessage(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.message = str;
    }

    @NotNull
    public String toString() {
        return "SharedUser(code=" + this.code + ", message=" + this.message + ", data=" + this.data + ")";
    }

    public /* synthetic */ SharedUser(int i, String str, List list, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? "" : str, list);
    }
}
