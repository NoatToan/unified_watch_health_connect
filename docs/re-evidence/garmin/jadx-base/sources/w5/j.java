package w5;

import ch.qos.logback.core.CoreConstants;
import com.mapbox.maps.extension.compose.style.standard.BaseStyleConfigurationState;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p1.g1;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lw5/j;", "", "<init>", "()V", "a", "b", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p1.c0<b, a> f182126a = new p1.c0<>(16);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p1.t0<b, a> f182127b = g1.b();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a6.r f182128c = new a6.r();

    @d23.a
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0081@\u0018\u00002\u00020\u0001\u0088\u0001\u0002\u0092\u0001\u0004\u0018\u00010\u0001¨\u0006\u0003"}, d2 = {"Lw5/j$a;", "", "result", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Object f182129a;

        private /* synthetic */ a(Object obj) {
            this.f182129a = obj;
        }

        public static final /* synthetic */ a a(Object obj) {
            return new a(obj);
        }

        public final boolean equals(Object obj) {
            if (obj instanceof a) {
                return p005kotlin.jvm.internal.s.g(this.f182129a, ((a) obj).f182129a);
            }
            return false;
        }

        public final int hashCode() {
            Object obj = this.f182129a;
            if (obj == null) {
                return 0;
            }
            return obj.hashCode();
        }

        public final String toString() {
            return "AsyncTypefaceResult(result=" + this.f182129a + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0081\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lw5/j$b;", "", "Lw5/p;", BaseStyleConfigurationState.CONFIG_FONT, "loaderKey", "<init>", "(Lw5/p;Ljava/lang/Object;)V", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final p f182130a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Object f182131b;

        public b(p pVar, Object obj) {
            this.f182130a = pVar;
            this.f182131b = obj;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return p005kotlin.jvm.internal.s.g(this.f182130a, bVar.f182130a) && p005kotlin.jvm.internal.s.g(this.f182131b, bVar.f182131b);
        }

        public final int hashCode() {
            int iHashCode = this.f182130a.hashCode() * 31;
            Object obj = this.f182131b;
            return iHashCode + (obj == null ? 0 : obj.hashCode());
        }

        public final String toString() {
            StringBuilder sb3 = new StringBuilder("Key(font=");
            sb3.append(this.f182130a);
            sb3.append(", loaderKey=");
            return wr.g.p(sb3, this.f182131b, CoreConstants.RIGHT_PARENTHESIS_CHAR);
        }
    }

    public static void a(j jVar, p pVar, l0 l0Var, Object obj) {
        jVar.getClass();
        b bVar = new b(pVar, l0Var.getF182139b());
        synchronized (jVar.f182128c) {
            try {
                if (obj == null) {
                    jVar.f182127b.m(bVar, a.a(null));
                    Unit unit = Unit.INSTANCE;
                } else {
                    jVar.f182126a.put(bVar, a.a(obj));
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(p pVar, l0 l0Var, f fVar, v13.c cVar) {
        k kVar;
        b bVar;
        if (cVar instanceof k) {
            kVar = (k) cVar;
            int i14 = kVar.f182136d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                kVar.f182136d = i14 - Integer.MIN_VALUE;
            } else {
                kVar = new k(this, cVar);
            }
        } else {
            kVar = new k(this, cVar);
        }
        Object obj = kVar.f182134b;
        Object obj2 = u13.a.COROUTINE_SUSPENDED;
        int i15 = kVar.f182136d;
        if (i15 == 0) {
            o13.r.b(obj);
            b bVar2 = new b(pVar, l0Var.getF182139b());
            synchronized (this.f182128c) {
                try {
                    a aVarD = this.f182126a.get(bVar2);
                    if (aVarD == null) {
                        aVarD = this.f182127b.d(bVar2);
                    }
                    if (aVarD != null) {
                        return aVarD.f182129a;
                    }
                    Unit unit = Unit.INSTANCE;
                    kVar.f182133a = bVar2;
                    kVar.f182136d = 1;
                    Object objInvoke = fVar.invoke(kVar);
                    if (objInvoke == obj2) {
                        return obj2;
                    }
                    obj = objInvoke;
                    bVar = bVar2;
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            bVar = kVar.f182133a;
            o13.r.b(obj);
        }
        synchronized (this.f182128c) {
            try {
                if (obj == null) {
                    this.f182127b.m(bVar, a.a(null));
                } else {
                    this.f182126a.put(bVar, a.a(obj));
                }
                Unit unit2 = Unit.INSTANCE;
            } catch (Throwable th4) {
                throw th4;
            }
        }
        return obj;
    }
}
