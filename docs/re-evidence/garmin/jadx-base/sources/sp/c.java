package sp;

import android.content.Context;
import c22.j0;
import ch.qos.logback.core.CoreConstants;
import g22.l;
import n82.d;
import o82.g;
import org.joda.time.LocalDate;
import p005kotlin.Metadata;
import pi0.e;
import pi0.f;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lsp/c;", "Lq82/c;", "Ln82/d;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c implements q82.c<d> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f160499a;

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f160500a;

        static {
            int[] iArr = new int[g.values().length];
            try {
                iArr[g.f130850c.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[g.f130857j.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[g.f130859l.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f160500a = iArr;
        }
    }

    public c(Context context) {
        context.getClass();
        this.f160499a = new e(context);
    }

    @Override // q82.c
    public final String a(d dVar) {
        d dVar2 = dVar;
        o82.a aVar = dVar2.f124956a;
        LocalDate localDateH = l.h(aVar.f130843a);
        LocalDate localDateH2 = l.h(aVar.f130844b);
        int i14 = a.f160500a[dVar2.f124957b.ordinal()];
        e eVar = this.f160499a;
        if (i14 == 1) {
            return eVar.k(localDateH, pi0.d.DATE_SHORT_MONTH_FOR_PAST_YEAR_SHOW_TODAY);
        }
        if (i14 != 2) {
            return i14 != 3 ? eVar.m(localDateH, localDateH2, f.SHORT_MONTH_NO_WEEKDAY) : eVar.m(localDateH, localDateH2, f.SHORT_MONTH_NO_DAY_NO_WEEKDAY);
        }
        String strB = j0.b(localDateH.toDateTimeAtStartOfDay(), "MMMM yyyy", null);
        return strB == null ? "" : strB;
    }
}
