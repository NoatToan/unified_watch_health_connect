package defpackage;

import com.xiaomi.fitness.watch.face.edit.entity.DialWidgetType;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes7.dex */
public class at5 extends c17 {
    @Override // defpackage.c17
    public List<q69> a(List<q69> list, dq5 dq5Var, TimeZone timeZone) throws ParseException {
        ArrayList arrayList = new ArrayList();
        for (q69 q69Var : list) {
            Iterator<Map.Entry<String, mq5>> it = q69Var.e().entrySet().iterator();
            while (it.hasNext()) {
                mq5 value = it.next().getValue();
                if (value.f().equals("date_time")) {
                    q69Var.a("date_time", value.g());
                } else if (value.f().equals(DialWidgetType.DATE)) {
                    q69Var.a(DialWidgetType.DATE, value.g());
                } else if (value.f().equals("duration")) {
                    q69Var.a("duration", value.d() + "<" + value.a());
                }
            }
            if (q69Var.e().size() > 0) {
                arrayList.add(q69Var);
            }
        }
        return arrayList;
    }
}
