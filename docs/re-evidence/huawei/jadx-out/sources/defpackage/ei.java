package defpackage;

import com.airbnb.lottie.LottieAnimationView;
import com.airbnb.lottie.LottieDrawable;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes21.dex */
public class ei {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<String, String> f33011a = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f33013c = true;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final LottieAnimationView f33012b = null;
    private final LottieDrawable e = null;

    public String e(String str) {
        return str;
    }

    ei() {
    }

    public String e(String str, String str2) {
        return e(str2);
    }

    public final String d(String str, String str2) {
        if (this.f33013c && this.f33011a.containsKey(str2)) {
            return this.f33011a.get(str2);
        }
        String strE = e(str, str2);
        if (this.f33013c) {
            this.f33011a.put(str2, strE);
        }
        return strE;
    }
}
