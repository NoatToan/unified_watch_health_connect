package la2;

import android.content.Context;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f111670a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f111671b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Set<String> f111672c;

    public f(Context context, String str) {
        if (context == null) {
            vb.h.s("context is null");
            throw null;
        }
        if (str == null || str.isEmpty()) {
            vb.h.s("key is null or empty");
            throw null;
        }
        Context applicationContext = context.getApplicationContext();
        this.f111670a = applicationContext;
        this.f111671b = str;
        this.f111672c = applicationContext.getSharedPreferences("com.garmin.android.deviceinterface.prefs", 0).getStringSet(str, new HashSet());
    }
}
