package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

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
import sn.a;
import v.e0;

/* JADX INFO: loaded from: classes14.dex */
final class zzfo {
    private static final char[] zza;

    static {
        char[] cArr = new char[80];
        zza = cArr;
        Arrays.fill(cArr, ' ');
    }

    public static String zza(zzfm zzfmVar, String str) {
        StringBuilder sbI = a.i("# ", str);
        zzd(zzfmVar, sbI, 0);
        return sbI.toString();
    }

    public static void zzb(StringBuilder sb3, int i14, String str, Object obj) {
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                zzb(sb3, i14, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it3 = ((Map) obj).entrySet().iterator();
            while (it3.hasNext()) {
                zzb(sb3, i14, str, (Map.Entry) it3.next());
            }
            return;
        }
        sb3.append('\n');
        zzc(i14, sb3);
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
            sb3.append(zzgq.zza(new zzde(((String) obj).getBytes(zzep.zza))));
            sb3.append(CoreConstants.DOUBLE_QUOTE_CHAR);
            return;
        }
        if (obj instanceof zzdf) {
            sb3.append(": \"");
            sb3.append(zzgq.zza((zzdf) obj));
            sb3.append(CoreConstants.DOUBLE_QUOTE_CHAR);
            return;
        }
        if (obj instanceof zzeh) {
            sb3.append(" {");
            zzd((zzeh) obj, sb3, i14 + 2);
            sb3.append("\n");
            zzc(i14, sb3);
            sb3.append(StringSubstitutor.DEFAULT_VAR_END);
            return;
        }
        if (!(obj instanceof Map.Entry)) {
            sb3.append(": ");
            sb3.append(obj);
            return;
        }
        int i16 = i14 + 2;
        sb3.append(" {");
        Map.Entry entry = (Map.Entry) obj;
        zzb(sb3, i16, Action.KEY_ATTRIBUTE, entry.getKey());
        zzb(sb3, i16, "value", entry.getValue());
        sb3.append("\n");
        zzc(i14, sb3);
        sb3.append(StringSubstitutor.DEFAULT_VAR_END);
    }

    private static void zzc(int i14, StringBuilder sb3) {
        while (i14 > 0) {
            int i15 = 80;
            if (i14 <= 80) {
                i15 = i14;
            }
            sb3.append(zza, 0, i15);
            i14 -= i15;
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x01f6  */
    private static void zzd(zzfm zzfmVar, StringBuilder sb3, int i14) {
        int i15;
        boolean zEquals;
        Method method;
        Method method2;
        HashSet hashSet = new HashSet();
        HashMap map = new HashMap();
        TreeMap treeMap = new TreeMap();
        Method[] declaredMethods = zzfmVar.getClass().getDeclaredMethods();
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
                zzb(sb3, i14, strSubstring.substring(0, strSubstring.length() - 4), zzeh.zzR(method2, zzfmVar, new Object[0]));
            } else if (strSubstring.endsWith("Map") && !strSubstring.equals("Map") && (method = (Method) entry.getValue()) != null && method.getReturnType().equals(Map.class) && !method.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method.getModifiers())) {
                zzb(sb3, i14, strSubstring.substring(0, strSubstring.length() - 3), zzeh.zzR(method, zzfmVar, new Object[0]));
            } else if (hashSet.contains("set".concat(strSubstring)) && (!strSubstring.endsWith("Bytes") || !treeMap.containsKey("get".concat(strSubstring.substring(0, strSubstring.length() - 5))))) {
                Method method4 = (Method) entry.getValue();
                Method method5 = (Method) map.get("has".concat(strSubstring));
                if (method4 != null) {
                    Object objZzR = zzeh.zzR(method4, zzfmVar, new Object[0]);
                    if (method5 == null) {
                        if (objZzR instanceof Boolean) {
                            if (((Boolean) objZzR).booleanValue()) {
                                zzb(sb3, i14, strSubstring, objZzR);
                            }
                        } else if (objZzR instanceof Integer) {
                            if (((Integer) objZzR).intValue() != 0) {
                                zzb(sb3, i14, strSubstring, objZzR);
                            }
                        } else if (objZzR instanceof Float) {
                            if (Float.floatToRawIntBits(((Float) objZzR).floatValue()) != 0) {
                                zzb(sb3, i14, strSubstring, objZzR);
                            }
                        } else if (!(objZzR instanceof Double)) {
                            if (objZzR instanceof String) {
                                zEquals = objZzR.equals("");
                            } else if (objZzR instanceof zzdf) {
                                zEquals = objZzR.equals(zzdf.zzb);
                            } else if (objZzR instanceof zzfm) {
                                if (objZzR != ((zzfm) objZzR).zzac()) {
                                    zzb(sb3, i14, strSubstring, objZzR);
                                }
                            } else if (!(objZzR instanceof Enum) || ((Enum) objZzR).ordinal() != 0) {
                                zzb(sb3, i14, strSubstring, objZzR);
                            }
                            if (!zEquals) {
                                zzb(sb3, i14, strSubstring, objZzR);
                            }
                        } else if (Double.doubleToRawLongBits(((Double) objZzR).doubleValue()) != 0) {
                            zzb(sb3, i14, strSubstring, objZzR);
                        }
                    } else if (((Boolean) zzeh.zzR(method5, zzfmVar, new Object[0])).booleanValue()) {
                        zzb(sb3, i14, strSubstring, objZzR);
                    }
                }
            }
            i15 = 3;
        }
        if (zzfmVar instanceof zzed) {
            Iterator itZzf = ((zzed) zzfmVar).zzb.zzf();
            while (itZzf.hasNext()) {
                Map.Entry entry2 = (Map.Entry) itZzf.next();
                zzb(sb3, i14, e0.f(((zzee) entry2.getKey()).zza, "[", "]"), entry2.getValue());
            }
        }
        zzgt zzgtVar = ((zzeh) zzfmVar).zzc;
        if (zzgtVar != null) {
            zzgtVar.zzi(sb3, i14);
        }
    }
}
