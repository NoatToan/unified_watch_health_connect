package defpackage;

import com.ReactNativeBlobUtil.ReactNativeBlobUtilReq;
import com.ReactNativeBlobUtil.c;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.xiaomi.fit.data.common.data.annotation.SportDataTypeKt;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import okhttp3.MediaType;
import okhttp3.ResponseBody;
import okio.Buffer;
import okio.BufferedSource;
import okio.Okio;
import okio.Source;
import okio.Timeout;

/* JADX INFO: loaded from: classes.dex */
public class tdj extends ResponseBody {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f34600a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ResponseBody f34601b;
    public String c;
    public ReactApplicationContext e;
    public FileOutputStream f;
    public long d = 0;
    public boolean g = false;

    public class a implements Source {
        public final void a(String str, long j, long j2) {
            WritableMap writableMapCreateMap = Arguments.createMap();
            writableMapCreateMap.putString("taskId", str);
            writableMapCreateMap.putString("written", String.valueOf(j));
            writableMapCreateMap.putString(SportDataTypeKt.DIMEN_TOTAL, String.valueOf(j2));
            ((DeviceEventManagerModule.RCTDeviceEventEmitter) tdj.this.e.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit("ReactNativeBlobUtilProgress", writableMapCreateMap);
        }

        @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            tdj.this.f.close();
        }

        @Override // okio.Source
        public long read(Buffer buffer, long j) throws IOException {
            float contentLength;
            int i = (int) j;
            try {
                byte[] bArr = new byte[i];
                long j2 = tdj.this.f34601b.byteStream().read(bArr, 0, i);
                tdj tdjVar = tdj.this;
                tdjVar.d += j2 > 0 ? j2 : 0L;
                if (j2 > 0) {
                    tdjVar.f.write(bArr, 0, (int) j2);
                } else if (tdjVar.getContentLength() == -1 && j2 == -1) {
                    tdj.this.g = true;
                }
                c cVarI = ReactNativeBlobUtilReq.i(tdj.this.f34600a);
                if (tdj.this.getContentLength() != 0) {
                    if (tdj.this.getContentLength() != -1) {
                        tdj tdjVar2 = tdj.this;
                        contentLength = tdjVar2.d / tdjVar2.getContentLength();
                    } else {
                        contentLength = tdj.this.g ? 1.0f : 0.0f;
                    }
                    if (cVarI != null && cVarI.a(contentLength)) {
                        if (tdj.this.getContentLength() != -1) {
                            tdj tdjVar3 = tdj.this;
                            a(tdjVar3.f34600a, tdjVar3.d, tdjVar3.getContentLength());
                        } else {
                            tdj tdjVar4 = tdj.this;
                            if (tdjVar4.g) {
                                String str = tdjVar4.f34600a;
                                long j3 = tdjVar4.d;
                                a(str, j3, j3);
                            } else {
                                a(tdjVar4.f34600a, 0L, tdjVar4.getContentLength());
                            }
                        }
                    }
                }
                return j2;
            } catch (Exception unused) {
                return -1L;
            }
        }

        @Override // okio.Source
        /* JADX INFO: renamed from: timeout */
        public Timeout getTimeout() {
            return null;
        }

        public a() {
        }
    }

    public tdj(ReactApplicationContext reactApplicationContext, String str, ResponseBody responseBody, String str2, boolean z) throws IOException {
        this.e = reactApplicationContext;
        this.f34600a = str;
        this.f34601b = responseBody;
        this.c = str2;
        if (str2 != null) {
            boolean z2 = !z;
            String strReplace = str2.replace("?append=true", "");
            this.c = strReplace;
            File file = new File(strReplace);
            File parentFile = file.getParentFile();
            if (parentFile == null || parentFile.exists() || parentFile.mkdirs()) {
                if (!file.exists()) {
                    file.createNewFile();
                }
                this.f = new FileOutputStream(new File(strReplace), z2);
            } else {
                throw new IllegalStateException("Couldn't create dir: " + parentFile);
            }
        }
    }

    public boolean a() {
        return this.d == getContentLength() || (getContentLength() == -1 && this.g);
    }

    @Override // okhttp3.ResponseBody
    /* JADX INFO: renamed from: contentLength */
    public long getContentLength() {
        if (this.f34601b.getContentLength() > 2147483647L) {
            return 2147483647L;
        }
        return this.f34601b.getContentLength();
    }

    @Override // okhttp3.ResponseBody
    /* JADX INFO: renamed from: contentType */
    public MediaType get$contentType() {
        return this.f34601b.get$contentType();
    }

    @Override // okhttp3.ResponseBody
    /* JADX INFO: renamed from: source */
    public BufferedSource getSource() {
        return Okio.buffer(new a());
    }
}
