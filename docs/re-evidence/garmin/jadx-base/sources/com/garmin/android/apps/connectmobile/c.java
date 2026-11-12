package com.garmin.android.apps.connectmobile;

import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.View;
import android.widget.Toast;
import com.garmin.android.apps.connectmobile.gfdi.protobuf.eventbus.GroupRideCodeReceivedEvent;
import com.garmin.android.apps.connectmobile.gfdi.protobuf.eventbus.GroupRideEnableReceivedEvent;
import com.garmin.android.apps.connectmobile.gfdi.protobuf.eventbus.GroupRideEventListener;
import com.garmin.android.apps.connectmobile.view.GCMComplexBanner;
import com.garmin.android.apps.connectmobile.view.banner.GCMTextBanner;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
public abstract class c extends z1 implements c3 {
    private static final int BANNER_VISIBILITY_DURATION = 5000;
    private static final String TAG = "AbstractGCMActivity";
    private final GroupRideEventListener groupRideEventListener = new a();
    private GCMComplexBanner mComplexStatusBanner;
    private Handler mHideBannerHandler;

    public class a extends GroupRideEventListener {
        public a() {
        }

        @Override // com.garmin.android.apps.connectmobile.gfdi.protobuf.eventbus.GroupRideEventListener
        public final void groupRideCodeReceived(GroupRideCodeReceivedEvent groupRideCodeReceivedEvent) {
            c.this.runOnUiThread(new cd0.f(1, this, groupRideCodeReceivedEvent));
        }

        @Override // com.garmin.android.apps.connectmobile.gfdi.protobuf.eventbus.GroupRideEventListener
        public final void groupRideEnableReceived(GroupRideEnableReceivedEvent groupRideEnableReceivedEvent) {
            c.this.runOnUiThread(new cd0.f(2, this, groupRideEnableReceivedEvent));
        }
    }

    private void checkGCStatus() {
        if (showGCMaintenanceBanner() && (az0.b.f13674e.getValue() instanceof vc2.b.d)) {
            displayMaintenanceBanner();
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0078  */
    private void decorateAndShowBanner(String str, String str2, GCMComplexBanner.c cVar, boolean z14) {
        boolean z15;
        GCMComplexBanner gCMComplexBanner = this.mComplexStatusBanner;
        if (gCMComplexBanner != null) {
            gCMComplexBanner.setStyle(cVar);
            this.mComplexStatusBanner.setPrimaryText(str);
            GCMComplexBanner gCMComplexBanner2 = this.mComplexStatusBanner;
            if (str2 == null) {
                str2 = "";
            }
            gCMComplexBanner2.setSecondaryText(str2);
            boolean z16 = false;
            this.mComplexStatusBanner.setMinimized(false);
            this.mComplexStatusBanner.setShowProgress(false);
            modifyBottomInsets(k2.UPDATE_INSETS, this.mComplexStatusBanner);
            this.mComplexStatusBanner.setVisibility(0);
            this.mComplexStatusBanner.setBannerListener(null);
            GCMTextBanner gCMTextBanner = this.mConsentBanner;
            if (gCMTextBanner != null) {
                modifyBottomInsets(k2.RESET_INSETS, gCMTextBanner);
            }
            GCMComplexBanner gCMComplexBanner3 = this.mComplexStatusBanner;
            if (z14) {
                if (cVar == GCMComplexBanner.c.GC_STATUS_RED) {
                    vc2.b bVar = (vc2.b) az0.b.f13674e.getValue();
                    if (bVar instanceof vc2.b.d) {
                        vc2.l lVar = ((vc2.b.d) bVar).f177085b;
                        if (lVar != null) {
                            z15 = lVar.f177127d;
                        }
                        if (z15) {
                            z16 = true;
                        }
                    } else {
                        i2.a aVar = i2.f36769a;
                        a2 a2Var = a2.GENERAL;
                        aVar.getClass();
                        i2.a.f(a2Var, "ConnectivityMonitor", "Calling isServerMaintenanceBannerDismissible() but connectionState is " + bVar);
                    }
                    z15 = false;
                    if (z15) {
                        z16 = true;
                    }
                } else {
                    z16 = true;
                }
            }
            gCMComplexBanner3.setDismissible(z16);
            if (z14) {
                return;
            }
            Handler handler = this.mHideBannerHandler;
            if (handler != null) {
                handler.removeCallbacksAndMessages(null);
            }
            Handler handler2 = new Handler();
            this.mHideBannerHandler = handler2;
            handler2.postDelayed(new cd0.h0(this, 1), 5000L);
        }
    }

    private void displayMaintenanceBanner() {
        vc2.b bVar = (vc2.b) az0.b.f13674e.getValue();
        String string = null;
        if (bVar instanceof vc2.b.d) {
            vc2.l lVar = ((vc2.b.d) bVar).f177085b;
            if (lVar != null) {
                string = lVar.f177125b;
            }
        } else {
            i2.a aVar = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar.getClass();
            i2.a.f(a2Var, "ConnectivityMonitor", "Calling getServerMaintenanceBannerMessageUrl() but connectionState is " + bVar);
        }
        if (TextUtils.isEmpty(string)) {
            string = getString(R.string.msg_banner_server_outage);
        }
        decorateAndShowBanner(string, "", GCMComplexBanner.c.GC_STATUS_RED, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Unit lambda$getCommonBehaviorHandlers$1(a1 a1Var) {
        Iterator<cv.c> it = getDeviceConnectionObservers().iterator();
        while (it.hasNext()) {
            it.next().a(a1Var);
        }
        handleDeviceConnectionChanged(a1Var);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$onCreate$0(vc2.b bVar) {
        if (this.mComplexStatusBanner == null) {
            return;
        }
        checkInternetConnectivity();
        if (showGCMaintenanceBanner()) {
            if (bVar instanceof vc2.b.d) {
                displayMaintenanceBanner();
            } else if (this.mComplexStatusBanner.getStyle() == GCMComplexBanner.c.GC_STATUS_RED) {
                this.mComplexStatusBanner.setVisibility(8);
            }
        }
    }

    public void H3() {
        displayFailedMessage();
    }

    public boolean R0() {
        return hasInternetConnection();
    }

    public boolean V6() {
        return hasInternetConnection();
    }

    @Override // com.garmin.android.apps.connectmobile.c3
    public void checkConsentBannerStatus(z10.l0 l0Var, int i14) {
        bv.d dVar = (bv.d) KoinJavaComponent.get(bv.d.class);
        f12.l.f68084a.getClass();
        boolean zContains = f12.l.a.a().V().contains(l0Var);
        boolean zContains2 = f12.l.a.a().A3().contains(l0Var);
        if (dVar.K() && l0Var.f201119c && !zContains) {
            showConsentBanner(new t22.a(), l0Var);
            return;
        }
        if (dVar.K() || !dVar.L() || !l0Var.f201118b || zContains2) {
            hideConsentBanner();
        } else {
            showConsentBanner(new t22.b(getString(i14)), l0Var);
        }
    }

    public void checkInternetConnectivity() {
        if (!hasInternetConnection()) {
            displayErrorBannerNoInternetConnection();
        } else {
            hideStatusBanner();
            onNetworkConnected();
        }
    }

    @Override // com.garmin.android.apps.connectmobile.z1
    public void consentBannerDismissed(t22.c cVar, z10.l0 l0Var) {
        super.consentBannerDismissed(cVar, l0Var);
        if (cVar instanceof t22.a) {
            f12.l.f68084a.getClass();
            f12.l.a.a().R3(l0Var);
        } else if (cVar instanceof t22.b) {
            f12.l.f68084a.getClass();
            f12.l.a.a().p0(l0Var);
        }
    }

    public void displayErrorBannerNoInternetConnection() {
        displayStatusBanner(getString(R.string.txt_no_internet_connection), null, GCMComplexBanner.c.ERROR, false);
    }

    public void displayFailedMessage(boolean z14) {
        if (z14) {
            return;
        }
        Toast.makeText(this, R.string.txt_error_occurred, 0).show();
    }

    public void displayStatusBanner(String str, String str2, GCMComplexBanner.c cVar, boolean z14) {
        if (this.mComplexStatusBanner != null) {
            if (!(az0.b.f13674e.getValue() instanceof vc2.b.d)) {
                decorateAndShowBanner(str, str2, cVar, z14);
                return;
            }
            i2.d(TAG, getLocalClassName() + "displayStatusBanner: GC status RED, squashing additional banner messages");
        }
    }

    public List<androidx.lifecycle.n> getCommonBehaviorHandlers() {
        b bVar = new b(this, 0);
        ArrayList arrayList = new ArrayList();
        bv.b.f21239a.getClass();
        bv.c cVarA = bv.b.a();
        arrayList.add(new cv.f(this, (o31.a) KoinJavaComponent.get$default(o31.a.class, null, null, 6, null), cVarA));
        arrayList.add(new cv.l(this, cVarA));
        arrayList.add(new cv.m(this));
        arrayList.add(new cv.g(this, cVarA));
        arrayList.add(new cv.a(this, this, cVarA));
        arrayList.add(new cv.b(this, bVar));
        arrayList.add(new cv.n(this, this));
        arrayList.add(new cv.d(this, this, cVarA));
        arrayList.add(new cv.e(this, this, cVarA));
        arrayList.add(new cv.h(this, cVarA));
        return arrayList;
    }

    public z10.l0 getConsentBannerScreen() {
        return null;
    }

    public List<cv.c> getDeviceConnectionObservers() {
        ArrayList arrayList = new ArrayList();
        bv.b.f21239a.getClass();
        bv.c cVarA = bv.b.a();
        arrayList.add(new cv.p(this, cVarA));
        if (!(this instanceof p2)) {
            View viewFindViewById = findViewById(android.R.id.content);
            viewFindViewById.getClass();
            arrayList.add(new cv.i(this, viewFindViewById, findViewById(R.id.bottom_navigation_bar), cVarA));
        }
        if (!(this instanceof q2)) {
            arrayList.add(new cv.o(this));
        }
        return arrayList;
    }

    public void handleDeviceConnectionChanged(a1 a1Var) {
    }

    public boolean hasInternetConnection() {
        return az0.b.a();
    }

    public void hideStatusBanner() {
        if (this.mComplexStatusBanner != null) {
            if (az0.b.f13674e.getValue() instanceof vc2.b.d) {
                i2.d(TAG, getLocalClassName() + ":hideStatusBanner: GC status RED, not hiding status banner");
                return;
            }
            this.mComplexStatusBanner.setVisibility(8);
            this.mComplexStatusBanner.setBannerListener(null);
            modifyBottomInsets(k2.UPDATE_INSETS, this.mConsentBanner);
            statusBannerHidden();
        }
    }

    public boolean isStatusBannerDisplayed() {
        GCMComplexBanner gCMComplexBanner = this.mComplexStatusBanner;
        return (gCMComplexBanner == null || gCMComplexBanner.f47430q || gCMComplexBanner.getVisibility() != 0) ? false : true;
    }

    @Override // com.garmin.android.apps.connectmobile.c3
    public boolean isStatusBannerDisplayingError() {
        GCMComplexBanner gCMComplexBanner;
        return isStatusBannerDisplayed() && (gCMComplexBanner = this.mComplexStatusBanner) != null && gCMComplexBanner.getStyle() == GCMComplexBanner.c.ERROR;
    }

    @Override // com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        i2.l(TAG, getLocalClassName() + ":onCreate");
        Iterator<androidx.lifecycle.n> it = getCommonBehaviorHandlers().iterator();
        while (it.hasNext()) {
            getF158016a().a(it.next());
        }
        az0.b.f13675f.f(this, new a4.b(this, 10));
    }

    public void onNetworkConnected() {
    }

    @Override // androidx.fragment.app.m, android.app.Activity
    public void onPause() {
        super.onPause();
        i2.l(TAG, getLocalClassName() + ":onPause");
        oi2.a.b(this.groupRideEventListener);
    }

    @Override // com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, android.app.Activity
    public void onResume() {
        super.onResume();
        i2.l(TAG, getLocalClassName() + ":onResume");
        if (this.mComplexStatusBanner == null) {
            View viewFindViewById = findViewById(R.id.complex_status_banner);
            if (viewFindViewById == null) {
                i2.n(TAG, getLocalClassName() + ":onResume: layout does not specify a status banner");
            } else {
                this.mComplexStatusBanner = (GCMComplexBanner) viewFindViewById;
            }
        }
        if (this.mComplexStatusBanner != null) {
            checkInternetConnectivity();
            checkGCStatus();
        }
        oi2.a.a(this.groupRideEventListener);
    }

    @Override // i.c, androidx.fragment.app.m, android.app.Activity
    public void onStart() {
        super.onStart();
        i2.l(TAG, getLocalClassName() + ":onStart");
        if (getConsentBannerScreen() != null) {
            checkConsentBannerStatus(getConsentBannerScreen(), R.string.msg_consent_feature_unavailability);
        }
    }

    @Override // i.c, androidx.fragment.app.m, android.app.Activity
    public void onStop() {
        super.onStop();
        Handler handler = this.mHideBannerHandler;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        i2.l(TAG, getLocalClassName() + ":onStop");
    }

    public boolean showGCMaintenanceBanner() {
        return true;
    }

    public void statusBannerHidden() {
    }

    public void displayFailedMessage() {
        displayFailedMessage(false);
    }
}
