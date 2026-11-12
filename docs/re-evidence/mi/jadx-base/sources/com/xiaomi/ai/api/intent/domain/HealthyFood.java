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
public class HealthyFood<T extends EntityType> extends IntentionEntity<T, general> {

    @Required
    private T entity_type;

    @Required
    private Slot<String> name;
    private Optional<Slot<String>> type = Optional.a();

    public static class crowd implements EntityType {

        @Required
        private Slot<String> name;

        public crowd() {
        }

        public crowd(Slot<String> slot) {
            this.name = slot;
        }

        public static crowd read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            crowd crowdVar = new crowd();
            crowdVar.setName(IntentUtils.readSlot(zsdVar.w("name"), String.class));
            return crowdVar;
        }

        public static c4h write(crowd crowdVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            c4hVarCreateObjectNode.f0("name", IntentUtils.writeSlot(crowdVar.name));
            return c4hVarCreateObjectNode;
        }

        @Required
        public Slot<String> getName() {
            return this.name;
        }

        @Required
        public crowd setName(Slot<String> slot) {
            this.name = slot;
            return this;
        }
    }

    public static class details implements EntityType {

        @Required
        private Slot<String> type;

        public details() {
        }

        public details(Slot<String> slot) {
            this.type = slot;
        }

        public static details read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            details detailsVar = new details();
            detailsVar.setType(IntentUtils.readSlot(zsdVar.w("type"), String.class));
            return detailsVar;
        }

        public static c4h write(details detailsVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            c4hVarCreateObjectNode.f0("type", IntentUtils.writeSlot(detailsVar.type));
            return c4hVarCreateObjectNode;
        }

        @Required
        public Slot<String> getType() {
            return this.type;
        }

        @Required
        public details setType(Slot<String> slot) {
            this.type = slot;
            return this;
        }
    }

    public static class momInfant implements EntityType {

        @Required
        private Slot<String> status;

        public momInfant() {
        }

        public momInfant(Slot<String> slot) {
            this.status = slot;
        }

        public static momInfant read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            momInfant mominfant = new momInfant();
            mominfant.setStatus(IntentUtils.readSlot(zsdVar.w("status"), String.class));
            return mominfant;
        }

        public static c4h write(momInfant mominfant) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            c4hVarCreateObjectNode.f0("status", IntentUtils.writeSlot(mominfant.status));
            return c4hVarCreateObjectNode;
        }

        @Required
        public Slot<String> getStatus() {
            return this.status;
        }

        @Required
        public momInfant setStatus(Slot<String> slot) {
            this.status = slot;
            return this;
        }
    }

    public static class nutrition implements EntityType {

        @Required
        private Slot<String> name;

        public nutrition() {
        }

        public nutrition(Slot<String> slot) {
            this.name = slot;
        }

        public static nutrition read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            nutrition nutritionVar = new nutrition();
            nutritionVar.setName(IntentUtils.readSlot(zsdVar.w("name"), String.class));
            return nutritionVar;
        }

        public static c4h write(nutrition nutritionVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            c4hVarCreateObjectNode.f0("name", IntentUtils.writeSlot(nutritionVar.name));
            return c4hVarCreateObjectNode;
        }

        @Required
        public Slot<String> getName() {
            return this.name;
        }

        @Required
        public nutrition setName(Slot<String> slot) {
            this.name = slot;
            return this;
        }
    }

    public static class regimen implements EntityType {

        @Required
        private Slot<String> name;

        public regimen() {
        }

        public regimen(Slot<String> slot) {
            this.name = slot;
        }

        public static regimen read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            regimen regimenVar = new regimen();
            regimenVar.setName(IntentUtils.readSlot(zsdVar.w("name"), String.class));
            return regimenVar;
        }

        public static c4h write(regimen regimenVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            c4hVarCreateObjectNode.f0("name", IntentUtils.writeSlot(regimenVar.name));
            return c4hVarCreateObjectNode;
        }

        @Required
        public Slot<String> getName() {
            return this.name;
        }

        @Required
        public regimen setName(Slot<String> slot) {
            this.name = slot;
            return this;
        }
    }

    public static class season implements EntityType {

        @Required
        private Slot<String> name;

        public season() {
        }

        public season(Slot<String> slot) {
            this.name = slot;
        }

        public static season read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            season seasonVar = new season();
            seasonVar.setName(IntentUtils.readSlot(zsdVar.w("name"), String.class));
            return seasonVar;
        }

        public static c4h write(season seasonVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            c4hVarCreateObjectNode.f0("name", IntentUtils.writeSlot(seasonVar.name));
            return c4hVarCreateObjectNode;
        }

        @Required
        public Slot<String> getName() {
            return this.name;
        }

        @Required
        public season setName(Slot<String> slot) {
            this.name = slot;
            return this;
        }
    }

    public HealthyFood() {
    }

    public static HealthyFood read(zsd zsdVar, Optional<String> optional) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
        HealthyFood healthyFood = new HealthyFood(IntentUtils.readEntityType(zsdVar, AIApiConstants.HealthyFood.NAME, optional));
        healthyFood.setName(IntentUtils.readSlot(zsdVar.w("name"), String.class));
        if (zsdVar.z("type")) {
            healthyFood.setType(IntentUtils.readSlot(zsdVar.w("type"), String.class));
        }
        return healthyFood;
    }

    public static zsd write(HealthyFood healthyFood) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        c4h c4hVar = (c4h) IntentUtils.writeEntityType(healthyFood.entity_type);
        c4hVar.f0("name", IntentUtils.writeSlot(healthyFood.name));
        if (healthyFood.type.c()) {
            c4hVar.f0("type", IntentUtils.writeSlot(healthyFood.type.b()));
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

    @Required
    public Slot<String> getName() {
        return this.name;
    }

    public Optional<Slot<String>> getType() {
        return this.type;
    }

    @Required
    public HealthyFood setEntityType(T t) {
        this.entity_type = t;
        return this;
    }

    @Required
    public HealthyFood setName(Slot<String> slot) {
        this.name = slot;
        return this;
    }

    public HealthyFood setType(Slot<String> slot) {
        this.type = Optional.e(slot);
        return this;
    }

    public HealthyFood(T t) {
        this.entity_type = t;
    }

    public HealthyFood(T t, Slot<String> slot) {
        this.entity_type = t;
        this.name = slot;
    }
}
