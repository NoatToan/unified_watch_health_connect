package defpackage;

import com.smarthome.core.modelconfig.PluginDeviceInfo;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: ut, reason: from toString */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0012\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0017\u0010\u0018J\u0006\u0010\u0003\u001a\u00020\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\t\u0010\u0007\u001a\u00020\u0006HÖ\u0001J\u0013\u0010\t\u001a\u00020\u00022\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\n\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0010\u001a\u0004\b\u0014\u0010\u0012R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0010\u001a\u0004\b\u0016\u0010\u0012¨\u0006\u0019"}, d2 = {"Lut;", "", "", PluginDeviceInfo.FICONOFFLINE, "", "toString", "", "hashCode", "other", "equals", "code", "I", PluginDeviceInfo.FMODEL, "()I", "", "publicKeyHash", "[B", PluginDeviceInfo.FDESC, "()[B", "publickKey", PluginDeviceInfo.FICONON, "randomNumber", PluginDeviceInfo.FICONOFF, "<init>", "(I[B[B[B)V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public final /* data */ class StartAuthResponse {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from toString */
    public final int code;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final byte[] f36105b;

    @Nullable
    public final byte[] c;

    @Nullable
    public final byte[] d;

    public StartAuthResponse(int i, @Nullable byte[] bArr, @Nullable byte[] bArr2, @Nullable byte[] bArr3) {
        this.code = i;
        this.f36105b = bArr;
        this.c = bArr2;
        this.d = bArr3;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getCode() {
        return this.code;
    }

    @Nullable
    /* JADX INFO: renamed from: b, reason: from getter */
    public final byte[] getF36105b() {
        return this.f36105b;
    }

    @Nullable
    /* JADX INFO: renamed from: c, reason: from getter */
    public final byte[] getC() {
        return this.c;
    }

    @Nullable
    /* JADX INFO: renamed from: d, reason: from getter */
    public final byte[] getD() {
        return this.d;
    }

    public final boolean e() {
        return this.code == 1;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StartAuthResponse)) {
            return false;
        }
        StartAuthResponse startAuthResponse = (StartAuthResponse) other;
        return this.code == startAuthResponse.code && Intrinsics.areEqual(this.f36105b, startAuthResponse.f36105b) && Intrinsics.areEqual(this.c, startAuthResponse.c) && Intrinsics.areEqual(this.d, startAuthResponse.d);
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.code) * 31;
        byte[] bArr = this.f36105b;
        int iHashCode2 = (iHashCode + (bArr == null ? 0 : Arrays.hashCode(bArr))) * 31;
        byte[] bArr2 = this.c;
        int iHashCode3 = (iHashCode2 + (bArr2 == null ? 0 : Arrays.hashCode(bArr2))) * 31;
        byte[] bArr3 = this.d;
        return iHashCode3 + (bArr3 != null ? Arrays.hashCode(bArr3) : 0);
    }

    @NotNull
    public String toString() {
        return "StartAuthResponse(code=" + this.code + '(' + p0.v.a(this.code).getU() + "))";
    }

    public /* synthetic */ StartAuthResponse(int i, byte[] bArr, byte[] bArr2, byte[] bArr3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, (i2 & 2) != 0 ? null : bArr, (i2 & 4) != 0 ? null : bArr2, (i2 & 8) != 0 ? null : bArr3);
    }
}
