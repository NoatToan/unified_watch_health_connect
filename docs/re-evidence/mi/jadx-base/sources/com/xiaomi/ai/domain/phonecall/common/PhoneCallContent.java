package com.xiaomi.ai.domain.phonecall.common;

import com.google.gson.annotations.SerializedName;
import com.xiaomi.ai.domain.phonecall.contact.PhoneItem;
import com.xiaomi.onetrack.OneTrack;
import java.util.ArrayList;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes7.dex */
public class PhoneCallContent {
    private MatchRet matchRet;

    @SerializedName(alternate = {"messageText"}, value = OneTrack.Param.MESSAGE_TEXT)
    private String messageText;
    private boolean openMic;

    @SerializedName(alternate = {"phoneList"}, value = "phone_list")
    private List<PhoneItem> phoneList;

    @SerializedName(alternate = {"toDisplay"}, value = "to_display")
    private String toDisplay;

    @SerializedName(alternate = {"toSpeak"}, value = "to_speak")
    private String toSpeak;

    public PhoneCallContent(String str, String str2, List<PhoneItem> list, boolean z) {
        this.toSpeak = str;
        this.toDisplay = str2;
        this.phoneList = list;
        this.openMic = z;
    }

    public MatchRet getMatchRet() {
        return this.matchRet;
    }

    public String getMessageText() {
        return this.messageText;
    }

    public List<PhoneItem> getPhoneList() {
        return this.phoneList;
    }

    public String getToDisplay() {
        return this.toDisplay;
    }

    public String getToSpeak() {
        return this.toSpeak;
    }

    public boolean isOpenMic() {
        return this.openMic;
    }

    public void setMatchRet(MatchRet matchRet) {
        this.matchRet = matchRet;
    }

    public void setMessageText(String str) {
        this.messageText = str;
    }

    public void setOpenMic(boolean z) {
        this.openMic = z;
    }

    public void setPhoneList(List<PhoneItem> list) {
        this.phoneList = list;
    }

    public void setToDisplay(String str) {
        this.toDisplay = str;
    }

    public void setToSpeak(String str) {
        this.toSpeak = str;
    }

    public String toString() {
        return "PhoneCallContent{toSpeak='" + this.toSpeak + "', toDisplay='" + this.toDisplay + "', phoneList=" + this.phoneList + ", messageText='" + this.messageText + "', openMic=" + this.openMic + ", matchRet=" + this.matchRet + AbstractJsonLexerKt.END_OBJ;
    }

    public PhoneCallContent(String str, String str2, List<PhoneItem> list, boolean z, String str3) {
        this.toSpeak = str;
        this.toDisplay = str2;
        this.phoneList = list;
        this.openMic = z;
        this.messageText = str3;
    }

    public PhoneCallContent() {
        this.toSpeak = "";
        this.toDisplay = "";
        this.phoneList = new ArrayList();
        this.messageText = "";
        this.openMic = false;
    }
}
