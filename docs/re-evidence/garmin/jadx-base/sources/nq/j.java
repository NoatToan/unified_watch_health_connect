package nq;

import androidx.lifecycle.y0;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.v2;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import e23.p;
import java.util.Iterator;
import java.util.List;
import o13.r;
import o53.b0;
import o72.t;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import ps.q1;
import r53.s;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.activities.stats.rounds.edit.RoundsViewModel$updateSummary$1", f = "RoundsViewModel.kt", l = {TsExtractor.TS_STREAM_TYPE_DTS}, m = "invokeSuspend", v = 2)
public final class j extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f126904a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f126905b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ k f126906c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ List<com.garmin.android.apps.connectmobile.repcounting.model.e> f126907d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ List<com.garmin.android.apps.connectmobile.repcounting.model.e> f126908e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ y0<fw.m<com.garmin.android.apps.connectmobile.activities.newmodel.f>> f126909f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.activities.newmodel.f f126910g;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/v2;", "", "result", "<anonymous>", "(Lcom/garmin/android/apps/connectmobile/v2;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.activities.stats.rounds.edit.RoundsViewModel$updateSummary$1$3", f = "RoundsViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends v13.i implements p<v2<? extends Unit>, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f126911a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ k f126912b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ b0 f126913c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ y0<fw.m<com.garmin.android.apps.connectmobile.activities.newmodel.f>> f126914d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ com.garmin.android.apps.connectmobile.activities.newmodel.f f126915e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(k kVar, b0 b0Var, y0<fw.m<com.garmin.android.apps.connectmobile.activities.newmodel.f>> y0Var, com.garmin.android.apps.connectmobile.activities.newmodel.f fVar, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f126912b = kVar;
            this.f126913c = b0Var;
            this.f126914d = y0Var;
            this.f126915e = fVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            a aVar = new a(this.f126912b, this.f126913c, this.f126914d, this.f126915e, dVar);
            aVar.f126911a = obj;
            return aVar;
        }

        @Override // e23.p
        public final Object invoke(v2<? extends Unit> v2Var, t13.d<? super Unit> dVar) {
            return ((a) create(v2Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            v2 v2Var = (v2) this.f126911a;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            r.b(obj);
            boolean z14 = v2Var instanceof v2.b;
            y0<fw.m<com.garmin.android.apps.connectmobile.activities.newmodel.f>> y0Var = this.f126914d;
            if (z14) {
                ((f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null)).T3(true);
                qd2.a aVarB = qd2.a.b();
                if (aVarB != null) {
                    aVarB.i(qd2.a.b.ACTIVITY_LIST);
                }
                qd2.a aVarB2 = qd2.a.b();
                if (aVarB2 != null) {
                    t.k(aVarB2.h(qd2.a.EnumC2721a.ACTIVITY_DETAILS, this.f126912b.f126916a));
                }
                i2.a aVar2 = i2.f36769a;
                a2 a2Var = a2.GENERAL;
                aVar2.getClass();
                i2.a.b(a2Var, "RoundsViewModel", "updateSummary%Success");
                fw.m.f73767e.getClass();
                y0Var.j(new fw.m<>(null, fw.p.SUCCESS, this.f126915e, null, 8, null));
            } else {
                i2.a aVar3 = i2.f36769a;
                a2 a2Var2 = a2.GENERAL;
                aVar3.getClass();
                i2.a.f(a2Var2, "RoundsViewModel", "updateSummary%failed to save data");
                y0Var.j(fw.m.a.b(fw.m.f73767e, new fw.i(), this.f126915e, 1));
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public j(k kVar, List<? extends com.garmin.android.apps.connectmobile.repcounting.model.e> list, List<? extends com.garmin.android.apps.connectmobile.repcounting.model.e> list2, y0<fw.m<com.garmin.android.apps.connectmobile.activities.newmodel.f>> y0Var, com.garmin.android.apps.connectmobile.activities.newmodel.f fVar, t13.d<? super j> dVar) {
        super(2, dVar);
        this.f126906c = kVar;
        this.f126907d = list;
        this.f126908e = list2;
        this.f126909f = y0Var;
        this.f126910g = fVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        j jVar = new j(this.f126906c, this.f126907d, this.f126908e, this.f126909f, this.f126910g, dVar);
        jVar.f126905b = obj;
        return jVar;
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((j) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        b0 b0Var = (b0) this.f126905b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f126904a;
        if (i14 == 0) {
            r.b(obj);
            k kVar = this.f126906c;
            am.m mVar = kVar.f126920e;
            long j8 = kVar.f126916a;
            List<com.garmin.android.apps.connectmobile.repcounting.model.e> list = this.f126907d;
            Iterator<T> it = list.iterator();
            double dDoubleValue = 0.0d;
            while (it.hasNext()) {
                Double D = ((com.garmin.android.apps.connectmobile.repcounting.model.e) it.next()).D();
                dDoubleValue += D != null ? D.doubleValue() : 0.0d;
            }
            List<com.garmin.android.apps.connectmobile.repcounting.model.e> list2 = this.f126908e;
            Iterator<T> it3 = list2.iterator();
            double dDoubleValue2 = 0.0d;
            while (it3.hasNext()) {
                Double D2 = ((com.garmin.android.apps.connectmobile.repcounting.model.e) it3.next()).D();
                dDoubleValue2 += D2 != null ? D2.doubleValue() : 0.0d;
            }
            r53.i<v2<Unit>> iVarD = mVar.d(j8, new ps.r(null, null, null, null, null, null, null, null, null, null, null, null, new q1(new Integer(list2.size()), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new Double(dDoubleValue), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new Double(dDoubleValue2), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new Integer(list.size()), null, null, null, null, null, null, null, null, null, null, -2, -67108865, -1, -1, -17, 16769023, null), null, null, null, null, null, 258047, null));
            a aVar2 = new a(this.f126906c, b0Var, this.f126909f, this.f126910g, null);
            this.f126905b = null;
            this.f126904a = 1;
            if (s.k(iVarD, aVar2, this) == aVar) {
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
