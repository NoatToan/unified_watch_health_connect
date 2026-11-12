package po2;

import androidx.lifecycle.z0;
import ch.qos.logback.core.net.SyslogConstants;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.garmin.feature.garminpay.providers.gpay.model.Product;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.nimbusds.jose.jwk.JWKParameterNames;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\b\u0007\u0018\u0000 O2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001PB\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ%\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\f\"\u0004\b\u0000\u0010\n*\b\u0012\u0004\u0012\u00028\u00000\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0016\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014H\u0096@¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018H\u0096@¢\u0006\u0004\b\u0019\u0010\u0017J\u0017\u0010\u001b\u001a\u00020\u00112\u0006\u0010\u001a\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0018\u0010 \u001a\u00020\u001f2\u0006\u0010\u001e\u001a\u00020\u001dH\u0096@¢\u0006\u0004\b \u0010!J\u001c\u0010#\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\"0\fH\u0096@¢\u0006\u0004\b#\u0010\u0017J\u0010\u0010$\u001a\u00020\u0011H\u0096@¢\u0006\u0004\b$\u0010\u0017J\u0018\u0010&\u001a\u00020\u00112\u0006\u0010%\u001a\u00020\u0015H\u0096@¢\u0006\u0004\b&\u0010'J\u0018\u0010*\u001a\u00020\u00112\u0006\u0010)\u001a\u00020(H\u0096@¢\u0006\u0004\b*\u0010+J\u0010\u0010,\u001a\u00020\u0011H\u0096@¢\u0006\u0004\b,\u0010\u0017J\u000f\u0010-\u001a\u00020\u0011H\u0016¢\u0006\u0004\b-\u0010.R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\u0016\u0010\u0007\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104R\u0016\u0010\u001a\u001a\u00020\u00188\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b5\u00106R$\u00109\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\"\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00108R\u0018\u0010<\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010;R\u0014\u0010?\u001a\u00020\u00188VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b=\u0010>R\u0014\u0010A\u001a\u00020\u00188VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b@\u0010>R\u001a\u0010D\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bB\u0010CR\u0014\u0010G\u001a\u00020\u001d8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bE\u0010FR\u0014\u0010K\u001a\u00020H8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bI\u0010JR\u0014\u0010N\u001a\u00020L8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b7\u0010M¨\u0006Q"}, d2 = {"Lpo2/p;", "Lpo2/a;", "Lpo2/l;", "Lpo2/k;", "Lsd2/f;", "device", "Lcom/garmin/feature/garminpay/providers/gpay/model/Product;", "product", "<init>", "(Lsd2/f;Lcom/garmin/feature/garminpay/providers/gpay/model/Product;)V", "T", "Lr53/i;", "Landroidx/lifecycle/s0;", "W0", "(Lr53/i;)Landroidx/lifecycle/s0;", "Lpo2/v0;", "timer", "", "Y0", "(Lpo2/v0;)V", "", "Lpo2/s;", "G0", "(Lt13/d;)Ljava/lang/Object;", "", "v", "phoneNumber", "b0", "(Ljava/lang/String;)V", "Lfo2/i;", "totalFee", "Lfo2/a0;", "C", "(Lfo2/i;Lt13/d;)Ljava/lang/Object;", "Laq2/l;", "U", "r0", "snowballCard", "d0", "(Lpo2/s;Lt13/d;)Ljava/lang/Object;", "Lfo2/q;", "action", "m", "(Lfo2/q;Lt13/d;)Ljava/lang/Object;", "z0", "g0", "()V", JWKParameterNames.RSA_EXPONENT, "Lsd2/f;", "getDevice", "()Lsd2/f;", "f", "Lcom/garmin/feature/garminpay/providers/gpay/model/Product;", "g", "Ljava/lang/String;", "h", "Landroidx/lifecycle/s0;", "downloadFlow", IntegerTokenConverter.CONVERTER_KEY, "Lpo2/v0;", "downloadOperationTimer", "d", "()Ljava/lang/String;", "cardName", "l", "cardImageUrl", "s", "()Ljava/util/List;", "chargeAmountCandidates", "H", "()Lfo2/i;", "activationFee", "Lfo2/x;", "c0", "()Lfo2/x;", "paymentChannel", "", "()I", "ageBeforeDeletableDays", "j", "a", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class p extends a<l> implements k {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f139307k = 8;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final String f139308l = "PAY#SB#AddCardModel";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final Logger f139309m;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final sd2.f device;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private Product product;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private String phoneNumber;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private androidx.lifecycle.s0<aq2.l<Unit>> downloadFlow;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private v0 downloadOperationTimer;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo53/b0;", "", "Lpo2/s;", "<anonymous>", "(Lo53/b0;)Ljava/util/List;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.feature.garminpay.providers.gpay.snowball.ui.SnowballAddCardModel$getCardsToShiftIn$2", f = "SnowballAddCardModel.kt", l = {62}, m = "invokeSuspend", v = 2)
    public static final class b extends v13.i implements e23.p<o53.b0, t13.d<? super List<? extends s>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f139315a;

        public b(t13.d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return p.this.new b(dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super List<? extends s>> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, java.util.Map] */
        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            String strB;
            List<fo2.m> listB;
            fo2.m mVar;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f139315a;
            p pVar = p.this;
            if (i14 == 0) {
                o13.r.b(obj);
                fo2.u uVar = pVar.O0().f205979a.f205530e;
                uVar.getClass();
                String id3 = uVar.getCom.google.android.exoplayer2.text.ttml.TtmlNode.ATTR_ID java.lang.String();
                id3.getClass();
                zn2.u0 u0Var = zn2.u0.f205864a;
                fo2.j0 j0Var = fo2.j0.RESTORE_AVAILABLE;
                this.f139315a = 1;
                obj = u0Var.l(id3, j0Var, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            ArrayList<fo2.i0> arrayList = new ArrayList();
            for (Object obj2 : (List) obj) {
                fo2.i0 i0Var = (fo2.i0) obj2;
                fo2.j0 j0VarY = i0Var.getCom.google.firebase.remoteconfig.RemoteConfigConstants.ResponseFieldKey.STATE java.lang.String();
                j0VarY.getClass();
                if (j0VarY == fo2.j0.RESTORE_AVAILABLE && p005kotlin.jvm.internal.s.g(i0Var.getProductId(), pVar.product.getProductId())) {
                    arrayList.add(obj2);
                }
            }
            ArrayList arrayList2 = new ArrayList(p13.y.r(arrayList, 10));
            for (fo2.i0 i0Var2 : arrayList) {
                String strT = i0Var2.getProductName();
                fo2.d dVarG = i0Var2.g();
                if (dVarG == null || (listB = dVarG.b()) == null || (mVar = (fo2.m) p13.h0.I0(listB)) == null || (strB = mVar.b()) == null) {
                    strB = "";
                }
                fo2.p pVar2 = (fo2.p) i0Var2.getLinks().f51142a.get("restore");
                String link = pVar2 != null ? pVar2.getLink() : null;
                Double dF = i0Var2.getBalance();
                if (dF == null) {
                    o2.c.m("Balance shouldn't be null when the card has been shifted out");
                    return null;
                }
                arrayList2.add(new s(strT, strB, link, dF.doubleValue()));
            }
            return arrayList2;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)Ljava/lang/String;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.feature.garminpay.providers.gpay.snowball.ui.SnowballAddCardModel$getIssuerTCText$2", f = "SnowballAddCardModel.kt", l = {76}, m = "invokeSuspend", v = 2)
    public static final class c extends v13.i implements e23.p<o53.b0, t13.d<? super String>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f139317a;

        @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"po2/p$c$a", "Lokhttp3/Callback;", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class a implements Callback {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ t13.d<String> f139319a;

            /* JADX WARN: Multi-variable type inference failed */
            public a(t13.d<? super String> dVar) {
                this.f139319a = dVar;
            }

            @Override // okhttp3.Callback
            public final void onFailure(Call call, IOException iOException) {
                call.getClass();
                iOException.getClass();
                int i14 = o13.q.f128596b;
                this.f139319a.resumeWith(new o13.q.b(iOException));
            }

            @Override // okhttp3.Callback
            public final void onResponse(Call call, Response response) {
                t13.d<String> dVar = this.f139319a;
                call.getClass();
                response.getClass();
                try {
                    if (!response.isSuccessful()) {
                        throw new IllegalStateException(response + " is not successful");
                    }
                    ResponseBody responseBodyBody = response.body();
                    if (responseBodyBody != null) {
                        try {
                            w63.h hVarByteString = responseBodyBody.byteString();
                            Charset charsetForName = Charset.forName("UTF8");
                            charsetForName.getClass();
                            String strO = hVarByteString.o(charsetForName);
                            responseBodyBody.close();
                            if (strO != null) {
                                int i14 = o13.q.f128596b;
                                dVar.resumeWith(strO);
                                return;
                            }
                        } catch (Throwable th3) {
                            try {
                                throw th3;
                            } catch (Throwable th4) {
                                jg.b.l(responseBodyBody, th3);
                                throw th4;
                            }
                        }
                    }
                    throw new IllegalStateException("Cannot get body from " + response);
                } catch (Throwable th5) {
                    int i15 = o13.q.f128596b;
                    dVar.resumeWith(new o13.q.b(th5));
                }
            }
        }

        public c(t13.d<? super c> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return p.this.new c(dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super String> dVar) {
            return ((c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f139317a;
            if (i14 != 0) {
                if (i14 == 1) {
                    o13.r.b(obj);
                    return obj;
                }
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(obj);
            this.f139317a = 1;
            t13.i iVar = new t13.i(u13.f.b(this));
            bz0.o.f22274a.getClass();
            OkHttpClient okHttpClientJ = bz0.o.j();
            Request.Builder builder = new Request.Builder().get();
            String strI = p.this.product.getCardMetaData().getTermsAndConditionsUrl();
            strI.getClass();
            okHttpClientJ.newCall(builder.url(strI).build()).enqueue(new a(iVar));
            Object objA = iVar.a();
            return objA == aVar ? aVar : objA;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    @v13.e(c = "com.garmin.feature.garminpay.providers.gpay.snowball.ui.SnowballAddCardModel", f = "SnowballAddCardModel.kt", l = {119, 124}, m = "makePurchase", v = 2)
    public static final class d extends v13.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f139320a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f139321b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f139323d;

        public d(t13.d<? super d> dVar) {
            super(dVar);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            this.f139321b = obj;
            this.f139323d |= Integer.MIN_VALUE;
            return p.this.C(null, this);
        }
    }

    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\u000b"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 3, 0}, xi = 48)
    @v13.e(c = "com.garmin.feature.garminpay.providers.gpay.snowball.ui.SnowballAddCardModel$makePurchase$2$1", f = "SnowballAddCardModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class e extends v13.i implements e23.l<t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ fo2.a0 f139324a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ p f139325b;

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final /* synthetic */ class a extends p005kotlin.jvm.internal.q implements e23.l<v0, Unit> {
            public a(Object obj) {
                super(1, obj, p.class, "onDownloadOperationTimerReady", "onDownloadOperationTimerReady(Lcom/garmin/feature/garminpay/providers/gpay/snowball/ui/TransitCardOperationTimer;)V", 0);
            }

            @Override // e23.l
            public final Unit invoke(v0 v0Var) {
                v0 v0Var2 = v0Var;
                v0Var2.getClass();
                ((p) this.receiver).Y0(v0Var2);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(fo2.a0 a0Var, p pVar, t13.d<? super e> dVar) {
            super(1, dVar);
            this.f139324a = a0Var;
            this.f139325b = pVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(t13.d<?> dVar) {
            return new e(this.f139324a, this.f139325b, dVar);
        }

        @Override // e23.l
        public final Object invoke(t13.d<? super Unit> dVar) {
            return ((e) create(dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.Map] */
        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            String link;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            fo2.a0 a0Var = this.f139324a;
            fo2.p pVar = (fo2.p) a0Var.getLinks().f51142a.get("self");
            if (pVar == null || (link = pVar.getLink()) == null) {
                p6.b.p(a0Var, "Null self link in ");
                return null;
            }
            k0.a aVar2 = k0.f139256j;
            String purchaseId = a0Var.getPurchaseId();
            p pVar2 = this.f139325b;
            po2.g gVar = new po2.g(purchaseId, link, 0L, 0L, pVar2.getDevice().getUnitID(), 12, null);
            k0.a.a(aVar2, gVar, new a(pVar2));
            pVar2.downloadFlow = pVar2.W0(gVar.a(pVar2.O0().f205982d, pVar2.N0(), pVar2.M0()));
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    @v13.e(c = "com.garmin.feature.garminpay.providers.gpay.snowball.ui.SnowballAddCardModel", f = "SnowballAddCardModel.kt", l = {181}, m = "refreshProduct", v = 2)
    public static final class f extends v13.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public p f139326a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f139327b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f139329d;

        public f(t13.d<? super f> dVar) {
            super(dVar);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            this.f139327b = obj;
            this.f139329d |= Integer.MIN_VALUE;
            return p.this.z0(this);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class g implements z0, p005kotlin.jvm.internal.n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.l f139330a;

        public g(e23.l lVar) {
            lVar.getClass();
            this.f139330a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof z0) && (obj instanceof p005kotlin.jvm.internal.n)) {
                return p005kotlin.jvm.internal.s.g(getFunctionDelegate(), ((p005kotlin.jvm.internal.n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final o13.h<?> getFunctionDelegate() {
            return this.f139330a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.z0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f139330a.invoke(obj);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    @v13.e(c = "com.garmin.feature.garminpay.providers.gpay.snowball.ui.SnowballAddCardModel", f = "SnowballAddCardModel.kt", l = {SyslogConstants.LOG_LOCAL3, 158}, m = "shiftInCard", v = 2)
    public static final class h extends v13.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f139331a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f139332b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f139334d;

        public h(t13.d<? super h> dVar) {
            super(dVar);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            this.f139332b = obj;
            this.f139334d |= Integer.MIN_VALUE;
            return p.this.d0(null, this);
        }
    }

    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\u000b"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 3, 0}, xi = 48)
    @v13.e(c = "com.garmin.feature.garminpay.providers.gpay.snowball.ui.SnowballAddCardModel$shiftInCard$2$1", f = "SnowballAddCardModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class i extends v13.i implements e23.l<t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ fo2.l0 f139336b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f139337c;

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        public static final /* synthetic */ class a extends p005kotlin.jvm.internal.q implements e23.l<v0, Unit> {
            public a(Object obj) {
                super(1, obj, p.class, "onDownloadOperationTimerReady", "onDownloadOperationTimerReady(Lcom/garmin/feature/garminpay/providers/gpay/snowball/ui/TransitCardOperationTimer;)V", 0);
            }

            @Override // e23.l
            public final Unit invoke(v0 v0Var) {
                v0 v0Var2 = v0Var;
                v0Var2.getClass();
                ((p) this.receiver).Y0(v0Var2);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(fo2.l0 l0Var, String str, t13.d<? super i> dVar) {
            super(1, dVar);
            this.f139336b = l0Var;
            this.f139337c = str;
        }

        @Override // v13.a
        public final t13.d<Unit> create(t13.d<?> dVar) {
            return p.this.new i(this.f139336b, this.f139337c, dVar);
        }

        @Override // e23.l
        public final Object invoke(t13.d<? super Unit> dVar) {
            return ((i) create(dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            o13.r.b(obj);
            k0.a aVar2 = k0.f139256j;
            String strB = this.f139336b.getCredentialId();
            p pVar = p.this;
            po2.i iVar = new po2.i(strB, this.f139337c, 0L, 0L, pVar.getDevice().getUnitID(), 12, null);
            k0.a.a(aVar2, iVar, new a(pVar));
            pVar.downloadFlow = pVar.W0(iVar.a(pVar.O0().f205982d, pVar.N0(), pVar.M0()));
            return Unit.INSTANCE;
        }
    }

    static {
        int i14 = gt2.c.f79010a;
        f139309m = gt2.b.f79005a.h(f139308l);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(sd2.f fVar, Product product) {
        super(fVar.getUnitID());
        fVar.getClass();
        product.getClass();
        this.device = fVar;
        this.product = product;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final <T> androidx.lifecycle.s0<T> W0(r53.i<? extends T> iVar) {
        androidx.lifecycle.j jVarB = androidx.lifecycle.v.b(iVar);
        jVarB.g(new g(new o(1)));
        return jVarB;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit X0(Object obj) {
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Y0(v0 timer) {
        this.downloadOperationTimer = timer;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, java.util.Map] */
    @Override // po2.k
    public Object C(fo2.i iVar, t13.d<? super fo2.a0> dVar) {
        d dVar2;
        if (dVar instanceof d) {
            dVar2 = (d) dVar;
            int i14 = dVar2.f139323d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                dVar2.f139323d = i14 - Integer.MIN_VALUE;
            } else {
                dVar2 = new d(dVar);
            }
        } else {
            dVar2 = new d(dVar);
        }
        Object objA = dVar2.f139321b;
        Object obj = u13.a.COROUTINE_SUSPENDED;
        int i15 = dVar2.f139323d;
        if (i15 == 0) {
            o13.r.b(objA);
            String strN0 = N0();
            fo2.x xVarC0 = c0();
            double dA = iVar.getTotalCost().a();
            double dA2 = iVar.getTotalCredit().a();
            String str = this.phoneNumber;
            if (str == null) {
                p005kotlin.jvm.internal.s.m("phoneNumber");
                throw null;
            }
            fo2.b0 b0Var = new fo2.b0(strN0, xVarC0, dA, dA2, str);
            zn2.u0 u0Var = zn2.u0.f205864a;
            fo2.p pVar = (fo2.p) this.product.getLinks().f51142a.get(FirebaseAnalytics.Event.PURCHASE);
            pVar.getClass();
            String link = pVar.getLink();
            link.getClass();
            dVar2.f139323d = 1;
            u0Var.getClass();
            objA = ao2.b.a(zn2.u0.g(), link, b0Var, dVar2);
            if (objA != obj) {
            }
        }
        if (i15 != 1) {
            if (i15 != 2) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            Object obj2 = dVar2.f139320a;
            o13.r.b(objA);
            return obj2;
        }
        o13.r.b(objA);
        Object objB = ao2.b.b((c83.a0) objA);
        f139309m.debug("Add card download flow created");
        e23.l<? super t13.d<? super Unit>, ? extends Object> eVar = new e((fo2.a0) objB, this, null);
        dVar2.f139320a = objB;
        dVar2.f139323d = 2;
        return Q0(eVar, dVar2) == obj ? obj : objB;
    }

    @Override // po2.k
    public Object G0(t13.d<? super List<s>> dVar) {
        x53.c cVar = o53.s0.f129406a;
        return ge1.b.e0(x53.b.f189152a, new b(null), dVar);
    }

    @Override // po2.k
    public fo2.i H() {
        fo2.i iVarG = this.product.getIssueFee();
        iVarG.getClass();
        return iVarG;
    }

    @Override // po2.k
    public Object U(t13.d<? super androidx.lifecycle.s0<aq2.l<Unit>>> dVar) {
        androidx.lifecycle.s0<aq2.l<Unit>> s0Var = this.downloadFlow;
        if (s0Var != null) {
            return s0Var;
        }
        o2.c.m("Download Flow is null");
        return null;
    }

    @Override // po2.k
    public void b0(String phoneNumber) {
        phoneNumber.getClass();
        this.phoneNumber = phoneNumber;
    }

    @Override // po2.k
    public fo2.x c0() {
        Object next;
        List<fo2.x> listK = this.product.k();
        if (listK != null) {
            Iterator<T> it = listK.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (((fo2.x) next) != fo2.x.ALIPAY);
            fo2.x xVar = (fo2.x) next;
            if (xVar != null) {
                return xVar;
            }
        }
        p6.b.n(this.product, "Alipay is not supported in ");
        return null;
    }

    @Override // po2.k
    public String d() {
        return this.product.getProductName();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x008b, code lost:
    
        if (Q0(r4, r0) == r1) goto L28;
     */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, java.util.Map] */
    @Override // po2.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object d0(s sVar, t13.d<? super Unit> dVar) {
        h hVar;
        String link;
        if (dVar instanceof h) {
            hVar = (h) dVar;
            int i14 = hVar.f139334d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                hVar.f139334d = i14 - Integer.MIN_VALUE;
            } else {
                hVar = new h(dVar);
            }
        } else {
            hVar = new h(dVar);
        }
        Object objI = hVar.f139332b;
        Object obj = u13.a.COROUTINE_SUSPENDED;
        int i15 = hVar.f139334d;
        if (i15 != 0) {
            if (i15 == 1) {
                o13.r.b(objI);
            } else {
                if (i15 != 2) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(objI);
            }
            return Unit.INSTANCE;
        }
        o13.r.b(objI);
        zn2.u0 u0Var = zn2.u0.f205864a;
        String str = sVar.f139374c;
        if (str == null) {
            p6.b.p(sVar, "No restore link in ");
            return null;
        }
        fo2.g0 g0Var = new fo2.g0(N0());
        hVar.f139334d = 1;
        u0Var.getClass();
        objI = zn2.u0.g().i(str, g0Var, hVar);
        if (objI != obj) {
        }
        return obj;
        Object objB = ao2.b.b((c83.a0) objI);
        fo2.l0 l0Var = (fo2.l0) objB;
        f139309m.debug("Shift-in card download flow created");
        fo2.p pVar = (fo2.p) l0Var.getLinks().f51142a.get("self");
        if (pVar == null || (link = pVar.getLink()) == null) {
            p6.b.p(l0Var, "No self link in ");
            return null;
        }
        e23.l<? super t13.d<? super Unit>, ? extends Object> iVar = new i(l0Var, link, null);
        hVar.f139331a = objB;
        hVar.f139334d = 2;
    }

    @Override // po2.k
    public void g0() {
        v0 v0Var = this.downloadOperationTimer;
        if (v0Var != null) {
            v0Var.a();
        } else {
            o2.c.m("downloadOperationTimer shouldn't be null here");
        }
    }

    @Override // po2.k
    public sd2.f getDevice() {
        return this.device;
    }

    @Override // po2.k
    public int h() {
        return this.product.getAgeBeforeDeletableDays();
    }

    @Override // po2.k
    public String l() {
        fo2.m mVar;
        String strB;
        List<fo2.m> listB = this.product.getCardMetaData().b();
        return (listB == null || (mVar = (fo2.m) p13.h0.I0(listB)) == null || (strB = mVar.b()) == null) ? "" : strB;
    }

    @Override // po2.k
    public Object m(fo2.q qVar, t13.d<? super Unit> dVar) {
        this.product.r(qVar);
        return Unit.INSTANCE;
    }

    @Override // po2.k
    public Object r0(t13.d<? super Unit> dVar) {
        Object objZ0;
        fo2.p pVarA = this.product.getLinks().a(FirebaseAnalytics.Event.PURCHASE);
        return ((pVarA != null ? pVarA.getLink() : null) == null && (objZ0 = z0(dVar)) == u13.a.COROUTINE_SUSPENDED) ? objZ0 : Unit.INSTANCE;
    }

    @Override // po2.k
    public List<fo2.i> s() {
        List<fo2.i> listQ = this.product.q();
        listQ.getClass();
        return listQ;
    }

    @Override // po2.k
    public Object v(t13.d<? super String> dVar) {
        x53.c cVar = o53.s0.f129406a;
        return ge1.b.e0(x53.b.f189152a, new c(null), dVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.Object, java.util.Map] */
    @Override // po2.k
    public Object z0(t13.d<? super Unit> dVar) {
        f fVar;
        String link;
        p pVar;
        if (dVar instanceof f) {
            fVar = (f) dVar;
            int i14 = fVar.f139329d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                fVar.f139329d = i14 - Integer.MIN_VALUE;
            } else {
                fVar = new f(dVar);
            }
        } else {
            fVar = new f(dVar);
        }
        Object objE = fVar.f139327b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = fVar.f139329d;
        if (i15 == 0) {
            o13.r.b(objE);
            fo2.p pVar2 = (fo2.p) this.product.getLinks().f51142a.get("self");
            if (pVar2 == null || (link = pVar2.getLink()) == null) {
                p6.b.n(this.product, "No self link in ");
                return null;
            }
            zn2.u0 u0Var = zn2.u0.f205864a;
            fVar.f139326a = this;
            fVar.f139329d = 1;
            u0Var.getClass();
            objE = zn2.u0.g().e(link, fVar);
            if (objE == aVar) {
                return aVar;
            }
            pVar = this;
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            pVar = fVar.f139326a;
            o13.r.b(objE);
        }
        pVar.product = (Product) ao2.b.b((c83.a0) objE);
        return Unit.INSTANCE;
    }
}
