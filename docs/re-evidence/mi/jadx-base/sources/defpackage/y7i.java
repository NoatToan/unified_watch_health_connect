package defpackage;

import android.os.Build;
import androidx.annotation.RequiresApi;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public class y7i implements kgi {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final List<String> f39894a = Arrays.asList("sunfish", "bramble", "redfin", "barbet");

    public static boolean a() {
        return "Google".equals(Build.MANUFACTURER) && f39894a.contains(Build.DEVICE.toLowerCase(Locale.getDefault()));
    }
}
