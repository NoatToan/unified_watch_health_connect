package com.garmin.android.apps.connectmobile.powerguide.create;

import ab1.g;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.c;
import com.garmin.android.apps.connectmobile.l2;
import fg0.k;
import java.util.ArrayList;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import sa1.j;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/powerguide/create/SelectCourseOrEventActivity;", "Lcom/garmin/android/apps/connectmobile/c;", "<init>", "()V", "a", "gcm-power-guide_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class SelectCourseOrEventActivity extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f40383a = new a(null);

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        ArrayList parcelableArrayList;
        ArrayList parcelableArrayList2;
        super.onCreate(bundle);
        setContentView(R.layout.select_course_or_event_activity);
        initActionBar(true, R.string.power_guide_title);
        l2.a aVar = l2.f37135b;
        Intent intent = getIntent();
        aVar.getClass();
        Bundle bundleA = l2.a.a(intent);
        if (bundleA != null) {
            parcelableArrayList = Build.VERSION.SDK_INT >= 33 ? bundleA.getParcelableArrayList("GCM_extra_power_guide_list", g.class) : bundleA.getParcelableArrayList("GCM_extra_power_guide_list");
        } else {
            parcelableArrayList = null;
        }
        if (bundleA != null) {
            parcelableArrayList2 = Build.VERSION.SDK_INT >= 33 ? bundleA.getParcelableArrayList("GCM_extra_events_for_power_guide", k.class) : bundleA.getParcelableArrayList("GCM_extra_events_for_power_guide");
        } else {
            parcelableArrayList2 = null;
        }
        if (parcelableArrayList2 == null || parcelableArrayList2.isEmpty()) {
            finish();
        } else {
            findViewById(R.id.select_course_card_view).setOnClickListener(new ty0.a((j) KoinJavaComponent.get$default(j.class, null, null, 6, null), 1, this, parcelableArrayList));
            findViewById(R.id.select_event_card_view).setOnClickListener(new ty0.a(this, 2, parcelableArrayList, parcelableArrayList2));
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/powerguide/create/SelectCourseOrEventActivity$a;", "", "<init>", "()V", "gcm-power-guide_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
