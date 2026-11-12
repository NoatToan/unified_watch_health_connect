package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class uwp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<a<?, ?>> f36233a = new ArrayList();

    public static final class a<Z, R> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Class<Z> f36234a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Class<R> f36235b;
        public final grk<Z, R> c;

        public a(Class<Z> cls, Class<R> cls2, grk<Z, R> grkVar) {
            this.f36234a = cls;
            this.f36235b = cls2;
            this.c = grkVar;
        }

        public boolean a(Class<?> cls, Class<?> cls2) {
            return this.f36234a.isAssignableFrom(cls) && cls2.isAssignableFrom(this.f36235b);
        }
    }

    public synchronized <Z, R> grk<Z, R> a(Class<Z> cls, Class<R> cls2) {
        if (cls2.isAssignableFrom(cls)) {
            return gaq.b();
        }
        for (a<?, ?> aVar : this.f36233a) {
            if (aVar.a(cls, cls2)) {
                return (grk<Z, R>) aVar.c;
            }
        }
        throw new IllegalArgumentException("No transcoder registered to transcode from " + cls + " to " + cls2);
    }

    public synchronized <Z, R> List<Class<R>> b(Class<Z> cls, Class<R> cls2) {
        ArrayList arrayList = new ArrayList();
        if (cls2.isAssignableFrom(cls)) {
            arrayList.add(cls2);
            return arrayList;
        }
        for (a<?, ?> aVar : this.f36233a) {
            if (aVar.a(cls, cls2) && !arrayList.contains(aVar.f36235b)) {
                arrayList.add(aVar.f36235b);
            }
        }
        return arrayList;
    }

    public synchronized <Z, R> void c(Class<Z> cls, Class<R> cls2, grk<Z, R> grkVar) {
        this.f36233a.add(new a<>(cls, cls2, grkVar));
    }
}
