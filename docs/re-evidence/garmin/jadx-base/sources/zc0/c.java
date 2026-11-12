package zc0;

import androidx.lifecycle.u1;
import androidx.lifecycle.v1;
import e23.p;
import hv.j;
import java.util.ArrayList;
import java.util.List;
import o13.r;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.h0;
import p13.j0;
import r53.b2;
import r53.k2;
import r53.p2;
import r53.q2;
import r53.s;
import r53.v;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lzc0/c;", "Landroidx/lifecycle/u1;", "Laa0/b;", "animationHolderProvider", "<init>", "(Laa0/b;)V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c extends u1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final aa0.b f203926a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p2 f203927b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b2 f203928c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p2 f203929d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final p2 f203930e;

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f203931a;

        static {
            int[] iArr = new int[ub0.a.values().length];
            try {
                iArr[ub0.a.PLAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ub0.a.PAUSE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ub0.a.RESUME.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f203931a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lzc0/a;", "wrapper", "Lzc0/f;", "<anonymous>", "(Lzc0/a;)Lzc0/f;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.devices.settings.tutorials.DeviceTutorialsViewModel$tutorialUiState$1", f = "DeviceTutorialsViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class b extends i implements p<zc0.a, t13.d<? super f>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f203932a;

        public b(t13.d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            b bVar = c.this.new b(dVar);
            bVar.f203932a = obj;
            return bVar;
        }

        @Override // e23.p
        public final Object invoke(zc0.a aVar, t13.d<? super f> dVar) {
            return ((b) create(aVar, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r4v0, types: [p13.j0] */
        /* JADX WARN: Type inference failed for: r4v1, types: [java.util.List] */
        /* JADX WARN: Type inference failed for: r4v2, types: [java.util.ArrayList] */
        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            ?? arrayList;
            ba0.a aVarA;
            zc0.a aVar = (zc0.a) this.f203932a;
            u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
            r.b(obj);
            aa0.d dVar = aVar != null ? aVar.f203922a : null;
            boolean z14 = dVar == null;
            if (dVar != null) {
                c.this.getClass();
                int size = dVar.f2199g.f2190a.f2189c.size();
                arrayList = new ArrayList(size);
                for (int i14 = 0; i14 < size; i14++) {
                    List<j> listB = dVar.b(i14);
                    j jVar = listB != null ? (j) h0.d0(listB) : null;
                    if (jVar != null) {
                        String comment = jVar.getComment();
                        if (comment == null) {
                            comment = "";
                        }
                        aVarA = dVar.a(comment);
                    } else {
                        aVarA = null;
                    }
                    arrayList.add(new ad0.j(aVarA != null ? aVarA.f16966b : null, i14));
                }
            } else {
                arrayList = j0.f134944a;
            }
            return new f(false, z14, arrayList);
        }
    }

    /* JADX INFO: renamed from: zc0.c$c, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lr53/j;", "Lzc0/f;", "", "<anonymous>", "(Lr53/j;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.devices.settings.tutorials.DeviceTutorialsViewModel$tutorialUiState$2", f = "DeviceTutorialsViewModel.kt", l = {49}, m = "invokeSuspend", v = 2)
    public static final class C3803c extends i implements p<r53.j<? super f>, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f203934a;

        public C3803c(t13.d<? super C3803c> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return c.this.new C3803c(dVar);
        }

        @Override // e23.p
        public final Object invoke(r53.j<? super f> jVar, t13.d<? super Unit> dVar) {
            return ((C3803c) create(jVar, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f203934a;
            if (i14 == 0) {
                r.b(obj);
                this.f203934a = 1;
                if (c.x4(c.this, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            return Unit.INSTANCE;
        }
    }

    public c(aa0.b bVar) {
        bVar.getClass();
        this.f203926a = bVar;
        p2 p2VarA = q2.a(null);
        this.f203927b = p2VarA;
        this.f203928c = s.K(new v(new C3803c(null), s.D(p2VarA, new b(null))), v1.a(this), k2.a.a(k2.f150703a, 2), new f(true, false, j0.f134944a, 2, null));
        p2 p2VarA2 = q2.a(null);
        this.f203929d = p2VarA2;
        this.f203930e = p2VarA2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public static final Object x4(c cVar, v13.c cVar2) {
        d dVar;
        Object value;
        Object value2;
        zc0.a aVar;
        p2 p2Var = cVar.f203927b;
        if (cVar2 instanceof d) {
            dVar = (d) cVar2;
            int i14 = dVar.f203938c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                dVar.f203938c = i14 - Integer.MIN_VALUE;
            } else {
                dVar = new d(cVar, cVar2);
            }
        } else {
            dVar = new d(cVar, cVar2);
        }
        Object objA = dVar.f203936a;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        int i15 = dVar.f203938c;
        try {
            if (i15 == 0) {
                r.b(objA);
                aa0.b bVar = cVar.f203926a;
                dVar.f203938c = 1;
                objA = bVar.a(dVar);
                if (objA == aVar2) {
                    return aVar2;
                }
            } else {
                if (i15 != 1) {
                    h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(objA);
            }
            aa0.d dVar2 = (aa0.d) objA;
            do {
                value2 = p2Var.getValue();
                if (dVar2 != null) {
                    aVar = new zc0.a(dVar2, dVar2.f2199g.f2191b + "_0");
                } else {
                    aVar = null;
                }
            } while (!p2Var.b(value2, aVar));
        } catch (Exception unused) {
            do {
                value = p2Var.getValue();
            } while (!p2Var.b(value, null));
        }
        return Unit.INSTANCE;
    }
}
