package com.xiaomi.fitness.electronic.scale.export.bean;

import com.miui.tsmclient.net.TSMAuthContants;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001b\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005¢\u0006\u0004\b\t\u0010\nJ\u0006\u0010\u001a\u001a\u00020\u0007J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÆ\u0003J\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0014J\t\u0010\u001e\u001a\u00020\u0005HÆ\u0003J8\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\u0005HÆ\u0001¢\u0006\u0002\u0010 J\u0013\u0010!\u001a\u00020\u00072\b\u0010\"\u001a\u0004\u0018\u00010#HÖ\u0003J\t\u0010$\u001a\u00020\u0003HÖ\u0001J\t\u0010%\u001a\u00020\u0005HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0017\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\b\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0010\"\u0004\b\u0019\u0010\u0012¨\u0006&"}, d2 = {"Lcom/xiaomi/fitness/electronic/scale/export/bean/AccountExist;", "Ljava/io/Serializable;", "code", "", "message", "", TSMAuthContants.PARAM_EXIST, "", "data", "<init>", "(ILjava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;)V", "getCode", "()I", "setCode", "(I)V", "getMessage", "()Ljava/lang/String;", "setMessage", "(Ljava/lang/String;)V", "getExist", "()Ljava/lang/Boolean;", "setExist", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "getData", "setData", "accountExist", "component1", "component2", "component3", "component4", "copy", "(ILjava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;)Lcom/xiaomi/fitness/electronic/scale/export/bean/AccountExist;", "equals", "other", "", "hashCode", "toString", "electronic-scale-export_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class AccountExist implements Serializable {
    private int code;

    @NotNull
    private String data;

    @Nullable
    private Boolean exist;

    @NotNull
    private String message;

    public AccountExist(int i, @NotNull String message, @Nullable Boolean bool, @NotNull String data) {
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(data, "data");
        this.code = i;
        this.message = message;
        this.exist = bool;
        this.data = data;
    }

    public static /* synthetic */ AccountExist copy$default(AccountExist accountExist, int i, String str, Boolean bool, String str2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = accountExist.code;
        }
        if ((i2 & 2) != 0) {
            str = accountExist.message;
        }
        if ((i2 & 4) != 0) {
            bool = accountExist.exist;
        }
        if ((i2 & 8) != 0) {
            str2 = accountExist.data;
        }
        return accountExist.copy(i, str, bool, str2);
    }

    public final boolean accountExist() {
        return !Intrinsics.areEqual(this.data, "-1");
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

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Boolean getExist() {
        return this.exist;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getData() {
        return this.data;
    }

    @NotNull
    public final AccountExist copy(int code, @NotNull String message, @Nullable Boolean exist, @NotNull String data) {
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(data, "data");
        return new AccountExist(code, message, exist, data);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AccountExist)) {
            return false;
        }
        AccountExist accountExist = (AccountExist) other;
        return this.code == accountExist.code && Intrinsics.areEqual(this.message, accountExist.message) && Intrinsics.areEqual(this.exist, accountExist.exist) && Intrinsics.areEqual(this.data, accountExist.data);
    }

    public final int getCode() {
        return this.code;
    }

    @NotNull
    public final String getData() {
        return this.data;
    }

    @Nullable
    public final Boolean getExist() {
        return this.exist;
    }

    @NotNull
    public final String getMessage() {
        return this.message;
    }

    public int hashCode() {
        int iHashCode = ((Integer.hashCode(this.code) * 31) + this.message.hashCode()) * 31;
        Boolean bool = this.exist;
        return ((iHashCode + (bool == null ? 0 : bool.hashCode())) * 31) + this.data.hashCode();
    }

    public final void setCode(int i) {
        this.code = i;
    }

    public final void setData(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.data = str;
    }

    public final void setExist(@Nullable Boolean bool) {
        this.exist = bool;
    }

    public final void setMessage(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.message = str;
    }

    @NotNull
    public String toString() {
        return "AccountExist(code=" + this.code + ", message=" + this.message + ", exist=" + this.exist + ", data=" + this.data + ")";
    }

    public /* synthetic */ AccountExist(int i, String str, Boolean bool, String str2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? "" : str, bool, (i2 & 8) != 0 ? "" : str2);
    }
}
