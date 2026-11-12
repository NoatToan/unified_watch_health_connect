package com.xiaomi.ai.domain.mobileapp;

import com.google.android.gms.actions.SearchIntents;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.xiaomi.ai.api.common.APIUtils;
import com.xiaomi.ai.api.intent.AIApiConstants;
import com.xiaomi.ai.domain.mobileapp.adapter.EdgeAdapter;
import com.xiaomi.ai.domain.mobileapp.common.ActionType;
import com.xiaomi.ai.domain.mobileapp.common.Device;
import com.xiaomi.ai.domain.mobileapp.common.MobileAppIntention;
import com.xiaomi.ai.domain.mobileapp.common.Prompt;
import com.xiaomi.ai.domain.mobileapp.local.Intervenor;
import com.xiaomi.ai.domain.mobileapp.parser.MobileAppParserImpl;
import com.xiaomi.ai.domain.mobileapp.parser.ResourceSuite;
import com.xiaomi.ai.domain.mobileapp.provider.InstructionGenerator;
import com.xiaomi.ai.domain.mobileapp.provider.MobileAppProviderImpl;
import com.xiaomi.ai.domain.mobileapp.provider.PromptGenerator;
import com.xiaomi.ai.domain.mobileapp.util.EnvParser;
import com.xiaomi.ai.edge.common.model.EdgeNetworkType;
import com.xiaomi.fitness.access.util.ThirdPartAccessConstants;
import com.xiaomi.fitness.devicesettings.bluttooth.todo.miui.MiuiCursorConstants;
import defpackage.a08;
import defpackage.aqe;
import defpackage.j4b;
import defpackage.n08;
import defpackage.qpe;
import defpackage.t08;
import defpackage.yz7;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.zip.GZIPInputStream;
import org.apache.commons.lang3.tuple.Pair;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class MobileAppSolver implements yz7 {
    private static final Map<String, String> ASR_NORM_MAP;
    private static final qpe LOGGER = aqe.f(MobileAppSolver.class);
    private static final Gson gson = j4b.b();
    private MobileAppParserImpl edgeParser = new MobileAppParserImpl();
    private MobileAppProviderImpl provider = new MobileAppProviderImpl();

    static {
        HashMap map = new HashMap();
        ASR_NORM_MAP = map;
        map.put(AIApiConstants.QQ.NAME, "Q Q");
    }

    private InputStream genResourceInputStreamFromInstalledApps(JsonArray jsonArray) throws IOException {
        Set set;
        HashMap map = new HashMap(128);
        if (jsonArray != null) {
            for (int i = 0; i < jsonArray.size(); i++) {
                JsonObject asJsonObject = jsonArray.get(i).getAsJsonObject();
                map.put(asJsonObject.get("package_name").getAsString(), asJsonObject.get("display_name").getAsString().toLowerCase());
            }
        }
        StringBuilder sb = new StringBuilder();
        HashSet hashSet = new HashSet();
        HashMap map2 = new HashMap();
        GZIPInputStream gZIPInputStream = new GZIPInputStream(t08.a(ResourceSuite.BASE_RESOUECE_PATH));
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(gZIPInputStream));
            while (true) {
                try {
                    String line = bufferedReader.readLine();
                    if (line == null) {
                        break;
                    }
                    JsonObject asJsonObject2 = j4b.a().parse(line).getAsJsonObject();
                    if ("name".equals(asJsonObject2.get("slot").getAsString())) {
                        JsonObject asJsonObject3 = asJsonObject2.get("meta").getAsJsonObject();
                        String asString = asJsonObject2.get("token").getAsString();
                        String asString2 = asJsonObject3.get("package_name").getAsString();
                        String asString3 = asJsonObject3.get("display_name").getAsString();
                        if (map2.containsKey(asString3)) {
                            set = (Set) map2.get(asString3);
                        } else {
                            HashSet hashSet2 = new HashSet();
                            map2.put(asString3, hashSet2);
                            set = hashSet2;
                        }
                        set.add(asString);
                        if (map.containsKey(asString2)) {
                            sb.append(line + "\n");
                            hashSet.add(asString2);
                        } else if (map.containsValue(asString)) {
                            sb.append(line + "\n");
                        }
                    } else {
                        sb.append(line + "\n");
                    }
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        try {
                            bufferedReader.close();
                            throw th2;
                        } catch (Throwable th3) {
                            th.addSuppressed(th3);
                            throw th2;
                        }
                    }
                }
            }
            bufferedReader.close();
            gZIPInputStream.close();
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                String str2 = (String) entry.getValue();
                if (!hashSet.contains(str)) {
                    JsonObject jsonObject = new JsonObject();
                    JsonObject jsonObject2 = new JsonObject();
                    jsonObject2.addProperty("display_name", str2);
                    jsonObject2.addProperty("package_name", str);
                    jsonObject2.addProperty("score", Double.valueOf(1.0d));
                    jsonObject.addProperty("slot", "name");
                    jsonObject.addProperty("token", str2.toLowerCase());
                    jsonObject.addProperty("norm_token", str2);
                    jsonObject.add("meta", jsonObject2);
                    sb.append(jsonObject.toString() + "\n");
                    if (map2.containsKey(str2)) {
                        for (String str3 : (Set) map2.get(str2)) {
                            if (!ResourceSuite.getInstance().matchBlackWord(str3)) {
                                jsonObject.addProperty("token", str3.toLowerCase());
                                sb.append(jsonObject.toString() + "\n");
                            }
                        }
                    }
                }
            }
            return new ByteArrayInputStream(sb.toString().getBytes());
        } catch (Throwable th4) {
            try {
                throw th4;
            } catch (Throwable th5) {
                try {
                    gZIPInputStream.close();
                    throw th5;
                } catch (Throwable th6) {
                    th4.addSuppressed(th6);
                    throw th5;
                }
            }
        }
    }

    private JSONObject genResponseJSON(JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, String str) throws JSONException {
        JSONObject jSONObject4 = new JSONObject();
        JSONObject jSONObject5 = new JSONObject();
        jSONObject5.put("code", 200);
        jSONObject5.put("error_type", "success");
        jSONObject4.put("status", jSONObject5);
        JSONObject jSONObject6 = new JSONObject();
        jSONObject.put("app", "defaultApp");
        jSONObject6.put("domain", "smartApp");
        jSONObject6.put("intention", jSONObject);
        jSONObject6.put(MiuiCursorConstants.CONTENT, jSONObject2);
        jSONObject6.put("action", jSONObject.optString("action"));
        jSONObject6.put("text", jSONObject.optString(SearchIntents.EXTRA_QUERY));
        jSONObject6.put(ThirdPartAccessConstants.KEY_PROMPT, jSONObject3);
        JSONArray jSONArray = new JSONArray();
        jSONArray.put(0, jSONObject6);
        jSONObject4.put("answer", jSONArray);
        jSONObject4.put("instructions", new JSONArray(str));
        return jSONObject4;
    }

    private Set<String> getDisplayNameSet(JsonArray jsonArray) {
        HashSet hashSet = new HashSet();
        if (jsonArray != null) {
            for (int i = 0; i < jsonArray.size(); i++) {
                hashSet.add(jsonArray.get(i).getAsJsonObject().get("display_name").getAsString().toLowerCase());
            }
        }
        return hashSet;
    }

    public List<String> getAsrNames() {
        ArrayList<String> arrayList = new ArrayList();
        arrayList.addAll(ResourceSuite.getInstance().getNames());
        arrayList.addAll(ResourceSuite.getInstance().getTags());
        HashSet hashSet = new HashSet();
        for (String str : arrayList) {
            if (!str.isEmpty()) {
                hashSet.add(str);
                Map<String, String> map = ASR_NORM_MAP;
                if (map.containsKey(str)) {
                    hashSet.add(map.get(str));
                }
            }
        }
        return new ArrayList(hashSet);
    }

    @Override // defpackage.yz7
    public String getDomain() {
        return MobileAppIntention.DOMAIN_NAME;
    }

    public boolean init(String str) throws Exception {
        JsonObject asJsonObject;
        if (str == null || (asJsonObject = j4b.a().parse(str).getAsJsonObject()) == null || asJsonObject.isJsonNull() || !asJsonObject.has("apps")) {
            return false;
        }
        JsonArray asJsonArray = asJsonObject.get("apps").getAsJsonArray();
        boolean zInitEdgeBaseAndBlackResource = ResourceSuite.getInstance().initEdgeBaseAndBlackResource();
        if (zInitEdgeBaseAndBlackResource) {
            zInitEdgeBaseAndBlackResource = ResourceSuite.getInstance().updateBaseResource(Collections.singletonList(genResourceInputStreamFromInstalledApps(asJsonArray)));
        }
        if (zInitEdgeBaseAndBlackResource) {
            zInitEdgeBaseAndBlackResource = Intervenor.getInstance().init(getDisplayNameSet(asJsonArray));
        }
        if (zInitEdgeBaseAndBlackResource) {
            zInitEdgeBaseAndBlackResource = this.edgeParser.init();
        }
        return zInitEdgeBaseAndBlackResource ? this.provider.init() : zInitEdgeBaseAndBlackResource;
    }

    @Override // defpackage.yz7
    public JSONObject parse(String str, n08 n08Var) {
        int clientVersion = EnvParser.parseClientVersion(n08Var);
        String appName = EnvParser.parseAppName(n08Var);
        Pair<JsonArray, String> latestAppArrJS = EnvParser.parseLatestAppArrJS(n08Var);
        JsonObject contextJS = EnvParser.parseContextJS(n08Var);
        Device deviceFromAppName = Device.fromAppName(appName);
        MobileAppIntention mobileAppIntention = this.edgeParser.parse(str, Boolean.FALSE, latestAppArrJS, contextJS, clientVersion, deviceFromAppName, "");
        EdgeAdapter.adapt(mobileAppIntention, deviceFromAppName, clientVersion, contextJS);
        if (mobileAppIntention == null) {
            mobileAppIntention = new MobileAppIntention();
            mobileAppIntention.setQuery(str);
        }
        try {
            return new JSONObject(gson.toJson(mobileAppIntention));
        } catch (Exception e) {
            LOGGER.error("edgeParser intention occur exception: {}", (Throwable) e);
            return null;
        }
    }

    @Override // defpackage.yz7
    public a08 provide(JSONObject jSONObject, JSONObject jSONObject2, n08 n08Var) {
        if (jSONObject == null && jSONObject2 == null) {
            return null;
        }
        String requestId = n08Var.getRequestId();
        a08 a08Var = new a08();
        a08Var.c(new JSONObject());
        if (jSONObject == null) {
            a08Var.d(jSONObject2);
            return a08Var;
        }
        JsonObject contextJS = EnvParser.parseContextJS(n08Var);
        try {
            JSONObject jSONObjectProvide = this.provider.provide();
            int clientVersion = EnvParser.parseClientVersion(n08Var);
            String str = "好";
            String jsonString = "";
            if (n08Var.getDevice() != null && n08Var.getDevice().c() == EdgeNetworkType.OFFLINE) {
                str = "";
            }
            JSONArray jSONArrayMakePromptHints = PromptGenerator.makePromptHints(jSONObject, clientVersion, ActionType.OPEN.toString(), str);
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("text", "");
            jSONObject3.put("hints", jSONArrayMakePromptHints);
            Pair<String, Integer> foregroundAppAndVersion = EnvParser.parseForegroundAppAndVersion(contextJS);
            Gson gson2 = gson;
            MobileAppIntention mobileAppIntention = (MobileAppIntention) gson2.fromJson(jSONObject.toString(), MobileAppIntention.class);
            try {
                jsonString = APIUtils.toJsonString(InstructionGenerator.getInstructionCommon(requestId, mobileAppIntention.getQuery(), mobileAppIntention, (Prompt) gson2.fromJson(jSONObject3.toString(), Prompt.class), foregroundAppAndVersion, null).getKey());
            } catch (Exception e) {
                LOGGER.error("parse intruction list error, {}", (Throwable) e);
            }
            a08Var.d(genResponseJSON(jSONObject, jSONObjectProvide, jSONObject3, jsonString));
        } catch (JSONException e2) {
            LOGGER.error("provide occur exception {}", (Throwable) e2);
        }
        return a08Var;
    }
}
