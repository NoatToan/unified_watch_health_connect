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
import com.xiaomi.fitness.nfc.ui.realname.RealNameWebViewActivity;
import defpackage.c4h;
import defpackage.zsd;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes7.dex */
public class VehicleModule<T extends EntityType> extends IntentionEntity<T, general> {

    @Required
    private T entity_type;
    private Optional<Slot<String>> attribute = Optional.a();
    private Optional<Slot<String>> attribute_type = Optional.a();
    private Optional<Slot<Miai.Datetime>> datetime = Optional.a();
    private Optional<Slot<Miai.Duration>> duration = Optional.a();
    private Optional<Slot<String>> vehicle_device = Optional.a();
    private Optional<Slot<String>> position = Optional.a();
    private Optional<Slot<String>> execution_device = Optional.a();
    private Optional<Slot<String>> execution_device_custom_name = Optional.a();
    private Optional<Slot<String>> relative_position = Optional.a();
    private Optional<Slot<String>> select = Optional.a();
    private Optional<Slot<String>> driver_range = Optional.a();

    public static class adjustment implements EntityType {
        private Optional<Slot<String>> name = Optional.a();
        private Optional<Slot<Miai.Number>> number = Optional.a();
        private Optional<Slot<Miai.Fraction>> percent = Optional.a();
        private Optional<Slot<Miai.Multiple>> multiple = Optional.a();
        private Optional<Slot<String>> unit = Optional.a();

        public static adjustment read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            adjustment adjustmentVar = new adjustment();
            if (zsdVar.z("name")) {
                adjustmentVar.setName(IntentUtils.readSlot(zsdVar.w("name"), String.class));
            }
            if (zsdVar.z(RealNameWebViewActivity.NUMBER)) {
                adjustmentVar.setNumber(IntentUtils.readSlot(zsdVar.w(RealNameWebViewActivity.NUMBER), Miai.Number.class));
            }
            if (zsdVar.z("percent")) {
                adjustmentVar.setPercent(IntentUtils.readSlot(zsdVar.w("percent"), Miai.Fraction.class));
            }
            if (zsdVar.z("multiple")) {
                adjustmentVar.setMultiple(IntentUtils.readSlot(zsdVar.w("multiple"), Miai.Multiple.class));
            }
            if (zsdVar.z("unit")) {
                adjustmentVar.setUnit(IntentUtils.readSlot(zsdVar.w("unit"), String.class));
            }
            return adjustmentVar;
        }

        public static c4h write(adjustment adjustmentVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            if (adjustmentVar.name.c()) {
                c4hVarCreateObjectNode.f0("name", IntentUtils.writeSlot(adjustmentVar.name.b()));
            }
            if (adjustmentVar.number.c()) {
                c4hVarCreateObjectNode.f0(RealNameWebViewActivity.NUMBER, IntentUtils.writeSlot(adjustmentVar.number.b()));
            }
            if (adjustmentVar.percent.c()) {
                c4hVarCreateObjectNode.f0("percent", IntentUtils.writeSlot(adjustmentVar.percent.b()));
            }
            if (adjustmentVar.multiple.c()) {
                c4hVarCreateObjectNode.f0("multiple", IntentUtils.writeSlot(adjustmentVar.multiple.b()));
            }
            if (adjustmentVar.unit.c()) {
                c4hVarCreateObjectNode.f0("unit", IntentUtils.writeSlot(adjustmentVar.unit.b()));
            }
            return c4hVarCreateObjectNode;
        }

        public Optional<Slot<Miai.Multiple>> getMultiple() {
            return this.multiple;
        }

        public Optional<Slot<String>> getName() {
            return this.name;
        }

        public Optional<Slot<Miai.Number>> getNumber() {
            return this.number;
        }

        public Optional<Slot<Miai.Fraction>> getPercent() {
            return this.percent;
        }

        public Optional<Slot<String>> getUnit() {
            return this.unit;
        }

        public adjustment setMultiple(Slot<Miai.Multiple> slot) {
            this.multiple = Optional.e(slot);
            return this;
        }

        public adjustment setName(Slot<String> slot) {
            this.name = Optional.e(slot);
            return this;
        }

        public adjustment setNumber(Slot<Miai.Number> slot) {
            this.number = Optional.e(slot);
            return this;
        }

        public adjustment setPercent(Slot<Miai.Fraction> slot) {
            this.percent = Optional.e(slot);
            return this;
        }

        public adjustment setUnit(Slot<String> slot) {
            this.unit = Optional.e(slot);
            return this;
        }
    }

    public static class mode implements EntityType {
        public static mode read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new mode();
        }

        public static c4h write(mode modeVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class status implements EntityType {
        private Optional<Slot<String>> sub_type = Optional.a();

        public static status read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            status statusVar = new status();
            if (zsdVar.z("sub_type")) {
                statusVar.setSubType(IntentUtils.readSlot(zsdVar.w("sub_type"), String.class));
            }
            return statusVar;
        }

        public static c4h write(status statusVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            if (statusVar.sub_type.c()) {
                c4hVarCreateObjectNode.f0("sub_type", IntentUtils.writeSlot(statusVar.sub_type.b()));
            }
            return c4hVarCreateObjectNode;
        }

        public Optional<Slot<String>> getSubType() {
            return this.sub_type;
        }

        public status setSubType(Slot<String> slot) {
            this.sub_type = Optional.e(slot);
            return this;
        }
    }

    public VehicleModule() {
    }

    public static VehicleModule read(zsd zsdVar, Optional<String> optional) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
        VehicleModule vehicleModule = new VehicleModule(IntentUtils.readEntityType(zsdVar, AIApiConstants.VehicleModule.NAME, optional));
        if (zsdVar.z("attribute")) {
            vehicleModule.setAttribute(IntentUtils.readSlot(zsdVar.w("attribute"), String.class));
        }
        if (zsdVar.z("attribute_type")) {
            vehicleModule.setAttributeType(IntentUtils.readSlot(zsdVar.w("attribute_type"), String.class));
        }
        if (zsdVar.z("datetime")) {
            vehicleModule.setDatetime(IntentUtils.readSlot(zsdVar.w("datetime"), Miai.Datetime.class));
        }
        if (zsdVar.z("duration")) {
            vehicleModule.setDuration(IntentUtils.readSlot(zsdVar.w("duration"), Miai.Duration.class));
        }
        if (zsdVar.z("vehicle_device")) {
            vehicleModule.setVehicleDevice(IntentUtils.readSlot(zsdVar.w("vehicle_device"), String.class));
        }
        if (zsdVar.z("position")) {
            vehicleModule.setPosition(IntentUtils.readSlot(zsdVar.w("position"), String.class));
        }
        if (zsdVar.z("execution_device")) {
            vehicleModule.setExecutionDevice(IntentUtils.readSlot(zsdVar.w("execution_device"), String.class));
        }
        if (zsdVar.z("execution_device_custom_name")) {
            vehicleModule.setExecutionDeviceCustomName(IntentUtils.readSlot(zsdVar.w("execution_device_custom_name"), String.class));
        }
        if (zsdVar.z("relative_position")) {
            vehicleModule.setRelativePosition(IntentUtils.readSlot(zsdVar.w("relative_position"), String.class));
        }
        if (zsdVar.z("select")) {
            vehicleModule.setSelect(IntentUtils.readSlot(zsdVar.w("select"), String.class));
        }
        if (zsdVar.z("driver_range")) {
            vehicleModule.setDriverRange(IntentUtils.readSlot(zsdVar.w("driver_range"), String.class));
        }
        return vehicleModule;
    }

    public static zsd write(VehicleModule vehicleModule) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        c4h c4hVar = (c4h) IntentUtils.writeEntityType(vehicleModule.entity_type);
        if (vehicleModule.attribute.c()) {
            c4hVar.f0("attribute", IntentUtils.writeSlot(vehicleModule.attribute.b()));
        }
        if (vehicleModule.attribute_type.c()) {
            c4hVar.f0("attribute_type", IntentUtils.writeSlot(vehicleModule.attribute_type.b()));
        }
        if (vehicleModule.datetime.c()) {
            c4hVar.f0("datetime", IntentUtils.writeSlot(vehicleModule.datetime.b()));
        }
        if (vehicleModule.duration.c()) {
            c4hVar.f0("duration", IntentUtils.writeSlot(vehicleModule.duration.b()));
        }
        if (vehicleModule.vehicle_device.c()) {
            c4hVar.f0("vehicle_device", IntentUtils.writeSlot(vehicleModule.vehicle_device.b()));
        }
        if (vehicleModule.position.c()) {
            c4hVar.f0("position", IntentUtils.writeSlot(vehicleModule.position.b()));
        }
        if (vehicleModule.execution_device.c()) {
            c4hVar.f0("execution_device", IntentUtils.writeSlot(vehicleModule.execution_device.b()));
        }
        if (vehicleModule.execution_device_custom_name.c()) {
            c4hVar.f0("execution_device_custom_name", IntentUtils.writeSlot(vehicleModule.execution_device_custom_name.b()));
        }
        if (vehicleModule.relative_position.c()) {
            c4hVar.f0("relative_position", IntentUtils.writeSlot(vehicleModule.relative_position.b()));
        }
        if (vehicleModule.select.c()) {
            c4hVar.f0("select", IntentUtils.writeSlot(vehicleModule.select.b()));
        }
        if (vehicleModule.driver_range.c()) {
            c4hVar.f0("driver_range", IntentUtils.writeSlot(vehicleModule.driver_range.b()));
        }
        return c4hVar;
    }

    @Override // com.xiaomi.ai.api.intent.IntentionEntity
    public T __1() {
        return this.entity_type;
    }

    public Optional<Slot<String>> getAttribute() {
        return this.attribute;
    }

    public Optional<Slot<String>> getAttributeType() {
        return this.attribute_type;
    }

    public Optional<Slot<Miai.Datetime>> getDatetime() {
        return this.datetime;
    }

    public Optional<Slot<String>> getDriverRange() {
        return this.driver_range;
    }

    public Optional<Slot<Miai.Duration>> getDuration() {
        return this.duration;
    }

    @Required
    public T getEntityType() {
        return this.entity_type;
    }

    public Optional<Slot<String>> getExecutionDevice() {
        return this.execution_device;
    }

    public Optional<Slot<String>> getExecutionDeviceCustomName() {
        return this.execution_device_custom_name;
    }

    public Optional<Slot<String>> getPosition() {
        return this.position;
    }

    public Optional<Slot<String>> getRelativePosition() {
        return this.relative_position;
    }

    public Optional<Slot<String>> getSelect() {
        return this.select;
    }

    public Optional<Slot<String>> getVehicleDevice() {
        return this.vehicle_device;
    }

    public VehicleModule setAttribute(Slot<String> slot) {
        this.attribute = Optional.e(slot);
        return this;
    }

    public VehicleModule setAttributeType(Slot<String> slot) {
        this.attribute_type = Optional.e(slot);
        return this;
    }

    public VehicleModule setDatetime(Slot<Miai.Datetime> slot) {
        this.datetime = Optional.e(slot);
        return this;
    }

    public VehicleModule setDriverRange(Slot<String> slot) {
        this.driver_range = Optional.e(slot);
        return this;
    }

    public VehicleModule setDuration(Slot<Miai.Duration> slot) {
        this.duration = Optional.e(slot);
        return this;
    }

    @Required
    public VehicleModule setEntityType(T t) {
        this.entity_type = t;
        return this;
    }

    public VehicleModule setExecutionDevice(Slot<String> slot) {
        this.execution_device = Optional.e(slot);
        return this;
    }

    public VehicleModule setExecutionDeviceCustomName(Slot<String> slot) {
        this.execution_device_custom_name = Optional.e(slot);
        return this;
    }

    public VehicleModule setPosition(Slot<String> slot) {
        this.position = Optional.e(slot);
        return this;
    }

    public VehicleModule setRelativePosition(Slot<String> slot) {
        this.relative_position = Optional.e(slot);
        return this;
    }

    public VehicleModule setSelect(Slot<String> slot) {
        this.select = Optional.e(slot);
        return this;
    }

    public VehicleModule setVehicleDevice(Slot<String> slot) {
        this.vehicle_device = Optional.e(slot);
        return this;
    }

    public VehicleModule(T t) {
        this.entity_type = t;
    }
}
