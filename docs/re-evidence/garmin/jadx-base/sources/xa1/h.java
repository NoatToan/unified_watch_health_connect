package xa1;

import android.content.Context;
import c22.l3;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.courses.model.GeoPointDTO;
import com.garmin.android.apps.connectmobile.powerguide.PowerGuideAlgorithm;
import com.garmin.android.apps.connectmobile.powerguide.model.PlanSplitDTO;
import com.garmin.android.apps.connectmobile.powerguide.model.PlanSummaryDTO;
import com.garmin.android.apps.connectmobile.settings.user.PowerZonesDTO;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p13.h0;
import p13.j0;

/* JADX INFO: loaded from: classes9.dex */
public final class h {
    public static final String a(Context context, double d14) {
        context.getClass();
        boolean z14 = am.j.z(f12.l.f68084a);
        l3.a aVar = l3.f23124b;
        aVar.getClass();
        return l3.a.C1(aVar, context, d14, z14, true, l3.f23130h, 32);
    }

    public static final ArrayList b(Context context, List list, PowerZonesDTO powerZonesDTO) {
        context.getClass();
        powerZonesDTO.getClass();
        ArrayList arrayList = new ArrayList(p13.y.r(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(a7.b.getColor(context, d(((ab1.e) it.next()).getPowerTarget(), powerZonesDTO))));
        }
        return arrayList;
    }

    public static final ArrayList c(ArrayList arrayList, List list) {
        ArrayList arrayList2 = new ArrayList();
        List listV = h0.V(1, list);
        ArrayList arrayList3 = new ArrayList();
        Iterator it = listV.iterator();
        while (it.hasNext()) {
            GeoPointDTO geoPointDTO = (GeoPointDTO) h0.e0(((ab1.e) it.next()).getCoursePointIndex(), arrayList);
            if (geoPointDTO != null) {
                arrayList3.add(geoPointDTO);
            }
        }
        ArrayList arrayList4 = new ArrayList(p13.y.r(arrayList3, 10));
        int i14 = 0;
        for (Object obj : arrayList3) {
            int i15 = i14 + 1;
            if (i14 < 0) {
                p13.x.q();
                throw null;
            }
            arrayList4.add(new com.garmin.android.apps.connectmobile.courses.model.g((GeoPointDTO) obj, String.valueOf(i15)));
            i14 = i15;
        }
        arrayList2.addAll(arrayList4);
        arrayList2.add(0, new com.garmin.android.apps.connectmobile.courses.model.g((GeoPointDTO) h0.b0(arrayList), ""));
        arrayList2.add(new com.garmin.android.apps.connectmobile.courses.model.g((GeoPointDTO) h0.m0(arrayList), ""));
        return arrayList2;
    }

    public static final int d(int i14, PowerZonesDTO powerZonesDTO) {
        powerZonesDTO.getClass();
        int i15 = powerZonesDTO.f43989d;
        if (i14 < i15) {
            return R.color.power_guide_gradient_color_1;
        }
        if (j23.t.o(i15, powerZonesDTO.f43990e).d(i14)) {
            return R.color.power_guide_gradient_color_2;
        }
        if (j23.t.o(powerZonesDTO.f43990e, powerZonesDTO.f43991f).d(i14)) {
            return R.color.power_guide_gradient_color_3;
        }
        if (j23.t.o(powerZonesDTO.f43991f, powerZonesDTO.f43992g).d(i14)) {
            return R.color.power_guide_gradient_color_4;
        }
        if (j23.t.o(powerZonesDTO.f43992g, powerZonesDTO.f43993h).d(i14)) {
            return R.color.power_guide_gradient_color_5;
        }
        return j23.t.o(powerZonesDTO.f43993h, powerZonesDTO.f43994i).d(i14) ? R.color.power_guide_gradient_color_6 : R.color.power_guide_gradient_color_7;
    }

    public static final void e(ab1.d dVar, com.garmin.android.apps.connectmobile.courses.model.e eVar, PowerGuideAlgorithm powerGuideAlgorithm) {
        dVar.getClass();
        eVar.getClass();
        powerGuideAlgorithm.getClass();
        Iterable<GeoPointDTO> iterable = eVar.geoPoints;
        if (iterable == null) {
            iterable = j0.f134944a;
        }
        ArrayList<GeoPointDTO> arrayList = new ArrayList();
        for (GeoPointDTO geoPointDTO : iterable) {
            if (geoPointDTO != null) {
                arrayList.add(geoPointDTO);
            }
        }
        ab1.l lVar = dVar.getPowerGuidanceSummary().f2586t;
        if (lVar == null) {
            lVar = ab1.l.LOWERED;
        }
        ab1.p pVar = dVar.getPowerGuidanceSummary().f2587v;
        if (pVar == null) {
            pVar = ab1.p.ROAD;
        }
        ArrayList arrayList2 = new ArrayList(p13.y.r(arrayList, 10));
        for (GeoPointDTO geoPointDTO2 : arrayList) {
            Double d14 = geoPointDTO2.latitude;
            double dA = lb2.b.a(d14 != null ? d14.doubleValue() : 0.0d);
            Double d15 = geoPointDTO2.longitude;
            double dA2 = lb2.b.a(d15 != null ? d15.doubleValue() : 0.0d);
            Double d16 = geoPointDTO2.elevation;
            double dDoubleValue = d16 != null ? d16.doubleValue() : 0.0d;
            Double d17 = geoPointDTO2.distance;
            arrayList2.add(new GeoPointDTO(dA, dA2, dDoubleValue, d17 != null ? d17.doubleValue() : 0.0d));
        }
        int i14 = 0;
        GeoPointDTO[] geoPointDTOArr = (GeoPointDTO[]) arrayList2.toArray(new GeoPointDTO[0]);
        l3.a aVar = l3.f23124b;
        f12.l.f68084a.getClass();
        float fT = f12.l.a.a().t();
        aVar.getClass();
        float fB = l3.a.b(fT);
        Float f14 = dVar.getPowerGuidanceSummary().f2577j;
        float fFloatValue = f14 != null ? f14.floatValue() : 0.0f;
        Float f15 = dVar.getPowerGuidanceSummary().f2578k;
        float fFloatValue2 = f15 != null ? f15.floatValue() : 0.0f;
        Integer num = dVar.getPowerGuidanceSummary().f2573f;
        float fIntValue = num != null ? num.intValue() : 0.0f;
        Float f16 = dVar.getPowerGuidanceSummary().f2572e;
        PlanSummaryDTO planSummaryDTOGenerateSplits = powerGuideAlgorithm.generateSplits(geoPointDTOArr, fB, fFloatValue, fFloatValue2, fIntValue, f16 != null ? f16.floatValue() : 0.0f, lVar.f2602a, pVar.f2633a);
        ab1.g powerGuidanceSummary = dVar.getPowerGuidanceSummary();
        PlanSplitDTO[] planSplits = planSummaryDTOGenerateSplits.getPlanSplits();
        int length = planSplits.length;
        int i15 = 0;
        int iMax = 0;
        double estimatedSeconds = 0.0d;
        double estimatedSeconds2 = 0.0d;
        while (i15 < length) {
            PlanSplitDTO planSplitDTO = planSplits[i15];
            estimatedSeconds2 += (double) planSplitDTO.getEstimatedSeconds();
            iMax = Math.max(planSplitDTO.getPowerTargetWatts(), iMax);
            estimatedSeconds += (double) (planSplitDTO.getEstimatedSeconds() * planSplitDTO.getPowerTargetWatts());
            i15++;
            i14 = i14;
        }
        int i16 = i14;
        int iRint = (int) Math.rint(estimatedSeconds / estimatedSeconds2);
        Integer num2 = powerGuidanceSummary.f2573f;
        int iIntValue = num2 != null ? num2.intValue() : i16;
        powerGuidanceSummary.f2574g = Integer.valueOf(planSummaryDTOGenerateSplits.getPlanSplits().length);
        powerGuidanceSummary.f2579l = Float.valueOf(planSummaryDTOGenerateSplits.getLowerHours());
        powerGuidanceSummary.f2580m = Float.valueOf(planSummaryDTOGenerateSplits.getUpperHours());
        double d18 = 100.0d;
        powerGuidanceSummary.f2581n = iIntValue > 0 ? Integer.valueOf((int) Math.rint((((double) iRint) * 100.0d) / ((double) iIntValue))) : Integer.valueOf(i16);
        powerGuidanceSummary.f2582o = Integer.valueOf(iMax);
        powerGuidanceSummary.f2583p = Integer.valueOf(iRint);
        powerGuidanceSummary.f2585r = Long.valueOf((long) eVar.q());
        powerGuidanceSummary.f2575h = Float.valueOf(planSummaryDTOGenerateSplits.getCda());
        powerGuidanceSummary.f2576i = Float.valueOf(planSummaryDTOGenerateSplits.getCrr());
        PlanSplitDTO[] planSplits2 = planSummaryDTOGenerateSplits.getPlanSplits();
        planSplits2.getClass();
        ArrayList arrayList3 = new ArrayList();
        int length2 = planSplits2.length;
        int i17 = i16;
        while (i17 < length2) {
            PlanSplitDTO planSplitDTO2 = planSplits2[i17];
            GeoPointDTO geoPointDTO3 = (GeoPointDTO) h0.e0(i17 == 0 ? i16 : planSplits2[i17 - 1].getCoursePointIndex(), arrayList);
            int size = i17 == planSplits2.length + (-1) ? arrayList.size() - 1 : planSplits2[i17].getCoursePointIndex();
            GeoPointDTO geoPointDTO4 = (GeoPointDTO) h0.e0(size, arrayList);
            if (geoPointDTO3 != null && geoPointDTO4 != null) {
                Double d19 = geoPointDTO4.distance;
                double dDoubleValue2 = d19 != null ? d19.doubleValue() : 0.0d;
                Double d24 = geoPointDTO3.distance;
                double dDoubleValue3 = dDoubleValue2 - (d24 != null ? d24.doubleValue() : 0.0d);
                Double d25 = geoPointDTO4.distance;
                double dDoubleValue4 = d25 != null ? d25.doubleValue() : 0.0d;
                double slope = ((double) planSplitDTO2.getSlope()) * d18;
                double ascent = planSplitDTO2.getAscent();
                int powerTargetWatts = planSplitDTO2.getPowerTargetWatts();
                double estimatedSeconds3 = planSplitDTO2.getEstimatedSeconds();
                Double d26 = geoPointDTO3.latitude;
                double dDoubleValue5 = d26 != null ? d26.doubleValue() : 0.0d;
                Double d27 = geoPointDTO3.longitude;
                double dDoubleValue6 = d27 != null ? d27.doubleValue() : 0.0d;
                Double d28 = geoPointDTO3.elevation;
                double dDoubleValue7 = d28 != null ? d28.doubleValue() : 0.0d;
                Double d29 = geoPointDTO4.latitude;
                double dDoubleValue8 = d29 != null ? d29.doubleValue() : 0.0d;
                Double d34 = geoPointDTO4.longitude;
                double dDoubleValue9 = d34 != null ? d34.doubleValue() : 0.0d;
                Double d35 = geoPointDTO4.elevation;
                arrayList3.add(new ab1.e(null, null, dDoubleValue3, dDoubleValue4, slope, null, ascent, powerTargetWatts, estimatedSeconds3, dDoubleValue6, dDoubleValue5, dDoubleValue7, dDoubleValue9, dDoubleValue8, d35 != null ? d35.doubleValue() : 0.0d, size, planSplitDTO2.getHeading(), 3, null));
            }
            i17++;
            d18 = 100.0d;
        }
        dVar.i(arrayList3);
    }

    public static final ArrayList f(int i14, List list) {
        ArrayList arrayList = new ArrayList(p13.y.r(list, 10));
        int i15 = 0;
        for (Object obj : list) {
            int i16 = i15 + 1;
            if (i15 < 0) {
                p13.x.q();
                throw null;
            }
            ab1.e eVar = (ab1.e) obj;
            arrayList.add(new ab1.n(i16, eVar.getDistance(), (float) eVar.getEstimatedDuration(), eVar.getPowerTarget(), eVar.getMeanGrade(), (int) Math.rint((((double) eVar.getPowerTarget()) * 100.0d) / ((double) i14)), eVar.getElevationChange()));
            i15 = i16;
        }
        return arrayList;
    }
}
