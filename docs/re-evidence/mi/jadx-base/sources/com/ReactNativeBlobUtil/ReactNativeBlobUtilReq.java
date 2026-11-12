package com.ReactNativeBlobUtil;

import android.app.DownloadManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.database.Cursor;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.net.Uri;
import android.util.Base64;
import android.webkit.CookieManager;
import androidx.work.Data;
import com.example.statistics.export.OneTrackConstant;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.miui.tsmclient.common.net.NetConstants;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.smarthome.framework.plugin.rn.viewshot.ViewShot;
import com.xiaomi.smarthome.library.apache.http.protocol.HTTP;
import defpackage.pdj;
import defpackage.rdj;
import defpackage.tdj;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.Proxy;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.nio.ByteBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import okhttp3.Call;
import okhttp3.ConnectionPool;
import okhttp3.Headers;
import okhttp3.Interceptor;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;

/* JADX INFO: loaded from: classes.dex */
public class ReactNativeBlobUtilReq extends BroadcastReceiver implements Runnable {
    public static HashMap<String, Call> t = new HashMap<>();
    public static HashMap<String, Long> u = new HashMap<>();
    public static HashMap<String, com.ReactNativeBlobUtil.c> v = new HashMap<>();
    public static HashMap<String, com.ReactNativeBlobUtil.c> w = new HashMap<>();
    public static ConnectionPool x = new ConnectionPool();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public pdj f5631a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f5632b;
    public String c;
    public String d;
    public String e;
    public String f;
    public ReadableArray g;
    public ReadableMap h;
    public Callback i;
    public long j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f5633k;
    public com.ReactNativeBlobUtil.a l;
    public e m;
    public g n;
    public WritableMap p;
    public OkHttpClient s;
    public f o = f.Auto;
    public boolean q = false;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public ArrayList<String> f5634r = new ArrayList<>();

    public class a implements Interceptor {
        public a() {
        }

        @Override // okhttp3.Interceptor
        public Response intercept(Interceptor.Chain chain) throws IOException {
            ReactNativeBlobUtilReq.this.f5634r.add(chain.request().url().getUrl());
            return chain.proceed(chain.request());
        }
    }

    public class b implements Interceptor {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Request f5636a;

        public b(Request request) {
            this.f5636a = request;
        }

        @Override // okhttp3.Interceptor
        public Response intercept(Interceptor.Chain chain) throws IOException {
            ResponseBody rdjVar;
            Response responseProceed = null;
            try {
                responseProceed = chain.proceed(this.f5636a);
                int i = d.f5640b[ReactNativeBlobUtilReq.this.n.ordinal()];
                if (i == 1 || i != 2) {
                    rdjVar = new rdj(ReactNativeBlobUtil.RCTContext, ReactNativeBlobUtilReq.this.f5632b, responseProceed.body(), ReactNativeBlobUtilReq.this.f5631a.m.booleanValue());
                } else {
                    ReactApplicationContext reactApplicationContext = ReactNativeBlobUtil.RCTContext;
                    String str = ReactNativeBlobUtilReq.this.f5632b;
                    ResponseBody responseBodyBody = responseProceed.body();
                    ReactNativeBlobUtilReq reactNativeBlobUtilReq = ReactNativeBlobUtilReq.this;
                    rdjVar = new tdj(reactApplicationContext, str, responseBodyBody, reactNativeBlobUtilReq.f, reactNativeBlobUtilReq.f5631a.f30296k.booleanValue());
                }
                return responseProceed.newBuilder().body(rdjVar).build();
            } catch (SocketException unused) {
                ReactNativeBlobUtilReq.this.q = true;
                if (responseProceed != null) {
                    responseProceed.close();
                }
                return chain.proceed(chain.request());
            } catch (SocketTimeoutException unused2) {
                ReactNativeBlobUtilReq.this.q = true;
                if (responseProceed != null) {
                    responseProceed.close();
                }
                return chain.proceed(chain.request());
            } catch (Exception unused3) {
                if (responseProceed != null) {
                    responseProceed.close();
                }
                return chain.proceed(chain.request());
            }
        }
    }

    public class c implements okhttp3.Callback {
        public c() {
        }

        @Override // okhttp3.Callback
        public void onFailure(Call call, IOException iOException) {
            ReactNativeBlobUtilReq.c(ReactNativeBlobUtilReq.this.f5632b);
            ReactNativeBlobUtilReq reactNativeBlobUtilReq = ReactNativeBlobUtilReq.this;
            if (reactNativeBlobUtilReq.p == null) {
                reactNativeBlobUtilReq.p = Arguments.createMap();
            }
            if (iOException.getClass().equals(SocketTimeoutException.class)) {
                ReactNativeBlobUtilReq.this.p.putBoolean("timeout", true);
                ReactNativeBlobUtilReq.this.i.invoke("The request timed out.", null, null);
            } else {
                ReactNativeBlobUtilReq.this.i.invoke(iOException.getLocalizedMessage(), null, null);
            }
            ReactNativeBlobUtilReq.this.m();
        }

        @Override // okhttp3.Callback
        public void onResponse(Call call, Response response) throws IOException {
            ReadableMap readableMap = ReactNativeBlobUtilReq.this.f5631a.e;
            if (readableMap != null) {
                String string = readableMap.hasKey("title") ? ReactNativeBlobUtilReq.this.f5631a.e.getString("title") : "";
                String string2 = readableMap.hasKey("description") ? readableMap.getString("description") : "";
                String string3 = readableMap.hasKey("mime") ? readableMap.getString("mime") : HTTP.PLAIN_TEXT_TYPE;
                boolean z = readableMap.hasKey("mediaScannable") ? readableMap.getBoolean("mediaScannable") : false;
                boolean z2 = readableMap.hasKey("notification") ? readableMap.getBoolean("notification") : false;
                DownloadManager downloadManager = (DownloadManager) ReactNativeBlobUtil.RCTContext.getSystemService("download");
                ReactNativeBlobUtilReq reactNativeBlobUtilReq = ReactNativeBlobUtilReq.this;
                downloadManager.addCompletedDownload(string, string2, z, string3, reactNativeBlobUtilReq.f, reactNativeBlobUtilReq.j, z2);
            }
            ReactNativeBlobUtilReq.this.d(response);
        }
    }

    public static /* synthetic */ class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f5639a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f5640b;

        static {
            int[] iArr = new int[g.values().length];
            f5640b = iArr;
            try {
                iArr[g.KeepInMemory.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f5640b[g.FileStorage.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[e.values().length];
            f5639a = iArr2;
            try {
                iArr2[e.SingleFile.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f5639a[e.AsIs.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f5639a[e.Form.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f5639a[e.WithoutBody.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public enum e {
        Form,
        SingleFile,
        AsIs,
        WithoutBody,
        Others
    }

    public enum f {
        Auto,
        UTF8,
        BASE64
    }

    public enum g {
        KeepInMemory,
        FileStorage
    }

    public ReactNativeBlobUtilReq(ReadableMap readableMap, String str, String str2, String str3, ReadableMap readableMap2, String str4, ReadableArray readableArray, OkHttpClient okHttpClient, Callback callback) {
        this.c = str2.toUpperCase(Locale.ROOT);
        pdj pdjVar = new pdj(readableMap);
        this.f5631a = pdjVar;
        this.f5632b = str;
        this.d = str3;
        this.h = readableMap2;
        this.i = callback;
        this.e = str4;
        this.g = readableArray;
        this.s = okHttpClient;
        if ((pdjVar.f30294a.booleanValue() || this.f5631a.c != null) && !n()) {
            this.n = g.FileStorage;
        } else {
            this.n = g.KeepInMemory;
        }
        if (str4 != null) {
            this.m = e.SingleFile;
        } else if (readableArray != null) {
            this.m = e.Form;
        } else {
            this.m = e.WithoutBody;
        }
    }

    public static void c(String str) {
        if (t.containsKey(str)) {
            t.get(str).cancel();
            t.remove(str);
        }
        if (u.containsKey(str)) {
            ((DownloadManager) ReactNativeBlobUtil.RCTContext.getApplicationContext().getSystemService("download")).remove(u.get(str).longValue());
        }
    }

    public static OkHttpClient.Builder f(OkHttpClient.Builder builder) {
        return builder;
    }

    public static com.ReactNativeBlobUtil.c i(String str) {
        if (v.containsKey(str)) {
            return v.get(str);
        }
        return null;
    }

    public static com.ReactNativeBlobUtil.c j(String str) {
        if (w.containsKey(str)) {
            return w.get(str);
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:42:0x0122 A[Catch: IOException -> 0x019f, TryCatch #2 {IOException -> 0x019f, blocks: (B:35:0x00d9, B:37:0x00e3, B:38:0x00ff, B:40:0x0106, B:41:0x010a, B:42:0x0122, B:44:0x0130, B:47:0x0138, B:49:0x014a, B:51:0x016c, B:53:0x0172, B:54:0x0185, B:55:0x0197, B:56:0x019e), top: B:65:0x00d9, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:44:0x0130 A[Catch: IOException -> 0x019f, TRY_LEAVE, TryCatch #2 {IOException -> 0x019f, blocks: (B:35:0x00d9, B:37:0x00e3, B:38:0x00ff, B:40:0x0106, B:41:0x010a, B:42:0x0122, B:44:0x0130, B:47:0x0138, B:49:0x014a, B:51:0x016c, B:53:0x0172, B:54:0x0185, B:55:0x0197, B:56:0x019e), top: B:65:0x00d9, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:47:0x0138 A[Catch: IOException -> 0x019f, TRY_ENTER, TRY_LEAVE, TryCatch #2 {IOException -> 0x019f, blocks: (B:35:0x00d9, B:37:0x00e3, B:38:0x00ff, B:40:0x0106, B:41:0x010a, B:42:0x0122, B:44:0x0130, B:47:0x0138, B:49:0x014a, B:51:0x016c, B:53:0x0172, B:54:0x0185, B:55:0x0197, B:56:0x019e), top: B:65:0x00d9, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:55:0x0197 A[Catch: IOException -> 0x019f, TryCatch #2 {IOException -> 0x019f, blocks: (B:35:0x00d9, B:37:0x00e3, B:38:0x00ff, B:40:0x0106, B:41:0x010a, B:42:0x0122, B:44:0x0130, B:47:0x0138, B:49:0x014a, B:51:0x016c, B:53:0x0172, B:54:0x0185, B:55:0x0197, B:56:0x019e), top: B:65:0x00d9, inners: #1 }] */
    /* JADX WARN: Code duplicated, block: B:63:0x014a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public final void d(Response response) {
        byte[] bArrBytes;
        String strString;
        boolean zL = l(response);
        e(k(response, zL));
        int i = d.f5640b[this.n.ordinal()];
        if (i != 1) {
            if (i != 2) {
                try {
                    this.i.invoke(null, "utf8", new String(response.body().bytes(), "UTF-8"));
                } catch (IOException unused) {
                    this.i.invoke("ReactNativeBlobUtil failed to encode response data to UTF8 string.", null);
                }
            } else {
                ResponseBody responseBodyBody = response.body();
                try {
                    responseBodyBody.bytes();
                } catch (Exception unused2) {
                }
                try {
                    tdj tdjVar = (tdj) responseBodyBody;
                    if (tdjVar == null || tdjVar.a()) {
                        String strReplace = this.f.replace("?append=true", "");
                        this.f = strReplace;
                        this.i.invoke(null, "path", strReplace);
                    } else {
                        this.i.invoke("Download interrupted.", null);
                    }
                } catch (ClassCastException unused3) {
                    if (responseBodyBody == null) {
                        this.i.invoke("Unexpected FileStorage response with no file.", null);
                        return;
                    }
                    try {
                        strString = (((responseBodyBody.getSource().getBufferField().size() > 0L ? 1 : (responseBodyBody.getSource().getBufferField().size() == 0L ? 0 : -1)) > 0) && (responseBodyBody.getContentLength() > 0)) ? responseBodyBody.string() : null;
                    } catch (IOException e2) {
                        e2.printStackTrace();
                    }
                    this.i.invoke("Unexpected FileStorage response file: " + strString, null);
                    return;
                }
            }
        } else if (zL) {
            try {
                if (this.f5631a.j.booleanValue()) {
                    String strM = com.ReactNativeBlobUtil.b.m(this.f5632b);
                    InputStream inputStreamByteStream = response.body().byteStream();
                    FileOutputStream fileOutputStream = new FileOutputStream(new File(strM));
                    byte[] bArr = new byte[Data.MAX_DATA_BYTES];
                    while (true) {
                        int i2 = inputStreamByteStream.read(bArr);
                        if (i2 == -1) {
                            break;
                        } else {
                            fileOutputStream.write(bArr, 0, i2);
                        }
                    }
                    inputStreamByteStream.close();
                    fileOutputStream.flush();
                    fileOutputStream.close();
                    this.i.invoke(null, "path", strM);
                } else {
                    bArrBytes = response.body().bytes();
                    if (!n()) {
                        throw new IllegalStateException("Write file with transform was specified but the shared file transformer is not set");
                    }
                    if (this.o == f.BASE64) {
                        this.i.invoke(null, ViewShot.Results.BASE_64, Base64.encodeToString(bArrBytes, 2));
                        return;
                    }
                    try {
                        Charset charsetForName = Charset.forName("UTF-8");
                        charsetForName.newDecoder().decode(ByteBuffer.wrap(bArrBytes));
                        this.i.invoke(null, "utf8", new String(bArrBytes, charsetForName));
                    } catch (CharacterCodingException unused4) {
                        if (this.o == f.UTF8) {
                            this.i.invoke(null, "utf8", new String(bArrBytes));
                        } else {
                            this.i.invoke(null, ViewShot.Results.BASE_64, Base64.encodeToString(bArrBytes, 2));
                        }
                    }
                }
            } catch (IOException unused5) {
                this.i.invoke("ReactNativeBlobUtil failed to encode response data to BASE64 string.", null);
            }
        } else {
            bArrBytes = response.body().bytes();
            if (!n()) {
                throw new IllegalStateException("Write file with transform was specified but the shared file transformer is not set");
            }
            if (this.o == f.BASE64) {
                this.i.invoke(null, ViewShot.Results.BASE_64, Base64.encodeToString(bArrBytes, 2));
                return;
            } else {
                Charset charsetForName2 = Charset.forName("UTF-8");
                charsetForName2.newDecoder().decode(ByteBuffer.wrap(bArrBytes));
                this.i.invoke(null, "utf8", new String(bArrBytes, charsetForName2));
            }
        }
        response.body().close();
        m();
    }

    public final void e(WritableMap writableMap) {
        ((DeviceEventManagerModule.RCTDeviceEventEmitter) ReactNativeBlobUtil.RCTContext.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit("ReactNativeBlobUtilState", writableMap);
    }

    public final String g(HashMap<String, String> map, String str) {
        String str2 = map.get(str);
        if (str2 != null) {
            return str2;
        }
        String str3 = map.get(str.toLowerCase(Locale.ROOT));
        return str3 == null ? "" : str3;
    }

    public final String h(Headers headers, String str) {
        String str2 = headers.get(str);
        if (str2 != null) {
            return str2;
        }
        Locale locale = Locale.ROOT;
        return headers.get(str.toLowerCase(locale)) == null ? "" : headers.get(str.toLowerCase(locale));
    }

    public final WritableMap k(Response response, boolean z) {
        WritableMap writableMapCreateMap = Arguments.createMap();
        writableMapCreateMap.putInt("status", response.code());
        writableMapCreateMap.putString("state", "2");
        writableMapCreateMap.putString("taskId", this.f5632b);
        writableMapCreateMap.putBoolean("timeout", this.q);
        WritableMap writableMapCreateMap2 = Arguments.createMap();
        for (int i = 0; i < response.headers().size(); i++) {
            writableMapCreateMap2.putString(response.headers().name(i), response.headers().value(i));
        }
        WritableArray writableArrayCreateArray = Arguments.createArray();
        Iterator<String> it = this.f5634r.iterator();
        while (it.hasNext()) {
            writableArrayCreateArray.pushString(it.next());
        }
        writableMapCreateMap.putArray("redirects", writableArrayCreateArray);
        writableMapCreateMap.putMap("headers", writableMapCreateMap2);
        Headers headers = response.headers();
        if (z) {
            writableMapCreateMap.putString("respType", "blob");
        } else if (h(headers, "content-type").equalsIgnoreCase("text/")) {
            writableMapCreateMap.putString("respType", "text");
        } else if (h(headers, "content-type").contains("application/json")) {
            writableMapCreateMap.putString("respType", "json");
        } else {
            writableMapCreateMap.putString("respType", "");
        }
        return writableMapCreateMap;
    }

    public final boolean l(Response response) {
        boolean z;
        String strH = h(response.headers(), "Content-Type");
        boolean z2 = !strH.equalsIgnoreCase("text/");
        boolean z3 = !strH.equalsIgnoreCase("application/json");
        if (this.f5631a.o == null) {
            z = false;
            break;
        }
        int i = 0;
        while (true) {
            if (i >= this.f5631a.o.size()) {
                z = false;
                break;
            }
            Locale locale = Locale.ROOT;
            if (strH.toLowerCase(locale).contains(this.f5631a.o.getString(i).toLowerCase(locale))) {
                z = true;
                break;
            }
            i++;
        }
        return !(z3 || z2) || z;
    }

    public final void m() {
        if (t.containsKey(this.f5632b)) {
            t.remove(this.f5632b);
        }
        if (u.containsKey(this.f5632b)) {
            u.remove(this.f5632b);
        }
        if (w.containsKey(this.f5632b)) {
            w.remove(this.f5632b);
        }
        if (v.containsKey(this.f5632b)) {
            v.remove(this.f5632b);
        }
        com.ReactNativeBlobUtil.a aVar = this.l;
        if (aVar != null) {
            aVar.b();
        }
    }

    public final boolean n() {
        return this.f5631a.f30295b.booleanValue() && (this.f5631a.f30294a.booleanValue() || this.f5631a.c != null);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x00da  */
    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        String string;
        if ("android.intent.action.DOWNLOAD_COMPLETE".equals(intent.getAction())) {
            Context applicationContext = ReactNativeBlobUtil.RCTContext.getApplicationContext();
            if (intent.getExtras().getLong("extra_download_id") == this.f5633k) {
                m();
                DownloadManager.Query query = new DownloadManager.Query();
                query.setFilterById(this.f5633k);
                DownloadManager downloadManager = (DownloadManager) applicationContext.getSystemService("download");
                downloadManager.query(query);
                Cursor cursorQuery = downloadManager.query(query);
                if (cursorQuery == null) {
                    this.i.invoke("Download manager failed to download from  " + this.d + ". Query was unsuccessful ", null, null);
                    return;
                }
                try {
                    if (cursorQuery.moveToFirst()) {
                        int i = cursorQuery.getInt(cursorQuery.getColumnIndex("status"));
                        if (i == 16) {
                            this.i.invoke("Download manager failed to download from  " + this.d + ". Status Code = " + i, null, null);
                            cursorQuery.close();
                            return;
                        }
                        String string2 = cursorQuery.getString(cursorQuery.getColumnIndex("local_uri"));
                        if (string2 != null) {
                            Cursor cursorQuery2 = applicationContext.getContentResolver().query(Uri.parse(string2), new String[]{"_data"}, null, null, null);
                            if (cursorQuery2 != null) {
                                cursorQuery2.moveToFirst();
                                string = cursorQuery2.getString(0);
                                cursorQuery2.close();
                            } else {
                                string = null;
                            }
                        } else {
                            string = null;
                        }
                    } else {
                        string = null;
                    }
                    cursorQuery.close();
                    if (!this.f5631a.e.hasKey("path")) {
                        if (string == null) {
                            this.i.invoke("Download manager could not resolve downloaded file path.", "path", null);
                            return;
                        } else {
                            this.i.invoke(null, "path", string);
                            return;
                        }
                    }
                    try {
                        String string3 = this.f5631a.e.getString("path");
                        if (!new File(string3).exists()) {
                            throw new Exception("Download manager download failed, the file does not downloaded to destination.");
                        }
                        this.i.invoke(null, "path", string3);
                    } catch (Exception e2) {
                        e2.printStackTrace();
                        this.i.invoke(e2.getLocalizedMessage(), null);
                    }
                } catch (Throwable th) {
                    cursorQuery.close();
                    throw th;
                }
            }
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        String str;
        ReadableMap readableMap = this.f5631a.e;
        if (readableMap != null && readableMap.hasKey("useDownloadManager") && this.f5631a.e.getBoolean("useDownloadManager")) {
            DownloadManager.Request request = new DownloadManager.Request(Uri.parse(this.d));
            if (this.f5631a.e.hasKey("notification") && this.f5631a.e.getBoolean("notification")) {
                request.setNotificationVisibility(1);
            } else {
                request.setNotificationVisibility(2);
            }
            if (this.f5631a.e.hasKey("title")) {
                request.setTitle(this.f5631a.e.getString("title"));
            }
            if (this.f5631a.e.hasKey("description")) {
                request.setDescription(this.f5631a.e.getString("description"));
            }
            if (this.f5631a.e.hasKey("path")) {
                request.setDestinationUri(Uri.parse("file://" + this.f5631a.e.getString("path")));
            }
            if (this.f5631a.e.hasKey("mime")) {
                request.setMimeType(this.f5631a.e.getString("mime"));
            }
            if (this.f5631a.e.hasKey("mediaScannable") && this.f5631a.e.getBoolean("mediaScannable")) {
                request.allowScanningByMediaScanner();
            }
            ReadableMapKeySetIterator readableMapKeySetIteratorKeySetIterator = this.h.keySetIterator();
            while (readableMapKeySetIteratorKeySetIterator.hasNextKey()) {
                String strNextKey = readableMapKeySetIteratorKeySetIterator.nextKey();
                request.addRequestHeader(strNextKey, this.h.getString(strNextKey));
            }
            try {
                URL url = new URL(this.d);
                request.addRequestHeader(NetConstants.COOKIE, CookieManager.getInstance().getCookie(url.getProtocol() + "://" + url.getHost()));
            } catch (MalformedURLException e2) {
                e2.printStackTrace();
            }
            Context applicationContext = ReactNativeBlobUtil.RCTContext.getApplicationContext();
            long jEnqueue = ((DownloadManager) applicationContext.getSystemService("download")).enqueue(request);
            this.f5633k = jEnqueue;
            u.put(this.f5632b, Long.valueOf(jEnqueue));
            applicationContext.registerReceiver(this, new IntentFilter("android.intent.action.DOWNLOAD_COMPLETE"));
            return;
        }
        String strB = this.f5632b;
        if (this.f5631a.d.isEmpty()) {
            str = "";
        } else {
            str = "." + this.f5631a.d;
        }
        String str2 = this.f5631a.h;
        if (str2 != null) {
            strB = com.ReactNativeBlobUtil.e.b(str2);
            if (strB == null) {
                strB = this.f5632b;
            }
            File file = new File(com.ReactNativeBlobUtil.b.m(strB) + str);
            if (file.exists()) {
                this.i.invoke(null, "path", file.getAbsolutePath());
                return;
            }
        }
        pdj pdjVar = this.f5631a;
        String str3 = pdjVar.c;
        if (str3 != null) {
            this.f = str3;
        } else if (pdjVar.f30294a.booleanValue()) {
            this.f = com.ReactNativeBlobUtil.b.m(strB) + str;
        }
        try {
            OkHttpClient.Builder builderC = this.f5631a.f.booleanValue() ? com.ReactNativeBlobUtil.e.c(this.s) : this.s.newBuilder();
            if (this.f5631a.g.booleanValue()) {
                ConnectivityManager connectivityManager = (ConnectivityManager) ReactNativeBlobUtil.RCTContext.getSystemService(OneTrackConstant.EVENT_NAME_CONNECTIVITY);
                Network[] allNetworks = connectivityManager.getAllNetworks();
                int length = allNetworks.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        this.i.invoke("No available WiFi connections.", null, null);
                        m();
                        return;
                    }
                    Network network = allNetworks[i];
                    NetworkInfo networkInfo = connectivityManager.getNetworkInfo(network);
                    NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(network);
                    if (networkCapabilities != null && networkInfo != null && networkInfo.isConnected() && networkCapabilities.hasTransport(1)) {
                        builderC.proxy(Proxy.NO_PROXY);
                        builderC.socketFactory(network.getSocketFactory());
                        break;
                    }
                    i++;
                }
            }
            Request.Builder builder = new Request.Builder();
            try {
                builder.url(new URL(this.d));
            } catch (MalformedURLException e3) {
                e3.printStackTrace();
            }
            HashMap<String, String> map = new HashMap<>();
            ReadableMap readableMap2 = this.h;
            if (readableMap2 != null) {
                ReadableMapKeySetIterator readableMapKeySetIteratorKeySetIterator2 = readableMap2.keySetIterator();
                while (readableMapKeySetIteratorKeySetIterator2.hasNextKey()) {
                    String strNextKey2 = readableMapKeySetIteratorKeySetIterator2.nextKey();
                    String string = this.h.getString(strNextKey2);
                    if (!strNextKey2.equalsIgnoreCase("RNFB-Response")) {
                        Locale locale = Locale.ROOT;
                        builder.header(strNextKey2.toLowerCase(locale), string);
                        map.put(strNextKey2.toLowerCase(locale), string);
                    } else if (string.equalsIgnoreCase(ViewShot.Results.BASE_64)) {
                        this.o = f.BASE64;
                    } else if (string.equalsIgnoreCase("utf8")) {
                        this.o = f.UTF8;
                    }
                }
            }
            if (this.c.equalsIgnoreCase("post") || this.c.equalsIgnoreCase(LifecycleConstantKt.ACTION_PUT) || this.c.equalsIgnoreCase("patch")) {
                String strG = g(map, "Content-Type");
                Locale locale2 = Locale.ROOT;
                String lowerCase = strG.toLowerCase(locale2);
                if (this.g != null) {
                    this.m = e.Form;
                } else if (lowerCase.isEmpty()) {
                    if (!lowerCase.equalsIgnoreCase("")) {
                        builder.header("Content-Type", "application/octet-stream");
                    }
                    this.m = e.SingleFile;
                }
                String str4 = this.e;
                if (str4 != null) {
                    if (str4.startsWith("ReactNativeBlobUtil-file://") || this.e.startsWith("ReactNativeBlobUtil-content://")) {
                        this.m = e.SingleFile;
                    } else if (lowerCase.toLowerCase(locale2).contains(";base64") || lowerCase.toLowerCase(locale2).startsWith("application/octet")) {
                        String strReplace = lowerCase.replace(";base64", "").replace(";BASE64", "");
                        if (map.containsKey("content-type")) {
                            map.put("content-type", strReplace);
                        }
                        if (map.containsKey("Content-Type")) {
                            map.put("Content-Type", strReplace);
                        }
                        this.m = e.SingleFile;
                    } else {
                        this.m = e.AsIs;
                    }
                }
            } else {
                this.m = e.WithoutBody;
            }
            boolean zEqualsIgnoreCase = g(map, HTTP.TRANSFER_ENCODING).equalsIgnoreCase(HTTP.CHUNK_CODING);
            int i2 = d.f5639a[this.m.ordinal()];
            if (i2 == 1) {
                com.ReactNativeBlobUtil.a aVarK = new com.ReactNativeBlobUtil.a(this.f5632b).a(zEqualsIgnoreCase).l(this.m).j(this.e).k(MediaType.parse(g(map, "content-type")));
                this.l = aVarK;
                builder.method(this.c, aVarK);
            } else if (i2 == 2) {
                com.ReactNativeBlobUtil.a aVarK2 = new com.ReactNativeBlobUtil.a(this.f5632b).a(zEqualsIgnoreCase).l(this.m).j(this.e).k(MediaType.parse(g(map, "content-type")));
                this.l = aVarK2;
                builder.method(this.c, aVarK2);
            } else if (i2 == 3) {
                String str5 = "ReactNativeBlobUtil-" + this.f5632b;
                com.ReactNativeBlobUtil.a aVarK3 = new com.ReactNativeBlobUtil.a(this.f5632b).a(zEqualsIgnoreCase).l(this.m).i(this.g).k(MediaType.parse("multipart/form-data; boundary=" + str5));
                this.l = aVarK3;
                builder.method(this.c, aVarK3);
            } else if (i2 == 4) {
                if (this.c.equalsIgnoreCase("post") || this.c.equalsIgnoreCase(LifecycleConstantKt.ACTION_PUT) || this.c.equalsIgnoreCase("patch")) {
                    builder.method(this.c, RequestBody.create((MediaType) null, new byte[0]));
                } else {
                    builder.method(this.c, null);
                }
            }
            Request requestBuild = builder.build();
            builderC.addNetworkInterceptor(new a());
            builderC.addInterceptor(new b(requestBuild));
            long j = this.f5631a.l;
            if (j >= 0) {
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                builderC.connectTimeout(j, timeUnit);
                builderC.readTimeout(this.f5631a.l, timeUnit);
            }
            builderC.connectionPool(x);
            builderC.retryOnConnectionFailure(false);
            builderC.followRedirects(this.f5631a.n.booleanValue());
            builderC.followSslRedirects(this.f5631a.n.booleanValue());
            builderC.retryOnConnectionFailure(true);
            Call callNewCall = f(builderC).build().newCall(requestBuild);
            t.put(this.f5632b, callNewCall);
            callNewCall.enqueue(new c());
        } catch (Exception e4) {
            e4.printStackTrace();
            m();
            this.i.invoke("ReactNativeBlobUtil request error: " + e4.getMessage() + e4.getCause());
        }
    }
}
