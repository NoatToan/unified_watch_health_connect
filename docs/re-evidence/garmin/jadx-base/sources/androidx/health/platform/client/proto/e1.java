package androidx.health.platform.client.proto;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.joran.action.Action;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import org.apache.commons.text.StringSubstitutor;

/* JADX INFO: loaded from: classes.dex */
public final class e1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final char[] f7601a;

    static {
        char[] cArr = new char[80];
        f7601a = cArr;
        Arrays.fill(cArr, ' ');
    }

    private e1() {
    }

    public static void a(int i14, StringBuilder sb3) {
        while (i14 > 0) {
            int i15 = 80;
            if (i14 <= 80) {
                i15 = i14;
            }
            sb3.append(f7601a, 0, i15);
            i14 -= i15;
        }
    }

    public static void b(StringBuilder sb3, int i14, String str, Object obj) {
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                b(sb3, i14, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it3 = ((Map) obj).entrySet().iterator();
            while (it3.hasNext()) {
                b(sb3, i14, str, (Map.Entry) it3.next());
            }
            return;
        }
        sb3.append('\n');
        a(i14, sb3);
        if (!str.isEmpty()) {
            StringBuilder sb4 = new StringBuilder();
            sb4.append(Character.toLowerCase(str.charAt(0)));
            for (int i15 = 1; i15 < str.length(); i15++) {
                char cCharAt = str.charAt(i15);
                if (Character.isUpperCase(cCharAt)) {
                    sb4.append("_");
                }
                sb4.append(Character.toLowerCase(cCharAt));
            }
            str = sb4.toString();
        }
        sb3.append(str);
        if (obj instanceof String) {
            sb3.append(": \"");
            i.h hVar = i.f7657b;
            sb3.append(s2.a(new i.h(((String) obj).getBytes(l0.f7708a))));
            sb3.append(CoreConstants.DOUBLE_QUOTE_CHAR);
            return;
        }
        if (obj instanceof i) {
            sb3.append(": \"");
            sb3.append(s2.a((i) obj));
            sb3.append(CoreConstants.DOUBLE_QUOTE_CHAR);
            return;
        }
        if (obj instanceof j0) {
            sb3.append(" {");
            c((j0) obj, sb3, i14 + 2);
            sb3.append("\n");
            a(i14, sb3);
            sb3.append(StringSubstitutor.DEFAULT_VAR_END);
            return;
        }
        if (!(obj instanceof Map.Entry)) {
            sb3.append(": ");
            sb3.append(obj);
            return;
        }
        sb3.append(" {");
        Map.Entry entry = (Map.Entry) obj;
        int i16 = i14 + 2;
        b(sb3, i16, Action.KEY_ATTRIBUTE, entry.getKey());
        b(sb3, i16, "value", entry.getValue());
        sb3.append("\n");
        a(i14, sb3);
        sb3.append(StringSubstitutor.DEFAULT_VAR_END);
    }

    /* JADX WARN: Code duplicated, block: B:74:0x0185  */
    /* JADX WARN: Code duplicated, block: B:75:0x0187  */
    public static void c(j0 j0Var, StringBuilder sb3, int i14) {
        int i15;
        boolean zBooleanValue;
        boolean zEquals;
        Method method;
        Method method2;
        HashSet hashSet = new HashSet();
        HashMap map = new HashMap();
        TreeMap treeMap = new TreeMap();
        Method[] declaredMethods = j0Var.getClass().getDeclaredMethods();
        int length = declaredMethods.length;
        int i16 = 0;
        while (true) {
            i15 = 3;
            if (i16 >= length) {
                break;
            }
            Method method3 = declaredMethods[i16];
            if (!Modifier.isStatic(method3.getModifiers()) && method3.getName().length() >= 3) {
                if (method3.getName().startsWith("set")) {
                    hashSet.add(method3.getName());
                } else if (Modifier.isPublic(method3.getModifiers()) && method3.getParameterTypes().length == 0) {
                    if (method3.getName().startsWith("has")) {
                        map.put(method3.getName(), method3);
                    } else if (method3.getName().startsWith("get")) {
                        treeMap.put(method3.getName(), method3);
                    }
                }
            }
            i16++;
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            String strSubstring = ((String) entry.getKey()).substring(i15);
            if (strSubstring.endsWith("List") && !strSubstring.endsWith("OrBuilderList") && !strSubstring.equals("List") && (method2 = (Method) entry.getValue()) != null && method2.getReturnType().equals(List.class)) {
                b(sb3, i14, fb1.c.m(4, 0, strSubstring), j0.k(method2, j0Var, new Object[0]));
            } else if (strSubstring.endsWith("Map") && !strSubstring.equals("Map") && (method = (Method) entry.getValue()) != null && method.getReturnType().equals(Map.class) && !method.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method.getModifiers())) {
                b(sb3, i14, fb1.c.m(3, 0, strSubstring), j0.k(method, j0Var, new Object[0]));
            } else if (hashSet.contains("set".concat(strSubstring)) && (!strSubstring.endsWith("Bytes") || !treeMap.containsKey("get".concat(strSubstring.substring(0, strSubstring.length() - 5))))) {
                Method method4 = (Method) entry.getValue();
                Method method5 = (Method) map.get("has".concat(strSubstring));
                if (method4 != null) {
                    Object objK = j0.k(method4, j0Var, new Object[0]);
                    if (method5 == null) {
                        zBooleanValue = true;
                        if (objK instanceof Boolean) {
                            zEquals = !((Boolean) objK).booleanValue();
                        } else if (objK instanceof Integer) {
                            if (((Integer) objK).intValue() == 0) {
                                zEquals = true;
                            } else {
                                zEquals = false;
                            }
                        } else if (objK instanceof Float) {
                            if (Float.floatToRawIntBits(((Float) objK).floatValue()) == 0) {
                                zEquals = true;
                            } else {
                                zEquals = false;
                            }
                        } else if (objK instanceof Double) {
                            if (Double.doubleToRawLongBits(((Double) objK).doubleValue()) == 0) {
                                zEquals = true;
                            } else {
                                zEquals = false;
                            }
                        } else if (objK instanceof String) {
                            zEquals = objK.equals("");
                        } else if (objK instanceof i) {
                            zEquals = objK.equals(i.f7657b);
                        } else if (!(objK instanceof c1) ? !((objK instanceof Enum) && ((Enum) objK).ordinal() == 0) : objK != ((c1) objK).a()) {
                            zEquals = false;
                        } else {
                            zEquals = true;
                        }
                        if (zEquals) {
                            zBooleanValue = false;
                        }
                    } else {
                        zBooleanValue = ((Boolean) j0.k(method5, j0Var, new Object[0])).booleanValue();
                    }
                    if (zBooleanValue) {
                        b(sb3, i14, strSubstring, objK);
                    }
                }
            }
            i15 = 3;
        }
        if (j0Var instanceof j0.c) {
            Iterator<Map.Entry<T, Object>> itJ = ((j0.c) j0Var).extensions.j();
            while (itJ.hasNext()) {
                Map.Entry entry2 = (Map.Entry) itJ.next();
                b(sb3, i14, am.j.q(new StringBuilder("["), ((j0.d) entry2.getKey()).f7680b, "]"), entry2.getValue());
            }
        }
        w2 w2Var = j0Var.unknownFields;
        if (w2Var != null) {
            for (int i17 = 0; i17 < w2Var.f7808a; i17++) {
                b(sb3, i14, String.valueOf(w2Var.f7809b[i17] >>> 3), w2Var.f7810c[i17]);
            }
        }
    }
}
