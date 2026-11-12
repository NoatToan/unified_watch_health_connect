package k7;

import ch.qos.logback.core.CoreConstants;
import com.google.maps.android.BuildConfig;

/* JADX INFO: loaded from: classes.dex */
public class c {
    private c() {
    }

    public static void a(StringBuilder sb3, Object obj) {
        int iLastIndexOf;
        if (obj == null) {
            sb3.append(BuildConfig.TRAVIS);
            return;
        }
        String simpleName = obj.getClass().getSimpleName();
        if (simpleName.length() <= 0 && (iLastIndexOf = (simpleName = obj.getClass().getName()).lastIndexOf(46)) > 0) {
            simpleName = simpleName.substring(iLastIndexOf + 1);
        }
        sb3.append(simpleName);
        sb3.append(CoreConstants.CURLY_LEFT);
        sb3.append(Integer.toHexString(System.identityHashCode(obj)));
    }
}
