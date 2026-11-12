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
import defpackage.c4h;
import defpackage.zsd;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes7.dex */
public class TravelRestriction<T extends EntityType> extends IntentionEntity<T, general> {

    @Required
    private Slot<Miai.Datetime> datetime;

    @Required
    private T entity_type;

    @Required
    private Slot<Miai.Location> location;

    @Required
    private Slot<String> plate_number;

    public static class city implements EntityType {
        public static city read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new city();
        }

        public static c4h write(city cityVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class deduction implements EntityType {
        public static deduction read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new deduction();
        }

        public static c4h write(deduction deductionVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class outer implements EntityType {
        public static outer read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new outer();
        }

        public static c4h write(outer outerVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class plateNumber implements EntityType {
        public static plateNumber read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new plateNumber();
        }

        public static c4h write(plateNumber platenumber) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class region implements EntityType {
        public static region read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new region();
        }

        public static c4h write(region regionVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class restrictNumber implements EntityType {

        @Required
        private Slot<Integer> name;

        public restrictNumber() {
        }

        public restrictNumber(Slot<Integer> slot) {
            this.name = slot;
        }

        public static restrictNumber read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            restrictNumber restrictnumber = new restrictNumber();
            restrictnumber.setName(IntentUtils.readSlot(zsdVar.w("name"), Integer.class));
            return restrictnumber;
        }

        public static c4h write(restrictNumber restrictnumber) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            c4hVarCreateObjectNode.f0("name", IntentUtils.writeSlot(restrictnumber.name));
            return c4hVarCreateObjectNode;
        }

        @Required
        public Slot<Integer> getName() {
            return this.name;
        }

        @Required
        public restrictNumber setName(Slot<Integer> slot) {
            this.name = slot;
            return this;
        }
    }

    public static class whenRestrict implements EntityType {
        public static whenRestrict read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new whenRestrict();
        }

        public static c4h write(whenRestrict whenrestrict) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class whichCity implements EntityType {
        public static whichCity read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new whichCity();
        }

        public static c4h write(whichCity whichcity) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class whyNot implements EntityType {
        public static whyNot read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new whyNot();
        }

        public static c4h write(whyNot whynot) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class writeNumber implements EntityType {
        public static writeNumber read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new writeNumber();
        }

        public static c4h write(writeNumber writenumber) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public TravelRestriction() {
    }

    public static TravelRestriction read(zsd zsdVar, Optional<String> optional) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
        TravelRestriction travelRestriction = new TravelRestriction(IntentUtils.readEntityType(zsdVar, AIApiConstants.TravelRestriction.NAME, optional));
        travelRestriction.setLocation(IntentUtils.readSlot(zsdVar.w("location"), Miai.Location.class));
        travelRestriction.setDatetime(IntentUtils.readSlot(zsdVar.w("datetime"), Miai.Datetime.class));
        travelRestriction.setPlateNumber(IntentUtils.readSlot(zsdVar.w("plate_number"), String.class));
        return travelRestriction;
    }

    public static zsd write(TravelRestriction travelRestriction) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        c4h c4hVar = (c4h) IntentUtils.writeEntityType(travelRestriction.entity_type);
        c4hVar.f0("location", IntentUtils.writeSlot(travelRestriction.location));
        c4hVar.f0("datetime", IntentUtils.writeSlot(travelRestriction.datetime));
        c4hVar.f0("plate_number", IntentUtils.writeSlot(travelRestriction.plate_number));
        return c4hVar;
    }

    @Override // com.xiaomi.ai.api.intent.IntentionEntity
    public T __1() {
        return this.entity_type;
    }

    @Required
    public Slot<Miai.Datetime> getDatetime() {
        return this.datetime;
    }

    @Required
    public T getEntityType() {
        return this.entity_type;
    }

    @Required
    public Slot<Miai.Location> getLocation() {
        return this.location;
    }

    @Required
    public Slot<String> getPlateNumber() {
        return this.plate_number;
    }

    @Required
    public TravelRestriction setDatetime(Slot<Miai.Datetime> slot) {
        this.datetime = slot;
        return this;
    }

    @Required
    public TravelRestriction setEntityType(T t) {
        this.entity_type = t;
        return this;
    }

    @Required
    public TravelRestriction setLocation(Slot<Miai.Location> slot) {
        this.location = slot;
        return this;
    }

    @Required
    public TravelRestriction setPlateNumber(Slot<String> slot) {
        this.plate_number = slot;
        return this;
    }

    public TravelRestriction(T t) {
        this.entity_type = t;
    }

    public TravelRestriction(T t, Slot<Miai.Location> slot, Slot<Miai.Datetime> slot2, Slot<String> slot3) {
        this.entity_type = t;
        this.location = slot;
        this.datetime = slot2;
        this.plate_number = slot3;
    }
}
