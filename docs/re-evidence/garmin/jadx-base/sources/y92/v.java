package y92;

import com.garmin.device.nfc.NfcCommandHandler;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)Ljava/lang/Object;"}, k = 3, mv = {2, 0, 0})
@v13.e(c = "com.garmin.android.device.passcode.data.NfcDevicePasscodeRepository$verifyPasscode$2", f = "NfcDevicePasscodeRepository.kt", l = {}, m = "invokeSuspend", v = 1)
public final class v extends v13.i implements e23.p<b0, t13.d<? super Object>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f195383a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f195384b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f195385c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ o53.r<z92.b> f195386d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(f fVar, String str, o53.r<z92.b> rVar, t13.d<? super v> dVar) {
        super(2, dVar);
        this.f195384b = fVar;
        this.f195385c = str;
        this.f195386d = rVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        v vVar = new v(this.f195384b, this.f195385c, this.f195386d, dVar);
        vVar.f195383a = obj;
        return vVar;
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Object> dVar) {
        return ((v) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        f fVar = this.f195384b;
        rl2.c cVar = fVar.f195310e.get();
        o53.r<z92.b> rVar = this.f195386d;
        if (cVar != null) {
            j jVar = new j(fVar, rVar, 3);
            String str = this.f195385c;
            str.getClass();
            NfcCommandHandler.f50799g.trace("Verifying pass code");
            return new Integer(cVar.f50805f.c(new sl2.k(str, jVar)));
        }
        x92.a aVar2 = x92.a.f189663a;
        String str2 = "NFC service not found for device unit id " + fVar.f195306a;
        aVar2.getClass();
        x92.a.b("DevicePasscodeRepository", str2);
        return Boolean.valueOf(rVar.p(null));
    }
}
