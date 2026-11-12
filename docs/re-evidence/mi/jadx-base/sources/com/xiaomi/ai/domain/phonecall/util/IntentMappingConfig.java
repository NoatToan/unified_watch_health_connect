package com.xiaomi.ai.domain.phonecall.util;

import com.typesafe.config.a;
import com.xiaomi.ai.domain.phonecall.common.DeviceConfig;
import defpackage.aqe;
import defpackage.nb4;
import defpackage.qpe;
import defpackage.t08;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public class IntentMappingConfig {
    private static final String INTENT_MAPPING_FILE = "phonecall-not-resolve-intent.conf";
    private static final qpe LOGGER = aqe.f(DeviceConfig.class);
    private static volatile IntentMappingConfig config = null;
    private static final String showContactNumberConfig = "com.xiaomi.ai.domain.phonecall.intent.show_contact_number";
    private static final String transCallToShowContactNumberConfig = "com.xiaomi.ai.domain.phonecall.intent.trans_call_to_search_num";
    private static final String underRecallLooseConfig = "com.xiaomi.ai.domain.phonecall.intent.under_recall_loose";
    private static final String underRecallTightConfig = "com.xiaomi.ai.domain.phonecall.intent.under_recall_tight";
    private static final String videoCallConfig = "com.xiaomi.ai.domain.phonecall.intent.video_call";
    private static final String voiceCallConfig = "com.xiaomi.ai.domain.phonecall.intent.voice_call";
    private static final String yellowPageCallConfig = "com.xiaomi.ai.domain.phonecall.intent.yellowpage_call";
    private Map<String, Map<String, RewriteInfo>> funcPatternMap;
    private Map<String, RewriteInfo> videoCallPatternMap = new HashMap();
    private Map<String, RewriteInfo> voiceCallPatternMap = new HashMap();
    private Map<String, RewriteInfo> showContactNumberPatternMap = new HashMap();
    private Map<String, RewriteInfo> transCallToShowContactNumberMap = new HashMap();
    private Map<String, RewriteInfo> yellowPageCallMap = new HashMap();
    private Map<String, RewriteInfo> underRecallLooseMap = new HashMap();
    private Map<String, RewriteInfo> underRecallTightMap = new HashMap();

    public static class RewriteInfo {
        public final int groupNumber;
        public final String rewriteQuery;

        public RewriteInfo(int i, String str) {
            this.groupNumber = i;
            this.rewriteQuery = str;
        }
    }

    private IntentMappingConfig() {
        HashMap map = new HashMap();
        this.funcPatternMap = map;
        map.put(videoCallConfig, this.videoCallPatternMap);
        this.funcPatternMap.put(voiceCallConfig, this.voiceCallPatternMap);
        this.funcPatternMap.put(showContactNumberConfig, this.showContactNumberPatternMap);
        this.funcPatternMap.put(transCallToShowContactNumberConfig, this.transCallToShowContactNumberMap);
        this.funcPatternMap.put(yellowPageCallConfig, this.yellowPageCallMap);
        this.funcPatternMap.put(underRecallLooseConfig, this.underRecallLooseMap);
        this.funcPatternMap.put(underRecallTightConfig, this.underRecallTightMap);
        load();
    }

    public static IntentMappingConfig getInstance() {
        try {
            if (config == null) {
                synchronized (IntentMappingConfig.class) {
                    try {
                        if (config == null) {
                            config = new IntentMappingConfig();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            return config;
        } catch (Exception e) {
            LOGGER.error("error:{}", e.getMessage());
            return null;
        }
    }

    public Map<String, RewriteInfo> getShowContactNumberPatternMap() {
        return this.showContactNumberPatternMap;
    }

    public Map<String, RewriteInfo> getTransCallToShowContactNumberMap() {
        return this.transCallToShowContactNumberMap;
    }

    public Map<String, RewriteInfo> getUnderRecallLooseMap() {
        return this.underRecallLooseMap;
    }

    public Map<String, RewriteInfo> getUnderRecallTightMap() {
        return this.underRecallTightMap;
    }

    public Map<String, RewriteInfo> getVideoCallPatternMap() {
        return this.videoCallPatternMap;
    }

    public Map<String, RewriteInfo> getVoiceCallPatternMap() {
        return this.voiceCallPatternMap;
    }

    public Map<String, RewriteInfo> getYellowPageCallMap() {
        return this.yellowPageCallMap;
    }

    public void load() {
        try {
            InputStreamReader inputStreamReader = new InputStreamReader(t08.a(INTENT_MAPPING_FILE));
            try {
                nb4 nb4VarI = a.i(inputStreamReader);
                for (Map.Entry<String, Map<String, RewriteInfo>> entry : this.funcPatternMap.entrySet()) {
                    for (nb4 nb4Var : nb4VarI.j(entry.getKey())) {
                        entry.getValue().put(nb4Var.getString("pattern"), new RewriteInfo(nb4Var.getInt("group_num"), nb4Var.getString("rewrite")));
                    }
                }
                inputStreamReader.close();
            } catch (Throwable th) {
                try {
                    inputStreamReader.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
