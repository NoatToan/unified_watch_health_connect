package defpackage;

import android.os.Build;
import android.text.TextUtils;
import com.miui.tsmclient.net.TSMAuthContants;
import com.xiaomi.accountsdk.account.data.DevInfoKeys;
import com.xiaomi.fitness.yrn_config.YRNConstants;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ExecutionException;

/* JADX INFO: loaded from: classes6.dex */
public class w3r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f37520a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f37521b;
    public Map<String, Object> c;
    public Map<String, String> d;

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f37522a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f37523b;
        public Map<String, Object> c = new HashMap();
        public Map<String, String> d = new HashMap();

        public b a(String str, Object obj) {
            this.c.put(str, obj);
            return this;
        }

        public w3r b() {
            z5i.c(!TextUtils.isEmpty(this.f37522a), "host cannot be null");
            z5i.c(!TextUtils.isEmpty(this.f37523b), "path cannot be null");
            w3r w3rVar = new w3r();
            w3rVar.f37520a = this.f37522a;
            w3rVar.f37521b = this.f37523b;
            w3rVar.c = this.c;
            w3rVar.d = this.d;
            return w3rVar;
        }

        public b c(String str) {
            this.f37522a = str;
            return this;
        }

        public b d(String str, String str2) throws ExecutionException, InterruptedException {
            z5i.b(str, "cplc cannot be null");
            z5i.b(str2, "seid cannot be null");
            qvf.b();
            this.d.put("authenticationType", String.valueOf(qvf.z ? 2 : 1));
            this.d.put("token", qvf.x);
            this.d.put("id", qvf.z ? qvf.f31886r : qvf.q);
            this.c.put("cplc", str);
            fpe.f("cplc:" + str);
            this.c.put(TSMAuthContants.PARAM_SEID, str2);
            String str3 = qvf.v;
            fpe.f("deviceAppId:" + str3);
            String strA = j2m.a(str2);
            fpe.f("paymentAppData:" + strA);
            String strA2 = w12.a(strA);
            fpe.f("paymentAppInstanceId:" + qvf.B + strA2);
            this.c.put("paymentAppInstanceId", qvf.B + strA2);
            this.c.put("deviceModel", qvf.u);
            this.c.put("deviceId", qvf.t);
            this.c.put(DevInfoKeys.OS_VERSION, Build.VERSION.RELEASE);
            this.c.put("appVersion", li1.a());
            this.c.put("packageName", str3);
            this.c.put("sdkVersion", 43);
            this.c.put("osType", YRNConstants.PLATFORM);
            this.c.put("userId", qvf.y);
            this.c.put(TSMAuthContants.PARAM_LANGUAGE, Locale.getDefault().getLanguage());
            this.c.put("requestId", fuh.a());
            this.c.put("country", qvf.A);
            this.c.put("deviceType", Integer.valueOf(qvf.w));
            return this;
        }

        public b e(String str) {
            this.f37523b = str;
            return this;
        }
    }

    public Map<String, String> e() {
        return this.d;
    }

    public Map<String, Object> f() {
        return this.c;
    }

    public String g() {
        return this.f37520a + this.f37521b;
    }

    public w3r() {
    }
}
