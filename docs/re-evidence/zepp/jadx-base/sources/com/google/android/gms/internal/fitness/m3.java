package com.google.android.gms.internal.fitness;

import com.huami.watch.companion.event.WatchFaceArrivingEvent;
import com.xiaomi.ai.api.AIApiConstants;
import io.netty.util.internal.StringUtil;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

/* JADX INFO: loaded from: classes3.dex */
final class m3 {
    public static String a(zzik zzikVar, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(str);
        b(zzikVar, sb, 0);
        return sb.toString();
    }

    /* JADX WARN: Code duplicated, block: B:84:0x01e7  */
    /* JADX WARN: Code duplicated, block: B:85:0x01ea  */
    private static void b(zzik zzikVar, StringBuilder sb, int i) {
        boolean zEquals;
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        TreeSet<String> treeSet = new TreeSet();
        for (Method method : zzikVar.getClass().getDeclaredMethods()) {
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
            boolean zBooleanValue = true;
            if (strSubstring.endsWith("List") && !strSubstring.endsWith("OrBuilderList") && !strSubstring.equals("List")) {
                String strValueOf = String.valueOf(strSubstring.substring(0, 1).toLowerCase());
                String strValueOf2 = String.valueOf(strSubstring.substring(1, strSubstring.length() - 4));
                String strConcat = strValueOf2.length() != 0 ? strValueOf.concat(strValueOf2) : new String(strValueOf);
                Method method2 = (Method) map.get(str);
                if (method2 != null && method2.getReturnType().equals(List.class)) {
                    c(sb, i, d(strConcat), zzgy.d(method2, zzikVar, new Object[0]));
                }
            }
            if (strSubstring.endsWith(AIApiConstants.Map.NAME) && !strSubstring.equals(AIApiConstants.Map.NAME)) {
                String strValueOf3 = String.valueOf(strSubstring.substring(0, 1).toLowerCase());
                String strValueOf4 = String.valueOf(strSubstring.substring(1, strSubstring.length() - 3));
                String strConcat2 = strValueOf4.length() != 0 ? strValueOf3.concat(strValueOf4) : new String(strValueOf3);
                Method method3 = (Method) map.get(str);
                if (method3 != null && method3.getReturnType().equals(Map.class) && !method3.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method3.getModifiers())) {
                    c(sb, i, d(strConcat2), zzgy.d(method3, zzikVar, new Object[0]));
                }
            }
            if (((Method) map2.get(strSubstring.length() != 0 ? WatchFaceArrivingEvent.CMD_SET.concat(strSubstring) : new String(WatchFaceArrivingEvent.CMD_SET))) != null) {
                if (strSubstring.endsWith("Bytes")) {
                    String strValueOf5 = String.valueOf(strSubstring.substring(0, strSubstring.length() - 5));
                    if (!map.containsKey(strValueOf5.length() != 0 ? "get".concat(strValueOf5) : new String("get"))) {
                    }
                }
                String strValueOf6 = String.valueOf(strSubstring.substring(0, 1).toLowerCase());
                String strValueOf7 = String.valueOf(strSubstring.substring(1));
                String strConcat3 = strValueOf7.length() != 0 ? strValueOf6.concat(strValueOf7) : new String(strValueOf6);
                Method method4 = (Method) map.get(strSubstring.length() != 0 ? "get".concat(strSubstring) : new String("get"));
                Method method5 = (Method) map.get(strSubstring.length() != 0 ? "has".concat(strSubstring) : new String("has"));
                if (method4 != null) {
                    Object objD = zzgy.d(method4, zzikVar, new Object[0]);
                    if (method5 == null) {
                        if (objD instanceof Boolean) {
                            if (((Boolean) objD).booleanValue()) {
                                zEquals = false;
                            } else {
                                zEquals = true;
                            }
                        } else if (objD instanceof Integer) {
                            if (((Integer) objD).intValue() == 0) {
                                zEquals = true;
                            } else {
                                zEquals = false;
                            }
                        } else if (objD instanceof Float) {
                            if (((Float) objD).floatValue() == 0.0f) {
                                zEquals = true;
                            } else {
                                zEquals = false;
                            }
                        } else if (objD instanceof Double) {
                            if (((Double) objD).doubleValue() == 0.0d) {
                                zEquals = true;
                            } else {
                                zEquals = false;
                            }
                        } else if (objD instanceof String) {
                            zEquals = objD.equals("");
                        } else if (objD instanceof zzfx) {
                            zEquals = objD.equals(zzfx.zzub);
                        } else if (!(objD instanceof zzik) ? !((objD instanceof Enum) && ((Enum) objD).ordinal() == 0) : objD != ((zzik) objD).zzbu()) {
                            zEquals = false;
                        } else {
                            zEquals = true;
                        }
                        if (zEquals) {
                            zBooleanValue = false;
                        }
                    } else {
                        zBooleanValue = ((Boolean) zzgy.d(method5, zzikVar, new Object[0])).booleanValue();
                    }
                    if (zBooleanValue) {
                        c(sb, i, d(strConcat3), objD);
                    }
                }
            }
        }
        if (zzikVar instanceof zzgy.zzd) {
            Iterator<Map.Entry<T, Object>> itD = ((zzgy.zzd) zzikVar).zzya.d();
            if (itD.hasNext()) {
                throw new NoSuchMethodError();
            }
        }
        zzjr zzjrVar = ((zzgy) zzikVar).zzxt;
        if (zzjrVar != null) {
            zzjrVar.c(sb, i);
        }
    }

    public static final void c(StringBuilder sb, int i, String str, Object obj) {
        if (obj instanceof List) {
            Iterator it2 = ((List) obj).iterator();
            while (it2.hasNext()) {
                c(sb, i, str, it2.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it3 = ((Map) obj).entrySet().iterator();
            while (it3.hasNext()) {
                c(sb, i, str, (Map.Entry) it3.next());
            }
            return;
        }
        sb.append('\n');
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            sb.append(StringUtil.SPACE);
        }
        sb.append(str);
        if (obj instanceof String) {
            sb.append(": \"");
            sb.append(l4.a(zzfx.zzk((String) obj)));
            sb.append('\"');
            return;
        }
        if (obj instanceof zzfx) {
            sb.append(": \"");
            sb.append(l4.a((zzfx) obj));
            sb.append('\"');
            return;
        }
        if (obj instanceof zzgy) {
            sb.append(" {");
            b((zzgy) obj, sb, i + 2);
            sb.append("\n");
            while (i2 < i) {
                sb.append(StringUtil.SPACE);
                i2++;
            }
            sb.append(com.alipay.sdk.m.u.i.d);
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
            sb.append(StringUtil.SPACE);
            i2++;
        }
        sb.append(com.alipay.sdk.m.u.i.d);
    }

    private static final String d(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char cCharAt = str.charAt(i);
            if (Character.isUpperCase(cCharAt)) {
                sb.append("_");
            }
            sb.append(Character.toLowerCase(cCharAt));
        }
        return sb.toString();
    }
}
