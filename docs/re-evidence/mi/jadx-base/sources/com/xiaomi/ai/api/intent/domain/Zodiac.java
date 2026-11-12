package com.xiaomi.ai.api.intent.domain;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.xiaomi.ai.api.common.Required;
import com.xiaomi.ai.api.intent.AIApiConstants;
import com.xiaomi.ai.api.intent.EntityType;
import com.xiaomi.ai.api.intent.IntentUtils;
import com.xiaomi.ai.api.intent.IntentionEntity;
import com.xiaomi.ai.api.intent.Slot;
import com.xiaomi.ai.api.intent.general;
import com.xiaomi.common.Optional;
import defpackage.c4h;
import defpackage.zsd;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes7.dex */
public class Zodiac<T extends EntityType> extends IntentionEntity<T, general> {

    @Required
    private Slot<String> attribute_info;

    @Required
    private Slot<String> attribute_name;

    @Required
    private Slot<String> entity;

    @Required
    private T entity_type;

    public static class age implements EntityType {

        @Required
        private Slot<String> additional_info;

        @Required
        private Slot<String> date_desc;

        public age() {
        }

        public age(Slot<String> slot, Slot<String> slot2) {
            this.date_desc = slot;
            this.additional_info = slot2;
        }

        public static age read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            age ageVar = new age();
            ageVar.setDateDesc(IntentUtils.readSlot(zsdVar.w("date_desc"), String.class));
            ageVar.setAdditionalInfo(IntentUtils.readSlot(zsdVar.w("additional_info"), String.class));
            return ageVar;
        }

        public static c4h write(age ageVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            c4hVarCreateObjectNode.f0("date_desc", IntentUtils.writeSlot(ageVar.date_desc));
            c4hVarCreateObjectNode.f0("additional_info", IntentUtils.writeSlot(ageVar.additional_info));
            return c4hVarCreateObjectNode;
        }

        @Required
        public Slot<String> getAdditionalInfo() {
            return this.additional_info;
        }

        @Required
        public Slot<String> getDateDesc() {
            return this.date_desc;
        }

        @Required
        public age setAdditionalInfo(Slot<String> slot) {
            this.additional_info = slot;
            return this;
        }

        @Required
        public age setDateDesc(Slot<String> slot) {
            this.date_desc = slot;
            return this;
        }
    }

    public static class character implements EntityType {
        public static character read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new character();
        }

        public static c4h write(character characterVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class fortune implements EntityType {

        @Required
        private Slot<String> additional_info;

        @Required
        private Slot<String> date_desc;

        public fortune() {
        }

        public fortune(Slot<String> slot, Slot<String> slot2) {
            this.date_desc = slot;
            this.additional_info = slot2;
        }

        public static fortune read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            fortune fortuneVar = new fortune();
            fortuneVar.setDateDesc(IntentUtils.readSlot(zsdVar.w("date_desc"), String.class));
            fortuneVar.setAdditionalInfo(IntentUtils.readSlot(zsdVar.w("additional_info"), String.class));
            return fortuneVar;
        }

        public static c4h write(fortune fortuneVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            c4hVarCreateObjectNode.f0("date_desc", IntentUtils.writeSlot(fortuneVar.date_desc));
            c4hVarCreateObjectNode.f0("additional_info", IntentUtils.writeSlot(fortuneVar.additional_info));
            return c4hVarCreateObjectNode;
        }

        @Required
        public Slot<String> getAdditionalInfo() {
            return this.additional_info;
        }

        @Required
        public Slot<String> getDateDesc() {
            return this.date_desc;
        }

        @Required
        public fortune setAdditionalInfo(Slot<String> slot) {
            this.additional_info = slot;
            return this;
        }

        @Required
        public fortune setDateDesc(Slot<String> slot) {
            this.date_desc = slot;
            return this;
        }
    }

    public static class matching implements EntityType {
        public static matching read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new matching();
        }

        public static c4h write(matching matchingVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class ranking implements EntityType {

        @Required
        private Slot<String> additional_info;

        public ranking() {
        }

        public ranking(Slot<String> slot) {
            this.additional_info = slot;
        }

        public static ranking read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            ranking rankingVar = new ranking();
            rankingVar.setAdditionalInfo(IntentUtils.readSlot(zsdVar.w("additional_info"), String.class));
            return rankingVar;
        }

        public static c4h write(ranking rankingVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            c4hVarCreateObjectNode.f0("additional_info", IntentUtils.writeSlot(rankingVar.additional_info));
            return c4hVarCreateObjectNode;
        }

        @Required
        public Slot<String> getAdditionalInfo() {
            return this.additional_info;
        }

        @Required
        public ranking setAdditionalInfo(Slot<String> slot) {
            this.additional_info = slot;
            return this;
        }
    }

    public static class year implements EntityType {

        @Required
        private Slot<String> additional_info;

        public year() {
        }

        public year(Slot<String> slot) {
            this.additional_info = slot;
        }

        public static year read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            year yearVar = new year();
            yearVar.setAdditionalInfo(IntentUtils.readSlot(zsdVar.w("additional_info"), String.class));
            return yearVar;
        }

        public static c4h write(year yearVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            c4hVarCreateObjectNode.f0("additional_info", IntentUtils.writeSlot(yearVar.additional_info));
            return c4hVarCreateObjectNode;
        }

        @Required
        public Slot<String> getAdditionalInfo() {
            return this.additional_info;
        }

        @Required
        public year setAdditionalInfo(Slot<String> slot) {
            this.additional_info = slot;
            return this;
        }
    }

    public Zodiac() {
    }

    public static Zodiac read(zsd zsdVar, Optional<String> optional) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
        Zodiac zodiac = new Zodiac(IntentUtils.readEntityType(zsdVar, AIApiConstants.Zodiac.NAME, optional));
        zodiac.setEntity(IntentUtils.readSlot(zsdVar.w("entity"), String.class));
        zodiac.setAttributeName(IntentUtils.readSlot(zsdVar.w("attribute_name"), String.class));
        zodiac.setAttributeInfo(IntentUtils.readSlot(zsdVar.w("attribute_info"), String.class));
        return zodiac;
    }

    public static zsd write(Zodiac zodiac) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        c4h c4hVar = (c4h) IntentUtils.writeEntityType(zodiac.entity_type);
        c4hVar.f0("entity", IntentUtils.writeSlot(zodiac.entity));
        c4hVar.f0("attribute_name", IntentUtils.writeSlot(zodiac.attribute_name));
        c4hVar.f0("attribute_info", IntentUtils.writeSlot(zodiac.attribute_info));
        return c4hVar;
    }

    @Override // com.xiaomi.ai.api.intent.IntentionEntity
    public T __1() {
        return this.entity_type;
    }

    @Required
    public Slot<String> getAttributeInfo() {
        return this.attribute_info;
    }

    @Required
    public Slot<String> getAttributeName() {
        return this.attribute_name;
    }

    @Required
    public Slot<String> getEntity() {
        return this.entity;
    }

    @Required
    public T getEntityType() {
        return this.entity_type;
    }

    @Required
    public Zodiac setAttributeInfo(Slot<String> slot) {
        this.attribute_info = slot;
        return this;
    }

    @Required
    public Zodiac setAttributeName(Slot<String> slot) {
        this.attribute_name = slot;
        return this;
    }

    @Required
    public Zodiac setEntity(Slot<String> slot) {
        this.entity = slot;
        return this;
    }

    @Required
    public Zodiac setEntityType(T t) {
        this.entity_type = t;
        return this;
    }

    public Zodiac(T t) {
        this.entity_type = t;
    }

    public Zodiac(T t, Slot<String> slot, Slot<String> slot2, Slot<String> slot3) {
        this.entity_type = t;
        this.entity = slot;
        this.attribute_name = slot2;
        this.attribute_info = slot3;
    }
}
