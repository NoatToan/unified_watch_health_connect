package v52;

import android.content.Context;
import c22.l3;
import c22.m3;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.workouts.data.model.WorkoutDetailsDTO;
import com.garmin.android.apps.connectmobile.workouts.data.model.h0;
import f12.l;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import l52.o;
import m52.j;
import m52.k;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import p13.j0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lv52/g;", "", "<init>", "()V", "gcm-workouts_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g f175774a = new g();

    private g() {
    }

    public static String a(Context context, WorkoutDetailsDTO workoutDetailsDTO, h0 h0Var, LinkedHashMap linkedHashMap) {
        Context context2;
        String strQ;
        m3 m3Var;
        context.getClass();
        workoutDetailsDTO.getClass();
        h0Var.getClass();
        linkedHashMap.getClass();
        Integer estimatedDurationInSecs = h0Var.getEstimatedDurationInSecs();
        Double estimatedDistanceInMeters = h0Var.getEstimatedDistanceInMeters();
        m52.b estimateType = h0Var.getEstimateType();
        k kVar = h0Var.f48193h;
        k kVar2 = k.f116758r;
        if (kVar == kVar2) {
            Double d14 = workoutDetailsDTO.f48047h;
            if (d14 != null && zf.b.D(d14)) {
                j.a aVar = j.f116744d;
            }
            if (estimateType == m52.b.TIME_AND_DISTANCE_ESTIMATED || estimateType == m52.b.TIME_ESTIMATED) {
                estimatedDurationInSecs = 0;
            }
        }
        int iQ = h0Var.q();
        String string = iQ == 1 ? context.getString(R.string.lbl_workout_single_step) : context.getString(R.string.lbl_workout_number_steps, String.valueOf(iQ));
        string.getClass();
        ArrayList arrayListO = h0Var.o();
        boolean z14 = estimateType == m52.b.TIME_ESTIMATED || e.e(estimatedDurationInSecs, estimatedDistanceInMeters, estimateType) == e.a.TIME;
        if (k52.g.f(h0Var.f48193h) && !arrayListO.isEmpty()) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            zw1.b bVar = new zw1.b(new l22.a(context));
            o.a(h0Var.t(), l52.h.PRE_ORDER, new p62.e(linkedHashMap, 14, h0Var, linkedHashSet));
            List listB = bVar.b(p13.h0.b1(linkedHashSet));
            if (listB == null) {
                listB = j0.f134944a;
            }
            List list = listB;
            int size = list.size();
            if (!list.isEmpty()) {
                String string2 = size > 3 ? context.getString(R.string.lbl_primary_muscle_groups_plural_param, String.valueOf(size)) : p13.h0.k0(list, " · ", null, null, null, 62);
                string2.getClass();
                String string3 = context.getString(R.string.string_space_dot_space_string_pattern, string2, string);
                string3.getClass();
                return string3;
            }
        } else {
            if (estimatedDurationInSecs != null && estimatedDurationInSecs.intValue() > 0 && z14) {
                l3.a aVar2 = l3.f23124b;
                long jIntValue = estimatedDurationInSecs.intValue();
                aVar2.getClass();
                String string4 = context.getString(R.string.string_space_dot_space_string_pattern, l3.a.e1(jIntValue), string);
                string4.getClass();
                return string4;
            }
            if (estimatedDistanceInMeters != null && estimatedDistanceInMeters.doubleValue() > 0.0d) {
                if (h0Var.f48193h == kVar2) {
                    boolean z15 = workoutDetailsDTO.f48048i == j.f116748h;
                    boolean z16 = s.c(workoutDetailsDTO.f48047h, 0.0d) || !zf.b.D(workoutDetailsDTO.f48047h);
                    if (z16) {
                        m3Var = m3.UNSPECIFIED;
                    } else {
                        m3Var = z15 ? m3.YARD : m3.METER;
                    }
                    m3 m3Var2 = m3Var;
                    double dDoubleValue = z15 ? estimatedDistanceInMeters.doubleValue() * 0.9144d : estimatedDistanceInMeters.doubleValue();
                    l3.f23124b.getClass();
                    strQ = l3.a.O(context, dDoubleValue, m3Var2, l3.f23131i, !z16);
                    context2 = context;
                } else {
                    l.f68084a.getClass();
                    boolean zA = l.a.a().g().a();
                    l3.a aVar3 = l3.f23124b;
                    double dDoubleValue2 = estimatedDistanceInMeters.doubleValue();
                    DecimalFormat decimalFormat = l3.f23138p;
                    aVar3.getClass();
                    context2 = context;
                    strQ = l3.a.Q(context2, dDoubleValue2, decimalFormat, true, zA);
                }
                String string5 = context2.getString(R.string.string_space_dot_space_string_pattern, strQ, string);
                string5.getClass();
                return string5;
            }
        }
        return string;
    }
}
