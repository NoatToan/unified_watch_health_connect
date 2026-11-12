package nj2;

import androidx.lifecycle.y0;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.customermanagementlib.viewmodel.CustomerManagementViewModel$loadSelectedAddress$1", f = "CustomerManagementViewModel.kt", l = {363}, m = "invokeSuspend", v = 2)
public final class n extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public y0 f126338a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f126339b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ a f126340c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f126341d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f126342e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(a aVar, String str, boolean z14, t13.d<? super n> dVar) {
        super(2, dVar);
        this.f126340c = aVar;
        this.f126341d = str;
        this.f126342e = z14;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new n(this.f126340c, this.f126341d, this.f126342e, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((n) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0060 A[Catch: Exception -> 0x0011, TRY_LEAVE, TryCatch #0 {Exception -> 0x0011, blocks: (B:6:0x000d, B:17:0x003b, B:19:0x0048, B:21:0x004e, B:23:0x0054, B:24:0x0059, B:26:0x0060, B:13:0x0026), top: B:31:0x0007 }] */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        y0 y0Var;
        String phoneNumberId;
        Object objN4;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f126339b;
        a aVar2 = this.f126340c;
        try {
            if (i14 == 0) {
                o13.r.b(obj);
                aVar2.G4().debug("loadSelectedAddress");
                y0<fj2.a> y0Var2 = aVar2.f126260l;
                dj2.a aVar3 = aVar2.f126249a;
                String str = this.f126341d;
                boolean z14 = this.f126342e;
                this.f126338a = y0Var2;
                this.f126339b = 1;
                Object objH = aVar3.h(str, z14, this);
                if (objH == aVar) {
                    return aVar;
                }
                y0Var = y0Var2;
                obj = objH;
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y0Var = this.f126338a;
                o13.r.b(obj);
            }
            y0Var.m(obj);
            fj2.a aVarD = aVar2.f126260l.d();
            if (aVarD == null || (phoneNumberId = aVarD.getPhoneNumberId()) == null) {
                a.x4(aVar2);
                Unit unit = Unit.INSTANCE;
            } else {
                if (phoneNumberId.length() > 0) {
                    objN4 = aVar2.N4(phoneNumberId, true);
                } else {
                    a.x4(aVar2);
                    objN4 = Unit.INSTANCE;
                }
                if (objN4 == null) {
                    a.x4(aVar2);
                    Unit unit2 = Unit.INSTANCE;
                }
            }
        } catch (Exception e4) {
            int i15 = a.A;
            aVar2.I4(e4);
        }
        return Unit.INSTANCE;
    }
}
