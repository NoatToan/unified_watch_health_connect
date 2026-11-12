package lt1;

import android.content.Context;
import c22.l3;
import com.garmin.android.apps.connectmobile.R;
import f12.l;
import gg1.o0;
import gg1.v0;
import i3.e5;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import o13.p;
import org.apache.commons.lang3.StringUtils;
import org.joda.time.DateTime;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p13.h0;
import p13.w;
import p13.y;
import pt1.q;
import pt1.s;
import pt1.t;
import pt1.x;
import qs1.u;
import us1.m;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Llt1/j;", "", "<init>", "()V", "gcm-trails_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j f114865a = new j();

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class a<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t7, T t14) {
            Integer displayOrder = ((qs1.b) t7).getDisplayOrder();
            Integer numValueOf = Integer.valueOf(displayOrder != null ? displayOrder.intValue() : 0);
            Integer displayOrder2 = ((qs1.b) t14).getDisplayOrder();
            return r13.a.b(numValueOf, Integer.valueOf(displayOrder2 != null ? displayOrder2.intValue() : 0));
        }
    }

    private j() {
    }

    public static p a(Context context, qs1.d dVar, String str) {
        String string;
        String string2;
        Object objValueOf = Double.valueOf(0.0d);
        StringBuilder sb3 = new StringBuilder();
        f114865a.getClass();
        Integer tripReportCount = dVar.getTripReportCount();
        int iIntValue = tripReportCount != null ? tripReportCount.intValue() : 0;
        if (iIntValue == 0) {
            string = context.getString(R.string.trail_rating_not_rated);
        } else {
            DecimalFormat decimalFormat = l3.f23126d;
            Object courseRating = dVar.getCourseRating();
            if (courseRating == null) {
                courseRating = objValueOf;
            }
            string = context.getString(R.string.string_space_string_bracket_pattern, decimalFormat.format(courseRating), String.valueOf(iIntValue));
        }
        String string3 = context.getString(R.string.string_space_string_pattern, "★", string);
        string3.getClass();
        sb3.append(string3);
        if (str != null) {
            sb3.append(" • ");
            sb3.append(str);
        }
        us1.h.a aVar = us1.h.f172403e;
        Integer courseDifficulty = dVar.getCourseDifficulty();
        aVar.getClass();
        us1.h hVarA = us1.h.a.a(courseDifficulty);
        if (hVarA != null) {
            sb3.append(" • ");
            sb3.append(context.getString(hVarA.f172408b));
        }
        sb3.append(" • ");
        Long durationMinSeconds = dVar.getDurationMinSeconds();
        long jLongValue = durationMinSeconds != null ? durationMinSeconds.longValue() : 0L;
        Long durationMaxSeconds = dVar.getDurationMaxSeconds();
        sb3.append(g(context, jLongValue, durationMaxSeconds != null ? durationMaxSeconds.longValue() : 0L));
        m.a aVar2 = m.f172438c;
        String courseType = dVar.getCourseType();
        aVar2.getClass();
        m mVarA = m.a.a(courseType);
        if (mVarA != null) {
            sb3.append(" • ");
            sb3.append(context.getString(mVarA.f172442b));
        }
        String string4 = sb3.toString();
        StringBuilder sb4 = new StringBuilder();
        Integer tripReportCount2 = dVar.getTripReportCount();
        if ((tripReportCount2 != null ? tripReportCount2.intValue() : 0) == 0) {
            string2 = context.getString(R.string.trail_rating_not_rated);
        } else {
            DecimalFormat decimalFormat2 = l3.f23126d;
            Float courseRating2 = dVar.getCourseRating();
            if (courseRating2 != null) {
                objValueOf = courseRating2;
            }
            String str2 = decimalFormat2.format(objValueOf);
            Integer tripReportCount3 = dVar.getTripReportCount();
            string2 = context.getString(R.string.trail_rating_stars_content_description, str2, "5", String.valueOf(tripReportCount3 != null ? tripReportCount3.intValue() : 0));
        }
        sb4.append(string2);
        sb4.append(StringUtils.SPACE);
        if (str != null) {
            sb4.append(oi0.c.A(context, new lq1.a(20), str));
            sb4.append(StringUtils.SPACE);
        }
        us1.h hVarA2 = us1.h.a.a(dVar.getCourseDifficulty());
        if (hVarA2 != null) {
            sb4.append(context.getString(hVarA2.f172408b));
        }
        sb4.append(StringUtils.SPACE);
        Long durationMinSeconds2 = dVar.getDurationMinSeconds();
        long jLongValue2 = durationMinSeconds2 != null ? durationMinSeconds2.longValue() : 0L;
        Long durationMaxSeconds2 = dVar.getDurationMaxSeconds();
        sb4.append(oi0.c.A(context, new lq1.a(21), g(context, jLongValue2, durationMaxSeconds2 != null ? durationMaxSeconds2.longValue() : 0L)));
        m mVarA2 = m.a.a(dVar.getCourseType());
        if (mVarA2 != null) {
            sb4.append(StringUtils.SPACE);
            sb4.append(context.getString(mVarA2.f172442b));
        }
        return new p(string4, sb4.toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /*  JADX ERROR: StackOverflowError in pass: IfRegionVisitor
        java.lang.StackOverflowError
        	at jadx.core.dex.nodes.InsnNode.getRegisterArgs(InsnNode.java:200)
        	at jadx.core.dex.regions.conditions.IfCondition.getRegisterArgs(IfCondition.java:259)
        	at jadx.core.dex.instructions.mods.TernaryInsn.rebindArgs(TernaryInsn.java:97)
        	at jadx.core.dex.instructions.mods.TernaryInsn.rebindArgs(TernaryInsn.java:100)
        */
    public static pt1.p b(qs1.s r42, android.content.Context r43, java.lang.Boolean r44) {
        /*
            Method dump skipped, instruction units count: 629
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: lt1.j.b(qs1.s, android.content.Context, java.lang.Boolean):pt1.p");
    }

    /* JADX WARN: Code duplicated, block: B:71:0x0192  */
    /* JADX WARN: Code duplicated, block: B:73:0x0199  */
    /* JADX WARN: Code duplicated, block: B:76:0x01a1  */
    /* JADX WARN: Multi-variable type inference failed */
    public static t c(j jVar, qs1.d dVar, Context context, boolean z14, Boolean bool, com.garmin.android.library.mapsdkadapter.i.d dVar2, int i14) {
        boolean z15;
        boolean zBooleanValue;
        Float courseRating;
        float fFloatValue;
        String strS;
        boolean z16 = (i14 & 4) != 0 ? false : z14;
        i53.c cVarE = null;
        Boolean bool2 = (i14 & 8) != 0 ? null : bool;
        jVar.getClass();
        dVar.getClass();
        context.getClass();
        dVar2.getClass();
        l lVar = (l) KoinJavaComponent.get$default(l.class, null, null, 6, null);
        boolean zY = lVar.y();
        o0 o0VarG = lVar.g();
        l3.a aVar = l3.f23124b;
        Long courseDistanceCM = dVar.getCourseDistanceCM();
        long jLongValue = courseDistanceCM != null ? courseDistanceCM.longValue() : 0L;
        DecimalFormat decimalFormat = l3.f23129g;
        aVar.getClass();
        String strQ = l3.a.Q(context, jLongValue / 100.0d, decimalFormat, true, zY);
        p pVarA = a(context, dVar, z16 ? strQ : null);
        Long curatedCourseId = dVar.getCuratedCourseId();
        long jLongValue2 = curatedCourseId != null ? curatedCourseId.longValue() : -1L;
        Long connectCourseId = dVar.getConnectCourseId();
        long jLongValue3 = connectCourseId != null ? connectCourseId.longValue() : -1L;
        String courseName = dVar.getCourseName();
        String str = courseName == null ? "" : courseName;
        us1.h.a aVar2 = us1.h.f172403e;
        Integer courseDifficulty = dVar.getCourseDifficulty();
        aVar2.getClass();
        us1.h hVarA = us1.h.a.a(courseDifficulty);
        m.a aVar3 = m.f172438c;
        String courseType = dVar.getCourseType();
        aVar3.getClass();
        m mVarA = m.a.a(courseType);
        qs1.h locationDTO = dVar.getLocationDTO();
        q qVar = new q(str, hVarA, mVarA, locationDTO != null ? f(locationDTO) : "", (String) pVarA.f128594a, (String) pVarA.f128595b, dVar.getUnderReview(), dVar.getClosed());
        qs1.i curatedStartLocation = dVar.getCuratedStartLocation();
        ke2.b bVarA = curatedStartLocation != null ? qs1.j.a(curatedStartLocation) : null;
        List<String> listG = dVar.G();
        if (listG != null) {
            ArrayList arrayList = new ArrayList();
            for (String str2 : listG) {
                us1.i.f172411c.getClass();
                us1.i iVarA = us1.i.a.a(str2);
                if (iVarA != null) {
                    arrayList.add(iVarA);
                }
            }
            cVarE = i53.a.e(arrayList);
        }
        i53.c cVar = cVarE;
        qs1.b coverImage = dVar.getCoverImage();
        String str3 = (coverImage == null || (strS = oc.b.s(coverImage)) == null) ? "" : strS;
        Long courseDistanceCM2 = dVar.getCourseDistanceCM();
        long j8 = 100;
        long jLongValue4 = (courseDistanceCM2 != null ? courseDistanceCM2.longValue() : 0L) / j8;
        le2.d dVarA = b.a(b.f114858a, context, dVar, null, null, 12);
        lt1.a aVar4 = lt1.a.f114857a;
        List listC = w.c(dVarA);
        aVar4.getClass();
        s sVar = new s(dVarA, i53.a.e(h0.C0(lt1.a.a(context, listC, 2131232000), lt1.a.b(context, w.c(dVarA)))), dVarA.f112063b);
        Long courseElevationGainCM = dVar.getCourseElevationGainCM();
        long jLongValue5 = (courseElevationGainCM != null ? courseElevationGainCM.longValue() : 0L) / j8;
        String strD = d(context, dVar.getCourseElevationGainCM(), o0VarG);
        String strD2 = d(context, dVar.getCourseElevationLossCM(), o0VarG);
        if (bool2 == null) {
            Boolean favorite = dVar.getFavorite();
            if (favorite != null) {
                zBooleanValue = favorite.booleanValue();
            } else {
                z15 = false;
            }
            courseRating = dVar.getCourseRating();
            if (courseRating != null) {
                fFloatValue = courseRating.floatValue();
            } else {
                fFloatValue = 0.0f;
            }
            float f14 = fFloatValue;
            Integer tripReportCount = dVar.getTripReportCount();
            return new t(jLongValue2, jLongValue3, qVar, cVar, bVarA, str3, null, sVar, jLongValue4, strQ, jLongValue5, strD, strD2, z15, f14, tripReportCount != null ? tripReportCount.intValue() : 0, dVar.getClosed(), dVar.getUnderReview(), dVar2);
        }
        zBooleanValue = bool2.booleanValue();
        z15 = zBooleanValue;
        courseRating = dVar.getCourseRating();
        if (courseRating != null) {
            fFloatValue = courseRating.floatValue();
        } else {
            fFloatValue = 0.0f;
        }
        float f15 = fFloatValue;
        Integer tripReportCount2 = dVar.getTripReportCount();
        return new t(jLongValue2, jLongValue3, qVar, cVar, bVarA, str3, null, sVar, jLongValue4, strQ, jLongValue5, strD, strD2, z15, f15, tripReportCount2 != null ? tripReportCount2.intValue() : 0, dVar.getClosed(), dVar.getUnderReview(), dVar2);
    }

    public static String d(Context context, Long l14, o0 o0Var) {
        double dLongValue = (l14 != null ? l14.longValue() : 0L) / 100.0d;
        if (l14 != null && !Double.isNaN(dLongValue)) {
            l3.f23124b.getClass();
            return l3.a.a0(context, dLongValue, o0Var, true, false);
        }
        String string = context.getString(R.string.no_value);
        l3.f23124b.getClass();
        String string2 = context.getString(R.string.string_space_string_pattern, string, l3.a.G1(context, o0Var));
        string2.getClass();
        return string2;
    }

    /* JADX WARN: Code duplicated, block: B:51:0x0107  */
    /* JADX WARN: Code duplicated, block: B:71:0x017c  */
    /* JADX WARN: Code duplicated, block: B:94:0x01dc  */
    public static x e(u uVar, Context context, boolean z14, qs1.h hVar, String str) {
        i53.c cVarB;
        i53.c cVarB2;
        i53.c cVarB3;
        boolean z15;
        Iterator it;
        Object next;
        List listN0;
        Object next2;
        Context context2 = context;
        uVar.getClass();
        context2.getClass();
        hVar.getClass();
        str.getClass();
        String string = context2.getString(R.string.common_difficulty);
        us1.h.a aVar = us1.h.f172403e;
        Integer difficulty = uVar.getDifficulty();
        aVar.getClass();
        us1.h hVarA = us1.h.a.a(difficulty);
        String string2 = context2.getString(R.string.string_colon_string_pattern, string, context2.getString(hVarA != null ? hVarA.f172408b : R.string.no_value));
        string2.getClass();
        pi0.e eVar = new pi0.e(context2);
        Long activityDateMs = uVar.getActivityDateMs();
        String strA = eVar.a(new DateTime(activityDateMs != null ? activityDateMs.longValue() : 0L), qi0.a.YEAR_ABBREV_MONTH_DAY);
        if (us1.h.a.a(uVar.getDifficulty()) != null) {
            strA = context2.getString(R.string.string_space_dot_space_string_pattern, strA, string2);
        }
        String str2 = strA;
        str2.getClass();
        Long tripReportId = uVar.getTripReportId();
        long jLongValue = tripReportId != null ? tripReportId.longValue() : -1L;
        Long curatedCourseId = uVar.getCuratedCourseId();
        long jLongValue2 = curatedCourseId != null ? curatedCourseId.longValue() : -1L;
        String userName = uVar.getUserName();
        if (userName == null) {
            userName = context2.getString(R.string.lbl_anonymous);
            userName.getClass();
        }
        String str3 = userName;
        String profileImage = uVar.getProfileImage();
        Integer rating = uVar.getRating();
        int iIntValue = rating != null ? rating.intValue() : 0;
        String reviewComment = uVar.getReviewComment();
        if (reviewComment == null) {
            reviewComment = "";
        }
        List<String> listU = uVar.u();
        if (listU != null) {
            ArrayList arrayList = new ArrayList();
            for (String str4 : listU) {
                w13.c cVar = us1.i.f172416h;
                p13.c.b bVarN = com.airbnb.lottie.animation.keyframe.a.n(cVar, cVar);
                do {
                    if (!bVarN.hasNext()) {
                        next2 = null;
                        break;
                    }
                    next2 = bVarN.next();
                } while (!p005kotlin.jvm.internal.s.g(((us1.i) next2).f172417a, str4));
                us1.i iVar = (us1.i) next2;
                if (iVar != null) {
                    arrayList.add(iVar);
                }
            }
            List listM0 = h0.M0(arrayList);
            if (listM0 == null || (cVarB = i53.a.e(listM0)) == null) {
                cVarB = j53.l.b();
            }
        } else {
            cVarB = j53.l.b();
        }
        List<qs1.b> listM = uVar.m();
        if (listM == null || (listN0 = h0.N0(listM, new a())) == null) {
            cVarB2 = j53.l.b();
        } else {
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : listN0) {
                qs1.b bVar = (qs1.b) obj;
                if (!bVar.getHidden() || bVar.getRequesterOwned()) {
                    arrayList2.add(obj);
                }
            }
            ArrayList arrayList3 = new ArrayList(y.r(arrayList2, 10));
            Iterator it3 = arrayList2.iterator();
            while (it3.hasNext()) {
                arrayList3.add(ge1.b.p((qs1.b) it3.next(), new pi0.e(context2), Boolean.valueOf(uVar.getRequesterOwned())));
                context2 = context;
            }
            cVarB2 = i53.a.e(arrayList3);
            if (cVarB2 == null) {
                cVarB2 = j53.l.b();
            }
        }
        i53.c cVar2 = cVarB2;
        List<String> listF = uVar.f();
        if (listF != null) {
            ArrayList arrayList4 = new ArrayList();
            Iterator it4 = listF.iterator();
            while (it4.hasNext()) {
                String str5 = (String) it4.next();
                w13.c cVar3 = us1.g.f172400h;
                p13.c.b bVarN2 = com.airbnb.lottie.animation.keyframe.a.n(cVar3, cVar3);
                while (true) {
                    if (!bVarN2.hasNext()) {
                        it = it4;
                        next = null;
                        break;
                    }
                    next = bVarN2.next();
                    it = it4;
                    if (p005kotlin.jvm.internal.s.g(((us1.g) next).f172401a, str5)) {
                        break;
                    }
                    it4 = it;
                }
                us1.g gVar = (us1.g) next;
                if (gVar != null) {
                    arrayList4.add(gVar);
                }
                it4 = it;
            }
            List listM1 = h0.M0(arrayList4);
            if (listM1 == null || (cVarB3 = i53.a.e(listM1)) == null) {
                cVarB3 = j53.l.b();
            }
        } else {
            cVarB3 = j53.l.b();
        }
        i53.c cVar4 = cVarB3;
        Integer helpfulRatingCount = uVar.getHelpfulRatingCount();
        int iIntValue2 = helpfulRatingCount != null ? helpfulRatingCount.intValue() : 0;
        String courseName = uVar.getCourseName();
        String str6 = courseName == null ? "" : courseName;
        boolean zA = uVar.A();
        boolean requesterOwned = uVar.getRequesterOwned();
        Long tripReportId2 = uVar.getTripReportId();
        long jLongValue3 = tripReportId2 != null ? tripReportId2.longValue() : -1L;
        String countryCode = hVar.getCom.google.firebase.remoteconfig.RemoteConfigConstants.RequestFieldKey.COUNTRY_CODE java.lang.String();
        if (countryCode == null) {
            countryCode = "";
        }
        String province = hVar.getProvince();
        String str7 = province != null ? province : "";
        i53.c cVar5 = cVarB;
        String strH = h(jLongValue3, countryCode, str7, str);
        Boolean hidden = uVar.getHidden();
        boolean zBooleanValue = hidden != null ? hidden.booleanValue() : false;
        List<qs1.b> listM2 = uVar.m();
        if (listM2 == null || listM2.isEmpty()) {
            z15 = false;
        } else {
            Iterator<T> it5 = listM2.iterator();
            while (it5.hasNext()) {
                if (((qs1.b) it5.next()).getHidden()) {
                    z15 = true;
                }
            }
            z15 = false;
        }
        return new x(jLongValue, jLongValue2, str3, profileImage, str2, iIntValue, reviewComment, cVar5, cVar2, cVar4, iIntValue2, z14, null, null, str6, requesterOwned, zA, 0L, strH, zBooleanValue, z15, false, 2240512, null);
    }

    public static String f(qs1.h hVar) {
        ArrayList arrayListC = p13.u.C(new String[]{hVar.getAreaOfInterest(), hVar.getProvince()});
        ArrayList arrayList = new ArrayList();
        for (Object obj : arrayListC) {
            if (((String) obj).length() != 0) {
                arrayList.add(obj);
            }
        }
        return h0.k0(arrayList, ", ", null, null, null, 62);
    }

    public static String g(Context context, long j8, long j14) {
        long j15 = 1800;
        double d14 = (j8 / j15) / 2.0d;
        double d15 = (j14 / j15) / 2.0d;
        int i14 = (int) d14;
        boolean z14 = d14 - ((double) i14) > 0.0d;
        int i15 = (int) d15;
        boolean z15 = d15 - ((double) i15) > 0.0d;
        if (d14 == 0.0d) {
            if (d15 == 1.0d) {
                String string = context.getString(R.string.singular_num_hour_abbreviation, context.getString(R.string.lbl_less_than_string, z15 ? String.valueOf(d15) : String.valueOf(i15)));
                string.getClass();
                return string;
            }
            String string2 = context.getString(R.string.plural_num_hour_abbrebiation, context.getString(R.string.lbl_less_than_string, z15 ? String.valueOf(d15) : String.valueOf(i15)));
            string2.getClass();
            return string2;
        }
        if (d14 != d15) {
            String string3 = context.getString(R.string.plural_num_hour_abbrebiation, context.getString(R.string.string_line_string_pattern_no_space, z14 ? String.valueOf(d14) : String.valueOf(i14), z15 ? String.valueOf(d15) : String.valueOf(i15)));
            string3.getClass();
            return string3;
        }
        if (d14 == 1.0d) {
            String string4 = context.getString(R.string.singular_num_hour_abbreviation, String.valueOf(i14));
            string4.getClass();
            return string4;
        }
        String string5 = context.getString(R.string.plural_num_hour_abbrebiation, z14 ? String.valueOf(d14) : String.valueOf(i14));
        string5.getClass();
        return string5;
    }

    public static String h(long j8, String str, String str2, String str3) {
        str3.getClass();
        v0.T.getClass();
        StringBuilder sbL = e5.l(v0.a.b().b(), "/modern/trails/", str, "/", str2);
        am.j.y(sbL, "/", str3, "/");
        sbL.append(j8);
        return sbL.toString();
    }
}
