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
public class HousingEstate<T extends EntityType> extends IntentionEntity<T, general> {

    @Required
    private T entity_type;
    private Optional<Slot<String>> name = Optional.a();
    private Optional<Slot<Miai.City>> city = Optional.a();
    private Optional<Slot<Miai.District>> district = Optional.a();
    private Optional<Slot<String>> area = Optional.a();

    public static class address implements EntityType {
        public static address read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new address();
        }

        public static c4h write(address addressVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class community implements EntityType {
        public static community read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new community();
        }

        public static c4h write(community communityVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class communityProperty implements EntityType {
        public static communityProperty read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new communityProperty();
        }

        public static c4h write(communityProperty communityproperty) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class communitySupporting implements EntityType {
        public static communitySupporting read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new communitySupporting();
        }

        public static c4h write(communitySupporting communitysupporting) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class communityType implements EntityType {
        public static communityType read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new communityType();
        }

        public static c4h write(communityType communitytype) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class dateBuilt implements EntityType {
        public static dateBuilt read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new dateBuilt();
        }

        public static c4h write(dateBuilt datebuilt) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class developer implements EntityType {
        public static developer read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new developer();
        }

        public static c4h write(developer developerVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class info implements EntityType {
        public static info read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new info();
        }

        public static c4h write(info infoVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
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

    public static class numberBuildings implements EntityType {
        public static numberBuildings read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new numberBuildings();
        }

        public static c4h write(numberBuildings numberbuildings) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class price implements EntityType {
        public static price read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new price();
        }

        public static c4h write(price priceVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class questionAnswer implements EntityType {
        public static questionAnswer read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new questionAnswer();
        }

        public static c4h write(questionAnswer questionanswer) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public HousingEstate() {
    }

    public static HousingEstate read(zsd zsdVar, Optional<String> optional) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
        HousingEstate housingEstate = new HousingEstate(IntentUtils.readEntityType(zsdVar, AIApiConstants.HousingEstate.NAME, optional));
        if (zsdVar.z("name")) {
            housingEstate.setName(IntentUtils.readSlot(zsdVar.w("name"), String.class));
        }
        if (zsdVar.z("city")) {
            housingEstate.setCity(IntentUtils.readSlot(zsdVar.w("city"), Miai.City.class));
        }
        if (zsdVar.z(DistrictSearchQuery.KEYWORDS_DISTRICT)) {
            housingEstate.setDistrict(IntentUtils.readSlot(zsdVar.w(DistrictSearchQuery.KEYWORDS_DISTRICT), Miai.District.class));
        }
        if (zsdVar.z("area")) {
            housingEstate.setArea(IntentUtils.readSlot(zsdVar.w("area"), String.class));
        }
        return housingEstate;
    }

    public static zsd write(HousingEstate housingEstate) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        c4h c4hVar = (c4h) IntentUtils.writeEntityType(housingEstate.entity_type);
        if (housingEstate.name.c()) {
            c4hVar.f0("name", IntentUtils.writeSlot(housingEstate.name.b()));
        }
        if (housingEstate.city.c()) {
            c4hVar.f0("city", IntentUtils.writeSlot(housingEstate.city.b()));
        }
        if (housingEstate.district.c()) {
            c4hVar.f0(DistrictSearchQuery.KEYWORDS_DISTRICT, IntentUtils.writeSlot(housingEstate.district.b()));
        }
        if (housingEstate.area.c()) {
            c4hVar.f0("area", IntentUtils.writeSlot(housingEstate.area.b()));
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

    public HousingEstate setArea(Slot<String> slot) {
        this.area = Optional.e(slot);
        return this;
    }

    public HousingEstate setCity(Slot<Miai.City> slot) {
        this.city = Optional.e(slot);
        return this;
    }

    public HousingEstate setDistrict(Slot<Miai.District> slot) {
        this.district = Optional.e(slot);
        return this;
    }

    @Required
    public HousingEstate setEntityType(T t) {
        this.entity_type = t;
        return this;
    }

    public HousingEstate setName(Slot<String> slot) {
        this.name = Optional.e(slot);
        return this;
    }

    public HousingEstate(T t) {
        this.entity_type = t;
    }
}
