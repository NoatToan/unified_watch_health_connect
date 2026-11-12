package p40;

import android.content.Context;
import c22.l3;
import c22.m3;
import java.text.DecimalFormat;

/* JADX INFO: loaded from: classes8.dex */
public final class v0 {
    public static q40.b a(com.garmin.android.apps.connectmobile.courses.model.g gVar, Context context, boolean z14, int i14) {
        f12.l.a aVar = f12.l.f68084a;
        boolean z15 = am.j.z(aVar);
        boolean z16 = (i14 & 4) != 0 ? false : z14;
        com.garmin.android.apps.connectmobile.courses.model.f.a aVar2 = com.garmin.android.apps.connectmobile.courses.model.f.f32898h;
        String coursePointType = gVar.getCoursePointType();
        aVar2.getClass();
        com.garmin.android.apps.connectmobile.courses.model.f fVarA = com.garmin.android.apps.connectmobile.courses.model.f.a.a(coursePointType);
        Long coursePointId = gVar.getCoursePointId();
        String strA = gVar.name;
        if (strA == null) {
            strA = dh.b.A(context, fVarA.a());
        }
        String str = strA;
        l3.a aVar3 = l3.f23124b;
        Double distance = gVar.getDistance();
        double dDoubleValue = distance != null ? distance.doubleValue() : 0.0d;
        m3 m3Var = am.j.z(aVar) ? m3.KILOMETER : m3.MILE;
        DecimalFormat decimalFormat = l3.f23129g;
        aVar3.getClass();
        String strO = l3.a.O(null, dDoubleValue, m3Var, decimalFormat, false);
        String string = context.getString((z15 ? m3.KILOMETER : m3.MILE).f23164e);
        string.getClass();
        Double d14 = gVar.derivedElevation;
        String strX = l3.a.X(d14 != null ? d14.doubleValue() : 0.0d, f12.l.a.a().y());
        String string2 = context.getString((z15 ? m3.METER : m3.FOOT).f23164e);
        string2.getClass();
        String str2 = gVar.note;
        Integer num = gVar.restDuration;
        Integer num2 = gVar.cutoffDuration;
        boolean z17 = (z16 || p13.h0.R(p13.x.k(com.garmin.android.apps.connectmobile.courses.model.f.COURSE_START.f32922a, com.garmin.android.apps.connectmobile.courses.model.f.COURSE_FINISH.f32922a), gVar.getCoursePointType())) ? false : true;
        com.garmin.android.apps.connectmobile.courses.model.f fVar = com.garmin.android.apps.connectmobile.courses.model.f.COURSE_START;
        boolean z18 = !p13.h0.R(p13.x.k(fVar.f32922a, com.garmin.android.apps.connectmobile.courses.model.f.COURSE_FINISH.f32922a), gVar.getCoursePointType());
        boolean z19 = !p005kotlin.jvm.internal.s.g(gVar.getCoursePointType(), fVar.f32922a);
        Double d15 = gVar.lat;
        double dDoubleValue2 = d15 != null ? d15.doubleValue() : 0.0d;
        Double d16 = gVar.lon;
        return new q40.b(coursePointId, str, strO, string, strX, string2, fVarA, str2, num, num2, z17, z18, z19, dDoubleValue2, d16 != null ? d16.doubleValue() : 0.0d);
    }
}
