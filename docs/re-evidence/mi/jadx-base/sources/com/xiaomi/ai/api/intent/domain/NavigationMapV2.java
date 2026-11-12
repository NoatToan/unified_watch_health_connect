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
public class NavigationMapV2<T extends EntityType> extends IntentionEntity<T, general> {
    private Optional<Slot<NavigationV2.MapAppType>> app = Optional.a();

    @Required
    private T entity_type;

    public static class collectLocation implements EntityType {
        private Optional<Slot<PoiLocation>> destination = Optional.a();

        public static collectLocation read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            collectLocation collectlocation = new collectLocation();
            if (zsdVar.z("destination")) {
                collectlocation.setDestination(IntentUtils.readSlot(zsdVar.w("destination"), PoiLocation.class));
            }
            return collectlocation;
        }

        public static c4h write(collectLocation collectlocation) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            if (collectlocation.destination.c()) {
                c4hVarCreateObjectNode.f0("destination", IntentUtils.writeSlot(collectlocation.destination.b()));
            }
            return c4hVarCreateObjectNode;
        }

        public Optional<Slot<PoiLocation>> getDestination() {
            return this.destination;
        }

        public collectLocation setDestination(Slot<PoiLocation> slot) {
            this.destination = Optional.e(slot);
            return this;
        }
    }

    public static class mapAddress implements EntityType {
        private Optional<Slot<NavigationV2.AddressType>> address_type = Optional.a();
        private Optional<Slot<PoiLocation>> destination = Optional.a();

        public static mapAddress read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            mapAddress mapaddress = new mapAddress();
            if (zsdVar.z("address_type")) {
                mapaddress.setAddressType(IntentUtils.readSlot(zsdVar.w("address_type"), NavigationV2.AddressType.class));
            }
            if (zsdVar.z("destination")) {
                mapaddress.setDestination(IntentUtils.readSlot(zsdVar.w("destination"), PoiLocation.class));
            }
            return mapaddress;
        }

        public static c4h write(mapAddress mapaddress) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            if (mapaddress.address_type.c()) {
                c4hVarCreateObjectNode.f0("address_type", IntentUtils.writeSlot(mapaddress.address_type.b()));
            }
            if (mapaddress.destination.c()) {
                c4hVarCreateObjectNode.f0("destination", IntentUtils.writeSlot(mapaddress.destination.b()));
            }
            return c4hVarCreateObjectNode;
        }

        public Optional<Slot<NavigationV2.AddressType>> getAddressType() {
            return this.address_type;
        }

        public Optional<Slot<PoiLocation>> getDestination() {
            return this.destination;
        }

        public mapAddress setAddressType(Slot<NavigationV2.AddressType> slot) {
            this.address_type = Optional.e(slot);
            return this;
        }

        public mapAddress setDestination(Slot<PoiLocation> slot) {
            this.destination = Optional.e(slot);
            return this;
        }
    }

    public NavigationMapV2() {
    }

    public static NavigationMapV2 read(zsd zsdVar, Optional<String> optional) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
        NavigationMapV2 navigationMapV2 = new NavigationMapV2(IntentUtils.readEntityType(zsdVar, AIApiConstants.NavigationMapV2.NAME, optional));
        if (zsdVar.z("app")) {
            navigationMapV2.setApp(IntentUtils.readSlot(zsdVar.w("app"), NavigationV2.MapAppType.class));
        }
        return navigationMapV2;
    }

    public static zsd write(NavigationMapV2 navigationMapV2) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        c4h c4hVar = (c4h) IntentUtils.writeEntityType(navigationMapV2.entity_type);
        if (navigationMapV2.app.c()) {
            c4hVar.f0("app", IntentUtils.writeSlot(navigationMapV2.app.b()));
        }
        return c4hVar;
    }

    @Override // com.xiaomi.ai.api.intent.IntentionEntity
    public T __1() {
        return this.entity_type;
    }

    public Optional<Slot<NavigationV2.MapAppType>> getApp() {
        return this.app;
    }

    @Required
    public T getEntityType() {
        return this.entity_type;
    }

    public NavigationMapV2 setApp(Slot<NavigationV2.MapAppType> slot) {
        this.app = Optional.e(slot);
        return this;
    }

    @Required
    public NavigationMapV2 setEntityType(T t) {
        this.entity_type = t;
        return this;
    }

    public NavigationMapV2(T t) {
        this.entity_type = t;
    }
}
