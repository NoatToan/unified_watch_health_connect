package com.garmin.feature.garminpay.providers.gpay.ui.cardverification;

import am.j;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import androidx.lifecycle.i0;
import androidx.lifecycle.v1;
import androidx.lifecycle.x1;
import androidx.lifecycle.z0;
import ap2.f;
import com.garmin.android.apps.connectmobile.R;
import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import com.nimbusds.jose.jwk.JWKParameterNames;
import e23.l;
import gp2.e;
import h0.r0;
import jk0.w;
import o13.h;
import o13.m;
import o13.p;
import o13.t;
import o53.c2;
import o53.f0;
import o53.s0;
import org.koin.java.KoinJavaComponent;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.n;
import p005kotlin.jvm.internal.s;
import u53.o;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u0005\u0006B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/garmin/feature/garminpay/providers/gpay/ui/cardverification/FitPayCardVerificationActivity;", "Lhn2/c;", "Lcom/garmin/feature/garminpay/providers/gpay/ui/cardverification/b;", "<init>", "()V", "b", "a", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class FitPayCardVerificationActivity extends hn2.c implements com.garmin.feature.garminpay.providers.gpay.ui.cardverification.b {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final b f51449m = new b(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final t f51450g = m.b(new w(7));

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Long f51451h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f51452i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f51453j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public e f51454k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public com.garmin.feature.garminpay.providers.gpay.ui.cardverification.a f51455l;

    public static final /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f51464a;

        static {
            int[] iArr = new int[com.garmin.feature.garminpay.providers.gpay.ui.cardverification.a.b.values().length];
            try {
                iArr[com.garmin.feature.garminpay.providers.gpay.ui.cardverification.a.b.CARD_VERIFIED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[com.garmin.feature.garminpay.providers.gpay.ui.cardverification.a.b.CARD_PROVISION_FAILED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f51464a = iArr;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class d implements z0, n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l f51465a;

        public d(l lVar) {
            lVar.getClass();
            this.f51465a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof z0) && (obj instanceof n)) {
                return s.g(getFunctionDelegate(), ((n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final h<?> getFunctionDelegate() {
            return this.f51465a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.z0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f51465a.invoke(obj);
        }
    }

    @Override // com.garmin.feature.garminpay.providers.gpay.ui.cardverification.b
    public final void P0(a aVar) {
        aVar.getClass();
        runOnUiThread(new r0(24, this, aVar));
    }

    public final Logger ca() {
        return (Logger) this.f51450g.getValue();
    }

    public final void da() {
        ca().debug("navigateWalletWithCardRefresh");
        i0 i0VarW = f0.w(this);
        x53.c cVar = s0.f129406a;
        ge1.b.T(i0VarW, o.f168762a, null, new jp2.c(this, null), 2);
    }

    public final void ea(com.garmin.feature.garminpay.providers.gpay.pushprovisioning.c.a aVar) {
        aVar.getClass();
        com.garmin.feature.garminpay.providers.gpay.pushprovisioning.c.f51190a.getClass();
        if (s.g(com.garmin.feature.garminpay.providers.gpay.pushprovisioning.c.f51192c.get(), Boolean.TRUE)) {
            com.garmin.feature.garminpay.providers.gpay.pushprovisioning.c.b(this, false, new i91.c(23, this, aVar));
        }
    }

    public final void fa(boolean z14) {
        String string = getString(R.string.dialog_title_error);
        string.getClass();
        String string2 = getString(R.string.verification_selection_failed);
        string2.getClass();
        String string3 = getString(R.string.lbl_ok);
        string3.getClass();
        androidx.appcompat.app.e eVarQ = br2.c.q(br2.c.f19585a, this, string, string2, new p(string3, new f(this, z14, 9)), null, null, false, PsExtractor.VIDEO_STREAM_MASK);
        if (eVarQ != null) {
            eVarQ.show();
        }
    }

    @Override // hn2.c, b.g, android.app.Activity
    public final void onBackPressed() {
        com.garmin.feature.garminpay.providers.gpay.pushprovisioning.c.f51190a.getClass();
        if (s.g(com.garmin.feature.garminpay.providers.gpay.pushprovisioning.c.f51192c.get(), Boolean.TRUE)) {
            com.garmin.feature.garminpay.providers.gpay.pushprovisioning.c.b(this, false, new jp2.b(this, 0));
        } else {
            super.onBackPressed();
        }
    }

    @Override // hn2.c, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        Object serializableExtra;
        c2 c2VarT;
        super.onCreate(bundle);
        R9(R.layout.fit_pay_card_verification_activity, hn2.c.a.BACK, getString(R.string.verify_identity));
        x(true);
        this.f51451h = Long.valueOf(getIntent().getLongExtra("device.unit.id", -1L));
        String stringExtra = getIntent().getStringExtra("extra.credit.card.id");
        int i14 = 2;
        if (stringExtra == null) {
            ca().error("onCreate: creditCardId is missing");
            br2.c.h(br2.c.f19585a, this, new jp2.b(this, i14), null, 4);
            return;
        }
        this.f51452i = stringExtra;
        this.f51453j = getIntent().getBooleanExtra("extra.is.credit.card.and.credential.flow", false);
        Intent intent = getIntent();
        if (Build.VERSION.SDK_INT >= 33) {
            serializableExtra = intent != null ? intent.getSerializableExtra("extra.credential.state", e.class) : null;
        } else {
            Object serializableExtra2 = intent != null ? intent.getSerializableExtra("extra.credential.state") : null;
            if (!(serializableExtra2 instanceof e)) {
                serializableExtra2 = null;
            }
            serializableExtra = (e) serializableExtra2;
        }
        this.f51454k = (e) serializableExtra;
        com.garmin.feature.garminpay.providers.gpay.ui.cardverification.a aVar = (com.garmin.feature.garminpay.providers.gpay.ui.cardverification.a) new x1(this).b(p005kotlin.jvm.internal.s0.f105811a.b(com.garmin.feature.garminpay.providers.gpay.ui.cardverification.a.class));
        Long l14 = this.f51451h;
        String str = this.f51452i;
        if (l14 == null || str == null) {
            c2VarT = null;
        } else {
            c2VarT = ge1.b.T(v1.a(aVar), s0.f129406a, null, new jp2.f(aVar, l14.longValue(), str, null), 2);
        }
        if (c2VarT == null) {
            ca().error("onCreate: deviceId or creditCard is null (" + this.f51451h + ", " + this.f51452i + ")");
            br2.c.h(br2.c.f19585a, this, new jp2.b(this, i14), null, 4);
            Unit unit = Unit.INSTANCE;
        }
        this.f51455l = aVar;
        aVar.f51475i.f(this, new d(new iz1.f(this, 10)));
    }

    @Override // hn2.c, i.c
    public final boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }

    @Override // com.garmin.feature.garminpay.providers.gpay.ui.cardverification.b
    public final void x(boolean z14) {
        hn2.c.ba(this, Boolean.valueOf(z14), null, null, 10);
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\b\u0004\u0005\u0006\u0007\b\t\n\u000bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\b\f\r\u000e\u000f\u0010\u0011\u0012\u0013¨\u0006\u0014"}, d2 = {"Lcom/garmin/feature/garminpay/providers/gpay/ui/cardverification/FitPayCardVerificationActivity$a;", "", "<init>", "()V", "f", "d", "a", "h", "c", "b", JWKParameterNames.RSA_EXPONENT, "g", "Lcom/garmin/feature/garminpay/providers/gpay/ui/cardverification/FitPayCardVerificationActivity$a$a;", "Lcom/garmin/feature/garminpay/providers/gpay/ui/cardverification/FitPayCardVerificationActivity$a$b;", "Lcom/garmin/feature/garminpay/providers/gpay/ui/cardverification/FitPayCardVerificationActivity$a$c;", "Lcom/garmin/feature/garminpay/providers/gpay/ui/cardverification/FitPayCardVerificationActivity$a$d;", "Lcom/garmin/feature/garminpay/providers/gpay/ui/cardverification/FitPayCardVerificationActivity$a$e;", "Lcom/garmin/feature/garminpay/providers/gpay/ui/cardverification/FitPayCardVerificationActivity$a$f;", "Lcom/garmin/feature/garminpay/providers/gpay/ui/cardverification/FitPayCardVerificationActivity$a$g;", "Lcom/garmin/feature/garminpay/providers/gpay/ui/cardverification/FitPayCardVerificationActivity$a$h;", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static abstract class a {

        /* JADX INFO: renamed from: com.garmin.feature.garminpay.providers.gpay.ui.cardverification.FitPayCardVerificationActivity$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/garmin/feature/garminpay/providers/gpay/ui/cardverification/FitPayCardVerificationActivity$a$a;", "Lcom/garmin/feature/garminpay/providers/gpay/ui/cardverification/FitPayCardVerificationActivity$a;", "", "appPackageName", "<init>", "(Ljava/lang/String;)V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class C1067a extends a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f51456a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1067a(String str) {
                super(null);
                str.getClass();
                this.f51456a = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C1067a) && s.g(this.f51456a, ((C1067a) obj).f51456a);
            }

            public final int hashCode() {
                return this.f51456a.hashCode();
            }

            public final String toString() {
                return j.m("AppNotInstalledDialog(appPackageName=", this.f51456a, ")");
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/feature/garminpay/providers/gpay/ui/cardverification/FitPayCardVerificationActivity$a$b;", "Lcom/garmin/feature/garminpay/providers/gpay/ui/cardverification/FitPayCardVerificationActivity$a;", "<init>", "()V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class b extends a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final b f51457a = new b();

            private b() {
                super(null);
            }

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public final int hashCode() {
                return 993362717;
            }

            public final String toString() {
                return "CodeEnteredIsExpiredErrorDialog";
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/feature/garminpay/providers/gpay/ui/cardverification/FitPayCardVerificationActivity$a$c;", "Lcom/garmin/feature/garminpay/providers/gpay/ui/cardverification/FitPayCardVerificationActivity$a;", "<init>", "()V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class c extends a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final c f51458a = new c();

            private c() {
                super(null);
            }

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof c);
            }

            public final int hashCode() {
                return -1082971348;
            }

            public final String toString() {
                return "ExceededCodeRetriesErrorDialog";
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/feature/garminpay/providers/gpay/ui/cardverification/FitPayCardVerificationActivity$a$d;", "Lcom/garmin/feature/garminpay/providers/gpay/ui/cardverification/FitPayCardVerificationActivity$a;", "<init>", "()V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class d extends a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final d f51459a = new d();

            private d() {
                super(null);
            }

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof d);
            }

            public final int hashCode() {
                return -334940123;
            }

            public final String toString() {
                return "IncorrectVerificationCodeErrorDialog";
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/feature/garminpay/providers/gpay/ui/cardverification/FitPayCardVerificationActivity$a$e;", "Lcom/garmin/feature/garminpay/providers/gpay/ui/cardverification/FitPayCardVerificationActivity$a;", "<init>", "()V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class e extends a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final e f51460a = new e();

            private e() {
                super(null);
            }

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof e);
            }

            public final int hashCode() {
                return 980988542;
            }

            public final String toString() {
                return "RemoveCardDialog";
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/feature/garminpay/providers/gpay/ui/cardverification/FitPayCardVerificationActivity$a$f;", "Lcom/garmin/feature/garminpay/providers/gpay/ui/cardverification/FitPayCardVerificationActivity$a;", "<init>", "()V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class f extends a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final f f51461a = new f();

            private f() {
                super(null);
            }

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof f);
            }

            public final int hashCode() {
                return -776492810;
            }

            public final String toString() {
                return "VerificationFailedErrorDialog";
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/feature/garminpay/providers/gpay/ui/cardverification/FitPayCardVerificationActivity$a$g;", "Lcom/garmin/feature/garminpay/providers/gpay/ui/cardverification/FitPayCardVerificationActivity$a;", "<init>", "()V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class g extends a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final g f51462a = new g();

            private g() {
                super(null);
            }

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof g);
            }

            public final int hashCode() {
                return -1629269013;
            }

            public final String toString() {
                return "VerificationMethodsFetchErrorDialog";
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/garmin/feature/garminpay/providers/gpay/ui/cardverification/FitPayCardVerificationActivity$a$h;", "Lcom/garmin/feature/garminpay/providers/gpay/ui/cardverification/FitPayCardVerificationActivity$a;", "", "shouldNavigateToWallet", "<init>", "(Z)V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class h extends a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final boolean f51463a;

            public h(boolean z14) {
                super(null);
                this.f51463a = z14;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof h) && this.f51463a == ((h) obj).f51463a;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.f51463a);
            }

            public final String toString() {
                return com.airbnb.lottie.animation.keyframe.a.g("VerificationSelectionFailedErrorDialog(shouldNavigateToWallet=", ")", this.f51463a);
            }
        }

        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/feature/garminpay/providers/gpay/ui/cardverification/FitPayCardVerificationActivity$b;", "", "<init>", "()V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static Intent a(Long l14, String str, boolean z14, e eVar) {
            Intent intent = new Intent(((hn2.a) KoinJavaComponent.get$default(hn2.a.class, null, null, 6, null)).c(), (Class<?>) FitPayCardVerificationActivity.class);
            intent.putExtra("device.unit.id", l14);
            intent.putExtra("extra.credit.card.id", str);
            intent.putExtra("extra.is.credit.card.and.credential.flow", z14);
            Intent intentPutExtra = intent.putExtra("extra.credential.state", eVar);
            intentPutExtra.getClass();
            return intentPutExtra;
        }

        private b() {
        }
    }
}
