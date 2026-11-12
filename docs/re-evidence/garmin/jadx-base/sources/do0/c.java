package do0;

import c83.a0;
import e23.l;
import o13.r;
import o53.i0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import v13.i;
import vb.h;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.heartrate.data.repository.HeartRateRepository$deleteSelectedAbnormalHR$2", f = "HeartRateRepository.kt", l = {31}, m = "invokeSuspend", v = 2)
public final class c extends i implements l<t13.d<? super a0<Unit>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f60572a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f60573b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f60574c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(f fVar, String str, t13.d<? super c> dVar) {
        super(1, dVar);
        this.f60573b = fVar;
        this.f60574c = str;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new c(this.f60573b, this.f60574c, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super a0<Unit>> dVar) {
        return ((c) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f60572a;
        if (i14 != 0) {
            if (i14 == 1) {
                r.b(obj);
                return obj;
            }
            h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r.b(obj);
        i0<a0<Unit>> i0VarC = this.f60573b.f60583a.c(this.f60574c);
        this.f60572a = 1;
        Object objAwait = i0VarC.await(this);
        return objAwait == aVar ? aVar : objAwait;
    }
}
