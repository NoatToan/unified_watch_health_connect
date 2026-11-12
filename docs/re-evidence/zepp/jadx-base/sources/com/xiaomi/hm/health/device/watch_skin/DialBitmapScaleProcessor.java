package com.xiaomi.hm.health.device.watch_skin;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.huami.tools.log.HMLog;
import com.ingenic.iwds.HardwareList;
import com.xiaomi.hm.health.utils.UtilsKt;
import java.io.FileOutputStream;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u0007\n\u0002\b\t\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB#\u0012\u0006\u0010\u0010\u001a\u00020\u0004\u0012\u0006\u0010\u0012\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0019\u0010\u001aJ \u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0002J\u0018\u0010\n\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0002J\u0010\u0010\f\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\bH\u0016R\u0019\u0010\u0010\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\n\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0012\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0007\u0010\r\u001a\u0004\b\u0011\u0010\u000fR\u001b\u0010\u0018\u001a\u0004\u0018\u00010\u00138\u0006@\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001c"}, d2 = {"Lcom/xiaomi/hm/health/device/watch_skin/DialBitmapScaleProcessor;", "Lcom/xiaomi/hm/health/device/watch_skin/IDialProcessor;", "Landroid/graphics/Bitmap;", "bitmap", "", "targetWidth", "targetHeight", "b", "", "path", "a", "originPath", "process", LogUtil.I, "getWidth", "()I", ViewHierarchyConstants.DIMENSION_WIDTH_KEY, "getHeight", "height", "", "c", "Ljava/lang/Float;", "getRound", "()Ljava/lang/Float;", HardwareList.VALUE_LCD_EXTERIOR_ROUND, "<init>", "(IILjava/lang/Float;)V", "Companion", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class DialBitmapScaleProcessor implements IDialProcessor {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String d = com.huami.watchfacesstore.device.process.DialBitmapScaleProcessor.TAG;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final int width;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final int height;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    private final Float round;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bR\u001c\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086D¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/xiaomi/hm/health/device/watch_skin/DialBitmapScaleProcessor$Companion;", "", "", "TAG", "Ljava/lang/String;", "getTAG", "()Ljava/lang/String;", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final String getTAG() {
            return DialBitmapScaleProcessor.d;
        }
    }

    public DialBitmapScaleProcessor(int i, int i2, @Nullable Float f) {
        this.width = i;
        this.height = i2;
        this.round = f;
    }

    private final String a(Bitmap bitmap, String path) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream(path);
        bitmap.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream);
        fileOutputStream.close();
        return path;
    }

    private final Bitmap b(Bitmap bitmap, int targetWidth, int targetHeight) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        Matrix matrix = new Matrix();
        matrix.postScale(targetWidth / width, targetHeight / height);
        return Bitmap.createBitmap(bitmap, 0, 0, width, height, matrix, true);
    }

    @Override // com.xiaomi.hm.health.device.watch_skin.IDialProcessor
    public long finalSize() {
        return IDialProcessor.DefaultImpls.finalSize(this);
    }

    public final int getHeight() {
        return this.height;
    }

    @Nullable
    public final Float getRound() {
        return this.round;
    }

    public final int getWidth() {
        return this.width;
    }

    @Override // com.xiaomi.hm.health.device.watch_skin.IDialProcessor
    /* JADX INFO: renamed from: originSize */
    public long getOriginSize() {
        return IDialProcessor.DefaultImpls.originSize(this);
    }

    @Override // com.xiaomi.hm.health.device.watch_skin.IDialProcessor
    @NotNull
    public String process(@NotNull String originPath) {
        Bitmap bitmapDecodeFile = BitmapFactory.decodeFile(originPath);
        String str = d;
        HMLog.i(str, "width: " + bitmapDecodeFile.getWidth() + ", height: " + bitmapDecodeFile.getHeight(), new Object[0]);
        Float f = this.round;
        float fFloatValue = f == null ? 0.0f : f.floatValue();
        Bitmap bitmapClipRoundedCornerBitmap = !((fFloatValue > 0.0f ? 1 : (fFloatValue == 0.0f ? 0 : -1)) == 0) ? UtilsKt.clipRoundedCornerBitmap(b(bitmapDecodeFile, this.width, this.height), fFloatValue) : b(bitmapDecodeFile, this.width, this.height);
        if (bitmapClipRoundedCornerBitmap == null) {
            return "";
        }
        HMLog.i(str, "newWidth: " + bitmapClipRoundedCornerBitmap.getWidth() + ", newHeight: " + bitmapClipRoundedCornerBitmap.getHeight(), new Object[0]);
        bitmapDecodeFile.recycle();
        return a(bitmapClipRoundedCornerBitmap, originPath + ".scaled" + this.width + "x" + this.height);
    }

    public /* synthetic */ DialBitmapScaleProcessor(int i, int i2, Float f, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i2, (i3 & 4) != 0 ? null : f);
    }
}
