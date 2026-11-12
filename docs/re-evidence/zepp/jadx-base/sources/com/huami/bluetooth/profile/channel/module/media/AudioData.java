package com.huami.bluetooth.profile.channel.module.media;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.xiaomi.hm.health.bt.gatt.GattUtils;
import java.io.ByteArrayOutputStream;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B!\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0010\u001a\u00020\r¢\u0006\u0004\b\u0011\u0010\u0012J\u0006\u0010\u0003\u001a\u00020\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0016R\u0016\u0010\t\u001a\u00020\u00068\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0016\u0010\f\u001a\u00020\u00028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0016\u0010\u0010\u001a\u00020\r8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0014"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/media/AudioData;", "", "", "getBytes", "", "toString", "", "a", LogUtil.I, "sessionId", "b", "[B", "data", "", "c", "Z", "eof", "<init>", "(I[BZ)V", "Companion", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class AudioData {
    public static final int AUDIO_DATA = 5;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    private final int sessionId;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    private final byte[] data;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    private final boolean eof;

    public AudioData(int i, @NotNull byte[] bArr, boolean z) {
        this.sessionId = i;
        this.data = bArr;
        this.eof = z;
    }

    @NotNull
    public final byte[] getBytes() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byteArrayOutputStream.write(5);
        byteArrayOutputStream.write(this.sessionId);
        byteArrayOutputStream.write(this.eof ? 1 : 0);
        byteArrayOutputStream.write(GattUtils.shortToBytes((short) this.data.length));
        byteArrayOutputStream.write(this.data);
        return byteArrayOutputStream.toByteArray();
    }

    @NotNull
    public String toString() {
        return "AudioData(sessionId=" + this.sessionId + ", data=" + ((Object) GattUtils.bytesToHexString(this.data)) + ", eof=" + this.eof + ')';
    }

    public /* synthetic */ AudioData(int i, byte[] bArr, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, bArr, (i2 & 4) != 0 ? false : z);
    }
}
