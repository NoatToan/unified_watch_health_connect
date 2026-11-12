package fi2;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import p005kotlin.Metadata;
import p13.u0;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lfi2/s;", "Lei2/h;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "a", "androiddynamicsettings_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class s extends ei2.h {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final hi2.d f71805c;

    static {
        new a(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(Context context) {
        super(context);
        context.getClass();
        this.f71805c = new hi2.d("ModerateIntensityZoneTransform", null, 2, null);
    }

    @Override // ei2.h
    public final String f(ii2.b bVar, Map<String, ? extends Object> map) {
        hi2.d dVar = this.f71805c;
        boolean zK4 = bVar.K4(map);
        Context context = this.f64388a;
        if (!zK4) {
            String string = context.getString(R.string.lbl_auto_abbreviation);
            string.getClass();
            return string;
        }
        try {
            hi2.a.C1658a c1658a = hi2.a.f83879a;
            String strE = ei2.h.e(bVar, map);
            c1658a.getClass();
            int iH = hi2.a.C1658a.h(strE);
            if (iH <= 0) {
                iH = 3;
            }
            String string2 = context.getString(R.string.heart_rate_zone_name, String.valueOf(iH));
            string2.getClass();
            dVar.getClass();
            return string2;
        } catch (NumberFormatException unused) {
            dVar.getClass();
            return "--";
        }
    }

    @Override // ei2.h
    public final HashMap i(ii2.b bVar, Map map, int i14) {
        Map map2;
        hi2.a.C1658a c1658a = hi2.a.f83879a;
        String strE = ei2.h.e(bVar, map);
        c1658a.getClass();
        int iH = hi2.a.C1658a.h(strE);
        if (iH <= 0) {
            iH = 3;
        }
        List<Map<String, Object>> listC4 = bVar.C4(map);
        int i15 = 4;
        hi2.d dVar = this.f71805c;
        if (listC4 == null || (map2 = (Map) p13.h0.d0(listC4)) == null) {
            dVar.getClass();
        } else {
            int iH2 = hi2.a.C1658a.h(ei2.h.e(bVar, map2));
            dVar.getClass();
            if (iH2 > 0) {
                i15 = iH2;
            }
        }
        int i16 = i15 - 1;
        String[] strArr = new String[i16];
        int i17 = 0;
        while (i17 < i16) {
            int i18 = i17 + 1;
            strArr[i17] = this.f64388a.getString(R.string.heart_rate_zone_name, String.valueOf(i18));
            i17 = i18;
        }
        return u0.d(new o13.p(mh2.i.DS_POSSIBLE_VALUES.f118617a, strArr), new o13.p(mh2.i.DS_SELECTED_VALUE.f118617a, new Integer(iH)), new o13.p(mh2.i.DS_MINIMUM_VALUE.f118617a, new Integer(1)), new o13.p(mh2.i.DS_MAXIMUM_VALUE.f118617a, new Integer(i16)));
    }

    @Override // ei2.h
    public final void n(ii2.b bVar, Map<String, ? extends Object> map, Object obj) {
        bVar.getClass();
        map.getClass();
        Objects.toString(obj);
        this.f71805c.getClass();
        bVar.L4(String.valueOf(obj), String.valueOf(map.get(mh2.i.VALUE_ID.f118617a)));
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lfi2/s$a;", "", "<init>", "()V", "", "DEFAULT_MODERATE_ZONE", "I", "DEFAULT_VIGOROUS_ZONE", "MINIMUM_MODERATE_ZONE", "androiddynamicsettings_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
