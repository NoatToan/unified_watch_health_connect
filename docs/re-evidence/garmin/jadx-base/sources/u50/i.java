package u50;

import com.garmin.android.apps.connectmobile.v2;
import e23.p;
import o13.r;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.h0;
import r53.p2;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/v2;", "", "result", "<anonymous>", "(Lcom/garmin/android/apps/connectmobile/v2;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.courses.presentation.search.CourseSearchViewModel$deleteCourse$1", f = "CourseSearchViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class i extends v13.i implements p<v2<? extends Unit>, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f168684a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f168685b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.courses.model.d f168686c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(h hVar, com.garmin.android.apps.connectmobile.courses.model.d dVar, t13.d<? super i> dVar2) {
        super(2, dVar2);
        this.f168685b = hVar;
        this.f168686c = dVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        i iVar = new i(this.f168685b, this.f168686c, dVar);
        iVar.f168684a = obj;
        return iVar;
    }

    @Override // e23.p
    public final Object invoke(v2<? extends Unit> v2Var, t13.d<? super Unit> dVar) {
        return ((i) create(v2Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        Object value;
        x50.f fVar;
        v2 v2Var = (v2) this.f168684a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        r.b(obj);
        if (v2Var instanceof v2.a) {
            h hVar = this.f168685b;
            p2 p2Var = hVar.f168672h;
            do {
                value = p2Var.getValue();
                fVar = (x50.f) value;
            } while (!p2Var.b(value, h.E4(x50.f.a(fVar, h0.D0(fVar.f189006a, this.f168686c), null, null, false, false, 0, false, 510))));
            hVar.x4(x50.c.e.f188991a);
        }
        return Unit.INSTANCE;
    }
}
