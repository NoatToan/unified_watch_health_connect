package com.garmin.android.apps.connectmobile.racepredictor.presentation.activity;

import ad1.b;
import android.os.Bundle;
import com.garmin.android.apps.connectmobile.d;
import e23.l;
import i53.c;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.q;
import p13.h0;
import r53.p2;
import z3.e;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0007²\u0006\u0012\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\nX\u008a\u0084\u0002"}, d2 = {"Lcom/garmin/android/apps/connectmobile/racepredictor/presentation/activity/RacePredictorTrendsActivity;", "Lcom/garmin/android/apps/connectmobile/d;", "<init>", "()V", "Li53/c;", "Lad1/b;", "activeRacePredictorChartDistances", "gcm-race-predictor_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class RacePredictorTrendsActivity extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f41087a = 0;

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class a extends q implements l<Integer, Unit> {
        public a(Object obj) {
            super(1, obj, gd1.a.class, "updateActiveRacePredictorChartDistance", "updateActiveRacePredictorChartDistance(I)V", 0);
        }

        @Override // e23.l
        public final Unit invoke(Integer num) {
            Object value;
            c cVarE;
            int iIntValue = num.intValue();
            gd1.a aVar = (gd1.a) this.receiver;
            aVar.getClass();
            ad1.a.f2756a.getClass();
            b bVar = ad1.a.f2757b.get(iIntValue);
            boolean zContains = ((c) aVar.f76968e.f150540a.getValue()).contains(bVar);
            p2 p2Var = aVar.f76967d;
            do {
                value = p2Var.getValue();
                cVarE = (c) value;
                if (zContains && cVarE.size() > 1) {
                    cVarE = i53.a.e(h0.y0(cVarE, bVar));
                } else if (!zContains) {
                    cVarE = i53.a.e(h0.D0(cVarE, bVar));
                }
            } while (!p2Var.b(value, cVarE));
            return Unit.INSTANCE;
        }
    }

    @Override // com.garmin.android.apps.connectmobile.d, com.garmin.android.apps.connectmobile.c, com.garmin.android.apps.connectmobile.z1, com.garmin.android.apps.connectmobile.v, androidx.fragment.app.m, b.g, z6.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        initComposeScreen(new e(1679800598, true, new a61.d(this, 16)));
    }
}
