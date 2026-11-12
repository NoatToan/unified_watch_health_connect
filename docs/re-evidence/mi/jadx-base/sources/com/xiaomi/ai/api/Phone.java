package com.xiaomi.ai.api;

import com.xiaomi.ai.api.common.ContextPayload;
import com.xiaomi.ai.api.common.EventPayload;
import com.xiaomi.ai.api.common.InstructionPayload;
import com.xiaomi.ai.api.common.NamespaceName;
import com.xiaomi.ai.api.common.Required;
import com.xiaomi.common.Optional;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class Phone {

    public enum CallMode {
        DEFAULT(-1),
        VOICE(0),
        VIDEO(1),
        HANDS_FREE(2);

        private int id;

        CallMode(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public enum CallType {
        UNKNOWN(-1),
        RECENT_MISSED_CALL(0),
        RECENT_ANSWERED_CALL(1),
        RECENT_OUTGOING_CALL(2),
        RECENT_ALL_CALL(3),
        RECENT_INCOMING_CALL(4);

        private int id;

        CallType(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public enum CardType {
        UNKNOWN(-1),
        DEFAULT(0),
        CARD_ONE(1),
        CARD_TWO(2),
        SIM_CARD(3);

        private int id;

        CardType(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public enum ClickPurpose {
        UNKNOWN(-1),
        MAKE_CALL(0),
        CONTACT_DETAIL(1),
        ACTIVE_CARD(2),
        SEND_MESSAGE(3);

        private int id;

        ClickPurpose(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public enum ContactCardType {
        UNKNOWN(-1),
        MAKE_CALL(0),
        SEARCH(1);

        private int id;

        ContactCardType(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public enum ContactCategory {
        UNKNOWN(-1),
        APP(0),
        WATCH(1),
        TV(2);

        private int id;

        ContactCategory(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    @NamespaceName(name = "DialAffirm", namespace = AIApiConstants.Phone.NAME)
    public static class DialAffirm implements InstructionPayload {
    }

    @NamespaceName(name = "DialBack", namespace = AIApiConstants.Phone.NAME)
    public static class DialBack implements InstructionPayload {
    }

    @NamespaceName(name = "DialCancel", namespace = AIApiConstants.Phone.NAME)
    public static class DialCancel implements InstructionPayload {
    }

    @NamespaceName(name = "HangUp", namespace = AIApiConstants.Phone.NAME)
    public static class HangUp implements InstructionPayload {
    }

    public static class NameSlot {

        @Required
        private boolean is_qrw;

        @Required
        private String name;

        @Required
        private NameType name_type;

        @Required
        private boolean offline_asr;

        @Required
        private String prefix;

        @Required
        private String suffix;

        public NameSlot() {
        }

        public NameSlot(String str, String str2, String str3, boolean z, NameType nameType, boolean z2) {
            this.name = str;
            this.prefix = str2;
            this.suffix = str3;
            this.is_qrw = z;
            this.name_type = nameType;
            this.offline_asr = z2;
        }

        @Required
        public String getName() {
            return this.name;
        }

        @Required
        public NameType getNameType() {
            return this.name_type;
        }

        @Required
        public String getPrefix() {
            return this.prefix;
        }

        @Required
        public String getSuffix() {
            return this.suffix;
        }

        @Required
        public boolean isOfflineAsr() {
            return this.offline_asr;
        }

        @Required
        public boolean isQrw() {
            return this.is_qrw;
        }

        @Required
        public NameSlot setIsQrw(boolean z) {
            this.is_qrw = z;
            return this;
        }

        @Required
        public NameSlot setName(String str) {
            this.name = str;
            return this;
        }

        @Required
        public NameSlot setNameType(NameType nameType) {
            this.name_type = nameType;
            return this;
        }

        @Required
        public NameSlot setOfflineAsr(boolean z) {
            this.offline_asr = z;
            return this;
        }

        @Required
        public NameSlot setPrefix(String str) {
            this.prefix = str;
            return this;
        }

        @Required
        public NameSlot setSuffix(String str) {
            this.suffix = str;
            return this;
        }
    }

    public enum NameType {
        UNKNOWN(-1),
        NORMAL(0),
        DIGIT(1),
        FAMOUS(2),
        RELATIVE(3),
        YELLOW_PAGE(4),
        PICTURE(5);

        private int id;

        NameType(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public static class NicknameInfo {

        @Required
        private String name;

        @Required
        private String nickname;

        public NicknameInfo() {
        }

        public NicknameInfo(String str, String str2) {
            this.name = str;
            this.nickname = str2;
        }

        @Required
        public String getName() {
            return this.name;
        }

        @Required
        public String getNickname() {
            return this.nickname;
        }

        @Required
        public NicknameInfo setName(String str) {
            this.name = str;
            return this;
        }

        @Required
        public NicknameInfo setNickname(String str) {
            this.nickname = str;
            return this;
        }
    }

    public enum PhoneCallPageMode {
        UNKNOWN(-1),
        CONTACT_SEARCH_LIST(0),
        CONTACT_DIAL_LIST(1),
        CONTACT_SEARCH_DETAIL(2),
        DIAL_CONFIRM(3),
        CONTACT_SEARCH_ONE_PERSON(4);

        private int id;

        PhoneCallPageMode(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public enum PhoneHFPConnectType {
        UNKNOWN(-1),
        CONNECTED(0),
        DISCONNECTED(1),
        UNAVAILABLE(2);

        private int id;

        PhoneHFPConnectType(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public enum PhoneOperationType {
        UNKNOWN(-1),
        MAKE_CALL(0),
        SEND_MESSAGE(2);

        private int id;

        PhoneOperationType(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    @NamespaceName(name = "PhoneState", namespace = AIApiConstants.Phone.NAME)
    public static class PhoneState implements ContextPayload {
        private Optional<PhoneHFPConnectType> hfp_connect_state = Optional.a();
        private Optional<PhoneCallPageMode> page_mode = Optional.a();
        private Optional<Integer> total_count = Optional.a();
        private Optional<Boolean> select_default_card = Optional.a();

        public Optional<PhoneHFPConnectType> getHfpConnectState() {
            return this.hfp_connect_state;
        }

        public Optional<PhoneCallPageMode> getPageMode() {
            return this.page_mode;
        }

        public Optional<Integer> getTotalCount() {
            return this.total_count;
        }

        public Optional<Boolean> isSelectDefaultCard() {
            return this.select_default_card;
        }

        public PhoneState setHfpConnectState(PhoneHFPConnectType phoneHFPConnectType) {
            this.hfp_connect_state = Optional.e(phoneHFPConnectType);
            return this;
        }

        public PhoneState setPageMode(PhoneCallPageMode phoneCallPageMode) {
            this.page_mode = Optional.e(phoneCallPageMode);
            return this;
        }

        public PhoneState setSelectDefaultCard(boolean z) {
            this.select_default_card = Optional.e(Boolean.valueOf(z));
            return this;
        }

        public PhoneState setTotalCount(int i) {
            this.total_count = Optional.e(Integer.valueOf(i));
            return this;
        }
    }

    @NamespaceName(name = "PickUp", namespace = AIApiConstants.Phone.NAME)
    public static class PickUp implements InstructionPayload {
    }

    @NamespaceName(name = "Redial", namespace = AIApiConstants.Phone.NAME)
    public static class Redial implements InstructionPayload {
    }

    public enum ShowMessageType {
        UNKNOWN(-1),
        MESSAGE_DRAFT(0),
        MESSAGE_RESULT(1);

        private int id;

        ShowMessageType(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    @NamespaceName(name = "SyncContacts", namespace = AIApiConstants.Phone.NAME)
    public static class SyncContacts implements InstructionPayload {
    }

    @NamespaceName(name = "UploadContacts", namespace = AIApiConstants.Phone.NAME)
    public static class UploadContacts implements InstructionPayload {
    }

    public enum UploadContactsInfoType {
        UNKNOWN(-1),
        CONTACTS_NAME(0),
        CONTACTS_FREQUENCY(1);

        private int id;

        UploadContactsInfoType(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    @NamespaceName(name = "LocalCallingData", namespace = AIApiConstants.Phone.NAME)
    public static class LocalCallingData implements ContextPayload {

        @Required
        private String action;
        private Optional<List<Contact>> contacts = Optional.a();

        public LocalCallingData() {
        }

        @Required
        public String getAction() {
            return this.action;
        }

        public Optional<List<Contact>> getContacts() {
            return this.contacts;
        }

        @Required
        public LocalCallingData setAction(String str) {
            this.action = str;
            return this;
        }

        public LocalCallingData setContacts(List<Contact> list) {
            this.contacts = Optional.e(list);
            return this;
        }

        public LocalCallingData(String str) {
            this.action = str;
        }
    }

    @NamespaceName(name = "SelectContact", namespace = AIApiConstants.Phone.NAME)
    public static class SelectContact implements InstructionPayload {
        private Optional<Integer> index = Optional.a();

        @Required
        private ContactCardType type;

        public SelectContact() {
        }

        public Optional<Integer> getIndex() {
            return this.index;
        }

        @Required
        public ContactCardType getType() {
            return this.type;
        }

        public SelectContact setIndex(int i) {
            this.index = Optional.e(Integer.valueOf(i));
            return this;
        }

        @Required
        public SelectContact setType(ContactCardType contactCardType) {
            this.type = contactCardType;
            return this;
        }

        public SelectContact(ContactCardType contactCardType) {
            this.type = contactCardType;
        }
    }

    @NamespaceName(name = "SetNickname", namespace = AIApiConstants.Phone.NAME)
    public static class SetNickname implements InstructionPayload {
        private Optional<String> id = Optional.a();

        @Required
        private String name;

        @Required
        private String nickname;

        public SetNickname() {
        }

        public Optional<String> getId() {
            return this.id;
        }

        @Required
        public String getName() {
            return this.name;
        }

        @Required
        public String getNickname() {
            return this.nickname;
        }

        public SetNickname setId(String str) {
            this.id = Optional.e(str);
            return this;
        }

        @Required
        public SetNickname setName(String str) {
            this.name = str;
            return this;
        }

        @Required
        public SetNickname setNickname(String str) {
            this.nickname = str;
            return this;
        }

        public SetNickname(String str, String str2) {
            this.name = str;
            this.nickname = str2;
        }
    }

    @NamespaceName(name = "UploadContactsResult", namespace = AIApiConstants.Phone.NAME)
    public static class UploadContactsResult implements EventPayload {

        @Required
        private String contacts;

        @Required
        private String encrypted_aes_key;
        private Optional<UploadContactsInfoType> upload_contacts_info_type = Optional.a();

        public UploadContactsResult() {
        }

        @Required
        public String getContacts() {
            return this.contacts;
        }

        @Required
        public String getEncryptedAesKey() {
            return this.encrypted_aes_key;
        }

        public Optional<UploadContactsInfoType> getUploadContactsInfoType() {
            return this.upload_contacts_info_type;
        }

        @Required
        public UploadContactsResult setContacts(String str) {
            this.contacts = str;
            return this;
        }

        @Required
        public UploadContactsResult setEncryptedAesKey(String str) {
            this.encrypted_aes_key = str;
            return this;
        }

        public UploadContactsResult setUploadContactsInfoType(UploadContactsInfoType uploadContactsInfoType) {
            this.upload_contacts_info_type = Optional.e(uploadContactsInfoType);
            return this;
        }

        public UploadContactsResult(String str, String str2) {
            this.contacts = str;
            this.encrypted_aes_key = str2;
        }
    }

    @NamespaceName(name = "SelectSimCard", namespace = AIApiConstants.Phone.NAME)
    public static class SelectSimCard implements InstructionPayload {

        @Required
        private Template.Launcher launcher;

        @Required
        private PhoneOperationType type;
        private Optional<List<Contact>> contacts = Optional.a();
        private Optional<Template.Image> skill_icon = Optional.a();

        public SelectSimCard() {
        }

        public Optional<List<Contact>> getContacts() {
            return this.contacts;
        }

        @Required
        public Template.Launcher getLauncher() {
            return this.launcher;
        }

        public Optional<Template.Image> getSkillIcon() {
            return this.skill_icon;
        }

        @Required
        public PhoneOperationType getType() {
            return this.type;
        }

        public SelectSimCard setContacts(List<Contact> list) {
            this.contacts = Optional.e(list);
            return this;
        }

        @Required
        public SelectSimCard setLauncher(Template.Launcher launcher) {
            this.launcher = launcher;
            return this;
        }

        public SelectSimCard setSkillIcon(Template.Image image) {
            this.skill_icon = Optional.e(image);
            return this;
        }

        @Required
        public SelectSimCard setType(PhoneOperationType phoneOperationType) {
            this.type = phoneOperationType;
            return this;
        }

        public SelectSimCard(PhoneOperationType phoneOperationType, Template.Launcher launcher) {
            this.type = phoneOperationType;
            this.launcher = launcher;
        }
    }

    @NamespaceName(name = "SendMessage", namespace = AIApiConstants.Phone.NAME)
    public static class SendMessage implements InstructionPayload {

        @Required
        private CardType card_type;
        private Optional<List<Contact>> contacts = Optional.a();
        private Optional<String> message = Optional.a();

        public SendMessage() {
        }

        @Required
        public CardType getCardType() {
            return this.card_type;
        }

        public Optional<List<Contact>> getContacts() {
            return this.contacts;
        }

        public Optional<String> getMessage() {
            return this.message;
        }

        @Required
        public SendMessage setCardType(CardType cardType) {
            this.card_type = cardType;
            return this;
        }

        public SendMessage setContacts(List<Contact> list) {
            this.contacts = Optional.e(list);
            return this;
        }

        public SendMessage setMessage(String str) {
            this.message = Optional.e(str);
            return this;
        }

        public SendMessage(CardType cardType) {
            this.card_type = cardType;
        }
    }

    @NamespaceName(name = "ShowMessage", namespace = AIApiConstants.Phone.NAME)
    public static class ShowMessage implements InstructionPayload {

        @Required
        private CardType card_type;

        @Required
        private Template.Launcher launcher;

        @Required
        private ShowMessageType type;
        private Optional<List<Contact>> contacts = Optional.a();
        private Optional<String> message = Optional.a();
        private Optional<Template.Image> skill_icon = Optional.a();

        public ShowMessage() {
        }

        @Required
        public CardType getCardType() {
            return this.card_type;
        }

        public Optional<List<Contact>> getContacts() {
            return this.contacts;
        }

        @Required
        public Template.Launcher getLauncher() {
            return this.launcher;
        }

        public Optional<String> getMessage() {
            return this.message;
        }

        public Optional<Template.Image> getSkillIcon() {
            return this.skill_icon;
        }

        @Required
        public ShowMessageType getType() {
            return this.type;
        }

        @Required
        public ShowMessage setCardType(CardType cardType) {
            this.card_type = cardType;
            return this;
        }

        public ShowMessage setContacts(List<Contact> list) {
            this.contacts = Optional.e(list);
            return this;
        }

        @Required
        public ShowMessage setLauncher(Template.Launcher launcher) {
            this.launcher = launcher;
            return this;
        }

        public ShowMessage setMessage(String str) {
            this.message = Optional.e(str);
            return this;
        }

        public ShowMessage setSkillIcon(Template.Image image) {
            this.skill_icon = Optional.e(image);
            return this;
        }

        @Required
        public ShowMessage setType(ShowMessageType showMessageType) {
            this.type = showMessageType;
            return this;
        }

        public ShowMessage(ShowMessageType showMessageType, CardType cardType, Template.Launcher launcher) {
            this.type = showMessageType;
            this.card_type = cardType;
            this.launcher = launcher;
        }
    }

    @NamespaceName(name = "MakeCall", namespace = AIApiConstants.Phone.NAME)
    public static class MakeCall implements InstructionPayload {

        @Required
        private CardType card_type;
        private Optional<Contact> contact = Optional.a();
        private Optional<CallType> call_type = Optional.a();
        private Optional<CallMode> call_mode = Optional.a();
        private Optional<Template.Image> skill_icon = Optional.a();

        public MakeCall() {
        }

        public Optional<CallMode> getCallMode() {
            return this.call_mode;
        }

        public Optional<CallType> getCallType() {
            return this.call_type;
        }

        @Required
        public CardType getCardType() {
            return this.card_type;
        }

        public Optional<Contact> getContact() {
            return this.contact;
        }

        public Optional<Template.Image> getSkillIcon() {
            return this.skill_icon;
        }

        public MakeCall setCallMode(CallMode callMode) {
            this.call_mode = Optional.e(callMode);
            return this;
        }

        public MakeCall setCallType(CallType callType) {
            this.call_type = Optional.e(callType);
            return this;
        }

        @Required
        public MakeCall setCardType(CardType cardType) {
            this.card_type = cardType;
            return this;
        }

        public MakeCall setContact(Contact contact) {
            this.contact = Optional.e(contact);
            return this;
        }

        public MakeCall setSkillIcon(Template.Image image) {
            this.skill_icon = Optional.e(image);
            return this;
        }

        public MakeCall(CardType cardType) {
            this.card_type = cardType;
        }
    }

    public static class Contact {

        @Required
        private String id;

        @Required
        private String name;

        @Required
        private String number;
        private Optional<String> tag = Optional.a();
        private Optional<Template.AndroidIntent> intent = Optional.a();
        private Optional<Boolean> auto_dial = Optional.a();
        private Optional<NameType> name_type = Optional.a();
        private Optional<ContactCategory> category = Optional.a();
        private Optional<String> carrier = Optional.a();
        private Optional<String> attribution = Optional.a();

        public Contact() {
        }

        public Optional<String> getAttribution() {
            return this.attribution;
        }

        public Optional<String> getCarrier() {
            return this.carrier;
        }

        public Optional<ContactCategory> getCategory() {
            return this.category;
        }

        @Required
        public String getId() {
            return this.id;
        }

        public Optional<Template.AndroidIntent> getIntent() {
            return this.intent;
        }

        @Required
        public String getName() {
            return this.name;
        }

        public Optional<NameType> getNameType() {
            return this.name_type;
        }

        @Required
        public String getNumber() {
            return this.number;
        }

        public Optional<String> getTag() {
            return this.tag;
        }

        public Optional<Boolean> isAutoDial() {
            return this.auto_dial;
        }

        public Contact setAttribution(String str) {
            this.attribution = Optional.e(str);
            return this;
        }

        public Contact setAutoDial(boolean z) {
            this.auto_dial = Optional.e(Boolean.valueOf(z));
            return this;
        }

        public Contact setCarrier(String str) {
            this.carrier = Optional.e(str);
            return this;
        }

        public Contact setCategory(ContactCategory contactCategory) {
            this.category = Optional.e(contactCategory);
            return this;
        }

        @Required
        public Contact setId(String str) {
            this.id = str;
            return this;
        }

        public Contact setIntent(Template.AndroidIntent androidIntent) {
            this.intent = Optional.e(androidIntent);
            return this;
        }

        @Required
        public Contact setName(String str) {
            this.name = str;
            return this;
        }

        public Contact setNameType(NameType nameType) {
            this.name_type = Optional.e(nameType);
            return this;
        }

        @Required
        public Contact setNumber(String str) {
            this.number = str;
            return this;
        }

        public Contact setTag(String str) {
            this.tag = Optional.e(str);
            return this;
        }

        public Contact(String str, String str2, String str3) {
            this.name = str;
            this.number = str2;
            this.id = str3;
        }
    }

    @NamespaceName(name = "ShowContacts", namespace = AIApiConstants.Phone.NAME)
    public static class ShowContacts implements InstructionPayload {

        @Required
        private List<Contact> contacts;

        @Required
        private boolean one_person;
        private Optional<Template.Image> skill_icon = Optional.a();
        private Optional<CardType> card_type = Optional.a();
        private Optional<Boolean> match_recent_and_call = Optional.a();
        private Optional<ClickPurpose> click_purpose = Optional.a();
        private Optional<CallMode> call_mode = Optional.a();
        private Optional<Integer> page_size = Optional.a();
        private Optional<ContactCardType> contact_card_type = Optional.a();

        public ShowContacts() {
        }

        public Optional<CallMode> getCallMode() {
            return this.call_mode;
        }

        public Optional<CardType> getCardType() {
            return this.card_type;
        }

        public Optional<ClickPurpose> getClickPurpose() {
            return this.click_purpose;
        }

        public Optional<ContactCardType> getContactCardType() {
            return this.contact_card_type;
        }

        @Required
        public List<Contact> getContacts() {
            return this.contacts;
        }

        public Optional<Integer> getPageSize() {
            return this.page_size;
        }

        public Optional<Template.Image> getSkillIcon() {
            return this.skill_icon;
        }

        public Optional<Boolean> isMatchRecentAndCall() {
            return this.match_recent_and_call;
        }

        @Required
        public boolean isOnePerson() {
            return this.one_person;
        }

        public ShowContacts setCallMode(CallMode callMode) {
            this.call_mode = Optional.e(callMode);
            return this;
        }

        public ShowContacts setCardType(CardType cardType) {
            this.card_type = Optional.e(cardType);
            return this;
        }

        public ShowContacts setClickPurpose(ClickPurpose clickPurpose) {
            this.click_purpose = Optional.e(clickPurpose);
            return this;
        }

        public ShowContacts setContactCardType(ContactCardType contactCardType) {
            this.contact_card_type = Optional.e(contactCardType);
            return this;
        }

        @Required
        public ShowContacts setContacts(List<Contact> list) {
            this.contacts = list;
            return this;
        }

        public ShowContacts setMatchRecentAndCall(boolean z) {
            this.match_recent_and_call = Optional.e(Boolean.valueOf(z));
            return this;
        }

        @Required
        public ShowContacts setOnePerson(boolean z) {
            this.one_person = z;
            return this;
        }

        public ShowContacts setPageSize(int i) {
            this.page_size = Optional.e(Integer.valueOf(i));
            return this;
        }

        public ShowContacts setSkillIcon(Template.Image image) {
            this.skill_icon = Optional.e(image);
            return this;
        }

        public ShowContacts(List<Contact> list, boolean z) {
            this.contacts = list;
            this.one_person = z;
        }
    }

    public static class PhoneIntention {

        @Required
        private String action;

        @Required
        private CardType card_type;

        @Required
        private String name;

        @Required
        private List<NameSlot> name_slots;
        private Optional<Integer> chosen_index = Optional.a();
        private Optional<Integer> blocked_round = Optional.a();
        private Optional<Boolean> multiple_turn = Optional.a();
        private Optional<String> tag = Optional.a();
        private Optional<String> norm_tag = Optional.a();
        private Optional<NicknameInfo> nickname_info = Optional.a();
        private Optional<List<Contact>> contacts = Optional.a();
        private Optional<String> query = Optional.a();
        private Optional<List<String>> disable_instructions = Optional.a();
        private Optional<ContactCategory> category = Optional.a();
        private Optional<String> tail_numbers = Optional.a();
        private Optional<CallMode> call_mode = Optional.a();
        private Optional<String> message_text = Optional.a();
        private Optional<Boolean> had_chosen = Optional.a();
        private Optional<Boolean> use_online_result = Optional.a();

        public PhoneIntention() {
        }

        @Required
        public String getAction() {
            return this.action;
        }

        public Optional<Integer> getBlockedRound() {
            return this.blocked_round;
        }

        public Optional<CallMode> getCallMode() {
            return this.call_mode;
        }

        @Required
        public CardType getCardType() {
            return this.card_type;
        }

        public Optional<ContactCategory> getCategory() {
            return this.category;
        }

        public Optional<Integer> getChosenIndex() {
            return this.chosen_index;
        }

        public Optional<List<Contact>> getContacts() {
            return this.contacts;
        }

        public Optional<List<String>> getDisableInstructions() {
            return this.disable_instructions;
        }

        public Optional<String> getMessageText() {
            return this.message_text;
        }

        @Required
        public String getName() {
            return this.name;
        }

        @Required
        public List<NameSlot> getNameSlots() {
            return this.name_slots;
        }

        public Optional<NicknameInfo> getNicknameInfo() {
            return this.nickname_info;
        }

        public Optional<String> getNormTag() {
            return this.norm_tag;
        }

        public Optional<String> getQuery() {
            return this.query;
        }

        public Optional<String> getTag() {
            return this.tag;
        }

        public Optional<String> getTailNumbers() {
            return this.tail_numbers;
        }

        public Optional<Boolean> isHadChosen() {
            return this.had_chosen;
        }

        public Optional<Boolean> isMultipleTurn() {
            return this.multiple_turn;
        }

        public Optional<Boolean> isUseOnlineResult() {
            return this.use_online_result;
        }

        @Required
        public PhoneIntention setAction(String str) {
            this.action = str;
            return this;
        }

        public PhoneIntention setBlockedRound(int i) {
            this.blocked_round = Optional.e(Integer.valueOf(i));
            return this;
        }

        public PhoneIntention setCallMode(CallMode callMode) {
            this.call_mode = Optional.e(callMode);
            return this;
        }

        @Required
        public PhoneIntention setCardType(CardType cardType) {
            this.card_type = cardType;
            return this;
        }

        public PhoneIntention setCategory(ContactCategory contactCategory) {
            this.category = Optional.e(contactCategory);
            return this;
        }

        public PhoneIntention setChosenIndex(int i) {
            this.chosen_index = Optional.e(Integer.valueOf(i));
            return this;
        }

        public PhoneIntention setContacts(List<Contact> list) {
            this.contacts = Optional.e(list);
            return this;
        }

        public PhoneIntention setDisableInstructions(List<String> list) {
            this.disable_instructions = Optional.e(list);
            return this;
        }

        public PhoneIntention setHadChosen(boolean z) {
            this.had_chosen = Optional.e(Boolean.valueOf(z));
            return this;
        }

        public PhoneIntention setMessageText(String str) {
            this.message_text = Optional.e(str);
            return this;
        }

        public PhoneIntention setMultipleTurn(boolean z) {
            this.multiple_turn = Optional.e(Boolean.valueOf(z));
            return this;
        }

        @Required
        public PhoneIntention setName(String str) {
            this.name = str;
            return this;
        }

        @Required
        public PhoneIntention setNameSlots(List<NameSlot> list) {
            this.name_slots = list;
            return this;
        }

        public PhoneIntention setNicknameInfo(NicknameInfo nicknameInfo) {
            this.nickname_info = Optional.e(nicknameInfo);
            return this;
        }

        public PhoneIntention setNormTag(String str) {
            this.norm_tag = Optional.e(str);
            return this;
        }

        public PhoneIntention setQuery(String str) {
            this.query = Optional.e(str);
            return this;
        }

        public PhoneIntention setTag(String str) {
            this.tag = Optional.e(str);
            return this;
        }

        public PhoneIntention setTailNumbers(String str) {
            this.tail_numbers = Optional.e(str);
            return this;
        }

        public PhoneIntention setUseOnlineResult(boolean z) {
            this.use_online_result = Optional.e(Boolean.valueOf(z));
            return this;
        }

        public PhoneIntention(String str, String str2, List<NameSlot> list, CardType cardType) {
            this.action = str;
            this.name = str2;
            this.name_slots = list;
            this.card_type = cardType;
        }
    }
}
