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
public class IoTDevice<T extends EntityType> extends IntentionEntity<T, general> {

    @Required
    private T entity_type;
    private Optional<Slot<IoTDevicePosition>> position = Optional.a();
    private Optional<Slot<TargetPosition>> target_position = Optional.a();
    private Optional<Slot<IoTDeviceDevice>> device = Optional.a();
    private Optional<Slot<IoTDeviceProperty>> property = Optional.a();
    private Optional<Slot<Boolean>> is_all_operate = Optional.a();
    private Optional<Slot<Miai.Datetime>> timing = Optional.a();

    public IoTDevice() {
    }

    public static IoTDevice read(zsd zsdVar, Optional<String> optional) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
        IoTDevice ioTDevice = new IoTDevice(IntentUtils.readEntityType(zsdVar, AIApiConstants.IoTDevice.NAME, optional));
        if (zsdVar.z("position")) {
            ioTDevice.setPosition(IntentUtils.readSlot(zsdVar.w("position"), IoTDevicePosition.class));
        }
        if (zsdVar.z("target_position")) {
            ioTDevice.setTargetPosition(IntentUtils.readSlot(zsdVar.w("target_position"), TargetPosition.class));
        }
        if (zsdVar.z("device")) {
            ioTDevice.setDevice(IntentUtils.readSlot(zsdVar.w("device"), IoTDeviceDevice.class));
        }
        if (zsdVar.z("property")) {
            ioTDevice.setProperty(IntentUtils.readSlot(zsdVar.w("property"), IoTDeviceProperty.class));
        }
        if (zsdVar.z("is_all_operate")) {
            ioTDevice.setIsAllOperate(IntentUtils.readSlot(zsdVar.w("is_all_operate"), Boolean.class));
        }
        if (zsdVar.z("timing")) {
            ioTDevice.setTiming(IntentUtils.readSlot(zsdVar.w("timing"), Miai.Datetime.class));
        }
        return ioTDevice;
    }

    public static zsd write(IoTDevice ioTDevice) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        c4h c4hVar = (c4h) IntentUtils.writeEntityType(ioTDevice.entity_type);
        if (ioTDevice.position.c()) {
            c4hVar.f0("position", IntentUtils.writeSlot(ioTDevice.position.b()));
        }
        if (ioTDevice.target_position.c()) {
            c4hVar.f0("target_position", IntentUtils.writeSlot(ioTDevice.target_position.b()));
        }
        if (ioTDevice.device.c()) {
            c4hVar.f0("device", IntentUtils.writeSlot(ioTDevice.device.b()));
        }
        if (ioTDevice.property.c()) {
            c4hVar.f0("property", IntentUtils.writeSlot(ioTDevice.property.b()));
        }
        if (ioTDevice.is_all_operate.c()) {
            c4hVar.f0("is_all_operate", IntentUtils.writeSlot(ioTDevice.is_all_operate.b()));
        }
        if (ioTDevice.timing.c()) {
            c4hVar.f0("timing", IntentUtils.writeSlot(ioTDevice.timing.b()));
        }
        return c4hVar;
    }

    @Override // com.xiaomi.ai.api.intent.IntentionEntity
    public T __1() {
        return this.entity_type;
    }

    public Optional<Slot<IoTDeviceDevice>> getDevice() {
        return this.device;
    }

    @Required
    public T getEntityType() {
        return this.entity_type;
    }

    public Optional<Slot<Boolean>> getIsAllOperate() {
        return this.is_all_operate;
    }

    public Optional<Slot<IoTDevicePosition>> getPosition() {
        return this.position;
    }

    public Optional<Slot<IoTDeviceProperty>> getProperty() {
        return this.property;
    }

    public Optional<Slot<TargetPosition>> getTargetPosition() {
        return this.target_position;
    }

    public Optional<Slot<Miai.Datetime>> getTiming() {
        return this.timing;
    }

    public IoTDevice setDevice(Slot<IoTDeviceDevice> slot) {
        this.device = Optional.e(slot);
        return this;
    }

    @Required
    public IoTDevice setEntityType(T t) {
        this.entity_type = t;
        return this;
    }

    public IoTDevice setIsAllOperate(Slot<Boolean> slot) {
        this.is_all_operate = Optional.e(slot);
        return this;
    }

    public IoTDevice setPosition(Slot<IoTDevicePosition> slot) {
        this.position = Optional.e(slot);
        return this;
    }

    public IoTDevice setProperty(Slot<IoTDeviceProperty> slot) {
        this.property = Optional.e(slot);
        return this;
    }

    public IoTDevice setTargetPosition(Slot<TargetPosition> slot) {
        this.target_position = Optional.e(slot);
        return this;
    }

    public IoTDevice setTiming(Slot<Miai.Datetime> slot) {
        this.timing = Optional.e(slot);
        return this;
    }

    public IoTDevice(T t) {
        this.entity_type = t;
    }
}
