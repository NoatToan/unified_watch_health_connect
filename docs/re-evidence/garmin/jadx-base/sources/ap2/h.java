package ap2;

import android.os.Build;
import androidx.lifecycle.u1;
import androidx.lifecycle.v1;
import androidx.lifecycle.y0;
import com.garmin.feature.garminpay.providers.gpay.NewFitPayException;
import ds.e0;
import java.text.DateFormatSymbols;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicReference;
import o53.c2;
import o53.l1;
import o53.s0;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.j0;
import zn2.g1;
import zn2.z;
import zn2.z0;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lap2/h;", "Landroidx/lifecycle/u1;", "Lto2/b;", "<init>", "()V", "a", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class h extends u1 implements to2.b {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final a f11695y = new a(null);

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final o13.t f11696z = o13.m.b(new ak0.t(11));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public z0 f11697a;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public fo2.s f11703g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f11704h;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y0<String> f11698b = new y0<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicReference<dp2.b> f11699c = new AtomicReference<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicReference<gp2.g> f11700d = new AtomicReference<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AtomicReference<String> f11701e = new AtomicReference<>();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final AtomicReference<List<ep2.g>> f11702f = new AtomicReference<>();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final y0<Boolean> f11705i = new y0<>();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final y0<gp2.f> f11706j = new y0<>();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final AtomicReference<yo2.b> f11707k = new AtomicReference<>();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final y0<List<zo2.a>> f11708l = new y0<>();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final y0<gp2.e> f11709m = new y0<>();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final y0<List<zo2.a>> f11710n = new y0<>();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final y0<o13.p<zo2.a, List<ep2.g>>> f11711o = new y0<>();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final y0<List<ep2.g>> f11712p = new y0<>();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y0<List<ep2.g>> f11713q = new y0<>();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final y0<List<ep2.b>> f11714r = new y0<>();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final AtomicReference<ep2.d> f11715t = new AtomicReference<>();

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final CopyOnWriteArrayList<l1> f11716v = new CopyOnWriteArrayList<>();

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final a4.b f11717w = new a4.b(this, 7);

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final AtomicReference<Boolean> f11718x = new AtomicReference<>(Boolean.FALSE);

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f11719a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f11720b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f11721c;

        static {
            int[] iArr = new int[gp2.g.values().length];
            try {
                iArr[gp2.g.VERIFY_CREDIT_CARD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[gp2.g.VERIFY_CREDENTIAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f11719a = iArr;
            int[] iArr2 = new int[z.values().length];
            try {
                iArr2[z.CREDIT_CARD_NOT_READY.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[z.DUPLICATE_CARD.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[z.MAX_CARD_LIMIT_REACHED.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[z.CREDIT_CARD_ISSUER_NOT_ELIGIBLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[z.CREATE_CREDIT_CARD_USER_ENTERED_BAD_DATA.ordinal()] = 5;
            } catch (NoSuchFieldError unused7) {
            }
            f11720b = iArr2;
            int[] iArr3 = new int[to2.c.values().length];
            try {
                iArr3[to2.c.CREDITCARD_CREATED.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            f11721c = iArr3;
        }
    }

    public static final void A4(h hVar, yo2.b bVar) {
        y0<gp2.f> y0Var = hVar.f11706j;
        com.airbnb.lottie.animation.keyframe.a.w("handleCreditCardResponse: card state: ", bVar != null ? bVar.getCardState() : null, a.a(f11695y));
        String cardState = bVar != null ? bVar.getCardState() : null;
        if (p005kotlin.jvm.internal.s.g(cardState, "ELIGIBLE")) {
            if (bVar.getDeviceUpdateOperation().getLink() == null) {
                y0Var.j(gp2.f.CARD_CREATED);
                return;
            } else {
                y0Var.j(gp2.f.DEVICE_REQUIRES_SE_UPDATE);
                return;
            }
        }
        if (p005kotlin.jvm.internal.s.g(cardState, "DELETED")) {
            gp2.f fVar = gp2.f.CARD_DELETED;
            fVar.f78496a = bVar.getStateReason();
            y0Var.j(fVar);
        }
    }

    /* JADX WARN: Code duplicated, block: B:46:0x0101  */
    /* JADX WARN: Code duplicated, block: B:59:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:8:0x0017  */
    public static final Object B4(h hVar, v13.c cVar) throws NewFitPayException {
        y yVar;
        Object objJ;
        hVar.getClass();
        if (cVar instanceof y) {
            yVar = (y) cVar;
            int i14 = yVar.f11806c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                yVar.f11806c = i14 - Integer.MIN_VALUE;
            } else {
                yVar = new y(hVar, cVar);
            }
        } else {
            yVar = new y(hVar, cVar);
        }
        y yVar2 = yVar;
        Object objU = yVar2.f11804a;
        Object obj = u13.a.COROUTINE_SUSPENDED;
        int i15 = yVar2.f11806c;
        a aVar = f11695y;
        Object obj2 = null;
        try {
            if (i15 != 0) {
                if (i15 == 1) {
                    o13.r.b(objU);
                } else if (i15 == 2) {
                    o13.r.b(objU);
                    a.a(aVar).debug("validateHostDevice: creating a host device");
                    yVar2.f11806c = 3;
                    a.a(aVar).debug("createHostDevice");
                    String str = null;
                    objJ = hVar.E4().f205979a.j(new fo2.t(str, zn2.h.PHONE, Build.MANUFACTURER, Build.MODEL, Build.VERSION.RELEASE, "Android", false, 1, null), yVar2);
                    if (objJ != u13.a.COROUTINE_SUSPENDED) {
                        objJ = Unit.INSTANCE;
                    }
                    if (objJ == obj) {
                        return obj;
                    }
                } else {
                    if (i15 != 3) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    o13.r.b(objU);
                }
                return Unit.INSTANCE;
            }
            o13.r.b(objU);
            a.a(aVar).debug("validateHostDevice");
            g1 g1Var = hVar.E4().f205979a;
            yVar2.f11806c = 1;
            objU = g1Var.u(yVar2);
            if (objU == obj) {
                return obj;
            }
            for (Object obj3 : (Iterable) objU) {
                if (((fo2.t) obj3).f73119g) {
                    obj2 = obj3;
                    break;
                }
            }
            fo2.t tVar = (fo2.t) obj2;
            if (tVar != null) {
                if (p005kotlin.jvm.internal.s.g(tVar.getDeviceName(), Build.MODEL) && p005kotlin.jvm.internal.s.g(tVar.getManufacturerName(), Build.MANUFACTURER)) {
                    a.a(aVar).debug("validateHostDevice: host device is available");
                    return Unit.INSTANCE;
                }
                g1 g1Var2 = hVar.E4().f205979a;
                yVar2.f11806c = 2;
                if (g1Var2.j0(tVar, yVar2) == obj) {
                    return obj;
                }
            }
        } catch (Exception e4) {
            e0.v("validateHostDevice: ", e4.getLocalizedMessage(), a.a(aVar));
            hVar.f11698b.j(e4.getMessage());
            Unit unit = Unit.INSTANCE;
        }
        a.a(aVar).debug("validateHostDevice: creating a host device");
        yVar2.f11806c = 3;
        a.a(aVar).debug("createHostDevice");
        String str2 = null;
        objJ = hVar.E4().f205979a.j(new fo2.t(str2, zn2.h.PHONE, Build.MANUFACTURER, Build.MODEL, Build.VERSION.RELEASE, "Android", false, 1, null), yVar2);
        if (objJ != u13.a.COROUTINE_SUSPENDED) {
            objJ = Unit.INSTANCE;
        }
        if (objJ == obj) {
            return obj;
        }
        return Unit.INSTANCE;
    }

    public static final void x4(h hVar, Exception exc) {
        y0<gp2.e> y0Var = hVar.f11709m;
        e0.v("handleCreateCredentialFailure: ", exc.getMessage(), a.a(f11695y));
        if ((exc instanceof NewFitPayException) && ((NewFitPayException) exc).getErrorFlag() == z.CREATE_CREDIT_CARD_USER_ENTERED_BAD_DATA) {
            y0Var.j(gp2.e.CREDENTIAL_NOT_CREATED_CLIENT_ERROR);
        } else {
            y0Var.j(gp2.e.CREDENTIAL_NOT_CREATED);
        }
    }

    public static final Object y4(h hVar, Exception exc) {
        y0<gp2.f> y0Var = hVar.f11706j;
        a aVar = f11695y;
        a.a(aVar).debug("handleCreateCreditCardFailure");
        if (exc instanceof NewFitPayException) {
            NewFitPayException newFitPayException = (NewFitPayException) exc;
            int i14 = b.f11720b[newFitPayException.getErrorFlag().ordinal()];
            if (i14 == 1) {
                a.a(aVar).warn("handleCreateCreditCardFailure: card is created but not ready, starting the poll jobs");
                Object extraData = newFitPayException.getExtraData();
                String str = extraData instanceof String ? (String) extraData : null;
                if (str != null) {
                    c2 c2VarH4 = hVar.H4(str);
                    return c2VarH4 == u13.a.COROUTINE_SUSPENDED ? c2VarH4 : Unit.INSTANCE;
                }
                a.a(aVar).error("handleCreateCreditCardFailure: return location missing from the header, can not continue poll");
                y0Var.j(gp2.f.CARD_CREATED_BUT_CAN_NOT_PROCEED_FURTHER);
                return Unit.INSTANCE;
            }
            if (i14 == 2) {
                a.a(aVar).error("handleCreateCreditCardFailure:  duplicate card error from the server");
                y0Var.j(gp2.f.DUPLICATE_CARD);
            } else if (i14 == 3) {
                y0Var.j(gp2.f.MAX_CARD_LIMIT_REACHED);
            } else if (i14 == 4) {
                a.a(aVar).error("handleCreateCreditCardFailure: credit card not eligible");
                y0Var.j(gp2.f.CARD_ISSUER_NOT_ELIGIBLE);
            } else if (i14 != 5) {
                a.a(aVar).error("handleCreateCreditCardFailure: failed to create credit card");
                y0Var.j(gp2.f.FAILURE_TO_CREATE_CREDIT_CARD);
            } else {
                a.a(aVar).error("handleCreateCreditCardFailure: the user has entered wrong data");
                gp2.f fVar = gp2.f.USER_ENTERED_BAD_DATA;
                fVar.f78496a = newFitPayException.getExtraData();
                y0Var.j(fVar);
            }
        } else {
            e0.v("handleCreateCreditCardFailure: other exception: ", exc.getMessage(), a.a(aVar));
            y0Var.j(gp2.f.FAILURE_TO_CREATE_CREDIT_CARD);
        }
        return Unit.INSTANCE;
    }

    public static final void z4(h hVar, ep2.d dVar) {
        hVar.getClass();
        com.airbnb.lottie.animation.keyframe.a.w("handleCredentialResponse: ", dVar != null ? dVar.getCom.google.firebase.remoteconfig.RemoteConfigConstants.ResponseFieldKey.STATE java.lang.String() : null, a.a(f11695y));
        boolean zG = p005kotlin.jvm.internal.s.g(dVar != null ? dVar.getCom.google.firebase.remoteconfig.RemoteConfigConstants.ResponseFieldKey.STATE java.lang.String() : null, "ACTIVE");
        y0<gp2.e> y0Var = hVar.f11709m;
        if (zG) {
            y0Var.j(gp2.e.CREDENTIAL_CREATED);
        } else {
            y0Var.j(gp2.e.CREDENTIAL_NOT_CREATED);
        }
    }

    public final List<ep2.g> C4() {
        List<ep2.g> listD = this.f11702f.get();
        if (listD == null && (listD = this.f11712p.d()) == null) {
            listD = this.f11713q.d();
        }
        if (listD != null) {
            List<ep2.b> listD2 = this.f11714r.d();
            String str = this.f11701e.get();
            Boolean bool = this.f11718x.get();
            bool.getClass();
            List<ep2.g> listW = gg.b.w(str, bool.booleanValue(), listD, listD2);
            if (listW != null) {
                return listW;
            }
        }
        return j0.f134944a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final ArrayList D4() {
        a aVar = f11695y;
        try {
            a.a(aVar).debug("getLocalizedMonths");
            ArrayList arrayList = new ArrayList();
            zn2.k.f205614a.getClass();
            o13.p pVarA = zn2.k.a();
            String[] months = new DateFormatSymbols(pVarA != null ? (Locale) pVarA.f128594a : null).getMonths();
            months.getClass();
            int i14 = 0;
            for (Object obj : p13.u.l0(months)) {
                int i15 = i14 + 1;
                if (i14 < 0) {
                    p13.x.q();
                    throw null;
                }
                String str = (String) obj;
                arrayList.add(new o13.p(str, (i14 < 9 ? "0" + i15 : String.valueOf(i15)) + " - " + str));
                i14 = i15;
            }
            return arrayList;
        } catch (Exception e4) {
            a.a(aVar).error("getLocalizedMonths: ", (Throwable) e4);
            this.f11698b.j(e4.getMessage());
            return null;
        }
    }

    public final z0 E4() {
        z0 z0Var = this.f11697a;
        if (z0Var != null) {
            return z0Var;
        }
        p005kotlin.jvm.internal.s.m("serviceProvider");
        throw null;
    }

    public final boolean F4() {
        gp2.g gVar = this.f11700d.get();
        int i14 = gVar == null ? -1 : b.f11719a[gVar.ordinal()];
        Object obj = null;
        if (i14 == 1) {
            List<ep2.g> listD = this.f11712p.d();
            if (listD != null) {
                for (Object obj2 : listD) {
                    if (((ep2.g) obj2).getName() == ep2.h.ADDRESS) {
                        obj = obj2;
                        break;
                    }
                }
                obj = (ep2.g) obj;
            }
            return obj != null;
        }
        if (i14 != 2) {
            return true;
        }
        List<ep2.g> listD2 = this.f11713q.d();
        if (listD2 != null) {
            for (Object obj3 : listD2) {
                if (((ep2.g) obj3).getName() == ep2.h.ADDRESS) {
                    obj = obj3;
                    break;
                }
            }
            obj = (ep2.g) obj;
        }
        return obj != null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object G4(v13.c cVar) {
        w wVar;
        if (cVar instanceof w) {
            wVar = (w) cVar;
            int i14 = wVar.f11794c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                wVar.f11794c = i14 - Integer.MIN_VALUE;
            } else {
                wVar = new w(this, cVar);
            }
        } else {
            wVar = new w(this, cVar);
        }
        Object obj = wVar.f11792a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = wVar.f11794c;
        a aVar2 = f11695y;
        try {
            if (i15 == 0) {
                o13.r.b(obj);
                a.a(aVar2).debug("refreshAllCachedCreditCardsSuspendable");
                g1 g1Var = E4().f205979a;
                wVar.f11794c = 1;
                if (g1.g0(g1Var, null, wVar, 7) == aVar) {
                    return aVar;
                }
            } else {
                if (i15 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                o13.r.b(obj);
            }
        } catch (Exception e4) {
            a.a(aVar2).error("refreshAllCachedCreditCardsSuspendable: error while refreshing cached cards ", (Throwable) e4);
            this.f11698b.j(e4.getMessage());
        }
        return Unit.INSTANCE;
    }

    public final c2 H4(String str) {
        c2 c2VarT = ge1.b.T(v1.a(this), s0.f129406a, null, new x(this, str, null), 2);
        wr.g.y("track (isActive?): ", c2VarT.isActive(), a.a(f11695y));
        this.f11716v.add(c2VarT);
        c2VarT.J(new a42.i(7, this, c2VarT));
        return c2VarT;
    }

    @Override // to2.b
    public final void Q3(to2.c cVar) {
        a.a(f11695y).debug("onSseEvent: " + cVar);
        if (b.f11721c[cVar.ordinal()] == 1) {
            ge1.b.T(v1.a(this), s0.f129406a, null, new p(this, null), 2);
        }
    }

    @Override // androidx.lifecycle.u1
    public final void onCleared() {
        a aVar = f11695y;
        a.a(aVar).debug("unregisterListener");
        super.onCleared();
        a.a(aVar).debug("unregisterListener");
        this.f11706j.k(this.f11717w);
        a.a(aVar).debug("unregisterForStreamEvents");
        String str = this.f11704h;
        if (str != null) {
            E4().f205982d.l(str, this);
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lap2/h$a;", "", "<init>", "()V", "", "CARD_POLL_INITIAL_DELAY_MILLIS", "J", "CARD_POLL_MAX_DELAY_MILLIS", "", "CARD_POLL_FACTOR_MILLIS", "D", "CARD_POLL_TIMEOUT_MILLIS", "", "TEST_CARD_DIGITS", "Ljava/lang/String;", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static final Logger a(a aVar) {
            aVar.getClass();
            return (Logger) h.f11696z.getValue();
        }

        private a() {
        }
    }
}
