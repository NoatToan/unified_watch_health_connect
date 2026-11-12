package defpackage;

import android.os.Build;
import androidx.annotation.RequiresApi;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public class i3d implements kgi {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final List<String> f20736a = Arrays.asList("Pixel 2", "Pixel 2 XL", "Pixel 3", "Pixel 3 XL");

    public static boolean a() {
        return f20736a.contains(Build.MODEL) && "Google".equals(Build.MANUFACTURER);
    }
}
