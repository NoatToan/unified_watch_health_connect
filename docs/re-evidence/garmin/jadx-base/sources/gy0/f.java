package gy0;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "Lgy0/l;", "<anonymous>", "(Lo53/b0;)Lgy0/l;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.multidayactivities.domain.DeleteEpicImagesUseCase$invoke$2", f = "DeleteEpicImagesUseCase.kt", l = {18}, m = "invokeSuspend", v = 2)
public final class f extends v13.i implements e23.p<o53.b0, t13.d<? super l>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f80140a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f80141b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ List<cy0.o> f80142c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g f80143d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f80144e;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "Lgy0/h;", "<anonymous>", "(Lo53/b0;)Lgy0/h;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.multidayactivities.domain.DeleteEpicImagesUseCase$invoke$2$deleteResults$1$1", f = "DeleteEpicImagesUseCase.kt", l = {18}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<o53.b0, t13.d<? super h>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f80145a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ g f80146b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f80147c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ cy0.o f80148d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(g gVar, String str, cy0.o oVar, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f80146b = gVar;
            this.f80147c = str;
            this.f80148d = oVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f80146b, this.f80147c, this.f80148d, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super h> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f80145a;
            if (i14 == 0) {
                o13.r.b(obj);
                this.f80145a = 1;
                Object objA = g.a(this.f80146b, this.f80147c, this.f80148d, this);
                return objA == aVar ? aVar : objA;
            }
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(List<cy0.o> list, g gVar, String str, t13.d<? super f> dVar) {
        super(2, dVar);
        this.f80142c = list;
        this.f80143d = gVar;
        this.f80144e = str;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        f fVar = new f(this.f80142c, this.f80143d, this.f80144e, dVar);
        fVar.f80141b = obj;
        return fVar;
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super l> dVar) {
        return ((f) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        o53.b0 b0Var = (o53.b0) this.f80141b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f80140a;
        if (i14 == 0) {
            o13.r.b(obj);
            List<cy0.o> list = this.f80142c;
            ArrayList arrayList = new ArrayList(p13.y.r(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(ge1.b.j(b0Var, null, null, new a(this.f80143d, this.f80144e, (cy0.o) it.next(), null), 3));
            }
            this.f80141b = null;
            this.f80140a = 1;
            obj = g8.i.o(arrayList, this);
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
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (h hVar : (List) obj) {
            if (hVar instanceof h.b) {
                arrayList2.add(((h.b) hVar).f80167a);
            } else {
                if (!(hVar instanceof h.a)) {
                    lc.u0.r();
                    return null;
                }
                arrayList3.add(((h.a) hVar).f80166a);
            }
        }
        return new l(arrayList2, arrayList3);
    }
}
