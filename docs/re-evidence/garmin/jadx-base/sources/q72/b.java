package q72;

import androidx.lifecycle.u1;
import androidx.lifecycle.v1;
import b63.l;
import b63.o;
import b63.u;
import b63.z;
import ch.qos.logback.core.joran.action.Action;
import java.util.ArrayList;
import java.util.List;
import o13.p;
import o13.r;
import o53.b0;
import o53.m0;
import o53.s0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.j;
import p13.h0;
import vn2.t0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lq72/b;", "Landroidx/lifecycle/u1;", "<init>", "()V", "preview_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b extends u1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x82.a<p<u, l>> f143251a = new x82.a<>(v1.a(this), null, false, new x82.e(new a(null)), 4, null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v82.c<o82.a, p<o, l>> f143252b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final v82.c<o82.a, p<List<o>, l>> f143253c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final v82.c<o82.a, p<List<o>, l>> f143254d;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo13/p;", "Lb63/u;", "Lb63/l;", "<anonymous>", "()Lo13/p;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.ui.catalog.library.examples.templates.ReportsPagerExampleViewModel$currentPageState$1", f = "ReportsPagerExampleViewModel.kt", l = {30}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.l<t13.d<? super p<? extends u, ? extends l>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f143255a;

        /* JADX INFO: renamed from: q72.b$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lo53/b0;", "Lo13/p;", "Lb63/u;", "Lb63/l;", "<anonymous>", "(Lo53/b0;)Lo13/p;"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.android.apps.ui.catalog.library.examples.templates.ReportsPagerExampleViewModel$currentPageState$1$1", f = "ReportsPagerExampleViewModel.kt", l = {31}, m = "invokeSuspend", v = 2)
        public static final class C2695a extends v13.i implements e23.p<b0, t13.d<? super p<? extends u, ? extends l>>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f143256a;

            public C2695a(t13.d<? super C2695a> dVar) {
                super(2, dVar);
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new C2695a(dVar);
            }

            @Override // e23.p
            public final Object invoke(b0 b0Var, t13.d<? super p<? extends u, ? extends l>> dVar) {
                return new C2695a(dVar).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i14 = this.f143256a;
                if (i14 == 0) {
                    r.b(obj);
                    e53.c.a aVar2 = e53.c.f63094b;
                    long jE = e53.e.e(2, e53.f.SECONDS);
                    this.f143256a = 1;
                    if (m0.c(jE, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i14 != 1) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    r.b(obj);
                }
                l lVarA = b63.a.C0229a.f16171a.a();
                z.INSTANCE.getClass();
                return new p(b63.b.d(lVarA, z.Companion.a()), lVarA);
            }
        }

        public a(t13.d<? super a> dVar) {
            super(1, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(t13.d<?> dVar) {
            return new a(dVar);
        }

        @Override // e23.l
        public final Object invoke(t13.d<? super p<? extends u, ? extends l>> dVar) {
            return new a(dVar).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f143255a;
            if (i14 != 0) {
                if (i14 == 1) {
                    r.b(obj);
                    return obj;
                }
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
            x53.c cVar = s0.f129406a;
            x53.b bVar = x53.b.f189152a;
            C2695a c2695a = new C2695a(null);
            this.f143255a = 1;
            Object objE0 = ge1.b.e0(bVar, c2695a, this);
            return objE0 == aVar ? aVar : objE0;
        }
    }

    /* JADX INFO: renamed from: q72.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lo82/a;", Action.KEY_ATTRIBUTE, "Lo13/p;", "", "Lb63/o;", "Lb63/l;", "<anonymous>", "(Lo82/a;)Lo13/p;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.ui.catalog.library.examples.templates.ReportsPagerExampleViewModel$dailySummaryPageStateHolder$1", f = "ReportsPagerExampleViewModel.kt", l = {56}, m = "invokeSuspend", v = 2)
    public static final class C2696b extends v13.i implements e23.p<o82.a, t13.d<? super p<? extends List<? extends o>, ? extends l>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f143257a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f143258b;

        /* JADX INFO: renamed from: q72.b$b$a */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0004\u0012\u00020\u00040\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lo53/b0;", "Lo13/p;", "", "Lb63/o;", "Lb63/l;", "<anonymous>", "(Lo53/b0;)Lo13/p;"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.android.apps.ui.catalog.library.examples.templates.ReportsPagerExampleViewModel$dailySummaryPageStateHolder$1$1", f = "ReportsPagerExampleViewModel.kt", l = {57}, m = "invokeSuspend", v = 2)
        public static final class a extends v13.i implements e23.p<b0, t13.d<? super p<? extends List<? extends o>, ? extends l>>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f143259a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ o82.a f143260b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(o82.a aVar, t13.d<? super a> dVar) {
                super(2, dVar);
                this.f143260b = aVar;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new a(this.f143260b, dVar);
            }

            @Override // e23.p
            public final Object invoke(b0 b0Var, t13.d<? super p<? extends List<? extends o>, ? extends l>> dVar) {
                return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i14 = this.f143259a;
                if (i14 == 0) {
                    r.b(obj);
                    e53.c.a aVar2 = e53.c.f63094b;
                    long jE = e53.e.e(2, e53.f.SECONDS);
                    this.f143259a = 1;
                    if (m0.c(jE, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i14 != 1) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    r.b(obj);
                }
                o82.a aVar3 = this.f143260b;
                aVar3.getClass();
                ArrayList arrayList = new ArrayList();
                o82.d dVar = new o82.d(aVar3);
                while (dVar.hasNext()) {
                    arrayList.add((o) dVar.next());
                }
                return new p(h0.G0(arrayList), b63.a.C0229a.f16171a.a());
            }
        }

        public C2696b(t13.d<? super C2696b> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            C2696b c2696b = new C2696b(dVar);
            c2696b.f143258b = obj;
            return c2696b;
        }

        @Override // e23.p
        public final Object invoke(o82.a aVar, t13.d<? super p<? extends List<? extends o>, ? extends l>> dVar) {
            return ((C2696b) create(aVar, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            o82.a aVar = (o82.a) this.f143258b;
            u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f143257a;
            if (i14 != 0) {
                if (i14 == 1) {
                    r.b(obj);
                    return obj;
                }
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
            x53.c cVar = s0.f129406a;
            x53.b bVar = x53.b.f189152a;
            a aVar3 = new a(aVar, null);
            this.f143258b = null;
            this.f143257a = 1;
            Object objE0 = ge1.b.e0(bVar, aVar3, this);
            return objE0 == aVar2 ? aVar2 : objE0;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lo82/a;", Action.KEY_ATTRIBUTE, "Lo13/p;", "Lb63/o;", "Lb63/l;", "<anonymous>", "(Lo82/a;)Lo13/p;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.ui.catalog.library.examples.templates.ReportsPagerExampleViewModel$detailsPageStateHolder$1", f = "ReportsPagerExampleViewModel.kt", l = {43}, m = "invokeSuspend", v = 2)
    public static final class c extends v13.i implements e23.p<o82.a, t13.d<? super p<? extends o, ? extends l>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f143261a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f143262b;

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lo53/b0;", "Lo13/p;", "Lb63/o;", "Lb63/l;", "<anonymous>", "(Lo53/b0;)Lo13/p;"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.android.apps.ui.catalog.library.examples.templates.ReportsPagerExampleViewModel$detailsPageStateHolder$1$1", f = "ReportsPagerExampleViewModel.kt", l = {44}, m = "invokeSuspend", v = 2)
        public static final class a extends v13.i implements e23.p<b0, t13.d<? super p<? extends o, ? extends l>>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f143263a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ o82.a f143264b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(o82.a aVar, t13.d<? super a> dVar) {
                super(2, dVar);
                this.f143264b = aVar;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new a(this.f143264b, dVar);
            }

            @Override // e23.p
            public final Object invoke(b0 b0Var, t13.d<? super p<? extends o, ? extends l>> dVar) {
                return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i14 = this.f143263a;
                if (i14 == 0) {
                    r.b(obj);
                    e53.c.a aVar2 = e53.c.f63094b;
                    long jE = e53.e.e(2, e53.f.SECONDS);
                    this.f143263a = 1;
                    if (m0.c(jE, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i14 != 1) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    r.b(obj);
                }
                return new p(this.f143264b.f130843a, b63.a.C0229a.f16171a.a());
            }
        }

        public c(t13.d<? super c> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            c cVar = new c(dVar);
            cVar.f143262b = obj;
            return cVar;
        }

        @Override // e23.p
        public final Object invoke(o82.a aVar, t13.d<? super p<? extends o, ? extends l>> dVar) {
            return ((c) create(aVar, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            o82.a aVar = (o82.a) this.f143262b;
            u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f143261a;
            if (i14 != 0) {
                if (i14 == 1) {
                    r.b(obj);
                    return obj;
                }
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
            x53.c cVar = s0.f129406a;
            x53.b bVar = x53.b.f189152a;
            a aVar3 = new a(aVar, null);
            this.f143262b = null;
            this.f143261a = 1;
            Object objE0 = ge1.b.e0(bVar, aVar3, this);
            return objE0 == aVar2 ? aVar2 : objE0;
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lo82/a;", Action.KEY_ATTRIBUTE, "Lo13/p;", "", "Lb63/o;", "Lb63/l;", "<anonymous>", "(Lo82/a;)Lo13/p;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.ui.catalog.library.examples.templates.ReportsPagerExampleViewModel$weeklySummaryPageStateHolder$1", f = "ReportsPagerExampleViewModel.kt", l = {69}, m = "invokeSuspend", v = 2)
    public static final class d extends v13.i implements e23.p<o82.a, t13.d<? super p<? extends List<? extends o>, ? extends l>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f143265a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f143266b;

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0004\u0012\u00020\u00040\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lo53/b0;", "Lo13/p;", "", "Lb63/o;", "Lb63/l;", "<anonymous>", "(Lo53/b0;)Lo13/p;"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.android.apps.ui.catalog.library.examples.templates.ReportsPagerExampleViewModel$weeklySummaryPageStateHolder$1$1", f = "ReportsPagerExampleViewModel.kt", l = {70}, m = "invokeSuspend", v = 2)
        public static final class a extends v13.i implements e23.p<b0, t13.d<? super p<? extends List<? extends o>, ? extends l>>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f143267a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ o82.a f143268b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(o82.a aVar, t13.d<? super a> dVar) {
                super(2, dVar);
                this.f143268b = aVar;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new a(this.f143268b, dVar);
            }

            @Override // e23.p
            public final Object invoke(b0 b0Var, t13.d<? super p<? extends List<? extends o>, ? extends l>> dVar) {
                return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i14 = this.f143267a;
                if (i14 == 0) {
                    r.b(obj);
                    e53.c.a aVar2 = e53.c.f63094b;
                    long jE = e53.e.e(2, e53.f.SECONDS);
                    this.f143267a = 1;
                    if (m0.c(jE, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i14 != 1) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    r.b(obj);
                }
                o82.a aVar3 = this.f143268b;
                aVar3.getClass();
                ArrayList arrayList = new ArrayList();
                o82.d dVar = new o82.d(aVar3);
                while (dVar.hasNext()) {
                    arrayList.add((o) dVar.next());
                }
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : arrayList) {
                    if (b63.p.a(aVar3.f130843a, (o) obj2) % 7 == 0) {
                        arrayList2.add(obj2);
                    }
                }
                return new p(h0.G0(arrayList2), b63.a.C0229a.f16171a.a());
            }
        }

        public d(t13.d<? super d> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            d dVar2 = new d(dVar);
            dVar2.f143266b = obj;
            return dVar2;
        }

        @Override // e23.p
        public final Object invoke(o82.a aVar, t13.d<? super p<? extends List<? extends o>, ? extends l>> dVar) {
            return ((d) create(aVar, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            o82.a aVar = (o82.a) this.f143266b;
            u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f143265a;
            if (i14 != 0) {
                if (i14 == 1) {
                    r.b(obj);
                    return obj;
                }
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
            x53.c cVar = s0.f129406a;
            x53.b bVar = x53.b.f189152a;
            a aVar3 = new a(aVar, null);
            this.f143266b = null;
            this.f143265a = 1;
            Object objE0 = ge1.b.e0(bVar, aVar3, this);
            return objE0 == aVar2 ? aVar2 : objE0;
        }
    }

    public b() {
        j jVar = null;
        w9.a aVarA = v1.a(this);
        boolean z14 = false;
        int i14 = 2;
        x82.c.a aVar = new x82.c.a(jVar, z14, i14, jVar);
        x82.h.a aVar2 = x82.h.D0;
        c cVar = new c(null);
        aVar2.getClass();
        this.f143252b = new v82.c<>(new x82.c(aVarA, aVar, new t0(cVar)));
        this.f143253c = new v82.c<>(new x82.c(v1.a(this), new x82.c.a(jVar, z14, i14, jVar), new t0(new C2696b(null))));
        this.f143254d = new v82.c<>(new x82.c(v1.a(this), new x82.c.a(jVar, z14, i14, jVar), new t0(new d(null))));
    }
}
