package com.xiaomi.fitness.net.url;

import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0018\b\u0086\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\u0017\u001a\u00020\u00032\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0019\u001a\u00020\nH\u0016J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÆ\u0003J\u0014\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007HÆ\u0003¢\u0006\u0002\u0010\u0012J\t\u0010\u001d\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001e\u001a\u00020\nHÆ\u0003JF\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00072\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001¢\u0006\u0002\u0010 J\t\u0010!\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006\""}, d2 = {"Lcom/xiaomi/fitness/net/url/SecretData;", "", "encryptResponse", "", "pathPrefix", "", "filterSignatureKeys", "", "sid", "loginPolicy", "", "<init>", "(ZLjava/lang/String;[Ljava/lang/String;Ljava/lang/String;I)V", "getEncryptResponse", "()Z", "getPathPrefix", "()Ljava/lang/String;", "getFilterSignatureKeys", "()[Ljava/lang/String;", "[Ljava/lang/String;", "getSid", "getLoginPolicy", "()I", "equals", "other", "hashCode", "component1", "component2", "component3", "component4", "component5", "copy", "(ZLjava/lang/String;[Ljava/lang/String;Ljava/lang/String;I)Lcom/xiaomi/fitness/net/url/SecretData;", "toString", "net_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class SecretData {
    private final boolean encryptResponse;

    @NotNull
    private final String[] filterSignatureKeys;
    private final int loginPolicy;

    @NotNull
    private final String pathPrefix;

    @NotNull
    private final String sid;

    public SecretData(boolean z, @NotNull String pathPrefix, @NotNull String[] filterSignatureKeys, @NotNull String sid, int i) {
        Intrinsics.checkNotNullParameter(pathPrefix, "pathPrefix");
        Intrinsics.checkNotNullParameter(filterSignatureKeys, "filterSignatureKeys");
        Intrinsics.checkNotNullParameter(sid, "sid");
        this.encryptResponse = z;
        this.pathPrefix = pathPrefix;
        this.filterSignatureKeys = filterSignatureKeys;
        this.sid = sid;
        this.loginPolicy = i;
    }

    public static /* synthetic */ SecretData copy$default(SecretData secretData, boolean z, String str, String[] strArr, String str2, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = secretData.encryptResponse;
        }
        if ((i2 & 2) != 0) {
            str = secretData.pathPrefix;
        }
        String str3 = str;
        if ((i2 & 4) != 0) {
            strArr = secretData.filterSignatureKeys;
        }
        String[] strArr2 = strArr;
        if ((i2 & 8) != 0) {
            str2 = secretData.sid;
        }
        String str4 = str2;
        if ((i2 & 16) != 0) {
            i = secretData.loginPolicy;
        }
        return secretData.copy(z, str3, strArr2, str4, i);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getEncryptResponse() {
        return this.encryptResponse;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getPathPrefix() {
        return this.pathPrefix;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String[] getFilterSignatureKeys() {
        return this.filterSignatureKeys;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getSid() {
        return this.sid;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getLoginPolicy() {
        return this.loginPolicy;
    }

    @NotNull
    public final SecretData copy(boolean encryptResponse, @NotNull String pathPrefix, @NotNull String[] filterSignatureKeys, @NotNull String sid, int loginPolicy) {
        Intrinsics.checkNotNullParameter(pathPrefix, "pathPrefix");
        Intrinsics.checkNotNullParameter(filterSignatureKeys, "filterSignatureKeys");
        Intrinsics.checkNotNullParameter(sid, "sid");
        return new SecretData(encryptResponse, pathPrefix, filterSignatureKeys, sid, loginPolicy);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!Intrinsics.areEqual(SecretData.class, other != null ? other.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(other, "null cannot be cast to non-null type com.xiaomi.fitness.net.url.SecretData");
        SecretData secretData = (SecretData) other;
        return this.encryptResponse == secretData.encryptResponse && Intrinsics.areEqual(this.pathPrefix, secretData.pathPrefix) && Arrays.equals(this.filterSignatureKeys, secretData.filterSignatureKeys) && Intrinsics.areEqual(this.sid, secretData.sid) && this.loginPolicy == secretData.loginPolicy;
    }

    public final boolean getEncryptResponse() {
        return this.encryptResponse;
    }

    @NotNull
    public final String[] getFilterSignatureKeys() {
        return this.filterSignatureKeys;
    }

    public final int getLoginPolicy() {
        return this.loginPolicy;
    }

    @NotNull
    public final String getPathPrefix() {
        return this.pathPrefix;
    }

    @NotNull
    public final String getSid() {
        return this.sid;
    }

    public int hashCode() {
        return (((((((Boolean.hashCode(this.encryptResponse) * 31) + this.pathPrefix.hashCode()) * 31) + Arrays.hashCode(this.filterSignatureKeys)) * 31) + this.sid.hashCode()) * 31) + Integer.hashCode(this.loginPolicy);
    }

    @NotNull
    public String toString() {
        return "SecretData(encryptResponse=" + this.encryptResponse + ", pathPrefix=" + this.pathPrefix + ", filterSignatureKeys=" + Arrays.toString(this.filterSignatureKeys) + ", sid=" + this.sid + ", loginPolicy=" + this.loginPolicy + ")";
    }
}
