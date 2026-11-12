package com.xiaomi.ai.api.intent.domain;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.xiaomi.ai.api.common.Required;
import com.xiaomi.ai.api.intent.AIApiConstants;
import com.xiaomi.ai.api.intent.EntityType;
import com.xiaomi.ai.api.intent.IntentUtils;
import com.xiaomi.ai.api.intent.IntentionEntity;
import com.xiaomi.ai.api.intent.Slot;
import com.xiaomi.ai.api.intent.general;
import com.xiaomi.ai.api.intent.slots.Miai;
import com.xiaomi.common.Optional;
import com.xiaomi.fitness.device.manager.provider.DeviceContractKt;
import com.xiaomi.fitness.userinfo.collect.BasicInfoKey;
import defpackage.c4h;
import defpackage.zsd;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes7.dex */
public class PhoneCall<T extends EntityType> extends IntentionEntity<T, general> {

    @Required
    private T entity_type;
    private Optional<Slot<CardType>> card_type = Optional.a();
    private Optional<Slot<PlayType>> play_type = Optional.a();
    private Optional<Slot<PhoneCallType>> call_type = Optional.a();
    private Optional<Slot<PhoneContactsType>> phone_contact_type = Optional.a();
    private Optional<Slot<PhoneRecordType>> phone_record_type = Optional.a();
    private Optional<Slot<DeviceType>> device_type = Optional.a();
    private Optional<Slot<String>> text = Optional.a();
    private Optional<Slot<String>> name = Optional.a();
    private Optional<Slot<String>> tag = Optional.a();
    private Optional<Slot<String>> relative_name = Optional.a();
    private Optional<Slot<String>> tail_number = Optional.a();
    private Optional<Slot<String>> head_number = Optional.a();
    private Optional<Slot<String>> phone_number = Optional.a();
    private Optional<Slot<Miai.City>> city = Optional.a();
    private Optional<Slot<String>> company = Optional.a();

    public enum CardType {
        Default(0, "Default"),
        CardOne(1, "CardOne"),
        CardTwo(2, "CardTwo");

        private int id;
        private String name;

        CardType(int i, String str) {
            this.id = i;
            this.name = str;
        }

        public static CardType find(String str) {
            for (CardType cardType : values()) {
                if (cardType.name.equals(str)) {
                    return cardType;
                }
            }
            if (values().length > 0) {
                return values()[0];
            }
            return null;
        }

        public static CardType read(String str) {
            return find(str);
        }

        public static String write(CardType cardType) {
            return cardType.getName();
        }

        public int getId() {
            return this.id;
        }

        public String getName() {
            return this.name;
        }
    }

    public enum DeviceType {
        App(0, AIApiConstants.App.NAME),
        Watch(1, "Watch");

        private int id;
        private String name;

        DeviceType(int i, String str) {
            this.id = i;
            this.name = str;
        }

        public static DeviceType find(String str) {
            for (DeviceType deviceType : values()) {
                if (deviceType.name.equals(str)) {
                    return deviceType;
                }
            }
            if (values().length > 0) {
                return values()[0];
            }
            return null;
        }

        public static DeviceType read(String str) {
            return find(str);
        }

        public static String write(DeviceType deviceType) {
            return deviceType.getName();
        }

        public int getId() {
            return this.id;
        }

        public String getName() {
            return this.name;
        }
    }

    public enum PhoneCallType {
        Voice(0, "Voice"),
        Video(1, "Video");

        private int id;
        private String name;

        PhoneCallType(int i, String str) {
            this.id = i;
            this.name = str;
        }

        public static PhoneCallType find(String str) {
            for (PhoneCallType phoneCallType : values()) {
                if (phoneCallType.name.equals(str)) {
                    return phoneCallType;
                }
            }
            if (values().length > 0) {
                return values()[0];
            }
            return null;
        }

        public static PhoneCallType read(String str) {
            return find(str);
        }

        public static String write(PhoneCallType phoneCallType) {
            return phoneCallType.getName();
        }

        public int getId() {
            return this.id;
        }

        public String getName() {
            return this.name;
        }
    }

    public enum PhoneContactsType {
        Default(0, "Default"),
        Organization(1, "Organization"),
        Appellation(2, "Appellation"),
        Celebrity(3, "Celebrity"),
        Number(4, "Number"),
        Normal(5, "Normal");

        private int id;
        private String name;

        PhoneContactsType(int i, String str) {
            this.id = i;
            this.name = str;
        }

        public static PhoneContactsType find(String str) {
            for (PhoneContactsType phoneContactsType : values()) {
                if (phoneContactsType.name.equals(str)) {
                    return phoneContactsType;
                }
            }
            if (values().length > 0) {
                return values()[0];
            }
            return null;
        }

        public static PhoneContactsType read(String str) {
            return find(str);
        }

        public static String write(PhoneContactsType phoneContactsType) {
            return phoneContactsType.getName();
        }

        public int getId() {
            return this.id;
        }

        public String getName() {
            return this.name;
        }
    }

    public enum PhoneRecordType {
        Default(0, "Default"),
        Callout(1, "Callout"),
        Missed(2, "Missed"),
        Call(3, "Call");

        private int id;
        private String name;

        PhoneRecordType(int i, String str) {
            this.id = i;
            this.name = str;
        }

        public static PhoneRecordType find(String str) {
            for (PhoneRecordType phoneRecordType : values()) {
                if (phoneRecordType.name.equals(str)) {
                    return phoneRecordType;
                }
            }
            if (values().length > 0) {
                return values()[0];
            }
            return null;
        }

        public static PhoneRecordType read(String str) {
            return find(str);
        }

        public static String write(PhoneRecordType phoneRecordType) {
            return phoneRecordType.getName();
        }

        public int getId() {
            return this.id;
        }

        public String getName() {
            return this.name;
        }
    }

    public enum PlayType {
        HandFree(0, "HandFree");

        private int id;
        private String name;

        PlayType(int i, String str) {
            this.id = i;
            this.name = str;
        }

        public static PlayType find(String str) {
            for (PlayType playType : values()) {
                if (playType.name.equals(str)) {
                    return playType;
                }
            }
            if (values().length > 0) {
                return values()[0];
            }
            return null;
        }

        public static PlayType read(String str) {
            return find(str);
        }

        public static String write(PlayType playType) {
            return playType.getName();
        }

        public int getId() {
            return this.id;
        }

        public String getName() {
            return this.name;
        }
    }

    public static class back implements EntityType {
        public static back read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new back();
        }

        public static c4h write(back backVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class contacts implements EntityType {
        public static contacts read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new contacts();
        }

        public static c4h write(contacts contactsVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class message implements EntityType {
        public static message read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new message();
        }

        public static c4h write(message messageVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class record implements EntityType {
        public static record read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new record();
        }

        public static c4h write(record recordVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class redial implements EntityType {
        public static redial read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new redial();
        }

        public static c4h write(redial redialVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class video implements EntityType {
        public static video read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new video();
        }

        public static c4h write(video videoVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class voice implements EntityType {
        public static voice read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new voice();
        }

        public static c4h write(voice voiceVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public PhoneCall() {
    }

    public static PhoneCall read(zsd zsdVar, Optional<String> optional) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
        PhoneCall phoneCall = new PhoneCall(IntentUtils.readEntityType(zsdVar, AIApiConstants.PhoneCall.NAME, optional));
        if (zsdVar.z("card_type")) {
            phoneCall.setCardType(IntentUtils.readSlot(zsdVar.w("card_type"), CardType.class));
        }
        if (zsdVar.z("play_type")) {
            phoneCall.setPlayType(IntentUtils.readSlot(zsdVar.w("play_type"), PlayType.class));
        }
        if (zsdVar.z("call_type")) {
            phoneCall.setCallType(IntentUtils.readSlot(zsdVar.w("call_type"), PhoneCallType.class));
        }
        if (zsdVar.z("phone_contact_type")) {
            phoneCall.setPhoneContactType(IntentUtils.readSlot(zsdVar.w("phone_contact_type"), PhoneContactsType.class));
        }
        if (zsdVar.z("phone_record_type")) {
            phoneCall.setPhoneRecordType(IntentUtils.readSlot(zsdVar.w("phone_record_type"), PhoneRecordType.class));
        }
        if (zsdVar.z(DeviceContractKt.COLUMN_DEVICE_TYPE)) {
            phoneCall.setDeviceType(IntentUtils.readSlot(zsdVar.w(DeviceContractKt.COLUMN_DEVICE_TYPE), DeviceType.class));
        }
        if (zsdVar.z("text")) {
            phoneCall.setText(IntentUtils.readSlot(zsdVar.w("text"), String.class));
        }
        if (zsdVar.z("name")) {
            phoneCall.setName(IntentUtils.readSlot(zsdVar.w("name"), String.class));
        }
        if (zsdVar.z("tag")) {
            phoneCall.setTag(IntentUtils.readSlot(zsdVar.w("tag"), String.class));
        }
        if (zsdVar.z("relative_name")) {
            phoneCall.setRelativeName(IntentUtils.readSlot(zsdVar.w("relative_name"), String.class));
        }
        if (zsdVar.z("tail_number")) {
            phoneCall.setTailNumber(IntentUtils.readSlot(zsdVar.w("tail_number"), String.class));
        }
        if (zsdVar.z("head_number")) {
            phoneCall.setHeadNumber(IntentUtils.readSlot(zsdVar.w("head_number"), String.class));
        }
        if (zsdVar.z(BasicInfoKey.PHONE_NUMBER)) {
            phoneCall.setPhoneNumber(IntentUtils.readSlot(zsdVar.w(BasicInfoKey.PHONE_NUMBER), String.class));
        }
        if (zsdVar.z("city")) {
            phoneCall.setCity(IntentUtils.readSlot(zsdVar.w("city"), Miai.City.class));
        }
        if (zsdVar.z("company")) {
            phoneCall.setCompany(IntentUtils.readSlot(zsdVar.w("company"), String.class));
        }
        return phoneCall;
    }

    public static zsd write(PhoneCall phoneCall) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        c4h c4hVar = (c4h) IntentUtils.writeEntityType(phoneCall.entity_type);
        if (phoneCall.card_type.c()) {
            c4hVar.f0("card_type", IntentUtils.writeSlot(phoneCall.card_type.b()));
        }
        if (phoneCall.play_type.c()) {
            c4hVar.f0("play_type", IntentUtils.writeSlot(phoneCall.play_type.b()));
        }
        if (phoneCall.call_type.c()) {
            c4hVar.f0("call_type", IntentUtils.writeSlot(phoneCall.call_type.b()));
        }
        if (phoneCall.phone_contact_type.c()) {
            c4hVar.f0("phone_contact_type", IntentUtils.writeSlot(phoneCall.phone_contact_type.b()));
        }
        if (phoneCall.phone_record_type.c()) {
            c4hVar.f0("phone_record_type", IntentUtils.writeSlot(phoneCall.phone_record_type.b()));
        }
        if (phoneCall.device_type.c()) {
            c4hVar.f0(DeviceContractKt.COLUMN_DEVICE_TYPE, IntentUtils.writeSlot(phoneCall.device_type.b()));
        }
        if (phoneCall.text.c()) {
            c4hVar.f0("text", IntentUtils.writeSlot(phoneCall.text.b()));
        }
        if (phoneCall.name.c()) {
            c4hVar.f0("name", IntentUtils.writeSlot(phoneCall.name.b()));
        }
        if (phoneCall.tag.c()) {
            c4hVar.f0("tag", IntentUtils.writeSlot(phoneCall.tag.b()));
        }
        if (phoneCall.relative_name.c()) {
            c4hVar.f0("relative_name", IntentUtils.writeSlot(phoneCall.relative_name.b()));
        }
        if (phoneCall.tail_number.c()) {
            c4hVar.f0("tail_number", IntentUtils.writeSlot(phoneCall.tail_number.b()));
        }
        if (phoneCall.head_number.c()) {
            c4hVar.f0("head_number", IntentUtils.writeSlot(phoneCall.head_number.b()));
        }
        if (phoneCall.phone_number.c()) {
            c4hVar.f0(BasicInfoKey.PHONE_NUMBER, IntentUtils.writeSlot(phoneCall.phone_number.b()));
        }
        if (phoneCall.city.c()) {
            c4hVar.f0("city", IntentUtils.writeSlot(phoneCall.city.b()));
        }
        if (phoneCall.company.c()) {
            c4hVar.f0("company", IntentUtils.writeSlot(phoneCall.company.b()));
        }
        return c4hVar;
    }

    @Override // com.xiaomi.ai.api.intent.IntentionEntity
    public T __1() {
        return this.entity_type;
    }

    public Optional<Slot<PhoneCallType>> getCallType() {
        return this.call_type;
    }

    public Optional<Slot<CardType>> getCardType() {
        return this.card_type;
    }

    public Optional<Slot<Miai.City>> getCity() {
        return this.city;
    }

    public Optional<Slot<String>> getCompany() {
        return this.company;
    }

    public Optional<Slot<DeviceType>> getDeviceType() {
        return this.device_type;
    }

    @Required
    public T getEntityType() {
        return this.entity_type;
    }

    public Optional<Slot<String>> getHeadNumber() {
        return this.head_number;
    }

    public Optional<Slot<String>> getName() {
        return this.name;
    }

    public Optional<Slot<PhoneContactsType>> getPhoneContactType() {
        return this.phone_contact_type;
    }

    public Optional<Slot<String>> getPhoneNumber() {
        return this.phone_number;
    }

    public Optional<Slot<PhoneRecordType>> getPhoneRecordType() {
        return this.phone_record_type;
    }

    public Optional<Slot<PlayType>> getPlayType() {
        return this.play_type;
    }

    public Optional<Slot<String>> getRelativeName() {
        return this.relative_name;
    }

    public Optional<Slot<String>> getTag() {
        return this.tag;
    }

    public Optional<Slot<String>> getTailNumber() {
        return this.tail_number;
    }

    public Optional<Slot<String>> getText() {
        return this.text;
    }

    public PhoneCall setCallType(Slot<PhoneCallType> slot) {
        this.call_type = Optional.e(slot);
        return this;
    }

    public PhoneCall setCardType(Slot<CardType> slot) {
        this.card_type = Optional.e(slot);
        return this;
    }

    public PhoneCall setCity(Slot<Miai.City> slot) {
        this.city = Optional.e(slot);
        return this;
    }

    public PhoneCall setCompany(Slot<String> slot) {
        this.company = Optional.e(slot);
        return this;
    }

    public PhoneCall setDeviceType(Slot<DeviceType> slot) {
        this.device_type = Optional.e(slot);
        return this;
    }

    @Required
    public PhoneCall setEntityType(T t) {
        this.entity_type = t;
        return this;
    }

    public PhoneCall setHeadNumber(Slot<String> slot) {
        this.head_number = Optional.e(slot);
        return this;
    }

    public PhoneCall setName(Slot<String> slot) {
        this.name = Optional.e(slot);
        return this;
    }

    public PhoneCall setPhoneContactType(Slot<PhoneContactsType> slot) {
        this.phone_contact_type = Optional.e(slot);
        return this;
    }

    public PhoneCall setPhoneNumber(Slot<String> slot) {
        this.phone_number = Optional.e(slot);
        return this;
    }

    public PhoneCall setPhoneRecordType(Slot<PhoneRecordType> slot) {
        this.phone_record_type = Optional.e(slot);
        return this;
    }

    public PhoneCall setPlayType(Slot<PlayType> slot) {
        this.play_type = Optional.e(slot);
        return this;
    }

    public PhoneCall setRelativeName(Slot<String> slot) {
        this.relative_name = Optional.e(slot);
        return this;
    }

    public PhoneCall setTag(Slot<String> slot) {
        this.tag = Optional.e(slot);
        return this;
    }

    public PhoneCall setTailNumber(Slot<String> slot) {
        this.tail_number = Optional.e(slot);
        return this;
    }

    public PhoneCall setText(Slot<String> slot) {
        this.text = Optional.e(slot);
        return this;
    }

    public PhoneCall(T t) {
        this.entity_type = t;
    }
}
