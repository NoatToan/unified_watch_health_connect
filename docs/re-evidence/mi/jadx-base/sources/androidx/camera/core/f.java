package androidx.camera.core;

import android.graphics.Rect;
import android.media.Image;
import androidx.annotation.GuardedBy;
import androidx.annotation.RequiresApi;
import defpackage.q4d;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public abstract class f implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @GuardedBy("this")
    public final m f1700a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @GuardedBy("this")
    public final Set<a> f1701b = new HashSet();

    public interface a {
        void f(m mVar);
    }

    public f(m mVar) {
        this.f1700a = mVar;
    }

    @Override // androidx.camera.core.m
    public synchronized q4d H() {
        return this.f1700a.H();
    }

    public void a() {
        HashSet hashSet;
        synchronized (this) {
            hashSet = new HashSet(this.f1701b);
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((a) it.next()).f(this);
        }
    }

    @Override // androidx.camera.core.m
    public synchronized void a0(Rect rect) {
        this.f1700a.a0(rect);
    }

    public synchronized void addOnImageCloseListener(a aVar) {
        this.f1701b.add(aVar);
    }

    @Override // androidx.camera.core.m, java.lang.AutoCloseable
    public void close() {
        synchronized (this) {
            this.f1700a.close();
        }
        a();
    }

    @Override // androidx.camera.core.m
    public synchronized int getFormat() {
        return this.f1700a.getFormat();
    }

    @Override // androidx.camera.core.m
    public synchronized int getHeight() {
        return this.f1700a.getHeight();
    }

    @Override // androidx.camera.core.m
    public synchronized int getWidth() {
        return this.f1700a.getWidth();
    }

    @Override // androidx.camera.core.m
    public synchronized Rect k0() {
        return this.f1700a.k0();
    }

    @Override // androidx.camera.core.m
    public synchronized Image p0() {
        return this.f1700a.p0();
    }

    @Override // androidx.camera.core.m
    public synchronized m.a[] x() {
        return this.f1700a.x();
    }
}
