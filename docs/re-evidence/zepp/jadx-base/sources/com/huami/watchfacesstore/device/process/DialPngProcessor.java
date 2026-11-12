package com.huami.watchfacesstore.device.process;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0016\u0010\u0007\u001a\u00020\u00018\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/huami/watchfacesstore/device/process/DialPngProcessor;", "Lcom/huami/watchfacesstore/device/process/IDialProcessor;", "", "originPath", "process", "a", "Lcom/huami/watchfacesstore/device/process/IDialProcessor;", "processor", "<init>", "(Lcom/huami/watchfacesstore/device/process/IDialProcessor;)V", "lib_release"}, k = 1, mv = {1, 5, 1})
public final class DialPngProcessor implements IDialProcessor {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final IDialProcessor processor;

    public DialPngProcessor(@NotNull IDialProcessor iDialProcessor) {
        this.processor = iDialProcessor;
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
    public String process(@NotNull String originPath) {
        String strProcess = this.processor.process(originPath);
        Bitmap bitmapDecodeFile = BitmapFactory.decodeFile(strProcess);
        bitmapDecodeFile.setHasAlpha(true);
        return BitmapUtils.INSTANCE.saveBitmap(bitmapDecodeFile, strProcess + ".png");
    }
}
