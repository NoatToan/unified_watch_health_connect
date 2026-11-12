package y92;

import o53.b0;
import org.apache.commons.lang3.StringUtils;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 0, 0})
@v13.e(c = "com.garmin.android.device.passcode.data.NfcDevicePasscodeRepository$sendAppInitiatedPasscodeSetNotification$1$1$1", f = "NfcDevicePasscodeRepository.kt", l = {298}, m = "invokeSuspend", v = 1)
public final class q extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f195360a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f195361b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e f195362c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f f195363d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(b bVar, e eVar, f fVar, t13.d<? super q> dVar) {
        super(2, dVar);
        this.f195361b = bVar;
        this.f195362c = eVar;
        this.f195363d = fVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new q(this.f195361b, this.f195362c, this.f195363d, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((q) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f195360a;
        f fVar = this.f195363d;
        e eVar = this.f195362c;
        try {
            if (i14 == 0) {
                o13.r.b(obj);
                b bVar = this.f195361b;
                this.f195360a = 1;
                if (bVar.c(eVar, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            x92.a aVar2 = x92.a.f189663a;
            String str = "App initiated passcode set notification sent for device unit id " + fVar.f195306a + " devicePasscodeSource " + eVar;
            aVar2.getClass();
            x92.a.a("DevicePasscodeRepository", str);
        } catch (Exception e4) {
            x92.a aVar3 = x92.a.f189663a;
            String strN = wr.g.n("Failed to send app initiated passcode set notification for device unit id ", fVar.f195306a, StringUtils.SPACE, e4);
            aVar3.getClass();
            x92.a.b("DevicePasscodeRepository", strN);
        }
        return Unit.INSTANCE;
    }
}
