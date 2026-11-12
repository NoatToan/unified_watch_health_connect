package defpackage;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
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
public class r6o extends c17 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Gson f32249a = new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES).create();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Pattern f32250b = Pattern.compile("上午|下午|中午|早上|早晨|凌晨|晚上|傍晚|今早|今晚|明早|明晚");
    public static Pattern c = Pattern.compile("当前|现在|此时此刻|此时|此刻");

    private static mq5 b(mq5 mq5Var) throws ParseException {
        mq5 mq5Var2 = new mq5();
        mq5Var2.p("duration");
        mq5Var2.k(GrainType.DATE);
        dq5 dq5VarA = dq5.a(mq5Var.g());
        mq5Var2.m(dq5VarA.O().C(ParserHelper.DATA_FORMAT4));
        mq5Var2.h(dq5VarA.N().C(ParserHelper.DATA_FORMAT4));
        return mq5Var2;
    }

    private static void c(String str, String str2, mq5 mq5Var, Map<String, String> map, TimeZone timeZone) throws ParseException {
        Gson gson = f32249a;
        JsonObject jsonObject = (JsonObject) gson.toJsonTree(mq5Var);
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
        map.put(str2, gson.toJson((JsonElement) jsonObject));
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
                        c(next.i(), "datetime", value, map, timeZone);
                        if (value.f().equals("date_time") || value.f().equals(DialWidgetType.DATE)) {
                            if (value.c().equals(DialWidgetType.DATE)) {
                                c(next.i(), "datetime", b(value), map, timeZone);
                            }
                        }
                    }
                    next.m(map);
                    arrayList.add(next);
                }
            }
        }
        return arrayList;
    }
}
