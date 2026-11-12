package m42;

import b63.o;
import c83.a0;
import e23.l;
import o13.r;
import o53.i0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.weighttracker.data.repository.WeightsRepository$deleteSelectedWeightAsync$result$1", f = "WeightsRepository.kt", l = {60}, m = "invokeSuspend", v = 2)
public final class f extends v13.i implements l<t13.d<? super a0<Unit>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f116622a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o f116623b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f116624c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(o oVar, long j8, t13.d<? super f> dVar) {
        super(1, dVar);
        this.f116623b = oVar;
        this.f116624c = j8;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new f(this.f116623b, this.f116624c, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super a0<Unit>> dVar) {
        return ((f) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f116622a;
        if (i14 != 0) {
            if (i14 == 1) {
                r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r.b(obj);
        i0<a0<Unit>> i0VarE = b.a.a(b.f116608a).e(fz0.d.a(this.f116623b), this.f116624c);
        this.f116622a = 1;
        Object objAwait = i0VarE.await(this);
        return objAwait == aVar ? aVar : objAwait;
    }
}
