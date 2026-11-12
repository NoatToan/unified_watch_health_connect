package y92;

import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)Ljava/lang/Object;"}, k = 3, mv = {2, 0, 0})
@v13.e(c = "com.garmin.android.device.passcode.data.NfcDevicePasscodeRepository$changePasscode$2", f = "NfcDevicePasscodeRepository.kt", l = {}, m = "invokeSuspend", v = 1)
public final class k extends v13.i implements e23.p<b0, t13.d<? super Object>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f195338a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f195339b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f195340c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f195341d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ o53.r<z92.b> f195342e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(f fVar, String str, String str2, o53.r<z92.b> rVar, t13.d<? super k> dVar) {
        super(2, dVar);
        this.f195339b = fVar;
        this.f195340c = str;
        this.f195341d = str2;
        this.f195342e = rVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        k kVar = new k(this.f195339b, this.f195340c, this.f195341d, this.f195342e, dVar);
        kVar.f195338a = obj;
        return kVar;
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Object> dVar) {
        return ((k) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        f fVar = this.f195339b;
        rl2.c cVar = fVar.f195310e.get();
        o53.r<z92.b> rVar = this.f195342e;
        if (cVar == null) {
            x92.a aVar2 = x92.a.f189663a;
            String str = "NFC service not found for device unit id " + fVar.f195306a;
            aVar2.getClass();
            x92.a.b("DevicePasscodeRepository", str);
            return Boolean.valueOf(rVar.p(null));
        }
        sl2.f fVarG = f.g(fVar, cVar.f153459h);
        int i14 = p005kotlin.jvm.internal.s.g(fVarG.f160037a, Boolean.TRUE) ? 2 : 1;
        x92.a.f189663a.getClass();
        x92.a.a("DevicePasscodeRepository", "Changing passcode for chip type: " + fVarG + ", environment: " + i14);
        pl2.k kVar = new pl2.k(this.f195340c, this.f195341d, i14, 5);
        return new Integer(cVar.f50805f.b(new sl2.c(kVar.f138584a, kVar.f138585b, kVar.f138587d, kVar.f138586c, fVarG, new j(fVar, rVar, 0))));
    }
}
