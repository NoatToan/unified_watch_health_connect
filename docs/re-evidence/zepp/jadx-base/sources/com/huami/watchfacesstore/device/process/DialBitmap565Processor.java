package com.huami.watchfacesstore.device.process;

import java.io.File;
import java.io.IOException;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\t\u001a\u00020\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0002J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0016\u0010\t\u001a\u00020\u00018\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\b¨\u0006\f"}, d2 = {"Lcom/huami/watchfacesstore/device/process/DialBitmap565Processor;", "Lcom/huami/watchfacesstore/device/process/IDialProcessor;", "", "originPath", "targetPath", "", "a", "process", "Lcom/huami/watchfacesstore/device/process/IDialProcessor;", "processor", "<init>", "(Lcom/huami/watchfacesstore/device/process/IDialProcessor;)V", "lib_release"}, k = 1, mv = {1, 5, 1})
public final class DialBitmap565Processor implements IDialProcessor {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final IDialProcessor processor;

    public DialBitmap565Processor(@NotNull IDialProcessor iDialProcessor) {
        this.processor = iDialProcessor;
    }

    private final void a(String originPath, String targetPath) throws IOException {
        File file = new File(targetPath);
        if (file.exists()) {
            file.delete();
        }
        BmpConverter.writeBmp565(originPath, targetPath);
    }

    @Override // com.huami.watchfacesstore.device.process.IDialProcessor
    public long finalSize() {
        return IDialProcessor.DefaultImpls.finalSize(this);
    }

    @Override // com.huami.watchfacesstore.device.process.IDialProcessor
    /* JADX INFO: renamed from: originSize */
    public long getOriginSize() {
        return IDialProcessor.DefaultImpls.originSize(this);
    }

    @Override // com.huami.watchfacesstore.device.process.IDialProcessor
    @NotNull
    public String process(@NotNull String originPath) throws IOException {
        String strProcess = this.processor.process(originPath);
        String str = strProcess + ".565";
        a(strProcess, str);
        new File(strProcess).delete();
        return str;
    }
}
