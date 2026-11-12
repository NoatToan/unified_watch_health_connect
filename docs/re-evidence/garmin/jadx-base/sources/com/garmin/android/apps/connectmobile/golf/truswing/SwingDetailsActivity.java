package com.garmin.android.apps.connectmobile.golf.truswing;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.v;
import androidx.lifecycle.x1;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a1;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.golf.truswing.model.SwingDTO;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.q1;
import com.garmin.android.apps.connectmobile.view.GCMComplexBanner;
import com.garmin.android.gfdi.configuration.SupportedCapability;
import java.util.ArrayList;
import java.util.List;
import org.greenrobot.eventbus.ThreadMode;
import org.koin.java.KoinJavaComponent;
import p005kotlin.jvm.internal.s0;
import v.b0;
import wl0.i0;
import wl0.z;

/* JADX INFO: loaded from: classes8.dex */
public class SwingDetailsActivity extends com.garmin.android.apps.connectmobile.c implements f.b, ClubSelectionDrawerFragment.c, y9.a.InterfaceC3632a<List<sd2.f>> {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ int f35774o = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ClubSelectionDrawerFragment f35775a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public SwingDTO f35776b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f35777c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public h f35778d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f35779e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public z f35780f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public q1 f35783i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f35784j;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public q1 f35786l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public c f35787m;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public GCMComplexBanner f35781g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f35782h = false;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final b0 f35785k = new b0(this, 18);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final a f35788n = new a();

    public class a extends pl0.a {
        public a() {
        }

        @l73.k(threadMode = ThreadMode.MAIN)
        public void swingTransferComplete(pl0.b bVar) {
            SwingDetailsActivity swingDetailsActivity = SwingDetailsActivity.this;
            swingDetailsActivity.f35781g.setVisibility(0);
            swingDetailsActivity.f35781g.setProgress(100.0f);
            swingDetailsActivity.f35781g.setShowProgress(true);
            swingDetailsActivity.f35781g.setStyle(GCMComplexBanner.c.SUCCESS);
            swingDetailsActivity.f35781g.setPrimaryText(swingDetailsActivity.getString(R.string.truswing_swing_info_transfer_success));
            swingDetailsActivity.f35781g.postDelayed(swingDetailsActivity.f35785k, 1000L);
        }

        @l73.k(threadMode = ThreadMode.MAIN)
        public void swingTransferFailed(pl0.c cVar) {
            SwingDetailsActivity swingDetailsActivity = SwingDetailsActivity.this;
            swingDetailsActivity.f35781g.setVisibility(0);
            swingDetailsActivity.f35781g.setShowProgress(false);
            swingDetailsActivity.f35781g.setStyle(GCMComplexBanner.c.ERROR);
            swingDetailsActivity.f35781g.setPrimaryText(swingDetailsActivity.getString(R.string.truswing_swing_info_transfer_failed));
            swingDetailsActivity.f35781g.postDelayed(swingDetailsActivity.f35785k, 1000L);
        }

        @l73.k(threadMode = ThreadMode.MAIN)
        public void swingTransferProgressUpdated(pl0.d dVar) {
            int i14 = dVar.f138519a;
            SwingDetailsActivity swingDetailsActivity = SwingDetailsActivity.this;
            swingDetailsActivity.f35781g.setVisibility(0);
            swingDetailsActivity.f35781g.setProgress(i14);
        }

        @l73.k(threadMode = ThreadMode.MAIN)
        public void swingTransferStarted(pl0.e eVar) {
            SwingDetailsActivity swingDetailsActivity = SwingDetailsActivity.this;
            swingDetailsActivity.f35781g.setVisibility(0);
            swingDetailsActivity.f35781g.setShowProgress(true);
            swingDetailsActivity.f35781g.setProgress(0.0f);
            swingDetailsActivity.f35781g.setStyle(GCMComplexBanner.c.INFO);
            swingDetailsActivity.f35781g.setPrimaryText(swingDetailsActivity.getString(R.string.truswing_swing_info_transferring));
            swingDetailsActivity.f35781g.setVisibility(0);
        }
    }

    public static void ca(Context context) {
        if (context != null) {
            cl0.a.e().getClass();
            if (cl0.a.h()) {
                cl0.a.e().getClass();
                if (cl0.a.g()) {
                    cl0.a.e().getClass();
                    ((cl0.b) KoinJavaComponent.get(cl0.b.class)).G();
                }
            }
            Intent intent = new Intent(context, (Class<?>) SwingDetailsActivity.class);
            intent.setAction("GCM_action_swings_record");
            context.startActivity(intent);
        }
    }

    @Override // com.garmin.android.apps.connectmobile.golf.truswing.ClubSelectionDrawerFragment.c
    public final void S8(com.garmin.android.apps.connectmobile.golf.truswing.model.a aVar) {
        if (this.f35778d == null || !"GCM_action_swings_record".equals(this.f35779e)) {
            return;
        }
        this.f35778d.T6(aVar);
        this.f35778d.H6();
        this.f35776b = k.a();
    }

    @Override // com.garmin.android.apps.connectmobile.golf.truswing.f.b
    public final void c3(com.garmin.android.apps.connectmobile.golf.truswing.model.c cVar) {
        Intent intent = new Intent(this, (Class<?>) GolfMetricDescriptionActivity.class);
        if (cVar != null) {
            intent.putExtra("METRIC_TYPE", cVar.ordinal());
        }
        startActivity(intent);
    }

    @Override // com.garmin.android.apps.connectmobile.golf.truswing.f.b
    public final void f6() {
        ClubSelectionDrawerFragment clubSelectionDrawerFragment;
        if (TextUtils.isEmpty(this.f35779e) || !this.f35779e.equalsIgnoreCase("GCM_action_swings_record") || (clubSelectionDrawerFragment = this.f35775a) == null) {
            return;
        }
        wl0.f fVar = clubSelectionDrawerFragment.f35766n;
        S8((fVar == null || clubSelectionDrawerFragment.f35764l >= fVar.getCount()) ? null : (com.garmin.android.apps.connectmobile.golf.truswing.model.a) clubSelectionDrawerFragment.f35766n.getItem(clubSelectionDrawerFragment.f35764l));
    }

    @Override // android.app.Activity
    public final void finish() {
        String action = getIntent().getAction();
        if (action != null && action.equals("GCM_action_swings_record")) {
            cl0.a.e().getClass();
            Intent intent = wl0.h.i().k() > 0 ? new Intent(this, (Class<?>) SwingSessionActivity.class) : new Intent(this, (Class<?>) SwingHistoryActivity.class);
            intent.setFlags(67108864);
            startActivity(intent);
        }
        super.finish();
    }

    @Override // com.garmin.android.apps.connectmobile.c
    public final List<cv.c> getDeviceConnectionObservers() {
        List<cv.c> deviceConnectionObservers = super.getDeviceConnectionObservers();
        deviceConnectionObservers.removeIf(new s52.e(this, 21));
        return deviceConnectionObservers;
    }

    @Override // com.garmin.android.apps.connectmobile.c
    public final void handleDeviceConnectionChanged(a1 a1Var) {
        String str = this.f35779e;
        str.getClass();
        if (str.equals("GCM_action_swings_record")) {
            if (a1Var.f28723a) {
                String str2 = a1Var.f28726d;
                Toast.makeText(this, !TextUtils.isEmpty(str2) ? getString(R.string.dialog_title_device_connected_device_known_yes, str2) : getString(R.string.dialog_title_device_connected_device_known_no), 1).show();
            }
            y9.a.a(this).e(this);
        }
    }

    @Override // com.garmin.android.apps.connectmobile.golf.truswing.ClubSelectionDrawerFragment.c
    public final void i4() {
        i2.a(a2.GOLF, "SwingDetailsActivity", "onEditClubs()");
    }

    @Override // com.garmin.android.apps.connectmobile.z1, b.g, android.app.Activity
    public final void onBackPressed() {
        ClubSelectionDrawerFragment clubSelectionDrawerFragment = this.f35775a;
        if (clubSelectionDrawerFragment == null || !clubSelectionDrawerFragment.u6()) {
            super.onBackPressed();
        } else {
            this.f35775a.f35755c.b(8388613);
        }
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        Fragment fragment;
        super.onCreate(bundle);
        getWindow().addFlags(128);
        this.f35787m = (c) new x1(this).b(s0.f105811a.b(c.class));
        String action = getIntent().getAction();
        this.f35779e = action;
        if ("GCM_action_swings_compare".equals(action)) {
            setContentView(R.layout.gcm_golf_compare_swing_details);
        } else {
            setContentView(R.layout.gcm_golf_swing_details);
        }
        initActionBar(true, R.string.golf_swing_analysis_component_title);
        if (this.f35779e == null) {
            i2.f(a2.GOLF, "SwingDetailsActivity", "Missing intent action ");
            finish();
        }
        String str = this.f35779e;
        str.getClass();
        switch (str) {
            case "GCM_action_swings_historical":
                SwingDTO swingDTO = (SwingDTO) getIntent().getExtras().getParcelable("GCM_swing_dto");
                this.f35776b = swingDTO;
                if (swingDTO == null) {
                    i2.f(a2.GOLF, "SwingDetailsActivity", "Missing swing data for GCM_action_swings_historical mode");
                    break;
                }
                break;
            case "GCM_action_swings_record":
                break;
            case "GCM_action_swings_real_time":
                SwingDTO swingDTO2 = (SwingDTO) getIntent().getExtras().getParcelable("GCM_swing_dto");
                this.f35776b = swingDTO2;
                if (swingDTO2 == null) {
                    i2.f(a2.GOLF, "SwingDetailsActivity", "Missing swing data for GCM_action_swings_real_time mode");
                    break;
                }
                break;
            case "GCM_action_swings_compare":
                cl0.a.e().getClass();
                List listD = cl0.a.d();
                if (listD == null || ((ArrayList) listD).isEmpty()) {
                    i2.f(a2.GOLF, "SwingDetailsActivity", "Missing swing compare list for GCM_action_swings_compare mode");
                    break;
                }
                break;
            default:
                i2.f(a2.GOLF, "SwingDetailsActivity", " Action [" + str + "] not supported");
                break;
        }
        if (getIntent().getExtras() != null) {
            this.f35777c = getIntent().getExtras().getBoolean("GCM_last_swing");
        }
        v supportFragmentManager = getSupportFragmentManager();
        String str2 = this.f35779e;
        str2.getClass();
        switch (str2) {
            case "GCM_action_swings_historical":
                h hVarS6 = h.S6(this.f35776b, true);
                this.f35778d = hVarS6;
                fragment = hVarS6;
                break;
            case "GCM_action_swings_record":
                h hVarS7 = h.S6(null, false);
                this.f35778d = hVarS7;
                fragment = hVarS7;
                break;
            case "GCM_action_swings_real_time":
                h hVarS8 = h.S6(this.f35776b, false);
                this.f35778d = hVarS8;
                fragment = hVarS8;
                break;
            case "GCM_action_swings_compare":
                e eVar = new e();
                eVar.setArguments(new Bundle());
                fragment = eVar;
                break;
            default:
                fragment = null;
                break;
        }
        supportFragmentManager.getClass();
        androidx.fragment.app.a aVar = new androidx.fragment.app.a(supportFragmentManager);
        aVar.l(R.id.frag_activity_swing_detail, fragment, null);
        aVar.e();
        if (!"GCM_action_swings_compare".equals(this.f35779e)) {
            this.f35775a = (ClubSelectionDrawerFragment) supportFragmentManager.F(R.id.golf_swing_club_selection_drawer);
            cl0.a.e().getClass();
            long jB = ((cl0.b) KoinJavaComponent.get(cl0.b.class)).B();
            ClubSelectionDrawerFragment clubSelectionDrawerFragment = this.f35775a;
            DrawerLayout drawerLayout = (DrawerLayout) findViewById(R.id.golf_swing_detail_layout);
            clubSelectionDrawerFragment.f35758f = clubSelectionDrawerFragment.getActivity().findViewById(R.id.golf_swing_club_selection_drawer);
            clubSelectionDrawerFragment.f35755c = drawerLayout;
            a7.b.getDrawable(drawerLayout.getContext(), 2131231574);
            wl0.d dVar = new wl0.d(clubSelectionDrawerFragment, clubSelectionDrawerFragment.getActivity(), clubSelectionDrawerFragment.f35755c, R.string.default_image_view_content_description, R.string.default_image_view_content_description);
            clubSelectionDrawerFragment.f35754b = dVar;
            clubSelectionDrawerFragment.f35755c.setDrawerListener(dVar);
            if (jB >= 0) {
                clubSelectionDrawerFragment.f35763k = jB;
            }
            y9.a.a(this).b(1, this);
        }
        this.f35780f = new z();
        this.f35781g = (GCMComplexBanner) findViewById(R.id.complex_status_banner);
    }

    @Override // y9.a.InterfaceC3632a
    public final androidx.loader.content.b<List<sd2.f>> onCreateLoader(int i14, Bundle bundle) {
        return new i0(this);
    }

    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.golf_swing_detail, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override // y9.a.InterfaceC3632a
    public final void onLoadFinished(androidx.loader.content.b<List<sd2.f>> bVar, List<sd2.f> list) {
        ClubSelectionDrawerFragment clubSelectionDrawerFragment;
        List<sd2.f> list2 = list;
        if (list2 != null) {
            if (!list2.isEmpty() && (clubSelectionDrawerFragment = this.f35775a) != null) {
                cl0.b bVar2 = clubSelectionDrawerFragment.f35769q;
                for (sd2.f fVar : list2) {
                    if (bVar2.i(SupportedCapability.SWING_SENSOR.ordinal(), fVar.getUnitID())) {
                        boolean zE = bVar2.e(fVar);
                        wl0.h hVarI = wl0.h.i();
                        clubSelectionDrawerFragment.v6(clubSelectionDrawerFragment.f35761i, fVar, (!zE || hVarI == null) ? null : Double.valueOf(hVarI.f185932j));
                    } else if (bVar2.i(SupportedCapability.SWING_SENSOR_REMOTE.ordinal(), fVar.getUnitID())) {
                        clubSelectionDrawerFragment.v6(clubSelectionDrawerFragment.f35762j, fVar, null);
                    }
                }
            }
            for (sd2.f fVar2 : list2) {
                cl0.b bVar3 = (cl0.b) KoinJavaComponent.get(cl0.b.class);
                if (bVar3.o(fVar2.getProductNumber())) {
                    boolean zA = bVar3.a(fVar2.getUnitID());
                    if (!this.f35782h && !zA) {
                        String string = getString(R.string.golf_lbl_truswing_not_connected_instructions);
                        q1.f41066b.getClass();
                        q1 q1VarA = q1.b.a(R.string.golf_lbl_truswing_not_connected, string, 0, R.string.lbl_close, null);
                        this.f35783i = q1VarA;
                        q1VarA.show(getSupportFragmentManager(), "CONNECT_TRU_SWING_DIALOG_TAG");
                        this.f35782h = true;
                    }
                    if (zA) {
                        q1 q1Var = this.f35783i;
                        if (q1Var != null && q1Var.isAdded()) {
                            this.f35783i.dismiss();
                        }
                        if (this.f35775a == null || wl0.h.i().k() != 0) {
                            return;
                        }
                        String str = this.f35779e;
                        str.getClass();
                        if (str.equals("GCM_action_swings_record") && !this.f35784j) {
                            this.f35784j = true;
                            ClubSelectionDrawerFragment clubSelectionDrawerFragment2 = this.f35775a;
                            if (clubSelectionDrawerFragment2.u6()) {
                                return;
                            }
                            clubSelectionDrawerFragment2.f35767o.postDelayed(clubSelectionDrawerFragment2.f35768p, 1000L);
                            return;
                        }
                        return;
                    }
                    return;
                }
            }
        }
    }

    @Override // y9.a.InterfaceC3632a
    public final void onLoaderReset(androidx.loader.content.b<List<sd2.f>> bVar) {
    }

    @Override // com.garmin.android.apps.connectmobile.z1, android.app.Activity
    public final boolean onNavigateUp() {
        ClubSelectionDrawerFragment clubSelectionDrawerFragment = this.f35775a;
        if (clubSelectionDrawerFragment == null || !clubSelectionDrawerFragment.u6()) {
            return super.onNavigateUp();
        }
        this.f35775a.f35755c.b(8388613);
        return true;
    }

    @Override // com.garmin.android.apps.connectmobile.z1, android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        String str;
        boolean zB;
        int itemId = menuItem.getItemId();
        if (itemId != R.id.menu_item_compare_golf_swings) {
            if (itemId == R.id.menu_item_delete_golf_swings) {
                String string = getString(this.f35777c ? R.string.golf_lbl_delete_swing_and_notes_message : R.string.golf_lbl_swing_delete_message);
                wl0.b0 b0Var = new wl0.b0(this, 0);
                q1.f41066b.getClass();
                q1.b.a(0, string, R.string.lbl_delete, R.string.lbl_cancel, b0Var).show(getSupportFragmentManager(), (String) null);
                return true;
            }
            if (itemId != R.id.menu_item_done) {
                return super.onOptionsItemSelected(menuItem);
            }
            cl0.a.e().getClass();
            ((cl0.b) KoinJavaComponent.get(cl0.b.class)).G();
            finish();
            return true;
        }
        if (this.f35776b != null && (str = this.f35779e) != null) {
            if (str.equalsIgnoreCase("GCM_action_swings_real_time") || this.f35779e.equalsIgnoreCase("GCM_action_swings_record")) {
                cl0.a aVarE = cl0.a.e();
                long j8 = this.f35776b.f35880i;
                aVarE.getClass();
                zB = cl0.a.b(j8);
            } else {
                cl0.a aVarE2 = cl0.a.e();
                long j14 = this.f35776b.f35872a;
                aVarE2.getClass();
                zB = cl0.a.a(j14);
            }
            if (zB) {
                finish();
                return true;
            }
            i2.f(a2.GOLF, "SwingDetailsActivity", "Could not add the swing to the compare list");
        }
        return true;
    }

    @Override // com.garmin.android.apps.connectmobile.c, androidx.fragment.app.m, android.app.Activity
    public final void onPause() {
        z zVar;
        super.onPause();
        String str = this.f35779e;
        str.getClass();
        if (str.equals("GCM_action_swings_record") && (zVar = this.f35780f) != null) {
            zVar.f186013a = null;
            z.a aVar = zVar.f186014b;
            if (aVar != null) {
                aVar.a();
            }
            wl0.h hVarI = wl0.h.i();
            if (hVarI != null) {
                hVarI.deleteObserver(zVar);
            }
        }
        oi2.a.b(this.f35788n);
    }

    @Override // android.app.Activity
    public final boolean onPrepareOptionsMenu(Menu menu) {
        MenuItem menuItemFindItem = menu.findItem(R.id.menu_item_compare_golf_swings);
        MenuItem menuItemFindItem2 = menu.findItem(R.id.menu_item_delete_golf_swings);
        MenuItem menuItemFindItem3 = menu.findItem(R.id.menu_item_done);
        ClubSelectionDrawerFragment clubSelectionDrawerFragment = this.f35775a;
        boolean z14 = false;
        if (clubSelectionDrawerFragment == null || !clubSelectionDrawerFragment.u6()) {
            cl0.a.e().getClass();
            if (cl0.a.h()) {
                cl0.a.e().getClass();
                if (cl0.a.g()) {
                    menuItemFindItem3.setVisible(true);
                    menuItemFindItem.setVisible(false);
                    menuItemFindItem2.setVisible(false);
                } else {
                    menuItemFindItem3.setVisible(false);
                    menuItemFindItem.setVisible(true);
                    menuItemFindItem2.setVisible(true);
                }
            }
        } else {
            menuItemFindItem3.setVisible(false);
            menuItemFindItem.setVisible(false);
            menuItemFindItem2.setVisible(false);
        }
        if ("GCM_action_swings_record".equals(this.f35779e)) {
            SwingDTO swingDTO = this.f35776b;
            if (swingDTO != null && swingDTO.f35872a > 0) {
                z14 = true;
            }
            menuItemFindItem.setVisible(z14);
            menuItemFindItem2.setVisible(z14);
        }
        return true;
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, android.app.Activity
    public final void onResume() {
        super.onResume();
        String str = this.f35779e;
        str.getClass();
        if (str.equals("GCM_action_swings_record")) {
            y9.a.a(this).e(this);
            z zVar = this.f35780f;
            if (zVar != null) {
                zVar.f186013a = this;
                wl0.h hVarI = wl0.h.i();
                if (hVarI != null) {
                    hVarI.addObserver(zVar);
                }
            }
            oi2.a.a(this.f35788n);
        }
    }

    @Override // com.garmin.android.apps.connectmobile.golf.truswing.ClubSelectionDrawerFragment.c
    public final void u3() {
        h hVar = this.f35778d;
        if (hVar != null) {
            hVar.T6(null);
            this.f35778d.H6();
            this.f35776b = k.a();
        }
    }
}
