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
public class NavigationMap<T extends EntityType> extends IntentionEntity<T, general> {

    @Required
    private T entity_type;
    private Optional<Slot<String>> mode = Optional.a();
    private Optional<Slot<String>> attribute_value = Optional.a();
    private Optional<Slot<String>> app = Optional.a();

    public static class backToNavi implements EntityType {
        public static backToNavi read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new backToNavi();
        }

        public static c4h write(backToNavi backtonavi) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class broadcastMode implements EntityType {
        private Optional<Slot<String>> mode = Optional.a();

        public static broadcastMode read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            broadcastMode broadcastmode = new broadcastMode();
            if (zsdVar.z("mode")) {
                broadcastmode.setMode(IntentUtils.readSlot(zsdVar.w("mode"), String.class));
            }
            return broadcastmode;
        }

        public static c4h write(broadcastMode broadcastmode) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            if (broadcastmode.mode.c()) {
                c4hVarCreateObjectNode.f0("mode", IntentUtils.writeSlot(broadcastmode.mode.b()));
            }
            return c4hVarCreateObjectNode;
        }

        public Optional<Slot<String>> getMode() {
            return this.mode;
        }

        public broadcastMode setMode(Slot<String> slot) {
            this.mode = Optional.e(slot);
            return this;
        }
    }

    public static class closingTime implements EntityType {
        private Optional<Slot<Miai.Datetime>> datetime = Optional.a();

        public static closingTime read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            closingTime closingtime = new closingTime();
            if (zsdVar.z("datetime")) {
                closingtime.setDatetime(IntentUtils.readSlot(zsdVar.w("datetime"), Miai.Datetime.class));
            }
            return closingtime;
        }

        public static c4h write(closingTime closingtime) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            if (closingtime.datetime.c()) {
                c4hVarCreateObjectNode.f0("datetime", IntentUtils.writeSlot(closingtime.datetime.b()));
            }
            return c4hVarCreateObjectNode;
        }

        public Optional<Slot<Miai.Datetime>> getDatetime() {
            return this.datetime;
        }

        public closingTime setDatetime(Slot<Miai.Datetime> slot) {
            this.datetime = Optional.e(slot);
            return this;
        }
    }

    public static class collectLocation implements EntityType {
        private Optional<Slot<String>> destination = Optional.a();

        public static collectLocation read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            collectLocation collectlocation = new collectLocation();
            if (zsdVar.z("destination")) {
                collectlocation.setDestination(IntentUtils.readSlot(zsdVar.w("destination"), String.class));
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

        public Optional<Slot<String>> getDestination() {
            return this.destination;
        }

        public collectLocation setDestination(Slot<String> slot) {
            this.destination = Optional.e(slot);
            return this;
        }
    }

    public static class companyAddress implements EntityType {
        private Optional<Slot<String>> name = Optional.a();

        public static companyAddress read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            companyAddress companyaddress = new companyAddress();
            if (zsdVar.z("name")) {
                companyaddress.setName(IntentUtils.readSlot(zsdVar.w("name"), String.class));
            }
            return companyaddress;
        }

        public static c4h write(companyAddress companyaddress) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            if (companyaddress.name.c()) {
                c4hVarCreateObjectNode.f0("name", IntentUtils.writeSlot(companyaddress.name.b()));
            }
            return c4hVarCreateObjectNode;
        }

        public Optional<Slot<String>> getName() {
            return this.name;
        }

        public companyAddress setName(Slot<String> slot) {
            this.name = Optional.e(slot);
            return this;
        }
    }

    public static class drivingMode implements EntityType {
        private Optional<Slot<String>> name = Optional.a();

        public static drivingMode read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            drivingMode drivingmode = new drivingMode();
            if (zsdVar.z("name")) {
                drivingmode.setName(IntentUtils.readSlot(zsdVar.w("name"), String.class));
            }
            return drivingmode;
        }

        public static c4h write(drivingMode drivingmode) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            if (drivingmode.name.c()) {
                c4hVarCreateObjectNode.f0("name", IntentUtils.writeSlot(drivingmode.name.b()));
            }
            return c4hVarCreateObjectNode;
        }

        public Optional<Slot<String>> getName() {
            return this.name;
        }

        public drivingMode setName(Slot<String> slot) {
            this.name = Optional.e(slot);
            return this;
        }
    }

    public static class homeAddress implements EntityType {
        private Optional<Slot<String>> name = Optional.a();

        public static homeAddress read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            homeAddress homeaddress = new homeAddress();
            if (zsdVar.z("name")) {
                homeaddress.setName(IntentUtils.readSlot(zsdVar.w("name"), String.class));
            }
            return homeaddress;
        }

        public static c4h write(homeAddress homeaddress) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            if (homeaddress.name.c()) {
                c4hVarCreateObjectNode.f0("name", IntentUtils.writeSlot(homeaddress.name.b()));
            }
            return c4hVarCreateObjectNode;
        }

        public Optional<Slot<String>> getName() {
            return this.name;
        }

        public homeAddress setName(Slot<String> slot) {
            this.name = Optional.e(slot);
            return this;
        }
    }

    public static class mapAddress implements EntityType {
        private Optional<Slot<String>> address_type = Optional.a();
        private Optional<Slot<String>> destination = Optional.a();
        private Optional<Slot<String>> relative_loc = Optional.a();
        private Optional<Slot<String>> tag = Optional.a();

        public static mapAddress read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            mapAddress mapaddress = new mapAddress();
            if (zsdVar.z("address_type")) {
                mapaddress.setAddressType(IntentUtils.readSlot(zsdVar.w("address_type"), String.class));
            }
            if (zsdVar.z("destination")) {
                mapaddress.setDestination(IntentUtils.readSlot(zsdVar.w("destination"), String.class));
            }
            if (zsdVar.z("relative_loc")) {
                mapaddress.setRelativeLoc(IntentUtils.readSlot(zsdVar.w("relative_loc"), String.class));
            }
            if (zsdVar.z("tag")) {
                mapaddress.setTag(IntentUtils.readSlot(zsdVar.w("tag"), String.class));
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
            if (mapaddress.relative_loc.c()) {
                c4hVarCreateObjectNode.f0("relative_loc", IntentUtils.writeSlot(mapaddress.relative_loc.b()));
            }
            if (mapaddress.tag.c()) {
                c4hVarCreateObjectNode.f0("tag", IntentUtils.writeSlot(mapaddress.tag.b()));
            }
            return c4hVarCreateObjectNode;
        }

        public Optional<Slot<String>> getAddressType() {
            return this.address_type;
        }

        public Optional<Slot<String>> getDestination() {
            return this.destination;
        }

        public Optional<Slot<String>> getRelativeLoc() {
            return this.relative_loc;
        }

        public Optional<Slot<String>> getTag() {
            return this.tag;
        }

        public mapAddress setAddressType(Slot<String> slot) {
            this.address_type = Optional.e(slot);
            return this;
        }

        public mapAddress setDestination(Slot<String> slot) {
            this.destination = Optional.e(slot);
            return this;
        }

        public mapAddress setRelativeLoc(Slot<String> slot) {
            this.relative_loc = Optional.e(slot);
            return this;
        }

        public mapAddress setTag(Slot<String> slot) {
            this.tag = Optional.e(slot);
            return this;
        }
    }

    public static class mode implements EntityType {
        private Optional<Slot<String>> value = Optional.a();

        public static mode read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            mode modeVar = new mode();
            if (zsdVar.z("value")) {
                modeVar.setValue(IntentUtils.readSlot(zsdVar.w("value"), String.class));
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

        public Optional<Slot<String>> getValue() {
            return this.value;
        }

        public mode setValue(Slot<String> slot) {
            this.value = Optional.e(slot);
            return this;
        }
    }

    public static class offlineMap implements EntityType {
        private Optional<Slot<SignLocation>> sign_location = Optional.a();

        public static offlineMap read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            offlineMap offlinemap = new offlineMap();
            if (zsdVar.z("sign_location")) {
                offlinemap.setSignLocation(IntentUtils.readSlot(zsdVar.w("sign_location"), SignLocation.class));
            }
            return offlinemap;
        }

        public static c4h write(offlineMap offlinemap) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            if (offlinemap.sign_location.c()) {
                c4hVarCreateObjectNode.f0("sign_location", IntentUtils.writeSlot(offlinemap.sign_location.b()));
            }
            return c4hVarCreateObjectNode;
        }

        public Optional<Slot<SignLocation>> getSignLocation() {
            return this.sign_location;
        }

        public offlineMap setSignLocation(Slot<SignLocation> slot) {
            this.sign_location = Optional.e(slot);
            return this;
        }
    }

    public static class view implements EntityType {
        private Optional<Slot<String>> mode = Optional.a();

        public static view read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            view viewVar = new view();
            if (zsdVar.z("mode")) {
                viewVar.setMode(IntentUtils.readSlot(zsdVar.w("mode"), String.class));
            }
            return viewVar;
        }

        public static c4h write(view viewVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            if (viewVar.mode.c()) {
                c4hVarCreateObjectNode.f0("mode", IntentUtils.writeSlot(viewVar.mode.b()));
            }
            return c4hVarCreateObjectNode;
        }

        public Optional<Slot<String>> getMode() {
            return this.mode;
        }

        public view setMode(Slot<String> slot) {
            this.mode = Optional.e(slot);
            return this;
        }
    }

    public static class workTime implements EntityType {
        private Optional<Slot<Miai.Datetime>> datetime = Optional.a();

        public static workTime read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            workTime worktime = new workTime();
            if (zsdVar.z("datetime")) {
                worktime.setDatetime(IntentUtils.readSlot(zsdVar.w("datetime"), Miai.Datetime.class));
            }
            return worktime;
        }

        public static c4h write(workTime worktime) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            if (worktime.datetime.c()) {
                c4hVarCreateObjectNode.f0("datetime", IntentUtils.writeSlot(worktime.datetime.b()));
            }
            return c4hVarCreateObjectNode;
        }

        public Optional<Slot<Miai.Datetime>> getDatetime() {
            return this.datetime;
        }

        public workTime setDatetime(Slot<Miai.Datetime> slot) {
            this.datetime = Optional.e(slot);
            return this;
        }
    }

    public NavigationMap() {
    }

    public static NavigationMap read(zsd zsdVar, Optional<String> optional) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
        NavigationMap navigationMap = new NavigationMap(IntentUtils.readEntityType(zsdVar, AIApiConstants.NavigationMap.NAME, optional));
        if (zsdVar.z("mode")) {
            navigationMap.setMode(IntentUtils.readSlot(zsdVar.w("mode"), String.class));
        }
        if (zsdVar.z("attribute_value")) {
            navigationMap.setAttributeValue(IntentUtils.readSlot(zsdVar.w("attribute_value"), String.class));
        }
        if (zsdVar.z("app")) {
            navigationMap.setApp(IntentUtils.readSlot(zsdVar.w("app"), String.class));
        }
        return navigationMap;
    }

    public static zsd write(NavigationMap navigationMap) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        c4h c4hVar = (c4h) IntentUtils.writeEntityType(navigationMap.entity_type);
        if (navigationMap.mode.c()) {
            c4hVar.f0("mode", IntentUtils.writeSlot(navigationMap.mode.b()));
        }
        if (navigationMap.attribute_value.c()) {
            c4hVar.f0("attribute_value", IntentUtils.writeSlot(navigationMap.attribute_value.b()));
        }
        if (navigationMap.app.c()) {
            c4hVar.f0("app", IntentUtils.writeSlot(navigationMap.app.b()));
        }
        return c4hVar;
    }

    @Override // com.xiaomi.ai.api.intent.IntentionEntity
    public T __1() {
        return this.entity_type;
    }

    public Optional<Slot<String>> getApp() {
        return this.app;
    }

    public Optional<Slot<String>> getAttributeValue() {
        return this.attribute_value;
    }

    @Required
    public T getEntityType() {
        return this.entity_type;
    }

    public Optional<Slot<String>> getMode() {
        return this.mode;
    }

    public NavigationMap setApp(Slot<String> slot) {
        this.app = Optional.e(slot);
        return this;
    }

    public NavigationMap setAttributeValue(Slot<String> slot) {
        this.attribute_value = Optional.e(slot);
        return this;
    }

    @Required
    public NavigationMap setEntityType(T t) {
        this.entity_type = t;
        return this;
    }

    public NavigationMap setMode(Slot<String> slot) {
        this.mode = Optional.e(slot);
        return this;
    }

    public NavigationMap(T t) {
        this.entity_type = t;
    }
}
