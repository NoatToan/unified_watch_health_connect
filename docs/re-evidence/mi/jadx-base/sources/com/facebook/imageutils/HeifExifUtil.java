package com.facebook.imageutils;

import android.media.ExifInterface;
import androidx.annotation.RequiresApi;
import defpackage.cm8;
import defpackage.u07;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes4.dex */
public class HeifExifUtil {

    @u07
    public static class HeifExifUtilAndroidN {
        private HeifExifUtilAndroidN() {
        }

        @RequiresApi(api = 24)
        public static int a(InputStream inputStream) {
            try {
                return new ExifInterface(inputStream).getAttributeInt("Orientation", 1);
            } catch (IOException e) {
                cm8.d("HeifExifUtil", "Failed reading Heif Exif orientation -> ignoring", e);
                return 0;
            }
        }
    }

    public static int a(InputStream inputStream) {
        return HeifExifUtilAndroidN.a(inputStream);
    }
}
