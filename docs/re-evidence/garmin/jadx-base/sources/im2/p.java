package im2;

import c83.a0;
import com.garmin.device.sharing.management.dtos.BluetoothConnectionType;
import com.garmin.device.sharing.management.dtos.ConnectionInfoDto;
import java.util.List;
import o13.r;
import o53.b0;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import org.json.JSONObject;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 1, 0})
@v13.e(c = "com.garmin.device.pairing.impl.retrofit.PairingRetrofitServerDelegate$updateDeviceConnectionInfo$job$1", f = "PairingRetrofitServerDelegate.kt", l = {763}, m = "invokeSuspend")
public final class p extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public RequestBody f94377a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f94378b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ConnectionInfoDto f94379c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ c f94380d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ lm2.i.a f94381e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ BluetoothConnectionType f94382f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ List<c83.d<?>> f94383g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ lm2.i.b<JSONObject> f94384h;

    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"im2/p$a", "Lc83/f;", "Ljava/lang/Void;", "device-pairing-retrofit_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a implements c83.f<Void> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ c83.d<Void> f94385a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ lm2.i.b<JSONObject> f94386b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ c f94387c;

        public a(c83.d<Void> dVar, lm2.i.b<JSONObject> bVar, c cVar) {
            this.f94385a = dVar;
            this.f94386b = bVar;
            this.f94387c = cVar;
        }

        @Override // c83.f
        public final void a(c83.d<Void> dVar, Throwable th3) {
            dVar.getClass();
            th3.getClass();
            if (this.f94385a.isCanceled()) {
                return;
            }
            this.f94387c.f94218b.error("Failed updateDeviceConnectionInfo", th3);
            this.f94386b.onFailure(c.f94216f);
        }

        @Override // c83.f
        public final void c(c83.d<Void> dVar, a0<Void> a0Var) {
            dVar.getClass();
            if (this.f94385a.isCanceled()) {
                return;
            }
            this.f94386b.a(null);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(ConnectionInfoDto connectionInfoDto, c cVar, lm2.i.a aVar, BluetoothConnectionType bluetoothConnectionType, List<c83.d<?>> list, lm2.i.b<JSONObject> bVar, t13.d<? super p> dVar) {
        super(2, dVar);
        this.f94379c = connectionInfoDto;
        this.f94380d = cVar;
        this.f94381e = aVar;
        this.f94382f = bluetoothConnectionType;
        this.f94383g = list;
        this.f94384h = bVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new p(this.f94379c, this.f94380d, this.f94381e, this.f94382f, this.f94383g, this.f94384h, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((p) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        RequestBody requestBody;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f94378b;
        c cVar = this.f94380d;
        if (i14 == 0) {
            r.b(obj);
            dn2.d.f60543e.getClass();
            ConnectionInfoDto connectionInfoDto = this.f94379c;
            connectionInfoDto.getClass();
            RequestBody requestBodyCreate = RequestBody.INSTANCE.create(connectionInfoDto.toJSON(), MediaType.INSTANCE.parse("application/json"));
            this.f94377a = requestBodyCreate;
            this.f94378b = 1;
            cVar.getClass();
            Object objF = c.f(cVar, this);
            if (objF == aVar) {
                return aVar;
            }
            requestBody = requestBodyCreate;
            obj = objF;
        } else {
            if (i14 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            requestBody = this.f94377a;
            r.b(obj);
        }
        c83.d<Void> dVarH = ((jm2.b) obj).h(this.f94381e.getF197655a(), this.f94382f.getUrlParam(), requestBody);
        this.f94383g.add(dVarH);
        dVarH.q0(new a(dVarH, this.f94384h, cVar));
        return Unit.INSTANCE;
    }
}
