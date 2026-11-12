package defpackage;

import com.ReactNativeBlobUtil.ReactNativeBlobUtilReq;
import com.ReactNativeBlobUtil.c;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.xiaomi.fit.data.common.data.annotation.SportDataTypeKt;
import java.io.IOException;
import java.nio.charset.Charset;
import okhttp3.MediaType;
import okhttp3.ResponseBody;
import okio.Buffer;
import okio.BufferedSource;
import okio.Okio;
import okio.Source;
import okio.Timeout;

/* JADX INFO: loaded from: classes.dex */
public class rdj extends ResponseBody {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f32442a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ReactApplicationContext f32443b;
    public ResponseBody c;
    public boolean d;

    public class a implements Source {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public BufferedSource f32444a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f32445b = 0;

        public a(BufferedSource bufferedSource) {
            this.f32444a = bufferedSource;
        }

        @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
        }

        @Override // okio.Source
        public long read(Buffer buffer, long j) throws IOException {
            long j2 = this.f32444a.read(buffer, j);
            this.f32445b += j2 > 0 ? j2 : 0L;
            c cVarI = ReactNativeBlobUtilReq.i(rdj.this.f32442a);
            long contentLength = rdj.this.getContentLength();
            if (cVarI != null && contentLength != 0 && cVarI.a(this.f32445b / rdj.this.getContentLength())) {
                WritableMap writableMapCreateMap = Arguments.createMap();
                writableMapCreateMap.putString("taskId", rdj.this.f32442a);
                writableMapCreateMap.putString("written", String.valueOf(this.f32445b));
                writableMapCreateMap.putString(SportDataTypeKt.DIMEN_TOTAL, String.valueOf(rdj.this.getContentLength()));
                if (rdj.this.d) {
                    writableMapCreateMap.putString("chunk", buffer.readString(Charset.defaultCharset()));
                } else {
                    writableMapCreateMap.putString("chunk", "");
                }
                ((DeviceEventManagerModule.RCTDeviceEventEmitter) rdj.this.f32443b.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit("ReactNativeBlobUtilProgress", writableMapCreateMap);
            }
            return j2;
        }

        @Override // okio.Source
        /* JADX INFO: renamed from: timeout */
        public Timeout getTimeout() {
            return null;
        }
    }

    public rdj(ReactApplicationContext reactApplicationContext, String str, ResponseBody responseBody, boolean z) {
        this.f32443b = reactApplicationContext;
        this.f32442a = str;
        this.c = responseBody;
        this.d = z;
    }

    @Override // okhttp3.ResponseBody
    /* JADX INFO: renamed from: contentLength */
    public long getContentLength() {
        return this.c.getContentLength();
    }

    @Override // okhttp3.ResponseBody
    /* JADX INFO: renamed from: contentType */
    public MediaType get$contentType() {
        return this.c.get$contentType();
    }

    @Override // okhttp3.ResponseBody
    /* JADX INFO: renamed from: source */
    public BufferedSource getSource() {
        return Okio.buffer(new a(this.c.getSource()));
    }
}
