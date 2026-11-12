package io;

import android.content.Context;
import android.icu.text.DateIntervalFormat;
import android.icu.text.DateTimePatternGenerator;
import android.icu.util.DateInterval;
import b63.o;
import b63.q;
import com.garmin.android.apps.connectmobile.R;
import com.nimbusds.jose.jwk.JWKParameterNames;
import eo.d;
import hb2.h;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

/* JADX INFO: loaded from: classes7.dex */
public final class a {
    public static final String a(Context context, d dVar, d dVar2, boolean z14) {
        context.getClass();
        if (dVar == null && dVar2 == null) {
            return null;
        }
        Locale localeA = h.a(context);
        if (dVar != null && dVar.equals(dVar2)) {
            d.f64761d.getClass();
            d dVarB = d.a.b();
            if (dVar.f64762a == dVarB.f64762a && dVar.f64763b == dVarB.f64763b && dVar.f64764c == dVarB.f64764c && z14) {
                return context.getString(R.string.mct_lbl_today);
            }
            localeA.getClass();
            return b(dVar, z14, localeA);
        }
        if (dVar == null || dVar2 == null) {
            if (dVar != null) {
                localeA.getClass();
                return context.getString(R.string.lbl_greater_than_sign_value, b(dVar, z14, localeA));
            }
            if (dVar2 == null) {
                return "";
            }
            localeA.getClass();
            return context.getString(R.string.lbl_less_than_sign_value, b(dVar2, z14, localeA));
        }
        localeA.getClass();
        d.f64761d.getClass();
        boolean z15 = dVar.b().f16206a.getYear() != d.a.b().b().f16206a.getYear();
        StringBuilder sb3 = new StringBuilder();
        if (z15) {
            sb3.append(JWKParameterNames.ELLIPTIC_CURVE_Y_COORDINATE);
        }
        sb3.append("MMMd");
        DateIntervalFormat dateIntervalFormat = DateIntervalFormat.getInstance(sb3.toString(), localeA);
        LocalDate localDateA = dVar.a();
        ZoneId zoneIdSystemDefault = ZoneId.systemDefault();
        zoneIdSystemDefault.getClass();
        long epochMilli = localDateA.atStartOfDay(zoneIdSystemDefault).toInstant().toEpochMilli();
        LocalDate localDateA2 = dVar2.a();
        ZoneId zoneIdSystemDefault2 = ZoneId.systemDefault();
        zoneIdSystemDefault2.getClass();
        String str = dateIntervalFormat.format(new DateInterval(epochMilli, localDateA2.atStartOfDay(zoneIdSystemDefault2).toInstant().toEpochMilli()));
        str.getClass();
        return str;
    }

    public static String b(d dVar, boolean z14, Locale locale) {
        dVar.getClass();
        o oVarB = dVar.b();
        d.f64761d.getClass();
        boolean z15 = oVarB.compareTo(q.d(d.a.b().b(), new b63.d(1, 0, 0, 6, null))) < 0;
        StringBuilder sb3 = new StringBuilder();
        if (z14) {
            sb3.append("EEEE");
        }
        if (z15) {
            sb3.append(JWKParameterNames.ELLIPTIC_CURVE_Y_COORDINATE);
        }
        sb3.append(!z15 ? "MMMM" : "MMM");
        sb3.append("d");
        String str = dVar.a().format(DateTimeFormatter.ofPattern(DateTimePatternGenerator.getInstance(locale).getBestPattern(sb3.toString()), locale));
        str.getClass();
        return str;
    }

    public static final String c(d dVar, Locale locale) {
        if (dVar == null) {
            return "";
        }
        String str = dVar.a().format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT).withLocale(locale));
        str.getClass();
        return str;
    }
}
