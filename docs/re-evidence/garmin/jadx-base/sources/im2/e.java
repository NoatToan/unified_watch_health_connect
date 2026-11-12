package im2;

import c83.a0;
import com.garmin.device.pairing.PairingException;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import o13.r;
import o53.b0;
import o53.l1;
import okhttp3.Response;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.r0;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 1, 0})
@v13.e(c = "com.garmin.device.pairing.impl.retrofit.PairingRetrofitServerDelegate$checkDeviceRegistration$job$1", f = "PairingRetrofitServerDelegate.kt", l = {271}, m = "invokeSuspend")
public final class e extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f94243a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c f94244b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ lm2.i.a f94245c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ List<c83.d<?>> f94246d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r0<l1> f94247e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ AtomicInteger f94248f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ bm2.e f94249g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ lm2.i.b<bm2.e> f94250h;

    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001¨\u0006\u0003"}, d2 = {"im2/e$a", "Lc83/f;", "Lcom/google/gson/JsonObject;", "device-pairing-retrofit_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a implements c83.f<JsonObject> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ AtomicInteger f94251a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ c83.d<JsonObject> f94252b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ bm2.e f94253c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ lm2.i.b<bm2.e> f94254d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ c f94255e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ r0<l1> f94256f;

        public a(AtomicInteger atomicInteger, c83.d<JsonObject> dVar, bm2.e eVar, lm2.i.b<bm2.e> bVar, c cVar, r0<l1> r0Var) {
            this.f94251a = atomicInteger;
            this.f94252b = dVar;
            this.f94253c = eVar;
            this.f94254d = bVar;
            this.f94255e = cVar;
            this.f94256f = r0Var;
        }

        @Override // c83.f
        public final void a(c83.d<JsonObject> dVar, Throwable th3) {
            dVar.getClass();
            th3.getClass();
            if (this.f94252b.isCanceled()) {
                return;
            }
            l1 l1Var = this.f94256f.f105810a;
            if (l1Var != null) {
                l1Var.c(null);
            }
            this.f94255e.f94218b.error("checkRegistration failed", th3);
            this.f94254d.onFailure(th3);
        }

        @Override // c83.f
        public final void c(c83.d<JsonObject> dVar, a0<JsonObject> a0Var) {
            Integer subcode;
            dVar.getClass();
            Response response = a0Var.f25745a;
            int iDecrementAndGet = this.f94251a.decrementAndGet();
            if (this.f94252b.isCanceled()) {
                return;
            }
            boolean zIsSuccessful = response.isSuccessful();
            r0<l1> r0Var = this.f94256f;
            c cVar = this.f94255e;
            lm2.i.b<bm2.e> bVar = this.f94254d;
            if (!zIsSuccessful) {
                try {
                    jm2.d dVar2 = (jm2.d) new Gson().fromJson(String.valueOf(a0Var.f25747c), jm2.d.class);
                    int iCode = response.code();
                    if (iCode == 409) {
                        yl2.e eVar = yl2.e.HTTP_CONFLICT_409;
                        jm2.e error = dVar2.getCom.google.firebase.messaging.Constants.IPC_BUNDLE_KEY_SEND_ERROR java.lang.String();
                        bVar.onFailure(new PairingException(eVar, (error == null || (subcode = error.getSubcode()) == null) ? null : subcode.toString()));
                        return;
                    } else if (iCode != 500) {
                        bVar.onFailure(new PairingException(yl2.e.OTHER_FATAL));
                        return;
                    } else {
                        bVar.onFailure(new PairingException(yl2.e.HTTP_INTERNAL_ERROR_500));
                        return;
                    }
                } catch (Throwable th3) {
                    cVar.f94218b.error("checkRegistration failed", th3);
                    l1 l1Var = r0Var.f105810a;
                    if (l1Var != null) {
                        l1Var.c(null);
                    }
                    bVar.onFailure(th3);
                    return;
                }
            }
            try {
                JsonObject jsonObject = a0Var.f25746b;
                String string = jsonObject != null ? jsonObject.toString() : null;
                bm2.e eVar2 = this.f94253c;
                if (string != null && string.length() != 0) {
                    JSONObject jSONObject = new JSONObject(string);
                    eVar2.f18962f = jSONObject.optBoolean("previousAssociationWithOther");
                    eVar2.f18961e = jSONObject.optBoolean("thisDeviceAATOnOtherAccount");
                    eVar2.f18959c = jSONObject.optLong("deviceId");
                    eVar2.f18960d = jSONObject.optBoolean("aatOnThisAccount");
                }
                if (iDecrementAndGet <= 0) {
                    bVar.a(eVar2);
                }
            } catch (Throwable th4) {
                cVar.f94218b.error("checkRegistration failed", th4);
                l1 l1Var2 = r0Var.f105810a;
                if (l1Var2 != null) {
                    l1Var2.c(null);
                }
                bVar.onFailure(th4);
            }
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 1, 0})
    @v13.e(c = "com.garmin.device.pairing.impl.retrofit.PairingRetrofitServerDelegate$checkDeviceRegistration$job$1$2", f = "PairingRetrofitServerDelegate.kt", l = {}, m = "invokeSuspend")
    public static final class b extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ dn2.d f94257a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ bm2.e f94258b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ AtomicInteger f94259c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ lm2.i.b<bm2.e> f94260d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ c83.d<JsonObject> f94261e;

        @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"im2/e$b$a", "Ldn2/d$c;", "device-pairing-retrofit_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class a implements dn2.d.c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ bm2.e f94262a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ AtomicInteger f94263b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ lm2.i.b<bm2.e> f94264c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ c83.d<JsonObject> f94265d;

            /* JADX INFO: renamed from: im2.e$b$a$a, reason: collision with other inner class name */
            @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"im2/e$b$a$a", "Lom2/a;", "device-pairing-retrofit_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
            public static final class C1798a implements om2.a {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ AtomicInteger f94266a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ lm2.i.b<bm2.e> f94267b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ bm2.e f94268c;

                public C1798a(AtomicInteger atomicInteger, lm2.i.b<bm2.e> bVar, bm2.e eVar) {
                    this.f94266a = atomicInteger;
                    this.f94267b = bVar;
                    this.f94268c = eVar;
                }

                @Override // om2.a
                public final void onFailure(Exception exc) {
                    this.f94267b.onFailure(exc);
                }

                @Override // om2.a
                public final void onSuccess() {
                    if (this.f94266a.decrementAndGet() <= 0) {
                        this.f94267b.a(this.f94268c);
                    }
                }
            }

            public a(bm2.e eVar, AtomicInteger atomicInteger, lm2.i.b<bm2.e> bVar, c83.d<JsonObject> dVar) {
                this.f94262a = eVar;
                this.f94263b = atomicInteger;
                this.f94264c = bVar;
                this.f94265d = dVar;
            }

            @Override // dn2.d.c
            public final void a(JSONArray jSONArray) {
                bm2.c cVarD;
                bm2.e.a aVar = bm2.e.f18956g;
                AtomicInteger atomicInteger = this.f94263b;
                lm2.i.b<bm2.e> bVar = this.f94264c;
                bm2.e eVar = this.f94262a;
                C1798a c1798a = new C1798a(atomicInteger, bVar, eVar);
                aVar.getClass();
                eVar.getClass();
                new tm2.a();
                try {
                    int length = jSONArray.length();
                    int i14 = 0;
                    while (true) {
                        cVarD = null;
                        if (i14 >= length) {
                            break;
                        }
                        JSONObject jSONObject = jSONArray.getJSONObject(i14);
                        jSONObject.getClass();
                        try {
                            cVarD = bm2.c.d(jSONObject);
                        } catch (Exception unused) {
                        }
                        if (cVarD != null && cVarD.I0) {
                            break;
                        } else {
                            i14++;
                        }
                    }
                    if (cVarD != null) {
                        eVar.f18957a = cVarD.f18942x;
                        eVar.f18958b = cVarD.F;
                    }
                    c1798a.onSuccess();
                } catch (JSONException e4) {
                    c1798a.f94267b.onFailure(e4);
                }
            }

            @Override // dn2.d.c
            public final void onFailure(Throwable th3) {
                this.f94265d.cancel();
                this.f94264c.onFailure(th3);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(dn2.d dVar, bm2.e eVar, AtomicInteger atomicInteger, lm2.i.b<bm2.e> bVar, c83.d<JsonObject> dVar2, t13.d<? super b> dVar3) {
            super(2, dVar3);
            this.f94257a = dVar;
            this.f94258b = eVar;
            this.f94259c = atomicInteger;
            this.f94260d = bVar;
            this.f94261e = dVar2;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new b(this.f94257a, this.f94258b, this.f94259c, this.f94260d, this.f94261e, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            r.b(obj);
            this.f94257a.d(new a(this.f94258b, this.f94259c, this.f94260d, this.f94261e));
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(c cVar, lm2.i.a aVar, List<c83.d<?>> list, r0<l1> r0Var, AtomicInteger atomicInteger, bm2.e eVar, lm2.i.b<bm2.e> bVar, t13.d<? super e> dVar) {
        super(2, dVar);
        this.f94244b = cVar;
        this.f94245c = aVar;
        this.f94246d = list;
        this.f94247e = r0Var;
        this.f94248f = atomicInteger;
        this.f94249g = eVar;
        this.f94250h = bVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new e(this.f94244b, this.f94245c, this.f94246d, this.f94247e, this.f94248f, this.f94249g, this.f94250h, dVar);
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((e) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Type inference failed for: r11v7, types: [T, o53.c2] */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f94243a;
        c cVar = this.f94244b;
        if (i14 == 0) {
            r.b(obj);
            this.f94243a = 1;
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
        c83.d<JsonObject> dVarA = ((jm2.b) obj).a(this.f94245c.getF197655a());
        this.f94246d.add(dVarA);
        dVarA.q0(new a(this.f94248f, dVarA, this.f94249g, this.f94250h, this.f94244b, this.f94247e));
        c.f94215e.getClass();
        dn2.d dVarA2 = c.a.a();
        this.f94247e.f105810a = ge1.b.T(cVar.getF17560h(), null, null, new b(dVarA2, this.f94249g, this.f94248f, this.f94250h, dVarA, null), 3);
        return Unit.INSTANCE;
    }
}
