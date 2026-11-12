package com.ReactNativeBlobUtil;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.ParcelFileDescriptor;
import android.provider.MediaStore;
import android.util.Base64;
import androidx.work.Data;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.WritableArray;
import com.miui.tsmclient.util.Constants;
import com.xiaomi.fitness.util.SportRecordBundleKey;
import com.xiaomi.smarthome.framework.plugin.rn.viewshot.ViewShot;
import defpackage.nl9;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes.dex */
public class ReactNativeBlobUtilMediaCollection {

    public enum MediaType {
        Audio,
        Image,
        Video,
        Download
    }

    /* JADX WARN: Code duplicated, block: B:74:0x00eb A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:76:0x00e1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:90:? A[SYNTHETIC] */
    public static void a(Uri uri, String str, Promise promise) {
        FileOutputStream fileOutputStream;
        ContentResolver contentResolver = ReactNativeBlobUtil.RCTContext.getApplicationContext().getContentResolver();
        File file = new File(str);
        if (!file.exists()) {
            try {
                File parentFile = file.getParentFile();
                if (parentFile != null && !parentFile.exists() && !parentFile.mkdirs()) {
                    promise.reject("ReactNativeBlobUtil.copyToInternal: Cannot create parent folders<'" + str);
                    return;
                }
                if (!file.createNewFile()) {
                    promise.reject("ReactNativeBlobUtil.copyToInternal: Destination file at '" + str + "' already exists");
                    return;
                }
            } catch (IOException e) {
                promise.reject("ReactNativeBlobUtil.copyToInternal: Could not create file: " + e.getLocalizedMessage());
            }
        }
        InputStream inputStream = null;
        try {
            try {
                InputStream inputStreamOpenInputStream = contentResolver.openInputStream(uri);
                try {
                    fileOutputStream = new FileOutputStream(str);
                    try {
                        byte[] bArr = new byte[Data.MAX_DATA_BYTES];
                        while (true) {
                            int i = inputStreamOpenInputStream.read(bArr);
                            if (i > 0) {
                                fileOutputStream.write(bArr, 0, i);
                            } else {
                                try {
                                    break;
                                } catch (IOException e2) {
                                    e2.printStackTrace();
                                }
                            }
                        }
                        inputStreamOpenInputStream.close();
                        fileOutputStream.close();
                    } catch (IOException e3) {
                        e = e3;
                        inputStream = inputStreamOpenInputStream;
                        try {
                            promise.reject("ReactNativeBlobUtil.copyToInternal:  Could not write data: " + e.getLocalizedMessage());
                            if (inputStream != null) {
                                try {
                                    inputStream.close();
                                } catch (IOException e4) {
                                    e4.printStackTrace();
                                }
                            }
                            if (fileOutputStream != null) {
                                fileOutputStream.close();
                            }
                            promise.resolve("");
                        } catch (Throwable th) {
                            th = th;
                            if (inputStream != null) {
                                try {
                                    inputStream.close();
                                } catch (IOException e5) {
                                    e5.printStackTrace();
                                }
                            }
                            if (fileOutputStream != null) {
                                throw th;
                            }
                            try {
                                fileOutputStream.close();
                                throw th;
                            } catch (IOException e6) {
                                e6.printStackTrace();
                                throw th;
                            }
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        inputStream = inputStreamOpenInputStream;
                        if (inputStream != null) {
                            inputStream.close();
                        }
                        if (fileOutputStream != null) {
                            throw th;
                        }
                        fileOutputStream.close();
                        throw th;
                    }
                } catch (IOException e7) {
                    e = e7;
                    fileOutputStream = null;
                } catch (Throwable th3) {
                    th = th3;
                    fileOutputStream = null;
                }
            } catch (IOException e8) {
                e8.printStackTrace();
            }
        } catch (IOException e9) {
            e = e9;
            fileOutputStream = null;
        } catch (Throwable th4) {
            th = th4;
            fileOutputStream = null;
        }
        promise.resolve("");
    }

    public static Uri b(nl9 nl9Var, MediaType mediaType, ReactApplicationContext reactApplicationContext) {
        ContentResolver contentResolver = ReactNativeBlobUtil.RCTContext.getApplicationContext().getContentResolver();
        ContentValues contentValues = new ContentValues();
        String strE = e(mediaType, reactApplicationContext);
        String str = nl9Var.c;
        if (Build.VERSION.SDK_INT >= 29) {
            contentValues.put("date_added", Long.valueOf(System.currentTimeMillis() / 1000));
            contentValues.put("date_modified", Long.valueOf(System.currentTimeMillis() / 1000));
            contentValues.put("mime_type", str);
            contentValues.put("_display_name", nl9Var.f28035a);
            contentValues.put("relative_path", strE + '/' + nl9Var.f28036b);
            return contentResolver.insert(d(mediaType), contentValues);
        }
        File file = new File(strE + nl9Var.a());
        if (file.exists()) {
            return Uri.fromFile(file);
        }
        File parentFile = file.getParentFile();
        if (parentFile != null && !parentFile.exists() && !parentFile.mkdirs()) {
            return null;
        }
        try {
            file.createNewFile();
            return Uri.fromFile(file);
        } catch (IOException unused) {
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0067  */
    public static void c(Uri uri, String str, Promise promise) {
        byte b2;
        try {
            InputStream inputStreamOpenInputStream = ReactNativeBlobUtil.RCTContext.getApplicationContext().getContentResolver().openInputStream(uri);
            int iAvailable = inputStreamOpenInputStream.available();
            byte[] bArr = new byte[iAvailable];
            int i = inputStreamOpenInputStream.read(bArr);
            inputStreamOpenInputStream.close();
            if (i < iAvailable) {
                promise.reject("EUNSPECIFIED", "Read only " + i + " bytes of " + iAvailable);
                return;
            }
            String lowerCase = str.toLowerCase();
            int iHashCode = lowerCase.hashCode();
            if (iHashCode != -1396204209) {
                if (iHashCode == 93106001 && lowerCase.equals("ascii")) {
                    b2 = 1;
                } else {
                    b2 = -1;
                }
            } else if (lowerCase.equals(ViewShot.Results.BASE_64)) {
                b2 = 0;
            } else {
                b2 = -1;
            }
            if (b2 == 0) {
                promise.resolve(Base64.encodeToString(bArr, 2));
                return;
            }
            if (b2 != 1) {
                promise.resolve(new String(bArr));
                return;
            }
            WritableArray writableArrayCreateArray = Arguments.createArray();
            for (int i2 = 0; i2 < iAvailable; i2++) {
                writableArrayCreateArray.pushInt(bArr[i2]);
            }
            promise.resolve(writableArrayCreateArray);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Uri d(MediaType mediaType) {
        if (mediaType == MediaType.Audio) {
            return Build.VERSION.SDK_INT >= 29 ? MediaStore.Audio.Media.getContentUri("external_primary") : MediaStore.Audio.Media.EXTERNAL_CONTENT_URI;
        }
        if (mediaType == MediaType.Video) {
            return Build.VERSION.SDK_INT >= 29 ? MediaStore.Video.Media.getContentUri("external_primary") : MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
        }
        if (mediaType == MediaType.Image) {
            return Build.VERSION.SDK_INT >= 29 ? MediaStore.Images.Media.getContentUri("external_primary") : MediaStore.Images.Media.EXTERNAL_CONTENT_URI;
        }
        if (mediaType != MediaType.Download || Build.VERSION.SDK_INT < 29) {
            return null;
        }
        return MediaStore.Downloads.getContentUri("external_primary");
    }

    public static String e(MediaType mediaType, ReactApplicationContext reactApplicationContext) {
        if (Build.VERSION.SDK_INT >= 29) {
            if (mediaType == MediaType.Audio) {
                return Environment.DIRECTORY_MUSIC;
            }
            if (mediaType == MediaType.Video) {
                return Environment.DIRECTORY_MOVIES;
            }
            if (mediaType == MediaType.Image) {
                return Environment.DIRECTORY_PICTURES;
            }
            return mediaType == MediaType.Download ? Environment.DIRECTORY_DOWNLOADS : Environment.DIRECTORY_DOWNLOADS;
        }
        if (mediaType == MediaType.Audio) {
            return b.h(reactApplicationContext, Environment.DIRECTORY_MUSIC);
        }
        if (mediaType == MediaType.Video) {
            return b.h(reactApplicationContext, Environment.DIRECTORY_MOVIES);
        }
        if (mediaType == MediaType.Image) {
            return b.h(reactApplicationContext, Environment.DIRECTORY_PICTURES);
        }
        return mediaType == MediaType.Download ? b.h(reactApplicationContext, Environment.DIRECTORY_DOWNLOADS) : b.h(reactApplicationContext, Environment.DIRECTORY_DOWNLOADS);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r4v2 */
    public static boolean f(Uri uri, String str, boolean z, Promise promise) throws Throwable {
        OutputStream outputStreamOpenOutputStream;
        if (Build.VERSION.SDK_INT < 29) {
            return b.E(e.f(uri.toString()), SportRecordBundleKey.BUNDLE_PARAM_URI, str, false);
        }
        try {
            Context applicationContext = ReactNativeBlobUtil.RCTContext.getApplicationContext();
            ContentResolver contentResolver = applicationContext.getContentResolver();
            ?? r4 = 0;
            try {
                try {
                    try {
                        ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = applicationContext.getContentResolver().openFileDescriptor(uri, Constants.DEVICE_TYPE_WEAR);
                        String strF = e.f(str);
                        File file = new File(strF);
                        if (!file.exists()) {
                            promise.reject("ENOENT", "No such file ('" + strF + "')");
                            return false;
                        }
                        FileInputStream fileInputStream = new FileInputStream(file);
                        FileOutputStream fileOutputStream = new FileOutputStream(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor());
                        if (z) {
                            fileInputStream.read(new byte[(int) file.length()]);
                            throw new IllegalStateException("Write to media file with transform was specified but the shared file transformer is not set");
                        }
                        byte[] bArr = new byte[Data.MAX_DATA_BYTES];
                        while (true) {
                            int i = fileInputStream.read(bArr);
                            if (i <= 0) {
                                try {
                                    break;
                                } catch (Throwable th) {
                                    r4 = uri;
                                    th = th;
                                    if (r4 != 0) {
                                        r4.close();
                                    }
                                    throw th;
                                }
                            }
                            fileOutputStream.write(bArr, 0, i);
                        }
                        fileInputStream.close();
                        fileOutputStream.close();
                        parcelFileDescriptorOpenFileDescriptor.close();
                        outputStreamOpenOutputStream = contentResolver.openOutputStream(uri);
                        if (outputStreamOpenOutputStream != null) {
                            outputStreamOpenOutputStream.close();
                            return true;
                        }
                        try {
                            promise.reject(new IOException("Failed to get output stream."));
                            if (outputStreamOpenOutputStream != null) {
                                outputStreamOpenOutputStream.close();
                            }
                            return false;
                        } catch (IOException e) {
                            e = e;
                            contentResolver.delete(null, null, null);
                            promise.reject(e);
                            if (outputStreamOpenOutputStream != null) {
                                outputStreamOpenOutputStream.close();
                            }
                            return false;
                        }
                    } catch (Exception e2) {
                        e2.printStackTrace();
                        promise.reject(new IOException("Failed to get output stream."));
                        return false;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (IOException e3) {
                e = e3;
                outputStreamOpenOutputStream = null;
            }
        } catch (IOException unused) {
            promise.reject("ReactNativeBlobUtil.createMediaFile", "Cannot write to file, file might not exist");
            return false;
        }
    }
}
