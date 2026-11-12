package vy2;

import com.garmin.uisynthesizer.synthesize.SynthesizerException;
import java.lang.reflect.Method;
import java.util.Map;
import p005kotlin.Metadata;
import tn2.s0;
import vv0.u;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0000\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lvy2/q;", "Lvy2/b;", "Lm13/a;", "", "<init>", "()V", "a", "ui-synthesizer_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class q extends b<m13.a<Object>> {
    @Override // vy2.b
    public final void b(m13.a<Object> aVar, uy2.c cVar) {
        Object bVar;
        m13.a<Object> aVar2 = aVar;
        cVar.getClass();
        try {
            int i14 = o13.q.f128596b;
            bVar = cVar.a();
            if (bVar == null) {
                throw new SynthesizerException("The return value should not be null");
            }
        } catch (Throwable th3) {
            int i15 = o13.q.f128596b;
            bVar = new o13.q.b(th3);
        }
        if (!(bVar instanceof o13.q.b)) {
            aVar2.c(bVar);
        }
        Throwable thB = o13.q.b(bVar);
        if (thB != null) {
            aVar2.onError(thB);
        }
    }

    @Override // vy2.b
    public final Object c(i iVar, s0 s0Var) {
        iVar.getClass();
        Map map = (Map) iVar.a(a.f180860c);
        Method method = iVar.f180851c;
        Object aVar = map.get(method);
        if (aVar == null) {
            aVar = new m13.a();
            s0Var.invoke(aVar);
            map.put(method, aVar);
        }
        return (m13.a) aVar;
    }

    @Override // vy2.b
    public final boolean d(i iVar) {
        iVar.getClass();
        return p005kotlin.jvm.internal.s.g(iVar.f180851c.getReturnType(), q03.l.class);
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0002\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0001:\u0001\u0007B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lvy2/q$a;", "Lvy2/n;", "Ljava/lang/reflect/Method;", "Lm13/a;", "", "<init>", "()V", "a", "ui-synthesizer_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a extends n<Method, m13.a<Object>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final C3371a f180860c = new C3371a(null);

        public a() {
            super(f180860c);
        }

        @Override // vy2.n, java.util.Map
        public final boolean containsKey(Object obj) {
            if (!(obj instanceof Method)) {
                return false;
            }
            return this.f180857b.containsKey((Method) obj);
        }

        @Override // vy2.n, java.util.Map
        public final boolean containsValue(Object obj) {
            if (!(obj instanceof m13.a)) {
                return false;
            }
            return this.f180857b.containsValue((m13.a) obj);
        }

        @Override // vy2.n, java.util.Map
        public final Object get(Object obj) {
            if (!(obj instanceof Method)) {
                return null;
            }
            return (m13.a) this.f180857b.get((Method) obj);
        }

        @Override // java.util.Map
        public final /* bridge */ Object getOrDefault(Object obj, Object obj2) {
            return !(obj instanceof Method) ? obj2 : (m13.a) super.getOrDefault((Method) obj, (m13.a) obj2);
        }

        @Override // java.util.Map
        public final /* bridge */ boolean remove(Object obj, Object obj2) {
            if ((obj instanceof Method) && (obj2 instanceof m13.a)) {
                return super.remove((Method) obj, (m13.a) obj2);
            }
            return false;
        }

        @Override // vy2.n, java.util.Map
        public final Object remove(Object obj) {
            if (!(obj instanceof Method)) {
                return null;
            }
            return (m13.a) this.f180857b.remove((Method) obj);
        }

        /* JADX INFO: renamed from: vy2.q$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lvy2/q$a$a;", "Lxy2/h$b;", "Lvy2/q$a;", "<init>", "()V", "ui-synthesizer_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class C3371a implements xy2.h.b<a> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ xy2.g f180861a;

            private C3371a() {
                xy2.h.a aVar = xy2.h.f192726a;
                u uVar = new u(18);
                aVar.getClass();
                this.f180861a = new xy2.g(uVar);
            }

            @Override // xy2.h.b
            public final xy2.h a() {
                return (a) this.f180861a.a();
            }

            public /* synthetic */ C3371a(p005kotlin.jvm.internal.j jVar) {
                this();
            }
        }
    }
}
