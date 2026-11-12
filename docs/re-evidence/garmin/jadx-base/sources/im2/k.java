package im2;

import c83.a0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import o13.r;
import o53.b0;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.apache.commons.lang3.StringUtils;
import org.json.JSONException;
import org.json.JSONObject;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.m0;
import retrofit2.HttpException;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lim2/k;", "Lc83/f;", "Lokhttp3/ResponseBody;", "device-pairing-retrofit_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class k implements c83.f<ResponseBody> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c83.d<ResponseBody> f94305a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f94306b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ lm2.i.a f94307c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ HashMap<String, String> f94308d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ m0 f94309e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ lm2.i.b<vm2.g> f94310f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ m0 f94311g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ RequestBody f94312h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ List<c83.d<?>> f94313i;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 1, 0})
    @v13.e(c = "com.garmin.device.pairing.impl.retrofit.PairingRetrofitServerDelegate$registerDevice$job$1$enqueueRegisterDevice$2$onFailure$1", f = "PairingRetrofitServerDelegate.kt", l = {448}, m = "invokeSuspend")
    public static final class a extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f94314a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ c f94315b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ lm2.i.a f94316c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ RequestBody f94317d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ HashMap<String, String> f94318e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ List<c83.d<?>> f94319f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ m0 f94320g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ lm2.i.b<vm2.g> f94321h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ m0 f94322i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(c cVar, lm2.i.a aVar, RequestBody requestBody, HashMap<String, String> map, List<c83.d<?>> list, m0 m0Var, lm2.i.b<vm2.g> bVar, m0 m0Var2, t13.d<? super a> dVar) {
            super(2, dVar);
            this.f94315b = cVar;
            this.f94316c = aVar;
            this.f94317d = requestBody;
            this.f94318e = map;
            this.f94319f = list;
            this.f94320g = m0Var;
            this.f94321h = bVar;
            this.f94322i = m0Var2;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new a(this.f94315b, this.f94316c, this.f94317d, this.f94318e, this.f94319f, this.f94320g, this.f94321h, this.f94322i, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f94314a;
            if (i14 == 0) {
                r.b(obj);
                this.f94314a = 1;
                if (c.e.a(this.f94315b, this.f94316c, this.f94317d, this.f94318e, this.f94319f, this.f94320g, this.f94321h, this.f94322i, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 1, 0})
    @v13.e(c = "com.garmin.device.pairing.impl.retrofit.PairingRetrofitServerDelegate$registerDevice$job$1$enqueueRegisterDevice$2$onResponse$1", f = "PairingRetrofitServerDelegate.kt", l = {432}, m = "invokeSuspend")
    public static final class b extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f94323a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ c f94324b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ lm2.i.a f94325c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ RequestBody f94326d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ HashMap<String, String> f94327e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ List<c83.d<?>> f94328f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ m0 f94329g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ lm2.i.b<vm2.g> f94330h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ m0 f94331i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(c cVar, lm2.i.a aVar, RequestBody requestBody, HashMap<String, String> map, List<c83.d<?>> list, m0 m0Var, lm2.i.b<vm2.g> bVar, m0 m0Var2, t13.d<? super b> dVar) {
            super(2, dVar);
            this.f94324b = cVar;
            this.f94325c = aVar;
            this.f94326d = requestBody;
            this.f94327e = map;
            this.f94328f = list;
            this.f94329g = m0Var;
            this.f94330h = bVar;
            this.f94331i = m0Var2;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new b(this.f94324b, this.f94325c, this.f94326d, this.f94327e, this.f94328f, this.f94329g, this.f94330h, this.f94331i, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f94323a;
            if (i14 == 0) {
                r.b(obj);
                this.f94323a = 1;
                if (c.e.a(this.f94324b, this.f94325c, this.f94326d, this.f94327e, this.f94328f, this.f94329g, this.f94330h, this.f94331i, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            return Unit.INSTANCE;
        }
    }

    public k(c83.d<ResponseBody> dVar, c cVar, lm2.i.a aVar, HashMap<String, String> map, m0 m0Var, lm2.i.b<vm2.g> bVar, m0 m0Var2, RequestBody requestBody, List<c83.d<?>> list) {
        this.f94305a = dVar;
        this.f94306b = cVar;
        this.f94307c = aVar;
        this.f94308d = map;
        this.f94309e = m0Var;
        this.f94310f = bVar;
        this.f94311g = m0Var2;
        this.f94312h = requestBody;
        this.f94313i = list;
    }

    @Override // c83.f
    public final void a(c83.d<ResponseBody> dVar, Throwable th3) {
        dVar.getClass();
        th3.getClass();
        if (this.f94305a.isCanceled()) {
            return;
        }
        HttpException httpException = th3 instanceof HttpException ? (HttpException) th3 : null;
        lm2.i.b<vm2.g> bVar = this.f94310f;
        c cVar = this.f94306b;
        if (httpException == null) {
            cVar.f94218b.error("registerDevice non-server error", th3);
            bVar.onFailure(th3);
            return;
        }
        a0<?> a0VarResponse = httpException.response();
        Integer numValueOf = a0VarResponse != null ? Integer.valueOf(a0VarResponse.f25745a.code()) : null;
        if (numValueOf != null && new j23.l(500, 599).d(numValueOf.intValue())) {
            m0 m0Var = this.f94311g;
            if (!m0Var.f105804a) {
                cVar.f94218b.debug("registerDevice received " + numValueOf + " in onFailure, retrying once");
                m0Var.f105804a = true;
                ge1.b.T(cVar.getF17560h(), null, null, new a(this.f94306b, this.f94307c, this.f94312h, this.f94308d, this.f94313i, this.f94309e, this.f94310f, this.f94311g, null), 3);
                return;
            }
        }
        a0<?> a0VarResponse2 = httpException.response();
        ResponseBody responseBody = a0VarResponse2 != null ? a0VarResponse2.f25747c : null;
        a0<?> a0VarResponse3 = httpException.response();
        cVar.h(responseBody, a0VarResponse3 != null ? Integer.valueOf(a0VarResponse3.f25745a.code()) : null, bVar);
    }

    @Override // c83.f
    public final void c(c83.d<ResponseBody> dVar, a0<ResponseBody> a0Var) {
        boolean zOptBoolean;
        String str;
        String strString;
        lm2.i.a aVar = this.f94307c;
        String str2 = "";
        dVar.getClass();
        Response response = a0Var.f25745a;
        if (this.f94305a.isCanceled()) {
            return;
        }
        boolean zIsSuccessful = response.isSuccessful();
        lm2.i.b<vm2.g> bVar = this.f94310f;
        c cVar = this.f94306b;
        if (!zIsSuccessful) {
            int iCode = response.code();
            if (500 <= iCode && iCode < 600) {
                m0 m0Var = this.f94311g;
                if (!m0Var.f105804a) {
                    com.airbnb.lottie.animation.keyframe.a.r("registerDevice received ", response.code(), ", retrying once", cVar.f94218b);
                    m0Var.f105804a = true;
                    ge1.b.T(cVar.getF17560h(), null, null, new b(this.f94306b, this.f94307c, this.f94312h, this.f94308d, this.f94313i, this.f94309e, this.f94310f, this.f94311g, null), 3);
                    return;
                }
            }
            cVar.h(a0Var.f25747c, Integer.valueOf(response.code()), bVar);
            return;
        }
        try {
            ResponseBody responseBody = a0Var.f25746b;
            str = (responseBody == null || (strString = responseBody.string()) == null) ? "" : strString;
            try {
                zOptBoolean = new JSONObject(str).optBoolean("newRegistration", false);
                if (!zOptBoolean) {
                    try {
                        HashMap<String, String> map = this.f94308d;
                        c.a aVar2 = c.f94215e;
                        cVar.getClass();
                        aVar.getClass();
                        map.getClass();
                        ge1.b.T(cVar.getF17560h(), null, null, new i(cVar, aVar, map, new ArrayList(), null, null), 3);
                    } catch (JSONException e4) {
                        e = e4;
                        str2 = str;
                        cVar.f94218b.error("Error parsing device registration succeeded JSON response.", (Throwable) e);
                        str = str2;
                    }
                }
            } catch (JSONException e14) {
                e = e14;
                zOptBoolean = false;
            }
        } catch (JSONException e15) {
            e = e15;
            zOptBoolean = false;
        }
        vm2.g gVar = new vm2.g(false, zOptBoolean);
        cVar.f94218b.debug("Register device response: " + response.code() + StringUtils.SPACE + str);
        if (!this.f94309e.f105804a) {
            bVar.a(gVar);
            return;
        }
        aVar.getClass();
        bVar.getClass();
        ge1.b.T(cVar.getF17560h(), null, null, new o(cVar, aVar, new ArrayList(), bVar, gVar, null), 3);
    }
}
