package com.xiaomi.ai.api.intent.domain;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.mibi.sdk.common.CommonConstants;
import com.mibi.sdk.component.Constants;
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
public class Navigation<T extends EntityType> extends IntentionEntity<T, general> {

    @Required
    private Slot<String> direct_mode;

    @Required
    private T entity_type;
    private Optional<Slot<String>> destination = Optional.a();
    private Optional<Slot<String>> travel_prefer = Optional.a();
    private Optional<Slot<String>> origin = Optional.a();
    private Optional<Slot<String>> tag = Optional.a();
    private Optional<Slot<String>> pass_point = Optional.a();
    private Optional<Slot<Integer>> offset = Optional.a();
    private Optional<Slot<String>> app = Optional.a();
    private Optional<Slot<String>> poi_type = Optional.a();
    private Optional<Slot<String>> parking_type = Optional.a();
    private Optional<Slot<String>> aggregate_rating = Optional.a();
    private Optional<Slot<String>> price = Optional.a();
    private Optional<Slot<String>> distance = Optional.a();
    private Optional<Slot<String>> brand = Optional.a();
    private Optional<Slot<String>> properties = Optional.a();
    private Optional<Slot<String>> status = Optional.a();
    private Optional<Slot<String>> relative_loc = Optional.a();
    private Optional<Slot<MapFeature>> features = Optional.a();

    public static class alongPoint implements EntityType {
        public static alongPoint read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new alongPoint();
        }

        public static c4h write(alongPoint alongpoint) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class currentLocation implements EntityType {
        public static currentLocation read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new currentLocation();
        }

        public static c4h write(currentLocation currentlocation) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class currentRoad implements EntityType {
        public static currentRoad read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new currentRoad();
        }

        public static c4h write(currentRoad currentroad) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class destination implements EntityType {
        private Optional<Slot<String>> source = Optional.a();
        private Optional<Slot<String>> target = Optional.a();

        public static destination read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            destination destinationVar = new destination();
            if (zsdVar.z("source")) {
                destinationVar.setSource(IntentUtils.readSlot(zsdVar.w("source"), String.class));
            }
            if (zsdVar.z("target")) {
                destinationVar.setTarget(IntentUtils.readSlot(zsdVar.w("target"), String.class));
            }
            return destinationVar;
        }

        public static c4h write(destination destinationVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            if (destinationVar.source.c()) {
                c4hVarCreateObjectNode.f0("source", IntentUtils.writeSlot(destinationVar.source.b()));
            }
            if (destinationVar.target.c()) {
                c4hVarCreateObjectNode.f0("target", IntentUtils.writeSlot(destinationVar.target.b()));
            }
            return c4hVarCreateObjectNode;
        }

        public Optional<Slot<String>> getSource() {
            return this.source;
        }

        public Optional<Slot<String>> getTarget() {
            return this.target;
        }

        public destination setSource(Slot<String> slot) {
            this.source = Optional.e(slot);
            return this;
        }

        public destination setTarget(Slot<String> slot) {
            this.target = Optional.e(slot);
            return this;
        }
    }

    public static class guide implements EntityType {
        public static guide read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new guide();
        }

        public static c4h write(guide guideVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
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

    public static class routePoint implements EntityType {
        private Optional<Slot<String>> name = Optional.a();

        public static routePoint read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            routePoint routepoint = new routePoint();
            if (zsdVar.z("name")) {
                routepoint.setName(IntentUtils.readSlot(zsdVar.w("name"), String.class));
            }
            return routepoint;
        }

        public static c4h write(routePoint routepoint) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            if (routepoint.name.c()) {
                c4hVarCreateObjectNode.f0("name", IntentUtils.writeSlot(routepoint.name.b()));
            }
            return c4hVarCreateObjectNode;
        }

        public Optional<Slot<String>> getName() {
            return this.name;
        }

        public routePoint setName(Slot<String> slot) {
            this.name = Optional.e(slot);
            return this;
        }
    }

    public static class speed implements EntityType {
        public static speed read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new speed();
        }

        public static c4h write(speed speedVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class trafficSignal implements EntityType {
        public static trafficSignal read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new trafficSignal();
        }

        public static c4h write(trafficSignal trafficsignal) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public Navigation() {
    }

    public static Navigation read(zsd zsdVar, Optional<String> optional) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
        Navigation navigation = new Navigation(IntentUtils.readEntityType(zsdVar, AIApiConstants.Navigation.NAME, optional));
        navigation.setDirectMode(IntentUtils.readSlot(zsdVar.w("direct_mode"), String.class));
        if (zsdVar.z("destination")) {
            navigation.setDestination(IntentUtils.readSlot(zsdVar.w("destination"), String.class));
        }
        if (zsdVar.z("travel_prefer")) {
            navigation.setTravelPrefer(IntentUtils.readSlot(zsdVar.w("travel_prefer"), String.class));
        }
        if (zsdVar.z("origin")) {
            navigation.setOrigin(IntentUtils.readSlot(zsdVar.w("origin"), String.class));
        }
        if (zsdVar.z("tag")) {
            navigation.setTag(IntentUtils.readSlot(zsdVar.w("tag"), String.class));
        }
        if (zsdVar.z("pass_point")) {
            navigation.setPassPoint(IntentUtils.readSlot(zsdVar.w("pass_point"), String.class));
        }
        if (zsdVar.z("offset")) {
            navigation.setOffset(IntentUtils.readSlot(zsdVar.w("offset"), Integer.class));
        }
        if (zsdVar.z("app")) {
            navigation.setApp(IntentUtils.readSlot(zsdVar.w("app"), String.class));
        }
        if (zsdVar.z("poi_type")) {
            navigation.setPoiType(IntentUtils.readSlot(zsdVar.w("poi_type"), String.class));
        }
        if (zsdVar.z("parking_type")) {
            navigation.setParkingType(IntentUtils.readSlot(zsdVar.w("parking_type"), String.class));
        }
        if (zsdVar.z("aggregate_rating")) {
            navigation.setAggregateRating(IntentUtils.readSlot(zsdVar.w("aggregate_rating"), String.class));
        }
        if (zsdVar.z(Constants.KEY_PRICE)) {
            navigation.setPrice(IntentUtils.readSlot(zsdVar.w(Constants.KEY_PRICE), String.class));
        }
        if (zsdVar.z("distance")) {
            navigation.setDistance(IntentUtils.readSlot(zsdVar.w("distance"), String.class));
        }
        if (zsdVar.z(CommonConstants.KEY_BRAND)) {
            navigation.setBrand(IntentUtils.readSlot(zsdVar.w(CommonConstants.KEY_BRAND), String.class));
        }
        if (zsdVar.z("properties")) {
            navigation.setProperties(IntentUtils.readSlot(zsdVar.w("properties"), String.class));
        }
        if (zsdVar.z("status")) {
            navigation.setStatus(IntentUtils.readSlot(zsdVar.w("status"), String.class));
        }
        if (zsdVar.z("relative_loc")) {
            navigation.setRelativeLoc(IntentUtils.readSlot(zsdVar.w("relative_loc"), String.class));
        }
        if (zsdVar.z("features")) {
            navigation.setFeatures(IntentUtils.readSlot(zsdVar.w("features"), MapFeature.class));
        }
        return navigation;
    }

    public static zsd write(Navigation navigation) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        c4h c4hVar = (c4h) IntentUtils.writeEntityType(navigation.entity_type);
        c4hVar.f0("direct_mode", IntentUtils.writeSlot(navigation.direct_mode));
        if (navigation.destination.c()) {
            c4hVar.f0("destination", IntentUtils.writeSlot(navigation.destination.b()));
        }
        if (navigation.travel_prefer.c()) {
            c4hVar.f0("travel_prefer", IntentUtils.writeSlot(navigation.travel_prefer.b()));
        }
        if (navigation.origin.c()) {
            c4hVar.f0("origin", IntentUtils.writeSlot(navigation.origin.b()));
        }
        if (navigation.tag.c()) {
            c4hVar.f0("tag", IntentUtils.writeSlot(navigation.tag.b()));
        }
        if (navigation.pass_point.c()) {
            c4hVar.f0("pass_point", IntentUtils.writeSlot(navigation.pass_point.b()));
        }
        if (navigation.offset.c()) {
            c4hVar.f0("offset", IntentUtils.writeSlot(navigation.offset.b()));
        }
        if (navigation.app.c()) {
            c4hVar.f0("app", IntentUtils.writeSlot(navigation.app.b()));
        }
        if (navigation.poi_type.c()) {
            c4hVar.f0("poi_type", IntentUtils.writeSlot(navigation.poi_type.b()));
        }
        if (navigation.parking_type.c()) {
            c4hVar.f0("parking_type", IntentUtils.writeSlot(navigation.parking_type.b()));
        }
        if (navigation.aggregate_rating.c()) {
            c4hVar.f0("aggregate_rating", IntentUtils.writeSlot(navigation.aggregate_rating.b()));
        }
        if (navigation.price.c()) {
            c4hVar.f0(Constants.KEY_PRICE, IntentUtils.writeSlot(navigation.price.b()));
        }
        if (navigation.distance.c()) {
            c4hVar.f0("distance", IntentUtils.writeSlot(navigation.distance.b()));
        }
        if (navigation.brand.c()) {
            c4hVar.f0(CommonConstants.KEY_BRAND, IntentUtils.writeSlot(navigation.brand.b()));
        }
        if (navigation.properties.c()) {
            c4hVar.f0("properties", IntentUtils.writeSlot(navigation.properties.b()));
        }
        if (navigation.status.c()) {
            c4hVar.f0("status", IntentUtils.writeSlot(navigation.status.b()));
        }
        if (navigation.relative_loc.c()) {
            c4hVar.f0("relative_loc", IntentUtils.writeSlot(navigation.relative_loc.b()));
        }
        if (navigation.features.c()) {
            c4hVar.f0("features", IntentUtils.writeSlot(navigation.features.b()));
        }
        return c4hVar;
    }

    @Override // com.xiaomi.ai.api.intent.IntentionEntity
    public T __1() {
        return this.entity_type;
    }

    public Optional<Slot<String>> getAggregateRating() {
        return this.aggregate_rating;
    }

    public Optional<Slot<String>> getApp() {
        return this.app;
    }

    public Optional<Slot<String>> getBrand() {
        return this.brand;
    }

    public Optional<Slot<String>> getDestination() {
        return this.destination;
    }

    @Required
    public Slot<String> getDirectMode() {
        return this.direct_mode;
    }

    public Optional<Slot<String>> getDistance() {
        return this.distance;
    }

    @Required
    public T getEntityType() {
        return this.entity_type;
    }

    public Optional<Slot<MapFeature>> getFeatures() {
        return this.features;
    }

    public Optional<Slot<Integer>> getOffset() {
        return this.offset;
    }

    public Optional<Slot<String>> getOrigin() {
        return this.origin;
    }

    public Optional<Slot<String>> getParkingType() {
        return this.parking_type;
    }

    public Optional<Slot<String>> getPassPoint() {
        return this.pass_point;
    }

    public Optional<Slot<String>> getPoiType() {
        return this.poi_type;
    }

    public Optional<Slot<String>> getPrice() {
        return this.price;
    }

    public Optional<Slot<String>> getProperties() {
        return this.properties;
    }

    public Optional<Slot<String>> getRelativeLoc() {
        return this.relative_loc;
    }

    public Optional<Slot<String>> getStatus() {
        return this.status;
    }

    public Optional<Slot<String>> getTag() {
        return this.tag;
    }

    public Optional<Slot<String>> getTravelPrefer() {
        return this.travel_prefer;
    }

    public Navigation setAggregateRating(Slot<String> slot) {
        this.aggregate_rating = Optional.e(slot);
        return this;
    }

    public Navigation setApp(Slot<String> slot) {
        this.app = Optional.e(slot);
        return this;
    }

    public Navigation setBrand(Slot<String> slot) {
        this.brand = Optional.e(slot);
        return this;
    }

    public Navigation setDestination(Slot<String> slot) {
        this.destination = Optional.e(slot);
        return this;
    }

    @Required
    public Navigation setDirectMode(Slot<String> slot) {
        this.direct_mode = slot;
        return this;
    }

    public Navigation setDistance(Slot<String> slot) {
        this.distance = Optional.e(slot);
        return this;
    }

    @Required
    public Navigation setEntityType(T t) {
        this.entity_type = t;
        return this;
    }

    public Navigation setFeatures(Slot<MapFeature> slot) {
        this.features = Optional.e(slot);
        return this;
    }

    public Navigation setOffset(Slot<Integer> slot) {
        this.offset = Optional.e(slot);
        return this;
    }

    public Navigation setOrigin(Slot<String> slot) {
        this.origin = Optional.e(slot);
        return this;
    }

    public Navigation setParkingType(Slot<String> slot) {
        this.parking_type = Optional.e(slot);
        return this;
    }

    public Navigation setPassPoint(Slot<String> slot) {
        this.pass_point = Optional.e(slot);
        return this;
    }

    public Navigation setPoiType(Slot<String> slot) {
        this.poi_type = Optional.e(slot);
        return this;
    }

    public Navigation setPrice(Slot<String> slot) {
        this.price = Optional.e(slot);
        return this;
    }

    public Navigation setProperties(Slot<String> slot) {
        this.properties = Optional.e(slot);
        return this;
    }

    public Navigation setRelativeLoc(Slot<String> slot) {
        this.relative_loc = Optional.e(slot);
        return this;
    }

    public Navigation setStatus(Slot<String> slot) {
        this.status = Optional.e(slot);
        return this;
    }

    public Navigation setTag(Slot<String> slot) {
        this.tag = Optional.e(slot);
        return this;
    }

    public Navigation setTravelPrefer(Slot<String> slot) {
        this.travel_prefer = Optional.e(slot);
        return this;
    }

    public Navigation(T t) {
        this.entity_type = t;
    }

    public Navigation(T t, Slot<String> slot) {
        this.entity_type = t;
        this.direct_mode = slot;
    }
}
