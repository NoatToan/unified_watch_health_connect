package lw;

import c83.a0;
import e23.l;
import o13.r;
import o53.i0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import v13.i;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lc83/a0;", "", "<anonymous>", "()Lc83/a0;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.blood_pressure.data.repository.BloodPressureRepositoryImpl$updateBloodPressureNotesAsync$2", f = "BloodPressureRepositoryImpl.kt", l = {28}, m = "invokeSuspend", v = 2)
public final class h extends i implements l<t13.d<? super a0<Unit>>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f115071a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f115072b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ pw.a f115073c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(c cVar, pw.a aVar, t13.d<? super h> dVar) {
        super(1, dVar);
        this.f115072b = cVar;
        this.f115073c = aVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(t13.d<?> dVar) {
        return new h(this.f115072b, this.f115073c, dVar);
    }

    @Override // e23.l
    public final Object invoke(t13.d<? super a0<Unit>> dVar) {
        return ((h) create(dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f115071a;
        if (i14 != 0) {
            if (i14 == 1) {
                r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r.b(obj);
        i0<a0<Unit>> i0VarC = this.f115072b.f115055a.c(this.f115073c);
        this.f115071a = 1;
        Object objAwait = i0VarC.await(this);
        return objAwait == aVar ? aVar : objAwait;
    }
}
