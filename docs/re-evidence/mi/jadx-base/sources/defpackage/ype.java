package defpackage;

import android.util.Log;
import java.io.PrintStream;
import java.util.logging.Level;

/* JADX INFO: loaded from: classes3.dex */
public interface ype {

    public static class a implements ype {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final boolean f40397b;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f40398a;

        static {
            boolean z;
            try {
                Class.forName("android.util.Log");
                z = true;
            } catch (ClassNotFoundException unused) {
                z = false;
            }
            f40397b = z;
        }

        public a(String str) {
            this.f40398a = str;
        }

        public static boolean c() {
            return f40397b;
        }

        @Override // defpackage.ype
        public void a(Level level, String str) {
            if (level != Level.OFF) {
                Log.println(d(level), this.f40398a, str);
            }
        }

        @Override // defpackage.ype
        public void b(Level level, String str, Throwable th) {
            if (level != Level.OFF) {
                Log.println(d(level), this.f40398a, str + "\n" + Log.getStackTraceString(th));
            }
        }

        public int d(Level level) {
            int iIntValue = level.intValue();
            if (iIntValue < 800) {
                return iIntValue < 500 ? 2 : 3;
            }
            if (iIntValue < 900) {
                return 4;
            }
            return iIntValue < 1000 ? 5 : 6;
        }
    }

    public static class b implements ype {
        @Override // defpackage.ype
        public void a(Level level, String str) {
            System.out.println("[" + level + "] " + str);
        }

        @Override // defpackage.ype
        public void b(Level level, String str, Throwable th) {
            PrintStream printStream = System.out;
            printStream.println("[" + level + "] " + str);
            th.printStackTrace(printStream);
        }
    }

    void a(Level level, String str);

    void b(Level level, String str, Throwable th);
}
