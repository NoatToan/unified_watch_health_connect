package com.garmin.feature.garminpay.providers.gpay.ui.issuertermsconditions;

import a73.h;
import androidx.lifecycle.u1;
import androidx.lifecycle.v1;
import androidx.lifecycle.y0;
import c83.a0;
import com.garmin.feature.garminpay.providers.gpay.NewFitPayException;
import e13.n;
import fo2.l;
import fo2.p;
import iz1.g;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicReference;
import o53.c2;
import o53.l1;
import o53.s0;
import okhttp3.Response;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import q03.r;
import v13.i;
import zn2.g1;
import zn2.t;
import zn2.u0;
import zn2.z0;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u0005\u0006B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/garmin/feature/garminpay/providers/gpay/ui/issuertermsconditions/b;", "Landroidx/lifecycle/u1;", "Lto2/b;", "<init>", "()V", "a", "b", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b extends u1 implements to2.b {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final Logger f51610n;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public t f51611a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f51612b;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public z0 f51620j;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final y0<EnumC1070b> f51613c = new y0<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final y0<Boolean> f51614d = new y0<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final y0<Boolean> f51615e = new y0<>();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final y0<String> f51616f = new y0<>();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final y0<yo2.b> f51617g = new y0<>();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final y0<List<ep2.b>> f51618h = new y0<>();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final AtomicReference<dp2.b> f51619i = new AtomicReference<>();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final s03.a f51621k = new s03.a();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final CopyOnWriteArrayList<l1> f51622l = new CopyOnWriteArrayList<>();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final g f51623m = new g(this, 16);

    public static final /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f51638a;

        static {
            int[] iArr = new int[to2.c.values().length];
            try {
                iArr[to2.c.CREDITCARD_ACTIVATED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[to2.c.CREDITCARD_PENDING_VERIFICATION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[to2.c.CREDITCARD_DELETED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[to2.c.CREDITCARD_PROVISION_FAILED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f51638a = iArr;
        }
    }

    static {
        new a(null);
        int i14 = gt2.c.f79010a;
        f51610n = gt2.b.f79005a.h("PAY#NEW_FITPAY#FitPayIssuerTermsConditionViewModel");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final n x4(b bVar, String str) throws NewFitPayException {
        bVar.A4().f205979a.getClass();
        u0.f205864a.getClass();
        h hVar = new h(str, 14);
        int i14 = w03.b.f181178a;
        a0 a0Var = (a0) new e13.b(hVar).c();
        Response response = a0Var.f25745a;
        Object obj = a0Var.f25746b;
        if (response.isSuccessful()) {
            l lVar = (l) obj;
            if (lVar != null) {
                return r.f(lVar);
            }
            throw new NewFitPayException("getAcceptTermsConditionLink: received null response from the server", null, null, 6, null);
        }
        throw new NewFitPayException("getAcceptTermsConditionLink: received failed response from the platform code: " + a0Var.f25745a.code() + ", body: " + obj, null, null, 6, null);
    }

    public static final Object y4(b bVar) {
        bVar.getClass();
        f51610n.debug("handleAcceptTermsSuccess");
        CopyOnWriteArrayList<l1> copyOnWriteArrayList = bVar.f51622l;
        for (l1 l1Var : copyOnWriteArrayList) {
            l1Var.getClass();
            l1Var.c(null);
        }
        c2 c2VarT = ge1.b.T(v1.a(bVar), s0.f129406a, null, new f(bVar, null), 2);
        copyOnWriteArrayList.add(c2VarT);
        c2VarT.J(new rk0.g(4, bVar, c2VarT));
        return c2VarT == u13.a.COROUTINE_SUSPENDED ? c2VarT : Unit.INSTANCE;
    }

    public static final Object z4(b bVar, i iVar) {
        p creditCardLink;
        g1 g1Var = bVar.A4().f205979a;
        yo2.b bVarD = bVar.f51617g.d();
        return g1Var.p((bVarD == null || (creditCardLink = bVarD.getCreditCardLink()) == null) ? null : creditCardLink.getLink(), iVar);
    }

    public final z0 A4() {
        z0 z0Var = this.f51620j;
        if (z0Var != null) {
            return z0Var;
        }
        s.m("serviceProvider");
        throw null;
    }

    public final void B4() {
        if (this.f51620j == null || this.f51611a == null) {
            return;
        }
        to2.a aVar = A4().f205982d;
        t tVar = this.f51611a;
        if (tVar != null) {
            aVar.l(tVar.f205819e.f205629a.f73101a, this);
        } else {
            s.m("deviceServiceProvider");
            throw null;
        }
    }

    @Override // to2.b
    public final void Q3(to2.c cVar) {
        Logger logger = f51610n;
        logger.debug("onSseEvent: " + cVar);
        com.airbnb.lottie.animation.keyframe.a.w("onSseEvent - reason: ", cVar.f165896b, logger);
        int i14 = c.f51638a[cVar.ordinal()];
        y0<EnumC1070b> y0Var = this.f51613c;
        if (i14 == 1) {
            y0Var.j(EnumC1070b.CARD_ACTIVATED);
            return;
        }
        if (i14 == 2) {
            y0Var.j(EnumC1070b.CARD_IN_PENDING_VERIFICATION);
            return;
        }
        if (i14 == 3) {
            y0Var.j(EnumC1070b.CARD_DELETED);
            return;
        }
        if (i14 != 4) {
            logger.debug("onSseEvent -> " + cVar + " not handled");
            return;
        }
        EnumC1070b enumC1070b = EnumC1070b.CARD_PROVISION_FAILED;
        String str = cVar.f165896b;
        if (str != null) {
            enumC1070b.f51637a = str;
        }
        y0Var.j(enumC1070b);
    }

    @Override // androidx.lifecycle.u1
    public final void onCleared() {
        super.onCleared();
        this.f51613c.k(this.f51623m);
        B4();
        this.f51621k.dispose();
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\tR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\t¨\u0006\u000f"}, d2 = {"Lcom/garmin/feature/garminpay/providers/gpay/ui/issuertermsconditions/b$a;", "", "<init>", "()V", "Lorg/slf4j/Logger;", "LOGGER", "Lorg/slf4j/Logger;", "", "POLL_INITIAL_DELAY_MILLIS", "J", "POLL_MAX_DELAY_MILLIS", "", "POLL_FACTOR_MILLIS", "D", "CARD_PROVISION_POLL_TIMEOUT_MILLIS", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: com.garmin.feature.garminpay.providers.gpay.ui.issuertermsconditions.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0015\b\u0002\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/garmin/feature/garminpay/providers/gpay/ui/issuertermsconditions/b$b;", "", "", "data", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public enum EnumC1070b {
        CARD_PROVISION_FAILED(null, 1, null),
        CARD_NOT_ELIGIBLE(null, 1, null),
        CARD_ACTIVATED(null, 1, null),
        CARD_IN_PENDING_VERIFICATION(null, 1, null),
        FAILED_TO_ACCEPT_TERMS(null, 1, null),
        FAILED_TO_ACCEPT_TERMS_NO_FURTHER_ACTION(null, 1, null),
        FAILED_TO_RETRIEVE_CARD(null, 1, null),
        FAILED_TO_RETRIEVE_TERMS_AND_CONDITIONS(null, 1, null),
        CARD_PROVISION_COMPLETE(null, 1, null),
        CARD_PROVISION_TIMEOUT(null, 1, null),
        CARD_DELETED(null, 1, null),
        CLIENT_CARD_DETAILS_RETRY(null, 1, null);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f51637a;

        /* synthetic */ EnumC1070b(String str, int i14, j jVar) {
            this((i14 & 1) != 0 ? null : str);
        }

        EnumC1070b(String str) {
            this.f51637a = str;
        }
    }
}
