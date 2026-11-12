package com.garmin.android.apps.connectmobile.permissions.developer;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.permissions.developer.PermissionNotificationsDevActivity;
import com.google.android.gms.stats.CodePackage;
import f12.l;
import i.c;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/permissions/developer/PermissionNotificationsDevActivity;", "Li/c;", "<init>", "()V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class PermissionNotificationsDevActivity extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f40308a = 0;

    @Override // androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_permission_notifications_dev);
        final int i14 = 0;
        ((Button) findViewById(R.id.clearAllPermissionPreferencesBtn)).setOnClickListener(new View.OnClickListener(this) { // from class: x81.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PermissionNotificationsDevActivity f189555b;

            {
                this.f189555b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i15 = i14;
                PermissionNotificationsDevActivity permissionNotificationsDevActivity = this.f189555b;
                switch (i15) {
                    case 0:
                        int i16 = PermissionNotificationsDevActivity.f40308a;
                        l.f68084a.getClass();
                        l.a.a().Q1("CALENDAR", false);
                        l.a.a().Q1(CodePackage.LOCATION, false);
                        l.a.a().Q1("PHONE", false);
                        l.a.a().Q4(false);
                        Toast.makeText(permissionNotificationsDevActivity, "All permission prefs cleared", 0).show();
                        break;
                    case 1:
                        int i17 = PermissionNotificationsDevActivity.f40308a;
                        l.f68084a.getClass();
                        l.a.a().Q1("CALENDAR", false);
                        Toast.makeText(permissionNotificationsDevActivity, "Calendar permission prefs cleared", 0).show();
                        break;
                    case 2:
                        int i18 = PermissionNotificationsDevActivity.f40308a;
                        l.f68084a.getClass();
                        l.a.a().Q1(CodePackage.LOCATION, false);
                        Toast.makeText(permissionNotificationsDevActivity, "Location permission prefs cleared", 0).show();
                        break;
                    case 3:
                        int i19 = PermissionNotificationsDevActivity.f40308a;
                        l.f68084a.getClass();
                        l.a.a().Q1("PHONE", false);
                        Toast.makeText(permissionNotificationsDevActivity, "Phone permission prefs cleared", 0).show();
                        break;
                    default:
                        int i24 = PermissionNotificationsDevActivity.f40308a;
                        l.f68084a.getClass();
                        l.a.a().Q4(false);
                        Toast.makeText(permissionNotificationsDevActivity, "Smart Notification prefs cleared", 0).show();
                        break;
                }
            }
        });
        final int i15 = 1;
        ((Button) findViewById(R.id.resetCalendarPreferenceBtn)).setOnClickListener(new View.OnClickListener(this) { // from class: x81.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PermissionNotificationsDevActivity f189555b;

            {
                this.f189555b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i16 = i15;
                PermissionNotificationsDevActivity permissionNotificationsDevActivity = this.f189555b;
                switch (i16) {
                    case 0:
                        int i17 = PermissionNotificationsDevActivity.f40308a;
                        l.f68084a.getClass();
                        l.a.a().Q1("CALENDAR", false);
                        l.a.a().Q1(CodePackage.LOCATION, false);
                        l.a.a().Q1("PHONE", false);
                        l.a.a().Q4(false);
                        Toast.makeText(permissionNotificationsDevActivity, "All permission prefs cleared", 0).show();
                        break;
                    case 1:
                        int i18 = PermissionNotificationsDevActivity.f40308a;
                        l.f68084a.getClass();
                        l.a.a().Q1("CALENDAR", false);
                        Toast.makeText(permissionNotificationsDevActivity, "Calendar permission prefs cleared", 0).show();
                        break;
                    case 2:
                        int i19 = PermissionNotificationsDevActivity.f40308a;
                        l.f68084a.getClass();
                        l.a.a().Q1(CodePackage.LOCATION, false);
                        Toast.makeText(permissionNotificationsDevActivity, "Location permission prefs cleared", 0).show();
                        break;
                    case 3:
                        int i110 = PermissionNotificationsDevActivity.f40308a;
                        l.f68084a.getClass();
                        l.a.a().Q1("PHONE", false);
                        Toast.makeText(permissionNotificationsDevActivity, "Phone permission prefs cleared", 0).show();
                        break;
                    default:
                        int i24 = PermissionNotificationsDevActivity.f40308a;
                        l.f68084a.getClass();
                        l.a.a().Q4(false);
                        Toast.makeText(permissionNotificationsDevActivity, "Smart Notification prefs cleared", 0).show();
                        break;
                }
            }
        });
        final int i16 = 2;
        ((Button) findViewById(R.id.resetLocationPreferenceBtn)).setOnClickListener(new View.OnClickListener(this) { // from class: x81.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PermissionNotificationsDevActivity f189555b;

            {
                this.f189555b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i17 = i16;
                PermissionNotificationsDevActivity permissionNotificationsDevActivity = this.f189555b;
                switch (i17) {
                    case 0:
                        int i18 = PermissionNotificationsDevActivity.f40308a;
                        l.f68084a.getClass();
                        l.a.a().Q1("CALENDAR", false);
                        l.a.a().Q1(CodePackage.LOCATION, false);
                        l.a.a().Q1("PHONE", false);
                        l.a.a().Q4(false);
                        Toast.makeText(permissionNotificationsDevActivity, "All permission prefs cleared", 0).show();
                        break;
                    case 1:
                        int i19 = PermissionNotificationsDevActivity.f40308a;
                        l.f68084a.getClass();
                        l.a.a().Q1("CALENDAR", false);
                        Toast.makeText(permissionNotificationsDevActivity, "Calendar permission prefs cleared", 0).show();
                        break;
                    case 2:
                        int i110 = PermissionNotificationsDevActivity.f40308a;
                        l.f68084a.getClass();
                        l.a.a().Q1(CodePackage.LOCATION, false);
                        Toast.makeText(permissionNotificationsDevActivity, "Location permission prefs cleared", 0).show();
                        break;
                    case 3:
                        int i111 = PermissionNotificationsDevActivity.f40308a;
                        l.f68084a.getClass();
                        l.a.a().Q1("PHONE", false);
                        Toast.makeText(permissionNotificationsDevActivity, "Phone permission prefs cleared", 0).show();
                        break;
                    default:
                        int i24 = PermissionNotificationsDevActivity.f40308a;
                        l.f68084a.getClass();
                        l.a.a().Q4(false);
                        Toast.makeText(permissionNotificationsDevActivity, "Smart Notification prefs cleared", 0).show();
                        break;
                }
            }
        });
        final int i17 = 3;
        ((Button) findViewById(R.id.resetPhonePreferenceBtn)).setOnClickListener(new View.OnClickListener(this) { // from class: x81.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PermissionNotificationsDevActivity f189555b;

            {
                this.f189555b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i18 = i17;
                PermissionNotificationsDevActivity permissionNotificationsDevActivity = this.f189555b;
                switch (i18) {
                    case 0:
                        int i19 = PermissionNotificationsDevActivity.f40308a;
                        l.f68084a.getClass();
                        l.a.a().Q1("CALENDAR", false);
                        l.a.a().Q1(CodePackage.LOCATION, false);
                        l.a.a().Q1("PHONE", false);
                        l.a.a().Q4(false);
                        Toast.makeText(permissionNotificationsDevActivity, "All permission prefs cleared", 0).show();
                        break;
                    case 1:
                        int i110 = PermissionNotificationsDevActivity.f40308a;
                        l.f68084a.getClass();
                        l.a.a().Q1("CALENDAR", false);
                        Toast.makeText(permissionNotificationsDevActivity, "Calendar permission prefs cleared", 0).show();
                        break;
                    case 2:
                        int i111 = PermissionNotificationsDevActivity.f40308a;
                        l.f68084a.getClass();
                        l.a.a().Q1(CodePackage.LOCATION, false);
                        Toast.makeText(permissionNotificationsDevActivity, "Location permission prefs cleared", 0).show();
                        break;
                    case 3:
                        int i112 = PermissionNotificationsDevActivity.f40308a;
                        l.f68084a.getClass();
                        l.a.a().Q1("PHONE", false);
                        Toast.makeText(permissionNotificationsDevActivity, "Phone permission prefs cleared", 0).show();
                        break;
                    default:
                        int i24 = PermissionNotificationsDevActivity.f40308a;
                        l.f68084a.getClass();
                        l.a.a().Q4(false);
                        Toast.makeText(permissionNotificationsDevActivity, "Smart Notification prefs cleared", 0).show();
                        break;
                }
            }
        });
        final int i18 = 4;
        ((Button) findViewById(R.id.resetNotificationPreferenceBtn)).setOnClickListener(new View.OnClickListener(this) { // from class: x81.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ PermissionNotificationsDevActivity f189555b;

            {
                this.f189555b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i19 = i18;
                PermissionNotificationsDevActivity permissionNotificationsDevActivity = this.f189555b;
                switch (i19) {
                    case 0:
                        int i110 = PermissionNotificationsDevActivity.f40308a;
                        l.f68084a.getClass();
                        l.a.a().Q1("CALENDAR", false);
                        l.a.a().Q1(CodePackage.LOCATION, false);
                        l.a.a().Q1("PHONE", false);
                        l.a.a().Q4(false);
                        Toast.makeText(permissionNotificationsDevActivity, "All permission prefs cleared", 0).show();
                        break;
                    case 1:
                        int i111 = PermissionNotificationsDevActivity.f40308a;
                        l.f68084a.getClass();
                        l.a.a().Q1("CALENDAR", false);
                        Toast.makeText(permissionNotificationsDevActivity, "Calendar permission prefs cleared", 0).show();
                        break;
                    case 2:
                        int i112 = PermissionNotificationsDevActivity.f40308a;
                        l.f68084a.getClass();
                        l.a.a().Q1(CodePackage.LOCATION, false);
                        Toast.makeText(permissionNotificationsDevActivity, "Location permission prefs cleared", 0).show();
                        break;
                    case 3:
                        int i113 = PermissionNotificationsDevActivity.f40308a;
                        l.f68084a.getClass();
                        l.a.a().Q1("PHONE", false);
                        Toast.makeText(permissionNotificationsDevActivity, "Phone permission prefs cleared", 0).show();
                        break;
                    default:
                        int i24 = PermissionNotificationsDevActivity.f40308a;
                        l.f68084a.getClass();
                        l.a.a().Q4(false);
                        Toast.makeText(permissionNotificationsDevActivity, "Smart Notification prefs cleared", 0).show();
                        break;
                }
            }
        });
    }
}
