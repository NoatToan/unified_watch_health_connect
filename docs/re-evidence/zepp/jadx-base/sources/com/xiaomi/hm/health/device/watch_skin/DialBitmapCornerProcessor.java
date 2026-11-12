package com.xiaomi.hm.health.device.watch_skin;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.baidu.ocr.sdk.utils.LogUtil;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0001\u0012\u0006\u0010\u000b\u001a\u00020\b¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0016\u0010\u0007\u001a\u00020\u00018\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0016\u0010\u000b\u001a\u00020\b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000e"}, d2 = {"Lcom/xiaomi/hm/health/device/watch_skin/DialBitmapCornerProcessor;", "Lcom/xiaomi/hm/health/device/watch_skin/IDialProcessor;", "", "originPath", "process", "a", "Lcom/xiaomi/hm/health/device/watch_skin/IDialProcessor;", "processor", "", "b", LogUtil.I, "cornerRadius", "<init>", "(Lcom/xiaomi/hm/health/device/watch_skin/IDialProcessor;I)V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class DialBitmapCornerProcessor implements IDialProcessor {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final IDialProcessor processor;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final int cornerRadius;

    public DialBitmapCornerProcessor(@NotNull IDialProcessor iDialProcessor, int i) {
        this.processor = iDialProcessor;
        this.cornerRadius = i;
    }

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
        String strProcess = this.processor.process(originPath);
        Bitmap bitmapDecodeFile = BitmapFactory.decodeFile(strProcess);
        String str = strProcess + ".corner";
        BitmapUtils bitmapUtils = BitmapUtils.INSTANCE;
        return bitmapUtils.saveBitmap(bitmapUtils.filler(bitmapDecodeFile, this.cornerRadius, bitmapUtils.getCORNER_ALL()), str);
    }
}
