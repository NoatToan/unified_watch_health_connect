package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.xiaomi.fitness.login.region.RegionManagerImpl;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class wqk {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile wqk f38259b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Map<String, Integer> f38260a = new HashMap();

    public static wqk b() {
        if (f38259b == null) {
            synchronized (wqk.class) {
                try {
                    if (f38259b == null) {
                        f38259b = new wqk();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f38259b;
    }

    public synchronized void a() {
        this.f38260a.clear();
    }

    public Drawable c(Context context, String str) {
        int iD = d(context, str);
        if (iD > 0) {
            return context.getResources().getDrawable(iD);
        }
        return null;
    }

    public int d(Context context, String str) {
        if (str == null || str.isEmpty()) {
            return 0;
        }
        String strReplace = str.toLowerCase().replace("-", RegionManagerImpl.LOCALE_REPORTED_SERVER_SEPARATOR);
        try {
            return Integer.parseInt(strReplace);
        } catch (NumberFormatException unused) {
            synchronized (this) {
                try {
                    if (this.f38260a.containsKey(strReplace)) {
                        return this.f38260a.get(strReplace).intValue();
                    }
                    int identifier = context.getResources().getIdentifier(strReplace, "drawable", context.getPackageName());
                    this.f38260a.put(strReplace, Integer.valueOf(identifier));
                    return identifier;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public Uri e(Context context, String str) {
        int iD = d(context, str);
        return iD > 0 ? new Uri.Builder().scheme("res").path(String.valueOf(iD)).build() : Uri.EMPTY;
    }
}
