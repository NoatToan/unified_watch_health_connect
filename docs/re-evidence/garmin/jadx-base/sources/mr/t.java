package mr;

import am.w0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo53/b0;", "", "Lmr/p;", "<anonymous>", "(Lo53/b0;)Ljava/util/List;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.activity.details.domain.GetActivityEpicsUseCase$invoke$2", f = "GetActivityEpicsUseCase.kt", l = {33}, m = "invokeSuspend", v = 2)
public final class t extends v13.i implements e23.p<o53.b0, t13.d<? super List<? extends p>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f120306a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f120307b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ List<ir.f> f120308c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ q f120309d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f120310e;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "Lmr/p;", "<anonymous>", "(Lo53/b0;)Lmr/p;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.activity.details.domain.GetActivityEpicsUseCase$invoke$2$1$1", f = "GetActivityEpicsUseCase.kt", l = {23}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements e23.p<o53.b0, t13.d<? super p>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f120311a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ q f120312b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f120313c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f120314d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ ir.f f120315e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(q qVar, String str, String str2, ir.f fVar, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f120312b = qVar;
            this.f120313c = str;
            this.f120314d = str2;
            this.f120315e = fVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f120312b, this.f120313c, this.f120314d, this.f120315e, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super p> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            Double dB;
            Double dB2;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f120311a;
            q qVar = this.f120312b;
            if (i14 == 0) {
                o13.r.b(obj);
                this.f120311a = 1;
                obj = q.a(qVar, this.f120313c, this.f120314d, this);
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
            w0 w0Var = (w0) obj;
            ir.f fVar = this.f120315e;
            return new p(this.f120313c, fVar.getName(), fVar.getStartDate(), fVar.getEndDate(), (w0Var == null || (dB2 = q.b(qVar, w0Var, "distance")) == null) ? null : new Double(dB2.doubleValue() / 100.0d), (w0Var == null || (dB = q.b(qVar, w0Var, "duration")) == null) ? null : new Double(dB.doubleValue() / 1000.0d));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(List<ir.f> list, q qVar, String str, t13.d<? super t> dVar) {
        super(2, dVar);
        this.f120308c = list;
        this.f120309d = qVar;
        this.f120310e = str;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        t tVar = new t(this.f120308c, this.f120309d, this.f120310e, dVar);
        tVar.f120307b = obj;
        return tVar;
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super List<? extends p>> dVar) {
        return ((t) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        String uuid;
        o53.b0 b0Var = (o53.b0) this.f120307b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f120306a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = this.f120308c.iterator();
        while (true) {
            o53.j0 j0VarJ = null;
            if (!it.hasNext()) {
                break;
            }
            ir.f fVar = (ir.f) it.next();
            ir.g uuid2 = fVar.getUuid();
            if (uuid2 != null && (uuid = uuid2.getUuid()) != null) {
                j0VarJ = ge1.b.j(b0Var, null, null, new a(this.f120309d, uuid, this.f120310e, fVar, null), 3);
            }
            if (j0VarJ != null) {
                arrayList.add(j0VarJ);
            }
        }
        this.f120307b = null;
        this.f120306a = 1;
        Object objO = g8.i.o(arrayList, this);
        return objO == aVar ? aVar : objO;
    }
}
