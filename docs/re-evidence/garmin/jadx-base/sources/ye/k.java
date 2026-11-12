package ye;

import cf.t;
import e23.p;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.h0;
import p13.y;
import r53.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 1, 0})
@v13.e(c = "androidx.work.impl.constraints.WorkConstraintsTrackerKt$listen$1", f = "WorkConstraintsTracker.kt", l = {67}, m = "invokeSuspend")
public final class k extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f196806a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j f196807b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ t f196808c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g f196809d;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class a<T> implements r53.j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ g f196810a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ t f196811b;

        public a(g gVar, t tVar) {
            this.f196810a = gVar;
            this.f196811b = tVar;
        }

        @Override // r53.j
        public final Object emit(Object obj, t13.d dVar) {
            this.f196810a.d(this.f196811b, (b) obj);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(j jVar, t tVar, g gVar, t13.d<? super k> dVar) {
        super(2, dVar);
        this.f196807b = jVar;
        this.f196808c = tVar;
        this.f196809d = gVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new k(this.f196807b, this.f196808c, this.f196809d, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((k) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f196806a;
        if (i14 == 0) {
            r.b(obj);
            j jVar = this.f196807b;
            jVar.getClass();
            t tVar = this.f196808c;
            tVar.getClass();
            List<ze.e> list = jVar.f196805a;
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : list) {
                if (((ze.e) obj2).a(tVar)) {
                    arrayList.add(obj2);
                }
            }
            ArrayList arrayList2 = new ArrayList(y.r(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((ze.e) it.next()).b(tVar.f26950j));
            }
            r53.i iVarS = s.s(new i((r53.i[]) h0.b1(arrayList2).toArray(new r53.i[0])));
            a aVar2 = new a(this.f196809d, tVar);
            this.f196806a = 1;
            if (iVarS.collect(aVar2, this) == aVar) {
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
