package a61;

import java.util.ArrayList;
import java.util.Set;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lc53/l;", "Lcom/garmin/android/apps/connectmobile/performance/dto/c;", "", "<anonymous>", "(Lc53/l;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.performance.StrengthStatsActivity$generateExerciseFilterPickItemInput$entries$1$allAvailableExerciseKeys$1", f = "StrengthStatsActivity.kt", l = {226, 227}, m = "invokeSuspend", v = 2)
public final class j extends v13.h implements e23.p<c53.l<? super com.garmin.android.apps.connectmobile.performance.dto.c>, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f1611a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f1612b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Set<com.garmin.android.apps.connectmobile.performance.dto.c> f1613c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p71.f f1614d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(Set<com.garmin.android.apps.connectmobile.performance.dto.c> set, p71.f fVar, t13.d<? super j> dVar) {
        super(2, dVar);
        this.f1613c = set;
        this.f1614d = fVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        j jVar = new j(this.f1613c, this.f1614d, dVar);
        jVar.f1612b = obj;
        return jVar;
    }

    @Override // e23.p
    public final Object invoke(c53.l<? super com.garmin.android.apps.connectmobile.performance.dto.c> lVar, t13.d<? super Unit> dVar) {
        return ((j) create(lVar, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0080, code lost:
    
        if (r0.a(r9, r8) == r1) goto L29;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object objB;
        c53.l lVar = (c53.l) this.f1612b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f1611a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
            } else {
                if (i14 != 2) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            return Unit.INSTANCE;
        }
        o13.r.b(obj);
        Set<com.garmin.android.apps.connectmobile.performance.dto.c> set = this.f1613c;
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : set) {
            if (!((com.garmin.android.apps.connectmobile.performance.dto.c) obj2).f39883a.equalsIgnoreCase("Unknown")) {
                arrayList.add(obj2);
            }
        }
        this.f1612b = lVar;
        this.f1611a = 1;
        lVar.getClass();
        if (arrayList.isEmpty() || (objB = lVar.b(arrayList.iterator(), this)) != u13.a.COROUTINE_SUSPENDED) {
            objB = Unit.INSTANCE;
        }
        if (objB != aVar) {
        }
        return aVar;
        p71.f fVar = this.f1614d;
        if (fVar instanceof p71.b) {
            com.garmin.android.apps.connectmobile.performance.dto.c cVar = ((p71.b) fVar).f136303a;
            this.f1612b = null;
            this.f1611a = 2;
        }
        return Unit.INSTANCE;
    }
}
