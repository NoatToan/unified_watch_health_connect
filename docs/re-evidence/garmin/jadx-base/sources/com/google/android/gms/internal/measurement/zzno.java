package com.google.android.gms.internal.measurement;

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

/* JADX INFO: loaded from: classes14.dex */
final class zzno {
    private static final char[] zza;

    static {
        char[] cArr = new char[80];
        zza = cArr;
        Arrays.fill(cArr, ' ');
    }

    public static String zza(zznm zznmVar, String str) {
        StringBuilder sbI = sn.a.i("# ", str);
        zzc(zznmVar, sbI, 0);
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
        zzd(i14, sb3);
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
            zzlh zzlhVar = zzlh.zzb;
            sb3.append(zzog.zza(new zzlg(((String) obj).getBytes(zzmp.zza))));
            sb3.append(CoreConstants.DOUBLE_QUOTE_CHAR);
            return;
        }
        if (obj instanceof zzlh) {
            sb3.append(": \"");
            sb3.append(zzog.zza((zzlh) obj));
            sb3.append(CoreConstants.DOUBLE_QUOTE_CHAR);
            return;
        }
        if (obj instanceof zzmf) {
            sb3.append(" {");
            zzc((zzmf) obj, sb3, i14 + 2);
            sb3.append("\n");
            zzd(i14, sb3);
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
        zzd(i14, sb3);
        sb3.append(StringSubstitutor.DEFAULT_VAR_END);
    }

    /* JADX WARN: Code duplicated, block: B:102:0x01f6  */
    private static void zzc(zznm zznmVar, StringBuilder sb3, int i14) {
        int i15;
        boolean zEquals;
        Method method;
        Method method2;
        HashSet hashSet = new HashSet();
        HashMap map = new HashMap();
        TreeMap treeMap = new TreeMap();
        Method[] declaredMethods = zznmVar.getClass().getDeclaredMethods();
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
                zzb(sb3, i14, strSubstring.substring(0, strSubstring.length() - 4), zzmf.zzcr(method2, zznmVar, new Object[0]));
            } else if (strSubstring.endsWith("Map") && !strSubstring.equals("Map") && (method = (Method) entry.getValue()) != null && method.getReturnType().equals(Map.class) && !method.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method.getModifiers())) {
                zzb(sb3, i14, strSubstring.substring(0, strSubstring.length() - 3), zzmf.zzcr(method, zznmVar, new Object[0]));
            } else if (hashSet.contains("set".concat(strSubstring)) && (!strSubstring.endsWith("Bytes") || !treeMap.containsKey("get".concat(strSubstring.substring(0, strSubstring.length() - 5))))) {
                Method method4 = (Method) entry.getValue();
                Method method5 = (Method) map.get("has".concat(strSubstring));
                if (method4 != null) {
                    Object objZzcr = zzmf.zzcr(method4, zznmVar, new Object[0]);
                    if (method5 == null) {
                        if (objZzcr instanceof Boolean) {
                            if (((Boolean) objZzcr).booleanValue()) {
                                zzb(sb3, i14, strSubstring, objZzcr);
                            }
                        } else if (objZzcr instanceof Integer) {
                            if (((Integer) objZzcr).intValue() != 0) {
                                zzb(sb3, i14, strSubstring, objZzcr);
                            }
                        } else if (objZzcr instanceof Float) {
                            if (Float.floatToRawIntBits(((Float) objZzcr).floatValue()) != 0) {
                                zzb(sb3, i14, strSubstring, objZzcr);
                            }
                        } else if (!(objZzcr instanceof Double)) {
                            if (objZzcr instanceof String) {
                                zEquals = objZzcr.equals("");
                            } else if (objZzcr instanceof zzlh) {
                                zEquals = objZzcr.equals(zzlh.zzb);
                            } else if (objZzcr instanceof zznm) {
                                if (objZzcr != ((zznm) objZzcr).zzcE()) {
                                    zzb(sb3, i14, strSubstring, objZzcr);
                                }
                            } else if (!(objZzcr instanceof Enum) || ((Enum) objZzcr).ordinal() != 0) {
                                zzb(sb3, i14, strSubstring, objZzcr);
                            }
                            if (!zEquals) {
                                zzb(sb3, i14, strSubstring, objZzcr);
                            }
                        } else if (Double.doubleToRawLongBits(((Double) objZzcr).doubleValue()) != 0) {
                            zzb(sb3, i14, strSubstring, objZzcr);
                        }
                    } else if (((Boolean) zzmf.zzcr(method5, zznmVar, new Object[0])).booleanValue()) {
                        zzb(sb3, i14, strSubstring, objZzcr);
                    }
                }
            }
            i15 = 3;
        }
        if (zznmVar instanceof zzmc) {
            Iterator itZzc = ((zzmc) zznmVar).zzb.zzc();
            if (itZzc.hasNext()) {
                throw null;
            }
        }
        zzoj zzojVar = ((zzmf) zznmVar).zzc;
        if (zzojVar != null) {
            zzojVar.zzj(sb3, i14);
        }
    }

    private static void zzd(int i14, StringBuilder sb3) {
        while (i14 > 0) {
            int i15 = 80;
            if (i14 <= 80) {
                i15 = i14;
            }
            sb3.append(zza, 0, i15);
            i14 -= i15;
        }
    }
}
