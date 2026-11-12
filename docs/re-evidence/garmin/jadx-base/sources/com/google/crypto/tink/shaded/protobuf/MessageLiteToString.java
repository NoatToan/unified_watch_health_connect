package com.google.crypto.tink.shaded.protobuf;

import am.j;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.joran.action.Action;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
import org.apache.commons.text.StringSubstitutor;
import sn.a;

/* JADX INFO: loaded from: classes2.dex */
final class MessageLiteToString {
    private static final String BUILDER_LIST_SUFFIX = "OrBuilderList";
    private static final String BYTES_SUFFIX = "Bytes";
    private static final String LIST_SUFFIX = "List";
    private static final String MAP_SUFFIX = "Map";

    private static final String camelCaseToSnakeCase(String str) {
        StringBuilder sb3 = new StringBuilder();
        for (int i14 = 0; i14 < str.length(); i14++) {
            char cCharAt = str.charAt(i14);
            if (Character.isUpperCase(cCharAt)) {
                sb3.append("_");
            }
            sb3.append(Character.toLowerCase(cCharAt));
        }
        return sb3.toString();
    }

    private static boolean isDefaultValue(Object obj) {
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
        if (obj instanceof MessageLite) {
            return obj == ((MessageLite) obj).getDefaultInstanceForType();
        }
        return (obj instanceof Enum) && ((Enum) obj).ordinal() == 0;
    }

    public static final void printField(StringBuilder sb3, int i14, String str, Object obj) {
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                printField(sb3, i14, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it3 = ((Map) obj).entrySet().iterator();
            while (it3.hasNext()) {
                printField(sb3, i14, str, (Map.Entry) it3.next());
            }
            return;
        }
        sb3.append('\n');
        int i15 = 0;
        for (int i16 = 0; i16 < i14; i16++) {
            sb3.append(' ');
        }
        sb3.append(str);
        if (obj instanceof String) {
            sb3.append(": \"");
            sb3.append(TextFormatEscaper.escapeText((String) obj));
            sb3.append(CoreConstants.DOUBLE_QUOTE_CHAR);
            return;
        }
        if (obj instanceof ByteString) {
            sb3.append(": \"");
            sb3.append(TextFormatEscaper.escapeBytes((ByteString) obj));
            sb3.append(CoreConstants.DOUBLE_QUOTE_CHAR);
            return;
        }
        if (obj instanceof GeneratedMessageLite) {
            sb3.append(" {");
            reflectivePrintWithIndent((GeneratedMessageLite) obj, sb3, i14 + 2);
            sb3.append("\n");
            while (i15 < i14) {
                sb3.append(' ');
                i15++;
            }
            sb3.append(StringSubstitutor.DEFAULT_VAR_END);
            return;
        }
        if (!(obj instanceof Map.Entry)) {
            sb3.append(": ");
            sb3.append(obj.toString());
            return;
        }
        sb3.append(" {");
        Map.Entry entry = (Map.Entry) obj;
        int i17 = i14 + 2;
        printField(sb3, i17, Action.KEY_ATTRIBUTE, entry.getKey());
        printField(sb3, i17, "value", entry.getValue());
        sb3.append("\n");
        while (i15 < i14) {
            sb3.append(' ');
            i15++;
        }
        sb3.append(StringSubstitutor.DEFAULT_VAR_END);
    }

    private static void reflectivePrintWithIndent(MessageLite messageLite, StringBuilder sb3, int i14) {
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        TreeSet<String> treeSet = new TreeSet();
        for (Method method : messageLite.getClass().getDeclaredMethods()) {
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
            if (strSubstring.endsWith(LIST_SUFFIX) && !strSubstring.endsWith(BUILDER_LIST_SUFFIX) && !strSubstring.equals(LIST_SUFFIX)) {
                String str2 = strSubstring.substring(0, 1).toLowerCase() + strSubstring.substring(1, strSubstring.length() - 4);
                Method method2 = (Method) map.get(str);
                if (method2 != null && method2.getReturnType().equals(List.class)) {
                    printField(sb3, i14, camelCaseToSnakeCase(str2), GeneratedMessageLite.invokeOrDie(method2, messageLite, new Object[0]));
                }
            }
            if (strSubstring.endsWith(MAP_SUFFIX) && !strSubstring.equals(MAP_SUFFIX)) {
                String str3 = strSubstring.substring(0, 1).toLowerCase() + strSubstring.substring(1, strSubstring.length() - 3);
                Method method3 = (Method) map.get(str);
                if (method3 != null && method3.getReturnType().equals(Map.class) && !method3.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method3.getModifiers())) {
                    printField(sb3, i14, camelCaseToSnakeCase(str3), GeneratedMessageLite.invokeOrDie(method3, messageLite, new Object[0]));
                }
            }
            if (((Method) map2.get("set".concat(strSubstring))) != null && (!strSubstring.endsWith(BYTES_SUFFIX) || !map.containsKey("get".concat(strSubstring.substring(0, strSubstring.length() - 5))))) {
                String str4 = strSubstring.substring(0, 1).toLowerCase() + strSubstring.substring(1);
                Method method4 = (Method) map.get("get".concat(strSubstring));
                Method method5 = (Method) map.get("has".concat(strSubstring));
                if (method4 != null) {
                    Object objInvokeOrDie = GeneratedMessageLite.invokeOrDie(method4, messageLite, new Object[0]);
                    if (method5 != null) {
                        zBooleanValue = ((Boolean) GeneratedMessageLite.invokeOrDie(method5, messageLite, new Object[0])).booleanValue();
                    } else if (isDefaultValue(objInvokeOrDie)) {
                        zBooleanValue = false;
                    }
                    if (zBooleanValue) {
                        printField(sb3, i14, camelCaseToSnakeCase(str4), objInvokeOrDie);
                    }
                }
            }
        }
        if (messageLite instanceof GeneratedMessageLite.ExtendableMessage) {
            Iterator<Map.Entry<T, Object>> it = ((GeneratedMessageLite.ExtendableMessage) messageLite).extensions.iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                printField(sb3, i14, j.q(new StringBuilder("["), ((GeneratedMessageLite.ExtensionDescriptor) entry.getKey()).getNumber(), "]"), entry.getValue());
            }
        }
        UnknownFieldSetLite unknownFieldSetLite = ((GeneratedMessageLite) messageLite).unknownFields;
        if (unknownFieldSetLite != null) {
            unknownFieldSetLite.printWithIndent(sb3, i14);
        }
    }

    public static String toString(MessageLite messageLite, String str) {
        StringBuilder sbI = a.i("# ", str);
        reflectivePrintWithIndent(messageLite, sbI, 0);
        return sbI.toString();
    }
}
