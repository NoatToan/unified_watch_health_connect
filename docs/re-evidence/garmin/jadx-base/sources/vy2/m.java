package vy2;

import androidx.lifecycle.y0;
import java.lang.reflect.Method;
import java.util.Map;
import p005kotlin.Metadata;
import tn2.s0;
import vv0.u;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0000\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lvy2/m;", "Lvy2/b;", "Landroidx/lifecycle/y0;", "", "<init>", "()V", "a", "ui-synthesizer_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class m extends b<y0<Object>> {
    @Override // vy2.b
    public final void b(y0<Object> y0Var, uy2.c cVar) {
        cVar.getClass();
        y0Var.j(cVar.a());
    }

    @Override // vy2.b
    public final Object c(i iVar, s0 s0Var) {
        iVar.getClass();
        Map map = (Map) iVar.a(a.f180855c);
        Method method = iVar.f180851c;
        Object y0Var = map.get(method);
        if (y0Var == null) {
            y0Var = new y0();
            s0Var.invoke(y0Var);
            map.put(method, y0Var);
        }
        return (y0) y0Var;
    }

    @Override // vy2.b
    public final boolean d(i iVar) {
        iVar.getClass();
        Class<?> returnType = iVar.f180851c.getReturnType();
        return p005kotlin.jvm.internal.s.g(returnType, androidx.lifecycle.s0.class) || p005kotlin.jvm.internal.s.g(returnType, y0.class);
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0002\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0001:\u0001\u0007B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lvy2/m$a;", "Lvy2/n;", "Ljava/lang/reflect/Method;", "Landroidx/lifecycle/y0;", "", "<init>", "()V", "a", "ui-synthesizer_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a extends n<Method, y0<Object>> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final C3370a f180855c = new C3370a(null);

        public a() {
            super(f180855c);
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
            if (!(obj instanceof y0)) {
                return false;
            }
            return this.f180857b.containsValue((y0) obj);
        }

        @Override // vy2.n, java.util.Map
        public final Object get(Object obj) {
            if (!(obj instanceof Method)) {
                return null;
            }
            return (y0) this.f180857b.get((Method) obj);
        }

        @Override // java.util.Map
        public final /* bridge */ Object getOrDefault(Object obj, Object obj2) {
            return !(obj instanceof Method) ? obj2 : (y0) super.getOrDefault((Method) obj, (y0) obj2);
        }

        @Override // java.util.Map
        public final /* bridge */ boolean remove(Object obj, Object obj2) {
            if ((obj instanceof Method) && (obj2 instanceof y0)) {
                return super.remove((Method) obj, (y0) obj2);
            }
            return false;
        }

        @Override // vy2.n, java.util.Map
        public final Object remove(Object obj) {
            if (!(obj instanceof Method)) {
                return null;
            }
            return (y0) this.f180857b.remove((Method) obj);
        }

        /* JADX INFO: renamed from: vy2.m$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lvy2/m$a$a;", "Lxy2/h$b;", "Lvy2/m$a;", "<init>", "()V", "ui-synthesizer_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class C3370a implements xy2.h.b<a> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ xy2.g f180856a;

            private C3370a() {
                xy2.h.a aVar = xy2.h.f192726a;
                u uVar = new u(17);
                aVar.getClass();
                this.f180856a = new xy2.g(uVar);
            }

            @Override // xy2.h.b
            public final xy2.h a() {
                return (a) this.f180856a.a();
            }

            public /* synthetic */ C3370a(p005kotlin.jvm.internal.j jVar) {
                this();
            }
        }
    }
}
