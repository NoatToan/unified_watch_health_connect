package lx1;

import c83.a0;
import e23.l;
import ix1.h;
import o13.r;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import v13.i;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.training.stp.data.repo.STPRepoImpl$createStrengthTrainingPlan$2", f = "STPRepoImpl.kt", l = {271}, m = "invokeSuspend", v = 2)
public final class b extends i implements l<t13.d<? super a0<Unit>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f115212a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e f115213b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ h f115214c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(e eVar, h hVar, t13.d<? super b> dVar) {
        super(1, dVar);
        this.f115213b = eVar;
        this.f115214c = hVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new b(this.f115213b, this.f115214c, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super a0<Unit>> dVar) {
        return ((b) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f115212a;
        if (i14 != 0) {
            if (i14 == 1) {
                r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r.b(obj);
        jx1.a aVar2 = this.f115213b.f115262b;
        this.f115212a = 1;
        Object objB = aVar2.b(this.f115214c, this);
        return objB == aVar ? aVar : objB;
    }
}
