package yd1;

import android.content.Context;
import b63.o;
import ch.qos.logback.core.CoreConstants;
import java.time.LocalDate;
import n82.d;
import p005kotlin.Metadata;
import pi0.e;
import pi0.f;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lyd1/a;", "Lq82/c;", "Ln82/d;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a implements q82.c<d> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f196754a;

    public a(Context context) {
        context.getClass();
        this.f196754a = new e(context);
    }

    @Override // q82.c
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final String a(d dVar) {
        o82.a aVar = dVar.f124956a;
        o oVar = aVar.f130843a;
        int year = oVar.f16206a.getYear();
        LocalDate localDate = oVar.f16206a;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(year, localDate.getMonthValue(), localDate.getDayOfMonth());
        o oVar2 = aVar.f130844b;
        int year2 = oVar2.f16206a.getYear();
        LocalDate localDate3 = oVar2.f16206a;
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate(year2, localDate3.getMonthValue(), localDate3.getDayOfMonth());
        boolean zEquals = localDate2.equals(localDate4);
        e eVar = this.f196754a;
        return zEquals ? eVar.k(localDate2, pi0.d.DATE_SHORT_MONTH_FOR_PAST_YEAR_SHOW_TODAY) : eVar.m(localDate2, localDate4, f.SHORT_MONTH_NO_WEEKDAY);
    }
}
