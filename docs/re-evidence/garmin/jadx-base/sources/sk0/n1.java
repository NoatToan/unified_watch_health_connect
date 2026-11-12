package sk0;

import androidx.lifecycle.u1;
import androidx.lifecycle.v1;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.v2;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.locks.ReentrantLock;
import o53.c2;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.o2;
import r53.p2;
import r53.q2;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\nB\u001d\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lsk0/n1;", "Landroidx/lifecycle/u1;", "Lsk0/i1;", "Lkk0/b;", "gearRepository", "", "Luk0/a;", "initialSelectedGears", "<init>", "(Lkk0/b;Ljava/util/List;)V", "a", "gcm-gear_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class n1 extends u1 implements i1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kk0.b f159776a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<uk0.a> f159777b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p2 f159778c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p2 f159779d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final i53.e<String> f159780e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ReentrantLock f159781f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public c2 f159782g;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.gear.presentation.menu.ManageCollectionGearViewModel$loadGear$1$2", f = "ManageCollectionGearViewModel.kt", l = {119}, m = "invokeSuspend", v = 2)
    public static final class b extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f159783a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f159784b;

        public b(t13.d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            b bVar = n1.this.new b(dVar);
            bVar.f159784b = obj;
            return bVar;
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            Object value;
            Object value2;
            o53.b0 b0Var = (o53.b0) this.f159784b;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f159783a;
            n1 n1Var = n1.this;
            if (i14 == 0) {
                o13.r.b(obj);
                kk0.b bVar = n1Var.f159776a;
                b63.o oVarD = g22.l.d(b63.o.INSTANCE);
                this.f159784b = b0Var;
                this.f159783a = 1;
                obj = bVar.v(oVarD, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            v2 v2Var = (v2) obj;
            if (v2Var instanceof v2.b) {
                Iterable<jk0.r> iterable = (Iterable) ((v2.b) v2Var).f47386a;
                ArrayList arrayList = new ArrayList(p13.y.r(iterable, 10));
                for (jk0.r rVar : iterable) {
                    rVar.getClass();
                    String str = rVar.f99313a;
                    c80.u uVar = rVar.f99315c;
                    String str2 = rVar.f99317e;
                    String str3 = rVar.f99318f;
                    if (str3 == null) {
                        str3 = "";
                    }
                    arrayList.add(new uk0.a(str, uVar, str2, str3, rVar.f99319g));
                }
                ArrayList arrayListC0 = p13.h0.C0(arrayList, n1Var.f159777b);
                HashSet hashSet = new HashSet();
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : arrayListC0) {
                    if (hashSet.add(((uk0.a) obj2).f171795a)) {
                        arrayList2.add(obj2);
                    }
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Object obj3 : arrayList2) {
                    c80.u uVar2 = ((uk0.a) obj3).f171796b;
                    Object arrayList3 = linkedHashMap.get(uVar2);
                    if (arrayList3 == null) {
                        arrayList3 = new ArrayList();
                        linkedHashMap.put(uVar2, arrayList3);
                    }
                    ((List) arrayList3).add(obj3);
                }
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(p13.t0.a(linkedHashMap.size()));
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    linkedHashMap2.put(entry.getKey(), i53.a.e((Iterable) entry.getValue()));
                }
                p2 p2Var = n1Var.f159778c;
                do {
                    value2 = p2Var.getValue();
                } while (!p2Var.b(value2, m1.a((m1) value2, false, false, i53.a.g(linkedHashMap2), null, 20)));
            } else {
                if (!(v2Var instanceof v2.a)) {
                    lc.u0.r();
                    return null;
                }
                a2 a2Var = a2.GEAR;
                String strN = fb1.c.n("Error loading collection gear: ", ((v2.a) v2Var).f47385c);
                i2.f36769a.getClass();
                i2.a.p(a2Var, "ManageActivityGearViewModel", strN);
                p2 p2Var2 = n1Var.f159778c;
                do {
                    value = p2Var2.getValue();
                } while (!p2Var2.b(value, m1.a((m1) value, false, true, null, null, 26)));
            }
            return Unit.INSTANCE;
        }
    }

    static {
        new a(null);
    }

    public n1(kk0.b bVar, List<uk0.a> list) {
        bVar.getClass();
        list.getClass();
        this.f159776a = bVar;
        this.f159777b = list;
        p2 p2VarA = q2.a(new m1(false, false, false, null, null, 31, null));
        this.f159778c = p2VarA;
        this.f159779d = p2VarA;
        ArrayList arrayList = new ArrayList(p13.y.r(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((uk0.a) it.next()).f171795a);
        }
        this.f159780e = i53.a.h(arrayList);
        this.f159781f = new ReentrantLock();
        x4();
    }

    @Override // sk0.i1
    public final void W1() {
        x4();
    }

    @Override // sk0.i1
    public final o2<m1> getUiState() {
        return this.f159779d;
    }

    @Override // sk0.i1
    public final void j() {
        p2 p2Var;
        Object value;
        do {
            p2Var = this.f159778c;
            value = p2Var.getValue();
        } while (!p2Var.b(value, m1.a((m1) value, false, false, null, null, 15)));
    }

    @Override // sk0.i1
    public final i53.e<String> q() {
        return this.f159780e;
    }

    public final void x4() {
        Object value;
        ReentrantLock reentrantLock = this.f159781f;
        reentrantLock.lock();
        try {
            c2 c2Var = this.f159782g;
            if (c2Var == null || !c2Var.isActive()) {
                p2 p2Var = this.f159778c;
                do {
                    value = p2Var.getValue();
                } while (!p2Var.b(value, m1.a((m1) value, true, false, null, null, 26)));
                this.f159782g = ge1.b.T(v1.a(this), null, null, new b(null), 3);
                Unit unit = Unit.INSTANCE;
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lsk0/n1$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-gear_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
