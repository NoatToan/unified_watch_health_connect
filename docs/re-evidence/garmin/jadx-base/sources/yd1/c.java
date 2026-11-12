package yd1;

import android.content.Context;
import b63.o;
import ch.qos.logback.core.CoreConstants;
import g22.l;
import n82.d;
import o82.g;
import org.joda.time.LocalDate;
import p005kotlin.Metadata;
import pi0.e;
import pi0.f;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lyd1/c;", "Lq82/c;", "Ln82/d;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Lyd1/b;", "tab", "<init>", "(Landroid/content/Context;Lyd1/b;)V", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c implements q82.c<d> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f196761a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f196762b;

    public c(Context context, b bVar) {
        context.getClass();
        bVar.getClass();
        this.f196761a = bVar;
        this.f196762b = new e(context);
    }

    @Override // q82.c
    public final String a(d dVar) {
        LocalDate localDateH;
        d dVar2 = dVar;
        boolean z14 = this.f196761a == b.MONTHLY && dVar2.f124957b == g.f130856i;
        o82.a aVar = dVar2.f124956a;
        o oVar = aVar.f130843a;
        if (z14) {
            oVar.getClass();
            localDateH = l.h(oVar).plusMonths(1);
            localDateH.getClass();
        } else {
            localDateH = l.h(oVar);
        }
        LocalDate localDateH2 = l.h(aVar.f130844b);
        boolean zEquals = localDateH.equals(localDateH2);
        e eVar = this.f196762b;
        if (zEquals) {
            return eVar.k(localDateH, pi0.d.DATE_SHORT_MONTH_FOR_PAST_YEAR_SHOW_TODAY);
        }
        return eVar.m(localDateH, localDateH2, z14 ? f.SHORT_MONTH_NO_DAY_NO_WEEKDAY : f.SHORT_MONTH_NO_WEEKDAY);
    }
}
