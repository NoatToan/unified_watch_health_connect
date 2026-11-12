package defpackage;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;
import com.xiaomi.ai.nlp.factoid.entities.datetime.GrainType;
import com.xiaomi.fit.fitness.parser.sport.track.parser.ParserHelper;
import com.xiaomi.fitness.watch.face.edit.entity.DialWidgetType;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes7.dex */
public class t21 extends c17 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Gson f34219a = new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES).create();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Pattern f34220b = Pattern.compile("上午|下午|中午|早上|早晨|凌晨|晚上|傍晚|今早|今晚|明早|明晚");
    public static Pattern c = Pattern.compile("当前|现在|此时此刻|此时|此刻");

    public static void b(Map<String, String> map, String str) {
        map.remove(str);
    }

    public static mq5 c(mq5 mq5Var) throws ParseException {
        mq5 mq5Var2 = new mq5();
        mq5Var2.p(mq5Var.f());
        mq5Var2.k(GrainType.DATE);
        dq5 dq5VarA = dq5.a(mq5Var.g());
        mq5Var2.m(dq5VarA.O().C(ParserHelper.DATA_FORMAT4));
        mq5Var2.h(dq5VarA.N().C(ParserHelper.DATA_FORMAT4));
        return mq5Var2;
    }

    public static void d(String str, String str2, mq5 mq5Var, Map<String, String> map, TimeZone timeZone) throws ParseException {
        JsonObject jsonObject = (JsonObject) f34219a.toJsonTree(mq5Var);
        jsonObject.addProperty("token", str);
        if (jlo.a(mq5Var.g())) {
            jsonObject.addProperty("value_timestamp", Long.valueOf(dq5.k(mq5Var.g(), timeZone)));
        }
        if (jlo.a(mq5Var.d())) {
            jsonObject.addProperty("start_timestamp", Long.valueOf(dq5.k(mq5Var.d(), timeZone)));
        }
        if (jlo.a(mq5Var.a())) {
            jsonObject.addProperty("end_timestamp", Long.valueOf(dq5.k(mq5Var.a(), timeZone)));
        }
        jsonObject.remove("exceptional");
        map.put(str2, jsonObject.toString());
    }

    @Override // defpackage.c17
    public List<q69> a(List<q69> list, dq5 dq5Var, TimeZone timeZone) throws ParseException {
        ArrayList arrayList = new ArrayList();
        Iterator<q69> it = list.iterator();
        while (it.hasNext()) {
            q69 next = it.next();
            if (next.e().size() != 0) {
                if (c.matcher(next.i()).find()) {
                    it.remove();
                } else {
                    HashMap map = new HashMap();
                    Iterator<Map.Entry<String, mq5>> it2 = next.e().entrySet().iterator();
                    while (it2.hasNext()) {
                        mq5 value = it2.next().getValue();
                        d(next.i(), value.f(), value, map, timeZone);
                        if (value.f().equals("date_time") || value.f().equals(DialWidgetType.DATE) || value.f().equals("lunar_date")) {
                            if (value.c().equals(DialWidgetType.DATE) || value.c().equals("lunar_date")) {
                                mq5 mq5VarC = c(value);
                                HashMap map2 = new HashMap();
                                map2.put("duration", mq5VarC);
                                next.k(map2);
                                d(next.i(), "duration", mq5VarC, map, timeZone);
                            } else if (!value.c().equals("date_time") || value.e() == null || value.e().equals("offset")) {
                                if (value.e().equals("offset")) {
                                    HashMap map3 = new HashMap();
                                    map3.put("offset", value);
                                    next.k(map3);
                                    d(next.i(), "offset", value, map, timeZone);
                                }
                            } else if (!f34220b.matcher(next.i()).find()) {
                                dq5 dq5VarB = dq5.b(value.g(), timeZone);
                                long jI = new dq5(timeZone).O().v((int) ((dq5VarB.i() - new dq5(timeZone).O().i()) / 86400000)).i();
                                if (dq5VarB.i() > jI && dq5VarB.i() < jI + 43200000) {
                                    if (dq5VarB.i() < dq5Var.i() && next.i().contains("今天")) {
                                        value.q(new dq5(dq5.k(value.g(), timeZone) + 43200000, timeZone).C(ParserHelper.DATA_FORMAT4));
                                    } else if (dq5VarB.i() >= dq5Var.i() || dq5VarB.i() + 43200000 >= dq5Var.i()) {
                                        HashMap map4 = new HashMap();
                                        map4.put("date_time", value);
                                        next.k(map4);
                                    }
                                }
                            }
                        }
                        b(map, DialWidgetType.DATE);
                        b(map, "lunar_date");
                    }
                    next.m(map);
                    arrayList.add(next);
                }
            }
        }
        return arrayList;
    }
}
