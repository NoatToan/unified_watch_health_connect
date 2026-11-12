package com.garmin.android.apps.connectmobile.performance.acclimation.presentation;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import c61.d;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.c;
import com.garmin.android.apps.connectmobile.help.HelpActivity;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import ro0.l;
import v22.e;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/performance/acclimation/presentation/LegacyAltitudeAcclimationActivity;", "Lcom/garmin/android/apps/connectmobile/c;", "<init>", "()V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class LegacyAltitudeAcclimationActivity extends c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f39838b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public d f39839a;

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        d dVar;
        Bundle extras;
        Parcelable parcelable;
        super.onCreate(bundle);
        setContentView(R.layout.gcm4_training_status_acclimation);
        Intent intent = getIntent();
        if (intent == null || (extras = intent.getExtras()) == null) {
            dVar = null;
        } else {
            if (Build.VERSION.SDK_INT >= 33) {
                parcelable = (Parcelable) extras.getParcelable("extra_acclimation_data", d.class);
            } else {
                Parcelable parcelable2 = extras.getParcelable("extra_acclimation_data");
                if (!(parcelable2 instanceof d)) {
                    parcelable2 = null;
                }
                parcelable = (d) parcelable2;
            }
            dVar = (d) parcelable;
        }
        this.f39839a = dVar;
        initActionBar(true, dVar != null ? dVar.f24646a : null);
        d dVar2 = this.f39839a;
        if (dVar2 != null) {
            View viewFindViewById = findViewById(R.id.acclimation_date);
            viewFindViewById.getClass();
            e.o((TextView) viewFindViewById, dVar2.f24647b);
            View viewFindViewById2 = findViewById(R.id.acclimation_value);
            viewFindViewById2.getClass();
            e.o((TextView) viewFindViewById2, dVar2.f24648c);
            View viewFindViewById3 = findViewById(R.id.acclimation_trend_info);
            viewFindViewById3.getClass();
            e.o((TextView) viewFindViewById3, dVar2.f24649d);
            ImageView imageView = (ImageView) findViewById(R.id.acclimation_trend_icon);
            Integer num = dVar2.f24650e;
            imageView.setImageDrawable(num != null ? a7.b.getDrawable(this, num.intValue()) : null);
            View viewFindViewById4 = findViewById(R.id.acclimation_trend_message);
            viewFindViewById4.getClass();
            e.o((TextView) viewFindViewById4, dVar2.f24651f);
        }
    }

    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.help_3_0, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override // com.garmin.android.apps.connectmobile.z1, android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        menuItem.getClass();
        if (menuItem.getItemId() != R.id.menu_item_help) {
            return super.onOptionsItemSelected(menuItem);
        }
        HelpActivity.a aVar = HelpActivity.f36653a;
        l lVar = l.TRAINING_STATUS;
        aVar.getClass();
        HelpActivity.a.d(this, lVar, "ALTITUDE_ACTION", null);
        return true;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/performance/acclimation/presentation/LegacyAltitudeAcclimationActivity$a;", "", "<init>", "()V", "", "EXTRA_ACCLIMATION_DATA_KEY", "Ljava/lang/String;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
