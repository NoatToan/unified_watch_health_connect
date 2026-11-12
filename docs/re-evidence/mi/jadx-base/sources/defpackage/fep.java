package defpackage;

import com.google.gson.JsonObject;
import com.xiaomi.ai.nlp.factoid.entities.datetime.DateType;
import com.xiaomi.ai.nlp.factoid.entities.datetime.GrainType;
import com.xiaomi.fitness.health.sleep.ui.SleepAnimalShareActivity;
import com.xiaomi.fitness.watch.face.edit.entity.DialWidgetType;
import com.xiaomi.smarthome.device.utils.DeviceTagInterface;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes7.dex */
public class fep extends c17 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Pattern f17714a = Pattern.compile("农历|阴历|正月|初|闰|冬月");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Pattern f17715b = Pattern.compile("现在|当前");

    @Override // defpackage.c17
    public List<q69> a(List<q69> list, dq5 dq5Var, TimeZone timeZone) throws ParseException {
        ArrayList arrayList = new ArrayList();
        for (q69 q69Var : list) {
            String strI = q69Var.i();
            for (Map.Entry<String, mq5> entry : q69Var.e().entrySet()) {
                if (entry.getKey().equals("lunar_date")) {
                    if (f17714a.matcher(strI).find()) {
                        boolean zB = entry.getValue().b();
                        long j = dq5.j(entry.getValue().g());
                        arrayList.add(b(q69Var, j, j, entry.getKey(), zB));
                    }
                } else if (entry.getKey().equals("date_time") || entry.getKey().equals(DialWidgetType.DATE)) {
                    if (!f17715b.matcher(q69Var.i()).find()) {
                        boolean zB2 = entry.getValue().b();
                        long j2 = dq5.j(entry.getValue().g());
                        arrayList.add(b(q69Var, j2, j2, entry.getKey(), zB2));
                    }
                } else if (entry.getKey().equals("duration") && q69Var.i().contains("到")) {
                    int iIndexOf = q69Var.i().indexOf(21040);
                    mq5 mq5Var = new mq5();
                    DateType dateType = DateType.DATETIME;
                    mq5Var.p(dateType.getType());
                    GrainType grainType = GrainType.DATETIME;
                    mq5Var.k(grainType);
                    mq5Var.q(entry.getValue().d());
                    HashMap map = new HashMap();
                    map.put(dateType.getType(), mq5Var);
                    q69 q69Var2 = new q69(q69Var.b(), q69Var.b() + iIndexOf, q69Var.i().substring(0, iIndexOf), new HashMap(), map);
                    long j3 = dq5.j(entry.getValue().d());
                    arrayList.add(b(q69Var2, j3, j3, dateType.getType(), false));
                    mq5 mq5Var2 = new mq5();
                    mq5Var2.p(dateType.getType());
                    mq5Var2.k(grainType);
                    mq5Var2.q(entry.getValue().d());
                    HashMap map2 = new HashMap();
                    map.put(dateType.getType(), mq5Var2);
                    q69 q69Var3 = new q69(q69Var.b() + iIndexOf + 1, q69Var.c(), q69Var.i().substring(iIndexOf + 1), new HashMap(), map2);
                    long j4 = dq5.j(entry.getValue().a());
                    arrayList.add(b(q69Var3, j4, j4, dateType.getType(), false));
                } else {
                    b(q69Var, dq5.j(entry.getValue().d()), dq5.j(entry.getValue().a()), DateType.DURATION.getType(), false);
                    arrayList.add(q69Var);
                }
            }
        }
        return arrayList;
    }

    public final q69 b(q69 q69Var, long j, long j2, String str, boolean z) {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("token", q69Var.i());
        jsonObject.addProperty("norm_token", q69Var.d());
        jsonObject.addProperty("type", str);
        if (str.equals("duration")) {
            jsonObject.addProperty("start_ts", String.valueOf(j));
            jsonObject.addProperty("end_ts", String.valueOf(j2));
            jsonObject.addProperty("festivalFlag", Boolean.FALSE);
        } else {
            jsonObject.addProperty(DeviceTagInterface.TAG_DATA_START, String.valueOf(j));
            jsonObject.addProperty("festivalFlag", Boolean.valueOf(z));
        }
        HashMap map = new HashMap();
        map.put(SleepAnimalShareActivity.PARAM_ANIMAL_START_TIME, jsonObject.toString());
        q69Var.m(map);
        return q69Var;
    }
}
