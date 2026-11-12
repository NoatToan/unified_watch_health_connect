package com.garmin.android.apps.connectmobile.segments.presentation;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;
import androidx.core.view.j;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.v;
import c22.s3;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.g1;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.segments.model.StravaStatusDTO;
import com.garmin.android.apps.connectmobile.segments.presentation.MySegmentsActivity;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import rt1.m;
import z10.l0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/segments/presentation/MySegmentsActivity;", "Lcom/garmin/android/apps/connectmobile/segments/presentation/a;", "Lcom/garmin/android/apps/connectmobile/segments/presentation/c$b;", "Lbo1/c;", "<init>", "()V", "a", "gcm-segments_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class MySegmentsActivity extends com.garmin.android.apps.connectmobile.segments.presentation.a implements c.b, bo1.c {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ int f41380y = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f41381h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public MenuItem f41382i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public MenuItem f41383j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public MenuItem f41384k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public MenuItem f41385l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public c f41386m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public i f41387n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public d f41388o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public i f41389p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f41390q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f41391r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public long f41392t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public b f41393v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public cg1.i f41394w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public fr1.h f41395x;

    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001¨\u0006\u0003"}, d2 = {"com/garmin/android/apps/connectmobile/segments/presentation/MySegmentsActivity$b", "Lcom/garmin/android/library/backgroundtaskmanagement/b$b;", "", "gcm-segments_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b implements com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b<Object> {
        public b() {
        }

        @Override // com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b
        public final void onComplete(long j8, com.garmin.android.library.backgroundtaskmanagement.b.c cVar) {
            cVar.getClass();
            MySegmentsActivity mySegmentsActivity = MySegmentsActivity.this;
            if (mySegmentsActivity.isFinishing()) {
                return;
            }
            mySegmentsActivity.hideProgressOverlay();
            g1.b(mySegmentsActivity, cVar);
            fr1.h hVar = mySegmentsActivity.f41395x;
            boolean z14 = false;
            if (hVar == null) {
                mySegmentsActivity.f41391r = false;
                mySegmentsActivity.sa();
                return;
            }
            StravaStatusDTO stravaStatusDTO = hVar.f73307b;
            if (mySegmentsActivity.qa()) {
                fr1.h hVar2 = mySegmentsActivity.f41395x;
                hVar2.getClass();
                if (hVar2.f() && stravaStatusDTO != null) {
                    mySegmentsActivity.f41391r = true;
                    fr1.h hVar3 = mySegmentsActivity.f41395x;
                    hVar3.getClass();
                    StravaStatusDTO stravaStatusDTO2 = hVar3.f73307b;
                    if (stravaStatusDTO2 != null && stravaStatusDTO2.f41333e == StravaStatusDTO.c.OPT_IN) {
                        z14 = true;
                    }
                    mySegmentsActivity.f41390q = z14;
                    if (z14) {
                        mySegmentsActivity.ta();
                        return;
                    } else {
                        mySegmentsActivity.sa();
                        return;
                    }
                }
            }
            mySegmentsActivity.f41391r = false;
            mySegmentsActivity.sa();
        }

        @Override // com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b
        public final void onResults(long j8, com.garmin.android.library.backgroundtaskmanagement.b.e eVar, Object obj) {
            eVar.getClass();
            obj.getClass();
            MySegmentsActivity mySegmentsActivity = MySegmentsActivity.this;
            if (mySegmentsActivity.isFinishing()) {
                return;
            }
            mySegmentsActivity.hideProgressOverlay();
            mySegmentsActivity.f41395x = (fr1.h) obj;
        }
    }

    static {
        new a(null);
    }

    @Override // com.garmin.android.apps.connectmobile.segments.presentation.c.b
    public final void D8(List<bg1.b> list, boolean z14, boolean z15) {
        fr1.h hVar;
        hideProgressOverlay();
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            arrayList.addAll(list);
        }
        oa(arrayList, z14);
        ua();
        if (z15 && (list == null || list.isEmpty())) {
            return;
        }
        if (((f12.b) KoinJavaComponent.get$default(f12.b.class, null, null, 6, null)).f()) {
            if (list == null || list.isEmpty()) {
                wa();
                return;
            }
            return;
        }
        if (list == null || list.isEmpty()) {
            wa();
            return;
        }
        if (!qa() && !this.f41390q) {
            if (this.f41387n == null) {
                i.f41451c.getClass();
                this.f41387n = i.a.a(1);
                v supportFragmentManager = getSupportFragmentManager();
                androidx.fragment.app.a aVarB = j.b(supportFragmentManager, supportFragmentManager);
                i iVar = this.f41387n;
                iVar.getClass();
                aVarB.l(R.id.strava_marketing_banner, iVar, "mStravaMarketingBannerFragment");
                aVarB.e();
                return;
            }
            return;
        }
        if (!qa() || (hVar = this.f41395x) == null || hVar.d()) {
            return;
        }
        if (this.f41389p == null) {
            i.f41451c.getClass();
            this.f41389p = i.a.a(2);
        }
        v supportFragmentManager2 = getSupportFragmentManager();
        androidx.fragment.app.a aVarB2 = j.b(supportFragmentManager2, supportFragmentManager2);
        i iVar2 = this.f41389p;
        iVar2.getClass();
        aVarB2.l(R.id.strava_marketing_banner, iVar2, "mGoPremiumFragment");
        aVarB2.e();
    }

    @Override // com.garmin.android.apps.connectmobile.segments.presentation.c.b
    public final void P5() {
        wa();
    }

    @Override // com.garmin.android.apps.connectmobile.segments.presentation.c.b
    public final void T5(bg1.a aVar) {
        if (aVar != null) {
            SegmentDetailsActivity.Z.getClass();
            SegmentDetailsActivity.a.b(this, aVar, 1);
        }
    }

    @Override // com.garmin.android.apps.connectmobile.segments.presentation.a, com.garmin.android.apps.connectmobile.r0
    public final String fa() {
        return "SEGMENTS";
    }

    @Override // com.garmin.android.apps.connectmobile.c
    public final l0 getConsentBannerScreen() {
        return l0.SEGMENTS;
    }

    @Override // com.garmin.android.apps.connectmobile.r0, com.garmin.android.apps.connectmobile.z1, androidx.fragment.app.m, b.g, android.app.Activity
    public final void onActivityResult(int i14, int i15, Intent intent) {
        Object serializable;
        xf1.i iVar;
        if (i14 == 0) {
            long jI = ((ag1.a) KoinJavaComponent.get$default(ag1.a.class, null, null, 6, null)).i();
            if (jI < 1) {
                return;
            }
            if (((m) KoinJavaComponent.get$default(m.class, null, null, 6, null)).a(jI)) {
                na(R.string.msg_segments_show_on_sync, jI);
                return;
            }
            Toast toastMakeText = Toast.makeText(this, getText(R.string.connect_iq_device_not_connected_title), 1);
            toastMakeText.setGravity(49, 0, 150);
            toastMakeText.show();
            return;
        }
        if (i14 != 1) {
            if (i14 != 2) {
                super.onActivityResult(i14, i15, intent);
                return;
            } else {
                pa();
                return;
            }
        }
        if (i15 == -1) {
            ((ag1.a) KoinJavaComponent.get$default(ag1.a.class, null, null, 6, null)).g();
            if (this.f41386m == null || intent == null || intent.getExtras() == null) {
                return;
            }
            Bundle extras = intent.getExtras();
            extras.getClass();
            if (Build.VERSION.SDK_INT >= 33) {
                serializable = extras.getSerializable("GCM_extra_segment_is_favorite", HashMap.class);
            } else {
                Object serializable2 = extras.getSerializable("GCM_extra_segment_is_favorite");
                serializable = (HashMap) (serializable2 instanceof HashMap ? serializable2 : null);
            }
            HashMap<String, Boolean> map = (HashMap) serializable;
            c cVar = this.f41386m;
            cVar.getClass();
            if (map == null || (iVar = cVar.f41431x) == null) {
                return;
            }
            iVar.a(map);
        }
    }

    @Override // androidx.fragment.app.m
    public final void onAttachFragment(Fragment fragment) {
        fragment.getClass();
        super.onAttachFragment(fragment);
        String tag = fragment.getTag();
        if ("mySegmentsListFragTag".equals(tag) || "mySegmentsStravaFragTag".equals(tag)) {
            this.f41381h = tag;
            i2.a.c(i2.f36769a, "MySegmentsActivity", "onAttachFragment: frag tag [" + tag + "], calling 'invalidateOptionsMenu()'");
            invalidateOptionsMenu();
        }
    }

    @Override // com.garmin.android.apps.connectmobile.segments.presentation.a, com.garmin.android.apps.connectmobile.r0, com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.gcm3_my_segments);
        initActionBar(true, R.string.card_segments_title);
        ca("SEGMENTS");
        if (s3.b()) {
            ht.a.f85464a.getClass();
            ht.a.a(null, "PageViewChildSegments");
        }
    }

    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        menu.getClass();
        getMenuInflater().inflate(R.menu.my_segments_list, menu);
        this.f41382i = menu.findItem(R.id.menu_item_explore_segments);
        this.f41383j = menu.findItem(R.id.menu_item_send_to_device);
        this.f41384k = menu.findItem(R.id.menu_item_source_garmin);
        this.f41385l = menu.findItem(R.id.menu_item_source_strava);
        return true;
    }

    @Override // com.garmin.android.apps.connectmobile.z1, android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        menuItem.getClass();
        int itemId = menuItem.getItemId();
        if (itemId == R.id.menu_item_send_to_device) {
            ((ag1.a) KoinJavaComponent.get$default(ag1.a.class, null, null, 6, null)).o(this, 0);
            return true;
        }
        if (itemId == R.id.menu_item_explore_segments) {
            ExploreSegmentsActivity.C.getClass();
            startActivity(new Intent(this, (Class<?>) ExploreSegmentsActivity.class));
            return true;
        }
        if (itemId == R.id.menu_item_source_garmin) {
            MenuItem menuItem2 = this.f41384k;
            menuItem2.getClass();
            if (!menuItem2.isChecked()) {
                final int i14 = 0;
                new androidx.appcompat.app.e.a(this).setTitle("").setMessage(R.string.segments_view_garmin_segments_msg).setPositiveButton(R.string.lbl_yes, new DialogInterface.OnClickListener(this) { // from class: cg1.h

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ MySegmentsActivity f27148b;

                    {
                        this.f27148b = this;
                    }

                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i15) {
                        int i16 = i14;
                        MySegmentsActivity mySegmentsActivity = this.f27148b;
                        switch (i16) {
                            case 0:
                                int i17 = MySegmentsActivity.f41380y;
                                dialogInterface.dismiss();
                                mySegmentsActivity.sa();
                                mySegmentsActivity.va();
                                break;
                            default:
                                int i18 = MySegmentsActivity.f41380y;
                                dialogInterface.dismiss();
                                mySegmentsActivity.ta();
                                mySegmentsActivity.va();
                                break;
                        }
                    }
                }).setNegativeButton(R.string.lbl_no, new ag0.e(23)).show();
                return true;
            }
        } else {
            if (itemId != R.id.menu_item_source_strava) {
                return super.onOptionsItemSelected(menuItem);
            }
            MenuItem menuItem3 = this.f41385l;
            menuItem3.getClass();
            if (!menuItem3.isChecked()) {
                final int i15 = 1;
                new androidx.appcompat.app.e.a(this).setTitle("").setMessage(R.string.segments_view_strava_segments_msg).setPositiveButton(R.string.lbl_yes, new DialogInterface.OnClickListener(this) { // from class: cg1.h

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ MySegmentsActivity f27148b;

                    {
                        this.f27148b = this;
                    }

                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i16) {
                        int i17 = i15;
                        MySegmentsActivity mySegmentsActivity = this.f27148b;
                        switch (i17) {
                            case 0:
                                int i18 = MySegmentsActivity.f41380y;
                                dialogInterface.dismiss();
                                mySegmentsActivity.sa();
                                mySegmentsActivity.va();
                                break;
                            default:
                                int i19 = MySegmentsActivity.f41380y;
                                dialogInterface.dismiss();
                                mySegmentsActivity.ta();
                                mySegmentsActivity.va();
                                break;
                        }
                    }
                }).setNegativeButton(R.string.lbl_no, new ag0.e(24)).show();
            }
        }
        return true;
    }

    @Override // android.app.Activity
    public final boolean onPrepareOptionsMenu(Menu menu) {
        menu.getClass();
        ua();
        oc.b.G(this.f41382i, this, R.color.gcm_icon_primary);
        return super.onPrepareOptionsMenu(menu);
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, android.app.Activity
    public final void onResume() {
        super.onResume();
        pa();
    }

    @Override // com.garmin.android.apps.connectmobile.c, i.c, androidx.fragment.app.m, android.app.Activity
    public final void onStop() {
        super.onStop();
        com.garmin.android.library.backgroundtaskmanagement.c.f50123c.a(this.f41392t);
    }

    public final void pa() {
        if (((f12.b) KoinJavaComponent.get$default(f12.b.class, null, null, 6, null)).f()) {
            this.f41391r = false;
            sa();
        } else {
            showProgressOverlay();
            this.f41393v = new b();
            this.f41392t = ((ag1.a) KoinJavaComponent.get$default(ag1.a.class, null, null, 6, null)).m(this.f41393v);
        }
    }

    public final boolean qa() {
        fr1.h hVar = this.f41395x;
        if (hVar == null) {
            return false;
        }
        hVar.getClass();
        return hVar.b();
    }

    public final void ra(String str) {
        if (str.equals("STRAVA_MARKETING_TIP")) {
            i iVar = (i) getSupportFragmentManager().G("mStravaMarketingBannerFragment");
            this.f41387n = iVar;
            if (iVar != null) {
                v supportFragmentManager = getSupportFragmentManager();
                androidx.fragment.app.a aVarB = j.b(supportFragmentManager, supportFragmentManager);
                i iVar2 = this.f41387n;
                iVar2.getClass();
                aVarB.k(iVar2);
                aVarB.e();
                return;
            }
            return;
        }
        if (str.equals("STRAVA_GO_PREMIUM_TIP")) {
            i iVar3 = (i) getSupportFragmentManager().G("mGoPremiumFragment");
            this.f41389p = iVar3;
            if (iVar3 != null) {
                v supportFragmentManager2 = getSupportFragmentManager();
                androidx.fragment.app.a aVarB2 = j.b(supportFragmentManager2, supportFragmentManager2);
                i iVar4 = this.f41389p;
                iVar4.getClass();
                aVarB2.k(iVar4);
                aVarB2.e();
            }
        }
    }

    public final void sa() {
        i2.a.c(i2.f36769a, "MySegmentsActivity", "selectGarminSegmentsFragment");
        this.f41390q = false;
        c cVar = (c) getSupportFragmentManager().G("mySegmentsListFragTag");
        this.f41386m = cVar;
        if (cVar == null) {
            c.A.getClass();
            this.f41386m = new c();
        }
        v supportFragmentManager = getSupportFragmentManager();
        androidx.fragment.app.a aVarB = j.b(supportFragmentManager, supportFragmentManager);
        c cVar2 = this.f41386m;
        cVar2.getClass();
        aVarB.l(R.id.data_container, cVar2, "mySegmentsListFragTag");
        aVarB.s(true, true);
    }

    public final void ta() {
        i2.a.c(i2.f36769a, "MySegmentsActivity", "selectStravaSegmentsFragment");
        this.f41390q = true;
        ra("STRAVA_MARKETING_TIP");
        ra("STRAVA_GO_PREMIUM_TIP");
        fr1.h hVar = this.f41395x;
        boolean z14 = hVar != null && hVar.d();
        h hVar2 = (h) getSupportFragmentManager().G("mySegmentsStravaFragTag");
        if (hVar2 == null) {
            h.a aVar = h.f41449b;
            int i14 = z14 ? 1 : 2;
            aVar.getClass();
            hVar2 = new h();
            Bundle bundle = new Bundle();
            bundle.putInt("BANNER_MODE", i14);
            hVar2.setArguments(bundle);
        }
        v supportFragmentManager = getSupportFragmentManager();
        supportFragmentManager.getClass();
        androidx.fragment.app.a aVar2 = new androidx.fragment.app.a(supportFragmentManager);
        aVar2.l(R.id.data_container, hVar2, "mySegmentsStravaFragTag");
        aVar2.s(true, true);
    }

    public final void ua() {
        String str = this.f41381h;
        if (str == null) {
            MenuItem menuItem = this.f41382i;
            menuItem.getClass();
            menuItem.setVisible(false);
            MenuItem menuItem2 = this.f41383j;
            menuItem2.getClass();
            menuItem2.setVisible(false);
            MenuItem menuItem3 = this.f41384k;
            menuItem3.getClass();
            menuItem3.setVisible(false);
            MenuItem menuItem4 = this.f41385l;
            menuItem4.getClass();
            menuItem4.setVisible(false);
            i2.a.c(i2.f36769a, "MySegmentsActivity", "updateMenuItemsVisibility: no frag loaded, set all menu items to invisible");
            return;
        }
        if (!str.equals("mySegmentsListFragTag")) {
            if (str.equals("mySegmentsStravaFragTag")) {
                MenuItem menuItem5 = this.f41382i;
                menuItem5.getClass();
                menuItem5.setVisible(false);
                MenuItem menuItem6 = this.f41383j;
                menuItem6.getClass();
                menuItem6.setVisible(false);
                MenuItem menuItem7 = this.f41384k;
                menuItem7.getClass();
                menuItem7.setVisible(true);
                MenuItem menuItem8 = this.f41385l;
                menuItem8.getClass();
                menuItem8.setVisible(true);
                MenuItem menuItem9 = this.f41384k;
                menuItem9.getClass();
                menuItem9.setChecked(false);
                MenuItem menuItem10 = this.f41385l;
                menuItem10.getClass();
                menuItem10.setChecked(true);
                i2.a.c(i2.f36769a, "MySegmentsActivity", "updateMenuItemsVisibility: strava frag loaded");
                return;
            }
            return;
        }
        MenuItem menuItem11 = this.f41382i;
        menuItem11.getClass();
        menuItem11.setVisible(true);
        MenuItem menuItem12 = this.f41383j;
        menuItem12.getClass();
        ArrayList arrayList = this.f41420f;
        menuItem12.setVisible(arrayList != null && arrayList.size() > 0);
        int i14 = !this.f41391r ? 1 : 0;
        MenuItem menuItem13 = this.f41383j;
        menuItem13.getClass();
        menuItem13.setShowAsAction(i14);
        boolean z14 = this.f41391r;
        MenuItem menuItem14 = this.f41384k;
        if (!z14) {
            menuItem14.getClass();
            menuItem14.setVisible(false);
            MenuItem menuItem15 = this.f41385l;
            menuItem15.getClass();
            menuItem15.setVisible(false);
            i2.a.c(i2.f36769a, "MySegmentsActivity", "updateMenuItemsVisibility: garmin frag loaded, strava segments NOT enabled");
            return;
        }
        menuItem14.getClass();
        menuItem14.setVisible(true);
        MenuItem menuItem16 = this.f41385l;
        menuItem16.getClass();
        menuItem16.setVisible(true);
        MenuItem menuItem17 = this.f41384k;
        menuItem17.getClass();
        menuItem17.setChecked(true);
        MenuItem menuItem18 = this.f41385l;
        menuItem18.getClass();
        menuItem18.setChecked(false);
        i2.a.c(i2.f36769a, "MySegmentsActivity", "updateMenuItemsVisibility: garmin frag loaded, strava segments ARE enabled");
    }

    public final void va() {
        if (hasInternetConnection() && this.f41395x != null && qa()) {
            fr1.h hVar = this.f41395x;
            hVar.getClass();
            if (hVar.f()) {
                fr1.h hVar2 = this.f41395x;
                hVar2.getClass();
                StravaStatusDTO stravaStatusDTO = hVar2.f73307b;
                if (stravaStatusDTO != null) {
                    stravaStatusDTO.f41333e = this.f41390q ? StravaStatusDTO.c.OPT_IN : StravaStatusDTO.c.OPT_OUT;
                }
                this.f41394w = new cg1.i(this);
                ((ag1.a) KoinJavaComponent.get$default(ag1.a.class, null, null, 6, null)).h(stravaStatusDTO, this.f41394w);
            }
        }
    }

    @Override // bo1.c
    public final void w4(String str) {
        ra(str);
    }

    public final void wa() {
        if (!this.f41391r && !qa()) {
            d dVar = (d) getSupportFragmentManager().G("STRAVA_AD_FRAG_TAG");
            this.f41388o = dVar;
            if (dVar == null) {
                d.f41436b.getClass();
                this.f41388o = new d();
            }
            v supportFragmentManager = getSupportFragmentManager();
            androidx.fragment.app.a aVarB = j.b(supportFragmentManager, supportFragmentManager);
            d dVar2 = this.f41388o;
            dVar2.getClass();
            aVarB.l(R.id.data_container, dVar2, "STRAVA_AD_FRAG_TAG");
            aVarB.e();
            return;
        }
        d dVar3 = (d) getSupportFragmentManager().G("STRAVA_AD_FRAG_TAG");
        this.f41388o = dVar3;
        if (dVar3 == null) {
            d.f41436b.getClass();
            d dVar4 = new d();
            Bundle bundle = new Bundle();
            bundle.putInt("STARTUP_MODE", 2);
            dVar4.setArguments(bundle);
            this.f41388o = dVar4;
        }
        v supportFragmentManager2 = getSupportFragmentManager();
        androidx.fragment.app.a aVarB2 = j.b(supportFragmentManager2, supportFragmentManager2);
        d dVar5 = this.f41388o;
        dVar5.getClass();
        aVarB2.l(R.id.data_container, dVar5, "STRAVA_AD_FRAG_TAG");
        fr1.h hVar = this.f41395x;
        if (hVar != null) {
            if (hVar.d()) {
                if (this.f41387n == null) {
                    i.f41451c.getClass();
                    this.f41387n = i.a.a(2);
                }
                i iVar = this.f41387n;
                iVar.getClass();
                aVarB2.l(R.id.strava_marketing_banner, iVar, "mStravaMarketingBannerFragment");
            } else {
                i iVar2 = (i) getSupportFragmentManager().G("mGoPremiumFragment");
                this.f41389p = iVar2;
                if (iVar2 == null) {
                    i.f41451c.getClass();
                    this.f41389p = i.a.a(2);
                }
                i iVar3 = this.f41389p;
                iVar3.getClass();
                aVarB2.l(R.id.strava_marketing_banner, iVar3, "mGoPremiumFragment");
            }
        }
        aVarB2.e();
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\f8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u000e¨\u0006\u0011"}, d2 = {"Lcom/garmin/android/apps/connectmobile/segments/presentation/MySegmentsActivity$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "LIST_FRAG_TAG", "STRAVA_FRAG_TAG", "STRAVA_AD_FRAG_TAG", "STRAVA_MARKETING_BANNER_TAG", "STRAVA_FRAG_PREMIUM_TAG", "", "REQUEST_CODE_TARGET_DEVICE_SELECTION", "I", "REQUEST_CODE_OPEN_DETAILS", "REQUEST_CODE_LAUNCH_STRAVA", "gcm-segments_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
