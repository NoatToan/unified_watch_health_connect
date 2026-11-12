package defpackage;

import android.app.Activity;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.provider.MediaStore;
import android.util.Base64;
import android.webkit.MimeTypeMap;
import androidx.core.content.FileProvider;
import coil.util.Utils;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.imagepicker.ImagePickerModule;
import com.xiaomi.fitness.util.SportRecordBundleKey;
import com.xiaomi.smarthome.framework.plugin.rn.viewshot.ViewShot;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;
import java.util.UUID;

/* JADX INFO: loaded from: classes5.dex */
public class gmq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static String f19141a = "rn_image_picker_lib_temp_";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static String f19142b = "camera_unavailable";
    public static String c = "permission";
    public static String d = "others";
    public static String e = "photo";
    public static String f = "video";
    public static String g = "This library does not require Manifest.permission.CAMERA, if you add this permission in manifest then you have to obtain the same.";

    public static void A(Intent intent) {
        intent.putExtra("android.intent.extras.CAMERA_FACING", 0);
        intent.putExtra("android.intent.extra.USE_FRONT_CAMERA", true);
    }

    public static void B(File file, String str, Context context) throws Throwable {
        if (str.equals(String.valueOf(1)) || str.equals(String.valueOf(0))) {
            return;
        }
        gh8 gh8Var = new gh8(file);
        gh8Var.b0("Orientation", str);
        gh8Var.X();
    }

    public static boolean C(int i, int i2, bch bchVar) {
        int i3 = bchVar.d;
        if ((i3 == 0 || bchVar.e == 0) && bchVar.c == 100) {
            return false;
        }
        return i3 < i || bchVar.e < i2 || bchVar.c != 100;
    }

    public static void a(Uri uri, Uri uri2, ContentResolver contentResolver) {
        try {
            OutputStream outputStreamOpenOutputStream = contentResolver.openOutputStream(uri2);
            InputStream inputStreamOpenInputStream = contentResolver.openInputStream(uri);
            byte[] bArr = new byte[8192];
            while (true) {
                int i = inputStreamOpenInputStream.read(bArr);
                if (i == -1) {
                    return;
                } else {
                    outputStreamOpenOutputStream.write(bArr, 0, i);
                }
            }
        } catch (IOException e2) {
            e2.printStackTrace();
        }
    }

    public static File b(Context context, String str) {
        try {
            File file = new File(context.getCacheDir(), f19141a + UUID.randomUUID() + "." + str);
            file.createNewFile();
            return file;
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public static Uri c(File file, Context context) {
        return FileProvider.getUriForFile(context, context.getApplicationContext().getPackageName() + ".imagepickerprovider", file);
    }

    public static void d(Uri uri) {
        new File(uri.getPath()).delete();
    }

    public static Uri e(Uri uri, Context context) {
        if (uri == null) {
            return null;
        }
        ContentResolver contentResolver = context.getContentResolver();
        Uri uriFromFile = Uri.fromFile(b(context, l(contentResolver.getType(uri))));
        a(uri, uriFromFile, contentResolver);
        return uriFromFile;
    }

    public static String f(Uri uri, Context context) {
        try {
            InputStream inputStreamOpenInputStream = context.getContentResolver().openInputStream(uri);
            byte[] bArr = new byte[8192];
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            while (true) {
                try {
                    int i = inputStreamOpenInputStream.read(bArr);
                    if (i == -1) {
                        break;
                    }
                    byteArrayOutputStream.write(bArr, 0, i);
                } catch (IOException e2) {
                    e2.printStackTrace();
                }
            }
            return Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2);
        } catch (FileNotFoundException e3) {
            e3.printStackTrace();
            return null;
        }
    }

    public static Bitmap.CompressFormat g(String str) {
        str.hashCode();
        if (!str.equals(Utils.MIME_TYPE_JPEG) && str.equals("image/png")) {
            return Bitmap.CompressFormat.PNG;
        }
        return Bitmap.CompressFormat.JPEG;
    }

    public static ReadableMap h() {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putBoolean("didCancel", true);
        return writableMapCreateMap;
    }

    public static int i(Uri uri, Context context) throws IOException {
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        mediaMetadataRetriever.setDataSource(context, uri);
        int iRound = Math.round(Float.parseFloat(mediaMetadataRetriever.extractMetadata(9))) / 1000;
        mediaMetadataRetriever.release();
        return iRound;
    }

    public static ReadableMap j(String str, String str2) {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putString("errorCode", str);
        if (str2 != null) {
            writableMapCreateMap.putString("errorMessage", str2);
        }
        return writableMapCreateMap;
    }

    public static double k(Uri uri, Context context) {
        try {
            return context.getContentResolver().openFileDescriptor(uri, "r").getStatSize();
        } catch (Exception e2) {
            e2.printStackTrace();
            return 0.0d;
        }
    }

    public static String l(String str) {
        return (str != null && str.equals("image/png")) ? "png" : "jpg";
    }

    public static int[] m(int i, int i2, bch bchVar) {
        int i3;
        int i4 = bchVar.d;
        if (i4 == 0 || (i3 = bchVar.e) == 0) {
            return new int[]{i, i2};
        }
        if (i4 < i) {
            i2 = (int) ((i4 / i) * i2);
            i = i4;
        }
        if (i3 < i2) {
            i = (int) ((i3 / i2) * i);
        } else {
            i3 = i2;
        }
        return new int[]{i, i3};
    }

    public static int[] n(Uri uri, Context context) {
        try {
            InputStream inputStreamOpenInputStream = context.getContentResolver().openInputStream(uri);
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeStream(inputStreamOpenInputStream, null, options);
            return new int[]{options.outWidth, options.outHeight};
        } catch (FileNotFoundException e2) {
            e2.printStackTrace();
            return new int[]{0, 0};
        }
    }

    public static String o(Uri uri) {
        return MimeTypeMap.getSingleton().getMimeTypeFromExtension(MimeTypeMap.getFileExtensionFromUrl(uri.toString()));
    }

    public static String p(Uri uri, Context context) throws IOException {
        return new gh8(context.getContentResolver().openInputStream(uri)).f("Orientation");
    }

    public static ReadableMap q(Uri uri, bch bchVar, Context context) {
        String lastPathSegment = uri.getLastPathSegment();
        int[] iArrN = n(uri, context);
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putString(SportRecordBundleKey.BUNDLE_PARAM_URI, uri.toString());
        writableMapCreateMap.putDouble("fileSize", k(uri, context));
        writableMapCreateMap.putString("fileName", lastPathSegment);
        writableMapCreateMap.putString("type", o(uri));
        writableMapCreateMap.putInt("width", iArrN[0]);
        writableMapCreateMap.putInt("height", iArrN[1]);
        if (bchVar.f4057a.booleanValue()) {
            writableMapCreateMap.putString(ViewShot.Results.BASE_64, f(uri, context));
        }
        return writableMapCreateMap;
    }

    public static ReadableMap r(Uri uri, Context context) throws IOException {
        String lastPathSegment = uri.getLastPathSegment();
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putString(SportRecordBundleKey.BUNDLE_PARAM_URI, uri.toString());
        writableMapCreateMap.putDouble("fileSize", k(uri, context));
        writableMapCreateMap.putInt("duration", i(uri, context));
        writableMapCreateMap.putString("fileName", lastPathSegment);
        return writableMapCreateMap;
    }

    public static boolean s(Activity activity) {
        return ni4.a(activity, "android.permission.WRITE_EXTERNAL_STORAGE") == 0;
    }

    public static boolean t(Context context) {
        return context.getPackageManager().hasSystemFeature("android.hardware.camera") || context.getPackageManager().hasSystemFeature("android.hardware.camera.any");
    }

    public static boolean u(Context context, Activity activity) {
        try {
            String[] strArr = context.getPackageManager().getPackageInfo(context.getPackageName(), 4096).requestedPermissions;
            return strArr == null || !Arrays.asList(strArr).contains("android.permission.CAMERA") || ni4.a(activity, "android.permission.CAMERA") == 0;
        } catch (PackageManager.NameNotFoundException e2) {
            e2.printStackTrace();
            return true;
        }
    }

    public static boolean v(Uri uri, Context context) {
        return context.getContentResolver().getType(uri).contains("image/");
    }

    public static boolean w(int i) {
        switch (i) {
            case ImagePickerModule.REQUEST_LAUNCH_IMAGE_CAPTURE /* 13001 */:
            case ImagePickerModule.REQUEST_LAUNCH_VIDEO_CAPTURE /* 13002 */:
            case ImagePickerModule.REQUEST_LAUNCH_LIBRARY /* 13003 */:
                return true;
            default:
                return false;
        }
    }

    public static boolean x(Uri uri, Context context) {
        return context.getContentResolver().getType(uri).contains("video/");
    }

    public static Uri y(Uri uri, Context context, bch bchVar) throws Throwable {
        try {
            int[] iArrN = n(uri, context);
            if (!C(iArrN[0], iArrN[1], bchVar)) {
                return uri;
            }
            int[] iArrM = m(iArrN[0], iArrN[1], bchVar);
            InputStream inputStreamOpenInputStream = context.getContentResolver().openInputStream(uri);
            String strO = o(uri);
            Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(BitmapFactory.decodeStream(inputStreamOpenInputStream), iArrM[0], iArrM[1], true);
            String strP = p(uri, context);
            File fileB = b(context, l(strO));
            bitmapCreateScaledBitmap.compress(g(strO), bchVar.c, context.getContentResolver().openOutputStream(Uri.fromFile(fileB)));
            B(fileB, strP, context);
            return Uri.fromFile(fileB);
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public static void z(Uri uri, Context context, String str) {
        Uri uriInsert;
        ContentResolver contentResolver = context.getContentResolver();
        ContentValues contentValues = new ContentValues();
        if (str.equals("video")) {
            contentValues.put("_display_name", UUID.randomUUID().toString());
            contentValues.put("mime_type", contentResolver.getType(uri));
            uriInsert = contentResolver.insert(MediaStore.Video.Media.EXTERNAL_CONTENT_URI, contentValues);
        } else {
            contentValues.put("_display_name", UUID.randomUUID().toString());
            contentValues.put("mime_type", contentResolver.getType(uri));
            uriInsert = contentResolver.insert(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, contentValues);
        }
        a(uri, uriInsert, contentResolver);
    }
}
