package com.huami.bluetooth.profile.channel.module.call_reply.impl.codec;

import com.huami.bluetooth.profile.channel.module.call_reply.SmsPermission;
import defpackage.u4;
import kotlin.Metadata;
import kotlin.NotImplementedError;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0006\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¨\u0006\t"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/call_reply/impl/codec/SmsPermissionCodec;", "Lu4;", "Lcom/huami/bluetooth/profile/channel/module/call_reply/SmsPermission;", "", "value", "encode", "decode", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public final class SmsPermissionCodec implements u4<SmsPermission, byte[]> {
    @Override // defpackage.u4
    @NotNull
    public SmsPermission decode(@NotNull byte[] value) {
        Intrinsics.checkNotNullParameter(value, "value");
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }

    @Override // defpackage.u4
    @NotNull
    public byte[] encode(@NotNull SmsPermission value) {
        Intrinsics.checkNotNullParameter(value, "value");
        return Intrinsics.areEqual(value, SmsPermission.Authorized.INSTANCE) ? new byte[]{1} : new byte[]{0};
    }
}
