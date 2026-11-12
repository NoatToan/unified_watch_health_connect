package com.google.protobuf;

import com.mi.health.course.export.data.CourseConfigModel;
import com.xiaomi.ai.api.AIApiConstants;
import com.xiaomi.fitness.login.region.RegionManagerImpl;
import defpackage.a8p;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

/* JADX INFO: loaded from: classes5.dex */
public final class r0 {
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
        if (obj instanceof q0) {
            return obj == ((q0) obj).getDefaultInstanceForType();
        }
        return (obj instanceof java.lang.Enum) && ((java.lang.Enum) obj).ordinal() == 0;
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
            sb.append(a8p.e((String) obj));
            sb.append('\"');
            return;
        }
        if (obj instanceof ByteString) {
            sb.append(": \"");
            sb.append(a8p.b((ByteString) obj));
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

    public static void d(q0 q0Var, StringBuilder sb, int i) {
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        TreeSet<String> treeSet = new TreeSet();
        for (java.lang.reflect.Method method : q0Var.getClass().getDeclaredMethods()) {
            map2.put(method.getName(), method);
            if (method.getParameterTypes().length == 0) {
                map.put(method.getName(), method);
                if (method.getName().startsWith("get")) {
                    treeSet.add(method.getName());
                }
            }
        }
        for (String str : treeSet) {
            String strSubstring = str.startsWith("get") ? str.substring(3) : str;
            if (strSubstring.endsWith("List") && !strSubstring.endsWith("OrBuilderList") && !strSubstring.equals("List")) {
                String str2 = strSubstring.substring(0, 1).toLowerCase() + strSubstring.substring(1, strSubstring.length() - 4);
                java.lang.reflect.Method method2 = (java.lang.reflect.Method) map.get(str);
                if (method2 != null && method2.getReturnType().equals(List.class)) {
                    c(sb, i, a(str2), GeneratedMessageLite.invokeOrDie(method2, q0Var, new Object[0]));
                }
            }
            if (strSubstring.endsWith(AIApiConstants.Map.NAME) && !strSubstring.equals(AIApiConstants.Map.NAME)) {
                String str3 = strSubstring.substring(0, 1).toLowerCase() + strSubstring.substring(1, strSubstring.length() - 3);
                java.lang.reflect.Method method3 = (java.lang.reflect.Method) map.get(str);
                if (method3 != null && method3.getReturnType().equals(Map.class) && !method3.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method3.getModifiers())) {
                    c(sb, i, a(str3), GeneratedMessageLite.invokeOrDie(method3, q0Var, new Object[0]));
                }
            }
            if (((java.lang.reflect.Method) map2.get(CourseConfigModel.DevCmd.CMD_ACTION_SET + strSubstring)) != null) {
                if (strSubstring.endsWith("Bytes")) {
                    if (map.containsKey("get" + strSubstring.substring(0, strSubstring.length() - 5))) {
                    }
                }
                String str4 = strSubstring.substring(0, 1).toLowerCase() + strSubstring.substring(1);
                java.lang.reflect.Method method4 = (java.lang.reflect.Method) map.get("get" + strSubstring);
                java.lang.reflect.Method method5 = (java.lang.reflect.Method) map.get("has" + strSubstring);
                if (method4 != null) {
                    Object objInvokeOrDie = GeneratedMessageLite.invokeOrDie(method4, q0Var, new Object[0]);
                    if (method5 == null) {
                        if (!b(objInvokeOrDie)) {
                            c(sb, i, a(str4), objInvokeOrDie);
                        }
                    } else if (((Boolean) GeneratedMessageLite.invokeOrDie(method5, q0Var, new Object[0])).booleanValue()) {
                        c(sb, i, a(str4), objInvokeOrDie);
                    }
                }
            }
        }
        if (q0Var instanceof GeneratedMessageLite.c) {
            Iterator<Map.Entry<T, Object>> itF = ((GeneratedMessageLite.c) q0Var).f9544a.F();
            while (itF.hasNext()) {
                Map.Entry entry = (Map.Entry) itF.next();
                c(sb, i, "[" + ((GeneratedMessageLite.d) entry.getKey()).getNumber() + "]", entry.getValue());
            }
        }
        s1 s1Var = ((GeneratedMessageLite) q0Var).unknownFields;
        if (s1Var != null) {
            s1Var.p(sb, i);
        }
    }

    public static String e(q0 q0Var, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(str);
        d(q0Var, sb, 0);
        return sb.toString();
    }
}
