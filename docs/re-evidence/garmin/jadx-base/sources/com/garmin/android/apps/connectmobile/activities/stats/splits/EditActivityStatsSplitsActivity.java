package com.garmin.android.apps.connectmobile.activities.stats.splits;

import am.x0;
import am.z0;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.core.view.j;
import androidx.fragment.app.v;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.activities.newmodel.i0;
import com.garmin.android.apps.connectmobile.c;
import java.util.ArrayList;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import ps.x1;
import wr.k;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/activities/stats/splits/EditActivityStatsSplitsActivity;", "Lcom/garmin/android/apps/connectmobile/c;", "<init>", "()V", "a", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class EditActivityStatsSplitsActivity extends c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f29949c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public k f29950a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f29951b;

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        Intent intent;
        Object serializableExtra;
        Intent intent2;
        Parcelable parcelable;
        super.onCreate(bundle);
        this.f29951b = getIntent().getLongExtra("GCM_extra_activity_id", 0L);
        long longExtra = getIntent().getLongExtra("GCM_userProfileId", 0L);
        Intent intent3 = getIntent();
        if (intent3 != null) {
            int i14 = Build.VERSION.SDK_INT;
            ArrayList parcelableArrayListExtra = i14 >= 33 ? intent3.getParcelableArrayListExtra("GCM_extra_activity_splits", x1.class) : intent3.getParcelableArrayListExtra("GCM_extra_activity_splits");
            if (parcelableArrayListExtra == null || (intent = getIntent()) == null) {
                return;
            }
            if (i14 >= 33) {
                serializableExtra = intent.getSerializableExtra("GCM_extra_activity_type", x0.class);
            } else {
                Object serializableExtra2 = intent.getSerializableExtra("GCM_extra_activity_type");
                if (!(serializableExtra2 instanceof x0)) {
                    serializableExtra2 = null;
                }
                serializableExtra = (x0) serializableExtra2;
            }
            x0 x0Var = (x0) serializableExtra;
            if (x0Var == null || (intent2 = getIntent()) == null) {
                return;
            }
            if (i14 >= 33) {
                parcelable = (Parcelable) intent2.getParcelableExtra("GCM_extra_activity_summary", i0.class);
            } else {
                Parcelable parcelableExtra = intent2.getParcelableExtra("GCM_extra_activity_summary");
                if (!(parcelableExtra instanceof i0)) {
                    parcelableExtra = null;
                }
                parcelable = (i0) parcelableExtra;
            }
            i0 i0Var = (i0) parcelable;
            if (i0Var == null) {
                return;
            }
            Intent intent4 = getIntent();
            long longExtra2 = i0Var.f29492c;
            if (intent4 != null) {
                longExtra2 = intent4.getLongExtra("extra_activity_start_time_millis", longExtra2);
            }
            setContentView(R.layout.activity_edit_activity_stats_splits);
            String str = x0Var.f4358a;
            z0 z0Var = z0.f4390a;
            String string = z0.b(x0.E3, str) ? getString(R.string.lbl_edit_weight_splits) : getString(R.string.lbl_edit_route);
            string.getClass();
            initActionBar(true, string);
            k.a aVar = k.f186755l;
            long j8 = this.f29951b;
            aVar.getClass();
            k kVar = new k();
            Bundle bundle2 = new Bundle(7);
            bundle2.putInt("extra.view.mode", uq.k.EDIT.ordinal());
            bundle2.putLong("GCM_extra_activity_id", j8);
            bundle2.putLong("GCM_userProfileId", longExtra);
            bundle2.putSerializable("GCM_extra_activity_type", x0Var);
            bundle2.putParcelableArrayList("GCM_extra_activity_splits", new ArrayList<>(parcelableArrayListExtra));
            bundle2.putParcelable("GCM_extra_activity_summary", i0Var);
            bundle2.putLong("extra_activity_start_time_millis", longExtra2);
            kVar.setArguments(bundle2);
            this.f29950a = kVar;
            v supportFragmentManager = getSupportFragmentManager();
            androidx.fragment.app.a aVarB = j.b(supportFragmentManager, supportFragmentManager);
            k kVar2 = this.f29950a;
            if (kVar2 == null) {
                s.m("fragment");
                throw null;
            }
            aVarB.j(R.id.fragment_container, kVar2, null, 1);
            aVarB.e();
        }
    }

    @Override // com.garmin.android.apps.connectmobile.z1, android.app.Activity
    public final boolean onNavigateUp() {
        onBackPressed();
        return true;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/activities/stats/splits/EditActivityStatsSplitsActivity$a;", "", "<init>", "()V", "", "EXTRA_ACTIVITY_START_TIME_MILLIS", "Ljava/lang/String;", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
