package com.ReactNativeBlobUtil;

import android.net.Uri;
import android.util.Base64;
import androidx.work.Data;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.xiaomi.fit.data.common.data.annotation.SportDataTypeKt;
import com.xiaomi.smarthome.library.apache.http.protocol.HTTP;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import okio.BufferedSink;

/* JADX INFO: loaded from: classes.dex */
public class a extends RequestBody {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public InputStream f5647a;
    public ReadableArray c;
    public String d;
    public String e;
    public ReactNativeBlobUtilReq.e f;
    public MediaType g;
    public File h;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f5648b = 0;
    public int i = 0;
    public Boolean j = Boolean.FALSE;

    /* JADX INFO: renamed from: com.ReactNativeBlobUtil.a$a, reason: collision with other inner class name */
    public static /* synthetic */ class C0112a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f5649a;

        static {
            int[] iArr = new int[ReactNativeBlobUtilReq.e.values().length];
            f5649a = iArr;
            try {
                iArr[ReactNativeBlobUtilReq.e.SingleFile.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f5649a[ReactNativeBlobUtilReq.e.AsIs.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f5649a[ReactNativeBlobUtilReq.e.Others.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f5650a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f5651b;
        public String c;
        public String d;

        public b(ReadableMap readableMap) {
            if (readableMap.hasKey("name")) {
                this.f5650a = readableMap.getString("name");
            }
            if (readableMap.hasKey("filename")) {
                this.f5651b = readableMap.getString("filename");
            }
            if (readableMap.hasKey("type")) {
                this.c = readableMap.getString("type");
            } else {
                this.c = this.f5651b == null ? HTTP.PLAIN_TEXT_TYPE : "application/octet-stream";
            }
            if (readableMap.hasKey("data")) {
                this.d = readableMap.getString("data");
            }
        }
    }

    public a(String str) {
        this.d = str;
    }

    public a a(boolean z) {
        this.j = Boolean.valueOf(z);
        return this;
    }

    public boolean b() {
        try {
            File file = this.h;
            if (file == null || !file.exists()) {
                return true;
            }
            this.h.delete();
            return true;
        } catch (Exception e) {
            e.a(e.getLocalizedMessage());
            return false;
        }
    }

    public final ArrayList<b> c() throws IOException {
        int length;
        long length2;
        ArrayList<b> arrayList = new ArrayList<>();
        ReactApplicationContext reactApplicationContext = ReactNativeBlobUtil.RCTContext;
        long jAvailable = 0;
        for (int i = 0; i < this.c.size(); i++) {
            b bVar = new b(this.c.getMap(i));
            arrayList.add(bVar);
            String str = bVar.d;
            if (str == null) {
                e.a("ReactNativeBlobUtil multipart request builder has found a field without `data` property, the field `" + bVar.f5650a + "` will be removed implicitly.");
            } else {
                if (bVar.f5651b == null) {
                    length = str.getBytes().length;
                } else if (str.startsWith("ReactNativeBlobUtil-file://")) {
                    String strF = e.f(str.substring(27));
                    if (e.d(strF)) {
                        try {
                            length = reactApplicationContext.getAssets().open(strF.replace("bundle-assets://", "")).available();
                        } catch (IOException e) {
                            e.a(e.getLocalizedMessage());
                        }
                    } else {
                        length2 = new File(e.f(strF)).length();
                    }
                    jAvailable += length2;
                } else if (str.startsWith("ReactNativeBlobUtil-content://")) {
                    String strSubstring = str.substring(30);
                    InputStream inputStreamOpenInputStream = null;
                    try {
                        try {
                            inputStreamOpenInputStream = reactApplicationContext.getContentResolver().openInputStream(Uri.parse(strSubstring));
                            jAvailable += (long) inputStreamOpenInputStream.available();
                        } catch (Throwable th) {
                            if (inputStreamOpenInputStream != null) {
                                inputStreamOpenInputStream.close();
                            }
                            throw th;
                        }
                    } catch (Exception e2) {
                        e.a("Failed to estimate form data length from content URI:" + strSubstring + ", " + e2.getLocalizedMessage());
                        if (inputStreamOpenInputStream != null) {
                        }
                    }
                    inputStreamOpenInputStream.close();
                } else {
                    length = Base64.decode(str, 0).length;
                }
                length2 = length;
                jAvailable += length2;
            }
        }
        this.f5648b = jAvailable;
        return arrayList;
    }

    @Override // okhttp3.RequestBody
    public long contentLength() {
        if (this.j.booleanValue()) {
            return -1L;
        }
        return this.f5648b;
    }

    @Override // okhttp3.RequestBody
    /* JADX INFO: renamed from: contentType */
    public MediaType getContentType() {
        return this.g;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x014a A[PHI: r10
      0x014a: PHI (r10v5 java.io.InputStream) = (r10v4 java.io.InputStream), (r10v6 java.io.InputStream) binds: [B:33:0x016f, B:27:0x0148] A[DONT_GENERATE, DONT_INLINE]] */
    public final File d() throws IOException {
        String str = "ReactNativeBlobUtil-" + this.d;
        File fileCreateTempFile = File.createTempFile("rnfb-form-tmp", "", ReactNativeBlobUtil.RCTContext.getCacheDir());
        FileOutputStream fileOutputStream = new FileOutputStream(fileCreateTempFile);
        ArrayList<b> arrayListC = c();
        ReactApplicationContext reactApplicationContext = ReactNativeBlobUtil.RCTContext;
        Iterator<b> it = arrayListC.iterator();
        while (it.hasNext()) {
            b next = it.next();
            String str2 = next.d;
            String str3 = next.f5650a;
            if (str3 != null && str2 != null) {
                String str4 = "--" + str + "\r\n";
                Iterator<b> it2 = it;
                if (next.f5651b != null) {
                    fileOutputStream.write(((str4 + "Content-Disposition: form-data; name=\"" + str3 + "\"; filename=\"" + next.f5651b + "\"\r\n") + "Content-Type: " + next.c + "\r\n\r\n").getBytes());
                    if (str2.startsWith("ReactNativeBlobUtil-file://")) {
                        String strF = e.f(str2.substring(27));
                        if (e.d(strF)) {
                            try {
                                g(reactApplicationContext.getAssets().open(strF.replace("bundle-assets://", "")), fileOutputStream);
                            } catch (IOException e) {
                                e.a("Failed to create form data asset :" + strF + ", " + e.getLocalizedMessage());
                            }
                        } else {
                            File file = new File(e.f(strF));
                            if (file.exists()) {
                                g(new FileInputStream(file), fileOutputStream);
                            } else {
                                e.a("Failed to create form data from path :" + strF + ", file not exists.");
                            }
                        }
                    } else if (str2.startsWith("ReactNativeBlobUtil-content://")) {
                        String strSubstring = str2.substring(30);
                        InputStream inputStreamOpenInputStream = null;
                        try {
                            try {
                                inputStreamOpenInputStream = reactApplicationContext.getContentResolver().openInputStream(Uri.parse(strSubstring));
                                g(inputStreamOpenInputStream, fileOutputStream);
                                if (inputStreamOpenInputStream != null) {
                                    inputStreamOpenInputStream.close();
                                }
                            } catch (Exception e2) {
                                e.a("Failed to create form data from content URI:" + strSubstring + ", " + e2.getLocalizedMessage());
                                if (inputStreamOpenInputStream != null) {
                                    inputStreamOpenInputStream.close();
                                }
                            }
                        } catch (Throwable th) {
                            if (inputStreamOpenInputStream != null) {
                                inputStreamOpenInputStream.close();
                            }
                            throw th;
                        }
                    } else {
                        fileOutputStream.write(Base64.decode(str2, 0));
                    }
                } else {
                    fileOutputStream.write(((str4 + "Content-Disposition: form-data; name=\"" + str3 + "\"\r\n") + "Content-Type: " + next.c + "\r\n\r\n").getBytes());
                    fileOutputStream.write(next.d.getBytes());
                }
                fileOutputStream.write("\r\n".getBytes());
                it = it2;
            }
        }
        fileOutputStream.write(("--" + str + "--\r\n").getBytes());
        fileOutputStream.flush();
        fileOutputStream.close();
        return fileCreateTempFile;
    }

    public final void e(long j) {
        c cVarJ = ReactNativeBlobUtilReq.j(this.d);
        if (cVarJ != null) {
            long j2 = this.f5648b;
            if (j2 == 0 || !cVarJ.a(j / j2)) {
                return;
            }
            WritableMap writableMapCreateMap = Arguments.createMap();
            writableMapCreateMap.putString("taskId", this.d);
            writableMapCreateMap.putString("written", String.valueOf(j));
            writableMapCreateMap.putString(SportDataTypeKt.DIMEN_TOTAL, String.valueOf(this.f5648b));
            ((DeviceEventManagerModule.RCTDeviceEventEmitter) ReactNativeBlobUtil.RCTContext.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit("ReactNativeBlobUtilProgress-upload", writableMapCreateMap);
        }
    }

    public final InputStream f() throws Exception {
        if (!this.e.startsWith("ReactNativeBlobUtil-file://")) {
            if (!this.e.startsWith("ReactNativeBlobUtil-content://")) {
                try {
                    return new ByteArrayInputStream(Base64.decode(this.e, 0));
                } catch (Exception e) {
                    throw new Exception("error when getting request stream: " + e.getLocalizedMessage());
                }
            }
            String strSubstring = this.e.substring(30);
            try {
                return ReactNativeBlobUtil.RCTContext.getContentResolver().openInputStream(Uri.parse(strSubstring));
            } catch (Exception e2) {
                throw new Exception("error when getting request stream for content URI: " + strSubstring, e2);
            }
        }
        String strF = e.f(this.e.substring(27));
        if (e.d(strF)) {
            try {
                return ReactNativeBlobUtil.RCTContext.getAssets().open(strF.replace("bundle-assets://", ""));
            } catch (Exception e3) {
                throw new Exception("error when getting request stream from asset : " + e3.getLocalizedMessage());
            }
        }
        File file = new File(e.f(strF));
        try {
            if (!file.exists()) {
                file.createNewFile();
            }
            return new FileInputStream(file);
        } catch (Exception e4) {
            throw new Exception("error when getting request stream: " + e4.getLocalizedMessage());
        }
    }

    public final void g(InputStream inputStream, FileOutputStream fileOutputStream) throws IOException {
        byte[] bArr = new byte[Data.MAX_DATA_BYTES];
        while (true) {
            int i = inputStream.read(bArr);
            if (i <= 0) {
                inputStream.close();
                return;
            }
            fileOutputStream.write(bArr, 0, i);
        }
    }

    public final void h(InputStream inputStream, BufferedSink bufferedSink) throws IOException {
        byte[] bArr = new byte[Data.MAX_DATA_BYTES];
        long j = 0;
        while (true) {
            int i = inputStream.read(bArr, 0, Data.MAX_DATA_BYTES);
            if (i <= 0) {
                inputStream.close();
                return;
            } else {
                bufferedSink.write(bArr, 0, i);
                j += (long) i;
                e(j);
            }
        }
    }

    public a i(ReadableArray readableArray) {
        this.c = readableArray;
        try {
            this.h = d();
            this.f5647a = new FileInputStream(this.h);
            this.f5648b = this.h.length();
        } catch (Exception e) {
            e.printStackTrace();
            e.a("ReactNativeBlobUtil failed to create request multipart body :" + e.getLocalizedMessage());
        }
        return this;
    }

    public a j(String str) {
        this.e = str;
        if (str == null) {
            this.e = "";
            this.f = ReactNativeBlobUtilReq.e.AsIs;
        }
        try {
            int i = C0112a.f5649a[this.f.ordinal()];
            if (i == 1) {
                InputStream inputStreamF = f();
                this.f5647a = inputStreamF;
                this.f5648b = inputStreamF.available();
            } else if (i == 2) {
                this.f5648b = this.e.getBytes().length;
                this.f5647a = new ByteArrayInputStream(this.e.getBytes());
            }
        } catch (Exception e) {
            e.printStackTrace();
            e.a("ReactNativeBlobUtil failed to create single content request body :" + e.getLocalizedMessage() + "\r\n");
        }
        return this;
    }

    public a k(MediaType mediaType) {
        this.g = mediaType;
        return this;
    }

    public a l(ReactNativeBlobUtilReq.e eVar) {
        this.f = eVar;
        return this;
    }

    @Override // okhttp3.RequestBody
    public void writeTo(BufferedSink bufferedSink) {
        try {
            h(this.f5647a, bufferedSink);
        } catch (Exception e) {
            e.a(e.getLocalizedMessage());
            e.printStackTrace();
        }
    }
}
