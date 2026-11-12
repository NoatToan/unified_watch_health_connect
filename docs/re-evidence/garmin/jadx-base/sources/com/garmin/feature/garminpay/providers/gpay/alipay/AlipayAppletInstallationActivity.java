package com.garmin.feature.garminpay.providers.gpay.alipay;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import androidx.core.view.j;
import androidx.fragment.app.v;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.w1;
import androidx.lifecycle.x1;
import androidx.lifecycle.y1;
import androidx.lifecycle.z0;
import bo2.o;
import br2.i;
import com.garmin.android.apps.connectmobile.R;
import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import e23.l;
import o13.p;
import o53.f0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.n;
import p005kotlin.jvm.internal.q;
import p005kotlin.jvm.internal.s;
import p005kotlin.jvm.internal.s0;
import wr2.m;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/feature/garminpay/providers/gpay/alipay/AlipayAppletInstallationActivity;", "Lhn2/c;", "<init>", "()V", "a", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class AlipayAppletInstallationActivity extends hn2.c {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final a f51097j = new a(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final w1 f51098g = new w1(s0.f105811a.b(bo2.e.class), new g(this), new f(this), new h(null, this));

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public f.c<Intent> f51099h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public j22.e f51100i;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class b implements f.b, n {
        public b() {
        }

        @Override // f.b
        public final void a(Object obj) {
            f.a aVar = (f.a) obj;
            aVar.getClass();
            AlipayAppletInstallationActivity.ca(AlipayAppletInstallationActivity.this, aVar);
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof f.b) && (obj instanceof n)) {
                return s.g(getFunctionDelegate(), ((n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final o13.h<?> getFunctionDelegate() {
            return new q(1, AlipayAppletInstallationActivity.this, AlipayAppletInstallationActivity.class, "onDeviceOnboardFinished", "onDeviceOnboardFinished(Landroidx/activity/result/ActivityResult;)V", 0);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class c extends q implements e23.a<Unit> {
        public c(Object obj) {
            super(0, obj, AlipayAppletInstallationActivity.class, "checkBTState", "checkBTState()V", 0);
        }

        @Override // e23.a
        public final Unit invoke() {
            AlipayAppletInstallationActivity alipayAppletInstallationActivity = (AlipayAppletInstallationActivity) this.receiver;
            a aVar = AlipayAppletInstallationActivity.f51097j;
            alipayAppletInstallationActivity.getClass();
            xr2.a.f192031a.getClass();
            if (xr2.a.a()) {
                gl.b.I(f0.w(alipayAppletInstallationActivity), null, new com.garmin.feature.garminpay.providers.gpay.alipay.a(alipayAppletInstallationActivity, null), 3);
            } else {
                br2.c.f19585a.a(new bo2.a(alipayAppletInstallationActivity, 1), alipayAppletInstallationActivity);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class d extends q implements e23.a<Unit> {
        public d(Object obj) {
            super(0, obj, AlipayAppletInstallationActivity.class, "showGenericErrorDialog", "showGenericErrorDialog()V", 0);
        }

        @Override // e23.a
        public final Unit invoke() {
            AlipayAppletInstallationActivity.da((AlipayAppletInstallationActivity) this.receiver);
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class e implements z0, n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l f51103a;

        public e(l lVar) {
            lVar.getClass();
            this.f51103a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof z0) && (obj instanceof n)) {
                return s.g(getFunctionDelegate(), ((n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final o13.h<?> getFunctionDelegate() {
            return this.f51103a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.z0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f51103a.invoke(obj);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class f implements e23.a<x1.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ b.g f51104a;

        public f(b.g gVar) {
            this.f51104a = gVar;
        }

        @Override // e23.a
        public final x1.c invoke() {
            return this.f51104a.getDefaultViewModelProviderFactory();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class g implements e23.a<y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ b.g f51105a;

        public g(b.g gVar) {
            this.f51105a = gVar;
        }

        @Override // e23.a
        public final y1 invoke() {
            return this.f51105a.getF189591b();
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class h implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f51106a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ b.g f51107b;

        public h(e23.a aVar, b.g gVar) {
            this.f51106a = aVar;
            this.f51107b = gVar;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f51106a;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f51107b.getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    public static final void ca(AlipayAppletInstallationActivity alipayAppletInstallationActivity, f.a aVar) {
        alipayAppletInstallationActivity.getClass();
        int i14 = aVar.f67585a;
        if (i14 != -1) {
            if (i14 != 0) {
                return;
            }
            ge1.b.T(f0.w(alipayAppletInstallationActivity), null, null, new bo2.d(alipayAppletInstallationActivity, null), 3);
            return;
        }
        v supportFragmentManager = alipayAppletInstallationActivity.getSupportFragmentManager();
        androidx.fragment.app.a aVarB = j.b(supportFragmentManager, supportFragmentManager);
        i.a aVar2 = i.f19623g;
        hn2.c.a aVar3 = hn2.c.a.NONE;
        aVar2.getClass();
        i iVarA = i.a.a(R.string.lbl_downloading_alipay, aVar3, R.string.lbl_downloading_alipay);
        iVarA.f19625a = new com.garmin.feature.garminpay.providers.gpay.alipay.b(alipayAppletInstallationActivity);
        Unit unit = Unit.INSTANCE;
        aVarB.l(R.id.content_frame_layout, iVarA, "GP_DOWNLOAD_FRAGMENT");
        aVarB.e();
    }

    public static final void da(AlipayAppletInstallationActivity alipayAppletInstallationActivity) {
        alipayAppletInstallationActivity.getClass();
        br2.c cVar = br2.c.f19585a;
        String string = alipayAppletInstallationActivity.getString(R.string.dialog_title_error);
        string.getClass();
        String string2 = alipayAppletInstallationActivity.getString(R.string.common_message_something_went_wrong);
        string2.getClass();
        String string3 = alipayAppletInstallationActivity.getString(R.string.lbl_ok);
        string3.getClass();
        androidx.appcompat.app.e eVarQ = br2.c.q(cVar, alipayAppletInstallationActivity, string, string2, new p(string3, new bo2.b(alipayAppletInstallationActivity, 0)), null, null, false, PsExtractor.VIDEO_STREAM_MASK);
        if (eVarQ != null) {
            eVarQ.show();
        }
    }

    public final bo2.e ea() {
        return (bo2.e) this.f51098g.getValue();
    }

    @Override // hn2.c, b.g, android.app.Activity
    @SuppressLint({"MissingSuperCall"})
    public final void onBackPressed() {
    }

    @Override // hn2.c, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        Bundle extras;
        super.onCreate(bundle);
        R9(R.layout.gcm3_simple_frame_layout, hn2.c.a.NONE, null);
        Intent intent = getIntent();
        long j8 = (intent == null || (extras = intent.getExtras()) == null) ? -1L : extras.getLong("extra.deviceUnitId", -1L);
        a aVar = f51097j;
        if (j8 == -1) {
            aVar.f51101a.a().error("Cannot start Alipay applet installation process because device unit id is invalid");
            setResult(0);
            finish();
            return;
        }
        this.f51099h = registerForActivityResult(new g.h(), new b());
        j22.e.a aVar2 = j22.e.f96744g;
        String str = aVar.f51101a.f186867a;
        bo2.a aVar3 = new bo2.a(this, 0);
        c cVar = new c(this);
        d dVar = new d(this);
        aVar2.getClass();
        this.f51100i = j22.e.a.a(str, aVar3, cVar, dVar);
        ea().f19252b = Long.valueOf(j8);
        hn2.c.ba(this, Boolean.TRUE, null, null, 14);
        aVar.f51101a.a().trace("sendNotification");
        ea().E4(hs2.f.AlipayAppletInstallationStarted);
        j22.e eVar = this.f51100i;
        if (eVar != null) {
            eVar.a();
        } else {
            s.m("btPermissionChecker");
            throw null;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/garmin/feature/garminpay/providers/gpay/alipay/AlipayAppletInstallationActivity$a;", "", "<init>", "()V", "", "EXTRA_DEVICE_UNIT_ID", "Ljava/lang/String;", "GP_DOWNLOAD_FRAGMENT_TAG", "garminpay_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ m f51101a;

        private a() {
            wr2.n nVar = o.f19356b.f19357a;
            nVar.getClass();
            this.f51101a = new m(nVar, "AlipayAppletInstallationActivity");
        }

        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }
    }
}
