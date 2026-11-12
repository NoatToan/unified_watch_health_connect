package co2;

import android.content.Context;
import aq2.k;
import as2.b;
import as2.g;
import com.garmin.feature.garminpay.providers.gpay.snowball.CurrencyValue;
import com.garmin.garminpay.database.GarminPayCoreDatabase;
import fo2.e;
import fo2.l0;
import java.util.List;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s0;
import p13.h0;
import qs2.f;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lco2/a;", "", "Les2/a;", "walletItemsDAO", "<init>", "(Les2/a;)V", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final es2.a f28192a;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ a(es2.a aVar, int i14, j jVar) {
        if ((i14 & 1) != 0) {
            GarminPayCoreDatabase.b bVar = GarminPayCoreDatabase.f52316a;
            Context contextC = ((hn2.a) KoinJavaComponent.get$default(hn2.a.class, null, null, 6, null)).c();
            bVar.getClass();
            aVar = GarminPayCoreDatabase.b.a(contextC).e();
        }
        this(aVar);
    }

    public final void a(long j8, l0 l0Var) {
        g gVar;
        fs2.a aVar;
        l0Var.getClass();
        String credentialId = l0Var.getCredentialId();
        credentialId.getClass();
        es2.a aVar2 = this.f28192a;
        List<fs2.a> listK = aVar2.k(credentialId);
        g<l0, CurrencyValue> gVarA = (listK == null || (aVar = (fs2.a) h0.K0(listK)) == null) ? null : k.a(aVar);
        b<CurrencyValue> bVarD = gVarA != null ? gVarA.d() : null;
        fs2.a aVar3 = new fs2.a();
        aVar3.h(l0Var.getCredentialId());
        aVar3.f73427b = is2.b.FITPAY;
        aVar3.f73428c = k.b(l0Var.k().h());
        aVar3.g(l0Var.k().getProductName());
        aVar3.f73431f = j8;
        aVar3.f73433h = l0Var.getState() == e.ACTIVE ? f.ACTIVE : f.ERROR;
        aVar3.j(l0Var.getCredentialId());
        aVar3.f73436k = System.currentTimeMillis();
        if (bVarD != null) {
            gVar = new g(l0Var, bVarD);
        } else {
            s0.f105811a.b(CurrencyValue.class);
            gVar = new g(l0Var, null);
        }
        aq2.j.f12491a.getClass();
        String json = aq2.j.d().toJson(gVar);
        json.getClass();
        aVar3.f73435j = json;
        w13.b.l(aVar2, aVar3);
    }

    public a(es2.a aVar) {
        aVar.getClass();
        this.f28192a = aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public a() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
