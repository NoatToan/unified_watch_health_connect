package com.huami.bluetooth.profile.channel.module.settings.entity;

import androidx.exifinterface.media.ExifInterface;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.IPrimaryData;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.Settings;
import com.huami.bluetooth.profile.channel.module.settings.utils.ByteBufferExtendsKt;
import java.nio.ByteBuffer;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003J!\u0010\b\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\b\u0010\tJ\"\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0006H\u0016¨\u0006\u000f"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/settings/entity/IParser;", "Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/Settings;", ExifInterface.GPS_DIRECTION_TRUE, "", "Ljava/nio/ByteBuffer;", "byteBuffer", "", "groupVersion", "parse", "(Ljava/nio/ByteBuffer;I)Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/Settings;", "", "containDesc", "key", "Lcom/huami/bluetooth/profile/channel/module/settings/primarydata/IPrimaryData;", "parseUnSupport", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public interface IParser<T extends Settings> {

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public static final class DefaultImpls {
        @Nullable
        public static <T extends Settings> IPrimaryData parseUnSupport(@NotNull IParser<T> iParser, @NotNull ByteBuffer byteBuffer, boolean z, int i) {
            byte b = byteBuffer.get();
            if (b == 1) {
                return ByteBufferExtendsKt.getIntData(byteBuffer, z);
            }
            if (b == 2) {
                return ByteBufferExtendsKt.getIntArray(byteBuffer, z);
            }
            if (b == 11) {
                return ByteBufferExtendsKt.getBooleanData(byteBuffer);
            }
            if (b == 16) {
                return ByteBufferExtendsKt.getEnumData(byteBuffer, z);
            }
            if (b == 17) {
                return ByteBufferExtendsKt.getEnumArray(byteBuffer, z);
            }
            if (b == 32) {
                return ByteBufferExtendsKt.getStringData(byteBuffer, z);
            }
            if (b == 33) {
                return ByteBufferExtendsKt.getStringEnumData(byteBuffer, z);
            }
            if (b == 48) {
                return ByteBufferExtendsKt.getTimeData(byteBuffer);
            }
            if (b == 64) {
                return ByteBufferExtendsKt.getTimeStamp(byteBuffer);
            }
            if (b == 80) {
                return ByteBufferExtendsKt.getFlag(byteBuffer);
            }
            return null;
        }
    }

    @Nullable
    T parse(@NotNull ByteBuffer byteBuffer, int groupVersion);

    @Nullable
    IPrimaryData parseUnSupport(@NotNull ByteBuffer byteBuffer, boolean containDesc, int key);
}
