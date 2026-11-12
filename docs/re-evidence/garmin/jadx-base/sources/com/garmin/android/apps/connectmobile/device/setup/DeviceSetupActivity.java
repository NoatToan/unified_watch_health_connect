package com.garmin.android.apps.connectmobile.device.setup;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import ca0.o1;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.p2;
import com.garmin.device.pairing.devices.PrimaryApp;
import dv.k;
import e23.l;
import e23.p;
import java.util.List;
import l90.i;
import l90.j;
import lc.u0;
import o13.m;
import o13.t;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.q;
import p005kotlin.jvm.internal.s;
import p13.u;
import v.e0;
import xk1.v;
import z10.d1;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/device/setup/DeviceSetupActivity;", "Lcom/garmin/android/apps/connectmobile/d;", "Ldv/k;", "Lcom/garmin/android/apps/connectmobile/p2;", "<init>", "()V", "a", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class DeviceSetupActivity extends com.garmin.android.apps.connectmobile.d implements k, p2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f33758b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t f33759a = m.b(new x1.b(6));

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class b extends q implements e23.a<Unit> {
        public b(Object obj) {
            super(0, obj, DeviceSetupActivity.class, "displayFailedMessage", "displayFailedMessage()V", 0);
        }

        @Override // e23.a
        public final Unit invoke() {
            DeviceSetupActivity deviceSetupActivity = (DeviceSetupActivity) this.receiver;
            a aVar = DeviceSetupActivity.f33758b;
            deviceSetupActivity.displayFailedMessage();
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class c extends q implements e23.a<Unit> {
        public c(Object obj) {
            super(0, obj, DeviceSetupActivity.class, "launchAppSettings", "launchAppSettings()V", 0);
        }

        @Override // e23.a
        public final Unit invoke() {
            DeviceSetupActivity deviceSetupActivity = (DeviceSetupActivity) this.receiver;
            a aVar = DeviceSetupActivity.f33758b;
            deviceSetupActivity.getClass();
            j22.b.f96736a.getClass();
            j22.b.r(deviceSetupActivity);
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class d extends q implements e23.a<Unit> {
        public d(Object obj) {
            super(0, obj, DeviceSetupActivity.class, "finishDeviceSetupActivity", "finishDeviceSetupActivity()V", 0);
        }

        @Override // e23.a
        public final Unit invoke() {
            DeviceSetupActivity deviceSetupActivity = (DeviceSetupActivity) this.receiver;
            a aVar = DeviceSetupActivity.f33758b;
            deviceSetupActivity.setResult(0);
            deviceSetupActivity.finish();
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class e extends q implements l<com.garmin.android.apps.connectmobile.device.setup.a, Unit> {
        public e(Object obj) {
            super(1, obj, DeviceSetupActivity.class, "endFlowRedirect", "endFlowRedirect(Lcom/garmin/android/apps/connectmobile/device/setup/DeviceSetupEndFlowRedirect;)V", 0);
        }

        @Override // e23.l
        public final Unit invoke(com.garmin.android.apps.connectmobile.device.setup.a aVar) {
            com.garmin.android.apps.connectmobile.device.setup.a aVar2 = aVar;
            aVar2.getClass();
            DeviceSetupActivity deviceSetupActivity = (DeviceSetupActivity) this.receiver;
            a aVar3 = DeviceSetupActivity.f33758b;
            deviceSetupActivity.da(aVar2);
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class f extends q implements p<n90.b, q90.c, Unit> {
        public f(Object obj) {
            super(2, obj, DeviceSetupActivity.class, "redirectToLaunchpadItem", "redirectToLaunchpadItem(Lcom/garmin/android/apps/connectmobile/device/setup/domain/launchpad/LaunchpadItemType;Lcom/garmin/android/apps/connectmobile/device/setup/domain/pairing/model/PairedDevice;)V", 0);
        }

        @Override // e23.p
        public final Unit invoke(n90.b bVar, q90.c cVar) {
            n90.b bVar2 = bVar;
            q90.c cVar2 = cVar;
            bVar2.getClass();
            cVar2.getClass();
            DeviceSetupActivity deviceSetupActivity = (DeviceSetupActivity) this.receiver;
            a aVar = DeviceSetupActivity.f33758b;
            ((x80.b) deviceSetupActivity.f33759a.getValue()).f(deviceSetupActivity, bVar2, cVar2);
            return Unit.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class g extends q implements p<i, l90.b, Unit> {
        public g(Object obj) {
            super(2, obj, DeviceSetupActivity.class, "redirectToExternalDeviceSetup", "redirectToExternalDeviceSetup(Lcom/garmin/android/apps/connectmobile/device/setup/domain/discovery/model/ExternalDeviceSetup;Lcom/garmin/android/apps/connectmobile/device/setup/domain/discovery/model/CompatibleDevice;)V", 0);
        }

        @Override // e23.p
        public final Unit invoke(i iVar, l90.b bVar) {
            i iVar2 = iVar;
            l90.b bVar2 = bVar;
            iVar2.getClass();
            bVar2.getClass();
            DeviceSetupActivity deviceSetupActivity = (DeviceSetupActivity) this.receiver;
            deviceSetupActivity.getClass();
            ((x80.b) deviceSetupActivity.f33759a.getValue()).s(deviceSetupActivity, iVar2, bVar2);
            return Unit.INSTANCE;
        }
    }

    public final void da(com.garmin.android.apps.connectmobile.device.setup.a aVar) {
        if (s.g(aVar, com.garmin.android.apps.connectmobile.device.setup.a.d.INSTANCE)) {
            bv.b.f21239a.getClass();
            ((kd0.m) bv.b.a()).a(this, null, 268468224);
        } else if (s.g(aVar, com.garmin.android.apps.connectmobile.device.setup.a.c.INSTANCE)) {
            ((x80.b) this.f33759a.getValue()).o(this);
        } else {
            if (!(aVar instanceof com.garmin.android.apps.connectmobile.device.setup.a.b)) {
                u0.r();
                return;
            }
            boolean zB = hb2.g.b(this, hb2.g.a.GARMIN_EXPLORE);
            new androidx.appcompat.app.e.a(this).setTitle(zB ? R.string.lbl_explore_redirect_open_garmin_explore_title : R.string.msg_bic_install_explore_app_title).setMessage(getString(R.string.msg_bic_install_explore_app_message, ((com.garmin.android.apps.connectmobile.device.setup.a.b) aVar).f33762b)).setPositiveButton(zB ? R.string.lbl_open : R.string.lbl_download, new jl1.e(zB, this, aVar)).setNegativeButton(R.string.lbl_cancel, new sa2.b(this, 28)).setCancelable(false).show();
        }
    }

    @Override // com.garmin.android.apps.connectmobile.z1, androidx.fragment.app.m, b.g, android.app.Activity
    public final void onActivityResult(int i14, int i15, Intent intent) {
        super.onActivityResult(i14, i15, intent);
        if (i14 != 12345) {
            a2 a2Var = a2.DEVICE_SETUP;
            String strF = e0.f(i14, "onActivityResult() -> NO ACTION for requestCode id = [", "]");
            i2.f36769a.getClass();
            i2.a.a(a2Var, strF);
        }
    }

    @Override // com.garmin.android.apps.connectmobile.d, com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        Object serializable;
        Parcelable parcelable;
        Parcelable parcelable2;
        Parcelable parcelable3;
        Parcelable parcelable4;
        q90.d.a aVar;
        oc0.b option3Image;
        oc0.b option2Image;
        oc0.b option1Image;
        oc0.b defaultWatchFaceBlankImage;
        oc0.b sideProfileImage;
        oc0.b defaultWatchFaceImage;
        super.onCreate(bundle);
        hideActionBar();
        Bundle extras = getIntent().getExtras();
        int i14 = Build.VERSION.SDK_INT;
        String strB = null;
        if (i14 >= 33) {
            serializable = extras != null ? extras.getSerializable("EXTRA_DEVICE_SETUP_FLOW", o1.class) : null;
        } else {
            Object serializable2 = extras != null ? extras.getSerializable("EXTRA_DEVICE_SETUP_FLOW") : null;
            if (!(serializable2 instanceof o1)) {
                serializable2 = null;
            }
            serializable = (o1) serializable2;
        }
        o1 o1Var = (o1) serializable;
        if (o1Var == null) {
            o1Var = o1.ADD_DEVICE;
        }
        o1 o1Var2 = o1Var;
        Bundle extras2 = getIntent().getExtras();
        if (i14 >= 33) {
            parcelable = extras2 != null ? (Parcelable) extras2.getParcelable("EXTRA_DEVICE_SETUP_QR_CODE_INFO", l90.d.class) : null;
        } else {
            Parcelable parcelable5 = extras2 != null ? extras2.getParcelable("EXTRA_DEVICE_SETUP_QR_CODE_INFO") : null;
            if (!(parcelable5 instanceof l90.d)) {
                parcelable5 = null;
            }
            parcelable = (l90.d) parcelable5;
        }
        l90.d dVar = (l90.d) parcelable;
        Bundle extras3 = getIntent().getExtras();
        if (i14 >= 33) {
            parcelable2 = extras3 != null ? (Parcelable) extras3.getParcelable("EXTRA_DEVICE_INFO", bm2.d.class) : null;
        } else {
            Parcelable parcelable6 = extras3 != null ? extras3.getParcelable("EXTRA_DEVICE_INFO") : null;
            if (!(parcelable6 instanceof bm2.d)) {
                parcelable6 = null;
            }
            parcelable2 = (bm2.d) parcelable6;
        }
        bm2.d dVar2 = (bm2.d) parcelable2;
        Bundle extras4 = getIntent().getExtras();
        if (i14 >= 33) {
            parcelable3 = extras4 != null ? (Parcelable) extras4.getParcelable("EXTRA_BLE_SCANNED_DEVICE", bm2.a.class) : null;
        } else {
            Parcelable parcelable7 = extras4 != null ? extras4.getParcelable("EXTRA_BLE_SCANNED_DEVICE") : null;
            if (!(parcelable7 instanceof bm2.a)) {
                parcelable7 = null;
            }
            parcelable3 = (bm2.a) parcelable7;
        }
        bm2.a aVar2 = (bm2.a) parcelable3;
        Bundle extras5 = getIntent().getExtras();
        if (i14 >= 33) {
            parcelable4 = extras5 != null ? (Parcelable) extras5.getParcelable("EXTRA_DEVICE_DTO", com.garmin.android.apps.connectmobile.devices.model.l.class) : null;
        } else {
            Parcelable parcelable8 = extras5 != null ? extras5.getParcelable("EXTRA_DEVICE_DTO") : null;
            if (!(parcelable8 instanceof com.garmin.android.apps.connectmobile.devices.model.l)) {
                parcelable8 = null;
            }
            parcelable4 = (com.garmin.android.apps.connectmobile.devices.model.l) parcelable8;
        }
        com.garmin.android.apps.connectmobile.devices.model.l lVar = (com.garmin.android.apps.connectmobile.devices.model.l) parcelable4;
        if (aVar2 == null || dVar2 == null || lVar == null) {
            aVar = null;
        } else {
            d90.d dVarA = ((b90.a) KoinJavaComponent.get$default(b90.a.class, null, null, 6, null)).a(lVar.getF143517g(), lVar.getF143516f(), lVar.getF143512b());
            j.a aVar3 = j.f111568b;
            PrimaryApp primaryApp = lVar.getPrimaryApp();
            aVar3.getClass();
            j jVarA = j.a.a(primaryApp);
            String applicationKey = lVar.getF143512b();
            boolean zD = lVar.d();
            boolean zF = lVar.f();
            String[] deviceCategories = lVar.getDeviceCategories();
            List listI0 = deviceCategories != null ? u.i0(deviceCategories) : null;
            String productDisplayName = lVar.getF143516f();
            String partNumberPartial = lVar.getF143517g();
            String productSKU = lVar.getProductSKU();
            String partNumber = lVar.getPartNumber();
            String strD = lVar.D();
            String imageUrl = lVar.getF143520j();
            String str = imageUrl.length() > 0 ? imageUrl : null;
            oc0.a deviceSkuImages = lVar.getDeviceSkuImages();
            String strB2 = (deviceSkuImages == null || (defaultWatchFaceImage = deviceSkuImages.getDefaultWatchFaceImage()) == null) ? null : defaultWatchFaceImage.b();
            oc0.a deviceSkuImages2 = lVar.getDeviceSkuImages();
            String strB3 = (deviceSkuImages2 == null || (sideProfileImage = deviceSkuImages2.getSideProfileImage()) == null) ? null : sideProfileImage.b();
            oc0.a deviceSkuImages3 = lVar.getDeviceSkuImages();
            String strB4 = (deviceSkuImages3 == null || (defaultWatchFaceBlankImage = deviceSkuImages3.getDefaultWatchFaceBlankImage()) == null) ? null : defaultWatchFaceBlankImage.b();
            oc0.a deviceSkuImages4 = lVar.getDeviceSkuImages();
            String strB5 = (deviceSkuImages4 == null || (option1Image = deviceSkuImages4.getOption1Image()) == null) ? null : option1Image.b();
            oc0.a deviceSkuImages5 = lVar.getDeviceSkuImages();
            String strB6 = (deviceSkuImages5 == null || (option2Image = deviceSkuImages5.getOption2Image()) == null) ? null : option2Image.b();
            oc0.a deviceSkuImages6 = lVar.getDeviceSkuImages();
            if (deviceSkuImages6 != null && (option3Image = deviceSkuImages6.getOption3Image()) != null) {
                strB = option3Image.b();
            }
            o90.a aVar4 = new o90.a(str, (Integer) null, strB4, strB2, strB5, strB6, strB, strB3, 2, (p005kotlin.jvm.internal.j) null);
            boolean isPrimaryUser = lVar.getIsPrimaryUser();
            i.a aVar5 = i.f111561a;
            String partNumberPartial2 = lVar.getF143517g();
            aVar5.getClass();
            i iVarA = i.a.a(partNumberPartial2, jVarA);
            yl2.b bVar = (yl2.b) yl2.b.B6.get(lVar.getF143517g());
            if (bVar == null) {
                bVar = yl2.b.f197686f;
            }
            aVar = new q90.d.a(aVar2, new l90.b(applicationKey, zD, zF, listI0, (String) null, productDisplayName, partNumberPartial, productSKU, partNumber, strD, aVar4, isPrimaryUser, jVarA, iVarA, bVar, dVarA, 16, (p005kotlin.jvm.internal.j) null), dVar2);
        }
        initComposeScreen(new z3.e(1697216565, true, new x80.a(this, o1Var2, dVar, aVar, 0)));
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\r\u001a\u00020\f8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/garmin/android/apps/connectmobile/device/setup/DeviceSetupActivity$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "EXTRA_DEVICE_SETUP_FLOW", "EXTRA_DEVICE_SETUP_QR_CODE_INFO", "EXTRA_DEVICE_INFO", "EXTRA_BLE_SCANNED_DEVICE", "EXTRA_DEVICE_DTO", "", "EXTERNAL_DEVICE_SETUP_REQUEST_CODE", "I", "gcm-bic_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static Intent a(a aVar, Context context, o1 o1Var, l90.d dVar, bm2.d dVar2, bm2.a aVar2, com.garmin.android.apps.connectmobile.devices.model.l lVar, int i14, int i15) {
            if ((i15 & 4) != 0) {
                dVar = null;
            }
            if ((i15 & 8) != 0) {
                dVar2 = null;
            }
            if ((i15 & 16) != 0) {
                aVar2 = null;
            }
            if ((i15 & 32) != 0) {
                lVar = null;
            }
            aVar.getClass();
            Intent intent = new Intent(context, (Class<?>) DeviceSetupActivity.class);
            intent.putExtra("EXTRA_DEVICE_SETUP_FLOW", o1Var);
            intent.putExtra("EXTRA_DEVICE_SETUP_QR_CODE_INFO", dVar);
            intent.putExtra("EXTRA_DEVICE_INFO", dVar2);
            intent.putExtra("EXTRA_BLE_SCANNED_DEVICE", aVar2);
            intent.putExtra("EXTRA_DEVICE_DTO", lVar);
            intent.setFlags(i14);
            return intent;
        }

        public static void e(a aVar, Context context, bm2.a aVar2, com.garmin.android.apps.connectmobile.devices.model.l lVar, bm2.d dVar, int i14) {
            if ((i14 & 8) != 0) {
                dVar = null;
            }
            bm2.d dVar2 = dVar;
            aVar.getClass();
            context.getClass();
            if (d1.f()) {
                d1.o(context, new v(12));
            } else {
                context.startActivity(a(aVar, context, o1.ADD_DEVICE, null, dVar2, aVar2, lVar, 0, 4));
            }
        }

        public final void b(Context context, o1 o1Var, int i14) {
            context.getClass();
            o1Var.getClass();
            if (d1.f()) {
                d1.o(context, new v(12));
            } else {
                context.startActivity(a(this, context, o1Var, null, null, null, null, i14, 60));
            }
        }

        public final void c(Context context, o1 o1Var, l90.d dVar, int i14) {
            context.getClass();
            o1Var.getClass();
            if (d1.f()) {
                d1.o(context, new v(12));
            } else {
                context.startActivity(a(this, context, o1Var, dVar, null, null, null, i14, 56));
            }
        }

        private a() {
        }
    }
}
