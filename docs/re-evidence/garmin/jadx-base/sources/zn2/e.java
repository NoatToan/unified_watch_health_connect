package zn2;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "Lfo2/f;", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.feature.garminpay.providers.gpay.DeviceRegistrationRepo$deviceRegistrationStatusCheck$2", f = "DeviceRegistrationRepo.kt", l = {16}, m = "invokeSuspend", v = 2)
public final class e extends v13.i implements e23.l<t13.d<? super c83.a0<fo2.f>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f205486a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f205487b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f205488c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, long j8, t13.d<? super e> dVar) {
        super(1, dVar);
        this.f205487b = fVar;
        this.f205488c = j8;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new e(this.f205487b, this.f205488c, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super c83.a0<fo2.f>> dVar) {
        return ((e) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f205486a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        o53.i0<c83.a0<fo2.f>> i0VarA = this.f205487b.f205497a.a(this.f205488c);
        this.f205486a = 1;
        Object objAwait = i0VarA.await(this);
        return objAwait == aVar ? aVar : objAwait;
    }
}
