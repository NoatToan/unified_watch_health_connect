package androidx.datastore.preferences.protobuf;

import com.mi.health.course.export.data.CourseConfigModel;
import com.xiaomi.ai.api.AIApiConstants;
import com.xiaomi.fitness.login.region.RegionManagerImpl;
import defpackage.b8p;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

/* JADX INFO: loaded from: classes.dex */
public final class c0 {
    public static final String a(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (Character.isUpperCase(cCharAt)) {
                sb.append(RegionManagerImpl.LOCALE_REPORTED_SERVER_SEPARATOR);
            }
            sb.append(Character.toLowerCase(cCharAt));
        }
        return sb.toString();
    }

    public static boolean b(Object obj) {
        if (obj instanceof Boolean) {
            return !((Boolean) obj).booleanValue();
        }
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue() == 0;
        }
        if (obj instanceof Float) {
            return ((Float) obj).floatValue() == 0.0f;
        }
        if (obj instanceof Double) {
            return ((Double) obj).doubleValue() == 0.0d;
        }
        if (obj instanceof String) {
            return obj.equals("");
        }
        if (obj instanceof ByteString) {
            return obj.equals(ByteString.EMPTY);
        }
        if (obj instanceof b0) {
            return obj == ((b0) obj).getDefaultInstanceForType();
        }
        return (obj instanceof Enum) && ((Enum) obj).ordinal() == 0;
    }

    public static final void c(StringBuilder sb, int i, String str, Object obj) {
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                c(sb, i, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                c(sb, i, str, (Map.Entry) it2.next());
            }
            return;
        }
        sb.append('\n');
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            sb.append(' ');
        }
        sb.append(str);
        if (obj instanceof String) {
            sb.append(": \"");
            sb.append(b8p.c((String) obj));
            sb.append('\"');
            return;
        }
        if (obj instanceof ByteString) {
            sb.append(": \"");
            sb.append(b8p.b((ByteString) obj));
            sb.append('\"');
            return;
        }
        if (obj instanceof GeneratedMessageLite) {
            sb.append(" {");
            d((GeneratedMessageLite) obj, sb, i + 2);
            sb.append("\n");
            while (i2 < i) {
                sb.append(' ');
                i2++;
            }
            sb.append("}");
            return;
        }
        if (!(obj instanceof Map.Entry)) {
            sb.append(": ");
            sb.append(obj.toString());
            return;
        }
        sb.append(" {");
        Map.Entry entry = (Map.Entry) obj;
        int i4 = i + 2;
        c(sb, i4, "key", entry.getKey());
        c(sb, i4, "value", entry.getValue());
        sb.append("\n");
        while (i2 < i) {
            sb.append(' ');
            i2++;
        }
        sb.append("}");
    }

    public static void d(b0 b0Var, StringBuilder sb, int i) {
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        TreeSet<String> treeSet = new TreeSet();
        for (Method method : b0Var.getClass().getDeclaredMethods()) {
            map2.put(method.getName(), method);
            if (method.getParameterTypes().length == 0) {
                map.put(method.getName(), method);
                if (method.getName().startsWith("get")) {
                    treeSet.add(method.getName());
                }
            }
        }
        for (String str : treeSet) {
            String strReplaceFirst = str.replaceFirst("get", "");
            if (strReplaceFirst.endsWith("List") && !strReplaceFirst.endsWith("OrBuilderList") && !strReplaceFirst.equals("List")) {
                String str2 = strReplaceFirst.substring(0, 1).toLowerCase() + strReplaceFirst.substring(1, strReplaceFirst.length() - 4);
                Method method2 = (Method) map.get(str);
                if (method2 != null && method2.getReturnType().equals(List.class)) {
                    c(sb, i, a(str2), GeneratedMessageLite.s(method2, b0Var, new Object[0]));
                }
            }
            if (strReplaceFirst.endsWith(AIApiConstants.Map.NAME) && !strReplaceFirst.equals(AIApiConstants.Map.NAME)) {
                String str3 = strReplaceFirst.substring(0, 1).toLowerCase() + strReplaceFirst.substring(1, strReplaceFirst.length() - 3);
                Method method3 = (Method) map.get(str);
                if (method3 != null && method3.getReturnType().equals(Map.class) && !method3.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method3.getModifiers())) {
                    c(sb, i, a(str3), GeneratedMessageLite.s(method3, b0Var, new Object[0]));
                }
            }
            if (((Method) map2.get(CourseConfigModel.DevCmd.CMD_ACTION_SET + strReplaceFirst)) != null) {
                if (strReplaceFirst.endsWith("Bytes")) {
                    if (map.containsKey("get" + strReplaceFirst.substring(0, strReplaceFirst.length() - 5))) {
                    }
                }
                String str4 = strReplaceFirst.substring(0, 1).toLowerCase() + strReplaceFirst.substring(1);
                Method method4 = (Method) map.get("get" + strReplaceFirst);
                Method method5 = (Method) map.get("has" + strReplaceFirst);
                if (method4 != null) {
                    Object objS = GeneratedMessageLite.s(method4, b0Var, new Object[0]);
                    if (method5 == null) {
                        if (!b(objS)) {
                            c(sb, i, a(str4), objS);
                        }
                    } else if (((Boolean) GeneratedMessageLite.s(method5, b0Var, new Object[0])).booleanValue()) {
                        c(sb, i, a(str4), objS);
                    }
                }
            }
        }
        if (b0Var instanceof GeneratedMessageLite.c) {
            Iterator<Map.Entry<T, Object>> itS = ((GeneratedMessageLite.c) b0Var).extensions.s();
            while (itS.hasNext()) {
                Map.Entry entry = (Map.Entry) itS.next();
                c(sb, i, "[" + ((GeneratedMessageLite.d) entry.getKey()).getNumber() + "]", entry.getValue());
            }
        }
        o0 o0Var = ((GeneratedMessageLite) b0Var).unknownFields;
        if (o0Var != null) {
            o0Var.m(sb, i);
        }
    }

    public static String e(b0 b0Var, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(str);
        d(b0Var, sb, 0);
        return sb.toString();
    }
}
