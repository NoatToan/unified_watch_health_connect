package im2;

import c83.a0;
import java.util.List;
import java.util.Map;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 1, 0})
@v13.e(c = "com.garmin.device.pairing.impl.retrofit.PairingRetrofitServerDelegate$reInitializeDeviceAsync$job$1", f = "PairingRetrofitServerDelegate.kt", l = {500}, m = "invokeSuspend")
public final class i extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f94287a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f94288b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ lm2.i.a f94289c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Map<String, String> f94290d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ List<c83.d<?>> f94291e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ c83.f<Void> f94292f;

    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"im2/i$a", "Lc83/f;", "Ljava/lang/Void;", "device-pairing-retrofit_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a implements c83.f<Void> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ c f94293a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ c83.f<Void> f94294b;

        public a(c cVar, c83.f<Void> fVar) {
            this.f94293a = cVar;
            this.f94294b = fVar;
        }

        @Override // c83.f
        public final void a(c83.d<Void> dVar, Throwable th3) {
            dVar.getClass();
            th3.getClass();
            this.f94293a.f94218b.error("ReInitialize device failed", th3);
            c83.f<Void> fVar = this.f94294b;
            if (fVar != null) {
                fVar.a(dVar, th3);
            }
        }

        @Override // c83.f
        public final void c(c83.d<Void> dVar, a0<Void> a0Var) {
            dVar.getClass();
            this.f94293a.f94218b.info("ReInitialize device succeeded");
            c83.f<Void> fVar = this.f94294b;
            if (fVar != null) {
                fVar.c(dVar, a0Var);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(c cVar, lm2.i.a aVar, Map<String, String> map, List<c83.d<?>> list, c83.f<Void> fVar, t13.d<? super i> dVar) {
        super(2, dVar);
        this.f94288b = cVar;
        this.f94289c = aVar;
        this.f94290d = map;
        this.f94291e = list;
        this.f94292f = fVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new i(this.f94288b, this.f94289c, this.f94290d, this.f94291e, this.f94292f, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((i) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f94287a;
        c cVar = this.f94288b;
        if (i14 == 0) {
            r.b(obj);
            this.f94287a = 1;
            cVar.getClass();
            obj = c.f(cVar, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r.b(obj);
        }
        c83.d<Void> dVarE = ((jm2.b) obj).e(this.f94289c.getF197655a(), this.f94290d);
        this.f94291e.add(dVarE);
        dVarE.q0(new a(cVar, this.f94292f));
        return Unit.INSTANCE;
    }
}
