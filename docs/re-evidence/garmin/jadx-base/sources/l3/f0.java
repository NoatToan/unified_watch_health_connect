package l3;

import com.mapbox.maps.plugin.scalebar.LocaleUnitResolver;
import java.time.DayOfWeek;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.chrono.Chronology;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.format.DateTimeParseException;
import java.time.format.DecimalStyle;
import java.time.format.FormatStyle;
import java.time.format.TextStyle;
import java.time.temporal.WeekFields;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Locale;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0007B\u0013\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Ll3/f0;", "Ll3/e0;", "Ljava/util/Locale;", "Landroidx/compose/material3/CalendarLocale;", "locale", "<init>", "(Ljava/util/Locale;)V", "a", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class f0 extends e0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f109230e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final ZoneId f109231f = ZoneId.of("UTC");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f109232c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f109233d;

    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ w13.c f109234a = w13.b.g(DayOfWeek.values());
    }

    public f0(Locale locale) {
        super(locale);
        this.f109232c = WeekFields.of(locale).getFirstDayOfWeek().getValue();
        w13.c cVar = b.f109234a;
        ArrayList arrayList = new ArrayList(cVar.getF134973e());
        int f168272d = cVar.getF134973e();
        for (int i14 = 0; i14 < f168272d; i14++) {
            DayOfWeek dayOfWeek = (DayOfWeek) cVar.get(i14);
            arrayList.add(new o13.p(dayOfWeek.getDisplayName(TextStyle.FULL_STANDALONE, locale), dayOfWeek.getDisplayName(TextStyle.NARROW_STANDALONE, locale)));
        }
        this.f109233d = arrayList;
    }

    @Override // l3.e0
    public final String a(long j8, String str, Locale locale) {
        f109230e.getClass();
        return Instant.ofEpochMilli(j8).atZone(f109231f).toLocalDate().format(a.a(str, locale, this.f109227b));
    }

    @Override // l3.e0
    public final d0 b(long j8) {
        LocalDate localDate = Instant.ofEpochMilli(j8).atZone(f109231f).toLocalDate();
        return new d0(localDate.getYear(), localDate.getMonthValue(), localDate.getDayOfMonth(), ((long) 1000) * localDate.atStartOfDay().toEpochSecond(ZoneOffset.UTC));
    }

    @Override // l3.e0
    public final k0 c(Locale locale) {
        String strR = d53.w.R(d53.u.v(new d53.k("y{1,4}").f(new d53.k("M{1,2}").f(new d53.k("d{1,2}").f(new d53.k("[^dMy/\\-.]").f(DateTimeFormatterBuilder.getLocalizedDateTimePattern(FormatStyle.SHORT, null, Chronology.ofLocale(locale), locale), ""), "dd"), LocaleUnitResolver.ImperialCountryCode.MYANMAR), "yyyy"), "My", "M/y", false), ".");
        d53.j jVarB = new d53.k("[/\\-.]").b(0, strR);
        jVarB.getClass();
        d53.h hVarB = jVarB.f57693c.b(0);
        hVarB.getClass();
        return new k0(strR, hVarB.f57688a.charAt(0));
    }

    @Override // l3.e0
    /* JADX INFO: renamed from: d, reason: from getter */
    public final int getF109232c() {
        return this.f109232c;
    }

    @Override // l3.e0
    public final h0 e(int i14, int i15) {
        return l(LocalDate.of(i14, i15, 1));
    }

    @Override // l3.e0
    public final h0 f(long j8) {
        return l(Instant.ofEpochMilli(j8).atZone(f109231f).withDayOfMonth(1).toLocalDate());
    }

    @Override // l3.e0
    public final h0 g(d0 d0Var) {
        return l(LocalDate.of(d0Var.f109208a, d0Var.f109209b, 1));
    }

    @Override // l3.e0
    public final d0 h() {
        LocalDate localDateNow = LocalDate.now();
        return new d0(localDateNow.getYear(), localDateNow.getMonthValue(), localDateNow.getDayOfMonth(), localDateNow.atTime(LocalTime.MIDNIGHT).atZone(f109231f).toInstant().toEpochMilli());
    }

    @Override // l3.e0
    /* JADX INFO: renamed from: i, reason: from getter */
    public final ArrayList getF109233d() {
        return this.f109233d;
    }

    @Override // l3.e0
    public final d0 j(String str, String str2, Locale locale) {
        f109230e.getClass();
        try {
            LocalDate localDate = LocalDate.parse(str, a.a(str2, locale, this.f109227b));
            return new d0(localDate.getYear(), localDate.getMonth().getValue(), localDate.getDayOfMonth(), localDate.atTime(LocalTime.MIDNIGHT).atZone(f109231f).toInstant().toEpochMilli());
        } catch (DateTimeParseException unused) {
            return null;
        }
    }

    @Override // l3.e0
    public final h0 k(h0 h0Var, int i14) {
        return i14 <= 0 ? h0Var : l(Instant.ofEpochMilli(h0Var.f109264e).atZone(f109231f).toLocalDate().plusMonths(i14));
    }

    public final h0 l(LocalDate localDate) {
        int value = localDate.getDayOfWeek().getValue() - this.f109232c;
        if (value < 0) {
            value += 7;
        }
        return new h0(localDate.getYear(), localDate.getMonthValue(), localDate.lengthOfMonth(), value, localDate.atTime(LocalTime.MIDNIGHT).atZone(f109231f).toInstant().toEpochMilli());
    }

    public final String toString() {
        return "CalendarModel";
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ll3/f0$a;", "", "<init>", "()V", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static DateTimeFormatter a(String str, Locale locale, LinkedHashMap linkedHashMap) {
            String str2 = "P:" + str + locale.toLanguageTag();
            Object objWithDecimalStyle = linkedHashMap.get(str2);
            if (objWithDecimalStyle == null) {
                objWithDecimalStyle = DateTimeFormatter.ofPattern(str, locale).withDecimalStyle(DecimalStyle.of(locale));
                linkedHashMap.put(str2, objWithDecimalStyle);
            }
            objWithDecimalStyle.getClass();
            return (DateTimeFormatter) objWithDecimalStyle;
        }

        private a() {
        }
    }
}
