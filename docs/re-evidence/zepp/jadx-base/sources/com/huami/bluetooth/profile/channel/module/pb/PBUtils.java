package com.huami.bluetooth.profile.channel.module.pb;

import com.xiaomi.hm.health.bt.profile.smartwatch.SmartWatchProfile;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u0014\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002J\u0014\u0010\u0007\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¨\u0006\n"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/pb/PBUtils;", "", "", "Lcom/xiaomi/hm/health/bt/profile/smartwatch/SmartWatchProfile$BlePBInfo;", "list", "", "pbList2Bytes", "pbList2BytesC", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class PBUtils {

    @NotNull
    public static final PBUtils INSTANCE = new PBUtils();

    private PBUtils() {
    }

    @NotNull
    public final byte[] pbList2Bytes(@NotNull List<? extends SmartWatchProfile.BlePBInfo> list) {
        ByteBuffer byteBufferOrder = ByteBuffer.allocate(list.size() * 14).order(ByteOrder.LITTLE_ENDIAN);
        for (SmartWatchProfile.BlePBInfo blePBInfo : list) {
            byteBufferOrder.putInt(blePBInfo.trackId).putInt(blePBInfo.value).put(blePBInfo.type).putInt(blePBInfo.timestamp).put(blePBInfo.name);
        }
        return byteBufferOrder.array();
    }

    @NotNull
    public final byte[] pbList2BytesC(@NotNull List<? extends SmartWatchProfile.BlePBInfo> list) {
        ByteBuffer byteBufferOrder = ByteBuffer.allocate(list.size() * 15).order(ByteOrder.LITTLE_ENDIAN);
        for (SmartWatchProfile.BlePBInfo blePBInfo : list) {
            byteBufferOrder.put(blePBInfo.name).putShort(blePBInfo.type).putInt(blePBInfo.trackId).putInt(blePBInfo.value).putInt(blePBInfo.timestamp);
        }
        return byteBufferOrder.array();
    }
}
