package com.xiaomi.hm.health.device.watch_skin;

import com.huami.devicex.funapi.DeviceXFunctionsKt;
import com.huami.quicklz.QuickLz;
import com.xiaomi.hm.health.baseutil.FileUtils;
import java.io.File;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0007"}, d2 = {"Lcom/xiaomi/hm/health/device/watch_skin/DialDecompressProcessor;", "Lcom/xiaomi/hm/health/device/watch_skin/IDialProcessor;", "", "originPath", "process", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class DialDecompressProcessor implements IDialProcessor {
    @Override // com.xiaomi.hm.health.device.watch_skin.IDialProcessor
    public long finalSize() {
        return IDialProcessor.DefaultImpls.finalSize(this);
    }

    @Override // com.xiaomi.hm.health.device.watch_skin.IDialProcessor
    /* JADX INFO: renamed from: originSize */
    public long getOriginSize() {
        return IDialProcessor.DefaultImpls.originSize(this);
    }

    @Override // com.xiaomi.hm.health.device.watch_skin.IDialProcessor
    @NotNull
    public String process(@NotNull String originPath) {
        File parentFile;
        File appFileDir = FileUtils.getAppFileDir(DeviceXFunctionsKt.getContext());
        String str = File.separator;
        File file = new File(appFileDir + str + WatchSkinManager.WATCH_SKIN_DIAL_PARENT_FILE_NAME + str + "de.bin");
        if (file.exists()) {
            file.delete();
        }
        File parentFile2 = file.getParentFile();
        boolean z = false;
        if (parentFile2 != null && !parentFile2.exists()) {
            z = true;
        }
        if (z && (parentFile = file.getParentFile()) != null) {
            parentFile.mkdir();
        }
        new QuickLz().decompress(originPath, file.getAbsolutePath());
        return file.getAbsolutePath();
    }
}
