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
public class PublicTransport<T extends EntityType> extends IntentionEntity<T, general> {

    @Required
    private T entity_type;
    private Optional<Slot<String>> bus_name = Optional.a();
    private Optional<Slot<String>> origin = Optional.a();
    private Optional<Slot<String>> destination = Optional.a();

    public static class nearBy implements EntityType {
        public static nearBy read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new nearBy();
        }

        public static c4h write(nearBy nearby) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class realtime implements EntityType {
        public static realtime read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new realtime();
        }

        public static c4h write(realtime realtimeVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class route implements EntityType {
        public static route read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new route();
        }

        public static c4h write(route routeVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public PublicTransport() {
    }

    public static PublicTransport read(zsd zsdVar, Optional<String> optional) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
        PublicTransport publicTransport = new PublicTransport(IntentUtils.readEntityType(zsdVar, AIApiConstants.PublicTransport.NAME, optional));
        if (zsdVar.z("bus_name")) {
            publicTransport.setBusName(IntentUtils.readSlot(zsdVar.w("bus_name"), String.class));
        }
        if (zsdVar.z("origin")) {
            publicTransport.setOrigin(IntentUtils.readSlot(zsdVar.w("origin"), String.class));
        }
        if (zsdVar.z("destination")) {
            publicTransport.setDestination(IntentUtils.readSlot(zsdVar.w("destination"), String.class));
        }
        return publicTransport;
    }

    public static zsd write(PublicTransport publicTransport) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        c4h c4hVar = (c4h) IntentUtils.writeEntityType(publicTransport.entity_type);
        if (publicTransport.bus_name.c()) {
            c4hVar.f0("bus_name", IntentUtils.writeSlot(publicTransport.bus_name.b()));
        }
        if (publicTransport.origin.c()) {
            c4hVar.f0("origin", IntentUtils.writeSlot(publicTransport.origin.b()));
        }
        if (publicTransport.destination.c()) {
            c4hVar.f0("destination", IntentUtils.writeSlot(publicTransport.destination.b()));
        }
        return c4hVar;
    }

    @Override // com.xiaomi.ai.api.intent.IntentionEntity
    public T __1() {
        return this.entity_type;
    }

    public Optional<Slot<String>> getBusName() {
        return this.bus_name;
    }

    public Optional<Slot<String>> getDestination() {
        return this.destination;
    }

    @Required
    public T getEntityType() {
        return this.entity_type;
    }

    public Optional<Slot<String>> getOrigin() {
        return this.origin;
    }

    public PublicTransport setBusName(Slot<String> slot) {
        this.bus_name = Optional.e(slot);
        return this;
    }

    public PublicTransport setDestination(Slot<String> slot) {
        this.destination = Optional.e(slot);
        return this;
    }

    @Required
    public PublicTransport setEntityType(T t) {
        this.entity_type = t;
        return this;
    }

    public PublicTransport setOrigin(Slot<String> slot) {
        this.origin = Optional.e(slot);
        return this;
    }

    public PublicTransport(T t) {
        this.entity_type = t;
    }
}
