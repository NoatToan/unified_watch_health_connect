package jx2;

import com.garmin.proto.generated.SaMDEcg;
import com.garmin.samd.exception.GarminDeviceNotCapableException;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "Lcom/garmin/proto/generated/SaMDEcg$AppStatusResponse$ResponseStatus;", "<anonymous>", "(Lo53/b0;)Lcom/garmin/proto/generated/SaMDEcg$AppStatusResponse$ResponseStatus;"}, k = 3, mv = {1, 9, 0})
@v13.e(c = "com.garmin.samd.manager.SaMDDeviceManager$getECGAppStatus$2", f = "SaMDDeviceManager.kt", l = {197}, m = "invokeSuspend")
public final class m extends v13.i implements e23.p<b0, t13.d<? super SaMDEcg.AppStatusResponse.ResponseStatus>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f101570a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f101571b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f101572c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f101573d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(r rVar, long j8, String str, t13.d<? super m> dVar) {
        super(2, dVar);
        this.f101571b = rVar;
        this.f101572c = j8;
        this.f101573d = str;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new m(this.f101571b, this.f101572c, this.f101573d, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super SaMDEcg.AppStatusResponse.ResponseStatus> dVar) {
        return ((m) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) throws GarminDeviceNotCapableException {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f101570a;
        if (i14 != 0) {
            if (i14 == 1) {
                o13.r.b(obj);
                return obj;
            }
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        o13.r.b(obj);
        StringBuilder sb3 = new StringBuilder("getECGAppStatus: deviceUnitId ");
        long j8 = this.f101572c;
        sb3.append(j8);
        String string = sb3.toString();
        r rVar = this.f101571b;
        rVar.d().debug(string);
        px2.e eVarI = r.i(rVar, j8, this.f101573d, kx2.a.ECG);
        this.f101570a = 1;
        Enum enumD = eVarI.d(this);
        return enumD == aVar ? aVar : enumD;
    }
}
