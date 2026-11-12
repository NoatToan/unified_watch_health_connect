package com.xiaomi.ai.api.intent.domain;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.xiaomi.ai.api.common.Required;
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
public class MiHome<T extends EntityType> extends IntentionEntity<T, general> {
    private Optional<Slot<Miai.City>> city = Optional.a();

    @Required
    private T entity_type;

    public static class nearby implements EntityType {
        public static nearby read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new nearby();
        }

        public static c4h write(nearby nearbyVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class specified implements EntityType {

        @Required
        private Slot<Miai.Location> location;

        public specified() {
        }

        public specified(Slot<Miai.Location> slot) {
            this.location = slot;
        }

        public static specified read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            specified specifiedVar = new specified();
            specifiedVar.setLocation(IntentUtils.readSlot(zsdVar.w("location"), Miai.Location.class));
            return specifiedVar;
        }

        public static c4h write(specified specifiedVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            c4hVarCreateObjectNode.f0("location", IntentUtils.writeSlot(specifiedVar.location));
            return c4hVarCreateObjectNode;
        }

        @Required
        public Slot<Miai.Location> getLocation() {
            return this.location;
        }

        @Required
        public specified setLocation(Slot<Miai.Location> slot) {
            this.location = slot;
            return this;
        }
    }

    public MiHome() {
    }

    public static MiHome read(zsd zsdVar, Optional<String> optional) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
        MiHome miHome = new MiHome(IntentUtils.readEntityType(zsdVar, "MiHome", optional));
        if (zsdVar.z("city")) {
            miHome.setCity(IntentUtils.readSlot(zsdVar.w("city"), Miai.City.class));
        }
        return miHome;
    }

    public static zsd write(MiHome miHome) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        c4h c4hVar = (c4h) IntentUtils.writeEntityType(miHome.entity_type);
        if (miHome.city.c()) {
            c4hVar.f0("city", IntentUtils.writeSlot(miHome.city.b()));
        }
        return c4hVar;
    }

    @Override // com.xiaomi.ai.api.intent.IntentionEntity
    public T __1() {
        return this.entity_type;
    }

    public Optional<Slot<Miai.City>> getCity() {
        return this.city;
    }

    @Required
    public T getEntityType() {
        return this.entity_type;
    }

    public MiHome setCity(Slot<Miai.City> slot) {
        this.city = Optional.e(slot);
        return this;
    }

    @Required
    public MiHome setEntityType(T t) {
        this.entity_type = t;
        return this;
    }

    public MiHome(T t) {
        this.entity_type = t;
    }
}
