package com.xiaomi.ai.domain.mobileapp.parser;

import com.miui.tsmclient.util.Constants;
import com.xiaomi.ai.domain.mobileapp.common.Device;
import com.xiaomi.ai.domain.mobileapp.common.MobileAppIntention;
import com.xiaomi.smarthome.plugin.update.PluginPackageConstant;
import defpackage.ovg;
import defpackage.xb8;
import defpackage.y2e;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class NameExtractor {
    public static void extractAppName(y2e y2eVar, MobileAppIntention mobileAppIntention, Device device) {
        ovg ovgVarE = y2eVar.l().e();
        String strF = ovgVarE.i().f();
        String strG = ovgVarE.i().g();
        boolean z = false;
        boolean z2 = strF.equals("name") && ResourceSuite.getInstance().isTopApp(strG, device) && !ResourceSuite.getInstance().matchTopnameBlackList(strG);
        boolean z3 = strF.equals("name") && ovgVarE.e() != null && ovgVarE.e().i().h().equals("</s>") && ovgVarE.i().h().length() >= 5 && !ovgVarE.i().h().matches("^[a-zA-Z]*");
        ArrayList arrayList = new ArrayList();
        HashMap map = new HashMap();
        while (ovgVarE != null) {
            xb8 xb8VarI = ovgVarE.i();
            String strF2 = xb8VarI.f();
            if (isActionSlot(strF2) || strF2.equals("name")) {
                arrayList.add(xb8VarI);
            }
            if (strF2.equals("name") || strF2.equals("tag")) {
                map.put(xb8VarI.e(), strF2);
            }
            ovgVarE = ovgVarE.e();
        }
        mobileAppIntention.setNameTypeMap(map);
        if (arrayList.size() == 0) {
            return;
        }
        Iterator it = arrayList.iterator();
        int i = 0;
        boolean z4 = false;
        while (it.hasNext()) {
            String strF3 = ((xb8) it.next()).f();
            if (!z && isActionSlot(strF3)) {
                if (i == arrayList.size() - 1) {
                    z = true;
                    z4 = true;
                } else {
                    z = true;
                }
            }
            i++;
        }
        mobileAppIntention.setName("");
        mobileAppIntention.setTopname("");
        if (z2) {
            extractFirstTopName(arrayList, mobileAppIntention, device);
        } else if (z3) {
            extractFirstName(arrayList, mobileAppIntention);
        } else if (z && !z4) {
            extractFirstNameAfterFirstAction(arrayList, mobileAppIntention);
        } else if (z && z4) {
            extractLastNameBeforeFirstAction(arrayList, mobileAppIntention);
        } else if (mobileAppIntention.getPattern().equals(MobileAppIntention.PATTERN.WEAK_PATTERN)) {
            extractFirstTopName(arrayList, mobileAppIntention, device);
        } else if (mobileAppIntention.getPattern().equals(MobileAppIntention.PATTERN.SEARCH_PATTERN) || !z) {
            extractFirstName(arrayList, mobileAppIntention);
        }
        if (!mobileAppIntention.getName().isEmpty() || mobileAppIntention.getTopname().isEmpty()) {
            return;
        }
        mobileAppIntention.setName(mobileAppIntention.getTopname());
    }

    private static void extractFirstName(List<xb8> list, MobileAppIntention mobileAppIntention) {
        for (xb8 xb8Var : list) {
            String strG = xb8Var.g();
            if (xb8Var.f().equals("name") && !ResourceSuite.getInstance().matchTopnameBlackList(strG)) {
                mobileAppIntention.setName(strG);
                return;
            }
        }
    }

    private static void extractFirstNameAfterFirstAction(List<xb8> list, MobileAppIntention mobileAppIntention) {
        Boolean bool = Boolean.FALSE;
        for (xb8 xb8Var : list) {
            String strF = xb8Var.f();
            String strG = xb8Var.g();
            if (isActionSlot(strF) && !bool.booleanValue()) {
                bool = Boolean.TRUE;
            } else if (!isActionSlot(strF) && bool.booleanValue()) {
                if (strF.equals("name")) {
                    mobileAppIntention.setName(strG);
                    return;
                }
                return;
            }
        }
    }

    private static void extractFirstTopName(List<xb8> list, MobileAppIntention mobileAppIntention, Device device) {
        for (xb8 xb8Var : list) {
            String strG = xb8Var.g();
            if (xb8Var.f().equals("name") && ResourceSuite.getInstance().isTopApp(strG, device) && !ResourceSuite.getInstance().matchTopnameBlackList(strG)) {
                mobileAppIntention.setTopname(strG);
                return;
            }
        }
    }

    private static void extractLastNameBeforeFirstAction(List<xb8> list, MobileAppIntention mobileAppIntention) {
        Boolean bool = Boolean.FALSE;
        for (int size = list.size() - 1; size >= 0; size--) {
            xb8 xb8Var = list.get(size);
            String strF = xb8Var.f();
            String strG = xb8Var.g();
            if (isActionSlot(strF) && !bool.booleanValue()) {
                bool = Boolean.TRUE;
            } else if (!isActionSlot(strF) && bool.booleanValue()) {
                if (strF.equals("name")) {
                    mobileAppIntention.setName(strG);
                    return;
                }
                return;
            }
        }
    }

    private static boolean isActionSlot(String str) {
        return str.equals("open") || str.equals(Constants.EXTRA_CLOSE_TAI) || str.equals(PluginPackageConstant.RN_INSTALL_DIR_KEY) || str.equals("uninstall");
    }
}
