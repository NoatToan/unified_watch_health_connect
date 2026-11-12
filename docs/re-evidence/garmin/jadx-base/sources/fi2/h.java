package fi2;

import android.content.Context;
import android.util.MalformedJsonException;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.x0;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lfi2/h;", "Lei2/h;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "androiddynamicsettings_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class h extends ei2.h {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final hi2.d f71793c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(Context context) {
        super(context);
        context.getClass();
        this.f71793c = new hi2.d("CustomStrideCalculationTransform", null, 2, null);
    }

    @Override // ei2.h
    public final String f(ii2.b bVar, Map<String, ? extends Object> map) throws MalformedJsonException {
        List listG4 = ii2.b.G4(map);
        if (listG4 == null) {
            return "--";
        }
        Iterator it = listG4.iterator();
        String string = "";
        double d14 = 0.0d;
        double d15 = 0.0d;
        while (true) {
            boolean zHasNext = it.hasNext();
            Context context = this.f64388a;
            if (!zHasNext) {
                if (d14 <= 0.0d) {
                    return "--";
                }
                hi2.a.C1658a c1658a = hi2.a.f83879a;
                Double dValueOf = Double.valueOf(d15 / d14);
                c1658a.getClass();
                DecimalFormat decimalFormat = hi2.a.f83882d;
                decimalFormat.getClass();
                String strB = hi2.a.C1658a.b(String.valueOf(dValueOf), decimalFormat);
                x0 x0Var = x0.f105818a;
                String string2 = context.getString(R.string.generic_value_with_unit_string);
                string2.getClass();
                return String.format(string2, Arrays.copyOf(new Object[]{strB, string}, 2));
            }
            Map map2 = (Map) it.next();
            String strE = ei2.h.e(bVar, map2);
            String strValueOf = String.valueOf(map2.get(mh2.i.ID.f118617a));
            this.f71793c.getClass();
            if (strValueOf.equals(mh2.m.DISTANCE.f118678a)) {
                d15 = strE.length() > 0 ? Double.parseDouble(strE) : 0.0d;
            } else if (strValueOf.equals(mh2.m.STEPS.f118678a)) {
                d14 = strE.length() > 0 ? Double.parseDouble(strE) : 0.0d;
            } else if (strValueOf.equals(mh2.m.UNIT.f118678a) && strE.length() > 0) {
                mh2.f fVar = mh2.f.FOOT;
                if (strE.equals(fVar.f118549a)) {
                    string = context.getString(fVar.f118550b);
                    string.getClass();
                } else {
                    mh2.f fVar2 = mh2.f.METER;
                    if (!strE.equals(fVar2.f118549a)) {
                        throw new MalformedJsonException(strE.concat(" is not a valid distance unit"));
                    }
                    string = context.getString(fVar2.f118550b);
                    string.getClass();
                }
            }
        }
    }
}
