package po2;

import ch.qos.logback.core.net.SyslogConstants;
import ch.qos.logback.core.rolling.helper.IntegerTokenConverter;
import com.garmin.feature.garminpay.providers.felica.exception.DeviceNotConnectedException;
import com.garmin.feature.garminpay.providers.gpay.NewFitPayException;
import com.garmin.feature.garminpay.providers.gpay.model.Product;
import com.garmin.feature.garminpay.providers.gpay.snowball.CurrencyValue;
import com.garmin.feature.garminpay.providers.gpay.snowball.exception.AppletExpiredException;
import com.garmin.feature.garminpay.providers.gpay.snowball.exception.CardBalanceExceededException;
import com.garmin.feature.garminpay.providers.gpay.snowball.exception.CardInProcessingException;
import com.garmin.feature.garminpay.providers.gpay.snowball.exception.CardRetryFailedException;
import com.garmin.feature.garminpay.providers.gpay.snowball.exception.InTransitException;
import com.garmin.feature.garminpay.providers.gpay.snowball.exception.MaintenanceException;
import com.garmin.feature.garminpay.providers.gpay.snowball.exception.NotAbleToDeleteCardException;
import com.garmin.feature.garminpay.providers.gpay.snowball.exception.ProviderErrorCodeException;
import com.google.common.base.Optional;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.nimbusds.jose.jwk.JWKParameterNames;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlinx.coroutines.CoroutineExceptionHandler;
import org.joda.time.DateTimeZone;
import org.joda.time.LocalDate;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import r1.q2;
import zn2.g1;
import zn2.i2;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0007\u0018\u0000 [2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\\B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nH\u0096@¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\nH\u0096@¢\u0006\u0004\b\r\u0010\fJ\u0010\u0010\u000e\u001a\u00020\nH\u0096@¢\u0006\u0004\b\u000e\u0010\fJ\u0010\u0010\u0010\u001a\u00020\u000fH\u0096@¢\u0006\u0004\b\u0010\u0010\fJ\u0010\u0010\u0012\u001a\u00020\u0011H\u0096@¢\u0006\u0004\b\u0012\u0010\fJ\u0018\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013H\u0096@¢\u0006\u0004\b\u0015\u0010\fJ\u0010\u0010\u0016\u001a\u00020\u0014H\u0096@¢\u0006\u0004\b\u0016\u0010\fJ\u0010\u0010\u0017\u001a\u00020\nH\u0096@¢\u0006\u0004\b\u0017\u0010\fJ\u0010\u0010\u0018\u001a\u00020\nH\u0096@¢\u0006\u0004\b\u0018\u0010\fJ\u0018\u0010\u001a\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\u0014H\u0096@¢\u0006\u0004\b\u001a\u0010\u001bJ\u0016\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001cH\u0096@¢\u0006\u0004\b\u001e\u0010\fJ\u0018\u0010!\u001a\u00020\n2\u0006\u0010 \u001a\u00020\u001fH\u0096@¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\nH\u0096@¢\u0006\u0004\b#\u0010\fJ\u0010\u0010$\u001a\u00020\nH\u0096@¢\u0006\u0004\b$\u0010\fJ\u0010\u0010%\u001a\u00020\nH\u0096@¢\u0006\u0004\b%\u0010\fJ\u0010\u0010&\u001a\u00020\nH\u0096@¢\u0006\u0004\b&\u0010\fJ\u0018\u0010*\u001a\u00020)2\u0006\u0010(\u001a\u00020'H\u0096@¢\u0006\u0004\b*\u0010+J\u000f\u0010-\u001a\u00020,H\u0016¢\u0006\u0004\b-\u0010.J\u0010\u0010/\u001a\u00020\nH\u0096@¢\u0006\u0004\b/\u0010\fJ\u0016\u00100\u001a\b\u0012\u0004\u0012\u00020)0\u001cH\u0096@¢\u0006\u0004\b0\u0010\fJ\u000f\u00101\u001a\u00020\nH\u0016¢\u0006\u0004\b1\u00102J\u0010\u00103\u001a\u00020\nH\u0082@¢\u0006\u0004\b3\u0010\fJ7\u0010;\u001a\u00020\n2\u0006\u00105\u001a\u0002042\u0006\u00106\u001a\u0002042\u0006\u00107\u001a\u0002042\u0006\u00108\u001a\u0002042\u0006\u0010:\u001a\u000209H\u0002¢\u0006\u0004\b;\u0010<J\u0017\u0010?\u001a\u00020\n2\u0006\u0010>\u001a\u00020=H\u0002¢\u0006\u0004\b?\u0010@J\u0010\u0010A\u001a\u00020\nH\u0082@¢\u0006\u0004\bA\u0010\fR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bD\u0010ER\u0016\u0010\u0007\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u0010GR\u0016\u0010K\u001a\u00020H8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bI\u0010JR(\u0010R\u001a\b\u0012\u0004\u0012\u0002090L8\u0016@\u0016X\u0096.¢\u0006\u0012\n\u0004\b-\u0010M\u001a\u0004\bN\u0010O\"\u0004\bP\u0010QR\u0018\u0010U\u001a\u0004\u0018\u00010=8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bS\u0010TR\u0014\u0010X\u001a\u0002048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bV\u0010WR\u0014\u0010Z\u001a\u0002048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bY\u0010W¨\u0006]"}, d2 = {"Lpo2/w;", "Lpo2/a;", "Lpo2/n;", "Lpo2/m;", "Lsd2/f;", "device", "Lfo2/l0;", "credential", "<init>", "(Lsd2/f;Lfo2/l0;)V", "", "C0", "(Lt13/d;)Ljava/lang/Object;", "l0", "h0", "Lpo2/t;", "u0", "Lpo2/g0;", "I", "Las2/b;", "Lcom/garmin/feature/garminpay/providers/gpay/snowball/CurrencyValue;", "F", "R", "J", JWKParameterNames.RSA_OTHER_PRIMES__FACTOR_CRT_COEFFICIENT, "expectedBalance", "G", "(Lcom/garmin/feature/garminpay/providers/gpay/snowball/CurrencyValue;Lt13/d;)Ljava/lang/Object;", "", "Lfo2/i;", "A", "Lfo2/q;", "action", "m", "(Lfo2/q;Lt13/d;)Ljava/lang/Object;", "m0", "X", "O", "e0", "Lfo2/b0;", "purchaseRequest", "Lfo2/a0;", "L", "(Lfo2/b0;Lt13/d;)Ljava/lang/Object;", "", "h", "()I", "T", "D0", "Y", "()V", "W0", "", "purchaseId", "purchaseLink", "credentialId", "credentialLink", "", "amount", "a1", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;D)V", "Lpo2/v0;", "timer", "X0", "(Lpo2/v0;)V", "Y0", JWKParameterNames.RSA_EXPONENT, "Lsd2/f;", "getDevice", "()Lsd2/f;", "f", "Lfo2/l0;", "Lcom/garmin/feature/garminpay/providers/gpay/model/Product;", "g", "Lcom/garmin/feature/garminpay/providers/gpay/model/Product;", "product", "Lo53/i0;", "Lo53/i0;", "w0", "()Lo53/i0;", "Z0", "(Lo53/i0;)V", "cardChargingAsync", IntegerTokenConverter.CONVERTER_KEY, "Lpo2/v0;", "chargingOperationTimer", "l", "()Ljava/lang/String;", "cardImageUrl", "d", "cardName", "j", "a", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class w extends a<po2.n> implements po2.m {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f139397k = 8;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final Logger f139398l;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final sd2.f device;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private fo2.l0 credential;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private Product product;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    public o53.i0<Double> cardChargingAsync;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private v0 chargingOperationTimer;

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f139404a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f139405b;

        static {
            int[] iArr = new int[fo2.e.values().length];
            try {
                iArr[fo2.e.PENDING_PERSO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[fo2.e.PENDING_DELETE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[fo2.e.PENDING_CUSTOMER_SUPPORT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[fo2.e.DELETED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[fo2.e.ACTIVE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f139404a = iArr;
            int[] iArr2 = new int[fo2.o.values().length];
            try {
                iArr2[fo2.o.PAUSED.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[fo2.o.COMPLETE.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[fo2.o.PROCESSING.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[fo2.o.FAILED.ordinal()] = 4;
            } catch (NoSuchFieldError unused9) {
            }
            f139405b = iArr2;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.feature.garminpay.providers.gpay.snowball.ui.SnowballCardDetailModel$deleteCard$2", f = "SnowballCardDetailModel.kt", l = {215, 218}, m = "invokeSuspend", v = 2)
    public static final class c extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f139406a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f139407b;

        @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\u000b"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 3, 0}, xi = 48)
        @v13.e(c = "com.garmin.feature.garminpay.providers.gpay.snowball.ui.SnowballCardDetailModel$deleteCard$2$1", f = "SnowballCardDetailModel.kt", l = {222, 239}, m = "invokeSuspend", v = 2)
        public static final class a extends v13.i implements e23.l<t13.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f139409a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ w f139410b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ o53.b0 f139411c;

            /* JADX INFO: renamed from: po2.w$c$a$a, reason: collision with other inner class name */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
            @v13.e(c = "com.garmin.feature.garminpay.providers.gpay.snowball.ui.SnowballCardDetailModel$deleteCard$2$1$2", f = "SnowballCardDetailModel.kt", l = {236}, m = "invokeSuspend", v = 2)
            public static final class C2634a extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public int f139412a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ w f139413b;

                /* JADX INFO: renamed from: po2.w$c$a$a$a, reason: collision with other inner class name */
                @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lwl2/b;", "", "<anonymous>", "(Lwl2/b;)V"}, k = 3, mv = {2, 3, 0})
                @v13.e(c = "com.garmin.feature.garminpay.providers.gpay.snowball.ui.SnowballCardDetailModel$deleteCard$2$1$2$1", f = "SnowballCardDetailModel.kt", l = {236}, m = "invokeSuspend", v = 2)
                public static final class C2635a extends v13.i implements e23.p<wl2.b, t13.d<? super Unit>, Object> {

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public int f139414a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public /* synthetic */ Object f139415b;

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    public final /* synthetic */ w f139416c;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C2635a(w wVar, t13.d<? super C2635a> dVar) {
                        super(2, dVar);
                        this.f139416c = wVar;
                    }

                    @Override // v13.a
                    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                        C2635a c2635a = new C2635a(this.f139416c, dVar);
                        c2635a.f139415b = obj;
                        return c2635a;
                    }

                    @Override // e23.p
                    public final Object invoke(wl2.b bVar, t13.d<? super Unit> dVar) {
                        return ((C2635a) create(bVar, dVar)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // v13.a
                    public final Object invokeSuspend(Object obj) {
                        wl2.b bVar = (wl2.b) this.f139415b;
                        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                        int i14 = this.f139414a;
                        if (i14 == 0) {
                            o13.r.b(obj);
                            byte[] bArrD = this.f139416c.credential.d();
                            int i15 = wl2.b.f186020p;
                            ListenableFuture listenableFutureK = bVar.k(0L, bArrD);
                            this.f139415b = null;
                            this.f139414a = 1;
                            if (t53.c.b(listenableFutureK, this) == aVar) {
                                return aVar;
                            }
                        } else {
                            if (i14 != 1) {
                                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            o13.r.b(obj);
                        }
                        return Unit.INSTANCE;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C2634a(w wVar, t13.d<? super C2634a> dVar) {
                    super(2, dVar);
                    this.f139413b = wVar;
                }

                @Override // v13.a
                public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                    return new C2634a(this.f139413b, dVar);
                }

                @Override // e23.p
                public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
                    return ((C2634a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // v13.a
                public final Object invokeSuspend(Object obj) {
                    u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                    int i14 = this.f139412a;
                    if (i14 == 0) {
                        o13.r.b(obj);
                        w wVar = this.f139413b;
                        hs2.d dVar = wVar.P0().f205816b;
                        C2635a c2635a = new C2635a(wVar, null);
                        this.f139412a = 1;
                        if (ks2.e.d(dVar, c2635a, this) == aVar) {
                            return aVar;
                        }
                    } else {
                        if (i14 != 1) {
                            vb.h.z("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        o13.r.b(obj);
                    }
                    return Unit.INSTANCE;
                }
            }

            @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"po2/w$c$a$b", "Lt13/a;", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final class b extends t13.a implements CoroutineExceptionHandler {
                public b(CoroutineExceptionHandler.a aVar) {
                    super(aVar);
                }

                @Override // kotlinx.coroutines.CoroutineExceptionHandler
                public final void L(Throwable th3, t13.g gVar) {
                    w.f139398l.warn("Failed to delete metadata", th3);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(w wVar, o53.b0 b0Var, t13.d<? super a> dVar) {
                super(1, dVar);
                this.f139410b = wVar;
                this.f139411c = b0Var;
            }

            @Override // v13.a
            public final t13.d<Unit> create(t13.d<?> dVar) {
                return new a(this.f139410b, this.f139411c, dVar);
            }

            @Override // e23.l
            public final Object invoke(t13.d<? super Unit> dVar) {
                return ((a) create(dVar)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Code restructure failed: missing block: B:23:0x00d9, code lost:
            
                if (r53.s.j(r2, r19) == r1) goto L24;
             */
            /* JADX WARN: Type inference failed for: r2v13, types: [java.lang.Object, java.util.Map] */
            /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, java.util.Map] */
            @Override // v13.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) {
                String link;
                Object objI;
                String link2;
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i14 = this.f139409a;
                w wVar = this.f139410b;
                if (i14 != 0) {
                    if (i14 == 1) {
                        o13.r.b(obj);
                        objI = obj;
                    } else {
                        if (i14 != 2) {
                            vb.h.z("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        o13.r.b(obj);
                    }
                    return Unit.INSTANCE;
                }
                o13.r.b(obj);
                fo2.p pVar = (fo2.p) wVar.credential.k().getLinks().f51142a.get("self");
                if (pVar == null || (link = pVar.getLink()) == null) {
                    com.google.firebase.messaging.l.i(wVar.credential.h(), " does not contains self link");
                    return null;
                }
                zn2.u0 u0Var = zn2.u0.f205864a;
                aq2.j.f12491a.getClass();
                boolean zG = aq2.j.g();
                this.f139409a = 1;
                u0Var.getClass();
                objI = zn2.u0.g().I(link, zG, this);
                if (objI != aVar) {
                }
                return aVar;
                ao2.b.b((c83.a0) objI);
                fo2.p pVar2 = (fo2.p) wVar.credential.getLinks().f51142a.get("self");
                if (pVar2 == null || (link2 = pVar2.getLink()) == null) {
                    com.google.firebase.messaging.l.i(wVar.credential, " does not contains self link");
                    return null;
                }
                k0.a aVar2 = k0.f139256j;
                po2.j jVar = new po2.j(wVar.credential.getCredentialId(), link2, 0L, 0L, wVar.getDevice().getUnitID(), 12, null);
                aVar2.getClass();
                jVar.f139263f = new k0.b(jVar, 180000L, new j0(jVar));
                r53.b bVarA = jVar.a(wVar.O0().f205982d, wVar.N0(), wVar.M0());
                ge1.b.T(this.f139411c, new b(CoroutineExceptionHandler.f105965e0), null, new C2634a(wVar, null), 2);
                this.f139409a = 2;
            }
        }

        public c(t13.d<? super c> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            c cVar = w.this.new c(dVar);
            cVar.f139407b = obj;
            return cVar;
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x0048, code lost:
        
            if (r3.Q0(r7, r6) == r1) goto L17;
         */
        @Override // v13.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            o53.b0 b0Var = (o53.b0) this.f139407b;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f139406a;
            w wVar = w.this;
            if (i14 != 0) {
                if (i14 == 1) {
                    o13.r.b(obj);
                } else {
                    if (i14 != 2) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    o13.r.b(obj);
                }
                return Unit.INSTANCE;
            }
            o13.r.b(obj);
            aq2.j.f12491a.getClass();
            if (!aq2.j.e()) {
                this.f139407b = b0Var;
                this.f139406a = 1;
                if (wVar.Y0(this) != aVar) {
                }
            }
            return aVar;
            a aVar2 = new a(wVar, b0Var, null);
            this.f139407b = null;
            this.f139406a = 2;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    @v13.e(c = "com.garmin.feature.garminpay.providers.gpay.snowball.ui.SnowballCardDetailModel", f = "SnowballCardDetailModel.kt", l = {146}, m = "ensureCurrentBalanceNotExceedingUpperBound", v = 2)
    public static final class d extends v13.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f139417a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f139419c;

        public d(t13.d<? super d> dVar) {
            super(dVar);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            this.f139417a = obj;
            this.f139419c |= Integer.MIN_VALUE;
            return w.this.t(this);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    @v13.e(c = "com.garmin.feature.garminpay.providers.gpay.snowball.ui.SnowballCardDetailModel", f = "SnowballCardDetailModel.kt", l = {174}, m = "ensureIsUserOutOfStation", v = 2)
    public static final class e extends v13.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f139420a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f139422c;

        public e(t13.d<? super e> dVar) {
            super(dVar);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            this.f139420a = obj;
            this.f139422c |= Integer.MIN_VALUE;
            return w.this.m0(this);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    @v13.e(c = "com.garmin.feature.garminpay.providers.gpay.snowball.ui.SnowballCardDetailModel", f = "SnowballCardDetailModel.kt", l = {88}, m = "fetchAndValidateJobStatus", v = 2)
    public static final class f extends v13.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f139423a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f139425c;

        public f(t13.d<? super f> dVar) {
            super(dVar);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            this.f139423a = obj;
            this.f139425c |= Integer.MIN_VALUE;
            return w.this.W0(this);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    @v13.e(c = "com.garmin.feature.garminpay.providers.gpay.snowball.ui.SnowballCardDetailModel", f = "SnowballCardDetailModel.kt", l = {73, 76}, m = "fetchCredentialAndValidate", v = 2)
    public static final class g extends v13.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public w f139426a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f139427b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f139429d;

        public g(t13.d<? super g> dVar) {
            super(dVar);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            this.f139427b = obj;
            this.f139429d |= Integer.MIN_VALUE;
            return w.this.C0(this);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    @v13.e(c = "com.garmin.feature.garminpay.providers.gpay.snowball.ui.SnowballCardDetailModel", f = "SnowballCardDetailModel.kt", l = {103}, m = "fetchProduct", v = 2)
    public static final class h extends v13.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public w f139430a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f139431b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f139433d;

        public h(t13.d<? super h> dVar) {
            super(dVar);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            this.f139431b = obj;
            this.f139433d |= Integer.MIN_VALUE;
            return w.this.h0(this);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    @v13.e(c = "com.garmin.feature.garminpay.providers.gpay.snowball.ui.SnowballCardDetailModel", f = "SnowballCardDetailModel.kt", l = {116}, m = "getCardDetailInfo", v = 2)
    public static final class i extends v13.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f139434a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f139435b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f139436c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public String f139437d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public String f139438e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public /* synthetic */ Object f139439f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f139441h;

        public i(t13.d<? super i> dVar) {
            super(dVar);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            this.f139439f = obj;
            this.f139441h |= Integer.MIN_VALUE;
            return w.this.u0(this);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    @v13.e(c = "com.garmin.feature.garminpay.providers.gpay.snowball.ui.SnowballCardDetailModel", f = "SnowballCardDetailModel.kt", l = {122}, m = "getCardUsageHistory", v = 2)
    public static final class j extends v13.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f139442a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f139444c;

        public j(t13.d<? super j> dVar) {
            super(dVar);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            this.f139442a = obj;
            this.f139444c |= Integer.MIN_VALUE;
            return w.this.I(this);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    @v13.e(c = "com.garmin.feature.garminpay.providers.gpay.snowball.ui.SnowballCardDetailModel", f = "SnowballCardDetailModel.kt", l = {133}, m = "getCurrentBalance", v = 2)
    public static final class k extends v13.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f139445a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f139447c;

        public k(t13.d<? super k> dVar) {
            super(dVar);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            this.f139445a = obj;
            this.f139447c |= Integer.MIN_VALUE;
            return w.this.R(this);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo53/b0;", "", "Lfo2/a0;", "<anonymous>", "(Lo53/b0;)Ljava/util/List;"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.feature.garminpay.providers.gpay.snowball.ui.SnowballCardDetailModel$getUserOrders$2", f = "SnowballCardDetailModel.kt", l = {309, 310}, m = "invokeSuspend", v = 2)
    public static final class l extends v13.i implements e23.p<o53.b0, t13.d<? super List<? extends fo2.a0>>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f139448a;

        public l(t13.d<? super l> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return w.this.new l(dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super List<? extends fo2.a0>> dVar) {
            return ((l) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x0057, code lost:
        
            if (r7 == r0) goto L19;
         */
        @Override // v13.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) throws IOException, NewFitPayException {
            String link;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f139448a;
            w wVar = w.this;
            if (i14 == 0) {
                o13.r.b(obj);
                g1 g1Var = wVar.O0().f205979a;
                this.f139448a = 1;
                ch.qos.logback.classic.Logger logger = g1.f205525n;
                obj = g1Var.Q(true, this);
                if (obj != aVar) {
                }
                return aVar;
            }
            if (i14 == 1) {
                o13.r.b(obj);
            } else {
                if (i14 != 2) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : (List) obj) {
                if (p005kotlin.jvm.internal.s.g(wVar.credential.k().getTransitCardId(), ((fo2.a0) obj2).getTransitCardId())) {
                    arrayList.add(obj2);
                }
            }
            return arrayList;
            fo2.p purchases = ((fo2.u) obj).getLinks().getPurchases();
            if (purchases == null || (link = purchases.getLink()) == null) {
                vb.h.z("No purchases link");
                return null;
            }
            zn2.u0 u0Var = zn2.u0.f205864a;
            String transitCardId = wVar.credential.k().getTransitCardId();
            this.f139448a = 2;
            obj = u0Var.n(link, transitCardId, this);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    @v13.e(c = "com.garmin.feature.garminpay.providers.gpay.snowball.ui.SnowballCardDetailModel", f = "SnowballCardDetailModel.kt", l = {248}, m = "recharge", v = 2)
    public static final class m extends v13.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f139450a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f139451b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f139453d;

        public m(t13.d<? super m> dVar) {
            super(dVar);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            this.f139451b = obj;
            this.f139453d |= Integer.MIN_VALUE;
            return w.this.L(null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.feature.garminpay.providers.gpay.snowball.ui.SnowballCardDetailModel$removeRapidPassIfNecessary$2", f = "SnowballCardDetailModel.kt", l = {293, 295}, m = "invokeSuspend", v = 2)
    public static final class n extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public ps2.n f139454a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f139455b;

        public n(t13.d<? super n> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return w.this.new n(dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((n) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:20:0x0079, code lost:
        
            if (w2.a0.g(r1, r8) == r0) goto L21;
         */
        @Override // v13.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) throws Throwable {
            ps2.n nVarI;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f139455b;
            int i15 = 2;
            w wVar = w.this;
            if (i14 != 0) {
                if (i14 == 1) {
                    nVarI = this.f139454a;
                    o13.r.b(obj);
                } else {
                    if (i14 != 2) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    o13.r.b(obj);
                }
                return Unit.INSTANCE;
            }
            o13.r.b(obj);
            ps2.w wVar2 = ps2.w.f140538a;
            long unitID = wVar.getDevice().getUnitID();
            wVar2.getClass();
            nVarI = ps2.w.i(unitID);
            if (nVarI == null) {
                vb.h.z(androidx.room.a0.f(wVar.getDevice().getUnitID(), "Device (", ") has no device wallet"));
                return null;
            }
            e13.b bVarA = nVarI.a();
            this.f139454a = nVarI;
            this.f139455b = 1;
            obj = w2.a0.f(bVarA, this);
            if (obj != aVar) {
            }
            return aVar;
            Optional optional = (Optional) obj;
            if (optional.isPresent() && Arrays.equals(((hs2.c) optional.get()).f85441a, wVar.credential.d())) {
                nVarI.getClass();
                ps2.g gVar = new ps2.g(nVarI, i15);
                int i16 = w03.b.f181178a;
                z03.d dVar = new z03.d(gVar);
                this.f139454a = null;
                this.f139455b = 2;
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.feature.garminpay.providers.gpay.snowball.ui.SnowballCardDetailModel$shiftOutCard$2", f = "SnowballCardDetailModel.kt", l = {181, SyslogConstants.LOG_LOCAL7}, m = "invokeSuspend", v = 2)
    public static final class o extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f139457a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f139458b;

        @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\u000b"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 3, 0}, xi = 48)
        @v13.e(c = "com.garmin.feature.garminpay.providers.gpay.snowball.ui.SnowballCardDetailModel$shiftOutCard$2$1", f = "SnowballCardDetailModel.kt", l = {187, 198}, m = "invokeSuspend", v = 2)
        public static final class a extends v13.i implements e23.l<t13.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public String f139460a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public int f139461b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ w f139462c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ o53.b0 f139463d;

            /* JADX INFO: renamed from: po2.w$o$a$a, reason: collision with other inner class name */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
            @v13.e(c = "com.garmin.feature.garminpay.providers.gpay.snowball.ui.SnowballCardDetailModel$shiftOutCard$2$1$2", f = "SnowballCardDetailModel.kt", l = {195}, m = "invokeSuspend", v = 2)
            public static final class C2636a extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public int f139464a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ w f139465b;

                /* JADX INFO: renamed from: po2.w$o$a$a$a, reason: collision with other inner class name */
                @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lwl2/b;", "", "<anonymous>", "(Lwl2/b;)V"}, k = 3, mv = {2, 3, 0})
                @v13.e(c = "com.garmin.feature.garminpay.providers.gpay.snowball.ui.SnowballCardDetailModel$shiftOutCard$2$1$2$1", f = "SnowballCardDetailModel.kt", l = {195}, m = "invokeSuspend", v = 2)
                public static final class C2637a extends v13.i implements e23.p<wl2.b, t13.d<? super Unit>, Object> {

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public int f139466a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public /* synthetic */ Object f139467b;

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    public final /* synthetic */ w f139468c;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C2637a(w wVar, t13.d<? super C2637a> dVar) {
                        super(2, dVar);
                        this.f139468c = wVar;
                    }

                    @Override // v13.a
                    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                        C2637a c2637a = new C2637a(this.f139468c, dVar);
                        c2637a.f139467b = obj;
                        return c2637a;
                    }

                    @Override // e23.p
                    public final Object invoke(wl2.b bVar, t13.d<? super Unit> dVar) {
                        return ((C2637a) create(bVar, dVar)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // v13.a
                    public final Object invokeSuspend(Object obj) {
                        wl2.b bVar = (wl2.b) this.f139467b;
                        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                        int i14 = this.f139466a;
                        if (i14 == 0) {
                            o13.r.b(obj);
                            byte[] bArrD = this.f139468c.credential.d();
                            int i15 = wl2.b.f186020p;
                            ListenableFuture listenableFutureK = bVar.k(0L, bArrD);
                            this.f139467b = null;
                            this.f139466a = 1;
                            if (t53.c.b(listenableFutureK, this) == aVar) {
                                return aVar;
                            }
                        } else {
                            if (i14 != 1) {
                                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            o13.r.b(obj);
                        }
                        return Unit.INSTANCE;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C2636a(w wVar, t13.d<? super C2636a> dVar) {
                    super(2, dVar);
                    this.f139465b = wVar;
                }

                @Override // v13.a
                public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                    return new C2636a(this.f139465b, dVar);
                }

                @Override // e23.p
                public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
                    return ((C2636a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // v13.a
                public final Object invokeSuspend(Object obj) {
                    u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                    int i14 = this.f139464a;
                    if (i14 == 0) {
                        o13.r.b(obj);
                        w wVar = this.f139465b;
                        hs2.d dVar = wVar.P0().f205816b;
                        C2637a c2637a = new C2637a(wVar, null);
                        this.f139464a = 1;
                        if (ks2.e.d(dVar, c2637a, this) == aVar) {
                            return aVar;
                        }
                    } else {
                        if (i14 != 1) {
                            vb.h.z("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        o13.r.b(obj);
                    }
                    return Unit.INSTANCE;
                }
            }

            @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"po2/w$o$a$b", "Lt13/a;", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 3, 0}, xi = 48)
            public static final class b extends t13.a implements CoroutineExceptionHandler {
                public b(CoroutineExceptionHandler.a aVar) {
                    super(aVar);
                }

                @Override // kotlinx.coroutines.CoroutineExceptionHandler
                public final void L(Throwable th3, t13.g gVar) {
                    w.f139398l.warn("Failed to delete metadata", th3);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(w wVar, o53.b0 b0Var, t13.d<? super a> dVar) {
                super(1, dVar);
                this.f139462c = wVar;
                this.f139463d = b0Var;
            }

            @Override // v13.a
            public final t13.d<Unit> create(t13.d<?> dVar) {
                return new a(this.f139462c, this.f139463d, dVar);
            }

            @Override // e23.l
            public final Object invoke(t13.d<? super Unit> dVar) {
                return ((a) create(dVar)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Code restructure failed: missing block: B:20:0x00b8, code lost:
            
                if (r53.s.j(r2, r17) == r1) goto L21;
             */
            /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, java.util.Map] */
            @Override // v13.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) {
                String link;
                Object objS;
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i14 = this.f139461b;
                w wVar = this.f139462c;
                if (i14 != 0) {
                    if (i14 == 1) {
                        link = this.f139460a;
                        o13.r.b(obj);
                        objS = obj;
                    } else {
                        if (i14 != 2) {
                            vb.h.z("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        o13.r.b(obj);
                    }
                    return Unit.INSTANCE;
                }
                o13.r.b(obj);
                fo2.p pVar = (fo2.p) wVar.credential.getLinks().f51142a.get("self");
                if (pVar == null || (link = pVar.getLink()) == null) {
                    com.google.firebase.messaging.l.i(wVar.credential, " does not contains self link");
                    return null;
                }
                zn2.u0 u0Var = zn2.u0.f205864a;
                this.f139460a = link;
                this.f139461b = 1;
                u0Var.getClass();
                objS = zn2.u0.g().s(link, this);
                if (objS != aVar) {
                }
                return aVar;
                String str = link;
                ao2.b.b((c83.a0) objS);
                k0.a aVar2 = k0.f139256j;
                po2.j jVar = new po2.j(wVar.credential.getCredentialId(), str, 0L, 0L, wVar.getDevice().getUnitID(), 12, null);
                aVar2.getClass();
                jVar.f139263f = new k0.b(jVar, 180000L, new j0(jVar));
                r53.b bVarA = jVar.a(wVar.O0().f205982d, wVar.N0(), wVar.M0());
                ge1.b.T(this.f139463d, new b(CoroutineExceptionHandler.f105965e0), null, new C2636a(wVar, null), 2);
                this.f139460a = null;
                this.f139461b = 2;
            }
        }

        public o(t13.d<? super o> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            o oVar = w.this.new o(dVar);
            oVar.f139458b = obj;
            return oVar;
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
            return ((o) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x0048, code lost:
        
            if (r3.Q0(r7, r6) == r1) goto L17;
         */
        @Override // v13.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            o53.b0 b0Var = (o53.b0) this.f139458b;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f139457a;
            w wVar = w.this;
            if (i14 != 0) {
                if (i14 == 1) {
                    o13.r.b(obj);
                } else {
                    if (i14 != 2) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    o13.r.b(obj);
                }
                return Unit.INSTANCE;
            }
            o13.r.b(obj);
            aq2.j.f12491a.getClass();
            if (!aq2.j.e()) {
                this.f139458b = b0Var;
                this.f139457a = 1;
                if (wVar.Y0(this) != aVar) {
                }
            }
            return aVar;
            a aVar2 = new a(wVar, b0Var, null);
            this.f139458b = null;
            this.f139457a = 2;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)D"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.feature.garminpay.providers.gpay.snowball.ui.SnowballCardDetailModel$startMonitoringCharging$1", f = "SnowballCardDetailModel.kt", l = {266}, m = "invokeSuspend", v = 2)
    public static final class p extends v13.i implements e23.p<o53.b0, t13.d<? super Double>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f139469a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ double f139471c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f139472d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ String f139473e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ String f139474f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ String f139475g;

        @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u0001H\u000b"}, d2 = {"<anonymous>", ""}, k = 3, mv = {2, 3, 0}, xi = 48)
        @v13.e(c = "com.garmin.feature.garminpay.providers.gpay.snowball.ui.SnowballCardDetailModel$startMonitoringCharging$1$1", f = "SnowballCardDetailModel.kt", l = {276}, m = "invokeSuspend", v = 2)
        public static final class a extends v13.i implements e23.l<t13.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f139476a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ String f139477b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ String f139478c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ String f139479d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ String f139480e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public final /* synthetic */ w f139481f;

            /* JADX INFO: renamed from: po2.w$p$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
            public static final /* synthetic */ class C2638a extends p005kotlin.jvm.internal.q implements e23.l<v0, Unit> {
                public C2638a(Object obj) {
                    super(1, obj, w.class, "onRechargeOperationTimerReady", "onRechargeOperationTimerReady(Lcom/garmin/feature/garminpay/providers/gpay/snowball/ui/TransitCardOperationTimer;)V", 0);
                }

                @Override // e23.l
                public final Unit invoke(v0 v0Var) {
                    v0 v0Var2 = v0Var;
                    v0Var2.getClass();
                    ((w) this.receiver).X0(v0Var2);
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(String str, String str2, String str3, String str4, w wVar, t13.d<? super a> dVar) {
                super(1, dVar);
                this.f139477b = str;
                this.f139478c = str2;
                this.f139479d = str3;
                this.f139480e = str4;
                this.f139481f = wVar;
            }

            @Override // v13.a
            public final t13.d<Unit> create(t13.d<?> dVar) {
                return new a(this.f139477b, this.f139478c, this.f139479d, this.f139480e, this.f139481f, dVar);
            }

            @Override // e23.l
            public final Object invoke(t13.d<? super Unit> dVar) {
                return ((a) create(dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i14 = this.f139476a;
                if (i14 == 0) {
                    o13.r.b(obj);
                    k0.a aVar2 = k0.f139256j;
                    w wVar = this.f139481f;
                    po2.c cVar = new po2.c(this.f139477b, this.f139478c, this.f139479d, this.f139480e, 0L, 0L, wVar.getDevice().getUnitID(), 48, null);
                    k0.a.a(aVar2, cVar, new C2638a(wVar));
                    r53.b bVarA = cVar.a(wVar.O0().f205982d, wVar.N0(), wVar.M0());
                    this.f139476a = 1;
                    if (r53.s.j(bVarA, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i14 != 1) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    o13.r.b(obj);
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(double d14, String str, String str2, String str3, String str4, t13.d<? super p> dVar) {
            super(2, dVar);
            this.f139471c = d14;
            this.f139472d = str;
            this.f139473e = str2;
            this.f139474f = str3;
            this.f139475g = str4;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return w.this.new p(this.f139471c, this.f139472d, this.f139473e, this.f139474f, this.f139475g, dVar);
        }

        @Override // e23.p
        public final Object invoke(o53.b0 b0Var, t13.d<? super Double> dVar) {
            return ((p) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f139469a;
            if (i14 == 0) {
                o13.r.b(obj);
                String str = this.f139475g;
                String str2 = this.f139472d;
                String str3 = this.f139473e;
                String str4 = this.f139474f;
                w wVar = w.this;
                a aVar2 = new a(str2, str3, str4, str, wVar, null);
                this.f139469a = 1;
                if (wVar.Q0(aVar2, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
            return new Double(this.f139471c);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    @v13.e(c = "com.garmin.feature.garminpay.providers.gpay.snowball.ui.SnowballCardDetailModel", f = "SnowballCardDetailModel.kt", l = {300}, m = "validateCardAppletExpiration", v = 2)
    public static final class q extends v13.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f139482a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f139484c;

        public q(t13.d<? super q> dVar) {
            super(dVar);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            this.f139482a = obj;
            this.f139484c |= Integer.MIN_VALUE;
            return w.this.T(this);
        }
    }

    static {
        int i14 = gt2.c.f79010a;
        f139398l = gt2.b.f79005a.h("PAY#SB#CardDetailModel");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(sd2.f fVar, fo2.l0 l0Var) {
        super(fVar.getUnitID());
        fVar.getClass();
        l0Var.getClass();
        this.device = fVar;
        this.credential = l0Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.Object, java.util.Map] */
    public final Object W0(t13.d<? super Unit> dVar) throws CardInProcessingException, CardRetryFailedException {
        f fVar;
        String link;
        if (dVar instanceof f) {
            fVar = (f) dVar;
            int i14 = fVar.f139425c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                fVar.f139425c = i14 - Integer.MIN_VALUE;
            } else {
                fVar = new f(dVar);
            }
        } else {
            fVar = new f(dVar);
        }
        Object objR = fVar.f139423a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = fVar.f139425c;
        if (i15 == 0) {
            o13.r.b(objR);
            fo2.p pVar = (fo2.p) this.credential.getLinks().f51142a.get("jobStatus");
            if (pVar == null || (link = pVar.getLink()) == null) {
                vb.h.z("No JobStatus Url in credential links");
                return null;
            }
            zn2.u0 u0Var = zn2.u0.f205864a;
            fVar.f139425c = 1;
            u0Var.getClass();
            objR = zn2.u0.g().R(link, fVar);
            if (objR == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objR);
        }
        fo2.n nVar = (fo2.n) ao2.b.b((c83.a0) objR);
        int i16 = b.f139405b[nVar.getState().ordinal()];
        if (i16 == 1) {
            throw new MaintenanceException("Fetch JobStatus PAUSED");
        }
        if (i16 == 2 || i16 == 3) {
            throw new CardInProcessingException(nVar.getType());
        }
        if (i16 == 4) {
            throw new CardRetryFailedException();
        }
        lc.u0.r();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void X0(v0 timer) {
        this.chargingOperationTimer = timer;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object Y0(t13.d<? super Unit> dVar) throws Throwable {
        x53.c cVar = o53.s0.f129406a;
        Object objE0 = ge1.b.e0(x53.b.f189152a, new n(null), dVar);
        return objE0 == u13.a.COROUTINE_SUSPENDED ? objE0 : Unit.INSTANCE;
    }

    private final void a1(String purchaseId, String purchaseLink, String credentialId, String credentialLink, double amount) {
        x53.c cVar = o53.s0.f129406a;
        Z0(ge1.b.j(o53.c0.a(x53.b.f189152a), null, null, new p(amount, purchaseId, purchaseLink, credentialId, credentialLink, null), 3));
    }

    @Override // po2.m
    public Object A(t13.d<? super List<fo2.i>> dVar) {
        Product product = this.product;
        if (product != null) {
            List<fo2.i> listQ = product.q();
            return listQ == null ? p13.j0.f134944a : listQ;
        }
        p005kotlin.jvm.internal.s.m("product");
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00b9, code lost:
    
        if (W0(r0) == r1) goto L46;
     */
    /* JADX WARN: Type inference failed for: r9v4, types: [java.lang.Object, java.util.Map] */
    @Override // po2.m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object C0(t13.d<? super Unit> dVar) throws Throwable {
        g gVar;
        String link;
        w wVar;
        if (dVar instanceof g) {
            gVar = (g) dVar;
            int i14 = gVar.f139429d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                gVar.f139429d = i14 - Integer.MIN_VALUE;
            } else {
                gVar = new g(dVar);
            }
        } else {
            gVar = new g(dVar);
        }
        Object objE0 = gVar.f139427b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = gVar.f139429d;
        if (i15 != 0) {
            if (i15 == 1) {
                wVar = gVar.f139426a;
                o13.r.b(objE0);
            } else {
                if (i15 != 2) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(objE0);
            }
            return Unit.INSTANCE;
        }
        o13.r.b(objE0);
        fo2.p pVar = (fo2.p) this.credential.getLinks().f51142a.get("self");
        if (pVar == null || (link = pVar.getLink()) == null) {
            p6.b.n(this.credential, "No self link in ");
            return null;
        }
        g1 g1Var = O0().f205979a;
        gVar.f139426a = this;
        gVar.f139429d = 1;
        g1Var.getClass();
        x53.c cVar = o53.s0.f129406a;
        objE0 = ge1.b.e0(x53.b.f189152a, new i2(g1Var, link, null), gVar);
        if (objE0 != aVar) {
            wVar = this;
        }
        return aVar;
        wVar.credential = (fo2.l0) objE0;
        int i16 = b.f139404a[this.credential.getState().ordinal()];
        if (i16 != 1 && i16 != 2) {
            if (i16 == 3) {
                String reason = this.credential.getReason();
                if (reason != null) {
                    throw new ProviderErrorCodeException(reason);
                }
                throw new CardRetryFailedException();
            }
            if (i16 == 4) {
                throw new CardInProcessingException();
            }
            if (i16 == 5) {
                return Unit.INSTANCE;
            }
            lc.u0.r();
            return null;
        }
        gVar.f139426a = null;
        gVar.f139429d = 2;
    }

    @Override // po2.m
    public Object D0(t13.d<? super List<fo2.a0>> dVar) {
        x53.c cVar = o53.s0.f129406a;
        return ge1.b.e0(x53.b.f189152a, new l(null), dVar);
    }

    @Override // po2.m
    public Object F(t13.d<? super as2.b<CurrencyValue>> dVar) {
        zn2.t tVarP0 = P0();
        String credentialId = this.credential.getCredentialId();
        tVarP0.getClass();
        x53.c cVar = o53.s0.f129406a;
        return ge1.b.e0(x53.b.f189152a, new zn2.x(tVarP0, credentialId, true, null), dVar);
    }

    @Override // po2.m
    public Object G(CurrencyValue currencyValue, t13.d<? super Unit> dVar) throws CardBalanceExceededException {
        double dA = currencyValue.a();
        Product product = this.product;
        if (product == null) {
            p005kotlin.jvm.internal.s.m("product");
            throw null;
        }
        if (dA <= product.getMaxBalance()) {
            return Unit.INSTANCE;
        }
        Product product2 = this.product;
        if (product2 == null) {
            p005kotlin.jvm.internal.s.m("product");
            throw null;
        }
        double maxBalance = product2.getMaxBalance();
        double dA2 = currencyValue.a();
        Product product3 = this.product;
        if (product3 == null) {
            p005kotlin.jvm.internal.s.m("product");
            throw null;
        }
        throw new CardBalanceExceededException(maxBalance, dA2 + " is exceeding max balance(" + product3.getMaxBalance() + ")");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // po2.m
    public Object I(t13.d<? super g0> dVar) {
        j jVar;
        if (dVar instanceof j) {
            jVar = (j) dVar;
            int i14 = jVar.f139444c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                jVar.f139444c = i14 - Integer.MIN_VALUE;
            } else {
                jVar = new j(dVar);
            }
        } else {
            jVar = new j(dVar);
        }
        Object objA = jVar.f139442a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = jVar.f139444c;
        try {
            if (i15 == 0) {
                o13.r.b(objA);
                zn2.t tVarP0 = P0();
                qs2.a aVarB = aq2.k.b(this.credential.k().h());
                jVar.f139444c = 1;
                objA = tVarP0.o(aVarB).a(jVar);
                if (objA == aVar) {
                    return aVar;
                }
            } else {
                if (i15 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(objA);
            }
            return new g0((List<h0>) objA);
        } catch (Throwable th3) {
            return new g0(th3);
        }
    }

    @Override // po2.m
    public Object J(t13.d<? super Unit> dVar) throws DeviceNotConnectedException {
        zn2.t tVarL0 = L0();
        if (tVarL0 == null || !tVarL0.f205816b.s()) {
            throw new DeviceNotConnectedException(w2.a0.i(getDevice()).concat(" is not connected"));
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r14v4, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, java.util.Map] */
    @Override // po2.m
    public Object L(fo2.b0 b0Var, t13.d<? super fo2.a0> dVar) throws Exception {
        m mVar;
        String link;
        String link2;
        String str;
        String link3;
        if (dVar instanceof m) {
            mVar = (m) dVar;
            int i14 = mVar.f139453d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                mVar.f139453d = i14 - Integer.MIN_VALUE;
            } else {
                mVar = new m(dVar);
            }
        } else {
            mVar = new m(dVar);
        }
        Object objA = mVar.f139451b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = mVar.f139453d;
        if (i15 == 0) {
            o13.r.b(objA);
            fo2.p pVar = (fo2.p) this.credential.getLinks().f51142a.get(FirebaseAnalytics.Event.PURCHASE);
            if (pVar == null || (link = pVar.getLink()) == null) {
                q2.u("Credential or Purchase Url not exists");
                return null;
            }
            fo2.p pVar2 = (fo2.p) this.credential.getLinks().f51142a.get("self");
            if (pVar2 == null || (link2 = pVar2.getLink()) == null) {
                p6.b.n(this.credential, "No self link in ");
                return null;
            }
            zn2.u0 u0Var = zn2.u0.f205864a;
            mVar.f139450a = link2;
            mVar.f139453d = 1;
            u0Var.getClass();
            objA = ao2.b.a(zn2.u0.g(), link, b0Var, mVar);
            if (objA == aVar) {
                return aVar;
            }
            str = link2;
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            String str2 = mVar.f139450a;
            o13.r.b(objA);
            str = str2;
        }
        Object objB = ao2.b.b((c83.a0) objA);
        fo2.a0 a0Var = (fo2.a0) objB;
        fo2.p pVar3 = (fo2.p) a0Var.getLinks().f51142a.get("self");
        if (pVar3 == null || (link3 = pVar3.getLink()) == null) {
            p6.b.p(a0Var, "No self link in ");
            return null;
        }
        a1(a0Var.getPurchaseId(), link3, this.credential.getCredentialId(), str, a0Var.getTotalCredit().a());
        return objB;
    }

    @Override // po2.m
    public Object O(t13.d<? super Unit> dVar) {
        aq2.j.f12491a.getClass();
        if (aq2.j.g()) {
            return Unit.INSTANCE;
        }
        Boolean ableToDelete = this.credential.k().getAbleToDelete();
        if (ableToDelete == null) {
            p6.b.n(this.credential, "No ableToDelete in ");
            return null;
        }
        if (ableToDelete.booleanValue()) {
            return Unit.INSTANCE;
        }
        throw new NotAbleToDeleteCardException();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // po2.m
    public Object R(t13.d<? super CurrencyValue> dVar) throws Throwable {
        k kVar;
        CurrencyValue currencyValue;
        if (dVar instanceof k) {
            kVar = (k) dVar;
            int i14 = kVar.f139447c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                kVar.f139447c = i14 - Integer.MIN_VALUE;
            } else {
                kVar = new k(dVar);
            }
        } else {
            kVar = new k(dVar);
        }
        Object objE0 = kVar.f139445a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = kVar.f139447c;
        if (i15 == 0) {
            o13.r.b(objE0);
            zn2.t tVarP0 = P0();
            String credentialId = this.credential.getCredentialId();
            kVar.f139447c = 1;
            tVarP0.getClass();
            x53.c cVar = o53.s0.f129406a;
            objE0 = ge1.b.e0(x53.b.f189152a, new zn2.x(tVarP0, credentialId, false, null), kVar);
            if (objE0 == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objE0);
        }
        as2.b bVar = (as2.b) objE0;
        if (bVar != null && (currencyValue = (CurrencyValue) bVar.a()) != null) {
            return currencyValue;
        }
        o2.c.m("deviceServiceProvider.getTransitCardBalance shouldn't return null if isCacheAllowed = false");
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // po2.m
    public Object T(t13.d<? super Unit> dVar) {
        q qVar;
        if (dVar instanceof q) {
            qVar = (q) dVar;
            int i14 = qVar.f139484c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                qVar.f139484c = i14 - Integer.MIN_VALUE;
            } else {
                qVar = new q(dVar);
            }
        } else {
            qVar = new q(dVar);
        }
        Object objD = qVar.f139482a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = qVar.f139484c;
        if (i15 == 0) {
            o13.r.b(objD);
            zn2.t tVarP0 = P0();
            qs2.a aVarB = aq2.k.b(this.credential.k().h());
            qVar.f139484c = 1;
            objD = tVarP0.o(aVarB).d(qVar);
            if (objD == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objD);
        }
        fo2.h hVar = (fo2.h) objD;
        LocalDate localDateNow = LocalDate.now(DateTimeZone.forID("Asia/Shanghai"));
        LocalDate localDate = hVar.f72983a;
        LocalDate localDate2 = hVar.f72984b;
        localDateNow.getClass();
        if (localDateNow.compareTo(localDate) >= 0 && localDateNow.compareTo(localDate2) <= 0) {
            return Unit.INSTANCE;
        }
        throw new AppletExpiredException(localDateNow + " is not in activeDate:" + hVar.f72983a + ", validDate:" + localDate2);
    }

    @Override // po2.m
    public Object X(t13.d<? super Unit> dVar) {
        Object objY = ge1.b.Y(new o(null), dVar);
        return objY == u13.a.COROUTINE_SUSPENDED ? objY : Unit.INSTANCE;
    }

    @Override // po2.m
    public void Y() {
        v0 v0Var = this.chargingOperationTimer;
        if (v0Var != null) {
            v0Var.a();
        } else {
            o2.c.m("chargingOperationTimer should not be null here");
        }
    }

    public void Z0(o53.i0<Double> i0Var) {
        i0Var.getClass();
        this.cardChargingAsync = i0Var;
    }

    @Override // po2.m
    public String d() {
        String productName;
        fo2.i0<String, fo2.d> i0VarH = this.credential.h();
        return (i0VarH == null || (productName = i0VarH.getProductName()) == null) ? "" : productName;
    }

    @Override // po2.m
    public Object e0(t13.d<? super Unit> dVar) {
        Object objY = ge1.b.Y(new c(null), dVar);
        return objY == u13.a.COROUTINE_SUSPENDED ? objY : Unit.INSTANCE;
    }

    @Override // po2.m
    public sd2.f getDevice() {
        return this.device;
    }

    @Override // po2.m
    public int h() {
        Product product = this.product;
        if (product != null) {
            return product.getAgeBeforeDeletableDays();
        }
        p005kotlin.jvm.internal.s.m("product");
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.Object, java.util.Map] */
    @Override // po2.m
    public Object h0(t13.d<? super Unit> dVar) {
        h hVar;
        String link;
        w wVar;
        if (dVar instanceof h) {
            hVar = (h) dVar;
            int i14 = hVar.f139433d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                hVar.f139433d = i14 - Integer.MIN_VALUE;
            } else {
                hVar = new h(dVar);
            }
        } else {
            hVar = new h(dVar);
        }
        Object objE = hVar.f139431b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = hVar.f139433d;
        if (i15 == 0) {
            o13.r.b(objE);
            fo2.p pVar = (fo2.p) this.credential.getLinks().f51142a.get("product");
            if (pVar == null || (link = pVar.getLink()) == null) {
                o2.c.m("Credential or Product Url not exists");
                return null;
            }
            zn2.u0 u0Var = zn2.u0.f205864a;
            hVar.f139430a = this;
            hVar.f139433d = 1;
            u0Var.getClass();
            objE = zn2.u0.g().e(link, hVar);
            if (objE == aVar) {
                return aVar;
            }
            wVar = this;
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            wVar = hVar.f139430a;
            o13.r.b(objE);
        }
        wVar.product = (Product) ao2.b.b((c83.a0) objE);
        return Unit.INSTANCE;
    }

    @Override // po2.m
    public String l() {
        fo2.d dVarG;
        List<fo2.m> listB;
        fo2.m mVar;
        String strB;
        fo2.i0<String, fo2.d> i0VarH = this.credential.h();
        return (i0VarH == null || (dVarG = i0VarH.g()) == null || (listB = dVarG.b()) == null || (mVar = (fo2.m) p13.h0.I0(listB)) == null || (strB = mVar.b()) == null) ? "" : strB;
    }

    @Override // po2.m
    public Object l0(t13.d<? super Unit> dVar) {
        Object objC = P0().o(aq2.k.b(this.credential.k().h())).c(dVar);
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        if (objC != aVar) {
            objC = Unit.INSTANCE;
        }
        return objC == aVar ? objC : Unit.INSTANCE;
    }

    @Override // po2.m
    public Object m(fo2.q qVar, t13.d<? super Unit> dVar) {
        Product product = this.product;
        if (product != null) {
            product.r(qVar);
            return Unit.INSTANCE;
        }
        p005kotlin.jvm.internal.s.m("product");
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // po2.m
    public Object m0(t13.d<? super Unit> dVar) throws InTransitException {
        e eVar;
        if (dVar instanceof e) {
            eVar = (e) dVar;
            int i14 = eVar.f139422c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                eVar.f139422c = i14 - Integer.MIN_VALUE;
            } else {
                eVar = new e(dVar);
            }
        } else {
            eVar = new e(dVar);
        }
        Object objB = eVar.f139420a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = eVar.f139422c;
        if (i15 == 0) {
            o13.r.b(objB);
            zn2.t tVarP0 = P0();
            qs2.a aVarB = aq2.k.b(this.credential.k().h());
            eVar.f139422c = 1;
            objB = tVarP0.o(aVarB).b(eVar);
            if (objB == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objB);
        }
        if (((Boolean) objB).booleanValue()) {
            throw new InTransitException();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // po2.m
    public Object t(t13.d<? super Unit> dVar) throws Exception {
        d dVar2;
        CurrencyValue currencyValue;
        if (dVar instanceof d) {
            dVar2 = (d) dVar;
            int i14 = dVar2.f139419c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                dVar2.f139419c = i14 - Integer.MIN_VALUE;
            } else {
                dVar2 = new d(dVar);
            }
        } else {
            dVar2 = new d(dVar);
        }
        Object objF = dVar2.f139417a;
        Object obj = u13.a.COROUTINE_SUSPENDED;
        int i15 = dVar2.f139419c;
        if (i15 == 0) {
            o13.r.b(objF);
            dVar2.f139419c = 1;
            objF = F(dVar2);
            if (objF == obj) {
                return obj;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objF);
        }
        as2.b bVar = (as2.b) objF;
        if (bVar == null || (currencyValue = (CurrencyValue) bVar.a()) == null) {
            q2.u("Balance convert failed");
            return null;
        }
        double dA = currencyValue.a();
        Product product = this.product;
        if (product == null) {
            p005kotlin.jvm.internal.s.m("product");
            throw null;
        }
        if (dA < product.getMaxBalance()) {
            return Unit.INSTANCE;
        }
        Product product2 = this.product;
        if (product2 == null) {
            p005kotlin.jvm.internal.s.m("product");
            throw null;
        }
        double maxBalance = product2.getMaxBalance();
        Product product3 = this.product;
        if (product3 == null) {
            p005kotlin.jvm.internal.s.m("product");
            throw null;
        }
        throw new CardBalanceExceededException(maxBalance, dA + " is exceeding max balance(" + product3.getMaxBalance() + ")");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // po2.m
    public Object u0(t13.d<? super t> dVar) {
        i iVar;
        String extCardReference;
        fo2.d dVarG;
        String faqUrl;
        fo2.d dVarG2;
        String contactPhone;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        if (dVar instanceof i) {
            iVar = (i) dVar;
            int i14 = iVar.f139441h;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                iVar.f139441h = i14 - Integer.MIN_VALUE;
            } else {
                iVar = new i(dVar);
            }
        } else {
            iVar = new i(dVar);
        }
        Object obj = iVar.f139439f;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = iVar.f139441h;
        if (i15 == 0) {
            o13.r.b(obj);
            String strD = d();
            String strL = l();
            fo2.i0<String, fo2.d> i0VarH = this.credential.h();
            if (i0VarH == null || (extCardReference = i0VarH.getExtCardReference()) == null) {
                androidx.room.a0.s(this.credential, "Null extCardReference: ");
                return null;
            }
            fo2.i0<String, fo2.d> i0VarH2 = this.credential.h();
            if (i0VarH2 == null || (dVarG = i0VarH2.g()) == null || (faqUrl = dVarG.getFaqUrl()) == null) {
                androidx.room.a0.s(this.credential, "Cannot get faq url from ");
                return null;
            }
            fo2.i0<String, fo2.d> i0VarH3 = this.credential.h();
            if (i0VarH3 == null || (dVarG2 = i0VarH3.g()) == null || (contactPhone = dVarG2.getContactPhone()) == null) {
                androidx.room.a0.s(this.credential, "Cannot get contact phone from ");
                return null;
            }
            zn2.t tVarP0 = P0();
            qs2.a aVarB = aq2.k.b(this.credential.k().h());
            iVar.f139434a = strD;
            iVar.f139435b = strL;
            iVar.f139436c = extCardReference;
            iVar.f139437d = faqUrl;
            iVar.f139438e = contactPhone;
            iVar.f139441h = 1;
            Object objD = tVarP0.o(aVarB).d(iVar);
            if (objD == aVar) {
                return aVar;
            }
            str = strD;
            obj = objD;
            str2 = extCardReference;
            str3 = strL;
            str4 = faqUrl;
            str5 = contactPhone;
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            String str6 = iVar.f139438e;
            String str7 = iVar.f139437d;
            str2 = iVar.f139436c;
            String str8 = iVar.f139435b;
            String str9 = iVar.f139434a;
            o13.r.b(obj);
            str4 = str7;
            str3 = str8;
            str5 = str6;
            str = str9;
        }
        return new t(str, str3, str2, str4, str5, ((fo2.h) obj).f72984b);
    }

    @Override // po2.m
    public o53.i0<Double> w0() {
        o53.i0<Double> i0Var = this.cardChargingAsync;
        if (i0Var != null) {
            return i0Var;
        }
        p005kotlin.jvm.internal.s.m("cardChargingAsync");
        throw null;
    }
}
