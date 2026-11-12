package op2;

import com.garmin.android.apps.connectmobile.R;
import com.garmin.feature.garminpay.providers.gpay.snowball.CurrencyValue;
import d53.y;
import fo2.l0;
import java.util.List;
import o53.s0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.h0;
import ps2.w;
import w3.x;
import zn2.t;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lop2/h;", "Lyq2/b;", "<init>", "()V", "a", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class h implements yq2.b {
    static {
        new a(null);
    }

    @Override // yq2.b
    public final vr2.q a(fs2.a aVar) {
        String str;
        String strName;
        String shortDescription;
        String strB;
        CurrencyValue currencyValueA;
        fo2.m mVar;
        dValueOf = null;
        Double dValueOf = null;
        if (x.r(aVar)) {
            as2.g<l0, CurrencyValue> gVarA = aq2.k.a(aVar);
            l0 l0VarA = gVarA.a();
            as2.b<CurrencyValue> bVarB = gVarA.b();
            qs2.a aVarB = aq2.k.b(l0VarA.k().h());
            String str2 = aVar.f73429d;
            List<fo2.m> listB = l0VarA.k().g().b();
            if (listB == null || (mVar = (fo2.m) h0.I0(listB)) == null || (strB = mVar.b()) == null) {
                strB = "";
            }
            String extCardReference = l0VarA.k().getExtCardReference();
            as2.a aVarA = yr2.e.a(aVarB);
            if (bVarB != null && (currencyValueA = bVarB.a()) != null) {
                dValueOf = Double.valueOf(currencyValueA.a());
            }
            return new vr2.q(str2, strB, extCardReference, aVarA.b(dValueOf), aVar);
        }
        if (aVar.f73432g == qs2.g.PAYMENT_CARD) {
            zo2.a aVar2 = (zo2.a) fs2.a.f(aVar, zo2.a.class);
            return new vr2.q(aVar2 != null ? aVar2.getDisplayName() : null, aVar2 != null ? zo2.a.m(aVar2) : null, aVar.f73429d.length() > 0 ? "•••• ".concat(y.t0(4, aVar.f73429d)) : null, null, aVar);
        }
        yo2.b bVar = (yo2.b) fs2.a.f(aVar, yo2.b.class);
        if (bVar == null || (strValueOf = yo2.b.o(bVar, null, 2)) == null) {
            qs2.a aVar3 = aVar.f73428c;
            if (aVar3 != null) {
                String strValueOf = String.valueOf(aVar3.f147398c);
                str = strValueOf;
            } else {
                str = "";
            }
        } else {
            str = strValueOf;
        }
        String strConcat = aVar.f73429d.length() > 0 ? "•••• ".concat(y.t0(4, aVar.f73429d)) : null;
        if (bVar == null || (shortDescription = bVar.getShortDescription()) == null) {
            qs2.a aVar4 = aVar.f73428c;
            strName = aVar4 != null ? aVar4.name() : "";
        } else {
            strName = shortDescription;
        }
        return new vr2.q(strName, str, strConcat, null, aVar);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0031  */
    @Override // yq2.b
    public final Object b(fs2.a aVar, v13.i iVar) throws Throwable {
        ms2.d dVarG;
        if (!x.r(aVar)) {
            return Unit.INSTANCE;
        }
        l0 l0VarE = aq2.k.a(aVar).e();
        w wVar = w.f140538a;
        long j8 = aVar.f73431f;
        is2.b bVar = is2.b.FITPAY;
        wVar.getClass();
        ps2.n nVarI = w.i(j8);
        if (nVarI == null) {
            dVarG = null;
        } else {
            dVarG = nVarI.g(bVar);
            if (!(dVarG != null ? dVarG instanceof t : true)) {
                dVarG = null;
            }
        }
        t tVar = (t) dVarG;
        if (tVar == null) {
            return Unit.INSTANCE;
        }
        String credentialId = l0VarE.getCredentialId();
        x53.c cVar = s0.f129406a;
        Object objE0 = ge1.b.e0(x53.b.f189152a, new zn2.x(tVar, credentialId, true, null), iVar);
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        if (objE0 != aVar2) {
            objE0 = Unit.INSTANCE;
        }
        return objE0 == aVar2 ? objE0 : Unit.INSTANCE;
    }

    @Override // yq2.b
    public final yq2.b.a d(fs2.a aVar) {
        if (x.r(aVar)) {
            return new yq2.b.a(R.string.dialog_title_error, R.string.title_error_occurred);
        }
        vb.h.z("Never reach");
        return null;
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lop2/h$a;", "", "<init>", "()V", "", "NUMBER_OF_DISPLAYED_DIGITS", "I", "", "HIDDEN_DIGITS", "Ljava/lang/String;", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
