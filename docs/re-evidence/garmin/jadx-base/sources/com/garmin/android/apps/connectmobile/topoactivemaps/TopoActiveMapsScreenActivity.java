package com.garmin.android.apps.connectmobile.topoactivemaps;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.core.view.j;
import androidx.fragment.app.v;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.c;
import com.garmin.android.apps.connectmobile.devices.model.l;
import p005kotlin.Metadata;
import zb0.u0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/topoactivemaps/TopoActiveMapsScreenActivity;", "Lcom/garmin/android/apps/connectmobile/c;", "<init>", "()V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class TopoActiveMapsScreenActivity extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f45071a = new a(null);

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        u0 u0Var;
        l lVar;
        Parcelable parcelable;
        Object serializable;
        super.onCreate(bundle);
        setContentView(R.layout.onboarding_activity_profiles_activity);
        initActionBar(true, R.string.onboarding_topoactive_maps_title);
        Intent intent = getIntent();
        Bundle extras = intent != null ? intent.getExtras() : null;
        if (extras != null) {
            if (Build.VERSION.SDK_INT >= 33) {
                serializable = extras.getSerializable("GCM_deviceEnumValue", u0.class);
            } else {
                Object serializable2 = extras.getSerializable("GCM_deviceEnumValue");
                if (!(serializable2 instanceof u0)) {
                    serializable2 = null;
                }
                serializable = (u0) serializable2;
            }
            u0Var = (u0) serializable;
        } else {
            u0Var = null;
        }
        if (extras != null) {
            if (Build.VERSION.SDK_INT >= 33) {
                parcelable = (Parcelable) extras.getParcelable("GCM_deviceDTO", l.class);
            } else {
                Parcelable parcelable2 = extras.getParcelable("GCM_deviceDTO");
                if (!(parcelable2 instanceof l)) {
                    parcelable2 = null;
                }
                parcelable = (l) parcelable2;
            }
            lVar = (l) parcelable;
        } else {
            lVar = null;
        }
        if ((lVar != null ? lVar.getDeviceName() : null) == null || u0Var == null) {
            finish();
            return;
        }
        com.garmin.android.apps.connectmobile.topoactivemaps.a.f45072e.getClass();
        extras.getClass();
        Bundle bundle2 = new Bundle();
        bundle2.putAll(extras);
        com.garmin.android.apps.connectmobile.topoactivemaps.a aVar = new com.garmin.android.apps.connectmobile.topoactivemaps.a();
        aVar.setArguments(bundle2);
        v supportFragmentManager = getSupportFragmentManager();
        androidx.fragment.app.a aVarB = j.b(supportFragmentManager, supportFragmentManager);
        aVarB.f7240h = 4097;
        aVarB.l(R.id.fragment_container, aVar, null);
        aVarB.e();
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/topoactivemaps/TopoActiveMapsScreenActivity$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
