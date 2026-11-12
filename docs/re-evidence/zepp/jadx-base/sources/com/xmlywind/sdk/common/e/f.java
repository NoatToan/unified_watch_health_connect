package com.xmlywind.sdk.common.e;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Looper;
import android.util.LruCache;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.xmlywind.sdk.common.Constants;
import com.xmlywind.sdk.common.SDKConfig;
import com.xmlywind.sdk.common.utils.DeviceUtils;
import java.util.HashSet;

/* JADX INFO: loaded from: classes22.dex */
public class f {
    private static volatile l b;
    private static volatile l c;
    private static volatile l d;
    private static volatile l e;
    private static volatile String f;
    private static volatile e g;
    private static com.xmlywind.volley.toolbox.j.b i;
    private static l k;
    private static final String a = System.getProperty("http.agent");
    private static boolean h = false;
    private static volatile com.xmlywind.volley.b j = null;
    private static HashSet l = new HashSet();

    public static l a() {
        return b;
    }

    public static void a(Context context) {
        a(SDKConfig.getConfigUrl());
        a(SDKConfig.sharedInstance().getAdsUrl());
        a(SDKConfig.sharedInstance().getHbAdsUrl());
        a(SDKConfig.sharedInstance().getLogUrl());
        a(SDKConfig.sharedInstance().getStrategyUrl());
        i(context);
        b(context);
        c(context);
        d(context);
        e(context);
        f(context);
    }

    public static void a(String str) {
        l.add(str);
    }

    public static l b(Context context) {
        l lVar = d;
        if (lVar == null) {
            synchronized (f.class) {
                lVar = d;
                if (lVar == null) {
                    lVar = new l(new com.xmlywind.volley.toolbox.b(new h(j(context.getApplicationContext()), h(context), Constants.IS_TEST.booleanValue() ? b.a() : b.a(10000))), 1);
                    d = lVar;
                    lVar.b();
                }
            }
        }
        return lVar;
    }

    public static com.xmlywind.volley.toolbox.k b() {
        return g;
    }

    public static l c(Context context) {
        l lVar = c;
        if (lVar == null) {
            synchronized (f.class) {
                lVar = c;
                if (lVar == null) {
                    lVar = new l(new com.xmlywind.volley.toolbox.e(new h(j(context.getApplicationContext()), h(context), Constants.IS_TEST.booleanValue() ? b.a() : b.a(10000))), 4);
                    c = lVar;
                    lVar.b();
                }
            }
        }
        return lVar;
    }

    public static String c() {
        return f;
    }

    public static l d() {
        return c;
    }

    public static l d(Context context) {
        l lVar = e;
        if (lVar == null) {
            synchronized (f.class) {
                lVar = e;
                if (lVar == null) {
                    com.xmlywind.volley.toolbox.b bVar = new com.xmlywind.volley.toolbox.b(new h(j(context.getApplicationContext()), h(context), Constants.IS_TEST.booleanValue() ? b.a() : b.a(10000)));
                    if (j == null) {
                        g(context);
                    }
                    l lVar2 = new l(bVar, 2);
                    e = lVar2;
                    lVar2.b();
                    lVar = lVar2;
                }
            }
        }
        return lVar;
    }

    public static l e() {
        return k;
    }

    public static l e(Context context) {
        l lVar = k;
        if (lVar == null) {
            synchronized (f.class) {
                lVar = k;
                if (lVar == null) {
                    lVar = new l(new com.xmlywind.volley.toolbox.e(new h(j(context.getApplicationContext()), h(context), Constants.IS_TEST.booleanValue() ? b.a() : b.a(10000))), 2);
                    k = lVar;
                    lVar.b();
                }
            }
        }
        return lVar;
    }

    public static l f() {
        return d;
    }

    public static com.xmlywind.volley.toolbox.k f(Context context) {
        e eVar = g;
        if (eVar == null) {
            synchronized (f.class) {
                eVar = g;
                if (eVar == null) {
                    l lVarA = a();
                    final LruCache<String, Bitmap> lruCache = new LruCache<String, Bitmap>(DeviceUtils.a(context)) { // from class: com.xmlywind.sdk.common.e.f.1
                        @Override // android.util.LruCache
                        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                        public int sizeOf(String str, Bitmap bitmap) {
                            return bitmap != null ? bitmap.getRowBytes() * bitmap.getHeight() : super.sizeOf(str, null);
                        }
                    };
                    e eVar2 = new e(lVarA, context, new com.xmlywind.volley.toolbox.k.b() { // from class: com.xmlywind.sdk.common.e.f.2
                        @Override // com.xmlywind.volley.toolbox.k.b
                        public Bitmap a(String str) {
                            return (Bitmap) lruCache.get(str);
                        }

                        @Override // com.xmlywind.volley.toolbox.k.b
                        public void a(String str, Bitmap bitmap) {
                            lruCache.put(str, bitmap);
                        }
                    });
                    g = eVar2;
                    eVar = eVar2;
                }
            }
        }
        return eVar;
    }

    public static l g() {
        return e;
    }

    private static com.xmlywind.volley.b g(Context context) {
        if (j == null) {
            j = new com.xmlywind.volley.toolbox.m();
        }
        return j;
    }

    private static com.xmlywind.volley.toolbox.j.b h(Context context) {
        if (i == null) {
            i = new g();
        }
        return i;
    }

    public static String h() {
        return j() ? "https" : "http";
    }

    private static l i(Context context) {
        l lVar = b;
        if (lVar == null) {
            synchronized (f.class) {
                lVar = b;
                if (lVar == null) {
                    lVar = new l(new com.xmlywind.volley.toolbox.b(new h(j(context.getApplicationContext()), h(context), Constants.IS_TEST.booleanValue() ? b.a() : b.a(10000))), 2);
                    b = lVar;
                    lVar.b();
                }
            }
        }
        return lVar;
    }

    public static HashSet i() {
        return l;
    }

    private static String j(Context context) {
        String userAgentString;
        com.xmlywind.sdk.common.utils.m.a.a(context);
        String str = f;
        if (str == null) {
            synchronized (f.class) {
                str = f;
                if (str == null) {
                    try {
                        if (Build.VERSION.SDK_INT >= 17) {
                            userAgentString = WebSettings.getDefaultUserAgent(context);
                        } else {
                            userAgentString = Looper.myLooper() == Looper.getMainLooper() ? new WebView(context).getSettings().getUserAgentString() : a;
                        }
                    } catch (Throwable unused) {
                        userAgentString = a;
                    }
                    f = userAgentString;
                    str = userAgentString;
                }
            }
        }
        return str;
    }

    private static boolean j() {
        return h;
    }
}
