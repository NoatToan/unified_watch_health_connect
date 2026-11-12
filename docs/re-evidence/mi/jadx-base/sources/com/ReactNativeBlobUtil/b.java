package com.ReactNativeBlobUtil;

import android.content.res.AssetFileDescriptor;
import android.media.MediaScannerConnection;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Environment;
import android.os.StatFs;
import android.util.Base64;
import androidx.work.Data;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.xiaomi.fitness.sync.model.EventRecurrence;
import com.xiaomi.fitness.util.SportRecordBundleKey;
import com.xiaomi.smarthome.framework.plugin.rn.utils.MediaStoreUtil;
import com.xiaomi.smarthome.framework.plugin.rn.viewshot.ViewShot;
import com.xiaomi.smarthome.library.crypto.rc4coder.Coder;
import com.xiaomi.smarthome.plugin.update.PluginPackageConstant;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class b {
    public static HashMap<String, b> e = new HashMap<>();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ReactApplicationContext f5652a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public DeviceEventManagerModule.RCTDeviceEventEmitter f5653b;
    public String c = ViewShot.Results.BASE_64;
    public OutputStream d = null;

    public class a extends AsyncTask<String, Integer, Integer> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Callback f5654a;

        public a(Callback callback) {
            this.f5654a = callback;
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Integer doInBackground(String... strArr) {
            WritableArray writableArrayCreateArray = Arguments.createArray();
            if (strArr[0] == null) {
                this.f5654a.invoke("the path specified for lstat is either `null` or `undefined`.");
                return 0;
            }
            File file = new File(strArr[0]);
            if (!file.exists()) {
                this.f5654a.invoke("failed to lstat path `" + strArr[0] + "` because it does not exist or it is not a folder");
                return 0;
            }
            if (file.isDirectory()) {
                for (String str : file.list()) {
                    writableArrayCreateArray.pushMap(b.A(file.getPath() + "/" + str));
                }
            } else {
                writableArrayCreateArray.pushMap(b.A(file.getAbsolutePath()));
            }
            this.f5654a.invoke(null, writableArrayCreateArray);
            return 0;
        }
    }

    /* JADX INFO: renamed from: com.ReactNativeBlobUtil.b$b, reason: collision with other inner class name */
    public class C0113b implements MediaScannerConnection.OnScanCompletedListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Callback f5655a;

        public C0113b(Callback callback) {
            this.f5655a = callback;
        }

        @Override // android.media.MediaScannerConnection.OnScanCompletedListener
        public void onScanCompleted(String str, Uri uri) {
            this.f5655a.invoke(null, Boolean.TRUE);
        }
    }

    public class c extends AsyncTask<ReadableArray, Integer, Integer> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Callback f5657a;

        public c(Callback callback) {
            this.f5657a = callback;
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Integer doInBackground(ReadableArray... readableArrayArr) {
            try {
                ArrayList arrayList = new ArrayList();
                for (int i = 0; i < readableArrayArr[0].size(); i++) {
                    String string = readableArrayArr[0].getString(i);
                    File file = new File(string);
                    if (file.exists() && !file.delete()) {
                        arrayList.add(string);
                    }
                }
                if (arrayList.isEmpty()) {
                    this.f5657a.invoke(null, Boolean.TRUE);
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Failed to delete: ");
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        sb.append((String) it.next());
                        sb.append(", ");
                    }
                    this.f5657a.invoke(sb.toString());
                }
            } catch (Exception e) {
                this.f5657a.invoke(e.getLocalizedMessage());
            }
            return Integer.valueOf(readableArrayArr[0].size());
        }
    }

    public b(ReactApplicationContext reactApplicationContext) {
        this.f5652a = reactApplicationContext;
        this.f5653b = (DeviceEventManagerModule.RCTDeviceEventEmitter) reactApplicationContext.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class);
    }

    public static WritableMap A(String str) {
        try {
            String strF = e.f(str);
            WritableMap writableMapCreateMap = Arguments.createMap();
            if (p(strF)) {
                String strReplace = strF.replace("bundle-assets://", "");
                AssetFileDescriptor assetFileDescriptorOpenFd = ReactNativeBlobUtil.RCTContext.getAssets().openFd(strReplace);
                writableMapCreateMap.putString("filename", strReplace);
                writableMapCreateMap.putString("path", strF);
                writableMapCreateMap.putString("type", "asset");
                writableMapCreateMap.putString(MediaStoreUtil.MediaInfo.SIZE, String.valueOf(assetFileDescriptorOpenFd.getLength()));
                writableMapCreateMap.putInt("lastModified", 0);
            } else {
                File file = new File(strF);
                if (!file.exists()) {
                    return null;
                }
                writableMapCreateMap.putString("filename", file.getName());
                writableMapCreateMap.putString("path", file.getPath());
                writableMapCreateMap.putString("type", file.isDirectory() ? "directory" : "file");
                writableMapCreateMap.putString(MediaStoreUtil.MediaInfo.SIZE, String.valueOf(file.length()));
                writableMapCreateMap.putString("lastModified", String.valueOf(file.lastModified()));
            }
            return writableMapCreateMap;
        } catch (Exception unused) {
            return null;
        }
    }

    public static void B(String str, Callback callback) {
        try {
            d(new File(e.f(str)));
            callback.invoke(null, Boolean.TRUE);
        } catch (Exception e2) {
            callback.invoke(e2.getLocalizedMessage(), Boolean.FALSE);
        }
    }

    public static void C(String str, ReadableArray readableArray, boolean z, Promise promise) {
        try {
            File file = new File(str);
            File parentFile = file.getParentFile();
            if (!file.exists()) {
                if (parentFile != null && !parentFile.exists() && !parentFile.mkdirs() && !parentFile.exists()) {
                    promise.reject("ENOTDIR", "Failed to create parent directory of '" + str + "'");
                    return;
                }
                if (!file.createNewFile()) {
                    promise.reject("ENOENT", "File '" + str + "' does not exist and could not be created");
                    return;
                }
            }
            FileOutputStream fileOutputStream = new FileOutputStream(file, z);
            try {
                byte[] bArr = new byte[readableArray.size()];
                for (int i = 0; i < readableArray.size(); i++) {
                    bArr[i] = (byte) readableArray.getInt(i);
                }
                fileOutputStream.write(bArr);
                fileOutputStream.close();
                promise.resolve(Integer.valueOf(readableArray.size()));
            } catch (Throwable th) {
                fileOutputStream.close();
                throw th;
            }
        } catch (FileNotFoundException unused) {
            promise.reject("ENOENT", "File '" + str + "' does not exist and could not be created");
        } catch (Exception e2) {
            promise.reject("EUNSPECIFIED", e2.getLocalizedMessage());
        }
    }

    public static void D(String str, String str2, String str3, boolean z, boolean z2, Promise promise) {
        int length;
        FileOutputStream fileOutputStream;
        try {
            File file = new File(str);
            File parentFile = file.getParentFile();
            if (!file.exists()) {
                if (parentFile != null && !parentFile.exists() && !parentFile.mkdirs() && !parentFile.exists()) {
                    promise.reject("EUNSPECIFIED", "Failed to create parent directory of '" + str + "'");
                    return;
                }
                if (!file.createNewFile()) {
                    promise.reject("ENOENT", "File '" + str + "' does not exist and could not be created");
                    return;
                }
            }
            if (str2.equalsIgnoreCase(SportRecordBundleKey.BUNDLE_PARAM_URI)) {
                String strF = e.f(str3);
                File file2 = new File(strF);
                if (!file2.exists()) {
                    promise.reject("ENOENT", "No such file '" + str + "' ('" + strF + "')");
                    return;
                }
                byte[] bArr = new byte[Data.MAX_DATA_BYTES];
                FileInputStream fileInputStream = null;
                try {
                    FileInputStream fileInputStream2 = new FileInputStream(file2);
                    try {
                        fileOutputStream = new FileOutputStream(file, z2);
                        length = 0;
                        while (true) {
                            try {
                                int i = fileInputStream2.read(bArr);
                                if (i <= 0) {
                                    break;
                                }
                                fileOutputStream.write(bArr, 0, i);
                                length += i;
                            } catch (Throwable th) {
                                th = th;
                                fileInputStream = fileInputStream2;
                                if (fileInputStream != null) {
                                    fileInputStream.close();
                                }
                                if (fileOutputStream != null) {
                                    fileOutputStream.close();
                                }
                                throw th;
                            }
                        }
                        fileInputStream2.close();
                        fileOutputStream.close();
                    } catch (Throwable th2) {
                        th = th2;
                        fileOutputStream = null;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    fileOutputStream = null;
                }
            } else {
                byte[] bArrG = e.g(str3, str2);
                if (z) {
                    throw new IllegalStateException("Write file with transform was specified but the shared file transformer is not set");
                }
                FileOutputStream fileOutputStream2 = new FileOutputStream(file, z2);
                try {
                    fileOutputStream2.write(bArrG);
                    length = bArrG.length;
                    fileOutputStream2.close();
                } catch (Throwable th4) {
                    fileOutputStream2.close();
                    throw th4;
                }
            }
            promise.resolve(Integer.valueOf(length));
        } catch (FileNotFoundException unused) {
            promise.reject("ENOENT", "File '" + str + "' does not exist and could not be created, or it is a directory");
        } catch (Exception e2) {
            promise.reject("EUNSPECIFIED", e2.getLocalizedMessage());
        }
    }

    public static boolean E(String str, String str2, String str3, boolean z) {
        FileOutputStream fileOutputStream;
        try {
            File file = new File(e.f(str));
            File parentFile = file.getParentFile();
            if (!file.exists() && ((parentFile != null && !parentFile.exists() && !parentFile.mkdirs() && !parentFile.exists()) || !file.createNewFile())) {
                return false;
            }
            if (!str2.equalsIgnoreCase(SportRecordBundleKey.BUNDLE_PARAM_URI)) {
                byte[] bArrG = e.g(str3, str2);
                FileOutputStream fileOutputStream2 = new FileOutputStream(file, z);
                try {
                    fileOutputStream2.write(bArrG);
                    int length = bArrG.length;
                    return true;
                } finally {
                    fileOutputStream2.close();
                }
            }
            File file2 = new File(e.f(str3));
            if (!file2.exists()) {
                return false;
            }
            byte[] bArr = new byte[Data.MAX_DATA_BYTES];
            FileInputStream fileInputStream = null;
            try {
                FileInputStream fileInputStream2 = new FileInputStream(file2);
                try {
                    fileOutputStream = new FileOutputStream(file, z);
                    while (true) {
                        try {
                            int i = fileInputStream2.read(bArr);
                            if (i <= 0) {
                                fileInputStream2.close();
                                fileOutputStream.close();
                                return true;
                            }
                            fileOutputStream.write(bArr, 0, i);
                        } catch (Throwable th) {
                            th = th;
                            fileInputStream = fileInputStream2;
                            if (fileInputStream != null) {
                                fileInputStream.close();
                            }
                            if (fileOutputStream != null) {
                                fileOutputStream.close();
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    fileOutputStream = null;
                }
            } catch (Throwable th3) {
                th = th3;
                fileOutputStream = null;
            }
        } catch (FileNotFoundException | Exception unused) {
            return false;
        }
    }

    /* JADX WARN: Code duplicated, block: B:43:0x00cd A[Catch: Exception -> 0x00c9, TRY_LEAVE, TryCatch #5 {Exception -> 0x00c9, blocks: (B:39:0x00c5, B:43:0x00cd), top: B:64:0x00c5 }] */
    /* JADX WARN: Code duplicated, block: B:55:0x00fd A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:56:0x00ff A[Catch: Exception -> 0x00fb, TRY_LEAVE, TryCatch #4 {Exception -> 0x00fb, blocks: (B:52:0x00f7, B:56:0x00ff), top: B:62:0x00f7 }] */
    /* JADX WARN: Code duplicated, block: B:62:0x00f7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public static void a(String str, String str2, Callback callback) {
        FileOutputStream fileOutputStream;
        String str3;
        String strF = e.f(str);
        String strF2 = e.f(str2);
        InputStream inputStream = null;
        try {
            if (!q(strF)) {
                callback.invoke("Source file at path`" + strF + "` does not exist");
                return;
            }
            if (!new File(strF2).exists() && !new File(strF2).createNewFile()) {
                callback.invoke("Destination file at '" + strF2 + "' already exists");
                return;
            }
            InputStream inputStreamO = o(strF);
            try {
                fileOutputStream = new FileOutputStream(strF2);
                try {
                    byte[] bArr = new byte[Data.MAX_DATA_BYTES];
                    while (true) {
                        int i = inputStreamO.read(bArr);
                        if (i > 0) {
                            fileOutputStream.write(bArr, 0, i);
                        } else {
                            try {
                                break;
                            } catch (Exception e2) {
                                str3 = "" + e2.getLocalizedMessage();
                            }
                        }
                    }
                    inputStreamO.close();
                    fileOutputStream.close();
                    str3 = "";
                } catch (Exception e3) {
                    e = e3;
                    inputStream = inputStreamO;
                    e = e;
                    try {
                        str3 = "" + e.getLocalizedMessage();
                        if (inputStream != null) {
                            try {
                                inputStream.close();
                                if (fileOutputStream != null) {
                                    fileOutputStream.close();
                                }
                            } catch (Exception e4) {
                                str3 = str3 + e4.getLocalizedMessage();
                            }
                        } else if (fileOutputStream != null) {
                            fileOutputStream.close();
                        }
                    } catch (Throwable th) {
                        th = th;
                        if (inputStream != null) {
                            try {
                                inputStream.close();
                                if (fileOutputStream != null) {
                                    fileOutputStream.close();
                                }
                            } catch (Exception e5) {
                                e5.getLocalizedMessage();
                                throw th;
                            }
                        } else if (fileOutputStream != null) {
                            fileOutputStream.close();
                        }
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    inputStream = inputStreamO;
                    th = th;
                    if (inputStream != null) {
                        inputStream.close();
                        if (fileOutputStream != null) {
                            fileOutputStream.close();
                        }
                    } else if (fileOutputStream != null) {
                        fileOutputStream.close();
                    }
                    throw th;
                }
            } catch (Exception e6) {
                e = e6;
                fileOutputStream = null;
            } catch (Throwable th3) {
                th = th3;
                fileOutputStream = null;
            }
            if (str3 != "") {
                callback.invoke(str3);
            } else {
                callback.invoke(new Object[0]);
            }
        } catch (Exception e7) {
            e = e7;
            fileOutputStream = null;
        } catch (Throwable th4) {
            th = th4;
            fileOutputStream = null;
        }
    }

    public static void b(String str, String str2, String str3, Promise promise) {
        try {
            String strF = e.f(str);
            File file = new File(strF);
            boolean zCreateNewFile = file.createNewFile();
            if (str3.equals(SportRecordBundleKey.BUNDLE_PARAM_URI)) {
                File file2 = new File(str2.replace("ReactNativeBlobUtil-file://", ""));
                if (!file2.exists()) {
                    promise.reject("ENOENT", "Source file : " + str2 + " does not exist");
                    return;
                }
                FileInputStream fileInputStream = new FileInputStream(file2);
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                byte[] bArr = new byte[Data.MAX_DATA_BYTES];
                for (int i = fileInputStream.read(bArr); i > 0; i = fileInputStream.read(bArr)) {
                    fileOutputStream.write(bArr, 0, i);
                }
                fileInputStream.close();
                fileOutputStream.close();
            } else {
                if (!zCreateNewFile) {
                    promise.reject("EEXIST", "File `" + strF + "` already exists");
                    return;
                }
                new FileOutputStream(file).write(e.g(str2, str3));
            }
            promise.resolve(strF);
        } catch (Exception e2) {
            promise.reject("EUNSPECIFIED", e2.getLocalizedMessage());
        }
    }

    public static void c(String str, ReadableArray readableArray, Promise promise) {
        try {
            String strF = e.f(str);
            File file = new File(strF);
            if (!file.createNewFile()) {
                promise.reject("EEXIST", "File at path `" + strF + "` already exists");
                return;
            }
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            byte[] bArr = new byte[readableArray.size()];
            for (int i = 0; i < readableArray.size(); i++) {
                bArr[i] = (byte) readableArray.getInt(i);
            }
            fileOutputStream.write(bArr);
            promise.resolve(strF);
        } catch (Exception e2) {
            promise.reject("EUNSPECIFIED", e2.getLocalizedMessage());
        }
    }

    public static void d(File file) throws IOException {
        if (file.isDirectory()) {
            File[] fileArrListFiles = file.listFiles();
            if (fileArrListFiles == null) {
                throw new NullPointerException("Received null trying to list files of directory '" + file + "'");
            }
            for (File file2 : fileArrListFiles) {
                d(file2);
            }
        }
        if (file.delete()) {
            return;
        }
        throw new IOException("Failed to delete '" + file + "'");
    }

    public static void e(Callback callback, ReactApplicationContext reactApplicationContext) {
        StatFs statFs = new StatFs(reactApplicationContext.getFilesDir().getPath());
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putString("internal_free", String.valueOf(statFs.getFreeBytes()));
        writableMapCreateMap.putString("internal_total", String.valueOf(statFs.getTotalBytes()));
        File externalFilesDir = reactApplicationContext.getExternalFilesDir(null);
        if (externalFilesDir != null) {
            StatFs statFs2 = new StatFs(externalFilesDir.getPath());
            writableMapCreateMap.putString("external_free", String.valueOf(statFs2.getFreeBytes()));
            writableMapCreateMap.putString("external_total", String.valueOf(statFs2.getTotalBytes()));
        } else {
            writableMapCreateMap.putString("external_free", "-1");
            writableMapCreateMap.putString("external_total", "-1");
        }
        callback.invoke(null, writableMapCreateMap);
    }

    public static void f(String str, Callback callback) {
        if (p(str)) {
            try {
                ReactNativeBlobUtil.RCTContext.getAssets().openFd(str.replace("bundle-assets://", ""));
                callback.invoke(Boolean.TRUE, Boolean.FALSE);
                return;
            } catch (IOException unused) {
                Boolean bool = Boolean.FALSE;
                callback.invoke(bool, bool);
                return;
            }
        }
        String strF = e.f(str);
        if (strF != null) {
            callback.invoke(Boolean.valueOf(new File(strF).exists()), Boolean.valueOf(new File(strF).isDirectory()));
        } else {
            Boolean bool2 = Boolean.FALSE;
            callback.invoke(bool2, bool2);
        }
    }

    public static String g(ReactApplicationContext reactApplicationContext) {
        File cacheDir = reactApplicationContext.getCacheDir();
        return cacheDir != null ? cacheDir.getAbsolutePath() : "";
    }

    public static String h(ReactApplicationContext reactApplicationContext, String str) {
        File externalFilesDir = reactApplicationContext.getExternalFilesDir(str);
        return externalFilesDir != null ? externalFilesDir.getAbsolutePath() : "";
    }

    public static String i(ReactApplicationContext reactApplicationContext) {
        File filesDir = reactApplicationContext.getFilesDir();
        return filesDir != null ? filesDir.getAbsolutePath() : "";
    }

    public static void j(ReactApplicationContext reactApplicationContext, Promise promise) {
        if (!Environment.getExternalStorageState().equals("mounted")) {
            promise.reject("ReactNativeBlobUtil.getSDCardApplicationDir", "External storage not mounted");
            return;
        }
        try {
            promise.resolve(reactApplicationContext.getExternalFilesDir(null).getParentFile().getAbsolutePath());
        } catch (Exception e2) {
            promise.reject("ReactNativeBlobUtil.getSDCardApplicationDir", e2.getLocalizedMessage());
        }
    }

    public static void k(ReactApplicationContext reactApplicationContext, Promise promise) {
        if (!Environment.getExternalStorageState().equals("mounted")) {
            promise.reject("ReactNativeBlobUtil.getSDCardDir", "External storage not mounted");
            return;
        }
        try {
            promise.resolve(reactApplicationContext.getExternalFilesDir(null).getAbsolutePath());
        } catch (Exception e2) {
            promise.reject("ReactNativeBlobUtil.getSDCardDir", e2.getLocalizedMessage());
        }
    }

    public static Map<String, Object> l(ReactApplicationContext reactApplicationContext) {
        HashMap map = new HashMap();
        map.put("DocumentDir", i(reactApplicationContext));
        map.put("CacheDir", g(reactApplicationContext));
        map.put("DCIMDir", h(reactApplicationContext, Environment.DIRECTORY_DCIM));
        map.put("PictureDir", h(reactApplicationContext, Environment.DIRECTORY_PICTURES));
        map.put("MusicDir", h(reactApplicationContext, Environment.DIRECTORY_MUSIC));
        map.put("DownloadDir", h(reactApplicationContext, Environment.DIRECTORY_DOWNLOADS));
        map.put("MovieDir", h(reactApplicationContext, Environment.DIRECTORY_MOVIES));
        map.put("RingtoneDir", h(reactApplicationContext, Environment.DIRECTORY_RINGTONES));
        if (Environment.getExternalStorageState().equals("mounted")) {
            map.put("SDCardDir", h(reactApplicationContext, null));
            File externalFilesDir = reactApplicationContext.getExternalFilesDir(null);
            if (externalFilesDir == null || externalFilesDir.getParentFile() == null) {
                map.put("SDCardApplicationDir", "");
            } else {
                map.put("SDCardApplicationDir", externalFilesDir.getParentFile().getAbsolutePath());
            }
        }
        map.put("MainBundleDir", reactApplicationContext.getApplicationInfo().dataDir);
        return map;
    }

    public static String m(String str) {
        return ReactNativeBlobUtil.RCTContext.getFilesDir() + "/ReactNativeBlobUtilTmp_" + str;
    }

    public static void n(String str, String str2, Promise promise) {
        try {
            HashMap map = new HashMap();
            map.put("md5", Coder.KEY_MD5);
            map.put("sha1", "SHA-1");
            map.put("sha224", "SHA-224");
            map.put("sha256", PluginPackageConstant.RN_BUNDLE_HASH_ALGORITHM);
            map.put("sha384", "SHA-384");
            map.put("sha512", "SHA-512");
            if (!map.containsKey(str2)) {
                promise.reject("EINVAL", "Invalid algorithm '" + str2 + "', must be one of md5, sha1, sha224, sha256, sha384, sha512");
                return;
            }
            String strF = e.f(str);
            File file = new File(strF);
            if (file.isDirectory()) {
                promise.reject("EISDIR", "Expecting a file but '" + strF + "' is a directory");
                return;
            }
            if (!file.exists()) {
                promise.reject("ENOENT", "No such file '" + strF + "'");
                return;
            }
            MessageDigest messageDigest = MessageDigest.getInstance((String) map.get(str2));
            FileInputStream fileInputStream = new FileInputStream(strF);
            byte[] bArr = new byte[EventRecurrence.TH];
            if (file.length() != 0) {
                while (true) {
                    int i = fileInputStream.read(bArr);
                    if (i == -1) {
                        break;
                    } else {
                        messageDigest.update(bArr, 0, i);
                    }
                }
            }
            StringBuilder sb = new StringBuilder();
            for (byte b2 : messageDigest.digest()) {
                sb.append(String.format("%02x", Byte.valueOf(b2)));
            }
            promise.resolve(sb.toString());
        } catch (Exception e2) {
            e2.printStackTrace();
            promise.reject("EUNSPECIFIED", e2.getLocalizedMessage());
        }
    }

    public static InputStream o(String str) throws IOException {
        return str.startsWith("bundle-assets://") ? ReactNativeBlobUtil.RCTContext.getAssets().open(str.replace("bundle-assets://", "")) : new FileInputStream(new File(str));
    }

    public static boolean p(String str) {
        return str != null && str.startsWith("bundle-assets://");
    }

    public static boolean q(String str) {
        if (!str.startsWith("bundle-assets://")) {
            return new File(str).exists();
        }
        try {
            ReactNativeBlobUtil.RCTContext.getAssets().open(str.replace("bundle-assets://", ""));
            return true;
        } catch (IOException unused) {
            return false;
        }
    }

    public static void r(String str, Promise promise) {
        try {
            String strF = e.f(str);
            File file = new File(strF);
            if (!file.exists()) {
                promise.reject("ENOENT", "No such file '" + strF + "'");
                return;
            }
            if (!file.isDirectory()) {
                promise.reject("ENOTDIR", "Not a directory '" + strF + "'");
                return;
            }
            String[] list = new File(strF).list();
            WritableArray writableArrayCreateArray = Arguments.createArray();
            for (String str2 : list) {
                writableArrayCreateArray.pushString(str2);
            }
            promise.resolve(writableArrayCreateArray);
        } catch (Exception e2) {
            e2.printStackTrace();
            promise.reject("EUNSPECIFIED", e2.getLocalizedMessage());
        }
    }

    public static void s(String str, Callback callback) {
        new a(callback).execute(e.f(str));
    }

    public static void t(String str, Promise promise) {
        String strF = e.f(str);
        File file = new File(strF);
        if (file.exists()) {
            StringBuilder sb = new StringBuilder();
            sb.append(file.isDirectory() ? "Folder" : "File");
            sb.append(" '");
            sb.append(strF);
            sb.append("' already exists");
            promise.reject("EEXIST", sb.toString());
            return;
        }
        try {
            if (file.mkdirs()) {
                promise.resolve(Boolean.TRUE);
                return;
            }
            promise.reject("EUNSPECIFIED", "mkdir failed to create some or all directories in '" + strF + "'");
        } catch (Exception e2) {
            promise.reject("EUNSPECIFIED", e2.getLocalizedMessage());
        }
    }

    public static void u(String str, String str2, Callback callback) {
        String strF = e.f(str);
        String strF2 = e.f(str2);
        File file = new File(strF);
        if (!file.exists()) {
            callback.invoke("Source file at path `" + strF + "` does not exist");
            return;
        }
        try {
            File file2 = new File(strF2);
            File parentFile = file2.getParentFile();
            if (parentFile != null && !parentFile.exists()) {
                callback.invoke("mv failed because the destination directory doesn't exist");
                return;
            }
            if (file2.exists()) {
                file2.delete();
            }
            if (file.renameTo(file2)) {
                callback.invoke(new Object[0]);
            } else {
                callback.invoke("mv failed for unknown reasons");
            }
        } catch (Exception e2) {
            callback.invoke(e2.toString());
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0043 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:15:0x0045 A[Catch: Exception -> 0x003d, FileNotFoundException -> 0x0040, TryCatch #2 {FileNotFoundException -> 0x0040, Exception -> 0x003d, blocks: (B:7:0x000e, B:9:0x0014, B:18:0x007c, B:21:0x009b, B:41:0x00dc, B:42:0x00e6, B:43:0x00f0, B:45:0x00f7, B:46:0x00ff, B:47:0x0103, B:28:0x00b7, B:31:0x00c1, B:34:0x00cb, B:48:0x010b, B:49:0x0112, B:15:0x0045, B:16:0x0061), top: B:56:0x000e }] */
    /* JADX WARN: Code duplicated, block: B:16:0x0061 A[Catch: Exception -> 0x003d, FileNotFoundException -> 0x0040, TryCatch #2 {FileNotFoundException -> 0x0040, Exception -> 0x003d, blocks: (B:7:0x000e, B:9:0x0014, B:18:0x007c, B:21:0x009b, B:41:0x00dc, B:42:0x00e6, B:43:0x00f0, B:45:0x00f7, B:46:0x00ff, B:47:0x0103, B:28:0x00b7, B:31:0x00c1, B:34:0x00cb, B:48:0x010b, B:49:0x0112, B:15:0x0045, B:16:0x0061), top: B:56:0x000e }] */
    /* JADX WARN: Code duplicated, block: B:37:0x00d5  */
    public static void v(String str, String str2, boolean z, Promise promise) {
        int length;
        byte[] bArr;
        int i;
        byte b2;
        String strF = e.f(str);
        if (strF != null) {
            str = strF;
        }
        if (strF != null) {
            try {
                if (strF.startsWith("bundle-assets://")) {
                    String strReplace = str.replace("bundle-assets://", "");
                    length = (int) ReactNativeBlobUtil.RCTContext.getAssets().openFd(strReplace).getLength();
                    bArr = new byte[length];
                    InputStream inputStreamOpen = ReactNativeBlobUtil.RCTContext.getAssets().open(strReplace);
                    i = inputStreamOpen.read(bArr, 0, length);
                    inputStreamOpen.close();
                } else if (strF == null) {
                    InputStream inputStreamOpenInputStream = ReactNativeBlobUtil.RCTContext.getContentResolver().openInputStream(Uri.parse(str));
                    length = inputStreamOpenInputStream.available();
                    bArr = new byte[length];
                    i = inputStreamOpenInputStream.read(bArr);
                    inputStreamOpenInputStream.close();
                } else {
                    File file = new File(str);
                    length = (int) file.length();
                    bArr = new byte[length];
                    FileInputStream fileInputStream = new FileInputStream(file);
                    int i2 = fileInputStream.read(bArr);
                    fileInputStream.close();
                    i = i2;
                }
            } catch (FileNotFoundException e2) {
                String localizedMessage = e2.getLocalizedMessage();
                if (localizedMessage.contains("EISDIR")) {
                    promise.reject("EISDIR", "Expecting a file but '" + str + "' is a directory; " + localizedMessage);
                    return;
                }
                promise.reject("ENOENT", "No such file '" + str + "'; " + localizedMessage);
                return;
            } catch (Exception e3) {
                promise.reject("EUNSPECIFIED", e3.getLocalizedMessage());
                return;
            }
        } else if (strF == null) {
            InputStream inputStreamOpenInputStream2 = ReactNativeBlobUtil.RCTContext.getContentResolver().openInputStream(Uri.parse(str));
            length = inputStreamOpenInputStream2.available();
            bArr = new byte[length];
            i = inputStreamOpenInputStream2.read(bArr);
            inputStreamOpenInputStream2.close();
        } else {
            File file2 = new File(str);
            length = (int) file2.length();
            bArr = new byte[length];
            FileInputStream fileInputStream2 = new FileInputStream(file2);
            int i3 = fileInputStream2.read(bArr);
            fileInputStream2.close();
            i = i3;
        }
        if (i < length) {
            promise.reject("EUNSPECIFIED", "Read only " + i + " bytes of " + length);
            return;
        }
        if (z) {
            throw new IllegalStateException("Read file with transform was specified but the shared file transformer is not set");
        }
        String lowerCase = str2.toLowerCase(Locale.ROOT);
        int iHashCode = lowerCase.hashCode();
        if (iHashCode != -1396204209) {
            if (iHashCode != 3600241) {
                if (iHashCode == 93106001 && lowerCase.equals("ascii")) {
                    b2 = 1;
                } else {
                    b2 = -1;
                }
            } else if (lowerCase.equals("utf8")) {
                b2 = 2;
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
            if (b2 != 2) {
                promise.resolve(new String(bArr));
                return;
            } else {
                promise.resolve(new String(bArr));
                return;
            }
        }
        WritableArray writableArrayCreateArray = Arguments.createArray();
        for (byte b3 : bArr) {
            writableArrayCreateArray.pushInt(b3);
        }
        promise.resolve(writableArrayCreateArray);
    }

    public static void w(ReadableArray readableArray, Callback callback) {
        new c(callback).execute(readableArray);
    }

    public static void y(String str, String str2, int i, int i2, String str3, Promise promise) {
        try {
            String strF = e.f(str);
            String strF2 = e.f(str2);
            File file = new File(strF);
            if (file.isDirectory()) {
                promise.reject("EISDIR", "Expecting a file but '" + strF + "' is a directory");
                return;
            }
            if (!file.exists()) {
                promise.reject("ENOENT", "No such file '" + strF + "'");
                return;
            }
            int length = (int) file.length();
            int iMin = Math.min(length, i2) - i;
            FileInputStream fileInputStream = new FileInputStream(new File(strF));
            FileOutputStream fileOutputStream = new FileOutputStream(new File(strF2));
            int iSkip = (int) fileInputStream.skip(i);
            if (iSkip != i) {
                promise.reject("EUNSPECIFIED", "Skipped " + iSkip + " instead of the specified " + i + " bytes, size is " + length);
                return;
            }
            byte[] bArr = new byte[Data.MAX_DATA_BYTES];
            int i3 = 0;
            while (i3 < iMin) {
                int i4 = fileInputStream.read(bArr, 0, Data.MAX_DATA_BYTES);
                int i5 = iMin - i3;
                if (i4 <= 0) {
                    break;
                }
                fileOutputStream.write(bArr, 0, Math.min(i5, i4));
                i3 += i4;
            }
            fileInputStream.close();
            fileOutputStream.flush();
            fileOutputStream.close();
            promise.resolve(strF2);
        } catch (Exception e2) {
            e2.printStackTrace();
            promise.reject("EUNSPECIFIED", e2.getLocalizedMessage());
        }
    }

    public static void z(String str, Callback callback) {
        try {
            String strF = e.f(str);
            WritableMap writableMapA = A(strF);
            if (writableMapA == null) {
                callback.invoke("failed to stat path `" + strF + "` because it does not exist or it is not a folder", null);
            } else {
                callback.invoke(null, writableMapA);
            }
        } catch (Exception e2) {
            callback.invoke(e2.getLocalizedMessage());
        }
    }

    public void x(String[] strArr, String[] strArr2, Callback callback) {
        try {
            MediaScannerConnection.scanFile(this.f5652a, strArr, strArr2, new C0113b(callback));
        } catch (Exception e2) {
            callback.invoke(e2.getLocalizedMessage(), null);
        }
    }
}
