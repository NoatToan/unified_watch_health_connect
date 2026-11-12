package ha0;

import e23.p;
import java.util.List;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.device.setup.presentation.customization.activities.SelectFavoriteActivitiesViewModel$sendAndCacheFavoriteActivities$1", f = "SelectFavoriteActivitiesViewModel.kt", l = {116}, m = "invokeSuspend", v = 2)
public final class j extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f82644a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k f82645b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ List<zf2.d> f82646c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public j(k kVar, List<? extends zf2.d> list, t13.d<? super j> dVar) {
        super(2, dVar);
        this.f82645b = kVar;
        this.f82646c = list;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new j(this.f82645b, this.f82646c, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((j) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f82644a;
        if (i14 == 0) {
            r.b(obj);
            k kVar = this.f82645b;
            xs.i iVar = kVar.f82649c;
            long j8 = kVar.f82647a;
            this.f82644a = 1;
            if (iVar.a(j8, this.f82646c, null, this) == aVar) {
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
