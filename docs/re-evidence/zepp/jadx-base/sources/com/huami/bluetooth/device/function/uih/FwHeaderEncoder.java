package com.huami.bluetooth.device.function.uih;

import com.xiaomi.hm.health.bt.gatt.GattUtils;
import com.xiaomi.hm.health.bt.profile.dfu.HMFirmwareType;
import com.xiaomi.hm.health.bt.utils.CRCUtilsKt;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\r¢\u0006\u0004\b\u0011\u0010\u0012J0\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004H\u0002J\b\u0010\u000b\u001a\u00020\u0002H\u0016R\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\fR\u0016\u0010\u0010\u001a\u00020\r8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0014"}, d2 = {"Lcom/huami/bluetooth/device/function/uih/FwHeaderEncoder;", "Lcom/huami/bluetooth/device/function/uih/IHeaderEncoder;", "", "path", "", "version", "fwType", "imageSize", "imageCrc", "", "a", "encode", "Ljava/lang/String;", "Lcom/xiaomi/hm/health/bt/profile/dfu/HMFirmwareType;", "b", "Lcom/xiaomi/hm/health/bt/profile/dfu/HMFirmwareType;", "fwTy", "<init>", "(Ljava/lang/String;Lcom/xiaomi/hm/health/bt/profile/dfu/HMFirmwareType;)V", "Companion", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class FwHeaderEncoder implements IHeaderEncoder {
    public static final int BATCH_HEAD_VERSION = 1;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final String path;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final HMFirmwareType fwTy;

    public FwHeaderEncoder(@NotNull String str, @NotNull HMFirmwareType hMFirmwareType) {
        this.path = str;
        this.fwTy = hMFirmwareType;
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
        String strStringPlus = Intrinsics.stringPlus(this.path, ".header");
        a(strStringPlus, 1, this.fwTy.getValue(), (int) new File(this.path).length(), (int) CRCUtilsKt.getCrc32(this.path));
        if (IHeaderEncoderKt.mergeFiles$default(new String[]{this.path}, strStringPlus, false, 4, null)) {
            return strStringPlus;
        }
        throw new Exception("generate fw header file exception");
    }
}
