package im2;

import c83.a0;
import java.util.List;
import o13.r;
import o53.b0;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 1, 0})
@v13.e(c = "com.garmin.device.pairing.impl.retrofit.PairingRetrofitServerDelegate$checkDeviceFirmwareUpdate$job$1", f = "PairingRetrofitServerDelegate.kt", l = {614}, m = "invokeSuspend")
public final class d extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f94234a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f94235b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ lm2.i.a f94236c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ RequestBody f94237d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f94238e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ List<c83.d<?>> f94239f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ lm2.i.b<String> f94240g;

    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"im2/d$a", "Lc83/f;", "Lokhttp3/ResponseBody;", "device-pairing-retrofit_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a implements c83.f<ResponseBody> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ c83.d<ResponseBody> f94241a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ lm2.i.b<String> f94242b;

        public a(c83.d<ResponseBody> dVar, lm2.i.b<String> bVar) {
            this.f94241a = dVar;
            this.f94242b = bVar;
        }

        @Override // c83.f
        public final void a(c83.d<ResponseBody> dVar, Throwable th3) {
            lm2.i.b<String> bVar;
            dVar.getClass();
            th3.getClass();
            if (this.f94241a.isCanceled() || (bVar = this.f94242b) == null) {
                return;
            }
            bVar.onFailure(th3);
        }

        @Override // c83.f
        public final void c(c83.d<ResponseBody> dVar, a0<ResponseBody> a0Var) {
            dVar.getClass();
            if (this.f94241a.isCanceled()) {
                return;
            }
            boolean zIsSuccessful = a0Var.f25745a.isSuccessful();
            lm2.i.b<String> bVar = this.f94242b;
            if (!zIsSuccessful) {
                if (bVar != null) {
                    bVar.onFailure(c.f94216f);
                }
            } else if (bVar != null) {
                ResponseBody responseBody = a0Var.f25746b;
                bVar.a(responseBody != null ? responseBody.string() : null);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(c cVar, lm2.i.a aVar, RequestBody requestBody, boolean z14, List<c83.d<?>> list, lm2.i.b<String> bVar, t13.d<? super d> dVar) {
        super(2, dVar);
        this.f94235b = cVar;
        this.f94236c = aVar;
        this.f94237d = requestBody;
        this.f94238e = z14;
        this.f94239f = list;
        this.f94240g = bVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new d(this.f94235b, this.f94236c, this.f94237d, this.f94238e, this.f94239f, this.f94240g, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((d) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f94234a;
        if (i14 == 0) {
            r.b(obj);
            this.f94234a = 1;
            c cVar = this.f94235b;
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
        c83.d<ResponseBody> dVarC = ((jm2.b) obj).c(this.f94237d, String.valueOf(this.f94238e));
        this.f94239f.add(dVarC);
        dVarC.q0(new a(dVarC, this.f94240g));
        return Unit.INSTANCE;
    }
}
