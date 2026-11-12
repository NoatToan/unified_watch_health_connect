package ip;

import c83.a0;
import o13.r;
import o53.i0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "Lto/h;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.activities.privacy.ActivityPrivacyRepo$updatePastActivities$result$1", f = "ActivityPrivacyRepo.kt", l = {32}, m = "invokeSuspend", v = 2)
public final class e extends v13.i implements e23.l<t13.d<? super a0<to.h>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f94649a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f94650b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ to.h f94651c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, to.h hVar, t13.d<? super e> dVar) {
        super(1, dVar);
        this.f94650b = fVar;
        this.f94651c = hVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new e(this.f94650b, this.f94651c, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super a0<to.h>> dVar) {
        return ((e) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f94649a;
        if (i14 != 0) {
            if (i14 == 1) {
                r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r.b(obj);
        i0<a0<to.h>> i0VarL = this.f94650b.f94652a.l(this.f94651c);
        this.f94649a = 1;
        Object objAwait = i0VarL.await(this);
        return objAwait == aVar ? aVar : objAwait;
    }
}
