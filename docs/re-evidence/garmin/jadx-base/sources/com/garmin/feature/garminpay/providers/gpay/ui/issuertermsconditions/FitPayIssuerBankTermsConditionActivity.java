package com.garmin.feature.garminpay.providers.gpay.ui.issuertermsconditions;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.v1;
import androidx.lifecycle.x1;
import androidx.lifecycle.z0;
import androidx.navigation.fragment.NavHostFragment;
import aq2.j;
import com.garmin.android.apps.connectmobile.R;
import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import e23.l;
import gp2.g;
import java.util.concurrent.atomic.AtomicReference;
import lc.j0;
import lc.m0;
import o13.m;
import o13.p;
import o13.t;
import o53.s0;
import org.koin.java.KoinJavaComponent;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.n;
import p005kotlin.jvm.internal.s;
import ro0.h;
import rp2.i;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/garmin/feature/garminpay/providers/gpay/ui/issuertermsconditions/FitPayIssuerBankTermsConditionActivity;", "Lhn2/c;", "Lyq2/a;", "<init>", "()V", "a", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class FitPayIssuerBankTermsConditionActivity extends hn2.c implements yq2.a {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final a f51592t = new a(null);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final t f51593v = m.b(new h(3));

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Long f51594g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f51595h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public yo2.b f51596i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f51597j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f51598k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f51599l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public gp2.e f51600m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public g f51601n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public com.garmin.feature.garminpay.providers.gpay.ui.issuertermsconditions.b f51602o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Handler f51603p = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final rp2.c f51604q = new rp2.c(this, 0);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f51605r;

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f51606a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f51607b;

        static {
            int[] iArr = new int[com.garmin.feature.garminpay.providers.gpay.ui.issuertermsconditions.b.EnumC1070b.values().length];
            try {
                iArr[com.garmin.feature.garminpay.providers.gpay.ui.issuertermsconditions.b.EnumC1070b.CARD_PROVISION_COMPLETE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[com.garmin.feature.garminpay.providers.gpay.ui.issuertermsconditions.b.EnumC1070b.CARD_ACTIVATED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[com.garmin.feature.garminpay.providers.gpay.ui.issuertermsconditions.b.EnumC1070b.CARD_IN_PENDING_VERIFICATION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[com.garmin.feature.garminpay.providers.gpay.ui.issuertermsconditions.b.EnumC1070b.FAILED_TO_ACCEPT_TERMS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[com.garmin.feature.garminpay.providers.gpay.ui.issuertermsconditions.b.EnumC1070b.FAILED_TO_ACCEPT_TERMS_NO_FURTHER_ACTION.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[com.garmin.feature.garminpay.providers.gpay.ui.issuertermsconditions.b.EnumC1070b.CARD_NOT_ELIGIBLE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[com.garmin.feature.garminpay.providers.gpay.ui.issuertermsconditions.b.EnumC1070b.CARD_PROVISION_FAILED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[com.garmin.feature.garminpay.providers.gpay.ui.issuertermsconditions.b.EnumC1070b.CARD_PROVISION_TIMEOUT.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[com.garmin.feature.garminpay.providers.gpay.ui.issuertermsconditions.b.EnumC1070b.FAILED_TO_RETRIEVE_CARD.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[com.garmin.feature.garminpay.providers.gpay.ui.issuertermsconditions.b.EnumC1070b.FAILED_TO_RETRIEVE_TERMS_AND_CONDITIONS.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[com.garmin.feature.garminpay.providers.gpay.ui.issuertermsconditions.b.EnumC1070b.CARD_DELETED.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[com.garmin.feature.garminpay.providers.gpay.ui.issuertermsconditions.b.EnumC1070b.CLIENT_CARD_DETAILS_RETRY.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            f51606a = iArr;
            int[] iArr2 = new int[com.garmin.feature.garminpay.providers.gpay.pushprovisioning.c.a.values().length];
            try {
                iArr2[com.garmin.feature.garminpay.providers.gpay.pushprovisioning.c.a.APPROVED.ordinal()] = 1;
            } catch (NoSuchFieldError unused13) {
            }
            f51607b = iArr2;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c implements z0, n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l f51608a;

        public c(l lVar) {
            lVar.getClass();
            this.f51608a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof z0) && (obj instanceof n)) {
                return s.g(getFunctionDelegate(), ((n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final o13.h<?> getFunctionDelegate() {
            return this.f51608a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.z0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f51608a.invoke(obj);
        }
    }

    public static /* synthetic */ void ha(FitPayIssuerBankTermsConditionActivity fitPayIssuerBankTermsConditionActivity, String str, p pVar) {
        String string = fitPayIssuerBankTermsConditionActivity.getString(R.string.dialog_title_error);
        string.getClass();
        fitPayIssuerBankTermsConditionActivity.ga(string, str, pVar);
    }

    @Override // yq2.a
    public final void K5() {
        a aVar = f51592t;
        a.a(aVar).debug("launchDeclineTermsCondition");
        try {
            com.garmin.feature.garminpay.providers.gpay.ui.issuertermsconditions.b bVar = this.f51602o;
            if (bVar == null) {
                s.m("viewModel");
                throw null;
            }
            ge1.b.T(v1.a(bVar), null, null, new rp2.e(bVar, null), 3);
            ia(null);
        } catch (Exception e4) {
            a.a(aVar).error("launchDeclineTermsCondition:", (Throwable) e4);
        }
    }

    @Override // yq2.a
    public final void b3() {
        fa();
    }

    public final void ca() {
        a aVar = f51592t;
        a.a(aVar).debug("createAndShowCardDeclinedAlertDialog");
        if (this.f51599l) {
            a.a(aVar).debug("createAndShowCardDeclinedAlertDialog: Is starting retry flow, do not show dialog.");
            return;
        }
        com.garmin.feature.garminpay.providers.gpay.pushprovisioning.c.f51190a.getClass();
        if (s.g(com.garmin.feature.garminpay.providers.gpay.pushprovisioning.c.f51192c.get(), Boolean.TRUE)) {
            setResult(11);
            finish();
            return;
        }
        String string = getString(R.string.dialog_title_error);
        string.getClass();
        String string2 = getString(R.string.card_declined);
        string2.getClass();
        ga(string, string2, new p<>(getString(R.string.lbl_ok), new rp2.a(this, 6)));
    }

    public final void da() {
        if (this.f51598k) {
            a.a(f51592t).debug("createAndShowCardDeletedAlertDialog: In retry flow, do not show dialog.");
            return;
        }
        String string = getString(R.string.card_deleted);
        string.getClass();
        ha(this, string, new p(getString(R.string.lbl_ok), new rp2.a(this, 1)));
    }

    @Override // yq2.a
    public final void e8(String str, String str2, String str3) {
        cj2.c.a.a(cj2.c.f27758a, ((hn2.a) KoinJavaComponent.get$default(hn2.a.class, null, null, 6, null)).c(), str, str2, str3, 16);
    }

    public final void ea() {
        String string = getString(R.string.title_error_occurred);
        string.getClass();
        ha(this, string, new p(getString(R.string.lbl_ok), new rp2.a(this, 3)));
    }

    public final void fa() {
        br2.c.h(br2.c.f19585a, this, new rp2.b(this, 6), null, 4);
    }

    public final void ga(String str, String str2, p<String, ? extends e23.p<? super DialogInterface, ? super Integer, Unit>> pVar) {
        androidx.appcompat.app.e eVarQ = br2.c.q(br2.c.f19585a, this, str, str2, pVar, null, null, false, PsExtractor.VIDEO_STREAM_MASK);
        if (eVarQ != null) {
            eVarQ.show();
        }
    }

    public final void ia(com.garmin.feature.garminpay.providers.gpay.pushprovisioning.c.a aVar) {
        a aVar2 = f51592t;
        a.a(aVar2).debug("finishWithRefresh: " + aVar);
        com.garmin.feature.garminpay.providers.gpay.pushprovisioning.c.f51190a.getClass();
        Boolean bool = com.garmin.feature.garminpay.providers.gpay.pushprovisioning.c.f51192c.get();
        Boolean bool2 = Boolean.TRUE;
        if (s.g(bool, bool2) && aVar != null) {
            if (b.f51607b[aVar.ordinal()] == 1) {
                AtomicReference<String> atomicReference = com.garmin.feature.garminpay.providers.gpay.pushprovisioning.c.f51195f;
                com.garmin.feature.garminpay.providers.gpay.ui.issuertermsconditions.b bVar = this.f51602o;
                if (bVar == null) {
                    s.m("viewModel");
                    throw null;
                }
                yo2.b bVarD = bVar.f51617g.d();
                atomicReference.set(bVarD != null ? bVarD.getExternalTokenReference() : null);
                setResult(-1);
            } else {
                Intent intent = new Intent();
                intent.putExtra("EXTRA_CALLBACK_RETURN", aVar);
                setResult(15, intent);
            }
            finish();
            return;
        }
        try {
            hn2.c.ba(this, bool2, null, null, 14);
            com.garmin.feature.garminpay.providers.gpay.ui.issuertermsconditions.b bVar2 = this.f51602o;
            if (bVar2 == null) {
                s.m("viewModel");
                throw null;
            }
            bVar2.f51615e.f(this, new c(new rp2.d(this, 2)));
            com.garmin.feature.garminpay.providers.gpay.ui.issuertermsconditions.b bVar3 = this.f51602o;
            if (bVar3 != null) {
                ge1.b.T(v1.a(bVar3), s0.f129406a, null, new i(bVar3, null), 2);
            } else {
                s.m("viewModel");
                throw null;
            }
        } catch (Exception e4) {
            a.a(aVar2).error("finishWithCancellation:", (Throwable) e4);
        }
    }

    public final void ja(e23.a<Unit> aVar) {
        a.a(f51592t).debug("showCardRetryDialog");
        if (this.f51598k) {
            aVar.invoke();
            return;
        }
        this.f51598k = true;
        this.f51599l = true;
        String string = getString(R.string.more_card_details_title);
        string.getClass();
        String string2 = getString(R.string.additional_card_info_needed);
        string2.getClass();
        String string3 = getString(R.string.lbl_common_continue);
        string3.getClass();
        ga(string, string2, new p<>(string3, new rp2.a(this, 5)));
    }

    @Override // hn2.c, b.g, android.app.Activity
    public final void onBackPressed() {
        com.garmin.feature.garminpay.providers.gpay.pushprovisioning.c.f51190a.getClass();
        if (s.g(com.garmin.feature.garminpay.providers.gpay.pushprovisioning.c.f51192c.get(), Boolean.TRUE)) {
            com.garmin.feature.garminpay.providers.gpay.pushprovisioning.c.b(this, true, new rp2.b(this, 5));
        } else {
            super.onBackPressed();
        }
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00de  */
    @Override // hn2.c, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        String creditCardId;
        Object serializableExtra;
        Object serializableExtra2;
        dp2.b bVar;
        super.onCreate(bundle);
        R9(R.layout.activity_fit_pay_issuer_bank_terms_condition, hn2.c.a.UP, null);
        hn2.c.ba(this, Boolean.TRUE, getString(R.string.card_setup_progress), "", 8);
        this.f51594g = Long.valueOf(getIntent().getLongExtra("device.unit.id", -1L));
        yo2.b bVar2 = (yo2.b) getIntent().getParcelableExtra("extra.credit.card");
        this.f51596i = bVar2;
        a aVar = f51592t;
        if (bVar2 == null || (creditCardId = bVar2.getCreditCardId()) == null) {
            a.a(aVar).error("onCreate: missing credit card id");
            fa();
            return;
        }
        this.f51595h = creditCardId;
        this.f51597j = getIntent().getBooleanExtra("extra.is.credit.card.and.credential.flow", false);
        this.f51598k = getIntent().getBooleanExtra("extra.is.in.retry.flow", false);
        Intent intent = getIntent();
        int i14 = Build.VERSION.SDK_INT;
        if (i14 >= 33) {
            serializableExtra = intent != null ? intent.getSerializableExtra("extra.credential.state", gp2.e.class) : null;
        } else {
            Object serializableExtra3 = intent != null ? intent.getSerializableExtra("extra.credential.state") : null;
            if (!(serializableExtra3 instanceof gp2.e)) {
                serializableExtra3 = null;
            }
            serializableExtra = (gp2.e) serializableExtra3;
        }
        this.f51600m = (gp2.e) serializableExtra;
        Intent intent2 = getIntent();
        if (i14 >= 33) {
            serializableExtra2 = intent2 != null ? intent2.getSerializableExtra("extra.token.creation", g.class) : null;
        } else {
            Object serializableExtra4 = intent2 != null ? intent2.getSerializableExtra("extra.token.creation") : null;
            if (!(serializableExtra4 instanceof g)) {
                serializableExtra4 = null;
            }
            serializableExtra2 = (g) serializableExtra4;
        }
        this.f51601n = (g) serializableExtra2;
        jo2.g gVar = jo2.g.f99843a;
        jo2.b bVar3 = jo2.b.KEY_API;
        String stringExtra = getIntent().getStringExtra("extra.encrypted.card.info");
        String str = stringExtra != null ? stringExtra : "";
        gVar.getClass();
        String strA = jo2.g.a(bVar3, str);
        if (strA != null) {
            j.f12491a.getClass();
            bVar = (dp2.b) j.d().fromJson(strA, dp2.b.class);
            if (bVar == null) {
                a.a(aVar).error("onCreate: Failed to decrypt card information for retry flow");
                bVar = null;
            }
        } else {
            a.a(aVar).error("onCreate: Failed to decrypt card information for retry flow");
            bVar = null;
        }
        com.garmin.feature.garminpay.providers.gpay.ui.issuertermsconditions.b bVar4 = (com.garmin.feature.garminpay.providers.gpay.ui.issuertermsconditions.b) new x1(this).b(p005kotlin.jvm.internal.s0.f105811a.b(com.garmin.feature.garminpay.providers.gpay.ui.issuertermsconditions.b.class));
        Long l14 = this.f51594g;
        yo2.b bVar5 = this.f51596i;
        if (((l14 == null || bVar5 == null) ? null : ge1.b.T(v1.a(bVar4), s0.f129406a, null, new rp2.h(bVar4, l14.longValue(), bVar5, null), 2)) == null) {
            a.a(aVar).error("onViewCreated: deviceId or creditCard is null (" + this.f51594g + ", " + this.f51595h + ")");
            fa();
            Unit unit = Unit.INSTANCE;
        }
        this.f51602o = bVar4;
        bVar4.f51619i.set(bVar);
        Fragment fragmentF = getSupportFragmentManager().F(R.id.issuer_term_conditions_nav_host_fragment);
        fragmentF.getClass();
        NavHostFragment navHostFragment = (NavHostFragment) fragmentF;
        m0 m0VarU6 = navHostFragment.u6();
        j0 j0VarB = navHostFragment.u6().e().b(R.navigation.issuer_terms_conditions_nav_graph);
        com.garmin.feature.garminpay.providers.gpay.ui.issuertermsconditions.b bVar6 = this.f51602o;
        if (bVar6 == null) {
            s.m("viewModel");
            throw null;
        }
        bVar6.f51614d.f(this, new c(new rk0.g(3, j0VarB, m0VarU6)));
        com.garmin.feature.garminpay.providers.gpay.ui.issuertermsconditions.b bVar7 = this.f51602o;
        if (bVar7 != null) {
            bVar7.f51613c.f(this, new c(new rp2.d(this, 1)));
        } else {
            s.m("viewModel");
            throw null;
        }
    }

    @Override // hn2.c, i.c, androidx.fragment.app.m, android.app.Activity
    public final void onDestroy() {
        Handler handler = this.f51603p;
        rp2.c cVar = this.f51604q;
        handler.removeCallbacks(cVar);
        handler.removeCallbacks(cVar);
        com.garmin.feature.garminpay.providers.gpay.ui.issuertermsconditions.b bVar = this.f51602o;
        if (bVar == null) {
            s.m("viewModel");
            throw null;
        }
        dp2.b bVar2 = bVar.f51619i.get();
        if (bVar2 != null) {
            bVar2.b();
        }
        com.garmin.feature.garminpay.providers.gpay.ui.issuertermsconditions.b bVar3 = this.f51602o;
        if (bVar3 == null) {
            s.m("viewModel");
            throw null;
        }
        bVar3.f51619i.set(null);
        super.onDestroy();
    }

    @Override // hn2.c, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, android.app.Activity
    public final void onResume() {
        super.onResume();
        if (!this.f51598k || this.f51605r) {
            return;
        }
        Handler handler = this.f51603p;
        rp2.c cVar = this.f51604q;
        handler.removeCallbacks(cVar);
        handler.postDelayed(cVar, 900000L);
    }

    @Override // android.app.Activity
    public final void onUserInteraction() {
        if (this.f51598k && !this.f51605r) {
            Handler handler = this.f51603p;
            rp2.c cVar = this.f51604q;
            handler.removeCallbacks(cVar);
            handler.postDelayed(cVar, 900000L);
        }
        super.onUserInteraction();
    }

    @Override // yq2.a
    public final void q7() {
        a.a(f51592t).debug("launchDeclineTermsConditionForPushProvisioning");
        com.garmin.feature.garminpay.providers.gpay.pushprovisioning.c cVar = com.garmin.feature.garminpay.providers.gpay.pushprovisioning.c.f51190a;
        rp2.b bVar = new rp2.b(this, 7);
        cVar.getClass();
        com.garmin.feature.garminpay.providers.gpay.pushprovisioning.c.b(this, true, bVar);
    }

    @Override // yq2.a
    public final void x(boolean z14) {
        hn2.c.ba(this, Boolean.valueOf(z14), null, null, 10);
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/feature/garminpay/providers/gpay/ui/issuertermsconditions/FitPayIssuerBankTermsConditionActivity$a;", "", "<init>", "()V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static final Logger a(a aVar) {
            aVar.getClass();
            return (Logger) FitPayIssuerBankTermsConditionActivity.f51593v.getValue();
        }

        public static Intent b(Long l14, yo2.b bVar, boolean z14, gp2.e eVar, g gVar, boolean z15, String str) {
            Intent intent = new Intent(((hn2.a) KoinJavaComponent.get$default(hn2.a.class, null, null, 6, null)).c(), (Class<?>) FitPayIssuerBankTermsConditionActivity.class);
            intent.putExtra("device.unit.id", l14);
            intent.putExtra("extra.credit.card", bVar);
            intent.putExtra("extra.is.credit.card.and.credential.flow", z14);
            intent.putExtra("extra.credential.state", eVar);
            intent.putExtra("extra.token.creation", gVar);
            intent.putExtra("extra.is.in.retry.flow", z15);
            Intent intentPutExtra = intent.putExtra("extra.encrypted.card.info", str);
            intentPutExtra.getClass();
            return intentPutExtra;
        }

        public static /* synthetic */ Intent c(a aVar, Long l14, yo2.b bVar, boolean z14, gp2.e eVar, int i14) {
            if ((i14 & 4) != 0) {
                z14 = false;
            }
            boolean z15 = z14;
            if ((i14 & 8) != 0) {
                eVar = null;
            }
            aVar.getClass();
            return b(l14, bVar, z15, eVar, null, false, null);
        }

        private a() {
        }
    }
}
