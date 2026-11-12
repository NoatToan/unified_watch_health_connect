package ro;

import am.x0;
import b63.i;
import b63.o;
import b63.q;
import b63.z;
import c80.n0;
import com.garmin.android.apps.connectmobile.activities.model.ActivityListItemDTO;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import o13.r;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.j;
import p13.h0;
import p13.j0;
import qw0.s;
import r53.c2;
import v13.e;
import vb.h;
import z70.a0;
import zd0.e0;
import zd0.l0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lro/a;", "Lde0/a;", "<init>", "()V", "a", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a implements de0.a {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ int f153725p = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Boolean f153726i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public List<? extends ActivityListItemDTO> f153727j = j0.f134944a;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final o f153728k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final o f153729l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final so.a f153730m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final a0 f153731n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final s f153732o;

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f153733a;

        static {
            int[] iArr = new int[x0.values().length];
            try {
                iArr[x0.D.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[x0.P.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[x0.I.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[x0.X.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[x0.O1.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[x0.L1.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            f153733a = iArr;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    @e(c = "com.garmin.android.apps.connectmobile.activities.map.domain.validators.PromosGCMaps3DValidatorImpl", f = "PromosGCMaps3DValidatorImpl.kt", l = {46}, m = "setup", v = 2)
    public static final class c extends v13.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public a f153734a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f153735b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f153737d;

        public c(t13.d<? super c> dVar) {
            super(dVar);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            this.f153735b = obj;
            this.f153737d |= Integer.MIN_VALUE;
            return a.this.c(this);
        }
    }

    static {
        new C2912a(null);
    }

    public a() {
        b63.a.C0229a c0229a = b63.a.C0229a.f16171a;
        z.INSTANCE.getClass();
        o oVarF = b63.b.f(c0229a, z.Companion.a());
        this.f153728k = oVarF;
        i.INSTANCE.getClass();
        this.f153729l = q.c(oVarF, 30, i.f16190d);
        this.f153730m = (so.a) KoinJavaComponent.get$default(so.a.class, null, null, 6, null);
        this.f153731n = (a0) KoinJavaComponent.get$default(a0.class, null, null, 6, null);
        this.f153732o = (s) KoinJavaComponent.get$default(s.class, null, null, 6, null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // zd0.e0
    public final Object c(t13.d<? super Unit> dVar) {
        c cVar;
        a aVar;
        if (dVar instanceof c) {
            cVar = (c) dVar;
            int i14 = cVar.f153737d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                cVar.f153737d = i14 - Integer.MIN_VALUE;
            } else {
                cVar = new c(dVar);
            }
        } else {
            cVar = new c(dVar);
        }
        Object objF = cVar.f153735b;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        int i15 = cVar.f153737d;
        if (i15 == 0) {
            r.b(objF);
            Boolean boolValueOf = Boolean.valueOf(this.f153732o.c());
            this.f153726i = boolValueOf;
            if (boolValueOf.equals(Boolean.TRUE)) {
                cVar.f153734a = this;
                cVar.f153737d = 1;
                objF = f(this.f153729l, this.f153728k, cVar);
                if (objF == aVar2) {
                    return aVar2;
                }
                aVar = this;
            }
            return Unit.INSTANCE;
        }
        if (i15 != 1) {
            h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        aVar = cVar.f153734a;
        r.b(objF);
        aVar.f153727j = (List) objF;
        return Unit.INSTANCE;
    }

    @Override // zd0.e0
    public final l0 d(n0 n0Var) {
        boolean z14;
        boolean z15;
        Boolean bool = n0Var.f25486k;
        if (bool == null) {
            return l0.SHOW;
        }
        boolean zBooleanValue = bool.booleanValue();
        a0 a0Var = this.f153731n;
        if (a0Var.a()) {
            return l0.SHOW;
        }
        Boolean bool2 = this.f153726i;
        if (bool2 == null) {
            return l0.HIDE;
        }
        boolean zBooleanValue2 = bool2.booleanValue();
        Iterator<T> it = this.f153727j.iterator();
        while (true) {
            z14 = false;
            if (it.hasNext()) {
                ActivityListItemDTO activityListItemDTO = (ActivityListItemDTO) it.next();
                if (!activityListItemDTO.f29302y) {
                    x0 x0Var = activityListItemDTO.f29265g;
                    switch (x0Var == null ? -1 : b.f153733a[x0Var.ordinal()]) {
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                            continue;
                        default:
                            a0Var.v(activityListItemDTO.f29250b);
                            a0Var.u(activityListItemDTO.f29265g.f4358a);
                            z15 = activityListItemDTO.f29298w;
                            break;
                    }
                }
            } else {
                z15 = false;
            }
        }
        if ((zBooleanValue || zBooleanValue2) && z15) {
            z14 = true;
        }
        return e0.b(z14);
    }

    @Override // zd0.e0
    public final String e() {
        Boolean bool = this.f153726i;
        if (p005kotlin.jvm.internal.s.g(bool, Boolean.TRUE)) {
            return "hasRecent3DCapableActivity: true";
        }
        return p005kotlin.jvm.internal.s.g(bool, Boolean.FALSE) ? "hasRecent3DCapableActivity: false" : "hasRecent3DCapableActivity: null";
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object f(o oVar, o oVar2, v13.c cVar) {
        ro.c cVar2;
        if (cVar instanceof ro.c) {
            cVar2 = (ro.c) cVar;
            int i14 = cVar2.f153740c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                cVar2.f153740c = i14 - Integer.MIN_VALUE;
            } else {
                cVar2 = new ro.c(this, cVar);
            }
        } else {
            cVar2 = new ro.c(this, cVar);
        }
        Object objM = cVar2.f153738a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = cVar2.f153740c;
        if (i15 == 0) {
            r.b(objM);
            c2 c2Var = new c2(new d(this, oVar, oVar2, null));
            cVar2.f153740c = 1;
            objM = r53.s.M(c2Var, new ArrayList(), cVar2);
            if (objM == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(objM);
        }
        return h0.N0((Iterable) objM, new ro.b());
    }

    /* JADX INFO: renamed from: ro.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lro/a$a;", "", "<init>", "()V", "", "DEFAULT_START", "I", "LIMIT_AT_ONCE", "DAY_LIMIT", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C2912a {
        public /* synthetic */ C2912a(j jVar) {
            this();
        }

        private C2912a() {
        }
    }
}
