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
public class TouristAttractions<T extends EntityType> extends IntentionEntity<T, general> {

    @Required
    private T entity_type;
    private Optional<Slot<Miai.Location>> location = Optional.a();

    @Required
    private Slot<String> name;

    public static class area implements EntityType {
        public static area read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new area();
        }

        public static c4h write(area areaVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class businessHour implements EntityType {
        public static businessHour read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new businessHour();
        }

        public static c4h write(businessHour businesshour) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class introduction implements EntityType {
        public static introduction read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new introduction();
        }

        public static c4h write(introduction introductionVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class site implements EntityType {
        public static site read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new site();
        }

        public static c4h write(site siteVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class ticket implements EntityType {
        private Optional<Slot<String>> name = Optional.a();

        public static ticket read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            ticket ticketVar = new ticket();
            if (zsdVar.z("name")) {
                ticketVar.setName(IntentUtils.readSlot(zsdVar.w("name"), String.class));
            }
            return ticketVar;
        }

        public static c4h write(ticket ticketVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            if (ticketVar.name.c()) {
                c4hVarCreateObjectNode.f0("name", IntentUtils.writeSlot(ticketVar.name.b()));
            }
            return c4hVarCreateObjectNode;
        }

        public Optional<Slot<String>> getName() {
            return this.name;
        }

        public ticket setName(Slot<String> slot) {
            this.name = Optional.e(slot);
            return this;
        }
    }

    public TouristAttractions() {
    }

    public static TouristAttractions read(zsd zsdVar, Optional<String> optional) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
        TouristAttractions touristAttractions = new TouristAttractions(IntentUtils.readEntityType(zsdVar, AIApiConstants.TouristAttractions.NAME, optional));
        touristAttractions.setName(IntentUtils.readSlot(zsdVar.w("name"), String.class));
        if (zsdVar.z("location")) {
            touristAttractions.setLocation(IntentUtils.readSlot(zsdVar.w("location"), Miai.Location.class));
        }
        return touristAttractions;
    }

    public static zsd write(TouristAttractions touristAttractions) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        c4h c4hVar = (c4h) IntentUtils.writeEntityType(touristAttractions.entity_type);
        c4hVar.f0("name", IntentUtils.writeSlot(touristAttractions.name));
        if (touristAttractions.location.c()) {
            c4hVar.f0("location", IntentUtils.writeSlot(touristAttractions.location.b()));
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

    public Optional<Slot<Miai.Location>> getLocation() {
        return this.location;
    }

    @Required
    public Slot<String> getName() {
        return this.name;
    }

    @Required
    public TouristAttractions setEntityType(T t) {
        this.entity_type = t;
        return this;
    }

    public TouristAttractions setLocation(Slot<Miai.Location> slot) {
        this.location = Optional.e(slot);
        return this;
    }

    @Required
    public TouristAttractions setName(Slot<String> slot) {
        this.name = slot;
        return this;
    }

    public TouristAttractions(T t) {
        this.entity_type = t;
    }

    public TouristAttractions(T t, Slot<String> slot) {
        this.entity_type = t;
        this.name = slot;
    }
}
