package defpackage;

import java.io.IOException;
import java.util.Collection;

/* JADX INFO: loaded from: classes4.dex */
public interface py6 {

    public interface a {
        String getId();

        long getSize();

        long getTimestamp();
    }

    public interface b {
        boolean a();

        ej2 b(Object obj) throws IOException;

        void c(gpr gprVar, Object obj) throws IOException;
    }

    long a(a aVar) throws IOException;

    b b(String str, Object obj) throws IOException;

    boolean c(String str, Object obj) throws IOException;

    void clearAll() throws IOException;

    void d();

    ej2 e(String str, Object obj) throws IOException;

    Collection<a> f() throws IOException;

    boolean isExternal();

    long remove(String str) throws IOException;
}
