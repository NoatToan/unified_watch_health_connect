package jx2;

import o53.b0;
import org.json.JSONObject;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "Lkx2/d;", "<anonymous>", "(Lo53/b0;)Lkx2/d;"}, k = 3, mv = {1, 9, 0})
@v13.e(c = "com.garmin.samd.manager.SaMDDeviceManager$getCapabilities$2", f = "SaMDDeviceManager.kt", l = {}, m = "invokeSuspend")
public final class l extends v13.i implements e23.p<b0, t13.d<? super kx2.d>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r f101568a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f101569b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(r rVar, long j8, t13.d<? super l> dVar) {
        super(2, dVar);
        this.f101568a = rVar;
        this.f101569b = j8;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new l(this.f101568a, this.f101569b, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super kx2.d> dVar) {
        return ((l) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        kx2.d dVar;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        this.f101568a.getClass();
        qx2.a aVar2 = qx2.a.f148445a;
        long j8 = this.f101569b;
        synchronized (aVar2) {
            try {
                String strB = aVar2.b(qx2.b.DEVICE_SAMD_CAPABILITIES, j8);
                kx2.d.a aVar3 = kx2.d.f107128d;
                dVar = null;
                String string = qx2.a.f().getString(strB, null);
                aVar3.getClass();
                if (string != null) {
                    try {
                        JSONObject jSONObject = new JSONObject(string);
                        dVar = new kx2.d(jSONObject.getBoolean("isEmbeddedHealthTokenSupported"), jSONObject.getBoolean("isEcgSupported"), jSONObject.getBoolean("isFileTransferSupported"));
                    } catch (Throwable th3) {
                        ge1.b.L("SaMDCapabilities").error("fromLocalRepositoryJson", th3);
                    }
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
        return dVar;
    }
}
