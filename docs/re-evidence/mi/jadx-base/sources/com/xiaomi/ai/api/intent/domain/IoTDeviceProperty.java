package com.xiaomi.ai.api.intent.domain;

import com.xiaomi.ai.api.intent.DomainType;
import com.xiaomi.ai.api.intent.Slot;
import com.xiaomi.common.Optional;

/* JADX INFO: loaded from: classes7.dex */
public class IoTDeviceProperty implements DomainType {
    private Optional<Slot<String>> name = Optional.a();
    private Optional<Slot<IoTDevicePropertyService>> service = Optional.a();
    private Optional<Slot<String>> value = Optional.a();
    private Optional<Slot<String>> value_type = Optional.a();
    private Optional<Slot<String>> value_unit = Optional.a();

    public Optional<Slot<String>> getName() {
        return this.name;
    }

    public Optional<Slot<IoTDevicePropertyService>> getService() {
        return this.service;
    }

    public Optional<Slot<String>> getValue() {
        return this.value;
    }

    public Optional<Slot<String>> getValueType() {
        return this.value_type;
    }

    public Optional<Slot<String>> getValueUnit() {
        return this.value_unit;
    }

    public IoTDeviceProperty setName(Slot<String> slot) {
        this.name = Optional.e(slot);
        return this;
    }

    public IoTDeviceProperty setService(Slot<IoTDevicePropertyService> slot) {
        this.service = Optional.e(slot);
        return this;
    }

    public IoTDeviceProperty setValue(Slot<String> slot) {
        this.value = Optional.e(slot);
        return this;
    }

    public IoTDeviceProperty setValueType(Slot<String> slot) {
        this.value_type = Optional.e(slot);
        return this;
    }

    public IoTDeviceProperty setValueUnit(Slot<String> slot) {
        this.value_unit = Optional.e(slot);
        return this;
    }
}
