package com.huami.bluetooth.profile.channel.module.contact.request;

import com.xiaomi.hm.health.bt.gatt.GattUtils;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.JsonLexerKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0017\u0010\u0018J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u001f\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\u000e\u001a\u00020\u00042\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\b\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001b\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006@\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0019"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/contact/request/BtResponse;", "", "", "toString", "", "component1", "", "component2", "opResult", "data", "copy", "", "hashCode", "other", "equals", "a", "Z", "getOpResult", "()Z", "b", "[B", "getData", "()[B", "<init>", "(Z[B)V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class BtResponse {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final boolean opResult;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    private final byte[] data;

    public BtResponse(boolean z, @Nullable byte[] bArr) {
        this.opResult = z;
        this.data = bArr;
    }

    public static /* synthetic */ BtResponse copy$default(BtResponse btResponse, boolean z, byte[] bArr, int i, Object obj) {
        if ((i & 1) != 0) {
            z = btResponse.opResult;
        }
        if ((i & 2) != 0) {
            bArr = btResponse.data;
        }
        return btResponse.copy(z, bArr);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getOpResult() {
        return this.opResult;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final byte[] getData() {
        return this.data;
    }

    @NotNull
    public final BtResponse copy(boolean opResult, @Nullable byte[] data) {
        return new BtResponse(opResult, data);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BtResponse)) {
            return false;
        }
        BtResponse btResponse = (BtResponse) other;
        return this.opResult == btResponse.opResult && Intrinsics.areEqual(this.data, btResponse.data);
    }

    @Nullable
    public final byte[] getData() {
        return this.data;
    }

    public final boolean getOpResult() {
        return this.opResult;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    public int hashCode() {
        boolean z = this.opResult;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        int i = r0 * 31;
        byte[] bArr = this.data;
        return i + (bArr == null ? 0 : Arrays.hashCode(bArr));
    }

    @NotNull
    public String toString() {
        return "[opResult: " + this.opResult + ", data: " + ((Object) GattUtils.bytesToHexString(this.data)) + JsonLexerKt.END_LIST;
    }

    public /* synthetic */ BtResponse(boolean z, byte[] bArr, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, (i & 2) != 0 ? null : bArr);
    }
}
