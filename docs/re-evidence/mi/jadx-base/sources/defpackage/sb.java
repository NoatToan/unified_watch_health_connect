package defpackage;

import com.xiaomi.fit.fitness.parser.sport.base.SportReportBaseParser;
import java.lang.reflect.Field;
import java.util.HashMap;

/* JADX INFO: loaded from: classes6.dex */
public class sb {
    public static void a(cuf cufVar, n4q n4qVar) {
        switch (n4qVar.l()) {
            case 1:
                cufVar.v(SportReportBaseParser.ReportType.exitTime, "java/lang/Boolean", "valueOf", "(Z)Ljava/lang/Boolean;", false);
                break;
            case 2:
                cufVar.v(SportReportBaseParser.ReportType.exitTime, "java/lang/Character", "valueOf", "(C)Ljava/lang/Character;", false);
                break;
            case 3:
                cufVar.v(SportReportBaseParser.ReportType.exitTime, "java/lang/Byte", "valueOf", "(B)Ljava/lang/Byte;", false);
                break;
            case 4:
                cufVar.v(SportReportBaseParser.ReportType.exitTime, "java/lang/Short", "valueOf", "(S)Ljava/lang/Short;", false);
                break;
            case 5:
                cufVar.v(SportReportBaseParser.ReportType.exitTime, "java/lang/Integer", "valueOf", "(I)Ljava/lang/Integer;", false);
                break;
            case 6:
                cufVar.v(SportReportBaseParser.ReportType.exitTime, "java/lang/Float", "valueOf", "(F)Ljava/lang/Float;", false);
                break;
            case 7:
                cufVar.v(SportReportBaseParser.ReportType.exitTime, "java/lang/Long", "valueOf", "(J)Ljava/lang/Long;", false);
                break;
            case 8:
                cufVar.v(SportReportBaseParser.ReportType.exitTime, "java/lang/Double", "valueOf", "(D)Ljava/lang/Double;", false);
                break;
        }
    }

    public static r80[] b(Class<?> cls, cl9 cl9Var) {
        HashMap map = new HashMap();
        if (cl9Var == null) {
            cl9Var = ig2.f21108a;
        }
        while (cls != Object.class) {
            for (Field field : cls.getDeclaredFields()) {
                String name = field.getName();
                if (!map.containsKey(name)) {
                    r80 r80Var = new r80(cls, field, cl9Var);
                    if (r80Var.g()) {
                        map.put(name, r80Var);
                    }
                }
            }
            cls = cls.getSuperclass();
        }
        return (r80[]) map.values().toArray(new r80[map.size()]);
    }

    public static String c(String str) {
        int length = str.length();
        char[] cArr = new char[length + 3];
        cArr[0] = 'g';
        cArr[1] = 'e';
        cArr[2] = 't';
        char cCharAt = str.charAt(0);
        if (cCharAt >= 'a' && cCharAt <= 'z') {
            cCharAt = (char) (cCharAt - ' ');
        }
        cArr[3] = cCharAt;
        for (int i = 1; i < length; i++) {
            cArr[i + 3] = str.charAt(i);
        }
        return new String(cArr);
    }

    public static String d(String str) {
        int length = str.length();
        char[] cArr = new char[length + 2];
        cArr[0] = 'i';
        cArr[1] = 's';
        char cCharAt = str.charAt(0);
        if (cCharAt >= 'a' && cCharAt <= 'z') {
            cCharAt = (char) (cCharAt - ' ');
        }
        cArr[2] = cCharAt;
        for (int i = 1; i < length; i++) {
            cArr[i + 2] = str.charAt(i);
        }
        return new String(cArr);
    }

    public static String e(String str) {
        int length = str.length();
        char[] cArr = new char[length + 3];
        cArr[0] = 's';
        cArr[1] = 'e';
        cArr[2] = 't';
        char cCharAt = str.charAt(0);
        if (cCharAt >= 'a' && cCharAt <= 'z') {
            cCharAt = (char) (cCharAt - ' ');
        }
        cArr[3] = cCharAt;
        for (int i = 1; i < length; i++) {
            cArr[i + 3] = str.charAt(i);
        }
        return new String(cArr);
    }

    public static h2e[] f(int i) {
        h2e[] h2eVarArr = new h2e[i];
        for (int i2 = 0; i2 < i; i2++) {
            h2eVarArr[i2] = new h2e();
        }
        return h2eVarArr;
    }
}
