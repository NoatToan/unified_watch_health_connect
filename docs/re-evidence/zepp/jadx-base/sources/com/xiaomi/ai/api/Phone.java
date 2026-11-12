package com.xiaomi.ai.api;

import com.xiaomi.ai.api.common.ContextPayload;
import com.xiaomi.ai.api.common.InstructionPayload;
import com.xiaomi.ai.api.common.NamespaceName;
import com.xiaomi.ai.api.common.Required;
import com.xiaomi.common.Optional;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
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
        ACTIVE_CARD(2);

        private int id;

        ClickPurpose(int i) {
            this.id = i;
        }

        public int getId() {
            return this.id;
        }
    }

    public static class Contact {

        @Required
        private String id;

        @Required
        private String name;

        @Required
        private String number;
        private Optional<String> tag = Optional.empty();
        private Optional<Template.AndroidIntent> intent = Optional.empty();
        private Optional<Boolean> auto_dial = Optional.empty();
        private Optional<NameType> name_type = Optional.empty();
        private Optional<ContactCategory> category = Optional.empty();

        public Contact() {
        }

        public Contact(String str, String str2, String str3) {
            this.name = str;
            this.number = str2;
            this.id = str3;
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

        public Contact setAutoDial(boolean z) {
            this.auto_dial = Optional.ofNullable(Boolean.valueOf(z));
            return this;
        }

        public Contact setCategory(ContactCategory contactCategory) {
            this.category = Optional.ofNullable(contactCategory);
            return this;
        }

        @Required
        public Contact setId(String str) {
            this.id = str;
            return this;
        }

        public Contact setIntent(Template.AndroidIntent androidIntent) {
            this.intent = Optional.ofNullable(androidIntent);
            return this;
        }

        @Required
        public Contact setName(String str) {
            this.name = str;
            return this;
        }

        public Contact setNameType(NameType nameType) {
            this.name_type = Optional.ofNullable(nameType);
            return this;
        }

        @Required
        public Contact setNumber(String str) {
            this.number = str;
            return this;
        }

        public Contact setTag(String str) {
            this.tag = Optional.ofNullable(str);
            return this;
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

    @NamespaceName(name = "DialBack", namespace = "Phone")
    public static class DialBack implements InstructionPayload {
    }

    @NamespaceName(name = "HangUp", namespace = "Phone")
    public static class HangUp implements InstructionPayload {
    }

    @NamespaceName(name = "LocalCallingData", namespace = "Phone")
    public static class LocalCallingData implements ContextPayload {

        @Required
        private String action;
        private Optional<List<Contact>> contacts = Optional.empty();

        public LocalCallingData() {
        }

        public LocalCallingData(String str) {
            this.action = str;
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
            this.contacts = Optional.ofNullable(list);
            return this;
        }
    }

    @NamespaceName(name = "MakeCall", namespace = "Phone")
    public static class MakeCall implements InstructionPayload {

        @Required
        private CardType card_type;
        private Optional<Contact> contact = Optional.empty();
        private Optional<CallType> call_type = Optional.empty();
        private Optional<CallMode> call_mode = Optional.empty();
        private Optional<Template.Image> skill_icon = Optional.empty();

        public MakeCall() {
        }

        public MakeCall(CardType cardType) {
            this.card_type = cardType;
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
            this.call_mode = Optional.ofNullable(callMode);
            return this;
        }

        public MakeCall setCallType(CallType callType) {
            this.call_type = Optional.ofNullable(callType);
            return this;
        }

        @Required
        public MakeCall setCardType(CardType cardType) {
            this.card_type = cardType;
            return this;
        }

        public MakeCall setContact(Contact contact) {
            this.contact = Optional.ofNullable(contact);
            return this;
        }

        public MakeCall setSkillIcon(Template.Image image) {
            this.skill_icon = Optional.ofNullable(image);
            return this;
        }
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
        YELLOW_PAGE(4);

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

    public static class PhoneIntention {

        @Required
        private String action;

        @Required
        private CardType card_type;

        @Required
        private String name;

        @Required
        private List<NameSlot> name_slots;
        private Optional<Integer> chosen_index = Optional.empty();
        private Optional<Integer> blocked_round = Optional.empty();
        private Optional<Boolean> multiple_turn = Optional.empty();
        private Optional<String> tag = Optional.empty();
        private Optional<String> norm_tag = Optional.empty();
        private Optional<NicknameInfo> nickname_info = Optional.empty();
        private Optional<List<Contact>> contacts = Optional.empty();
        private Optional<String> query = Optional.empty();
        private Optional<List<String>> disable_instructions = Optional.empty();
        private Optional<ContactCategory> category = Optional.empty();
        private Optional<String> tail_numbers = Optional.empty();
        private Optional<CallMode> call_mode = Optional.empty();

        public PhoneIntention() {
        }

        public PhoneIntention(String str, String str2, List<NameSlot> list, CardType cardType) {
            this.action = str;
            this.name = str2;
            this.name_slots = list;
            this.card_type = cardType;
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

        public Optional<Boolean> isMultipleTurn() {
            return this.multiple_turn;
        }

        @Required
        public PhoneIntention setAction(String str) {
            this.action = str;
            return this;
        }

        public PhoneIntention setBlockedRound(int i) {
            this.blocked_round = Optional.ofNullable(Integer.valueOf(i));
            return this;
        }

        public PhoneIntention setCallMode(CallMode callMode) {
            this.call_mode = Optional.ofNullable(callMode);
            return this;
        }

        @Required
        public PhoneIntention setCardType(CardType cardType) {
            this.card_type = cardType;
            return this;
        }

        public PhoneIntention setCategory(ContactCategory contactCategory) {
            this.category = Optional.ofNullable(contactCategory);
            return this;
        }

        public PhoneIntention setChosenIndex(int i) {
            this.chosen_index = Optional.ofNullable(Integer.valueOf(i));
            return this;
        }

        public PhoneIntention setContacts(List<Contact> list) {
            this.contacts = Optional.ofNullable(list);
            return this;
        }

        public PhoneIntention setDisableInstructions(List<String> list) {
            this.disable_instructions = Optional.ofNullable(list);
            return this;
        }

        public PhoneIntention setMultipleTurn(boolean z) {
            this.multiple_turn = Optional.ofNullable(Boolean.valueOf(z));
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
            this.nickname_info = Optional.ofNullable(nicknameInfo);
            return this;
        }

        public PhoneIntention setNormTag(String str) {
            this.norm_tag = Optional.ofNullable(str);
            return this;
        }

        public PhoneIntention setQuery(String str) {
            this.query = Optional.ofNullable(str);
            return this;
        }

        public PhoneIntention setTag(String str) {
            this.tag = Optional.ofNullable(str);
            return this;
        }

        public PhoneIntention setTailNumbers(String str) {
            this.tail_numbers = Optional.ofNullable(str);
            return this;
        }
    }

    @NamespaceName(name = "PickUp", namespace = "Phone")
    public static class PickUp implements InstructionPayload {
    }

    @NamespaceName(name = "Redial", namespace = "Phone")
    public static class Redial implements InstructionPayload {
    }

    @NamespaceName(name = "SetNickname", namespace = "Phone")
    public static class SetNickname implements InstructionPayload {
        private Optional<String> id = Optional.empty();

        @Required
        private String name;

        @Required
        private String nickname;

        public SetNickname() {
        }

        public SetNickname(String str, String str2) {
            this.name = str;
            this.nickname = str2;
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
            this.id = Optional.ofNullable(str);
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
    }

    @NamespaceName(name = "ShowContacts", namespace = "Phone")
    public static class ShowContacts implements InstructionPayload {

        @Required
        private List<Contact> contacts;

        @Required
        private boolean one_person;
        private Optional<Template.Image> skill_icon = Optional.empty();
        private Optional<CardType> card_type = Optional.empty();
        private Optional<Boolean> match_recent_and_call = Optional.empty();
        private Optional<ClickPurpose> click_purpose = Optional.empty();
        private Optional<CallMode> call_mode = Optional.empty();

        public ShowContacts() {
        }

        public ShowContacts(List<Contact> list, boolean z) {
            this.contacts = list;
            this.one_person = z;
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

        @Required
        public List<Contact> getContacts() {
            return this.contacts;
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
            this.call_mode = Optional.ofNullable(callMode);
            return this;
        }

        public ShowContacts setCardType(CardType cardType) {
            this.card_type = Optional.ofNullable(cardType);
            return this;
        }

        public ShowContacts setClickPurpose(ClickPurpose clickPurpose) {
            this.click_purpose = Optional.ofNullable(clickPurpose);
            return this;
        }

        @Required
        public ShowContacts setContacts(List<Contact> list) {
            this.contacts = list;
            return this;
        }

        public ShowContacts setMatchRecentAndCall(boolean z) {
            this.match_recent_and_call = Optional.ofNullable(Boolean.valueOf(z));
            return this;
        }

        @Required
        public ShowContacts setOnePerson(boolean z) {
            this.one_person = z;
            return this;
        }

        public ShowContacts setSkillIcon(Template.Image image) {
            this.skill_icon = Optional.ofNullable(image);
            return this;
        }
    }
}
