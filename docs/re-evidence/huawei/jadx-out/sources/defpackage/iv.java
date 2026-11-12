package defpackage;

import android.util.Log;
import com.airbnb.lottie.LottieLogger;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes21.dex */
public class iv implements LottieLogger {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Set<String> f38062b = new HashSet();

    @Override // com.airbnb.lottie.LottieLogger
    public void debug(String str) {
        debug(str, null);
    }

    @Override // com.airbnb.lottie.LottieLogger
    public void debug(String str, Throwable th) {
        if (cv.f31374b) {
            Log.d("LOTTIE", str, th);
        }
    }

    @Override // com.airbnb.lottie.LottieLogger
    public void warning(String str) {
        warning(str, null);
    }

    @Override // com.airbnb.lottie.LottieLogger
    public void warning(String str, Throwable th) {
        Set<String> set = f38062b;
        if (set.contains(str)) {
            return;
        }
        Log.w("LOTTIE", str, th);
        set.add(str);
    }

    @Override // com.airbnb.lottie.LottieLogger
    public void error(String str, Throwable th) {
        if (cv.f31374b) {
            Log.d("LOTTIE", str, th);
        }
    }
}
