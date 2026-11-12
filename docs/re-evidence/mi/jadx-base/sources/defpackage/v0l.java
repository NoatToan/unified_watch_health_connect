package defpackage;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.xiaomi.ai.nlp.lattice.rule.RuleApplyPhase;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public class v0l {
    public static void a(y2e y2eVar, j82 j82Var, RuleApplyPhase ruleApplyPhase, Map<String, String> map) {
        String phase = ruleApplyPhase.getPhase();
        if (y2eVar.t()) {
            if (!j82Var.getDebugInfo().has(phase)) {
                j82Var.getDebugInfo().add(phase, new JsonObject());
            }
            JsonObject asJsonObject = j82Var.getDebugInfo().getAsJsonObject(phase);
            if (!asJsonObject.has("rules")) {
                asJsonObject.add("rules", new JsonArray());
            }
            JsonArray asJsonArray = asJsonObject.getAsJsonArray("rules");
            JsonObject jsonObject = new JsonObject();
            for (Map.Entry<String, String> entry : map.entrySet()) {
                jsonObject.addProperty(entry.getKey(), entry.getValue());
            }
            asJsonArray.add(jsonObject);
        }
    }
}
