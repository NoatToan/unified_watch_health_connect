package defpackage;

import com.xiaomi.ai.android.utils.DeviceUtils;
import com.xiaomi.ai.api.common.Context;
import com.xiaomi.ai.api.common.Instruction;
import com.xiaomi.ai.edge.common.model.EdgeNetworkType;
import com.xiaomi.fitness.aivs.util.PhoneCallUtil;
import com.xiaomi.fitness.common.utils.AppUtil;

/* JADX INFO: loaded from: classes7.dex */
public class gth {
    public static Context a() {
        c4h c4hVarE = eth.e();
        if (c4hVarE == null) {
            vpe.c("PhoneCallUtilsChildren", "buildPhoneLastAnswerContext:phoneCallContext=null");
            return null;
        }
        if (c4hVarE.size() == 0) {
            vpe.c("PhoneCallUtilsChildren", "buildPhoneLastAnswerContext:phoneCallContextSize<=0");
            return null;
        }
        if (eth.c() != null) {
            return j08.a(eth.c());
        }
        vpe.c("PhoneCallUtilsChildren", "buildPhoneLastAnswerContext:getIntentionInstruction()为null");
        return null;
    }

    public static void b(String str, String str2) {
        Instruction[] instructionArrD;
        vpe.a("PhoneCallUtilsChildren", "cacheLastEdgeCtxForOffline");
        try {
            n08 n08Var = new n08();
            n08Var.setDeviceId(DeviceUtils.getDeviceId(AppUtil.getApp()));
            n08Var.getContext().h(true);
            n08Var.setAppId(str);
            n08Var.setAppName(str2);
            n08Var.setRequestId(null);
            n08Var.setTimestamp(System.currentTimeMillis());
            PhoneCallUtil.NetworkType networkTypeA = PhoneCallUtil.a(AppUtil.getApp());
            if (networkTypeA == PhoneCallUtil.NetworkType.WIFI) {
                n08Var.getDevice().d(EdgeNetworkType.WIFI);
            } else if (networkTypeA == PhoneCallUtil.NetworkType.DATA) {
                n08Var.getDevice().d(EdgeNetworkType.DATA);
            } else {
                n08Var.getDevice().d(EdgeNetworkType.OFFLINE);
            }
            c4h c4hVarE = eth.e();
            if (c4hVarE != null && c4hVarE.size() > 0 && eth.c() != null && (instructionArrD = eth.d()) != null) {
                for (Instruction instruction : instructionArrD) {
                    n08Var.getContext().g(instruction);
                }
            }
            hth.b().c(n08Var);
        } catch (Exception e) {
            vpe.b("PhoneCallUtilsChildren", "cacheLastEdgeCtxForOffline exception: " + e.toString());
        }
    }
}
