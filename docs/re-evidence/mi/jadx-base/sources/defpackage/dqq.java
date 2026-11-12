package defpackage;

import com.xiaomi.ai.nlp.factoid.FactoidExtractor;
import com.xiaomi.fitness.watch.face.edit.entity.DialWidgetType;
import java.text.ParseException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes7.dex */
public class dqq extends c17 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Pattern f15822a = Pattern.compile("^(?:(?:[零一二三四五六七八九0-9]{2})?[零一二三四五六七八九0-9]{2}年?)|今年|去年|明年|前年|后年");

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // defpackage.c17
    public List<q69> a(List<q69> list, dq5 dq5Var, TimeZone timeZone) throws ParseException {
        List<q69> list2;
        int i;
        List<q69> list3;
        int i2;
        List<q69> listFilterEntity = FactoidExtractor.filterEntity(list);
        int i3 = 0;
        while (i3 < listFilterEntity.size()) {
            q69 q69Var = listFilterEntity.get(i3);
            String strI = q69Var.i();
            Map<String, mq5> mapE = q69Var.e();
            Map<String, String> mapH = q69Var.h();
            if (mapH == null) {
                mapH = new HashMap<>();
            }
            if (mapE != null) {
                Iterator<Map.Entry<String, mq5>> it = mapE.entrySet().iterator();
                while (it.hasNext()) {
                    Map.Entry<String, mq5> next = it.next();
                    String key = next.getKey();
                    mq5 value = next.getValue();
                    key.hashCode();
                    byte b2 = -1;
                    switch (key.hashCode()) {
                        case -1992012396:
                            if (key.equals("duration")) {
                                b2 = 0;
                            }
                            break;
                        case -248858434:
                            if (key.equals("date_time")) {
                                b2 = 1;
                            }
                            break;
                        case 3076014:
                            if (key.equals(DialWidgetType.DATE)) {
                                b2 = 2;
                            }
                            break;
                    }
                    Iterator<Map.Entry<String, mq5>> it2 = it;
                    switch (b2) {
                        case 0:
                            String strC = dq5.a(value.d()).C("yyyyMMdd");
                            list3 = listFilterEntity;
                            String strC2 = dq5.a(value.a()).C("yyyyMMdd");
                            if (!strC.equals(strC2)) {
                                i2 = i3;
                                String strC3 = b(value.d(), value.a(), dq5Var) ? dq5Var.C("yyyyMMdd") : strC2;
                                String strC4 = value.c();
                                String strC5 = c(strC, strC3, strI.contains("年代"));
                                if (strI.endsWith("前")) {
                                    strC5 = "<" + strC3.substring(0, 4) + "0101";
                                } else if (strI.endsWith("后")) {
                                    strC5 = ">" + strC.substring(0, 4) + "0101";
                                }
                                if (strC4.equals("recent") && (strI.equals("最近") || strI.equals("这几天") || strI.equals("这两天"))) {
                                    mapH.clear();
                                } else {
                                    if (!"year".equals(value.c())) {
                                        mapH.put(DialWidgetType.DATE, strC5);
                                    }
                                    mapH.put("year", strC5);
                                }
                            } else {
                                mapH.put(DialWidgetType.DATE, strC);
                                i2 = i3;
                            }
                            break;
                        case 1:
                        case 2:
                            String strC6 = dq5.a(value.g()).C("yyyyMMdd");
                            if (!strC6.isEmpty()) {
                                if (value.b()) {
                                    int iIntValue = Integer.valueOf(strC6.substring(0, 4)).intValue();
                                    Matcher matcher = f15822a.matcher(q69Var.i());
                                    if (matcher.find()) {
                                        mapH.put("year", c(iIntValue + "0101", b(iIntValue + "-01-01T00:00:00", iIntValue + "-12-31T23:59:59", dq5Var) ? dq5Var.C("yyyyMMdd") : iIntValue + "1231", false));
                                        listFilterEntity.set(i3, new q69(q69Var.b(), q69Var.b() + matcher.group(0).length(), iIntValue + "年", mapH, null));
                                    }
                                } else if (value.e() != null && value.e().equals("offset")) {
                                    if (!strI.endsWith("前")) {
                                        mapH.put("year", ">" + strC6);
                                        mapH.put(DialWidgetType.DATE, ">" + strC6);
                                    } else {
                                        mapH.put("year", "<" + strC6);
                                        mapH.put(DialWidgetType.DATE, "<" + strC6);
                                    }
                                } else if (!value.b()) {
                                    mapH.put(DialWidgetType.DATE, strC6);
                                }
                                break;
                            }
                        default:
                            list3 = listFilterEntity;
                            i2 = i3;
                            break;
                    }
                    it = it2;
                    listFilterEntity = list3;
                    i3 = i2;
                }
                list2 = listFilterEntity;
                i = i3;
                q69Var.m(mapH);
            } else {
                list2 = listFilterEntity;
                i = i3;
            }
            i3 = i + 1;
            listFilterEntity = list2;
        }
        return listFilterEntity;
    }

    public final boolean b(String str, String str2, dq5 dq5Var) throws ParseException {
        long jI = dq5Var.i();
        long j = jlo.b(str) ? 0L : dq5.j(str);
        if (jlo.b(str2)) {
            return false;
        }
        return j <= jI && jI <= dq5.j(str2);
    }

    public final String c(String str, String str2, boolean z) {
        if (z) {
            str = str.substring(0, 4);
            str2 = str2.substring(0, 4);
        }
        return str2.isEmpty() ? String.format(">%s", str) : String.format("%s<%s", str, str2);
    }
}
