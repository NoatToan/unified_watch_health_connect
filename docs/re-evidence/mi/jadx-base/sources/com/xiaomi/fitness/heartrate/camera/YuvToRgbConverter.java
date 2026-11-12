package com.xiaomi.fitness.heartrate.camera;

import android.graphics.Bitmap;
import android.graphics.Color;
import androidx.camera.core.m;
import androidx.work.WorkInfo;
import com.xiaomi.fitness.common.utils.ByteUtilKt;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b$\u0010%JO\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\r\u0010\u000eJO\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J'\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0019\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010\r\u001a\u00020\f2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b¢\u0006\u0004\b\r\u0010 J\u0017\u0010!\u001a\u00020\u000f2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b¢\u0006\u0004\b!\u0010\"J%\u0010#\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0012¢\u0006\u0004\b#\u0010\u0017¨\u0006&"}, d2 = {"Lcom/xiaomi/fitness/heartrate/camera/YuvToRgbConverter;", "", "Ljava/nio/ByteBuffer;", "yBuf", "uBuf", "vBuf", "", "yRowStride", "uvRowStride", "uvPixelStride", "realWidth", "realHeight", "", "yuvToRgbArr", "(Ljava/nio/ByteBuffer;Ljava/nio/ByteBuffer;Ljava/nio/ByteBuffer;IIIII)[I", "", "yuv2AvgRgb", "(Ljava/nio/ByteBuffer;Ljava/nio/ByteBuffer;Ljava/nio/ByteBuffer;IIIII)[F", "", "Y", "U", "V", "yuv2rgb", "(BBB)I", "num", "clip", "(I)I", "Landroidx/camera/core/m;", "image", "Landroid/graphics/Bitmap;", "yuvToBitmap", "(Landroidx/camera/core/m;)Landroid/graphics/Bitmap;", "(Landroidx/camera/core/m;)[I", "yuvToAvgColor", "(Landroidx/camera/core/m;)[F", "yuv2rgb2", "<init>", "()V", "heartrate_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nYuvToRgbConverter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 YuvToRgbConverter.kt\ncom/xiaomi/fitness/heartrate/camera/YuvToRgbConverter\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,204:1\n1#2:205\n*E\n"})
public final class YuvToRgbConverter {

    @NotNull
    public static final YuvToRgbConverter INSTANCE = new YuvToRgbConverter();

    private YuvToRgbConverter() {
    }

    private final int clip(int num) {
        if (num < 0) {
            return 0;
        }
        if (num > 255) {
            return 255;
        }
        return num;
    }

    private final float[] yuv2AvgRgb(ByteBuffer yBuf, ByteBuffer uBuf, ByteBuffer vBuf, int yRowStride, int uvRowStride, int uvPixelStride, int realWidth, int realHeight) {
        int i = 2;
        int iLimit = yBuf.limit();
        long jRed = 0;
        long jGreen = 0;
        long jBlue = 0;
        int i2 = 0;
        while (i2 < iLimit) {
            int i3 = i2 / yRowStride;
            int i4 = i2 % yRowStride;
            if (i4 < realWidth) {
                int i5 = ((i3 / i) * uvRowStride) + ((i4 / i) * uvPixelStride);
                int iYuv2rgb = yuv2rgb(yBuf.get(i2), uBuf.get(i5), vBuf.get(i5));
                jRed += (long) Color.red(iYuv2rgb);
                jGreen += (long) Color.green(iYuv2rgb);
                jBlue += (long) Color.blue(iYuv2rgb);
            }
            i2++;
            i = 2;
        }
        float f = realWidth * realHeight;
        return new float[]{(jRed * 1.0f) / f, (jGreen * 1.0f) / f, (jBlue * 1.0f) / f};
    }

    private final int yuv2rgb(byte Y, byte U, byte V) {
        int iAnd = (int) (((double) ByteUtilKt.and(Y, 255)) + (((double) (ByteUtilKt.and(V, 255) + WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT)) * 1.4075d));
        int iAnd2 = (int) ((((double) ByteUtilKt.and(Y, 255)) - (((double) (ByteUtilKt.and(U, 255) + WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT)) * 0.3455d)) - (((double) (ByteUtilKt.and(V, 255) + WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT)) * 0.7169d));
        int iAnd3 = (int) (((double) ByteUtilKt.and(Y, 255)) + (((double) (ByteUtilKt.and(U, 255) + WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT)) * 1.779d));
        int iClip = clip(iAnd);
        int iClip2 = clip(iAnd2);
        return (clip(iAnd3) & 255) | ((iClip << 16) & 16711680) | (-16777216) | ((iClip2 << 8) & 65280);
    }

    public final int yuv2rgb2(byte Y, byte U, byte V) {
        int i = (Y & 255) - 16;
        int i2 = 0;
        if (i < 0) {
            i = 0;
        }
        int i3 = (U & 255) + WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT;
        int i4 = (V & 255) + WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT;
        int i5 = i * 1192;
        int i6 = (i4 * 1634) + i5;
        int i7 = (i5 - (i4 * 833)) - (i3 * 400);
        int i8 = i5 + (i3 * 2066);
        if (i6 < 0) {
            i6 = 0;
        } else if (i6 > 262143) {
            i6 = 262143;
        }
        if (i7 < 0) {
            i7 = 0;
        } else if (i7 > 262143) {
            i7 = 262143;
        }
        if (i8 >= 0) {
            i2 = i8 > 262143 ? 262143 : i8;
        }
        return ((i6 << 6) & 16711680) | (-16777216) | ((i7 >> 2) & 65280) | ((i2 >> 10) & 255);
    }

    @NotNull
    public final float[] yuvToAvgColor(@Nullable m image) {
        if (image == null) {
            return new float[]{0.0f, 0.0f, 0.0f};
        }
        m.a[] aVarArrX = image.x();
        Intrinsics.checkNotNullExpressionValue(aVarArrX, "getPlanes(...)");
        m.a aVar = aVarArrX[0];
        m.a aVar2 = aVarArrX[1];
        m.a aVar3 = aVarArrX[2];
        ByteBuffer buffer = aVar.getBuffer();
        Intrinsics.checkNotNullExpressionValue(buffer, "getBuffer(...)");
        ByteBuffer buffer2 = aVar2.getBuffer();
        Intrinsics.checkNotNullExpressionValue(buffer2, "getBuffer(...)");
        ByteBuffer buffer3 = aVar3.getBuffer();
        Intrinsics.checkNotNullExpressionValue(buffer3, "getBuffer(...)");
        int iB = aVar.b();
        int iB2 = aVar2.b();
        int iB3 = aVar3.b();
        if (iB != 1 || iB2 != iB3) {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String str = String.format(Locale.US, "yStride = %d, uStride = %d, vStride = %d", Arrays.copyOf(new Object[]{Integer.valueOf(iB), Integer.valueOf(iB2), Integer.valueOf(iB3)}, 3));
            Intrinsics.checkNotNullExpressionValue(str, "format(...)");
            throw new IllegalStateException(str);
        }
        int iA = aVar.a();
        int iA2 = aVar2.a();
        int iA3 = aVar3.a();
        if (iA2 == iA3) {
            return yuv2AvgRgb(buffer, buffer2, buffer3, iA, iA2, iB2, Math.min(image.getWidth(), iA), Math.min(image.getHeight(), iA2));
        }
        StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
        String str2 = String.format(Locale.US, "yRow = %d, uRow = %d, vRow = %d", Arrays.copyOf(new Object[]{Integer.valueOf(iA), Integer.valueOf(iA2), Integer.valueOf(iA3)}, 3));
        Intrinsics.checkNotNullExpressionValue(str2, "format(...)");
        throw new IllegalStateException(str2);
    }

    @Nullable
    public final Bitmap yuvToBitmap(@Nullable m image) {
        if (image == null) {
            return null;
        }
        return Bitmap.createBitmap(yuvToRgbArr(image), image.k0().width(), image.k0().height(), Bitmap.Config.ARGB_8888);
    }

    @NotNull
    public final int[] yuvToRgbArr(@Nullable m image) {
        if (image == null) {
            return new int[0];
        }
        m.a[] aVarArrX = image.x();
        Intrinsics.checkNotNullExpressionValue(aVarArrX, "getPlanes(...)");
        m.a aVar = aVarArrX[0];
        m.a aVar2 = aVarArrX[1];
        m.a aVar3 = aVarArrX[2];
        ByteBuffer buffer = aVar.getBuffer();
        Intrinsics.checkNotNullExpressionValue(buffer, "getBuffer(...)");
        ByteBuffer buffer2 = aVar2.getBuffer();
        Intrinsics.checkNotNullExpressionValue(buffer2, "getBuffer(...)");
        ByteBuffer buffer3 = aVar3.getBuffer();
        Intrinsics.checkNotNullExpressionValue(buffer3, "getBuffer(...)");
        int iB = aVar.b();
        int iB2 = aVar2.b();
        int iB3 = aVar3.b();
        if (iB != 1 || iB2 != iB3) {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String str = String.format(Locale.US, "yStride = %d, uStride = %d, vStride = %d", Arrays.copyOf(new Object[]{Integer.valueOf(iB), Integer.valueOf(iB2), Integer.valueOf(iB3)}, 3));
            Intrinsics.checkNotNullExpressionValue(str, "format(...)");
            throw new IllegalStateException(str);
        }
        int iA = aVar.a();
        int iA2 = aVar2.a();
        int iA3 = aVar3.a();
        if (iA2 == iA3) {
            return yuvToRgbArr(buffer, buffer2, buffer3, iA, iA2, iB2, Math.min(image.getWidth(), iA), Math.min(image.getHeight(), iA2));
        }
        StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
        String str2 = String.format(Locale.US, "yRow = %d, uRow = %d, vRow = %d", Arrays.copyOf(new Object[]{Integer.valueOf(iA), Integer.valueOf(iA2), Integer.valueOf(iA3)}, 3));
        Intrinsics.checkNotNullExpressionValue(str2, "format(...)");
        throw new IllegalStateException(str2);
    }

    private final int[] yuvToRgbArr(ByteBuffer yBuf, ByteBuffer uBuf, ByteBuffer vBuf, int yRowStride, int uvRowStride, int uvPixelStride, int realWidth, int realHeight) {
        int[] iArr = new int[realHeight * realWidth];
        int iLimit = yBuf.limit();
        int i = 0;
        for (int i2 = 0; i2 < iLimit; i2++) {
            int i3 = i2 / yRowStride;
            int i4 = i2 % yRowStride;
            if (i4 < realWidth) {
                int i5 = ((i3 / 2) * uvRowStride) + ((i4 / 2) * uvPixelStride);
                iArr[i] = yuv2rgb(yBuf.get(i2), uBuf.get(i5), vBuf.get(i5));
                i++;
            }
        }
        return iArr;
    }
}
