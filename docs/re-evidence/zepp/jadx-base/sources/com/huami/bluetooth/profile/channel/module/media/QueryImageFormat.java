package com.huami.bluetooth.profile.channel.module.media;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.xiaomi.hm.health.bt.gatt.GattUtils;
import java.io.ByteArrayOutputStream;
import java.nio.charset.Charset;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\f\u0010\rJ\u0006\u0010\u0003\u001a\u00020\u0002R\u0016\u0010\u0007\u001a\u00020\u00048\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0016\u0010\u000b\u001a\u00020\b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000f"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/media/QueryImageFormat;", "", "", "getBytes", "Lcom/huami/bluetooth/profile/channel/module/media/MediaSource;", "a", "Lcom/huami/bluetooth/profile/channel/module/media/MediaSource;", "source", "", "b", "Ljava/lang/String;", "destination", "<init>", "(Lcom/huami/bluetooth/profile/channel/module/media/MediaSource;Ljava/lang/String;)V", "Companion", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class QueryImageFormat {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int QUERY_IMAGE_FORMAT = 1;
    public static final int RESPONSE_IMAGE_FORMAT = 2;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final MediaSource source;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final String destination;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0016\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0016\u0010\t\u001a\u00020\u00068\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\b¨\u0006\f"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/media/QueryImageFormat$Companion;", "", "", "data", "Lcom/huami/bluetooth/profile/channel/module/media/ImageFormat;", "fromBytes", "", "QUERY_IMAGE_FORMAT", LogUtil.I, "RESPONSE_IMAGE_FORMAT", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Nullable
        public final ImageFormat fromBytes(@NotNull byte[] data) {
            byte b = data[0];
            MeidaHelperKt.twoBytesToUInt(data[1], data[2]);
            int iFindStringEndIndex = MeidaHelperKt.findStringEndIndex(data, 3);
            MeidaHelperKt.decodeToString(data, 3, iFindStringEndIndex);
            int i = iFindStringEndIndex + 1;
            int i2 = i + 1;
            if (data[i] != 1) {
                return null;
            }
            int i3 = i2 + 1;
            int i4 = data[i2] & 255;
            int i5 = i3 + 1;
            int i6 = i5 + 1;
            int iTwoBytesToUInt = MeidaHelperKt.twoBytesToUInt(data[i3], data[i5]);
            int i7 = i6 + 1;
            int i8 = i7 + 1;
            return new ImageFormat(ImageCodec.INSTANCE.form(i4), iTwoBytesToUInt, MeidaHelperKt.twoBytesToUInt(data[i6], data[i7]), data[i8] & 255);
        }
    }

    public QueryImageFormat(@NotNull MediaSource mediaSource, @NotNull String str) {
        this.source = mediaSource;
        this.destination = str;
    }

    @NotNull
    public final byte[] getBytes() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byteArrayOutputStream.write(1);
        byteArrayOutputStream.write(GattUtils.shortToBytes((short) this.source.getSource()));
        String str = this.destination;
        Charset charset = Charsets.UTF_8;
        Objects.requireNonNull(str, "null cannot be cast to non-null type java.lang.String");
        byteArrayOutputStream.write(str.getBytes(charset));
        byteArrayOutputStream.write(0);
        return byteArrayOutputStream.toByteArray();
    }
}
