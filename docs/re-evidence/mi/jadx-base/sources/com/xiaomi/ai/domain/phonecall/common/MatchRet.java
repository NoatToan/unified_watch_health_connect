package com.xiaomi.ai.domain.phonecall.common;

import java.util.ArrayList;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes7.dex */
public class MatchRet {
    private MatchType matchType = MatchType.MATCH_MISS;
    private List<ContactRet> contactRets = new ArrayList();
    private EventInfo eventInfo = new EventInfo();
    private String fixName = "";
    private String fixQuery = "";
    private ActionType action = ActionType.QUERY;
    private NameType nameType = NameType.NORMAL;

    public void clearContactRets() {
        this.contactRets.clear();
    }

    public ActionType getAction() {
        return this.action;
    }

    public List<ContactRet> getContactRets() {
        return this.contactRets;
    }

    public EventInfo getEventInfo() {
        return this.eventInfo;
    }

    public String getFixName() {
        return this.fixName;
    }

    public String getFixQuery() {
        return this.fixQuery;
    }

    public MatchType getMatchType() {
        return this.matchType;
    }

    public NameType getNameType() {
        return this.nameType;
    }

    public void setAction(ActionType actionType) {
        this.action = actionType;
    }

    public void setContactRets(List<ContactRet> list) {
        this.contactRets = list;
    }

    public void setEventInfo(EventInfo eventInfo) {
        this.eventInfo = eventInfo;
    }

    public void setFixName(String str) {
        this.fixName = str;
    }

    public void setFixQuery(String str) {
        this.fixQuery = str;
    }

    public void setMatchType(MatchType matchType) {
        this.matchType = matchType;
        this.eventInfo.setMatchType(matchType);
    }

    public void setNameType(NameType nameType) {
        this.nameType = nameType;
    }

    public String toString() {
        return "MatchRet{matchType=" + this.matchType + ", contactRets.size=" + this.contactRets.size() + ", eventInfo=" + this.eventInfo + ", fixName='" + this.fixName + "', fixQuery='" + this.fixQuery + "', action=" + this.action + ", nameType=" + this.nameType + AbstractJsonLexerKt.END_OBJ;
    }
}
