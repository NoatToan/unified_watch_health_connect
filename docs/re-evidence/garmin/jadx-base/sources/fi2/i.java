package fi2;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import com.google.gson.stream.MalformedJsonException;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.x0;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lfi2/i;", "Lei2/b;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "androiddynamicsettings_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class i extends ei2.b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final hi2.d f71795d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(Context context) {
        super(context);
        context.getClass();
        this.f71795d = new hi2.d("CustomStrideDistanceTransform", null, 2, null);
    }

    @Override // ei2.b, ei2.h
    public final String f(ii2.b bVar, Map<String, ? extends Object> map) throws MalformedJsonException {
        Unit unit;
        Map map2;
        String string;
        String strE = ei2.h.e(bVar, map);
        if (strE.length() <= 0) {
            return "--";
        }
        hi2.a.f83879a.getClass();
        if (hi2.a.C1658a.h(strE) == -1) {
            return "--";
        }
        List listG4 = ii2.b.G4(map);
        if (listG4 == null || (map2 = (Map) p13.h0.d0(listG4)) == null) {
            unit = null;
        } else {
            if (p005kotlin.jvm.internal.s.g(map2.get(mh2.i.ID.f118617a), mh2.m.UNIT.f118678a)) {
                String strD = d(bVar, String.valueOf(map2.get(mh2.i.VALUE_ID.f118617a)));
                mh2.f fVar = mh2.f.FOOT;
                boolean zEquals = strD.equals(fVar.f118549a);
                Context context = this.f64388a;
                if (zEquals) {
                    string = context.getString(fVar.f118550b);
                } else {
                    mh2.f fVar2 = mh2.f.METER;
                    if (!strD.equals(fVar2.f118549a)) {
                        throw new MalformedJsonException(am.j.m("[", strD, "] is not a valid distance unit"));
                    }
                    string = context.getString(fVar2.f118550b);
                }
                string.getClass();
                x0 x0Var = x0.f105818a;
                String string2 = context.getString(R.string.generic_value_with_unit_string, String.valueOf(hi2.a.C1658a.h(strE)), string);
                string2.getClass();
                return String.format(string2, Arrays.copyOf(new Object[0], 0));
            }
            unit = Unit.INSTANCE;
        }
        return unit == null ? strE : "--";
    }

    @Override // ei2.b
    /* JADX INFO: renamed from: r, reason: from getter */
    public final hi2.d getF71803d() {
        return this.f71795d;
    }
}
