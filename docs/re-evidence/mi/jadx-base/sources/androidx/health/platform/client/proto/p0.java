package androidx.health.platform.client.proto;

import com.mi.health.course.export.data.CourseConfigModel;
import com.xiaomi.ai.api.AIApiConstants;
import com.xiaomi.fitness.login.region.RegionManagerImpl;
import defpackage.y7p;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes.dex */
public final class p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final char[] f2522a;

    static {
        char[] cArr = new char[80];
        f2522a = cArr;
        Arrays.fill(cArr, ' ');
    }

    public static void a(int i, StringBuilder sb) {
        while (i > 0) {
            char[] cArr = f2522a;
            int length = i > cArr.length ? cArr.length : i;
            sb.append(cArr, 0, length);
            i -= length;
        }
    }

    public static boolean b(Object obj) {
        if (obj instanceof Boolean) {
            return !((Boolean) obj).booleanValue();
        }
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue() == 0;
        }
        if (obj instanceof Float) {
            return Float.floatToRawIntBits(((Float) obj).floatValue()) == 0;
        }
        if (obj instanceof Double) {
            return Double.doubleToRawLongBits(((Double) obj).doubleValue()) == 0;
        }
        if (obj instanceof String) {
            return obj.equals("");
        }
        if (obj instanceof ByteString) {
            return obj.equals(ByteString.EMPTY);
        }
        if (obj instanceof o0) {
            return obj == ((o0) obj).getDefaultInstanceForType();
        }
        return (obj instanceof Enum) && ((Enum) obj).ordinal() == 0;
    }

    public static String c(String str) {
        if (str.isEmpty()) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(Character.toLowerCase(str.charAt(0)));
        for (int i = 1; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (Character.isUpperCase(cCharAt)) {
                sb.append(RegionManagerImpl.LOCALE_REPORTED_SERVER_SEPARATOR);
            }
            sb.append(Character.toLowerCase(cCharAt));
        }
        return sb.toString();
    }

    public static void d(StringBuilder sb, int i, String str, Object obj) {
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                d(sb, i, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                d(sb, i, str, (Map.Entry) it2.next());
            }
            return;
        }
        sb.append('\n');
        a(i, sb);
        sb.append(c(str));
        if (obj instanceof String) {
            sb.append(": \"");
            sb.append(y7p.c((String) obj));
            sb.append('\"');
            return;
        }
        if (obj instanceof ByteString) {
            sb.append(": \"");
            sb.append(y7p.b((ByteString) obj));
            sb.append('\"');
            return;
        }
        if (obj instanceof GeneratedMessageLite) {
            sb.append(" {");
            e((GeneratedMessageLite) obj, sb, i + 2);
            sb.append("\n");
            a(i, sb);
            sb.append("}");
            return;
        }
        if (!(obj instanceof Map.Entry)) {
            sb.append(": ");
            sb.append(obj);
            return;
        }
        sb.append(" {");
        Map.Entry entry = (Map.Entry) obj;
        int i2 = i + 2;
        d(sb, i2, "key", entry.getKey());
        d(sb, i2, "value", entry.getValue());
        sb.append("\n");
        a(i, sb);
        sb.append("}");
    }

    /* JADX WARN: Code duplicated, block: B:63:0x0172  */
    /* JADX WARN: Code duplicated, block: B:65:0x018f  */
    /* JADX WARN: Instruction removed from duplicated block: B:63:0x0172, please report this as an issue */
    public static void e(o0 o0Var, StringBuilder sb, int i) {
        int i2;
        int i3;
        Method method;
        Method method2;
        Object objY;
        Method method3;
        Method method4;
        HashSet hashSet = new HashSet();
        HashMap map = new HashMap();
        TreeMap treeMap = new TreeMap();
        Method[] declaredMethods = o0Var.getClass().getDeclaredMethods();
        int length = declaredMethods.length;
        int i4 = 0;
        while (true) {
            i2 = 3;
            if (i4 >= length) {
                break;
            }
            Method method5 = declaredMethods[i4];
            if (!Modifier.isStatic(method5.getModifiers()) && method5.getName().length() >= 3) {
                if (method5.getName().startsWith(CourseConfigModel.DevCmd.CMD_ACTION_SET)) {
                    hashSet.add(method5.getName());
                } else if (Modifier.isPublic(method5.getModifiers()) && method5.getParameterTypes().length == 0) {
                    if (method5.getName().startsWith("has")) {
                        map.put(method5.getName(), method5);
                    } else if (method5.getName().startsWith("get")) {
                        treeMap.put(method5.getName(), method5);
                    }
                }
            }
            i4++;
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            String strSubstring = ((String) entry.getKey()).substring(i2);
            if (!strSubstring.endsWith("List") || strSubstring.endsWith("OrBuilderList") || strSubstring.equals("List") || (method4 = (Method) entry.getValue()) == null || !method4.getReturnType().equals(List.class)) {
                if (!strSubstring.endsWith(AIApiConstants.Map.NAME) || strSubstring.equals(AIApiConstants.Map.NAME) || (method3 = (Method) entry.getValue()) == null || !method3.getReturnType().equals(Map.class) || method3.isAnnotationPresent(Deprecated.class) || !Modifier.isPublic(method3.getModifiers())) {
                    i3 = 3;
                    if (hashSet.contains(CourseConfigModel.DevCmd.CMD_ACTION_SET + strSubstring)) {
                        if (strSubstring.endsWith("Bytes")) {
                            if (!treeMap.containsKey("get" + strSubstring.substring(0, strSubstring.length() - 5))) {
                                method = (Method) entry.getValue();
                                method2 = (Method) map.get("has" + strSubstring);
                                if (method != null) {
                                    objY = GeneratedMessageLite.y(method, o0Var, new Object[0]);
                                    if (method2 == null ? ((Boolean) GeneratedMessageLite.y(method2, o0Var, new Object[0])).booleanValue() : !b(objY)) {
                                        d(sb, i, strSubstring, objY);
                                    }
                                }
                            }
                        } else {
                            method = (Method) entry.getValue();
                            method2 = (Method) map.get("has" + strSubstring);
                            if (method != null) {
                                objY = GeneratedMessageLite.y(method, o0Var, new Object[0]);
                                if (method2 == null) {
                                    d(sb, i, strSubstring, objY);
                                } else {
                                    d(sb, i, strSubstring, objY);
                                }
                            }
                        }
                    }
                } else {
                    i3 = 3;
                    d(sb, i, strSubstring.substring(0, strSubstring.length() - 3), GeneratedMessageLite.y(method3, o0Var, new Object[0]));
                }
                i2 = i3;
            } else {
                d(sb, i, strSubstring.substring(0, strSubstring.length() - 4), GeneratedMessageLite.y(method4, o0Var, new Object[0]));
                i2 = 3;
            }
        }
        if (o0Var instanceof GeneratedMessageLite.c) {
            Iterator<Map.Entry<T, Object>> itT = ((GeneratedMessageLite.c) o0Var).extensions.t();
            while (itT.hasNext()) {
                Map.Entry entry2 = (Map.Entry) itT.next();
                d(sb, i, "[" + ((GeneratedMessageLite.d) entry2.getKey()).getNumber() + "]", entry2.getValue());
            }
        }
        c2 c2Var = ((GeneratedMessageLite) o0Var).unknownFields;
        if (c2Var != null) {
            c2Var.m(sb, i);
        }
    }

    public static String f(o0 o0Var, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(str);
        e(o0Var, sb, 0);
        return sb.toString();
    }
}
