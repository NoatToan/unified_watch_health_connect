package com.huawei.hihealth.dictionary.expression;

import com.huawei.hihealth.HiDataFilter;
import com.huawei.hihealth.dictionary.utils.DictUtils;
import com.huawei.operation.utils.Constants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Stack;
import org.slf4j.Marker;

/* JADX INFO: loaded from: classes2.dex */
public class Pattern {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Map<String, Integer> f12274a;
    private static final java.util.regex.Pattern e;

    private static boolean d(char c2) {
        return c2 >= '0' && c2 <= '9';
    }

    static {
        HashMap map = new HashMap(13);
        f12274a = map;
        e = java.util.regex.Pattern.compile("^[-\\+]?[.\\d]*$");
        map.put(Constants.LEFT_BRACKET_ONLY, Integer.MAX_VALUE);
        map.put(Constants.RIGHT_BRACKET_ONLY, Integer.MAX_VALUE);
        map.put(Marker.ANY_NON_NULL_MARKER, 4);
        map.put(com.huawei.openalliance.ad.constant.Constants.LINK, 4);
        map.put("*", 5);
        map.put("/", 5);
        map.put(HiDataFilter.DataFilterExpression.BIGGER_THAN, 3);
        map.put(HiDataFilter.DataFilterExpression.LESS_THAN, 3);
        map.put(HiDataFilter.DataFilterExpression.BIGGER_EQUAL, 3);
        map.put(HiDataFilter.DataFilterExpression.LESS_EQUAL, 3);
        map.put(com.huawei.openalliance.ad.constant.Constants.PARAM_SERVER_SPLIT, 1);
        map.put("&", 4);
        map.put("||", 0);
        map.put("|", 4);
        map.put("=", 2);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x007f  */
    public static Expression b(String str) {
        if (str == null || "".equals(str.trim())) {
            throw new IllegalArgumentException("data is empty");
        }
        String strJ = j(str);
        Stack stack = new Stack();
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        boolean zB = false;
        int i = 0;
        for (int i2 = 0; i2 < strJ.length(); i2++) {
            if (zB) {
                zB = false;
            } else {
                String str2 = strJ.charAt(i2) + "";
                if (d(str2, strJ, i2)) {
                    i = i2;
                } else if (c(str2)) {
                    zB = b(strJ, str2, i2, arrayList, stack);
                    i = zB ? i2 + 2 : i2 + 1;
                } else if (i2 != strJ.length() - 1) {
                    if (c(strJ.charAt(i2 + 1) + "")) {
                        e(strJ, i, i2 + 1, arrayList, hashSet);
                    }
                } else {
                    e(strJ, i, i2 + 1, arrayList, hashSet);
                }
            }
        }
        while (!stack.isEmpty()) {
            arrayList.add((Token) stack.pop());
        }
        return new Expression(arrayList, hashSet);
    }

    private static boolean b(String str, String str2, int i, List<Token> list, Stack<Token> stack) {
        String str3;
        boolean z;
        boolean z2 = true;
        if ((HiDataFilter.DataFilterExpression.LESS_THAN.equals(str2) || HiDataFilter.DataFilterExpression.BIGGER_THAN.equals(str2)) && i < str.length() - 1 && "=".charAt(0) == str.charAt(i + 1)) {
            str3 = str2 + "=";
            z = true;
        } else {
            str3 = str2;
            z = false;
        }
        if (!"&".equals(str2) && !"|".equals(str2)) {
            z2 = z;
        } else {
            if (i == str.length() - 1) {
                throw new IllegalArgumentException("illegal expression: " + str);
            }
            if (!str3.equals(str.charAt(i + 1) + "")) {
                throw new IllegalArgumentException("illegal expression: " + str);
            }
            str3 = str2 + str2;
        }
        if (Constants.RIGHT_BRACKET_ONLY.equals(str3)) {
            while (!stack.isEmpty()) {
                if (Constants.LEFT_BRACKET_ONLY.equals(stack.peek().c())) {
                    stack.pop();
                    return z2;
                }
                list.add(stack.pop());
            }
            throw new IllegalArgumentException("There is no left bracket for right bracket.");
        }
        if (stack.isEmpty() || Constants.LEFT_BRACKET_ONLY.equals(str3) || e(str3) > e(stack.peek().c())) {
            stack.push(new Token(0, str3));
            return z2;
        }
        if (e(str3) <= e(stack.peek().c())) {
            while (!stack.isEmpty() && e(str3) <= e(stack.peek().c()) && e(stack.peek().c()) != Integer.MAX_VALUE) {
                list.add(stack.pop());
            }
            stack.push(new Token(0, str3));
        }
        return z2;
    }

    private static void e(String str, int i, int i2, List<Token> list, Set<String> set) {
        String strSubstring = str.substring(i, i2);
        if (a(strSubstring) && !d(strSubstring)) {
            set.add(strSubstring);
            list.add(new Token(1, strSubstring));
        } else {
            if (d(strSubstring)) {
                list.add(new Token(2, strSubstring));
                return;
            }
            throw new IllegalArgumentException("data not match number or param");
        }
    }

    private static String j(String str) {
        return str.replaceAll("\\s+", "");
    }

    private static boolean d(String str) {
        return e.matcher(str).matches();
    }

    private static boolean a(String str) {
        return DictUtils.e(str);
    }

    private static boolean c(String str) {
        return f12274a.containsKey(str);
    }

    private static boolean d(String str, String str2, int i) {
        if (!str.equals(Marker.ANY_NON_NULL_MARKER) && !str.equals(com.huawei.openalliance.ad.constant.Constants.LINK)) {
            return false;
        }
        if (str2.length() <= 1 || i == str2.length() - 1) {
            throw new IllegalArgumentException("expressiong is illegal. : " + str2);
        }
        if (i == 0) {
            return d(str2.charAt(i + 1));
        }
        char cCharAt = str2.charAt(i - 1);
        if (d(str2.charAt(i + 1)) && Constants.RIGHT_BRACKET_ONLY.charAt(0) != cCharAt) {
            if (c(cCharAt + "")) {
                return true;
            }
        }
        return false;
    }

    private static int e(String str) {
        Integer num = f12274a.get(str);
        if (num == null) {
            return Integer.MAX_VALUE;
        }
        return num.intValue();
    }
}
