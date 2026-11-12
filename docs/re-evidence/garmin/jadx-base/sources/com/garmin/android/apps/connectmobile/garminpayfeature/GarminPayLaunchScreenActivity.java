package com.garmin.android.apps.connectmobile.garminpayfeature;

import a61.i;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.appcompat.app.e;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.c;
import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import e23.l;
import g.h;
import ho0.g;
import hy.d;
import i3.e5;
import java.util.Timer;
import java.util.concurrent.atomic.AtomicReference;
import l73.k;
import o13.p;
import org.koin.java.KoinJavaComponent;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.q;
import u62.z;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\nB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/garminpayfeature/GarminPayLaunchScreenActivity;", "Lcom/garmin/android/apps/connectmobile/c;", "Lpi2/c;", "<init>", "()V", "Ljj0/a;", "event", "", "featureInitializationEventReceived", "(Ljj0/a;)V", "a", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class GarminPayLaunchScreenActivity extends c implements pi2.c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f35305d = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Logger f35306a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f35307b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f.c<Intent> f35308c;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class b extends q implements l<kj0.a.C2012a, Unit> {
        public b(Object obj) {
            super(1, obj, GarminPayLaunchScreenActivity.class, "initForAlipayIfNotInGarminPay", "initForAlipayIfNotInGarminPay(Lcom/garmin/android/apps/connectmobile/garminpayfeature/utils/GarminPayEntryContext$AlipayDeepLinkingEntry;)V", 0);
        }

        @Override // e23.l
        public final Unit invoke(kj0.a.C2012a c2012a) {
            kj0.a.C2012a c2012a2 = c2012a;
            c2012a2.getClass();
            GarminPayLaunchScreenActivity garminPayLaunchScreenActivity = (GarminPayLaunchScreenActivity) this.receiver;
            a aVar = GarminPayLaunchScreenActivity.f35305d;
            garminPayLaunchScreenActivity.getClass();
            kj0.c.f104941a.getClass();
            if (kj0.c.f104947g.get() != null) {
                br2.c cVar = br2.c.f19585a;
                String string = garminPayLaunchScreenActivity.getString(R.string.dialog_title_error);
                string.getClass();
                String string2 = garminPayLaunchScreenActivity.getString(R.string.garminpay_in_use_leave_and_initiate_again_message);
                string2.getClass();
                e eVarQ = br2.c.q(cVar, garminPayLaunchScreenActivity, string, string2, new p(garminPayLaunchScreenActivity.getString(R.string.lbl_ok), new ij0.c(garminPayLaunchScreenActivity, 0)), null, null, false, PsExtractor.VIDEO_STREAM_MASK);
                if (eVarQ != null) {
                    eVarQ.show();
                }
            } else {
                garminPayLaunchScreenActivity.ca(new kj0.a.C2012a(false, c2012a2.f104931b));
            }
            return Unit.INSTANCE;
        }
    }

    public GarminPayLaunchScreenActivity() {
        int i14 = gt2.c.f79010a;
        this.f35306a = gt2.b.f79005a.h("PAY#LaunchScreen");
        new Timer("GarminPayFeatureInitTimer", false);
        this.f35308c = registerForActivityResult(new h(), new i(this, 25));
    }

    public final void ca(kj0.a aVar) {
        kj0.c cVar = kj0.c.f104941a;
        cVar.getClass();
        kj0.c.f104947g.set(aVar);
        this.f35306a.trace("GarminPayFeatureUtils.garminPayEntryContext set " + aVar);
        oi2.a.f132270a.getClass();
        oi2.a.C2513a.b(this);
        kj0.c.a aVar2 = kj0.c.a.ON_RE_INIT;
        cVar.getClass();
        kj0.c.c(this, true, aVar2);
    }

    @k
    public final void featureInitializationEventReceived(jj0.a event) {
        event.getClass();
        kj0.c.f104941a.getClass();
        AtomicReference<kj0.e> atomicReference = kj0.c.f104945e;
        String str = "initialization status " + atomicReference.get();
        Logger logger = this.f35306a;
        logger.debug(str);
        Intent intent = event.f98947a;
        int i14 = 3;
        if (intent == null) {
            z.i("initialization retry count ", this.f35307b, logger);
            int i15 = this.f35307b;
            int i16 = 2;
            if (i15 >= 2) {
                br2.c.f19585a.p(this, new ij0.b(this, i16), new ij0.b(this, i14));
                return;
            } else {
                this.f35307b = i15 + 1;
                br2.c.f19585a.i(this, new ij0.b(this, 0), new ij0.b(this, 1));
                return;
            }
        }
        atomicReference.set(kj0.e.INITIALIZED);
        try {
            e5 e5Var = new e5(12);
            int i17 = w03.b.f181178a;
            new z03.h(e5Var).k(l13.a.f108327b).i(new d(new g(this, 25), i14), new d(this, 4));
            this.f35308c.a(intent, null);
        } catch (Exception e4) {
            logger.debug("startGarminPayFeature- exception: " + e4);
            kj0.c.f104941a.getClass();
            kj0.c.f104947g.set(null);
            logger.trace("GarminPayFeatureUtils.garminPayEntryContext set null");
        }
    }

    @Override // com.garmin.android.apps.connectmobile.z1, b.g, android.app.Activity
    public final void onBackPressed() {
        kj0.c.f104941a.getClass();
        kj0.c.f104947g.set(null);
        this.f35306a.trace("GarminPayFeatureUtils.garminPayEntryContext set null");
        super.onBackPressed();
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.gcm3_content_frame);
        wr2.p pVar = wr2.p.f186870a;
        Parcelable parcelable = null;
        String string = ((hn2.a) KoinJavaComponent.get$default(hn2.a.class, null, null, 6, null)).c().getString(R.string.maintenance_mode);
        string.getClass();
        pVar.getClass();
        if (wr2.p.b("general_app", string, false)) {
            e eVarF = br2.c.f19585a.f(this, new ij0.b(this, 6), new ij0.b(this, 7));
            if (eVarF != null) {
                eVarF.show();
                return;
            }
            return;
        }
        showProgressOverlay();
        Logger logger = this.f35306a;
        logger.debug("reInitializing GarminPay feature...");
        Intent intent = getIntent();
        if (Build.VERSION.SDK_INT < 33) {
            Parcelable parcelableExtra = intent != null ? intent.getParcelableExtra("extra.garminpay_entry_context") : null;
            parcelable = (kj0.a) (parcelableExtra instanceof kj0.a ? parcelableExtra : null);
        } else if (intent != null) {
            parcelable = (Parcelable) intent.getParcelableExtra("extra.garminpay_entry_context", kj0.a.class);
        }
        kj0.a aVar = (kj0.a) parcelable;
        if (aVar == null) {
            logger.error("Null GarminPayEntryContext passed to ");
            oi2.a.f132270a.getClass();
            oi2.a.C2513a.b(this);
            kj0.c cVar = kj0.c.f104941a;
            kj0.c.a aVar2 = kj0.c.a.ON_RE_INIT;
            cVar.getClass();
            kj0.c.c(this, true, aVar2);
            return;
        }
        if (!(aVar instanceof kj0.a.C2012a)) {
            ca(aVar);
            return;
        }
        kj0.a.C2012a c2012a = (kj0.a.C2012a) aVar;
        b bVar = new b(this);
        if (!c2012a.f104930a) {
            bVar.invoke(c2012a);
            return;
        }
        br2.c cVar2 = br2.c.f19585a;
        String string2 = getString(R.string.alipay_applet_download_dialog_title);
        string2.getClass();
        String string3 = getString(R.string.alipay_applet_download_dialog_message);
        string3.getClass();
        e eVarQ = br2.c.q(cVar2, this, string2, string3, new p(getString(R.string.lbl_common_continue), new i20.b(9, bVar, c2012a)), new p(getString(R.string.not_now_lbl), new ij0.c(this, 1)), null, false, 224);
        if (eVarQ != null) {
            eVarQ.show();
        }
    }

    @Override // i.c, androidx.fragment.app.m, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        hideProgressOverlay();
        oi2.a.f132270a.getClass();
        oi2.a.C2513a.c(this);
    }

    @Override // com.garmin.android.apps.connectmobile.c, i.c, androidx.fragment.app.m, android.app.Activity
    public final void onStart() {
        super.onStart();
        zf.b.r();
        gh2.i iVar = gh2.i.f77458c;
        long jG = iVar.a().f77477b.g("garmin_pay_maint_start");
        long jG2 = iVar.a().f77477b.g("garmin_pay_maint_end");
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jG > jCurrentTimeMillis || jG2 < jCurrentTimeMillis) {
            return;
        }
        br2.c cVar = br2.c.f19585a;
        ij0.b bVar = new ij0.b(this, 4);
        ij0.b bVar2 = new ij0.b(this, 5);
        cVar.getClass();
        String string = getString(R.string.wallet_concept);
        string.getClass();
        String string2 = getString(R.string.garmin_pay_maintenance_description);
        string2.getClass();
        String string3 = getString(R.string.lbl_ok);
        string3.getClass();
        String string4 = getString(R.string.lbl_cancel);
        string4.getClass();
        e eVarQ = br2.c.q(cVar, this, string, string2, new p(string3, new a61.d(bVar, 21)), new p(string4, new a61.d(bVar2, 22)), null, false, 224);
        if (eVarQ != null) {
            eVarQ.show();
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/garminpayfeature/GarminPayLaunchScreenActivity$a;", "", "<init>", "()V", "", "EXTRA_GARMINPAY_ENTRY_CONTEXT", "Ljava/lang/String;", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        public static Intent a(Context context, kj0.a aVar) {
            context.getClass();
            aVar.getClass();
            Intent intentPutExtra = new Intent(context, (Class<?>) GarminPayLaunchScreenActivity.class).putExtra("extra.garminpay_entry_context", aVar);
            intentPutExtra.getClass();
            return intentPutExtra;
        }

        private a() {
        }
    }
}
