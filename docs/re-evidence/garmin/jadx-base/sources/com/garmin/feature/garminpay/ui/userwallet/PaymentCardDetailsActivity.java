package com.garmin.feature.garminpay.ui.userwallet;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import androidx.lifecycle.v1;
import androidx.lifecycle.x1;
import androidx.lifecycle.y0;
import androidx.lifecycle.z0;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.feature.garminpay.providers.gpay.ui.addcard.FitPayAddCardActivity;
import com.garmin.feature.garminpay.providers.gpay.ui.garminpaytermsconditions.NewFitPayTermsAndConditionActivity;
import com.garmin.feature.garminpay.providers.gpay.ui.onboarding.NewDeviceOnBoardingActivity;
import com.garmin.feature.garminpay.ui.userwallet.PaymentCardDetailsActivity;
import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import e23.l;
import gp2.g;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import o13.m;
import o13.p;
import o13.t;
import o53.s0;
import org.koin.java.KoinJavaComponent;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.n;
import p005kotlin.jvm.internal.s;
import r22.q0;
import tr2.h;
import vr2.i;
import vr2.q;
import zn2.g1;
import zn2.q3;
import zn2.y;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/garmin/feature/garminpay/ui/userwallet/PaymentCardDetailsActivity;", "Lhn2/c;", "Lyq2/a;", "<init>", "()V", "a", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class PaymentCardDetailsActivity extends hn2.c implements yq2.a {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final a f52177p = new a(null);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final Logger f52178q;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public i f52180h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public q f52181i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public sd2.f f52182j;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final j22.e f52184l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final f.c<Intent> f52185m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final f.c<Intent> f52186n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final f.c<Intent> f52187o;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final s03.a f52179g = new s03.a();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final t f52183k = m.b(new h(this, 0));

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class b implements z0, n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l f52188a;

        public b(l lVar) {
            lVar.getClass();
            this.f52188a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof z0) && (obj instanceof n)) {
                return s.g(getFunctionDelegate(), ((n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final o13.h<?> getFunctionDelegate() {
            return this.f52188a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.z0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f52188a.invoke(obj);
        }
    }

    static {
        int i14 = gt2.c.f79010a;
        f52178q = gt2.b.f79005a.h("PAY#PaymentCardDetailsActivity");
    }

    public PaymentCardDetailsActivity() {
        j22.e.a aVar = j22.e.f96744g;
        String name = f52178q.getName();
        name.getClass();
        h hVar = new h(this, 2);
        h hVar2 = new h(this, 3);
        aVar.getClass();
        this.f52184l = j22.e.a.a(name, hVar, hVar2, null);
        final int i14 = 0;
        this.f52185m = registerForActivityResult(new g.h(), new f.b(this) { // from class: tr2.j

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PaymentCardDetailsActivity f166149b;

            {
                this.f166149b = this;
            }

            @Override // f.b
            public final void a(Object obj) {
                int i15 = i14;
                PaymentCardDetailsActivity paymentCardDetailsActivity = this.f166149b;
                f.a aVar2 = (f.a) obj;
                switch (i15) {
                    case 0:
                        PaymentCardDetailsActivity.a aVar3 = PaymentCardDetailsActivity.f52177p;
                        aVar2.getClass();
                        Logger logger = PaymentCardDetailsActivity.f52178q;
                        int i16 = aVar2.f67585a;
                        u62.z.i("deviceSelectionActivityLauncher: resultCode=", i16, logger);
                        PaymentCardDetailsActivity paymentCardDetailsActivity2 = this.f166149b;
                        if (i16 != -1) {
                            if (i16 != 0) {
                                return;
                            }
                            hn2.c.ba(paymentCardDetailsActivity2, Boolean.FALSE, null, null, 14);
                            return;
                        }
                        Intent intent = aVar2.f67586b;
                        if (intent != null) {
                            long longExtra = intent.getLongExtra("device.unit.id", -1L);
                            String stringExtra = intent.getStringExtra("device.name");
                            if (longExtra == -1 || stringExtra == null) {
                                vb.h.z("");
                                return;
                            }
                            logger.debug("checkAvailableSpaceForDevice");
                            vr2.i iVar = paymentCardDetailsActivity2.f52180h;
                            if (iVar == null) {
                                p005kotlin.jvm.internal.s.m("paymentCardDetailsViewModel");
                                throw null;
                            }
                            y0<q3.a> y0Var = iVar.f179612o;
                            if (y0Var == null) {
                                p005kotlin.jvm.internal.s.m("isSpaceAvailable");
                                throw null;
                            }
                            y0Var.f(paymentCardDetailsActivity2, new PaymentCardDetailsActivity.b(new c31.e(paymentCardDetailsActivity2, stringExtra, longExtra, 6)));
                            vr2.i iVar2 = paymentCardDetailsActivity2.f52180h;
                            if (iVar2 == null) {
                                p005kotlin.jvm.internal.s.m("paymentCardDetailsViewModel");
                                throw null;
                            }
                            Map<Long, ? extends ns2.a<? extends ms2.e>> map = iVar2.f179615r;
                            if (!(map != null)) {
                                if (iVar2 == null) {
                                    p005kotlin.jvm.internal.s.m("paymentCardDetailsViewModel");
                                    throw null;
                                }
                                logger.error("Add Card cannot continue: " + (map != null));
                                paymentCardDetailsActivity2.fa();
                                return;
                            }
                            if (iVar2 == null) {
                                p005kotlin.jvm.internal.s.m("paymentCardDetailsViewModel");
                                throw null;
                            }
                            zq2.g gVarY4 = iVar2.y4();
                            if (gVarY4 != null) {
                                vr2.i iVar3 = paymentCardDetailsActivity2.f52180h;
                                if (iVar3 == null) {
                                    p005kotlin.jvm.internal.s.m("paymentCardDetailsViewModel");
                                    throw null;
                                }
                                ps2.n nVar = iVar3.f179609l;
                                if (nVar != null && ((hn2.a) KoinJavaComponent.get$default(hn2.a.class, null, null, 6, null)).i(nVar.f140512o) != null) {
                                    logger.debug("deviceWalletStatus: catalogItem: " + gVarY4);
                                    vr2.i iVar4 = paymentCardDetailsActivity2.f52180h;
                                    if (iVar4 == null) {
                                        p005kotlin.jvm.internal.s.m("paymentCardDetailsViewModel");
                                        throw null;
                                    }
                                    y0<q3.a> y0Var2 = iVar4.f179612o;
                                    if (y0Var2 == null) {
                                        p005kotlin.jvm.internal.s.m("isSpaceAvailable");
                                        throw null;
                                    }
                                    if (y0Var2.d() == null) {
                                        vr2.i iVar5 = paymentCardDetailsActivity2.f52180h;
                                        if (iVar5 == null) {
                                            p005kotlin.jvm.internal.s.m("paymentCardDetailsViewModel");
                                            throw null;
                                        }
                                        w9.a aVarA = v1.a(iVar5);
                                        x53.c cVar = s0.f129406a;
                                        ge1.b.T(aVarA, x53.b.f189152a, null, new vr2.j(iVar5, gVarY4, null), 2);
                                        return;
                                    }
                                    return;
                                }
                            }
                            paymentCardDetailsActivity2.fa();
                            return;
                        }
                        return;
                    case 1:
                        PaymentCardDetailsActivity.a aVar4 = PaymentCardDetailsActivity.f52177p;
                        aVar2.getClass();
                        Logger logger2 = PaymentCardDetailsActivity.f52178q;
                        int i17 = aVar2.f67585a;
                        u62.z.i("deviceOnboardingActivityLauncher: resultCode=", i17, logger2);
                        if (i17 == -1) {
                            paymentCardDetailsActivity.ea();
                            return;
                        }
                        return;
                    default:
                        PaymentCardDetailsActivity.a aVar5 = PaymentCardDetailsActivity.f52177p;
                        aVar2.getClass();
                        Logger logger3 = PaymentCardDetailsActivity.f52178q;
                        int i18 = aVar2.f67585a;
                        u62.z.i("termsAndConditionActivityLauncher: resultCode=", i18, logger3);
                        if (i18 == -1) {
                            vr2.i iVar6 = paymentCardDetailsActivity.f52180h;
                            if (iVar6 == null) {
                                p005kotlin.jvm.internal.s.m("paymentCardDetailsViewModel");
                                throw null;
                            }
                            zn2.z0 z0Var = iVar6.f179606i;
                            zn2.z0 z0Var2 = z0Var != null ? z0Var : null;
                            if (z0Var2 != null) {
                                z0Var2.s();
                            }
                            if (paymentCardDetailsActivity.da()) {
                                paymentCardDetailsActivity.ga();
                                return;
                            } else {
                                paymentCardDetailsActivity.ea();
                                return;
                            }
                        }
                        return;
                }
            }
        });
        final int i15 = 1;
        this.f52186n = registerForActivityResult(new g.h(), new f.b(this) { // from class: tr2.j

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PaymentCardDetailsActivity f166149b;

            {
                this.f166149b = this;
            }

            @Override // f.b
            public final void a(Object obj) {
                int i16 = i15;
                PaymentCardDetailsActivity paymentCardDetailsActivity = this.f166149b;
                f.a aVar2 = (f.a) obj;
                switch (i16) {
                    case 0:
                        PaymentCardDetailsActivity.a aVar3 = PaymentCardDetailsActivity.f52177p;
                        aVar2.getClass();
                        Logger logger = PaymentCardDetailsActivity.f52178q;
                        int i17 = aVar2.f67585a;
                        u62.z.i("deviceSelectionActivityLauncher: resultCode=", i17, logger);
                        PaymentCardDetailsActivity paymentCardDetailsActivity2 = this.f166149b;
                        if (i17 != -1) {
                            if (i17 != 0) {
                                return;
                            }
                            hn2.c.ba(paymentCardDetailsActivity2, Boolean.FALSE, null, null, 14);
                            return;
                        }
                        Intent intent = aVar2.f67586b;
                        if (intent != null) {
                            long longExtra = intent.getLongExtra("device.unit.id", -1L);
                            String stringExtra = intent.getStringExtra("device.name");
                            if (longExtra == -1 || stringExtra == null) {
                                vb.h.z("");
                                return;
                            }
                            logger.debug("checkAvailableSpaceForDevice");
                            vr2.i iVar = paymentCardDetailsActivity2.f52180h;
                            if (iVar == null) {
                                p005kotlin.jvm.internal.s.m("paymentCardDetailsViewModel");
                                throw null;
                            }
                            y0<q3.a> y0Var = iVar.f179612o;
                            if (y0Var == null) {
                                p005kotlin.jvm.internal.s.m("isSpaceAvailable");
                                throw null;
                            }
                            y0Var.f(paymentCardDetailsActivity2, new PaymentCardDetailsActivity.b(new c31.e(paymentCardDetailsActivity2, stringExtra, longExtra, 6)));
                            vr2.i iVar2 = paymentCardDetailsActivity2.f52180h;
                            if (iVar2 == null) {
                                p005kotlin.jvm.internal.s.m("paymentCardDetailsViewModel");
                                throw null;
                            }
                            Map<Long, ? extends ns2.a<? extends ms2.e>> map = iVar2.f179615r;
                            if (!(map != null)) {
                                if (iVar2 == null) {
                                    p005kotlin.jvm.internal.s.m("paymentCardDetailsViewModel");
                                    throw null;
                                }
                                logger.error("Add Card cannot continue: " + (map != null));
                                paymentCardDetailsActivity2.fa();
                                return;
                            }
                            if (iVar2 == null) {
                                p005kotlin.jvm.internal.s.m("paymentCardDetailsViewModel");
                                throw null;
                            }
                            zq2.g gVarY4 = iVar2.y4();
                            if (gVarY4 != null) {
                                vr2.i iVar3 = paymentCardDetailsActivity2.f52180h;
                                if (iVar3 == null) {
                                    p005kotlin.jvm.internal.s.m("paymentCardDetailsViewModel");
                                    throw null;
                                }
                                ps2.n nVar = iVar3.f179609l;
                                if (nVar != null && ((hn2.a) KoinJavaComponent.get$default(hn2.a.class, null, null, 6, null)).i(nVar.f140512o) != null) {
                                    logger.debug("deviceWalletStatus: catalogItem: " + gVarY4);
                                    vr2.i iVar4 = paymentCardDetailsActivity2.f52180h;
                                    if (iVar4 == null) {
                                        p005kotlin.jvm.internal.s.m("paymentCardDetailsViewModel");
                                        throw null;
                                    }
                                    y0<q3.a> y0Var2 = iVar4.f179612o;
                                    if (y0Var2 == null) {
                                        p005kotlin.jvm.internal.s.m("isSpaceAvailable");
                                        throw null;
                                    }
                                    if (y0Var2.d() == null) {
                                        vr2.i iVar5 = paymentCardDetailsActivity2.f52180h;
                                        if (iVar5 == null) {
                                            p005kotlin.jvm.internal.s.m("paymentCardDetailsViewModel");
                                            throw null;
                                        }
                                        w9.a aVarA = v1.a(iVar5);
                                        x53.c cVar = s0.f129406a;
                                        ge1.b.T(aVarA, x53.b.f189152a, null, new vr2.j(iVar5, gVarY4, null), 2);
                                        return;
                                    }
                                    return;
                                }
                            }
                            paymentCardDetailsActivity2.fa();
                            return;
                        }
                        return;
                    case 1:
                        PaymentCardDetailsActivity.a aVar4 = PaymentCardDetailsActivity.f52177p;
                        aVar2.getClass();
                        Logger logger2 = PaymentCardDetailsActivity.f52178q;
                        int i18 = aVar2.f67585a;
                        u62.z.i("deviceOnboardingActivityLauncher: resultCode=", i18, logger2);
                        if (i18 == -1) {
                            paymentCardDetailsActivity.ea();
                            return;
                        }
                        return;
                    default:
                        PaymentCardDetailsActivity.a aVar5 = PaymentCardDetailsActivity.f52177p;
                        aVar2.getClass();
                        Logger logger3 = PaymentCardDetailsActivity.f52178q;
                        int i19 = aVar2.f67585a;
                        u62.z.i("termsAndConditionActivityLauncher: resultCode=", i19, logger3);
                        if (i19 == -1) {
                            vr2.i iVar6 = paymentCardDetailsActivity.f52180h;
                            if (iVar6 == null) {
                                p005kotlin.jvm.internal.s.m("paymentCardDetailsViewModel");
                                throw null;
                            }
                            zn2.z0 z0Var = iVar6.f179606i;
                            zn2.z0 z0Var2 = z0Var != null ? z0Var : null;
                            if (z0Var2 != null) {
                                z0Var2.s();
                            }
                            if (paymentCardDetailsActivity.da()) {
                                paymentCardDetailsActivity.ga();
                                return;
                            } else {
                                paymentCardDetailsActivity.ea();
                                return;
                            }
                        }
                        return;
                }
            }
        });
        final int i16 = 2;
        this.f52187o = registerForActivityResult(new g.h(), new f.b(this) { // from class: tr2.j

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PaymentCardDetailsActivity f166149b;

            {
                this.f166149b = this;
            }

            @Override // f.b
            public final void a(Object obj) {
                int i17 = i16;
                PaymentCardDetailsActivity paymentCardDetailsActivity = this.f166149b;
                f.a aVar2 = (f.a) obj;
                switch (i17) {
                    case 0:
                        PaymentCardDetailsActivity.a aVar3 = PaymentCardDetailsActivity.f52177p;
                        aVar2.getClass();
                        Logger logger = PaymentCardDetailsActivity.f52178q;
                        int i18 = aVar2.f67585a;
                        u62.z.i("deviceSelectionActivityLauncher: resultCode=", i18, logger);
                        PaymentCardDetailsActivity paymentCardDetailsActivity2 = this.f166149b;
                        if (i18 != -1) {
                            if (i18 != 0) {
                                return;
                            }
                            hn2.c.ba(paymentCardDetailsActivity2, Boolean.FALSE, null, null, 14);
                            return;
                        }
                        Intent intent = aVar2.f67586b;
                        if (intent != null) {
                            long longExtra = intent.getLongExtra("device.unit.id", -1L);
                            String stringExtra = intent.getStringExtra("device.name");
                            if (longExtra == -1 || stringExtra == null) {
                                vb.h.z("");
                                return;
                            }
                            logger.debug("checkAvailableSpaceForDevice");
                            vr2.i iVar = paymentCardDetailsActivity2.f52180h;
                            if (iVar == null) {
                                p005kotlin.jvm.internal.s.m("paymentCardDetailsViewModel");
                                throw null;
                            }
                            y0<q3.a> y0Var = iVar.f179612o;
                            if (y0Var == null) {
                                p005kotlin.jvm.internal.s.m("isSpaceAvailable");
                                throw null;
                            }
                            y0Var.f(paymentCardDetailsActivity2, new PaymentCardDetailsActivity.b(new c31.e(paymentCardDetailsActivity2, stringExtra, longExtra, 6)));
                            vr2.i iVar2 = paymentCardDetailsActivity2.f52180h;
                            if (iVar2 == null) {
                                p005kotlin.jvm.internal.s.m("paymentCardDetailsViewModel");
                                throw null;
                            }
                            Map<Long, ? extends ns2.a<? extends ms2.e>> map = iVar2.f179615r;
                            if (!(map != null)) {
                                if (iVar2 == null) {
                                    p005kotlin.jvm.internal.s.m("paymentCardDetailsViewModel");
                                    throw null;
                                }
                                logger.error("Add Card cannot continue: " + (map != null));
                                paymentCardDetailsActivity2.fa();
                                return;
                            }
                            if (iVar2 == null) {
                                p005kotlin.jvm.internal.s.m("paymentCardDetailsViewModel");
                                throw null;
                            }
                            zq2.g gVarY4 = iVar2.y4();
                            if (gVarY4 != null) {
                                vr2.i iVar3 = paymentCardDetailsActivity2.f52180h;
                                if (iVar3 == null) {
                                    p005kotlin.jvm.internal.s.m("paymentCardDetailsViewModel");
                                    throw null;
                                }
                                ps2.n nVar = iVar3.f179609l;
                                if (nVar != null && ((hn2.a) KoinJavaComponent.get$default(hn2.a.class, null, null, 6, null)).i(nVar.f140512o) != null) {
                                    logger.debug("deviceWalletStatus: catalogItem: " + gVarY4);
                                    vr2.i iVar4 = paymentCardDetailsActivity2.f52180h;
                                    if (iVar4 == null) {
                                        p005kotlin.jvm.internal.s.m("paymentCardDetailsViewModel");
                                        throw null;
                                    }
                                    y0<q3.a> y0Var2 = iVar4.f179612o;
                                    if (y0Var2 == null) {
                                        p005kotlin.jvm.internal.s.m("isSpaceAvailable");
                                        throw null;
                                    }
                                    if (y0Var2.d() == null) {
                                        vr2.i iVar5 = paymentCardDetailsActivity2.f52180h;
                                        if (iVar5 == null) {
                                            p005kotlin.jvm.internal.s.m("paymentCardDetailsViewModel");
                                            throw null;
                                        }
                                        w9.a aVarA = v1.a(iVar5);
                                        x53.c cVar = s0.f129406a;
                                        ge1.b.T(aVarA, x53.b.f189152a, null, new vr2.j(iVar5, gVarY4, null), 2);
                                        return;
                                    }
                                    return;
                                }
                            }
                            paymentCardDetailsActivity2.fa();
                            return;
                        }
                        return;
                    case 1:
                        PaymentCardDetailsActivity.a aVar4 = PaymentCardDetailsActivity.f52177p;
                        aVar2.getClass();
                        Logger logger2 = PaymentCardDetailsActivity.f52178q;
                        int i19 = aVar2.f67585a;
                        u62.z.i("deviceOnboardingActivityLauncher: resultCode=", i19, logger2);
                        if (i19 == -1) {
                            paymentCardDetailsActivity.ea();
                            return;
                        }
                        return;
                    default:
                        PaymentCardDetailsActivity.a aVar5 = PaymentCardDetailsActivity.f52177p;
                        aVar2.getClass();
                        Logger logger3 = PaymentCardDetailsActivity.f52178q;
                        int i110 = aVar2.f67585a;
                        u62.z.i("termsAndConditionActivityLauncher: resultCode=", i110, logger3);
                        if (i110 == -1) {
                            vr2.i iVar6 = paymentCardDetailsActivity.f52180h;
                            if (iVar6 == null) {
                                p005kotlin.jvm.internal.s.m("paymentCardDetailsViewModel");
                                throw null;
                            }
                            zn2.z0 z0Var = iVar6.f179606i;
                            zn2.z0 z0Var2 = z0Var != null ? z0Var : null;
                            if (z0Var2 != null) {
                                z0Var2.s();
                            }
                            if (paymentCardDetailsActivity.da()) {
                                paymentCardDetailsActivity.ga();
                                return;
                            } else {
                                paymentCardDetailsActivity.ea();
                                return;
                            }
                        }
                        return;
                }
            }
        });
    }

    public static final void ca(PaymentCardDetailsActivity paymentCardDetailsActivity) {
        g1 g1Var;
        paymentCardDetailsActivity.getClass();
        f52178q.debug("handleAddCardFlow");
        i iVar = paymentCardDetailsActivity.f52180h;
        if (iVar == null) {
            s.m("paymentCardDetailsViewModel");
            throw null;
        }
        zn2.z0 z0Var = iVar.f179606i;
        if (z0Var == null) {
            z0Var = null;
        }
        if (z0Var == null || (g1Var = z0Var.f205979a) == null || !g1Var.W()) {
            i iVar2 = paymentCardDetailsActivity.f52180h;
            if (iVar2 == null) {
                s.m("paymentCardDetailsViewModel");
                throw null;
            }
            if (iVar2.f179602e != null) {
                f.c<Intent> cVar = paymentCardDetailsActivity.f52187o;
                NewFitPayTermsAndConditionActivity.a aVar = NewFitPayTermsAndConditionActivity.f51587j;
                Long lValueOf = Long.valueOf(iVar2.f179600c);
                aVar.getClass();
                cVar.a(NewFitPayTermsAndConditionActivity.a.a(paymentCardDetailsActivity, lValueOf), null);
            } else {
                paymentCardDetailsActivity.fa();
            }
        }
        i iVar3 = paymentCardDetailsActivity.f52180h;
        if (iVar3 == null) {
            s.m("paymentCardDetailsViewModel");
            throw null;
        }
        zn2.z0 z0Var2 = iVar3.f179606i;
        zn2.z0 z0Var3 = z0Var2 != null ? z0Var2 : null;
        if (z0Var3 != null) {
            z0Var3.s();
        }
        if (paymentCardDetailsActivity.da()) {
            paymentCardDetailsActivity.ga();
        } else {
            paymentCardDetailsActivity.ea();
        }
    }

    @Override // yq2.a
    public final void H7() {
        this.f52184l.a();
    }

    public final boolean da() {
        g1 g1Var;
        i iVar = this.f52180h;
        fo2.s sVarE = null;
        if (iVar == null) {
            s.m("paymentCardDetailsViewModel");
            throw null;
        }
        zn2.z0 z0Var = iVar.f179606i;
        if (z0Var == null) {
            z0Var = null;
        }
        if (z0Var != null && (g1Var = z0Var.f205979a) != null) {
            if (iVar == null) {
                s.m("paymentCardDetailsViewModel");
                throw null;
            }
            sVarE = g1Var.E(iVar.f179600c);
        }
        return sVarE == null || sVarE.f73106f != y.INITIALIZED;
    }

    @Override // yq2.a
    public final void e8(String str, String str2, String str3) {
        cj2.c.a.a(cj2.c.f27758a, ((hn2.a) KoinJavaComponent.get$default(hn2.a.class, null, null, 6, null)).c(), str, str2, str3, 16);
    }

    public final void ea() {
        f52178q.debug("launchAddCard");
        FitPayAddCardActivity.a aVar = FitPayAddCardActivity.f51376x;
        i iVar = this.f52180h;
        if (iVar == null) {
            s.m("paymentCardDetailsViewModel");
            throw null;
        }
        Long lValueOf = Long.valueOf(iVar.f179600c);
        q qVar = this.f52181i;
        if (qVar == null) {
            s.m("selectedPaymentCardModel");
            throw null;
        }
        String str = qVar.f179658e.f73426a;
        i iVar2 = this.f52180h;
        if (iVar2 == null) {
            s.m("paymentCardDetailsViewModel");
            throw null;
        }
        zo2.a aVar2 = iVar2.f179613p;
        String creditCardImage = aVar2 != null ? aVar2.getCreditCardImage() : null;
        i iVar3 = this.f52180h;
        if (iVar3 == null) {
            s.m("paymentCardDetailsViewModel");
            throw null;
        }
        zo2.a aVar3 = iVar3.f179613p;
        startActivity(FitPayAddCardActivity.a.c(aVar, lValueOf, str, creditCardImage, aVar3 != null ? aVar3.getCardType() : null, g.VERIFY_CREDIT_CARD, gp2.b.LOAD_CREDIT_CARD_REQUIRED_FIELDS));
    }

    public final void fa() {
        hn2.c.U9(this, this, null, 8);
    }

    public final void ga() {
        i iVar = this.f52180h;
        if (iVar == null) {
            s.m("paymentCardDetailsViewModel");
            throw null;
        }
        wr.g.v("onBoardDevice: Device ", iVar.f179600c, " is not provisioned yet, navigating to NewDeviceOnBoardingActivity", f52178q);
        i iVar2 = this.f52180h;
        if (iVar2 == null) {
            s.m("paymentCardDetailsViewModel");
            throw null;
        }
        if (iVar2.f179602e == null) {
            fa();
            return;
        }
        NewDeviceOnBoardingActivity.a aVar = NewDeviceOnBoardingActivity.f51700k;
        Context contextC = ((hn2.a) KoinJavaComponent.get$default(hn2.a.class, null, null, 6, null)).c();
        sd2.f fVar = this.f52182j;
        if (fVar == null) {
            s.m("deviceRecord");
            throw null;
        }
        long unitID = fVar.getUnitID();
        sd2.f fVar2 = this.f52182j;
        if (fVar2 == null) {
            s.m("deviceRecord");
            throw null;
        }
        String productDisplayName = fVar2.getProductDisplayName();
        if (productDisplayName == null) {
            productDisplayName = "";
        }
        sd2.f fVar3 = this.f52182j;
        if (fVar3 == null) {
            s.m("deviceRecord");
            throw null;
        }
        String imageURL = fVar3.getImageURL();
        String str = imageURL != null ? imageURL : "";
        aVar.getClass();
        this.f52186n.a(NewDeviceOnBoardingActivity.a.a(contextC, unitID, productDisplayName, str), null);
    }

    public final void ha() {
        f52178q.debug("showGenericErrorDialog");
        br2.c.h(br2.c.f19585a, this, null, new h(this, 4), 2);
    }

    public final void ia() {
        f52178q.debug("showSomethingWentWrongDialog");
        br2.c cVar = br2.c.f19585a;
        kj0.c.f104941a.getClass();
        androidx.appcompat.app.e eVarQ = br2.c.q(cVar, this, kj0.c.b(), kj0.c.a(), new p(getString(R.string.lbl_ok), new tr2.i(this, 2)), null, null, false, PsExtractor.VIDEO_STREAM_MASK);
        if (eVarQ != null) {
            eVarQ.show();
        }
    }

    @Override // hn2.c, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        Parcelable parcelable;
        super.onCreate(bundle);
        f52178q.debug("onCreate");
        R9(R.layout.activity_payment_card_details, hn2.c.a.BACK, getString(R.string.wallet_card_details));
        Intent intent = getIntent();
        if (Build.VERSION.SDK_INT >= 33) {
            parcelable = intent != null ? (Parcelable) intent.getParcelableExtra("card.details.item", q.class) : null;
        } else {
            Parcelable parcelableExtra = intent != null ? intent.getParcelableExtra("card.details.item") : null;
            if (!(parcelableExtra instanceof q)) {
                parcelableExtra = null;
            }
            parcelable = (q) parcelableExtra;
        }
        q qVar = (q) parcelable;
        if (qVar == null) {
            vb.h.s("PaymentCardDetailsActivity requires a UserWalletCardItemModel as an extra");
            return;
        }
        this.f52181i = qVar;
        kj0.c.f104941a.getClass();
        AtomicReference<q> atomicReference = kj0.c.f104950j;
        q qVar2 = this.f52181i;
        if (qVar2 == null) {
            s.m("selectedPaymentCardModel");
            throw null;
        }
        atomicReference.set(qVar2);
        i iVar = (i) new x1(this).b(p005kotlin.jvm.internal.s0.f105811a.b(i.class));
        q qVar3 = this.f52181i;
        if (qVar3 == null) {
            s.m("selectedPaymentCardModel");
            throw null;
        }
        ge1.b.T(v1.a(iVar), s0.f129406a, null, new vr2.m(iVar, qVar3, null), 2);
        this.f52180h = iVar;
        iVar.f179598a.f(this, new b(new tn2.t(this, 7)));
    }

    @Override // androidx.fragment.app.m, android.app.Activity
    public final void onPause() {
        super.onPause();
        this.f52179g.e();
    }

    @Override // hn2.c, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, android.app.Activity
    public final void onResume() {
        super.onResume();
        i iVar = this.f52180h;
        if (iVar == null) {
            s.m("paymentCardDetailsViewModel");
            throw null;
        }
        iVar.z4();
        kj0.c.f104941a.getClass();
        AtomicReference<Boolean> atomicReference = kj0.c.f104949i;
        if (atomicReference.get().booleanValue()) {
            atomicReference.set(Boolean.FALSE);
            q0.b bVar = q0.f149800b;
            View viewFindViewById = findViewById(R.id.content_frame);
            viewFindViewById.getClass();
            bVar.getClass();
            q0.b.a(viewFindViewById, R.string.card_verified, 1).show();
        }
    }

    @Override // hn2.c, i.c
    public final boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }

    @Override // yq2.a
    public final void v3(hn2.c cVar) {
        fa();
    }

    @Override // yq2.a
    public final void x(boolean z14) {
        hn2.c.ba(this, Boolean.valueOf(z14), null, null, 12);
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\tR\u0014\u0010\u000b\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\t¨\u0006\f"}, d2 = {"Lcom/garmin/feature/garminpay/ui/userwallet/PaymentCardDetailsActivity$a;", "", "<init>", "()V", "Lorg/slf4j/Logger;", "LOGGER", "Lorg/slf4j/Logger;", "", "EXTRA_CARD_DETAILS_ITEM", "Ljava/lang/String;", "ADDRESS_ID", "CONNECT_IQ_DEEPLINK", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
