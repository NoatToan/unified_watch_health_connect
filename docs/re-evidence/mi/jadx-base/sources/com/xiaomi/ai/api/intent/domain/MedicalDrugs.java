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
public class MedicalDrugs<T extends EntityType> extends IntentionEntity<T, general> {

    @Required
    private T entity_type;

    @Required
    private Slot<String> name;

    public static class adverseReactions implements EntityType {
        public static adverseReactions read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new adverseReactions();
        }

        public static c4h write(adverseReactions adversereactions) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class contraindication implements EntityType {
        public static contraindication read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new contraindication();
        }

        public static c4h write(contraindication contraindicationVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class dosage implements EntityType {
        public static dosage read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new dosage();
        }

        public static c4h write(dosage dosageVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class indication implements EntityType {
        public static indication read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new indication();
        }

        public static c4h write(indication indicationVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class intro implements EntityType {
        public static intro read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new intro();
        }

        public static c4h write(intro introVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class precaution implements EntityType {
        public static precaution read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new precaution();
        }

        public static c4h write(precaution precautionVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public MedicalDrugs() {
    }

    public static MedicalDrugs read(zsd zsdVar, Optional<String> optional) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
        MedicalDrugs medicalDrugs = new MedicalDrugs(IntentUtils.readEntityType(zsdVar, AIApiConstants.MedicalDrugs.NAME, optional));
        medicalDrugs.setName(IntentUtils.readSlot(zsdVar.w("name"), String.class));
        return medicalDrugs;
    }

    public static zsd write(MedicalDrugs medicalDrugs) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        c4h c4hVar = (c4h) IntentUtils.writeEntityType(medicalDrugs.entity_type);
        c4hVar.f0("name", IntentUtils.writeSlot(medicalDrugs.name));
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

    @Required
    public Slot<String> getName() {
        return this.name;
    }

    @Required
    public MedicalDrugs setEntityType(T t) {
        this.entity_type = t;
        return this;
    }

    @Required
    public MedicalDrugs setName(Slot<String> slot) {
        this.name = slot;
        return this;
    }

    public MedicalDrugs(T t) {
        this.entity_type = t;
    }

    public MedicalDrugs(T t, Slot<String> slot) {
        this.entity_type = t;
        this.name = slot;
    }
}
