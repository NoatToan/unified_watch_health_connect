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
public class VehicleSunShade<T extends EntityType> extends IntentionEntity<T, general> {

    @Required
    private T entity_type;
    private Optional<Slot<VehiclePosition>> position = Optional.a();

    public static class openSize implements EntityType {

        @Required
        private Slot<Integer> value;

        public openSize() {
        }

        public openSize(Slot<Integer> slot) {
            this.value = slot;
        }

        public static openSize read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            openSize opensize = new openSize();
            opensize.setValue(IntentUtils.readSlot(zsdVar.w("value"), Integer.class));
            return opensize;
        }

        public static c4h write(openSize opensize) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            c4hVarCreateObjectNode.f0("value", IntentUtils.writeSlot(opensize.value));
            return c4hVarCreateObjectNode;
        }

        @Required
        public Slot<Integer> getValue() {
            return this.value;
        }

        @Required
        public openSize setValue(Slot<Integer> slot) {
            this.value = slot;
            return this;
        }
    }

    public VehicleSunShade() {
    }

    public static VehicleSunShade read(zsd zsdVar, Optional<String> optional) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
        VehicleSunShade vehicleSunShade = new VehicleSunShade(IntentUtils.readEntityType(zsdVar, AIApiConstants.VehicleSunShade.NAME, optional));
        if (zsdVar.z("position")) {
            vehicleSunShade.setPosition(IntentUtils.readSlot(zsdVar.w("position"), VehiclePosition.class));
        }
        return vehicleSunShade;
    }

    public static zsd write(VehicleSunShade vehicleSunShade) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        c4h c4hVar = (c4h) IntentUtils.writeEntityType(vehicleSunShade.entity_type);
        if (vehicleSunShade.position.c()) {
            c4hVar.f0("position", IntentUtils.writeSlot(vehicleSunShade.position.b()));
        }
        return c4hVar;
    }

    @Override // com.xiaomi.ai.api.intent.IntentionEntity
    public T __1() {
        return this.entity_type;
    }

    @Required
    public T getEntityType() {
        return this.entity_type;
    }

    public Optional<Slot<VehiclePosition>> getPosition() {
        return this.position;
    }

    @Required
    public VehicleSunShade setEntityType(T t) {
        this.entity_type = t;
        return this;
    }

    public VehicleSunShade setPosition(Slot<VehiclePosition> slot) {
        this.position = Optional.e(slot);
        return this;
    }

    public VehicleSunShade(T t) {
        this.entity_type = t;
    }
}
