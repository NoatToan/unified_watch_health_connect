package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.ConditionVariable;
import android.text.TextUtils;
import androidx.media3.common.C;
import com.alipay.apmobilesecuritysdk.face.APSecuritySdk;
import defpackage.km;
import java.util.HashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
public class pd {

    public class a implements com.alipay.sdk.m.z.a.InterfaceC0023a<Object, Boolean> {
        @Override // com.alipay.sdk.m.z.a.InterfaceC0023a
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public Boolean a(Object obj) {
            return Boolean.valueOf((obj instanceof String) || obj == null);
        }
    }

    public class b implements Callable<String> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ on f45182c;
        public final /* synthetic */ Context d;

        public b(Context context, on onVar) {
            this.d = context;
            this.f45182c = onVar;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public String call() {
            try {
                return no.a(this.d);
            } catch (Throwable th) {
                mu.e(this.f45182c, "third", "GetUtdidEx", th.getClass().getName());
                return "";
            }
        }
    }

    public class c implements com.alipay.sdk.m.z.a.InterfaceC0023a<Object, Boolean> {
        @Override // com.alipay.sdk.m.z.a.InterfaceC0023a
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public Boolean a(Object obj) {
            return Boolean.valueOf((obj instanceof String) || obj == null);
        }
    }

    public class d implements com.alipay.sdk.m.z.a.InterfaceC0023a<Object, Boolean> {
        @Override // com.alipay.sdk.m.z.a.InterfaceC0023a
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public Boolean a(Object obj) {
            return Boolean.valueOf((obj instanceof NetworkInfo) || obj == null);
        }
    }

    public class e implements com.alipay.sdk.m.z.a.InterfaceC0023a<Object, Boolean> {
        @Override // com.alipay.sdk.m.z.a.InterfaceC0023a
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public Boolean a(Object obj) {
            return Boolean.valueOf((obj instanceof String) || obj == null);
        }
    }

    public class h implements Callable<String> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f45183a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f45184b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ on f45185c;
        public final /* synthetic */ Context d;

        public class c implements APSecuritySdk.InitResultListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ String[] f45186a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ConditionVariable f45187b;

            public c(String[] strArr, ConditionVariable conditionVariable) {
                this.f45186a = strArr;
                this.f45187b = conditionVariable;
            }

            @Override // com.alipay.apmobilesecuritysdk.face.APSecuritySdk.InitResultListener
            public void onResult(APSecuritySdk.TokenResult tokenResult) {
                if (tokenResult != null) {
                    this.f45186a[0] = tokenResult.apdidToken;
                }
                this.f45187b.open();
            }
        }

        public h(String str, String str2, Context context, on onVar) {
            this.f45183a = str;
            this.f45184b = str2;
            this.d = context;
            this.f45185c = onVar;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public String call() {
            HashMap map = new HashMap();
            map.put("tid", this.f45183a);
            map.put("utdid", this.f45184b);
            String[] strArr = {""};
            try {
                APSecuritySdk aPSecuritySdk = APSecuritySdk.getInstance(this.d);
                ConditionVariable conditionVariable = new ConditionVariable();
                aPSecuritySdk.initToken(0, map, new c(strArr, conditionVariable));
                conditionVariable.block(C.DEFAULT_MAX_SEEK_TO_PREVIOUS_POSITION_MS);
            } catch (Throwable th) {
                oq.c(th);
                mu.e(this.f45185c, "third", "GetApdidEx", th.getClass().getName());
            }
            if (TextUtils.isEmpty(strArr[0])) {
                mu.e(this.f45185c, "third", "GetApdidNull", "missing token");
            }
            return strArr[0];
        }
    }

    public static NetworkInfo b(on onVar, Context context) {
        final Context contextA = com.alipay.sdk.m.z.a.a(context);
        TimeUnit timeUnit = TimeUnit.SECONDS;
        return (NetworkInfo) com.alipay.sdk.m.z.a.a(2, 10L, timeUnit, new d(), new Callable<NetworkInfo>() { // from class: com.alipay.sdk.m.z.b$d
            @Override // java.util.concurrent.Callable
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public NetworkInfo call() {
                return ((ConnectivityManager) contextA.getApplicationContext().getSystemService("connectivity")).getActiveNetworkInfo();
            }
        }, false, 10L, timeUnit, onVar, false);
    }

    public static String c(on onVar, Context context) {
        return (String) com.alipay.sdk.m.z.a.a(3, 1L, TimeUnit.DAYS, new a(), new b(com.alipay.sdk.m.z.a.a(context), onVar), true, 3L, TimeUnit.SECONDS, onVar, false);
    }

    public static String e(on onVar, Context context) {
        if (!mx.c().ac()) {
            return "";
        }
        final Context contextA = com.alipay.sdk.m.z.a.a(context);
        return (String) com.alipay.sdk.m.z.a.a(1, 1L, TimeUnit.DAYS, new e(), new Callable<String>() { // from class: com.alipay.sdk.m.z.b$b
            @Override // java.util.concurrent.Callable
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public String call() {
                return km.d(contextA);
            }
        }, true, 200L, TimeUnit.MILLISECONDS, onVar, true);
    }

    public static String b(on onVar, Context context, String str, String str2) {
        Context contextA = com.alipay.sdk.m.z.a.a(context);
        TimeUnit timeUnit = TimeUnit.SECONDS;
        return (String) com.alipay.sdk.m.z.a.a(4, 10L, timeUnit, new c(), new h(str, str2, contextA, onVar), true, 3L, timeUnit, onVar, true);
    }
}
