package ok0;

import androidx.lifecycle.v1;
import java.util.ArrayList;
import java.util.List;
import lc.u0;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.u1;
import r53.z1;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.gear.presentation.activity.ActivityDetailsGearFragmentViewModel$initCollector$1", f = "ActivityDetailsGearFragmentViewModel.kt", l = {117}, m = "invokeSuspend", v = 2)
public final class j extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f132489a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c80.b f132490b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g f132491c;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u00052\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lc80/c;", "info", "", "Lc80/t;", "events", "Lo13/p;", "<anonymous>", "(Lc80/c;Ljava/util/List;)Lo13/p;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.gear.presentation.activity.ActivityDetailsGearFragmentViewModel$initCollector$1$1", f = "ActivityDetailsGearFragmentViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.q<c80.c, List<? extends c80.t>, t13.d<? super o13.p<? extends c80.c, ? extends List<? extends c80.t>>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ c80.c f132492a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ List f132493b;

        public a(t13.d<? super a> dVar) {
            super(3, dVar);
        }

        @Override // e23.q
        public final Object invoke(c80.c cVar, List<? extends c80.t> list, t13.d<? super o13.p<? extends c80.c, ? extends List<? extends c80.t>>> dVar) {
            a aVar = new a(dVar);
            aVar.f132492a = cVar;
            aVar.f132493b = list;
            return aVar.invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            c80.c cVar = this.f132492a;
            List list = this.f132493b;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            return new o13.p(cVar, list);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class b<T> implements r53.j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ g f132494a;

        public b(g gVar) {
            this.f132494a = gVar;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // r53.j
        public final Object emit(Object obj, t13.d dVar) {
            z1<List<c80.t>> z1Var;
            List<c80.t> value;
            ArrayList arrayList;
            o13.p pVar = (o13.p) obj;
            c80.c cVar = (c80.c) pVar.f128594a;
            for (c80.t tVar : (List) pVar.f128595b) {
                if (!(tVar instanceof c80.t.a)) {
                    if (!p005kotlin.jvm.internal.s.g(tVar, c80.t.b.f25587a) && !p005kotlin.jvm.internal.s.g(tVar, c80.t.c.f25588a)) {
                        u0.r();
                        return null;
                    }
                } else if (cVar != null) {
                    boolean z14 = cVar.f25309b;
                    g gVar = this.f132494a;
                    if (z14) {
                        long j8 = ((c80.t.a) tVar).f25586a;
                        int i14 = g.f132470g;
                        c80.b bVarY4 = gVar.y4();
                        if (bVarY4 != null) {
                            ge1.b.T(v1.a(gVar), null, null, new h(bVarY4, gVar, j8, null), 3);
                        }
                    } else {
                        String str = cVar.f25312e;
                        if (str == null) {
                            str = "";
                        }
                        String str2 = str;
                        long j14 = ((c80.t.a) tVar).f25586a;
                        int i15 = g.f132470g;
                        c80.b bVarY5 = gVar.y4();
                        if (bVarY5 != null) {
                            ge1.b.T(v1.a(gVar), null, null, new i(bVarY5, gVar, j14, str2, null), 3);
                        }
                    }
                    c80.b bVarY6 = gVar.y4();
                    if (bVarY6 != null && (z1Var = bVarY6.f25297c) != null) {
                        do {
                            value = z1Var.getValue();
                            arrayList = new ArrayList();
                            for (T t7 : value) {
                                if (!p005kotlin.jvm.internal.s.g((c80.t) t7, tVar)) {
                                    arrayList.add(t7);
                                }
                            }
                        } while (!z1Var.b(value, arrayList));
                    }
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(c80.b bVar, g gVar, t13.d<? super j> dVar) {
        super(2, dVar);
        this.f132490b = bVar;
        this.f132491c = gVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new j(this.f132490b, this.f132491c, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((j) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f132489a;
        if (i14 == 0) {
            o13.r.b(obj);
            c80.b bVar = this.f132490b;
            u1 u1Var = new u1(bVar.f25295a, bVar.f25297c, new a(null));
            b bVar2 = new b(this.f132491c);
            this.f132489a = 1;
            if (u1Var.collect(bVar2, this) == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        return Unit.INSTANCE;
    }
}
