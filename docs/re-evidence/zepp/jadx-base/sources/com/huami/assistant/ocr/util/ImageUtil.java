package com.huami.assistant.ocr.util;

import android.graphics.BitmapFactory;
import com.huami.watch.util.Log;

/* JADX INFO: loaded from: classes5.dex */
public class ImageUtil {
    private static final String a = "CameraExif";

    private static int a(byte[] bytes, int offset, int length, boolean littleEndian) {
        int i;
        if (littleEndian) {
            offset += length - 1;
            i = -1;
        } else {
            i = 1;
        }
        int i2 = 0;
        while (true) {
            int i3 = length - 1;
            if (length <= 0) {
                return i2;
            }
            i2 = (bytes[offset] & 255) | (i2 << 8);
            offset += i;
            length = i3;
        }
    }

    public static int calculateInSampleSize(BitmapFactory.Options options, int reqWidth, int reqHeight) {
        int i = options.outHeight;
        int i2 = options.outWidth;
        int i3 = 1;
        if (i > reqHeight || i2 > reqWidth) {
            int i4 = i / 2;
            int i5 = i2 / 2;
            while (i4 / i3 >= reqHeight && i5 / i3 >= reqWidth) {
                i3 *= 2;
            }
        }
        return i3;
    }

    public static int exifToDegrees(int exifOrientation) {
        if (exifOrientation == 6) {
            return 90;
        }
        if (exifOrientation == 3) {
            return 180;
        }
        return exifOrientation == 8 ? 270 : 0;
    }

    /* JADX WARN: Code duplicated, block: B:42:0x006c  */
    /* JADX WARN: Code duplicated, block: B:50:0x0085  */
    public static int getOrientation(byte[] jpeg) {
        int i;
        int iA;
        int iA2;
        int i2;
        if (jpeg == null) {
            return 0;
        }
        int i3 = 0;
        while (true) {
            if (i3 + 3 < jpeg.length) {
                int i4 = i3 + 1;
                if ((jpeg[i3] & 255) == 255) {
                    int i5 = jpeg[i4] & 255;
                    if (i5 != 255) {
                        i4++;
                        if (i5 != 216 && i5 != 1) {
                            if (i5 != 217 && i5 != 218) {
                                int iA3 = a(jpeg, i4, 2, false);
                                if (iA3 < 2 || (i2 = i4 + iA3) > jpeg.length) {
                                    Log.e(a, "Invalid length", new Object[0]);
                                    return 0;
                                }
                                if (i5 == 225 && iA3 >= 8 && a(jpeg, i4 + 2, 4, false) == 1165519206 && a(jpeg, i4 + 6, 2, false) == 0) {
                                    i3 = i4 + 8;
                                    i = iA3 - 8;
                                } else {
                                    i3 = i2;
                                }
                            }
                            if (i > 8) {
                                iA = a(jpeg, i3, 4, false);
                                if (iA == 1229531648 && iA != 1296891946) {
                                    Log.e(a, "Invalid byte order", new Object[0]);
                                    return 0;
                                }
                                boolean z = iA == 1229531648;
                                iA2 = a(jpeg, i3 + 4, 4, z) + 2;
                                if (iA2 >= 10 || iA2 > i) {
                                    Log.e(a, "Invalid offset", new Object[0]);
                                    return 0;
                                }
                                int i6 = i3 + iA2;
                                int i7 = i - iA2;
                                int iA4 = a(jpeg, i6 - 2, 2, z);
                                while (true) {
                                    int i8 = iA4 - 1;
                                    if (iA4 <= 0 || i7 < 12) {
                                        break;
                                    }
                                    if (a(jpeg, i6, 2, z) == 274) {
                                        int iA5 = a(jpeg, i6 + 8, 2, z);
                                        if (iA5 == 3) {
                                            return 180;
                                        }
                                        if (iA5 != 6) {
                                            return iA5 != 8 ? 0 : 270;
                                        }
                                        return 90;
                                    }
                                    i6 += 12;
                                    i7 -= 12;
                                    iA4 = i8;
                                }
                            }
                            Log.i(a, "Orientation not found", new Object[0]);
                            return 0;
                        }
                    }
                    i3 = i4;
                }
                i3 = i4;
            }
            i = 0;
            if (i > 8) {
                iA = a(jpeg, i3, 4, false);
                if (iA == 1229531648) {
                }
                if (iA == 1229531648) {
                }
                iA2 = a(jpeg, i3 + 4, 4, z) + 2;
                if (iA2 >= 10) {
                }
                Log.e(a, "Invalid offset", new Object[0]);
                return 0;
            }
            Log.i(a, "Orientation not found", new Object[0]);
            return 0;
        }
    }
}
