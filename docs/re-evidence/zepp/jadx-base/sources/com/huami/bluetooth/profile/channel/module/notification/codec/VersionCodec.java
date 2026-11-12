package com.huami.bluetooth.profile.channel.module.notification.codec;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.huami.bluetooth.profile.channel.module.base.ModuleResult;
import com.huami.bluetooth.profile.channel.module.base.ResponseCodec;
import com.huami.bluetooth.profile.channel.module.base.ResponseCodecKt;
import com.huami.bluetooth.profile.channel.module.notification.Log;
import com.huami.bluetooth.profile.channel.module.notification.NotificationVersion;
import com.huami.bluetooth.utils.BufByteDecoder;
import com.huami.tools.log.HMLog;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u001c\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0004H\u0016J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0003H\u0016R\u0016\u0010\f\u001a\u00020\t8\u0002@\u0002X\u0082D¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0016\u0010\u0010\u001a\u00020\r8\u0002@\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0013"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/notification/codec/VersionCodec;", "Lcom/huami/bluetooth/profile/channel/module/base/ResponseCodec;", "Lcom/huami/bluetooth/profile/channel/module/notification/NotificationVersion;", "", "Lcom/huami/bluetooth/profile/channel/module/base/ModuleResult;", "originResponse", "decode", "value", "encode", "", "a", "Ljava/lang/String;", "logTag", "", "b", LogUtil.I, "tagSupport", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class VersionCodec implements ResponseCodec<NotificationVersion, byte[]> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final String logTag = Log.logTag;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final int tagSupport = 1;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ int a;
        public final /* synthetic */ int b;
        public final /* synthetic */ int c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i, int i2, int i3) {
            super(0);
            this.a = i;
            this.b = i2;
            this.c = i3;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "decode type:" + this.a + " version: " + this.b + " max: " + this.c;
        }
    }

    @Override // com.huami.bluetooth.profile.channel.module.base.Codec
    @NotNull
    public byte[] encode(@NotNull NotificationVersion value) {
        return new byte[0];
    }

    @Override // com.huami.bluetooth.profile.channel.module.base.ResponseCodec
    @NotNull
    public ModuleResult<NotificationVersion> decode(@NotNull ModuleResult<byte[]> originResponse) {
        return ResponseCodecKt.defaultResponseDecode(this, originResponse);
    }

    @Override // com.huami.bluetooth.profile.channel.module.base.Codec
    @NotNull
    public NotificationVersion decode(@NotNull byte[] value) {
        int i;
        int i2 = 0;
        BufByteDecoder bufByteDecoder = new BufByteDecoder(value, 0, 2, null);
        int i3 = bufByteDecoder.readByte();
        int i4 = bufByteDecoder.readByte();
        int i5 = bufByteDecoder.readShort();
        HMLog.info(this.logTag, new a(i3, i4, i5));
        if (i4 == 1 || i4 == 2) {
            return new NotificationVersion(i4, i5, false, false, null, 28, null);
        }
        if (i4 != 3) {
            boolean z = bufByteDecoder.readByte() == this.tagSupport;
            boolean z2 = bufByteDecoder.readByte() == this.tagSupport;
            ArrayList arrayList = new ArrayList();
            if (z2 && (i = bufByteDecoder.readShort()) > 0) {
                do {
                    i2++;
                    arrayList.add(Integer.valueOf(bufByteDecoder.readByte()));
                } while (i2 < i);
            }
            return new NotificationVersion(i4, i5, z, z2, arrayList);
        }
        return new NotificationVersion(i4, i5, bufByteDecoder.readByte() == this.tagSupport, false, null, 24, null);
    }
}
