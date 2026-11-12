package l73;

import java.util.logging.Level;

/* JADX INFO: loaded from: classes3.dex */
public interface f {

    public static class a implements f {
        @Override // l73.f
        public final void a(Level level, String str, Throwable th3) {
            System.out.println("[" + level + "] " + str);
            th3.printStackTrace(System.out);
        }

        @Override // l73.f
        public final void b(Level level, String str) {
            System.out.println("[" + level + "] " + str);
        }
    }

    void a(Level level, String str, Throwable th3);

    void b(Level level, String str);
}
