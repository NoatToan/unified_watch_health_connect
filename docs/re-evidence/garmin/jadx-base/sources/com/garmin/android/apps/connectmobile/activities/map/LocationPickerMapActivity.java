package com.garmin.android.apps.connectmobile.activities.map;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.MenuItem;
import androidx.core.view.j;
import androidx.fragment.app.m;
import androidx.fragment.app.v;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.c;
import p005kotlin.Metadata;
import po.x;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/activities/map/LocationPickerMapActivity;", "Lcom/garmin/android/apps/connectmobile/c;", "Lcom/garmin/android/apps/connectmobile/activities/map/a$b;", "<init>", "()V", "a", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class LocationPickerMapActivity extends c implements com.garmin.android.apps.connectmobile.activities.map.a.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f29227b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public x f29228a;

    public static final void ca(m mVar, String str, x xVar) {
        f29227b.getClass();
        mVar.getClass();
        str.getClass();
        Intent intent = new Intent(mVar, (Class<?>) LocationPickerMapActivity.class);
        intent.putExtra("title", str);
        intent.putExtra("EXTRA_LOCATION_READONLY", xVar);
        mVar.startActivity(intent);
    }

    @Override // com.garmin.android.apps.connectmobile.activities.map.a.b
    public final void n8(x xVar) {
        this.f29228a = xVar;
    }

    @Override // com.garmin.android.apps.connectmobile.z1, b.g, android.app.Activity
    public final void onBackPressed() {
        Intent intent = new Intent();
        intent.putExtra("EXTRA_LOCATION_EDITABLE", this.f29228a);
        setResult(-1, intent);
        finish();
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        Parcelable parcelable;
        Parcelable parcelable2;
        super.onCreate(bundle);
        setContentView(R.layout.activity_location_picker_map_layout);
        initActionBar(true, getIntent().getStringExtra("title"));
        Intent intent = getIntent();
        int i14 = Build.VERSION.SDK_INT;
        if (i14 >= 33) {
            parcelable = intent != null ? (Parcelable) intent.getParcelableExtra("EXTRA_LOCATION_EDITABLE", x.class) : null;
        } else {
            Parcelable parcelableExtra = intent != null ? intent.getParcelableExtra("EXTRA_LOCATION_EDITABLE") : null;
            if (!(parcelableExtra instanceof x)) {
                parcelableExtra = null;
            }
            parcelable = (x) parcelableExtra;
        }
        this.f29228a = (x) parcelable;
        Intent intent2 = getIntent();
        if (i14 >= 33) {
            parcelable2 = intent2 != null ? (Parcelable) intent2.getParcelableExtra("EXTRA_LOCATION_READONLY", x.class) : null;
        } else {
            Parcelable parcelableExtra2 = intent2 != null ? intent2.getParcelableExtra("EXTRA_LOCATION_READONLY") : null;
            if (!(parcelableExtra2 instanceof x)) {
                parcelableExtra2 = null;
            }
            parcelable2 = (x) parcelableExtra2;
        }
        com.garmin.android.apps.connectmobile.activities.map.a.C0451a c0451a = com.garmin.android.apps.connectmobile.activities.map.a.f29229m;
        x xVar = this.f29228a;
        c0451a.getClass();
        com.garmin.android.apps.connectmobile.activities.map.a aVar = new com.garmin.android.apps.connectmobile.activities.map.a();
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable("EXTRA_LOCATION_EDITABLE", xVar);
        bundle2.putParcelable("EXTRA_LOCATION_READONLY", (x) parcelable2);
        aVar.setArguments(bundle2);
        v supportFragmentManager = getSupportFragmentManager();
        androidx.fragment.app.a aVarB = j.b(supportFragmentManager, supportFragmentManager);
        aVarB.j(R.id.fragment_container, aVar, null, 1);
        aVarB.e();
    }

    @Override // com.garmin.android.apps.connectmobile.z1, android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        menuItem.getClass();
        if (menuItem.getItemId() == 16908332) {
            onBackPressed();
        }
        return super.onOptionsItemSelected(menuItem);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/activities/map/LocationPickerMapActivity$a;", "", "<init>", "()V", "", "TITLE_KEY", "Ljava/lang/String;", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
