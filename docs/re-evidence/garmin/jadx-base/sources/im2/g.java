package im2;

import c83.a0;
import java.util.List;
import o13.r;
import o53.b0;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 1, 0})
@v13.e(c = "com.garmin.device.pairing.impl.retrofit.PairingRetrofitServerDelegate$getGCGenericDeviceDto$job$1", f = "PairingRetrofitServerDelegate.kt", l = {218}, m = "invokeSuspend")
public final class g extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f94270a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f94271b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ List<c83.d<?>> f94272c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ lm2.i.b<bm2.f> f94273d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f94274e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f94275f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ String f94276g;

    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001¨\u0006\u0003"}, d2 = {"im2/g$a", "Lc83/f;", "Ljm2/a;", "device-pairing-retrofit_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a implements c83.f<jm2.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ c f94277a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ lm2.i.b<bm2.f> f94278b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f94279c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f94280d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ String f94281e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ c83.d<jm2.a> f94282f;

        public a(c cVar, lm2.i.b<bm2.f> bVar, String str, String str2, String str3, c83.d<jm2.a> dVar) {
            this.f94277a = cVar;
            this.f94278b = bVar;
            this.f94279c = str;
            this.f94280d = str2;
            this.f94281e = str3;
            this.f94282f = dVar;
        }

        @Override // c83.f
        public final void a(c83.d<jm2.a> dVar, Throwable th3) {
            dVar.getClass();
            th3.getClass();
            if (this.f94282f.isCanceled()) {
                return;
            }
            this.f94277a.f94218b.error("getGCDeviceDto productNumber failed", th3);
            this.f94278b.onFailure(th3);
        }

        @Override // c83.f
        public final void c(c83.d<jm2.a> dVar, a0<jm2.a> a0Var) {
            dVar.getClass();
            jm2.a aVar = a0Var.f25746b;
            List<bm2.c> listA = aVar != null ? aVar.a() : null;
            c cVar = this.f94277a;
            cVar.f94220d = listA;
            this.f94278b.a(cVar.i(this.f94279c, this.f94280d, this.f94281e));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(c cVar, List<c83.d<?>> list, lm2.i.b<bm2.f> bVar, String str, String str2, String str3, t13.d<? super g> dVar) {
        super(2, dVar);
        this.f94271b = cVar;
        this.f94272c = list;
        this.f94273d = bVar;
        this.f94274e = str;
        this.f94275f = str2;
        this.f94276g = str3;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new g(this.f94271b, this.f94272c, this.f94273d, this.f94274e, this.f94275f, this.f94276g, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((g) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f94270a;
        if (i14 == 0) {
            r.b(obj);
            this.f94270a = 1;
            c cVar = this.f94271b;
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
        c83.d<jm2.a> dVarI = ((jm2.b) obj).i();
        this.f94272c.add(dVarI);
        dVarI.q0(new a(this.f94271b, this.f94273d, this.f94274e, this.f94275f, this.f94276g, dVarI));
        return Unit.INSTANCE;
    }
}
