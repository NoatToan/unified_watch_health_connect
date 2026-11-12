package i31;

import android.text.format.DateUtils;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.h0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lr53/j;", "", "Ld31/a;", "", "<anonymous>", "(Lr53/j;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.onboarding.domain.GetDeviceOnboardingHomeItemsUseCase$invoke$1$1", f = "GetDeviceOnboardingHomeItemsUseCase.kt", l = {55}, m = "invokeSuspend", v = 2)
public final class h extends v13.i implements e23.p<r53.j<? super List<? extends d31.a>>, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public f f90690a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Set f90691b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f90692c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public /* synthetic */ Object f90693d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ f f90694e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(f fVar, t13.d<? super h> dVar) {
        super(2, dVar);
        this.f90694e = fVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        h hVar = new h(this.f90694e, dVar);
        hVar.f90693d = obj;
        return hVar;
    }

    @Override // e23.p
    public final Object invoke(r53.j<? super List<? extends d31.a>> jVar, t13.d<? super Unit> dVar) {
        return ((h) create(jVar, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        Set<Long> setG1;
        f fVar;
        Object obj2;
        Set<Long> set;
        r53.j jVar = (r53.j) this.f90693d;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f90692c;
        if (i14 == 0) {
            o13.r.b(obj);
            f fVar2 = this.f90694e;
            if (!DateUtils.isToday(fVar2.f90671b.n())) {
                a2 a2Var = a2.ONBOARDING;
                i2.f36769a.getClass();
                i2.a.b(a2Var, "GetDeviceOnboardingHomeItemsUseCase", "Fetching device onboarding items from server.");
                ArrayList arrayListE = rd2.j.e();
                if (arrayListE != null) {
                    ArrayList arrayList = new ArrayList(p13.y.r(arrayListE, 10));
                    Iterator it = arrayListE.iterator();
                    while (it.hasNext()) {
                        q6.f.s(((sd2.f) it.next()).getUnitID(), arrayList);
                    }
                    ArrayList arrayList2 = arrayList.isEmpty() ? null : arrayList;
                    if (arrayList2 != null && (setG1 = h0.g1(arrayList2)) != null) {
                        c cVar = fVar2.f90672c;
                        this.f90693d = jVar;
                        this.f90690a = fVar2;
                        this.f90691b = setG1;
                        this.f90692c = 1;
                        Object objA = cVar.a("GetDeviceOnboardingHomeItemsUseCase", setG1, this);
                        if (objA == aVar) {
                            return aVar;
                        }
                        fVar = fVar2;
                        obj2 = objA;
                        set = setG1;
                    }
                }
            }
            a2 a2Var2 = a2.ONBOARDING;
            i2.f36769a.getClass();
            i2.a.b(a2Var2, "GetDeviceOnboardingHomeItemsUseCase", "Loading device onboarding items from database.");
            return Unit.INSTANCE;
        }
        if (i14 != 1) {
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        set = this.f90691b;
        fVar = this.f90690a;
        o13.r.b(obj);
        obj2 = ((o13.q) obj).f128597a;
        int i15 = o13.q.f128596b;
        if (!(obj2 instanceof o13.q.b)) {
            fVar.f90671b.h(System.currentTimeMillis(), set);
        }
        o13.q.a(obj2);
        a2 a2Var3 = a2.ONBOARDING;
        i2.f36769a.getClass();
        i2.a.b(a2Var3, "GetDeviceOnboardingHomeItemsUseCase", "Loading device onboarding items from database.");
        return Unit.INSTANCE;
    }
}
