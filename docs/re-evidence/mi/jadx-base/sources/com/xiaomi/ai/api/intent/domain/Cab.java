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
public class Cab<T extends EntityType> extends IntentionEntity<T, general> {

    @Required
    private T entity_type;
    private Optional<Slot<String>> origin = Optional.a();
    private Optional<Slot<String>> destination = Optional.a();
    private Optional<Slot<String>> car_type = Optional.a();
    private Optional<Slot<String>> package_name = Optional.a();

    public static class functions implements EntityType {
        private Optional<Slot<String>> name = Optional.a();

        public static functions read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            functions functionsVar = new functions();
            if (zsdVar.z("name")) {
                functionsVar.setName(IntentUtils.readSlot(zsdVar.w("name"), String.class));
            }
            return functionsVar;
        }

        public static c4h write(functions functionsVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            if (functionsVar.name.c()) {
                c4hVarCreateObjectNode.f0("name", IntentUtils.writeSlot(functionsVar.name.b()));
            }
            return c4hVarCreateObjectNode;
        }

        public Optional<Slot<String>> getName() {
            return this.name;
        }

        public functions setName(Slot<String> slot) {
            this.name = Optional.e(slot);
            return this;
        }
    }

    public Cab() {
    }

    public static Cab read(zsd zsdVar, Optional<String> optional) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
        Cab cab = new Cab(IntentUtils.readEntityType(zsdVar, AIApiConstants.Cab.NAME, optional));
        if (zsdVar.z("origin")) {
            cab.setOrigin(IntentUtils.readSlot(zsdVar.w("origin"), String.class));
        }
        if (zsdVar.z("destination")) {
            cab.setDestination(IntentUtils.readSlot(zsdVar.w("destination"), String.class));
        }
        if (zsdVar.z("car_type")) {
            cab.setCarType(IntentUtils.readSlot(zsdVar.w("car_type"), String.class));
        }
        if (zsdVar.z("package_name")) {
            cab.setPackageName(IntentUtils.readSlot(zsdVar.w("package_name"), String.class));
        }
        return cab;
    }

    public static zsd write(Cab cab) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        c4h c4hVar = (c4h) IntentUtils.writeEntityType(cab.entity_type);
        if (cab.origin.c()) {
            c4hVar.f0("origin", IntentUtils.writeSlot(cab.origin.b()));
        }
        if (cab.destination.c()) {
            c4hVar.f0("destination", IntentUtils.writeSlot(cab.destination.b()));
        }
        if (cab.car_type.c()) {
            c4hVar.f0("car_type", IntentUtils.writeSlot(cab.car_type.b()));
        }
        if (cab.package_name.c()) {
            c4hVar.f0("package_name", IntentUtils.writeSlot(cab.package_name.b()));
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

    public Optional<Slot<String>> getPackageName() {
        return this.package_name;
    }

    public Cab setCarType(Slot<String> slot) {
        this.car_type = Optional.e(slot);
        return this;
    }

    public Cab setDestination(Slot<String> slot) {
        this.destination = Optional.e(slot);
        return this;
    }

    @Required
    public Cab setEntityType(T t) {
        this.entity_type = t;
        return this;
    }

    public Cab setOrigin(Slot<String> slot) {
        this.origin = Optional.e(slot);
        return this;
    }

    public Cab setPackageName(Slot<String> slot) {
        this.package_name = Optional.e(slot);
        return this;
    }

    public Cab(T t) {
        this.entity_type = t;
    }
}
