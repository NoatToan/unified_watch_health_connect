package defpackage;

import com.xiaomi.fitness.common.utils.TimeUtils;
import com.xiaomi.fitness.watch.face.edit.entity.DialWidgetType;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes7.dex */
public class r8r extends c17 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Map<ljh<String, String>, Integer> f32326a;

    static {
        HashMap map = new HashMap();
        f32326a = map;
        map.put(new ljh("00:00", "06:00"), 3);
        map.put(new ljh("06:00", "08:00"), 8);
        map.put(new ljh("08:00", "11:00"), 10);
        map.put(new ljh("11:00", "12:00"), 12);
        map.put(new ljh("12:00", "17:00"), 16);
        map.put(new ljh("17:00", "18:00"), 18);
        map.put(new ljh("18:00", "23:59"), 21);
    }

    public static String b(mq5 mq5Var) throws ParseException {
        return dq5.a(mq5Var.g()).C("yyyyMMdd");
    }

    private static String c(mq5 mq5Var) throws ParseException {
        return dq5.a(mq5Var.g()).C("yyyyMMdd HH:mm");
    }

    private static String d(mq5 mq5Var) throws ParseException {
        return dq5.a(mq5Var.d()).C("yyyyMMdd") + "/" + dq5.a(mq5Var.a()).C("yyyyMMdd");
    }

    public static String e(mq5 mq5Var) throws ParseException {
        dq5 dq5VarA = dq5.a(mq5Var.d());
        ljh ljhVar = new ljh(dq5VarA.C(TimeUtils.FORMAT_H_M), dq5.a(mq5Var.a()).C(TimeUtils.FORMAT_H_M));
        Map<ljh<String, String>, Integer> map = f32326a;
        return dq5VarA.G(map.containsKey(ljhVar) ? map.get(ljhVar).intValue() : 0).J(0).L(0).C("yyyyMMdd HH:mm");
    }

    public static String f(mq5 mq5Var, dq5 dq5Var) throws ParseException {
        return dq5Var.C("yyyyMMdd") + "/" + dq5.a(mq5Var.a()).C("yyyyMMdd");
    }

    @Override // defpackage.c17
    public List<q69> a(List<q69> list, dq5 dq5Var, TimeZone timeZone) throws ParseException {
        ArrayList arrayList = new ArrayList();
        for (q69 q69Var : list) {
            Iterator<Map.Entry<String, mq5>> it = q69Var.e().entrySet().iterator();
            while (it.hasNext()) {
                mq5 value = it.next().getValue();
                if (value.c().equals(DialWidgetType.DATE)) {
                    q69Var.a(DialWidgetType.DATE, b(value));
                } else if (value.c().equals("date_time")) {
                    q69Var.a("time", c(value));
                    q69Var.a(DialWidgetType.DATE, b(value));
                } else if (value.c().equals("part_of_day")) {
                    q69Var.a("time", e(value));
                } else if (value.f().equals("duration")) {
                    if (value.c().equals("recent")) {
                        q69Var.a("duration", f(value, dq5Var));
                    } else {
                        q69Var.a("duration", d(value));
                    }
                }
            }
            if (q69Var.e().size() > 0) {
                arrayList.add(q69Var);
            }
        }
        return arrayList;
    }
}
