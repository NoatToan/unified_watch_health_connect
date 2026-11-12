package com.xiaomi.hm.health.bodyfat.utils;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import androidx.core.internal.view.SupportMenu;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import java.io.ByteArrayOutputStream;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.ranges.IntRange;
import kotlin.text.StringsKt___StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\u001a\u001e\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002¨\u0006\u0007"}, d2 = {"", "content", "", ViewHierarchyConstants.DIMENSION_WIDTH_KEY, "height", "", "textToDotMatrix", "bodyfat_midongRelease"}, k = 2, mv = {1, 5, 1})
public final class DotMatrixUtilsKt {
    @NotNull
    public static final byte[] textToDotMatrix(@NotNull String str, int i, int i2) {
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        canvas.drawColor(-1);
        Paint paint = new Paint();
        paint.setTextAlign(Paint.Align.CENTER);
        paint.setStyle(Paint.Style.FILL);
        Typeface typefaceCreate = Typeface.create("宋体", 0);
        paint.setColor(SupportMenu.CATEGORY_MASK);
        paint.setTypeface(typefaceCreate);
        float f = i2;
        paint.setTextSize(f);
        Paint.FontMetrics fontMetrics = paint.getFontMetrics();
        float f2 = 2;
        canvas.drawText(str.length() <= 3 ? str : StringsKt___StringsKt.slice(str, new IntRange(0, 2)), i / 2.0f, ((f / 2.0f) - (fontMetrics.top / f2)) - (fontMetrics.bottom / f2), paint);
        int i3 = i * i2;
        int[] iArr = new int[i3];
        bitmapCreateBitmap.getPixels(iArr, 0, i, 0, 0, i, i2);
        int i4 = (i2 / 8) + (i2 % 8 > 0 ? 1 : 0);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        if (i4 > 0) {
            int i5 = 0;
            while (true) {
                int i6 = i5 + 1;
                if (i > 0) {
                    int i7 = 0;
                    while (true) {
                        int i8 = i7 + 1;
                        int i9 = i5 * i * 8;
                        int i10 = 0;
                        int i11 = 0;
                        while (true) {
                            int i12 = i10 + 1;
                            int i13 = i9 + i7 + (i10 * i);
                            if (i13 < i3 && iArr[i13] == -65536) {
                                i11 |= 1 << i10;
                            }
                            if (i12 > 8) {
                                break;
                            }
                            i10 = i12;
                        }
                        byteArrayOutputStream.write(i11);
                        if (i8 >= i) {
                            break;
                        }
                        i7 = i8;
                    }
                }
                if (i6 >= i4) {
                    break;
                }
                i5 = i6;
            }
        }
        int size = byteArrayOutputStream.size();
        return size > 255 ? new byte[]{0} : ArraysKt___ArraysJvmKt.plus(new byte[]{(byte) size}, byteArrayOutputStream.toByteArray());
    }
}
