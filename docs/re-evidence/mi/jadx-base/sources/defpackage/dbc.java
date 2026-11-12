package defpackage;

import com.xiaomi.fitness.watch.face.edit.entity.DialWidgetType;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes7.dex */
public class dbc extends c17 {
    public static String b(mq5 mq5Var) throws ParseException {
        return dq5.a(mq5Var.g()).C("yyyyMMdd");
    }

    public static String c(mq5 mq5Var) throws ParseException {
        String strC = dq5.a(mq5Var.d()).C("yyyyMMdd");
        String strC2 = dq5.a(mq5Var.a()).C("yyyyMMdd");
        if (strC.equals(strC2)) {
            return strC;
        }
        return strC + "<" + strC2;
    }

    @Override // defpackage.c17
    public List<q69> a(List<q69> list, dq5 dq5Var, TimeZone timeZone) throws ParseException {
        ArrayList arrayList = new ArrayList();
        for (q69 q69Var : list) {
            Iterator<Map.Entry<String, mq5>> it = q69Var.e().entrySet().iterator();
            while (it.hasNext()) {
                mq5 value = it.next().getValue();
                if (value.f().equals("date_time") || value.f().equals(DialWidgetType.DATE)) {
                    q69Var.a("time", b(value));
                } else if (value.f().equals("duration")) {
                    q69Var.a("time", c(value));
                }
            }
            if (q69Var.e().size() > 0) {
                arrayList.add(q69Var);
            }
        }
        return list;
    }
}
