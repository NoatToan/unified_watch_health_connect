package y10;

import androidx.lifecycle.y0;
import ch.qos.logback.core.net.SyslogConstants;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import zb0.u0;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.connectiq.viewmodel.ConnectIQDownloadViewModel$requestInstalledCIQItems$1", f = "ConnectIQDownloadViewModel.kt", l = {126, 130, SyslogConstants.LOG_LOCAL1, 143}, m = "invokeSuspend", v = 2)
public final class d0 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public y0 f193808a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f193809b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f193810c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ k f193811d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ n0.d f193812e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(k kVar, n0.d dVar, t13.d<? super d0> dVar2) {
        super(2, dVar2);
        this.f193811d = kVar;
        this.f193812e = dVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        d0 d0Var = new d0(this.f193811d, this.f193812e, dVar);
        d0Var.f193810c = obj;
        return d0Var;
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((d0) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:35:0x009f A[Catch: Exception -> 0x002f, TRY_LEAVE, TryCatch #0 {Exception -> 0x002f, blocks: (B:11:0x002a, B:14:0x0032, B:28:0x0078, B:30:0x008b, B:32:0x0092, B:35:0x009f, B:25:0x0069), top: B:43:0x0011 }] */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00e1, code lost:
    
        if (r3 == r2) goto L39;
     */
    @Override // v13.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        y0<n0> y0Var;
        Object objZ4;
        Object objF4;
        Object objD;
        List<com.garmin.android.apps.connectmobile.connectiq.e> list;
        o53.b0 b0Var = (o53.b0) this.f193810c;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f193809b;
        k kVar = this.f193811d;
        try {
            if (i14 == 0) {
                o13.r.b(obj);
                kVar.f193917p.m(n0.f.f193967a);
                this.f193810c = b0Var;
                this.f193809b = 1;
                objF4 = kVar.F4(this);
                if (objF4 != aVar) {
                }
                return aVar;
            }
            if (i14 == 1) {
                o13.r.b(obj);
                objF4 = obj;
            } else if (i14 == 2) {
                o13.r.b(obj);
                objD = obj;
                o10.c cVar = (o10.c) objD;
                kVar.f193923x.cancel();
                long j8 = cVar.f128513a;
                list = cVar.f128515c;
                kVar.f193910i = j8;
                kVar.f193911j = cVar.f128514b;
                if (list == null && (!list.isEmpty())) {
                    n0.d dVar = this.f193812e;
                    this.f193810c = b0Var;
                    this.f193809b = 3;
                    if (k.A4(kVar, list, dVar, this) == aVar) {
                        return aVar;
                    }
                } else {
                    kVar.f193917p.m(new n0.b(kVar.E4(), kVar.G4(kVar.f193902a), false, null, 12, null));
                }
            } else if (i14 == 3) {
                o13.r.b(obj);
            } else {
                if (i14 != 4) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                y0Var = this.f193808a;
                o13.r.b(obj);
                objZ4 = obj;
                y0Var.j(new n0.a(((Boolean) objZ4).booleanValue()));
            }
            return Unit.INSTANCE;
            sd2.f fVar = (sd2.f) objF4;
            kVar.f193922w = u0.c(fVar != null ? fVar.getProductNumber() : null);
            kVar.f193923x.start();
            r10.d dVar2 = kVar.f193905d;
            com.garmin.android.apps.connectmobile.connectiq.l lVar = kVar.f193902a;
            this.f193810c = b0Var;
            this.f193809b = 2;
            objD = dVar2.d(lVar, this);
            if (objD != aVar) {
                o10.c cVar2 = (o10.c) objD;
                kVar.f193923x.cancel();
                long j14 = cVar2.f128513a;
                list = cVar2.f128515c;
                kVar.f193910i = j14;
                kVar.f193911j = cVar2.f128514b;
                if (list == null) {
                    kVar.f193917p.m(new n0.b(kVar.E4(), kVar.G4(kVar.f193902a), false, null, 12, null));
                } else {
                    kVar.f193917p.m(new n0.b(kVar.E4(), kVar.G4(kVar.f193902a), false, null, 12, null));
                }
                return Unit.INSTANCE;
            }
        } catch (Exception e4) {
            p92.y.f136664a.getClass();
            int i15 = gt2.c.f79010a;
            gt2.b.f79005a.i("GConsentLib").error(e4.toString());
            kVar.f193923x.cancel();
            y0Var = kVar.f193917p;
            this.f193810c = null;
            this.f193808a = y0Var;
            this.f193809b = 4;
            objZ4 = k.z4(kVar, this);
        }
        return aVar;
    }
}
