package com.garmin.android.apps.connectmobile.segments.domain;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.Menu;
import android.view.MenuItem;
import androidx.fragment.app.v;
import cg1.t;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.c;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.l2;
import com.garmin.android.apps.connectmobile.segments.model.SegmentDetailsDTO;
import com.garmin.android.library.mapsdkadapter.i;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import qe2.h;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/segments/domain/SegmentMapActivity;", "Lcom/garmin/android/apps/connectmobile/c;", "<init>", "()V", "a", "gcm-segments_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class SegmentMapActivity extends c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f41270c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public t f41271a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f41272b = 1;

    public final void ca(int i14) {
        this.f41272b = i14;
        t tVar = this.f41271a;
        tVar.getClass();
        int i15 = this.f41272b;
        if (tVar.f27202i != i15) {
            tVar.f27202i = i15;
            h hVar = tVar.f148294e;
            if (hVar != null) {
                hVar.setMapType(i15);
            }
        }
        invalidateOptionsMenu();
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        SegmentDetailsDTO segmentDetailsDTO;
        Parcelable parcelable;
        super.onCreate(bundle);
        setContentView(R.layout.gcm3_segment_details_map_activity);
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            if (Build.VERSION.SDK_INT >= 33) {
                parcelable = (Parcelable) extras.getParcelable("GCM_extra_segment_data", SegmentDetailsDTO.class);
            } else {
                Parcelable parcelable2 = extras.getParcelable("GCM_extra_segment_data");
                if (!(parcelable2 instanceof SegmentDetailsDTO)) {
                    parcelable2 = null;
                }
                parcelable = (SegmentDetailsDTO) parcelable2;
            }
            segmentDetailsDTO = (SegmentDetailsDTO) parcelable;
        } else {
            segmentDetailsDTO = null;
        }
        if (segmentDetailsDTO == null) {
            i2.a.j(i2.f36769a, "SegmentMapActivity", "Missing segment detail");
            finish();
        }
        initActionBar(true, segmentDetailsDTO != null ? segmentDetailsDTO.f17838c : "");
        v supportFragmentManager = getSupportFragmentManager();
        supportFragmentManager.getClass();
        androidx.fragment.app.a aVar = new androidx.fragment.app.a(supportFragmentManager);
        t.f27200j.getClass();
        Bundle bundle2 = new Bundle();
        t tVar = new t();
        l2.f37135b.getClass();
        l2.a.c(tVar, bundle2);
        bundle2.putParcelable("GCM_extra_segment_data", segmentDetailsDTO);
        this.f41271a = tVar;
        aVar.j(R.id.frag_segment_map, tVar, null, 1);
        aVar.e();
    }

    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        menu.getClass();
        getMenuInflater().inflate(R.menu.segment_map_menu, menu);
        return true;
    }

    @Override // com.garmin.android.apps.connectmobile.z1, android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        menuItem.getClass();
        int itemId = menuItem.getItemId();
        if (itemId == R.id.menu_item_map_mode_map) {
            ca(1);
            return true;
        }
        if (itemId == R.id.menu_item_map_mode_satellite) {
            ca(4);
            return true;
        }
        if (itemId != R.id.menu_item_map_mode_hybrid) {
            return super.onOptionsItemSelected(menuItem);
        }
        ca(4);
        return true;
    }

    @Override // android.app.Activity
    public final boolean onPrepareOptionsMenu(Menu menu) {
        menu.getClass();
        MenuItem menuItemFindItem = menu.findItem(R.id.menu_item_map_mode_map);
        MenuItem menuItemFindItem2 = menu.findItem(R.id.menu_item_map_mode_satellite);
        MenuItem menuItemFindItem3 = menu.findItem(R.id.menu_item_map_mode_hybrid);
        t tVar = this.f41271a;
        tVar.getClass();
        h hVar = tVar.f148294e;
        menuItemFindItem3.setVisible((hVar != null ? hVar.f144584a.getF118185r() : null) == i.d.GOOGLE);
        menuItemFindItem.setChecked(this.f41272b == 1);
        menuItemFindItem2.setChecked(this.f41272b == 4);
        menuItemFindItem3.setChecked(this.f41272b == 4);
        return true;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/segments/domain/SegmentMapActivity$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-segments_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        public static void a(Context context, SegmentDetailsDTO segmentDetailsDTO) {
            Intent intent = new Intent(context, (Class<?>) SegmentMapActivity.class);
            Bundle bundle = new Bundle();
            bundle.putParcelable("GCM_extra_segment_data", segmentDetailsDTO);
            l2.f37135b.getClass();
            l2.a.b().a(intent, bundle);
            context.startActivity(intent);
        }

        private a() {
        }
    }
}
