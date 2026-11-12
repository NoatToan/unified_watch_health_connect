package defpackage;

import android.os.Build;
import androidx.annotation.RequiresApi;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public final class rrd implements d4n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Set<String> f32824a = new HashSet(Arrays.asList("heroqltevzw", "heroqltetmo"));

    public static boolean a(vf3 vf3Var) {
        return f32824a.contains(Build.DEVICE.toLowerCase(Locale.US));
    }
}
