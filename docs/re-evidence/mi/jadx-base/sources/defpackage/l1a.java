package defpackage;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import android.webkit.ValueCallback;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.GuardedAsyncTask;
import com.facebook.react.bridge.GuardedResultAsyncTask;
import com.facebook.react.bridge.ReactContext;
import com.miui.tsmclient.common.net.NetConstants;
import java.net.CookieHandler;
import java.net.URI;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class l1a extends CookieHandler {
    public static final boolean d = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f24505a = new e();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ReactContext f24506b;
    public CookieManager c;

    public class a extends GuardedResultAsyncTask<Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Callback f24507a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ReactContext reactContext, Callback callback) {
            super(reactContext);
            this.f24507a = callback;
        }

        @Override // com.facebook.react.bridge.GuardedResultAsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean doInBackgroundGuarded() throws Exception {
            CookieManager cookieManagerJ = l1a.this.j();
            if (cookieManagerJ != null) {
                cookieManagerJ.removeAllCookie();
            }
            l1a.this.f24505a.c();
            return Boolean.TRUE;
        }

        @Override // com.facebook.react.bridge.GuardedResultAsyncTask
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecuteGuarded(Boolean bool) {
            this.f24507a.invoke(bool);
        }
    }

    public class b implements ValueCallback<Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Callback f24509a;

        public b(Callback callback) {
            this.f24509a = callback;
        }

        @Override // android.webkit.ValueCallback
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onReceiveValue(Boolean bool) {
            l1a.this.f24505a.c();
            this.f24509a.invoke(bool);
        }
    }

    public class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ List f24511a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ CookieManager f24512b;
        public final /* synthetic */ String c;

        public c(List list, CookieManager cookieManager, String str) {
            this.f24511a = list;
            this.f24512b = cookieManager;
            this.c = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            Iterator it = this.f24511a.iterator();
            while (it.hasNext()) {
                this.f24512b.setCookie(this.c, (String) it.next());
            }
            l1a.this.f24505a.c();
        }
    }

    public class d extends GuardedAsyncTask<Void, Void> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Runnable f24513a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(ReactContext reactContext, Runnable runnable) {
            super(reactContext);
            this.f24513a = runnable;
        }

        @Override // com.facebook.react.bridge.GuardedAsyncTask
        public void doInBackgroundGuarded(Void... voidArr) {
            this.f24513a.run();
        }
    }

    public class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Handler f24515a;

        public class a implements Handler.Callback {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ l1a f24517a;

            public a(l1a l1aVar) {
                this.f24517a = l1aVar;
            }

            @Override // android.os.Handler.Callback
            public boolean handleMessage(Message message) {
                if (message.what != 1) {
                    return false;
                }
                e.this.d();
                return true;
            }
        }

        public class b implements Runnable {
            public b() {
            }

            @Override // java.lang.Runnable
            public void run() throws Exception {
                if (l1a.d) {
                    CookieSyncManager.getInstance().sync();
                } else {
                    e.this.b();
                }
            }
        }

        public e() {
            this.f24515a = new Handler(Looper.getMainLooper(), new a(l1a.this));
        }

        @TargetApi(21)
        public final void b() throws Exception {
            CookieManager cookieManagerJ = l1a.this.j();
            if (cookieManagerJ != null) {
                cookieManagerJ.flush();
            }
        }

        public void c() {
            if (l1a.d) {
                this.f24515a.sendEmptyMessageDelayed(1, 30000L);
            }
        }

        public void d() {
            this.f24515a.removeMessages(1);
            l1a.this.m(new b());
        }
    }

    public l1a(ReactContext reactContext) {
        this.f24506b = reactContext;
    }

    public static boolean k(String str) {
        return str.equalsIgnoreCase("Set-cookie") || str.equalsIgnoreCase("Set-cookie2");
    }

    public static void l(Context context) {
        if (d) {
            CookieSyncManager.createInstance(context).sync();
        }
    }

    @TargetApi(21)
    public final void e(String str, String str2) throws Exception {
        CookieManager cookieManagerJ = j();
        if (cookieManagerJ != null) {
            cookieManagerJ.setCookie(str, str2, null);
        }
    }

    public final void f(String str, List<String> list) throws Exception {
        CookieManager cookieManagerJ = j();
        if (cookieManagerJ == null) {
            return;
        }
        if (d) {
            m(new c(list, cookieManagerJ, str));
            return;
        }
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            e(str, it.next());
        }
        cookieManagerJ.flush();
        this.f24505a.c();
    }

    public void g(Callback callback) throws Exception {
        if (d) {
            new a(this.f24506b, callback).execute(new Void[0]);
        } else {
            h(callback);
        }
    }

    @Override // java.net.CookieHandler
    public Map<String, List<String>> get(URI uri, Map<String, List<String>> map) throws Exception {
        CookieManager cookieManagerJ = j();
        if (cookieManagerJ == null) {
            return Collections.emptyMap();
        }
        String cookie = cookieManagerJ.getCookie(uri.toString());
        return TextUtils.isEmpty(cookie) ? Collections.emptyMap() : Collections.singletonMap(NetConstants.COOKIE, Collections.singletonList(cookie));
    }

    public final void h(Callback callback) throws Exception {
        CookieManager cookieManagerJ = j();
        if (cookieManagerJ != null) {
            cookieManagerJ.removeAllCookies(new b(callback));
        }
    }

    public void i() throws Exception {
        if (d) {
            CookieManager cookieManagerJ = j();
            if (cookieManagerJ != null) {
                cookieManagerJ.removeExpiredCookie();
            }
            this.f24505a.d();
        }
    }

    public final CookieManager j() throws Exception {
        if (this.c == null) {
            l(this.f24506b);
            try {
                CookieManager cookieManager = CookieManager.getInstance();
                this.c = cookieManager;
                if (d) {
                    cookieManager.removeExpiredCookie();
                }
            } catch (IllegalArgumentException unused) {
                return null;
            } catch (Exception e2) {
                String message = e2.getMessage();
                if (message == null || !message.contains("No WebView installed")) {
                    throw e2;
                }
                return null;
            }
        }
        return this.c;
    }

    public final void m(Runnable runnable) {
        new d(this.f24506b, runnable).execute(new Void[0]);
    }

    @Override // java.net.CookieHandler
    public void put(URI uri, Map<String, List<String>> map) throws Exception {
        String string = uri.toString();
        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            String key = entry.getKey();
            if (key != null && k(key)) {
                f(string, entry.getValue());
            }
        }
    }
}
