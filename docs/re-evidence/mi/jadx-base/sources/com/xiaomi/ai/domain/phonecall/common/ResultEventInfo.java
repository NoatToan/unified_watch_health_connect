package com.xiaomi.ai.domain.phonecall.common;

import com.xiaomi.ai.domain.phonecall.util.ABTestGroupType;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class ResultEventInfo {
    private int abTestVersion;
    private ABTestGroupType groupType;
    private boolean hasPrivacyInfo;
    private EventInfo localInfo;
    private EventInfo onlineInfo;
    private int queryPosition;
    private long timeLoadContact;
    private String ttsContent;
    private boolean useOnlineQuery;

    public ResultEventInfo() {
        this.useOnlineQuery = false;
        this.groupType = ABTestGroupType.DEFAULT;
        this.onlineInfo = new EventInfo();
        this.localInfo = new EventInfo();
        this.abTestVersion = -1;
        this.ttsContent = "";
        this.timeLoadContact = 0L;
        this.hasPrivacyInfo = false;
        this.queryPosition = 0;
    }

    public int getAbTestVersion() {
        return this.abTestVersion;
    }

    public JSONObject getEventInfoJson() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("use_online_query", this.useOnlineQuery);
        jSONObject.put("ab_test_version", this.abTestVersion);
        jSONObject.put("group_type", this.groupType);
        jSONObject.put("tts_content", this.ttsContent);
        jSONObject.put("time_load_contact", this.timeLoadContact);
        jSONObject.put("online_query", this.onlineInfo.getQuery());
        jSONObject.put("local_query", this.localInfo.getQuery());
        jSONObject.put("online_slots", this.onlineInfo.getSlots().toString());
        jSONObject.put("local_slots", this.localInfo.getSlots().toString());
        jSONObject.put("online_action", this.onlineInfo.getAction());
        jSONObject.put("local_action", this.localInfo.getAction());
        jSONObject.put("has_privacy_info", this.hasPrivacyInfo);
        int i = this.queryPosition;
        if (i > 0) {
            jSONObject.put("query_position", i);
        }
        if (this.useOnlineQuery) {
            jSONObject.put("match_type", this.onlineInfo.getMatchType().toString());
            jSONObject.put("is_load_contact_complete", this.onlineInfo.isLoadContactComplete());
            jSONObject.put("contact_cnt", this.onlineInfo.getContactCnt());
            jSONObject.put("other_infos", this.onlineInfo.getOtherInfos().toString());
            jSONObject.put("match_num", this.onlineInfo.getOtherInfos().size());
            jSONObject.put("contact_type", this.onlineInfo.getContactType());
        } else {
            jSONObject.put("match_type", this.localInfo.getMatchType().toString());
            jSONObject.put("is_load_contact_complete", this.localInfo.isLoadContactComplete());
            jSONObject.put("contact_cnt", this.localInfo.getContactCnt());
            jSONObject.put("other_infos", this.localInfo.getOtherInfos().toString());
            jSONObject.put("match_num", this.localInfo.getOtherInfos().size());
            jSONObject.put("contact_type", this.localInfo.getContactType());
        }
        System.out.println(jSONObject);
        return jSONObject;
    }

    public ABTestGroupType getGroupType() {
        return this.groupType;
    }

    public EventInfo getLocalInfo() {
        return this.localInfo;
    }

    public EventInfo getOnlineInfo() {
        return this.onlineInfo;
    }

    public int getQueryPosition() {
        return this.queryPosition;
    }

    public long getTimeLoadContact() {
        return this.timeLoadContact;
    }

    public String getTtsContent() {
        return this.ttsContent;
    }

    public boolean isHasPrivacyInfo() {
        return this.hasPrivacyInfo;
    }

    public void setAbTestVersion(int i) {
        this.abTestVersion = i;
    }

    public void setGroupType(ABTestGroupType aBTestGroupType) {
        this.groupType = aBTestGroupType;
    }

    public void setHasPrivacyInfo(boolean z) {
        this.hasPrivacyInfo = z;
    }

    public void setLocalInfo(EventInfo eventInfo) {
        this.localInfo = eventInfo;
    }

    public void setOnlineInfo(EventInfo eventInfo) {
        this.onlineInfo = eventInfo;
    }

    public void setQueryPosition(int i) {
        this.queryPosition = i;
    }

    public void setTimeLoadContact(long j) {
        this.timeLoadContact = j;
    }

    public void setTtsContent(String str) {
        this.ttsContent = str;
    }

    public void setUseOnlineQuery(boolean z) {
        this.useOnlineQuery = z;
    }

    public boolean useOnlineQuery() {
        return this.useOnlineQuery;
    }

    public ResultEventInfo(ResultEventInfo resultEventInfo) {
        this.useOnlineQuery = resultEventInfo.useOnlineQuery;
        this.groupType = resultEventInfo.groupType;
        this.onlineInfo = resultEventInfo.onlineInfo;
        this.localInfo = resultEventInfo.localInfo;
        this.abTestVersion = resultEventInfo.abTestVersion;
        this.ttsContent = resultEventInfo.ttsContent;
        this.timeLoadContact = resultEventInfo.timeLoadContact;
        this.hasPrivacyInfo = resultEventInfo.hasPrivacyInfo;
        this.queryPosition = resultEventInfo.queryPosition;
    }
}
