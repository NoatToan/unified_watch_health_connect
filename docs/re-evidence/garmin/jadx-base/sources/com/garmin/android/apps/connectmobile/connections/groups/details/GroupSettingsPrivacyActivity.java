package com.garmin.android.apps.connectmobile.connections.groups.details;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import com.garmin.android.apps.connectmobile.connections.groups.services.model.GroupDTO;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import z3.e;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\n²\u0006\u0016\u0010\u0007\u001a\n \u0006*\u0004\u0018\u00010\u00050\u00058\n@\nX\u008a\u008e\u0002²\u0006\u0016\u0010\t\u001a\n \u0006*\u0004\u0018\u00010\b0\b8\n@\nX\u008a\u008e\u0002"}, d2 = {"Lcom/garmin/android/apps/connectmobile/connections/groups/details/GroupSettingsPrivacyActivity;", "Lcom/garmin/android/apps/connectmobile/d;", "<init>", "()V", "a", "Lcom/garmin/android/apps/connectmobile/connections/groups/services/model/GroupDTO$e;", "kotlin.jvm.PlatformType", "groupVisibility", "Lcom/garmin/android/apps/connectmobile/connections/groups/services/model/GroupDTO$d;", "groupPrivacy", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class GroupSettingsPrivacyActivity extends com.garmin.android.apps.connectmobile.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f31458b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public GroupDTO f31459a;

    public final GroupDTO da() {
        GroupDTO groupDTO = this.f31459a;
        if (groupDTO != null) {
            return groupDTO;
        }
        s.m("groupDTO");
        throw null;
    }

    public final void ea(GroupDTO.e eVar, GroupDTO.d dVar) {
        da().f31567j = eVar;
        da().f31568k = dVar;
        Intent intent = new Intent();
        intent.putExtra("GCM_extra_connection_group", da());
        setResult(-1, intent);
        finish();
    }

    @Override // com.garmin.android.apps.connectmobile.d, com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        Parcelable parcelable = null;
        if (Build.VERSION.SDK_INT < 33) {
            Parcelable parcelableExtra = intent != null ? intent.getParcelableExtra("GCM_extra_connection_group") : null;
            parcelable = (GroupDTO) (parcelableExtra instanceof GroupDTO ? parcelableExtra : null);
        } else if (intent != null) {
            parcelable = (Parcelable) intent.getParcelableExtra("GCM_extra_connection_group", GroupDTO.class);
        }
        GroupDTO groupDTO = (GroupDTO) parcelable;
        if (groupDTO == null) {
            groupDTO = new GroupDTO();
        }
        this.f31459a = groupDTO;
        initComposeScreen(new e(835776327, true, new ik1.c(this, 8)));
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/connections/groups/details/GroupSettingsPrivacyActivity$a;", "", "<init>", "()V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
