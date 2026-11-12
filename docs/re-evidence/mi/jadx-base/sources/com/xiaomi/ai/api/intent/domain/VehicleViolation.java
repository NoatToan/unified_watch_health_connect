package com.xiaomi.ai.api.intent.domain;

import com.fasterxml.jackson.core.JsonProcessingException;
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
public class VehicleViolation<T extends EntityType> extends IntentionEntity<T, general> {
    private Optional<Slot<String>> car_name = Optional.a();
    private Optional<Slot<String>> car_number = Optional.a();

    public static VehicleViolation read(zsd zsdVar, Optional<String> optional) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
        VehicleViolation vehicleViolation = new VehicleViolation();
        if (zsdVar.z("car_name")) {
            vehicleViolation.setCarName(IntentUtils.readSlot(zsdVar.w("car_name"), String.class));
        }
        if (zsdVar.z("car_number")) {
            vehicleViolation.setCarNumber(IntentUtils.readSlot(zsdVar.w("car_number"), String.class));
        }
        return vehicleViolation;
    }

    public static zsd write(VehicleViolation vehicleViolation) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
        if (vehicleViolation.car_name.c()) {
            c4hVarCreateObjectNode.f0("car_name", IntentUtils.writeSlot(vehicleViolation.car_name.b()));
        }
        if (vehicleViolation.car_number.c()) {
            c4hVarCreateObjectNode.f0("car_number", IntentUtils.writeSlot(vehicleViolation.car_number.b()));
        }
        return c4hVarCreateObjectNode;
    }

    @Override // com.xiaomi.ai.api.intent.IntentionEntity
    public T __1() {
        return new general();
    }

    public Optional<Slot<String>> getCarName() {
        return this.car_name;
    }

    public Optional<Slot<String>> getCarNumber() {
        return this.car_number;
    }

    public VehicleViolation setCarName(Slot<String> slot) {
        this.car_name = Optional.e(slot);
        return this;
    }

    public VehicleViolation setCarNumber(Slot<String> slot) {
        this.car_number = Optional.e(slot);
        return this;
    }
}
