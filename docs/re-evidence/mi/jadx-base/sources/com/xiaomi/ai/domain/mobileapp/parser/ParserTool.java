package com.xiaomi.ai.domain.mobileapp.parser;

import com.google.gson.JsonObject;
import com.miui.tsmclient.util.Constants;
import com.xiaomi.ai.domain.mobileapp.common.ActionType;
import com.xiaomi.ai.domain.mobileapp.common.Device;
import com.xiaomi.ai.domain.mobileapp.common.MobileAppIntention;
import com.xiaomi.smarthome.plugin.update.PluginPackageConstant;
import defpackage.aqe;
import defpackage.ovg;
import defpackage.qpe;
import defpackage.xb8;
import defpackage.y2e;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class ParserTool {
    private static final qpe LOGGER = aqe.f(ParserTool.class);
    private static final List<String> PENALTY_WORDS = Arrays.asList("当当", "西瓜", "小米", "你", "可以", "消息", "信息", "刷新", "拍拍", "模式", "扫描", "虾米", "计算机", "个性主题", "远程协助", "壁纸", "主题", "百度", "uc", "移动", "baidu");
    private static final List<String> PENALTY_PACKAGE_DISPLAY_NAMES = Arrays.asList("百度", "喜马拉雅", "高德地图", "京东", "微信", "优酷");

    public static void longQueryScore(y2e y2eVar, MobileAppIntention mobileAppIntention, boolean z, Device device) {
        if (mobileAppIntention.getAction().equals(ActionType.QUERY.toString()) || !mobileAppIntention.getPattern().equals(MobileAppIntention.PATTERN.NO_PATTERN)) {
            return;
        }
        double length = 0.0d;
        double length2 = 0.0d;
        double d = 0.0d;
        double d2 = 0.0d;
        for (ovg ovgVarE = y2eVar.l().e(); ovgVarE != null; ovgVarE = ovgVarE.e()) {
            xb8 xb8VarI = ovgVarE.i();
            String strF = xb8VarI.f();
            String strH = xb8VarI.h();
            String strG = xb8VarI.g();
            if (!strF.equals("function") && !strH.equals("</s>") && !strF.equals("nonsense") && !strF.equals("modal_particle")) {
                if (strF.equals("name") && d == 0.0d && strG.equals(mobileAppIntention.getName())) {
                    length += z ? ResourceSuite.getInstance().isTopApp(strH, device) ? 2.0d : 1.0d : ResourceSuite.getInstance().isTopApp(strH, device) ? strH.length() * 2 : strH.length();
                    d += 1.0d;
                } else if ((((strF.equals("open") | strF.equals(Constants.EXTRA_CLOSE_TAI)) || strF.equals(PluginPackageConstant.RN_INSTALL_DIR_KEY)) || strF.equals("uninstall")) && d2 == 0.0d && strF.equals(mobileAppIntention.getAction().toLowerCase())) {
                    length = z ? length + 1.0d : length + ((double) strH.length());
                    d2 += 1.0d;
                } else {
                    length2 = z ? length2 + 1.0d : length2 + ((double) strH.length());
                }
            }
        }
        double d3 = length / (length2 + length);
        boolean zMatchWhiteList = ResourceSuite.getInstance().matchWhiteList(mobileAppIntention.getQuery());
        mobileAppIntention.getDebugInfo().addProperty("longQuery", "score:" + d3 + " matchWhite:" + zMatchWhiteList);
        if (d3 < 0.4d && !zMatchWhiteList) {
            mobileAppIntention.setScore(0.0d);
            return;
        }
        if (d3 >= 0.8d) {
            mobileAppIntention.setScore(mobileAppIntention.getScore());
            return;
        }
        mobileAppIntention.setScore(d3);
        Iterator<String> it = PENALTY_PACKAGE_DISPLAY_NAMES.iterator();
        while (it.hasNext()) {
            if (mobileAppIntention.getName().equals(it.next())) {
                mobileAppIntention.setScore(0.6d);
                mobileAppIntention.getDebugInfo().addProperty("longQuery_penalty", (Number) 1);
                return;
            }
        }
    }

    public static void penaltyScore(String str, MobileAppIntention mobileAppIntention) {
        double score = mobileAppIntention.getScore();
        if (score <= 0.05d) {
            score = 0.05d;
        }
        Iterator<String> it = PENALTY_WORDS.iterator();
        while (it.hasNext()) {
            if (str.contains(it.next())) {
                mobileAppIntention.setScore(score - 0.05d);
                return;
            }
        }
    }

    public static void specialPatternScore(String str, MobileAppIntention mobileAppIntention, Device device) {
        MobileAppIntention.PATTERN pattern = mobileAppIntention.getPattern();
        if (pattern.equals(MobileAppIntention.PATTERN.TAG_PATTERN)) {
            mobileAppIntention.setScore(0.85d);
            Iterator<String> it = PENALTY_WORDS.iterator();
            while (it.hasNext()) {
                if (str.contains(it.next())) {
                    mobileAppIntention.setScore(0.4d);
                    return;
                }
            }
            return;
        }
        if (pattern.equals(MobileAppIntention.PATTERN.WEAK_PATTERN)) {
            mobileAppIntention.setScore(0.6d);
            Iterator<String> it2 = PENALTY_WORDS.iterator();
            while (it2.hasNext()) {
                if (str.contains(it2.next())) {
                    mobileAppIntention.setScore(0.4d);
                    return;
                }
            }
            return;
        }
        if (pattern == MobileAppIntention.PATTERN.SEARCH_PATTERN) {
            if (ResourceSuite.getInstance().isTopApp(mobileAppIntention.getName(), device)) {
                mobileAppIntention.setScore(0.9d);
            } else if (mobileAppIntention.getName().isEmpty()) {
                mobileAppIntention.setScore(0.0d);
            } else {
                mobileAppIntention.setScore(0.0d);
            }
        }
    }

    public static void topnameProcess(y2e y2eVar, MobileAppIntention mobileAppIntention, Device device) {
        ovg ovgVarE;
        ovg ovgVarE2 = y2eVar.l().e();
        xb8 xb8VarI = ovgVarE2.i();
        String strF = xb8VarI.f();
        String strH = xb8VarI.h();
        if (!strF.equals("name") || ovgVarE2.e() == null) {
            if (!strF.equals("nonsense") || (ovgVarE = ovgVarE2.e()) == null) {
                return;
            }
            String strF2 = ovgVarE.i().f();
            String strH2 = ovgVarE.i().h();
            if (strF2.equals("name") && ResourceSuite.getInstance().isTopApp(strH2, device) && !ResourceSuite.getInstance().matchTopnameBlackList(strH2) && ovgVarE.e() != null && ovgVarE.e().i().h().equals("</s>")) {
                mobileAppIntention.getDebugInfo().addProperty("topnameProcess", "topName:" + strH);
                mobileAppIntention.setAction(ActionType.OPEN.toString());
                mobileAppIntention.setOnlyAppName(true);
            }
            return;
        }
        if (!ResourceSuite.getInstance().isTopApp(strH, device) || ResourceSuite.getInstance().matchTopnameBlackList(strH)) {
            return;
        }
        mobileAppIntention.getDebugInfo().addProperty("topnameProcess", "topName:" + strH);
        if (ovgVarE2.e().i().h().equals("</s>")) {
            mobileAppIntention.setAction(ActionType.OPEN.toString());
            mobileAppIntention.setOnlyAppName(true);
            return;
        }
        String strF3 = ovgVarE2.e().i().f();
        strF3.hashCode();
        switch (strF3) {
            case "uninstall":
                mobileAppIntention.setAction(ActionType.UNINSTALL.toString());
                break;
            case "name":
                String strH3 = ovgVarE2.e().i().h();
                if (ResourceSuite.getInstance().isTopApp(strH3, device) && strH.equals(strH3)) {
                    mobileAppIntention.setAction(ActionType.OPEN.toString());
                    break;
                }
                break;
            case "open":
                mobileAppIntention.setAction(ActionType.OPEN.toString());
                break;
            case "close":
                mobileAppIntention.setAction(ActionType.CLOSE.toString());
                break;
            case "modal_particle":
                if (ovgVarE2.e().e().i().h().equals("</s>")) {
                    mobileAppIntention.setAction(ActionType.OPEN.toString());
                    break;
                }
                break;
            case "install":
                mobileAppIntention.setAction(ActionType.INSTALL.toString());
                break;
        }
    }

    public static void weakPatternPreProcess(y2e y2eVar, MobileAppIntention mobileAppIntention, Device device) {
        if (mobileAppIntention.getAction().equals(ActionType.QUERY.toString())) {
            ovg ovgVarE = y2eVar.l().e();
            if (ovgVarE.i().f().equals("name") && ovgVarE.e() != null && ovgVarE.e().i().h().equals("</s>") && ovgVarE.i().h().length() >= 5 && !ovgVarE.i().h().matches("^[a-zA-Z]*")) {
                mobileAppIntention.setPattern(MobileAppIntention.PATTERN.WEAK_PATTERN);
                return;
            }
            JsonObject debugInfo = mobileAppIntention.getDebugInfo();
            double d = 0.0d;
            int i = 0;
            String str = "";
            double d2 = 0.0d;
            while (ovgVarE != null) {
                xb8 xb8VarI = ovgVarE.i();
                String strF = xb8VarI.f();
                String strH = xb8VarI.h();
                if (ResourceSuite.getInstance().matchWeakPatternBlackList(strH)) {
                    mobileAppIntention.setPattern(MobileAppIntention.PATTERN.NO_PATTERN);
                    debugInfo.addProperty("weakPatternPreProcess", "token:" + strH + ", matchWeakPatternBlackList");
                    return;
                }
                if (!strF.equals("function") && !strH.equals("</s>") && !strF.equals("nonsense") && !strF.equals("modal_particle")) {
                    if (strF.equals("name") && ResourceSuite.getInstance().isTopApp(strH, device) && ((i == 0 || (i > 0 && str.equalsIgnoreCase(strH))) && !ResourceSuite.getInstance().matchTopnameBlackList(strH))) {
                        d += 2.0d;
                        i++;
                        mobileAppIntention.setPattern(MobileAppIntention.PATTERN.WEAK_PATTERN);
                        str = strH;
                    } else if ((strF.equals("open") | strF.equals(Constants.EXTRA_CLOSE_TAI) | strF.equals(PluginPackageConstant.RN_INSTALL_DIR_KEY)) || strF.equals("uninstall")) {
                        d += 1.0d;
                    } else {
                        d2 += 1.0d;
                    }
                }
                ovgVarE = ovgVarE.e();
            }
            double d3 = d / (d2 + d);
            debugInfo.addProperty("weakPatternPreProcess", "score:" + d3 + " appNum:" + i + " appTagNum:0");
            if (d3 <= 0.5d || i == 0) {
                mobileAppIntention.setPattern(MobileAppIntention.PATTERN.NO_PATTERN);
            }
        }
    }

    public static void weakPatternProcess(y2e y2eVar, MobileAppIntention mobileAppIntention, Device device) {
        if (!mobileAppIntention.getAction().equals(ActionType.QUERY.toString())) {
            if (mobileAppIntention.getAction().equals("SEARCH")) {
                mobileAppIntention.setPattern(MobileAppIntention.PATTERN.SEARCH_PATTERN);
                mobileAppIntention.setAction(ActionType.OPEN.toString());
                return;
            }
            return;
        }
        ovg ovgVarE = y2eVar.l().e();
        if (ovgVarE.i().f().equals("name") && ovgVarE.e() != null && ovgVarE.e().i().h().equals("</s>") && ovgVarE.i().h().length() >= 5 && !ovgVarE.i().h().matches("^[a-zA-Z]*")) {
            mobileAppIntention.setPattern(MobileAppIntention.PATTERN.WEAK_PATTERN);
            mobileAppIntention.setAction(ActionType.OPEN.toString());
            return;
        }
        JsonObject debugInfo = mobileAppIntention.getDebugInfo();
        double d = 0.0d;
        String upperCase = "";
        String str = upperCase;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        boolean z = false;
        double d2 = 0.0d;
        while (ovgVarE != null) {
            xb8 xb8VarI = ovgVarE.i();
            upperCase = upperCase;
            String strF = xb8VarI.f();
            boolean z2 = z;
            String strH = xb8VarI.h();
            ovg ovgVar = ovgVarE;
            String strG = xb8VarI.g();
            double d3 = d2;
            if (ResourceSuite.getInstance().matchWeakPatternBlackList(strH)) {
                mobileAppIntention.setPattern(MobileAppIntention.PATTERN.NO_PATTERN);
                debugInfo.addProperty("weakPatternProcess", "token:" + strH + ", matchWeakPatternBlackList");
                return;
            }
            if (!strF.equals("function") && !strH.equals("</s>") && !strF.equals("nonsense") && !strF.equals("modal_particle")) {
                if (strF.equals("name") && ResourceSuite.getInstance().isTopApp(strH, device) && i2 == 0 && ((i == 0 || (i > 0 && str.equalsIgnoreCase(strH))) && !ResourceSuite.getInstance().matchTopnameBlackList(strH) && strG.equals(mobileAppIntention.getName()))) {
                    d += 2.0d;
                    i++;
                    mobileAppIntention.setPattern(MobileAppIntention.PATTERN.WEAK_PATTERN);
                    str = strH;
                } else {
                    if (((strF.equals("open") | strF.equals(Constants.EXTRA_CLOSE_TAI) | strF.equals(PluginPackageConstant.RN_INSTALL_DIR_KEY)) || strF.equals("uninstall")) && i3 == 0) {
                        d += 1.0d;
                        i3++;
                        upperCase = strF.toUpperCase();
                        z = true;
                    } else if (strF.equals("tag") && i == 0 && i2 == 0) {
                        d += 2.0d;
                        i2++;
                        mobileAppIntention.setPattern(MobileAppIntention.PATTERN.TAG_PATTERN);
                        mobileAppIntention.setTag(strH);
                    } else {
                        d3 += 1.0d;
                    }
                    ovgVarE = ovgVar.e();
                    d2 = d3;
                }
                z = z2;
                ovgVarE = ovgVar.e();
                d2 = d3;
            }
            z = z2;
            ovgVarE = ovgVar.e();
            d2 = d3;
        }
        String str2 = upperCase;
        boolean z3 = z;
        double d4 = d / (d + d2);
        debugInfo.addProperty("weakPatternProcess", "score:" + d4 + " appNum:" + i + " appTagNum:" + i2 + " actionNum: " + i3);
        if (d4 <= 0.5d || i + i2 == 0) {
            mobileAppIntention.setPattern(MobileAppIntention.PATTERN.NO_PATTERN);
        } else if (z3) {
            mobileAppIntention.setAction(str2);
        } else {
            mobileAppIntention.setAction(ActionType.OPEN.toString());
        }
    }
}
