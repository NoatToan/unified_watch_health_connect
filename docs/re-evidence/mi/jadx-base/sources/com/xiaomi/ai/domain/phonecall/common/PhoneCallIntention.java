package com.xiaomi.ai.domain.phonecall.common;

import com.xiaomi.ai.domain.phonecall.contact.Contact;
import com.xiaomi.ai.domain.phonecall.contact.PhoneType;
import defpackage.j82;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes7.dex */
public class PhoneCallIntention extends j82 {
    private boolean addShowContacts;
    private CallMode callMode;
    private CardType cardType;
    private Contact contact;
    private DialogStatus dialogStatus;
    private EventInfo eventInfo;
    private String fixName;
    private String fixQuery;
    private String func;
    private MatchType matchType;
    private String messageText;
    private String name;
    private NickNameInfo nickNameInfo;
    private String normTag;
    private ObjectDeviceType objectDeviceType;
    private int playOrder;
    private int processingRound;
    private boolean requery;
    private boolean selectPlayOrder;
    private List<SlotRet> slotRets;
    private String tag;
    private String tailNumber;
    private boolean useContactModelMatcher;

    public PhoneCallIntention() {
        super.setQuery("");
        super.setDomain("phonecall");
        ActionType actionType = ActionType.QUERY;
        super.setAction(actionType.toString());
        super.setScore(0.0d);
        super.setComplete(true);
        this.name = "";
        this.tag = "";
        this.normTag = "";
        this.playOrder = 1;
        this.requery = false;
        this.fixName = "";
        this.fixQuery = "";
        this.tailNumber = "";
        this.nickNameInfo = new NickNameInfo();
        this.slotRets = new ArrayList();
        this.eventInfo = new EventInfo();
        setMatchType(MatchType.MATCH_MISS);
        this.dialogStatus = DialogStatus.FINISH;
        this.processingRound = 1;
        this.func = actionType.getFunc();
        this.useContactModelMatcher = false;
        this.cardType = CardType.DEFAULT;
        this.callMode = CallMode.DEFAULT;
        this.objectDeviceType = ObjectDeviceType.TELECOM;
        this.selectPlayOrder = false;
        this.contact = new Contact();
    }

    public void addSlotRet(SlotRet slotRet) {
        this.slotRets.add(slotRet);
    }

    public CallMode getCallMode() {
        return this.callMode;
    }

    public CardType getCardType() {
        return this.cardType;
    }

    public Contact getContact() {
        return this.contact;
    }

    public DialogStatus getDialogStatus() {
        return this.dialogStatus;
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

    public String getFunc() {
        return this.func;
    }

    public MatchType getMatchType() {
        return this.matchType;
    }

    public String getMessageText() {
        return this.messageText;
    }

    public String getName() {
        return this.name;
    }

    public NickNameInfo getNickNameInfo() {
        return this.nickNameInfo;
    }

    public String getNormTag() {
        return this.normTag;
    }

    public ObjectDeviceType getObjectDeviceType() {
        return this.objectDeviceType;
    }

    public int getPlayOrder() {
        return this.playOrder;
    }

    public int getProcessingRound() {
        return this.processingRound;
    }

    public List<SlotRet> getSlotRets() {
        return this.slotRets;
    }

    public String getTag() {
        return this.tag;
    }

    public String getTailNumber() {
        return this.tailNumber;
    }

    public boolean isAddShowContacts() {
        return this.addShowContacts;
    }

    public boolean isRequery() {
        return this.requery;
    }

    public boolean isSelectPlayOrder() {
        return this.selectPlayOrder;
    }

    public boolean isUseContactModelMatcher() {
        return this.useContactModelMatcher;
    }

    public void setAction(ActionType actionType) {
        super.setAction(actionType.getText());
        this.func = Function.getFinalFunc(actionType, this);
    }

    public void setAddShowContacts(boolean z) {
        this.addShowContacts = z;
    }

    public void setCallMode(CallMode callMode) {
        this.callMode = callMode;
    }

    public void setCardType(CardType cardType) {
        this.cardType = cardType;
    }

    public PhoneCallIntention setContacts(Contact contact) {
        this.contact = contact;
        return this;
    }

    public void setDialogStatus(DialogStatus dialogStatus) {
        this.dialogStatus = dialogStatus;
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

    public void setMessageText(String str) {
        this.messageText = str;
    }

    public void setName(String str) {
        this.name = str;
        if (this.fixName.isEmpty()) {
            this.fixName = str;
        }
    }

    public void setNickNameInfo(NickNameInfo nickNameInfo) {
        this.nickNameInfo = nickNameInfo;
    }

    public void setNormTag(String str) {
        this.normTag = str;
    }

    public void setObjectDeviceType(ObjectDeviceType objectDeviceType) {
        this.objectDeviceType = objectDeviceType;
    }

    public void setPlayOrder(int i) {
        this.playOrder = i;
    }

    public void setProcessingRound(int i) {
        this.processingRound = i;
    }

    @Override // defpackage.j82
    public void setQuery(String str) {
        super.setQuery(str);
        if (this.fixQuery.isEmpty()) {
            this.fixQuery = str;
        }
        this.eventInfo.setQuery(str);
    }

    public void setRequery(boolean z) {
        this.requery = z;
    }

    public void setSelectPlayOrder(boolean z) {
        this.selectPlayOrder = z;
    }

    public void setSlotRets(List<SlotRet> list) {
        this.slotRets = list;
    }

    public void setTag(String str) {
        this.tag = str;
        this.normTag = PhoneType.getNormTag(str);
    }

    public PhoneCallIntention setTailNumber(String str) {
        this.tailNumber = str;
        return this;
    }

    public void setUseContactModelMatcher(boolean z) {
        this.useContactModelMatcher = z;
        this.eventInfo.setUseContactModelMacter(z);
    }

    public String toString() {
        return "PhoneCallIntention{name='" + this.name + "', tag='" + this.tag + "', normTag='" + this.normTag + "', playOrder=" + this.playOrder + ", selectPlayOrder=" + this.selectPlayOrder + ", requery=" + this.requery + ", slotRets=" + this.slotRets + ", nickNameInfo=" + this.nickNameInfo + ", func='" + this.func + "', fixName='" + this.fixName + "', fixQuery='" + this.fixQuery + "', matchType=" + this.matchType + ", eventInfo=" + this.eventInfo + ", dialogStatus=" + this.dialogStatus + ", useContactModelMatcher=" + this.useContactModelMatcher + ", processingRound=" + this.processingRound + ", cardType=" + this.cardType + ", callMode=" + this.callMode + ", objectDeviceType=" + this.objectDeviceType + ", contact=" + this.contact + ", messageText='" + this.messageText + "', addShowContacts=" + this.addShowContacts + ", tailNumber='" + this.tailNumber + '\'' + AbstractJsonLexerKt.END_OBJ;
    }

    public PhoneCallIntention(PhoneCallIntention phoneCallIntention) {
        super.setQuery(phoneCallIntention.getQuery());
        super.setDomain(phoneCallIntention.getDomain());
        super.setAction(phoneCallIntention.getAction());
        super.setScore(phoneCallIntention.getScore());
        super.setComplete(phoneCallIntention.isComplete());
        this.name = phoneCallIntention.name;
        this.tag = phoneCallIntention.tag;
        this.normTag = phoneCallIntention.normTag;
        this.playOrder = phoneCallIntention.playOrder;
        this.requery = phoneCallIntention.requery;
        this.fixName = phoneCallIntention.fixName;
        this.fixQuery = phoneCallIntention.fixQuery;
        this.matchType = phoneCallIntention.matchType;
        this.slotRets = new ArrayList();
        this.tailNumber = phoneCallIntention.getTailNumber();
        this.nickNameInfo = new NickNameInfo(phoneCallIntention.nickNameInfo);
        List<SlotRet> list = phoneCallIntention.slotRets;
        if (list != null) {
            Iterator<SlotRet> it = list.iterator();
            while (it.hasNext()) {
                this.slotRets.add(new SlotRet(it.next()));
            }
        }
        this.eventInfo = new EventInfo(phoneCallIntention.eventInfo);
        this.func = " . . . ";
        if (ActionType.fromString(phoneCallIntention.getAction()) != null) {
            this.func = ActionType.fromString(phoneCallIntention.getAction()).getFunc();
        }
        this.useContactModelMatcher = phoneCallIntention.isUseContactModelMatcher();
        this.cardType = phoneCallIntention.getCardType();
        this.callMode = phoneCallIntention.getCallMode();
        this.contact = new Contact();
    }
}
