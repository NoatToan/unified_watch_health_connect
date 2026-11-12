package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class qf8 {
    public static RuntimeException a(Throwable th) {
        throw jf8.d(th);
    }

    public static void b(Throwable th) {
        if (th instanceof VirtualMachineError) {
            throw ((VirtualMachineError) th);
        }
        if (th instanceof ThreadDeath) {
            throw ((ThreadDeath) th);
        }
        if (th instanceof LinkageError) {
            throw ((LinkageError) th);
        }
    }
}
