package com.xiaomi.hm.health.device.watch_skin;

import com.huami.quicklz.QuickLz;
import java.io.File;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\t\u001a\u00020\u0001¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0016R\u0016\u0010\t\u001a\u00020\u00018\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Lcom/xiaomi/hm/health/device/watch_skin/DialCompressComProcessor;", "Lcom/xiaomi/hm/health/device/watch_skin/IDialProcessor;", "", "originSize", "", "originPath", "process", "a", "Lcom/xiaomi/hm/health/device/watch_skin/IDialProcessor;", "processor", "b", "J", "<init>", "(Lcom/xiaomi/hm/health/device/watch_skin/IDialProcessor;)V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class DialCompressComProcessor implements IDialProcessor {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final IDialProcessor processor;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private long originSize;

    public DialCompressComProcessor(@NotNull IDialProcessor iDialProcessor) {
        this.processor = iDialProcessor;
    }

    @Override // com.xiaomi.hm.health.device.watch_skin.IDialProcessor
    public long finalSize() {
        return IDialProcessor.DefaultImpls.finalSize(this);
    }

    @Override // com.xiaomi.hm.health.device.watch_skin.IDialProcessor
    /* JADX INFO: renamed from: originSize, reason: from getter */
    public long getOriginSize() {
        return this.originSize;
    }

    @Override // com.xiaomi.hm.health.device.watch_skin.IDialProcessor
    @NotNull
    public String process(@NotNull String originPath) {
        String strProcess = this.processor.process(originPath);
        File file = new File(strProcess);
        if (file.exists()) {
            this.originSize = file.length();
        }
        String str = strProcess + ".co";
        new QuickLz().compress(strProcess, str);
        new File(strProcess).delete();
        return str;
    }
}
