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
public class TrafficCondition<T extends EntityType> extends IntentionEntity<T, general> {

    @Required
    private T entity_type;
    private Optional<Slot<String>> direct_mode = Optional.a();
    private Optional<Slot<String>> origin = Optional.a();
    private Optional<Slot<String>> destination = Optional.a();
    private Optional<Slot<String>> travel_prefer = Optional.a();
    private Optional<Slot<String>> tag = Optional.a();
    private Optional<Slot<Integer>> offset = Optional.a();
    private Optional<Slot<String>> relative_loc = Optional.a();

    public static class arrivalTime implements EntityType {
        public static arrivalTime read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new arrivalTime();
        }

        public static c4h write(arrivalTime arrivaltime) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class distance implements EntityType {
        public static distance read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new distance();
        }

        public static c4h write(distance distanceVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
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

    public static class timeCost implements EntityType {
        public static timeCost read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new timeCost();
        }

        public static c4h write(timeCost timecost) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public TrafficCondition() {
    }

    public static TrafficCondition read(zsd zsdVar, Optional<String> optional) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
        TrafficCondition trafficCondition = new TrafficCondition(IntentUtils.readEntityType(zsdVar, AIApiConstants.TrafficCondition.NAME, optional));
        if (zsdVar.z("direct_mode")) {
            trafficCondition.setDirectMode(IntentUtils.readSlot(zsdVar.w("direct_mode"), String.class));
        }
        if (zsdVar.z("origin")) {
            trafficCondition.setOrigin(IntentUtils.readSlot(zsdVar.w("origin"), String.class));
        }
        if (zsdVar.z("destination")) {
            trafficCondition.setDestination(IntentUtils.readSlot(zsdVar.w("destination"), String.class));
        }
        if (zsdVar.z("travel_prefer")) {
            trafficCondition.setTravelPrefer(IntentUtils.readSlot(zsdVar.w("travel_prefer"), String.class));
        }
        if (zsdVar.z("tag")) {
            trafficCondition.setTag(IntentUtils.readSlot(zsdVar.w("tag"), String.class));
        }
        if (zsdVar.z("offset")) {
            trafficCondition.setOffset(IntentUtils.readSlot(zsdVar.w("offset"), Integer.class));
        }
        if (zsdVar.z("relative_loc")) {
            trafficCondition.setRelativeLoc(IntentUtils.readSlot(zsdVar.w("relative_loc"), String.class));
        }
        return trafficCondition;
    }

    public static zsd write(TrafficCondition trafficCondition) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        c4h c4hVar = (c4h) IntentUtils.writeEntityType(trafficCondition.entity_type);
        if (trafficCondition.direct_mode.c()) {
            c4hVar.f0("direct_mode", IntentUtils.writeSlot(trafficCondition.direct_mode.b()));
        }
        if (trafficCondition.origin.c()) {
            c4hVar.f0("origin", IntentUtils.writeSlot(trafficCondition.origin.b()));
        }
        if (trafficCondition.destination.c()) {
            c4hVar.f0("destination", IntentUtils.writeSlot(trafficCondition.destination.b()));
        }
        if (trafficCondition.travel_prefer.c()) {
            c4hVar.f0("travel_prefer", IntentUtils.writeSlot(trafficCondition.travel_prefer.b()));
        }
        if (trafficCondition.tag.c()) {
            c4hVar.f0("tag", IntentUtils.writeSlot(trafficCondition.tag.b()));
        }
        if (trafficCondition.offset.c()) {
            c4hVar.f0("offset", IntentUtils.writeSlot(trafficCondition.offset.b()));
        }
        if (trafficCondition.relative_loc.c()) {
            c4hVar.f0("relative_loc", IntentUtils.writeSlot(trafficCondition.relative_loc.b()));
        }
        return c4hVar;
    }

    @Override // com.xiaomi.ai.api.intent.IntentionEntity
    public T __1() {
        return this.entity_type;
    }

    public Optional<Slot<String>> getDestination() {
        return this.destination;
    }

    public Optional<Slot<String>> getDirectMode() {
        return this.direct_mode;
    }

    @Required
    public T getEntityType() {
        return this.entity_type;
    }

    public Optional<Slot<Integer>> getOffset() {
        return this.offset;
    }

    public Optional<Slot<String>> getOrigin() {
        return this.origin;
    }

    public Optional<Slot<String>> getRelativeLoc() {
        return this.relative_loc;
    }

    public Optional<Slot<String>> getTag() {
        return this.tag;
    }

    public Optional<Slot<String>> getTravelPrefer() {
        return this.travel_prefer;
    }

    public TrafficCondition setDestination(Slot<String> slot) {
        this.destination = Optional.e(slot);
        return this;
    }

    public TrafficCondition setDirectMode(Slot<String> slot) {
        this.direct_mode = Optional.e(slot);
        return this;
    }

    @Required
    public TrafficCondition setEntityType(T t) {
        this.entity_type = t;
        return this;
    }

    public TrafficCondition setOffset(Slot<Integer> slot) {
        this.offset = Optional.e(slot);
        return this;
    }

    public TrafficCondition setOrigin(Slot<String> slot) {
        this.origin = Optional.e(slot);
        return this;
    }

    public TrafficCondition setRelativeLoc(Slot<String> slot) {
        this.relative_loc = Optional.e(slot);
        return this;
    }

    public TrafficCondition setTag(Slot<String> slot) {
        this.tag = Optional.e(slot);
        return this;
    }

    public TrafficCondition setTravelPrefer(Slot<String> slot) {
        this.travel_prefer = Optional.e(slot);
        return this;
    }

    public TrafficCondition(T t) {
        this.entity_type = t;
    }
}
