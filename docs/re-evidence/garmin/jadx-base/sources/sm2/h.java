package sm2;

import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 1, 0})
@v13.e(c = "com.garmin.device.pairing.setup.operations.ConfigurePermissionsUtil$sendSettings$2", f = "ConfigurePermissionsUtil.kt", l = {TsExtractor.TS_STREAM_TYPE_E_AC3}, m = "invokeSuspend")
public final class h extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f160301a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f160302b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f160303c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f160304d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f160305e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f160306f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f160307g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(String str, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, t13.d<? super h> dVar) {
        super(2, dVar);
        this.f160302b = str;
        this.f160303c = z14;
        this.f160304d = z15;
        this.f160305e = z16;
        this.f160306f = z17;
        this.f160307g = z18;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new h(this.f160302b, this.f160303c, this.f160304d, this.f160305e, this.f160306f, this.f160307g, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((h) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        Object obj2 = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f160301a;
        if (i14 == 0) {
            o13.r.b(obj);
            fm2.c cVar = (fm2.c) lm2.h.c();
            String str = this.f160302b;
            str.getClass();
            et2.a aVar = (et2.a) da2.d.c(cVar.g()).getCapability(str, et2.a.class);
            if (aVar == null) {
                g.f160298b.warn("sendSettings called but no SetDeviceSettingsManager found for ".concat(str));
                return Unit.INSTANCE;
            }
            this.f160301a = 1;
            Object objY = ge1.b.Y(new et2.b(aVar, this.f160303c, this.f160304d, this.f160305e, this.f160306f, this.f160307g, null), this);
            if (objY != obj2) {
                objY = Unit.INSTANCE;
            }
            if (objY == obj2) {
                return obj2;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
        }
        return Unit.INSTANCE;
    }
}
