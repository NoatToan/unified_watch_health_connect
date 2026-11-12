package r41;

import c83.a0;
import e23.l;
import java.util.List;
import o13.r;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import v13.i;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lc83/a0;", "", "Lcom/garmin/android/apps/connectmobile/pacepro/data/dto/b;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.pacepro.data.repo.PaceProApiRepository$fetchPacebandsForUser$2", f = "PaceProApiRepository.kt", l = {32}, m = "invokeSuspend", v = 2)
public final class e extends i implements l<t13.d<? super a0<List<? extends com.garmin.android.apps.connectmobile.pacepro.data.dto.b>>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f150300a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a f150301b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Long f150302c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(a aVar, Long l14, t13.d<? super e> dVar) {
        super(1, dVar);
        this.f150301b = aVar;
        this.f150302c = l14;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new e(this.f150301b, this.f150302c, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super a0<List<? extends com.garmin.android.apps.connectmobile.pacepro.data.dto.b>>> dVar) {
        return ((e) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f150300a;
        if (i14 != 0) {
            if (i14 == 1) {
                r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r.b(obj);
        p41.a aVar2 = this.f150301b.f150290a;
        this.f150300a = 1;
        Object objC = aVar2.c(this.f150302c, this);
        return objC == aVar ? aVar : objC;
    }
}
