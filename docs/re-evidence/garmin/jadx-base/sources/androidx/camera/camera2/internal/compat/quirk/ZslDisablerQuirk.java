package androidx.camera.camera2.internal.compat.quirk;

import android.os.Build;
import androidx.camera.core.impl.e2;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public class ZslDisablerQuirk implements e2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final List<String> f5407a = Arrays.asList("SM-F936", "SM-S901U", "SM-S908U", "SM-S908U1", "SM-F721U1", "SM-S928U1");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final List<String> f5408b = Arrays.asList("MI 8");

    public static boolean f(List<String> list) {
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            if (Build.MODEL.toUpperCase(Locale.US).startsWith(it.next())) {
                return true;
            }
        }
        return false;
    }
}
