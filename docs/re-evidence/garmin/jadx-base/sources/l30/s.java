package l30;

import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r53.p2;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u00002\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lr53/j;", "", "Lcom/garmin/android/apps/connectmobile/pacepro/data/dto/a;", "", "it", "", "<anonymous>", "(Lr53/j;Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.courses.presentation.automatic.CreateCourseViewModel$editCourseRelatedPacebands$4", f = "CreateCourseViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class s extends v13.i implements e23.q<r53.j<? super List<? extends com.garmin.android.apps.connectmobile.pacepro.data.dto.a>>, Throwable, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ z f109624a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(z zVar, t13.d<? super s> dVar) {
        super(3, dVar);
        this.f109624a = zVar;
    }

    @Override // e23.q
    public final Object invoke(r53.j<? super List<? extends com.garmin.android.apps.connectmobile.pacepro.data.dto.a>> jVar, Throwable th3, t13.d<? super Unit> dVar) {
        return new s(this.f109624a, dVar).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        p2 p2Var = this.f109624a.f109668w;
        p2Var.k(null, n30.f.a((n30.f) p2Var.getValue(), false, null, false, null, null, null, 0, false, null, null, 2044));
        return Unit.INSTANCE;
    }
}
