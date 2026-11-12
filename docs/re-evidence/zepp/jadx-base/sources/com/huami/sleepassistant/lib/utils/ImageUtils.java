package com.huami.sleepassistant.lib.utils;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0010\u0010\u0011J \u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0002J\u0010\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\t\u001a\u00020\bJ\u0010\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\r\u001a\u00020\fJ\u000e\u0010\u000f\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\b¨\u0006\u0012"}, d2 = {"Lcom/huami/sleepassistant/lib/utils/ImageUtils;", "", "Landroid/graphics/BitmapFactory$Options;", "options", "", "reqWidth", "reqHeight", "a", "Ljava/io/InputStream;", "inStream", "Landroid/graphics/Bitmap;", "getBitmap", "", "data", "input", "toByteArray", "<init>", "()V", "lib_release"}, k = 1, mv = {1, 5, 1})
public final class ImageUtils {

    @NotNull
    public static final ImageUtils INSTANCE = new ImageUtils();

    private ImageUtils() {
    }

    private final int a(BitmapFactory.Options options, int reqWidth, int reqHeight) {
        int i = options.outWidth;
        int i2 = options.outHeight;
        if (i > reqWidth || i2 > reqHeight) {
            return Math.max(Math.round((i * 1.0f) / reqWidth), Math.round((i2 * 1.0f) / reqHeight));
        }
        return 1;
    }

    @Nullable
    public final Bitmap getBitmap(@NotNull InputStream inStream) {
        return getBitmap(toByteArray(inStream));
    }

    @NotNull
    public final byte[] toByteArray(@NotNull InputStream input) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[4096];
        int i = input.read(bArr);
        while (-1 != i) {
            byteArrayOutputStream.write(bArr, 0, i);
            i = input.read(bArr);
        }
        return byteArrayOutputStream.toByteArray();
    }

    @Nullable
    public final Bitmap getBitmap(@NotNull byte[] data) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeByteArray(data, 0, data.length, options);
        options.inSampleSize = a(options, 180, 180);
        options.inJustDecodeBounds = false;
        return BitmapFactory.decodeByteArray(data, 0, data.length, options);
    }
}
