package o63;

import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lo63/r;", "Lp63/g;", "Ln63/g;", "configuration", "<init>", "(Ln63/g;)V", "kotlinx-serialization-json"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class r implements p63.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f129879a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f129880b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f129881c;

    public r(n63.g gVar) {
        gVar.getClass();
        this.f129879a = gVar.f123928j;
        this.f129880b = gVar.f123927i;
        this.f129881c = gVar.f123934p != n63.a.NONE;
    }

    @Override // p63.g
    public final <Base> void b(k23.d<Base> dVar, e23.l<? super String, ? extends i63.b<? extends Base>> lVar) {
    }

    @Override // p63.g
    public final <T> void c(k23.d<T> dVar, e23.l<? super List<? extends i63.c<?>>, ? extends i63.c<?>> lVar) {
        dVar.getClass();
        lVar.getClass();
    }

    @Override // p63.g
    public final <Base> void d(k23.d<Base> dVar, e23.l<? super Base, ? extends i63.i<? super Base>> lVar) {
    }

    @Override // p63.g
    public final <Base, Sub extends Base> void e(k23.d<Base> dVar, k23.d<Sub> dVar2, i63.c<Sub> cVar) {
        k63.e f116202c = cVar.getF94809a();
        k63.l f103234b = f116202c.getF103234b();
        if ((f103234b instanceof k63.c) || p005kotlin.jvm.internal.s.g(f103234b, k63.l.a.f103251a)) {
            am.j.w(dVar2.D(), " can't be registered as a subclass for polymorphic serialization because its kind ", f103234b, " is not concrete. To work with multiple hierarchies, register it as a base class.", "Serializer for ");
            return;
        }
        boolean z14 = this.f129881c;
        boolean z15 = this.f129880b;
        if (!z15 && z14 && (p005kotlin.jvm.internal.s.g(f103234b, k63.m.b.f103254a) || p005kotlin.jvm.internal.s.g(f103234b, k63.m.c.f103255a) || (f103234b instanceof k63.d) || (f103234b instanceof k63.l.b))) {
            am.j.w(dVar2.D(), " of kind ", f103234b, " cannot be serialized polymorphically with class discriminator.", "Serializer for ");
            return;
        }
        if (z15 || !z14) {
            return;
        }
        int f116985c = f116202c.getF116985c();
        for (int i14 = 0; i14 < f116985c; i14++) {
            String strD = f116202c.d(i14);
            if (p005kotlin.jvm.internal.s.g(strD, this.f129879a)) {
                androidx.core.view.j.p(dVar2, " has property '", strD, "' that conflicts with JSON class discriminator. You can either change class discriminator in JsonConfiguration, rename property with @SerialName annotation or fall back to array polymorphism", "Polymorphic serializer for ");
                return;
            }
        }
    }
}
