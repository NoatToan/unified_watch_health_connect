package com.airbnb.lottie;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.core.os.TraceCompat;
import com.airbnb.lottie.network.DefaultLottieNetworkFetcher;
import com.airbnb.lottie.network.LottieNetworkCacheProvider;
import com.airbnb.lottie.network.LottieNetworkFetcher;
import com.airbnb.lottie.network.NetworkCache;
import com.airbnb.lottie.network.NetworkFetcher;
import java.io.File;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public class L {
    public static boolean DBG = false;
    public static final String TAG = "LOTTIE";
    private static final int a = 20;
    private static boolean b = false;
    private static String[] c;
    private static long[] d;
    private static int e;
    private static int f;
    private static LottieNetworkFetcher g;
    private static LottieNetworkCacheProvider h;
    private static volatile NetworkFetcher i;
    private static volatile NetworkCache j;

    public class a implements LottieNetworkCacheProvider {
        public final /* synthetic */ Context a;

        public a(Context context) {
            this.a = context;
        }

        @Override // com.airbnb.lottie.network.LottieNetworkCacheProvider
        @NonNull
        public File getCacheDir() {
            return new File(this.a.getCacheDir(), "lottie_network_cache");
        }
    }

    private L() {
    }

    public static void beginSection(String str) {
        if (b) {
            int i2 = e;
            if (i2 == 20) {
                f++;
                return;
            }
            c[i2] = str;
            d[i2] = System.nanoTime();
            TraceCompat.beginSection(str);
            e++;
        }
    }

    public static float endSection(String str) {
        int i2 = f;
        if (i2 > 0) {
            f = i2 - 1;
            return 0.0f;
        }
        if (!b) {
            return 0.0f;
        }
        int i3 = e - 1;
        e = i3;
        if (i3 == -1) {
            throw new IllegalStateException("Can't end trace section. There are none.");
        }
        if (str.equals(c[i3])) {
            TraceCompat.endSection();
            return (System.nanoTime() - d[e]) / 1000000.0f;
        }
        throw new IllegalStateException("Unbalanced trace call " + str + ". Expected " + c[e] + ".");
    }

    @NonNull
    public static NetworkCache networkCache(@NonNull Context context) {
        Context applicationContext = context.getApplicationContext();
        NetworkCache networkCache = j;
        if (networkCache == null) {
            synchronized (NetworkCache.class) {
                networkCache = j;
                if (networkCache == null) {
                    LottieNetworkCacheProvider aVar = h;
                    if (aVar == null) {
                        aVar = new a(applicationContext);
                    }
                    networkCache = new NetworkCache(aVar);
                    j = networkCache;
                }
            }
        }
        return networkCache;
    }

    @NonNull
    public static NetworkFetcher networkFetcher(@NonNull Context context) {
        NetworkFetcher networkFetcher = i;
        if (networkFetcher == null) {
            synchronized (NetworkFetcher.class) {
                networkFetcher = i;
                if (networkFetcher == null) {
                    NetworkCache networkCache = networkCache(context);
                    LottieNetworkFetcher defaultLottieNetworkFetcher = g;
                    if (defaultLottieNetworkFetcher == null) {
                        defaultLottieNetworkFetcher = new DefaultLottieNetworkFetcher();
                    }
                    networkFetcher = new NetworkFetcher(networkCache, defaultLottieNetworkFetcher);
                    i = networkFetcher;
                }
            }
        }
        return networkFetcher;
    }

    public static void setCacheProvider(LottieNetworkCacheProvider lottieNetworkCacheProvider) {
        h = lottieNetworkCacheProvider;
    }

    public static void setFetcher(LottieNetworkFetcher lottieNetworkFetcher) {
        g = lottieNetworkFetcher;
    }

    public static void setTraceEnabled(boolean z) {
        if (b == z) {
            return;
        }
        b = z;
        if (z) {
            c = new String[20];
            d = new long[20];
        }
    }
}
