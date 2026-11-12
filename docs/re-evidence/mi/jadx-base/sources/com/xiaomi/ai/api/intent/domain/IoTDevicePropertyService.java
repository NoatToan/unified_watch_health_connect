package com.xiaomi.ai.api.intent.domain;

import com.xiaomi.ai.api.intent.DomainType;
import com.xiaomi.ai.api.intent.Slot;
import com.xiaomi.common.Optional;

/* JADX INFO: loaded from: classes7.dex */
public class IoTDevicePropertyService implements DomainType {
    private Optional<Slot<String>> name = Optional.a();
    private Optional<Slot<String>> category = Optional.a();
    private Optional<Slot<String>> sub_module = Optional.a();

    public Optional<Slot<String>> getCategory() {
        return this.category;
    }

    public Optional<Slot<String>> getName() {
        return this.name;
    }

    public Optional<Slot<String>> getSubModule() {
        return this.sub_module;
    }

    public IoTDevicePropertyService setCategory(Slot<String> slot) {
        this.category = Optional.e(slot);
        return this;
    }

    public IoTDevicePropertyService setName(Slot<String> slot) {
        this.name = Optional.e(slot);
        return this;
    }

    public IoTDevicePropertyService setSubModule(Slot<String> slot) {
        this.sub_module = Optional.e(slot);
        return this;
    }
}
