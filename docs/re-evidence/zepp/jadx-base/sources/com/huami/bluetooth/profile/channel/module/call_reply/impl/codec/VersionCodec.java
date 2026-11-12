package com.huami.bluetooth.profile.channel.module.call_reply.impl.codec;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.huami.bluetooth.profile.channel.module.base.Codec;
import com.huami.bluetooth.profile.channel.module.call_reply.Version;
import com.huami.bluetooth.profile.channel.module.ex.ParseException;
import com.huami.bluetooth.utils.ByteUtilsKt;
import kotlin.Metadata;
import kotlin.NotImplementedError;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0007\u0018\u0000 \t2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\tB\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¨\u0006\n"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/call_reply/impl/codec/VersionCodec;", "Lcom/huami/bluetooth/profile/channel/module/base/Codec;", "Lcom/huami/bluetooth/profile/channel/module/call_reply/Version;", "", "value", "encode", "decode", "<init>", "()V", "a", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class VersionCodec implements Codec<Version, byte[]> {

    @Deprecated
    public static final int BYTE_LEN = 3;

    @Deprecated
    public static final int COUNT_BYTE_LEN = 2;

    @Deprecated
    public static final int ENCODE_BYTE_LEN = 1;

    @Deprecated
    public static final int VERSION_BYTE_LEN = 1;

    @NotNull
    private static final a a = new a(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tR\u0016\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0016\u0010\u0006\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0016\u0010\u0007\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004¨\u0006\n"}, d2 = {"com/huami/bluetooth/profile/channel/module/call_reply/impl/codec/VersionCodec$a", "", "", "BYTE_LEN", LogUtil.I, "COUNT_BYTE_LEN", "ENCODE_BYTE_LEN", "VERSION_BYTE_LEN", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.huami.bluetooth.profile.channel.module.base.Codec
    @NotNull
    public Version decode(@NotNull byte[] value) {
        if (value.length < 3) {
            throw new ParseException(null, 1, null);
        }
        int int$default = ByteUtilsKt.toInt$default(value, 1, 0, 2, null);
        return new Version(int$default, ByteUtilsKt.toInt(value, 2, 1), int$default > 1 ? ByteUtilsKt.toInt(value, 1, 3) : 0);
    }

    @Override // com.huami.bluetooth.profile.channel.module.base.Codec
    @NotNull
    public byte[] encode(@NotNull Version value) {
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }
}
