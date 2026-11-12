package com.xiaomi.ai.domain.phonecall;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonSyntaxException;
import com.xiaomi.ai.domain.phonecall.common.ActionType;
import com.xiaomi.ai.domain.phonecall.common.PhoneCallIntention;
import com.xiaomi.ai.domain.phonecall.common.SlotRet;
import defpackage.aqe;
import defpackage.n08;
import defpackage.qpe;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class PhoneContextSolver {
    private static final qpe LOGGER = aqe.f(PhoneContextSolver.class);
    private static final Gson GSON = new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES).create();

    private static JSONObject chooseImpl(JSONObject jSONObject, JSONObject jSONObject2, n08 n08Var) {
        if (jSONObject2 == null) {
            return jSONObject;
        }
        return (jSONObject == null || useOnlineResult(jSONObject2, jSONObject.optString("action", ""))) ? jSONObject2 : jSONObject;
    }

    public static JSONObject chooseRequestContext(JSONObject jSONObject, JSONObject jSONObject2, n08 n08Var) {
        JSONObject jSONObjectChooseImpl = chooseImpl(jSONObject, jSONObject2, n08Var);
        qpe qpeVar = LOGGER;
        StringBuilder sb = new StringBuilder();
        sb.append("choose online request: ");
        sb.append(jSONObjectChooseImpl == jSONObject2);
        qpeVar.info(sb.toString());
        return jSONObjectChooseImpl;
    }

    private static boolean onlyNameInRequery(PhoneCallIntention phoneCallIntention) {
        return phoneCallIntention.isRequery() && ActionType.QUERY.toString().equals(phoneCallIntention.getAction());
    }

    private static boolean useOnlineAsr(PhoneCallIntention phoneCallIntention) {
        List<SlotRet> slotRets = phoneCallIntention.getSlotRets();
        for (int i = 0; i < phoneCallIntention.getSlotRets().size(); i++) {
            if (!slotRets.get(i).getOfflineAsr()) {
                return true;
            }
        }
        return false;
    }

    private static boolean useOnlineResult(JSONObject jSONObject, String str) {
        PhoneCallIntention phoneCallIntention;
        try {
            phoneCallIntention = (PhoneCallIntention) GSON.fromJson(jSONObject.toString(), PhoneCallIntention.class);
        } catch (JsonSyntaxException e) {
            LOGGER.warn("parse context intention, exception {}", (Throwable) e);
            phoneCallIntention = null;
        }
        if (phoneCallIntention == null) {
            return false;
        }
        if (onlyNameInRequery(phoneCallIntention)) {
            LOGGER.info("has only name info in re-query, use online");
            return true;
        }
        if (useOnlineAsr(phoneCallIntention)) {
            LOGGER.info("famous people, use online");
            return true;
        }
        if (phoneCallIntention.getAction().equals(str)) {
            return false;
        }
        LOGGER.info("action not same, use online");
        return true;
    }
}
