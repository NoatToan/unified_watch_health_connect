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
public class EstateService<T extends EntityType> extends IntentionEntity<T, general> {

    @Required
    private T entity_type;
    private Optional<Slot<String>> name = Optional.a();
    private Optional<Slot<Miai.City>> city = Optional.a();
    private Optional<Slot<Miai.District>> district = Optional.a();
    private Optional<Slot<String>> area = Optional.a();

    public static class evaluation implements EntityType {
        public static evaluation read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new evaluation();
        }

        public static c4h write(evaluation evaluationVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class purchase implements EntityType {
        public static purchase read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new purchase();
        }

        public static c4h write(purchase purchaseVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class rent implements EntityType {
        public static rent read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new rent();
        }

        public static c4h write(rent rentVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public EstateService() {
    }

    public static EstateService read(zsd zsdVar, Optional<String> optional) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
        EstateService estateService = new EstateService(IntentUtils.readEntityType(zsdVar, AIApiConstants.EstateService.NAME, optional));
        if (zsdVar.z("name")) {
            estateService.setName(IntentUtils.readSlot(zsdVar.w("name"), String.class));
        }
        if (zsdVar.z("city")) {
            estateService.setCity(IntentUtils.readSlot(zsdVar.w("city"), Miai.City.class));
        }
        if (zsdVar.z(DistrictSearchQuery.KEYWORDS_DISTRICT)) {
            estateService.setDistrict(IntentUtils.readSlot(zsdVar.w(DistrictSearchQuery.KEYWORDS_DISTRICT), Miai.District.class));
        }
        if (zsdVar.z("area")) {
            estateService.setArea(IntentUtils.readSlot(zsdVar.w("area"), String.class));
        }
        return estateService;
    }

    public static zsd write(EstateService estateService) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        c4h c4hVar = (c4h) IntentUtils.writeEntityType(estateService.entity_type);
        if (estateService.name.c()) {
            c4hVar.f0("name", IntentUtils.writeSlot(estateService.name.b()));
        }
        if (estateService.city.c()) {
            c4hVar.f0("city", IntentUtils.writeSlot(estateService.city.b()));
        }
        if (estateService.district.c()) {
            c4hVar.f0(DistrictSearchQuery.KEYWORDS_DISTRICT, IntentUtils.writeSlot(estateService.district.b()));
        }
        if (estateService.area.c()) {
            c4hVar.f0("area", IntentUtils.writeSlot(estateService.area.b()));
        }
        return c4hVar;
    }

    @Override // com.xiaomi.ai.api.intent.IntentionEntity
    public T __1() {
        return this.entity_type;
    }

    public Optional<Slot<String>> getArea() {
        return this.area;
    }

    public Optional<Slot<Miai.City>> getCity() {
        return this.city;
    }

    public Optional<Slot<Miai.District>> getDistrict() {
        return this.district;
    }

    @Required
    public T getEntityType() {
        return this.entity_type;
    }

    public Optional<Slot<String>> getName() {
        return this.name;
    }

    public EstateService setArea(Slot<String> slot) {
        this.area = Optional.e(slot);
        return this;
    }

    public EstateService setCity(Slot<Miai.City> slot) {
        this.city = Optional.e(slot);
        return this;
    }

    public EstateService setDistrict(Slot<Miai.District> slot) {
        this.district = Optional.e(slot);
        return this;
    }

    @Required
    public EstateService setEntityType(T t) {
        this.entity_type = t;
        return this;
    }

    public EstateService setName(Slot<String> slot) {
        this.name = Optional.e(slot);
        return this;
    }

    public EstateService(T t) {
        this.entity_type = t;
    }
}
