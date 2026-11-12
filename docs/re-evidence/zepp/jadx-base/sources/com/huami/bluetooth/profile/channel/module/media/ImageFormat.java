package com.huami.bluetooth.profile.channel.module.media;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.xiaomi.hm.health.bt.gatt.GattUtils;
import java.io.ByteArrayOutputStream;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000b\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B'\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\r\u001a\u00020\n\u0012\u0006\u0010\u000f\u001a\u00020\n\u0012\u0006\u0010\u0011\u001a\u00020\n¢\u0006\u0004\b\u0012\u0010\u0013J\u0006\u0010\u0003\u001a\u00020\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0016R\u0016\u0010\t\u001a\u00020\u00068\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0016\u0010\r\u001a\u00020\n8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0016\u0010\u000f\u001a\u00020\n8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\fR\u0016\u0010\u0011\u001a\u00020\n8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\f¨\u0006\u0015"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/media/ImageFormat;", "", "", "getBytes", "", "toString", "Lcom/huami/bluetooth/profile/channel/module/media/ImageCodec;", "a", "Lcom/huami/bluetooth/profile/channel/module/media/ImageCodec;", "imageCodec", "", "b", LogUtil.I, "widthInPixel", "c", "heightInPixel", GoogleApiAvailabilityLight.a, "bitDepth", "<init>", "(Lcom/huami/bluetooth/profile/channel/module/media/ImageCodec;III)V", "Companion", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class ImageFormat {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int DATA_SIZE = 6;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    private final ImageCodec imageCodec;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    private final int widthInPixel;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    private final int heightInPixel;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    private final int bitDepth;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0016\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/media/ImageFormat$Companion;", "", "", "data", "Lcom/huami/bluetooth/profile/channel/module/media/ImageFormat;", "fromBytes", "", "DATA_SIZE", LogUtil.I, "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final ImageFormat fromBytes(@NotNull byte[] data) {
            return new ImageFormat(ImageCodec.INSTANCE.form(data[0] & 255), MeidaHelperKt.twoBytesToUInt(data[1], data[2]), MeidaHelperKt.twoBytesToUInt(data[3], data[4]), data[5] & 255);
        }
    }

    public ImageFormat(@NotNull ImageCodec imageCodec, int i, int i2, int i3) {
        this.imageCodec = imageCodec;
        this.widthInPixel = i;
        this.heightInPixel = i2;
        this.bitDepth = i3;
    }

    @NotNull
    public final byte[] getBytes() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byteArrayOutputStream.write(this.imageCodec.getCodec());
        byteArrayOutputStream.write(GattUtils.shortToBytes((short) this.widthInPixel));
        byteArrayOutputStream.write(GattUtils.shortToBytes((short) this.heightInPixel));
        byteArrayOutputStream.write(this.bitDepth);
        return byteArrayOutputStream.toByteArray();
    }

    @NotNull
    public String toString() {
        return "ImageFormat(imageCodec=" + this.imageCodec + ", widthInPixel=" + this.widthInPixel + ", heightInPixel=" + this.heightInPixel + ", bitDepth=" + this.bitDepth + ')';
    }
}
