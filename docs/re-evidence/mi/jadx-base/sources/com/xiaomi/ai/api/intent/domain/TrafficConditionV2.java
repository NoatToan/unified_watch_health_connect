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
public class TrafficConditionV2<T extends EntityType> extends IntentionEntity<T, general> {

    @Required
    private T entity_type;
    private Optional<Slot<PoiLocation>> origin = Optional.a();
    private Optional<Slot<PoiLocation>> destination = Optional.a();
    private Optional<Slot<PoiLocation>> pass_point = Optional.a();

    public enum ModeType {
        NaviPref(0, "NaviPref"),
        NaviDone(1, "NaviDone"),
        NaviWhole(2, "NaviWhole"),
        NaviLeft(3, "NaviLeft");

        private int id;
        private String name;

        ModeType(int i, String str) {
            this.id = i;
            this.name = str;
        }

        public static ModeType find(String str) {
            for (ModeType modeType : values()) {
                if (modeType.name.equals(str)) {
                    return modeType;
                }
            }
            if (values().length > 0) {
                return values()[0];
            }
            return null;
        }

        public static ModeType read(String str) {
            return find(str);
        }

        public static String write(ModeType modeType) {
            return modeType.getName();
        }

        public int getId() {
            return this.id;
        }

        public String getName() {
            return this.name;
        }
    }

    public static class arrivalTime implements EntityType {
        public static arrivalTime read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new arrivalTime();
        }

        public static c4h write(arrivalTime arrivaltime) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class congestion implements EntityType {
        public static congestion read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new congestion();
        }

        public static c4h write(congestion congestionVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class count implements EntityType {
        private Optional<Slot<PoiLocation>> name = Optional.a();

        public static count read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            count countVar = new count();
            if (zsdVar.z("name")) {
                countVar.setName(IntentUtils.readSlot(zsdVar.w("name"), PoiLocation.class));
            }
            return countVar;
        }

        public static c4h write(count countVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            if (countVar.name.c()) {
                c4hVarCreateObjectNode.f0("name", IntentUtils.writeSlot(countVar.name.b()));
            }
            return c4hVarCreateObjectNode;
        }

        public Optional<Slot<PoiLocation>> getName() {
            return this.name;
        }

        public count setName(Slot<PoiLocation> slot) {
            this.name = Optional.e(slot);
            return this;
        }
    }

    public static class departureTime implements EntityType {
        public static departureTime read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new departureTime();
        }

        public static c4h write(departureTime departuretime) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class distance implements EntityType {
        private Optional<Slot<ModeType>> distance_type = Optional.a();

        public static distance read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            distance distanceVar = new distance();
            if (zsdVar.z("distance_type")) {
                distanceVar.setDistanceType(IntentUtils.readSlot(zsdVar.w("distance_type"), ModeType.class));
            }
            return distanceVar;
        }

        public static c4h write(distance distanceVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            if (distanceVar.distance_type.c()) {
                c4hVarCreateObjectNode.f0("distance_type", IntentUtils.writeSlot(distanceVar.distance_type.b()));
            }
            return c4hVarCreateObjectNode;
        }

        public Optional<Slot<ModeType>> getDistanceType() {
            return this.distance_type;
        }

        public distance setDistanceType(Slot<ModeType> slot) {
            this.distance_type = Optional.e(slot);
            return this;
        }
    }

    public static class mode implements EntityType {
        private Optional<Slot<ModeType>> value = Optional.a();

        public static mode read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            mode modeVar = new mode();
            if (zsdVar.z("value")) {
                modeVar.setValue(IntentUtils.readSlot(zsdVar.w("value"), ModeType.class));
            }
            return modeVar;
        }

        public static c4h write(mode modeVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            if (modeVar.value.c()) {
                c4hVarCreateObjectNode.f0("value", IntentUtils.writeSlot(modeVar.value.b()));
            }
            return c4hVarCreateObjectNode;
        }

        public Optional<Slot<ModeType>> getValue() {
            return this.value;
        }

        public mode setValue(Slot<ModeType> slot) {
            this.value = Optional.e(slot);
            return this;
        }
    }

    public static class route implements EntityType {
        private Optional<Slot<Route>> route = Optional.a();

        public static route read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            route routeVar = new route();
            if (zsdVar.z("route")) {
                routeVar.setRoute(IntentUtils.readSlot(zsdVar.w("route"), Route.class));
            }
            return routeVar;
        }

        public static c4h write(route routeVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            if (routeVar.route.c()) {
                c4hVarCreateObjectNode.f0("route", IntentUtils.writeSlot(routeVar.route.b()));
            }
            return c4hVarCreateObjectNode;
        }

        public Optional<Slot<Route>> getRoute() {
            return this.route;
        }

        public route setRoute(Slot<Route> slot) {
            this.route = Optional.e(slot);
            return this;
        }
    }

    public static class timeCost implements EntityType {
        private Optional<Slot<ModeType>> time_type = Optional.a();

        public static timeCost read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            timeCost timecost = new timeCost();
            if (zsdVar.z("time_type")) {
                timecost.setTimeType(IntentUtils.readSlot(zsdVar.w("time_type"), ModeType.class));
            }
            return timecost;
        }

        public static c4h write(timeCost timecost) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            if (timecost.time_type.c()) {
                c4hVarCreateObjectNode.f0("time_type", IntentUtils.writeSlot(timecost.time_type.b()));
            }
            return c4hVarCreateObjectNode;
        }

        public Optional<Slot<ModeType>> getTimeType() {
            return this.time_type;
        }

        public timeCost setTimeType(Slot<ModeType> slot) {
            this.time_type = Optional.e(slot);
            return this;
        }
    }

    public TrafficConditionV2() {
    }

    public static TrafficConditionV2 read(zsd zsdVar, Optional<String> optional) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
        TrafficConditionV2 trafficConditionV2 = new TrafficConditionV2(IntentUtils.readEntityType(zsdVar, AIApiConstants.TrafficConditionV2.NAME, optional));
        if (zsdVar.z("origin")) {
            trafficConditionV2.setOrigin(IntentUtils.readSlot(zsdVar.w("origin"), PoiLocation.class));
        }
        if (zsdVar.z("destination")) {
            trafficConditionV2.setDestination(IntentUtils.readSlot(zsdVar.w("destination"), PoiLocation.class));
        }
        if (zsdVar.z("pass_point")) {
            trafficConditionV2.setPassPoint(IntentUtils.readSlot(zsdVar.w("pass_point"), PoiLocation.class));
        }
        return trafficConditionV2;
    }

    public static zsd write(TrafficConditionV2 trafficConditionV2) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        c4h c4hVar = (c4h) IntentUtils.writeEntityType(trafficConditionV2.entity_type);
        if (trafficConditionV2.origin.c()) {
            c4hVar.f0("origin", IntentUtils.writeSlot(trafficConditionV2.origin.b()));
        }
        if (trafficConditionV2.destination.c()) {
            c4hVar.f0("destination", IntentUtils.writeSlot(trafficConditionV2.destination.b()));
        }
        if (trafficConditionV2.pass_point.c()) {
            c4hVar.f0("pass_point", IntentUtils.writeSlot(trafficConditionV2.pass_point.b()));
        }
        return c4hVar;
    }

    @Override // com.xiaomi.ai.api.intent.IntentionEntity
    public T __1() {
        return this.entity_type;
    }

    public Optional<Slot<PoiLocation>> getDestination() {
        return this.destination;
    }

    @Required
    public T getEntityType() {
        return this.entity_type;
    }

    public Optional<Slot<PoiLocation>> getOrigin() {
        return this.origin;
    }

    public Optional<Slot<PoiLocation>> getPassPoint() {
        return this.pass_point;
    }

    public TrafficConditionV2 setDestination(Slot<PoiLocation> slot) {
        this.destination = Optional.e(slot);
        return this;
    }

    @Required
    public TrafficConditionV2 setEntityType(T t) {
        this.entity_type = t;
        return this;
    }

    public TrafficConditionV2 setOrigin(Slot<PoiLocation> slot) {
        this.origin = Optional.e(slot);
        return this;
    }

    public TrafficConditionV2 setPassPoint(Slot<PoiLocation> slot) {
        this.pass_point = Optional.e(slot);
        return this;
    }

    public TrafficConditionV2(T t) {
        this.entity_type = t;
    }
}
