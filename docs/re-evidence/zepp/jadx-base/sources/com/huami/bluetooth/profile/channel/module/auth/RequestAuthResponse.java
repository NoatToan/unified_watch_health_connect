package com.huami.bluetooth.profile.channel.module.auth;

import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0012\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\u001d\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001J\t\u0010\t\u001a\u00020\bHÖ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\u0013\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u0005\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0006\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0010\u001a\u0004\b\u0014\u0010\u0012¨\u0006\u0017"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/auth/RequestAuthResponse;", "", "", "component1", "component2", "randomNumber", "publickKey", "copy", "", "toString", "", "hashCode", "other", "", "equals", "a", "[B", "getRandomNumber", "()[B", "b", "getPublickKey", "<init>", "([B[B)V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class RequestAuthResponse {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    private final byte[] randomNumber;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    private final byte[] publickKey;

    public RequestAuthResponse(@NotNull byte[] bArr, @NotNull byte[] bArr2) {
        this.randomNumber = bArr;
        this.publickKey = bArr2;
    }

    public static /* synthetic */ RequestAuthResponse copy$default(RequestAuthResponse requestAuthResponse, byte[] bArr, byte[] bArr2, int i, Object obj) {
        if ((i & 1) != 0) {
            bArr = requestAuthResponse.randomNumber;
        }
        if ((i & 2) != 0) {
            bArr2 = requestAuthResponse.publickKey;
        }
        return requestAuthResponse.copy(bArr, bArr2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final byte[] getRandomNumber() {
        return this.randomNumber;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final byte[] getPublickKey() {
        return this.publickKey;
    }

    @NotNull
    public final RequestAuthResponse copy(@NotNull byte[] randomNumber, @NotNull byte[] publickKey) {
        return new RequestAuthResponse(randomNumber, publickKey);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RequestAuthResponse)) {
            return false;
        }
        RequestAuthResponse requestAuthResponse = (RequestAuthResponse) other;
        return Intrinsics.areEqual(this.randomNumber, requestAuthResponse.randomNumber) && Intrinsics.areEqual(this.publickKey, requestAuthResponse.publickKey);
    }

    @NotNull
    public final byte[] getPublickKey() {
        return this.publickKey;
    }

    @NotNull
    public final byte[] getRandomNumber() {
        return this.randomNumber;
    }

    public int hashCode() {
        return (Arrays.hashCode(this.randomNumber) * 31) + Arrays.hashCode(this.publickKey);
    }

    @NotNull
    public String toString() {
        return "RequestAuthResponse(randomNumber=" + Arrays.toString(this.randomNumber) + ", publickKey=" + Arrays.toString(this.publickKey) + ')';
    }
}
