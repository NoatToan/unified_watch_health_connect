package ex2;

import android.content.Context;
import com.garmin.android.apps.connectmobile.R;
import iw2.i1;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Locale;
import o53.s0;
import org.slf4j.Logger;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.r0;
import p13.u0;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lex2/w;", "", "<init>", "()V", "real-time-settings_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final w f67058a = new w();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final o13.t f67059b = o13.m.b(new e51.c(28));

    private w() {
    }

    public static final void a(w wVar, Context context, long j8) {
        wVar.getClass();
        e().getClass();
        context.getSharedPreferences(context.getString(R.string.key_rts_shared_preference_context), 0).edit().putLong(context.getString(R.string.key_string_translation_last_checked_in, String.valueOf(j8)), System.currentTimeMillis()).apply();
    }

    public static Object d(Context context, long j8, String str, v13.c cVar) {
        iw2.w.f95547a.getClass();
        x53.c cVar2 = s0.f129406a;
        return ge1.b.e0(x53.b.f189152a, new iw2.p(context, j8, str, null), cVar);
    }

    public static cx2.h e() {
        return (cx2.h) f67059b.getValue();
    }

    public static void i(Context context) {
        e().getClass();
        try {
            com.garmin.realtimesettings.app.initialization.b bVar = com.garmin.realtimesettings.app.initialization.b.f52589a;
            String string = context.getString(R.string.lbl_ft_per_second);
            string.getClass();
            Locale locale = Locale.ROOT;
            String lowerCase = string.toLowerCase(locale);
            lowerCase.getClass();
            o13.p pVar = new o13.p(lowerCase, context.getString(R.string.feet_per_second_verbose));
            String string2 = context.getString(R.string.lbl_kmh);
            string2.getClass();
            String lowerCase2 = string2.toLowerCase(locale);
            lowerCase2.getClass();
            o13.p pVar2 = new o13.p(lowerCase2, context.getString(R.string.common_kph_string));
            String string3 = context.getString(R.string.lbl_mph);
            string3.getClass();
            String lowerCase3 = string3.toLowerCase(locale);
            lowerCase3.getClass();
            o13.p pVar3 = new o13.p(lowerCase3, context.getString(R.string.common_mph_string));
            String string4 = context.getString(R.string.lbl_spm);
            string4.getClass();
            String lowerCase4 = string4.toLowerCase(locale);
            lowerCase4.getClass();
            o13.p pVar4 = new o13.p(lowerCase4, context.getString(R.string.lbl_strides_per_minutes));
            String string5 = context.getString(R.string.lbl_mile);
            string5.getClass();
            String lowerCase5 = string5.toLowerCase(locale);
            lowerCase5.getClass();
            o13.p pVar5 = new o13.p(lowerCase5, context.getString(R.string.common_lbl_miles));
            String string6 = context.getString(R.string.lbl_cm);
            string6.getClass();
            String lowerCase6 = string6.toLowerCase(locale);
            lowerCase6.getClass();
            o13.p pVar6 = new o13.p(lowerCase6, context.getString(R.string.lbl_centimeter));
            String string7 = context.getString(R.string.lbl_yard);
            string7.getClass();
            String lowerCase7 = string7.toLowerCase(locale);
            lowerCase7.getClass();
            o13.p pVar7 = new o13.p(lowerCase7, context.getString(R.string.common_yard));
            String string8 = context.getString(R.string.lbl_km);
            string8.getClass();
            String lowerCase8 = string8.toLowerCase(locale);
            lowerCase8.getClass();
            o13.p pVar8 = new o13.p(lowerCase8, context.getString(R.string.common_lbl_kilometers));
            String string9 = context.getString(R.string.lbl_ft);
            string9.getClass();
            String lowerCase9 = string9.toLowerCase(locale);
            lowerCase9.getClass();
            o13.p pVar9 = new o13.p(lowerCase9, context.getString(R.string.common_feet_string));
            String string10 = context.getString(R.string.common_abbrev_inches_string);
            string10.getClass();
            String lowerCase10 = string10.toLowerCase(locale);
            lowerCase10.getClass();
            o13.p pVar10 = new o13.p(lowerCase10, context.getString(R.string.lbl_inches));
            String string11 = context.getString(R.string.lbl_lbs);
            string11.getClass();
            String lowerCase11 = string11.toLowerCase(locale);
            lowerCase11.getClass();
            o13.p pVar11 = new o13.p(lowerCase11, context.getString(R.string.lbl_pounds));
            String string12 = context.getString(R.string.lbl_kg);
            string12.getClass();
            String lowerCase12 = string12.toLowerCase(locale);
            lowerCase12.getClass();
            o13.p pVar12 = new o13.p(lowerCase12, context.getString(R.string.lbl_kilograms));
            String string13 = context.getString(R.string.lbl_ms);
            string13.getClass();
            String lowerCase13 = string13.toLowerCase(locale);
            lowerCase13.getClass();
            o13.p pVar13 = new o13.p(lowerCase13, context.getString(R.string.lbl_milliseconds));
            String string14 = context.getString(R.string.lbl_minutes_abbreviation);
            string14.getClass();
            String lowerCase14 = string14.toLowerCase(locale);
            lowerCase14.getClass();
            o13.p pVar14 = new o13.p(lowerCase14, context.getString(R.string.lbl_time_unit_minutes));
            String string15 = context.getString(R.string.lbl_hours_abbreviation);
            string15.getClass();
            String lowerCase15 = string15.toLowerCase(locale);
            lowerCase15.getClass();
            o13.p pVar15 = new o13.p(lowerCase15, context.getString(R.string.lbl_time_unit_hours));
            String string16 = context.getString(R.string.lbl_abbreviation_day);
            string16.getClass();
            String lowerCase16 = string16.toLowerCase(locale);
            lowerCase16.getClass();
            o13.p pVar16 = new o13.p(lowerCase16, context.getString(R.string.common_days));
            String string17 = context.getString(R.string.common_abbrev_liter_string);
            string17.getClass();
            String lowerCase17 = string17.toLowerCase(locale);
            lowerCase17.getClass();
            o13.p pVar17 = new o13.p(lowerCase17, context.getString(R.string.lbl_liters));
            String string18 = context.getString(R.string.lbl_unit_milliliter_abr);
            string18.getClass();
            String lowerCase18 = string18.toLowerCase(locale);
            lowerCase18.getClass();
            o13.p pVar18 = new o13.p(lowerCase18, context.getString(R.string.common_milliliters));
            String string19 = context.getString(R.string.pregnancy_mgdl);
            string19.getClass();
            String lowerCase19 = string19.toLowerCase(locale);
            lowerCase19.getClass();
            o13.p pVar19 = new o13.p(lowerCase19, context.getString(R.string.lbl_mgdl_long));
            String string20 = context.getString(R.string.pregnancy_mmol);
            string20.getClass();
            String lowerCase20 = string20.toLowerCase(locale);
            lowerCase20.getClass();
            o13.p pVar20 = new o13.p(lowerCase20, context.getString(R.string.lbl_mmol_l_long));
            String string21 = context.getString(R.string.lbl_watt_kg);
            string21.getClass();
            String lowerCase21 = string21.toLowerCase(locale);
            lowerCase21.getClass();
            o13.p pVar21 = new o13.p(lowerCase21, context.getString(R.string.lbl_watts_per_kg_long));
            String string22 = context.getString(R.string.lbl_bpm);
            string22.getClass();
            String lowerCase22 = string22.toLowerCase(locale);
            lowerCase22.getClass();
            o13.p pVar22 = new o13.p(lowerCase22, context.getString(R.string.lbl_heart_rate_beats_per_minute));
            String string23 = context.getString(R.string.activities_brpm_common_lbl);
            string23.getClass();
            String lowerCase23 = string23.toLowerCase(locale);
            lowerCase23.getClass();
            o13.p pVar23 = new o13.p(lowerCase23, context.getString(R.string.lbl_breaths_per_minute));
            String string24 = context.getString(R.string.pulse_ox_spo2_label);
            string24.getClass();
            String lowerCase24 = string24.toLowerCase(locale);
            lowerCase24.getClass();
            o13.p pVar24 = new o13.p(lowerCase24, context.getString(R.string.lbl_peripheral_oxygen_saturation));
            String string25 = context.getString(R.string.lbl_minute_per_mile_without_period);
            string25.getClass();
            String lowerCase25 = string25.toLowerCase(locale);
            lowerCase25.getClass();
            o13.p pVar25 = new o13.p(lowerCase25, context.getString(R.string.lbl_minutes_per_mile));
            String string26 = context.getString(R.string.lbl_minute_per_km_without_period);
            string26.getClass();
            String lowerCase26 = string26.toLowerCase(locale);
            lowerCase26.getClass();
            o13.p pVar26 = new o13.p(lowerCase26, context.getString(R.string.lbl_minutes_per_kilometer));
            String string27 = context.getString(R.string.common_abbrev_watts_string);
            string27.getClass();
            String lowerCase27 = string27.toLowerCase(locale);
            lowerCase27.getClass();
            o13.p pVar27 = new o13.p(lowerCase27, context.getString(R.string.common_watts));
            String string28 = context.getString(R.string.lbl_vo2_max_running);
            string28.getClass();
            String lowerCase28 = string28.toLowerCase(locale);
            lowerCase28.getClass();
            o13.p pVar28 = new o13.p(lowerCase28, context.getString(R.string.lbl_vo2_max_detail));
            String string29 = context.getString(R.string.lbl_weight_characteristic_bmi);
            string29.getClass();
            String lowerCase29 = string29.toLowerCase(locale);
            lowerCase29.getClass();
            o13.p pVar29 = new o13.p(lowerCase29, context.getString(R.string.title_body_mass_index));
            String string30 = context.getString(R.string.lbl_user_level_points_abbr);
            string30.getClass();
            String lowerCase30 = string30.toLowerCase(locale);
            lowerCase30.getClass();
            o13.p pVar30 = new o13.p(lowerCase30, context.getString(R.string.lbl_points));
            String string31 = context.getString(R.string.lbl_vo2_max_cycling);
            string31.getClass();
            String lowerCase31 = string31.toLowerCase(locale);
            lowerCase31.getClass();
            o13.p pVar31 = new o13.p(lowerCase31, "maximum cycling volume oxygen");
            String string32 = context.getString(R.string.lbl_abbreviated_standard_deviation_between_heart_beats);
            string32.getClass();
            String lowerCase32 = string32.toLowerCase(locale);
            lowerCase32.getClass();
            o13.p pVar32 = new o13.p(lowerCase32, "Standard deviation of all the R-R intervals");
            String string33 = context.getString(R.string.lbl_abbreviated_mean_square_successive_heart_beats);
            string33.getClass();
            String lowerCase33 = string33.toLowerCase(locale);
            lowerCase33.getClass();
            o13.p pVar33 = new o13.p(lowerCase33, "The root mean square of successive differences between normal heartbeats");
            o13.p pVar34 = new o13.p("iuds.", "I U Ds.");
            String lowerCase34 = "VO2".toLowerCase(locale);
            lowerCase34.getClass();
            HashMap<String, String> mapD = u0.d(pVar, pVar2, pVar3, pVar4, pVar5, pVar6, pVar7, pVar8, pVar9, pVar10, pVar11, pVar12, pVar13, pVar14, pVar15, pVar16, pVar17, pVar18, pVar19, pVar20, pVar21, pVar22, pVar23, pVar24, pVar25, pVar26, pVar27, pVar28, pVar29, pVar30, pVar31, pVar32, pVar33, pVar34, new o13.p(lowerCase34, "Volume oxygen"));
            bVar.getClass();
            com.garmin.realtimesettings.app.initialization.b.f52595g = mapD;
        } catch (Exception e4) {
            cx2.h hVarE = e();
            e4.getLocalizedMessage();
            hVarE.getClass();
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(String str, String str2, v13.c cVar) {
        o oVar;
        if (cVar instanceof o) {
            oVar = (o) cVar;
            int i14 = oVar.f67001c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                oVar.f67001c = i14 - Integer.MIN_VALUE;
            } else {
                oVar = new o(this, cVar);
            }
        } else {
            oVar = new o(this, cVar);
        }
        Object objL = oVar.f66999a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = oVar.f67001c;
        if (i15 == 0) {
            o13.r.b(objL);
            i1 i1Var = (i1) da2.d.b().getCapability(str, i1.class);
            if (i1Var == null) {
                vb.h.z("Couldn't get handler");
                return null;
            }
            oVar.f67001c = 1;
            objL = i1Var.l(str2, oVar);
            if (objL == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objL);
        }
        jw2.e eVar = (jw2.e) objL;
        String str3 = eVar != null ? eVar.f101382b : null;
        f67058a.getClass();
        e().getClass();
        return str3;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0317  */
    /* JADX WARN: Code duplicated, block: B:106:0x0356  */
    /* JADX WARN: Code duplicated, block: B:108:0x0359 A[PHI: r1 r4 r10 r13 r14
      0x0359: PHI (r1v13 ex2.q) = (r1v8 ex2.q), (r1v14 ex2.q) binds: [B:90:0x02b0, B:107:0x0357] A[DONT_GENERATE, DONT_INLINE]
      0x0359: PHI (r4v20 float) = (r4v14 float), (r4v21 float) binds: [B:90:0x02b0, B:107:0x0357] A[DONT_GENERATE, DONT_INLINE]
      0x0359: PHI (r10v23 long) = (r10v17 long), (r10v24 long) binds: [B:90:0x02b0, B:107:0x0357] A[DONT_GENERATE, DONT_INLINE]
      0x0359: PHI (r13v10 android.content.Context) = (r13v5 android.content.Context), (r13v11 android.content.Context) binds: [B:90:0x02b0, B:107:0x0357] A[DONT_GENERATE, DONT_INLINE]
      0x0359: PHI (r14v15 kotlin.jvm.internal.r0) = (r14v12 kotlin.jvm.internal.r0), (r14v16 kotlin.jvm.internal.r0) binds: [B:90:0x02b0, B:107:0x0357] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:109:0x0363  */
    /* JADX WARN: Code duplicated, block: B:51:0x0140  */
    /* JADX WARN: Code duplicated, block: B:54:0x0153  */
    /* JADX WARN: Code duplicated, block: B:57:0x0158  */
    /* JADX WARN: Code duplicated, block: B:61:0x0181  */
    /* JADX WARN: Code duplicated, block: B:64:0x0198  */
    /* JADX WARN: Code duplicated, block: B:67:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:70:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:75:0x0203  */
    /* JADX WARN: Code duplicated, block: B:78:0x0235  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:80:0x023d  */
    /* JADX WARN: Code duplicated, block: B:82:0x0272  */
    /* JADX WARN: Code duplicated, block: B:83:0x0274  */
    /* JADX WARN: Code duplicated, block: B:86:0x0281  */
    /* JADX WARN: Code duplicated, block: B:89:0x02ae A[PHI: r0 r1 r4 r5 r10 r13 r14
      0x02ae: PHI (r0v53 java.lang.Object) = (r0v41 java.lang.Object), (r0v1 java.lang.Object) binds: [B:87:0x02aa, B:15:0x0071] A[DONT_GENERATE, DONT_INLINE]
      0x02ae: PHI (r1v8 ex2.q) = (r1v1 ex2.q), (r1v9 ex2.q) binds: [B:87:0x02aa, B:15:0x0071] A[DONT_GENERATE, DONT_INLINE]
      0x02ae: PHI (r4v14 float) = (r4v8 float), (r4v15 float) binds: [B:87:0x02aa, B:15:0x0071] A[DONT_GENERATE, DONT_INLINE]
      0x02ae: PHI (r5v9 ex2.w) = (r5v2 ex2.w), (r5v15 ex2.w) binds: [B:87:0x02aa, B:15:0x0071] A[DONT_GENERATE, DONT_INLINE]
      0x02ae: PHI (r10v17 long) = (r10v11 long), (r10v19 long) binds: [B:87:0x02aa, B:15:0x0071] A[DONT_GENERATE, DONT_INLINE]
      0x02ae: PHI (r13v5 android.content.Context) = (r13v2 android.content.Context), (r13v6 android.content.Context) binds: [B:87:0x02aa, B:15:0x0071] A[DONT_GENERATE, DONT_INLINE]
      0x02ae: PHI (r14v12 kotlin.jvm.internal.r0) = (r14v9 kotlin.jvm.internal.r0), (r14v13 kotlin.jvm.internal.r0) binds: [B:87:0x02aa, B:15:0x0071] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:91:0x02b2  */
    /* JADX WARN: Code duplicated, block: B:93:0x02b6  */
    /* JADX WARN: Code duplicated, block: B:95:0x02be  */
    /* JADX WARN: Code duplicated, block: B:96:0x02cc  */
    /* JADX WARN: Code duplicated, block: B:98:0x02da  */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x034d, code lost:
    
        if (ex2.w.f67058a.k(r22, r23, r6, r1) == r3) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0390, code lost:
    
        if (j(r22, r10, r0, r1) == r3) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x01f9, code lost:
    
        if (r0 == r3) goto L112;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(Context context, long j8, String str, String str2, String str3, v13.c cVar) throws Throwable {
        q qVar;
        r0 r0Var;
        Context context2;
        long j14;
        String str4;
        r0 r0Var2;
        Object bVar;
        Throwable thB;
        String str5;
        T t7;
        Context context3;
        String str6;
        long j15;
        float fFloatValue;
        q qVar2;
        w wVar;
        boolean z14;
        String str7;
        long j16;
        String str8;
        Context context4;
        r0 r0Var3;
        float fFloatValue2;
        Context context5;
        String str9;
        Context context6;
        long j17;
        r0 r0Var4;
        Context context7;
        a aVar;
        Float f14;
        Unit unit;
        float fFloatValue3;
        String str10;
        String str11;
        float f15;
        int i14;
        int i15;
        r0 r0Var5;
        Context context8;
        long j18;
        Context context9;
        if (cVar instanceof q) {
            qVar = (q) cVar;
            int i16 = qVar.f67031n;
            if ((i16 & Integer.MIN_VALUE) != 0) {
                qVar.f67031n = i16 - Integer.MIN_VALUE;
            } else {
                qVar = new q(this, cVar);
            }
        } else {
            qVar = new q(this, cVar);
        }
        Object objB = qVar.f67029l;
        Object obj = u13.a.COROUTINE_SUSPENDED;
        int i17 = qVar.f67031n;
        w wVar2 = f67058a;
        int i18 = 0;
        switch (i17) {
            case 0:
                o13.r.b(objB);
                cx2.h hVarE = e();
                hb2.h.d(hb2.h.a(context));
                hVarE.getClass();
                r0Var = new r0();
                try {
                    int i19 = o13.q.f128596b;
                    context2 = context;
                    try {
                        qVar.f67018a = context2;
                        str4 = str2;
                        try {
                            qVar.f67019b = str4;
                            qVar.f67020c = r0Var;
                            qVar.f67021d = null;
                            qVar.f67022e = r0Var;
                            j14 = j8;
                            try {
                                qVar.f67023f = j14;
                                qVar.f67024g = 0;
                                qVar.f67031n = 1;
                                objB = b(str, str3, qVar);
                                if (objB != obj) {
                                    r0Var2 = r0Var;
                                    try {
                                        bVar = (String) objB;
                                        int i24 = o13.q.f128596b;
                                    } catch (Throwable th3) {
                                        th = th3;
                                        int i25 = o13.q.f128596b;
                                        bVar = new o13.q.b(th);
                                    }
                                    thB = o13.q.b(bVar);
                                    if (thB != null) {
                                        wVar2.getClass();
                                        cx2.h hVarE2 = e();
                                        thB.toString();
                                        Logger logger = cx2.h.f56678c;
                                        hVarE2.getClass();
                                    }
                                    if (bVar instanceof o13.q.b) {
                                        bVar = null;
                                    }
                                    str5 = (String) bVar;
                                    t7 = str5;
                                    if (str5 == null) {
                                        t7 = "";
                                    }
                                    r0Var.f105810a = t7;
                                    String str12 = (String) r0Var2.f105810a;
                                    qVar.f67018a = context2;
                                    qVar.f67019b = str4;
                                    qVar.f67020c = r0Var2;
                                    qVar.f67021d = null;
                                    qVar.f67022e = null;
                                    qVar.f67023f = j14;
                                    qVar.f67031n = 2;
                                    objB = f(context2, j14, str12, qVar);
                                    if (objB != obj) {
                                        long j19 = j14;
                                        context3 = context2;
                                        str6 = str4;
                                        j15 = j19;
                                        fFloatValue = ((Number) objB).floatValue();
                                        e().getClass();
                                        if (fFloatValue >= 0.0f) {
                                            qVar2 = qVar;
                                            e().getClass();
                                            wVar = wVar2;
                                            if (System.currentTimeMillis() - context3.getSharedPreferences(context3.getString(R.string.key_rts_shared_preference_context), 0).getLong(context3.getString(R.string.key_string_translation_last_checked_in, String.valueOf(j15)), -1L) > 86400000) {
                                                z14 = true;
                                            } else {
                                                z14 = false;
                                            }
                                            wVar.getClass();
                                            e().getClass();
                                            if (z14) {
                                                e().getClass();
                                                String str13 = (String) r0Var2.f105810a;
                                                qVar2.f67018a = context3;
                                                qVar2.f67019b = null;
                                                qVar2.f67020c = null;
                                                qVar2.f67021d = null;
                                                qVar2.f67022e = null;
                                                qVar2.f67023f = j15;
                                                qVar2.f67027j = fFloatValue;
                                                qVar2.f67031n = 9;
                                                Context context10 = context3;
                                                context9 = context10;
                                            } else {
                                                String str14 = (String) r0Var2.f105810a;
                                                qVar2.f67018a = context3;
                                                qVar2.f67019b = null;
                                                qVar2.f67020c = r0Var2;
                                                qVar2.f67023f = j15;
                                                qVar2.f67027j = fFloatValue;
                                                qVar2.f67031n = 6;
                                                objB = ge1.b.Y(new p(str6, context3, j15, str14, null), qVar2);
                                                if (objB != obj) {
                                                    aVar = (a) objB;
                                                    if (aVar == null) {
                                                        f14 = aVar.f66930a;
                                                        if (f14 == null) {
                                                            unit = null;
                                                            if (unit == null) {
                                                                cx2.h hVarE3 = e();
                                                                Logger logger2 = cx2.h.f56678c;
                                                                hVarE3.getClass();
                                                            }
                                                            String str15 = (String) r0Var2.f105810a;
                                                            qVar2.f67018a = context3;
                                                            qVar2.f67019b = null;
                                                            qVar2.f67020c = null;
                                                            qVar2.f67021d = null;
                                                            qVar2.f67022e = null;
                                                            qVar2.f67023f = j15;
                                                            qVar2.f67027j = fFloatValue;
                                                            qVar2.f67031n = 9;
                                                            Context context11 = context3;
                                                            context9 = context11;
                                                        } else {
                                                            fFloatValue3 = f14.floatValue();
                                                            if (fFloatValue != fFloatValue3) {
                                                                wVar.getClass();
                                                                e().getClass();
                                                                str10 = aVar.f66931b;
                                                                if (str10 == null) {
                                                                    unit = null;
                                                                    if (unit == null) {
                                                                        cx2.h hVarE4 = e();
                                                                        Logger logger3 = cx2.h.f56678c;
                                                                        hVarE4.getClass();
                                                                    }
                                                                    String str16 = (String) r0Var2.f105810a;
                                                                    qVar2.f67018a = context3;
                                                                    qVar2.f67019b = null;
                                                                    qVar2.f67020c = null;
                                                                    qVar2.f67021d = null;
                                                                    qVar2.f67022e = null;
                                                                    qVar2.f67023f = j15;
                                                                    qVar2.f67027j = fFloatValue;
                                                                    qVar2.f67031n = 9;
                                                                    Context context12 = context3;
                                                                    context9 = context12;
                                                                } else {
                                                                    str11 = (String) r0Var2.f105810a;
                                                                    qVar2.f67018a = context3;
                                                                    qVar2.f67019b = null;
                                                                    qVar2.f67020c = r0Var2;
                                                                    qVar2.f67021d = null;
                                                                    qVar2.f67022e = null;
                                                                    qVar2.f67023f = j15;
                                                                    qVar2.f67027j = fFloatValue;
                                                                    qVar2.f67024g = 0;
                                                                    qVar2.f67028k = fFloatValue3;
                                                                    qVar2.f67025h = 0;
                                                                    qVar2.f67026i = 0;
                                                                    qVar2.f67031n = 7;
                                                                    x53.c cVar2 = s0.f129406a;
                                                                    if (ge1.b.e0(x53.b.f189152a, new n(str10, context3, j15, str11, null), qVar2) != obj) {
                                                                        f15 = fFloatValue3;
                                                                        i14 = 0;
                                                                        i15 = 0;
                                                                        r0Var5 = r0Var2;
                                                                        String str17 = (String) r0Var5.f105810a;
                                                                        qVar2.f67018a = context3;
                                                                        qVar2.f67019b = null;
                                                                        qVar2.f67020c = r0Var5;
                                                                        qVar2.f67021d = null;
                                                                        qVar2.f67022e = null;
                                                                        qVar2.f67023f = j15;
                                                                        qVar2.f67027j = fFloatValue;
                                                                        qVar2.f67024g = i18;
                                                                        qVar2.f67028k = f15;
                                                                        qVar2.f67025h = i14;
                                                                        qVar2.f67026i = i15;
                                                                        qVar2.f67031n = 8;
                                                                        long j24 = j15;
                                                                        Context context13 = context3;
                                                                        context8 = context13;
                                                                        j18 = j24;
                                                                    }
                                                                }
                                                            } else {
                                                                wVar.getClass();
                                                                e().getClass();
                                                                unit = Unit.INSTANCE;
                                                                if (unit == null) {
                                                                    cx2.h hVarE5 = e();
                                                                    Logger logger4 = cx2.h.f56678c;
                                                                    hVarE5.getClass();
                                                                }
                                                                String str18 = (String) r0Var2.f105810a;
                                                                qVar2.f67018a = context3;
                                                                qVar2.f67019b = null;
                                                                qVar2.f67020c = null;
                                                                qVar2.f67021d = null;
                                                                qVar2.f67022e = null;
                                                                qVar2.f67023f = j15;
                                                                qVar2.f67027j = fFloatValue;
                                                                qVar2.f67031n = 9;
                                                                Context context14 = context3;
                                                                context9 = context14;
                                                            }
                                                        }
                                                    } else {
                                                        cx2.h hVarE6 = e();
                                                        Logger logger5 = cx2.h.f56678c;
                                                        hVarE6.getClass();
                                                        String str19 = (String) r0Var2.f105810a;
                                                        qVar2.f67018a = context3;
                                                        qVar2.f67019b = null;
                                                        qVar2.f67020c = null;
                                                        qVar2.f67021d = null;
                                                        qVar2.f67022e = null;
                                                        qVar2.f67023f = j15;
                                                        qVar2.f67027j = fFloatValue;
                                                        qVar2.f67031n = 9;
                                                        Context context15 = context3;
                                                        context9 = context15;
                                                    }
                                                }
                                            }
                                        } else {
                                            String strD = hb2.h.d(hb2.h.a(context3));
                                            qVar.f67018a = context3;
                                            qVar.f67019b = str6;
                                            qVar.f67020c = r0Var2;
                                            qVar.f67021d = strD;
                                            qVar.f67023f = j15;
                                            qVar.f67027j = fFloatValue;
                                            qVar.f67031n = 3;
                                            objB = f(context3, j15, strD, qVar);
                                            str7 = strD;
                                            if (objB != obj) {
                                                j16 = j15;
                                                str8 = str6;
                                                context4 = context3;
                                                r0Var3 = r0Var2;
                                                fFloatValue2 = ((Number) objB).floatValue();
                                                if (fFloatValue2 >= 0.0f) {
                                                    qVar2 = qVar;
                                                    context5 = context4;
                                                    e().getClass();
                                                    str9 = (String) r0Var3.f105810a;
                                                    qVar2.f67018a = context5;
                                                    qVar2.f67019b = null;
                                                    qVar2.f67020c = r0Var3;
                                                    qVar2.f67021d = null;
                                                    qVar2.f67023f = j16;
                                                    qVar2.f67027j = fFloatValue;
                                                    qVar2.f67028k = fFloatValue2;
                                                    qVar2.f67031n = 5;
                                                    if (g(context5, j16, str8, str9, qVar2) != obj) {
                                                        context6 = context5;
                                                        j17 = j16;
                                                        r0Var4 = r0Var3;
                                                        j15 = j17;
                                                        r0Var2 = r0Var4;
                                                        context3 = context6;
                                                        String str110 = (String) r0Var2.f105810a;
                                                        qVar2.f67018a = context3;
                                                        qVar2.f67019b = null;
                                                        qVar2.f67020c = null;
                                                        qVar2.f67021d = null;
                                                        qVar2.f67022e = null;
                                                        qVar2.f67023f = j15;
                                                        qVar2.f67027j = fFloatValue;
                                                        qVar2.f67031n = 9;
                                                        Context context16 = context3;
                                                        context9 = context16;
                                                    }
                                                } else {
                                                    e().getClass();
                                                    qVar.f67018a = context4;
                                                    qVar.f67019b = null;
                                                    qVar.f67020c = null;
                                                    qVar.f67021d = null;
                                                    qVar.f67023f = j16;
                                                    qVar.f67027j = fFloatValue;
                                                    qVar.f67028k = fFloatValue2;
                                                    qVar.f67031n = 4;
                                                    Context context17 = context4;
                                                    Object objJ = j(context17, j16, str7, qVar);
                                                    context7 = context17;
                                                }
                                            }
                                        }
                                    }
                                }
                            } catch (Throwable th4) {
                                th = th4;
                                r0Var2 = r0Var;
                                int i26 = o13.q.f128596b;
                                bVar = new o13.q.b(th);
                                thB = o13.q.b(bVar);
                                if (thB != null) {
                                    wVar2.getClass();
                                    cx2.h hVarE7 = e();
                                    thB.toString();
                                    Logger logger6 = cx2.h.f56678c;
                                    hVarE7.getClass();
                                }
                                if (bVar instanceof o13.q.b) {
                                    bVar = null;
                                }
                                str5 = (String) bVar;
                                t7 = str5;
                                if (str5 == null) {
                                    t7 = "";
                                }
                                r0Var.f105810a = t7;
                                String str111 = (String) r0Var2.f105810a;
                                qVar.f67018a = context2;
                                qVar.f67019b = str4;
                                qVar.f67020c = r0Var2;
                                qVar.f67021d = null;
                                qVar.f67022e = null;
                                qVar.f67023f = j14;
                                qVar.f67031n = 2;
                                objB = f(context2, j14, str111, qVar);
                                if (objB != obj) {
                                    long j110 = j14;
                                    context3 = context2;
                                    str6 = str4;
                                    j15 = j110;
                                    fFloatValue = ((Number) objB).floatValue();
                                    e().getClass();
                                    if (fFloatValue >= 0.0f) {
                                        qVar2 = qVar;
                                        e().getClass();
                                        wVar = wVar2;
                                        if (System.currentTimeMillis() - context3.getSharedPreferences(context3.getString(R.string.key_rts_shared_preference_context), 0).getLong(context3.getString(R.string.key_string_translation_last_checked_in, String.valueOf(j15)), -1L) > 86400000) {
                                            z14 = true;
                                        } else {
                                            z14 = false;
                                        }
                                        wVar.getClass();
                                        e().getClass();
                                        if (z14) {
                                            e().getClass();
                                            String str112 = (String) r0Var2.f105810a;
                                            qVar2.f67018a = context3;
                                            qVar2.f67019b = null;
                                            qVar2.f67020c = null;
                                            qVar2.f67021d = null;
                                            qVar2.f67022e = null;
                                            qVar2.f67023f = j15;
                                            qVar2.f67027j = fFloatValue;
                                            qVar2.f67031n = 9;
                                            Context context18 = context3;
                                            context9 = context18;
                                        } else {
                                            String str113 = (String) r0Var2.f105810a;
                                            qVar2.f67018a = context3;
                                            qVar2.f67019b = null;
                                            qVar2.f67020c = r0Var2;
                                            qVar2.f67023f = j15;
                                            qVar2.f67027j = fFloatValue;
                                            qVar2.f67031n = 6;
                                            objB = ge1.b.Y(new p(str6, context3, j15, str113, null), qVar2);
                                            if (objB != obj) {
                                                aVar = (a) objB;
                                                if (aVar == null) {
                                                    f14 = aVar.f66930a;
                                                    if (f14 == null) {
                                                        unit = null;
                                                        if (unit == null) {
                                                            cx2.h hVarE8 = e();
                                                            Logger logger7 = cx2.h.f56678c;
                                                            hVarE8.getClass();
                                                        }
                                                        String str114 = (String) r0Var2.f105810a;
                                                        qVar2.f67018a = context3;
                                                        qVar2.f67019b = null;
                                                        qVar2.f67020c = null;
                                                        qVar2.f67021d = null;
                                                        qVar2.f67022e = null;
                                                        qVar2.f67023f = j15;
                                                        qVar2.f67027j = fFloatValue;
                                                        qVar2.f67031n = 9;
                                                        Context context19 = context3;
                                                        context9 = context19;
                                                    } else {
                                                        fFloatValue3 = f14.floatValue();
                                                        if (fFloatValue != fFloatValue3) {
                                                            wVar.getClass();
                                                            e().getClass();
                                                            str10 = aVar.f66931b;
                                                            if (str10 == null) {
                                                                unit = null;
                                                                if (unit == null) {
                                                                    cx2.h hVarE9 = e();
                                                                    Logger logger8 = cx2.h.f56678c;
                                                                    hVarE9.getClass();
                                                                }
                                                                String str115 = (String) r0Var2.f105810a;
                                                                qVar2.f67018a = context3;
                                                                qVar2.f67019b = null;
                                                                qVar2.f67020c = null;
                                                                qVar2.f67021d = null;
                                                                qVar2.f67022e = null;
                                                                qVar2.f67023f = j15;
                                                                qVar2.f67027j = fFloatValue;
                                                                qVar2.f67031n = 9;
                                                                Context context110 = context3;
                                                                context9 = context110;
                                                            } else {
                                                                str11 = (String) r0Var2.f105810a;
                                                                qVar2.f67018a = context3;
                                                                qVar2.f67019b = null;
                                                                qVar2.f67020c = r0Var2;
                                                                qVar2.f67021d = null;
                                                                qVar2.f67022e = null;
                                                                qVar2.f67023f = j15;
                                                                qVar2.f67027j = fFloatValue;
                                                                qVar2.f67024g = 0;
                                                                qVar2.f67028k = fFloatValue3;
                                                                qVar2.f67025h = 0;
                                                                qVar2.f67026i = 0;
                                                                qVar2.f67031n = 7;
                                                                x53.c cVar3 = s0.f129406a;
                                                                if (ge1.b.e0(x53.b.f189152a, new n(str10, context3, j15, str11, null), qVar2) != obj) {
                                                                    f15 = fFloatValue3;
                                                                    i14 = 0;
                                                                    i15 = 0;
                                                                    r0Var5 = r0Var2;
                                                                    String str116 = (String) r0Var5.f105810a;
                                                                    qVar2.f67018a = context3;
                                                                    qVar2.f67019b = null;
                                                                    qVar2.f67020c = r0Var5;
                                                                    qVar2.f67021d = null;
                                                                    qVar2.f67022e = null;
                                                                    qVar2.f67023f = j15;
                                                                    qVar2.f67027j = fFloatValue;
                                                                    qVar2.f67024g = i18;
                                                                    qVar2.f67028k = f15;
                                                                    qVar2.f67025h = i14;
                                                                    qVar2.f67026i = i15;
                                                                    qVar2.f67031n = 8;
                                                                    long j25 = j15;
                                                                    Context context111 = context3;
                                                                    context8 = context111;
                                                                    j18 = j25;
                                                                }
                                                            }
                                                        } else {
                                                            wVar.getClass();
                                                            e().getClass();
                                                            unit = Unit.INSTANCE;
                                                            if (unit == null) {
                                                                cx2.h hVarE10 = e();
                                                                Logger logger9 = cx2.h.f56678c;
                                                                hVarE10.getClass();
                                                            }
                                                            String str117 = (String) r0Var2.f105810a;
                                                            qVar2.f67018a = context3;
                                                            qVar2.f67019b = null;
                                                            qVar2.f67020c = null;
                                                            qVar2.f67021d = null;
                                                            qVar2.f67022e = null;
                                                            qVar2.f67023f = j15;
                                                            qVar2.f67027j = fFloatValue;
                                                            qVar2.f67031n = 9;
                                                            Context context112 = context3;
                                                            context9 = context112;
                                                        }
                                                    }
                                                } else {
                                                    cx2.h hVarE11 = e();
                                                    Logger logger10 = cx2.h.f56678c;
                                                    hVarE11.getClass();
                                                    String str118 = (String) r0Var2.f105810a;
                                                    qVar2.f67018a = context3;
                                                    qVar2.f67019b = null;
                                                    qVar2.f67020c = null;
                                                    qVar2.f67021d = null;
                                                    qVar2.f67022e = null;
                                                    qVar2.f67023f = j15;
                                                    qVar2.f67027j = fFloatValue;
                                                    qVar2.f67031n = 9;
                                                    Context context113 = context3;
                                                    context9 = context113;
                                                }
                                            }
                                        }
                                    } else {
                                        String strD2 = hb2.h.d(hb2.h.a(context3));
                                        qVar.f67018a = context3;
                                        qVar.f67019b = str6;
                                        qVar.f67020c = r0Var2;
                                        qVar.f67021d = strD2;
                                        qVar.f67023f = j15;
                                        qVar.f67027j = fFloatValue;
                                        qVar.f67031n = 3;
                                        objB = f(context3, j15, strD2, qVar);
                                        str7 = strD2;
                                        if (objB != obj) {
                                            j16 = j15;
                                            str8 = str6;
                                            context4 = context3;
                                            r0Var3 = r0Var2;
                                            fFloatValue2 = ((Number) objB).floatValue();
                                            if (fFloatValue2 >= 0.0f) {
                                                qVar2 = qVar;
                                                context5 = context4;
                                                e().getClass();
                                                str9 = (String) r0Var3.f105810a;
                                                qVar2.f67018a = context5;
                                                qVar2.f67019b = null;
                                                qVar2.f67020c = r0Var3;
                                                qVar2.f67021d = null;
                                                qVar2.f67023f = j16;
                                                qVar2.f67027j = fFloatValue;
                                                qVar2.f67028k = fFloatValue2;
                                                qVar2.f67031n = 5;
                                                if (g(context5, j16, str8, str9, qVar2) != obj) {
                                                    context6 = context5;
                                                    j17 = j16;
                                                    r0Var4 = r0Var3;
                                                    j15 = j17;
                                                    r0Var2 = r0Var4;
                                                    context3 = context6;
                                                    String str119 = (String) r0Var2.f105810a;
                                                    qVar2.f67018a = context3;
                                                    qVar2.f67019b = null;
                                                    qVar2.f67020c = null;
                                                    qVar2.f67021d = null;
                                                    qVar2.f67022e = null;
                                                    qVar2.f67023f = j15;
                                                    qVar2.f67027j = fFloatValue;
                                                    qVar2.f67031n = 9;
                                                    Context context114 = context3;
                                                    context9 = context114;
                                                }
                                            } else {
                                                e().getClass();
                                                qVar.f67018a = context4;
                                                qVar.f67019b = null;
                                                qVar.f67020c = null;
                                                qVar.f67021d = null;
                                                qVar.f67023f = j16;
                                                qVar.f67027j = fFloatValue;
                                                qVar.f67028k = fFloatValue2;
                                                qVar.f67031n = 4;
                                                Context context115 = context4;
                                                Object objJ2 = j(context115, j16, str7, qVar);
                                                context7 = context115;
                                            }
                                        }
                                    }
                                    break;
                                }
                                return obj;
                            }
                        } catch (Throwable th5) {
                            th = th5;
                            j14 = j8;
                        }
                    } catch (Throwable th6) {
                        th = th6;
                        j14 = j8;
                        str4 = str2;
                        r0Var2 = r0Var;
                        int i27 = o13.q.f128596b;
                        bVar = new o13.q.b(th);
                        thB = o13.q.b(bVar);
                        if (thB != null) {
                            wVar2.getClass();
                            cx2.h hVarE12 = e();
                            thB.toString();
                            Logger logger11 = cx2.h.f56678c;
                            hVarE12.getClass();
                        }
                        if (bVar instanceof o13.q.b) {
                            bVar = null;
                        }
                        str5 = (String) bVar;
                        t7 = str5;
                        if (str5 == null) {
                            t7 = "";
                        }
                        r0Var.f105810a = t7;
                        String str1110 = (String) r0Var2.f105810a;
                        qVar.f67018a = context2;
                        qVar.f67019b = str4;
                        qVar.f67020c = r0Var2;
                        qVar.f67021d = null;
                        qVar.f67022e = null;
                        qVar.f67023f = j14;
                        qVar.f67031n = 2;
                        objB = f(context2, j14, str1110, qVar);
                        if (objB != obj) {
                            long j111 = j14;
                            context3 = context2;
                            str6 = str4;
                            j15 = j111;
                            fFloatValue = ((Number) objB).floatValue();
                            e().getClass();
                            if (fFloatValue >= 0.0f) {
                                qVar2 = qVar;
                                e().getClass();
                                wVar = wVar2;
                                if (System.currentTimeMillis() - context3.getSharedPreferences(context3.getString(R.string.key_rts_shared_preference_context), 0).getLong(context3.getString(R.string.key_string_translation_last_checked_in, String.valueOf(j15)), -1L) > 86400000) {
                                    z14 = true;
                                } else {
                                    z14 = false;
                                }
                                wVar.getClass();
                                e().getClass();
                                if (z14) {
                                    e().getClass();
                                    String str1111 = (String) r0Var2.f105810a;
                                    qVar2.f67018a = context3;
                                    qVar2.f67019b = null;
                                    qVar2.f67020c = null;
                                    qVar2.f67021d = null;
                                    qVar2.f67022e = null;
                                    qVar2.f67023f = j15;
                                    qVar2.f67027j = fFloatValue;
                                    qVar2.f67031n = 9;
                                    Context context116 = context3;
                                    context9 = context116;
                                } else {
                                    String str1112 = (String) r0Var2.f105810a;
                                    qVar2.f67018a = context3;
                                    qVar2.f67019b = null;
                                    qVar2.f67020c = r0Var2;
                                    qVar2.f67023f = j15;
                                    qVar2.f67027j = fFloatValue;
                                    qVar2.f67031n = 6;
                                    objB = ge1.b.Y(new p(str6, context3, j15, str1112, null), qVar2);
                                    if (objB != obj) {
                                        aVar = (a) objB;
                                        if (aVar == null) {
                                            f14 = aVar.f66930a;
                                            if (f14 == null) {
                                                unit = null;
                                                if (unit == null) {
                                                    cx2.h hVarE13 = e();
                                                    Logger logger12 = cx2.h.f56678c;
                                                    hVarE13.getClass();
                                                }
                                                String str1113 = (String) r0Var2.f105810a;
                                                qVar2.f67018a = context3;
                                                qVar2.f67019b = null;
                                                qVar2.f67020c = null;
                                                qVar2.f67021d = null;
                                                qVar2.f67022e = null;
                                                qVar2.f67023f = j15;
                                                qVar2.f67027j = fFloatValue;
                                                qVar2.f67031n = 9;
                                                Context context117 = context3;
                                                context9 = context117;
                                            } else {
                                                fFloatValue3 = f14.floatValue();
                                                if (fFloatValue != fFloatValue3) {
                                                    wVar.getClass();
                                                    e().getClass();
                                                    str10 = aVar.f66931b;
                                                    if (str10 == null) {
                                                        unit = null;
                                                        if (unit == null) {
                                                            cx2.h hVarE14 = e();
                                                            Logger logger13 = cx2.h.f56678c;
                                                            hVarE14.getClass();
                                                        }
                                                        String str1114 = (String) r0Var2.f105810a;
                                                        qVar2.f67018a = context3;
                                                        qVar2.f67019b = null;
                                                        qVar2.f67020c = null;
                                                        qVar2.f67021d = null;
                                                        qVar2.f67022e = null;
                                                        qVar2.f67023f = j15;
                                                        qVar2.f67027j = fFloatValue;
                                                        qVar2.f67031n = 9;
                                                        Context context118 = context3;
                                                        context9 = context118;
                                                    } else {
                                                        str11 = (String) r0Var2.f105810a;
                                                        qVar2.f67018a = context3;
                                                        qVar2.f67019b = null;
                                                        qVar2.f67020c = r0Var2;
                                                        qVar2.f67021d = null;
                                                        qVar2.f67022e = null;
                                                        qVar2.f67023f = j15;
                                                        qVar2.f67027j = fFloatValue;
                                                        qVar2.f67024g = 0;
                                                        qVar2.f67028k = fFloatValue3;
                                                        qVar2.f67025h = 0;
                                                        qVar2.f67026i = 0;
                                                        qVar2.f67031n = 7;
                                                        x53.c cVar4 = s0.f129406a;
                                                        if (ge1.b.e0(x53.b.f189152a, new n(str10, context3, j15, str11, null), qVar2) != obj) {
                                                            f15 = fFloatValue3;
                                                            i14 = 0;
                                                            i15 = 0;
                                                            r0Var5 = r0Var2;
                                                            String str1115 = (String) r0Var5.f105810a;
                                                            qVar2.f67018a = context3;
                                                            qVar2.f67019b = null;
                                                            qVar2.f67020c = r0Var5;
                                                            qVar2.f67021d = null;
                                                            qVar2.f67022e = null;
                                                            qVar2.f67023f = j15;
                                                            qVar2.f67027j = fFloatValue;
                                                            qVar2.f67024g = i18;
                                                            qVar2.f67028k = f15;
                                                            qVar2.f67025h = i14;
                                                            qVar2.f67026i = i15;
                                                            qVar2.f67031n = 8;
                                                            long j26 = j15;
                                                            Context context119 = context3;
                                                            context8 = context119;
                                                            j18 = j26;
                                                        }
                                                    }
                                                } else {
                                                    wVar.getClass();
                                                    e().getClass();
                                                    unit = Unit.INSTANCE;
                                                    if (unit == null) {
                                                        cx2.h hVarE15 = e();
                                                        Logger logger14 = cx2.h.f56678c;
                                                        hVarE15.getClass();
                                                    }
                                                    String str1116 = (String) r0Var2.f105810a;
                                                    qVar2.f67018a = context3;
                                                    qVar2.f67019b = null;
                                                    qVar2.f67020c = null;
                                                    qVar2.f67021d = null;
                                                    qVar2.f67022e = null;
                                                    qVar2.f67023f = j15;
                                                    qVar2.f67027j = fFloatValue;
                                                    qVar2.f67031n = 9;
                                                    Context context1110 = context3;
                                                    context9 = context1110;
                                                }
                                            }
                                        } else {
                                            cx2.h hVarE16 = e();
                                            Logger logger15 = cx2.h.f56678c;
                                            hVarE16.getClass();
                                            String str1117 = (String) r0Var2.f105810a;
                                            qVar2.f67018a = context3;
                                            qVar2.f67019b = null;
                                            qVar2.f67020c = null;
                                            qVar2.f67021d = null;
                                            qVar2.f67022e = null;
                                            qVar2.f67023f = j15;
                                            qVar2.f67027j = fFloatValue;
                                            qVar2.f67031n = 9;
                                            Context context1111 = context3;
                                            context9 = context1111;
                                        }
                                    }
                                }
                            } else {
                                String strD3 = hb2.h.d(hb2.h.a(context3));
                                qVar.f67018a = context3;
                                qVar.f67019b = str6;
                                qVar.f67020c = r0Var2;
                                qVar.f67021d = strD3;
                                qVar.f67023f = j15;
                                qVar.f67027j = fFloatValue;
                                qVar.f67031n = 3;
                                objB = f(context3, j15, strD3, qVar);
                                str7 = strD3;
                                if (objB != obj) {
                                    j16 = j15;
                                    str8 = str6;
                                    context4 = context3;
                                    r0Var3 = r0Var2;
                                    fFloatValue2 = ((Number) objB).floatValue();
                                    if (fFloatValue2 >= 0.0f) {
                                        qVar2 = qVar;
                                        context5 = context4;
                                        e().getClass();
                                        str9 = (String) r0Var3.f105810a;
                                        qVar2.f67018a = context5;
                                        qVar2.f67019b = null;
                                        qVar2.f67020c = r0Var3;
                                        qVar2.f67021d = null;
                                        qVar2.f67023f = j16;
                                        qVar2.f67027j = fFloatValue;
                                        qVar2.f67028k = fFloatValue2;
                                        qVar2.f67031n = 5;
                                        if (g(context5, j16, str8, str9, qVar2) != obj) {
                                            context6 = context5;
                                            j17 = j16;
                                            r0Var4 = r0Var3;
                                            j15 = j17;
                                            r0Var2 = r0Var4;
                                            context3 = context6;
                                            String str1118 = (String) r0Var2.f105810a;
                                            qVar2.f67018a = context3;
                                            qVar2.f67019b = null;
                                            qVar2.f67020c = null;
                                            qVar2.f67021d = null;
                                            qVar2.f67022e = null;
                                            qVar2.f67023f = j15;
                                            qVar2.f67027j = fFloatValue;
                                            qVar2.f67031n = 9;
                                            Context context1112 = context3;
                                            context9 = context1112;
                                        }
                                    } else {
                                        e().getClass();
                                        qVar.f67018a = context4;
                                        qVar.f67019b = null;
                                        qVar.f67020c = null;
                                        qVar.f67021d = null;
                                        qVar.f67023f = j16;
                                        qVar.f67027j = fFloatValue;
                                        qVar.f67028k = fFloatValue2;
                                        qVar.f67031n = 4;
                                        Context context1113 = context4;
                                        Object objJ3 = j(context1113, j16, str7, qVar);
                                        context7 = context1113;
                                    }
                                }
                            }
                            break;
                        }
                        return obj;
                    }
                    break;
                } catch (Throwable th7) {
                    th = th7;
                    context2 = context;
                }
                return obj;
            case 1:
                long j27 = qVar.f67023f;
                r0Var = qVar.f67022e;
                r0 r0Var6 = qVar.f67020c;
                String str20 = qVar.f67019b;
                Context context20 = qVar.f67018a;
                try {
                    o13.r.b(objB);
                    r0Var2 = r0Var6;
                    str4 = str20;
                    j14 = j27;
                    context2 = context20;
                    bVar = (String) objB;
                    int i28 = o13.q.f128596b;
                    break;
                } catch (Throwable th8) {
                    th = th8;
                    r0Var2 = r0Var6;
                    str4 = str20;
                    j14 = j27;
                    context2 = context20;
                    int i29 = o13.q.f128596b;
                    bVar = new o13.q.b(th);
                    thB = o13.q.b(bVar);
                    if (thB != null) {
                        wVar2.getClass();
                        cx2.h hVarE17 = e();
                        thB.toString();
                        Logger logger16 = cx2.h.f56678c;
                        hVarE17.getClass();
                    }
                    if (bVar instanceof o13.q.b) {
                        bVar = null;
                    }
                    str5 = (String) bVar;
                    t7 = str5;
                    if (str5 == null) {
                        t7 = "";
                    }
                    r0Var.f105810a = t7;
                    String str1119 = (String) r0Var2.f105810a;
                    qVar.f67018a = context2;
                    qVar.f67019b = str4;
                    qVar.f67020c = r0Var2;
                    qVar.f67021d = null;
                    qVar.f67022e = null;
                    qVar.f67023f = j14;
                    qVar.f67031n = 2;
                    objB = f(context2, j14, str1119, qVar);
                    if (objB != obj) {
                        long j112 = j14;
                        context3 = context2;
                        str6 = str4;
                        j15 = j112;
                        fFloatValue = ((Number) objB).floatValue();
                        e().getClass();
                        if (fFloatValue >= 0.0f) {
                            qVar2 = qVar;
                            e().getClass();
                            wVar = wVar2;
                            if (System.currentTimeMillis() - context3.getSharedPreferences(context3.getString(R.string.key_rts_shared_preference_context), 0).getLong(context3.getString(R.string.key_string_translation_last_checked_in, String.valueOf(j15)), -1L) > 86400000) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            wVar.getClass();
                            e().getClass();
                            if (z14) {
                                e().getClass();
                                String str11110 = (String) r0Var2.f105810a;
                                qVar2.f67018a = context3;
                                qVar2.f67019b = null;
                                qVar2.f67020c = null;
                                qVar2.f67021d = null;
                                qVar2.f67022e = null;
                                qVar2.f67023f = j15;
                                qVar2.f67027j = fFloatValue;
                                qVar2.f67031n = 9;
                                Context context1114 = context3;
                                context9 = context1114;
                            } else {
                                String str11111 = (String) r0Var2.f105810a;
                                qVar2.f67018a = context3;
                                qVar2.f67019b = null;
                                qVar2.f67020c = r0Var2;
                                qVar2.f67023f = j15;
                                qVar2.f67027j = fFloatValue;
                                qVar2.f67031n = 6;
                                objB = ge1.b.Y(new p(str6, context3, j15, str11111, null), qVar2);
                                if (objB != obj) {
                                    aVar = (a) objB;
                                    if (aVar == null) {
                                        f14 = aVar.f66930a;
                                        if (f14 == null) {
                                            unit = null;
                                            if (unit == null) {
                                                cx2.h hVarE18 = e();
                                                Logger logger17 = cx2.h.f56678c;
                                                hVarE18.getClass();
                                            }
                                            String str11112 = (String) r0Var2.f105810a;
                                            qVar2.f67018a = context3;
                                            qVar2.f67019b = null;
                                            qVar2.f67020c = null;
                                            qVar2.f67021d = null;
                                            qVar2.f67022e = null;
                                            qVar2.f67023f = j15;
                                            qVar2.f67027j = fFloatValue;
                                            qVar2.f67031n = 9;
                                            Context context1115 = context3;
                                            context9 = context1115;
                                        } else {
                                            fFloatValue3 = f14.floatValue();
                                            if (fFloatValue != fFloatValue3) {
                                                wVar.getClass();
                                                e().getClass();
                                                str10 = aVar.f66931b;
                                                if (str10 == null) {
                                                    unit = null;
                                                    if (unit == null) {
                                                        cx2.h hVarE19 = e();
                                                        Logger logger18 = cx2.h.f56678c;
                                                        hVarE19.getClass();
                                                    }
                                                    String str11113 = (String) r0Var2.f105810a;
                                                    qVar2.f67018a = context3;
                                                    qVar2.f67019b = null;
                                                    qVar2.f67020c = null;
                                                    qVar2.f67021d = null;
                                                    qVar2.f67022e = null;
                                                    qVar2.f67023f = j15;
                                                    qVar2.f67027j = fFloatValue;
                                                    qVar2.f67031n = 9;
                                                    Context context1116 = context3;
                                                    context9 = context1116;
                                                } else {
                                                    str11 = (String) r0Var2.f105810a;
                                                    qVar2.f67018a = context3;
                                                    qVar2.f67019b = null;
                                                    qVar2.f67020c = r0Var2;
                                                    qVar2.f67021d = null;
                                                    qVar2.f67022e = null;
                                                    qVar2.f67023f = j15;
                                                    qVar2.f67027j = fFloatValue;
                                                    qVar2.f67024g = 0;
                                                    qVar2.f67028k = fFloatValue3;
                                                    qVar2.f67025h = 0;
                                                    qVar2.f67026i = 0;
                                                    qVar2.f67031n = 7;
                                                    x53.c cVar5 = s0.f129406a;
                                                    if (ge1.b.e0(x53.b.f189152a, new n(str10, context3, j15, str11, null), qVar2) != obj) {
                                                        f15 = fFloatValue3;
                                                        i14 = 0;
                                                        i15 = 0;
                                                        r0Var5 = r0Var2;
                                                        String str11114 = (String) r0Var5.f105810a;
                                                        qVar2.f67018a = context3;
                                                        qVar2.f67019b = null;
                                                        qVar2.f67020c = r0Var5;
                                                        qVar2.f67021d = null;
                                                        qVar2.f67022e = null;
                                                        qVar2.f67023f = j15;
                                                        qVar2.f67027j = fFloatValue;
                                                        qVar2.f67024g = i18;
                                                        qVar2.f67028k = f15;
                                                        qVar2.f67025h = i14;
                                                        qVar2.f67026i = i15;
                                                        qVar2.f67031n = 8;
                                                        long j28 = j15;
                                                        Context context1117 = context3;
                                                        context8 = context1117;
                                                        j18 = j28;
                                                    }
                                                }
                                            } else {
                                                wVar.getClass();
                                                e().getClass();
                                                unit = Unit.INSTANCE;
                                                if (unit == null) {
                                                    cx2.h hVarE110 = e();
                                                    Logger logger19 = cx2.h.f56678c;
                                                    hVarE110.getClass();
                                                }
                                                String str11115 = (String) r0Var2.f105810a;
                                                qVar2.f67018a = context3;
                                                qVar2.f67019b = null;
                                                qVar2.f67020c = null;
                                                qVar2.f67021d = null;
                                                qVar2.f67022e = null;
                                                qVar2.f67023f = j15;
                                                qVar2.f67027j = fFloatValue;
                                                qVar2.f67031n = 9;
                                                Context context1118 = context3;
                                                context9 = context1118;
                                            }
                                        }
                                    } else {
                                        cx2.h hVarE111 = e();
                                        Logger logger110 = cx2.h.f56678c;
                                        hVarE111.getClass();
                                        String str11116 = (String) r0Var2.f105810a;
                                        qVar2.f67018a = context3;
                                        qVar2.f67019b = null;
                                        qVar2.f67020c = null;
                                        qVar2.f67021d = null;
                                        qVar2.f67022e = null;
                                        qVar2.f67023f = j15;
                                        qVar2.f67027j = fFloatValue;
                                        qVar2.f67031n = 9;
                                        Context context1119 = context3;
                                        context9 = context1119;
                                    }
                                }
                            }
                        } else {
                            String strD4 = hb2.h.d(hb2.h.a(context3));
                            qVar.f67018a = context3;
                            qVar.f67019b = str6;
                            qVar.f67020c = r0Var2;
                            qVar.f67021d = strD4;
                            qVar.f67023f = j15;
                            qVar.f67027j = fFloatValue;
                            qVar.f67031n = 3;
                            objB = f(context3, j15, strD4, qVar);
                            str7 = strD4;
                            if (objB != obj) {
                                j16 = j15;
                                str8 = str6;
                                context4 = context3;
                                r0Var3 = r0Var2;
                                fFloatValue2 = ((Number) objB).floatValue();
                                if (fFloatValue2 >= 0.0f) {
                                    qVar2 = qVar;
                                    context5 = context4;
                                    e().getClass();
                                    str9 = (String) r0Var3.f105810a;
                                    qVar2.f67018a = context5;
                                    qVar2.f67019b = null;
                                    qVar2.f67020c = r0Var3;
                                    qVar2.f67021d = null;
                                    qVar2.f67023f = j16;
                                    qVar2.f67027j = fFloatValue;
                                    qVar2.f67028k = fFloatValue2;
                                    qVar2.f67031n = 5;
                                    if (g(context5, j16, str8, str9, qVar2) != obj) {
                                        context6 = context5;
                                        j17 = j16;
                                        r0Var4 = r0Var3;
                                        j15 = j17;
                                        r0Var2 = r0Var4;
                                        context3 = context6;
                                        String str11117 = (String) r0Var2.f105810a;
                                        qVar2.f67018a = context3;
                                        qVar2.f67019b = null;
                                        qVar2.f67020c = null;
                                        qVar2.f67021d = null;
                                        qVar2.f67022e = null;
                                        qVar2.f67023f = j15;
                                        qVar2.f67027j = fFloatValue;
                                        qVar2.f67031n = 9;
                                        Context context11110 = context3;
                                        context9 = context11110;
                                    }
                                } else {
                                    e().getClass();
                                    qVar.f67018a = context4;
                                    qVar.f67019b = null;
                                    qVar.f67020c = null;
                                    qVar.f67021d = null;
                                    qVar.f67023f = j16;
                                    qVar.f67027j = fFloatValue;
                                    qVar.f67028k = fFloatValue2;
                                    qVar.f67031n = 4;
                                    Context context11111 = context4;
                                    Object objJ4 = j(context11111, j16, str7, qVar);
                                    context7 = context11111;
                                }
                            }
                        }
                        break;
                    }
                    return obj;
                }
                thB = o13.q.b(bVar);
                if (thB != null) {
                    wVar2.getClass();
                    cx2.h hVarE112 = e();
                    thB.toString();
                    Logger logger111 = cx2.h.f56678c;
                    hVarE112.getClass();
                }
                if (bVar instanceof o13.q.b) {
                    bVar = null;
                }
                str5 = (String) bVar;
                t7 = str5;
                if (str5 == null) {
                    t7 = "";
                }
                r0Var.f105810a = t7;
                String str11118 = (String) r0Var2.f105810a;
                qVar.f67018a = context2;
                qVar.f67019b = str4;
                qVar.f67020c = r0Var2;
                qVar.f67021d = null;
                qVar.f67022e = null;
                qVar.f67023f = j14;
                qVar.f67031n = 2;
                objB = f(context2, j14, str11118, qVar);
                if (objB != obj) {
                    long j113 = j14;
                    context3 = context2;
                    str6 = str4;
                    j15 = j113;
                    fFloatValue = ((Number) objB).floatValue();
                    e().getClass();
                    if (fFloatValue >= 0.0f) {
                        qVar2 = qVar;
                        e().getClass();
                        wVar = wVar2;
                        if (System.currentTimeMillis() - context3.getSharedPreferences(context3.getString(R.string.key_rts_shared_preference_context), 0).getLong(context3.getString(R.string.key_string_translation_last_checked_in, String.valueOf(j15)), -1L) > 86400000) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        wVar.getClass();
                        e().getClass();
                        if (z14) {
                            e().getClass();
                            String str11119 = (String) r0Var2.f105810a;
                            qVar2.f67018a = context3;
                            qVar2.f67019b = null;
                            qVar2.f67020c = null;
                            qVar2.f67021d = null;
                            qVar2.f67022e = null;
                            qVar2.f67023f = j15;
                            qVar2.f67027j = fFloatValue;
                            qVar2.f67031n = 9;
                            Context context11112 = context3;
                            context9 = context11112;
                        } else {
                            String str111110 = (String) r0Var2.f105810a;
                            qVar2.f67018a = context3;
                            qVar2.f67019b = null;
                            qVar2.f67020c = r0Var2;
                            qVar2.f67023f = j15;
                            qVar2.f67027j = fFloatValue;
                            qVar2.f67031n = 6;
                            objB = ge1.b.Y(new p(str6, context3, j15, str111110, null), qVar2);
                            if (objB != obj) {
                                aVar = (a) objB;
                                if (aVar == null) {
                                    f14 = aVar.f66930a;
                                    if (f14 == null) {
                                        unit = null;
                                        if (unit == null) {
                                            cx2.h hVarE113 = e();
                                            Logger logger112 = cx2.h.f56678c;
                                            hVarE113.getClass();
                                        }
                                        String str111111 = (String) r0Var2.f105810a;
                                        qVar2.f67018a = context3;
                                        qVar2.f67019b = null;
                                        qVar2.f67020c = null;
                                        qVar2.f67021d = null;
                                        qVar2.f67022e = null;
                                        qVar2.f67023f = j15;
                                        qVar2.f67027j = fFloatValue;
                                        qVar2.f67031n = 9;
                                        Context context11113 = context3;
                                        context9 = context11113;
                                    } else {
                                        fFloatValue3 = f14.floatValue();
                                        if (fFloatValue != fFloatValue3) {
                                            wVar.getClass();
                                            e().getClass();
                                            str10 = aVar.f66931b;
                                            if (str10 == null) {
                                                unit = null;
                                                if (unit == null) {
                                                    cx2.h hVarE114 = e();
                                                    Logger logger113 = cx2.h.f56678c;
                                                    hVarE114.getClass();
                                                }
                                                String str111112 = (String) r0Var2.f105810a;
                                                qVar2.f67018a = context3;
                                                qVar2.f67019b = null;
                                                qVar2.f67020c = null;
                                                qVar2.f67021d = null;
                                                qVar2.f67022e = null;
                                                qVar2.f67023f = j15;
                                                qVar2.f67027j = fFloatValue;
                                                qVar2.f67031n = 9;
                                                Context context11114 = context3;
                                                context9 = context11114;
                                            } else {
                                                str11 = (String) r0Var2.f105810a;
                                                qVar2.f67018a = context3;
                                                qVar2.f67019b = null;
                                                qVar2.f67020c = r0Var2;
                                                qVar2.f67021d = null;
                                                qVar2.f67022e = null;
                                                qVar2.f67023f = j15;
                                                qVar2.f67027j = fFloatValue;
                                                qVar2.f67024g = 0;
                                                qVar2.f67028k = fFloatValue3;
                                                qVar2.f67025h = 0;
                                                qVar2.f67026i = 0;
                                                qVar2.f67031n = 7;
                                                x53.c cVar6 = s0.f129406a;
                                                if (ge1.b.e0(x53.b.f189152a, new n(str10, context3, j15, str11, null), qVar2) != obj) {
                                                    f15 = fFloatValue3;
                                                    i14 = 0;
                                                    i15 = 0;
                                                    r0Var5 = r0Var2;
                                                    String str111113 = (String) r0Var5.f105810a;
                                                    qVar2.f67018a = context3;
                                                    qVar2.f67019b = null;
                                                    qVar2.f67020c = r0Var5;
                                                    qVar2.f67021d = null;
                                                    qVar2.f67022e = null;
                                                    qVar2.f67023f = j15;
                                                    qVar2.f67027j = fFloatValue;
                                                    qVar2.f67024g = i18;
                                                    qVar2.f67028k = f15;
                                                    qVar2.f67025h = i14;
                                                    qVar2.f67026i = i15;
                                                    qVar2.f67031n = 8;
                                                    long j29 = j15;
                                                    Context context11115 = context3;
                                                    context8 = context11115;
                                                    j18 = j29;
                                                }
                                            }
                                        } else {
                                            wVar.getClass();
                                            e().getClass();
                                            unit = Unit.INSTANCE;
                                            if (unit == null) {
                                                cx2.h hVarE115 = e();
                                                Logger logger114 = cx2.h.f56678c;
                                                hVarE115.getClass();
                                            }
                                            String str111114 = (String) r0Var2.f105810a;
                                            qVar2.f67018a = context3;
                                            qVar2.f67019b = null;
                                            qVar2.f67020c = null;
                                            qVar2.f67021d = null;
                                            qVar2.f67022e = null;
                                            qVar2.f67023f = j15;
                                            qVar2.f67027j = fFloatValue;
                                            qVar2.f67031n = 9;
                                            Context context11116 = context3;
                                            context9 = context11116;
                                        }
                                    }
                                } else {
                                    cx2.h hVarE116 = e();
                                    Logger logger115 = cx2.h.f56678c;
                                    hVarE116.getClass();
                                    String str111115 = (String) r0Var2.f105810a;
                                    qVar2.f67018a = context3;
                                    qVar2.f67019b = null;
                                    qVar2.f67020c = null;
                                    qVar2.f67021d = null;
                                    qVar2.f67022e = null;
                                    qVar2.f67023f = j15;
                                    qVar2.f67027j = fFloatValue;
                                    qVar2.f67031n = 9;
                                    Context context11117 = context3;
                                    context9 = context11117;
                                }
                            }
                        }
                    } else {
                        String strD5 = hb2.h.d(hb2.h.a(context3));
                        qVar.f67018a = context3;
                        qVar.f67019b = str6;
                        qVar.f67020c = r0Var2;
                        qVar.f67021d = strD5;
                        qVar.f67023f = j15;
                        qVar.f67027j = fFloatValue;
                        qVar.f67031n = 3;
                        objB = f(context3, j15, strD5, qVar);
                        str7 = strD5;
                        if (objB != obj) {
                            j16 = j15;
                            str8 = str6;
                            context4 = context3;
                            r0Var3 = r0Var2;
                            fFloatValue2 = ((Number) objB).floatValue();
                            if (fFloatValue2 >= 0.0f) {
                                qVar2 = qVar;
                                context5 = context4;
                                e().getClass();
                                str9 = (String) r0Var3.f105810a;
                                qVar2.f67018a = context5;
                                qVar2.f67019b = null;
                                qVar2.f67020c = r0Var3;
                                qVar2.f67021d = null;
                                qVar2.f67023f = j16;
                                qVar2.f67027j = fFloatValue;
                                qVar2.f67028k = fFloatValue2;
                                qVar2.f67031n = 5;
                                if (g(context5, j16, str8, str9, qVar2) != obj) {
                                    context6 = context5;
                                    j17 = j16;
                                    r0Var4 = r0Var3;
                                    j15 = j17;
                                    r0Var2 = r0Var4;
                                    context3 = context6;
                                    String str111116 = (String) r0Var2.f105810a;
                                    qVar2.f67018a = context3;
                                    qVar2.f67019b = null;
                                    qVar2.f67020c = null;
                                    qVar2.f67021d = null;
                                    qVar2.f67022e = null;
                                    qVar2.f67023f = j15;
                                    qVar2.f67027j = fFloatValue;
                                    qVar2.f67031n = 9;
                                    Context context11118 = context3;
                                    context9 = context11118;
                                }
                            } else {
                                e().getClass();
                                qVar.f67018a = context4;
                                qVar.f67019b = null;
                                qVar.f67020c = null;
                                qVar.f67021d = null;
                                qVar.f67023f = j16;
                                qVar.f67027j = fFloatValue;
                                qVar.f67028k = fFloatValue2;
                                qVar.f67031n = 4;
                                Context context11119 = context4;
                                Object objJ5 = j(context11119, j16, str7, qVar);
                                context7 = context11119;
                            }
                        }
                    }
                    break;
                }
                return obj;
            case 2:
                j15 = qVar.f67023f;
                r0 r0Var7 = qVar.f67020c;
                str6 = qVar.f67019b;
                context3 = qVar.f67018a;
                o13.r.b(objB);
                r0Var2 = r0Var7;
                fFloatValue = ((Number) objB).floatValue();
                e().getClass();
                if (fFloatValue >= 0.0f) {
                    String strD6 = hb2.h.d(hb2.h.a(context3));
                    qVar.f67018a = context3;
                    qVar.f67019b = str6;
                    qVar.f67020c = r0Var2;
                    qVar.f67021d = strD6;
                    qVar.f67023f = j15;
                    qVar.f67027j = fFloatValue;
                    qVar.f67031n = 3;
                    objB = f(context3, j15, strD6, qVar);
                    str7 = strD6;
                    if (objB != obj) {
                        j16 = j15;
                        str8 = str6;
                        context4 = context3;
                        r0Var3 = r0Var2;
                        fFloatValue2 = ((Number) objB).floatValue();
                        if (fFloatValue2 >= 0.0f) {
                            qVar2 = qVar;
                            context5 = context4;
                            e().getClass();
                            str9 = (String) r0Var3.f105810a;
                            qVar2.f67018a = context5;
                            qVar2.f67019b = null;
                            qVar2.f67020c = r0Var3;
                            qVar2.f67021d = null;
                            qVar2.f67023f = j16;
                            qVar2.f67027j = fFloatValue;
                            qVar2.f67028k = fFloatValue2;
                            qVar2.f67031n = 5;
                            if (g(context5, j16, str8, str9, qVar2) != obj) {
                                context6 = context5;
                                j17 = j16;
                                r0Var4 = r0Var3;
                                j15 = j17;
                                r0Var2 = r0Var4;
                                context3 = context6;
                                String str111117 = (String) r0Var2.f105810a;
                                qVar2.f67018a = context3;
                                qVar2.f67019b = null;
                                qVar2.f67020c = null;
                                qVar2.f67021d = null;
                                qVar2.f67022e = null;
                                qVar2.f67023f = j15;
                                qVar2.f67027j = fFloatValue;
                                qVar2.f67031n = 9;
                                Context context111110 = context3;
                                context9 = context111110;
                            }
                        } else {
                            e().getClass();
                            qVar.f67018a = context4;
                            qVar.f67019b = null;
                            qVar.f67020c = null;
                            qVar.f67021d = null;
                            qVar.f67023f = j16;
                            qVar.f67027j = fFloatValue;
                            qVar.f67028k = fFloatValue2;
                            qVar.f67031n = 4;
                            Context context111111 = context4;
                            Object objJ6 = j(context111111, j16, str7, qVar);
                            context7 = context111111;
                        }
                    }
                    break;
                } else {
                    qVar2 = qVar;
                    e().getClass();
                    wVar = wVar2;
                    if (System.currentTimeMillis() - context3.getSharedPreferences(context3.getString(R.string.key_rts_shared_preference_context), 0).getLong(context3.getString(R.string.key_string_translation_last_checked_in, String.valueOf(j15)), -1L) > 86400000) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    wVar.getClass();
                    e().getClass();
                    if (z14) {
                        e().getClass();
                        String str111118 = (String) r0Var2.f105810a;
                        qVar2.f67018a = context3;
                        qVar2.f67019b = null;
                        qVar2.f67020c = null;
                        qVar2.f67021d = null;
                        qVar2.f67022e = null;
                        qVar2.f67023f = j15;
                        qVar2.f67027j = fFloatValue;
                        qVar2.f67031n = 9;
                        Context context111112 = context3;
                        context9 = context111112;
                    } else {
                        String str111119 = (String) r0Var2.f105810a;
                        qVar2.f67018a = context3;
                        qVar2.f67019b = null;
                        qVar2.f67020c = r0Var2;
                        qVar2.f67023f = j15;
                        qVar2.f67027j = fFloatValue;
                        qVar2.f67031n = 6;
                        objB = ge1.b.Y(new p(str6, context3, j15, str111119, null), qVar2);
                        if (objB != obj) {
                            aVar = (a) objB;
                            if (aVar == null) {
                                f14 = aVar.f66930a;
                                if (f14 == null) {
                                    unit = null;
                                    if (unit == null) {
                                        cx2.h hVarE117 = e();
                                        Logger logger116 = cx2.h.f56678c;
                                        hVarE117.getClass();
                                    }
                                    String str1111110 = (String) r0Var2.f105810a;
                                    qVar2.f67018a = context3;
                                    qVar2.f67019b = null;
                                    qVar2.f67020c = null;
                                    qVar2.f67021d = null;
                                    qVar2.f67022e = null;
                                    qVar2.f67023f = j15;
                                    qVar2.f67027j = fFloatValue;
                                    qVar2.f67031n = 9;
                                    Context context111113 = context3;
                                    context9 = context111113;
                                } else {
                                    fFloatValue3 = f14.floatValue();
                                    if (fFloatValue != fFloatValue3) {
                                        wVar.getClass();
                                        e().getClass();
                                        str10 = aVar.f66931b;
                                        if (str10 == null) {
                                            unit = null;
                                            if (unit == null) {
                                                cx2.h hVarE118 = e();
                                                Logger logger117 = cx2.h.f56678c;
                                                hVarE118.getClass();
                                            }
                                            String str1111111 = (String) r0Var2.f105810a;
                                            qVar2.f67018a = context3;
                                            qVar2.f67019b = null;
                                            qVar2.f67020c = null;
                                            qVar2.f67021d = null;
                                            qVar2.f67022e = null;
                                            qVar2.f67023f = j15;
                                            qVar2.f67027j = fFloatValue;
                                            qVar2.f67031n = 9;
                                            Context context111114 = context3;
                                            context9 = context111114;
                                        } else {
                                            str11 = (String) r0Var2.f105810a;
                                            qVar2.f67018a = context3;
                                            qVar2.f67019b = null;
                                            qVar2.f67020c = r0Var2;
                                            qVar2.f67021d = null;
                                            qVar2.f67022e = null;
                                            qVar2.f67023f = j15;
                                            qVar2.f67027j = fFloatValue;
                                            qVar2.f67024g = 0;
                                            qVar2.f67028k = fFloatValue3;
                                            qVar2.f67025h = 0;
                                            qVar2.f67026i = 0;
                                            qVar2.f67031n = 7;
                                            x53.c cVar7 = s0.f129406a;
                                            if (ge1.b.e0(x53.b.f189152a, new n(str10, context3, j15, str11, null), qVar2) != obj) {
                                                f15 = fFloatValue3;
                                                i14 = 0;
                                                i15 = 0;
                                                r0Var5 = r0Var2;
                                                String str1111112 = (String) r0Var5.f105810a;
                                                qVar2.f67018a = context3;
                                                qVar2.f67019b = null;
                                                qVar2.f67020c = r0Var5;
                                                qVar2.f67021d = null;
                                                qVar2.f67022e = null;
                                                qVar2.f67023f = j15;
                                                qVar2.f67027j = fFloatValue;
                                                qVar2.f67024g = i18;
                                                qVar2.f67028k = f15;
                                                qVar2.f67025h = i14;
                                                qVar2.f67026i = i15;
                                                qVar2.f67031n = 8;
                                                long j210 = j15;
                                                Context context111115 = context3;
                                                context8 = context111115;
                                                j18 = j210;
                                            }
                                        }
                                    } else {
                                        wVar.getClass();
                                        e().getClass();
                                        unit = Unit.INSTANCE;
                                        if (unit == null) {
                                            cx2.h hVarE119 = e();
                                            Logger logger118 = cx2.h.f56678c;
                                            hVarE119.getClass();
                                        }
                                        String str1111113 = (String) r0Var2.f105810a;
                                        qVar2.f67018a = context3;
                                        qVar2.f67019b = null;
                                        qVar2.f67020c = null;
                                        qVar2.f67021d = null;
                                        qVar2.f67022e = null;
                                        qVar2.f67023f = j15;
                                        qVar2.f67027j = fFloatValue;
                                        qVar2.f67031n = 9;
                                        Context context111116 = context3;
                                        context9 = context111116;
                                    }
                                }
                            } else {
                                cx2.h hVarE1110 = e();
                                Logger logger119 = cx2.h.f56678c;
                                hVarE1110.getClass();
                                String str1111114 = (String) r0Var2.f105810a;
                                qVar2.f67018a = context3;
                                qVar2.f67019b = null;
                                qVar2.f67020c = null;
                                qVar2.f67021d = null;
                                qVar2.f67022e = null;
                                qVar2.f67023f = j15;
                                qVar2.f67027j = fFloatValue;
                                qVar2.f67031n = 9;
                                Context context111117 = context3;
                                context9 = context111117;
                            }
                        }
                    }
                    break;
                }
                return obj;
            case 3:
                fFloatValue = qVar.f67027j;
                j16 = qVar.f67023f;
                str7 = qVar.f67021d;
                r0Var3 = qVar.f67020c;
                str8 = qVar.f67019b;
                context4 = qVar.f67018a;
                o13.r.b(objB);
                fFloatValue2 = ((Number) objB).floatValue();
                if (fFloatValue2 >= 0.0f) {
                    e().getClass();
                    qVar.f67018a = context4;
                    qVar.f67019b = null;
                    qVar.f67020c = null;
                    qVar.f67021d = null;
                    qVar.f67023f = j16;
                    qVar.f67027j = fFloatValue;
                    qVar.f67028k = fFloatValue2;
                    qVar.f67031n = 4;
                    Context context111118 = context4;
                    Object objJ7 = j(context111118, j16, str7, qVar);
                    context7 = context111118;
                    break;
                } else {
                    qVar2 = qVar;
                    context5 = context4;
                    e().getClass();
                    str9 = (String) r0Var3.f105810a;
                    qVar2.f67018a = context5;
                    qVar2.f67019b = null;
                    qVar2.f67020c = r0Var3;
                    qVar2.f67021d = null;
                    qVar2.f67023f = j16;
                    qVar2.f67027j = fFloatValue;
                    qVar2.f67028k = fFloatValue2;
                    qVar2.f67031n = 5;
                    if (g(context5, j16, str8, str9, qVar2) != obj) {
                        context6 = context5;
                        j17 = j16;
                        r0Var4 = r0Var3;
                        j15 = j17;
                        r0Var2 = r0Var4;
                        context3 = context6;
                        String str1111115 = (String) r0Var2.f105810a;
                        qVar2.f67018a = context3;
                        qVar2.f67019b = null;
                        qVar2.f67020c = null;
                        qVar2.f67021d = null;
                        qVar2.f67022e = null;
                        qVar2.f67023f = j15;
                        qVar2.f67027j = fFloatValue;
                        qVar2.f67031n = 9;
                        Context context111119 = context3;
                        context9 = context111119;
                    }
                    break;
                }
                return obj;
            case 4:
                context7 = qVar.f67018a;
                o13.r.b(objB);
                i(context7);
                return Unit.INSTANCE;
            case 5:
                fFloatValue = qVar.f67027j;
                j17 = qVar.f67023f;
                r0Var4 = qVar.f67020c;
                context6 = qVar.f67018a;
                o13.r.b(objB);
                qVar2 = qVar;
                j15 = j17;
                r0Var2 = r0Var4;
                context3 = context6;
                String str1111116 = (String) r0Var2.f105810a;
                qVar2.f67018a = context3;
                qVar2.f67019b = null;
                qVar2.f67020c = null;
                qVar2.f67021d = null;
                qVar2.f67022e = null;
                qVar2.f67023f = j15;
                qVar2.f67027j = fFloatValue;
                qVar2.f67031n = 9;
                Context context1111110 = context3;
                context9 = context1111110;
                break;
            case 6:
                fFloatValue = qVar.f67027j;
                long j34 = qVar.f67023f;
                r0 r0Var8 = qVar.f67020c;
                Context context21 = qVar.f67018a;
                o13.r.b(objB);
                qVar2 = qVar;
                r0Var2 = r0Var8;
                context3 = context21;
                j15 = j34;
                wVar = wVar2;
                aVar = (a) objB;
                if (aVar == null) {
                    cx2.h hVarE1111 = e();
                    Logger logger1110 = cx2.h.f56678c;
                    hVarE1111.getClass();
                    String str1111117 = (String) r0Var2.f105810a;
                    qVar2.f67018a = context3;
                    qVar2.f67019b = null;
                    qVar2.f67020c = null;
                    qVar2.f67021d = null;
                    qVar2.f67022e = null;
                    qVar2.f67023f = j15;
                    qVar2.f67027j = fFloatValue;
                    qVar2.f67031n = 9;
                    Context context1111111 = context3;
                    context9 = context1111111;
                    break;
                } else {
                    f14 = aVar.f66930a;
                    if (f14 == null) {
                        unit = null;
                        if (unit == null) {
                            cx2.h hVarE1112 = e();
                            Logger logger1111 = cx2.h.f56678c;
                            hVarE1112.getClass();
                        }
                        String str1111118 = (String) r0Var2.f105810a;
                        qVar2.f67018a = context3;
                        qVar2.f67019b = null;
                        qVar2.f67020c = null;
                        qVar2.f67021d = null;
                        qVar2.f67022e = null;
                        qVar2.f67023f = j15;
                        qVar2.f67027j = fFloatValue;
                        qVar2.f67031n = 9;
                        Context context1111112 = context3;
                        context9 = context1111112;
                    } else {
                        fFloatValue3 = f14.floatValue();
                        if (fFloatValue != fFloatValue3) {
                            wVar.getClass();
                            e().getClass();
                            str10 = aVar.f66931b;
                            if (str10 == null) {
                                unit = null;
                                if (unit == null) {
                                    cx2.h hVarE1113 = e();
                                    Logger logger1112 = cx2.h.f56678c;
                                    hVarE1113.getClass();
                                }
                                String str1111119 = (String) r0Var2.f105810a;
                                qVar2.f67018a = context3;
                                qVar2.f67019b = null;
                                qVar2.f67020c = null;
                                qVar2.f67021d = null;
                                qVar2.f67022e = null;
                                qVar2.f67023f = j15;
                                qVar2.f67027j = fFloatValue;
                                qVar2.f67031n = 9;
                                Context context1111113 = context3;
                                context9 = context1111113;
                            } else {
                                str11 = (String) r0Var2.f105810a;
                                qVar2.f67018a = context3;
                                qVar2.f67019b = null;
                                qVar2.f67020c = r0Var2;
                                qVar2.f67021d = null;
                                qVar2.f67022e = null;
                                qVar2.f67023f = j15;
                                qVar2.f67027j = fFloatValue;
                                qVar2.f67024g = 0;
                                qVar2.f67028k = fFloatValue3;
                                qVar2.f67025h = 0;
                                qVar2.f67026i = 0;
                                qVar2.f67031n = 7;
                                x53.c cVar8 = s0.f129406a;
                                if (ge1.b.e0(x53.b.f189152a, new n(str10, context3, j15, str11, null), qVar2) != obj) {
                                    f15 = fFloatValue3;
                                    i14 = 0;
                                    i15 = 0;
                                    r0Var5 = r0Var2;
                                    String str11111110 = (String) r0Var5.f105810a;
                                    qVar2.f67018a = context3;
                                    qVar2.f67019b = null;
                                    qVar2.f67020c = r0Var5;
                                    qVar2.f67021d = null;
                                    qVar2.f67022e = null;
                                    qVar2.f67023f = j15;
                                    qVar2.f67027j = fFloatValue;
                                    qVar2.f67024g = i18;
                                    qVar2.f67028k = f15;
                                    qVar2.f67025h = i14;
                                    qVar2.f67026i = i15;
                                    qVar2.f67031n = 8;
                                    long j211 = j15;
                                    Context context1111114 = context3;
                                    context8 = context1111114;
                                    j18 = j211;
                                }
                            }
                        } else {
                            wVar.getClass();
                            e().getClass();
                            unit = Unit.INSTANCE;
                            if (unit == null) {
                                cx2.h hVarE1114 = e();
                                Logger logger1113 = cx2.h.f56678c;
                                hVarE1114.getClass();
                            }
                            String str11111111 = (String) r0Var2.f105810a;
                            qVar2.f67018a = context3;
                            qVar2.f67019b = null;
                            qVar2.f67020c = null;
                            qVar2.f67021d = null;
                            qVar2.f67022e = null;
                            qVar2.f67023f = j15;
                            qVar2.f67027j = fFloatValue;
                            qVar2.f67031n = 9;
                            Context context1111115 = context3;
                            context9 = context1111115;
                        }
                    }
                    break;
                }
                return obj;
            case 7:
                int i30 = qVar.f67026i;
                int i34 = qVar.f67025h;
                f15 = qVar.f67028k;
                int i35 = qVar.f67024g;
                float f16 = qVar.f67027j;
                j15 = qVar.f67023f;
                r0 r0Var9 = qVar.f67020c;
                context3 = qVar.f67018a;
                o13.r.b(objB);
                qVar2 = qVar;
                i14 = i34;
                fFloatValue = f16;
                i15 = i30;
                r0Var5 = r0Var9;
                i18 = i35;
                String str11111112 = (String) r0Var5.f105810a;
                qVar2.f67018a = context3;
                qVar2.f67019b = null;
                qVar2.f67020c = r0Var5;
                qVar2.f67021d = null;
                qVar2.f67022e = null;
                qVar2.f67023f = j15;
                qVar2.f67027j = fFloatValue;
                qVar2.f67024g = i18;
                qVar2.f67028k = f15;
                qVar2.f67025h = i14;
                qVar2.f67026i = i15;
                qVar2.f67031n = 8;
                long j212 = j15;
                Context context1111116 = context3;
                context8 = context1111116;
                j18 = j212;
                break;
            case 8:
                fFloatValue = qVar.f67027j;
                j18 = qVar.f67023f;
                r0Var5 = qVar.f67020c;
                context8 = qVar.f67018a;
                o13.r.b(objB);
                qVar2 = qVar;
                unit = Unit.INSTANCE;
                j15 = j18;
                r0Var2 = r0Var5;
                context3 = context8;
                if (unit == null) {
                    cx2.h hVarE1115 = e();
                    Logger logger1114 = cx2.h.f56678c;
                    hVarE1115.getClass();
                }
                String str11111113 = (String) r0Var2.f105810a;
                qVar2.f67018a = context3;
                qVar2.f67019b = null;
                qVar2.f67020c = null;
                qVar2.f67021d = null;
                qVar2.f67022e = null;
                qVar2.f67023f = j15;
                qVar2.f67027j = fFloatValue;
                qVar2.f67031n = 9;
                Context context1111117 = context3;
                context9 = context1111117;
                break;
            case 9:
                context9 = qVar.f67018a;
                o13.r.b(objB);
                i(context9);
                return Unit.INSTANCE;
            default:
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object f(Context context, long j8, String str, v13.c cVar) {
        r rVar;
        Context context2;
        long j14;
        if (cVar instanceof r) {
            rVar = (r) cVar;
            int i14 = rVar.f67036e;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                rVar.f67036e = i14 - Integer.MIN_VALUE;
            } else {
                rVar = new r(this, cVar);
            }
        } else {
            rVar = new r(this, cVar);
        }
        r rVar2 = rVar;
        Object objH = rVar2.f67034c;
        Object obj = u13.a.COROUTINE_SUSPENDED;
        int i15 = rVar2.f67036e;
        if (i15 == 0) {
            o13.r.b(objH);
            rVar2.f67032a = context;
            rVar2.f67033b = j8;
            rVar2.f67036e = 1;
            objH = h(context, j8, str, rVar2);
            if (objH == obj) {
                return obj;
            }
            context2 = context;
            j14 = j8;
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j14 = rVar2.f67033b;
            context2 = rVar2.f67032a;
            o13.r.b(objH);
        }
        boolean zBooleanValue = ((Boolean) objH).booleanValue();
        float f14 = -1.0f;
        if (zBooleanValue) {
            e().getClass();
            f14 = context2.getSharedPreferences(context2.getString(R.string.key_rts_shared_preference_context), 0).getFloat(context2.getString(R.string.key_string_translation_version, String.valueOf(j14)), -1.0f);
        } else {
            e().getClass();
        }
        return new Float(f14);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00d1, code lost:
    
        if (ex2.w.f67058a.k(r10, r6, r9, r1) == r3) goto L35;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(Context context, long j8, String str, String str2, v13.c cVar) {
        s sVar;
        Context context2;
        long j14;
        String str3;
        int i14;
        Context context3;
        long j15;
        String str4;
        if (cVar instanceof s) {
            sVar = (s) cVar;
            int i15 = sVar.f67043g;
            if ((i15 & Integer.MIN_VALUE) != 0) {
                sVar.f67043g = i15 - Integer.MIN_VALUE;
            } else {
                sVar = new s(this, cVar);
            }
        } else {
            sVar = new s(this, cVar);
        }
        Object objY = sVar.f67041e;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i16 = sVar.f67043g;
        if (i16 == 0) {
            o13.r.b(objY);
            e().getClass();
            sVar.f67037a = context;
            sVar.f67038b = str2;
            sVar.f67039c = j8;
            sVar.f67043g = 1;
            objY = ge1.b.Y(new p(str, context, j8, str2, null), sVar);
            if (objY != aVar) {
                context2 = context;
                j14 = j8;
                str3 = str2;
            }
            return aVar;
        }
        if (i16 == 1) {
            long j16 = sVar.f67039c;
            String str5 = sVar.f67038b;
            Context context4 = sVar.f67037a;
            o13.r.b(objY);
            str3 = str5;
            context2 = context4;
            j14 = j16;
        } else if (i16 == 2) {
            i14 = sVar.f67040d;
            j15 = sVar.f67039c;
            str4 = sVar.f67038b;
            context3 = sVar.f67037a;
            o13.r.b(objY);
            sVar.f67037a = null;
            sVar.f67038b = null;
            sVar.f67039c = j15;
            sVar.f67040d = i14;
            sVar.f67043g = 3;
        } else {
            if (i16 != 3) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objY);
        }
        return Unit.INSTANCE;
        a aVar2 = (a) objY;
        if (aVar2 != null) {
            String str6 = aVar2.f66931b;
            w wVar = f67058a;
            if (str6 != null && str6.length() != 0) {
                String str7 = aVar2.f66931b;
                sVar.f67037a = context2;
                sVar.f67038b = str3;
                sVar.f67039c = j14;
                i14 = 0;
                sVar.f67040d = 0;
                sVar.f67043g = 2;
                wVar.getClass();
                x53.c cVar2 = s0.f129406a;
                if (ge1.b.e0(x53.b.f189152a, new n(str7, context2, j14, str3, null), sVar) != aVar) {
                    context3 = context2;
                    j15 = j14;
                    str4 = str3;
                    sVar.f67037a = null;
                    sVar.f67038b = null;
                    sVar.f67039c = j15;
                    sVar.f67040d = i14;
                    sVar.f67043g = 3;
                }
                return aVar;
            }
            wVar.getClass();
            cx2.h hVarE = e();
            String strE = org.apache.commons.lang3.e.e(j14, "initiateDownloadRequest: unable to get download URL or locale for strings for unit id ");
            Logger logger = cx2.h.f56678c;
            hVarE.d(null, strE);
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object h(Context context, long j8, String str, v13.c cVar) {
        t tVar;
        if (cVar instanceof t) {
            tVar = (t) cVar;
            int i14 = tVar.f67046c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                tVar.f67046c = i14 - Integer.MIN_VALUE;
            } else {
                tVar = new t(this, cVar);
            }
        } else {
            tVar = new t(this, cVar);
        }
        Object objD = tVar.f67044a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = tVar.f67046c;
        if (i15 == 0) {
            o13.r.b(objD);
            tVar.f67046c = 1;
            objD = d(context, j8, str, tVar);
            if (objD == aVar) {
                return aVar;
            }
        } else {
            if (i15 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            o13.r.b(objD);
        }
        return Boolean.valueOf(((File) objD).exists());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0091, code lost:
    
        if (r11 == r1) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object j(Context context, long j8, String str, v13.c cVar) throws Throwable {
        u uVar;
        com.garmin.realtimesettings.app.initialization.b bVar;
        if (cVar instanceof u) {
            uVar = (u) cVar;
            int i14 = uVar.f67052f;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                uVar.f67052f = i14 - Integer.MIN_VALUE;
            } else {
                uVar = new u(this, cVar);
            }
        } else {
            uVar = new u(this, cVar);
        }
        Object objD = uVar.f67050d;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = uVar.f67052f;
        try {
            if (i15 == 0) {
                o13.r.b(objD);
                uVar.f67047a = str;
                uVar.f67049c = j8;
                uVar.f67052f = 1;
                objD = d(context, j8, str, uVar);
                if (objD != aVar) {
                }
                return aVar;
            }
            if (i15 == 1) {
                j8 = uVar.f67049c;
                str = uVar.f67047a;
                o13.r.b(objD);
            } else {
                if (i15 != 2) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                bVar = uVar.f67048b;
                o13.r.b(objD);
            }
            HashMap<String, String> map = (HashMap) objD;
            bVar.getClass();
            map.getClass();
            com.garmin.realtimesettings.app.initialization.b.f52594f = map;
            e().getClass();
            return Unit.INSTANCE;
            File file = (File) objD;
            if (str.length() != 0 || file.exists()) {
                e().getClass();
                bVar = com.garmin.realtimesettings.app.initialization.b.f52589a;
                iw2.w wVar = iw2.w.f95547a;
                uVar.f67047a = null;
                uVar.f67048b = bVar;
                uVar.f67049c = j8;
                uVar.f67052f = 2;
                wVar.getClass();
                x53.c cVar2 = s0.f129406a;
                objD = ge1.b.e0(x53.b.f189152a, new iw2.t(file, null), uVar);
            } else {
                com.garmin.realtimesettings.app.initialization.b bVar2 = com.garmin.realtimesettings.app.initialization.b.f52589a;
                HashMap<String, String> map2 = new HashMap<>();
                bVar2.getClass();
                com.garmin.realtimesettings.app.initialization.b.f52594f = map2;
                e().getClass();
            }
        } catch (FileNotFoundException unused) {
            cx2.h hVarE = e();
            Logger logger = cx2.h.f56678c;
            hVarE.getClass();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object k(Context context, long j8, String str, v13.c cVar) throws Throwable {
        v vVar;
        Context context2;
        long j14;
        if (cVar instanceof v) {
            vVar = (v) cVar;
            int i14 = vVar.f67057e;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                vVar.f67057e = i14 - Integer.MIN_VALUE;
            } else {
                vVar = new v(this, cVar);
            }
        } else {
            vVar = new v(this, cVar);
        }
        Object objD = vVar.f67055c;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = vVar.f67057e;
        try {
            if (i15 == 0) {
                o13.r.b(objD);
                vVar.f67053a = context;
                vVar.f67054b = j8;
                vVar.f67057e = 1;
                objD = d(context, j8, str, vVar);
                if (objD != aVar) {
                }
                return aVar;
            }
            if (i15 == 1) {
                j8 = vVar.f67054b;
                context = vVar.f67053a;
                o13.r.b(objD);
            } else {
                if (i15 != 2) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                j14 = vVar.f67054b;
                context2 = vVar.f67053a;
                o13.r.b(objD);
            }
            float fFloatValue = ((Number) objD).floatValue();
            e().getClass();
            context2.getSharedPreferences(context2.getString(R.string.key_rts_shared_preference_context), 0).edit().putFloat(context2.getString(R.string.key_string_translation_version, String.valueOf(j14)), fFloatValue).apply();
            return Unit.INSTANCE;
            File file = (File) objD;
            if (file.exists()) {
                e().getClass();
                iw2.w wVar = iw2.w.f95547a;
                vVar.f67053a = context;
                vVar.f67054b = j8;
                vVar.f67057e = 2;
                wVar.getClass();
                x53.c cVar2 = s0.f129406a;
                objD = ge1.b.e0(x53.b.f189152a, new iw2.u(file, null), vVar);
                if (objD != aVar) {
                    context2 = context;
                    j14 = j8;
                    float fFloatValue2 = ((Number) objD).floatValue();
                    e().getClass();
                    context2.getSharedPreferences(context2.getString(R.string.key_rts_shared_preference_context), 0).edit().putFloat(context2.getString(R.string.key_string_translation_version, String.valueOf(j14)), fFloatValue2).apply();
                }
                return aVar;
            }
        } catch (FileNotFoundException unused) {
            cx2.h hVarE = e();
            Logger logger = cx2.h.f56678c;
            hVarE.d(null, "writeStringVersion: String file not found or deleted.");
        }
        return Unit.INSTANCE;
    }
}
