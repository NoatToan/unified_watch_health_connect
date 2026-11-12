package lw;

import c83.a0;
import e23.l;
import o13.r;
import o53.i0;
import org.joda.time.DateTime;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import v13.i;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.blood_pressure.data.repository.BloodPressureRepositoryImpl$deleteBloodPressureForDateAsync$2", f = "BloodPressureRepositoryImpl.kt", l = {32}, m = "invokeSuspend", v = 2)
public final class e extends i implements l<t13.d<? super a0<Unit>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f115059a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f115060b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ DateTime f115061c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f115062d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(c cVar, DateTime dateTime, long j8, t13.d<? super e> dVar) {
        super(1, dVar);
        this.f115060b = cVar;
        this.f115061c = dateTime;
        this.f115062d = j8;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new e(this.f115060b, this.f115061c, this.f115062d, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super a0<Unit>> dVar) {
        return ((e) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f115059a;
        if (i14 != 0) {
            if (i14 == 1) {
                r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r.b(obj);
        i0<a0<Unit>> i0VarD = this.f115060b.f115055a.d(fz0.d.b(this.f115061c), this.f115062d);
        this.f115059a = 1;
        Object objAwait = i0VarD.await(this);
        return objAwait == aVar ? aVar : objAwait;
    }
}
