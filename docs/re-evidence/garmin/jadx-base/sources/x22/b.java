package x22;

import android.annotation.SuppressLint;
import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import org.joda.time.DateTime;
import p005kotlin.Metadata;
import pi0.e;
import pi0.f;
import r22.b0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lx22/b;", "Lr22/b0$c;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b extends b0.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f188529a;

    public b(Context context) {
        context.getClass();
        this.f188529a = new e(context);
    }

    @Override // r22.b0.c, r22.b0.b
    @SuppressLint({"SwitchIntDef"})
    public final String a(int i14, DateTime dateTime, DateTime dateTime2) {
        e eVar = this.f188529a;
        switch (i14) {
            case 1:
                return eVar.j(dateTime, pi0.d.DATE_SHORT_MONTH_FOR_PAST_YEAR_SHOW_TODAY);
            case 2:
            case 3:
            case 8:
            case 12:
            default:
                return super.a(i14, dateTime, dateTime2);
            case 4:
            case 5:
            case 7:
            case 9:
            case 10:
            case 11:
            case 13:
                return eVar.l(dateTime, dateTime2, f.SHORT_MONTH_NO_WEEKDAY);
            case 6:
                return eVar.l(dateTime, dateTime2, f.SHORT_MONTH_NO_DAY_NO_WEEKDAY);
        }
    }
}
