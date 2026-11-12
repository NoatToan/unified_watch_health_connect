package com.google.android.gms.internal.measurement;

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
final class r3 {
    public static String a(zzlc zzlcVar, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(str);
        d(zzlcVar, sb, 0);
        return sb.toString();
    }

    public static final void b(StringBuilder sb, int i, String str, Object obj) {
        if (obj instanceof List) {
            Iterator it2 = ((List) obj).iterator();
            while (it2.hasNext()) {
                b(sb, i, str, it2.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it3 = ((Map) obj).entrySet().iterator();
            while (it3.hasNext()) {
                b(sb, i, str, (Map.Entry) it3.next());
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
            sb.append(m4.a(zzix.zzm((String) obj)));
            sb.append('\"');
            return;
        }
        if (obj instanceof zzix) {
            sb.append(": \"");
            sb.append(m4.a((zzix) obj));
            sb.append('\"');
            return;
        }
        if (obj instanceof zzjx) {
            sb.append(" {");
            d((zzjx) obj, sb, i + 2);
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
        b(sb, i4, "key", entry.getKey());
        b(sb, i4, "value", entry.getValue());
        sb.append("\n");
        while (i2 < i) {
            sb.append(StringUtil.SPACE);
            i2++;
        }
        sb.append(com.alipay.sdk.m.u.i.d);
    }

    private static final String c(String str) {
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

    private static void d(zzlc zzlcVar, StringBuilder sb, int i) {
        boolean zEquals;
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        TreeSet<String> treeSet = new TreeSet();
        for (Method method : zzlcVar.getClass().getDeclaredMethods()) {
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
                String strValueOf = String.valueOf(strSubstring.substring(0, 1).toLowerCase());
                String strValueOf2 = String.valueOf(strSubstring.substring(1, strSubstring.length() - 4));
                String strConcat = strValueOf2.length() != 0 ? strValueOf.concat(strValueOf2) : new String(strValueOf);
                Method method2 = (Method) map.get(str);
                if (method2 != null && method2.getReturnType().equals(List.class)) {
                    b(sb, i, c(strConcat), zzjx.c(method2, zzlcVar, new Object[0]));
                }
            }
            if (strSubstring.endsWith(AIApiConstants.Map.NAME) && !strSubstring.equals(AIApiConstants.Map.NAME)) {
                String strValueOf3 = String.valueOf(strSubstring.substring(0, 1).toLowerCase());
                String strValueOf4 = String.valueOf(strSubstring.substring(1, strSubstring.length() - 3));
                String strConcat2 = strValueOf4.length() != 0 ? strValueOf3.concat(strValueOf4) : new String(strValueOf3);
                Method method3 = (Method) map.get(str);
                if (method3 != null && method3.getReturnType().equals(Map.class) && !method3.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method3.getModifiers())) {
                    b(sb, i, c(strConcat2), zzjx.c(method3, zzlcVar, new Object[0]));
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
                    Object objC = zzjx.c(method4, zzlcVar, new Object[0]);
                    if (method5 == null) {
                        if (objC instanceof Boolean) {
                            if (((Boolean) objC).booleanValue()) {
                                b(sb, i, c(strConcat3), objC);
                            }
                        } else if (objC instanceof Integer) {
                            if (((Integer) objC).intValue() != 0) {
                                b(sb, i, c(strConcat3), objC);
                            }
                        } else if (objC instanceof Float) {
                            if (Float.floatToRawIntBits(((Float) objC).floatValue()) != 0) {
                                b(sb, i, c(strConcat3), objC);
                            }
                        } else if (!(objC instanceof Double)) {
                            if (objC instanceof String) {
                                zEquals = objC.equals("");
                            } else if (objC instanceof zzix) {
                                zEquals = objC.equals(zzix.zzb);
                            } else if (objC instanceof zzlc) {
                                if (objC != ((zzlc) objC).zzbL()) {
                                    b(sb, i, c(strConcat3), objC);
                                }
                            } else if (!(objC instanceof Enum) || ((Enum) objC).ordinal() != 0) {
                                b(sb, i, c(strConcat3), objC);
                            }
                            if (!zEquals) {
                                b(sb, i, c(strConcat3), objC);
                            }
                        } else if (Double.doubleToRawLongBits(((Double) objC).doubleValue()) != 0) {
                            b(sb, i, c(strConcat3), objC);
                        }
                    } else if (((Boolean) zzjx.c(method5, zzlcVar, new Object[0])).booleanValue()) {
                        b(sb, i, c(strConcat3), objC);
                    }
                }
            }
        }
        if (zzlcVar instanceof zzju) {
            throw null;
        }
        zzmc zzmcVar = ((zzjx) zzlcVar).zzc;
        if (zzmcVar != null) {
            zzmcVar.c(sb, i);
        }
    }
}
