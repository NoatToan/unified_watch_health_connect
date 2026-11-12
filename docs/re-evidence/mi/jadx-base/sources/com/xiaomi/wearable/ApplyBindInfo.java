package com.xiaomi.wearable;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J;\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\u0003HÖ\u0001R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001e\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000b\"\u0004\b\u000f\u0010\rR\u001e\u0010\u0005\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u000b\"\u0004\b\u0011\u0010\rR\u001e\u0010\u0006\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000b\"\u0004\b\u0013\u0010\rR\u001e\u0010\u0007\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u000b\"\u0004\b\u0015\u0010\r¨\u0006\""}, d2 = {"Lcom/xiaomi/wearable/ApplyBindInfo;", "", "bindIndex", "", "bindDid", "serverPublicKey", "serverSign", "serverRandom", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getBindIndex", "()Ljava/lang/String;", "setBindIndex", "(Ljava/lang/String;)V", "getBindDid", "setBindDid", "getServerPublicKey", "setServerPublicKey", "getServerSign", "setServerSign", "getServerRandom", "setServerRandom", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "device_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class ApplyBindInfo {

    @SerializedName("bind_did")
    @NotNull
    private String bindDid;

    @SerializedName("bind_index")
    @NotNull
    private String bindIndex;

    @SerializedName("pub_s")
    @NotNull
    private String serverPublicKey;

    @SerializedName("random_s")
    @NotNull
    private String serverRandom;

    @SerializedName("sign_s")
    @NotNull
    private String serverSign;

    public ApplyBindInfo(@NotNull String bindIndex, @NotNull String bindDid, @NotNull String serverPublicKey, @NotNull String serverSign, @NotNull String serverRandom) {
        Intrinsics.checkNotNullParameter(bindIndex, "bindIndex");
        Intrinsics.checkNotNullParameter(bindDid, "bindDid");
        Intrinsics.checkNotNullParameter(serverPublicKey, "serverPublicKey");
        Intrinsics.checkNotNullParameter(serverSign, "serverSign");
        Intrinsics.checkNotNullParameter(serverRandom, "serverRandom");
        this.bindIndex = bindIndex;
        this.bindDid = bindDid;
        this.serverPublicKey = serverPublicKey;
        this.serverSign = serverSign;
        this.serverRandom = serverRandom;
    }

    public static /* synthetic */ ApplyBindInfo copy$default(ApplyBindInfo applyBindInfo, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = applyBindInfo.bindIndex;
        }
        if ((i & 2) != 0) {
            str2 = applyBindInfo.bindDid;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = applyBindInfo.serverPublicKey;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            str4 = applyBindInfo.serverSign;
        }
        String str8 = str4;
        if ((i & 16) != 0) {
            str5 = applyBindInfo.serverRandom;
        }
        return applyBindInfo.copy(str, str6, str7, str8, str5);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getBindIndex() {
        return this.bindIndex;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getBindDid() {
        return this.bindDid;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getServerPublicKey() {
        return this.serverPublicKey;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getServerSign() {
        return this.serverSign;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getServerRandom() {
        return this.serverRandom;
    }

    @NotNull
    public final ApplyBindInfo copy(@NotNull String bindIndex, @NotNull String bindDid, @NotNull String serverPublicKey, @NotNull String serverSign, @NotNull String serverRandom) {
        Intrinsics.checkNotNullParameter(bindIndex, "bindIndex");
        Intrinsics.checkNotNullParameter(bindDid, "bindDid");
        Intrinsics.checkNotNullParameter(serverPublicKey, "serverPublicKey");
        Intrinsics.checkNotNullParameter(serverSign, "serverSign");
        Intrinsics.checkNotNullParameter(serverRandom, "serverRandom");
        return new ApplyBindInfo(bindIndex, bindDid, serverPublicKey, serverSign, serverRandom);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ApplyBindInfo)) {
            return false;
        }
        ApplyBindInfo applyBindInfo = (ApplyBindInfo) other;
        return Intrinsics.areEqual(this.bindIndex, applyBindInfo.bindIndex) && Intrinsics.areEqual(this.bindDid, applyBindInfo.bindDid) && Intrinsics.areEqual(this.serverPublicKey, applyBindInfo.serverPublicKey) && Intrinsics.areEqual(this.serverSign, applyBindInfo.serverSign) && Intrinsics.areEqual(this.serverRandom, applyBindInfo.serverRandom);
    }

    @NotNull
    public final String getBindDid() {
        return this.bindDid;
    }

    @NotNull
    public final String getBindIndex() {
        return this.bindIndex;
    }

    @NotNull
    public final String getServerPublicKey() {
        return this.serverPublicKey;
    }

    @NotNull
    public final String getServerRandom() {
        return this.serverRandom;
    }

    @NotNull
    public final String getServerSign() {
        return this.serverSign;
    }

    public int hashCode() {
        return (((((((this.bindIndex.hashCode() * 31) + this.bindDid.hashCode()) * 31) + this.serverPublicKey.hashCode()) * 31) + this.serverSign.hashCode()) * 31) + this.serverRandom.hashCode();
    }

    public final void setBindDid(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.bindDid = str;
    }

    public final void setBindIndex(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.bindIndex = str;
    }

    public final void setServerPublicKey(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.serverPublicKey = str;
    }

    public final void setServerRandom(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.serverRandom = str;
    }

    public final void setServerSign(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.serverSign = str;
    }

    @NotNull
    public String toString() {
        return "ApplyBindInfo(bindIndex=" + this.bindIndex + ", bindDid=" + this.bindDid + ", serverPublicKey=" + this.serverPublicKey + ", serverSign=" + this.serverSign + ", serverRandom=" + this.serverRandom + ")";
    }
}
