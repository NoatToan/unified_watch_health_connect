package ic0;

import d53.w;
import e23.p;
import g22.n;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import o13.m;
import o13.r;
import o13.t;
import o53.b0;
import o53.c0;
import o53.s0;
import o53.z;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.j;
import p13.k0;
import p13.t0;
import p13.y;
import v13.i;
import zb0.k;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0006B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lic0/f;", "Lic0/b;", "Lo53/z;", "ioDispatcher", "<init>", "(Lo53/z;)V", "b", "gcm-domain-device_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class f implements ic0.b {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f92589f = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z f92590a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f92591b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LinkedHashSet f92592c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f92593d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final t f92594e;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.devices.data.InMemoryDeviceInfoRepository$1", f = "InMemoryDeviceInfoRepository.kt", l = {34}, m = "invokeSuspend", v = 2)
    public static final class a extends i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f92595a;

        public a(t13.d<? super a> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return f.this.new a(dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f92595a;
            if (i14 == 0) {
                r.b(obj);
                this.f92595a = 1;
                if (f.this.b(this) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            return Unit.INSTANCE;
        }
    }

    static {
        new b(null);
    }

    public f(z zVar) {
        zVar.getClass();
        this.f92590a = zVar;
        this.f92591b = new Object();
        this.f92592c = new LinkedHashSet();
        k0 k0Var = k0.f134949a;
        k0Var.getClass();
        this.f92593d = k0Var;
        this.f92594e = m.b(new i31.e(15));
        ge1.b.T(c0.a(zVar), null, null, new a(null), 3);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.Map] */
    @Override // ic0.b
    public final boolean a(String str) {
        List<String> list;
        synchronized (this.f92591b) {
            boolean z14 = false;
            if (str == null) {
                return false;
            }
            try {
                jc0.d dVar = (jc0.d) this.f92593d.get(str);
                if (dVar != null && (list = dVar.f98139g) != null) {
                    Iterator<T> it = list.iterator();
                    while (it.hasNext()) {
                        n.g((String) it.next());
                    }
                    if (list.contains("DEDICATED_BIKE_COMPUTER")) {
                        z14 = true;
                    }
                }
                return z14;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // ic0.b
    public final Object b(v13.c cVar) throws Throwable {
        g gVar;
        if (cVar instanceof g) {
            gVar = (g) cVar;
            int i14 = gVar.f92599c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                gVar.f92599c = i14 - Integer.MIN_VALUE;
            } else {
                gVar = new g(this, cVar);
            }
        } else {
            gVar = new g(this, cVar);
        }
        Object objE0 = gVar.f92597a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = gVar.f92599c;
        if (i15 == 0) {
            r.b(objE0);
            z zVar = this.f92590a;
            h hVar = new h(this, null);
            gVar.f92599c = 1;
            objE0 = ge1.b.e0(zVar, hVar, gVar);
            if (objE0 == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(objE0);
        }
        List list = (List) objE0;
        if (list == null || list.isEmpty()) {
            return Unit.INSTANCE;
        }
        synchronized (this.f92591b) {
            try {
                this.f92592c.addAll(list);
                LinkedHashSet linkedHashSet = this.f92592c;
                ArrayList arrayList = new ArrayList();
                for (Object obj : linkedHashSet) {
                    if (n.d(k.a(((jc0.d) obj).H))) {
                        arrayList.add(obj);
                    }
                }
                int iA = t0.a(y.r(arrayList, 10));
                if (iA < 16) {
                    iA = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iA);
                for (Object obj2 : arrayList) {
                    String strA = k.a(((jc0.d) obj2).H);
                    strA.getClass();
                    linkedHashMap.put(strA, obj2);
                }
                this.f92593d = linkedHashMap;
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return Unit.INSTANCE;
    }

    @Override // ic0.b
    public final String c(String str) {
        String str2;
        Object next;
        synchronized (this.f92591b) {
            str2 = null;
            if (str != null) {
                try {
                    Iterator it = this.f92592c.iterator();
                    do {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                    } while (!str.equalsIgnoreCase(((jc0.d) next).f98134b));
                    jc0.d dVar = (jc0.d) next;
                    if (dVar != null) {
                        String str3 = dVar.f98144l;
                        String string = str3 != null ? w.i0(w.c0(str3, "Garmin", str3)).toString() : null;
                        if (string != null && (!w.J(string))) {
                            str2 = string;
                        }
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
        return str2;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.Map] */
    @Override // ic0.b
    public final boolean d(String str) {
        String str2;
        synchronized (this.f92591b) {
            boolean z14 = false;
            if (str == null) {
                return false;
            }
            jc0.d dVar = (jc0.d) this.f92593d.get(str);
            if (dVar != null && (str2 = dVar.f98142j) != null && w.z(n.g(str2), "INDEX", false)) {
                z14 = true;
            }
            return z14;
        }
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.Map] */
    @Override // ic0.b
    public final boolean e(String str) {
        String str2;
        synchronized (this.f92591b) {
            boolean z14 = false;
            if (str == null) {
                return false;
            }
            jc0.d dVar = (jc0.d) this.f92593d.get(str);
            if (dVar != null && (str2 = dVar.f98142j) != null && w.z(n.g(str2), "CIRQA", false)) {
                z14 = true;
            }
            return z14;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0006¨\u0006\u000b"}, d2 = {"Lic0/f$b;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "DEDICATED_BIKE_COMPUTER", "INDEX_TAG", "CIRQA_TAG", "GARMIN_PREFIX", "gcm-domain-device_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(j jVar) {
            this();
        }

        private b() {
        }
    }

    public f() {
        this(null, 1, null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public f(z zVar, int i14, j jVar) {
        if ((i14 & 1) != 0) {
            x53.c cVar = s0.f129406a;
            zVar = x53.b.f189152a;
        }
        this(zVar);
    }
}
