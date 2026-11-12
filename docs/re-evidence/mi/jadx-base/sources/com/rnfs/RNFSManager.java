package com.rnfs;

import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import android.database.Cursor;
import android.media.MediaScannerConnection;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Environment;
import android.os.StatFs;
import android.util.Base64;
import android.util.SparseArray;
import androidx.work.Data;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.core.RCTNativeAppEventEmitter;
import com.miui.tsmclient.util.Constants;
import com.xiaomi.fitness.devicesettings.bluttooth.todo.miui.MiuiCursorConstants;
import com.xiaomi.smarthome.framework.plugin.rn.utils.MediaStoreUtil;
import com.xiaomi.smarthome.library.crypto.rc4coder.Coder;
import com.xiaomi.smarthome.plugin.update.PluginPackageConstant;
import defpackage.ddq;
import defpackage.ndj;
import defpackage.r37;
import defpackage.zuc;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.RandomAccessFile;
import java.net.URL;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
@ndj(name = RNFSManager.MODULE_NAME)
public class RNFSManager extends ReactContextBaseJavaModule {
    static final String MODULE_NAME = "RNFSManager";
    private static final String RNFSCachesDirectoryPath = "RNFSCachesDirectoryPath";
    private static final String RNFSDocumentDirectory = "RNFSDocumentDirectory";
    private static final String RNFSDocumentDirectoryPath = "RNFSDocumentDirectoryPath";
    private static final String RNFSDownloadDirectoryPath = "RNFSDownloadDirectoryPath";
    private static final String RNFSExternalCachesDirectoryPath = "RNFSExternalCachesDirectoryPath";
    private static final String RNFSExternalDirectoryPath = "RNFSExternalDirectoryPath";
    private static final String RNFSExternalStorageDirectoryPath = "RNFSExternalStorageDirectoryPath";
    private static final String RNFSFileTypeDirectory = "RNFSFileTypeDirectory";
    private static final String RNFSFileTypeRegular = "RNFSFileTypeRegular";
    private static final String RNFSPicturesDirectoryPath = "RNFSPicturesDirectoryPath";
    private static final String RNFSTemporaryDirectoryPath = "RNFSTemporaryDirectoryPath";
    private SparseArray<com.rnfs.b> downloaders;
    private ReactApplicationContext reactContext;
    private SparseArray<com.rnfs.d> uploaders;

    public class a extends j {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ File f10565b;
        public final /* synthetic */ Promise c;
        public final /* synthetic */ String d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(File file, Promise promise, String str) {
            super();
            this.f10565b = file;
            this.c = promise;
            this.d = str;
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Exception exc) {
            if (exc == null) {
                this.f10565b.delete();
                this.c.resolve(Boolean.TRUE);
            } else {
                exc.printStackTrace();
                RNFSManager.this.reject(this.c, this.d, exc);
            }
        }
    }

    public class b extends j {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Promise f10566b;
        public final /* synthetic */ String c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Promise promise, String str) {
            super();
            this.f10566b = promise;
            this.c = str;
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Exception exc) {
            if (exc == null) {
                this.f10566b.resolve(null);
            } else {
                exc.printStackTrace();
                RNFSManager.this.reject(this.f10566b, this.c, exc);
            }
        }
    }

    public class c implements com.rnfs.a.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f10567a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Promise f10568b;
        public final /* synthetic */ ReadableMap c;

        public c(int i, Promise promise, ReadableMap readableMap) {
            this.f10567a = i;
            this.f10568b = promise;
            this.c = readableMap;
        }

        @Override // com.rnfs.a.c
        public void a(r37 r37Var) {
            if (r37Var.c != null) {
                RNFSManager.this.reject(this.f10568b, this.c.getString("toFile"), r37Var.c);
                return;
            }
            WritableMap writableMapCreateMap = Arguments.createMap();
            writableMapCreateMap.putInt("jobId", this.f10567a);
            writableMapCreateMap.putInt(Constants.PARAM_STATUS_CODE, r37Var.f32133a);
            writableMapCreateMap.putDouble("bytesWritten", r37Var.f32134b);
            this.f10568b.resolve(writableMapCreateMap);
        }
    }

    public class d implements com.rnfs.a.InterfaceC0333a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f10569a;

        public d(int i) {
            this.f10569a = i;
        }

        @Override // com.rnfs.a.InterfaceC0333a
        public void a(int i, long j, Map<String, String> map) {
            WritableMap writableMapCreateMap = Arguments.createMap();
            for (Map.Entry<String, String> entry : map.entrySet()) {
                writableMapCreateMap.putString(entry.getKey(), entry.getValue());
            }
            WritableMap writableMapCreateMap2 = Arguments.createMap();
            writableMapCreateMap2.putInt("jobId", this.f10569a);
            writableMapCreateMap2.putInt(Constants.PARAM_STATUS_CODE, i);
            writableMapCreateMap2.putDouble("contentLength", j);
            writableMapCreateMap2.putMap("headers", writableMapCreateMap);
            RNFSManager rNFSManager = RNFSManager.this;
            rNFSManager.sendEvent(rNFSManager.getReactApplicationContext(), "DownloadBegin", writableMapCreateMap2);
        }
    }

    public class e implements com.rnfs.a.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f10571a;

        public e(int i) {
            this.f10571a = i;
        }

        @Override // com.rnfs.a.b
        public void a(long j, long j2) {
            WritableMap writableMapCreateMap = Arguments.createMap();
            writableMapCreateMap.putInt("jobId", this.f10571a);
            writableMapCreateMap.putDouble("contentLength", j);
            writableMapCreateMap.putDouble("bytesWritten", j2);
            RNFSManager rNFSManager = RNFSManager.this;
            rNFSManager.sendEvent(rNFSManager.getReactApplicationContext(), "DownloadProgress", writableMapCreateMap);
        }
    }

    public class f implements com.rnfs.c.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f10573a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Promise f10574b;
        public final /* synthetic */ ReadableMap c;

        public f(int i, Promise promise, ReadableMap readableMap) {
            this.f10573a = i;
            this.f10574b = promise;
            this.c = readableMap;
        }

        @Override // com.rnfs.c.b
        public void a(ddq ddqVar) {
            if (ddqVar.c != null) {
                RNFSManager.this.reject(this.f10574b, this.c.getString("toUrl"), ddqVar.c);
                return;
            }
            WritableMap writableMapCreateMap = Arguments.createMap();
            writableMapCreateMap.putInt("jobId", this.f10573a);
            writableMapCreateMap.putInt(Constants.PARAM_STATUS_CODE, ddqVar.f15417a);
            writableMapCreateMap.putMap("headers", ddqVar.f15418b);
            writableMapCreateMap.putString("body", ddqVar.d);
            this.f10574b.resolve(writableMapCreateMap);
        }
    }

    public class g implements com.rnfs.c.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f10575a;

        public g(int i) {
            this.f10575a = i;
        }

        @Override // com.rnfs.c.a
        public void a() {
            WritableMap writableMapCreateMap = Arguments.createMap();
            writableMapCreateMap.putInt("jobId", this.f10575a);
            RNFSManager rNFSManager = RNFSManager.this;
            rNFSManager.sendEvent(rNFSManager.getReactApplicationContext(), "UploadBegin", writableMapCreateMap);
        }
    }

    public class h implements com.rnfs.c.InterfaceC0334c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f10577a;

        public h(int i) {
            this.f10577a = i;
        }

        @Override // com.rnfs.c.InterfaceC0334c
        public void a(int i, int i2) {
            WritableMap writableMapCreateMap = Arguments.createMap();
            writableMapCreateMap.putInt("jobId", this.f10577a);
            writableMapCreateMap.putInt("totalBytesExpectedToSend", i);
            writableMapCreateMap.putInt("totalBytesSent", i2);
            RNFSManager rNFSManager = RNFSManager.this;
            rNFSManager.sendEvent(rNFSManager.getReactApplicationContext(), "UploadProgress", writableMapCreateMap);
        }
    }

    public class i implements MediaScannerConnection.MediaScannerConnectionClient {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Promise f10579a;

        public i(Promise promise) {
            this.f10579a = promise;
        }

        @Override // android.media.MediaScannerConnection.MediaScannerConnectionClient
        public void onMediaScannerConnected() {
        }

        @Override // android.media.MediaScannerConnection.OnScanCompletedListener
        public void onScanCompleted(String str, Uri uri) {
            this.f10579a.resolve(str);
        }
    }

    public class j extends AsyncTask<String, Void, Exception> {
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Exception doInBackground(String... strArr) {
            try {
                String str = strArr[0];
                String str2 = strArr[1];
                InputStream inputStream = RNFSManager.this.getInputStream(str);
                OutputStream outputStream = RNFSManager.this.getOutputStream(str2, false);
                byte[] bArr = new byte[1024];
                while (true) {
                    int i = inputStream.read(bArr);
                    if (i <= 0) {
                        inputStream.close();
                        outputStream.close();
                        return null;
                    }
                    outputStream.write(bArr, 0, i);
                    Thread.yield();
                }
            } catch (Exception e) {
                return e;
            }
        }

        public j() {
        }
    }

    public RNFSManager(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.downloaders = new SparseArray<>();
        this.uploaders = new SparseArray<>();
        this.reactContext = reactApplicationContext;
    }

    private void DeleteRecursive(File file) {
        if (file.isDirectory()) {
            for (File file2 : file.listFiles()) {
                DeleteRecursive(file2);
            }
        }
        file.delete();
    }

    /* JADX WARN: Code duplicated, block: B:38:0x0054 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:49:0x0059 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:56:? A[SYNTHETIC] */
    /* JADX WARN: Not initialized variable reg: 2, insn: 0x0016: MOVE (r1 I:??[OBJECT, ARRAY]) = (r2 I:??[OBJECT, ARRAY]), block:B:10:0x0016 */
    private void copyInputStream(InputStream inputStream, String str, String str2, Promise promise) throws Throwable {
        OutputStream outputStream;
        Exception e2;
        OutputStream outputStream2;
        OutputStream outputStream3 = null;
        try {
            try {
                outputStream = getOutputStream(str2, false);
                try {
                    byte[] bArr = new byte[Data.MAX_DATA_BYTES];
                    while (true) {
                        int i2 = inputStream.read(bArr);
                        if (i2 == -1) {
                            break;
                        } else {
                            outputStream.write(bArr, 0, i2);
                        }
                    }
                    promise.resolve(null);
                    try {
                        inputStream.close();
                    } catch (IOException unused) {
                    }
                    if (outputStream == null) {
                        return;
                    }
                } catch (Exception e3) {
                    e2 = e3;
                    reject(promise, str, new Exception(String.format("Failed to copy '%s' to %s (%s)", str, str2, e2.getLocalizedMessage())));
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (IOException unused2) {
                        }
                    }
                    if (outputStream == null) {
                        return;
                    }
                }
            } catch (Throwable th) {
                th = th;
                outputStream3 = outputStream2;
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException unused3) {
                    }
                }
                if (outputStream3 != null) {
                    throw th;
                }
                try {
                    outputStream3.close();
                    throw th;
                } catch (IOException unused4) {
                    throw th;
                }
            }
        } catch (Exception e4) {
            outputStream = null;
            e2 = e4;
        } catch (Throwable th2) {
            th = th2;
            if (inputStream != null) {
                inputStream.close();
            }
            if (outputStream3 != null) {
                throw th;
            }
            outputStream3.close();
            throw th;
        }
        try {
            outputStream.close();
        } catch (IOException unused5) {
        }
    }

    private Uri getFileUri(String str, boolean z) throws zuc {
        Uri uri = Uri.parse(str);
        if (uri.getScheme() != null) {
            return uri;
        }
        File file = new File(str);
        if (z || !file.isDirectory()) {
            return Uri.parse("file://" + str);
        }
        throw new zuc("EISDIR", "EISDIR: illegal operation on a directory, read '" + str + "'");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public InputStream getInputStream(String str) throws zuc {
        try {
            InputStream inputStreamOpenInputStream = this.reactContext.getContentResolver().openInputStream(getFileUri(str, false));
            if (inputStreamOpenInputStream != null) {
                return inputStreamOpenInputStream;
            }
            throw new zuc("ENOENT", "ENOENT: could not open an input stream for '" + str + "'");
        } catch (FileNotFoundException e2) {
            throw new zuc("ENOENT", "ENOENT: " + e2.getMessage() + ", open '" + str + "'");
        }
    }

    private static byte[] getInputStreamBytes(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[1024];
        while (true) {
            try {
                int i2 = inputStream.read(bArr);
                if (i2 == -1) {
                    break;
                }
                byteArrayOutputStream.write(bArr, 0, i2);
            } catch (Throwable th) {
                try {
                    byteArrayOutputStream.close();
                } catch (IOException unused) {
                }
                throw th;
            }
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        try {
            byteArrayOutputStream.close();
        } catch (IOException unused2) {
        }
        return byteArray;
    }

    private String getOriginalFilepath(String str, boolean z) throws zuc {
        Uri fileUri = getFileUri(str, z);
        if (fileUri.getScheme().equals(MiuiCursorConstants.CONTENT)) {
            try {
                Cursor cursorQuery = this.reactContext.getContentResolver().query(fileUri, null, null, null, null);
                if (cursorQuery.moveToFirst()) {
                    str = cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("_data"));
                }
                cursorQuery.close();
            } catch (IllegalArgumentException unused) {
            }
        }
        return str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public OutputStream getOutputStream(String str, boolean z) throws zuc {
        try {
            OutputStream outputStreamOpenOutputStream = this.reactContext.getContentResolver().openOutputStream(getFileUri(str, false), z ? "wa" : Constants.DEVICE_TYPE_WEAR);
            if (outputStreamOpenOutputStream != null) {
                return outputStreamOpenOutputStream;
            }
            throw new zuc("ENOENT", "ENOENT: could not open an output stream for '" + str + "'");
        } catch (FileNotFoundException e2) {
            throw new zuc("ENOENT", "ENOENT: " + e2.getMessage() + ", open '" + str + "'");
        }
    }

    private int getResIdentifier(String str) {
        boolean z = true;
        String strSubstring = str.substring(str.lastIndexOf(".") + 1);
        String strSubstring2 = str.substring(0, str.lastIndexOf("."));
        if (!strSubstring.equals("png") && !strSubstring.equals("jpg") && !strSubstring.equals("jpeg") && !strSubstring.equals("bmp") && !strSubstring.equals("gif") && !strSubstring.equals("webp") && !strSubstring.equals("psd") && !strSubstring.equals("svg") && !strSubstring.equals("tiff")) {
            z = false;
        }
        return getReactApplicationContext().getResources().getIdentifier(strSubstring2, z ? "drawable" : "raw", getReactApplicationContext().getPackageName());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void reject(Promise promise, String str, Exception exc) {
        if (exc instanceof FileNotFoundException) {
            rejectFileNotFound(promise, str);
        } else if (!(exc instanceof zuc)) {
            promise.reject((String) null, exc.getMessage());
        } else {
            zuc zucVar = (zuc) exc;
            promise.reject(zucVar.a(), zucVar.getMessage());
        }
    }

    private void rejectFileIsDirectory(Promise promise) {
        promise.reject("EISDIR", "EISDIR: illegal operation on a directory, read");
    }

    private void rejectFileNotFound(Promise promise, String str) {
        promise.reject("ENOENT", "ENOENT: no such file or directory, open '" + str + "'");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sendEvent(ReactContext reactContext, String str, WritableMap writableMap) {
        ((RCTNativeAppEventEmitter) reactContext.getJSModule(RCTNativeAppEventEmitter.class)).emit(str, writableMap);
    }

    @ReactMethod
    public void appendFile(String str, String str2, Promise promise) {
        try {
            byte[] bArrDecode = Base64.decode(str2, 0);
            OutputStream outputStream = getOutputStream(str, true);
            outputStream.write(bArrDecode);
            outputStream.close();
            promise.resolve(null);
        } catch (Exception e2) {
            e2.printStackTrace();
            reject(promise, str, e2);
        }
    }

    @ReactMethod
    public void copyFile(String str, String str2, ReadableMap readableMap, Promise promise) {
        new b(promise, str).execute(str, str2);
    }

    @ReactMethod
    public void copyFileAssets(String str, String str2, Promise promise) throws Throwable {
        try {
            copyInputStream(getReactApplicationContext().getAssets().open(str), str, str2, promise);
        } catch (IOException unused) {
            reject(promise, str, new Exception(String.format("Asset '%s' could not be opened", str)));
        }
    }

    @ReactMethod
    public void copyFileRes(String str, String str2, Promise promise) throws Throwable {
        try {
            copyInputStream(getReactApplicationContext().getResources().openRawResource(getResIdentifier(str)), str, str2, promise);
        } catch (Exception unused) {
            reject(promise, str, new Exception(String.format("Res '%s' could not be opened", str)));
        }
    }

    @ReactMethod
    public void downloadFile(ReadableMap readableMap, Promise promise) {
        try {
            File file = new File(readableMap.getString("toFile"));
            URL url = new URL(readableMap.getString("fromUrl"));
            int i2 = readableMap.getInt("jobId");
            ReadableMap map = readableMap.getMap("headers");
            int i3 = readableMap.getInt("progressInterval");
            int i4 = readableMap.getInt("progressDivider");
            int i5 = readableMap.getInt("readTimeout");
            int i6 = readableMap.getInt("connectionTimeout");
            boolean z = readableMap.getBoolean("hasBeginCallback");
            boolean z2 = readableMap.getBoolean("hasProgressCallback");
            com.rnfs.a aVar = new com.rnfs.a();
            aVar.f10582a = url;
            aVar.f10583b = file;
            aVar.c = map;
            aVar.d = i3;
            aVar.e = i4;
            aVar.f = i5;
            aVar.g = i6;
            aVar.h = new c(i2, promise, readableMap);
            if (z) {
                aVar.i = new d(i2);
            }
            if (z2) {
                aVar.j = new e(i2);
            }
            com.rnfs.b bVar = new com.rnfs.b();
            bVar.execute(aVar);
            this.downloaders.put(i2, bVar);
        } catch (Exception e2) {
            e2.printStackTrace();
            reject(promise, readableMap.getString("toFile"), e2);
        }
    }

    @ReactMethod
    public void exists(String str, Promise promise) {
        try {
            promise.resolve(Boolean.valueOf(new File(str).exists()));
        } catch (Exception e2) {
            e2.printStackTrace();
            reject(promise, str, e2);
        }
    }

    @ReactMethod
    public void existsAssets(String str, Promise promise) {
        try {
            AssetManager assets = getReactApplicationContext().getAssets();
            try {
                String[] list = assets.list(str);
                if (list != null && list.length > 0) {
                    promise.resolve(Boolean.TRUE);
                    return;
                }
            } catch (Exception unused) {
            }
            InputStream inputStreamOpen = null;
            try {
                try {
                    inputStreamOpen = assets.open(str);
                    promise.resolve(Boolean.TRUE);
                    if (inputStreamOpen == null) {
                        return;
                    }
                } catch (Exception unused2) {
                    promise.resolve(Boolean.FALSE);
                    if (inputStreamOpen == null) {
                        return;
                    }
                }
                try {
                    inputStreamOpen.close();
                } catch (Exception unused3) {
                }
            } catch (Throwable th) {
                if (inputStreamOpen != null) {
                    try {
                        inputStreamOpen.close();
                    } catch (Exception unused4) {
                    }
                }
                throw th;
            }
        } catch (Exception e2) {
            e2.printStackTrace();
            reject(promise, str, e2);
        }
    }

    @ReactMethod
    public void existsRes(String str, Promise promise) {
        try {
            if (getResIdentifier(str) > 0) {
                promise.resolve(Boolean.TRUE);
            } else {
                promise.resolve(Boolean.FALSE);
            }
        } catch (Exception e2) {
            e2.printStackTrace();
            reject(promise, str, e2);
        }
    }

    @ReactMethod
    public void getAllExternalFilesDirs(Promise promise) {
        File[] externalFilesDirs = getReactApplicationContext().getExternalFilesDirs(null);
        WritableArray writableArrayCreateArray = Arguments.createArray();
        for (File file : externalFilesDirs) {
            if (file != null) {
                writableArrayCreateArray.pushString(file.getAbsolutePath());
            }
        }
        promise.resolve(writableArrayCreateArray);
    }

    @Override // com.facebook.react.bridge.BaseJavaModule
    public Map<String, Object> getConstants() {
        HashMap map = new HashMap();
        map.put(RNFSDocumentDirectory, 0);
        map.put(RNFSDocumentDirectoryPath, getReactApplicationContext().getFilesDir().getAbsolutePath());
        map.put(RNFSTemporaryDirectoryPath, getReactApplicationContext().getCacheDir().getAbsolutePath());
        map.put(RNFSPicturesDirectoryPath, Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES).getAbsolutePath());
        map.put(RNFSCachesDirectoryPath, getReactApplicationContext().getCacheDir().getAbsolutePath());
        map.put(RNFSDownloadDirectoryPath, Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS).getAbsolutePath());
        map.put(RNFSFileTypeRegular, 0);
        map.put(RNFSFileTypeDirectory, 1);
        File externalStorageDirectory = Environment.getExternalStorageDirectory();
        if (externalStorageDirectory != null) {
            map.put(RNFSExternalStorageDirectoryPath, externalStorageDirectory.getAbsolutePath());
        } else {
            map.put(RNFSExternalStorageDirectoryPath, null);
        }
        File externalFilesDir = getReactApplicationContext().getExternalFilesDir(null);
        if (externalFilesDir != null) {
            map.put(RNFSExternalDirectoryPath, externalFilesDir.getAbsolutePath());
        } else {
            map.put(RNFSExternalDirectoryPath, null);
        }
        File externalCacheDir = getReactApplicationContext().getExternalCacheDir();
        if (externalCacheDir != null) {
            map.put(RNFSExternalCachesDirectoryPath, externalCacheDir.getAbsolutePath());
        } else {
            map.put(RNFSExternalCachesDirectoryPath, null);
        }
        return map;
    }

    @ReactMethod
    public void getFSInfo(Promise promise) {
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        StatFs statFs2 = new StatFs(Environment.getExternalStorageDirectory().getPath());
        long totalBytes = statFs.getTotalBytes();
        long freeBytes = statFs.getFreeBytes();
        long totalBytes2 = statFs2.getTotalBytes();
        long freeBytes2 = statFs2.getFreeBytes();
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putDouble("totalSpace", totalBytes);
        writableMapCreateMap.putDouble("freeSpace", freeBytes);
        writableMapCreateMap.putDouble("totalSpaceEx", totalBytes2);
        writableMapCreateMap.putDouble("freeSpaceEx", freeBytes2);
        promise.resolve(writableMapCreateMap);
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return MODULE_NAME;
    }

    @ReactMethod
    public void hash(String str, String str2, Promise promise) {
        try {
            HashMap map = new HashMap();
            map.put("md5", Coder.KEY_MD5);
            map.put("sha1", "SHA-1");
            map.put("sha224", "SHA-224");
            map.put("sha256", PluginPackageConstant.RN_BUNDLE_HASH_ALGORITHM);
            map.put("sha384", "SHA-384");
            map.put("sha512", "SHA-512");
            if (!map.containsKey(str2)) {
                throw new Exception("Invalid hash algorithm");
            }
            File file = new File(str);
            if (file.isDirectory()) {
                rejectFileIsDirectory(promise);
                return;
            }
            if (!file.exists()) {
                rejectFileNotFound(promise, str);
                return;
            }
            MessageDigest messageDigest = MessageDigest.getInstance((String) map.get(str2));
            FileInputStream fileInputStream = new FileInputStream(str);
            byte[] bArr = new byte[Data.MAX_DATA_BYTES];
            while (true) {
                int i2 = fileInputStream.read(bArr);
                if (i2 == -1) {
                    break;
                } else {
                    messageDigest.update(bArr, 0, i2);
                }
            }
            StringBuilder sb = new StringBuilder();
            for (byte b2 : messageDigest.digest()) {
                sb.append(String.format("%02x", Byte.valueOf(b2)));
            }
            promise.resolve(sb.toString());
        } catch (Exception e2) {
            e2.printStackTrace();
            reject(promise, str, e2);
        }
    }

    @ReactMethod
    public void mkdir(String str, ReadableMap readableMap, Promise promise) {
        try {
            File file = new File(str);
            file.mkdirs();
            if (!file.exists()) {
                throw new Exception("Directory could not be created");
            }
            promise.resolve(null);
        } catch (Exception e2) {
            e2.printStackTrace();
            reject(promise, str, e2);
        }
    }

    @ReactMethod
    public void moveFile(String str, String str2, ReadableMap readableMap, Promise promise) {
        try {
            File file = new File(str);
            if (file.renameTo(new File(str2))) {
                promise.resolve(Boolean.TRUE);
            } else {
                new a(file, promise, str).execute(str, str2);
            }
        } catch (Exception e2) {
            e2.printStackTrace();
            reject(promise, str, e2);
        }
    }

    @ReactMethod
    public void pathForBundle(String str, Promise promise) {
    }

    @ReactMethod
    public void pathForGroup(String str, Promise promise) {
    }

    @ReactMethod
    public void read(String str, int i2, int i3, Promise promise) {
        try {
            InputStream inputStream = getInputStream(str);
            byte[] bArr = new byte[i2];
            inputStream.skip(i3);
            promise.resolve(Base64.encodeToString(bArr, 0, inputStream.read(bArr, 0, i2), 2));
        } catch (Exception e2) {
            e2.printStackTrace();
            reject(promise, str, e2);
        }
    }

    @ReactMethod
    public void readDir(String str, Promise promise) {
        try {
            File file = new File(str);
            if (!file.exists()) {
                throw new Exception("Folder does not exist");
            }
            File[] fileArrListFiles = file.listFiles();
            WritableArray writableArrayCreateArray = Arguments.createArray();
            for (File file2 : fileArrListFiles) {
                WritableMap writableMapCreateMap = Arguments.createMap();
                writableMapCreateMap.putDouble("mtime", file2.lastModified() / 1000.0d);
                writableMapCreateMap.putString("name", file2.getName());
                writableMapCreateMap.putString("path", file2.getAbsolutePath());
                writableMapCreateMap.putDouble(MediaStoreUtil.MediaInfo.SIZE, file2.length());
                writableMapCreateMap.putInt("type", file2.isDirectory() ? 1 : 0);
                writableArrayCreateArray.pushMap(writableMapCreateMap);
            }
            promise.resolve(writableArrayCreateArray);
        } catch (Exception e2) {
            e2.printStackTrace();
            reject(promise, str, e2);
        }
    }

    @ReactMethod
    public void readDirAssets(String str, Promise promise) {
        int length;
        try {
            AssetManager assets = getReactApplicationContext().getAssets();
            String[] list = assets.list(str);
            WritableArray writableArrayCreateArray = Arguments.createArray();
            for (String str2 : list) {
                WritableMap writableMapCreateMap = Arguments.createMap();
                writableMapCreateMap.putString("name", str2);
                if (!str.isEmpty()) {
                    str2 = String.format("%s/%s", str, str2);
                }
                writableMapCreateMap.putString("path", str2);
                int i2 = 1;
                try {
                    AssetFileDescriptor assetFileDescriptorOpenFd = assets.openFd(str2);
                    if (assetFileDescriptorOpenFd != null) {
                        length = (int) assetFileDescriptorOpenFd.getLength();
                        try {
                            assetFileDescriptorOpenFd.close();
                            i2 = 0;
                        } catch (IOException e2) {
                            e = e2;
                            i2 = 1 ^ (e.getMessage().contains("compressed") ? 1 : 0);
                        }
                    } else {
                        length = 0;
                    }
                } catch (IOException e3) {
                    e = e3;
                    length = 0;
                }
                writableMapCreateMap.putInt(MediaStoreUtil.MediaInfo.SIZE, length);
                writableMapCreateMap.putInt("type", i2);
                writableArrayCreateArray.pushMap(writableMapCreateMap);
            }
            promise.resolve(writableArrayCreateArray);
        } catch (IOException e4) {
            reject(promise, str, e4);
        }
    }

    @ReactMethod
    public void readFile(String str, Promise promise) {
        try {
            promise.resolve(Base64.encodeToString(getInputStreamBytes(getInputStream(str)), 2));
        } catch (Exception e2) {
            e2.printStackTrace();
            reject(promise, str, e2);
        }
    }

    @ReactMethod
    public void readFileAssets(String str, Promise promise) {
        InputStream inputStreamOpen = null;
        try {
            try {
                inputStreamOpen = getReactApplicationContext().getAssets().open(str, 0);
                if (inputStreamOpen == null) {
                    reject(promise, str, new Exception("Failed to open file"));
                    if (inputStreamOpen != null) {
                        try {
                            inputStreamOpen.close();
                            return;
                        } catch (IOException unused) {
                            return;
                        }
                    }
                    return;
                }
                byte[] bArr = new byte[inputStreamOpen.available()];
                inputStreamOpen.read(bArr);
                promise.resolve(Base64.encodeToString(bArr, 2));
                try {
                    inputStreamOpen.close();
                } catch (IOException unused2) {
                }
            } catch (Throwable th) {
                if (0 != 0) {
                    try {
                        inputStreamOpen.close();
                    } catch (IOException unused3) {
                    }
                }
                throw th;
            }
        } catch (Exception e2) {
            e2.printStackTrace();
            reject(promise, str, e2);
            if (0 == 0) {
            }
        }
    }

    @ReactMethod
    public void readFileRes(String str, Promise promise) {
        InputStream inputStreamOpenRawResource = null;
        try {
            try {
                inputStreamOpenRawResource = getReactApplicationContext().getResources().openRawResource(getResIdentifier(str));
                if (inputStreamOpenRawResource == null) {
                    reject(promise, str, new Exception("Failed to open file"));
                    if (inputStreamOpenRawResource != null) {
                        try {
                            inputStreamOpenRawResource.close();
                            return;
                        } catch (IOException unused) {
                            return;
                        }
                    }
                    return;
                }
                byte[] bArr = new byte[inputStreamOpenRawResource.available()];
                inputStreamOpenRawResource.read(bArr);
                promise.resolve(Base64.encodeToString(bArr, 2));
                try {
                    inputStreamOpenRawResource.close();
                } catch (IOException unused2) {
                }
            } catch (Throwable th) {
                if (0 != 0) {
                    try {
                        inputStreamOpenRawResource.close();
                    } catch (IOException unused3) {
                    }
                }
                throw th;
            }
        } catch (Exception e2) {
            e2.printStackTrace();
            reject(promise, str, e2);
            if (0 == 0) {
            }
        }
    }

    @ReactMethod
    public void scanFile(String str, Promise promise) {
        MediaScannerConnection.scanFile(getReactApplicationContext(), new String[]{str}, null, new i(promise));
    }

    @ReactMethod
    public void setReadable(String str, Boolean bool, Boolean bool2, Promise promise) {
        try {
            File file = new File(str);
            if (!file.exists()) {
                throw new Exception("File does not exist");
            }
            file.setReadable(bool.booleanValue(), bool2.booleanValue());
            promise.resolve(Boolean.TRUE);
        } catch (Exception e2) {
            e2.printStackTrace();
            reject(promise, str, e2);
        }
    }

    @ReactMethod
    public void stat(String str, Promise promise) {
        try {
            String originalFilepath = getOriginalFilepath(str, true);
            File file = new File(originalFilepath);
            if (!file.exists()) {
                throw new Exception("File does not exist");
            }
            WritableMap writableMapCreateMap = Arguments.createMap();
            writableMapCreateMap.putInt("ctime", (int) (file.lastModified() / 1000));
            writableMapCreateMap.putInt("mtime", (int) (file.lastModified() / 1000));
            writableMapCreateMap.putDouble(MediaStoreUtil.MediaInfo.SIZE, file.length());
            writableMapCreateMap.putInt("type", file.isDirectory() ? 1 : 0);
            writableMapCreateMap.putString("originalFilepath", originalFilepath);
            promise.resolve(writableMapCreateMap);
        } catch (Exception e2) {
            e2.printStackTrace();
            reject(promise, str, e2);
        }
    }

    @ReactMethod
    public void stopDownload(int i2) {
        com.rnfs.b bVar = this.downloaders.get(i2);
        if (bVar != null) {
            bVar.g();
        }
    }

    @ReactMethod
    public void stopUpload(int i2) {
        com.rnfs.d dVar = this.uploaders.get(i2);
        if (dVar != null) {
            dVar.f();
        }
    }

    @ReactMethod
    public void touch(String str, double d2, double d3, Promise promise) {
        try {
            promise.resolve(Boolean.valueOf(new File(str).setLastModified((long) d2)));
        } catch (Exception e2) {
            e2.printStackTrace();
            reject(promise, str, e2);
        }
    }

    @ReactMethod
    public void unlink(String str, Promise promise) {
        try {
            File file = new File(str);
            if (!file.exists()) {
                throw new Exception("File does not exist");
            }
            DeleteRecursive(file);
            promise.resolve(null);
        } catch (Exception e2) {
            e2.printStackTrace();
            reject(promise, str, e2);
        }
    }

    @ReactMethod
    public void uploadFiles(ReadableMap readableMap, Promise promise) {
        try {
            ReadableArray array = readableMap.getArray("files");
            URL url = new URL(readableMap.getString("toUrl"));
            int i2 = readableMap.getInt("jobId");
            ReadableMap map = readableMap.getMap("headers");
            ReadableMap map2 = readableMap.getMap("fields");
            String string = readableMap.getString("method");
            boolean z = readableMap.getBoolean("binaryStreamOnly");
            boolean z2 = readableMap.getBoolean("hasBeginCallback");
            boolean z3 = readableMap.getBoolean("hasProgressCallback");
            ArrayList<ReadableMap> arrayList = new ArrayList<>();
            com.rnfs.c cVar = new com.rnfs.c();
            for (int i3 = 0; i3 < array.size(); i3++) {
                try {
                    arrayList.add(array.getMap(i3));
                } catch (Exception e2) {
                    e = e2;
                    e.printStackTrace();
                    reject(promise, readableMap.getString("toUrl"), e);
                    return;
                }
            }
            cVar.f10587a = url;
            cVar.f10588b = arrayList;
            cVar.d = map;
            cVar.f = string;
            cVar.e = map2;
            cVar.c = z;
            cVar.g = new f(i2, promise, readableMap);
            if (z2) {
                cVar.i = new g(i2);
            }
            if (z3) {
                cVar.h = new h(i2);
            }
            com.rnfs.d dVar = new com.rnfs.d();
            dVar.execute(cVar);
            this.uploaders.put(i2, dVar);
        } catch (Exception e3) {
            e = e3;
        }
    }

    @ReactMethod
    public void write(String str, String str2, int i2, Promise promise) {
        try {
            byte[] bArrDecode = Base64.decode(str2, 0);
            if (i2 < 0) {
                OutputStream outputStream = getOutputStream(str, true);
                outputStream.write(bArrDecode);
                outputStream.close();
            } else {
                RandomAccessFile randomAccessFile = new RandomAccessFile(str, "rw");
                randomAccessFile.seek(i2);
                randomAccessFile.write(bArrDecode);
                randomAccessFile.close();
            }
            promise.resolve(null);
        } catch (Exception e2) {
            e2.printStackTrace();
            reject(promise, str, e2);
        }
    }

    @ReactMethod
    public void writeFile(String str, String str2, ReadableMap readableMap, Promise promise) {
        try {
            byte[] bArrDecode = Base64.decode(str2, 0);
            OutputStream outputStream = getOutputStream(str, false);
            outputStream.write(bArrDecode);
            outputStream.close();
            promise.resolve(null);
        } catch (Exception e2) {
            e2.printStackTrace();
            reject(promise, str, e2);
        }
    }
}
