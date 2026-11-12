package com.xiaomi.hm.health.device.watch_skin;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.xiaomi.hm.health.device.watchskinnew.AndroidBmpUtil;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u000b\u001a\u00020\u0001\u0012\b\b\u0002\u0010\u000f\u001a\u00020\f\u0012\b\b\u0002\u0010\u0011\u001a\u00020\f\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0012¢\u0006\u0004\b\u0016\u0010\u0017J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004H\u0016R\u0016\u0010\u000b\u001a\u00020\u00018\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\nR\u0016\u0010\u000f\u001a\u00020\f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0016\u0010\u0011\u001a\u00020\f8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u000eR\u0016\u0010\u0015\u001a\u00020\u00128\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0018"}, d2 = {"Lcom/xiaomi/hm/health/device/watch_skin/DialBitmapBmpProcessor;", "Lcom/xiaomi/hm/health/device/watch_skin/IDialProcessor;", "Landroid/graphics/Bitmap;", "bitmap", "", "path", "", "a", "originPath", "process", "Lcom/xiaomi/hm/health/device/watch_skin/IDialProcessor;", "processor", "", "b", "Z", "isFromTopToBottom", "c", "withPadding", "", GoogleApiAvailabilityLight.a, LogUtil.I, "bmpType", "<init>", "(Lcom/xiaomi/hm/health/device/watch_skin/IDialProcessor;ZZI)V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class DialBitmapBmpProcessor implements IDialProcessor {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final IDialProcessor processor;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final boolean isFromTopToBottom;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final boolean withPadding;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final int bmpType;

    public DialBitmapBmpProcessor(@NotNull IDialProcessor iDialProcessor, boolean z, boolean z2, int i) {
        this.processor = iDialProcessor;
        this.isFromTopToBottom = z;
        this.withPadding = z2;
        this.bmpType = i;
    }

    private final void a(Bitmap bitmap, String path) {
        AndroidBmpUtil.save(bitmap, path, this.isFromTopToBottom, this.withPadding, this.bmpType);
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
        String str = strProcess + ".bmp";
        a(BitmapFactory.decodeFile(strProcess), str);
        new File(strProcess).delete();
        return str;
    }

    public /* synthetic */ DialBitmapBmpProcessor(IDialProcessor iDialProcessor, boolean z, boolean z2, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(iDialProcessor, (i2 & 2) != 0 ? false : z, (i2 & 4) != 0 ? true : z2, (i2 & 8) != 0 ? 0 : i);
    }
}
