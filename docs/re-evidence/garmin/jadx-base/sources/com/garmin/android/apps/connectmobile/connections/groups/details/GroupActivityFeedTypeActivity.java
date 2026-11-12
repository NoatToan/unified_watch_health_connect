package com.garmin.android.apps.connectmobile.connections.groups.details;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.connections.groups.services.model.GroupDTO;
import com.garmin.android.apps.connectmobile.i2;
import lc.h0;
import lc.m0;
import lc.y;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/connections/groups/details/GroupActivityFeedTypeActivity;", "Lcom/garmin/android/apps/connectmobile/c;", "Llc/y$c;", "<init>", "()V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class GroupActivityFeedTypeActivity extends com.garmin.android.apps.connectmobile.c implements y.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f31371a = new a(null);

    @Override // lc.y.c
    public final void m8(y yVar, h0 h0Var, Bundle bundle) {
        String string;
        Parcelable parcelable;
        h0Var.getClass();
        int i14 = h0Var.f111773b.f144346e;
        if (i14 == R.id.main_type_selection) {
            updateActionBarTitle(getString(R.string.lbl_group_activities_in_feed));
            return;
        }
        if (i14 == R.id.sub_type_selection) {
            com.garmin.android.apps.connectmobile.connections.groups.details.a.AbstractC0510a.b bVar = null;
            if (bundle != null) {
                if (Build.VERSION.SDK_INT >= 33) {
                    parcelable = (Parcelable) bundle.getParcelable("param_sub_type", com.garmin.android.apps.connectmobile.connections.groups.details.a.AbstractC0510a.b.class);
                } else {
                    Parcelable parcelable2 = bundle.getParcelable("param_sub_type");
                    parcelable = (com.garmin.android.apps.connectmobile.connections.groups.details.a.AbstractC0510a.b) (parcelable2 instanceof com.garmin.android.apps.connectmobile.connections.groups.details.a.AbstractC0510a.b ? parcelable2 : null);
                }
                bVar = (com.garmin.android.apps.connectmobile.connections.groups.details.a.AbstractC0510a.b) parcelable;
            }
            if (bVar == null || (string = getString(R.string.social_group_activity_types, dh.b.A(this, bVar.f31474b.f4360c))) == null) {
                string = getString(R.string.social_group_activity_types);
                string.getClass();
            }
            updateActionBarTitle(string);
        }
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_group_activity_feed_type);
        super.initActionBar(true, R.string.lbl_group_activities_in_feed);
        Intent intent = getIntent();
        Parcelable parcelable = null;
        if (Build.VERSION.SDK_INT < 33) {
            Parcelable parcelableExtra = intent != null ? intent.getParcelableExtra("param_group") : null;
            parcelable = (GroupDTO) (parcelableExtra instanceof GroupDTO ? parcelableExtra : null);
        } else if (intent != null) {
            parcelable = (Parcelable) intent.getParcelableExtra("param_group", GroupDTO.class);
        }
        GroupDTO groupDTO = (GroupDTO) parcelable;
        if (groupDTO == null) {
            i2.a aVar = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar.getClass();
            i2.a.f(a2Var, "GroupActivityFeedTypeActivity", "groupDTO should not be null");
            finish();
            return;
        }
        Fragment fragmentF = getSupportFragmentManager().F(R.id.fragment_container);
        fragmentF.getClass();
        m0 m0VarU6 = ((NavHostFragment) fragmentF).u6();
        m0VarU6.t(m0VarU6.e().b(R.navigation.nav_group_settings_what_activities_will_be_displayed));
        m0VarU6.a(this);
    }

    @Override // com.garmin.android.apps.connectmobile.z1, android.app.Activity
    public final boolean onNavigateUp() {
        onBackPressed();
        return true;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/garmin/android/apps/connectmobile/connections/groups/details/GroupActivityFeedTypeActivity$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "PARAM_GROUP", "PARAM_SUB_TYPE", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
