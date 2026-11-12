package im2;

import c83.a0;
import com.google.gson.JsonObject;
import java.util.List;
import o13.r;
import o53.b0;
import org.apache.commons.lang3.BooleanUtils;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 1, 0})
@v13.e(c = "com.garmin.device.pairing.impl.retrofit.PairingRetrofitServerDelegate$setGCActiveActivityTracker$job$1", f = "PairingRetrofitServerDelegate.kt", l = {536}, m = "invokeSuspend")
public final class o extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f94360a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f94361b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ lm2.i.a f94362c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ List<c83.d<?>> f94363d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ lm2.i.b<vm2.g> f94364e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ vm2.g f94365f;

    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"im2/o$a", "Lc83/f;", "Ljava/lang/Void;", "device-pairing-retrofit_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a implements c83.f<Void> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ c83.d<Void> f94366a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ jm2.b f94367b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ lm2.i.a f94368c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ List<c83.d<?>> f94369d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ lm2.i.b<vm2.g> f94370e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ vm2.g f94371f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ c f94372g;

        /* JADX INFO: renamed from: im2.o$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"im2/o$a$a", "Lc83/f;", "Ljava/lang/Void;", "device-pairing-retrofit_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class C1800a implements c83.f<Void> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ c83.d<Void> f94373a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ lm2.i.b<vm2.g> f94374b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ vm2.g f94375c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ c f94376d;

            public C1800a(c83.d<Void> dVar, lm2.i.b<vm2.g> bVar, vm2.g gVar, c cVar) {
                this.f94373a = dVar;
                this.f94374b = bVar;
                this.f94375c = gVar;
                this.f94376d = cVar;
            }

            @Override // c83.f
            public final void a(c83.d<Void> dVar, Throwable th3) {
                dVar.getClass();
                th3.getClass();
                if (this.f94373a.isCanceled()) {
                    return;
                }
                this.f94376d.f94218b.error("setGCActiveActivityTracker status failed", th3);
                this.f94374b.onFailure(th3);
            }

            @Override // c83.f
            public final void c(c83.d<Void> dVar, a0<Void> a0Var) {
                dVar.getClass();
                if (this.f94373a.isCanceled()) {
                    return;
                }
                vm2.g gVar = this.f94375c;
                this.f94374b.a(new vm2.g(true, gVar != null ? gVar.f178830b : false));
            }
        }

        public a(c83.d<Void> dVar, jm2.b bVar, lm2.i.a aVar, List<c83.d<?>> list, lm2.i.b<vm2.g> bVar2, vm2.g gVar, c cVar) {
            this.f94366a = dVar;
            this.f94367b = bVar;
            this.f94368c = aVar;
            this.f94369d = list;
            this.f94370e = bVar2;
            this.f94371f = gVar;
            this.f94372g = cVar;
        }

        @Override // c83.f
        public final void a(c83.d<Void> dVar, Throwable th3) {
            dVar.getClass();
            th3.getClass();
            if (this.f94366a.isCanceled()) {
                return;
            }
            this.f94372g.f94218b.error("setGCActiveActivityTracker PAT failed", th3);
            this.f94370e.onFailure(th3);
        }

        @Override // c83.f
        public final void c(c83.d<Void> dVar, a0<Void> a0Var) {
            dVar.getClass();
            c83.d<Void> dVar2 = this.f94366a;
            if (dVar2.isCanceled()) {
                return;
            }
            JsonObject jsonObject = new JsonObject();
            jsonObject.addProperty("deviceStatus", c.b.ACTIVE.f94223a);
            c83.d<Void> dVarF = this.f94367b.f(this.f94368c.getF197655a(), jsonObject);
            this.f94369d.add(dVarF);
            dVarF.q0(new C1800a(dVar2, this.f94370e, this.f94371f, this.f94372g));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(c cVar, lm2.i.a aVar, List<c83.d<?>> list, lm2.i.b<vm2.g> bVar, vm2.g gVar, t13.d<? super o> dVar) {
        super(2, dVar);
        this.f94361b = cVar;
        this.f94362c = aVar;
        this.f94363d = list;
        this.f94364e = bVar;
        this.f94365f = gVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new o(this.f94361b, this.f94362c, this.f94363d, this.f94364e, this.f94365f, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((o) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f94360a;
        if (i14 == 0) {
            r.b(obj);
            this.f94360a = 1;
            c cVar = this.f94361b;
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
        jm2.b bVar = (jm2.b) obj;
        c83.d<Void> dVarD = bVar.d(this.f94362c.getF197655a(), BooleanUtils.TRUE);
        this.f94363d.add(dVarD);
        dVarD.q0(new a(dVarD, bVar, this.f94362c, this.f94363d, this.f94364e, this.f94365f, this.f94361b));
        return Unit.INSTANCE;
    }
}
