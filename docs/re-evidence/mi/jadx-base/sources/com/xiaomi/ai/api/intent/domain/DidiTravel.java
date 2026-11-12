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
public class DidiTravel<T extends EntityType> extends IntentionEntity<T, general> {

    @Required
    private T entity_type;

    @Required
    private Slot<String> package_name;
    private Optional<Slot<String>> origin = Optional.a();
    private Optional<Slot<String>> destination = Optional.a();
    private Optional<Slot<String>> car_type = Optional.a();

    public static class defaultToCompanyZ implements EntityType {
        public static defaultToCompanyZ read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new defaultToCompanyZ();
        }

        public static c4h write(defaultToCompanyZ defaulttocompanyz) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class defaultToHomeZ implements EntityType {
        public static defaultToHomeZ read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new defaultToHomeZ();
        }

        public static c4h write(defaultToHomeZ defaulttohomez) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class helpSbK implements EntityType {
        public static helpSbK read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new helpSbK();
        }

        public static c4h write(helpSbK helpsbk) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class helpSbZ implements EntityType {
        public static helpSbZ read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new helpSbZ();
        }

        public static c4h write(helpSbZ helpsbz) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class taxiFreeToFreeZ implements EntityType {
        public static taxiFreeToFreeZ read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new taxiFreeToFreeZ();
        }

        public static c4h write(taxiFreeToFreeZ taxifreetofreez) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class taxiToDestZ implements EntityType {
        public static taxiToDestZ read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new taxiToDestZ();
        }

        public static c4h write(taxiToDestZ taxitodestz) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class toCompanyZ implements EntityType {
        public static toCompanyZ read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new toCompanyZ();
        }

        public static c4h write(toCompanyZ tocompanyz) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class toHomeZ implements EntityType {
        public static toHomeZ read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new toHomeZ();
        }

        public static c4h write(toHomeZ tohomez) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public DidiTravel() {
    }

    public static DidiTravel read(zsd zsdVar, Optional<String> optional) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
        DidiTravel didiTravel = new DidiTravel(IntentUtils.readEntityType(zsdVar, AIApiConstants.DidiTravel.NAME, optional));
        didiTravel.setPackageName(IntentUtils.readSlot(zsdVar.w("package_name"), String.class));
        if (zsdVar.z("origin")) {
            didiTravel.setOrigin(IntentUtils.readSlot(zsdVar.w("origin"), String.class));
        }
        if (zsdVar.z("destination")) {
            didiTravel.setDestination(IntentUtils.readSlot(zsdVar.w("destination"), String.class));
        }
        if (zsdVar.z("car_type")) {
            didiTravel.setCarType(IntentUtils.readSlot(zsdVar.w("car_type"), String.class));
        }
        return didiTravel;
    }

    public static zsd write(DidiTravel didiTravel) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        c4h c4hVar = (c4h) IntentUtils.writeEntityType(didiTravel.entity_type);
        c4hVar.f0("package_name", IntentUtils.writeSlot(didiTravel.package_name));
        if (didiTravel.origin.c()) {
            c4hVar.f0("origin", IntentUtils.writeSlot(didiTravel.origin.b()));
        }
        if (didiTravel.destination.c()) {
            c4hVar.f0("destination", IntentUtils.writeSlot(didiTravel.destination.b()));
        }
        if (didiTravel.car_type.c()) {
            c4hVar.f0("car_type", IntentUtils.writeSlot(didiTravel.car_type.b()));
        }
        return c4hVar;
    }

    @Override // com.xiaomi.ai.api.intent.IntentionEntity
    public T __1() {
        return this.entity_type;
    }

    public Optional<Slot<String>> getCarType() {
        return this.car_type;
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

    @Required
    public Slot<String> getPackageName() {
        return this.package_name;
    }

    public DidiTravel setCarType(Slot<String> slot) {
        this.car_type = Optional.e(slot);
        return this;
    }

    public DidiTravel setDestination(Slot<String> slot) {
        this.destination = Optional.e(slot);
        return this;
    }

    @Required
    public DidiTravel setEntityType(T t) {
        this.entity_type = t;
        return this;
    }

    public DidiTravel setOrigin(Slot<String> slot) {
        this.origin = Optional.e(slot);
        return this;
    }

    @Required
    public DidiTravel setPackageName(Slot<String> slot) {
        this.package_name = slot;
        return this;
    }

    public DidiTravel(T t) {
        this.entity_type = t;
    }

    public DidiTravel(T t, Slot<String> slot) {
        this.entity_type = t;
        this.package_name = slot;
    }
}
