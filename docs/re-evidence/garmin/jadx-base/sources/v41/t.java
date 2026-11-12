package v41;

import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.courses.model.GeoPointDTO;
import com.garmin.android.apps.connectmobile.pacepro.data.dto.PaceBandSplitDTO;
import com.garmin.android.apps.connectmobile.pacepro.domain.algorithm.PaceProAlgorithm;
import i3.e5;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.joda.time.DateTimeConstants;
import p005kotlin.Metadata;
import r53.o2;
import r53.z1;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\fB-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u000e\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Lv41/t;", "", "Lcom/garmin/android/apps/connectmobile/pacepro/domain/algorithm/PaceProAlgorithm;", "algorithm", "Lr53/z1;", "Lu41/b;", "paceProPlanFlow", "Lr53/o2;", "Lcom/garmin/android/apps/connectmobile/courses/model/e;", "courseDetailFlow", "<init>", "(Lcom/garmin/android/apps/connectmobile/pacepro/domain/algorithm/PaceProAlgorithm;Lr53/z1;Lr53/o2;)V", "a", "gcm-pacepro_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class t {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final List<Integer> f175676d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final List<Integer> f175677e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PaceProAlgorithm f175678a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z1<u41.b> f175679b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final o2<com.garmin.android.apps.connectmobile.courses.model.e> f175680c;

    static {
        new a(null);
        Integer numValueOf = Integer.valueOf(R.color.gcm_pace_pro_avg);
        f175676d = p13.x.k(numValueOf, Integer.valueOf(R.color.gcm_pace_pro_slow_20_39), Integer.valueOf(R.color.gcm_pace_pro_slow_40_59), Integer.valueOf(R.color.gcm_pace_pro_slow_60_79), Integer.valueOf(R.color.gcm_pace_pro_slow_80_100));
        f175677e = p13.x.k(Integer.valueOf(R.color.gcm_pace_pro_fast_80_100), Integer.valueOf(R.color.gcm_pace_pro_fast_60_79), Integer.valueOf(R.color.gcm_pace_pro_fast_40_59), Integer.valueOf(R.color.gcm_pace_pro_fast_20_39), numValueOf);
    }

    public t(PaceProAlgorithm paceProAlgorithm, z1<u41.b> z1Var, o2<com.garmin.android.apps.connectmobile.courses.model.e> o2Var) {
        paceProAlgorithm.getClass();
        z1Var.getClass();
        o2Var.getClass();
        this.f175678a = paceProAlgorithm;
        this.f175679b = z1Var;
        this.f175680c = o2Var;
    }

    public static final ArrayList a(t tVar, int i14, PaceBandSplitDTO[] paceBandSplitDTOArr, boolean z14) {
        int iIntValue;
        tVar.getClass();
        double d14 = z14 ? 1000.0d : 1609.344d;
        ArrayList arrayList = new ArrayList(paceBandSplitDTOArr.length);
        int length = paceBandSplitDTOArr.length;
        int iD = 0;
        while (iD < length) {
            PaceBandSplitDTO paceBandSplitDTO = paceBandSplitDTOArr[iD];
            Float splitTime = paceBandSplitDTO.getSplitTime();
            iD = e5.d((int) (((double) (splitTime != null ? splitTime.floatValue() : 0.0f)) / (paceBandSplitDTO.getSplitDistance() / d14)), iD, arrayList, 1);
        }
        Integer num = (Integer) p13.h0.t0(arrayList);
        int iIntValue2 = num != null ? num.intValue() : 0;
        Integer num2 = (Integer) p13.h0.o0(arrayList);
        int iIntValue3 = num2 != null ? num2.intValue() : DateTimeConstants.SECONDS_PER_HOUR;
        float f14 = (i14 - iIntValue2) / 5.0f;
        float f15 = (iIntValue3 - i14) / 5.0f;
        boolean z15 = ((float) Math.abs(iIntValue2 - iIntValue3)) < ((float) i14) * 0.01f;
        ArrayList arrayList2 = new ArrayList(p13.y.r(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            int iIntValue4 = ((Number) it.next()).intValue();
            if (z15) {
                iIntValue = R.color.gcm_pace_pro_avg;
            } else if (iIntValue4 > i14) {
                List<Integer> list = f175676d;
                iIntValue = list.get(j23.t.e((int) ((iIntValue4 - i14) / f15), 0, p13.x.j(list))).intValue();
            } else {
                List<Integer> list2 = f175677e;
                iIntValue = list2.get(p13.x.j(list2) - j23.t.e((int) ((i14 - iIntValue4) / f14), 0, list2.size() - 1)).intValue();
            }
            arrayList2.add(Integer.valueOf(iIntValue));
        }
        return new ArrayList(arrayList2);
    }

    public static final void b(t tVar, ArrayList arrayList, ArrayList arrayList2, PaceBandSplitDTO[] paceBandSplitDTOArr) {
        tVar.getClass();
        if (arrayList.size() > 1) {
            p13.c0.u(arrayList, new u());
        }
        int i14 = 0;
        Double d14 = ((GeoPointDTO) arrayList.get(0)).latitude;
        Double dValueOf = Double.valueOf(d14 != null ? d14.doubleValue() : 0.0d);
        Double d15 = ((GeoPointDTO) arrayList.get(0)).longitude;
        Double dValueOf2 = Double.valueOf(d15 != null ? d15.doubleValue() : 0.0d);
        Double d16 = ((GeoPointDTO) arrayList.get(0)).elevation;
        com.garmin.android.apps.connectmobile.pacepro.data.dto.c cVar = new com.garmin.android.apps.connectmobile.pacepro.data.dto.c(dValueOf, dValueOf2, Double.valueOf(d16 != null ? d16.doubleValue() : 0.0d));
        arrayList2.add(new com.garmin.android.apps.connectmobile.courses.model.g((GeoPointDTO) arrayList.get(0), ""));
        int length = paceBandSplitDTOArr.length;
        com.garmin.android.apps.connectmobile.pacepro.data.dto.c cVar2 = cVar;
        int i15 = 1;
        int i16 = 0;
        while (i16 < length) {
            double cumulativeDistanceFromStart = paceBandSplitDTOArr[i16].getCumulativeDistanceFromStart();
            Double d17 = ((GeoPointDTO) arrayList.get(i14)).distance;
            double dAbs = Math.abs((d17 != null ? d17.doubleValue() : 0.0d) - cumulativeDistanceFromStart);
            GeoPointDTO geoPointDTO = (GeoPointDTO) arrayList.get(i14);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                GeoPointDTO geoPointDTO2 = (GeoPointDTO) it.next();
                Double d18 = geoPointDTO2.distance;
                if (Math.abs((d18 != null ? d18.doubleValue() : 0.0d) - cumulativeDistanceFromStart) < dAbs) {
                    Double d19 = geoPointDTO2.distance;
                    dAbs = Math.abs((d19 != null ? d19.doubleValue() : 0.0d) - cumulativeDistanceFromStart);
                    geoPointDTO = geoPointDTO2;
                }
            }
            arrayList2.add(new com.garmin.android.apps.connectmobile.courses.model.g(geoPointDTO, String.valueOf(i15)));
            Double d24 = geoPointDTO.latitude;
            Double dValueOf3 = Double.valueOf(d24 != null ? d24.doubleValue() : 0.0d);
            Double d25 = geoPointDTO.longitude;
            Double dValueOf4 = Double.valueOf(d25 != null ? d25.doubleValue() : 0.0d);
            Double d26 = geoPointDTO.elevation;
            com.garmin.android.apps.connectmobile.pacepro.data.dto.c cVar3 = new com.garmin.android.apps.connectmobile.pacepro.data.dto.c(dValueOf3, dValueOf4, Double.valueOf(d26 != null ? d26.doubleValue() : 0.0d));
            PaceBandSplitDTO paceBandSplitDTO = paceBandSplitDTOArr[i16];
            paceBandSplitDTOArr[i16] = paceBandSplitDTO.copy((2003 & 1) != 0 ? paceBandSplitDTO.paceBandSplitPk : null, (2003 & 2) != 0 ? paceBandSplitDTO.paceBandPk : null, (2003 & 4) != 0 ? paceBandSplitDTO.cumulativeDistanceFromStart : 0.0d, (2003 & 8) != 0 ? paceBandSplitDTO.cumulativeTimeFromStart : 0.0d, (2003 & 16) != 0 ? paceBandSplitDTO.splitDistance : 0.0d, (2003 & 32) != 0 ? paceBandSplitDTO.splitAvgSpeed : 0.0d, (2003 & 64) != 0 ? paceBandSplitDTO.bearing : null, (2003 & 128) != 0 ? paceBandSplitDTO.startPoint : cVar2, (2003 & 256) != 0 ? paceBandSplitDTO.endPoint : cVar3, (2003 & 512) != 0 ? paceBandSplitDTO.splitTime : null, (2003 & 1024) != 0 ? paceBandSplitDTO.elevationChange : null);
            i15++;
            i16++;
            cVar2 = cVar3;
            i14 = 0;
        }
        if (arrayList2.size() > 1) {
            p13.c0.u(arrayList2, new v());
        }
        Iterator it3 = arrayList2.iterator();
        while (it3.hasNext()) {
            com.garmin.android.apps.connectmobile.courses.model.g gVar = (com.garmin.android.apps.connectmobile.courses.model.g) it3.next();
            gVar.name = String.valueOf(arrayList2.indexOf(gVar));
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\nR\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\b0\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u000e¨\u0006\u0010"}, d2 = {"Lv41/t$a;", "", "<init>", "()V", "", "NUMBER_OF_PACE_BANDS", "F", "DEFAULT_SPLIT_TIME_VALUE", "", "DEFAULT_FASTEST_PACE_PLACEHOLDER", "I", "DEFAULT_SLOWEST_PACE_PLACEHOLDER", "", "SLOW_PACE_COLORS", "Ljava/util/List;", "FAST_PACE_COLORS", "gcm-pacepro_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
