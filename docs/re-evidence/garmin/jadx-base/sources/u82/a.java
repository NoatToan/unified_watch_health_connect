package u82;

import i3.e5;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Objects;
import java.util.Set;
import o13.r;
import o53.b0;
import o53.l1;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.j;
import p3.m;
import p3.n;
import p3.p1;
import p3.x1;
import r53.b2;
import r53.o2;
import r53.q2;
import r53.s;
import r53.z1;
import vb.h;
import y82.g;

/* JADX INFO: loaded from: classes9.dex */
@o13.e
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003:\u0001\fB-\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Lu82/a;", "KeyType", "ValueType", "Lu82/d;", "Lo53/b0;", "coroutineScope", "Ly82/b;", "repository", "", "loggingEnabled", "<init>", "(Lo53/b0;Ly82/b;Z)V", "a", "patterns_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a<KeyType, ValueType> implements d<KeyType, ValueType> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f169478e = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b0 f169479a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y82.b<KeyType, ValueType> f169480b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f169481c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final y82.f<KeyType, f<ValueType>> f169482d;

    static {
        new C3172a(null);
    }

    public a(b0 b0Var, y82.b<KeyType, ValueType> bVar, boolean z14) {
        b0Var.getClass();
        bVar.getClass();
        this.f169479a = b0Var;
        this.f169480b = bVar;
        this.f169481c = new LinkedHashMap();
        this.f169482d = new y82.f<>();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public static final Object d(a aVar, Object obj, o2 o2Var, boolean z14, v13.c cVar) {
        b bVar;
        y82.f<KeyType, f<ValueType>> fVar = aVar.f169482d;
        if (cVar instanceof b) {
            bVar = (b) cVar;
            int i14 = bVar.f169487e;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                bVar.f169487e = i14 - Integer.MIN_VALUE;
            } else {
                bVar = new b(aVar, cVar);
            }
        } else {
            bVar = new b(aVar, cVar);
        }
        Object objA = bVar.f169485c;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        int i15 = bVar.f169487e;
        try {
            if (i15 == 0) {
                r.b(objA);
                if (z14) {
                    fVar.a(obj, new f.b(((f) o2Var.getValue()).a()));
                    Objects.toString(obj);
                }
                y82.b<KeyType, ValueType> bVar2 = aVar.f169480b;
                bVar.f169483a = obj;
                bVar.f169484b = o2Var;
                bVar.f169487e = 1;
                objA = bVar2.a(obj, bVar);
                if (objA == aVar2) {
                    return aVar2;
                }
            } else {
                if (i15 != 1) {
                    h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o2Var = bVar.f169484b;
                obj = bVar.f169483a;
                r.b(objA);
            }
            fVar.a(obj, new f.c(objA));
            Objects.toString(obj);
        } catch (Throwable th3) {
            fVar.a(obj, new f.a(((f) o2Var.getValue()).a(), new g(th3, e5.f(obj, "Fetch page data failed for key="))));
            Objects.toString(obj);
            th3.toString();
        }
        return Unit.INSTANCE;
    }

    @Override // u82.d
    public final void a(KeyType keytype) {
        i(keytype, true);
    }

    @Override // u82.d
    public final Set<KeyType> b() {
        return this.f169482d.f195241a.keySet();
    }

    @Override // u82.d
    public final p1 c(Object obj, m mVar) {
        mVar.C(-1242416290);
        x1 x1Var = n.f135158a;
        y82.f<KeyType, f<ValueType>> fVar = this.f169482d;
        z1 z1Var = (z1) fVar.f195241a.get(obj);
        j jVar = null;
        b2 b2VarD = z1Var != null ? s.d(z1Var) : null;
        if (b2VarD == null) {
            f.b bVar = new f.b(jVar, 1, jVar);
            LinkedHashMap linkedHashMap = fVar.f195241a;
            z1 z1Var2 = (z1) linkedHashMap.get(obj);
            if (z1Var2 != null) {
                while (!z1Var2.b(z1Var2.getValue(), bVar)) {
                }
            }
            if (z1Var2 == null) {
                Object objA = linkedHashMap.get(obj);
                if (objA == null) {
                    objA = q2.a(bVar);
                    linkedHashMap.put(obj, objA);
                }
                z1Var2 = (z1) objA;
            }
            b2VarD = s.d(z1Var2);
            f(obj, b2VarD, true);
        }
        p1 p1VarC = s9.c.c(b2VarD, mVar);
        x1 x1Var2 = n.f135158a;
        mVar.f();
        return p1VarC;
    }

    public final void e() {
        this.f169482d.f195241a.clear();
    }

    public final void f(Object obj, b2 b2Var, boolean z14) {
        Objects.toString(obj);
        LinkedHashMap linkedHashMap = this.f169481c;
        l1 l1Var = (l1) linkedHashMap.get(obj);
        if (l1Var != null && l1Var.isActive()) {
            Objects.toString(obj);
            return;
        }
        Objects.toString(obj);
        linkedHashMap.put(obj, ge1.b.T(this.f169479a, null, null, new c(this, obj, b2Var, z14, null), 3));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void g() {
        Iterator it = b().iterator();
        while (it.hasNext()) {
            i(it.next(), true);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void h() {
        Iterator it = b().iterator();
        while (it.hasNext()) {
            i(it.next(), false);
        }
    }

    public final void i(KeyType keytype, boolean z14) {
        z1 z1Var = (z1) this.f169482d.f195241a.get(keytype);
        b2 b2VarD = z1Var != null ? s.d(z1Var) : null;
        if (b2VarD != null) {
            Objects.toString(keytype);
            f(keytype, b2VarD, z14);
        }
    }

    /* JADX INFO: renamed from: u82.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lu82/a$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "patterns_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C3172a {
        public /* synthetic */ C3172a(j jVar) {
            this();
        }

        private C3172a() {
        }
    }

    public /* synthetic */ a(b0 b0Var, y82.b bVar, boolean z14, int i14, j jVar) {
        this(b0Var, bVar, (i14 & 4) != 0 ? false : z14);
    }
}
