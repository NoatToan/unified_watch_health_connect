package defpackage;

import android.os.Build;
import androidx.annotation.RequiresApi;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public class qlg implements kgi {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final List<String> f31634a = Arrays.asList("NEXUS 4");

    public static boolean b() {
        "GOOGLE".equalsIgnoreCase(Build.BRAND);
        return false;
    }

    public int a() {
        return 2;
    }
}
