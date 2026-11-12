package com.huami.bluetooth.profile.channel.model;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.xiaomi.hm.health.bt.gatt.GattUtils;
import java.io.ByteArrayOutputStream;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0010\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u000f\u001a\u00020\u0006\u0012\u0006\u0010\u0010\u001a\u00020\u0006\u0012\u0006\u0010\u0011\u001a\u00020\u0006\u0012\u0006\u0010\u000b\u001a\u00020\u0006\u0012\u0006\u0010\u000e\u001a\u00020\u0006\u0012\u0006\u0010\u0012\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0006¢\u0006\u0004\b\u0014\u0010\u0015J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016R\u0019\u0010\u000b\u001a\u00020\u00068\u0006@\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u0019\u0010\u000e\u001a\u00020\u00068\u0006@\u0006¢\u0006\f\n\u0004\b\f\u0010\b\u001a\u0004\b\r\u0010\n¨\u0006\u0016"}, d2 = {"Lcom/huami/bluetooth/profile/channel/model/FirstPacket;", "Lcom/huami/bluetooth/profile/channel/model/ChannelDataPacket;", "", "isFirstPacket", "", "toRawData", "", GoogleApiAvailabilityLight.b, LogUtil.I, "getTotalSize", "()I", "totalSize", "o", "getModule", "module", "flag", "sessionId", "packetIndex", "data", "appId", "<init>", "(IIIII[BI)V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class FirstPacket extends ChannelDataPacket {

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private final int totalSize;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    private final int module;

    public /* synthetic */ FirstPacket(int i, int i2, int i3, int i4, int i5, byte[] bArr, int i6, int i7, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i2, i3, i4, i5, bArr, (i7 & 64) != 0 ? -1 : i6);
    }

    public final int getModule() {
        return this.module;
    }

    public final int getTotalSize() {
        return this.totalSize;
    }

    @Override // com.huami.bluetooth.profile.channel.model.ChannelDataPacket
    public boolean isFirstPacket() {
        return true;
    }

    @Override // com.huami.bluetooth.profile.channel.model.ChannelDataPacket
    @NotNull
    public byte[] toRawData() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byteArrayOutputStream.write(3);
        byteArrayOutputStream.write(getFlag());
        if (getAppId() >= 0) {
            byteArrayOutputStream.write(getAppId());
        }
        byteArrayOutputStream.write(getSessionId());
        byteArrayOutputStream.write(getIndex());
        byteArrayOutputStream.write(GattUtils.intToBytes(this.totalSize));
        byteArrayOutputStream.write(GattUtils.shortToBytes((short) this.module));
        byteArrayOutputStream.write(getData());
        return byteArrayOutputStream.toByteArray();
    }

    public FirstPacket(int i, int i2, int i3, int i4, int i5, @NotNull byte[] bArr, int i6) {
        super(i, i2, i3, bArr, i6);
        this.totalSize = i4;
        this.module = i5;
    }
}
