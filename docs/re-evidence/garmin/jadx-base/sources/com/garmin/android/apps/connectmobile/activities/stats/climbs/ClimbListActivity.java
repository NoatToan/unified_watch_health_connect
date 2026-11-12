package com.garmin.android.apps.connectmobile.activities.stats.climbs;

import am.a2;
import android.os.Bundle;
import androidx.compose.ui.platform.ComposeView;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.activities.newmodel.ActivityDetailChartDTO;
import com.garmin.android.apps.connectmobile.c;
import cq.z;
import java.util.ArrayList;
import java.util.Comparator;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p13.h0;
import ps.x1;
import z3.e;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/activities/stats/climbs/ClimbListActivity;", "Lcom/garmin/android/apps/connectmobile/c;", "<init>", "()V", "a", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class ClimbListActivity extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f29815a = 0;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class b<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t7, T t14) {
            return r13.a.b(((x1) t7).getStartDateTime(), ((x1) t14).getStartDateTime());
        }
    }

    static {
        new a(null);
    }

    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.composable_container);
        initActionBar(true, R.string.lbl_climbs_plural);
        ArrayList arrayListD = a2.d(getIntent().getExtras(), "SPLITS_EXTRAS");
        if (arrayListD == null || arrayListD.isEmpty()) {
            finish();
            return;
        }
        ActivityDetailChartDTO activityDetailChartDTO = (ActivityDetailChartDTO) a2.c(getIntent().getExtras(), "activity_chart_data");
        ArrayList arrayList = new ArrayList();
        for (Object obj : arrayListD) {
            if (z.c((x1) obj)) {
                arrayList.add(obj);
            }
        }
        i53.c cVarE = i53.a.e(h0.N0(arrayList, new b()));
        ComposeView composeView = (ComposeView) findViewById(R.id.composable_container);
        m00.a aVar = new m00.a(this, null, 2, null);
        if (composeView != null) {
            composeView.setContent(new e(486121858, true, new cq.c(cVarE, aVar, arrayListD, activityDetailChartDTO, this, 0)));
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/activities/stats/climbs/ClimbListActivity$a;", "", "<init>", "()V", "", "SPLITS_EXTRAS", "Ljava/lang/String;", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
