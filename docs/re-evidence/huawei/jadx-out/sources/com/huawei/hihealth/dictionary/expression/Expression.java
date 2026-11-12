package com.huawei.hihealth.dictionary.expression;

import com.huawei.hihealth.HiDataFilter;
import com.huawei.openalliance.ad.constant.Constants;
import health.compact.a.util.LogUtil;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Stack;
import org.slf4j.Marker;

/* JADX INFO: loaded from: classes2.dex */
public class Expression {
    private List<Token> d;
    private Set<String> e;

    public Expression(List<Token> list, Set<String> set) {
        this.d = list;
        this.e = set;
    }

    public Set<String> c() {
        return this.e;
    }

    public double c(Map<String, Double> map) {
        Set<String> set = this.e;
        if (set != null && !set.isEmpty() && (map == null || !map.keySet().containsAll(this.e))) {
            throw new IllegalArgumentException("paramMap does not contain all params.");
        }
        return d(this.d, map);
    }

    public boolean a(Map<String, Double> map) {
        try {
            return c(map) > 0.0d;
        } catch (IllegalArgumentException e) {
            LogUtil.d("HiH_Expression", "illegal argument：", e.getMessage());
            return false;
        } catch (Exception unused) {
            LogUtil.d("HiH_Expression", "unknown error.");
            return false;
        }
    }

    private double d(List<Token> list, Map<String, Double> map) {
        if (list == null || list.isEmpty()) {
            throw new IllegalArgumentException("expressStack is null or empty.");
        }
        if (list.size() == 1) {
            return Double.valueOf(this.d.get(0).c()).doubleValue();
        }
        Stack stack = new Stack();
        double d = 0.0d;
        for (int i = 0; i < list.size(); i++) {
            Token token = list.get(i);
            stack.push(token);
            if (token.d() == 0) {
                if (stack.size() < 3) {
                    throw new IllegalArgumentException("expression is illegal.");
                }
                d = d((Token) stack.pop(), (Token) stack.pop(), (Token) stack.pop(), map);
                stack.push(new Token(2, d + ""));
            }
        }
        return d;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:74:0x00f2  */
    /* JADX WARN: Failed to clean up code after switch over string restore
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v2 int, still in use, count: 8, list:
      (r0v2 int) from 0x0052: IF  (r0v2 int) != (42 int)  -> B:17:0x0054 A[HIDDEN]
      (r0v2 int) from 0x0056: IF  (r0v2 int) != (43 int)  -> B:19:0x0058 A[HIDDEN]
      (r0v2 int) from 0x005a: IF  (r0v2 int) != (45 int)  -> B:21:0x005c A[HIDDEN]
      (r0v2 int) from 0x005e: IF  (r0v2 int) != (47 int)  -> B:23:0x0060 A[HIDDEN]
      (r0v2 int) from 0x0062: IF  (r0v2 int) != (1216 int)  -> B:25:0x0064 A[HIDDEN]
      (r0v2 int) from 0x0066: IF  (r0v2 int) != (1921 int)  -> B:27:0x0068 A[HIDDEN]
      (r0v2 int) from 0x006a: IF  (r0v2 int) != (1983 int)  -> B:29:0x006c A[HIDDEN]
      (r0v2 int) from 0x006e: IF  (r0v2 int) != (3968 int)  -> B:31:0x0070 A[HIDDEN]
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
    private static double d(Token token, Token token2, Token token3, Map<String, Double> map) {
        byte b2 = 1;
        if ((token.d() == 1 || token2.d() == 1) && map == null) {
            throw new IllegalArgumentException("paramMap cannot be null.");
        }
        int iD = token.d();
        String strC = token.c();
        double dDoubleValue = iD == 1 ? map.get(strC).doubleValue() : Double.parseDouble(strC);
        double dDoubleValue2 = token2.d() == 1 ? map.get(token2.c()).doubleValue() : Double.parseDouble(token2.c());
        String strC2 = token3.c();
        strC2.hashCode();
        if (iHashCode != 42) {
            if (iHashCode != 43) {
                if (iHashCode != 45) {
                    if (iHashCode != 47) {
                        if (iHashCode != 1216) {
                            if (iHashCode != 1921) {
                                if (iHashCode != 1983) {
                                    if (iHashCode != 3968) {
                                        switch (strC2) {
                                            case "<":
                                                b2 = 4;
                                                break;
                                            case "=":
                                                b2 = 5;
                                                break;
                                            case ">":
                                                b2 = 6;
                                                break;
                                            default:
                                                b2 = -1;
                                                break;
                                        }
                                    } else if (strC2.equals("||")) {
                                        b2 = 10;
                                    } else {
                                        b2 = -1;
                                    }
                                } else if (strC2.equals(HiDataFilter.DataFilterExpression.BIGGER_EQUAL)) {
                                    b2 = 9;
                                } else {
                                    b2 = -1;
                                }
                            } else if (strC2.equals(HiDataFilter.DataFilterExpression.LESS_EQUAL)) {
                                b2 = 8;
                            } else {
                                b2 = -1;
                            }
                        } else if (strC2.equals(Constants.PARAM_SERVER_SPLIT)) {
                            b2 = 7;
                        } else {
                            b2 = -1;
                        }
                    } else if (strC2.equals("/")) {
                        b2 = 3;
                    } else {
                        b2 = -1;
                    }
                } else if (strC2.equals(Constants.LINK)) {
                    b2 = 2;
                } else {
                    b2 = -1;
                }
            } else if (!strC2.equals(Marker.ANY_NON_NULL_MARKER)) {
                b2 = -1;
            }
        } else if (strC2.equals("*")) {
            b2 = 0;
        } else {
            b2 = -1;
        }
        switch (b2) {
            case 0:
                return dDoubleValue * dDoubleValue2;
            case 1:
                return dDoubleValue + dDoubleValue2;
            case 2:
                return dDoubleValue - dDoubleValue2;
            case 3:
                return dDoubleValue / dDoubleValue2;
            case 4:
                return Double.compare(dDoubleValue, dDoubleValue2) < 0 ? 1.0d : -1.0d;
            case 5:
                return Double.compare(dDoubleValue, dDoubleValue2) == 0 ? 1.0d : -1.0d;
            case 6:
                return Double.compare(dDoubleValue, dDoubleValue2) > 0 ? 1.0d : -1.0d;
            case 7:
                return (dDoubleValue <= 0.0d || dDoubleValue2 <= 0.0d) ? -1.0d : 1.0d;
            case 8:
                return Double.compare(dDoubleValue, dDoubleValue2) <= 0 ? 1.0d : -1.0d;
            case 9:
                return Double.compare(dDoubleValue, dDoubleValue2) >= 0 ? 1.0d : -1.0d;
            case 10:
                return (dDoubleValue > 0.0d || dDoubleValue2 > 0.0d) ? 1.0d : -1.0d;
            default:
                throw new IllegalArgumentException("oper does not support: " + token3.c());
        }
    }
}
