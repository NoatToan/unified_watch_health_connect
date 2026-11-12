package com.xiaomi.ai.api.intent.domain;

import com.amap.api.services.district.DistrictSearchQuery;
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
import defpackage.c4h;
import defpackage.zsd;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes7.dex */
public class AutoKnowledge<T extends EntityType> extends IntentionEntity<T, general> {

    @Required
    private T entity_type;
    private Optional<Slot<AutoStatus>> status = Optional.a();

    public static class autoPlate implements EntityType {
        private Optional<Slot<String>> code = Optional.a();
        private Optional<Slot<Miai.Province>> province = Optional.a();
        private Optional<Slot<Miai.City>> city = Optional.a();
        private Optional<Slot<Miai.District>> district = Optional.a();
        private Optional<Slot<Miai.Location>> location = Optional.a();

        public static autoPlate read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            autoPlate autoplate = new autoPlate();
            if (zsdVar.z("code")) {
                autoplate.setCode(IntentUtils.readSlot(zsdVar.w("code"), String.class));
            }
            if (zsdVar.z("province")) {
                autoplate.setProvince(IntentUtils.readSlot(zsdVar.w("province"), Miai.Province.class));
            }
            if (zsdVar.z("city")) {
                autoplate.setCity(IntentUtils.readSlot(zsdVar.w("city"), Miai.City.class));
            }
            if (zsdVar.z(DistrictSearchQuery.KEYWORDS_DISTRICT)) {
                autoplate.setDistrict(IntentUtils.readSlot(zsdVar.w(DistrictSearchQuery.KEYWORDS_DISTRICT), Miai.District.class));
            }
            if (zsdVar.z("location")) {
                autoplate.setLocation(IntentUtils.readSlot(zsdVar.w("location"), Miai.Location.class));
            }
            return autoplate;
        }

        public static c4h write(autoPlate autoplate) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            if (autoplate.code.c()) {
                c4hVarCreateObjectNode.f0("code", IntentUtils.writeSlot(autoplate.code.b()));
            }
            if (autoplate.province.c()) {
                c4hVarCreateObjectNode.f0("province", IntentUtils.writeSlot(autoplate.province.b()));
            }
            if (autoplate.city.c()) {
                c4hVarCreateObjectNode.f0("city", IntentUtils.writeSlot(autoplate.city.b()));
            }
            if (autoplate.district.c()) {
                c4hVarCreateObjectNode.f0(DistrictSearchQuery.KEYWORDS_DISTRICT, IntentUtils.writeSlot(autoplate.district.b()));
            }
            if (autoplate.location.c()) {
                c4hVarCreateObjectNode.f0("location", IntentUtils.writeSlot(autoplate.location.b()));
            }
            return c4hVarCreateObjectNode;
        }

        public Optional<Slot<Miai.City>> getCity() {
            return this.city;
        }

        public Optional<Slot<String>> getCode() {
            return this.code;
        }

        public Optional<Slot<Miai.District>> getDistrict() {
            return this.district;
        }

        public Optional<Slot<Miai.Location>> getLocation() {
            return this.location;
        }

        public Optional<Slot<Miai.Province>> getProvince() {
            return this.province;
        }

        public autoPlate setCity(Slot<Miai.City> slot) {
            this.city = Optional.e(slot);
            return this;
        }

        public autoPlate setCode(Slot<String> slot) {
            this.code = Optional.e(slot);
            return this;
        }

        public autoPlate setDistrict(Slot<Miai.District> slot) {
            this.district = Optional.e(slot);
            return this;
        }

        public autoPlate setLocation(Slot<Miai.Location> slot) {
            this.location = Optional.e(slot);
            return this;
        }

        public autoPlate setProvince(Slot<Miai.Province> slot) {
            this.province = Optional.e(slot);
            return this;
        }
    }

    public static class entity implements EntityType {
        private Optional<Slot<String>> entity_name = Optional.a();

        public static entity read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            entity entityVar = new entity();
            if (zsdVar.z("entity_name")) {
                entityVar.setEntityName(IntentUtils.readSlot(zsdVar.w("entity_name"), String.class));
            }
            return entityVar;
        }

        public static c4h write(entity entityVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            if (entityVar.entity_name.c()) {
                c4hVarCreateObjectNode.f0("entity_name", IntentUtils.writeSlot(entityVar.entity_name.b()));
            }
            return c4hVarCreateObjectNode;
        }

        public Optional<Slot<String>> getEntityName() {
            return this.entity_name;
        }

        public entity setEntityName(Slot<String> slot) {
            this.entity_name = Optional.e(slot);
            return this;
        }
    }

    public static class legislation implements EntityType {
        private Optional<Slot<String>> car_type = Optional.a();
        private Optional<Slot<String>> car_status = Optional.a();
        private Optional<Slot<String>> seat = Optional.a();
        private Optional<Slot<String>> road_type = Optional.a();
        private Optional<Slot<String>> road_condition = Optional.a();
        private Optional<Slot<String>> illegal_action = Optional.a();
        private Optional<Slot<String>> punish_type = Optional.a();
        private Optional<Slot<String>> goods = Optional.a();
        private Optional<Slot<String>> injury_degree = Optional.a();
        private Optional<Slot<Miai.Fraction>> degree = Optional.a();

        public static legislation read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            legislation legislationVar = new legislation();
            if (zsdVar.z("car_type")) {
                legislationVar.setCarType(IntentUtils.readSlot(zsdVar.w("car_type"), String.class));
            }
            if (zsdVar.z("car_status")) {
                legislationVar.setCarStatus(IntentUtils.readSlot(zsdVar.w("car_status"), String.class));
            }
            if (zsdVar.z("seat")) {
                legislationVar.setSeat(IntentUtils.readSlot(zsdVar.w("seat"), String.class));
            }
            if (zsdVar.z("road_type")) {
                legislationVar.setRoadType(IntentUtils.readSlot(zsdVar.w("road_type"), String.class));
            }
            if (zsdVar.z("road_condition")) {
                legislationVar.setRoadCondition(IntentUtils.readSlot(zsdVar.w("road_condition"), String.class));
            }
            if (zsdVar.z("illegal_action")) {
                legislationVar.setIllegalAction(IntentUtils.readSlot(zsdVar.w("illegal_action"), String.class));
            }
            if (zsdVar.z("punish_type")) {
                legislationVar.setPunishType(IntentUtils.readSlot(zsdVar.w("punish_type"), String.class));
            }
            if (zsdVar.z("goods")) {
                legislationVar.setGoods(IntentUtils.readSlot(zsdVar.w("goods"), String.class));
            }
            if (zsdVar.z("injury_degree")) {
                legislationVar.setInjuryDegree(IntentUtils.readSlot(zsdVar.w("injury_degree"), String.class));
            }
            if (zsdVar.z("degree")) {
                legislationVar.setDegree(IntentUtils.readSlot(zsdVar.w("degree"), Miai.Fraction.class));
            }
            return legislationVar;
        }

        public static c4h write(legislation legislationVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            if (legislationVar.car_type.c()) {
                c4hVarCreateObjectNode.f0("car_type", IntentUtils.writeSlot(legislationVar.car_type.b()));
            }
            if (legislationVar.car_status.c()) {
                c4hVarCreateObjectNode.f0("car_status", IntentUtils.writeSlot(legislationVar.car_status.b()));
            }
            if (legislationVar.seat.c()) {
                c4hVarCreateObjectNode.f0("seat", IntentUtils.writeSlot(legislationVar.seat.b()));
            }
            if (legislationVar.road_type.c()) {
                c4hVarCreateObjectNode.f0("road_type", IntentUtils.writeSlot(legislationVar.road_type.b()));
            }
            if (legislationVar.road_condition.c()) {
                c4hVarCreateObjectNode.f0("road_condition", IntentUtils.writeSlot(legislationVar.road_condition.b()));
            }
            if (legislationVar.illegal_action.c()) {
                c4hVarCreateObjectNode.f0("illegal_action", IntentUtils.writeSlot(legislationVar.illegal_action.b()));
            }
            if (legislationVar.punish_type.c()) {
                c4hVarCreateObjectNode.f0("punish_type", IntentUtils.writeSlot(legislationVar.punish_type.b()));
            }
            if (legislationVar.goods.c()) {
                c4hVarCreateObjectNode.f0("goods", IntentUtils.writeSlot(legislationVar.goods.b()));
            }
            if (legislationVar.injury_degree.c()) {
                c4hVarCreateObjectNode.f0("injury_degree", IntentUtils.writeSlot(legislationVar.injury_degree.b()));
            }
            if (legislationVar.degree.c()) {
                c4hVarCreateObjectNode.f0("degree", IntentUtils.writeSlot(legislationVar.degree.b()));
            }
            return c4hVarCreateObjectNode;
        }

        public Optional<Slot<String>> getCarStatus() {
            return this.car_status;
        }

        public Optional<Slot<String>> getCarType() {
            return this.car_type;
        }

        public Optional<Slot<Miai.Fraction>> getDegree() {
            return this.degree;
        }

        public Optional<Slot<String>> getGoods() {
            return this.goods;
        }

        public Optional<Slot<String>> getIllegalAction() {
            return this.illegal_action;
        }

        public Optional<Slot<String>> getInjuryDegree() {
            return this.injury_degree;
        }

        public Optional<Slot<String>> getPunishType() {
            return this.punish_type;
        }

        public Optional<Slot<String>> getRoadCondition() {
            return this.road_condition;
        }

        public Optional<Slot<String>> getRoadType() {
            return this.road_type;
        }

        public Optional<Slot<String>> getSeat() {
            return this.seat;
        }

        public legislation setCarStatus(Slot<String> slot) {
            this.car_status = Optional.e(slot);
            return this;
        }

        public legislation setCarType(Slot<String> slot) {
            this.car_type = Optional.e(slot);
            return this;
        }

        public legislation setDegree(Slot<Miai.Fraction> slot) {
            this.degree = Optional.e(slot);
            return this;
        }

        public legislation setGoods(Slot<String> slot) {
            this.goods = Optional.e(slot);
            return this;
        }

        public legislation setIllegalAction(Slot<String> slot) {
            this.illegal_action = Optional.e(slot);
            return this;
        }

        public legislation setInjuryDegree(Slot<String> slot) {
            this.injury_degree = Optional.e(slot);
            return this;
        }

        public legislation setPunishType(Slot<String> slot) {
            this.punish_type = Optional.e(slot);
            return this;
        }

        public legislation setRoadCondition(Slot<String> slot) {
            this.road_condition = Optional.e(slot);
            return this;
        }

        public legislation setRoadType(Slot<String> slot) {
            this.road_type = Optional.e(slot);
            return this;
        }

        public legislation setSeat(Slot<String> slot) {
            this.seat = Optional.e(slot);
            return this;
        }
    }

    public AutoKnowledge() {
    }

    public static AutoKnowledge read(zsd zsdVar, Optional<String> optional) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
        AutoKnowledge autoKnowledge = new AutoKnowledge(IntentUtils.readEntityType(zsdVar, AIApiConstants.AutoKnowledge.NAME, optional));
        if (zsdVar.z("status")) {
            autoKnowledge.setStatus(IntentUtils.readSlot(zsdVar.w("status"), AutoStatus.class));
        }
        return autoKnowledge;
    }

    public static zsd write(AutoKnowledge autoKnowledge) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        c4h c4hVar = (c4h) IntentUtils.writeEntityType(autoKnowledge.entity_type);
        if (autoKnowledge.status.c()) {
            c4hVar.f0("status", IntentUtils.writeSlot(autoKnowledge.status.b()));
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

    public Optional<Slot<AutoStatus>> getStatus() {
        return this.status;
    }

    @Required
    public AutoKnowledge setEntityType(T t) {
        this.entity_type = t;
        return this;
    }

    public AutoKnowledge setStatus(Slot<AutoStatus> slot) {
        this.status = Optional.e(slot);
        return this;
    }

    public AutoKnowledge(T t) {
        this.entity_type = t;
    }
}
