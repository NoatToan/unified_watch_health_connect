package kw;

import com.garmin.android.apps.connectmobile.R;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import lc.u0;
import p005kotlin.Metadata;
import p13.k0;
import p13.t0;
import p13.y;
import r1.q2;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0015B\u0087\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\b\u0012\b\b\u0002\u0010\f\u001a\u00020\b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0010\u001a\u00020\b\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Lkw/m;", "", "Lkw/j;", TtmlNode.TAG_REGION, "", "Lkw/b;", "Lkw/f;", "categoryMap", "", "healthDisclaimer", "helpAboutFirstParagraph", "helpAboutSecondParagraph", "helpAboutThirdParagraph", "helpAboutFourthParagraph", "", "helpAboutFirstLinkLabel", "helpAboutFirstLinkUrl", "helpAboutSecondLinkLabel", "helpAboutSecondLinkUrl", "<init>", "(Lkw/j;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)V", "a", "gcm-blood-pressure_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final /* data */ class m {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final a f106876l = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f106877a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map<b, f> f106878b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f106879c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f106880d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f106881e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f106882f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f106883g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f106884h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f106885i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Integer f106886j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final String f106887k;

    /* JADX WARN: Illegal instructions before constructor call */
    public m(j jVar, Map map, String str, String str2, String str3, String str4, String str5, int i14, String str6, Integer num, String str7, int i15, p005kotlin.jvm.internal.j jVar2) {
        jVar = (i15 & 1) != 0 ? j.WORLD : jVar;
        if ((i15 & 2) != 0) {
            map = k0.f134949a;
            map.getClass();
        }
        this(jVar, map, (i15 & 4) != 0 ? "" : str, (i15 & 8) != 0 ? "" : str2, (i15 & 16) != 0 ? "" : str3, (i15 & 32) != 0 ? "" : str4, (i15 & 64) != 0 ? "" : str5, (i15 & 128) != 0 ? -1 : i14, (i15 & 256) != 0 ? "" : str6, (i15 & 512) != 0 ? null : num, (i15 & 1024) != 0 ? null : str7);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return this.f106877a == mVar.f106877a && p005kotlin.jvm.internal.s.g(this.f106878b, mVar.f106878b) && p005kotlin.jvm.internal.s.g(this.f106879c, mVar.f106879c) && p005kotlin.jvm.internal.s.g(this.f106880d, mVar.f106880d) && p005kotlin.jvm.internal.s.g(this.f106881e, mVar.f106881e) && p005kotlin.jvm.internal.s.g(this.f106882f, mVar.f106882f) && p005kotlin.jvm.internal.s.g(this.f106883g, mVar.f106883g) && this.f106884h == mVar.f106884h && p005kotlin.jvm.internal.s.g(this.f106885i, mVar.f106885i) && p005kotlin.jvm.internal.s.g(this.f106886j, mVar.f106886j) && p005kotlin.jvm.internal.s.g(this.f106887k, mVar.f106887k);
    }

    public final int hashCode() {
        int iJ = wr.g.j(wr.g.j(wr.g.j(wr.g.j(am.j.b(this.f106878b, this.f106877a.hashCode() * 31, 31), 31, this.f106879c), 31, this.f106880d), 31, this.f106881e), 31, this.f106882f);
        String str = this.f106883g;
        int iJ2 = wr.g.j(q2.d(this.f106884h, (iJ + (str == null ? 0 : str.hashCode())) * 31, 31), 31, this.f106885i);
        Integer num = this.f106886j;
        int iHashCode = (iJ2 + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.f106887k;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("BloodPressureUiData(region=");
        sb3.append(this.f106877a);
        sb3.append(", categoryMap=");
        sb3.append(this.f106878b);
        sb3.append(", healthDisclaimer=");
        sn.a.t(sb3, this.f106879c, ", helpAboutFirstParagraph=", this.f106880d, ", helpAboutSecondParagraph=");
        sn.a.t(sb3, this.f106881e, ", helpAboutThirdParagraph=", this.f106882f, ", helpAboutFourthParagraph=");
        q6.f.q(this.f106884h, this.f106883g, ", helpAboutFirstLinkLabel=", ", helpAboutFirstLinkUrl=", sb3);
        fb1.c.u(this.f106886j, this.f106885i, ", helpAboutSecondLinkLabel=", ", helpAboutSecondLinkUrl=", sb3);
        return am.j.o(this.f106887k, ")", sb3);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lkw/m$a;", "", "<init>", "()V", "", "AMERICAN_HEART_HELP_LINK", "Ljava/lang/String;", "ISH_HELP_LINK", "gcm-blood-pressure_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: kw.m$a$a, reason: collision with other inner class name */
        public static final /* synthetic */ class C2061a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f106888a;

            static {
                int[] iArr = new int[j.values().length];
                try {
                    iArr[j.WORLD.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[j.US.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f106888a = iArr;
            }
        }

        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static m a(l22.a aVar, j jVar, Set set) {
            jVar.getClass();
            int i14 = C2061a.f106888a[jVar.ordinal()];
            if (i14 == 1) {
                return new m(j.WORLD, b(aVar, jVar, set), aVar.getString(R.string.msg_international_society_of_hypertension_health_disclaimer), aVar.getString(R.string.lbl_blood_pressure_reading_international_society_of_hypertension), aVar.getString(R.string.lbl_blood_pressure_measurements_by_international_society_of_hypertension), aVar.getString(R.string.lbl_about_high_blood_pressure), null, R.string.citation_international_society_of_hypertension, "https://ish-world.com/ish-global-hypertension-practice-guidelines/", Integer.valueOf(R.string.citation_american_heart_association), "https://www.heart.org/en/health-topics/high-blood-pressure/understanding-blood-pressure-readings");
            }
            if (i14 == 2) {
                return new m(j.US, b(aVar, jVar, set), aVar.getString(R.string.msg_american_heart_association_health_disclaimer), aVar.getString(R.string.lbl_blood_pressure_reading_by_american_health_association), aVar.getString(R.string.lbl_blood_pressure_about_measurements), aVar.getString(R.string.lbl_blood_pressure_about_hypertensive_reading), aVar.getString(R.string.lbl_about_high_blood_pressure), R.string.citation_american_heart_association, "https://www.heart.org/en/health-topics/high-blood-pressure/understanding-blood-pressure-readings", null, null);
            }
            u0.r();
            return null;
        }

        public static LinkedHashMap b(l22.a aVar, j jVar, Set set) {
            b[] bVarArr;
            q qVar;
            f fVar;
            r diastolic;
            Double min;
            s systolic;
            Double min2;
            r diastolic2;
            Double max;
            r diastolic3;
            Double min3;
            s systolic2;
            Double max2;
            s systolic3;
            Double min4;
            Object next;
            r diastolic4;
            Double max3;
            r diastolic5;
            Double min5;
            s systolic4;
            Double max4;
            s systolic5;
            Double min6;
            r diastolic6;
            Double max5;
            r diastolic7;
            Double min7;
            s systolic6;
            Double max6;
            s systolic7;
            Double min8;
            r diastolic8;
            Double max7;
            r diastolic9;
            Double min9;
            s systolic8;
            Double max8;
            s systolic9;
            Double min10;
            q qVar2;
            q qVar3;
            r diastolic10;
            Double min11;
            s systolic10;
            Double min12;
            r diastolic11;
            Double max9;
            r diastolic12;
            Double min13;
            s systolic11;
            Double max10;
            s systolic12;
            Double min14;
            Object next2;
            Object next3;
            q qVar4;
            r diastolic13;
            Double min15;
            r diastolic14;
            Double max11;
            r diastolic15;
            Double min16;
            s systolic13;
            Double max12;
            s systolic14;
            Double min17;
            Object next4;
            r diastolic16;
            Double max13;
            r diastolic17;
            Double min18;
            s systolic15;
            Double max14;
            s systolic16;
            Double min19;
            r diastolic18;
            Double max15;
            r diastolic19;
            Double min20;
            s systolic17;
            Double max16;
            s systolic18;
            Double min21;
            r diastolic20;
            Double max17;
            r diastolic21;
            Double min22;
            s systolic19;
            Double max18;
            s systolic20;
            Double min23;
            b[] bVarArrValues = b.values();
            ArrayList arrayList = new ArrayList();
            int length = bVarArrValues.length;
            int i14 = 0;
            while (i14 < length) {
                b bVar = bVarArrValues[i14];
                f.f106835o.getClass();
                jVar.getClass();
                bVar.getClass();
                int i15 = f.a.C2060a.f106851b[jVar.ordinal()];
                q qVar5 = null;
                Object obj = null;
                q qVar6 = null;
                Object obj2 = null;
                q qVar7 = null;
                Object obj3 = null;
                q qVar8 = null;
                Object obj4 = null;
                q qVar9 = null;
                Object obj5 = null;
                q qVar10 = null;
                Object obj6 = null;
                q qVar11 = null;
                Object obj7 = null;
                q qVar12 = null;
                Object obj8 = null;
                q qVar13 = null;
                Object obj9 = null;
                int iDoubleValue = -1;
                if (i15 == 1) {
                    bVarArr = bVarArrValues;
                    int i16 = f.a.C2060a.f106850a[bVar.ordinal()];
                    if (i16 == 1) {
                        if (set != null) {
                            Iterator it = set.iterator();
                            do {
                                if (!it.hasNext()) {
                                    next = null;
                                    break;
                                }
                                next = it.next();
                            } while (!p005kotlin.jvm.internal.s.g(((q) next).getCategory(), "NORMAL"));
                            qVar = (q) next;
                        } else {
                            qVar = null;
                        }
                        if (set != null) {
                            for (Object obj10 : set) {
                                if (p005kotlin.jvm.internal.s.g(((q) obj10).getCategory(), "HIGH_NORMAL")) {
                                    obj9 = obj10;
                                    break;
                                }
                            }
                            qVar5 = (q) obj9;
                        }
                        int iDoubleValue2 = (qVar == null || (systolic3 = qVar.getSystolic()) == null || (min4 = systolic3.getMin()) == null) ? -1 : (int) min4.doubleValue();
                        int iDoubleValue3 = (qVar == null || (systolic2 = qVar.getSystolic()) == null || (max2 = systolic2.getMax()) == null) ? -1 : (int) max2.doubleValue();
                        int iDoubleValue4 = (qVar == null || (diastolic3 = qVar.getDiastolic()) == null || (min3 = diastolic3.getMin()) == null) ? -1 : (int) min3.doubleValue();
                        int iDoubleValue5 = (qVar == null || (diastolic2 = qVar.getDiastolic()) == null || (max = diastolic2.getMax()) == null) ? -1 : (int) max.doubleValue();
                        int iDoubleValue6 = (qVar5 == null || (systolic = qVar5.getSystolic()) == null || (min2 = systolic.getMin()) == null) ? -1 : (int) min2.doubleValue();
                        if (qVar5 != null && (diastolic = qVar5.getDiastolic()) != null && (min = diastolic.getMin()) != null) {
                            iDoubleValue = (int) min.doubleValue();
                        }
                        fVar = new f("NORMAL", aVar.getString(R.string.lbl_blood_pressure_normal), iDoubleValue2, iDoubleValue3, new j23.l(iDoubleValue2, iDoubleValue3), iDoubleValue4, iDoubleValue5, new j23.l(iDoubleValue4, iDoubleValue5), R.color.blood_pressure_category1, aVar.a(R.string.lbl_below, Integer.valueOf(iDoubleValue6)), aVar.getString(R.string.lbl_and), aVar.a(R.string.lbl_below, Integer.valueOf(iDoubleValue)), jVar, bVar);
                    } else if (i16 == 2) {
                        if (set != null) {
                            for (Object obj11 : set) {
                                if (p005kotlin.jvm.internal.s.g(((q) obj11).getCategory(), "HIGH_NORMAL")) {
                                    obj8 = obj11;
                                    break;
                                }
                            }
                            qVar13 = (q) obj8;
                        }
                        int iDoubleValue7 = (qVar13 == null || (systolic5 = qVar13.getSystolic()) == null || (min6 = systolic5.getMin()) == null) ? -1 : (int) min6.doubleValue();
                        int iDoubleValue8 = (qVar13 == null || (systolic4 = qVar13.getSystolic()) == null || (max4 = systolic4.getMax()) == null) ? -1 : (int) max4.doubleValue();
                        int iDoubleValue9 = (qVar13 == null || (diastolic5 = qVar13.getDiastolic()) == null || (min5 = diastolic5.getMin()) == null) ? -1 : (int) min5.doubleValue();
                        int iDoubleValue10 = (qVar13 == null || (diastolic4 = qVar13.getDiastolic()) == null || (max3 = diastolic4.getMax()) == null) ? -1 : (int) max3.doubleValue();
                        fVar = new f("HIGH_NORMAL", aVar.getString(R.string.lbl_blood_pressure_category_high_normal), iDoubleValue7, iDoubleValue8, new j23.l(iDoubleValue7, iDoubleValue8), iDoubleValue9, iDoubleValue10, new j23.l(iDoubleValue9, iDoubleValue10), R.color.blood_pressure_category2, aVar.a(R.string.string_short_dash_line_string_pattern, Integer.valueOf(iDoubleValue7), Integer.valueOf(iDoubleValue8)), aVar.a(R.string.string_slash_string_no_space_pattern, aVar.getString(R.string.lbl_and), aVar.getString(R.string.lbl_or)), aVar.a(R.string.string_short_dash_line_string_pattern, Integer.valueOf(iDoubleValue9), Integer.valueOf(iDoubleValue10)), jVar, bVar);
                    } else if (i16 == 3) {
                        if (set != null) {
                            for (Object obj12 : set) {
                                if (p005kotlin.jvm.internal.s.g(((q) obj12).getCategory(), "GRADE_1")) {
                                    obj7 = obj12;
                                    break;
                                }
                            }
                            qVar12 = (q) obj7;
                        }
                        int iDoubleValue11 = (qVar12 == null || (systolic7 = qVar12.getSystolic()) == null || (min8 = systolic7.getMin()) == null) ? -1 : (int) min8.doubleValue();
                        int iDoubleValue12 = (qVar12 == null || (systolic6 = qVar12.getSystolic()) == null || (max6 = systolic6.getMax()) == null) ? -1 : (int) max6.doubleValue();
                        int iDoubleValue13 = (qVar12 == null || (diastolic7 = qVar12.getDiastolic()) == null || (min7 = diastolic7.getMin()) == null) ? -1 : (int) min7.doubleValue();
                        int iDoubleValue14 = (qVar12 == null || (diastolic6 = qVar12.getDiastolic()) == null || (max5 = diastolic6.getMax()) == null) ? -1 : (int) max5.doubleValue();
                        fVar = new f("GRADE_1", aVar.getString(R.string.lbl_blood_pressure_category_grade_one), iDoubleValue11, iDoubleValue12, new j23.l(iDoubleValue11, iDoubleValue12), iDoubleValue13, iDoubleValue14, new j23.l(iDoubleValue13, iDoubleValue14), R.color.blood_pressure_category3, aVar.a(R.string.string_short_dash_line_string_pattern, Integer.valueOf(iDoubleValue11), Integer.valueOf(iDoubleValue12)), aVar.a(R.string.string_slash_string_no_space_pattern, aVar.getString(R.string.lbl_and), aVar.getString(R.string.lbl_or)), aVar.a(R.string.string_short_dash_line_string_pattern, Integer.valueOf(iDoubleValue13), Integer.valueOf(iDoubleValue14)), jVar, bVar);
                    } else if (i16 == 4) {
                        if (set != null) {
                            for (Object obj13 : set) {
                                if (p005kotlin.jvm.internal.s.g(((q) obj13).getCategory(), "GRADE_2")) {
                                    obj6 = obj13;
                                    break;
                                }
                            }
                            qVar11 = (q) obj6;
                        }
                        int iDoubleValue15 = (qVar11 == null || (systolic9 = qVar11.getSystolic()) == null || (min10 = systolic9.getMin()) == null) ? -1 : (int) min10.doubleValue();
                        int iDoubleValue16 = (qVar11 == null || (systolic8 = qVar11.getSystolic()) == null || (max8 = systolic8.getMax()) == null) ? -1 : (int) max8.doubleValue();
                        int iDoubleValue17 = (qVar11 == null || (diastolic9 = qVar11.getDiastolic()) == null || (min9 = diastolic9.getMin()) == null) ? -1 : (int) min9.doubleValue();
                        int iDoubleValue18 = (qVar11 == null || (diastolic8 = qVar11.getDiastolic()) == null || (max7 = diastolic8.getMax()) == null) ? -1 : (int) max7.doubleValue();
                        fVar = new f("GRADE_2", aVar.getString(R.string.lbl_blood_pressure_category_grade_two), iDoubleValue15, iDoubleValue16, new j23.l(iDoubleValue15, iDoubleValue16), iDoubleValue17, iDoubleValue18, new j23.l(iDoubleValue17, iDoubleValue18), R.color.blood_pressure_category4, aVar.a(R.string.lbl_equal_or_higher, Integer.valueOf(iDoubleValue15)), aVar.a(R.string.string_slash_string_no_space_pattern, aVar.getString(R.string.lbl_and), aVar.getString(R.string.lbl_or)), aVar.a(R.string.lbl_equal_or_higher, Integer.valueOf(iDoubleValue17)), jVar, bVar);
                    } else {
                        if (i16 != 5) {
                            u0.r();
                            return null;
                        }
                        fVar = null;
                    }
                } else {
                    if (i15 != 2) {
                        u0.r();
                        return null;
                    }
                    int i17 = f.a.C2060a.f106850a[bVar.ordinal()];
                    if (i17 == 1) {
                        bVarArr = bVarArrValues;
                        if (set != null) {
                            Iterator it3 = set.iterator();
                            do {
                                if (!it3.hasNext()) {
                                    next3 = null;
                                    break;
                                }
                                next3 = it3.next();
                            } while (!p005kotlin.jvm.internal.s.g(((q) next3).getCategory(), "NORMAL"));
                            qVar2 = (q) next3;
                        } else {
                            qVar2 = null;
                        }
                        if (set != null) {
                            Iterator it4 = set.iterator();
                            do {
                                if (!it4.hasNext()) {
                                    next2 = null;
                                    break;
                                }
                                next2 = it4.next();
                            } while (!p005kotlin.jvm.internal.s.g(((q) next2).getCategory(), "ELEVATED"));
                            qVar3 = (q) next2;
                        } else {
                            qVar3 = null;
                        }
                        if (set != null) {
                            for (Object obj14 : set) {
                                if (p005kotlin.jvm.internal.s.g(((q) obj14).getCategory(), "STAGE_1_HIGH")) {
                                    obj5 = obj14;
                                    break;
                                }
                            }
                            qVar10 = (q) obj5;
                        }
                        int iDoubleValue19 = (qVar2 == null || (systolic12 = qVar2.getSystolic()) == null || (min14 = systolic12.getMin()) == null) ? -1 : (int) min14.doubleValue();
                        int iDoubleValue20 = (qVar2 == null || (systolic11 = qVar2.getSystolic()) == null || (max10 = systolic11.getMax()) == null) ? -1 : (int) max10.doubleValue();
                        int iDoubleValue21 = (qVar2 == null || (diastolic12 = qVar2.getDiastolic()) == null || (min13 = diastolic12.getMin()) == null) ? -1 : (int) min13.doubleValue();
                        int iDoubleValue22 = (qVar2 == null || (diastolic11 = qVar2.getDiastolic()) == null || (max9 = diastolic11.getMax()) == null) ? -1 : (int) max9.doubleValue();
                        int iDoubleValue23 = (qVar3 == null || (systolic10 = qVar3.getSystolic()) == null || (min12 = systolic10.getMin()) == null) ? -1 : (int) min12.doubleValue();
                        if (qVar10 != null && (diastolic10 = qVar10.getDiastolic()) != null && (min11 = diastolic10.getMin()) != null) {
                            iDoubleValue = (int) min11.doubleValue();
                        }
                        fVar = new f("NORMAL", aVar.getString(R.string.lbl_blood_pressure_normal), iDoubleValue19, iDoubleValue20, new j23.l(iDoubleValue19, iDoubleValue20), iDoubleValue21, iDoubleValue22, new j23.l(iDoubleValue21, iDoubleValue22), R.color.blood_pressure_category1, aVar.a(R.string.lbl_below, Integer.valueOf(iDoubleValue23)), aVar.getString(R.string.lbl_and), aVar.a(R.string.lbl_below, Integer.valueOf(iDoubleValue)), jVar, bVar);
                    } else if (i17 == 2) {
                        bVarArr = bVarArrValues;
                        if (set != null) {
                            Iterator it5 = set.iterator();
                            do {
                                if (!it5.hasNext()) {
                                    next4 = null;
                                    break;
                                }
                                next4 = it5.next();
                            } while (!p005kotlin.jvm.internal.s.g(((q) next4).getCategory(), "ELEVATED"));
                            qVar4 = (q) next4;
                        } else {
                            qVar4 = null;
                        }
                        if (set != null) {
                            for (Object obj15 : set) {
                                if (p005kotlin.jvm.internal.s.g(((q) obj15).getCategory(), "STAGE_1_HIGH")) {
                                    obj4 = obj15;
                                    break;
                                }
                            }
                            qVar9 = (q) obj4;
                        }
                        int iDoubleValue24 = (qVar4 == null || (systolic14 = qVar4.getSystolic()) == null || (min17 = systolic14.getMin()) == null) ? -1 : (int) min17.doubleValue();
                        int iDoubleValue25 = (qVar4 == null || (systolic13 = qVar4.getSystolic()) == null || (max12 = systolic13.getMax()) == null) ? -1 : (int) max12.doubleValue();
                        int iDoubleValue26 = (qVar4 == null || (diastolic15 = qVar4.getDiastolic()) == null || (min16 = diastolic15.getMin()) == null) ? -1 : (int) min16.doubleValue();
                        int iDoubleValue27 = (qVar4 == null || (diastolic14 = qVar4.getDiastolic()) == null || (max11 = diastolic14.getMax()) == null) ? -1 : (int) max11.doubleValue();
                        if (qVar9 != null && (diastolic13 = qVar9.getDiastolic()) != null && (min15 = diastolic13.getMin()) != null) {
                            iDoubleValue = (int) min15.doubleValue();
                        }
                        fVar = new f("ELEVATED", aVar.getString(R.string.lbl_blood_pressure_category_elevated), iDoubleValue24, iDoubleValue25, new j23.l(iDoubleValue24, iDoubleValue25), iDoubleValue26, iDoubleValue27, new j23.l(iDoubleValue26, iDoubleValue27), R.color.blood_pressure_category2, aVar.a(R.string.string_short_dash_line_string_pattern, Integer.valueOf(iDoubleValue24), Integer.valueOf(iDoubleValue25)), aVar.getString(R.string.lbl_and), aVar.a(R.string.lbl_below, Integer.valueOf(iDoubleValue)), jVar, bVar);
                    } else if (i17 != 3) {
                        if (i17 == 4) {
                            if (set != null) {
                                for (Object obj16 : set) {
                                    if (p005kotlin.jvm.internal.s.g(((q) obj16).getCategory(), "STAGE_2_HIGH")) {
                                        obj2 = obj16;
                                        break;
                                    }
                                }
                                qVar7 = (q) obj2;
                            }
                            int iDoubleValue28 = (qVar7 == null || (systolic18 = qVar7.getSystolic()) == null || (min21 = systolic18.getMin()) == null) ? -1 : (int) min21.doubleValue();
                            int iDoubleValue29 = (qVar7 == null || (systolic17 = qVar7.getSystolic()) == null || (max16 = systolic17.getMax()) == null) ? -1 : (int) max16.doubleValue();
                            int iDoubleValue30 = (qVar7 == null || (diastolic19 = qVar7.getDiastolic()) == null || (min20 = diastolic19.getMin()) == null) ? -1 : (int) min20.doubleValue();
                            int iDoubleValue31 = (qVar7 == null || (diastolic18 = qVar7.getDiastolic()) == null || (max15 = diastolic18.getMax()) == null) ? -1 : (int) max15.doubleValue();
                            fVar = new f("STAGE_2_HIGH", aVar.a(R.string.lbl_blood_pressure_stage, 2), iDoubleValue28, iDoubleValue29, new j23.l(iDoubleValue28, iDoubleValue29), iDoubleValue30, iDoubleValue31, new j23.l(iDoubleValue30, iDoubleValue31), R.color.blood_pressure_category4, aVar.a(R.string.lbl_equal_or_higher, Integer.valueOf(iDoubleValue28)), aVar.getString(R.string.lbl_or), aVar.a(R.string.lbl_equal_or_higher, Integer.valueOf(iDoubleValue30)), jVar, bVar);
                        } else {
                            if (i17 != 5) {
                                u0.r();
                                return null;
                            }
                            if (set != null) {
                                for (Object obj17 : set) {
                                    if (p005kotlin.jvm.internal.s.g(((q) obj17).getCategory(), "HYPERTENSIVE_CRISIS")) {
                                        obj = obj17;
                                        break;
                                    }
                                }
                                qVar6 = (q) obj;
                            }
                            int iDoubleValue32 = (qVar6 == null || (systolic20 = qVar6.getSystolic()) == null || (min23 = systolic20.getMin()) == null) ? -1 : (int) min23.doubleValue();
                            int iDoubleValue33 = (qVar6 == null || (systolic19 = qVar6.getSystolic()) == null || (max18 = systolic19.getMax()) == null) ? -1 : (int) max18.doubleValue();
                            int iDoubleValue34 = (qVar6 == null || (diastolic21 = qVar6.getDiastolic()) == null || (min22 = diastolic21.getMin()) == null) ? -1 : (int) min22.doubleValue();
                            int iDoubleValue35 = (qVar6 == null || (diastolic20 = qVar6.getDiastolic()) == null || (max17 = diastolic20.getMax()) == null) ? -1 : (int) max17.doubleValue();
                            fVar = new f("HYPERTENSIVE_CRISIS", aVar.getString(R.string.lbl_blood_pressure_category_hypertensive), iDoubleValue32, iDoubleValue33, new j23.l(iDoubleValue32, iDoubleValue33), iDoubleValue34, iDoubleValue35, new j23.l(iDoubleValue34, iDoubleValue35), R.color.blood_pressure_category5, aVar.a(R.string.lbl_equal_or_higher, Integer.valueOf(iDoubleValue32)), aVar.a(R.string.string_slash_string_no_space_pattern, aVar.getString(R.string.lbl_and), aVar.getString(R.string.lbl_or)), aVar.a(R.string.lbl_equal_or_higher, Integer.valueOf(iDoubleValue34)), jVar, bVar);
                        }
                        bVarArr = bVarArrValues;
                    } else {
                        if (set != null) {
                            for (Object obj18 : set) {
                                if (p005kotlin.jvm.internal.s.g(((q) obj18).getCategory(), "STAGE_1_HIGH")) {
                                    obj3 = obj18;
                                    break;
                                }
                            }
                            qVar8 = (q) obj3;
                        }
                        int iDoubleValue36 = (qVar8 == null || (systolic16 = qVar8.getSystolic()) == null || (min19 = systolic16.getMin()) == null) ? -1 : (int) min19.doubleValue();
                        int iDoubleValue37 = (qVar8 == null || (systolic15 = qVar8.getSystolic()) == null || (max14 = systolic15.getMax()) == null) ? -1 : (int) max14.doubleValue();
                        int iDoubleValue38 = (qVar8 == null || (diastolic17 = qVar8.getDiastolic()) == null || (min18 = diastolic17.getMin()) == null) ? -1 : (int) min18.doubleValue();
                        int iDoubleValue39 = (qVar8 == null || (diastolic16 = qVar8.getDiastolic()) == null || (max13 = diastolic16.getMax()) == null) ? -1 : (int) max13.doubleValue();
                        bVarArr = bVarArrValues;
                        fVar = new f("STAGE_1_HIGH", aVar.a(R.string.lbl_blood_pressure_stage, 1), iDoubleValue36, iDoubleValue37, new j23.l(iDoubleValue36, iDoubleValue37), iDoubleValue38, iDoubleValue39, new j23.l(iDoubleValue38, iDoubleValue39), R.color.blood_pressure_category3, aVar.a(R.string.string_short_dash_line_string_pattern, Integer.valueOf(iDoubleValue36), Integer.valueOf(iDoubleValue37)), aVar.getString(R.string.lbl_or), aVar.a(R.string.string_short_dash_line_string_pattern, Integer.valueOf(iDoubleValue38), Integer.valueOf(iDoubleValue39)), jVar, bVar);
                    }
                }
                if (fVar != null) {
                    arrayList.add(fVar);
                }
                i14++;
                bVarArrValues = bVarArr;
            }
            int iA = t0.a(y.r(arrayList, 10));
            if (iA < 16) {
                iA = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(iA);
            for (Object obj19 : arrayList) {
                linkedHashMap.put(((f) obj19).f106849n, obj19);
            }
            return linkedHashMap;
        }

        private a() {
        }
    }

    public m(j jVar, Map<b, f> map, String str, String str2, String str3, String str4, String str5, int i14, String str6, Integer num, String str7) {
        jVar.getClass();
        map.getClass();
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        str6.getClass();
        this.f106877a = jVar;
        this.f106878b = map;
        this.f106879c = str;
        this.f106880d = str2;
        this.f106881e = str3;
        this.f106882f = str4;
        this.f106883g = str5;
        this.f106884h = i14;
        this.f106885i = str6;
        this.f106886j = num;
        this.f106887k = str7;
    }

    public m() {
        this(null, null, null, null, null, null, null, 0, null, null, null, 2047, null);
    }
}
