package com.garmin.android.apps.connectmobile.pacepro.domain.algorithm;

import com.garmin.android.apps.connectmobile.courses.model.GeoPointDTO;
import com.garmin.android.apps.connectmobile.pacepro.data.dto.PaceBandSplitDTO;
import oe2.f;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import t41.i;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0017B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J6\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004H\u0082 ¢\u0006\u0004\b\u000b\u0010\fJT\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u0006\u001a\u00020\u00042\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\t2\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0004H\u0082 ¢\u0006\u0004\b\u0013\u0010\u0014J\\\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\t2\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0004H\u0082 ¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Lcom/garmin/android/apps/connectmobile/pacepro/domain/algorithm/PaceProAlgorithm;", "", "<init>", "()V", "", "distance", "targetTime", "splitDistance", "pacingStrategy", "", "Lcom/garmin/android/apps/connectmobile/pacepro/data/dto/PaceBandSplitDTO;", "getSplitsForDistance", "(FFFF)[Lcom/garmin/android/apps/connectmobile/pacepro/data/dto/PaceBandSplitDTO;", "Lcom/garmin/android/apps/connectmobile/courses/model/GeoPointDTO;", "geoPoints", "hillEffort", "elevSegmentTolerance", "elevMinSegmLength", "paceFactor", "getSplitsForElevationChanges", "(F[Lcom/garmin/android/apps/connectmobile/courses/model/GeoPointDTO;FFFFF)[Lcom/garmin/android/apps/connectmobile/pacepro/data/dto/PaceBandSplitDTO;", "getSplitsForElevationChangesWithSplitDistance", "(FF[Lcom/garmin/android/apps/connectmobile/courses/model/GeoPointDTO;FFFFF)[Lcom/garmin/android/apps/connectmobile/pacepro/data/dto/PaceBandSplitDTO;", "a", "gcm-pacepro_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class PaceProAlgorithm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f39787a = 50.0f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f39788b = 1700.0f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f39789c = 2.0f;

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f39790a;

        static {
            int[] iArr = new int[i.values().length];
            try {
                iArr[i.EVERY_MILE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[i.EVERY_KM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[i.ELEVATION_BASED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f39790a = iArr;
        }
    }

    static {
        new a(null);
        System.loadLibrary("pacepro");
    }

    public PaceProAlgorithm() {
        b(((s41.a) KoinJavaComponent.get$default(s41.a.class, null, null, 6, null)).f());
    }

    private final native PaceBandSplitDTO[] getSplitsForDistance(float distance, float targetTime, float splitDistance, float pacingStrategy);

    private final native PaceBandSplitDTO[] getSplitsForElevationChanges(float targetTime, GeoPointDTO[] geoPoints, float pacingStrategy, float hillEffort, float elevSegmentTolerance, float elevMinSegmLength, float paceFactor);

    private final native PaceBandSplitDTO[] getSplitsForElevationChangesWithSplitDistance(float targetTime, float splitDistance, GeoPointDTO[] geoPoints, float pacingStrategy, float hillEffort, float elevSegmentTolerance, float elevMinSegmLength, float paceFactor);

    public final PaceBandSplitDTO[] a(com.garmin.android.apps.connectmobile.pacepro.data.dto.b bVar, GeoPointDTO[] geoPointDTOArr) {
        int i14;
        bVar.getClass();
        Double d14 = bVar.f39771h;
        Double d15 = bVar.f39772i;
        long j8 = bVar.f39773j;
        double d16 = bVar.f39770g;
        double d17 = 0.0d;
        if (d16 == 0.0d || j8 == 0) {
            return new PaceBandSplitDTO[0];
        }
        i iVar = bVar.f39768e;
        PaceBandSplitDTO[] splitsForDistance = null;
        if (geoPointDTOArr != null) {
            i14 = iVar != null ? b.f39790a[iVar.ordinal()] : -1;
            if (i14 == 1) {
                splitsForDistance = getSplitsForElevationChangesWithSplitDistance(j8, 1609.3441f, geoPointDTOArr, d15 != null ? (float) d15.doubleValue() : 0.0f, d14 != null ? (float) d14.doubleValue() : 0.0f, this.f39787a, this.f39788b, this.f39789c);
            } else if (i14 == 2) {
                splitsForDistance = getSplitsForElevationChangesWithSplitDistance(j8, 1000.0f, geoPointDTOArr, d15 != null ? (float) d15.doubleValue() : 0.0f, d14 != null ? (float) d14.doubleValue() : 0.0f, this.f39787a, this.f39788b, this.f39789c);
            } else if (i14 == 3) {
                float f14 = j8;
                float fDoubleValue = d15 != null ? (float) d15.doubleValue() : 0.0f;
                float fDoubleValue2 = d14 != null ? (float) d14.doubleValue() : 0.0f;
                float f15 = this.f39787a;
                Float f16 = bVar.f39780q;
                splitsForDistance = getSplitsForElevationChanges(f14, geoPointDTOArr, fDoubleValue, fDoubleValue2, f15, f16 != null ? f16.floatValue() : this.f39788b, this.f39789c);
            }
        } else {
            i14 = iVar != null ? b.f39790a[iVar.ordinal()] : -1;
            if (i14 == 1) {
                splitsForDistance = getSplitsForDistance((float) d16, j8, 1609.3441f, d15 != null ? (float) d15.doubleValue() : 0.0f);
            } else if (i14 == 2) {
                splitsForDistance = getSplitsForDistance((float) d16, j8, 1000.0f, d15 != null ? (float) d15.doubleValue() : 0.0f);
            }
        }
        if (splitsForDistance != null) {
            int length = splitsForDistance.length;
            double dFloatValue = 0.0d;
            int i15 = 0;
            while (i15 < length) {
                double splitDistance = splitsForDistance[i15].getSplitDistance() + d17;
                Float splitTime = splitsForDistance[i15].getSplitTime();
                dFloatValue += (double) (splitTime != null ? splitTime.floatValue() : 0.0f);
                PaceBandSplitDTO paceBandSplitDTO = splitsForDistance[i15];
                double dU = f.U(dFloatValue);
                double splitDistance2 = splitsForDistance[i15].getSplitDistance();
                Float splitTime2 = splitsForDistance[i15].getSplitTime();
                splitsForDistance[i15] = paceBandSplitDTO.copy((2003 & 1) != 0 ? paceBandSplitDTO.paceBandSplitPk : null, (2003 & 2) != 0 ? paceBandSplitDTO.paceBandPk : null, (2003 & 4) != 0 ? paceBandSplitDTO.cumulativeDistanceFromStart : splitDistance, (2003 & 8) != 0 ? paceBandSplitDTO.cumulativeTimeFromStart : dU, (2003 & 16) != 0 ? paceBandSplitDTO.splitDistance : 0.0d, (2003 & 32) != 0 ? paceBandSplitDTO.splitAvgSpeed : splitDistance2 / ((double) (splitTime2 != null ? splitTime2.floatValue() : 1.0f)), (2003 & 64) != 0 ? paceBandSplitDTO.bearing : null, (2003 & 128) != 0 ? paceBandSplitDTO.startPoint : null, (2003 & 256) != 0 ? paceBandSplitDTO.endPoint : null, (2003 & 512) != 0 ? paceBandSplitDTO.splitTime : null, (2003 & 1024) != 0 ? paceBandSplitDTO.elevationChange : null);
                i15++;
                d17 = splitDistance;
            }
        }
        return splitsForDistance == null ? new PaceBandSplitDTO[0] : splitsForDistance;
    }

    public final void b(q41.a aVar) {
        aVar.getClass();
        Float f14 = aVar.f142590b;
        this.f39788b = f14 != null ? f14.floatValue() : 1700.0f;
        Float f15 = aVar.f142589a;
        this.f39787a = f15 != null ? f15.floatValue() : 50.0f;
        Float f16 = aVar.f142591c;
        this.f39789c = f16 != null ? f16.floatValue() : 2.0f;
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/pacepro/domain/algorithm/PaceProAlgorithm$a;", "", "<init>", "()V", "gcm-pacepro_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
