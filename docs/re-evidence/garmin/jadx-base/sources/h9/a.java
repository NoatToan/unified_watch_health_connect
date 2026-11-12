package h9;

import android.os.RemoteException;
import e9.b;
import java.io.IOException;
import k23.d;
import o13.p;
import p005kotlin.jvm.internal.s0;
import p005kotlin.jvm.internal.t0;
import p13.u0;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f82509a;

    static {
        t0 t0Var = s0.f105811a;
        f82509a = u0.e(new p(1, t0Var.b(UnsupportedOperationException.class)), new p(2, t0Var.b(UnsupportedOperationException.class)), new p(3, t0Var.b(UnsupportedOperationException.class)), new p(4, t0Var.b(SecurityException.class)), new p(10000, t0Var.b(SecurityException.class)), new p(10001, t0Var.b(SecurityException.class)), new p(10002, t0Var.b(IllegalArgumentException.class)), new p(Integer.valueOf(e9.a.PERMISSION_NOT_DECLARED), t0Var.b(SecurityException.class)), new p(Integer.valueOf(e9.a.INVALID_PERMISSION_RATIONALE_DECLARATION), t0Var.b(SecurityException.class)), new p(Integer.valueOf(e9.a.INVALID_UID), t0Var.b(RemoteException.class)), new p(Integer.valueOf(e9.a.DATABASE_ERROR), t0Var.b(IOException.class)), new p(Integer.valueOf(e9.a.INTERNAL_ERROR), t0Var.b(RemoteException.class)), new p(Integer.valueOf(e9.a.CHANGES_TOKEN_OUTDATED), t0Var.b(RemoteException.class)), new p(Integer.valueOf(e9.a.TRANSACTION_TOO_LARGE), t0Var.b(RemoteException.class)));
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.Map] */
    public static final Exception a(b bVar) {
        String str = bVar.f63478c;
        d dVar = (d) f82509a.get(Integer.valueOf(bVar.f63477b));
        if (dVar == null) {
            return new UnsupportedOperationException(str);
        }
        t0 t0Var = s0.f105811a;
        if (dVar.equals(t0Var.b(SecurityException.class))) {
            return new SecurityException(str);
        }
        if (dVar.equals(t0Var.b(RemoteException.class))) {
            return new RemoteException(str);
        }
        if (dVar.equals(t0Var.b(IllegalArgumentException.class))) {
            return new IllegalArgumentException(str);
        }
        return dVar.equals(t0Var.b(IOException.class)) ? new IOException(str) : new UnsupportedOperationException(str);
    }
}
