package com.garmin.feature.garminpay.providers.gpay.pushprovisioning;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import androidx.lifecycle.i0;
import androidx.lifecycle.v1;
import androidx.lifecycle.x1;
import androidx.lifecycle.y0;
import ap2.h;
import ap2.q;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.feature.garminpay.providers.gpay.pushprovisioning.PushProvMainActivity;
import com.garmin.feature.garminpay.providers.gpay.ui.cardverification.FitPayCardVerificationActivity;
import com.garmin.feature.garminpay.providers.gpay.ui.garminpaytermsconditions.NewFitPayTermsAndConditionActivity;
import com.garmin.feature.garminpay.providers.gpay.ui.onboarding.NewDeviceOnBoardingActivity;
import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import e23.l;
import e23.p;
import ho2.g;
import ho2.m;
import j22.e;
import java.util.concurrent.atomic.AtomicReference;
import o13.r;
import o13.t;
import o53.b0;
import o53.f0;
import o53.s0;
import org.koin.java.KoinJavaComponent;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.n;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.t0;
import ps2.w;
import sd2.f;
import u53.o;
import u62.z;
import v13.i;
import zn2.g1;
import zn2.q3;
import zn2.y;
import zn2.z0;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/feature/garminpay/providers/gpay/pushprovisioning/PushProvMainActivity;", "Lhn2/c;", "<init>", "()V", "a", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class PushProvMainActivity extends hn2.c {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final a f51161t = new a(null);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final Logger f51162v;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public f f51163g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public h f51164h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public m f51165i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public io2.d f51166j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public z0 f51167k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final t f51168l = o13.m.b(new ho2.a(this, 0));

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final e f51169m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final f.c<Intent> f51170n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final f.c<Intent> f51171o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final f.c<Intent> f51172p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final f.c<Intent> f51173q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final f.c<Intent> f51174r;

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f51175a;

        static {
            int[] iArr = new int[gp2.f.values().length];
            try {
                iArr[gp2.f.CARD_CREATED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[gp2.f.DEVICE_REQUIRES_SE_UPDATE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[gp2.f.DUPLICATE_CARD.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[gp2.f.MAX_CARD_LIMIT_REACHED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[gp2.f.CARD_ISSUER_NOT_ELIGIBLE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[gp2.f.CARD_CREATED_BUT_CAN_NOT_PROCEED_FURTHER.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[gp2.f.CREATE_CREDIT_CARD_REQUEST_TIMED_OUT.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[gp2.f.FAILURE_TO_CREATE_CREDIT_CARD.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[gp2.f.CARD_DELETED.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            f51175a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.feature.garminpay.providers.gpay.pushprovisioning.PushProvMainActivity$finishWithCardRefresh$1", f = "PushProvMainActivity.kt", l = {836}, m = "invokeSuspend", v = 2)
    public static final class c extends i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f51176a;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.feature.garminpay.providers.gpay.pushprovisioning.PushProvMainActivity$finishWithCardRefresh$1$1", f = "PushProvMainActivity.kt", l = {837}, m = "invokeSuspend", v = 2)
        public static final class a extends i implements p<b0, t13.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f51178a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PushProvMainActivity f51179b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(PushProvMainActivity pushProvMainActivity, t13.d<? super a> dVar) {
                super(2, dVar);
                this.f51179b = pushProvMainActivity;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new a(this.f51179b, dVar);
            }

            @Override // e23.p
            public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
                return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                int i14 = this.f51178a;
                if (i14 == 0) {
                    r.b(obj);
                    h hVar = this.f51179b.f51164h;
                    if (hVar == null) {
                        s.m("fitPayAddCardViewModel");
                        throw null;
                    }
                    this.f51178a = 1;
                    if (hVar.G4(this) == aVar) {
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

        public c(t13.d<? super c> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return PushProvMainActivity.this.new c(dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f51176a;
            PushProvMainActivity pushProvMainActivity = PushProvMainActivity.this;
            try {
                if (i14 == 0) {
                    r.b(obj);
                    hn2.c.ba(pushProvMainActivity, Boolean.TRUE, null, null, 14);
                    x53.c cVar = s0.f129406a;
                    a aVar2 = new a(pushProvMainActivity, null);
                    this.f51176a = 1;
                    if (ge1.b.e0(cVar, aVar2, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i14 != 1) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    r.b(obj);
                }
            } catch (Exception e4) {
                PushProvMainActivity.f51162v.error("finishWithCancellation:", (Throwable) e4);
            }
            hn2.c.U9(pushProvMainActivity, pushProvMainActivity, null, 10);
            pushProvMainActivity.finish();
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class d implements androidx.lifecycle.z0, n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l f51180a;

        public d(l lVar) {
            lVar.getClass();
            this.f51180a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof androidx.lifecycle.z0) && (obj instanceof n)) {
                return s.g(getFunctionDelegate(), ((n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final o13.h<?> getFunctionDelegate() {
            return this.f51180a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.z0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f51180a.invoke(obj);
        }
    }

    static {
        int i14 = gt2.c.f79010a;
        f51162v = gt2.b.f79005a.h("PAY#NEW_FITPAY#PushProvMainActivity");
    }

    public PushProvMainActivity() {
        e.a aVar = e.f96744g;
        String name = f51162v.getName();
        name.getClass();
        ho2.a aVar2 = new ho2.a(this, 2);
        ho2.a aVar3 = new ho2.a(this, 4);
        aVar.getClass();
        this.f51169m = e.a.a(name, aVar2, aVar3, null);
        final int i14 = 0;
        this.f51170n = registerForActivityResult(new g.h(), new f.b(this) { // from class: ho2.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PushProvMainActivity f84843b;

            {
                this.f84843b = this;
            }

            @Override // f.b
            public final void a(Object obj) {
                com.garmin.feature.garminpay.providers.gpay.pushprovisioning.c.a aVarValueOf;
                String stringExtra;
                int i15 = i14;
                int i16 = 1;
                PushProvMainActivity pushProvMainActivity = this.f84843b;
                switch (i15) {
                    case 0:
                        f.a aVar4 = (f.a) obj;
                        PushProvMainActivity.a aVar5 = PushProvMainActivity.f51161t;
                        aVar4.getClass();
                        Logger logger = PushProvMainActivity.f51162v;
                        int i17 = aVar4.f67585a;
                        z.i("deviceSelectionActivityLauncher: resultCode=", i17, logger);
                        PushProvMainActivity pushProvMainActivity2 = this.f84843b;
                        if (i17 != -1) {
                            if (i17 != 0) {
                                return;
                            }
                            com.garmin.feature.garminpay.providers.gpay.pushprovisioning.c cVar = com.garmin.feature.garminpay.providers.gpay.pushprovisioning.c.f51190a;
                            com.garmin.feature.garminpay.providers.gpay.pushprovisioning.c.a aVar6 = com.garmin.feature.garminpay.providers.gpay.pushprovisioning.c.a.CANCELLED;
                            cVar.getClass();
                            com.garmin.feature.garminpay.providers.gpay.pushprovisioning.c.d(pushProvMainActivity2, aVar6, null);
                            return;
                        }
                        Intent intent = aVar4.f67586b;
                        if (intent != null) {
                            long longExtra = intent.getLongExtra("device.unit.id", -1L);
                            String stringExtra2 = intent.getStringExtra("device.name");
                            StringBuilder sbJ = com.nimbusds.jose.shaded.gson.internal.a.j(longExtra, "Device selected: (", stringExtra2, ", ");
                            sbJ.append(")");
                            logger.debug(sbJ.toString());
                            if (longExtra == -1 || stringExtra2 == null) {
                                vb.h.z("selected device unitId and name must no be null");
                                return;
                            }
                            logger.debug("checkAvailableSpaceForDevice");
                            m mVar = pushProvMainActivity2.f51165i;
                            if (mVar == null) {
                                s.m("pushProvViewModel");
                                throw null;
                            }
                            mVar.f84872c = longExtra;
                            y0<q3.a> y0Var = mVar.f84876g;
                            if (y0Var == null) {
                                s.m("isSpaceAvailable");
                                throw null;
                            }
                            y0Var.f(pushProvMainActivity2, new PushProvMainActivity.d(new c31.e(pushProvMainActivity2, stringExtra2, longExtra, 4)));
                            m mVar2 = pushProvMainActivity2.f51165i;
                            if (mVar2 == null) {
                                s.m("pushProvViewModel");
                                throw null;
                            }
                            w wVar = w.f140538a;
                            long j8 = mVar2.f84872c;
                            wVar.getClass();
                            ps2.n nVarI = w.i(j8);
                            if (nVarI != null) {
                                mVar2.f84873d = nVarI;
                            }
                            m mVar3 = pushProvMainActivity2.f51165i;
                            if (mVar3 == null) {
                                s.m("pushProvViewModel");
                                throw null;
                            }
                            zq2.g gVarY4 = mVar3.y4(pushProvMainActivity2.f51166j);
                            if (gVarY4 != null) {
                                m mVar4 = pushProvMainActivity2.f51165i;
                                if (mVar4 == null) {
                                    s.m("pushProvViewModel");
                                    throw null;
                                }
                                if (mVar4.f84873d != null) {
                                    hn2.a aVar7 = (hn2.a) KoinJavaComponent.get$default(hn2.a.class, null, null, 6, null);
                                    ps2.n nVar = mVar4.f84873d;
                                    if (nVar == null) {
                                        s.m("deviceWallet");
                                        throw null;
                                    }
                                    if (aVar7.i(nVar.f140512o) != null) {
                                        logger.debug("checkAvailableSpaceForDevice: getItemFromPayload: " + gVarY4);
                                        m mVar5 = pushProvMainActivity2.f51165i;
                                        if (mVar5 == null) {
                                            s.m("pushProvViewModel");
                                            throw null;
                                        }
                                        mVar5.f84878i = gVarY4.f206687h;
                                        if (mVar5 == null) {
                                            s.m("pushProvViewModel");
                                            throw null;
                                        }
                                        w9.a aVarA = v1.a(mVar5);
                                        x53.c cVar2 = s0.f129406a;
                                        ge1.b.T(aVarA, x53.b.f189152a, null, new j(gVarY4, mVar5, null), 2);
                                        return;
                                    }
                                }
                            }
                            pushProvMainActivity2.fa();
                            return;
                        }
                        return;
                    case 1:
                        f.a aVar8 = (f.a) obj;
                        PushProvMainActivity.a aVar9 = PushProvMainActivity.f51161t;
                        aVar8.getClass();
                        Logger logger2 = PushProvMainActivity.f51162v;
                        int i18 = aVar8.f67585a;
                        z.i("deviceOnboardingActivityLauncher: resultCode=", i18, logger2);
                        if (i18 == -1) {
                            pushProvMainActivity.ia();
                            return;
                        }
                        if (i18 == 0) {
                            com.garmin.feature.garminpay.providers.gpay.pushprovisioning.c cVar3 = com.garmin.feature.garminpay.providers.gpay.pushprovisioning.c.f51190a;
                            com.garmin.feature.garminpay.providers.gpay.pushprovisioning.c.a aVar10 = com.garmin.feature.garminpay.providers.gpay.pushprovisioning.c.a.CANCELLED;
                            cVar3.getClass();
                            com.garmin.feature.garminpay.providers.gpay.pushprovisioning.c.d(pushProvMainActivity, aVar10, null);
                            return;
                        }
                        if (i18 != 13) {
                            return;
                        }
                        com.garmin.feature.garminpay.providers.gpay.pushprovisioning.c cVar4 = com.garmin.feature.garminpay.providers.gpay.pushprovisioning.c.f51190a;
                        com.garmin.feature.garminpay.providers.gpay.pushprovisioning.c.a aVar11 = com.garmin.feature.garminpay.providers.gpay.pushprovisioning.c.a.ERROR;
                        cVar4.getClass();
                        com.garmin.feature.garminpay.providers.gpay.pushprovisioning.c.d(pushProvMainActivity, aVar11, null);
                        return;
                    case 2:
                        f.a aVar12 = (f.a) obj;
                        PushProvMainActivity.a aVar13 = PushProvMainActivity.f51161t;
                        aVar12.getClass();
                        Logger logger3 = PushProvMainActivity.f51162v;
                        int i19 = aVar12.f67585a;
                        z.i("termsConditionActivityLauncher: resultCode=", i19, logger3);
                        if (i19 != -1) {
                            if (i19 != 0) {
                                return;
                            }
                            com.garmin.feature.garminpay.providers.gpay.pushprovisioning.c cVar5 = com.garmin.feature.garminpay.providers.gpay.pushprovisioning.c.f51190a;
                            com.garmin.feature.garminpay.providers.gpay.pushprovisioning.c.a aVar14 = com.garmin.feature.garminpay.providers.gpay.pushprovisioning.c.a.CANCELLED;
                            cVar5.getClass();
                            com.garmin.feature.garminpay.providers.gpay.pushprovisioning.c.d(pushProvMainActivity, aVar14, null);
                            return;
                        }
                        z0 z0Var = pushProvMainActivity.f51167k;
                        if (z0Var != null) {
                            z0Var.s();
                        }
                        if (pushProvMainActivity.ha()) {
                            pushProvMainActivity.ja();
                            return;
                        } else {
                            pushProvMainActivity.ia();
                            return;
                        }
                    case 3:
                        f.a aVar15 = (f.a) obj;
                        PushProvMainActivity.a aVar16 = PushProvMainActivity.f51161t;
                        aVar15.getClass();
                        Intent intent2 = aVar15.f67586b;
                        Logger logger4 = PushProvMainActivity.f51162v;
                        int i24 = aVar15.f67585a;
                        z.i("issuerBankTermsConditionActivityLauncher: resultCode=", i24, logger4);
                        PushProvMainActivity pushProvMainActivity3 = this.f84843b;
                        if (i24 == -1) {
                            pushProvMainActivity3.ga();
                            return;
                        }
                        if (i24 == 0) {
                            com.garmin.feature.garminpay.providers.gpay.pushprovisioning.c cVar6 = com.garmin.feature.garminpay.providers.gpay.pushprovisioning.c.f51190a;
                            com.garmin.feature.garminpay.providers.gpay.pushprovisioning.c.a aVar17 = com.garmin.feature.garminpay.providers.gpay.pushprovisioning.c.a.CANCELLED;
                            cVar6.getClass();
                            com.garmin.feature.garminpay.providers.gpay.pushprovisioning.c.d(pushProvMainActivity3, aVar17, null);
                            return;
                        }
                        if (i24 == 11) {
                            logger4.debug("showCardWasDeclinedDialog");
                            br2.c cVar7 = br2.c.f19585a;
                            String string = pushProvMainActivity3.getResources().getString(R.string.this_card_was_declined_contact_your_bank);
                            string.getClass();
                            androidx.appcompat.app.e eVarQ = br2.c.q(cVar7, pushProvMainActivity3, "", string, new o13.p(pushProvMainActivity3.getResources().getString(R.string.lbl_ok), new b(pushProvMainActivity3, i16)), null, null, false, PsExtractor.VIDEO_STREAM_MASK);
                            if (eVarQ != null) {
                                eVarQ.show();
                                return;
                            }
                            return;
                        }
                        if (i24 != 14) {
                            if (i24 != 15) {
                                return;
                            }
                            if (intent2 == null || (stringExtra = intent2.getStringExtra("EXTRA_CALLBACK_RETURN")) == null || (aVarValueOf = com.garmin.feature.garminpay.providers.gpay.pushprovisioning.c.a.valueOf(stringExtra)) == null) {
                                aVarValueOf = com.garmin.feature.garminpay.providers.gpay.pushprovisioning.c.a.ERROR;
                            }
                            i0 i0VarW = f0.w(pushProvMainActivity3);
                            x53.c cVar8 = s0.f129406a;
                            ge1.b.T(i0VarW, u53.o.f168762a, null, new com.garmin.feature.garminpay.providers.gpay.pushprovisioning.a(pushProvMainActivity3, false, aVarValueOf, null), 2);
                            return;
                        }
                        logger4.debug("launchCardVerification");
                        hn2.c.ba(pushProvMainActivity3, Boolean.TRUE, null, null, 14);
                        if (intent2 == null) {
                            logger4.error("Intent is null. Cannot continue.");
                            pushProvMainActivity3.ka();
                            return;
                        }
                        long longExtra2 = intent2.getLongExtra("EXTRA_DEVICE_ID", -1L);
                        String stringExtra3 = intent2.getStringExtra("EXTRA_CREDIT_CARD_ID");
                        if (longExtra2 == -1 || stringExtra3 == null) {
                            logger4.error("Data from intent is null. Cannot continue.");
                            pushProvMainActivity3.ka();
                            return;
                        } else {
                            FitPayCardVerificationActivity.b bVar = FitPayCardVerificationActivity.f51449m;
                            Long lValueOf = Long.valueOf(longExtra2);
                            bVar.getClass();
                            pushProvMainActivity3.f51174r.a(FitPayCardVerificationActivity.b.a(lValueOf, stringExtra3, false, null), null);
                            return;
                        }
                    default:
                        f.a aVar18 = (f.a) obj;
                        PushProvMainActivity.a aVar19 = PushProvMainActivity.f51161t;
                        aVar18.getClass();
                        Logger logger5 = PushProvMainActivity.f51162v;
                        int i25 = aVar18.f67585a;
                        z.i("verificationCodeActivityLauncher: resultCode=", i25, logger5);
                        if (i25 == 0) {
                            com.garmin.feature.garminpay.providers.gpay.pushprovisioning.c.f51190a.getClass();
                            com.garmin.feature.garminpay.providers.gpay.pushprovisioning.c.b(pushProvMainActivity, true, null);
                            return;
                        }
                        return;
                }
            }
        });
        final int i15 = 1;
        this.f51171o = registerForActivityResult(new g.h(), new f.b(this) { // from class: ho2.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PushProvMainActivity f84843b;

            {
                this.f84843b = this;
            }

            @Override // f.b
            public final void a(Object obj) {
                com.garmin.feature.garminpay.providers.gpay.pushprovisioning.c.a aVarValueOf;
                String stringExtra;
                int i16 = i15;
                int i17 = 1;
                PushProvMainActivity pushProvMainActivity = this.f84843b;
                switch (i16) {
                    case 0:
                        f.a aVar4 = (f.a) obj;
                        PushProvMainActivity.a aVar5 = PushProvMainActivity.f51161t;
                        aVar4.getClass();
                        Logger logger = PushProvMainActivity.f51162v;
                        int i18 = aVar4.f67585a;
                        z.i("deviceSelectionActivityLauncher: resultCode=", i18, logger);
                        PushProvMainActivity pushProvMainActivity2 = this.f84843b;
                        if (i18 != -1) {
                            if (i18 != 0) {
                                return;
                            }
                            com.garmin.feature.garminpay.providers.gpay.pushprovisioning.c cVar = com.garmin.feature.garminpay.providers.gpay.pushprovisioning.c.f51190a;
                            com.garmin.feature.garminpay.providers.gpay.pushprovisioning.c.a aVar6 = com.garmin.feature.garminpay.providers.gpay.pushprovisioning.c.a.CANCELLED;
                            cVar.getClass();
                            com.garmin.feature.garminpay.providers.gpay.pushprovisioning.c.d(pushProvMainActivity2, aVar6, null);
                            return;
                        }
                        Intent intent = aVar4.f67586b;
                        if (intent != null) {
                            long longExtra = intent.getLongExtra("device.unit.id", -1L);
                            String stringExtra2 = intent.getStringExtra("device.name");
                            StringBuilder sbJ = com.nimbusds.jose.shaded.gson.internal.a.j(longExtra, "Device selected: (", stringExtra2, ", ");
                            sbJ.append(")");
                            logger.debug(sbJ.toString());
                            if (longExtra == -1 || stringExtra2 == null) {
                                vb.h.z("selected device unitId and name must no be null");
                                return;
                            }
                            logger.debug("checkAvailableSpaceForDevice");
                            m mVar = pushProvMainActivity2.f51165i;
                            if (mVar == null) {
                                s.m("pushProvViewModel");
                                throw null;
                            }
                            mVar.f84872c = longExtra;
                            y0<q3.a> y0Var = mVar.f84876g;
                            if (y0Var == null) {
                                s.m("isSpaceAvailable");
                                throw null;
                            }
                            y0Var.f(pushProvMainActivity2, new PushProvMainActivity.d(new c31.e(pushProvMainActivity2, stringExtra2, longExtra, 4)));
                            m mVar2 = pushProvMainActivity2.f51165i;
                            if (mVar2 == null) {
                                s.m("pushProvViewModel");
                                throw null;
                            }
                            w wVar = w.f140538a;
                            long j8 = mVar2.f84872c;
                            wVar.getClass();
                            ps2.n nVarI = w.i(j8);
                            if (nVarI != null) {
                                mVar2.f84873d = nVarI;
                            }
                            m mVar3 = pushProvMainActivity2.f51165i;
                            if (mVar3 == null) {
                                s.m("pushProvViewModel");
                                throw null;
                            }
                            zq2.g gVarY4 = mVar3.y4(pushProvMainActivity2.f51166j);
                            if (gVarY4 != null) {
                                m mVar4 = pushProvMainActivity2.f51165i;
                                if (mVar4 == null) {
                                    s.m("pushProvViewModel");
                                    throw null;
                                }
                                if (mVar4.f84873d != null) {
                                    hn2.a aVar7 = (hn2.a) KoinJavaComponent.get$default(hn2.a.class, null, null, 6, null);
                                    ps2.n nVar = mVar4.f84873d;
                                    if (nVar == null) {
                                        s.m("deviceWallet");
                                        throw null;
                                    }
                                    if (aVar7.i(nVar.f140512o) != null) {
                                        logger.debug("checkAvailableSpaceForDevice: getItemFromPayload: " + gVarY4);
                                        m mVar5 = pushProvMainActivity2.f51165i;
                                        if (mVar5 == null) {
                                            s.m("pushProvViewModel");
                                            throw null;
                                        }
                                        mVar5.f84878i = gVarY4.f206687h;
                                        if (mVar5 == null) {
                                            s.m("pushProvViewModel");
                                            throw null;
                                        }
                                        w9.a aVarA = v1.a(mVar5);
                                        x53.c cVar2 = s0.f129406a;
                                        ge1.b.T(aVarA, x53.b.f189152a, null, new j(gVarY4, mVar5, null), 2);
                                        return;
                                    }
                                }
                            }
                            pushProvMainActivity2.fa();
                            return;
                        }
                        return;
                    case 1:
                        f.a aVar8 = (f.a) obj;
                        PushProvMainActivity.a aVar9 = PushProvMainActivity.f51161t;
                        aVar8.getClass();
                        Logger logger2 = PushProvMainActivity.f51162v;
                        int i19 = aVar8.f67585a;
                        z.i("deviceOnboardingActivityLauncher: resultCode=", i19, logger2);
                        if (i19 == -1) {
                            pushProvMainActivity.ia();
                            return;
                        }
                        if (i19 == 0) {
                            com.garmin.feature.garminpay.providers.gpay.pushprovisioning.c cVar3 = com.garmin.feature.garminpay.providers.gpay.pushprovisioning.c.f51190a;
                            com.garmin.feature.garminpay.providers.gpay.pushprovisioning.c.a aVar10 = com.garmin.feature.garminpay.providers.gpay.pushprovisioning.c.a.CANCELLED;
                            cVar3.getClass();
                            com.garmin.feature.garminpay.providers.gpay.pushprovisioning.c.d(pushProvMainActivity, aVar10, null);
                            return;
                        }
                        if (i19 != 13) {
                            return;
                        }
                        com.garmin.feature.garminpay.providers.gpay.pushprovisioning.c cVar4 = com.garmin.feature.garminpay.providers.gpay.pushprovisioning.c.f51190a;
                        com.garmin.feature.garminpay.providers.gpay.pushprovisioning.c.a aVar11 = com.garmin.feature.garminpay.providers.gpay.pushprovisioning.c.a.ERROR;
                        cVar4.getClass();
                        com.garmin.feature.garminpay.providers.gpay.pushprovisioning.c.d(pushProvMainActivity, aVar11, null);
                        return;
                    case 2:
                        f.a aVar12 = (f.a) obj;
                        PushProvMainActivity.a aVar13 = PushProvMainActivity.f51161t;
                        aVar12.getClass();
                        Logger logger3 = PushProvMainActivity.f51162v;
                        int i110 = aVar12.f67585a;
                        z.i("termsConditionActivityLauncher: resultCode=", i110, logger3);
                        if (i110 != -1) {
                            if (i110 != 0) {
                                return;
                            }
                            com.garmin.feature.garminpay.providers.gpay.pushprovisioning.c cVar5 = com.garmin.feature.garminpay.providers.gpay.pushprovisioning.c.f51190a;
                            com.garmin.feature.garminpay.providers.gpay.pushprovisioning.c.a aVar14 = com.garmin.feature.garminpay.providers.gpay.pushprovisioning.c.a.CANCELLED;
                            cVar5.getClass();
                            com.garmin.feature.garminpay.providers.gpay.pushprovisioning.c.d(pushProvMainActivity, aVar14, null);
                            return;
                        }
                        z0 z0Var = pushProvMainActivity.f51167k;
                        if (z0Var != null) {
                            z0Var.s();
                        }
                        if (pushProvMainActivity.ha()) {
                            pushProvMainActivity.ja();
                            return;
                        } else {
                            pushProvMainActivity.ia();
                            return;
                        }
                    case 3:
                        f.a aVar15 = (f.a) obj;
                        PushProvMainActivity.a aVar16 = PushProvMainActivity.f51161t;
                        aVar15.getClass();
                        Intent intent2 = aVar15.f67586b;
                        Logger logger4 = PushProvMainActivity.f51162v;
                        int i24 = aVar15.f67585a;
                        z.i("issuerBankTermsConditionActivityLauncher: resultCode=", i24, logger4);
                        PushProvMainActivity pushProvMainActivity3 = this.f84843b;
                        if (i24 == -1) {
                            pushProvMainActivity3.ga();
                            return;
                        }
                        if (i24 == 0) {
                            com.garmin.feature.garminpay.providers.gpay.pushprovisioning.c cVar6 = com.garmin.feature.garminpay.providers.gpay.pushprovisioning.c.f51190a;
                            com.garmin.feature.garminpay.providers.gpay.pushprovisioning.c.a aVar17 = com.garmin.feature.garminpay.providers.gpay.pushprovisioning.c.a.CANCELLED;
                            cVar6.getClass();
                            com.garmin.feature.garminpay.providers.gpay.pushprovisioning.c.d(pushProvMainActivity3, aVar17, null);
                            return;
                        }
                        if (i24 == 11) {
                            logger4.debug("showCardWasDeclinedDialog");
                            br2.c cVar7 = br2.c.f19585a;
                            String string = pushProvMainActivity3.getResources().getString(R.string.this_card_was_declined_contact_your_bank);
                            string.getClass();
                            androidx.appcompat.app.e eVarQ = br2.c.q(cVar7, pushProvMainActivity3, "", string, new o13.p(pushProvMainActivity3.getResources().getString(R.string.lbl_ok), new b(pushProvMainActivity3, i17)), null, null, false, PsExtractor.VIDEO_STREAM_MASK);
                            if (eVarQ != null) {
                                eVarQ.show();
                                return;
                            }
                            return;
                        }
                        if (i24 != 14) {
                            if (i24 != 15) {
                                return;
                            }
                            if (intent2 == null || (stringExtra = intent2.getStringExtra("EXTRA_CALLBACK_RETURN")) == null || (aVarValueOf = com.garmin.feature.garminpay.providers.gpay.pushprovisioning.c.a.valueOf(stringExtra)) == null) {
                                aVarValueOf = com.garmin.feature.garminpay.providers.gpay.pushprovisioning.c.a.ERROR;
                            }
                            i0 i0VarW = f0.w(pushProvMainActivity3);
                            x53.c cVar8 = s0.f129406a;
                            ge1.b.T(i0VarW, u53.o.f168762a, null, new com.garmin.feature.garminpay.providers.gpay.pushprovisioning.a(pushProvMainActivity3, false, aVarValueOf, null), 2);
                            return;
                        }
                        logger4.debug("launchCardVerification");
                        hn2.c.ba(pushProvMainActivity3, Boolean.TRUE, null, null, 14);
                        if (intent2 == null) {
                            logger4.error("Intent is null. Cannot continue.");
                            pushProvMainActivity3.ka();
                            return;
                        }
                        long longExtra2 = intent2.getLongExtra("EXTRA_DEVICE_ID", -1L);
                        String stringExtra3 = intent2.getStringExtra("EXTRA_CREDIT_CARD_ID");
                        if (longExtra2 == -1 || stringExtra3 == null) {
                            logger4.error("Data from intent is null. Cannot continue.");
                            pushProvMainActivity3.ka();
                            return;
                        } else {
                            FitPayCardVerificationActivity.b bVar = FitPayCardVerificationActivity.f51449m;
                            Long lValueOf = Long.valueOf(longExtra2);
                            bVar.getClass();
                            pushProvMainActivity3.f51174r.a(FitPayCardVerificationActivity.b.a(lValueOf, stringExtra3, false, null), null);
                            return;
                        }
                    default:
                        f.a aVar18 = (f.a) obj;
                        PushProvMainActivity.a aVar19 = PushProvMainActivity.f51161t;
                        aVar18.getClass();
                        Logger logger5 = PushProvMainActivity.f51162v;
                        int i25 = aVar18.f67585a;
                        z.i("verificationCodeActivityLauncher: resultCode=", i25, logger5);
                        if (i25 == 0) {
                            com.garmin.feature.garminpay.providers.gpay.pushprovisioning.c.f51190a.getClass();
                            com.garmin.feature.garminpay.providers.gpay.pushprovisioning.c.b(pushProvMainActivity, true, null);
                            return;
                        }
                        return;
                }
            }
        });
        final int i16 = 2;
        this.f51172p = registerForActivityResult(new g.h(), new f.b(this) { // from class: ho2.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PushProvMainActivity f84843b;

            {
                this.f84843b = this;
            }

            @Override // f.b
            public final void a(Object obj) {
                com.garmin.feature.garminpay.providers.gpay.pushprovisioning.c.a aVarValueOf;
                String stringExtra;
                int i17 = i16;
                int i18 = 1;
                PushProvMainActivity pushProvMainActivity = this.f84843b;
                switch (i17) {
                    case 0:
                        f.a aVar4 = (f.a) obj;
                        PushProvMainActivity.a aVar5 = PushProvMainActivity.f51161t;
                        aVar4.getClass();
                        Logger logger = PushProvMainActivity.f51162v;
                        int i19 = aVar4.f67585a;
                        z.i("deviceSelectionActivityLauncher: resultCode=", i19, logger);
                        PushProvMainActivity pushProvMainActivity2 = this.f84843b;
                        if (i19 != -1) {
                            if (i19 != 0) {
                                return;
                            }
                            com.garmin.feature.garminpay.providers.gpay.pushprovisioning.c cVar = com.garmin.feature.garminpay.providers.gpay.pushprovisioning.c.f51190a;
                            com.garmin.feature.garminpay.providers.gpay.pushprovisioning.c.a aVar6 = com.garmin.feature.garminpay.providers.gpay.pushprovisioning.c.a.CANCELLED;
                            cVar.getClass();
                            com.garmin.feature.garminpay.providers.gpay.pushprovisioning.c.d(pushProvMainActivity2, aVar6, null);
                            return;
                        }
                        Intent intent = aVar4.f67586b;
                        if (intent != null) {
                            long longExtra = intent.getLongExtra("device.unit.id", -1L);
                            String stringExtra2 = intent.getStringExtra("device.name");
                            StringBuilder sbJ = com.nimbusds.jose.shaded.gson.internal.a.j(longExtra, "Device selected: (", stringExtra2, ", ");
                            sbJ.append(")");
                            logger.debug(sbJ.toString());
                            if (longExtra == -1 || stringExtra2 == null) {
                                vb.h.z("selected device unitId and name must no be null");
                                return;
                            }
                            logger.debug("checkAvailableSpaceForDevice");
                            m mVar = pushProvMainActivity2.f51165i;
                            if (mVar == null) {
                                s.m("pushProvViewModel");
                                throw null;
                            }
                            mVar.f84872c = longExtra;
                            y0<q3.a> y0Var = mVar.f84876g;
                            if (y0Var == null) {
                                s.m("isSpaceAvailable");
                                throw null;
                            }
                            y0Var.f(pushProvMainActivity2, new PushProvMainActivity.d(new c31.e(pushProvMainActivity2, stringExtra2, longExtra, 4)));
                            m mVar2 = pushProvMainActivity2.f51165i;
                            if (mVar2 == null) {
                                s.m("pushProvViewModel");
                                throw null;
                            }
                            w wVar = w.f140538a;
                            long j8 = mVar2.f84872c;
                            wVar.getClass();
                            ps2.n nVarI = w.i(j8);
                            if (nVarI != null) {
                                mVar2.f84873d = nVarI;
                            }
                            m mVar3 = pushProvMainActivity2.f51165i;
                            if (mVar3 == null) {
                                s.m("pushProvViewModel");
                                throw null;
                            }
                            zq2.g gVarY4 = mVar3.y4(pushProvMainActivity2.f51166j);
                            if (gVarY4 != null) {
                                m mVar4 = pushProvMainActivity2.f51165i;
                                if (mVar4 == null) {
                                    s.m("pushProvViewModel");
                                    throw null;
                                }
                                if (mVar4.f84873d != null) {
                                    hn2.a aVar7 = (hn2.a) KoinJavaComponent.get$default(hn2.a.class, null, null, 6, null);
                                    ps2.n nVar = mVar4.f84873d;
                                    if (nVar == null) {
                                        s.m("deviceWallet");
                                        throw null;
                                    }
                                    if (aVar7.i(nVar.f140512o) != null) {
                                        logger.debug("checkAvailableSpaceForDevice: getItemFromPayload: " + gVarY4);
                                        m mVar5 = pushProvMainActivity2.f51165i;
                                        if (mVar5 == null) {
                                            s.m("pushProvViewModel");
                                            throw null;
                                        }
                                        mVar5.f84878i = gVarY4.f206687h;
                                        if (mVar5 == null) {
                                            s.m("pushProvViewModel");
                                            throw null;
                                        }
                                        w9.a aVarA = v1.a(mVar5);
                                        x53.c cVar2 = s0.f129406a;
                                        ge1.b.T(aVarA, x53.b.f189152a, null, new j(gVarY4, mVar5, null), 2);
                                        return;
                                    }
                                }
                            }
                            pushProvMainActivity2.fa();
                            return;
                        }
                        return;
                    case 1:
                        f.a aVar8 = (f.a) obj;
                        PushProvMainActivity.a aVar9 = PushProvMainActivity.f51161t;
                        aVar8.getClass();
                        Logger logger2 = PushProvMainActivity.f51162v;
                        int i110 = aVar8.f67585a;
                        z.i("deviceOnboardingActivityLauncher: resultCode=", i110, logger2);
                        if (i110 == -1) {
                            pushProvMainActivity.ia();
                            return;
                        }
                        if (i110 == 0) {
                            com.garmin.feature.garminpay.providers.gpay.pushprovisioning.c cVar3 = com.garmin.feature.garminpay.providers.gpay.pushprovisioning.c.f51190a;
                            com.garmin.feature.garminpay.providers.gpay.pushprovisioning.c.a aVar10 = com.garmin.feature.garminpay.providers.gpay.pushprovisioning.c.a.CANCELLED;
                            cVar3.getClass();
                            com.garmin.feature.garminpay.providers.gpay.pushprovisioning.c.d(pushProvMainActivity, aVar10, null);
                            return;
                        }
                        if (i110 != 13) {
                            return;
                        }
                        com.garmin.feature.garminpay.providers.gpay.pushprovisioning.c cVar4 = com.garmin.feature.garminpay.providers.gpay.pushprovisioning.c.f51190a;
                        com.garmin.feature.garminpay.providers.gpay.pushprovisioning.c.a aVar11 = com.garmin.feature.garminpay.providers.gpay.pushprovisioning.c.a.ERROR;
                        cVar4.getClass();
                        com.garmin.feature.garminpay.providers.gpay.pushprovisioning.c.d(pushProvMainActivity, aVar11, null);
                        return;
                    case 2:
                        f.a aVar12 = (f.a) obj;
                        PushProvMainActivity.a aVar13 = PushProvMainActivity.f51161t;
                        aVar12.getClass();
                        Logger logger3 = PushProvMainActivity.f51162v;
                        int i111 = aVar12.f67585a;
                        z.i("termsConditionActivityLauncher: resultCode=", i111, logger3);
                        if (i111 != -1) {
                            if (i111 != 0) {
                                return;
                            }
                            com.garmin.feature.garminpay.providers.gpay.pushprovisioning.c cVar5 = com.garmin.feature.garminpay.providers.gpay.pushprovisioning.c.f51190a;
                            com.garmin.feature.garminpay.providers.gpay.pushprovisioning.c.a aVar14 = com.garmin.feature.garminpay.providers.gpay.pushprovisioning.c.a.CANCELLED;
                            cVar5.getClass();
                            com.garmin.feature.garminpay.providers.gpay.pushprovisioning.c.d(pushProvMainActivity, aVar14, null);
                            return;
                        }
                        z0 z0Var = pushProvMainActivity.f51167k;
                        if (z0Var != null) {
                            z0Var.s();
                        }
                        if (pushProvMainActivity.ha()) {
                            pushProvMainActivity.ja();
                            return;
                        } else {
                            pushProvMainActivity.ia();
                            return;
                        }
                    case 3:
                        f.a aVar15 = (f.a) obj;
                        PushProvMainActivity.a aVar16 = PushProvMainActivity.f51161t;
                        aVar15.getClass();
                        Intent intent2 = aVar15.f67586b;
                        Logger logger4 = PushProvMainActivity.f51162v;
                        int i24 = aVar15.f67585a;
                        z.i("issuerBankTermsConditionActivityLauncher: resultCode=", i24, logger4);
                        PushProvMainActivity pushProvMainActivity3 = this.f84843b;
                        if (i24 == -1) {
                            pushProvMainActivity3.ga();
                            return;
                        }
                        if (i24 == 0) {
                            com.garmin.feature.garminpay.providers.gpay.pushprovisioning.c cVar6 = com.garmin.feature.garminpay.providers.gpay.pushprovisioning.c.f51190a;
                            com.garmin.feature.garminpay.providers.gpay.pushprovisioning.c.a aVar17 = com.garmin.feature.garminpay.providers.gpay.pushprovisioning.c.a.CANCELLED;
                            cVar6.getClass();
                            com.garmin.feature.garminpay.providers.gpay.pushprovisioning.c.d(pushProvMainActivity3, aVar17, null);
                            return;
                        }
                        if (i24 == 11) {
                            logger4.debug("showCardWasDeclinedDialog");
                            br2.c cVar7 = br2.c.f19585a;
                            String string = pushProvMainActivity3.getResources().getString(R.string.this_card_was_declined_contact_your_bank);
                            string.getClass();
                            androidx.appcompat.app.e eVarQ = br2.c.q(cVar7, pushProvMainActivity3, "", string, new o13.p(pushProvMainActivity3.getResources().getString(R.string.lbl_ok), new b(pushProvMainActivity3, i18)), null, null, false, PsExtractor.VIDEO_STREAM_MASK);
                            if (eVarQ != null) {
                                eVarQ.show();
                                return;
                            }
                            return;
                        }
                        if (i24 != 14) {
                            if (i24 != 15) {
                                return;
                            }
                            if (intent2 == null || (stringExtra = intent2.getStringExtra("EXTRA_CALLBACK_RETURN")) == null || (aVarValueOf = com.garmin.feature.garminpay.providers.gpay.pushprovisioning.c.a.valueOf(stringExtra)) == null) {
                                aVarValueOf = com.garmin.feature.garminpay.providers.gpay.pushprovisioning.c.a.ERROR;
                            }
                            i0 i0VarW = f0.w(pushProvMainActivity3);
                            x53.c cVar8 = s0.f129406a;
                            ge1.b.T(i0VarW, u53.o.f168762a, null, new com.garmin.feature.garminpay.providers.gpay.pushprovisioning.a(pushProvMainActivity3, false, aVarValueOf, null), 2);
                            return;
                        }
                        logger4.debug("launchCardVerification");
                        hn2.c.ba(pushProvMainActivity3, Boolean.TRUE, null, null, 14);
                        if (intent2 == null) {
                            logger4.error("Intent is null. Cannot continue.");
                            pushProvMainActivity3.ka();
                            return;
                        }
                        long longExtra2 = intent2.getLongExtra("EXTRA_DEVICE_ID", -1L);
                        String stringExtra3 = intent2.getStringExtra("EXTRA_CREDIT_CARD_ID");
                        if (longExtra2 == -1 || stringExtra3 == null) {
                            logger4.error("Data from intent is null. Cannot continue.");
                            pushProvMainActivity3.ka();
                            return;
                        } else {
                            FitPayCardVerificationActivity.b bVar = FitPayCardVerificationActivity.f51449m;
                            Long lValueOf = Long.valueOf(longExtra2);
                            bVar.getClass();
                            pushProvMainActivity3.f51174r.a(FitPayCardVerificationActivity.b.a(lValueOf, stringExtra3, false, null), null);
                            return;
                        }
                    default:
                        f.a aVar18 = (f.a) obj;
                        PushProvMainActivity.a aVar19 = PushProvMainActivity.f51161t;
                        aVar18.getClass();
                        Logger logger5 = PushProvMainActivity.f51162v;
                        int i25 = aVar18.f67585a;
                        z.i("verificationCodeActivityLauncher: resultCode=", i25, logger5);
                        if (i25 == 0) {
                            com.garmin.feature.garminpay.providers.gpay.pushprovisioning.c.f51190a.getClass();
                            com.garmin.feature.garminpay.providers.gpay.pushprovisioning.c.b(pushProvMainActivity, true, null);
                            return;
                        }
                        return;
                }
            }
        });
        final int i17 = 3;
        this.f51173q = registerForActivityResult(new g.h(), new f.b(this) { // from class: ho2.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PushProvMainActivity f84843b;

            {
                this.f84843b = this;
            }

            @Override // f.b
            public final void a(Object obj) {
                com.garmin.feature.garminpay.providers.gpay.pushprovisioning.c.a aVarValueOf;
                String stringExtra;
                int i18 = i17;
                int i19 = 1;
                PushProvMainActivity pushProvMainActivity = this.f84843b;
                switch (i18) {
                    case 0:
                        f.a aVar4 = (f.a) obj;
                        PushProvMainActivity.a aVar5 = PushProvMainActivity.f51161t;
                        aVar4.getClass();
                        Logger logger = PushProvMainActivity.f51162v;
                        int i110 = aVar4.f67585a;
                        z.i("deviceSelectionActivityLauncher: resultCode=", i110, logger);
                        PushProvMainActivity pushProvMainActivity2 = this.f84843b;
                        if (i110 != -1) {
                            if (i110 != 0) {
                                return;
                            }
                            com.garmin.feature.garminpay.providers.gpay.pushprovisioning.c cVar = com.garmin.feature.garminpay.providers.gpay.pushprovisioning.c.f51190a;
                            com.garmin.feature.garminpay.providers.gpay.pushprovisioning.c.a aVar6 = com.garmin.feature.garminpay.providers.gpay.pushprovisioning.c.a.CANCELLED;
                            cVar.getClass();
                            com.garmin.feature.garminpay.providers.gpay.pushprovisioning.c.d(pushProvMainActivity2, aVar6, null);
                            return;
                        }
                        Intent intent = aVar4.f67586b;
                        if (intent != null) {
                            long longExtra = intent.getLongExtra("device.unit.id", -1L);
                            String stringExtra2 = intent.getStringExtra("device.name");
                            StringBuilder sbJ = com.nimbusds.jose.shaded.gson.internal.a.j(longExtra, "Device selected: (", stringExtra2, ", ");
                            sbJ.append(")");
                            logger.debug(sbJ.toString());
                            if (longExtra == -1 || stringExtra2 == null) {
                                vb.h.z("selected device unitId and name must no be null");
                                return;
                            }
                            logger.debug("checkAvailableSpaceForDevice");
                            m mVar = pushProvMainActivity2.f51165i;
                            if (mVar == null) {
                                s.m("pushProvViewModel");
                                throw null;
                            }
                            mVar.f84872c = longExtra;
                            y0<q3.a> y0Var = mVar.f84876g;
                            if (y0Var == null) {
                                s.m("isSpaceAvailable");
                                throw null;
                            }
                            y0Var.f(pushProvMainActivity2, new PushProvMainActivity.d(new c31.e(pushProvMainActivity2, stringExtra2, longExtra, 4)));
                            m mVar2 = pushProvMainActivity2.f51165i;
                            if (mVar2 == null) {
                                s.m("pushProvViewModel");
                                throw null;
                            }
                            w wVar = w.f140538a;
                            long j8 = mVar2.f84872c;
                            wVar.getClass();
                            ps2.n nVarI = w.i(j8);
                            if (nVarI != null) {
                                mVar2.f84873d = nVarI;
                            }
                            m mVar3 = pushProvMainActivity2.f51165i;
                            if (mVar3 == null) {
                                s.m("pushProvViewModel");
                                throw null;
                            }
                            zq2.g gVarY4 = mVar3.y4(pushProvMainActivity2.f51166j);
                            if (gVarY4 != null) {
                                m mVar4 = pushProvMainActivity2.f51165i;
                                if (mVar4 == null) {
                                    s.m("pushProvViewModel");
                                    throw null;
                                }
                                if (mVar4.f84873d != null) {
                                    hn2.a aVar7 = (hn2.a) KoinJavaComponent.get$default(hn2.a.class, null, null, 6, null);
                                    ps2.n nVar = mVar4.f84873d;
                                    if (nVar == null) {
                                        s.m("deviceWallet");
                                        throw null;
                                    }
                                    if (aVar7.i(nVar.f140512o) != null) {
                                        logger.debug("checkAvailableSpaceForDevice: getItemFromPayload: " + gVarY4);
                                        m mVar5 = pushProvMainActivity2.f51165i;
                                        if (mVar5 == null) {
                                            s.m("pushProvViewModel");
                                            throw null;
                                        }
                                        mVar5.f84878i = gVarY4.f206687h;
                                        if (mVar5 == null) {
                                            s.m("pushProvViewModel");
                                            throw null;
                                        }
                                        w9.a aVarA = v1.a(mVar5);
                                        x53.c cVar2 = s0.f129406a;
                                        ge1.b.T(aVarA, x53.b.f189152a, null, new j(gVarY4, mVar5, null), 2);
                                        return;
                                    }
                                }
                            }
                            pushProvMainActivity2.fa();
                            return;
                        }
                        return;
                    case 1:
                        f.a aVar8 = (f.a) obj;
                        PushProvMainActivity.a aVar9 = PushProvMainActivity.f51161t;
                        aVar8.getClass();
                        Logger logger2 = PushProvMainActivity.f51162v;
                        int i111 = aVar8.f67585a;
                        z.i("deviceOnboardingActivityLauncher: resultCode=", i111, logger2);
                        if (i111 == -1) {
                            pushProvMainActivity.ia();
                            return;
                        }
                        if (i111 == 0) {
                            com.garmin.feature.garminpay.providers.gpay.pushprovisioning.c cVar3 = com.garmin.feature.garminpay.providers.gpay.pushprovisioning.c.f51190a;
                            com.garmin.feature.garminpay.providers.gpay.pushprovisioning.c.a aVar10 = com.garmin.feature.garminpay.providers.gpay.pushprovisioning.c.a.CANCELLED;
                            cVar3.getClass();
                            com.garmin.feature.garminpay.providers.gpay.pushprovisioning.c.d(pushProvMainActivity, aVar10, null);
                            return;
                        }
                        if (i111 != 13) {
                            return;
                        }
                        com.garmin.feature.garminpay.providers.gpay.pushprovisioning.c cVar4 = com.garmin.feature.garminpay.providers.gpay.pushprovisioning.c.f51190a;
                        com.garmin.feature.garminpay.providers.gpay.pushprovisioning.c.a aVar11 = com.garmin.feature.garminpay.providers.gpay.pushprovisioning.c.a.ERROR;
                        cVar4.getClass();
                        com.garmin.feature.garminpay.providers.gpay.pushprovisioning.c.d(pushProvMainActivity, aVar11, null);
                        return;
                    case 2:
                        f.a aVar12 = (f.a) obj;
                        PushProvMainActivity.a aVar13 = PushProvMainActivity.f51161t;
                        aVar12.getClass();
                        Logger logger3 = PushProvMainActivity.f51162v;
                        int i112 = aVar12.f67585a;
                        z.i("termsConditionActivityLauncher: resultCode=", i112, logger3);
                        if (i112 != -1) {
                            if (i112 != 0) {
                                return;
                            }
                            com.garmin.feature.garminpay.providers.gpay.pushprovisioning.c cVar5 = com.garmin.feature.garminpay.providers.gpay.pushprovisioning.c.f51190a;
                            com.garmin.feature.garminpay.providers.gpay.pushprovisioning.c.a aVar14 = com.garmin.feature.garminpay.providers.gpay.pushprovisioning.c.a.CANCELLED;
                            cVar5.getClass();
                            com.garmin.feature.garminpay.providers.gpay.pushprovisioning.c.d(pushProvMainActivity, aVar14, null);
                            return;
                        }
                        z0 z0Var = pushProvMainActivity.f51167k;
                        if (z0Var != null) {
                            z0Var.s();
                        }
                        if (pushProvMainActivity.ha()) {
                            pushProvMainActivity.ja();
                            return;
                        } else {
                            pushProvMainActivity.ia();
                            return;
                        }
                    case 3:
                        f.a aVar15 = (f.a) obj;
                        PushProvMainActivity.a aVar16 = PushProvMainActivity.f51161t;
                        aVar15.getClass();
                        Intent intent2 = aVar15.f67586b;
                        Logger logger4 = PushProvMainActivity.f51162v;
                        int i24 = aVar15.f67585a;
                        z.i("issuerBankTermsConditionActivityLauncher: resultCode=", i24, logger4);
                        PushProvMainActivity pushProvMainActivity3 = this.f84843b;
                        if (i24 == -1) {
                            pushProvMainActivity3.ga();
                            return;
                        }
                        if (i24 == 0) {
                            com.garmin.feature.garminpay.providers.gpay.pushprovisioning.c cVar6 = com.garmin.feature.garminpay.providers.gpay.pushprovisioning.c.f51190a;
                            com.garmin.feature.garminpay.providers.gpay.pushprovisioning.c.a aVar17 = com.garmin.feature.garminpay.providers.gpay.pushprovisioning.c.a.CANCELLED;
                            cVar6.getClass();
                            com.garmin.feature.garminpay.providers.gpay.pushprovisioning.c.d(pushProvMainActivity3, aVar17, null);
                            return;
                        }
                        if (i24 == 11) {
                            logger4.debug("showCardWasDeclinedDialog");
                            br2.c cVar7 = br2.c.f19585a;
                            String string = pushProvMainActivity3.getResources().getString(R.string.this_card_was_declined_contact_your_bank);
                            string.getClass();
                            androidx.appcompat.app.e eVarQ = br2.c.q(cVar7, pushProvMainActivity3, "", string, new o13.p(pushProvMainActivity3.getResources().getString(R.string.lbl_ok), new b(pushProvMainActivity3, i19)), null, null, false, PsExtractor.VIDEO_STREAM_MASK);
                            if (eVarQ != null) {
                                eVarQ.show();
                                return;
                            }
                            return;
                        }
                        if (i24 != 14) {
                            if (i24 != 15) {
                                return;
                            }
                            if (intent2 == null || (stringExtra = intent2.getStringExtra("EXTRA_CALLBACK_RETURN")) == null || (aVarValueOf = com.garmin.feature.garminpay.providers.gpay.pushprovisioning.c.a.valueOf(stringExtra)) == null) {
                                aVarValueOf = com.garmin.feature.garminpay.providers.gpay.pushprovisioning.c.a.ERROR;
                            }
                            i0 i0VarW = f0.w(pushProvMainActivity3);
                            x53.c cVar8 = s0.f129406a;
                            ge1.b.T(i0VarW, u53.o.f168762a, null, new com.garmin.feature.garminpay.providers.gpay.pushprovisioning.a(pushProvMainActivity3, false, aVarValueOf, null), 2);
                            return;
                        }
                        logger4.debug("launchCardVerification");
                        hn2.c.ba(pushProvMainActivity3, Boolean.TRUE, null, null, 14);
                        if (intent2 == null) {
                            logger4.error("Intent is null. Cannot continue.");
                            pushProvMainActivity3.ka();
                            return;
                        }
                        long longExtra2 = intent2.getLongExtra("EXTRA_DEVICE_ID", -1L);
                        String stringExtra3 = intent2.getStringExtra("EXTRA_CREDIT_CARD_ID");
                        if (longExtra2 == -1 || stringExtra3 == null) {
                            logger4.error("Data from intent is null. Cannot continue.");
                            pushProvMainActivity3.ka();
                            return;
                        } else {
                            FitPayCardVerificationActivity.b bVar = FitPayCardVerificationActivity.f51449m;
                            Long lValueOf = Long.valueOf(longExtra2);
                            bVar.getClass();
                            pushProvMainActivity3.f51174r.a(FitPayCardVerificationActivity.b.a(lValueOf, stringExtra3, false, null), null);
                            return;
                        }
                    default:
                        f.a aVar18 = (f.a) obj;
                        PushProvMainActivity.a aVar19 = PushProvMainActivity.f51161t;
                        aVar18.getClass();
                        Logger logger5 = PushProvMainActivity.f51162v;
                        int i25 = aVar18.f67585a;
                        z.i("verificationCodeActivityLauncher: resultCode=", i25, logger5);
                        if (i25 == 0) {
                            com.garmin.feature.garminpay.providers.gpay.pushprovisioning.c.f51190a.getClass();
                            com.garmin.feature.garminpay.providers.gpay.pushprovisioning.c.b(pushProvMainActivity, true, null);
                            return;
                        }
                        return;
                }
            }
        });
        final int i18 = 4;
        this.f51174r = registerForActivityResult(new g.h(), new f.b(this) { // from class: ho2.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PushProvMainActivity f84843b;

            {
                this.f84843b = this;
            }

            @Override // f.b
            public final void a(Object obj) {
                com.garmin.feature.garminpay.providers.gpay.pushprovisioning.c.a aVarValueOf;
                String stringExtra;
                int i19 = i18;
                int i110 = 1;
                PushProvMainActivity pushProvMainActivity = this.f84843b;
                switch (i19) {
                    case 0:
                        f.a aVar4 = (f.a) obj;
                        PushProvMainActivity.a aVar5 = PushProvMainActivity.f51161t;
                        aVar4.getClass();
                        Logger logger = PushProvMainActivity.f51162v;
                        int i111 = aVar4.f67585a;
                        z.i("deviceSelectionActivityLauncher: resultCode=", i111, logger);
                        PushProvMainActivity pushProvMainActivity2 = this.f84843b;
                        if (i111 != -1) {
                            if (i111 != 0) {
                                return;
                            }
                            com.garmin.feature.garminpay.providers.gpay.pushprovisioning.c cVar = com.garmin.feature.garminpay.providers.gpay.pushprovisioning.c.f51190a;
                            com.garmin.feature.garminpay.providers.gpay.pushprovisioning.c.a aVar6 = com.garmin.feature.garminpay.providers.gpay.pushprovisioning.c.a.CANCELLED;
                            cVar.getClass();
                            com.garmin.feature.garminpay.providers.gpay.pushprovisioning.c.d(pushProvMainActivity2, aVar6, null);
                            return;
                        }
                        Intent intent = aVar4.f67586b;
                        if (intent != null) {
                            long longExtra = intent.getLongExtra("device.unit.id", -1L);
                            String stringExtra2 = intent.getStringExtra("device.name");
                            StringBuilder sbJ = com.nimbusds.jose.shaded.gson.internal.a.j(longExtra, "Device selected: (", stringExtra2, ", ");
                            sbJ.append(")");
                            logger.debug(sbJ.toString());
                            if (longExtra == -1 || stringExtra2 == null) {
                                vb.h.z("selected device unitId and name must no be null");
                                return;
                            }
                            logger.debug("checkAvailableSpaceForDevice");
                            m mVar = pushProvMainActivity2.f51165i;
                            if (mVar == null) {
                                s.m("pushProvViewModel");
                                throw null;
                            }
                            mVar.f84872c = longExtra;
                            y0<q3.a> y0Var = mVar.f84876g;
                            if (y0Var == null) {
                                s.m("isSpaceAvailable");
                                throw null;
                            }
                            y0Var.f(pushProvMainActivity2, new PushProvMainActivity.d(new c31.e(pushProvMainActivity2, stringExtra2, longExtra, 4)));
                            m mVar2 = pushProvMainActivity2.f51165i;
                            if (mVar2 == null) {
                                s.m("pushProvViewModel");
                                throw null;
                            }
                            w wVar = w.f140538a;
                            long j8 = mVar2.f84872c;
                            wVar.getClass();
                            ps2.n nVarI = w.i(j8);
                            if (nVarI != null) {
                                mVar2.f84873d = nVarI;
                            }
                            m mVar3 = pushProvMainActivity2.f51165i;
                            if (mVar3 == null) {
                                s.m("pushProvViewModel");
                                throw null;
                            }
                            zq2.g gVarY4 = mVar3.y4(pushProvMainActivity2.f51166j);
                            if (gVarY4 != null) {
                                m mVar4 = pushProvMainActivity2.f51165i;
                                if (mVar4 == null) {
                                    s.m("pushProvViewModel");
                                    throw null;
                                }
                                if (mVar4.f84873d != null) {
                                    hn2.a aVar7 = (hn2.a) KoinJavaComponent.get$default(hn2.a.class, null, null, 6, null);
                                    ps2.n nVar = mVar4.f84873d;
                                    if (nVar == null) {
                                        s.m("deviceWallet");
                                        throw null;
                                    }
                                    if (aVar7.i(nVar.f140512o) != null) {
                                        logger.debug("checkAvailableSpaceForDevice: getItemFromPayload: " + gVarY4);
                                        m mVar5 = pushProvMainActivity2.f51165i;
                                        if (mVar5 == null) {
                                            s.m("pushProvViewModel");
                                            throw null;
                                        }
                                        mVar5.f84878i = gVarY4.f206687h;
                                        if (mVar5 == null) {
                                            s.m("pushProvViewModel");
                                            throw null;
                                        }
                                        w9.a aVarA = v1.a(mVar5);
                                        x53.c cVar2 = s0.f129406a;
                                        ge1.b.T(aVarA, x53.b.f189152a, null, new j(gVarY4, mVar5, null), 2);
                                        return;
                                    }
                                }
                            }
                            pushProvMainActivity2.fa();
                            return;
                        }
                        return;
                    case 1:
                        f.a aVar8 = (f.a) obj;
                        PushProvMainActivity.a aVar9 = PushProvMainActivity.f51161t;
                        aVar8.getClass();
                        Logger logger2 = PushProvMainActivity.f51162v;
                        int i112 = aVar8.f67585a;
                        z.i("deviceOnboardingActivityLauncher: resultCode=", i112, logger2);
                        if (i112 == -1) {
                            pushProvMainActivity.ia();
                            return;
                        }
                        if (i112 == 0) {
                            com.garmin.feature.garminpay.providers.gpay.pushprovisioning.c cVar3 = com.garmin.feature.garminpay.providers.gpay.pushprovisioning.c.f51190a;
                            com.garmin.feature.garminpay.providers.gpay.pushprovisioning.c.a aVar10 = com.garmin.feature.garminpay.providers.gpay.pushprovisioning.c.a.CANCELLED;
                            cVar3.getClass();
                            com.garmin.feature.garminpay.providers.gpay.pushprovisioning.c.d(pushProvMainActivity, aVar10, null);
                            return;
                        }
                        if (i112 != 13) {
                            return;
                        }
                        com.garmin.feature.garminpay.providers.gpay.pushprovisioning.c cVar4 = com.garmin.feature.garminpay.providers.gpay.pushprovisioning.c.f51190a;
                        com.garmin.feature.garminpay.providers.gpay.pushprovisioning.c.a aVar11 = com.garmin.feature.garminpay.providers.gpay.pushprovisioning.c.a.ERROR;
                        cVar4.getClass();
                        com.garmin.feature.garminpay.providers.gpay.pushprovisioning.c.d(pushProvMainActivity, aVar11, null);
                        return;
                    case 2:
                        f.a aVar12 = (f.a) obj;
                        PushProvMainActivity.a aVar13 = PushProvMainActivity.f51161t;
                        aVar12.getClass();
                        Logger logger3 = PushProvMainActivity.f51162v;
                        int i113 = aVar12.f67585a;
                        z.i("termsConditionActivityLauncher: resultCode=", i113, logger3);
                        if (i113 != -1) {
                            if (i113 != 0) {
                                return;
                            }
                            com.garmin.feature.garminpay.providers.gpay.pushprovisioning.c cVar5 = com.garmin.feature.garminpay.providers.gpay.pushprovisioning.c.f51190a;
                            com.garmin.feature.garminpay.providers.gpay.pushprovisioning.c.a aVar14 = com.garmin.feature.garminpay.providers.gpay.pushprovisioning.c.a.CANCELLED;
                            cVar5.getClass();
                            com.garmin.feature.garminpay.providers.gpay.pushprovisioning.c.d(pushProvMainActivity, aVar14, null);
                            return;
                        }
                        z0 z0Var = pushProvMainActivity.f51167k;
                        if (z0Var != null) {
                            z0Var.s();
                        }
                        if (pushProvMainActivity.ha()) {
                            pushProvMainActivity.ja();
                            return;
                        } else {
                            pushProvMainActivity.ia();
                            return;
                        }
                    case 3:
                        f.a aVar15 = (f.a) obj;
                        PushProvMainActivity.a aVar16 = PushProvMainActivity.f51161t;
                        aVar15.getClass();
                        Intent intent2 = aVar15.f67586b;
                        Logger logger4 = PushProvMainActivity.f51162v;
                        int i24 = aVar15.f67585a;
                        z.i("issuerBankTermsConditionActivityLauncher: resultCode=", i24, logger4);
                        PushProvMainActivity pushProvMainActivity3 = this.f84843b;
                        if (i24 == -1) {
                            pushProvMainActivity3.ga();
                            return;
                        }
                        if (i24 == 0) {
                            com.garmin.feature.garminpay.providers.gpay.pushprovisioning.c cVar6 = com.garmin.feature.garminpay.providers.gpay.pushprovisioning.c.f51190a;
                            com.garmin.feature.garminpay.providers.gpay.pushprovisioning.c.a aVar17 = com.garmin.feature.garminpay.providers.gpay.pushprovisioning.c.a.CANCELLED;
                            cVar6.getClass();
                            com.garmin.feature.garminpay.providers.gpay.pushprovisioning.c.d(pushProvMainActivity3, aVar17, null);
                            return;
                        }
                        if (i24 == 11) {
                            logger4.debug("showCardWasDeclinedDialog");
                            br2.c cVar7 = br2.c.f19585a;
                            String string = pushProvMainActivity3.getResources().getString(R.string.this_card_was_declined_contact_your_bank);
                            string.getClass();
                            androidx.appcompat.app.e eVarQ = br2.c.q(cVar7, pushProvMainActivity3, "", string, new o13.p(pushProvMainActivity3.getResources().getString(R.string.lbl_ok), new b(pushProvMainActivity3, i110)), null, null, false, PsExtractor.VIDEO_STREAM_MASK);
                            if (eVarQ != null) {
                                eVarQ.show();
                                return;
                            }
                            return;
                        }
                        if (i24 != 14) {
                            if (i24 != 15) {
                                return;
                            }
                            if (intent2 == null || (stringExtra = intent2.getStringExtra("EXTRA_CALLBACK_RETURN")) == null || (aVarValueOf = com.garmin.feature.garminpay.providers.gpay.pushprovisioning.c.a.valueOf(stringExtra)) == null) {
                                aVarValueOf = com.garmin.feature.garminpay.providers.gpay.pushprovisioning.c.a.ERROR;
                            }
                            i0 i0VarW = f0.w(pushProvMainActivity3);
                            x53.c cVar8 = s0.f129406a;
                            ge1.b.T(i0VarW, u53.o.f168762a, null, new com.garmin.feature.garminpay.providers.gpay.pushprovisioning.a(pushProvMainActivity3, false, aVarValueOf, null), 2);
                            return;
                        }
                        logger4.debug("launchCardVerification");
                        hn2.c.ba(pushProvMainActivity3, Boolean.TRUE, null, null, 14);
                        if (intent2 == null) {
                            logger4.error("Intent is null. Cannot continue.");
                            pushProvMainActivity3.ka();
                            return;
                        }
                        long longExtra2 = intent2.getLongExtra("EXTRA_DEVICE_ID", -1L);
                        String stringExtra3 = intent2.getStringExtra("EXTRA_CREDIT_CARD_ID");
                        if (longExtra2 == -1 || stringExtra3 == null) {
                            logger4.error("Data from intent is null. Cannot continue.");
                            pushProvMainActivity3.ka();
                            return;
                        } else {
                            FitPayCardVerificationActivity.b bVar = FitPayCardVerificationActivity.f51449m;
                            Long lValueOf = Long.valueOf(longExtra2);
                            bVar.getClass();
                            pushProvMainActivity3.f51174r.a(FitPayCardVerificationActivity.b.a(lValueOf, stringExtra3, false, null), null);
                            return;
                        }
                    default:
                        f.a aVar18 = (f.a) obj;
                        PushProvMainActivity.a aVar19 = PushProvMainActivity.f51161t;
                        aVar18.getClass();
                        Logger logger5 = PushProvMainActivity.f51162v;
                        int i25 = aVar18.f67585a;
                        z.i("verificationCodeActivityLauncher: resultCode=", i25, logger5);
                        if (i25 == 0) {
                            com.garmin.feature.garminpay.providers.gpay.pushprovisioning.c.f51190a.getClass();
                            com.garmin.feature.garminpay.providers.gpay.pushprovisioning.c.b(pushProvMainActivity, true, null);
                            return;
                        }
                        return;
                }
            }
        });
    }

    public static final void ca(PushProvMainActivity pushProvMainActivity) {
        g1 g1Var;
        pushProvMainActivity.getClass();
        f51162v.debug("handleAddCardFlow");
        z0 z0Var = pushProvMainActivity.f51167k;
        if (z0Var == null || (g1Var = z0Var.f205979a) == null || !g1Var.W()) {
            m mVar = pushProvMainActivity.f51165i;
            if (mVar == null) {
                s.m("pushProvViewModel");
                throw null;
            }
            if (mVar.f84878i != null) {
                f.c<Intent> cVar = pushProvMainActivity.f51172p;
                NewFitPayTermsAndConditionActivity.a aVar = NewFitPayTermsAndConditionActivity.f51587j;
                Long lValueOf = Long.valueOf(mVar.f84872c);
                aVar.getClass();
                cVar.a(NewFitPayTermsAndConditionActivity.a.a(pushProvMainActivity, lValueOf), null);
            } else {
                pushProvMainActivity.fa();
            }
        }
        z0 z0Var2 = pushProvMainActivity.f51167k;
        if (z0Var2 != null) {
            z0Var2.s();
        }
        if (pushProvMainActivity.ha()) {
            pushProvMainActivity.ja();
        } else {
            pushProvMainActivity.ia();
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object da(PushProvMainActivity pushProvMainActivity, v13.c cVar) throws Throwable {
        g gVar;
        pushProvMainActivity.getClass();
        if (cVar instanceof g) {
            gVar = (g) cVar;
            int i14 = gVar.f84846c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                gVar.f84846c = i14 - Integer.MIN_VALUE;
            } else {
                gVar = new g(pushProvMainActivity, cVar);
            }
        } else {
            gVar = new g(pushProvMainActivity, cVar);
        }
        Object objE0 = gVar.f84844a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = gVar.f84846c;
        Logger logger = f51162v;
        if (i15 == 0) {
            r.b(objE0);
            h hVar = pushProvMainActivity.f51164h;
            if (hVar != null && s.g(hVar.f11705i.d(), Boolean.TRUE)) {
                logger.debug("removeCreditCardIfCreated");
                h hVar2 = pushProvMainActivity.f51164h;
                if (hVar2 == null) {
                    s.m("fitPayAddCardViewModel");
                    throw null;
                }
                yo2.b bVar = hVar2.f11707k.get();
                if ((bVar != null ? bVar.getCreditCardId() : null) == null || !(s.g(bVar.getCardState(), "NEW") || s.g(bVar.getCardState(), "ELIGIBLE"))) {
                    logger.debug("removeCreditCardIfCreated: Credit card was not created yet");
                } else {
                    logger.debug("removeCreditCardIfCreated: Credit card was already created but T&C hasn't been accepted");
                    t13.g gVarPlus = f0.w(pushProvMainActivity).f7937b.plus(s0.f129406a);
                    ho2.h hVar3 = new ho2.h(pushProvMainActivity, null);
                    gVar.f84846c = 1;
                    objE0 = ge1.b.e0(gVarPlus, hVar3, gVar);
                    if (objE0 == aVar) {
                        return aVar;
                    }
                }
            }
            return Unit.INSTANCE;
        }
        if (i15 != 1) {
            vb.h.z("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        r.b(objE0);
        if (((Boolean) objE0).booleanValue()) {
            logger.debug("removeCreditCardIfCreated: Card was deleted");
        } else {
            logger.error("removeCreditCardIfCreated: Can't delete the card");
            pushProvMainActivity.ka();
        }
        return Unit.INSTANCE;
    }

    public final void ea() {
        com.garmin.feature.garminpay.providers.gpay.pushprovisioning.c cVar = com.garmin.feature.garminpay.providers.gpay.pushprovisioning.c.f51190a;
        ho2.a aVar = new ho2.a(this, 3);
        cVar.getClass();
        com.garmin.feature.garminpay.providers.gpay.pushprovisioning.c.b(this, false, aVar);
    }

    public final void fa() {
        com.garmin.feature.garminpay.providers.gpay.pushprovisioning.c cVar = com.garmin.feature.garminpay.providers.gpay.pushprovisioning.c.f51190a;
        ho2.a aVar = new ho2.a(this, 1);
        cVar.getClass();
        com.garmin.feature.garminpay.providers.gpay.pushprovisioning.c.b(this, false, aVar);
    }

    public final void ga() {
        f51162v.debug("Finishing activity with card refresh");
        i0 i0VarW = f0.w(this);
        x53.c cVar = s0.f129406a;
        ge1.b.T(i0VarW, o.f168762a, null, new c(null), 2);
    }

    public final boolean ha() {
        g1 g1Var;
        z0 z0Var = this.f51167k;
        fo2.s sVarE = null;
        if (z0Var != null && (g1Var = z0Var.f205979a) != null) {
            m mVar = this.f51165i;
            if (mVar == null) {
                s.m("pushProvViewModel");
                throw null;
            }
            sVarE = g1Var.E(mVar.f84872c);
        }
        return sVarE == null || sVarE.f73106f != y.INITIALIZED;
    }

    public final void ia() {
        f51162v.debug("launchAddCard");
        hn2.c.ba(this, Boolean.TRUE, null, null, 14);
        h hVar = this.f51164h;
        if (hVar == null) {
            s.m("fitPayAddCardViewModel");
            throw null;
        }
        m mVar = this.f51165i;
        if (mVar == null) {
            s.m("pushProvViewModel");
            throw null;
        }
        Long lValueOf = Long.valueOf(mVar.f84872c);
        h.a aVar = h.f11695y;
        ge1.b.T(v1.a(hVar), s0.f129406a, null, new q(hVar, lValueOf, null, null, null), 2);
        h hVar2 = this.f51164h;
        if (hVar2 == null) {
            s.m("fitPayAddCardViewModel");
            throw null;
        }
        int i14 = 0;
        dh.b.I(hVar2.f11706j, this, new ho2.c(this, i14));
        h hVar3 = this.f51164h;
        if (hVar3 != null) {
            hVar3.f11705i.f(this, new d(new ho2.d(this, i14)));
        } else {
            s.m("fitPayAddCardViewModel");
            throw null;
        }
    }

    public final void ja() {
        m mVar = this.f51165i;
        if (mVar == null) {
            s.m("pushProvViewModel");
            throw null;
        }
        wr.g.v("onBoardDevice: Device ", mVar.f84872c, " is not provisioned yet, navigating to NewDeviceOnBoardingActivity", f51162v);
        m mVar2 = this.f51165i;
        if (mVar2 == null) {
            s.m("pushProvViewModel");
            throw null;
        }
        if (mVar2.f84878i == null) {
            fa();
            return;
        }
        NewDeviceOnBoardingActivity.a aVar = NewDeviceOnBoardingActivity.f51700k;
        Context contextC = ((hn2.a) KoinJavaComponent.get$default(hn2.a.class, null, null, 6, null)).c();
        f fVar = this.f51163g;
        if (fVar == null) {
            s.m("deviceRecord");
            throw null;
        }
        long unitID = fVar.getUnitID();
        f fVar2 = this.f51163g;
        if (fVar2 == null) {
            s.m("deviceRecord");
            throw null;
        }
        String productDisplayName = fVar2.getProductDisplayName();
        productDisplayName.getClass();
        f fVar3 = this.f51163g;
        if (fVar3 == null) {
            s.m("deviceRecord");
            throw null;
        }
        String imageURL = fVar3.getImageURL();
        if (imageURL == null) {
            imageURL = "";
        }
        aVar.getClass();
        this.f51171o.a(NewDeviceOnBoardingActivity.a.a(contextC, unitID, productDisplayName, imageURL), null);
    }

    public final void ka() {
        f51162v.debug("showSomethingWentWrongDialog");
        br2.c cVar = br2.c.f19585a;
        kj0.c.f104941a.getClass();
        androidx.appcompat.app.e eVarQ = br2.c.q(cVar, this, kj0.c.b(), kj0.c.a(), new o13.p(getString(R.string.lbl_ok), new ho2.b(this, 0)), null, null, false, PsExtractor.VIDEO_STREAM_MASK);
        if (eVarQ != null) {
            eVarQ.show();
        }
    }

    public final void la(o13.p<String, ? extends p<? super DialogInterface, ? super Integer, Unit>> pVar) {
        f51162v.debug("showVerificationMethodFailedDialog");
        br2.c cVar = br2.c.f19585a;
        String string = getString(R.string.dialog_title_error);
        string.getClass();
        String string2 = getString(R.string.verification_selection_failed);
        string2.getClass();
        androidx.appcompat.app.e eVarQ = br2.c.q(cVar, this, string, string2, pVar, null, null, false, PsExtractor.VIDEO_STREAM_MASK);
        if (eVarQ != null) {
            eVarQ.show();
        }
    }

    @Override // hn2.c, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        f51162v.debug("Initialize Push Provisioning flow");
        R9(R.layout.activity_empty, hn2.c.a.NONE, null);
        com.garmin.feature.garminpay.providers.gpay.pushprovisioning.c.f51190a.getClass();
        AtomicReference<Boolean> atomicReference = com.garmin.feature.garminpay.providers.gpay.pushprovisioning.c.f51192c;
        Boolean bool = Boolean.TRUE;
        atomicReference.set(bool);
        x1 x1Var = new x1(this);
        t0 t0Var = p005kotlin.jvm.internal.s0.f105811a;
        this.f51165i = (m) x1Var.b(t0Var.b(m.class));
        this.f51164h = (h) new x1(this).b(t0Var.b(h.class));
        m mVar = this.f51165i;
        if (mVar == null) {
            s.m("pushProvViewModel");
            throw null;
        }
        y0<Boolean> y0Var = mVar.f84874e;
        Logger logger = mVar.f84870a;
        logger.debug("initViewModel");
        try {
            ms2.g gVarA = w.f140538a.a(is2.b.FITPAY);
            gVarA.getClass();
            mVar.f84875f = (z0) gVarA;
            mVar.f84876g = new y0<>();
            mVar.f84877h = new y0<>();
            y0Var.j(bool);
        } catch (Exception e4) {
            logger.error("initViewModel: ", (Throwable) e4);
            y0Var.j(Boolean.FALSE);
        }
        m mVar2 = this.f51165i;
        if (mVar2 != null) {
            mVar2.f84874e.f(this, new d(new ho2.d(this, 1)));
        } else {
            s.m("pushProvViewModel");
            throw null;
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\tR\u0014\u0010\u000b\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\tR\u0014\u0010\f\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\tR\u0014\u0010\r\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\tR\u0014\u0010\u000f\u001a\u00020\u000e8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u000e8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u000e8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0010¨\u0006\u0013"}, d2 = {"Lcom/garmin/feature/garminpay/providers/gpay/pushprovisioning/PushProvMainActivity$a;", "", "<init>", "()V", "Lorg/slf4j/Logger;", "LOGGER", "Lorg/slf4j/Logger;", "", "RESULT_CARD_DECLINED", "I", "RESULT_CARD_REMOVAL", "RESULT_ERROR", "RESULT_START_VERIFICATION", "RESULT_UNSUCCESSFUL", "", "EXTRA_DEVICE_ID", "Ljava/lang/String;", "EXTRA_CREDIT_CARD_ID", "EXTRA_CALLBACK_RETURN", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
