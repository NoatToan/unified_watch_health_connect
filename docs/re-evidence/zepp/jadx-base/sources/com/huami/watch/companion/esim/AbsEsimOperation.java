package com.huami.watch.companion.esim;

import android.annotation.SuppressLint;
import android.content.Context;
import com.huami.tools.log.HMLog;
import com.huami.watch.companion.esim.AbsEsimOperation;
import com.huami.watch.companion.mediac.Command;
import com.huami.watch.transport.DataBundle;
import com.huami.watch.util.Rx;
import com.squareup.okhttp.Headers;
import com.squareup.okhttp.Interceptor;
import com.squareup.okhttp.MediaType;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.RequestBody;
import com.squareup.okhttp.Response;
import com.squareup.okhttp.ResponseBody;
import com.xmlywind.sdk.common.mta.PointCategory;
import io.flutter.plugins.firebase.crashlytics.Constants;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.security.SecureRandom;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\b&\u0018\u0000 92\u00020\u0001:\u00049:4\tB\u0007¢\u0006\u0004\b7\u00108J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0002J\n\u0010\t\u001a\u0004\u0018\u00010\bH\u0002J\u0010\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016J\u0010\u0010\u0010\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0004J\b\u0010\u0011\u001a\u00020\fH&J\b\u0010\u0012\u001a\u00020\fH&J\u0010\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u0013H&J\u0018\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u0013H&J \u0010\u001b\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u0013H&J*\u0010\u001b\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u00042\b\u0010\u001c\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0017\u001a\u00020\u0013H&J\u0018\u0010\u001e\u001a\u00020\f2\u0006\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u0013H&J\u0010\u0010\u001f\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u0013H&J\u0018\u0010\"\u001a\u00020\f2\u0006\u0010 \u001a\u00020\u00042\u0006\u0010!\u001a\u00020\u0013H&J\u0010\u0010#\u001a\u00020\f2\u0006\u0010 \u001a\u00020\u0004H&J\u0018\u0010%\u001a\u00020\f2\u0006\u0010 \u001a\u00020\u00042\u0006\u0010$\u001a\u00020\u0004H&J\u0018\u0010(\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010'\u001a\u00020&H&J\u0010\u0010+\u001a\u00020\f2\u0006\u0010*\u001a\u00020)H&J\b\u0010,\u001a\u00020\fH&J\n\u0010.\u001a\u0004\u0018\u00010-H&J\b\u0010/\u001a\u00020\fH&J\u0010\u00100\u001a\u00020\u00132\u0006\u0010\u000b\u001a\u00020\nH&J\u0011\u00101\u001a\u0004\u0018\u00010\u0013H&¢\u0006\u0004\b1\u00102R\u0016\u00106\u001a\u0002038\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b4\u00105¨\u0006;"}, d2 = {"Lcom/huami/watch/companion/esim/AbsEsimOperation;", "", "Lcom/squareup/okhttp/ResponseBody;", "responseBody", "", "e", "Lcom/squareup/okhttp/Headers;", "c", "Ljavax/net/ssl/SSLSocketFactory;", "b", "Landroid/content/Context;", "ctx", "", PointCategory.INIT, "Lcom/huami/watch/transport/DataBundle;", "dataBundle", "handlerHttpRequest", "requestSimInfo", "showQr", "", "needSync", "getProfileList", "activationUrl", "needResult", "needInputPinCode", "activationCode", "carrierType", "startDownloadProfile", "pinCode", "ePin", "continueDownloadProfile", "cancelDownloadProfile", AbsEsimOperation.KEY_ICCID, Constants.ENABLED, "switchProfileState", "deleteProfile", "name", "setProfileName", "", "currentTime", "sendWithRetry", "Lcom/huami/watch/companion/esim/OperationCallBack;", "callback", "setOperationCallback", "sendNotification", "Lcom/huami/watch/companion/esim/SimResult;", "getResult", Command.STOP, "isConnected", "supportEPin", "()Ljava/lang/Boolean;", "Lcom/squareup/okhttp/OkHttpClient;", "a", "Lcom/squareup/okhttp/OkHttpClient;", "mHttpClient", "<init>", "()V", "Companion", "RetryingOkHttpInterceptor", "esim_release"}, k = 1, mv = {1, 5, 1})
public abstract class AbsEsimOperation {

    @NotNull
    public static final String CONTENT_TYPE_JSON = "application/json";

    @NotNull
    public static final String DEFAULT_ESIM_VERSION = "1.0";

    @NotNull
    public static final String HEADER_CONNECTION = "connection";

    @NotNull
    public static final String HEADER_PROXY_CONNECTION = "proxy-connection";

    @NotNull
    public static final String HEADER_VALUE_KEEP_ALIVE = "Keep-Alive";

    @NotNull
    public static final String KEY_AUTO_ENABLE = "auto_enable";

    @NotNull
    public static final String KEY_CAPBILITY = "capbility";

    @NotNull
    public static final String KEY_CARRIER_TYPE = "carrier_type";

    @NotNull
    public static final String KEY_EID = "eid";

    @NotNull
    public static final String KEY_ERROR_CODE = "errorCode";

    @NotNull
    public static final String KEY_FIRMWARE_TYPE = "device_type";

    @NotNull
    public static final String KEY_ICCID = "iccid";

    @NotNull
    public static final String KEY_IMEI = "imei";

    @NotNull
    public static final String KEY_INFO = "info";

    @NotNull
    public static final String KEY_NAME = "name";

    @NotNull
    public static final String KEY_REQUEST_BODY = "request_body";

    @NotNull
    public static final String KEY_REQUEST_URL = "request_url";

    @NotNull
    public static final String KEY_RESPONSE_CODE = "response_code";

    @NotNull
    public static final String KEY_RESPONSE_DATA = "response_data";

    @NotNull
    public static final String KEY_STATE = "state";

    @NotNull
    public static final String KEY_SUBJECT_CODE = "subjectCode";

    @NotNull
    public static final String KEY_SUB_MAJOR_VERSION = "major_version";

    @NotNull
    public static final String KEY_SUB_MINOR_VERSION = "minor_version";

    @NotNull
    public static final String KEY_SYNC_NOTIFICATION = "sync_notification";

    @NotNull
    public static final String KEY_TYPE = "type";
    public static final int MAX_RETRY_TIMES = 11;
    public static final int RESULT_FAILURE = 1;
    public static final int RESULT_SUCCESS = 0;

    @NotNull
    public static final String SUPPORT_PIN_CODE_VERSION = "1.1";

    @NotNull
    public static final String TAG = "ESimOperationHelper";

    @NotNull
    public static final String TYPE_DELETE = "delete";

    @NotNull
    public static final String TYPE_DOWNLOAD_PROFILE = "download_profile";

    @NotNull
    public static final String TYPE_DOWNLOAD_STATUS = "download_status";

    @NotNull
    public static final String TYPE_ESIM_CAPBILITY = "esim_capbility";

    @NotNull
    public static final String TYPE_ESIM_CC = "esim_confirm_code";

    @NotNull
    public static final String TYPE_ESIM_VERSION = "esim_version";

    @NotNull
    public static final String TYPE_PROFILE_LIST = "profile_list";

    @NotNull
    public static final String TYPE_RECEIVE_RESPONSE = "receive_response";

    @NotNull
    public static final String TYPE_SEND_NOTIFICATION = "send_notification";

    @NotNull
    public static final String TYPE_SEND_REQUEST = "send_request";

    @NotNull
    public static final String TYPE_SET_NAME = "set_name";

    @NotNull
    public static final String TYPE_SHOW_QR = "show_qr";

    @NotNull
    public static final String TYPE_SIM_INFO = "sim_info";

    @NotNull
    public static final String TYPE_SWITCH_PROFILE_STATE = "switch_state";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private OkHttpClient mHttpClient;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u0000 \b2\u00020\u0001:\u0001\tB\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\n"}, d2 = {"Lcom/huami/watch/companion/esim/AbsEsimOperation$RetryingOkHttpInterceptor;", "Lcom/squareup/okhttp/Interceptor;", "Lcom/squareup/okhttp/Interceptor$Chain;", "chain", "Lcom/squareup/okhttp/Response;", "intercept", "<init>", "()V", "a", "Companion", "esim_release"}, k = 1, mv = {1, 5, 1})
    public static final class RetryingOkHttpInterceptor implements Interceptor {

        @NotNull
        private static final String b = "RetryingOkHttpInterceptor";
        private static final int c = 3;
        private static final int d = 10;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function0<String> {
            public final /* synthetic */ Ref.IntRef a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Ref.IntRef intRef) {
                super(0);
                this.a = intRef;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return "intercept : retry interval " + this.a.element + " s";
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class b extends Lambda implements Function0<String> {
            public final /* synthetic */ Ref.IntRef a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(Ref.IntRef intRef) {
                super(0);
                this.a = intRef;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return Intrinsics.stringPlus("intercept : retry attempt #", Integer.valueOf(this.a.element));
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class c extends Lambda implements Function0<String> {
            public final /* synthetic */ Ref.ObjectRef<Response> a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(Ref.ObjectRef<Response> objectRef) {
                super(0);
                this.a = objectRef;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return Intrinsics.stringPlus("intercept : response code ", Integer.valueOf(this.a.element.code()));
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class d extends Lambda implements Function0<String> {
            public final /* synthetic */ Ref.IntRef a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(Ref.IntRef intRef) {
                super(0);
                this.a = intRef;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return Intrinsics.stringPlus("retryNum:", Integer.valueOf(this.a.element));
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class e extends Lambda implements Function0<String> {
            public final /* synthetic */ Ref.IntRef a;
            public final /* synthetic */ Exception b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public e(Ref.IntRef intRef, Exception exc) {
                super(0);
                this.a = intRef;
                this.b = exc;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return "intercept retry: " + this.a.element + ", Exception: " + ((Object) this.b.getMessage());
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v21, types: [T, com.squareup.okhttp.Response] */
        /* JADX WARN: Type inference failed for: r0v9, types: [T, com.squareup.okhttp.Response] */
        @Override // com.squareup.okhttp.Interceptor
        @Nullable
        public Response intercept(@NotNull Interceptor.Chain chain) throws Exception {
            Ref.IntRef intRef = new Ref.IntRef();
            Ref.IntRef intRef2 = new Ref.IntRef();
            Request request = chain.request();
            Ref.ObjectRef objectRef = new Ref.ObjectRef();
            boolean zIsSuccessful = false;
            while (!zIsSuccessful) {
                try {
                    ?? Proceed = chain.proceed(request);
                    objectRef.element = Proceed;
                    zIsSuccessful = ((Response) Proceed).isSuccessful();
                    while (!zIsSuccessful) {
                        int i = intRef.element;
                        if (i >= 3) {
                            break;
                        }
                        intRef2.element = (int) (((double) 10) * Math.pow(2.0d, i));
                        HMLog.info(b, new a(intRef2));
                        try {
                            Thread.sleep(intRef2.element * 1000);
                            HMLog.info(b, new b(intRef));
                            objectRef.element = chain.proceed(chain.request());
                            HMLog.info(b, new c(objectRef));
                            zIsSuccessful = ((Response) objectRef.element).isSuccessful();
                            intRef.element++;
                        } catch (InterruptedException e2) {
                            throw new IOException(e2);
                        }
                    }
                    if (intRef.element >= 3) {
                        break;
                    }
                } catch (Exception e3) {
                    HMLog.info(b, new d(intRef));
                    int i2 = intRef.element;
                    if (i2 >= 3) {
                        throw e3;
                    }
                    intRef2.element = (int) (((double) 10) * Math.pow(2.0d, i2));
                    HMLog.info(b, new e(intRef, e3));
                    try {
                        Thread.sleep(intRef2.element * 1000);
                        intRef.element++;
                    } catch (InterruptedException e4) {
                        throw new IOException(e4);
                    }
                }
            }
            return (Response) objectRef.element;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\r\u0010\u000eJ%\u0010\b\u001a\u00020\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0017¢\u0006\u0004\b\b\u0010\tJ%\u0010\n\u001a\u00020\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0017¢\u0006\u0004\b\n\u0010\tJ\u0015\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\u000f"}, d2 = {"com/huami/watch/companion/esim/AbsEsimOperation$a", "Ljavax/net/ssl/X509TrustManager;", "", "Ljava/security/cert/X509Certificate;", "chain", "", "authType", "", "checkClientTrusted", "([Ljava/security/cert/X509Certificate;Ljava/lang/String;)V", "checkServerTrusted", "getAcceptedIssuers", "()[Ljava/security/cert/X509Certificate;", "<init>", "()V", "esim_release"}, k = 1, mv = {1, 5, 1})
    public static final class a implements X509TrustManager {
        @Override // javax.net.ssl.X509TrustManager
        @SuppressLint({"TrustAllX509TrustManager"})
        public void checkClientTrusted(@NotNull X509Certificate[] chain, @NotNull String authType) throws CertificateException {
        }

        @Override // javax.net.ssl.X509TrustManager
        @SuppressLint({"TrustAllX509TrustManager"})
        public void checkServerTrusted(@NotNull X509Certificate[] chain, @NotNull String authType) throws CertificateException {
        }

        @Override // javax.net.ssl.X509TrustManager
        @NotNull
        public X509Certificate[] getAcceptedIssuers() {
            return new X509Certificate[0];
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0017¨\u0006\n"}, d2 = {"com/huami/watch/companion/esim/AbsEsimOperation$b", "Ljavax/net/ssl/HostnameVerifier;", "", "hostname", "Ljavax/net/ssl/SSLSession;", com.google.firebase.crashlytics.internal.settings.b.c, "", "verify", "<init>", "()V", "esim_release"}, k = 1, mv = {1, 5, 1})
    public static final class b implements HostnameVerifier {
        @Override // javax.net.ssl.HostnameVerifier
        @SuppressLint({"BadHostnameVerifier"})
        public boolean verify(@NotNull String hostname, @NotNull SSLSession session) {
            return true;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<String> {
        public final /* synthetic */ String a;
        public final /* synthetic */ String b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, String str2) {
            super(0);
            this.a = str;
            this.b = str2;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "url:" + ((Object) this.a) + ", body:" + ((Object) this.b);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<String> {
        public final /* synthetic */ int a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(int i) {
            super(0);
            this.a = i;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return Intrinsics.stringPlus("responseCode:", Integer.valueOf(this.a));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function0<String> {
        public final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(String str) {
            super(0);
            this.a = str;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return Intrinsics.stringPlus("responseData:", this.a);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class f extends Lambda implements Function0<String> {
        public final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(String str) {
            super(0);
            this.a = str;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return Intrinsics.stringPlus(this.a, "  请求失败");
        }
    }

    private final SSLSocketFactory b() {
        try {
            SSLContext sSLContext = SSLContext.getInstance("TLS");
            sSLContext.init(null, new a[]{new a()}, new SecureRandom());
            return sSLContext.getSocketFactory();
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }

    private final Headers c() {
        Headers.Builder builder = new Headers.Builder();
        builder.add(HEADER_CONNECTION, "Keep-Alive");
        builder.add(HEADER_PROXY_CONNECTION, "Keep-Alive");
        return builder.build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(String str, URL url, AbsEsimOperation absEsimOperation, String str2) throws Throwable {
        Request requestBuild = new Request.Builder().post(RequestBody.create(MediaType.parse("application/json"), str)).url(url.toString()).headers(absEsimOperation.c()).build();
        try {
            OkHttpClient okHttpClient = absEsimOperation.mHttpClient;
            if (okHttpClient == null) {
                okHttpClient = null;
            }
            Response responseExecute = okHttpClient.newCall(requestBuild).execute();
            DataBundle dataBundle = new DataBundle();
            dataBundle.putString("type", TYPE_RECEIVE_RESPONSE);
            int iCode = responseExecute.code();
            HMLog.info(TAG, new d(iCode));
            if (responseExecute.isSuccessful()) {
                String strE = absEsimOperation.e(responseExecute.body());
                dataBundle.putString(KEY_RESPONSE_DATA, strE);
                HMLog.info(TAG, new e(strE));
            }
            dataBundle.putInt(KEY_RESPONSE_CODE, iCode);
            absEsimOperation.sendWithRetry(dataBundle, 0);
        } catch (Exception e2) {
            HMLog.error$default(TAG, null, e2, new f(str2), 2, null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0040  */
    /* JADX WARN: Code duplicated, block: B:26:0x0046  */
    private final String e(ResponseBody responseBody) throws Throwable {
        InputStream inputStreamByteStream;
        ByteArrayOutputStream byteArrayOutputStream;
        Throwable th;
        try {
            Ref.IntRef intRef = new Ref.IntRef();
            inputStreamByteStream = responseBody.byteStream();
            try {
                byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    byte[] bArr = new byte[4096];
                    while (true) {
                        int i = inputStreamByteStream.read(bArr);
                        intRef.element = i;
                        if (i == -1) {
                            String string = byteArrayOutputStream.toString("UTF-8");
                            responseBody.close();
                            inputStreamByteStream.close();
                            byteArrayOutputStream.close();
                            return string;
                        }
                        byteArrayOutputStream.write(bArr, 0, i);
                    }
                } catch (Throwable th2) {
                    th = th2;
                    responseBody.close();
                    if (inputStreamByteStream != null) {
                        inputStreamByteStream.close();
                    }
                    if (byteArrayOutputStream != null) {
                        byteArrayOutputStream.close();
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                byteArrayOutputStream = null;
                th = th;
                responseBody.close();
                if (inputStreamByteStream != null) {
                    inputStreamByteStream.close();
                }
                if (byteArrayOutputStream != null) {
                    byteArrayOutputStream.close();
                }
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            inputStreamByteStream = null;
            byteArrayOutputStream = null;
        }
    }

    public abstract void cancelDownloadProfile(boolean needResult);

    public abstract void continueDownloadProfile(@NotNull String ePin, boolean needResult);

    public abstract void deleteProfile(@NotNull String iccid);

    public abstract void getProfileList(boolean needSync);

    @Nullable
    public abstract SimResult getResult();

    public final void handlerHttpRequest(@NotNull DataBundle dataBundle) throws IOException {
        final String string = dataBundle.getString(KEY_REQUEST_URL);
        final String string2 = dataBundle.getString(KEY_REQUEST_BODY, "");
        final URL url = new URL(string);
        HMLog.info(TAG, new c(string, string2));
        Rx.io(new Runnable() { // from class: x
            @Override // java.lang.Runnable
            public final void run() throws Throwable {
                AbsEsimOperation.d(string2, url, this, string);
            }
        }).safeSubscribe();
    }

    public void init(@NotNull Context ctx) {
        OkHttpClient okHttpClient = new OkHttpClient();
        this.mHttpClient = okHttpClient;
        okHttpClient.setSslSocketFactory(b());
        OkHttpClient okHttpClient2 = this.mHttpClient;
        if (okHttpClient2 == null) {
            okHttpClient2 = null;
        }
        okHttpClient2.setHostnameVerifier(new b());
        OkHttpClient okHttpClient3 = this.mHttpClient;
        (okHttpClient3 != null ? okHttpClient3 : null).interceptors().add(new RetryingOkHttpInterceptor());
    }

    public abstract boolean isConnected(@NotNull Context ctx);

    public abstract void needInputPinCode(@NotNull String activationUrl, boolean needResult);

    public abstract void requestSimInfo();

    public abstract void sendNotification();

    public abstract void sendWithRetry(@NotNull DataBundle dataBundle, int currentTime);

    public abstract void setOperationCallback(@NotNull OperationCallBack callback);

    public abstract void setProfileName(@NotNull String iccid, @NotNull String name);

    public abstract void showQr();

    public abstract void startDownloadProfile(@NotNull String activationCode, @NotNull String carrierType, @Nullable String pinCode, boolean needResult);

    public abstract void startDownloadProfile(@NotNull String activationCode, @NotNull String carrierType, boolean needResult);

    public abstract void stop();

    @Nullable
    public abstract Boolean supportEPin();

    public abstract void switchProfileState(@NotNull String iccid, boolean enabled);
}
