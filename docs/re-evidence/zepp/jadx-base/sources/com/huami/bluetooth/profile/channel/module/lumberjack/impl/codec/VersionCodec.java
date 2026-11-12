package com.huami.bluetooth.profile.channel.module.lumberjack.impl.codec;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.huami.bluetooth.profile.channel.module.ModuleUtilsKt;
import com.huami.bluetooth.profile.channel.module.base.Codec;
import com.huami.bluetooth.profile.channel.module.ex.ParseException;
import com.huami.bluetooth.profile.channel.module.lumberjack.Version;
import com.huami.bluetooth.utils.ByteUtilsKt;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.NotImplementedError;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0007\u0018\u0000 \t2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\tB\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¨\u0006\n"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/lumberjack/impl/codec/VersionCodec;", "Lcom/huami/bluetooth/profile/channel/module/base/Codec;", "Lcom/huami/bluetooth/profile/channel/module/lumberjack/Version;", "", "value", "encode", "decode", "<init>", "()V", "a", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class VersionCodec implements Codec<Version, byte[]> {

    @Deprecated
    public static final int BYTE_LEN = 3;

    @Deprecated
    public static final int DOMAIN_COUNT_BYTE_LEN = 2;

    @Deprecated
    public static final int VERSION_BYTE_LEN = 1;

    @NotNull
    private static final a a = new a(null);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0016\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0016\u0010\u0006\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004¨\u0006\t"}, d2 = {"com/huami/bluetooth/profile/channel/module/lumberjack/impl/codec/VersionCodec$a", "", "", "BYTE_LEN", LogUtil.I, "DOMAIN_COUNT_BYTE_LEN", "VERSION_BYTE_LEN", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
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
        int i = 3;
        if (value.length < 3) {
            throw new ParseException("Invalid data size!");
        }
        int int$default = ByteUtilsKt.toInt$default(value, 1, 0, 2, null);
        int i2 = ByteUtilsKt.toInt(value, 2, 1);
        ArrayList arrayList = new ArrayList();
        if (i2 != 0) {
            int iFindStringEndFlag = ModuleUtilsKt.findStringEndFlag(value, 3);
            while (iFindStringEndFlag > i) {
                arrayList.add(new String(ArraysKt___ArraysJvmKt.copyOfRange(value, i, iFindStringEndFlag), Charsets.UTF_8));
                i = iFindStringEndFlag + 1;
                iFindStringEndFlag = ModuleUtilsKt.findStringEndFlag(value, i);
            }
        }
        return new Version(int$default, arrayList);
    }

    @Override // com.huami.bluetooth.profile.channel.module.base.Codec
    @NotNull
    public byte[] encode(@NotNull Version value) {
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }
}
