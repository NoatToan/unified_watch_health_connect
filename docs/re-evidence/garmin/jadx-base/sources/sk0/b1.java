package sk0;

import androidx.lifecycle.u1;
import androidx.lifecycle.v1;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.v2;
import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;
import o53.c2;
import o53.e2;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.o2;
import r53.p2;
import r53.q2;
import yc.t2;
import yc.u2;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\t\nB\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lsk0/b1;", "Landroidx/lifecycle/u1;", "Lsk0/h1;", "Lkk0/b;", "gearRepository", "Lvk0/c;", "gearPrefs", "<init>", "(Lkk0/b;Lvk0/c;)V", "b", "a", "gcm-gear_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b1 extends u1 implements h1 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f159619h = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kk0.b f159620a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final vk0.c f159621b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p2 f159622c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public c2 f159623d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ReentrantLock f159624e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final LinkedHashMap f159625f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final p2 f159626g;

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 sk0.b1$b[], still in use, count: 1, list:
      (r0v1 sk0.b1$b[]) from 0x0026: CONSTRUCTOR (r0v1 sk0.b1$b[]) A[MD:(T extends java.lang.Enum<T>[]):void (m), WRAPPED] call: w13.c.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
    	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
    	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
    	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
    	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
    	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lsk0/b1$b;", "", "<init>", "(Ljava/lang/String;I)V", "gcm-gear_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b {
        Gear,
        Collections,
        Retired;


        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ w13.c f159631e;

        public static final /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f159632a;

            static {
                int[] iArr = new int[b.values().length];
                try {
                    iArr[b.Gear.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[b.Collections.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[b.Retired.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f159632a = iArr;
            }
        }

        static {
            f159631e = new w13.c(bVarArr);
        }

        private b() {
            super(str, i);
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) f159630d.clone();
        }
    }

    public static final /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f159633a;

        static {
            int[] iArr = new int[b.values().length];
            try {
                iArr[b.Gear.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[b.Retired.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[b.Collections.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f159633a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.gear.presentation.menu.GearListViewModel$loadValidGearTypes$1$2", f = "GearListViewModel.kt", l = {282}, m = "invokeSuspend", v = 2)
    public static final class d extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f159634a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f159635b;

        public d(t13.d<? super d> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            d dVar2 = b1.this.new d(dVar);
            dVar2.f159635b = obj;
            return dVar2;
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((d) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            Object value;
            i53.e eVarH;
            i53.e eVarX4;
            i53.e eVarX5;
            Object value2;
            o53.b0 b0Var = (o53.b0) this.f159635b;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f159634a;
            b1 b1Var = b1.this;
            if (i14 == 0) {
                o13.r.b(obj);
                kk0.b bVar = b1Var.f159620a;
                this.f159635b = b0Var;
                this.f159634a = 1;
                obj = bVar.o(this);
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
                p2 p2Var = b1Var.f159622c;
                p2 p2Var2 = b1Var.f159622c;
                c80.u uVar = ((z0) p2Var.getValue()).f159928f;
                c80.u uVar2 = ((z0) p2Var2.getValue()).f159929g;
                jk0.u uVar3 = (jk0.u) ((v2.b) v2Var).f47386a;
                Iterable iterableB0 = (List) uVar3.f99345c.getValue();
                if (iterableB0 != null) {
                    if (uVar != null) {
                        iterableB0 = p13.h0.B0(iterableB0, uVar);
                    }
                    eVarX4 = b1.A4(iterableB0);
                } else {
                    eVarX4 = b1.x4(b1Var, uVar);
                }
                i53.e eVar = eVarX4;
                Iterable iterableB1 = (List) uVar3.f99346d.getValue();
                if (iterableB1 != null) {
                    if (uVar2 != null) {
                        iterableB1 = p13.h0.B0(iterableB1, uVar2);
                    }
                    eVarX5 = b1.A4(iterableB1);
                } else {
                    eVarX5 = b1.x4(b1Var, uVar2);
                }
                i53.e eVar2 = eVarX5;
                do {
                    value2 = p2Var2.getValue();
                } while (!p2Var2.b(value2, z0.a((z0) value2, false, eVar, eVar2, null, null, null, null, 248)));
            } else {
                if (!(v2Var instanceof v2.a)) {
                    lc.u0.r();
                    return null;
                }
                a2 a2Var = a2.GEAR;
                String strD = com.airbnb.lottie.animation.keyframe.a.d(((v2.a) v2Var).f47383a, "Error retrieving existing gear types. ");
                i2.f36769a.getClass();
                i2.a.p(a2Var, "GearListViewModel", strD);
                p2 p2Var3 = b1Var.f159622c;
                do {
                    value = p2Var3.getValue();
                    eVarH = i53.a.h(c80.u.f25612w);
                } while (!p2Var3.b(value, z0.a((z0) value, false, eVarH, eVarH, null, null, null, null, 248)));
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class e<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t7, T t14) {
            return r13.a.b(Integer.valueOf(((c80.u) t7).ordinal()), Integer.valueOf(((c80.u) t14).ordinal()));
        }
    }

    static {
        new a(null);
    }

    public b1(kk0.b bVar, vk0.c cVar) {
        bVar.getClass();
        cVar.getClass();
        this.f159620a = bVar;
        this.f159621b = cVar;
        this.f159622c = q2.a(new z0(false, i53.a.d(), i53.a.d(), i53.a.d(), cVar.d(), null, null, false));
        this.f159624e = new ReentrantLock();
        this.f159625f = new LinkedHashMap();
        this.f159626g = q2.a(y4());
        z4();
    }

    public static i53.e A4(Iterable iterable) {
        return i53.a.h(p13.h0.N0(iterable, new e()));
    }

    public static final i53.h x4(b1 b1Var, Object... objArr) {
        b1Var.getClass();
        Object[] array = p13.u.C(objArr).toArray(new Object[0]);
        Object[] objArrCopyOf = Arrays.copyOf(array, array.length);
        m53.b.f116784e.getClass();
        m53.b bVar = m53.b.f116785f;
        List listAsList = Arrays.asList(objArrCopyOf);
        listAsList.getClass();
        return bVar.b(listAsList);
    }

    @Override // sk0.h1
    public final void F2(c80.u uVar) {
        p2 p2Var;
        Object value;
        while (true) {
            p2 p2Var2 = this.f159622c;
            Object value2 = p2Var2.getValue();
            c80.u uVar2 = uVar;
            if (p2Var2.b(value2, z0.a((z0) value2, false, null, null, null, null, null, uVar2, 191))) {
                break;
            } else {
                uVar = uVar2;
            }
        }
        do {
            p2Var = this.f159626g;
            value = p2Var.getValue();
        } while (!p2Var.b(value, y4()));
    }

    @Override // sk0.h1
    public final void U1() {
        p2 p2Var;
        Object value;
        do {
            p2Var = this.f159622c;
            value = p2Var.getValue();
        } while (!p2Var.b(value, z0.a((z0) value, false, null, null, null, null, null, null, 127)));
    }

    @Override // sk0.h1
    public final void d2(jk0.o oVar) {
        p2 p2Var;
        Object value;
        oVar.getClass();
        this.f159621b.c(oVar);
        while (true) {
            p2 p2Var2 = this.f159622c;
            Object value2 = p2Var2.getValue();
            jk0.o oVar2 = oVar;
            if (p2Var2.b(value2, z0.a((z0) value2, false, null, null, null, oVar2, null, null, 239))) {
                break;
            } else {
                oVar = oVar2;
            }
        }
        do {
            p2Var = this.f159626g;
            value = p2Var.getValue();
        } while (!p2Var.b(value, y4()));
    }

    @Override // sk0.h1
    public final o2<z0> getUiState() {
        return this.f159622c;
    }

    @Override // sk0.h1
    /* JADX INFO: renamed from: i1, reason: from getter */
    public final p2 getF159702a() {
        return this.f159626g;
    }

    @Override // sk0.h1
    public final void j2() {
        p2 p2Var;
        Object value;
        do {
            p2Var = this.f159622c;
            value = p2Var.getValue();
        } while (!p2Var.b(value, z0.a((z0) value, false, null, null, i53.a.d(), null, null, null, 247)));
    }

    @Override // sk0.h1
    public final void q2(c80.u uVar) {
        p2 p2Var;
        Object value;
        while (true) {
            p2 p2Var2 = this.f159622c;
            Object value2 = p2Var2.getValue();
            c80.u uVar2 = uVar;
            if (p2Var2.b(value2, z0.a((z0) value2, false, null, null, null, null, uVar2, null, 223))) {
                break;
            } else {
                uVar = uVar2;
            }
        }
        do {
            p2Var = this.f159626g;
            value = p2Var.getValue();
        } while (!p2Var.b(value, y4()));
    }

    public final i53.d<b, r53.i<yc.v2<uk0.e>>> y4() {
        r0 r0Var;
        e23.a aVar;
        r53.i<yc.v2<uk0.e>> iVar;
        final z0 z0Var = (z0) this.f159622c.getValue();
        w13.c cVar = b.f159631e;
        int iA = p13.t0.a(p13.y.r(cVar, 10));
        if (iA < 16) {
            iA = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iA);
        p13.c.b bVar = new p13.c.b();
        while (bVar.hasNext()) {
            Object next = bVar.next();
            b bVar2 = (b) next;
            int[] iArr = c.f159633a;
            int i14 = iArr[bVar2.ordinal()];
            if (i14 == 1) {
                r0Var = new r0(z0Var.f159927e, z0Var.f159928f);
            } else if (i14 == 2) {
                r0Var = new r0(z0Var.f159927e, z0Var.f159929g);
            } else {
                if (i14 != 3) {
                    lc.u0.r();
                    return null;
                }
                r0Var = new r0(z0Var.f159927e, null);
            }
            LinkedHashMap linkedHashMap2 = this.f159625f;
            c1 c1Var = (c1) linkedHashMap2.get(bVar2);
            if (p005kotlin.jvm.internal.s.g(c1Var != null ? c1Var.f159645b : null, r0Var)) {
                iVar = c1Var.f159646c;
            } else {
                if (c1Var != null) {
                    o53.c0.c(c1Var.f159644a, null);
                }
                u2 u2Var = new u2(10, 0, false, 10, 0, 0, 54, null);
                int i15 = iArr[bVar2.ordinal()];
                if (i15 == 1) {
                    final int i16 = 0;
                    aVar = new e23.a() { // from class: sk0.a1
                        @Override // e23.a
                        public final Object invoke() {
                            int i17 = i16;
                            b1 b1Var = this;
                            z0 z0Var2 = z0Var;
                            switch (i17) {
                                case 0:
                                    int i18 = b1.f159619h;
                                    return new s0(z0Var2.f159927e, z0Var2.f159928f, jk0.p.Active, b1Var.f159620a);
                                case 1:
                                    int i19 = b1.f159619h;
                                    return new s0(z0Var2.f159927e, z0Var2.f159929g, jk0.p.Retired, b1Var.f159620a);
                                default:
                                    int i24 = b1.f159619h;
                                    return new f0(z0Var2.f159927e, b1Var.f159620a);
                            }
                        }
                    };
                } else if (i15 == 2) {
                    final int i17 = 1;
                    aVar = new e23.a() { // from class: sk0.a1
                        @Override // e23.a
                        public final Object invoke() {
                            int i18 = i17;
                            b1 b1Var = this;
                            z0 z0Var2 = z0Var;
                            switch (i18) {
                                case 0:
                                    int i19 = b1.f159619h;
                                    return new s0(z0Var2.f159927e, z0Var2.f159928f, jk0.p.Active, b1Var.f159620a);
                                case 1:
                                    int i110 = b1.f159619h;
                                    return new s0(z0Var2.f159927e, z0Var2.f159929g, jk0.p.Retired, b1Var.f159620a);
                                default:
                                    int i24 = b1.f159619h;
                                    return new f0(z0Var2.f159927e, b1Var.f159620a);
                            }
                        }
                    };
                } else {
                    if (i15 != 3) {
                        lc.u0.r();
                        return null;
                    }
                    final int i18 = 2;
                    aVar = new e23.a() { // from class: sk0.a1
                        @Override // e23.a
                        public final Object invoke() {
                            int i19 = i18;
                            b1 b1Var = this;
                            z0 z0Var2 = z0Var;
                            switch (i19) {
                                case 0:
                                    int i110 = b1.f159619h;
                                    return new s0(z0Var2.f159927e, z0Var2.f159928f, jk0.p.Active, b1Var.f159620a);
                                case 1:
                                    int i111 = b1.f159619h;
                                    return new s0(z0Var2.f159927e, z0Var2.f159929g, jk0.p.Retired, b1Var.f159620a);
                                default:
                                    int i24 = b1.f159619h;
                                    return new f0(z0Var2.f159927e, b1Var.f159620a);
                            }
                        }
                    };
                }
                t2 t2Var = new t2(u2Var, null, aVar, 2, null);
                t13.g gVar = v1.a(this).f183565a;
                u53.d dVarA = o53.c0.a(gVar.plus(new e2(g8.i.G(gVar))));
                c1 c1Var2 = new c1(dVarA, r0Var, yc.o.a(t2Var.f196485a, dVarA));
                linkedHashMap2.put(bVar2, c1Var2);
                iVar = c1Var2.f159646c;
            }
            linkedHashMap.put(next, iVar);
        }
        return i53.a.g(linkedHashMap);
    }

    public final void z4() {
        Object value;
        ReentrantLock reentrantLock = this.f159624e;
        reentrantLock.lock();
        try {
            c2 c2Var = this.f159623d;
            if (c2Var == null || !c2Var.isActive()) {
                p2 p2Var = this.f159622c;
                do {
                    value = p2Var.getValue();
                } while (!p2Var.b(value, z0.a((z0) value, true, null, null, null, null, null, null, 254)));
                this.f159623d = ge1.b.T(v1.a(this), null, null, new d(null), 3);
                Unit unit = Unit.INSTANCE;
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lsk0/b1$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-gear_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
