package com.garmin.android.apps.connectmobile.developer.glogger;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.app.e;
import androidx.core.view.j;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.v;
import androidx.recyclerview.widget.RecyclerView;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.z1;
import f20.i;
import gt2.b;
import gt2.c;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/developer/glogger/GloggerAdminActivity;", "Lcom/garmin/android/apps/connectmobile/z1;", "<init>", "()V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class GloggerAdminActivity extends z1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f33666d = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f33667a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public e f33668b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Menu f33669c;

    static {
        new a(null);
    }

    public final void aa(String[] strArr, boolean z14) {
        for (String str : strArr) {
            if (z14) {
                String str2 = this.f33667a;
                str2.getClass();
                int i14 = c.f79010a;
                str.getClass();
                b.f79005a.d(new gt2.a(str, str2), false, true);
            } else {
                int i15 = c.f79010a;
                str.getClass();
                b.f79005a.d(new gt2.a(str, ""), false, true);
            }
            c.b(str).debug("file logger initialized by GloggerAdmin");
        }
    }

    public final void ba() {
        v supportFragmentManager = getSupportFragmentManager();
        androidx.fragment.app.a aVarB = j.b(supportFragmentManager, supportFragmentManager);
        aVarB.l(R.id.content_frame, new i80.e(), "FileLoggersFrag");
        aVarB.s(true, true);
    }

    public final void ca(String str) {
        this.f33668b = new e.a(this).setIcon(android.R.drawable.ic_dialog_alert).setTitle("Error").setMessage(str).setNeutralButton("Ok", new i(23)).setCancelable(true).show();
    }

    public final void da(String str) {
        MenuItem menuItemFindItem;
        MenuItem menuItemFindItem2;
        MenuItem menuItemFindItem3;
        MenuItem menuItemFindItem4;
        int i14 = c.f79010a;
        b.f79005a.h("GloggerAdmin").debug("updateMenuVisibility for ".concat(str));
        if (str.equals("FileLoggersFrag")) {
            Menu menu = this.f33669c;
            if (menu != null && (menuItemFindItem4 = menu.findItem(R.id.menu_item_add)) != null) {
                menuItemFindItem4.setVisible(true);
            }
            Menu menu2 = this.f33669c;
            if (menu2 == null || (menuItemFindItem3 = menu2.findItem(R.id.menu_item_save)) == null) {
                return;
            }
            menuItemFindItem3.setVisible(false);
            return;
        }
        if (str.equals("AddFileLoggersFrag")) {
            Menu menu3 = this.f33669c;
            if (menu3 != null && (menuItemFindItem2 = menu3.findItem(R.id.menu_item_add)) != null) {
                menuItemFindItem2.setVisible(false);
            }
            Menu menu4 = this.f33669c;
            if (menu4 == null || (menuItemFindItem = menu4.findItem(R.id.menu_item_save)) == null) {
                return;
            }
            menuItemFindItem.setVisible(true);
        }
    }

    @Override // com.garmin.android.apps.connectmobile.z1, b.g, android.app.Activity
    public final void onBackPressed() {
        if (getSupportFragmentManager().G("AddFileLoggersFrag") != null) {
            ba();
        } else {
            super.onBackPressed();
        }
    }

    @Override // com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.gcm3_content_frame);
        initActionBar(true);
    }

    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.glogger_admin_file_loggers_menu, menu);
        this.f33669c = menu;
        ba();
        return true;
    }

    @Override // com.garmin.android.apps.connectmobile.z1, android.app.Activity
    public final boolean onNavigateUp() {
        finish();
        return true;
    }

    @Override // com.garmin.android.apps.connectmobile.z1, android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        menuItem.getClass();
        int itemId = menuItem.getItemId();
        if (itemId == R.id.menu_item_add) {
            v supportFragmentManager = getSupportFragmentManager();
            androidx.fragment.app.a aVarB = j.b(supportFragmentManager, supportFragmentManager);
            aVarB.l(R.id.content_frame, new i80.a(), "AddFileLoggersFrag");
            aVarB.s(true, true);
            return true;
        }
        if (itemId != R.id.menu_item_save) {
            return super.onOptionsItemSelected(menuItem);
        }
        Fragment fragmentG = getSupportFragmentManager().G("AddFileLoggersFrag");
        if (fragmentG != null) {
            View view2 = ((i80.a) fragmentG).getView();
            view2.getClass();
            RecyclerView.h adapter = ((RecyclerView) view2).getAdapter();
            adapter.getClass();
            aa((String[]) ((i80.a.c) adapter).f92221b.toArray(new String[0]), false);
            ba();
        }
        return true;
    }

    @Override // android.app.Activity
    public final boolean onPrepareOptionsMenu(Menu menu) {
        MenuItem menuItemFindItem;
        if (menu != null && (menuItemFindItem = menu.findItem(R.id.menu_item_add)) != null) {
            oc.b.G(menuItemFindItem, this, R.color.gcm_icon_primary);
        }
        return super.onPrepareOptionsMenu(menu);
    }

    @Override // com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, android.app.Activity
    public final void onResume() {
        super.onResume();
        j22.b.f96736a.getClass();
        if (j22.b.d()) {
            return;
        }
        j22.b.x(this, 0, j22.a.f96721j, j22.a.f96722k);
    }

    @Override // i.c, androidx.fragment.app.m, android.app.Activity
    public final void onStop() {
        super.onStop();
        e eVar = this.f33668b;
        if (eVar != null) {
            eVar.dismiss();
        }
        this.f33668b = null;
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/garmin/android/apps/connectmobile/developer/glogger/GloggerAdminActivity$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "", "REQUEST_CODE_ASK_FOR_PERMS", "I", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
