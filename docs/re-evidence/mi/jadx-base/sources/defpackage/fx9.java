package defpackage;

import android.os.Build;
import android.util.Pair;
import androidx.annotation.RequiresApi;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public class fx9 implements kgi {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Set<Pair<String, String>> f18343a = new HashSet(Arrays.asList(new Pair("sprd", "lemp")));

    public static boolean a() {
        Set<Pair<String, String>> set = f18343a;
        String str = Build.MANUFACTURER;
        Locale locale = Locale.US;
        return set.contains(new Pair(str.toLowerCase(locale), Build.MODEL.toLowerCase(locale)));
    }
}
