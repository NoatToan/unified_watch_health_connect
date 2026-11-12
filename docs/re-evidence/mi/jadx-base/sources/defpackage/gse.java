package defpackage;

import com.xiaomi.fitness.watch.face.edit.entity.DialWidgetType;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes7.dex */
public class gse extends c17 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static Pattern f19296a = Pattern.compile("上午|下午|中午|早上|早晨|凌晨|晚上|傍晚|今早|今晚|明早|明晚");

    private static String b(mq5 mq5Var) throws ParseException {
        return dq5.a(mq5Var.g()).C("yyyyMMdd");
    }

    private static String c(mq5 mq5Var) throws ParseException {
        String strC = dq5.a(mq5Var.d()).C("yyyyMMdd");
        String strC2 = dq5.a(mq5Var.a()).C("yyyyMMdd");
        if (strC.equals(strC2)) {
            return strC;
        }
        return strC + "<" + strC2;
    }

    public static String d(q69 q69Var, mq5 mq5Var) throws ParseException {
        Matcher matcher = f19296a.matcher(q69Var.i());
        if (!matcher.find()) {
            return "";
        }
        String strGroup = matcher.group();
        dq5 dq5VarA = dq5.a(mq5Var.g());
        String strC = dq5VarA.C("yyyyMMdd");
        if (strGroup.equals("明早") || strGroup.equals("明晚")) {
            return dq5VarA.v(1).C("yyyyMMdd");
        }
        return (strGroup.equals("昨早") || strGroup.equals("昨晚")) ? dq5VarA.v(-1).C("yyyyMMdd") : strC;
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
                } else {
                    String strD = d(q69Var, value);
                    if (jlo.b(strD)) {
                        q69Var.a("time", strD);
                    }
                }
            }
            if (q69Var.e().size() > 0) {
                arrayList.add(q69Var);
            }
        }
        return list;
    }
}
