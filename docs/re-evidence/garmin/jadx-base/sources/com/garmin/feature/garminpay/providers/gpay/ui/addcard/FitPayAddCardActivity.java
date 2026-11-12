package com.garmin.feature.garminpay.providers.gpay.ui.addcard;

import a61.i;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import androidx.lifecycle.i0;
import androidx.lifecycle.v1;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.w1;
import androidx.lifecycle.y1;
import androidx.lifecycle.z0;
import ap2.h;
import ap2.j;
import ap2.q;
import ap2.u;
import ap2.v;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.l2;
import com.garmin.customermanagementlib.ui.CustomerManagementLibMainActivity;
import com.garmin.feature.garminpay.providers.gpay.ui.addcard.fragment.FitPayAddressManagementFragment;
import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import e23.l;
import gp2.g;
import o13.m;
import o13.n;
import o13.p;
import o13.t;
import o53.f0;
import org.koin.android.ext.android.AndroidKoinScopeExtKt;
import org.koin.bundle.GetViewModelKt;
import org.koin.core.qualifier.Qualifier;
import org.koin.java.KoinJavaComponent;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.s0;
import u53.o;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/garmin/feature/garminpay/providers/gpay/ui/addcard/FitPayAddCardActivity;", "Lhn2/c;", "Lyq2/a;", "<init>", "()V", "a", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class FitPayAddCardActivity extends hn2.c implements yq2.a {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final a f51376x = new a(null);

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final t f51377y = m.b(new ak0.t(9));

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Long f51378g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f51379h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f51380i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f51381j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f51382k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f51383l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public gp2.e f51384m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public g f51385n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public gp2.b f51386o;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f51391v;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final w1 f51387p = new w1(s0.f105811a.b(h.class), new e(this), new ak0.t(10), new f(null, this));

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Object f51388q = m.a(n.NONE, new d(this, null, null, null));

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Handler f51389r = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final a0.c f51390t = new a0.c(this, 16);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final f.c<Intent> f51392w = registerForActivityResult(new g.h(), new i(this, 1));

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f51393a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f51394b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f51395c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ int[] f51396d;

        static {
            int[] iArr = new int[g.values().length];
            try {
                iArr[g.VERIFY_CREDIT_CARD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[g.VERIFY_CREDENTIAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[g.CREATE_CREDIT_CARD_AND_CREDENTIAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[g.CREATE_CREDIT_CARD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[g.CREATE_CREDENTIAL.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f51393a = iArr;
            int[] iArr2 = new int[gp2.b.values().length];
            try {
                iArr2[gp2.b.LOAD_CREDIT_CARD_REQUIRED_FIELDS.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[gp2.b.LOAD_CREDENTIAL_REQUIRED_FIELDS.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[gp2.b.LOAD_PAYMENT_CARDS_NOT_IN_DEVICE.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[gp2.b.LOAD_PAYMENT_CARDS.ordinal()] = 4;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[gp2.b.SHOW_PAYMENT_CARD_INFO_FORM.ordinal()] = 5;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[gp2.b.START_RETRY_FLOW.ordinal()] = 6;
            } catch (NoSuchFieldError unused11) {
            }
            f51394b = iArr2;
            int[] iArr3 = new int[gp2.f.values().length];
            try {
                iArr3[gp2.f.CARD_CREATED.ordinal()] = 1;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr3[gp2.f.DEVICE_REQUIRES_SE_UPDATE.ordinal()] = 2;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr3[gp2.f.USER_ENTERED_BAD_DATA.ordinal()] = 3;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr3[gp2.f.DUPLICATE_CARD.ordinal()] = 4;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr3[gp2.f.MAX_CARD_LIMIT_REACHED.ordinal()] = 5;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr3[gp2.f.CARD_ISSUER_NOT_ELIGIBLE.ordinal()] = 6;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr3[gp2.f.CARD_CREATED_BUT_CAN_NOT_PROCEED_FURTHER.ordinal()] = 7;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr3[gp2.f.CREATE_CREDIT_CARD_REQUEST_TIMED_OUT.ordinal()] = 8;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr3[gp2.f.FAILURE_TO_CREATE_CREDIT_CARD.ordinal()] = 9;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr3[gp2.f.CARD_DELETED.ordinal()] = 10;
            } catch (NoSuchFieldError unused21) {
            }
            f51395c = iArr3;
            int[] iArr4 = new int[gp2.e.values().length];
            try {
                iArr4[gp2.e.CREDENTIAL_CREATED.ordinal()] = 1;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr4[gp2.e.CREDENTIAL_NOT_CREATED.ordinal()] = 2;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr4[gp2.e.CREDENTIAL_NOT_CREATED_CLIENT_ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused24) {
            }
            f51396d = iArr4;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c implements z0, p005kotlin.jvm.internal.n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l f51397a;

        public c(l lVar) {
            lVar.getClass();
            this.f51397a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof z0) && (obj instanceof p005kotlin.jvm.internal.n)) {
                return s.g(getFunctionDelegate(), ((p005kotlin.jvm.internal.n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final o13.h<?> getFunctionDelegate() {
            return this.f51397a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.z0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f51397a.invoke(obj);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class d implements e23.a<nj2.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ b.g f51398a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Qualifier f51399b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e23.a f51400c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ e23.a f51401d;

        public d(b.g gVar, Qualifier qualifier, e23.a aVar, e23.a aVar2) {
            this.f51398a = gVar;
            this.f51399b = qualifier;
            this.f51400c = aVar;
            this.f51401d = aVar2;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [androidx.lifecycle.u1, nj2.a] */
        @Override // e23.a
        public final nj2.a invoke() {
            CreationExtras defaultViewModelCreationExtras;
            b.g gVar = this.f51398a;
            y1 viewModelStore = gVar.getF189591b();
            e23.a aVar = this.f51400c;
            if (aVar == null || (defaultViewModelCreationExtras = (CreationExtras) aVar.invoke()) == null) {
                defaultViewModelCreationExtras = gVar.getDefaultViewModelCreationExtras();
            }
            return GetViewModelKt.resolveViewModel$default(s0.f105811a.b(nj2.a.class), viewModelStore, null, defaultViewModelCreationExtras, this.f51399b, AndroidKoinScopeExtKt.getKoinScope(gVar), this.f51401d, 4, null);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class e implements e23.a<y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ b.g f51402a;

        public e(b.g gVar) {
            this.f51402a = gVar;
        }

        @Override // e23.a
        public final y1 invoke() {
            return this.f51402a.getF189591b();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class f implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f51403a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ b.g f51404b;

        public f(e23.a aVar, b.g gVar) {
            this.f51403a = aVar;
            this.f51404b = gVar;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f51403a;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f51404b.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    public static /* synthetic */ void da(FitPayAddCardActivity fitPayAddCardActivity, String str, p pVar) {
        String string = fitPayAddCardActivity.getString(R.string.dialog_title_error);
        string.getClass();
        fitPayAddCardActivity.ca(string, str, pVar);
    }

    @Override // yq2.a
    public final void B3(String str, String str2, String str3) {
        str.getClass();
        this.f51379h = str;
        this.f51380i = str2;
        this.f51382k = str3;
        h hVarFa = fa();
        ge1.b.T(v1.a(hVarFa), null, null, new v(hVarFa, str, null), 3);
    }

    @Override // yq2.a
    public final void G2(dp2.b bVar) {
        bVar.getClass();
        g gVar = fa().f11700d.get();
        int i14 = gVar == null ? -1 : b.f51393a[gVar.ordinal()];
        if (i14 != 1) {
            if (i14 != 2) {
                if (i14 == 3) {
                    if (((com.garmin.android.apps.connectmobile.l) zf.b.r()).m()) {
                        wr2.p pVar = wr2.p.f186870a;
                        String string = getString(R.string.disable_ecom_tokenization);
                        string.getClass();
                        pVar.getClass();
                        if (!wr2.p.b("general_app", string, false)) {
                            h hVarFa = fa();
                            ge1.b.T(v1.a(hVarFa), null, null, new ap2.n(hVarFa, bVar, null), 3);
                            return;
                        }
                    }
                    h hVarFa2 = fa();
                    ge1.b.T(v1.a(hVarFa2), null, null, new j(hVarFa2, bVar, null), 3);
                    return;
                }
                if (i14 != 4) {
                    if (i14 != 5) {
                        eo2.d.f64794a.getClass();
                        if (g22.n.d(eo2.d.f64799f.get())) {
                            wr2.j.f186862a.getClass();
                            wr2.j.a("FitPayAddCardActivity.createTokens()", "There is no flow type");
                        }
                        a.a(f51376x).error("createTokens: There is no flow type");
                        x(false);
                        Unit unit = Unit.INSTANCE;
                        return;
                    }
                }
            }
            h hVarFa3 = fa();
            ge1.b.T(v1.a(hVarFa3), null, null, new ap2.i(hVarFa3, bVar, null), 3);
            return;
        }
        h hVarFa4 = fa();
        ge1.b.T(v1.a(hVarFa4), null, null, new j(hVarFa4, bVar, null), 3);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, o13.l] */
    @Override // yq2.a
    public final void K8() {
        ((nj2.a) this.f51388q.getValue()).M4();
    }

    @Override // yq2.a
    public final void a0() {
        fp2.a.f73187a.getClass();
        cp2.f.f54931p.getClass();
        ga(new cp2.f(), gp2.c.PAYMENT_CARD_INFO_SCREEN);
    }

    public final void ca(String str, String str2, p<String, ? extends e23.p<? super DialogInterface, ? super Integer, Unit>> pVar) {
        androidx.appcompat.app.e eVarQ = br2.c.q(br2.c.f19585a, this, str, str2, pVar, null, null, false, PsExtractor.VIDEO_STREAM_MASK);
        if (eVarQ != null) {
            eVarQ.show();
        }
    }

    @Override // yq2.a
    public final void e8(String str, String str2, String str3) {
        cj2.c.f27758a.getClass();
        CustomerManagementLibMainActivity.f50711h.getClass();
        Intent intent = new Intent(((ij2.a) KoinJavaComponent.get$default(ij2.a.class, null, null, 6, null)).b(), (Class<?>) CustomerManagementLibMainActivity.class);
        intent.putExtra("EXTRA_ROUTE", str);
        intent.putExtra("EXTRA_ADDRESS_ID", str2);
        intent.putExtra("EXTRA_APP_BAR_TITLE", str3);
        intent.putExtra("EXTRA_IS_IN_RETRY_FLOW", false);
        this.f51392w.a(intent, null);
    }

    public final void ea() {
        a.a(f51376x).debug("Finishing activity with card refresh");
        i0 i0VarW = f0.w(this);
        x53.c cVar = o53.s0.f129406a;
        ge1.b.T(i0VarW, o.f168762a, null, new com.garmin.feature.garminpay.providers.gpay.ui.addcard.b(this, null), 2);
    }

    public final h fa() {
        return (h) this.f51387p.getValue();
    }

    public final void ga(br2.h hVar, gp2.c cVar) {
        a.a(f51376x).debug("replaceFragment: " + cVar);
        if (isFinishing()) {
            return;
        }
        androidx.fragment.app.v supportFragmentManager = getSupportFragmentManager();
        androidx.fragment.app.a aVarB = androidx.core.view.j.b(supportFragmentManager, supportFragmentManager);
        aVarB.l(R.id.add_card_fragment_container, hVar, cVar.name());
        aVarB.d(cVar.name());
        aVarB.s(true, true);
    }

    public final void ha(br2.h hVar, gp2.c cVar) {
        a.a(f51376x).debug("replaceFragment: " + cVar);
        if (isFinishing()) {
            return;
        }
        androidx.fragment.app.v supportFragmentManager = getSupportFragmentManager();
        androidx.fragment.app.a aVarB = androidx.core.view.j.b(supportFragmentManager, supportFragmentManager);
        aVarB.l(R.id.add_card_fragment_container, hVar, cVar.name());
        aVarB.s(true, true);
    }

    public final void ia(boolean z14, e23.a<Unit> aVar) {
        a.a(f51376x).debug("showCardPartiallyCreatedDialogIfNot: (" + this.f51385n + ", " + this.f51384m + ")");
        x(true);
        if (this.f51385n != g.CREATE_CREDIT_CARD_AND_CREDENTIAL || this.f51384m != gp2.e.CREDENTIAL_CREATED) {
            aVar.invoke();
            return;
        }
        br2.c cVar = br2.c.f19585a;
        String string = getResources().getString(z14 ? R.string.card_add_ecom_success_bank_fail : R.string.card_add_ecom_success_device_fail);
        string.getClass();
        cVar.c(this, string, new ap2.e(this, 6));
    }

    public final void ja(e23.a<Unit> aVar) {
        String str;
        a.a(f51376x).debug("showCardRetryDialog");
        if (fa().f11718x.get().booleanValue() || (str = this.f51379h) == null || str.length() == 0) {
            aVar.invoke();
            return;
        }
        fa().f11718x.set(Boolean.TRUE);
        String string = getString(R.string.more_card_details_title);
        string.getClass();
        String string2 = getString(R.string.additional_card_info_needed);
        string2.getClass();
        String string3 = getString(R.string.lbl_common_continue);
        string3.getClass();
        ca(string, string2, new p<>(string3, new ap2.c(this, 5)));
    }

    public final void ka(p<String, ? extends e23.p<? super DialogInterface, ? super Integer, Unit>> pVar) {
        String string = getString(R.string.verification_selection_failed);
        string.getClass();
        da(this, string, pVar);
    }

    public final void la() {
        a.a(f51376x).debug("showSomethingWentWrongDialog");
        eo2.d.f64794a.getClass();
        String string = g22.n.d(eo2.d.f64799f.get()) ? getString(R.string.ciq_purchase_prompt_return_to_connect_iq) : getString(R.string.common_button_ok);
        string.getClass();
        String string2 = g22.n.d(eo2.d.f64799f.get()) ? getString(R.string.epoch_try_again_msg) : getString(R.string.mobile_auth_msg_sign_in_attempt_failed);
        string2.getClass();
        br2.c cVar = br2.c.f19585a;
        String string3 = getString(R.string.something_went_wrong);
        string3.getClass();
        androidx.appcompat.app.e eVarQ = br2.c.q(cVar, this, string3, string2, new p(string, new ap2.c(this, 3)), null, null, false, PsExtractor.VIDEO_STREAM_MASK);
        if (eVarQ != null) {
            eVarQ.show();
        }
    }

    @Override // hn2.c, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        g gVar;
        gp2.b bVar;
        Object serializable;
        Object serializable2;
        super.onCreate(bundle);
        R9(R.layout.activity_fit_pay_add_card, hn2.c.a.NONE, null);
        f0.k(getOnBackPressedDispatcher(), this, new ap2.b(this, 11), 2);
        hn2.c.ba(this, Boolean.TRUE, null, null, 14);
        l2.a aVar = l2.f37135b;
        Intent intent = getIntent();
        aVar.getClass();
        Bundle bundleA = l2.a.a(intent);
        this.f51381j = bundleA != null ? bundleA.getBoolean("extra.launch.address.list") : false;
        Bundle bundleA2 = l2.a.a(getIntent());
        this.f51378g = bundleA2 != null ? Long.valueOf(bundleA2.getLong("device.unit.id", -1L)) : null;
        Bundle bundleA3 = l2.a.a(getIntent());
        this.f51379h = bundleA3 != null ? bundleA3.getString("extra.payment.card.id") : null;
        Bundle bundleA4 = l2.a.a(getIntent());
        this.f51380i = bundleA4 != null ? bundleA4.getString("extra.payment.card.image.url") : null;
        Bundle bundleA5 = l2.a.a(getIntent());
        this.f51382k = bundleA5 != null ? bundleA5.getString("extra.payment.card.type") : null;
        Bundle bundleA6 = l2.a.a(getIntent());
        this.f51383l = bundleA6 != null ? bundleA6.getBoolean("extra.is.in.retry.flow") : false;
        Bundle bundleA7 = l2.a.a(getIntent());
        if (bundleA7 != null) {
            if (Build.VERSION.SDK_INT >= 33) {
                serializable2 = bundleA7.getSerializable("extra.token.creation", g.class);
            } else {
                Object serializable3 = bundleA7.getSerializable("extra.token.creation");
                if (!(serializable3 instanceof g)) {
                    serializable3 = null;
                }
                serializable2 = (g) serializable3;
            }
            gVar = (g) serializable2;
        } else {
            gVar = null;
        }
        this.f51385n = gVar;
        Bundle bundleA8 = l2.a.a(getIntent());
        if (bundleA8 != null) {
            if (Build.VERSION.SDK_INT >= 33) {
                serializable = bundleA8.getSerializable("extra.add.card.init.action", gp2.b.class);
            } else {
                Object serializable4 = bundleA8.getSerializable("extra.add.card.init.action");
                if (!(serializable4 instanceof gp2.b)) {
                    serializable4 = null;
                }
                serializable = (gp2.b) serializable4;
            }
            bVar = (gp2.b) serializable;
        } else {
            bVar = null;
        }
        this.f51386o = bVar;
        if (this.f51381j) {
            fp2.a.f73187a.getClass();
            FitPayAddressManagementFragment.f51413t.getClass();
            ga(new FitPayAddressManagementFragment(), gp2.c.ADDRESS_MANAGEMENT_SCREEN);
        } else {
            h hVarFa = fa();
            ge1.b.T(v1.a(hVarFa), o53.s0.f129406a, null, new q(hVarFa, this.f51378g, this.f51385n, this.f51382k, null), 2);
            fa().f11705i.f(this, new c(new ap2.b(this, 14)));
        }
    }

    @Override // hn2.c, i.c, androidx.fragment.app.m, android.app.Activity
    public final void onDestroy() {
        this.f51389r.removeCallbacks(this.f51390t);
        dp2.b bVar = fa().f11699c.get();
        if (bVar != null) {
            bVar.b();
        }
        fa().f11699c.set(null);
        super.onDestroy();
    }

    @Override // androidx.fragment.app.m, android.app.Activity
    public final void onPause() {
        this.f51389r.removeCallbacks(this.f51390t);
        super.onPause();
    }

    @Override // hn2.c, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, android.app.Activity
    public final void onResume() {
        super.onResume();
        if (!this.f51383l || this.f51391v) {
            return;
        }
        Handler handler = this.f51389r;
        a0.c cVar = this.f51390t;
        handler.removeCallbacks(cVar);
        handler.postDelayed(cVar, 900000L);
    }

    @Override // android.app.Activity
    public final void onUserInteraction() {
        if (this.f51383l && !this.f51391v) {
            Handler handler = this.f51389r;
            a0.c cVar = this.f51390t;
            handler.removeCallbacks(cVar);
            handler.postDelayed(cVar, 900000L);
        }
        super.onUserInteraction();
    }

    @Override // yq2.a
    public final void v4(String str) {
        str.getClass();
        this.f51379h = str;
        h hVarFa = fa();
        ep2.a aVar = ep2.a.ECOM;
        aVar.getClass();
        ge1.b.T(v1.a(hVarFa), null, null, new u(hVarFa, str, aVar, null), 3);
    }

    @Override // yq2.a
    public final void x(boolean z14) {
        hn2.c.ba(this, Boolean.valueOf(z14), null, null, 10);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/garmin/feature/garminpay/providers/gpay/ui/addcard/FitPayAddCardActivity$a;", "", "<init>", "()V", "", "MENU_EDIT_ID", "I", "MENU_SELECT_ID", "MENU_ADD_ID", "MAX_REQUIRED_FIELD_LIST_SIZE", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static final Logger a(a aVar) {
            aVar.getClass();
            return (Logger) FitPayAddCardActivity.f51377y.getValue();
        }

        public static Intent b(Long l14, String str, String str2, String str3, g gVar, gp2.b bVar, boolean z14, String str4) {
            gVar.getClass();
            bVar.getClass();
            Intent intent = new Intent(((hn2.a) KoinJavaComponent.get$default(hn2.a.class, null, null, 6, null)).c(), (Class<?>) FitPayAddCardActivity.class);
            Bundle bundle = new Bundle();
            bundle.putLong("device.unit.id", l14 != null ? l14.longValue() : -1L);
            bundle.putString("extra.payment.card.id", str);
            bundle.putString("extra.payment.card.image.url", str2);
            bundle.putString("extra.payment.card.type", str3);
            bundle.putSerializable("extra.token.creation", gVar);
            bundle.putSerializable("extra.add.card.init.action", bVar);
            bundle.putBoolean("extra.is.in.retry.flow", z14);
            bundle.putString("extra.encrypted.card.info", str4);
            com.airbnb.lottie.animation.keyframe.a.q(l2.f37135b, intent, bundle);
            return intent;
        }

        public static /* synthetic */ Intent c(a aVar, Long l14, String str, String str2, String str3, g gVar, gp2.b bVar) {
            aVar.getClass();
            return b(l14, str, str2, str3, gVar, bVar, false, null);
        }

        private a() {
        }
    }
}
