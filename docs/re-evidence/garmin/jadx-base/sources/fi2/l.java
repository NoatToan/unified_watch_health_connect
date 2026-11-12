package fi2;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import java.text.ParseException;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import org.joda.time.DateTime;
import p005kotlin.Metadata;
import p13.u0;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0010\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lfi2/l;", "Lei2/h;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "androiddynamicsettings_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public class l extends ei2.h {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final hi2.d f71799c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(Context context) {
        super(context);
        context.getClass();
        this.f71799c = new hi2.d("DatePickerTransform", null, 2, null);
    }

    @Override // ei2.h
    public final String f(ii2.b bVar, Map<String, ? extends Object> map) {
        Date date;
        String strE = ei2.h.e(bVar, map);
        this.f71799c.getClass();
        hi2.b.f83885a.getClass();
        if (strE.length() > 0) {
            try {
                date = hi2.b.f83887c.parse(strE);
            } catch (ParseException unused) {
                date = null;
            }
        } else {
            date = null;
        }
        String str = date != null ? hi2.b.f83888d.format(date) : null;
        return str == null ? "--" : str;
    }

    @Override // ei2.h
    public final HashMap i(ii2.b bVar, Map map, int i14) {
        DateTime dateTime;
        String strE = ei2.h.e(bVar, map);
        this.f71799c.getClass();
        DateTime dateTimeMinusYears = new DateTime().minusYears(100);
        DateTime dateTimePlusYears = new DateTime().plusYears(100);
        hi2.b.f83885a.getClass();
        if (strE.length() > 0) {
            try {
                dateTime = new DateTime(hi2.b.f83887c.parse(strE));
            } catch (ParseException unused) {
                dateTime = null;
            }
        } else {
            dateTime = null;
        }
        if (dateTime == null) {
            dateTime = DateTime.now();
        }
        return u0.d(new o13.p(mh2.i.DS_MINIMUM_VALUE.f118617a, dateTimeMinusYears), new o13.p(mh2.i.DS_MAXIMUM_VALUE.f118617a, dateTimePlusYears), new o13.p(mh2.i.DS_SELECTED_VALUE.f118617a, dateTime));
    }

    @Override // ei2.h
    public final void n(ii2.b bVar, Map<String, ? extends Object> map, Object obj) {
        String str;
        bVar.getClass();
        map.getClass();
        if (!(obj instanceof Integer[])) {
            obj = null;
        }
        Integer[] numArr = (Integer[]) obj;
        if (numArr != null) {
            if (numArr.length > 2) {
                hi2.b.a aVar = hi2.b.f83885a;
                int iIntValue = numArr[0].intValue();
                int iIntValue2 = numArr[1].intValue();
                int iIntValue3 = numArr[2].intValue();
                aVar.getClass();
                str = hi2.b.f83887c.format(new DateTime(iIntValue, iIntValue2, iIntValue3, 0, 0).toDate());
                str.getClass();
            } else {
                this.f71799c.getClass();
                str = "";
            }
            Object obj2 = map.get(mh2.i.VALUE_ID.f118617a);
            obj2.getClass();
            bVar.L4(str, (String) obj2);
        }
    }
}
