package sm2;

import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 1, 0})
@v13.e(c = "com.garmin.device.pairing.setup.operations.ConfigurePermissionsUtil$updateSetting$1", f = "ConfigurePermissionsUtil.kt", l = {}, m = "invokeSuspend")
public final class i extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ rs2.c f160308a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ qm2.l f160309b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f160310c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f160311d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(rs2.c cVar, qm2.l lVar, int i14, boolean z14, t13.d<? super i> dVar) {
        super(2, dVar);
        this.f160308a = cVar;
        this.f160309b = lVar;
        this.f160310c = i14;
        this.f160311d = z14;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new i(this.f160308a, this.f160309b, this.f160310c, this.f160311d, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((i) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        o13.r.b(obj);
        e eVar = new e(this.f160308a, this.f160309b);
        eVar.d(this.f160310c, this.f160311d);
        eVar.c();
        return Unit.INSTANCE;
    }
}
