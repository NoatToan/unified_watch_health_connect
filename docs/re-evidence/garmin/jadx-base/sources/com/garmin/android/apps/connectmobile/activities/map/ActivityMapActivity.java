package com.garmin.android.apps.connectmobile.activities.map;

import am.d;
import am.e;
import am.x0;
import am.z0;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.widget.Toast;
import androidx.fragment.app.m;
import androidx.lifecycle.t1;
import androidx.lifecycle.w0;
import androidx.lifecycle.x1;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.activities.newmodel.h;
import com.garmin.android.apps.connectmobile.help.HelpActivity;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.l2;
import com.garmin.android.apps.connectmobile.segments.SegmentsFilterDTO;
import com.garmin.android.apps.connectmobile.view.SlidingUpPanelLayout;
import cq.y;
import dm.g;
import dm.i;
import dm.r0;
import f12.l;
import fw.p;
import java.util.Arrays;
import k32.n;
import org.json.JSONObject;
import org.koin.java.KoinJavaComponent;
import os.b;
import p005kotlin.jvm.internal.s0;
import po.s;
import po.u;
import ps.c1;
import ps.d1;
import qw0.z;
import to.f;
import xf1.c;

/* JADX INFO: loaded from: classes7.dex */
public class ActivityMapActivity extends c {

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public static final /* synthetic */ int f29218k0 = 0;
    public String[] A;
    public d1[] B;
    public f C;
    public c1 D;
    public String I;
    public boolean P;
    public ie2.c T;
    public s X;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f29222w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Menu f29223x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public b f29224y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public h f29225z;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f29219r = 1;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public long f29220t = -1;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public String f29221v = null;
    public boolean E = false;
    public boolean F = false;
    public final e Y = ((d) KoinJavaComponent.get(d.class)).Y();
    public final qw0.s Z = (qw0.s) KoinJavaComponent.get$default(qw0.s.class, null, null, 6, null);

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f29226a;

        static {
            int[] iArr = new int[p.values().length];
            f29226a = iArr;
            try {
                iArr[p.LOADING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f29226a[p.SUCCESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f29226a[p.ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static void la(Activity activity, b bVar, h hVar, long j8, boolean z14, boolean z15, d1[] d1VarArr, String str, Boolean bool, Boolean bool2, String str2, ie2.c cVar) {
        Intent intent = new Intent(activity, (Class<?>) ActivityMapActivity.class);
        Bundle bundle = new Bundle();
        bundle.putInt("extraMapMode", bVar.ordinal());
        bundle.putParcelable("GCM_extra_activity_summary", hVar);
        if (j8 != 0) {
            bundle.putLong("GCM_extra_activity_id", j8);
        }
        bundle.putBoolean("isManualActivity", false);
        bundle.putBoolean("GCM_should_fetch_summary_stats", z14);
        bundle.putBoolean("GCM_hide_map_until_camera_idle", z15);
        if (d1VarArr != null) {
            bundle.putParcelableArray("extraMultisportLegs", d1VarArr);
        }
        bundle.putString("extraActivityName", str);
        bundle.putBoolean("extraHasFiveHzData", bool.booleanValue());
        bundle.putBoolean("extraDisplayFullResPolyline", bool2.booleanValue());
        bundle.putString("extraDeviceName", str2);
        if (cVar != null) {
            bundle.putParcelable("extraCameraState", cVar);
        }
        l2.f37135b.getClass();
        l2.a.b().a(intent, bundle);
        activity.startActivity(intent);
    }

    public static void pa(m mVar, b bVar, h hVar) {
        long j8 = hVar.f29448a;
        Boolean bool = Boolean.FALSE;
        la(mVar, bVar, hVar, j8, true, false, null, null, bool, bool, null, null);
    }

    @Override // xf1.c
    public final int ca() {
        return this.f190637c.getHeight();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        c1 c1Var;
        po.h hVar = (po.h) this.f190646l;
        if (hVar != null && (c1Var = hVar.f138853l1) != null && c1Var.d()) {
            l.a aVar = l.f68084a;
            aVar.getClass();
            if (l.a.a().i4() && hVar.N0 != null) {
                aVar.getClass();
                l.a.a().N0();
                hVar.N0.setVisibility(8);
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // xf1.c
    /* JADX INFO: renamed from: ea */
    public final xf1.d getF190646l() {
        return (po.h) this.f190646l;
    }

    @Override // xf1.c
    public final xf1.d ha() {
        xf1.d hVar;
        x0 x0VarC = this.f29225z.C();
        boolean zA = uw0.a.a(x0VarC);
        String str = x0VarC.f4358a;
        if (zA) {
            hVar = new z();
        } else {
            y.f55115a.getClass();
            hVar = (!y.a.c(x0VarC) || z0.b(x0.R0, str)) ? new po.h() : new u();
        }
        Bundle bundle = new Bundle();
        bundle.putInt("extraMapMode", this.f29224y.ordinal());
        bundle.putStringArray("GCM_extra_activity_legs_types", this.A);
        bundle.putParcelable("extraMetricTrackLogs", this.D);
        bundle.putInt("extraMapType", this.f29219r);
        bundle.putBoolean("isManualActivity", this.E);
        bundle.putBoolean("GCM_hide_map_until_camera_idle", this.F);
        bundle.putParcelableArray("extraMultisportLegs", this.B);
        h hVar2 = this.f29225z;
        boolean z14 = false;
        if (hVar2 != null && hVar2.f29451d == ((f12.b) KoinJavaComponent.get(f12.b.class)).getUserProfilePk()) {
            z14 = true;
        }
        bundle.putBoolean("extraIsOwnActivity", z14);
        bundle.putBoolean("extraHasFiveHzData", this.P);
        bundle.putString("extraDeviceName", this.I);
        bundle.putString("extraActivityType", str);
        bundle.putParcelable("extraCameraState", this.T);
        l2.f37135b.getClass();
        l2.a.c(hVar, bundle);
        return hVar;
    }

    public final void ma(String str) {
        Toast.makeText(this, str, 0).show();
        setResult(0);
        finish();
    }

    public final void na() {
        w0 w0VarK;
        po.h hVar;
        SlidingUpPanelLayout slidingUpPanelLayout = (SlidingUpPanelLayout) findViewById(R.id.activity_segments_slide_layout);
        this.f190636b = slidingUpPanelLayout;
        slidingUpPanelLayout.setPanelSlideListener(this);
        this.f190637c = (ViewGroup) findViewById(R.id.activity_segments_details_container);
        ga();
        oa();
        b[] bVarArrValues = b.values();
        Intent intent = getIntent();
        b bVar = b.ACTIVITY_LAPS_MAP;
        this.f29224y = bVarArrValues[intent.getIntExtra("extraMapMode", bVar.ordinal())];
        ia();
        h hVar2 = this.f29225z;
        if (hVar2 != null) {
            po.h hVar3 = (po.h) this.f190646l;
            if (hVar3 != null) {
                hVar3.v7(hVar2, this.C);
            }
        } else {
            s sVar = this.X;
            long j8 = this.f29220t;
            w0 w0VarK2 = sVar.f138973b;
            if (w0VarK2 == null) {
                cw.a.M().getClass();
                w0VarK2 = new i(j8, true).k();
                w0VarK2.getClass();
                sVar.f138973b = w0VarK2;
            }
            w0VarK2.f(this, new po.a(this, 1));
        }
        b bVar2 = this.f29224y;
        if (bVar2 == bVar) {
            this.f29222w = false;
        } else if (bVar2 == b.ACTIVITY_SEGMENTS_MAP) {
            this.f29222w = true;
            am.b bVarM = am.b.M();
            long j14 = this.f29220t;
            bVarM.getClass();
            try {
                String strValueOf = String.valueOf(j14);
                SegmentsFilterDTO.f41188q.getClass();
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("activityId", strValueOf);
                jSONObject.put("showFavorites", true);
                String string = jSONObject.toString();
                string.getClass();
                w0VarK = new r0(j14, string, true).k();
            } catch (Exception e4) {
                i2.f(a2.ACTIVITIES, "ActivitiesDataManager", "Activity segments create request json object error: " + e4.getMessage());
                w0VarK = null;
            }
            w0VarK.f(this, new po.a(this, 2));
        } else if (bVar2 == b.ACTIVITY_MULTISPORT_MAP) {
            this.f29222w = false;
        }
        if (this.f29224y == b.ACTIVITY_SEGMENTS_MAP) {
            ka(c.b.LIST);
            initActionBar(true, R.string.segments_tour_title);
        }
        String str = this.f29225z.C().f4358a;
        if ((z0.P(str) || z0.b(x0.R0, str)) && (hVar = (po.h) this.f190646l) != null && hVar.F7(true)) {
            this.Y.a(true);
        }
        po.h hVar4 = (po.h) this.f190646l;
        if (hVar4 != null) {
            hVar4.f138870w1 = new n(this, 29);
        }
    }

    @Override // xf1.c, xf1.d.a
    public final void o7() {
        hideProgressOverlay();
    }

    public final void oa() {
        int iC;
        h hVar = this.f29225z;
        if (hVar == null) {
            String string = this.f29221v;
            if (string == null) {
                string = getString(R.string.lbl_map);
            }
            super.initActionBar(true, new mn.a(new l22.a(this)).a(string));
            return;
        }
        String string2 = hVar.f29449b;
        if (string2 == null) {
            string2 = getString(R.string.lbl_map);
        }
        super.initActionBar(true, new mn.a(new l22.a(this)).a(string2));
        h hVar2 = this.f29225z;
        qw0.s sVar = this.Z;
        sVar.getClass();
        hVar2.getClass();
        if (sVar.b()) {
            String str = hVar2.C().f4358a;
            qw0.s.f148346a.getClass();
            if (qw0.s.a.a()) {
                Integer numQ = sVar.q(str);
                iC = numQ != null ? numQ.intValue() : fr.b.c(hVar2, true);
            } else {
                iC = fr.b.c(hVar2, false);
            }
        } else {
            iC = fr.b.c(hVar2, false);
        }
        this.f29219r = iC;
        po.h hVar3 = (po.h) this.f190646l;
        if (hVar3 != null) {
            hVar3.G7(iC);
        }
        invalidateOptionsMenu();
    }

    @Override // xf1.c, com.garmin.android.apps.connectmobile.z1, b.g, android.app.Activity
    public final void onBackPressed() {
        finish();
    }

    @Override // xf1.c, com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.gcm_activity_segments_layout);
        this.mProgressOverlay = findViewById(R.id.content_frame_progress_overlay);
        this.f190648n = c.b.MAP;
        Intent intent = getIntent();
        l2.f37135b.getClass();
        Bundle bundleA = l2.a.a(intent);
        if (bundleA == null) {
            return;
        }
        this.P = bundleA.getBoolean("extraHasFiveHzData", false);
        boolean z14 = bundleA.getBoolean("extraDisplayFullResPolyline", false);
        this.I = bundleA.getString("extraDeviceName");
        this.f29220t = bundleA.getLong("GCM_extra_activity_id", -1L);
        this.f29221v = bundleA.getString("extraActivityName");
        this.f29225z = (h) bundleA.getParcelable("GCM_extra_activity_summary");
        this.A = bundleA.getStringArray("GCM_extra_activity_legs_types");
        this.D = (c1) bundleA.getParcelable("extraMetricTrackLogs");
        this.E = bundleA.getBoolean("isManualActivity", false);
        boolean z15 = bundleA.getBoolean("GCM_should_fetch_summary_stats", false);
        this.F = bundleA.getBoolean("GCM_hide_map_until_camera_idle", false);
        Parcelable[] parcelableArray = bundleA.getParcelableArray("extraMultisportLegs");
        if (parcelableArray != null) {
            this.B = (d1[]) Arrays.copyOf(parcelableArray, parcelableArray.length, d1[].class);
        }
        String string = getString(b.values()[bundleA.getInt("extraMapMode")] == b.ACTIVITY_SEGMENTS_MAP ? R.string.segments_tour_title : R.string.lbl_map);
        this.T = (ie2.c) bundleA.getParcelable("extraCameraState");
        initActionBar(true, string);
        s sVar = (s) new x1(this).b(s0.f105811a.b(s.class));
        this.X = sVar;
        long j8 = this.f29220t;
        if (j8 == -1) {
            i2.f(a2.ACTIVITIES, "ActivityMapActivity", "Activity ID missing from intent.");
            ma(getString(R.string.txt_error_occurred));
            return;
        }
        if (!z15) {
            na();
            return;
        }
        w0 w0VarK = sVar.f138972a;
        if (w0VarK == null) {
            cw.a.M().getClass();
            w0VarK = new g(j8, z14, true).k();
            w0VarK.getClass();
            sVar.f138972a = w0VarK;
            sVar.f138973b = t1.a(w0VarK, new p40.h(24));
            sVar.f138974c = t1.a(w0VarK, new p40.h(25));
            sVar.f138975d = t1.a(w0VarK, new p40.h(26));
            sVar.f138976e = t1.a(w0VarK, new p40.h(27));
        }
        w0VarK.f(this, new po.a(this, 0));
    }

    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_map_menu, menu);
        this.f29223x = menu;
        return true;
    }

    @Override // com.garmin.android.apps.connectmobile.z1, android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == R.id.menu_item_map_mode_laps) {
            e eVar = this.Y;
            boolean zE = eVar.e();
            po.h hVar = (po.h) this.f190646l;
            if (hVar != null) {
                if (zE) {
                    if (hVar.F7(false)) {
                        this.f29223x.findItem(R.id.menu_item_map_mode_laps).setChecked(false);
                        eVar.a(false);
                        return true;
                    }
                } else if (hVar.F7(true)) {
                    this.f29223x.findItem(R.id.menu_item_map_mode_laps).setChecked(true);
                    eVar.a(true);
                    return true;
                }
            }
        } else {
            if (itemId != R.id.menu_item_map_mode_segments) {
                if (itemId == R.id.menu_item_map_match) {
                    if (this.f29223x.findItem(R.id.menu_item_map_match).isChecked()) {
                        l.f68084a.getClass();
                        l.a.a().M4(com.garmin.android.library.mapsdkadapter.i.b.GCJ02);
                        ((po.h) this.f190646l).f148294e.X(false);
                        this.f29223x.findItem(R.id.menu_item_map_match).setChecked(false);
                        return true;
                    }
                    l.f68084a.getClass();
                    l.a.a().M4(com.garmin.android.library.mapsdkadapter.i.b.WGS84);
                    ((po.h) this.f190646l).f148294e.X(true);
                    this.f29223x.findItem(R.id.menu_item_map_match).setChecked(true);
                    return true;
                }
                if (itemId == R.id.menu_item_map) {
                    ka(c.b.MAP);
                    oa();
                    qa(this.f190648n);
                    invalidateOptionsMenu();
                    return true;
                }
                if (itemId == R.id.menu_item_list) {
                    ka(c.b.LIST);
                    initActionBar(true, R.string.segments_tour_title);
                    qa(this.f190648n);
                    invalidateOptionsMenu();
                    return true;
                }
                if (itemId != R.id.menu_item_help) {
                    return super.onOptionsItemSelected(menuItem);
                }
                if (z0.X(this.f29225z.C().f4358a)) {
                    HelpActivity.da(this, ro0.l.SURF_WAVE_DISTANCE, null, null);
                    return true;
                }
                if (!z0.a0(this.f29225z.C().f4358a)) {
                    return false;
                }
                HelpActivity.da(this, ro0.l.WAKESPORTS_RUN_DISTANCE, null, null);
                return true;
            }
            po.h hVar2 = (po.h) this.f190646l;
            if (hVar2 != null) {
                boolean z14 = this.f29222w;
                qe2.h hVar3 = hVar2.f148294e;
                if (!z14) {
                    if (hVar3 != null) {
                        hVar2.P0 = true;
                        hVar2.z6(hVar2.f190664n);
                        this.f29223x.findItem(R.id.menu_item_map_mode_segments).setChecked(true);
                        this.f29222w = true;
                    }
                    return true;
                }
                if (hVar3 != null) {
                    hVar2.P0 = false;
                    this.f29223x.findItem(R.id.menu_item_map_mode_segments).setChecked(false);
                    this.f29222w = false;
                }
            }
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:28:0x00d7  */
    @Override // android.app.Activity
    public final boolean onPrepareOptionsMenu(Menu menu) {
        po.h hVar = (po.h) this.f190646l;
        if (hVar == null || hVar.f148294e == null) {
            MenuItem menuItemFindItem = this.f29223x.findItem(R.id.menu_item_map);
            MenuItem menuItemFindItem2 = this.f29223x.findItem(R.id.menu_item_list);
            menuItemFindItem.setVisible(false);
            menuItemFindItem2.setVisible(false);
            return super.onPrepareOptionsMenu(menu);
        }
        menu.findItem(R.id.menu_item_help).setVisible(z0.X(this.f29225z.C().f4358a) || z0.a0(this.f29225z.C().f4358a));
        MenuItem menuItemFindItem3 = this.f29223x.findItem(R.id.menu_item_map);
        MenuItem menuItemFindItem4 = this.f29223x.findItem(R.id.menu_item_list);
        menuItemFindItem3.setVisible(false);
        menuItemFindItem4.setVisible(false);
        menu.findItem(R.id.menu_item_map_mode_laps).setVisible(false);
        b bVar = this.f29224y;
        if (bVar == b.ACTIVITY_LAPS_MAP) {
            MenuItem menuItemFindItem5 = menu.findItem(R.id.menu_item_map_match);
            com.garmin.android.library.mapsdkadapter.i.d f118185r = ((po.h) this.f190646l).f148294e.f144584a.getF50264r();
            com.garmin.android.library.mapsdkadapter.i.d dVar = com.garmin.android.library.mapsdkadapter.i.d.GOOGLE;
            if (f118185r != dVar) {
                menuItemFindItem5.setVisible(true);
                l.f68084a.getClass();
                menuItemFindItem5.setChecked(l.a.a().G1() == com.garmin.android.library.mapsdkadapter.i.b.WGS84);
            } else if (((po.h) this.f190646l).f148294e.f144584a.getF50264r() == dVar) {
                qe2.h hVar2 = ((po.h) this.f190646l).f148294e;
                if ((hVar2.f144584a.Q().stream().anyMatch(new im.c(7)) ? Boolean.TRUE : Boolean.valueOf(hVar2.f144584a.s().stream().anyMatch(new im.c(8)))).booleanValue()) {
                    menuItemFindItem5.setVisible(true);
                    l.f68084a.getClass();
                    menuItemFindItem5.setChecked(l.a.a().G1() == com.garmin.android.library.mapsdkadapter.i.b.WGS84);
                }
            }
        } else if (bVar == b.ACTIVITY_SEGMENTS_MAP) {
            qa(this.f190648n);
        }
        return super.onPrepareOptionsMenu(menu);
    }

    public final void qa(c.b bVar) {
        MenuItem menuItemFindItem = this.f29223x.findItem(R.id.menu_item_map);
        MenuItem menuItemFindItem2 = this.f29223x.findItem(R.id.menu_item_list);
        menuItemFindItem.setVisible(bVar != c.b.MAP);
        menuItemFindItem2.setVisible(bVar != c.b.LIST);
    }
}
