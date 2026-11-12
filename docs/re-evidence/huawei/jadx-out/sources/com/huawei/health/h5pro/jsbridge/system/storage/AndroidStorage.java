package com.huawei.health.h5pro.jsbridge.system.storage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Environment;
import android.text.TextUtils;
import android.util.Base64;
import com.huawei.health.h5pro.core.a;
import com.huawei.health.h5pro.core.b;
import com.huawei.health.h5pro.ext.permission.H5ProPermissionCallback;
import com.huawei.health.h5pro.utils.GeneralUtil;
import com.huawei.health.h5pro.utils.LogUtil;
import com.huawei.health.h5pro.utils.PermissionUtil;
import com.huawei.health.h5pro.webkit.FileDownloadManager;
import com.huawei.openalliance.ad.constant.IntentFailError;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.RandomAccessFile;
import java.nio.charset.StandardCharsets;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class AndroidStorage implements Storage {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Callback f6904a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f6905b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f6906c;
    private String d;
    private String e;

    public interface Callback {
        void onFailure(String str);

        <T> void onSuccess(T t);
    }

    public AndroidStorage(Context context) {
        this.f6905b = context;
    }

    private boolean a(int[] iArr) {
        for (int i : iArr) {
            if (i != 0) {
                return false;
            }
        }
        return true;
    }

    private static byte[] a(String str) {
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        char[] charArray = str.toCharArray();
        for (int i = 0; i < length; i++) {
            int i2 = i * 2;
            bArr[i] = (byte) (c(charArray[i2 + 1]) | (c(charArray[i2]) << 4));
        }
        return bArr;
    }

    private static byte c(char c2) {
        return (byte) "0123456789abcdef".indexOf(c2);
    }

    private static String e(byte[] bArr) {
        if (bArr == null || bArr.length <= 0) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (byte b2 : bArr) {
            String hexString = Integer.toHexString(b2 & 255);
            if (hexString.length() < 2) {
                sb.append("0");
            }
            sb.append(hexString);
        }
        return sb.toString();
    }

    @Override // com.huawei.health.h5pro.jsbridge.system.storage.Storage
    public boolean access(String str) {
        return new File(str).exists();
    }

    @Override // com.huawei.health.h5pro.jsbridge.system.storage.Storage
    public void base64ToFile(String str, String str2) throws IOException {
        if (!StorageUtil.ensureFileExists(new File(str))) {
            throw new IOException(a.a("base64ToImageFile fail: create file fail", str));
        }
        byte[] bArrDecode = Base64.decode(Pattern.compile("data:\\w+/\\w+;base64,").matcher(str2).replaceFirst(""), 0);
        FileOutputStream fileOutputStream = new FileOutputStream(str);
        try {
            fileOutputStream.write(bArrDecode);
            fileOutputStream.close();
        } catch (Throwable th) {
            try {
                fileOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // com.huawei.health.h5pro.jsbridge.system.storage.Storage
    public void base64ToImageFile(final String str, final String str2, final Callback callback) {
        if (!GeneralUtil.isSafePath(str)) {
            LogUtil.w("H5PRO_AndroidStorage", "base64ToImageFile: invalid path");
            callback.onFailure("invalid path");
        } else {
            ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
            executorServiceNewSingleThreadExecutor.execute(new Runnable() { // from class: com.huawei.health.h5pro.jsbridge.system.storage.AndroidStorage.3
                @Override // java.lang.Runnable
                public void run() {
                    LogUtil.i("H5PRO_AndroidStorage", "base64ToImageFile: start");
                    if (!StorageUtil.ensureFileExists(new File(str))) {
                        callback.onFailure("base64ToImageFile fail: create file fail" + str);
                        return;
                    }
                    byte[] bArrDecode = Base64.decode(str2.replace("data:image/jpeg;base64,", ""), 0);
                    Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length);
                    try {
                        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(str));
                        try {
                            bitmapDecodeByteArray.compress(Bitmap.CompressFormat.JPEG, 100, bufferedOutputStream);
                            bufferedOutputStream.flush();
                            LogUtil.i("H5PRO_AndroidStorage", "base64ToImageFile: end - " + bArrDecode.length);
                            callback.onSuccess(str);
                            bufferedOutputStream.close();
                        } catch (Throwable th) {
                            try {
                                bufferedOutputStream.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    } catch (IOException e) {
                        callback.onFailure(e.getMessage());
                    }
                }
            });
            executorServiceNewSingleThreadExecutor.shutdown();
        }
    }

    @Override // com.huawei.health.h5pro.jsbridge.system.storage.Storage
    public void clearKeyValues(String str) {
        SharedPreferences.Editor editorEdit = this.f6905b.getSharedPreferences(str, 0).edit();
        editorEdit.clear();
        editorEdit.apply();
    }

    @Override // com.huawei.health.h5pro.jsbridge.system.storage.Storage
    public void copy(String str, String str2) throws IOException {
        StorageUtil.ensureDirExists(new File(str2).getParentFile());
        try {
            FileInputStream fileInputStream = new FileInputStream(str);
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(str2);
                try {
                    byte[] bArr = new byte[1024];
                    int i = 0;
                    do {
                        int i2 = fileInputStream.read(bArr);
                        if (i2 <= 0) {
                            fileOutputStream.close();
                            fileInputStream.close();
                            return;
                        } else {
                            fileOutputStream.write(bArr, 0, i2);
                            i += i2;
                        }
                        try {
                            fileInputStream.close();
                        } catch (Throwable th) {
                            th.addSuppressed(th);
                        }
                        throw th;
                    } while (i <= 104857600);
                    throw new IOException("exceed max file size:104857600");
                } catch (Throwable th2) {
                    try {
                        fileOutputStream.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                    throw th2;
                }
            } catch (Throwable th4) {
                fileInputStream.close();
                throw th4;
            }
        } catch (Exception e) {
            throw new IOException("copy file fail" + e.getMessage());
        }
    }

    @Override // com.huawei.health.h5pro.jsbridge.system.storage.Storage
    public void delete(String str) throws IOException {
        File file = new File(str);
        if (!file.exists()) {
            throw new IllegalArgumentException("file not exist");
        }
        if (file.isDirectory()) {
            throw new IllegalArgumentException("is a dir");
        }
        if (!file.delete()) {
            throw new IOException("delete file fail");
        }
    }

    @Override // com.huawei.health.h5pro.jsbridge.system.storage.Storage
    public String get(String str) {
        File file = new File(str);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("name", file.getName());
            jSONObject.put("size", file.length());
            jSONObject.put("time", file.lastModified());
            jSONObject.put("type", file.isDirectory() ? "dir" : "file");
        } catch (JSONException e) {
            LogUtil.e("H5PRO_AndroidStorage", b.a(e, new StringBuilder("get: exception -> ")));
        }
        return jSONObject.toString();
    }

    @Override // com.huawei.health.h5pro.jsbridge.system.storage.Storage
    public String getValueByKey(String str, String str2) {
        return this.f6905b.getSharedPreferences(str, 0).getString(str2, "");
    }

    @Override // com.huawei.health.h5pro.jsbridge.system.storage.Storage
    public String[] list(String str) {
        File file = new File(str);
        if (file.exists() && file.isDirectory()) {
            return file.list();
        }
        throw new IllegalArgumentException("dir path invalid");
    }

    @Override // com.huawei.health.h5pro.jsbridge.system.storage.Storage
    public void mkdir(String str) throws IOException {
        File file = new File(str);
        if (file.exists()) {
            if (!file.isDirectory()) {
                throw new IllegalArgumentException("already has a file with this path");
            }
        } else if (!new File(str).mkdir()) {
            throw new IOException("mkdir fail");
        }
    }

    @Override // com.huawei.health.h5pro.jsbridge.system.storage.Storage
    public void move(String str, String str2) throws IOException {
        File file = new File(str);
        if (!file.exists() || file.isDirectory()) {
            throw new IllegalArgumentException("file not exist or is dir");
        }
        if (!StorageUtil.ensureDirExists(new File(str2).getParentFile())) {
            throw new IOException("move file create parent dir fail");
        }
        if (!file.renameTo(new File(str2))) {
            throw new IOException("move file fail");
        }
    }

    @Override // com.huawei.health.h5pro.jsbridge.system.storage.Storage
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (i == 11) {
            if (a(iArr)) {
                saveImageToAlbumAfterPermission(this.f6906c, this.e, this.d, this.f6904a);
                return;
            }
            Callback callback = this.f6904a;
            if (callback != null) {
                callback.onFailure(IntentFailError.NO_PERMISSION);
            }
        }
    }

    @Override // com.huawei.health.h5pro.jsbridge.system.storage.Storage
    public String readArrayBuffer(String str) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(str);
        try {
            byte[] bArr = new byte[fileInputStream.available()];
            if (fileInputStream.read(bArr) < 0) {
                throw new IOException("read inputStream fail");
            }
            String strE = e(bArr);
            fileInputStream.close();
            return strE;
        } catch (Throwable th) {
            try {
                fileInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // com.huawei.health.h5pro.jsbridge.system.storage.Storage
    public String readText(String str) throws IOException {
        File file = new File(str);
        if (!file.exists()) {
            throw new IllegalArgumentException("file not exist");
        }
        StringBuilder sb = new StringBuilder();
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream, StandardCharsets.UTF_8);
            try {
                BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
                while (true) {
                    try {
                        String line = bufferedReader.readLine();
                        if (line == null) {
                            bufferedReader.close();
                            inputStreamReader.close();
                            fileInputStream.close();
                            return sb.toString();
                        }
                        sb.append(line);
                        sb.append(System.lineSeparator());
                    } catch (Throwable th) {
                        try {
                            bufferedReader.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                    try {
                        inputStreamReader.close();
                    } catch (Throwable th3) {
                        th.addSuppressed(th3);
                    }
                    throw th;
                }
            } catch (Throwable th4) {
                inputStreamReader.close();
                throw th4;
            }
        } catch (Throwable th5) {
            try {
                fileInputStream.close();
            } catch (Throwable th6) {
                th5.addSuppressed(th6);
            }
            throw th5;
        }
    }

    @Override // com.huawei.health.h5pro.jsbridge.system.storage.Storage
    public void rmdir(String str) throws IOException {
        File file = new File(str);
        if (!file.exists()) {
            throw new IllegalArgumentException("remove fail: dir not exist");
        }
        if (!file.isDirectory()) {
            throw new IllegalArgumentException("remove fail: not a dir");
        }
        b(file);
    }

    @Override // com.huawei.health.h5pro.jsbridge.system.storage.Storage
    public void saveImageToAlbum(String str, String str2, String str3, Callback callback) {
        this.d = str3;
        this.f6906c = str;
        this.e = str2;
        this.f6904a = callback;
        PermissionUtil.getInstance().checkAndRequestPermissions((Activity) this.f6905b, PermissionUtil.f7000b, 11, new H5ProPermissionCallback() { // from class: com.huawei.health.h5pro.jsbridge.system.storage.AndroidStorage.1
            @Override // com.huawei.health.h5pro.ext.permission.H5ProPermissionCallback
            public void onDenied(String str4) {
                if (AndroidStorage.this.f6904a != null) {
                    AndroidStorage.this.f6904a.onFailure(IntentFailError.NO_PERMISSION);
                }
            }

            @Override // com.huawei.health.h5pro.ext.permission.H5ProPermissionCallback
            public void onForeverDenied(String[] strArr) {
                if (AndroidStorage.this.f6904a != null) {
                    AndroidStorage.this.f6904a.onFailure(IntentFailError.NO_PERMISSION);
                }
            }

            @Override // com.huawei.health.h5pro.ext.permission.H5ProPermissionCallback
            public void onGranted() {
                AndroidStorage androidStorage = AndroidStorage.this;
                androidStorage.saveImageToAlbumAfterPermission(androidStorage.f6906c, AndroidStorage.this.e, AndroidStorage.this.d, AndroidStorage.this.f6904a);
            }
        });
    }

    public void saveImageToAlbumAfterPermission(String str, String str2, String str3, final Callback callback) {
        final String str4;
        if (TextUtils.isEmpty(str3)) {
            Locale locale = Locale.ENGLISH;
            str4 = System.currentTimeMillis() + ".jpg";
        } else {
            Locale locale2 = Locale.ENGLISH;
            str4 = System.currentTimeMillis() + "_" + str3;
        }
        final File externalStoragePublicDirectory = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DCIM);
        try {
            String canonicalPath = externalStoragePublicDirectory.getCanonicalPath();
            if ("BASE64".equalsIgnoreCase(str)) {
                base64ToImageFile(canonicalPath + File.separator + str4, str2, new Callback() { // from class: com.huawei.health.h5pro.jsbridge.system.storage.AndroidStorage.4
                    @Override // com.huawei.health.h5pro.jsbridge.system.storage.AndroidStorage.Callback
                    public void onFailure(String str5) {
                        callback.onFailure(str5);
                    }

                    @Override // com.huawei.health.h5pro.jsbridge.system.storage.AndroidStorage.Callback
                    public <T> void onSuccess(T t) {
                        AndroidStorage.this.f6905b.sendBroadcast(new Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE", Uri.fromFile(new File(externalStoragePublicDirectory, str4))));
                        callback.onSuccess(t);
                    }
                });
                return;
            }
            if ("URL".equalsIgnoreCase(str)) {
                FileDownloadManager.download(str2, canonicalPath, str4, new FileDownloadManager.DownloadCallback() { // from class: com.huawei.health.h5pro.jsbridge.system.storage.AndroidStorage.2
                    @Override // com.huawei.health.h5pro.webkit.FileDownloadManager.DownloadCallback
                    public void onFailure(int i, String str5) {
                        LogUtil.e("H5PRO_AndroidStorage", "saveImageToAlbum: onFailure-> " + i + "===" + str5);
                        Callback callback2 = callback;
                        Locale locale3 = Locale.ROOT;
                        callback2.onFailure("saveImageToAlbum fail: errorCode=" + i + ", errorMsg=" + str5);
                    }

                    @Override // com.huawei.health.h5pro.webkit.FileDownloadManager.DownloadCallback
                    public void onSuccess(File file) {
                        LogUtil.i("H5PRO_AndroidStorage", "saveImageToAlbum: onSuccess-> " + file);
                        callback.onSuccess(file.getAbsolutePath());
                        AndroidStorage.this.f6905b.sendBroadcast(new Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE", Uri.fromFile(new File(externalStoragePublicDirectory, str4))));
                    }
                });
                return;
            }
            LogUtil.w("H5PRO_AndroidStorage", "unsupported resource type: " + str);
        } catch (IOException e) {
            LogUtil.e("H5PRO_AndroidStorage", "saveImageToAlbum: ioException-> " + e.getMessage());
            callback.onFailure(e.getMessage());
        }
    }

    @Override // com.huawei.health.h5pro.jsbridge.system.storage.Storage
    public void setValueByKey(String str, String str2, String str3) {
        SharedPreferences.Editor editorEdit = this.f6905b.getSharedPreferences(str, 0).edit();
        editorEdit.putString(str2, str3);
        editorEdit.apply();
    }

    @Override // com.huawei.health.h5pro.jsbridge.system.storage.Storage
    public void writeArrayBuffer(String str, String str2) throws IOException {
        byte[] bArrA = a(str2);
        FileOutputStream fileOutputStream = new FileOutputStream(str);
        try {
            fileOutputStream.write(bArrA);
            fileOutputStream.flush();
            fileOutputStream.close();
        } catch (Throwable th) {
            try {
                fileOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // com.huawei.health.h5pro.jsbridge.system.storage.Storage
    public void writeText(String str, String str2, boolean z) throws IOException {
        LogUtil.i("H5PRO_AndroidStorage", "write text:" + str + " " + str2);
        File file = new File(str);
        if (!z && file.exists() && !file.delete()) {
            throw new IOException("delete old file fail");
        }
        if (StorageUtil.ensureFileExists(file)) {
            RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rwd");
            randomAccessFile.seek(file.length());
            randomAccessFile.write(str2.getBytes(StandardCharsets.UTF_8));
            randomAccessFile.close();
        }
    }

    private void b(File file) throws IOException {
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            return;
        }
        for (File file2 : fileArrListFiles) {
            if (file2.isDirectory()) {
                b(file2);
            } else if (!file2.delete()) {
                throw new IOException("delete sub file fail");
            }
        }
        if (!file.delete()) {
            throw new IOException("delete dir fail");
        }
    }
}
