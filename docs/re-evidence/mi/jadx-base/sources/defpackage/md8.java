package defpackage;

import android.os.Looper;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes3.dex */
public class md8 {
    public static final ExecutorService m = Executors.newCachedThreadPool();
    public boolean e;
    public boolean g;
    public boolean h;
    public List<coo> j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public ype f26034k;
    public b2f l;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f26032a = true;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f26033b = true;
    public boolean c = true;
    public boolean d = true;
    public boolean f = true;
    public ExecutorService i = m;

    public Object a() {
        try {
            return Looper.getMainLooper();
        } catch (RuntimeException unused) {
            return null;
        }
    }

    public ype b() {
        ype ypeVar = this.f26034k;
        if (ypeVar != null) {
            return ypeVar;
        }
        return (!ype.a.c() || a() == null) ? new ype.b() : new ype.a("EventBus");
    }

    public b2f c() {
        Object objA;
        b2f b2fVar = this.l;
        if (b2fVar != null) {
            return b2fVar;
        }
        if (!ype.a.c() || (objA = a()) == null) {
            return null;
        }
        return new b2f.a((Looper) objA);
    }
}
