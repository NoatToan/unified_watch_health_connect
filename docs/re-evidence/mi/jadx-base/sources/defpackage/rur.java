package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.webkit.CookieManager;
import android.webkit.ValueCallback;
import androidx.annotation.RequiresApi;
import com.miui.tsmclient.common.net.NetConstants;
import java.io.IOException;
import java.net.CookieHandler;
import java.net.URI;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class rur extends CookieHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public CookieManager f32925a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Handler f32926b = new Handler(Looper.getMainLooper());

    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f32927a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f32928b;

        /* JADX INFO: renamed from: rur$a$a, reason: collision with other inner class name */
        public class C1100a implements ValueCallback<Boolean> {
            public C1100a() {
            }

            @Override // android.webkit.ValueCallback
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public void onReceiveValue(Boolean bool) {
            }
        }

        public a(String str, String str2) {
            this.f32927a = str;
            this.f32928b = str2;
        }

        @Override // java.lang.Runnable
        @RequiresApi(api = 21)
        public void run() {
            rur.this.f32925a.setCookie(this.f32927a, this.f32928b, new C1100a());
            rur.this.f32925a.flush();
        }
    }

    public static String c(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        StringBuilder sb = new StringBuilder(str.length());
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if (cCharAt > 31 && cCharAt < 127) {
                sb.append(cCharAt);
            }
        }
        return sb.toString();
    }

    public static boolean f(String str) {
        return "Set-cookie".equalsIgnoreCase(str) || "Set-cookie2".equalsIgnoreCase(str);
    }

    public final void b(String str, String str2) {
        if (this.f32925a == null) {
            return;
        }
        this.f32926b.post(new a(str, str2));
    }

    public String d(String str) {
        CookieManager cookieManagerE = e();
        return cookieManagerE == null ? "" : cookieManagerE.getCookie(str);
    }

    public final CookieManager e() {
        if (this.f32925a == null) {
            try {
                this.f32925a = CookieManager.getInstance();
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        return this.f32925a;
    }

    public void g(String str, List<String> list) {
        if (e() == null) {
            return;
        }
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            b(str, it.next());
        }
    }

    @Override // java.net.CookieHandler
    public Map<String, List<String>> get(URI uri, Map<String, List<String>> map) throws IOException {
        String strD = d(uri.toString());
        return TextUtils.isEmpty(strD) ? Collections.emptyMap() : Collections.singletonMap(NetConstants.COOKIE, Collections.singletonList(c(strD)));
    }

    @Override // java.net.CookieHandler
    public void put(URI uri, Map<String, List<String>> map) throws IOException {
        String string = uri.toString();
        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            String key = entry.getKey();
            if (key != null && f(key)) {
                g(string, entry.getValue());
            }
        }
    }
}
