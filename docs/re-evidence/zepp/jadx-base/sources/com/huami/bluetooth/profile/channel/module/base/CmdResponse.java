package com.huami.bluetooth.profile.channel.module.base;

import com.xiaomi.hm.health.bt.gatt.GattUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB#\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\f\u001a\u00020\u0002¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u001b\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\u0010"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/base/CmdResponse;", "Lcom/huami/bluetooth/profile/channel/module/base/ErrorCode;", "", "toString", "", "c", "[B", "getBody", "()[B", "body", "", "code", "desc", "<init>", "(I[BLjava/lang/String;)V", "Companion", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class CmdResponse extends ErrorCode {
    public static final int STATUS_INVALID = -1;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    @Nullable
    private final byte[] body;

    public /* synthetic */ CmdResponse(int i, byte[] bArr, String str, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, (i2 & 2) != 0 ? null : bArr, str);
    }

    @Nullable
    public final byte[] getBody() {
        return this.body;
    }

    @Override // com.huami.bluetooth.profile.channel.module.base.ErrorCode
    @NotNull
    public String toString() {
        return "CmdResponse{code=" + getCode() + ", desc=" + getDesc() + ", body=" + ((Object) GattUtils.bytesToHexString(this.body)) + '}';
    }

    public CmdResponse(int i, @Nullable byte[] bArr, @NotNull String str) {
        super(i, str);
        this.body = bArr;
    }
}
