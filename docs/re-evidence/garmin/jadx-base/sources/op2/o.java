package op2;

import android.annotation.SuppressLint;
import androidx.lifecycle.y0;
import fo2.u;
import java.util.List;
import java.util.Locale;
import o13.r;
import o53.b0;
import o53.c0;
import o53.s0;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.j0;
import zn2.f1;
import zn2.g1;
import zn2.t;
import zn2.z0;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lop2/o;", "Lhr2/c;", "<init>", "()V", "a", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class o extends hr2.c {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final Logger f133246i;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public z0 f133247e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public t f133248f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final y0<String> f133249g = new y0<>();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final u53.d f133250h = c0.h(c0.a(s0.f129406a), ge1.b.h());

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.feature.garminpay.providers.gpay.ui.common.NewFitPayWebPresenterViewModel$setupViewModel$1", f = "NewFitPayWebPresenterViewModel.kt", l = {70}, m = "invokeSuspend", v = 2)
    public static final class b extends v13.i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f133251a;

        public b(t13.d<? super b> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return o.this.new b(dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            String language;
            is2.a nfcInfo;
            g1 g1Var;
            u uVar;
            String str;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f133251a;
            if (i14 == 0) {
                r.b(obj);
                o oVar = o.this;
                y0<String> y0Var = oVar.f133249g;
                Logger logger = o.f133246i;
                logger.debug("generateWebUrl");
                hr2.a aVar2 = oVar.f85298a;
                String strV = null;
                if (aVar2 == null) {
                    logger.error("generateWebUrl: can not setup WV config, isServiceProviderNull:  isProviderDataModelNull: " + (aVar2 == null));
                } else {
                    String str2 = aVar2.f85291d;
                    ms2.d dVar = oVar.f85300c;
                    hs2.a f78511c = dVar != null ? dVar.getF78511c() : null;
                    kj0.b.f104940a.getClass();
                    zi2.a aVarA = kj0.b.a();
                    aq2.j.f12491a.getClass();
                    String strB = aq2.j.b(aVarA);
                    z0 z0Var = oVar.f133247e;
                    String str3 = (z0Var == null || (g1Var = z0Var.f205979a) == null || (uVar = g1Var.f205530e) == null || (str = uVar.getCom.google.android.exoplayer2.text.ttml.TtmlNode.ATTR_ID java.lang.String()) == null) ? "" : str;
                    String f12510g = aq2.j.a(aVarA).getF12510g();
                    zn2.k.f205614a.getClass();
                    o13.p pVarA = zn2.k.a();
                    if (pVarA == null || (language = (String) pVarA.f128595b) == null) {
                        language = Locale.ENGLISH.getLanguage();
                    }
                    String str4 = language;
                    str4.getClass();
                    String str5 = (String) aq2.j.f12492b.getValue();
                    f1.f205508a.getClass();
                    String strB2 = f1.b();
                    String str6 = strB2 == null ? "" : strB2;
                    sl2.f nfcChipType = (f78511c == null || (nfcInfo = f78511c.getNfcInfo()) == null) ? null : nfcInfo.getNfcChipType();
                    Integer numValueOf = f78511c != null ? Integer.valueOf(f78511c.getFirmwareVersion()) : null;
                    Integer numValueOf2 = f78511c != null ? Integer.valueOf(f78511c.getProductNumber()) : null;
                    hr2.a aVar3 = oVar.f85298a;
                    aVar3.getClass();
                    sd2.f fVar = aVar3.f85290c;
                    String softwareVersion = fVar.getSoftwareVersion();
                    String str7 = softwareVersion == null ? "" : softwareVersion;
                    String softwareVersion2 = fVar.getSoftwareVersion();
                    String strA = new cq2.a(str3, true, strB, "https://static.garmincdn.com/com.garmin.connect/ui/css/pay-fitpay-v2.2-min.css", f12510g, str4, str5, str6, false, null, false, false, new cq2.b("WATCH", "GARMIN", fVar.getProductDisplayName(), str7, "Garmin OS", fVar.getProductNumber(), fVar.getProductNumber(), null, softwareVersion2 == null ? "" : softwareVersion2, "", "", fVar.d0(), null, null, null, null, 61568, null), nfcChipType, numValueOf, numValueOf2, null, 69376, null).a();
                    if (str2 == null || str2.length() == 0) {
                        logger.error("generateWebUrl: url suffix is null can not generate url");
                    } else {
                        strV = d53.u.v(str2, "{config}", strA, false);
                        logger.debug("generateWebUrl: ".concat(strV));
                    }
                }
                y0Var.j(strV);
                this.f133251a = 1;
                if (o.y4(oVar, this) == aVar) {
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

    static {
        new a(null);
        int i14 = gt2.c.f79010a;
        f133246i = gt2.b.f79005a.h("PAY#NEW_FITPAY#NewFitPayWebPresenterViewModel");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object y4(o oVar, v13.c cVar) {
        q qVar;
        hs2.d f78509a;
        oVar.getClass();
        if (cVar instanceof q) {
            qVar = (q) cVar;
            int i14 = qVar.f133258d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                qVar.f133258d = i14 - Integer.MIN_VALUE;
            } else {
                qVar = new q(oVar, cVar);
            }
        } else {
            qVar = new q(oVar, cVar);
        }
        Object objE0 = qVar.f133256b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = qVar.f133258d;
        if (i15 == 0) {
            r.b(objE0);
            qVar.f133255a = oVar;
            qVar.f133258d = 1;
            t tVar = oVar.f133248f;
            String strName = tVar != null ? tVar.f205815a.name() : null;
            ms2.d dVar = oVar.f85300c;
            Long l14 = (dVar == null || (f78509a = dVar.getF78509a()) == null) ? null : new Long(f78509a.getF99647a());
            objE0 = (strName == null || l14 == null) ? j0.f134944a : ge1.b.e0(oVar.f133250h.f168725a, new p(strName, l14, null), qVar);
            if (objE0 == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            oVar = qVar.f133255a;
            r.b(objE0);
        }
        ((List) objE0).size();
        oVar.getClass();
        return Unit.INSTANCE;
    }

    @Override // androidx.lifecycle.u1
    public final void onCleared() {
        super.onCleared();
        c0.c(this.f133250h, null);
    }

    @Override // hr2.c
    @SuppressLint({"CheckResult"})
    public final void x4(hr2.a aVar) {
        super.x4(aVar);
        ms2.g gVar = this.f85299b;
        this.f133247e = gVar instanceof z0 ? (z0) gVar : null;
        ms2.d dVar = this.f85300c;
        this.f133248f = dVar instanceof t ? (t) dVar : null;
        ge1.b.T(this.f133250h, null, null, new b(null), 3);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lop2/o$a;", "", "<init>", "()V", "Lorg/slf4j/Logger;", "LOGGER", "Lorg/slf4j/Logger;", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
