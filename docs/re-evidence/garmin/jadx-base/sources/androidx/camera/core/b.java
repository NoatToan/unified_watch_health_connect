package androidx.camera.core;

import android.media.Image;
import b0.m0;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public abstract class b implements e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f5432b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f5431a = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashSet f5433c = new HashSet();

    public interface a {
        void e(b bVar);
    }

    public b(e eVar) {
        this.f5432b = eVar;
    }

    @Override // androidx.camera.core.e
    public m0 A0() {
        return this.f5432b.A0();
    }

    @Override // androidx.camera.core.e
    public e.a[] A2() {
        return this.f5432b.A2();
    }

    public final void a(a aVar) {
        synchronized (this.f5431a) {
            this.f5433c.add(aVar);
        }
    }

    @Override // java.lang.AutoCloseable
    public void close() throws Exception {
        HashSet hashSet;
        this.f5432b.close();
        synchronized (this.f5431a) {
            hashSet = new HashSet(this.f5433c);
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((a) it.next()).e(this);
        }
    }

    @Override // androidx.camera.core.e
    public final int getFormat() {
        return this.f5432b.getFormat();
    }

    @Override // androidx.camera.core.e
    public int getHeight() {
        return this.f5432b.getHeight();
    }

    @Override // androidx.camera.core.e
    public final Image getImage() {
        return this.f5432b.getImage();
    }

    @Override // androidx.camera.core.e
    public int getWidth() {
        return this.f5432b.getWidth();
    }
}
