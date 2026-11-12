package com.huami.device.core.agps.comm;

import com.baidu.ocr.sdk.utils.LogUtil;
import com.huami.bluetooth.device.function.uih.IHeaderEncoder;
import com.huami.bluetooth.device.function.uih.IHeaderEncoderKt;
import com.xiaomi.hm.health.bt.gatt.GattUtils;
import com.xiaomi.hm.health.bt.utils.CRCUtilsKt;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\n\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u0004¢\u0006\u0004\b\u0010\u0010\u0011J0\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004H\u0002J\b\u0010\u000b\u001a\u00020\u0002H\u0016R\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\fR\u0016\u0010\u000f\u001a\u00020\u00048\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0013"}, d2 = {"Lcom/huami/device/core/agps/comm/AGPSFwEncoder;", "Lcom/huami/bluetooth/device/function/uih/IHeaderEncoder;", "", "path", "", "version", "fwType", "imageSize", "imageCrc", "", "a", "encode", "Ljava/lang/String;", "b", LogUtil.I, "fwTy", "<init>", "(Ljava/lang/String;I)V", "Companion", "agps-impl_release"}, k = 1, mv = {1, 4, 0})
public final class AGPSFwEncoder implements IHeaderEncoder {
    public static final int BATCH_HEAD_VERSION = 1;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final String path;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final int fwTy;

    public AGPSFwEncoder(@NotNull String str, int i) {
        this.path = str;
        this.fwTy = i;
    }

    private final void a(String path, int version, int fwType, int imageSize, int imageCrc) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byteArrayOutputStream.write(version);
        byteArrayOutputStream.write(fwType);
        byteArrayOutputStream.write(GattUtils.intToBytes(imageSize));
        byteArrayOutputStream.write(GattUtils.intToBytes(imageCrc));
        FileOutputStream fileOutputStream = new FileOutputStream(path);
        fileOutputStream.write(byteArrayOutputStream.toByteArray());
        fileOutputStream.close();
        byteArrayOutputStream.close();
    }

    @Override // com.huami.bluetooth.device.function.uih.IHeaderEncoder
    @NotNull
    /* JADX INFO: renamed from: encode */
    public String getPath() throws Exception {
        String str = this.path + ".header";
        a(str, 1, this.fwTy, (int) new File(this.path).length(), (int) CRCUtilsKt.getCrc32(this.path));
        if (IHeaderEncoderKt.mergeFiles$default(new String[]{this.path}, str, false, 4, null)) {
            return str;
        }
        throw new Exception("generate fw header file exception");
    }
}
