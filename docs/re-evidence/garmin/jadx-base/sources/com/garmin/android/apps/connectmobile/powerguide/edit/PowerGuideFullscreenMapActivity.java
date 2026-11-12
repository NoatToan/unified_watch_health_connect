package com.garmin.android.apps.connectmobile.powerguide.edit;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.fragment.app.v;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.c;
import com.garmin.android.apps.connectmobile.courses.model.e;
import com.garmin.android.apps.connectmobile.courses.model.i;
import com.garmin.android.apps.connectmobile.l2;
import java.util.ArrayList;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import sa1.j;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/powerguide/edit/PowerGuideFullscreenMapActivity;", "Lcom/garmin/android/apps/connectmobile/c;", "<init>", "()V", "a", "gcm-power-guide_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class PowerGuideFullscreenMapActivity extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f40410a = new a(null);

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        e eVar;
        Parcelable parcelable;
        super.onCreate(bundle);
        setContentView(R.layout.power_guide_fullscreen_map_activity);
        initActionBar(true, R.string.power_guide_title);
        l2.a aVar = l2.f37135b;
        Intent intent = getIntent();
        aVar.getClass();
        Bundle bundleA = l2.a.a(intent);
        if (bundleA != null) {
            if (Build.VERSION.SDK_INT >= 33) {
                parcelable = (Parcelable) bundleA.getParcelable("GCM_extra_course_detail", e.class);
            } else {
                Parcelable parcelable2 = bundleA.getParcelable("GCM_extra_course_detail");
                if (!(parcelable2 instanceof e)) {
                    parcelable2 = null;
                }
                parcelable = (e) parcelable2;
            }
            eVar = (e) parcelable;
        } else {
            eVar = null;
        }
        ArrayList<Integer> integerArrayList = bundleA != null ? bundleA.getIntegerArrayList("extra_colors") : null;
        if (eVar == null || integerArrayList == null) {
            finish();
            return;
        }
        j jVar = (j) KoinJavaComponent.get$default(j.class, null, null, 6, null);
        i iVarM = eVar.m();
        if (iVarM == null) {
            iVarM = i.OTHER;
        }
        c50.i iVarG = jVar.g(iVarM);
        v supportFragmentManager = getSupportFragmentManager();
        supportFragmentManager.getClass();
        androidx.fragment.app.a aVar2 = new androidx.fragment.app.a(supportFragmentManager);
        aVar2.l(R.id.map_container, iVarG, null);
        aVar2.n(new at0.c(jVar, iVarG, eVar, integerArrayList, 22), false);
        aVar2.e();
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/powerguide/edit/PowerGuideFullscreenMapActivity$a;", "", "<init>", "()V", "", "EXTRA_COLORS", "Ljava/lang/String;", "gcm-power-guide_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
