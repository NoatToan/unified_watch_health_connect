package uq;

import am.x0;
import am.z0;
import android.content.Context;
import c22.m3;
import c22.q3;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import d53.u;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.y;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Luq/b;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Ll22/b;", "resources", "Lam/x0;", "activityType", "<init>", "(Landroid/content/Context;Ll22/b;Lam/x0;)V", "gcm-activities_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f172174a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l22.b f172175b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final x0 f172176c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final sr.b f172177d;

    public b(Context context, l22.b bVar, x0 x0Var) {
        context.getClass();
        bVar.getClass();
        x0Var.getClass();
        this.f172174a = context;
        this.f172175b = bVar;
        this.f172176c = x0Var;
        this.f172177d = new sr.b(context);
    }

    public final ArrayList a(List list) {
        String string;
        q3 q3Var;
        int i14;
        list.getClass();
        ArrayList arrayList = new ArrayList(y.r(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            h hVar = (h) it.next();
            i iVar = hVar.f172205a;
            String str = this.f172176c.f4358a;
            iVar.getClass();
            str.getClass();
            boolean zY = ((f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null)).y();
            boolean zI = z0.I(str);
            boolean zJ0 = z0.j0(str);
            int i15 = wq.f.a.f186550a[iVar.ordinal()];
            l22.b bVar = this.f172175b;
            int i16 = R.string.lbl_meter;
            switch (i15) {
                case 1:
                case 2:
                case 3:
                    m3 m3VarB = ar.b.b(z0.m(str), null);
                    m3VarB.getClass();
                    string = bVar.getString(m3VarB.f23164e);
                    break;
                case 4:
                    string = bVar.getString((zY ? q3.METERS_PER_SECOND : q3.FEET_PER_SECOND).f23223e);
                    break;
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                    if (z0.I(str)) {
                        q3Var = q3.NAUTICAL_MILES_PER_HOUR;
                    } else {
                        q3Var = zY ? q3.KILOMETER_PER_HOUR : q3.MILE_PER_HOUR;
                    }
                    string = bVar.getString(q3Var.f23223e);
                    break;
                case 10:
                    string = bVar.getString(zY ? R.string.lbl_meters_per_hour_short_abbrev : R.string.lbl_ft_per_hour);
                    break;
                case 11:
                case 12:
                case 13:
                case 14:
                case 15:
                    string = bVar.getString(R.string.lbl_bpm);
                    break;
                case 16:
                case 17:
                case 18:
                case 19:
                    string = bVar.getString(zY ? R.string.lbl_celsius : R.string.lbl_fahrenheit);
                    break;
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                    string = bVar.getString(R.string.lbl_watts);
                    break;
                case 25:
                case 26:
                case 27:
                    string = bVar.getString(R.string.lbl_newton_abbreviation);
                    break;
                case 28:
                case 29:
                    string = bVar.getString(R.string.lbl_spm);
                    break;
                case 30:
                case 31:
                    string = bVar.getString(R.string.lbl_rpm);
                    break;
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                    if (!zY) {
                        i16 = R.string.lbl_foot;
                    }
                    string = bVar.getString(i16);
                    break;
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                    if (zJ0) {
                        i14 = R.string.lbl_minute_500_meters;
                    } else if (zI) {
                        i14 = R.string.lbl_minute_per_nautical_mile;
                    } else {
                        i14 = zY ? R.string.lbl_minute_per_km : R.string.lbl_minute_per_mile;
                    }
                    string = bVar.getString(i14);
                    break;
                case 43:
                    string = bVar.getString(R.string.calories_abbreviation);
                    break;
                case 44:
                    string = bVar.getString(R.string.lbl_meter);
                    break;
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    string = bVar.getString(q3.NAUTICAL_MILES_PER_HOUR.f23223e);
                    break;
                case 50:
                case 51:
                case 52:
                case 53:
                    string = bVar.getString((zY ? q3.KILOMETER_PER_HOUR : q3.MILE_PER_HOUR).f23223e);
                    break;
                case 54:
                    string = bVar.getString(R.string.lbl_ms);
                    break;
                case 55:
                    string = bVar.getString(R.string.common_abbrev_centimeters_per_second);
                    break;
                case 56:
                    string = bVar.getString(R.string.lbl_cm);
                    break;
                case 57:
                case 58:
                    string = bVar.getString(R.string.percent_sign);
                    break;
                case 59:
                    string = bVar.getString(zY ? R.string.lbl_kg : R.string.lbl_lbs);
                    break;
                default:
                    string = "";
                    break;
            }
            String str2 = string;
            float f14 = iVar.f172257b;
            boolean z14 = hVar.f172206b;
            Context context = this.f172174a;
            String strA = iVar.a(context);
            oi0.b bVar2 = new oi0.b(new l22.a(context), iVar.a(context));
            switch (i.a.f172258a[iVar.ordinal()]) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                case 11:
                case 12:
                case 13:
                case 14:
                case 15:
                case 16:
                case 17:
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                    bVar2.a();
                    break;
                case 29:
                case 30:
                case 31:
                    bVar2.E();
                    break;
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                case 50:
                    String str3 = bVar2.f132238b;
                    l22.b bVar3 = bVar2.f132237a;
                    bVar2.f132238b = u.v(str3, bVar3.getString(R.string.common_max), bVar3.getString(R.string.lbl_maximum), false);
                    break;
                default:
                    Unit unit = Unit.INSTANCE;
                    break;
            }
            arrayList.add(new e(f14, z14, strA, bVar2.f132238b, str2, this.f172177d.l(str2)));
        }
        return arrayList;
    }
}
