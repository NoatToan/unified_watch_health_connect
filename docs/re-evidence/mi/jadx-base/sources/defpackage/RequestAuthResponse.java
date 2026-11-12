package defpackage;

import com.smarthome.core.modelconfig.PluginDeviceInfo;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: lq, reason: from toString */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000e\u001a\u00020\t¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u000e\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000b\u001a\u0004\b\u000f\u0010\r¨\u0006\u0012"}, d2 = {"Llq;", "", "", "toString", "", "hashCode", "other", "", "equals", "", "randomNumber", "[B", PluginDeviceInfo.FDESC, "()[B", "publickKey", PluginDeviceInfo.FMODEL, "<init>", "([B[B)V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public final /* data */ class RequestAuthResponse {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from toString */
    @NotNull
    public final byte[] randomNumber;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from toString */
    @NotNull
    public final byte[] publickKey;

    public RequestAuthResponse(@NotNull byte[] randomNumber, @NotNull byte[] publickKey) {
        Intrinsics.checkNotNullParameter(randomNumber, "randomNumber");
        Intrinsics.checkNotNullParameter(publickKey, "publickKey");
        this.randomNumber = randomNumber;
        this.publickKey = publickKey;
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final byte[] getPublickKey() {
        return this.publickKey;
    }

    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public final byte[] getRandomNumber() {
        return this.randomNumber;
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

    public int hashCode() {
        return (Arrays.hashCode(this.randomNumber) * 31) + Arrays.hashCode(this.publickKey);
    }

    @NotNull
    public String toString() {
        return "RequestAuthResponse(randomNumber=" + Arrays.toString(this.randomNumber) + ", publickKey=" + Arrays.toString(this.publickKey) + ')';
    }
}
