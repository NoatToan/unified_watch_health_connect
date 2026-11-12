package sy1;

import c83.a0;
import e23.l;
import java.util.List;
import my1.g;
import o13.r;
import o53.i0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import v13.e;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lc83/a0;", "", "Lmy1/g;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@e(c = "com.garmin.android.apps.connectmobile.traininginitiative.repo.SystemServiceRepo$getTimeZoneList$2", f = "SystemServiceRepo.kt", l = {29}, m = "invokeSuspend", v = 2)
public final class d extends i implements l<t13.d<? super a0<List<? extends g>>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f161294a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f161295b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(c cVar, t13.d<? super d> dVar) {
        super(1, dVar);
        this.f161295b = cVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new d(this.f161295b, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super a0<List<? extends g>>> dVar) {
        return ((d) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f161294a;
        if (i14 != 0) {
            if (i14 == 1) {
                r.b(obj);
                return obj;
            }
            h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r.b(obj);
        i0<a0<List<g>>> i0VarA = ((ky1.c) this.f161295b.f161293b.getValue()).a();
        this.f161294a = 1;
        Object objAwait = i0VarA.await(this);
        return objAwait == aVar ? aVar : objAwait;
    }
}
