package t03;

/* JADX INFO: loaded from: classes3.dex */
public final class a {
    private a() {
        throw new IllegalStateException("No instances!");
    }

    public static void a(Throwable th3) {
        if (th3 instanceof VirtualMachineError) {
            throw ((VirtualMachineError) th3);
        }
        if (th3 instanceof ThreadDeath) {
            throw ((ThreadDeath) th3);
        }
        if (th3 instanceof LinkageError) {
            throw ((LinkageError) th3);
        }
    }
}
