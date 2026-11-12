package com.xiaomi.ai.domain.mobileapp.parser;

import com.miui.tsmclient.util.Constants;
import com.xiaomi.ai.domain.mobileapp.common.MobileAppIntention;
import com.xiaomi.smarthome.plugin.update.PluginPackageConstant;
import defpackage.ovg;
import defpackage.xb8;
import defpackage.y2e;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
public class ConfidenceTool {
    private static final String TOKEN_EOS = "</s>";
    private static final String TOKEN_SOS = "<s>";
    private static final Set<String> ACTION_SLOTS = new HashSet(Arrays.asList("open", Constants.EXTRA_CLOSE_TAI, PluginPackageConstant.RN_INSTALL_DIR_KEY, "uninstall"));
    private static final Set<String> NAME_TAG_SLOTS = new HashSet(Arrays.asList("name", "tag"));
    private static final Set<String> SKIP_TOKENS = new HashSet(Arrays.asList("app", "所有"));
    private static final Set<String> SKIP_SLOTS = new HashSet(Arrays.asList("function", "modal_particle", "nonsense"));

    public static void setConfidence(y2e y2eVar, MobileAppIntention mobileAppIntention) {
        if (mobileAppIntention.getScore() < 0.6d) {
            return;
        }
        if (mobileAppIntention.getName().equals(mobileAppIntention.getQuery())) {
            mobileAppIntention.setConfidence(1.0d);
            return;
        }
        String str = "";
        String str2 = "";
        for (ovg ovgVarE = y2eVar.l().e(); ovgVarE != null; ovgVarE = ovgVarE.e()) {
            xb8 xb8VarI = ovgVarE.i();
            String strH = xb8VarI.h();
            String strF = xb8VarI.f();
            if (ACTION_SLOTS.contains(strF) && strH.length() > str.length()) {
                str = strH;
            } else if (NAME_TAG_SLOTS.contains(strF) && strH.length() > str2.length()) {
                str2 = strH;
            }
        }
        int length = 0;
        int length2 = 0;
        int length3 = 0;
        int length4 = 0;
        for (ovg ovgVarE2 = y2eVar.l().e(); ovgVarE2 != null; ovgVarE2 = ovgVarE2.e()) {
            xb8 xb8VarI2 = ovgVarE2.i();
            String strH2 = xb8VarI2.h();
            String strF2 = xb8VarI2.f();
            if (!TOKEN_SOS.equals(strH2) && !TOKEN_EOS.equals(strH2)) {
                if (ACTION_SLOTS.contains(strF2) && str.equals(strH2)) {
                    length += strH2.length();
                } else if (NAME_TAG_SLOTS.contains(strF2) && str2.equals(strH2)) {
                    length2 += strH2.length();
                } else if (SKIP_SLOTS.contains(strF2) || SKIP_TOKENS.contains(strH2.toLowerCase())) {
                    length3 += strH2.length();
                }
                length4 += strH2.length();
            }
        }
        int i = length + length2 + length3;
        float f = length4 * 0.95f;
        mobileAppIntention.getDebugInfo().addProperty("confidence", "validLen:" + i + " total_95:" + f);
        if (i >= f) {
            mobileAppIntention.setConfidence(1.0d);
        }
    }
}
