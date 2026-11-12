package v71;

import b63.o;
import c83.a0;
import java.util.List;
import o13.r;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lc83/a0;", "", "Ln61/i;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.performancescores.endurancescore.data.repository.StaminaReportRepoImpl$getStaminaReportForDay$2", f = "StaminaReportRepoImpl.kt", l = {15}, m = "invokeSuspend", v = 2)
public final class m extends v13.i implements e23.l<t13.d<? super a0<List<? extends n61.i>>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f176169a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n f176170b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ o f176171c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(n nVar, o oVar, t13.d<? super m> dVar) {
        super(1, dVar);
        this.f176170b = nVar;
        this.f176171c = oVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new m(this.f176170b, this.f176171c, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super a0<List<? extends n61.i>>> dVar) {
        return ((m) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f176169a;
        if (i14 != 0) {
            if (i14 == 1) {
                r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r.b(obj);
        u71.b bVar = this.f176170b.f176172a;
        fz0.c cVarA = fz0.d.a(this.f176171c);
        this.f176169a = 1;
        Object objA = bVar.a(cVarA, this);
        return objA == aVar ? aVar : objA;
    }
}
