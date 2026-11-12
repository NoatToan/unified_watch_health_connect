package po2;

import com.garmin.android.apps.connectmobile.R;
import com.garmin.feature.garminpay.providers.gpay.snowball.CurrencyValue;
import com.garmin.feature.garminpay.providers.gpay.snowball.exception.MaintenanceException;
import com.garmin.feature.garminpay.providers.gpay.snowball.exception.NeedToUpgradeManuallyException;
import com.garmin.feature.garminpay.providers.gpay.snowball.exception.ProviderErrorCodeException;
import com.garmin.garminpay.wallet.exception.NfcTransferCoroutineException;
import java.util.concurrent.TimeoutException;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.feature.garminpay.providers.gpay.snowball.ui.SnowballCardDetailPresenter$showRecharging$1", f = "SnowballCardDetailPresenter.kt", l = {213, 222, 223}, m = "invokeSuspend", v = 2)
public final class c0 extends v13.i implements e23.p<o53.b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public double f139113a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f139114b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f139115c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.garmin.feature.garminpay.providers.gpay.snowball.ui.d f139116d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(com.garmin.feature.garminpay.providers.gpay.snowball.ui.d dVar, t13.d<? super c0> dVar2) {
        super(2, dVar2);
        this.f139116d = dVar;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        return new c0(this.f139116d, dVar);
    }

    @Override // e23.p
    public final Object invoke(o53.b0 b0Var, t13.d<? super Unit> dVar) {
        return ((c0) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:32:0x00f0 A[Catch: all -> 0x001a, TryCatch #0 {all -> 0x001a, blocks: (B:8:0x0015, B:30:0x00d8, B:32:0x00f0, B:33:0x00fc, B:15:0x002a, B:26:0x00b4, B:16:0x002f, B:22:0x0064, B:19:0x0036), top: B:58:0x0009 }] */
    /* JADX WARN: Code duplicated, block: B:33:0x00fc A[Catch: all -> 0x001a, TRY_LEAVE, TryCatch #0 {all -> 0x001a, blocks: (B:8:0x0015, B:30:0x00d8, B:32:0x00f0, B:33:0x00fc, B:15:0x002a, B:26:0x00b4, B:16:0x002f, B:22:0x0064, B:19:0x0036), top: B:58:0x0009 }] */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        ko2.c cVar;
        double d14;
        String strA;
        Object objI;
        String str;
        g0 g0Var;
        Throwable th3;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i14 = this.f139115c;
        final com.garmin.feature.garminpay.providers.gpay.snowball.ui.d dVar = this.f139116d;
        try {
            if (i14 == 0) {
                o13.r.b(obj);
                ((com.garmin.feature.garminpay.providers.gpay.snowball.ui.b) dVar.getView()).o3();
                ((com.garmin.feature.garminpay.providers.gpay.snowball.ui.b) dVar.getView()).f1();
                ((m) dVar.f0()).Y();
                o53.i0<Double> i0VarW0 = ((m) dVar.f0()).w0();
                this.f139115c = 1;
                obj = i0VarW0.await(this);
                if (obj == aVar) {
                }
                return aVar;
            }
            if (i14 == 1) {
                o13.r.b(obj);
            } else {
                if (i14 == 2) {
                    d14 = this.f139113a;
                    cVar = (ko2.c) this.f139114b;
                    o13.r.b(obj);
                    strA = cVar.a(new Double(((CurrencyValue) obj).a()));
                    m mVar = (m) dVar.f0();
                    this.f139114b = strA;
                    this.f139113a = d14;
                    this.f139115c = 3;
                    objI = mVar.I(this);
                    if (objI != aVar) {
                        str = strA;
                        obj = objI;
                    }
                    return aVar;
                }
                if (i14 != 3) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                str = (String) this.f139114b;
                o13.r.b(obj);
            }
            g0Var = (g0) obj;
            ((com.garmin.feature.garminpay.providers.gpay.snowball.ui.b) dVar.getView()).g4();
            ((com.garmin.feature.garminpay.providers.gpay.snowball.ui.b) dVar.getView()).q(str);
            th3 = g0Var.f139198b;
            if (th3 == null) {
                ((com.garmin.feature.garminpay.providers.gpay.snowball.ui.b) dVar.getView()).Q4(g0Var.f139197a);
            } else {
                com.garmin.feature.garminpay.providers.gpay.snowball.ui.d.f51273c.warn("getCardUsageHistory Error: ", th3);
                ((com.garmin.feature.garminpay.providers.gpay.snowball.ui.b) dVar.getView()).O8();
            }
            return Unit.INSTANCE;
            double dDoubleValue = ((Number) obj).doubleValue();
            com.garmin.feature.garminpay.providers.gpay.snowball.ui.b bVar = (com.garmin.feature.garminpay.providers.gpay.snowball.ui.b) dVar.getView();
            hn2.c f52032a = ((com.garmin.feature.garminpay.providers.gpay.snowball.ui.b) dVar.getView()).getF52032a();
            ko2.c cVar2 = ko2.c.f105778b;
            String string = f52032a.getString(R.string.wallet_message_recharge_success_dynamic_context, cVar2.a(Double.valueOf(dDoubleValue)), ((m) dVar.f0()).d());
            string.getClass();
            bVar.s7(string);
            m mVar2 = (m) dVar.f0();
            this.f139114b = cVar2;
            this.f139113a = dDoubleValue;
            this.f139115c = 2;
            obj = mVar2.R(this);
            if (obj != aVar) {
                cVar = cVar2;
                d14 = dDoubleValue;
                strA = cVar.a(new Double(((CurrencyValue) obj).a()));
                m mVar3 = (m) dVar.f0();
                this.f139114b = strA;
                this.f139113a = d14;
                this.f139115c = 3;
                objI = mVar3.I(this);
                if (objI != aVar) {
                    str = strA;
                    obj = objI;
                    g0Var = (g0) obj;
                    ((com.garmin.feature.garminpay.providers.gpay.snowball.ui.b) dVar.getView()).g4();
                    ((com.garmin.feature.garminpay.providers.gpay.snowball.ui.b) dVar.getView()).q(str);
                    th3 = g0Var.f139198b;
                    if (th3 == null) {
                        ((com.garmin.feature.garminpay.providers.gpay.snowball.ui.b) dVar.getView()).Q4(g0Var.f139197a);
                    } else {
                        com.garmin.feature.garminpay.providers.gpay.snowball.ui.d.f51273c.warn("getCardUsageHistory Error: ", th3);
                        ((com.garmin.feature.garminpay.providers.gpay.snowball.ui.b) dVar.getView()).O8();
                    }
                    return Unit.INSTANCE;
                }
            }
            return aVar;
        } catch (Throwable th4) {
            try {
                com.garmin.feature.garminpay.providers.gpay.snowball.ui.d.f51273c.warn("Exception occurs in showRecharging", (Throwable) th4);
                if (th4 instanceof MaintenanceException) {
                    ((com.garmin.feature.garminpay.providers.gpay.snowball.ui.b) dVar.getView()).c2(new x(dVar, 29));
                } else if (th4 instanceof NeedToUpgradeManuallyException) {
                    ((com.garmin.feature.garminpay.providers.gpay.snowball.ui.b) dVar.getView()).L6(new y(dVar, th4, 1), ((m) dVar.f0()).d());
                } else if (th4 instanceof ProviderErrorCodeException) {
                    final int i15 = 0;
                    ((com.garmin.feature.garminpay.providers.gpay.snowball.ui.b) dVar.getView()).a4(new e23.l() { // from class: po2.b0
                        @Override // e23.l
                        public final Object invoke(Object obj2) {
                            switch (i15) {
                                case 0:
                                    ((com.garmin.feature.garminpay.providers.gpay.snowball.ui.b) dVar.getView()).c();
                                    break;
                                case 1:
                                    ((com.garmin.feature.garminpay.providers.gpay.snowball.ui.b) dVar.getView()).c();
                                    break;
                                case 2:
                                    ((com.garmin.feature.garminpay.providers.gpay.snowball.ui.b) dVar.getView()).c();
                                    break;
                                default:
                                    ((com.garmin.feature.garminpay.providers.gpay.snowball.ui.b) dVar.getView()).c();
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    }, th4.getErrorCode());
                } else if (th4 instanceof TimeoutException) {
                    final int i16 = 1;
                    ((com.garmin.feature.garminpay.providers.gpay.snowball.ui.b) dVar.getView()).B5(new e23.l() { // from class: po2.b0
                        @Override // e23.l
                        public final Object invoke(Object obj2) {
                            switch (i16) {
                                case 0:
                                    ((com.garmin.feature.garminpay.providers.gpay.snowball.ui.b) dVar.getView()).c();
                                    break;
                                case 1:
                                    ((com.garmin.feature.garminpay.providers.gpay.snowball.ui.b) dVar.getView()).c();
                                    break;
                                case 2:
                                    ((com.garmin.feature.garminpay.providers.gpay.snowball.ui.b) dVar.getView()).c();
                                    break;
                                default:
                                    ((com.garmin.feature.garminpay.providers.gpay.snowball.ui.b) dVar.getView()).c();
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    }, ((m) dVar.f0()).d());
                } else if (th4 instanceof NfcTransferCoroutineException) {
                    final int i17 = 2;
                    ((com.garmin.feature.garminpay.providers.gpay.snowball.ui.b) dVar.getView()).h4(new e23.l() { // from class: po2.b0
                        @Override // e23.l
                        public final Object invoke(Object obj2) {
                            switch (i17) {
                                case 0:
                                    ((com.garmin.feature.garminpay.providers.gpay.snowball.ui.b) dVar.getView()).c();
                                    break;
                                case 1:
                                    ((com.garmin.feature.garminpay.providers.gpay.snowball.ui.b) dVar.getView()).c();
                                    break;
                                case 2:
                                    ((com.garmin.feature.garminpay.providers.gpay.snowball.ui.b) dVar.getView()).c();
                                    break;
                                default:
                                    ((com.garmin.feature.garminpay.providers.gpay.snowball.ui.b) dVar.getView()).c();
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    }, w2.a0.i(((m) dVar.f0()).getDevice()));
                } else {
                    final int i18 = 3;
                    ((com.garmin.feature.garminpay.providers.gpay.snowball.ui.b) dVar.getView()).a4(new e23.l() { // from class: po2.b0
                        @Override // e23.l
                        public final Object invoke(Object obj2) {
                            switch (i18) {
                                case 0:
                                    ((com.garmin.feature.garminpay.providers.gpay.snowball.ui.b) dVar.getView()).c();
                                    break;
                                case 1:
                                    ((com.garmin.feature.garminpay.providers.gpay.snowball.ui.b) dVar.getView()).c();
                                    break;
                                case 2:
                                    ((com.garmin.feature.garminpay.providers.gpay.snowball.ui.b) dVar.getView()).c();
                                    break;
                                default:
                                    ((com.garmin.feature.garminpay.providers.gpay.snowball.ui.b) dVar.getView()).c();
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    }, null);
                }
            } finally {
                ((com.garmin.feature.garminpay.providers.gpay.snowball.ui.b) dVar.getView()).T4();
                ((com.garmin.feature.garminpay.providers.gpay.snowball.ui.b) dVar.getView()).hideProgressOverlay();
            }
        }
    }
}
