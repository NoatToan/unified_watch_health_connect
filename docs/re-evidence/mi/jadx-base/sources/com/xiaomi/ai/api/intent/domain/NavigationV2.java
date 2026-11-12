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
import com.xiaomi.smarthome.homeroom.model.Home;
import defpackage.c4h;
import defpackage.zsd;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes7.dex */
public class NavigationV2<T extends EntityType> extends IntentionEntity<T, general> {

    @Required
    private Slot<DirectMode> direct_mode;

    @Required
    private T entity_type;
    private Optional<Slot<PoiLocation>> destination = Optional.a();
    private Optional<Slot<PoiLocation>> origin = Optional.a();
    private Optional<Slot<PoiLocation>> pass_point = Optional.a();
    private Optional<Slot<Route>> route = Optional.a();
    private Optional<Slot<MapAppType>> app = Optional.a();
    private Optional<Slot<MapFeature>> features = Optional.a();

    public enum AddressType {
        Normal(0, "Normal"),
        PoiTag(1, "PoiTag"),
        Home(2, Home.TAG),
        Company(3, "Company"),
        Here(4, "Here"),
        Favorite(5, "Favorite"),
        Region(6, "Region"),
        Destination(7, "Destination"),
        PassPoint(8, "PassPoint"),
        Road(9, "Road"),
        Origin(10, "Origin"),
        ForeignPoi(11, "ForeignPoi");

        private int id;
        private String name;

        AddressType(int i, String str) {
            this.id = i;
            this.name = str;
        }

        public static AddressType find(String str) {
            for (AddressType addressType : values()) {
                if (addressType.name.equals(str)) {
                    return addressType;
                }
            }
            if (values().length > 0) {
                return values()[0];
            }
            return null;
        }

        public static AddressType read(String str) {
            return find(str);
        }

        public static String write(AddressType addressType) {
            return addressType.getName();
        }

        public int getId() {
            return this.id;
        }

        public String getName() {
            return this.name;
        }
    }

    public enum DirectMode {
        Driving(0, "Driving"),
        Walking(1, "Walking"),
        Riding(2, "Riding"),
        Transit(3, "Transit"),
        Other(4, "Other");

        private int id;
        private String name;

        DirectMode(int i, String str) {
            this.id = i;
            this.name = str;
        }

        public static DirectMode find(String str) {
            for (DirectMode directMode : values()) {
                if (directMode.name.equals(str)) {
                    return directMode;
                }
            }
            if (values().length > 0) {
                return values()[0];
            }
            return null;
        }

        public static DirectMode read(String str) {
            return find(str);
        }

        public static String write(DirectMode directMode) {
            return directMode.getName();
        }

        public int getId() {
            return this.id;
        }

        public String getName() {
            return this.name;
        }
    }

    public enum MapAppType {
        Gaode(0, "Gaode"),
        Baidu(1, "Baidu"),
        Tencent(2, "Tencent"),
        Other(3, "Other");

        private int id;
        private String name;

        MapAppType(int i, String str) {
            this.id = i;
            this.name = str;
        }

        public static MapAppType find(String str) {
            for (MapAppType mapAppType : values()) {
                if (mapAppType.name.equals(str)) {
                    return mapAppType;
                }
            }
            if (values().length > 0) {
                return values()[0];
            }
            return null;
        }

        public static MapAppType read(String str) {
            return find(str);
        }

        public static String write(MapAppType mapAppType) {
            return mapAppType.getName();
        }

        public int getId() {
            return this.id;
        }

        public String getName() {
            return this.name;
        }
    }

    public static class alongPoint implements EntityType {
        public static alongPoint read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new alongPoint();
        }

        public static c4h write(alongPoint alongpoint) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class backToLastNavi implements EntityType {
        public static backToLastNavi read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new backToLastNavi();
        }

        public static c4h write(backToLastNavi backtolastnavi) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class destination implements EntityType {
        private Optional<Slot<PoiLocation>> source = Optional.a();
        private Optional<Slot<PoiLocation>> target = Optional.a();

        public static destination read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            destination destinationVar = new destination();
            if (zsdVar.z("source")) {
                destinationVar.setSource(IntentUtils.readSlot(zsdVar.w("source"), PoiLocation.class));
            }
            if (zsdVar.z("target")) {
                destinationVar.setTarget(IntentUtils.readSlot(zsdVar.w("target"), PoiLocation.class));
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

        public Optional<Slot<PoiLocation>> getSource() {
            return this.source;
        }

        public Optional<Slot<PoiLocation>> getTarget() {
            return this.target;
        }

        public destination setSource(Slot<PoiLocation> slot) {
            this.source = Optional.e(slot);
            return this;
        }

        public destination setTarget(Slot<PoiLocation> slot) {
            this.target = Optional.e(slot);
            return this;
        }
    }

    public static class electricity implements EntityType {
        public static electricity read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new electricity();
        }

        public static c4h write(electricity electricityVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
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

    public static class origin implements EntityType {
        public static origin read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new origin();
        }

        public static c4h write(origin originVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class originLocation implements EntityType {
        public static originLocation read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new originLocation();
        }

        public static c4h write(originLocation originlocation) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class overSpeed implements EntityType {
        public static overSpeed read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new overSpeed();
        }

        public static c4h write(overSpeed overspeed) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
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

    public static class routePoint implements EntityType {
        private Optional<Slot<PoiLocation>> name = Optional.a();

        public static routePoint read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            routePoint routepoint = new routePoint();
            if (zsdVar.z("name")) {
                routepoint.setName(IntentUtils.readSlot(zsdVar.w("name"), PoiLocation.class));
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

        public Optional<Slot<PoiLocation>> getName() {
            return this.name;
        }

        public routePoint setName(Slot<PoiLocation> slot) {
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

    public static class vehicleViolation implements EntityType {
        public static vehicleViolation read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new vehicleViolation();
        }

        public static c4h write(vehicleViolation vehicleviolation) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public NavigationV2() {
    }

    public static NavigationV2 read(zsd zsdVar, Optional<String> optional) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
        NavigationV2 navigationV2 = new NavigationV2(IntentUtils.readEntityType(zsdVar, AIApiConstants.NavigationV2.NAME, optional));
        navigationV2.setDirectMode(IntentUtils.readSlot(zsdVar.w("direct_mode"), DirectMode.class));
        if (zsdVar.z("destination")) {
            navigationV2.setDestination(IntentUtils.readSlot(zsdVar.w("destination"), PoiLocation.class));
        }
        if (zsdVar.z("origin")) {
            navigationV2.setOrigin(IntentUtils.readSlot(zsdVar.w("origin"), PoiLocation.class));
        }
        if (zsdVar.z("pass_point")) {
            navigationV2.setPassPoint(IntentUtils.readSlot(zsdVar.w("pass_point"), PoiLocation.class));
        }
        if (zsdVar.z("route")) {
            navigationV2.setRoute(IntentUtils.readSlot(zsdVar.w("route"), Route.class));
        }
        if (zsdVar.z("app")) {
            navigationV2.setApp(IntentUtils.readSlot(zsdVar.w("app"), MapAppType.class));
        }
        if (zsdVar.z("features")) {
            navigationV2.setFeatures(IntentUtils.readSlot(zsdVar.w("features"), MapFeature.class));
        }
        return navigationV2;
    }

    public static zsd write(NavigationV2 navigationV2) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        c4h c4hVar = (c4h) IntentUtils.writeEntityType(navigationV2.entity_type);
        c4hVar.f0("direct_mode", IntentUtils.writeSlot(navigationV2.direct_mode));
        if (navigationV2.destination.c()) {
            c4hVar.f0("destination", IntentUtils.writeSlot(navigationV2.destination.b()));
        }
        if (navigationV2.origin.c()) {
            c4hVar.f0("origin", IntentUtils.writeSlot(navigationV2.origin.b()));
        }
        if (navigationV2.pass_point.c()) {
            c4hVar.f0("pass_point", IntentUtils.writeSlot(navigationV2.pass_point.b()));
        }
        if (navigationV2.route.c()) {
            c4hVar.f0("route", IntentUtils.writeSlot(navigationV2.route.b()));
        }
        if (navigationV2.app.c()) {
            c4hVar.f0("app", IntentUtils.writeSlot(navigationV2.app.b()));
        }
        if (navigationV2.features.c()) {
            c4hVar.f0("features", IntentUtils.writeSlot(navigationV2.features.b()));
        }
        return c4hVar;
    }

    @Override // com.xiaomi.ai.api.intent.IntentionEntity
    public T __1() {
        return this.entity_type;
    }

    public Optional<Slot<MapAppType>> getApp() {
        return this.app;
    }

    public Optional<Slot<PoiLocation>> getDestination() {
        return this.destination;
    }

    @Required
    public Slot<DirectMode> getDirectMode() {
        return this.direct_mode;
    }

    @Required
    public T getEntityType() {
        return this.entity_type;
    }

    public Optional<Slot<MapFeature>> getFeatures() {
        return this.features;
    }

    public Optional<Slot<PoiLocation>> getOrigin() {
        return this.origin;
    }

    public Optional<Slot<PoiLocation>> getPassPoint() {
        return this.pass_point;
    }

    public Optional<Slot<Route>> getRoute() {
        return this.route;
    }

    public NavigationV2 setApp(Slot<MapAppType> slot) {
        this.app = Optional.e(slot);
        return this;
    }

    public NavigationV2 setDestination(Slot<PoiLocation> slot) {
        this.destination = Optional.e(slot);
        return this;
    }

    @Required
    public NavigationV2 setDirectMode(Slot<DirectMode> slot) {
        this.direct_mode = slot;
        return this;
    }

    @Required
    public NavigationV2 setEntityType(T t) {
        this.entity_type = t;
        return this;
    }

    public NavigationV2 setFeatures(Slot<MapFeature> slot) {
        this.features = Optional.e(slot);
        return this;
    }

    public NavigationV2 setOrigin(Slot<PoiLocation> slot) {
        this.origin = Optional.e(slot);
        return this;
    }

    public NavigationV2 setPassPoint(Slot<PoiLocation> slot) {
        this.pass_point = Optional.e(slot);
        return this;
    }

    public NavigationV2 setRoute(Slot<Route> slot) {
        this.route = Optional.e(slot);
        return this;
    }

    public NavigationV2(T t) {
        this.entity_type = t;
    }

    public NavigationV2(T t, Slot<DirectMode> slot) {
        this.entity_type = t;
        this.direct_mode = slot;
    }
}
