package com.garmin.android.apps.connectmobile.powerguide;

import com.garmin.android.apps.connectmobile.courses.model.GeoPointDTO;
import com.garmin.android.apps.connectmobile.powerguide.model.PlanSummaryDTO;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0013B\u0007¢\u0006\u0004\b\u0002\u0010\u0003JV\u0010\u0011\u001a\u00020\u00102\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\rH\u0086 ¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Lcom/garmin/android/apps/connectmobile/powerguide/PowerGuideAlgorithm;", "", "<init>", "()V", "", "Lcom/garmin/android/apps/connectmobile/courses/model/GeoPointDTO;", "geoPoints", "", "riderHeight", "riderMass", "gearMass", "ftp", "effort", "", "aeroProfile", "resistanceProfile", "Lcom/garmin/android/apps/connectmobile/powerguide/model/PlanSummaryDTO;", "generateSplits", "([Lcom/garmin/android/apps/connectmobile/courses/model/GeoPointDTO;FFFFFII)Lcom/garmin/android/apps/connectmobile/powerguide/model/PlanSummaryDTO;", "a", "gcm-power-guide_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class PowerGuideAlgorithm {
    static {
        new a(null);
        System.loadLibrary("PowerGuidance");
    }

    public final native PlanSummaryDTO generateSplits(GeoPointDTO[] geoPoints, float riderHeight, float riderMass, float gearMass, float ftp, float effort, int aeroProfile, int resistanceProfile);

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/powerguide/PowerGuideAlgorithm$a;", "", "<init>", "()V", "gcm-power-guide_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
