package com.garmin.android.apps.connectmobile.golf.courses.presentation;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import androidx.fragment.app.v;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.c;
import jl0.d;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import qe2.h;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/golf/courses/presentation/GolfCourseFullScreenMapActivity;", "Lcom/garmin/android/apps/connectmobile/c;", "<init>", "()V", "a", "gcm-golf_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class GolfCourseFullScreenMapActivity extends c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f35749d = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public d f35750a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Menu f35751b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f35752c;

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.gcm_golf_download_course_map_fragment);
        Bundle extras = getIntent().getExtras();
        String string = (extras == null || !extras.containsKey("GOLF_COURSE_NAME")) ? null : extras.getString("GOLF_COURSE_NAME");
        d dVar = (d) getSupportFragmentManager().G("GolfCourseFullScreenMapFragment");
        this.f35750a = dVar;
        if (dVar == null) {
            d dVar2 = new d();
            dVar2.setArguments(getIntent().getExtras());
            v supportFragmentManager = getSupportFragmentManager();
            supportFragmentManager.getClass();
            androidx.fragment.app.a aVar = new androidx.fragment.app.a(supportFragmentManager);
            aVar.l(R.id.map_frag_container, dVar2, "GolfCourseFullScreenMapFragment");
            aVar.e();
            this.f35750a = dVar2;
        }
        if (string == null) {
            string = getResources().getString(R.string.lbl_golf_course);
            string.getClass();
        }
        initActionBar(true, string);
    }

    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        menu.getClass();
        getMenuInflater().inflate(R.menu.golf_course_map_setting, menu);
        this.f35751b = menu;
        this.f35752c = true;
        MenuItem menuItemFindItem = menu.findItem(R.id.menu_item_map_mode_satellite);
        if (menuItemFindItem != null) {
            menuItemFindItem.setTitle(R.string.txt_map_view);
        }
        return true;
    }

    @Override // com.garmin.android.apps.connectmobile.z1, android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        MenuItem menuItemFindItem;
        MenuItem menuItemFindItem2;
        menuItem.getClass();
        if (menuItem.getItemId() != R.id.menu_item_map_mode_satellite) {
            return super.onOptionsItemSelected(menuItem);
        }
        d dVar = this.f35750a;
        if (dVar != null) {
            boolean z14 = this.f35752c;
            h hVar = dVar.f148294e;
            if (z14) {
                if (hVar != null) {
                    hVar.setMapType(1);
                    this.f35752c = false;
                    Menu menu = this.f35751b;
                    if (menu != null && (menuItemFindItem2 = menu.findItem(R.id.menu_item_map_mode_satellite)) != null) {
                        menuItemFindItem2.setTitle(R.string.txt_satellite_view);
                    }
                }
                return true;
            }
            if (hVar != null) {
                hVar.setMapType(4);
                this.f35752c = true;
                Menu menu2 = this.f35751b;
                if (menu2 != null && (menuItemFindItem = menu2.findItem(R.id.menu_item_map_mode_satellite)) != null) {
                    menuItemFindItem.setTitle(R.string.txt_map_view);
                }
            }
        }
        return true;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/garmin/android/apps/connectmobile/golf/courses/presentation/GolfCourseFullScreenMapActivity$a;", "", "<init>", "()V", "", "GOLF_COURSE_NAME", "Ljava/lang/String;", "GOLF_COURSE_LATITUDE", "GOLF_COURSE_LONGITUDE", "gcm-golf_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
