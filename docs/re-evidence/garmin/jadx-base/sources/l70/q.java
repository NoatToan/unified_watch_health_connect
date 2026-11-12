package l70;

import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, d2 = {"R", "T", "Lr53/j;", "it", "", "<anonymous>"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.dashboard.data.repository.DashboardRepositoryImpl$fetchCommonStats$$inlined$flatMapLatest$1", f = "DashboardRepositoryImpl.kt", l = {PsExtractor.PRIVATE_STREAM_1}, m = "invokeSuspend", v = 2)
public final class q extends v13.i implements e23.q<r53.j<? super j70.k.f>, s, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f110762a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ r53.j f110763b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f110764c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e f110765d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f110766e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(t13.d dVar, e eVar, boolean z14) {
        super(3, dVar);
        this.f110765d = eVar;
        this.f110766e = z14;
    }

    @Override // e23.q
    public final Object invoke(r53.j<? super j70.k.f> jVar, s sVar, t13.d<? super Unit> dVar) {
        q qVar = new q(dVar, this.f110765d, this.f110766e);
        qVar.f110763b = jVar;
        qVar.f110764c = sVar;
        return qVar.invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        List<j70.b> list;
        List<j70.b> listC0;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f110762a;
        if (i14 == 0) {
            o13.r.b(obj);
            r53.j jVar = this.f110763b;
            s sVar = (s) this.f110764c;
            i2.f36769a.getClass();
            i2.a.b(a2.DASHBOARD, "DashboardRepository", "fetchSecondaryStats() fetchData[" + sVar + "]");
            if (this.f110766e) {
                List listS0 = sVar.f110779c;
                List<j70.v> list2 = sVar.f110777a;
                if (listS0 == null) {
                    listS0 = p13.j0.f134944a;
                }
                if (listS0.isEmpty()) {
                    Iterable iterable = sVar.f110781e;
                    if (iterable == null) {
                        iterable = p13.j0.f134944a;
                    }
                    listS0 = p13.h0.S0(iterable, 4);
                }
                if (list2 == null || !list2.contains(new j70.v(o70.f.SECONDARY_STATS.f129989a))) {
                    listS0 = null;
                }
                if (listS0 == null) {
                    listS0 = p13.j0.f134944a;
                }
                List<j70.b> list3 = sVar.f110782f;
                if (list2 == null || !list2.contains(new j70.v(o70.f.YESTERDAY.f129989a))) {
                    list3 = null;
                }
                if (list3 == null) {
                    list3 = p13.j0.f134944a;
                }
                List<j70.b> list4 = sVar.f110783g;
                if (list2 == null || !list2.contains(new j70.v(o70.f.LAST_SEVEN_DAYS.f129989a))) {
                    list4 = null;
                }
                if (list4 == null) {
                    list4 = p13.j0.f134944a;
                }
                listC0 = p13.h0.C0(p13.h0.C0(listS0, list3), list4);
            } else {
                Collection collection = sVar.f110779c;
                if (collection == null) {
                    collection = p13.j0.f134944a;
                }
                Iterable iterable2 = sVar.f110780d;
                if (iterable2 == null) {
                    iterable2 = p13.j0.f134944a;
                }
                ArrayList arrayListC0 = p13.h0.C0(collection, iterable2);
                boolean zIsEmpty = arrayListC0.isEmpty();
                listC0 = arrayListC0;
                if (zIsEmpty && (list = sVar.f110781e) == null) {
                    listC0 = list;
                    listC0 = p13.j0.f134944a;
                }
            }
            listC0 = list;
            Set<o70.o> setD = j70.g.d(sVar.f110778b);
            Set<o70.t> setE = j70.g.e(listC0);
            Set<o70.i> setC = j70.g.c(sVar.f110784h);
            Set<o70.f> setF = j70.g.f(sVar.f110777a);
            e eVar = this.f110765d;
            t tVar = new t(eVar.f110619e.b(new j70.h(setF, setD, setE, setC)), setE, eVar, setD);
            this.f110763b = null;
            this.f110764c = null;
            this.f110762a = 1;
            if (r53.s.v(jVar, tVar, this) == aVar) {
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
