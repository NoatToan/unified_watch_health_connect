package com.huami.bluetooth.profile.channel.module.call_reply.impl.codec;

import com.huami.bluetooth.profile.channel.module.call_reply.Version;
import defpackage.c3;
import defpackage.oo;
import defpackage.u4;
import kotlin.Metadata;
import kotlin.NotImplementedError;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0007\u0018\u0000 \t2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\tB\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¨\u0006\n"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/call_reply/impl/codec/VersionCodec;", "Lu4;", "Lcom/huami/bluetooth/profile/channel/module/call_reply/Version;", "", "value", "encode", "decode", "<init>", "()V", "Companion", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public final class VersionCodec implements u4<Version, byte[]> {

    @Deprecated
    public static final int BYTE_LEN = 3;

    @Deprecated
    public static final int COUNT_BYTE_LEN = 2;

    @NotNull
    private static final Companion Companion = new Companion(null);

    @Deprecated
    public static final int ENCODE_BYTE_LEN = 1;

    @Deprecated
    public static final int VERSION_BYTE_LEN = 1;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/call_reply/impl/codec/VersionCodec$Companion;", "", "()V", "BYTE_LEN", "", "COUNT_BYTE_LEN", "ENCODE_BYTE_LEN", "VERSION_BYTE_LEN", "bluetooth_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // defpackage.u4
    @NotNull
    public Version decode(@NotNull byte[] value) {
        Intrinsics.checkNotNullParameter(value, "value");
        if (value.length < 3) {
            throw new oo(null, 1, null);
        }
        int iA = c3.a(value, 1, 0, 2, null);
        return new Version(iA, c3.a(value, 2, 1), iA > 1 ? c3.a(value, 1, 3) : 0);
    }

    @Override // defpackage.u4
    @NotNull
    public byte[] encode(@NotNull Version value) {
        Intrinsics.checkNotNullParameter(value, "value");
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }
}
