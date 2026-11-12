package fi2;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import p005kotlin.Metadata;
import p13.u0;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0010\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lfi2/e0;", "Lei2/h;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "a", "androiddynamicsettings_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public class e0 extends ei2.h {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final hi2.d f71787c;

    static {
        new a(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(Context context) {
        super(context);
        context.getClass();
        this.f71787c = new hi2.d("TimePickerTransform", null, 2, null);
    }

    @Override // ei2.h
    public final String f(ii2.b bVar, Map<String, ? extends Object> map) {
        String strE = ei2.h.e(bVar, map);
        this.f71787c.getClass();
        if (strE.length() <= 0) {
            return "--";
        }
        hi2.a.f83879a.getClass();
        long jA = hi2.a.C1658a.a(strE);
        DateTimeFormatter dateTimeFormatterWithZone = DateTimeFormat.forPattern("h:mm a").withZone(DateTimeZone.UTC);
        dateTimeFormatterWithZone.getClass();
        String strPrint = dateTimeFormatterWithZone.print(new DateTime(jA * 1000));
        strPrint.getClass();
        return strPrint;
    }

    @Override // ei2.h
    public final HashMap i(ii2.b bVar, Map map, int i14) {
        String strE = ei2.h.e(bVar, map);
        hi2.a.f83879a.getClass();
        long jA = hi2.a.C1658a.a(strE) * 1000;
        long j8 = jA / 3600000;
        if (i14 == 1) {
            int i15 = (int) j8;
            o13.p pVar = new o13.p(mh2.i.DS_MINIMUM_VALUE.f118617a, new Integer(1));
            o13.p pVar2 = new o13.p(mh2.i.DS_MAXIMUM_VALUE.f118617a, new Integer(12));
            String str = mh2.i.DS_SELECTED_VALUE.f118617a;
            if (i15 > 12) {
                i15 -= 12;
            } else if (i15 == 0) {
                i15 += 12;
            }
            return u0.d(pVar, pVar2, new o13.p(str, new Integer(i15)));
        }
        if (i14 != 2) {
            if (i14 != 3) {
                return new HashMap();
            }
            Context context = this.f64388a;
            String string = context.getString(R.string.settings_morning_abbreviation);
            return u0.d(new o13.p(mh2.i.DS_MINIMUM_VALUE.f118617a, new Integer(0)), new o13.p(mh2.i.DS_MAXIMUM_VALUE.f118617a, new Integer(1)), new o13.p(mh2.i.DS_POSSIBLE_VALUES.f118617a, new String[]{string, p6.b.d(context, R.string.settings_evening_abbreviation, string)}), new o13.p(mh2.i.DS_SELECTED_VALUE.f118617a, new Integer(j8 < 12 ? 0 : 1)));
        }
        long millis = (jA - TimeUnit.HOURS.toMillis(j8)) / 60000;
        DecimalFormat decimalFormat = new DecimalFormat("00");
        String[] strArr = new String[60];
        for (int i16 = 0; i16 < 60; i16++) {
            strArr[i16] = decimalFormat.format(new Integer(i16));
        }
        return u0.d(new o13.p(mh2.i.DS_MINIMUM_VALUE.f118617a, new Integer(0)), new o13.p(mh2.i.DS_MAXIMUM_VALUE.f118617a, new Integer(59)), new o13.p(mh2.i.DS_POSSIBLE_VALUES.f118617a, strArr), new o13.p(mh2.i.DS_SELECTED_VALUE.f118617a, new Integer((int) millis)));
    }

    @Override // ei2.h
    public void n(ii2.b bVar, Map<String, ? extends Object> map, Object obj) {
        bVar.getClass();
        map.getClass();
        if (!(obj instanceof List)) {
            obj = null;
        }
        List list = (List) obj;
        if (list != null) {
            int iIntValue = ((Number) list.get(0)).intValue();
            int iIntValue2 = ((Number) list.get(1)).intValue();
            int iIntValue3 = ((Number) list.get(2)).intValue();
            bVar.L4(Long.valueOf(TimeUnit.HOURS.toSeconds((iIntValue3 == 0 && iIntValue == 12) ? 0 : iIntValue) + TimeUnit.MINUTES.toSeconds(iIntValue2) + (iIntValue3 == 1 ? 43200L : 0L)), String.valueOf(map.get(mh2.i.VALUE_ID.f118617a)));
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006¨\u0006\f"}, d2 = {"Lfi2/e0$a;", "", "<init>", "()V", "", "AM_PICKER_VALUE", "I", "MAXIMUM_HOURS", "MAXIMUM_MINUTES", "MINIMUM_HOURS", "MINIMUM_MINUTES", "PM_PICKER_VALUE", "androiddynamicsettings_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
