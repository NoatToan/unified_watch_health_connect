package com.garmin.android.apps.connectmobile.activities.stats.ebike;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.compose.ui.platform.ComposeView;
import c22.t;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.activities.newmodel.ActivityDetailChartDTO;
import com.garmin.android.apps.connectmobile.c;
import com.garmin.android.apps.connectmobile.l2;
import f21.a0;
import im.b;
import im.d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import oe2.f;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.b0;
import p005kotlin.jvm.internal.j;
import ps.a1;
import ps.n0;
import ps.r;
import z3.e;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/garmin/android/apps/connectmobile/activities/stats/ebike/EBikePerformanceChartsActivity;", "Lcom/garmin/android/apps/connectmobile/c;", "<init>", "()V", "a", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class EBikePerformanceChartsActivity extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f29816a = new a(null);

    /* JADX WARN: Code duplicated, block: B:102:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:104:0x01e4  */
    /* JADX WARN: Code duplicated, block: B:107:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:109:0x020a  */
    /* JADX WARN: Code duplicated, block: B:111:0x021c  */
    /* JADX WARN: Code duplicated, block: B:114:0x0225  */
    /* JADX WARN: Code duplicated, block: B:116:0x0229  */
    /* JADX WARN: Code duplicated, block: B:33:0x007c  */
    /* JADX WARN: Code duplicated, block: B:58:0x0103  */
    /* JADX WARN: Code duplicated, block: B:64:0x0115  */
    @Override // com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        r rVar;
        ActivityDetailChartDTO activityDetailChartDTO;
        fz.c cVar;
        l22.a aVar;
        b bVarB;
        r rVar2;
        int eBikeMaxAssistModes;
        b bVarB2;
        b bVarB3;
        a1 metadataDTO;
        a1 metadataDTO2;
        a1 metadataDTO3;
        a1 metadataDTO4;
        Parcelable parcelable;
        Parcelable parcelable2;
        Parcelable parcelable3;
        super.onCreate(bundle);
        setContentView(R.layout.composable_container);
        initActionBar(true, R.string.lbl_e_bike_performance);
        l2.a aVar2 = l2.f37135b;
        Intent intent = getIntent();
        aVar2.getClass();
        Bundle bundleA = l2.a.a(intent);
        b bVar = null;
        if (bundleA != null) {
            if (Build.VERSION.SDK_INT >= 33) {
                parcelable3 = (Parcelable) bundleA.getParcelable("GCM_extra_activity_summary", r.class);
            } else {
                Parcelable parcelable4 = bundleA.getParcelable("GCM_extra_activity_summary");
                if (!(parcelable4 instanceof r)) {
                    parcelable4 = null;
                }
                parcelable3 = (r) parcelable4;
            }
            rVar = (r) parcelable3;
        } else {
            rVar = null;
        }
        if (bundleA != null) {
            if (Build.VERSION.SDK_INT >= 33) {
                parcelable2 = (Parcelable) bundleA.getParcelable("GCM_extra_activity_chart_detail", ActivityDetailChartDTO.class);
            } else {
                Parcelable parcelable5 = bundleA.getParcelable("GCM_extra_activity_chart_detail");
                if (!(parcelable5 instanceof ActivityDetailChartDTO)) {
                    parcelable5 = null;
                }
                parcelable2 = (ActivityDetailChartDTO) parcelable5;
            }
            activityDetailChartDTO = (ActivityDetailChartDTO) parcelable2;
        } else {
            activityDetailChartDTO = null;
        }
        if (bundleA == null) {
            cVar = fz.c.TIME;
        } else {
            if (Build.VERSION.SDK_INT >= 33) {
                parcelable = (Parcelable) bundleA.getParcelable("GCM_extra_activity_x_axis_type", fz.c.class);
            } else {
                Parcelable parcelable6 = bundleA.getParcelable("GCM_extra_activity_x_axis_type");
                if (!(parcelable6 instanceof fz.c)) {
                    parcelable6 = null;
                }
                parcelable = (fz.c) parcelable6;
            }
            cVar = (fz.c) parcelable;
            if (cVar == null) {
                cVar = fz.c.TIME;
            }
        }
        if (rVar == null || activityDetailChartDTO == null) {
            finish();
            return;
        }
        rr.a aVar3 = new rr.a((Context) KoinJavaComponent.get$default(Context.class, null, null, 6, null));
        aVar3.f154141e = rVar;
        aVar3.f154140d = activityDetailChartDTO;
        ArrayList arrayList = new ArrayList();
        boolean zQ0 = aVar3.q0("directEbikeBatteryLevel");
        l22.a aVar4 = aVar3.f154138b;
        if (zQ0 && f.B(aVar3.f154141e)) {
            ActivityDetailChartDTO activityDetailChartDTO2 = aVar3.f154140d;
            activityDetailChartDTO2.getClass();
            aVar = aVar4;
            bVarB = d.b(activityDetailChartDTO2, 0.0d, 0.0d, 58, "directEbikeBatteryLevel", "SUMDURATION", null, fz.c.TIME);
            if (rr.a.r0(bVarB)) {
                r rVar3 = aVar3.f154141e;
                int eBikeBatteryRemaining = 0;
                int eBikeBatteryUsage = (rVar3 == null || (metadataDTO4 = rVar3.getMetadataDTO()) == null) ? 0 : metadataDTO4.getEBikeBatteryUsage();
                r rVar4 = aVar3.f154141e;
                if (rVar4 != null && (metadataDTO3 = rVar4.getMetadataDTO()) != null) {
                    eBikeBatteryRemaining = metadataDTO3.getEBikeBatteryRemaining();
                }
                bVarB.f94112c = aVar.getString(R.string.lbl_e_bike_battery_use);
                bVarB.R0 = eBikeBatteryUsage;
                bVarB.S0 = eBikeBatteryRemaining;
                bVarB.f94119j = aVar3.p0();
            }
            if (bVarB != null) {
                arrayList.add(bVarB);
            }
            rVar2 = aVar3.f154141e;
            if (rVar2 != null || (metadataDTO2 = rVar2.getMetadataDTO()) == null) {
                eBikeMaxAssistModes = -1;
            } else {
                eBikeMaxAssistModes = metadataDTO2.getEBikeMaxAssistModes();
            }
            if (aVar3.q0("directEbikeAssistMode") || eBikeMaxAssistModes <= 0) {
                bVarB2 = null;
            } else {
                ActivityDetailChartDTO activityDetailChartDTO3 = aVar3.f154140d;
                activityDetailChartDTO3.getClass();
                bVarB2 = d.b(activityDetailChartDTO3, 0.0d, 0.0d, 60, "directEbikeAssistMode", "SUMDURATION", null, fz.c.TIME);
                if (rr.a.r0(bVarB2)) {
                    bVarB2.f94112c = aVar.getString(R.string.lbl_e_bike_assist_mode_chart_title);
                    r rVar5 = aVar3.f154141e;
                    List<n0> listT = (rVar5 == null || (metadataDTO = rVar5.getMetadataDTO()) == null) ? null : metadataDTO.t();
                    if (listT == null || listT.size() != eBikeMaxAssistModes) {
                        bVarB2.f94124n = 0.0d;
                        bVarB2.f94125o = eBikeMaxAssistModes;
                    } else {
                        bVarB2.T0 = e22.a.b(listT, new rr.a.c(new b0() { // from class: rr.c
                            @Override // p005kotlin.jvm.internal.b0, k23.n
                            public final Object get(Object obj) {
                                return ((n0) obj).getEBikeAssistModeName();
                            }

                            @Override // p005kotlin.jvm.internal.b0, k23.j
                            public final void p(Object obj, Object obj2) {
                                ((n0) obj).g((String) obj2);
                            }
                        }), null);
                        List listB = e22.a.b(listT, new rr.a.c(new b0() { // from class: rr.b
                            @Override // p005kotlin.jvm.internal.b0, k23.n
                            public final Object get(Object obj) {
                                return Integer.valueOf(((n0) obj).getEBikeAssistMode());
                            }

                            @Override // p005kotlin.jvm.internal.b0, k23.j
                            public final void p(Object obj, Object obj2) {
                                ((n0) obj).f(((Number) obj2).intValue());
                            }
                        }), null);
                        Iterator it = listB.iterator();
                        if (!it.hasNext()) {
                            t.g();
                            return;
                        }
                        int iIntValue = ((Number) it.next()).intValue();
                        while (it.hasNext()) {
                            int iIntValue2 = ((Number) it.next()).intValue();
                            if (iIntValue > iIntValue2) {
                                iIntValue = iIntValue2;
                            }
                        }
                        bVarB2.f94124n = iIntValue;
                        Iterator it3 = listB.iterator();
                        if (!it3.hasNext()) {
                            t.g();
                            return;
                        }
                        int iIntValue3 = ((Number) it3.next()).intValue();
                        while (it3.hasNext()) {
                            int iIntValue4 = ((Number) it3.next()).intValue();
                            if (iIntValue3 < iIntValue4) {
                                iIntValue3 = iIntValue4;
                            }
                        }
                        bVarB2.f94125o = iIntValue3;
                    }
                    bVarB2.f94119j = aVar3.p0();
                } else {
                    bVarB2 = null;
                }
            }
            if (bVarB2 != null) {
                arrayList.add(bVarB2);
            }
            if (aVar3.q0("directEbikeAssistLevelPercent")) {
                ActivityDetailChartDTO activityDetailChartDTO4 = aVar3.f154140d;
                activityDetailChartDTO4.getClass();
                bVarB3 = d.b(activityDetailChartDTO4, 0.0d, 0.0d, 59, "directEbikeAssistLevelPercent", "SUMDURATION", null, fz.c.TIME);
                if (rr.a.r0(bVarB3)) {
                    bVarB3.f94112c = aVar.getString(R.string.lbl_e_bike_assist_level);
                    bVarB3.f94119j = aVar3.p0();
                    bVar = bVarB3;
                }
            }
            if (bVar != null) {
                arrayList.add(bVar);
            }
            if (arrayList.isEmpty()) {
                finish();
            } else {
                ((ComposeView) findViewById(R.id.composable_container)).setContent(new e(1152239795, true, new a0(this, arrayList, (int) getResources().getDimension(R.dimen.gcm3_activity_chart_height), cVar)));
            }
        }
        aVar = aVar4;
        bVarB = null;
        if (bVarB != null) {
            arrayList.add(bVarB);
        }
        rVar2 = aVar3.f154141e;
        if (rVar2 != null) {
            eBikeMaxAssistModes = -1;
        } else {
            eBikeMaxAssistModes = -1;
        }
        if (aVar3.q0("directEbikeAssistMode")) {
            bVarB2 = null;
        } else {
            bVarB2 = null;
        }
        if (bVarB2 != null) {
            arrayList.add(bVarB2);
        }
        if (aVar3.q0("directEbikeAssistLevelPercent")) {
            ActivityDetailChartDTO activityDetailChartDTO5 = aVar3.f154140d;
            activityDetailChartDTO5.getClass();
            bVarB3 = d.b(activityDetailChartDTO5, 0.0d, 0.0d, 59, "directEbikeAssistLevelPercent", "SUMDURATION", null, fz.c.TIME);
            if (rr.a.r0(bVarB3)) {
                bVarB3.f94112c = aVar.getString(R.string.lbl_e_bike_assist_level);
                bVarB3.f94119j = aVar3.p0();
                bVar = bVarB3;
            }
        }
        if (bVar != null) {
            arrayList.add(bVar);
        }
        if (arrayList.isEmpty()) {
            finish();
        } else {
            ((ComposeView) findViewById(R.id.composable_container)).setContent(new e(1152239795, true, new a0(this, arrayList, (int) getResources().getDimension(R.dimen.gcm3_activity_chart_height), cVar)));
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/activities/stats/ebike/EBikePerformanceChartsActivity$a;", "", "<init>", "()V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
