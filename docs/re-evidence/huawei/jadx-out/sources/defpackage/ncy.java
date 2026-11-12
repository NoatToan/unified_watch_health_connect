package defpackage;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes11.dex */
public class ncy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static ncy f42903a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Object f42904b = new Object();
    private static int d;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ncy f42905c;
    private ByteBuffer e;

    private ncy(int i) {
        this.e = ByteBuffer.allocate(i);
    }

    public ByteBuffer a() {
        return this.e;
    }

    public static ncy c(int i) {
        synchronized (f42904b) {
            ncy ncyVar = f42903a;
            if (ncyVar != null) {
                f42903a = ncyVar.f42905c;
                ncyVar.f42905c = null;
                d--;
                if (ncyVar.e.capacity() != i) {
                    ncyVar.e = ByteBuffer.allocate(i);
                }
                return ncyVar;
            }
            return new ncy(i);
        }
    }

    public void d() {
        this.e.clear();
        synchronized (f42904b) {
            int i = d;
            if (i < 1) {
                this.f42905c = f42903a;
                f42903a = this;
                d = i + 1;
            }
        }
    }
}
