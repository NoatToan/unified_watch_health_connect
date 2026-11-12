package m73;

import android.util.Log;
import java.util.logging.Level;
import l73.f;

/* JADX INFO: loaded from: classes3.dex */
public class a implements f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final boolean f117129b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f117130a;

    static {
        boolean z14;
        try {
            Class.forName("android.util.Log");
            z14 = true;
        } catch (ClassNotFoundException unused) {
            z14 = false;
        }
        f117129b = z14;
    }

    public a(String str) {
        this.f117130a = str;
    }

    public static int c(Level level) {
        int iIntValue = level.intValue();
        if (iIntValue < 800) {
            return iIntValue < 500 ? 2 : 3;
        }
        if (iIntValue < 900) {
            return 4;
        }
        return iIntValue < 1000 ? 5 : 6;
    }

    @Override // l73.f
    public final void a(Level level, String str, Throwable th3) {
        if (level != Level.OFF) {
            int iC = c(level);
            StringBuilder sbI = sn.a.i(str, "\n");
            sbI.append(Log.getStackTraceString(th3));
            Log.println(iC, this.f117130a, sbI.toString());
        }
    }

    @Override // l73.f
    public final void b(Level level, String str) {
        if (level != Level.OFF) {
            Log.println(c(level), this.f117130a, str);
        }
    }
}
