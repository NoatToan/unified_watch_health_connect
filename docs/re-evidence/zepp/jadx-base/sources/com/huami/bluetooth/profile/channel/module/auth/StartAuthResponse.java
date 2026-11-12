package com.huami.bluetooth.profile.channel.module.auth;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.xiaomi.hm.health.bt.profile.auth.AuthErrorCode;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u001a\b\u0086\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\f\u001a\u00020\u0006\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b \u0010!J\u0006\u0010\u0003\u001a\u00020\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\t\u0010\u0007\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\bHÆ\u0003J7\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\f\u001a\u00020\u00062\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\bHÆ\u0001J\t\u0010\u0011\u001a\u00020\u0006HÖ\u0001J\u0013\u0010\u0013\u001a\u00020\u00022\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\f\u001a\u00020\u00068\u0006@\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001b\u0010\r\u001a\u0004\u0018\u00010\b8\u0006@\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001b\u0010\u000e\u001a\u0004\u0018\u00010\b8\u0006@\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0019\u001a\u0004\b\u001d\u0010\u001bR\u001b\u0010\u000f\u001a\u0004\u0018\u00010\b8\u0006@\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u0019\u001a\u0004\b\u001f\u0010\u001b¨\u0006\""}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/auth/StartAuthResponse;", "", "", "success", "", "toString", "", "component1", "", "component2", "component3", "component4", "code", "publicKeyHash", "publickKey", "randomNumber", "copy", "hashCode", "other", "equals", "a", LogUtil.I, "getCode", "()I", "b", "[B", "getPublicKeyHash", "()[B", "c", "getPublickKey", GoogleApiAvailabilityLight.a, "getRandomNumber", "<init>", "(I[B[B[B)V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class StartAuthResponse {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private final int code;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    private final byte[] publicKeyHash;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    private final byte[] publickKey;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    private final byte[] randomNumber;

    public StartAuthResponse(int i, @Nullable byte[] bArr, @Nullable byte[] bArr2, @Nullable byte[] bArr3) {
        this.code = i;
        this.publicKeyHash = bArr;
        this.publickKey = bArr2;
        this.randomNumber = bArr3;
    }

    public static /* synthetic */ StartAuthResponse copy$default(StartAuthResponse startAuthResponse, int i, byte[] bArr, byte[] bArr2, byte[] bArr3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = startAuthResponse.code;
        }
        if ((i2 & 2) != 0) {
            bArr = startAuthResponse.publicKeyHash;
        }
        if ((i2 & 4) != 0) {
            bArr2 = startAuthResponse.publickKey;
        }
        if ((i2 & 8) != 0) {
            bArr3 = startAuthResponse.randomNumber;
        }
        return startAuthResponse.copy(i, bArr, bArr2, bArr3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getCode() {
        return this.code;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final byte[] getPublicKeyHash() {
        return this.publicKeyHash;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final byte[] getPublickKey() {
        return this.publickKey;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final byte[] getRandomNumber() {
        return this.randomNumber;
    }

    @NotNull
    public final StartAuthResponse copy(int code, @Nullable byte[] publicKeyHash, @Nullable byte[] publickKey, @Nullable byte[] randomNumber) {
        return new StartAuthResponse(code, publicKeyHash, publickKey, randomNumber);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StartAuthResponse)) {
            return false;
        }
        StartAuthResponse startAuthResponse = (StartAuthResponse) other;
        return this.code == startAuthResponse.code && Intrinsics.areEqual(this.publicKeyHash, startAuthResponse.publicKeyHash) && Intrinsics.areEqual(this.publickKey, startAuthResponse.publickKey) && Intrinsics.areEqual(this.randomNumber, startAuthResponse.randomNumber);
    }

    public final int getCode() {
        return this.code;
    }

    @Nullable
    public final byte[] getPublicKeyHash() {
        return this.publicKeyHash;
    }

    @Nullable
    public final byte[] getPublickKey() {
        return this.publickKey;
    }

    @Nullable
    public final byte[] getRandomNumber() {
        return this.randomNumber;
    }

    public int hashCode() {
        int i = this.code * 31;
        byte[] bArr = this.publicKeyHash;
        int iHashCode = (i + (bArr == null ? 0 : Arrays.hashCode(bArr))) * 31;
        byte[] bArr2 = this.publickKey;
        int iHashCode2 = (iHashCode + (bArr2 == null ? 0 : Arrays.hashCode(bArr2))) * 31;
        byte[] bArr3 = this.randomNumber;
        return iHashCode2 + (bArr3 != null ? Arrays.hashCode(bArr3) : 0);
    }

    public final boolean success() {
        return this.code == 1;
    }

    @NotNull
    public String toString() {
        return "StartAuthResponse(code=" + this.code + '(' + AuthErrorCode.INSTANCE.fromValue(this.code).getDesc() + "))";
    }

    public /* synthetic */ StartAuthResponse(int i, byte[] bArr, byte[] bArr2, byte[] bArr3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, (i2 & 2) != 0 ? null : bArr, (i2 & 4) != 0 ? null : bArr2, (i2 & 8) != 0 ? null : bArr3);
    }
}
