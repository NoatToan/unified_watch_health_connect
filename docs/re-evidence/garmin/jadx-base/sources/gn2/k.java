package gn2;

import com.garmin.proto.generated.GDISmartProto;
import com.garmin.proto.generated.WifiSetup;
import java.util.List;
import o13.q;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 1, 0})
@v13.e(c = "com.garmin.device.wifi.WifiDataHandler$scan$2$2", f = "WifiDataHandler.kt", l = {594}, m = "invokeSuspend")
public final class k extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f78134a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f78135b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ GDISmartProto.Smart f78136c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ o53.j<List<WifiSetup.ScannedAccessPoint>> f78137d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public k(c cVar, GDISmartProto.Smart smart, o53.j<? super List<WifiSetup.ScannedAccessPoint>> jVar, t13.d<? super k> dVar) {
        super(2, dVar);
        this.f78135b = cVar;
        this.f78136c = smart;
        this.f78137d = jVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new k(this.f78135b, this.f78136c, this.f78137d, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((k) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f78134a;
        c cVar = this.f78135b;
        try {
            if (i14 == 0) {
                r.b(obj);
                dt2.g gVar = cVar.f78098j;
                if (gVar == null) {
                    s.m("messenger");
                    throw null;
                }
                GDISmartProto.Smart smart = this.f78136c;
                this.f78134a = 1;
                if (gVar.c(smart, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
        } catch (Exception e4) {
            cVar.f78103o = null;
            int i15 = q.f128596b;
            this.f78137d.resumeWith(new q.b(e4));
        }
        return Unit.INSTANCE;
    }
}
