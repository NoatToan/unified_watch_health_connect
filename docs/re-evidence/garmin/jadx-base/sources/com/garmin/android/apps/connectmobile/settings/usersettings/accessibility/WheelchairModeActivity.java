package com.garmin.android.apps.connectmobile.settings.usersettings.accessibility;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import bv.b;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.c;
import com.garmin.android.apps.connectmobile.help.HelpActivity;
import com.garmin.android.apps.connectmobile.k1;
import com.garmin.android.apps.connectmobile.view.view_3_0.GCMComplexOneLineButton;
import f12.l;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/settings/usersettings/accessibility/WheelchairModeActivity;", "Lcom/garmin/android/apps/connectmobile/c;", "<init>", "()V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class WheelchairModeActivity extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f44027a = new a(null);

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.wheelchair_mode_selection_activity);
        initActionBar(true, R.string.lbl_wheelchair_mode);
        l.f68084a.getClass();
        l lVarA = l.a.a();
        GCMComplexOneLineButton gCMComplexOneLineButton = (GCMComplexOneLineButton) findViewById(R.id.wheelchair_mode_switch);
        gCMComplexOneLineButton.i(lVarA.B3());
        gCMComplexOneLineButton.setOnCheckedChangeListener(new com.google.android.material.chip.a(lVarA, 13));
        TextView textView = (TextView) findViewById(R.id.wheelchair_mode_tip_text);
        b.f21239a.getClass();
        b.a();
        boolean Z = k1.f37122a.Z();
        gCMComplexOneLineButton.setEnabled(Z);
        if (Z) {
            return;
        }
        textView.getClass();
        textView.setVisibility(0);
    }

    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        MenuItem menuItemAdd = menu != null ? menu.add(0, 10, 0, R.string.lbl_help) : null;
        if (menuItemAdd != null) {
            menuItemAdd.setShowAsActionFlags(1);
        }
        return true;
    }

    @Override // com.garmin.android.apps.connectmobile.z1, android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        menuItem.getClass();
        if (menuItem.getItemId() != 10) {
            return super.onOptionsItemSelected(menuItem);
        }
        HelpActivity.a.e(HelpActivity.f36653a, this, ro0.l.ACCESSIBILITY_SETTINGS, null, null, 12);
        return true;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/settings/usersettings/accessibility/WheelchairModeActivity$a;", "", "<init>", "()V", "", "HELP_MENU_ID", "I", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
