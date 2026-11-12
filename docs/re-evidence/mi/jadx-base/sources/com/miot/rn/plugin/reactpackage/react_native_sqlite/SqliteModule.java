package com.miot.rn.plugin.reactpackage.react_native_sqlite;

import android.content.Context;
import android.content.ContextWrapper;
import android.util.Log;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.NoSuchKeyException;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.xiaomi.accountsdk.request.SimpleRequest;
import com.xiaomi.smarthome.framework.plugin.rn.RnModuleProvider;
import com.xiaomi.smarthome.framework.plugin.rn.core.api.IRnRuntimeProvider;
import com.xiaomi.smarthome.framework.plugin.rn.nativemodule.MIOTUtils;
import com.xiaomi.smarthome.framework.plugin.rn.utils.FileUtils;
import com.xiaomi.smarthome.framework.plugin.rn.utils.RnCallbackMapUtil;
import defpackage.cm8;
import defpackage.dm8;
import defpackage.y8j;
import defpackage.za3;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.pgsqlite.SQLitePlugin;

/* JADX INFO: loaded from: classes5.dex */
public class SqliteModule extends SQLitePlugin {

    public class a extends ContextWrapper {
        public a(Context context) {
            super(context);
        }

        @Override // android.content.ContextWrapper, android.content.Context
        public File getDatabasePath(String str) {
            return new File(SqliteModule.this.getDatabasePath(), str);
        }
    }

    public class b implements Callback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ReadableMap f10228a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Callback f10229b;
        public final /* synthetic */ Callback c;

        public b(ReadableMap readableMap, Callback callback, Callback callback2) {
            this.f10228a = readableMap;
            this.f10229b = callback;
            this.c = callback2;
        }

        @Override // com.facebook.react.bridge.Callback
        public void invoke(Object... objArr) {
            if (!((Boolean) objArr[0]).booleanValue()) {
                this.c.invoke(objArr);
                return;
            }
            Object obj = objArr[1];
            if (obj == null || !(obj instanceof ReadableMap)) {
                return;
            }
            SqliteModule.super.open(this.f10228a, this.f10229b, this.c);
        }
    }

    public class c implements InvocationHandler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ReadableMap f10230a;

        public c(ReadableMap readableMap) {
            this.f10230a = readableMap;
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
            Object obj2;
            if (objArr != null && objArr.length == 1 && "getString".equals(method.getName()) && "assetFilename".equals(objArr[0])) {
                return null;
            }
            try {
                return method.invoke(this.f10230a, objArr);
            } catch (Exception unused) {
                throw new NoSuchKeyException((objArr == null || (obj2 = objArr[0]) == null) ? "no args" : obj2.toString());
            }
        }
    }

    public SqliteModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        dm8.f().m(0);
        cm8.p(dm8.f());
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00ad A[Catch: all -> 0x00a8, PHI: r8 r9 r10
      0x00ad: PHI (r8v7 java.net.HttpURLConnection) = (r8v6 java.net.HttpURLConnection), (r8v12 java.net.HttpURLConnection), (r8v6 java.net.HttpURLConnection) binds: [B:16:0x0066, B:28:0x009c, B:24:0x0076] A[DONT_GENERATE, DONT_INLINE]
      0x00ad: PHI (r9v6 int) = (r9v5 int), (r9v12 int), (r9v5 int) binds: [B:16:0x0066, B:28:0x009c, B:24:0x0076] A[DONT_GENERATE, DONT_INLINE]
      0x00ad: PHI (r10v9 int) = (r10v8 int), (r10v12 int), (r10v8 int) binds: [B:16:0x0066, B:28:0x009c, B:24:0x0076] A[DONT_GENERATE, DONT_INLINE], TRY_ENTER, TryCatch #4 {all -> 0x00a8, blocks: (B:25:0x0078, B:33:0x00ad, B:37:0x00b7, B:38:0x00c3, B:40:0x00c9, B:43:0x00e5, B:44:0x00e9), top: B:97:0x0078 }] */
    /* JADX WARN: Code duplicated, block: B:35:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:59:0x014c  */
    /* JADX WARN: Code duplicated, block: B:62:0x0183 A[Catch: Exception -> 0x01c5, TRY_ENTER, TryCatch #8 {Exception -> 0x01c5, blocks: (B:73:0x01ba, B:75:0x01bf, B:65:0x018b, B:62:0x0183, B:64:0x0188), top: B:105:0x000a }] */
    /* JADX WARN: Code duplicated, block: B:64:0x0188 A[Catch: Exception -> 0x01c5, TryCatch #8 {Exception -> 0x01c5, blocks: (B:73:0x01ba, B:75:0x01bf, B:65:0x018b, B:62:0x0183, B:64:0x0188), top: B:105:0x000a }] */
    /* JADX WARN: Code duplicated, block: B:73:0x01ba A[Catch: Exception -> 0x01c5, TRY_ENTER, TryCatch #8 {Exception -> 0x01c5, blocks: (B:73:0x01ba, B:75:0x01bf, B:65:0x018b, B:62:0x0183, B:64:0x0188), top: B:105:0x000a }] */
    /* JADX WARN: Code duplicated, block: B:75:0x01bf A[Catch: Exception -> 0x01c5, TRY_LEAVE, TryCatch #8 {Exception -> 0x01c5, blocks: (B:73:0x01ba, B:75:0x01bf, B:65:0x018b, B:62:0x0183, B:64:0x0188), top: B:105:0x000a }] */
    /* JADX WARN: Code duplicated, block: B:78:0x01c5 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Code duplicated, block: B:83:0x01ce A[Catch: Exception -> 0x01d6, TryCatch #7 {Exception -> 0x01d6, blocks: (B:81:0x01c9, B:83:0x01ce, B:85:0x01d3), top: B:103:0x01c9 }] */
    /* JADX WARN: Code duplicated, block: B:85:0x01d3 A[Catch: Exception -> 0x01d6, TRY_LEAVE, TryCatch #7 {Exception -> 0x01d6, blocks: (B:81:0x01c9, B:83:0x01ce, B:85:0x01d3), top: B:103:0x01c9 }] */
    public static void download(String str, String str2, HashMap<String, Object> map, String str3, int i, int i2, Callback callback) {
        HttpURLConnection httpURLConnection;
        FileOutputStream fileOutputStream;
        int contentLength;
        int i3;
        int responseCode;
        WritableMap writableMapCreateMap;
        BufferedInputStream bufferedInputStream;
        BufferedInputStream bufferedInputStream2 = null;
        bufferedInputStream2 = null;
        bufferedInputStream2 = null;
        FileOutputStream fileOutputStream2 = null;
        try {
            try {
                httpURLConnection = (HttpURLConnection) new URL(str2).openConnection();
                if (map != null) {
                    try {
                        for (Map.Entry<String, Object> entry : map.entrySet()) {
                            Object value = entry.getValue();
                            if (value != null) {
                                httpURLConnection.setRequestProperty(URLEncoder.encode(entry.getKey()), URLEncoder.encode(value.toString()));
                            }
                        }
                        httpURLConnection.setConnectTimeout(i);
                        httpURLConnection.setReadTimeout(i2);
                        httpURLConnection.connect();
                        responseCode = httpURLConnection.getResponseCode();
                        contentLength = httpURLConnection.getContentLength();
                        if (responseCode == 200 && (responseCode == 301 || responseCode == 302 || responseCode == 307 || responseCode == 308)) {
                            try {
                                String headerField = httpURLConnection.getHeaderField(SimpleRequest.LOCATION);
                                httpURLConnection.disconnect();
                                HttpURLConnection httpURLConnection2 = (HttpURLConnection) new URL(headerField).openConnection();
                                try {
                                    httpURLConnection2.setConnectTimeout(5000);
                                    httpURLConnection2.connect();
                                    int responseCode2 = httpURLConnection2.getResponseCode();
                                    contentLength = httpURLConnection2.getContentLength();
                                    responseCode = responseCode2;
                                    httpURLConnection = httpURLConnection2;
                                    writableMapCreateMap = Arguments.createMap();
                                    if (responseCode >= 200) {
                                        bufferedInputStream = null;
                                        i3 = 0;
                                        WritableMap writableMapCreateMap2 = Arguments.createMap();
                                        writableMapCreateMap2.putInt("status", responseCode);
                                        writableMapCreateMap2.putString("filename", str);
                                        writableMapCreateMap2.putString("path", str3);
                                        writableMapCreateMap2.putMap("header", writableMapCreateMap);
                                        callback.invoke(Boolean.TRUE, writableMapCreateMap2, Integer.valueOf(i3), Integer.valueOf(contentLength));
                                        if (fileOutputStream2 != null) {
                                            fileOutputStream2.close();
                                        }
                                        if (bufferedInputStream != null) {
                                            bufferedInputStream.close();
                                        }
                                    } else {
                                        bufferedInputStream = null;
                                        i3 = 0;
                                        WritableMap writableMapCreateMap3 = Arguments.createMap();
                                        writableMapCreateMap3.putInt("status", responseCode);
                                        writableMapCreateMap3.putString("filename", str);
                                        writableMapCreateMap3.putString("path", str3);
                                        writableMapCreateMap3.putMap("header", writableMapCreateMap);
                                        callback.invoke(Boolean.TRUE, writableMapCreateMap3, Integer.valueOf(i3), Integer.valueOf(contentLength));
                                        if (fileOutputStream2 != null) {
                                            fileOutputStream2.close();
                                        }
                                        if (bufferedInputStream != null) {
                                            bufferedInputStream.close();
                                        }
                                    }
                                } catch (Throwable th) {
                                    th = th;
                                    fileOutputStream = null;
                                    i3 = 0;
                                    httpURLConnection = httpURLConnection2;
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                fileOutputStream = null;
                                i3 = 0;
                            }
                        } else {
                            writableMapCreateMap = Arguments.createMap();
                            if (responseCode >= 200 || responseCode >= 300) {
                                bufferedInputStream = null;
                                i3 = 0;
                            } else {
                                for (Map.Entry<String, List<String>> entry2 : httpURLConnection.getHeaderFields().entrySet()) {
                                    String key = entry2.getKey();
                                    String str4 = entry2.getValue().get(0);
                                    if (key != null && str4 != null) {
                                        writableMapCreateMap.putString(key, str4);
                                    }
                                }
                                callback.invoke(Boolean.TRUE, null, 0, Integer.valueOf(contentLength));
                                bufferedInputStream = new BufferedInputStream(httpURLConnection.getInputStream(), 8192);
                                try {
                                    FileUtils.makeFileDirectories(str3);
                                    fileOutputStream = new FileOutputStream(str3);
                                    try {
                                        byte[] bArr = new byte[8192];
                                        i3 = 0;
                                        while (true) {
                                            try {
                                                int i4 = bufferedInputStream.read(bArr);
                                                if (i4 == -1) {
                                                    break;
                                                }
                                                i3 += i4;
                                                callback.invoke(Boolean.TRUE, null, Integer.valueOf(i3), Integer.valueOf(contentLength));
                                                fileOutputStream.write(bArr, 0, i4);
                                            } catch (Throwable th3) {
                                                th = th3;
                                            }
                                            bufferedInputStream2 = bufferedInputStream;
                                            try {
                                                callback.invoke(Boolean.FALSE, RnCallbackMapUtil.getCommonErrorMap(Log.getStackTraceString(th)), Integer.valueOf(i3), Integer.valueOf(contentLength));
                                                if (fileOutputStream != null) {
                                                    fileOutputStream.close();
                                                }
                                                if (bufferedInputStream2 != null) {
                                                    bufferedInputStream2.close();
                                                }
                                                if (httpURLConnection == null) {
                                                    return;
                                                }
                                            } catch (Throwable th4) {
                                                if (fileOutputStream != null) {
                                                    try {
                                                        fileOutputStream.close();
                                                        if (bufferedInputStream2 != null) {
                                                            bufferedInputStream2.close();
                                                        }
                                                        if (httpURLConnection != null) {
                                                            httpURLConnection.disconnect();
                                                        }
                                                    } catch (Exception unused) {
                                                        throw th4;
                                                    }
                                                } else {
                                                    if (bufferedInputStream2 != null) {
                                                        bufferedInputStream2.close();
                                                    }
                                                    if (httpURLConnection != null) {
                                                        httpURLConnection.disconnect();
                                                    }
                                                }
                                                throw th4;
                                            }
                                        }
                                        fileOutputStream.flush();
                                        fileOutputStream2 = fileOutputStream;
                                    } catch (Throwable th5) {
                                        th = th5;
                                        i3 = 0;
                                    }
                                } catch (Throwable th6) {
                                    th = th6;
                                    fileOutputStream = null;
                                }
                            }
                            try {
                                WritableMap writableMapCreateMap4 = Arguments.createMap();
                                writableMapCreateMap4.putInt("status", responseCode);
                                writableMapCreateMap4.putString("filename", str);
                                writableMapCreateMap4.putString("path", str3);
                                writableMapCreateMap4.putMap("header", writableMapCreateMap);
                                callback.invoke(Boolean.TRUE, writableMapCreateMap4, Integer.valueOf(i3), Integer.valueOf(contentLength));
                                if (fileOutputStream2 != null) {
                                    fileOutputStream2.close();
                                }
                                if (bufferedInputStream != null) {
                                    bufferedInputStream.close();
                                }
                            } catch (Throwable th7) {
                                th = th7;
                                fileOutputStream = fileOutputStream2;
                                bufferedInputStream2 = bufferedInputStream;
                                callback.invoke(Boolean.FALSE, RnCallbackMapUtil.getCommonErrorMap(Log.getStackTraceString(th)), Integer.valueOf(i3), Integer.valueOf(contentLength));
                                if (fileOutputStream != null) {
                                    fileOutputStream.close();
                                }
                                if (bufferedInputStream2 != null) {
                                    bufferedInputStream2.close();
                                }
                                if (httpURLConnection == null) {
                                    return;
                                }
                            }
                        }
                    } catch (Throwable th8) {
                        th = th8;
                        fileOutputStream = null;
                        contentLength = 0;
                        i3 = 0;
                    }
                } else {
                    httpURLConnection.setConnectTimeout(i);
                    httpURLConnection.setReadTimeout(i2);
                    httpURLConnection.connect();
                    responseCode = httpURLConnection.getResponseCode();
                    contentLength = httpURLConnection.getContentLength();
                    if (responseCode == 200) {
                        writableMapCreateMap = Arguments.createMap();
                        if (responseCode >= 200) {
                            bufferedInputStream = null;
                            i3 = 0;
                            WritableMap writableMapCreateMap5 = Arguments.createMap();
                            writableMapCreateMap5.putInt("status", responseCode);
                            writableMapCreateMap5.putString("filename", str);
                            writableMapCreateMap5.putString("path", str3);
                            writableMapCreateMap5.putMap("header", writableMapCreateMap);
                            callback.invoke(Boolean.TRUE, writableMapCreateMap5, Integer.valueOf(i3), Integer.valueOf(contentLength));
                            if (fileOutputStream2 != null) {
                                fileOutputStream2.close();
                            }
                            if (bufferedInputStream != null) {
                                bufferedInputStream.close();
                            }
                        } else {
                            bufferedInputStream = null;
                            i3 = 0;
                            WritableMap writableMapCreateMap6 = Arguments.createMap();
                            writableMapCreateMap6.putInt("status", responseCode);
                            writableMapCreateMap6.putString("filename", str);
                            writableMapCreateMap6.putString("path", str3);
                            writableMapCreateMap6.putMap("header", writableMapCreateMap);
                            callback.invoke(Boolean.TRUE, writableMapCreateMap6, Integer.valueOf(i3), Integer.valueOf(contentLength));
                            if (fileOutputStream2 != null) {
                                fileOutputStream2.close();
                            }
                            if (bufferedInputStream != null) {
                                bufferedInputStream.close();
                            }
                        }
                    } else {
                        writableMapCreateMap = Arguments.createMap();
                        if (responseCode >= 200) {
                            bufferedInputStream = null;
                            i3 = 0;
                            WritableMap writableMapCreateMap7 = Arguments.createMap();
                            writableMapCreateMap7.putInt("status", responseCode);
                            writableMapCreateMap7.putString("filename", str);
                            writableMapCreateMap7.putString("path", str3);
                            writableMapCreateMap7.putMap("header", writableMapCreateMap);
                            callback.invoke(Boolean.TRUE, writableMapCreateMap7, Integer.valueOf(i3), Integer.valueOf(contentLength));
                            if (fileOutputStream2 != null) {
                                fileOutputStream2.close();
                            }
                            if (bufferedInputStream != null) {
                                bufferedInputStream.close();
                            }
                        } else {
                            bufferedInputStream = null;
                            i3 = 0;
                            WritableMap writableMapCreateMap8 = Arguments.createMap();
                            writableMapCreateMap8.putInt("status", responseCode);
                            writableMapCreateMap8.putString("filename", str);
                            writableMapCreateMap8.putString("path", str3);
                            writableMapCreateMap8.putMap("header", writableMapCreateMap);
                            callback.invoke(Boolean.TRUE, writableMapCreateMap8, Integer.valueOf(i3), Integer.valueOf(contentLength));
                            if (fileOutputStream2 != null) {
                                fileOutputStream2.close();
                            }
                            if (bufferedInputStream != null) {
                                bufferedInputStream.close();
                            }
                        }
                    }
                }
            } catch (Throwable th9) {
                th = th9;
                httpURLConnection = null;
                fileOutputStream = null;
            }
            httpURLConnection.disconnect();
        } catch (Exception unused2) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public File getDatabasePath() {
        File file = new File(((IRnRuntimeProvider) RnModuleProvider.as(IRnRuntimeProvider.class)).getPluginDir(getReactApplicationContext(), y8j.a().getPluginRecord()), "databases");
        file.mkdirs();
        return file;
    }

    private static <T> T simpleProxy(Class<T> cls, InvocationHandler invocationHandler) {
        return (T) Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, invocationHandler);
    }

    @Override // org.pgsqlite.SQLitePlugin
    @ReactMethod
    public void attach(ReadableMap readableMap, Callback callback, Callback callback2) {
        super.attach(readableMap, callback, callback2);
    }

    @Override // org.pgsqlite.SQLitePlugin
    @ReactMethod
    public void backgroundExecuteSqlBatch(ReadableMap readableMap, Callback callback, Callback callback2) {
        super.backgroundExecuteSqlBatch(readableMap, callback, callback2);
    }

    @Override // org.pgsqlite.SQLitePlugin
    @ReactMethod
    public void close(ReadableMap readableMap, Callback callback, Callback callback2) {
        super.close(readableMap, callback, callback2);
    }

    @Override // org.pgsqlite.SQLitePlugin
    @ReactMethod
    public void delete(ReadableMap readableMap, Callback callback, Callback callback2) {
        super.delete(readableMap, callback, callback2);
    }

    @Override // org.pgsqlite.SQLitePlugin
    @ReactMethod
    public void echoStringValue(ReadableMap readableMap, Callback callback, Callback callback2) {
        super.echoStringValue(readableMap, callback, callback2);
    }

    @Override // org.pgsqlite.SQLitePlugin
    public boolean execute(String str, ReadableMap readableMap, za3 za3Var) throws Exception {
        return "open".equalsIgnoreCase(str) ? super.execute(str, (ReadableMap) simpleProxy(ReadableMap.class, new c(readableMap)), za3Var) : super.execute(str, readableMap, za3Var);
    }

    @Override // org.pgsqlite.SQLitePlugin
    @ReactMethod
    public void executeSqlBatch(ReadableMap readableMap, Callback callback, Callback callback2) {
        super.executeSqlBatch(readableMap, callback, callback2);
    }

    @Override // org.pgsqlite.SQLitePlugin
    public Context getContext() {
        return new a(super.getContext());
    }

    @Override // org.pgsqlite.SQLitePlugin
    @ReactMethod
    public void open(ReadableMap readableMap, Callback callback, Callback callback2) throws Throwable {
        if (readableMap.hasKey("assetFilename")) {
            File file = new File(getDatabasePath(), MIOTUtils.getString(readableMap, "name"));
            FileUtils.makeFileDirectories(file.getAbsolutePath());
            String string = MIOTUtils.getString(readableMap, "assetFilename");
            if (!file.exists()) {
                if (string.startsWith("file://")) {
                    FileInputStream fileInputStream = null;
                    try {
                        try {
                            File file2 = new File(string.substring(7));
                            if (file2.exists()) {
                                FileInputStream fileInputStream2 = new FileInputStream(file2);
                                try {
                                    FileOutputStream fileOutputStream = new FileOutputStream(file);
                                    byte[] bArr = new byte[16384];
                                    while (true) {
                                        int i = fileInputStream2.read(bArr);
                                        if (i == -1) {
                                            break;
                                        } else {
                                            fileOutputStream.write(bArr, 0, i);
                                        }
                                    }
                                    fileOutputStream.close();
                                    fileInputStream = fileInputStream2;
                                } catch (Exception e) {
                                    e = e;
                                    fileInputStream = fileInputStream2;
                                    callback2.invoke(Log.getStackTraceString(e));
                                    if (fileInputStream != null) {
                                        try {
                                            fileInputStream.close();
                                            return;
                                        } catch (IOException e2) {
                                            e2.printStackTrace();
                                            return;
                                        }
                                    }
                                    return;
                                } catch (Throwable th) {
                                    th = th;
                                    fileInputStream = fileInputStream2;
                                    if (fileInputStream != null) {
                                        try {
                                            fileInputStream.close();
                                        } catch (IOException e3) {
                                            e3.printStackTrace();
                                        }
                                    }
                                    throw th;
                                }
                            }
                            if (fileInputStream != null) {
                                try {
                                    fileInputStream.close();
                                } catch (IOException e4) {
                                    e4.printStackTrace();
                                }
                            }
                        } catch (Throwable th2) {
                            th = th2;
                        }
                    } catch (Exception e5) {
                        e = e5;
                    }
                } else if (string.startsWith("http://")) {
                    download("", string, null, file.getAbsolutePath(), 15000, 15000, new b(readableMap, callback, callback2));
                    return;
                }
            }
        }
        super.open(readableMap, callback, callback2);
    }
}
