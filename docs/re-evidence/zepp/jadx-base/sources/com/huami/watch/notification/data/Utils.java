package com.huami.watch.notification.data;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import java.io.ByteArrayOutputStream;
import java.util.Arrays;

/* JADX INFO: loaded from: classes16.dex */
public final class Utils {

    public static class BitmapExtender {
        public Bitmap bitmap;
        public boolean canRecycle = true;
    }

    private Utils() {
    }

    private static Bitmap a(Drawable drawable) {
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(intrinsicWidth, intrinsicHeight, drawable.getOpacity() == -1 ? Bitmap.Config.RGB_565 : Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        drawable.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
        drawable.draw(canvas);
        return bitmapCreateBitmap;
    }

    public static byte[] bmpToBytes(Bitmap bitmap) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }

    public static Bitmap readBmp(Parcel parcel) {
        byte[] bArrCreateByteArray = parcel.createByteArray();
        if (bArrCreateByteArray == null || bArrCreateByteArray.length <= 0) {
            return null;
        }
        return BitmapFactory.decodeByteArray(bArrCreateByteArray, 0, bArrCreateByteArray.length);
    }

    public static <T extends Parcelable> T[] readParcelableArray(Parcel parcel, Class<? extends T[]> cls) {
        Parcelable[] parcelableArray = parcel.readParcelableArray(cls.getClassLoader());
        if (parcelableArray == null) {
            return null;
        }
        return (T[]) ((Parcelable[]) Arrays.copyOf(parcelableArray, parcelableArray.length, cls));
    }

    public static BitmapExtender retrieveAppIcon(@NonNull Context context, @NonNull String str) {
        Bitmap bitmapCreateScaledBitmap = null;
        if (context == null || str == null) {
            return null;
        }
        BitmapExtender bitmapExtender = new BitmapExtender();
        try {
            Drawable applicationIcon = context.getPackageManager().getApplicationIcon(str);
            if (applicationIcon instanceof BitmapDrawable) {
                bitmapCreateScaledBitmap = ((BitmapDrawable) applicationIcon).getBitmap();
                bitmapExtender.canRecycle = false;
            } else {
                bitmapCreateScaledBitmap = a(applicationIcon);
                bitmapExtender.canRecycle = true;
            }
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
        } catch (Exception e2) {
            e2.printStackTrace();
        } catch (NoClassDefFoundError e3) {
            e3.printStackTrace();
        }
        if (bitmapCreateScaledBitmap != null && bitmapCreateScaledBitmap.getWidth() > 96) {
            bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmapCreateScaledBitmap, 96, 96, false);
        }
        bitmapExtender.bitmap = bitmapCreateScaledBitmap;
        return bitmapExtender;
    }

    public static BitmapExtender retrieveBitmap(@NonNull Context context, @NonNull String str, int i) {
        if (context == null || str == null) {
            return null;
        }
        BitmapExtender bitmapExtender = new BitmapExtender();
        try {
            Context contextCreatePackageContext = context.createPackageContext(str, 0);
            if (contextCreatePackageContext != null) {
                Drawable drawable = contextCreatePackageContext.getResources().getDrawable(i);
                if (drawable instanceof BitmapDrawable) {
                    bitmapExtender.bitmap = ((BitmapDrawable) drawable).getBitmap();
                    bitmapExtender.canRecycle = false;
                } else {
                    bitmapExtender.bitmap = a(drawable);
                    bitmapExtender.canRecycle = true;
                }
            }
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
        } catch (Exception e2) {
            e2.printStackTrace();
        } catch (NoClassDefFoundError e3) {
            e3.printStackTrace();
        }
        return bitmapExtender;
    }

    public static String toString(CharSequence charSequence) {
        if (charSequence == null) {
            return null;
        }
        return charSequence.toString();
    }

    public static String[] toStringArray(CharSequence[] charSequenceArr) {
        if (charSequenceArr == null || charSequenceArr.length == 0) {
            return null;
        }
        if (charSequenceArr instanceof String[]) {
            return (String[]) charSequenceArr;
        }
        String[] strArr = new String[charSequenceArr.length];
        for (int i = 0; i < charSequenceArr.length; i++) {
            if (charSequenceArr[i] != null) {
                strArr[i] = charSequenceArr[i].toString();
            } else {
                strArr[i] = "";
            }
        }
        return strArr;
    }

    public static void writeBmp(Parcel parcel, Bitmap bitmap) {
        parcel.writeByteArray(bitmap == null ? null : bmpToBytes(bitmap));
    }
}
