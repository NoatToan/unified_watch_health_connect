package com.huami.bluetooth.profile.channel.module.lumberjack.impl.codec;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.huami.bluetooth.profile.channel.module.ModuleUtilsKt;
import com.huami.bluetooth.profile.channel.module.base.Codec;
import com.huami.bluetooth.profile.channel.module.ex.ParseException;
import com.huami.bluetooth.profile.channel.module.lumberjack.LogStream;
import com.huami.bluetooth.utils.ByteUtilsKt;
import kotlin.Metadata;
import kotlin.NotImplementedError;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0007\u0018\u0000 \t2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\tB\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¨\u0006\n"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/lumberjack/impl/codec/LogStreamCodec;", "Lcom/huami/bluetooth/profile/channel/module/base/Codec;", "Lcom/huami/bluetooth/profile/channel/module/lumberjack/LogStream;", "", "value", "encode", "decode", "<init>", "()V", "a", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class LogStreamCodec implements Codec<LogStream, byte[]> {

    @Deprecated
    public static final int CONTENT_MIN_BYTES = 1;

    @Deprecated
    public static final int DATA_MIN_BYTES = 14;

    @Deprecated
    public static final int INDEX_BYTES = 1;

    @Deprecated
    public static final int LEVEL_BYTES = 1;

    @Deprecated
    public static final int STREAM_ID_BYTES = 1;

    @Deprecated
    public static final int SUB_DOMAIN_ID_MIN_BYTES = 1;

    @Deprecated
    public static final int TAG_MIN_BYTES = 1;

    @Deprecated
    public static final int TIMESTAMP_BYTES = 8;

    @NotNull
    private static final a a = new a(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\f\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rR\u0016\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0016\u0010\u0006\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0016\u0010\u0007\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0016\u0010\b\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0016\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0004R\u0016\u0010\n\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0004R\u0016\u0010\u000b\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0004¨\u0006\u000e"}, d2 = {"com/huami/bluetooth/profile/channel/module/lumberjack/impl/codec/LogStreamCodec$a", "", "", "CONTENT_MIN_BYTES", LogUtil.I, "DATA_MIN_BYTES", "INDEX_BYTES", "LEVEL_BYTES", "STREAM_ID_BYTES", "SUB_DOMAIN_ID_MIN_BYTES", "TAG_MIN_BYTES", "TIMESTAMP_BYTES", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.huami.bluetooth.profile.channel.module.base.Codec
    @NotNull
    public LogStream decode(@NotNull byte[] value) {
        int i;
        String str;
        int i2;
        String str2;
        if (value.length < 14) {
            throw new ParseException("Invalid data size!");
        }
        int int$default = ByteUtilsKt.toInt$default(value, 1, 0, 2, null);
        int i3 = ByteUtilsKt.toInt(value, 1, 1);
        int iFindStringEndFlag = ModuleUtilsKt.findStringEndFlag(value, 2);
        if (iFindStringEndFlag > 2) {
            byte[] bArrCopyOfRange = ArraysKt___ArraysJvmKt.copyOfRange(value, 2, iFindStringEndFlag);
            i = iFindStringEndFlag + 1;
            str = new String(bArrCopyOfRange, Charsets.UTF_8);
        } else {
            i = 3;
            str = new String();
        }
        int iFindStringEndFlag2 = ModuleUtilsKt.findStringEndFlag(value, i);
        if (iFindStringEndFlag2 > i) {
            byte[] bArrCopyOfRange2 = ArraysKt___ArraysJvmKt.copyOfRange(value, i, iFindStringEndFlag2);
            i2 = iFindStringEndFlag2 + 1;
            str2 = new String(bArrCopyOfRange2, Charsets.UTF_8);
        } else {
            i2 = i + 1;
            str2 = new String();
        }
        long j = ByteUtilsKt.toLong(value, 8, i2);
        int i4 = i2 + 8;
        int i5 = ByteUtilsKt.toInt(value, 1, i4);
        int i6 = i4 + 1;
        int iFindStringEndFlag3 = ModuleUtilsKt.findStringEndFlag(value, i6);
        return new LogStream(int$default, i3, str, str2, j, i5, iFindStringEndFlag3 > i6 ? new String(ArraysKt___ArraysJvmKt.copyOfRange(value, i6, iFindStringEndFlag3), Charsets.UTF_8) : new String());
    }

    @Override // com.huami.bluetooth.profile.channel.module.base.Codec
    @NotNull
    public byte[] encode(@NotNull LogStream value) {
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }
}
