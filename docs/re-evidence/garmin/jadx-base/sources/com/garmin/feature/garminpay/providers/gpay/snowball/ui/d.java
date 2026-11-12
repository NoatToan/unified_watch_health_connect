package com.garmin.feature.garminpay.providers.gpay.snowball.ui;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.widget.Toast;
import androidx.lifecycle.i0;
import com.garmin.feature.garminpay.providers.felica.exception.DeviceNotConnectedException;
import com.garmin.feature.garminpay.providers.gpay.snowball.CurrencyValue;
import com.garmin.feature.garminpay.providers.gpay.snowball.exception.AppletExpiredException;
import com.garmin.feature.garminpay.providers.gpay.snowball.exception.CardBalanceExceededException;
import com.garmin.feature.garminpay.providers.gpay.snowball.exception.CardInProcessingException;
import com.garmin.feature.garminpay.providers.gpay.snowball.exception.CardRetryFailedException;
import com.garmin.feature.garminpay.providers.gpay.snowball.exception.InTransitException;
import com.garmin.feature.garminpay.providers.gpay.snowball.exception.InvalidAppletException;
import com.garmin.feature.garminpay.providers.gpay.snowball.exception.MaintenanceException;
import com.garmin.feature.garminpay.providers.gpay.snowball.exception.NeedToUpgradeManuallyException;
import com.garmin.feature.garminpay.providers.gpay.snowball.exception.NotAbleToDeleteCardException;
import com.garmin.feature.garminpay.providers.gpay.snowball.exception.ProviderErrorCodeException;
import com.garmin.feature.garminpay.providers.gpay.snowball.exception.UserCancellationException;
import com.garmin.garminpay.wallet.exception.NfcTransferCoroutineException;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.google.firebase.messaging.l;
import e23.p;
import fo2.q;
import java.util.List;
import o13.r;
import o53.b0;
import o53.s0;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import po2.c0;
import po2.g0;
import po2.m;
import po2.n;
import po2.t;
import po2.x;
import po2.y;
import u53.o;
import vn2.b1;
import w2.a0;
import w52.u0;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0002\u0007\bB\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/garmin/feature/garminpay/providers/gpay/snowball/ui/d;", "Lpo2/b;", "Lpo2/m;", "Lcom/garmin/feature/garminpay/providers/gpay/snowball/ui/b;", "Lpo2/n;", "<init>", "()V", "b", "a", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class d extends po2.b<m, com.garmin.feature.garminpay.providers.gpay.snowball.ui.b> implements n {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Logger f51273c;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/feature/garminpay/providers/gpay/snowball/ui/d$b;", "", "<init>", "(Ljava/lang/String;I)V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public enum b {
        SHIFT_OUT_CARD,
        REMOVE_CARD
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.feature.garminpay.providers.gpay.snowball.ui.SnowballCardDetailPresenter$onEnteringOrderHistory$1", f = "SnowballCardDetailPresenter.kt", l = {251}, m = "invokeSuspend", v = 2)
    public static final class c extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f51277a;

        public c(t13.d<? super c> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return d.this.new c(dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f51277a;
            d dVar = d.this;
            try {
                if (i14 == 0) {
                    r.b(obj);
                    vq2.e eVar = (vq2.e) dVar.getView();
                    int i15 = vq2.e.f179461z0;
                    eVar.S5(null, null);
                    m mVar = (m) dVar.f0();
                    this.f51277a = 1;
                    obj = mVar.D0(this);
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
                ((com.garmin.feature.garminpay.providers.gpay.snowball.ui.b) dVar.getView()).e1((List) obj);
            } catch (Exception e4) {
                d.f51273c.error("Failed to show orders", (Throwable) e4);
                ((com.garmin.feature.garminpay.providers.gpay.snowball.ui.b) dVar.getView()).J3(new x(dVar, 0));
            } finally {
                ((com.garmin.feature.garminpay.providers.gpay.snowball.ui.b) dVar.getView()).hideProgressOverlay();
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.garmin.feature.garminpay.providers.gpay.snowball.ui.d$d, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.feature.garminpay.providers.gpay.snowball.ui.SnowballCardDetailPresenter$onEnteringRecharge$1", f = "SnowballCardDetailPresenter.kt", l = {139, 139}, m = "invokeSuspend", v = 2)
    public static final class C1065d extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public com.garmin.feature.garminpay.providers.gpay.snowball.ui.b f51279a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f51280b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public List f51281c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f51282d;

        public C1065d(t13.d<? super C1065d> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return d.this.new C1065d(dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((C1065d) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            String strL;
            com.garmin.feature.garminpay.providers.gpay.snowball.ui.b bVar;
            List<fo2.i> list;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f51282d;
            d dVar = d.this;
            try {
                if (i14 != 0) {
                    if (i14 == 1) {
                        strL = this.f51280b;
                        bVar = this.f51279a;
                        r.b(obj);
                    } else {
                        if (i14 != 2) {
                            vb.h.z("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        list = this.f51281c;
                        strL = this.f51280b;
                        bVar = this.f51279a;
                        r.b(obj);
                    }
                    bVar.P4(strL, list, (CurrencyValue) obj);
                    return Unit.INSTANCE;
                }
                r.b(obj);
                vq2.e eVar = (vq2.e) dVar.getView();
                int i15 = vq2.e.f179461z0;
                eVar.S5(null, null);
                com.garmin.feature.garminpay.providers.gpay.snowball.ui.b bVar2 = (com.garmin.feature.garminpay.providers.gpay.snowball.ui.b) dVar.getView();
                strL = ((m) dVar.f0()).l();
                m mVar = (m) dVar.f0();
                this.f51279a = bVar2;
                this.f51280b = strL;
                this.f51282d = 1;
                Object objA = mVar.A(this);
                if (objA != aVar) {
                    bVar = bVar2;
                    obj = objA;
                }
                return aVar;
                List<fo2.i> list2 = (List) obj;
                m mVar2 = (m) dVar.f0();
                this.f51279a = bVar;
                this.f51280b = strL;
                this.f51281c = list2;
                this.f51282d = 2;
                Object objR = mVar2.R(this);
                if (objR != aVar) {
                    list = list2;
                    obj = objR;
                    bVar.P4(strL, list, (CurrencyValue) obj);
                    return Unit.INSTANCE;
                }
                return aVar;
            } catch (Throwable th3) {
                try {
                    d.f51273c.warn("setupRechargeViews failed", th3);
                    if (th3 instanceof NfcTransferCoroutineException) {
                        ((com.garmin.feature.garminpay.providers.gpay.snowball.ui.b) dVar.getView()).h4(new x(dVar, 1), a0.i(((m) dVar.f0()).getDevice()));
                    } else {
                        ((com.garmin.feature.garminpay.providers.gpay.snowball.ui.b) dVar.getView()).s5(((m) dVar.f0()).d(), null, new x(dVar, 2));
                    }
                } finally {
                    ((com.garmin.feature.garminpay.providers.gpay.snowball.ui.b) dVar.getView()).hideProgressOverlay();
                }
            }
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.feature.garminpay.providers.gpay.snowball.ui.SnowballCardDetailPresenter$onMVPReady$1", f = "SnowballCardDetailPresenter.kt", l = {63, 64, 65, 66, 67, 68}, m = "invokeSuspend", v = 2)
    public static final class e extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public t f51284a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public g0 f51285b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f51286c;

        public e(t13.d<? super e> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return d.this.new e(dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((e) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:24:0x0064  */
        /* JADX WARN: Code duplicated, block: B:25:0x0065 A[Catch: all -> 0x001d, TryCatch #1 {all -> 0x001d, blocks: (B:7:0x0018, B:39:0x00b0, B:12:0x0022, B:35:0x0099, B:13:0x0027, B:31:0x0083, B:14:0x002b, B:28:0x0074, B:15:0x002f, B:25:0x0065, B:16:0x0033, B:22:0x0055, B:19:0x0045), top: B:73:0x000b }] */
        /* JADX WARN: Code duplicated, block: B:27:0x0073  */
        /* JADX WARN: Code duplicated, block: B:28:0x0074 A[Catch: all -> 0x001d, TryCatch #1 {all -> 0x001d, blocks: (B:7:0x0018, B:39:0x00b0, B:12:0x0022, B:35:0x0099, B:13:0x0027, B:31:0x0083, B:14:0x002b, B:28:0x0074, B:15:0x002f, B:25:0x0065, B:16:0x0033, B:22:0x0055, B:19:0x0045), top: B:73:0x000b }] */
        /* JADX WARN: Code duplicated, block: B:30:0x0082  */
        /* JADX WARN: Code duplicated, block: B:31:0x0083 A[Catch: all -> 0x001d, PHI: r11
          0x0083: PHI (r11v37 java.lang.Object) = (r11v36 java.lang.Object), (r11v0 java.lang.Object) binds: [B:29:0x0080, B:13:0x0027] A[DONT_GENERATE, DONT_INLINE], TryCatch #1 {all -> 0x001d, blocks: (B:7:0x0018, B:39:0x00b0, B:12:0x0022, B:35:0x0099, B:13:0x0027, B:31:0x0083, B:14:0x002b, B:28:0x0074, B:15:0x002f, B:25:0x0065, B:16:0x0033, B:22:0x0055, B:19:0x0045), top: B:73:0x000b }] */
        /* JADX WARN: Code duplicated, block: B:33:0x0095  */
        /* JADX WARN: Code duplicated, block: B:34:0x0096  */
        /* JADX WARN: Code duplicated, block: B:38:0x00ae  */
        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            m mVar;
            m mVar2;
            t tVar;
            Object objI;
            t tVar2;
            g0 g0Var;
            Object objF;
            g0 g0Var2;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f51286c;
            d dVar = d.this;
            try {
                switch (i14) {
                    case 0:
                        r.b(obj);
                        vq2.e eVar = (vq2.e) dVar.getView();
                        int i15 = vq2.e.f179461z0;
                        eVar.S5(null, null);
                        m mVar3 = (m) dVar.f0();
                        this.f51286c = 1;
                        if (mVar3.J(this) != aVar) {
                            mVar = (m) dVar.f0();
                            this.f51286c = 2;
                            if (mVar.C0(this) == aVar) {
                                mVar2 = (m) dVar.f0();
                                this.f51286c = 3;
                                if (mVar2.l0(this) != aVar) {
                                    m mVar4 = (m) dVar.f0();
                                    this.f51286c = 4;
                                    obj = mVar4.u0(this);
                                    if (obj == aVar) {
                                        tVar = (t) obj;
                                        m mVar5 = (m) dVar.f0();
                                        this.f51284a = tVar;
                                        this.f51286c = 5;
                                        objI = mVar5.I(this);
                                        if (objI != aVar) {
                                            tVar2 = tVar;
                                            obj = objI;
                                            g0Var = (g0) obj;
                                            m mVar6 = (m) dVar.f0();
                                            this.f51284a = tVar2;
                                            this.f51285b = g0Var;
                                            this.f51286c = 6;
                                            objF = mVar6.F(this);
                                            if (objF != aVar) {
                                                g0Var2 = g0Var;
                                                obj = objF;
                                                d.h0(dVar, tVar2, g0Var2);
                                                d.g0(dVar, (as2.b) obj);
                                                return Unit.INSTANCE;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        return aVar;
                    case 1:
                        r.b(obj);
                        mVar = (m) dVar.f0();
                        this.f51286c = 2;
                        if (mVar.C0(this) == aVar) {
                            mVar2 = (m) dVar.f0();
                            this.f51286c = 3;
                            if (mVar2.l0(this) != aVar) {
                                m mVar7 = (m) dVar.f0();
                                this.f51286c = 4;
                                obj = mVar7.u0(this);
                                if (obj == aVar) {
                                    tVar = (t) obj;
                                    m mVar8 = (m) dVar.f0();
                                    this.f51284a = tVar;
                                    this.f51286c = 5;
                                    objI = mVar8.I(this);
                                    if (objI != aVar) {
                                        tVar2 = tVar;
                                        obj = objI;
                                        g0Var = (g0) obj;
                                        m mVar9 = (m) dVar.f0();
                                        this.f51284a = tVar2;
                                        this.f51285b = g0Var;
                                        this.f51286c = 6;
                                        objF = mVar9.F(this);
                                        if (objF != aVar) {
                                            g0Var2 = g0Var;
                                            obj = objF;
                                            d.h0(dVar, tVar2, g0Var2);
                                            d.g0(dVar, (as2.b) obj);
                                            return Unit.INSTANCE;
                                        }
                                    }
                                }
                            }
                        }
                        return aVar;
                    case 2:
                        r.b(obj);
                        mVar2 = (m) dVar.f0();
                        this.f51286c = 3;
                        if (mVar2.l0(this) != aVar) {
                            m mVar10 = (m) dVar.f0();
                            this.f51286c = 4;
                            obj = mVar10.u0(this);
                            if (obj == aVar) {
                                tVar = (t) obj;
                                m mVar11 = (m) dVar.f0();
                                this.f51284a = tVar;
                                this.f51286c = 5;
                                objI = mVar11.I(this);
                                if (objI != aVar) {
                                    tVar2 = tVar;
                                    obj = objI;
                                    g0Var = (g0) obj;
                                    m mVar12 = (m) dVar.f0();
                                    this.f51284a = tVar2;
                                    this.f51285b = g0Var;
                                    this.f51286c = 6;
                                    objF = mVar12.F(this);
                                    if (objF != aVar) {
                                        g0Var2 = g0Var;
                                        obj = objF;
                                        d.h0(dVar, tVar2, g0Var2);
                                        d.g0(dVar, (as2.b) obj);
                                        return Unit.INSTANCE;
                                    }
                                }
                            }
                        }
                        return aVar;
                    case 3:
                        r.b(obj);
                        m mVar13 = (m) dVar.f0();
                        this.f51286c = 4;
                        obj = mVar13.u0(this);
                        if (obj == aVar) {
                            tVar = (t) obj;
                            m mVar14 = (m) dVar.f0();
                            this.f51284a = tVar;
                            this.f51286c = 5;
                            objI = mVar14.I(this);
                            if (objI != aVar) {
                                tVar2 = tVar;
                                obj = objI;
                                g0Var = (g0) obj;
                                m mVar15 = (m) dVar.f0();
                                this.f51284a = tVar2;
                                this.f51285b = g0Var;
                                this.f51286c = 6;
                                objF = mVar15.F(this);
                                if (objF != aVar) {
                                    g0Var2 = g0Var;
                                    obj = objF;
                                    d.h0(dVar, tVar2, g0Var2);
                                    d.g0(dVar, (as2.b) obj);
                                    return Unit.INSTANCE;
                                }
                            }
                        }
                        return aVar;
                    case 4:
                        r.b(obj);
                        tVar = (t) obj;
                        m mVar16 = (m) dVar.f0();
                        this.f51284a = tVar;
                        this.f51286c = 5;
                        objI = mVar16.I(this);
                        if (objI != aVar) {
                            tVar2 = tVar;
                            obj = objI;
                            g0Var = (g0) obj;
                            m mVar17 = (m) dVar.f0();
                            this.f51284a = tVar2;
                            this.f51285b = g0Var;
                            this.f51286c = 6;
                            objF = mVar17.F(this);
                            if (objF != aVar) {
                                g0Var2 = g0Var;
                                obj = objF;
                                d.h0(dVar, tVar2, g0Var2);
                                d.g0(dVar, (as2.b) obj);
                                return Unit.INSTANCE;
                            }
                        }
                        return aVar;
                    case 5:
                        tVar2 = this.f51284a;
                        r.b(obj);
                        g0Var = (g0) obj;
                        m mVar18 = (m) dVar.f0();
                        this.f51284a = tVar2;
                        this.f51285b = g0Var;
                        this.f51286c = 6;
                        objF = mVar18.F(this);
                        if (objF != aVar) {
                            g0Var2 = g0Var;
                            obj = objF;
                            d.h0(dVar, tVar2, g0Var2);
                            d.g0(dVar, (as2.b) obj);
                            return Unit.INSTANCE;
                        }
                        return aVar;
                    case 6:
                        g0Var2 = this.f51285b;
                        tVar2 = this.f51284a;
                        r.b(obj);
                        d.h0(dVar, tVar2, g0Var2);
                        d.g0(dVar, (as2.b) obj);
                        return Unit.INSTANCE;
                    default:
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                }
            } catch (Throwable th3) {
                try {
                    d.f51273c.warn("An error happens in onMVPReady()", th3);
                    if (th3 instanceof InvalidAppletException) {
                        ((com.garmin.feature.garminpay.providers.gpay.snowball.ui.b) dVar.getView()).r5(((InvalidAppletException) th3).getReason(), new x(dVar, 3));
                    } else if (th3 instanceof CardRetryFailedException) {
                        ((com.garmin.feature.garminpay.providers.gpay.snowball.ui.b) dVar.getView()).l4(new x(dVar, 4));
                    } else if (th3 instanceof CardInProcessingException) {
                        ((com.garmin.feature.garminpay.providers.gpay.snowball.ui.b) dVar.getView()).B4(((m) dVar.f0()).d(), ((CardInProcessingException) th3).getType(), new x(dVar, 5));
                    } else if (th3 instanceof MaintenanceException) {
                        ((com.garmin.feature.garminpay.providers.gpay.snowball.ui.b) dVar.getView()).c2(new x(dVar, 6));
                    } else if (th3 instanceof DeviceNotConnectedException) {
                        com.garmin.feature.garminpay.providers.gpay.snowball.ui.b bVar = (com.garmin.feature.garminpay.providers.gpay.snowball.ui.b) dVar.getView();
                        String strI = a0.i(((m) dVar.f0()).getDevice());
                        bVar.u1(new x(dVar, 7), ((m) dVar.f0()).getDevice().getUnitID(), strI);
                    } else if (th3 instanceof ProviderErrorCodeException) {
                        ((com.garmin.feature.garminpay.providers.gpay.snowball.ui.b) dVar.getView()).s5(((m) dVar.f0()).d(), ((ProviderErrorCodeException) th3).getErrorCode(), new x(dVar, 8));
                    } else if (th3 instanceof NfcTransferCoroutineException) {
                        ((com.garmin.feature.garminpay.providers.gpay.snowball.ui.b) dVar.getView()).h4(new x(dVar, 9), a0.i(((m) dVar.f0()).getDevice()));
                    } else {
                        ((com.garmin.feature.garminpay.providers.gpay.snowball.ui.b) dVar.getView()).s5(((m) dVar.f0()).d(), null, new x(dVar, 10));
                    }
                } finally {
                    ((com.garmin.feature.garminpay.providers.gpay.snowball.ui.b) dVar.getView()).hideProgressOverlay();
                }
            }
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.feature.garminpay.providers.gpay.snowball.ui.SnowballCardDetailPresenter$onPayDone$1", f = "SnowballCardDetailPresenter.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class f extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ lo2.c f51288a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ d f51289b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(lo2.c cVar, d dVar, t13.d<? super f> dVar2) {
            super(2, dVar2);
            this.f51288a = cVar;
            this.f51289b = dVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new f(this.f51288a, this.f51289b, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((f) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            lo2.c cVar = this.f51288a;
            d dVar = this.f51289b;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            r.b(obj);
            try {
                d.f51273c.info("Alipay returns: " + cVar);
                cVar.a();
                i0 f51259g = ((com.garmin.feature.garminpay.providers.gpay.snowball.ui.b) dVar.getView()).getF51259g();
                x53.c cVar2 = s0.f129406a;
                gl.b.I(f51259g, o.f168762a, new c0(dVar, null), 2);
            } catch (UserCancellationException e4) {
                d.f51273c.warn("User canceled the payment in onPayDone", (Throwable) e4);
                ((com.garmin.feature.garminpay.providers.gpay.snowball.ui.b) dVar.getView()).l7(new x(dVar, 11));
            } catch (Throwable th3) {
                d.f51273c.warn("Exception occurs in onPayDone", th3);
                ((com.garmin.feature.garminpay.providers.gpay.snowball.ui.b) dVar.getView()).s5(((m) dVar.f0()).d(), null, new x(dVar, 12));
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.feature.garminpay.providers.gpay.snowball.ui.SnowballCardDetailPresenter$onRechargeClicked$1", f = "SnowballCardDetailPresenter.kt", l = {115}, m = "invokeSuspend", v = 2)
    public static final class g extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f51290a;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.feature.garminpay.providers.gpay.snowball.ui.SnowballCardDetailPresenter$onRechargeClicked$1$1", f = "SnowballCardDetailPresenter.kt", l = {116, 117, 118, 119}, m = "invokeSuspend", v = 2)
        public static final class a extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f51292a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d f51293b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(d dVar, t13.d<? super a> dVar2) {
                super(2, dVar2);
                this.f51293b = dVar;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new a(this.f51293b, dVar);
            }

            @Override // e23.p
            public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
                return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Code duplicated, block: B:23:0x005d  */
            /* JADX WARN: Code restructure failed: missing block: B:24:0x0069, code lost:
            
                if (r8.t(r7) == r0) goto L25;
             */
            @Override // v13.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) {
                m mVar;
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i14 = this.f51292a;
                d dVar = this.f51293b;
                if (i14 == 0) {
                    r.b(obj);
                    m mVar2 = (m) dVar.f0();
                    this.f51292a = 1;
                    if (mVar2.h0(this) != aVar) {
                    }
                    return aVar;
                }
                if (i14 == 1) {
                    r.b(obj);
                } else {
                    if (i14 == 2) {
                        r.b(obj);
                        mVar = (m) dVar.f0();
                        this.f51292a = 3;
                        if (mVar.J(this) != aVar) {
                            m mVar3 = (m) dVar.f0();
                            this.f51292a = 4;
                        }
                        return aVar;
                    }
                    if (i14 == 3) {
                        r.b(obj);
                        m mVar4 = (m) dVar.f0();
                        this.f51292a = 4;
                    } else {
                        if (i14 != 4) {
                            vb.h.z("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        r.b(obj);
                    }
                }
                return Unit.INSTANCE;
                m mVar5 = (m) dVar.f0();
                q qVar = q.TOPUP;
                this.f51292a = 2;
                if (mVar5.m(qVar, this) != aVar) {
                    mVar = (m) dVar.f0();
                    this.f51292a = 3;
                    if (mVar.J(this) != aVar) {
                        m mVar6 = (m) dVar.f0();
                        this.f51292a = 4;
                    }
                }
                return aVar;
            }
        }

        public g(t13.d<? super g> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return d.this.new g(dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((g) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f51290a;
            d dVar = d.this;
            try {
                if (i14 == 0) {
                    r.b(obj);
                    vq2.e eVar = (vq2.e) dVar.getView();
                    int i15 = vq2.e.f179461z0;
                    eVar.S5(null, null);
                    x53.c cVar = s0.f129406a;
                    x53.b bVar = x53.b.f189152a;
                    a aVar2 = new a(dVar, null);
                    this.f51290a = 1;
                    if (ge1.b.e0(bVar, aVar2, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i14 != 1) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    r.b(obj);
                }
                ((com.garmin.feature.garminpay.providers.gpay.snowball.ui.b) dVar.getView()).P3();
            } catch (Exception e4) {
                d.f51273c.warn("An error happens in onRechargeClicked()", (Throwable) e4);
                if (e4 instanceof MaintenanceException) {
                    ((com.garmin.feature.garminpay.providers.gpay.snowball.ui.e) dVar.getView()).c2(new po2.o(4));
                } else if (e4 instanceof DeviceNotConnectedException) {
                    ((vq2.b) dVar.getView()).u1(new b1(7), ((m) dVar.f0()).getDevice().getUnitID(), a0.i(((m) dVar.f0()).getDevice()));
                } else if (e4 instanceof CardBalanceExceededException) {
                    ((com.garmin.feature.garminpay.providers.gpay.snowball.ui.e) dVar.getView()).D5(((CardBalanceExceededException) e4).getMaxBalance(), new po2.o(8));
                } else if (e4 instanceof NfcTransferCoroutineException) {
                    ((vq2.b) dVar.getView()).h4(new b1(6), a0.i(((m) dVar.f0()).getDevice()));
                } else {
                    ((vq2.b) dVar.getView()).s5(((m) dVar.f0()).d(), null, new b1(8));
                }
            } finally {
                ((com.garmin.feature.garminpay.providers.gpay.snowball.ui.b) dVar.getView()).hideProgressOverlay();
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.feature.garminpay.providers.gpay.snowball.ui.SnowballCardDetailPresenter$onRechargePayClicked$1", f = "SnowballCardDetailPresenter.kt", l = {ModuleDescriptor.MODULE_VERSION}, m = "invokeSuspend", v = 2)
    public static final class h extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f51294a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ CurrencyValue f51296c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ fo2.i f51297d;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "Lfo2/a0;", "<anonymous>", "(Lo53/b0;)Lfo2/a0;"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.feature.garminpay.providers.gpay.snowball.ui.SnowballCardDetailPresenter$onRechargePayClicked$1$rechargeResult$1", f = "SnowballCardDetailPresenter.kt", l = {156, 157, 158, 159}, m = "invokeSuspend", v = 2)
        public static final class a extends v13.i implements p<b0, t13.d<? super fo2.a0>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f51298a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d f51299b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ CurrencyValue f51300c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ fo2.i f51301d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(d dVar, CurrencyValue currencyValue, fo2.i iVar, t13.d<? super a> dVar2) {
                super(2, dVar2);
                this.f51299b = dVar;
                this.f51300c = currencyValue;
                this.f51301d = iVar;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new a(this.f51299b, this.f51300c, this.f51301d, dVar);
            }

            @Override // e23.p
            public final Object invoke(b0 b0Var, t13.d<? super fo2.a0> dVar) {
                return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Code duplicated, block: B:27:0x0085 A[RETURN] */
            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                m mVar;
                Object objL;
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i14 = this.f51298a;
                d dVar = this.f51299b;
                if (i14 == 0) {
                    r.b(obj);
                    m mVar2 = (m) dVar.f0();
                    this.f51298a = 1;
                    if (mVar2.G(this.f51300c, this) != aVar) {
                    }
                    return aVar;
                }
                if (i14 == 1) {
                    r.b(obj);
                } else {
                    if (i14 == 2) {
                        r.b(obj);
                        mVar = (m) dVar.f0();
                        this.f51298a = 3;
                        if (mVar.T(this) != aVar) {
                        }
                        return aVar;
                    }
                    if (i14 != 3) {
                        if (i14 == 4) {
                            r.b(obj);
                            return obj;
                        }
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    r.b(obj);
                }
                m mVar3 = (m) dVar.f0();
                fo2.x xVar = fo2.x.ALIPAY;
                fo2.i iVar = this.f51301d;
                fo2.b0 b0Var = new fo2.b0(xVar, iVar.getTotalCost().a(), iVar.getTotalCredit().a());
                this.f51298a = 4;
                objL = mVar3.L(b0Var, this);
                if (objL != aVar) {
                    return aVar;
                }
                return objL;
                m mVar4 = (m) dVar.f0();
                this.f51298a = 2;
                if (mVar4.l0(this) != aVar) {
                    mVar = (m) dVar.f0();
                    this.f51298a = 3;
                    if (mVar.T(this) != aVar) {
                        m mVar5 = (m) dVar.f0();
                        fo2.x xVar2 = fo2.x.ALIPAY;
                        fo2.i iVar2 = this.f51301d;
                        fo2.b0 b0Var2 = new fo2.b0(xVar2, iVar2.getTotalCost().a(), iVar2.getTotalCredit().a());
                        this.f51298a = 4;
                        objL = mVar5.L(b0Var2, this);
                        if (objL != aVar) {
                            return objL;
                        }
                    }
                }
                return aVar;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(CurrencyValue currencyValue, fo2.i iVar, t13.d<? super h> dVar) {
            super(2, dVar);
            this.f51296c = currencyValue;
            this.f51297d = iVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return d.this.new h(this.f51296c, this.f51297d, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((h) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            fo2.c.b payload;
            String signedData;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f51294a;
            d dVar = d.this;
            try {
                if (i14 == 0) {
                    r.b(obj);
                    vq2.e eVar = (vq2.e) dVar.getView();
                    int i15 = vq2.e.f179461z0;
                    eVar.S5(null, null);
                    ((com.garmin.feature.garminpay.providers.gpay.snowball.ui.b) dVar.getView()).f1();
                    x53.c cVar = s0.f129406a;
                    x53.b bVar = x53.b.f189152a;
                    a aVar2 = new a(dVar, this.f51296c, this.f51297d, null);
                    this.f51294a = 1;
                    obj = ge1.b.e0(bVar, aVar2, this);
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
                fo2.a0 a0Var = (fo2.a0) obj;
                d.f51273c.info("recharge returns: " + a0Var);
                aq2.j.f12491a.getClass();
                wr2.p.f186870a.getClass();
                if (wr2.p.b("dynamic_feature_app", "SHOULD_BYPASS_ALIPAY", false)) {
                    i0 f51259g = ((com.garmin.feature.garminpay.providers.gpay.snowball.ui.b) dVar.getView()).getF51259g();
                    x53.c cVar2 = s0.f129406a;
                    gl.b.I(f51259g, o.f168762a, new c0(dVar, null), 2);
                } else {
                    com.garmin.feature.garminpay.providers.gpay.snowball.ui.b bVar2 = (com.garmin.feature.garminpay.providers.gpay.snowball.ui.b) dVar.getView();
                    fo2.c appToAppContext = a0Var.getAppToAppContext();
                    if (appToAppContext == null || (payload = appToAppContext.getPayload()) == null || (signedData = payload.getSignedData()) == null) {
                        throw new ns2.d("No appToAppContext in " + a0Var);
                    }
                    bVar2.f3(signedData);
                }
            } catch (Throwable th3) {
                ((com.garmin.feature.garminpay.providers.gpay.snowball.ui.b) dVar.getView()).hideProgressOverlay();
                ((com.garmin.feature.garminpay.providers.gpay.snowball.ui.b) dVar.getView()).T4();
                d.f51273c.warn("An error happens in onRechargePayClicked()", th3);
                if (th3 instanceof MaintenanceException) {
                    ((com.garmin.feature.garminpay.providers.gpay.snowball.ui.e) dVar.getView()).c2(new po2.o(4));
                } else if (th3 instanceof CardBalanceExceededException) {
                    ((com.garmin.feature.garminpay.providers.gpay.snowball.ui.e) dVar.getView()).H4(((CardBalanceExceededException) th3).getMaxBalance(), new po2.o(2));
                } else if (th3 instanceof NeedToUpgradeManuallyException) {
                    ((com.garmin.feature.garminpay.providers.gpay.snowball.ui.b) dVar.getView()).L6(new y(dVar, (NeedToUpgradeManuallyException) th3, 0), ((m) dVar.f0()).d());
                } else if (th3 instanceof ProviderErrorCodeException) {
                    ((com.garmin.feature.garminpay.providers.gpay.snowball.ui.b) dVar.getView()).s5(((m) dVar.f0()).d(), ((ProviderErrorCodeException) th3).getErrorCode(), new x(dVar, 13));
                } else if (th3 instanceof InvalidAppletException) {
                    ((com.garmin.feature.garminpay.providers.gpay.snowball.ui.b) dVar.getView()).r5(((InvalidAppletException) th3).getReason(), new x(dVar, 14));
                } else if (th3 instanceof AppletExpiredException) {
                    ((com.garmin.feature.garminpay.providers.gpay.snowball.ui.b) dVar.getView()).r5(InvalidAppletException.a.INVALID_EXPIRATION, new x(dVar, 15));
                } else if (th3 instanceof NfcTransferCoroutineException) {
                    ((com.garmin.feature.garminpay.providers.gpay.snowball.ui.b) dVar.getView()).h4(new x(dVar, 16), a0.i(((m) dVar.f0()).getDevice()));
                } else {
                    ((com.garmin.feature.garminpay.providers.gpay.snowball.ui.b) dVar.getView()).s5(((m) dVar.f0()).d(), null, new x(dVar, 17));
                }
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.feature.garminpay.providers.gpay.snowball.ui.SnowballCardDetailPresenter$onRemoveCardSelected$1", f = "SnowballCardDetailPresenter.kt", l = {328}, m = "invokeSuspend", v = 2)
    public static final class i extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f51302a;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.feature.garminpay.providers.gpay.snowball.ui.SnowballCardDetailPresenter$onRemoveCardSelected$1$1", f = "SnowballCardDetailPresenter.kt", l = {329, 330, 331, 332, 333}, m = "invokeSuspend", v = 2)
        public static final class a extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f51304a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d f51305b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(d dVar, t13.d<? super a> dVar2) {
                super(2, dVar2);
                this.f51305b = dVar;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new a(this.f51305b, dVar);
            }

            @Override // e23.p
            public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
                return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Code duplicated, block: B:25:0x0064  */
            /* JADX WARN: Code duplicated, block: B:28:0x0073  */
            /* JADX WARN: Code restructure failed: missing block: B:29:0x007f, code lost:
            
                if (r9.m0(r8) == r0) goto L30;
             */
            @Override // v13.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) {
                m mVar;
                m mVar2;
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i14 = this.f51304a;
                d dVar = this.f51305b;
                if (i14 == 0) {
                    r.b(obj);
                    m mVar3 = (m) dVar.f0();
                    this.f51304a = 1;
                    if (mVar3.h0(this) != aVar) {
                    }
                    return aVar;
                }
                if (i14 == 1) {
                    r.b(obj);
                } else {
                    if (i14 == 2) {
                        r.b(obj);
                        mVar = (m) dVar.f0();
                        this.f51304a = 3;
                        if (mVar.J(this) != aVar) {
                            mVar2 = (m) dVar.f0();
                            this.f51304a = 4;
                            if (mVar2.O(this) != aVar) {
                                m mVar4 = (m) dVar.f0();
                                this.f51304a = 5;
                            }
                        }
                        return aVar;
                    }
                    if (i14 == 3) {
                        r.b(obj);
                        mVar2 = (m) dVar.f0();
                        this.f51304a = 4;
                        if (mVar2.O(this) != aVar) {
                            m mVar5 = (m) dVar.f0();
                            this.f51304a = 5;
                        }
                        return aVar;
                    }
                    if (i14 == 4) {
                        r.b(obj);
                        m mVar6 = (m) dVar.f0();
                        this.f51304a = 5;
                    } else {
                        if (i14 != 5) {
                            vb.h.z("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        r.b(obj);
                    }
                }
                return Unit.INSTANCE;
                m mVar7 = (m) dVar.f0();
                q qVar = q.DELETE;
                this.f51304a = 2;
                if (mVar7.m(qVar, this) != aVar) {
                    mVar = (m) dVar.f0();
                    this.f51304a = 3;
                    if (mVar.J(this) != aVar) {
                        mVar2 = (m) dVar.f0();
                        this.f51304a = 4;
                        if (mVar2.O(this) != aVar) {
                            m mVar8 = (m) dVar.f0();
                            this.f51304a = 5;
                        }
                    }
                }
                return aVar;
            }
        }

        public i(t13.d<? super i> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return d.this.new i(dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((i) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f51302a;
            d dVar = d.this;
            try {
                if (i14 == 0) {
                    r.b(obj);
                    d.f51273c.trace("onRemoveCardSelected()");
                    vq2.e eVar = (vq2.e) dVar.getView();
                    int i15 = vq2.e.f179461z0;
                    eVar.S5(null, null);
                    x53.c cVar = s0.f129406a;
                    x53.b bVar = x53.b.f189152a;
                    a aVar2 = new a(dVar, null);
                    this.f51302a = 1;
                    if (ge1.b.e0(bVar, aVar2, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i14 != 1) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    r.b(obj);
                }
                ((com.garmin.feature.garminpay.providers.gpay.snowball.ui.e) dVar.getView()).Z6(a0.i(((m) dVar.f0()).getDevice()), new x(dVar, 18), new po2.o(5));
            } catch (Throwable th3) {
                try {
                    d.f51273c.warn("An error happens in onRemoveCardSelected()", th3);
                    if (th3 instanceof MaintenanceException) {
                        ((com.garmin.feature.garminpay.providers.gpay.snowball.ui.e) dVar.getView()).c2(new po2.o(4));
                    } else if (th3 instanceof DeviceNotConnectedException) {
                        ((vq2.b) dVar.getView()).u1(new b1(7), ((m) dVar.f0()).getDevice().getUnitID(), a0.i(((m) dVar.f0()).getDevice()));
                    } else if (th3 instanceof NotAbleToDeleteCardException) {
                        ((com.garmin.feature.garminpay.providers.gpay.snowball.ui.e) dVar.getView()).X0(((m) dVar.f0()).h(), new po2.o(6));
                    } else if (th3 instanceof InTransitException) {
                        ((com.garmin.feature.garminpay.providers.gpay.snowball.ui.e) dVar.getView()).g6(b.REMOVE_CARD, new po2.o(7));
                    } else if (th3 instanceof NfcTransferCoroutineException) {
                        ((vq2.b) dVar.getView()).h4(new b1(6), a0.i(((m) dVar.f0()).getDevice()));
                    } else {
                        ((vq2.b) dVar.getView()).s5(((m) dVar.f0()).d(), null, new b1(8));
                    }
                } finally {
                    ((com.garmin.feature.garminpay.providers.gpay.snowball.ui.b) dVar.getView()).hideProgressOverlay();
                }
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.feature.garminpay.providers.gpay.snowball.ui.SnowballCardDetailPresenter$onShiftOutCardSelected$1", f = "SnowballCardDetailPresenter.kt", l = {269}, m = "invokeSuspend", v = 2)
    public static final class j extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f51306a;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.feature.garminpay.providers.gpay.snowball.ui.SnowballCardDetailPresenter$onShiftOutCardSelected$1$1", f = "SnowballCardDetailPresenter.kt", l = {270, 271, 272, 273}, m = "invokeSuspend", v = 2)
        public static final class a extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f51308a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d f51309b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(d dVar, t13.d<? super a> dVar2) {
                super(2, dVar2);
                this.f51309b = dVar;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new a(this.f51309b, dVar);
            }

            @Override // e23.p
            public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
                return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Code duplicated, block: B:23:0x005d  */
            /* JADX WARN: Code restructure failed: missing block: B:24:0x0069, code lost:
            
                if (r8.m0(r7) == r0) goto L25;
             */
            @Override // v13.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) {
                m mVar;
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i14 = this.f51308a;
                d dVar = this.f51309b;
                if (i14 == 0) {
                    r.b(obj);
                    m mVar2 = (m) dVar.f0();
                    this.f51308a = 1;
                    if (mVar2.h0(this) != aVar) {
                    }
                    return aVar;
                }
                if (i14 == 1) {
                    r.b(obj);
                } else {
                    if (i14 == 2) {
                        r.b(obj);
                        mVar = (m) dVar.f0();
                        this.f51308a = 3;
                        if (mVar.J(this) != aVar) {
                            m mVar3 = (m) dVar.f0();
                            this.f51308a = 4;
                        }
                        return aVar;
                    }
                    if (i14 == 3) {
                        r.b(obj);
                        m mVar4 = (m) dVar.f0();
                        this.f51308a = 4;
                    } else {
                        if (i14 != 4) {
                            vb.h.z("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        r.b(obj);
                    }
                }
                return Unit.INSTANCE;
                m mVar5 = (m) dVar.f0();
                q qVar = q.BACKUP;
                this.f51308a = 2;
                if (mVar5.m(qVar, this) != aVar) {
                    mVar = (m) dVar.f0();
                    this.f51308a = 3;
                    if (mVar.J(this) != aVar) {
                        m mVar6 = (m) dVar.f0();
                        this.f51308a = 4;
                    }
                }
                return aVar;
            }
        }

        public j(t13.d<? super j> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return d.this.new j(dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((j) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f51306a;
            d dVar = d.this;
            try {
                if (i14 == 0) {
                    r.b(obj);
                    d.f51273c.trace("onShiftOutCardSelected()");
                    vq2.e eVar = (vq2.e) dVar.getView();
                    int i15 = vq2.e.f179461z0;
                    eVar.S5(null, null);
                    x53.c cVar = s0.f129406a;
                    x53.b bVar = x53.b.f189152a;
                    a aVar2 = new a(dVar, null);
                    this.f51306a = 1;
                    if (ge1.b.e0(bVar, aVar2, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i14 != 1) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    r.b(obj);
                }
                ((com.garmin.feature.garminpay.providers.gpay.snowball.ui.e) dVar.getView()).Y7(a0.i(((m) dVar.f0()).getDevice()), ((m) dVar.f0()).d(), new x(dVar, 19), new po2.o(3));
            } catch (Throwable th3) {
                try {
                    d.f51273c.warn("An error happens in onShiftOutCardSelected()", th3);
                    if (th3 instanceof MaintenanceException) {
                        ((com.garmin.feature.garminpay.providers.gpay.snowball.ui.e) dVar.getView()).c2(new po2.o(4));
                    } else if (th3 instanceof DeviceNotConnectedException) {
                        ((vq2.b) dVar.getView()).u1(new b1(7), ((m) dVar.f0()).getDevice().getUnitID(), a0.i(((m) dVar.f0()).getDevice()));
                    } else if (th3 instanceof InTransitException) {
                        ((com.garmin.feature.garminpay.providers.gpay.snowball.ui.e) dVar.getView()).g6(b.SHIFT_OUT_CARD, new po2.o(7));
                    } else if (th3 instanceof NfcTransferCoroutineException) {
                        ((vq2.b) dVar.getView()).h4(new b1(6), a0.i(((m) dVar.f0()).getDevice()));
                    } else {
                        ((vq2.b) dVar.getView()).s5(((m) dVar.f0()).d(), null, new b1(8));
                    }
                } finally {
                    ((com.garmin.feature.garminpay.providers.gpay.snowball.ui.b) dVar.getView()).hideProgressOverlay();
                }
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.feature.garminpay.providers.gpay.snowball.ui.SnowballCardDetailPresenter$onViewResume$1", f = "SnowballCardDetailPresenter.kt", l = {383}, m = "invokeSuspend", v = 2)
    public static final class k extends v13.i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public d f51310a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f51311b;

        public k(t13.d<? super k> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return d.this.new k(dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((k) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            d dVar;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f51311b;
            try {
                if (i14 == 0) {
                    r.b(obj);
                    d dVar2 = d.this;
                    m mVar = (m) dVar2.f0();
                    this.f51310a = dVar2;
                    this.f51311b = 1;
                    Object objF = mVar.F(this);
                    if (objF == aVar) {
                        return aVar;
                    }
                    dVar = dVar2;
                    obj = objF;
                } else {
                    if (i14 != 1) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    dVar = this.f51310a;
                    r.b(obj);
                }
                d.g0(dVar, (as2.b) obj);
            } catch (Throwable th3) {
                d.f51273c.warn("Failed to show last balance on resume", th3);
            }
            return Unit.INSTANCE;
        }
    }

    static {
        new a(null);
        int i14 = gt2.c.f79010a;
        f51273c = gt2.b.f79005a.h("PAY#SB#CardDetailPrs");
    }

    public static final void g0(d dVar, as2.b bVar) {
        CurrencyValue currencyValue;
        ((com.garmin.feature.garminpay.providers.gpay.snowball.ui.b) dVar.getView()).q(ko2.c.f105778b.b((bVar == null || (currencyValue = (CurrencyValue) bVar.a()) == null) ? null : Double.valueOf(currencyValue.a())));
        ((com.garmin.feature.garminpay.providers.gpay.snowball.ui.b) dVar.getView()).v(u0.i(bVar != null ? bVar.c() : null));
    }

    public static final void h0(d dVar, t tVar, g0 g0Var) {
        ((com.garmin.feature.garminpay.providers.gpay.snowball.ui.b) dVar.getView()).D6(tVar.f139379b);
        ((com.garmin.feature.garminpay.providers.gpay.snowball.ui.b) dVar.getView()).w(tVar.f139380c);
        ((com.garmin.feature.garminpay.providers.gpay.snowball.ui.b) dVar.getView()).u0(tVar.f139383f);
        com.garmin.feature.garminpay.providers.gpay.snowball.ui.b bVar = (com.garmin.feature.garminpay.providers.gpay.snowball.ui.b) dVar.getView();
        String strI = a0.i(((m) dVar.f0()).getDevice());
        String strT = u0.t(((m) dVar.f0()).getDevice());
        if (strT == null) {
            l.i(((m) dVar.f0()).getDevice(), " does not have proper image url.");
            return;
        }
        bVar.W(strI, strT);
        ((com.garmin.feature.garminpay.providers.gpay.snowball.ui.b) dVar.getView()).o9(((m) dVar.f0()).d(), tVar.f139381d);
        ((com.garmin.feature.garminpay.providers.gpay.snowball.ui.b) dVar.getView()).W6(tVar.f139382e);
        Throwable th3 = g0Var.f139198b;
        if (th3 == null) {
            ((com.garmin.feature.garminpay.providers.gpay.snowball.ui.b) dVar.getView()).Q4(g0Var.f139197a);
        } else {
            f51273c.warn("getCardUsageHistory Error: ", th3);
            ((com.garmin.feature.garminpay.providers.gpay.snowball.ui.b) dVar.getView()).O8();
        }
    }

    @Override // po2.n
    public final void F() {
        ((com.garmin.feature.garminpay.providers.gpay.snowball.ui.b) getView()).G8();
    }

    @Override // po2.n
    public final void N() {
        gl.b.I(((com.garmin.feature.garminpay.providers.gpay.snowball.ui.b) getView()).getF51259g(), null, new C1065d(null), 3);
    }

    @Override // po2.n
    public final void Y() {
        i0 f51259g = ((com.garmin.feature.garminpay.providers.gpay.snowball.ui.b) getView()).getF51259g();
        x53.c cVar = s0.f129406a;
        gl.b.I(f51259g, o.f168762a, new i(null), 2);
    }

    @Override // po2.n
    public final void Z(fo2.i iVar, CurrencyValue currencyValue) {
        iVar.getClass();
        i0 f51259g = ((com.garmin.feature.garminpay.providers.gpay.snowball.ui.b) getView()).getF51259g();
        x53.c cVar = s0.f129406a;
        gl.b.I(f51259g, o.f168762a, new h(currencyValue, iVar, null), 2);
    }

    @Override // sy2.d
    public final void a0() {
        gl.b.I(((com.garmin.feature.garminpay.providers.gpay.snowball.ui.b) getView()).getF51259g(), null, new e(null), 3);
    }

    @Override // po2.n
    public final void b() {
        gl.b.I(((com.garmin.feature.garminpay.providers.gpay.snowball.ui.b) getView()).getF51259g(), null, new k(null), 3);
    }

    @Override // po2.n
    public final void d(lo2.c cVar) {
        cVar.getClass();
        i0 f51259g = ((com.garmin.feature.garminpay.providers.gpay.snowball.ui.b) getView()).getF51259g();
        x53.c cVar2 = s0.f129406a;
        gl.b.I(f51259g, o.f168762a, new f(cVar, this, null), 2);
    }

    @Override // po2.n
    public final void d0() {
        gl.b.I(((com.garmin.feature.garminpay.providers.gpay.snowball.ui.b) getView()).getF51259g(), null, new g(null), 3);
    }

    @Override // po2.n
    public final void e0(Context context, String str) {
        Object systemService = context.getSystemService("clipboard");
        systemService.getClass();
        ClipData clipDataNewPlainText = ClipData.newPlainText("Garmin Pay Snowball Card Number", str);
        clipDataNewPlainText.getClass();
        ((ClipboardManager) systemService).setPrimaryClip(clipDataNewPlainText);
        Toast.makeText(context, "卡号已复制", 0).show();
    }

    @Override // po2.n
    public final void r() {
        gl.b.I(((com.garmin.feature.garminpay.providers.gpay.snowball.ui.b) getView()).getF51259g(), null, new c(null), 3);
    }

    @Override // po2.n
    public final void w() {
        gl.b.I(((com.garmin.feature.garminpay.providers.gpay.snowball.ui.b) getView()).getF51259g(), null, new j(null), 3);
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/garmin/feature/garminpay/providers/gpay/snowball/ui/d$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "Lorg/slf4j/Logger;", "logger", "Lorg/slf4j/Logger;", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
