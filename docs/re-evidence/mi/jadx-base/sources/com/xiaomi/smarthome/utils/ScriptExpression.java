package com.xiaomi.smarthome.utils;

import android.text.TextUtils;
import com.huami.bluetooth.profile.channel.module.alarm.AlarmModule;
import com.xiaomi.hm.health.bt.profile.gdsp.activity.HMProSyncDataBaseProfile;
import com.xiaomi.smarthome.newui.utils.NumberUtils;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Stack;
import java.util.regex.Pattern;
import okio.Utf8;
import org.slf4j.Marker;

/* JADX INFO: loaded from: classes2.dex */
public class ScriptExpression {
    private static void addExpression(String str, int i, List<String> list, int i2) {
        if (i2 != -1) {
            String strTrim = str.substring(i2, i).trim();
            if (TextUtils.isEmpty(strTrim)) {
                return;
            }
            list.add(strTrim);
        }
    }

    public static Object eval(String str, Object obj) {
        if (str == null || obj == null) {
            return null;
        }
        if (obj instanceof Double) {
            return Double.valueOf(eval(str, (Map<String, Object>) Collections.singletonMap("x", BigDecimal.valueOf(((Double) obj).doubleValue()))).doubleValue());
        }
        if (obj instanceof Float) {
            return Float.valueOf(eval(str, (Map<String, Object>) Collections.singletonMap("x", BigDecimal.valueOf(((Float) obj).floatValue()))).floatValue());
        }
        if (obj instanceof Long) {
            Number numberEval = eval(str, (Map<String, Object>) Collections.singletonMap("x", BigDecimal.valueOf(((Long) obj).longValue())));
            if (numberEval instanceof BigDecimal) {
                numberEval = ((BigDecimal) numberEval).setScale(0, RoundingMode.HALF_UP);
            }
            return Long.valueOf(numberEval.longValue());
        }
        if (!(obj instanceof Integer)) {
            ((String) obj).contains(".");
            return eval(str, (Map<String, Object>) Collections.singletonMap("x", BigDecimal.valueOf(NumberUtils.valueOf(obj, 0.0d)))).toString();
        }
        Number numberEval2 = eval(str, (Map<String, Object>) Collections.singletonMap("x", BigDecimal.valueOf(((Integer) obj).intValue())));
        if (numberEval2 instanceof BigDecimal) {
            numberEval2 = ((BigDecimal) numberEval2).setScale(0, RoundingMode.HALF_UP);
        }
        return Integer.valueOf(numberEval2.intValue());
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0033  */
    /* JADX WARN: Code duplicated, block: B:24:0x0058  */
    /* JADX WARN: Code duplicated, block: B:28:0x006c  */
    /* JADX WARN: Code duplicated, block: B:32:0x0078  */
    /* JADX WARN: Code duplicated, block: B:54:0x0074 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:57:0x003f A[SYNTHETIC] */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:37:0x008c
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.checkLoopExits(LoopRegionMaker.java:272)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeLoopRegion(LoopRegionMaker.java:237)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:80)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeEndlessLoop(LoopRegionMaker.java:590)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:82)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeEndlessLoop(LoopRegionMaker.java:590)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:82)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:117)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:49)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    private static java.util.List<java.lang.String> expressionToList(java.lang.String r6) {
        /*
            if (r6 == 0) goto Lb7
            java.lang.String r0 = ""
            boolean r0 = r0.equals(r6)
            if (r0 == 0) goto Lc
            goto Lb7
        Lc:
            java.util.LinkedList r0 = new java.util.LinkedList
            r0.<init>()
            r1 = 0
        L12:
            r2 = r1
        L13:
            int r3 = r6.length()
            if (r1 >= r3) goto Lab
            int r3 = r1 + 2
            int r4 = r6.length()
            if (r3 >= r4) goto L33
            java.lang.String r4 = r6.substring(r1, r3)
            int r5 = priority(r4)
            if (r5 <= 0) goto L33
            addExpression(r6, r1, r0, r2)
            r0.add(r4)
        L31:
            r1 = r3
            goto L12
        L33:
            int r3 = r1 + 1
            java.lang.String r4 = r6.substring(r1, r3)
            int r5 = priority(r4)
            if (r5 <= 0) goto L78
            addExpression(r6, r1, r0, r2)
            java.lang.String r1 = "+"
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L52
            java.lang.String r1 = "-"
            boolean r1 = r1.equals(r4)
            if (r1 == 0) goto L74
        L52:
            int r1 = r0.size()
            if (r1 <= 0) goto L6c
            java.lang.Object r1 = r0.getLast()
            java.lang.String r1 = (java.lang.String) r1
            int r5 = priority(r1)
            if (r5 <= 0) goto L6c
            java.lang.String r5 = ")"
            boolean r1 = r5.equals(r1)
            if (r1 == 0) goto L72
        L6c:
            int r1 = r0.size()
            if (r1 != 0) goto L74
        L72:
            r1 = r3
            goto L13
        L74:
            r0.add(r4)
            goto L31
        L78:
            java.lang.String r5 = "\""
            boolean r5 = r5.equals(r4)
            if (r5 != 0) goto L88
            java.lang.String r5 = "'"
            boolean r5 = r5.equals(r4)
            if (r5 == 0) goto L72
        L88:
            int r3 = r6.length()
            if (r1 >= r3) goto L13
            int r1 = r1 + 1
            int r3 = r6.indexOf(r4, r1)
            if (r3 > 0) goto L98
            goto L13
        L98:
            int r1 = r3 + (-1)
            java.lang.String r1 = r6.substring(r1, r3)
            java.lang.String r5 = "\\"
            boolean r1 = r5.equals(r1)
            if (r1 == 0) goto La8
            r1 = r3
            goto L88
        La8:
            int r3 = r3 + 1
            goto L72
        Lab:
            int r1 = r6.length()
            addExpression(r6, r1, r0, r2)
            java.util.List r6 = parseToSuffixExpression(r0)
            return r6
        Lb7:
            r6 = 0
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.smarthome.utils.ScriptExpression.expressionToList(java.lang.String):java.util.List");
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private static Number operation(String str, Object obj, Object obj2) {
        str.hashCode();
        int i = 1;
        byte b2 = -1;
        switch (str.hashCode()) {
            case 37:
                if (str.equals("%")) {
                    b2 = 0;
                }
                break;
            case 42:
                if (str.equals(Marker.ANY_MARKER)) {
                    b2 = 1;
                }
                break;
            case 43:
                if (str.equals(Marker.ANY_NON_NULL_MARKER)) {
                    b2 = 2;
                }
                break;
            case 45:
                if (str.equals("-")) {
                    b2 = 3;
                }
                break;
            case 47:
                if (str.equals("/")) {
                    b2 = 4;
                }
                break;
            case 60:
                if (str.equals("<")) {
                    b2 = 5;
                }
                break;
            case 62:
                if (str.equals(">")) {
                    b2 = 6;
                }
                break;
            case 1084:
                if (str.equals("!=")) {
                    b2 = 7;
                }
                break;
            case 1216:
                if (str.equals("&&")) {
                    b2 = 8;
                }
                break;
            case 1921:
                if (str.equals("<=")) {
                    b2 = 9;
                }
                break;
            case 1952:
                if (str.equals("==")) {
                    b2 = 10;
                }
                break;
            case 1983:
                if (str.equals(">=")) {
                    b2 = 11;
                }
                break;
            case 2014:
                if (str.equals("?=")) {
                    b2 = AlarmModule.CMD_RETURN_CLEAR_ALARM_RESULT;
                }
                break;
            case Utf8.MASK_2BYTES /* 3968 */:
                if (str.equals("||")) {
                    b2 = HMProSyncDataBaseProfile.DATA_TYPE_PAI;
                }
                break;
        }
        switch (b2) {
            case 0:
                return NumberUtils.remainder(obj, obj2);
            case 1:
                return NumberUtils.multiply(obj, obj2);
            case 2:
                return NumberUtils.add(obj, obj2);
            case 3:
                return NumberUtils.subtract(obj, obj2);
            case 4:
                return NumberUtils.divide(obj, obj2);
            case 5:
                return Integer.valueOf(!NumberUtils.equalsBigValue(obj, obj2) ? 1 : 0);
            case 6:
                return Integer.valueOf(!NumberUtils.equalsSmallValue(obj, obj2) ? 1 : 0);
            case 7:
                return Integer.valueOf(!NumberUtils.equalsValue(obj2, obj) ? 1 : 0);
            case 8:
                return Integer.valueOf((NumberUtils.valueOf(obj2, 0) <= 0 || NumberUtils.valueOf(obj, 0) <= 0) ? 0 : 1);
            case 9:
                return Integer.valueOf(NumberUtils.equalsSmallValue(obj, obj2) ? 1 : 0);
            case 10:
                return Integer.valueOf(NumberUtils.equalsValue(obj2, obj) ? 1 : 0);
            case 11:
                return Integer.valueOf(NumberUtils.equalsBigValue(obj, obj2) ? 1 : 0);
            case 12:
                return Integer.valueOf(Pattern.matches(String.valueOf(obj2), String.valueOf(obj)) ? 1 : 0);
            case 13:
                if (NumberUtils.valueOf(obj2, 0) == 0 && NumberUtils.valueOf(obj, 0) == 0) {
                    i = 0;
                }
                return Integer.valueOf(i);
            default:
                return 0;
        }
    }

    private static List<String> parseToSuffixExpression(List<String> list) {
        Stack stack = new Stack();
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            int iPriority = priority(str);
            if (iPriority <= 0 || iPriority == Integer.MAX_VALUE) {
                if ("(".equals(str)) {
                    stack.push(str);
                } else if (")".equals(str)) {
                    while (!stack.isEmpty()) {
                        if ("(".equals(stack.peek())) {
                            stack.pop();
                            break;
                        }
                        arrayList.add((String) stack.pop());
                    }
                } else {
                    arrayList.add(str);
                }
            } else if (stack.isEmpty() || "(".equals(stack.peek()) || iPriority > priority((String) stack.peek())) {
                stack.push(str);
            } else {
                while (!stack.isEmpty() && !"(".equals(stack.peek()) && iPriority <= priority((String) stack.peek())) {
                    arrayList.add((String) stack.pop());
                }
                stack.push(str);
            }
        }
        while (!stack.isEmpty()) {
            arrayList.add((String) stack.pop());
        }
        return arrayList;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static int priority(String str) {
        str.hashCode();
        byte b2 = -1;
        switch (str.hashCode()) {
            case 37:
                if (str.equals("%")) {
                    b2 = 0;
                }
                break;
            case 40:
                if (str.equals("(")) {
                    b2 = 1;
                }
                break;
            case 41:
                if (str.equals(")")) {
                    b2 = 2;
                }
                break;
            case 42:
                if (str.equals(Marker.ANY_MARKER)) {
                    b2 = 3;
                }
                break;
            case 43:
                if (str.equals(Marker.ANY_NON_NULL_MARKER)) {
                    b2 = 4;
                }
                break;
            case 45:
                if (str.equals("-")) {
                    b2 = 5;
                }
                break;
            case 47:
                if (str.equals("/")) {
                    b2 = 6;
                }
                break;
            case 60:
                if (str.equals("<")) {
                    b2 = 7;
                }
                break;
            case 62:
                if (str.equals(">")) {
                    b2 = 8;
                }
                break;
            case 1084:
                if (str.equals("!=")) {
                    b2 = 9;
                }
                break;
            case 1216:
                if (str.equals("&&")) {
                    b2 = 10;
                }
                break;
            case 1921:
                if (str.equals("<=")) {
                    b2 = 11;
                }
                break;
            case 1952:
                if (str.equals("==")) {
                    b2 = AlarmModule.CMD_RETURN_CLEAR_ALARM_RESULT;
                }
                break;
            case 1983:
                if (str.equals(">=")) {
                    b2 = HMProSyncDataBaseProfile.DATA_TYPE_PAI;
                }
                break;
            case 2014:
                if (str.equals("?=")) {
                    b2 = HMProSyncDataBaseProfile.DATA_TYPE_COACHING;
                }
                break;
            case Utf8.MASK_2BYTES /* 3968 */:
                if (str.equals("||")) {
                    b2 = 15;
                }
                break;
        }
        switch (b2) {
            case 0:
                return 6;
            case 1:
            case 2:
                return Integer.MAX_VALUE;
            case 3:
                return 6;
            case 4:
            case 5:
                return 5;
            case 6:
                return 6;
            case 7:
            case 8:
                return 4;
            case 9:
                return 3;
            case 10:
                return 2;
            case 11:
                return 4;
            case 12:
                return 3;
            case 13:
                return 4;
            case 14:
                return 3;
            case 15:
                return 1;
            default:
                return 0;
        }
    }

    public static Number eval(String str, Map<String, Object> map) {
        List<String> listExpressionToList = expressionToList(str);
        if (listExpressionToList != null && listExpressionToList.size() != 0) {
            Stack stack = new Stack();
            for (int i = 0; i < listExpressionToList.size(); i++) {
                String str2 = listExpressionToList.get(i);
                if (priority(str2) <= 0) {
                    if ((str2.startsWith("'") && str2.endsWith("'")) || (str2.startsWith("\"") && str2.endsWith("\""))) {
                        stack.push(str2.substring(1, str2.length() - 1));
                    } else if (Pattern.matches("^[+|-]?\\d*\\.?\\d*$", str2)) {
                        if (str2.contains(".")) {
                            stack.push(Double.valueOf(NumberUtils.valueOf((Object) str2, 0.0d)));
                        } else {
                            stack.push(Integer.valueOf(NumberUtils.valueOf((Object) str2, 0)));
                        }
                    } else {
                        stack.push(map.get(str2));
                    }
                } else {
                    stack.push(operation(str2, stack.pop(), stack.pop()));
                }
            }
            Object objPop = stack.pop();
            return objPop instanceof Number ? (Number) objPop : Double.valueOf(NumberUtils.valueOf(objPop, 0.0d));
        }
        return 0;
    }
}
