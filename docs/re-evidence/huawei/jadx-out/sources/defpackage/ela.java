package defpackage;

import android.text.TextUtils;
import com.huawei.hihealth.HiDataFilter;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.openalliance.ad.constant.Constants;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Locale;
import java.util.Map;
import java.util.Stack;

/* JADX INFO: loaded from: classes27.dex */
public class ela {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f33098a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Stack<String> f33099b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f33100c;
    private boolean d;
    private boolean e;
    private Map<String, Object> f;
    private String j;

    static class e {
        private static final ela e = new ela();
    }

    private ela() {
        this.d = false;
        this.f33100c = "";
        this.j = "";
        this.f33098a = false;
        this.e = false;
    }

    public static ela d() {
        return e.e;
    }

    public boolean a(String str, Map<String, Object> map) {
        this.f = map;
        if (map.isEmpty()) {
            LogUtil.a("MassageGunRulesFilteringUtil", "params is null");
            return false;
        }
        if (TextUtils.isEmpty(str)) {
            LogUtil.a("MassageGunRulesFilteringUtil", "matchingRules is null");
            return false;
        }
        Stack<String> stack = new Stack<>();
        int length = str.length();
        for (int length2 = str.length(); length2 >= 1; length2--) {
            length = d(str, stack, length, length2, str.substring(length2 - 1, length2));
            if (length2 > 2) {
                length = e(str, stack, length, length2, str.substring(length2 - 2, length2));
            }
        }
        if (length != 0) {
            stack.add(str.substring(0, length).replaceAll(" ", ""));
        }
        return b(stack);
    }

    /* JADX WARN: Code duplicated, block: B:37:0x0064  */
    private int e(String str, Stack<String> stack, int i, int i2, String str2) {
        byte b2;
        str2.hashCode();
        int iHashCode = str2.hashCode();
        if (iHashCode != 1084) {
            if (iHashCode != 1216) {
                if (iHashCode != 1921) {
                    if (iHashCode != 1952) {
                        if (iHashCode != 1983) {
                            if (iHashCode == 3968 && str2.equals("||")) {
                                b2 = 5;
                            } else {
                                b2 = -1;
                            }
                        } else if (str2.equals(HiDataFilter.DataFilterExpression.BIGGER_EQUAL)) {
                            b2 = 4;
                        } else {
                            b2 = -1;
                        }
                    } else if (str2.equals("==")) {
                        b2 = 3;
                    } else {
                        b2 = -1;
                    }
                } else if (str2.equals(HiDataFilter.DataFilterExpression.LESS_EQUAL)) {
                    b2 = 2;
                } else {
                    b2 = -1;
                }
            } else if (str2.equals(Constants.PARAM_SERVER_SPLIT)) {
                b2 = 1;
            } else {
                b2 = -1;
            }
        } else if (str2.equals("!=")) {
            b2 = 0;
        } else {
            b2 = -1;
        }
        if ((b2 != 0 && b2 != 1 && b2 != 2 && b2 != 3 && b2 != 4 && b2 != 5) || i < i2) {
            return i;
        }
        String strReplaceAll = str.substring(i2, i).trim().replaceAll(" ", "");
        if (!TextUtils.isEmpty(strReplaceAll)) {
            stack.add(strReplaceAll);
        }
        stack.add(str2);
        return i2 - 2;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:42:0x0071  */
    /* JADX WARN: Failed to clean up code after switch over string restore
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v0 int, still in use, count: 4, list:
      (r0v0 int) from 0x000a: IF  (r0v0 int) != (45 int)  -> B:4:0x000c A[HIDDEN]
      (r0v0 int) from 0x000e: IF  (r0v0 int) != (47 int)  -> B:6:0x0010 A[HIDDEN]
      (r0v0 int) from 0x0012: IF  (r0v0 int) != (60 int)  -> B:8:0x0014 A[HIDDEN]
      (r0v0 int) from 0x0016: IF  (r0v0 int) != (62 int)  -> B:10:0x0018 A[HIDDEN]
    	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
    	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
    	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
    	at jadx.core.utils.InsnRemover.remove(InsnRemover.java:226)
    	at jadx.core.utils.InsnRemover.remove(InsnRemover.java:215)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.replaceWithMergedSwitch(SwitchOverStringVisitor.java:355)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:111)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:72)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:140)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:47)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:66)
     */
    private int d(String str, Stack<String> stack, int i, int i2, String str2) {
        byte b2;
        str2.hashCode();
        if (iHashCode != 45) {
            if (iHashCode != 47) {
                if (iHashCode != 60) {
                    if (iHashCode != 62) {
                        switch (str2) {
                            case "(":
                                b2 = 0;
                                break;
                            case ")":
                                b2 = 1;
                                break;
                            case "*":
                                b2 = 2;
                                break;
                            case "+":
                                b2 = 3;
                                break;
                            default:
                                b2 = -1;
                                break;
                        }
                    } else if (str2.equals(HiDataFilter.DataFilterExpression.BIGGER_THAN)) {
                        b2 = 7;
                    } else {
                        b2 = -1;
                    }
                } else if (str2.equals(HiDataFilter.DataFilterExpression.LESS_THAN)) {
                    b2 = 6;
                } else {
                    b2 = -1;
                }
            } else if (str2.equals("/")) {
                b2 = 5;
            } else {
                b2 = -1;
            }
        } else if (str2.equals(Constants.LINK)) {
            b2 = 4;
        } else {
            b2 = -1;
        }
        switch (b2) {
            case 0:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
                if (i >= i2) {
                    String strReplaceAll = str.substring(i2, i).trim().replaceAll(" ", "");
                    if (!TextUtils.isEmpty(strReplaceAll)) {
                        stack.add(strReplaceAll);
                    }
                    stack.add(str2);
                    return i2 - 1;
                }
                return i;
            case 1:
                stack.add(str2);
                return i2 - 1;
            default:
                return i;
        }
    }

    private boolean b(Stack<String> stack) {
        LogUtil.a("MassageGunRulesFilteringUtil", "judge");
        String strPop = !stack.isEmpty() ? stack.pop() : null;
        String strPop2 = !stack.isEmpty() ? stack.pop() : null;
        String strPop3 = stack.isEmpty() ? null : stack.pop();
        if (d(strPop, strPop2, strPop3, stack)) {
            return b(stack);
        }
        return a(stack, strPop, strPop2, strPop3);
    }

    /* JADX WARN: Code duplicated, block: B:80:0x00dd  */
    private boolean a(Stack<String> stack, String str, String str2, String str3) {
        if (TextUtils.isEmpty(str2)) {
            return str != null && str.toLowerCase(Locale.ENGLISH).equals("true");
        }
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str3)) {
            LogUtil.a("MassageGunRulesFilteringUtil", "leftValue or rightValue is null");
            return false;
        }
        str2.hashCode();
        switch (str2) {
            case "*":
                return a(stack, e(d(str), d(str3)));
            case "+":
                return e(stack, c(d(str), d(str3)));
            case "-":
                return c(stack, a(d(str), d(str3)));
            case "/":
                return d(stack, d(d(str), d(str3)));
            case "<":
                return a(stack, str, str3, -1);
            case ">":
                return a(stack, str, str3, 1);
            case "!=":
                return d(stack, str, str3, 0);
            case "&&":
                return c(stack, str, str3);
            case "<=":
                return d(stack, str, str3, 1);
            case "==":
                return a(stack, str, str3, 0);
            case ">=":
                return d(stack, str, str3, -1);
            case "||":
                return e(stack, str, str3);
            default:
                return false;
        }
    }

    private boolean d(String str, String str2, String str3, Stack<String> stack) {
        LogUtil.a("MassageGunRulesFilteringUtil", "checkBracket");
        if (this.f33099b == null) {
            this.f33099b = new Stack<>();
        }
        if (str != null) {
            str.hashCode();
            if (str.equals(com.huawei.operation.utils.Constants.LEFT_BRACKET_ONLY)) {
                LogUtil.a("MassageGunRulesFilteringUtil", "leftValue is LEFT_BRACKET");
                stack.add(str3);
                stack.add(str2);
                return true;
            }
            if (str.equals(com.huawei.operation.utils.Constants.RIGHT_BRACKET_ONLY)) {
                LogUtil.a("MassageGunRulesFilteringUtil", "leftValue is RIGHT_BRACKET");
                stack.add(str2);
                stack.add(str);
                return true;
            }
        }
        if (com.huawei.operation.utils.Constants.RIGHT_BRACKET_ONLY.equals(str2)) {
            LogUtil.a("MassageGunRulesFilteringUtil", "operator is RIGHT_BRACKET ", Boolean.valueOf(this.e));
            if (this.e) {
                this.e = false;
                stack.add(this.f33099b.pop());
                stack.add(this.f33099b.pop());
            }
            if (!TextUtils.isEmpty(str3)) {
                stack.add(str3);
            }
            stack.add(str);
            return true;
        }
        if (!com.huawei.operation.utils.Constants.LEFT_BRACKET_ONLY.equals(str3)) {
            return false;
        }
        LogUtil.a("MassageGunRulesFilteringUtil", "rightValue is LEFT_BRACKET");
        this.e = true;
        this.f33099b.add(str2);
        this.f33099b.add(str);
        return true;
    }

    private boolean d(Stack<String> stack, String str) {
        LogUtil.a("MassageGunRulesFilteringUtil", "doDividedAction");
        c(stack);
        stack.add(str);
        return b(stack);
    }

    private boolean a(Stack<String> stack, String str) {
        LogUtil.a("MassageGunRulesFilteringUtil", "doMultiplyingAction");
        c(stack);
        stack.add(str);
        return b(stack);
    }

    private boolean c(Stack<String> stack, String str) {
        LogUtil.a("MassageGunRulesFilteringUtil", "doMinusAction");
        c(stack);
        stack.add(str);
        return b(stack);
    }

    private boolean e(Stack<String> stack, String str) {
        LogUtil.a("MassageGunRulesFilteringUtil", "doAddAction");
        c(stack);
        stack.add(str);
        return b(stack);
    }

    private boolean d(Stack<String> stack, String str, String str2, int i) {
        LogUtil.a("MassageGunRulesFilteringUtil", "doUnequalRelationalOperationAction");
        c(stack);
        stack.add(String.valueOf(b(d(str), d(str2)) != i));
        return b(stack);
    }

    private boolean a(Stack<String> stack, String str, String str2, int i) {
        LogUtil.a("MassageGunRulesFilteringUtil", "doRelationalOperationAction");
        c(stack);
        stack.add(String.valueOf(b(d(str), d(str2)) == i));
        return b(stack);
    }

    private boolean e(Stack<String> stack, String str, String str2) {
        LogUtil.a("MassageGunRulesFilteringUtil", "doOrAction");
        boolean z = true;
        if ((TextUtils.isEmpty(str2) || !"true".toLowerCase(Locale.ENGLISH).equals(str2)) && !"false".toLowerCase(Locale.ENGLISH).equals(str2)) {
            this.j = str;
            this.f33098a = true;
            stack.add(str2);
        } else {
            this.f33098a = false;
            if (!"true".toLowerCase(Locale.ENGLISH).equals(str) && !"true".toLowerCase(Locale.ENGLISH).equals(str2)) {
                z = false;
            }
            stack.add(String.valueOf(z));
        }
        return b(stack);
    }

    private boolean c(Stack<String> stack, String str, String str2) {
        LogUtil.a("MassageGunRulesFilteringUtil", "doAndAction");
        if ((TextUtils.isEmpty(str2) || !"true".toLowerCase(Locale.ENGLISH).equals(str2)) && !"false".toLowerCase(Locale.ENGLISH).equals(str2)) {
            this.f33100c = str;
            this.d = true;
            stack.add(str2);
        } else {
            this.d = false;
            stack.add(String.valueOf("true".toLowerCase(Locale.ENGLISH).equals(str) && "true".toLowerCase(Locale.ENGLISH).equals(str2)));
        }
        return b(stack);
    }

    private Stack<String> c(Stack<String> stack) {
        LogUtil.a("MassageGunRulesFilteringUtil", "isNeedAddAndOrOrResult isAndBeforeResult: ", Boolean.valueOf(this.d), " isOrBeforeResult: ", Boolean.valueOf(this.f33098a));
        if (this.d) {
            stack.add(this.f33100c);
            stack.add(Constants.PARAM_SERVER_SPLIT);
        }
        if (this.f33098a) {
            stack.add(this.j);
            stack.add("||");
        }
        return stack;
    }

    private String d(String str) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.a("MassageGunRulesFilteringUtil", "key is null");
            return "";
        }
        LogUtil.a("MassageGunRulesFilteringUtil", "getValueFromMap key ", str);
        if (str.matches("^(\\-|\\+)?\\d+(\\.\\d+)?$")) {
            return str;
        }
        return this.f.containsKey(str) ? String.valueOf(this.f.get(str)) : "";
    }

    private String c(String str) {
        return TextUtils.isEmpty(str) ? String.valueOf(0) : str;
    }

    private String c(String str, String str2) {
        return new BigDecimal(c(str)).add(new BigDecimal(c(str2))).toString();
    }

    private String a(String str, String str2) {
        return new BigDecimal(c(str)).subtract(new BigDecimal(c(str2))).toString();
    }

    private String e(String str, String str2) {
        return new BigDecimal(c(str)).multiply(new BigDecimal(c(str2))).toString();
    }

    private String d(String str, String str2) {
        return a(str, str2, RoundingMode.DOWN);
    }

    private String a(String str, String str2, RoundingMode roundingMode) {
        return a(str, str2, roundingMode, 2);
    }

    private String a(String str, String str2, RoundingMode roundingMode, int i) {
        try {
            return new BigDecimal(c(str)).divide(new BigDecimal(c(str2)), i, roundingMode).toString();
        } catch (ArithmeticException unused) {
            return "0";
        }
    }

    public int b(String str, String str2) {
        return new BigDecimal(c(str)).compareTo(new BigDecimal(c(str2)));
    }
}
