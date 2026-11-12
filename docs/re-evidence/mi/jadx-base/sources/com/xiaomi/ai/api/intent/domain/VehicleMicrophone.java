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
public class VehicleMicrophone<T extends EntityType> extends IntentionEntity<T, general> {

    @Required
    private T entity_type;
    private Optional<Slot<VehiclePosition>> position = Optional.a();

    public VehicleMicrophone() {
    }

    public static VehicleMicrophone read(zsd zsdVar, Optional<String> optional) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
        VehicleMicrophone vehicleMicrophone = new VehicleMicrophone(IntentUtils.readEntityType(zsdVar, AIApiConstants.VehicleMicrophone.NAME, optional));
        if (zsdVar.z("position")) {
            vehicleMicrophone.setPosition(IntentUtils.readSlot(zsdVar.w("position"), VehiclePosition.class));
        }
        return vehicleMicrophone;
    }

    public static zsd write(VehicleMicrophone vehicleMicrophone) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        c4h c4hVar = (c4h) IntentUtils.writeEntityType(vehicleMicrophone.entity_type);
        if (vehicleMicrophone.position.c()) {
            c4hVar.f0("position", IntentUtils.writeSlot(vehicleMicrophone.position.b()));
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
    public VehicleMicrophone setEntityType(T t) {
        this.entity_type = t;
        return this;
    }

    public VehicleMicrophone setPosition(Slot<VehiclePosition> slot) {
        this.position = Optional.e(slot);
        return this;
    }

    public VehicleMicrophone(T t) {
        this.entity_type = t;
    }
}
