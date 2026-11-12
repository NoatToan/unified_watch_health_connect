package fi2;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.joda.time.DateTimeConstants;
import p005kotlin.Metadata;
import p13.u0;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lfi2/f0;", "Lei2/h;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "a", "androiddynamicsettings_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class f0 extends ei2.h {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final hi2.d f71790c;

    static {
        new a(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(Context context) {
        super(context);
        context.getClass();
        this.f71790c = new hi2.d("TotalBottomTimeTransform", hi2.e.BOTTOM_TIME.f83902a);
    }

    @Override // ei2.h
    public final String f(ii2.b bVar, Map<String, ? extends Object> map) {
        String strE = ei2.h.e(bVar, map);
        this.f71790c.getClass();
        return strE.length() > 0 ? new hi2.j(strE).toString() : "--";
    }

    @Override // ei2.h
    public final HashMap i(ii2.b bVar, Map map, int i14) {
        HashMap mapD;
        String str;
        int i15;
        String strE = ei2.h.e(bVar, map);
        hi2.a.f83879a.getClass();
        String strB = hi2.a.C1658a.b(strE, hi2.a.f83881c);
        if (i14 == 1) {
            mapD = u0.d(new o13.p(mh2.i.DS_MINIMUM_VALUE.f118617a, new Integer(0)), new o13.p(mh2.i.DS_MAXIMUM_VALUE.f118617a, new Integer(9999)), new o13.p(mh2.i.DS_LABEL_VALUE.f118617a, ei2.h.g(this, R.string.lbl_hour)));
            if (strB.length() <= 0) {
                return mapD;
            }
            str = mh2.i.DS_SELECTED_VALUE.f118617a;
            i15 = new hi2.j(strB).f83909a;
        } else {
            if (i14 != 2) {
                if (i14 != 3) {
                    return new HashMap();
                }
                mapD = u0.d(new o13.p(mh2.i.DS_MINIMUM_VALUE.f118617a, new Integer(0)), new o13.p(mh2.i.DS_MAXIMUM_VALUE.f118617a, new Integer(59)), new o13.p(mh2.i.DS_LABEL_VALUE.f118617a, ei2.h.g(this, R.string.lbl_second)));
                if (strB.length() > 0) {
                    str = mh2.i.DS_SELECTED_VALUE.f118617a;
                    i15 = new hi2.j(strB).f83911c;
                }
                return mapD;
            }
            mapD = u0.d(new o13.p(mh2.i.DS_MINIMUM_VALUE.f118617a, new Integer(0)), new o13.p(mh2.i.DS_MAXIMUM_VALUE.f118617a, new Integer(59)), new o13.p(mh2.i.DS_LABEL_VALUE.f118617a, ei2.h.g(this, R.string.common_min_abbreviated_without_period)));
            if (strB.length() <= 0) {
                return mapD;
            }
            str = mh2.i.DS_SELECTED_VALUE.f118617a;
            i15 = new hi2.j(strB).f83910b;
        }
        ds.e0.o(i15, mapD, str);
        return mapD;
    }

    @Override // ei2.h
    public final void n(ii2.b bVar, Map<String, ? extends Object> map, Object obj) {
        bVar.getClass();
        map.getClass();
        Object objValueOf = null;
        if (!(obj instanceof List)) {
            obj = null;
        }
        List list = (List) obj;
        if (list != null) {
            hi2.j jVar = new hi2.j(((Number) list.get(0)).intValue(), ((Number) list.get(1)).intValue(), ((Number) list.get(2)).intValue());
            objValueOf = Integer.valueOf((jVar.f83910b * 60) + (jVar.f83909a * DateTimeConstants.SECONDS_PER_HOUR) + jVar.f83911c);
        }
        String strValueOf = String.valueOf(map.get(mh2.i.VALUE_ID.f118617a));
        if (objValueOf == null) {
            objValueOf = "";
        }
        bVar.L4(objValueOf, strValueOf);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006¨\u0006\f"}, d2 = {"Lfi2/f0$a;", "", "<init>", "()V", "", "MAXIMUM_BOTTOM_TIME_HOURS", "I", "MAXIMUM_BOTTOM_TIME_MINUTES", "MAXIMUM_BOTTOM_TIME_SECONDS", "MINIMUM_BOTTOM_TIME_HOURS", "MINIMUM_BOTTOM_TIME_MINUTES", "MINIMUM_BOTTOM_TIME_SECONDS", "androiddynamicsettings_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
