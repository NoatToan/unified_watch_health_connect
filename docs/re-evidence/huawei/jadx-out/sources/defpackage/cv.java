package defpackage;

import android.content.Context;
import com.airbnb.lottie.AsyncUpdates;
import com.airbnb.lottie.network.LottieNetworkCacheProvider;
import com.airbnb.lottie.network.LottieNetworkFetcher;
import defpackage.cv;
import java.io.File;

/* JADX INFO: loaded from: classes4.dex */
public class cv {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static LottieNetworkFetcher f31373a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static boolean f31374b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static boolean f31375c = true;
    private static AsyncUpdates d = AsyncUpdates.AUTOMATIC;
    private static LottieNetworkCacheProvider e = null;
    private static volatile hg f = null;
    private static boolean g = true;
    private static ThreadLocal<iz> h = null;
    private static volatile hf i = null;
    private static boolean j = false;

    public static boolean e() {
        return j;
    }

    public static void c(String str) {
        if (j) {
            b().a(str);
        }
    }

    public static float e(String str) {
        if (j) {
            return b().e(str);
        }
        return 0.0f;
    }

    private static iz b() {
        iz izVar = h.get();
        if (izVar != null) {
            return izVar;
        }
        iz izVar2 = new iz();
        h.set(izVar2);
        return izVar2;
    }

    public static hf b(Context context) {
        hf hfVar;
        hf hfVar2 = i;
        if (hfVar2 != null) {
            return hfVar2;
        }
        synchronized (hf.class) {
            hfVar = i;
            if (hfVar == null) {
                hg hgVarA = a(context);
                LottieNetworkFetcher hbVar = f31373a;
                if (hbVar == null) {
                    hbVar = new hb();
                }
                hfVar = new hf(hgVarA, hbVar);
                i = hfVar;
            }
        }
        return hfVar;
    }

    public static hg a(Context context) {
        hg hgVar;
        if (!g) {
            return null;
        }
        final Context applicationContext = context.getApplicationContext();
        hg hgVar2 = f;
        if (hgVar2 != null) {
            return hgVar2;
        }
        synchronized (hg.class) {
            hgVar = f;
            if (hgVar == null) {
                LottieNetworkCacheProvider lottieNetworkCacheProvider = e;
                if (lottieNetworkCacheProvider == null) {
                    lottieNetworkCacheProvider = new LottieNetworkCacheProvider() { // from class: com.airbnb.lottie.L$$ExternalSyntheticLambda0
                        @Override // com.airbnb.lottie.network.LottieNetworkCacheProvider
                        public final File getCacheDir() {
                            return cv.e(applicationContext);
                        }
                    };
                }
                hgVar = new hg(lottieNetworkCacheProvider);
                f = hgVar;
            }
        }
        return hgVar;
    }

    public static /* synthetic */ File e(Context context) {
        return new File(context.getCacheDir(), "lottie_network_cache");
    }

    public static boolean c() {
        return f31375c;
    }

    public static AsyncUpdates a() {
        return d;
    }
}
