package kd0;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "Lwd2/h;", "<anonymous>", "(Lo53/b0;)Lwd2/h;"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.di.concrete.GarminDeviceDataDelegate$getGarminDeviceInfo$2", f = "LivetrackGcmDelegateImpl.kt", l = {}, m = "invokeSuspend", v = 2)
public final class u2 extends v13.i implements e23.p<o53.b0, t13.d<? super wd2.h>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f104384a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t2 f104385b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u2(long j8, t2 t2Var, t13.d<? super u2> dVar) {
        super(2, dVar);
        this.f104384a = j8;
        this.f104385b = t2Var;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new u2(this.f104384a, this.f104385b, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super wd2.h> dVar) {
        return ((u2) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        rd2.f.a().f152045a.getClass();
        long j8 = this.f104384a;
        wd2.h hVar = null;
        sd2.f fVarI = rd2.j.i(j8, null);
        if (fVarI != null) {
            long unitID = fVarI.getUnitID();
            String softwareVersion = fVarI.getSoftwareVersion();
            if (softwareVersion == null) {
                softwareVersion = "";
            }
            String partNumber = fVarI.getPartNumber();
            partNumber.getClass();
            hVar = new wd2.h(unitID, softwareVersion, partNumber);
            this.f104385b.f104372a.put(new Long(j8), hVar);
        }
        return hVar;
    }
}
