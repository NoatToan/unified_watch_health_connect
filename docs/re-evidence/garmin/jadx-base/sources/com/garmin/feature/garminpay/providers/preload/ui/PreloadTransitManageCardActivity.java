package com.garmin.feature.garminpay.providers.preload.ui;

import a13.j;
import a13.l;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.garminpay.database.GarminPayCoreDatabase;
import d13.i;
import d13.k;
import d13.o;
import d13.p;
import e13.m;
import hn2.c;
import is2.b;
import java.io.Serializable;
import l3.p1;
import lp2.h;
import lq2.d;
import lq2.e;
import org.koin.java.KoinJavaComponent;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import ps2.n;
import ps2.w;
import q03.g;
import q03.q;
import q03.r;
import q03.v;
import x03.f;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/feature/garminpay/providers/preload/ui/PreloadTransitManageCardActivity;", "Lhn2/c;", "<init>", "()V", "a", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class PreloadTransitManageCardActivity extends c {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final a f51737l = new a(null);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final Logger f51738m;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public b f51739g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f51740h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final s03.a f51741i = new s03.a();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e f51742j = new e();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final lq2.c f51743k = new lq2.c(this);

    static {
        int i14 = gt2.c.f79010a;
        f51738m = gt2.b.f79005a.h("PAY#PR#PreloadTransitManageCardActivity");
    }

    @Override // hn2.c, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        R9(R.layout.activity_preload_manage_card, c.a.BACK, getString(R.string.wallet_card_detail));
        try {
            Intent intent = getIntent();
            Serializable serializableExtra = null;
            if (Build.VERSION.SDK_INT < 33) {
                Serializable serializableExtra2 = intent != null ? intent.getSerializableExtra("extra.garminpay.EXTRA_PROVIDER_TYPE") : null;
                if (serializableExtra2 instanceof b) {
                    serializableExtra = serializableExtra2;
                }
                serializableExtra = (b) serializableExtra;
            } else if (intent != null) {
                serializableExtra = intent.getSerializableExtra("extra.garminpay.EXTRA_PROVIDER_TYPE", b.class);
            }
            serializableExtra.getClass();
            this.f51739g = (b) serializableExtra;
            Bundle extras = getIntent().getExtras();
            extras.getClass();
            this.f51740h = extras.getLong("com.garmin.android.apps.EXTRA_UNIT_ID");
            RecyclerView recyclerView = (RecyclerView) findViewById(R.id.card_details_recycler_view);
            recyclerView.setLayoutManager(new LinearLayoutManager(this));
            recyclerView.setAdapter(this.f51743k);
            recyclerView.setHasFixedSize(true);
        } catch (Exception e4) {
            f51738m.error("Error entering manage preload transit card page", (Throwable) e4);
            finish();
        }
    }

    @Override // androidx.fragment.app.m, android.app.Activity
    public final void onPause() {
        super.onPause();
        this.f51741i.e();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // hn2.c, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, android.app.Activity
    public final void onResume() throws Exception {
        b83.a lVar;
        r rVarD;
        super.onResume();
        b bVar = this.f51739g;
        if (bVar == null) {
            s.m("serviceProviderType");
            throw null;
        }
        e eVar = this.f51742j;
        eVar.getClass();
        o oVarA = eVar.a(bVar);
        int i14 = 9;
        h hVar = new h(new lq1.a(6), i14);
        int i15 = w03.b.f181178a;
        c13.a aVar = new c13.a(new i(oVarA, hVar), new h(new p1(21, eVar, bVar), 10), false);
        q qVar = l13.a.f108327b;
        int i16 = 4;
        y03.i iVarD = aVar.g(qVar).d(new h(new lq2.a(this, 0), i16), new h(new lq1.a(i16), 5));
        s03.a aVar2 = this.f51741i;
        aVar2.a(iVarD);
        b bVar2 = this.f51739g;
        if (bVar2 == null) {
            s.m("serviceProviderType");
            throw null;
        }
        long j8 = this.f51740h;
        GarminPayCoreDatabase.b bVar3 = GarminPayCoreDatabase.f52316a;
        Context contextC = ((hn2.a) KoinJavaComponent.get$default(hn2.a.class, null, null, 6, null)).c();
        bVar3.getClass();
        g gVarE = GarminPayCoreDatabase.b.a(contextC).e().e(j8, bVar2.name());
        hq2.r rVar = null;
        int i17 = 8;
        h hVar2 = new h(new lq1.a(7), i17);
        int i18 = g.f142048a;
        w03.b.b(i18, "bufferSize");
        if (gVarE instanceof f) {
            T tCall = ((f) gVarE).call();
            lVar = tCall == 0 ? a13.b.f414b : new j(tCall, hVar2);
        } else {
            lVar = new l(gVarE, hVar2, i18, false);
        }
        lVar.getClass();
        k kVar = new k(lVar);
        o oVar = new o(new i(eVar.a(bVar2), new h(new lq1.a(i17), 11)), new h(new lq1.a(i14), 12));
        v mVar = new m(new d(j8, 0));
        q03.o oVarB = mVar instanceof x03.b ? ((x03.b) mVar).b() : new e13.v(mVar);
        hc0.c cVar = new hc0.c(25, eVar, bVar2);
        w03.a.f fVar = w03.a.f181170a;
        w03.a.b bVar4 = new w03.a.b(cVar);
        int i19 = 3;
        int i24 = 1;
        int i25 = 2;
        w03.b.b(i18, "bufferSize");
        d13.v vVarG = new d13.b(new q03.o[]{kVar, oVar, oVarB}, null, bVar4, i18 << 1, false).g(qVar);
        q qVarA = r03.a.a();
        w03.b.b(i18, "bufferSize");
        aVar2.a(new p(vVarG, qVarA, false, i18).d(new h(new lq2.a(this, i24), 6), new h(new lq1.a(5), i24)));
        w wVar = w.f140538a;
        long j14 = this.f51740h;
        wVar.getClass();
        n nVarI = w.i(j14);
        if ((nVarI != null ? nVarI.h() : null) != hs2.b.READY) {
            f51738m.debug("Transit card is not ready for update. Showing the cached result.");
            return;
        }
        b bVar5 = this.f51739g;
        if (bVar5 == null) {
            s.m("serviceProviderType");
            throw null;
        }
        n nVarI2 = w.i(this.f51740h);
        ms2.d dVarG = nVarI2 != null ? nVarI2.g(bVar5) : null;
        if (dVarG instanceof hq2.r) {
            rVar = (hq2.r) dVarG;
        }
        if (rVar != null) {
            rVarD = rVar.u();
        } else {
            rVarD = r.d(new IllegalArgumentException("Service provider [" + bVar5 + "] not found."));
        }
        aVar2.a(rVarD.j(qVar).h(new h(new lq1.a(i25), i25), new h(new lq1.a(i19), i19)));
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/garmin/feature/garminpay/providers/preload/ui/PreloadTransitManageCardActivity$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "Lorg/slf4j/Logger;", "LOGGER", "Lorg/slf4j/Logger;", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static Intent a(Context context, b bVar, long j8) {
            context.getClass();
            Intent intent = new Intent(context, (Class<?>) PreloadTransitManageCardActivity.class);
            intent.putExtra("extra.garminpay.EXTRA_PROVIDER_TYPE", bVar);
            intent.putExtra("com.garmin.android.apps.EXTRA_UNIT_ID", j8);
            return intent;
        }

        private a() {
        }
    }
}
