package y92;

import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)Ljava/lang/Object;"}, k = 3, mv = {2, 0, 0})
@v13.e(c = "com.garmin.android.device.passcode.data.NfcDevicePasscodeRepository$setPasscode$2", f = "NfcDevicePasscodeRepository.kt", l = {}, m = "invokeSuspend", v = 1)
public final class t extends v13.i implements e23.p<b0, t13.d<? super Object>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f195373a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f195374b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ z92.a f195375c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f195376d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ o53.r<z92.b> f195377e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ e f195378f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(f fVar, z92.a aVar, String str, o53.r<z92.b> rVar, e eVar, t13.d<? super t> dVar) {
        super(2, dVar);
        this.f195374b = fVar;
        this.f195375c = aVar;
        this.f195376d = str;
        this.f195377e = rVar;
        this.f195378f = eVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        t tVar = new t(this.f195374b, this.f195375c, this.f195376d, this.f195377e, this.f195378f, dVar);
        tVar.f195373a = obj;
        return tVar;
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Object> dVar) {
        return ((t) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        f fVar = this.f195374b;
        final rl2.c cVar = fVar.f195310e.get();
        if (cVar == null) {
            x92.a aVar2 = x92.a.f189663a;
            String str = "NFC service not found for device unit id " + fVar.f195306a;
            aVar2.getClass();
            x92.a.b("DevicePasscodeRepository", str);
            return Boolean.valueOf(this.f195377e.p(null));
        }
        x92.a.f189663a.getClass();
        x92.a.a("DevicePasscodeRepository", "Creating owner data");
        z92.a aVar3 = this.f195375c;
        com.garmin.device.nfc.h[] hVarArrJ = com.garmin.device.nfc.h.j(aVar3.f203139a, aVar3.f203140b);
        final f fVar2 = this.f195374b;
        final String str2 = this.f195376d;
        final o53.r<z92.b> rVar = this.f195377e;
        final e eVar = this.f195378f;
        return new Integer(cVar.a(hVarArrJ, new cs2.a() { // from class: y92.s
            @Override // cs2.a
            public final void accept(Object obj2) {
                Boolean bool = (Boolean) obj2;
                x92.a.f189663a.getClass();
                x92.a.a("DevicePasscodeRepository", "Create Owner Data: success=" + bool);
                boolean zBooleanValue = bool.booleanValue();
                o53.r rVar2 = rVar;
                if (!zBooleanValue) {
                    rVar2.p(null);
                    return;
                }
                rl2.c cVar2 = cVar;
                pl2.f fVar3 = cVar2.f153459h;
                f fVar4 = fVar2;
                sl2.f fVarG = f.g(fVar4, fVar3);
                int i14 = p005kotlin.jvm.internal.s.g(fVarG.f160037a, Boolean.TRUE) ? 2 : 1;
                x92.a.a("DevicePasscodeRepository", "Setting passcode for chip type: " + fVarG + ", environment: " + i14);
                String str3 = str2;
                cVar2.f(new pl2.k(str3, str3, i14, 5), fVarG, new jn2.l(fVar4, 2, eVar, rVar2));
            }
        }));
    }
}
