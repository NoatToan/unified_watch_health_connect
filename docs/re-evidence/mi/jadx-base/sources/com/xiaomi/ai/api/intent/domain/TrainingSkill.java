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
import com.xiaomi.smarthome.homeroom.model.Home;
import com.xiaomi.smarthome.library.apache.http.protocol.HTTP;
import defpackage.c4h;
import defpackage.zsd;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes7.dex */
public class TrainingSkill<T extends EntityType> extends IntentionEntity<T, general> {

    @Required
    private T entity_type;
    private Optional<Slot<IntentType>> intent_type = Optional.a();
    private Optional<Slot<String>> skill_id = Optional.a();
    private Optional<Slot<String>> skill_name = Optional.a();
    private Optional<Slot<LocationType>> location_type = Optional.a();
    private Optional<Slot<String>> location_name = Optional.a();

    public enum IntentType {
        Open(1, "Open"),
        Inform(2, "Inform"),
        Close(3, HTTP.CONN_CLOSE);

        private int id;
        private String name;

        IntentType(int i, String str) {
            this.id = i;
            this.name = str;
        }

        public static IntentType find(String str) {
            for (IntentType intentType : values()) {
                if (intentType.name.equals(str)) {
                    return intentType;
                }
            }
            if (values().length > 0) {
                return values()[0];
            }
            return null;
        }

        public static IntentType read(String str) {
            return find(str);
        }

        public static String write(IntentType intentType) {
            return intentType.getName();
        }

        public int getId() {
            return this.id;
        }

        public String getName() {
            return this.name;
        }
    }

    public enum LocationType {
        Default(0, "Default"),
        Home(1, Home.TAG),
        Car(2, "Car");

        private int id;
        private String name;

        LocationType(int i, String str) {
            this.id = i;
            this.name = str;
        }

        public static LocationType find(String str) {
            for (LocationType locationType : values()) {
                if (locationType.name.equals(str)) {
                    return locationType;
                }
            }
            if (values().length > 0) {
                return values()[0];
            }
            return null;
        }

        public static LocationType read(String str) {
            return find(str);
        }

        public static String write(LocationType locationType) {
            return locationType.getName();
        }

        public int getId() {
            return this.id;
        }

        public String getName() {
            return this.name;
        }
    }

    public static class __public implements EntityType {
        public static __public read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new __public();
        }

        public static c4h write(__public __publicVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class automation implements EntityType {
        public static automation read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new automation();
        }

        public static c4h write(automation automationVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class personal implements EntityType {
        public static personal read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new personal();
        }

        public static c4h write(personal personalVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class scene implements EntityType {
        public static scene read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new scene();
        }

        public static c4h write(scene sceneVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public TrainingSkill() {
    }

    public static TrainingSkill read(zsd zsdVar, Optional<String> optional) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
        TrainingSkill trainingSkill = new TrainingSkill(IntentUtils.readEntityType(zsdVar, AIApiConstants.TrainingSkill.NAME, optional));
        if (zsdVar.z("intent_type")) {
            trainingSkill.setIntentType(IntentUtils.readSlot(zsdVar.w("intent_type"), IntentType.class));
        }
        if (zsdVar.z("skill_id")) {
            trainingSkill.setSkillId(IntentUtils.readSlot(zsdVar.w("skill_id"), String.class));
        }
        if (zsdVar.z("skill_name")) {
            trainingSkill.setSkillName(IntentUtils.readSlot(zsdVar.w("skill_name"), String.class));
        }
        if (zsdVar.z("location_type")) {
            trainingSkill.setLocationType(IntentUtils.readSlot(zsdVar.w("location_type"), LocationType.class));
        }
        if (zsdVar.z("location_name")) {
            trainingSkill.setLocationName(IntentUtils.readSlot(zsdVar.w("location_name"), String.class));
        }
        return trainingSkill;
    }

    public static zsd write(TrainingSkill trainingSkill) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        c4h c4hVar = (c4h) IntentUtils.writeEntityType(trainingSkill.entity_type);
        if (trainingSkill.intent_type.c()) {
            c4hVar.f0("intent_type", IntentUtils.writeSlot(trainingSkill.intent_type.b()));
        }
        if (trainingSkill.skill_id.c()) {
            c4hVar.f0("skill_id", IntentUtils.writeSlot(trainingSkill.skill_id.b()));
        }
        if (trainingSkill.skill_name.c()) {
            c4hVar.f0("skill_name", IntentUtils.writeSlot(trainingSkill.skill_name.b()));
        }
        if (trainingSkill.location_type.c()) {
            c4hVar.f0("location_type", IntentUtils.writeSlot(trainingSkill.location_type.b()));
        }
        if (trainingSkill.location_name.c()) {
            c4hVar.f0("location_name", IntentUtils.writeSlot(trainingSkill.location_name.b()));
        }
        return c4hVar;
    }

    @Override // com.xiaomi.ai.api.intent.IntentionEntity
    public T __1() {
        return this.entity_type;
    }

    @Required
    public T getEntityType() {
        return this.entity_type;
    }

    public Optional<Slot<IntentType>> getIntentType() {
        return this.intent_type;
    }

    public Optional<Slot<String>> getLocationName() {
        return this.location_name;
    }

    public Optional<Slot<LocationType>> getLocationType() {
        return this.location_type;
    }

    public Optional<Slot<String>> getSkillId() {
        return this.skill_id;
    }

    public Optional<Slot<String>> getSkillName() {
        return this.skill_name;
    }

    @Required
    public TrainingSkill setEntityType(T t) {
        this.entity_type = t;
        return this;
    }

    public TrainingSkill setIntentType(Slot<IntentType> slot) {
        this.intent_type = Optional.e(slot);
        return this;
    }

    public TrainingSkill setLocationName(Slot<String> slot) {
        this.location_name = Optional.e(slot);
        return this;
    }

    public TrainingSkill setLocationType(Slot<LocationType> slot) {
        this.location_type = Optional.e(slot);
        return this;
    }

    public TrainingSkill setSkillId(Slot<String> slot) {
        this.skill_id = Optional.e(slot);
        return this;
    }

    public TrainingSkill setSkillName(Slot<String> slot) {
        this.skill_name = Optional.e(slot);
        return this;
    }

    public TrainingSkill(T t) {
        this.entity_type = t;
    }
}
