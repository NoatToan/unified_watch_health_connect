package com.xiaomi.ai.api.intent.domain;

import com.xiaomi.ai.api.intent.DomainType;
import com.xiaomi.ai.api.intent.Slot;
import com.xiaomi.common.Optional;

/* JADX INFO: loaded from: classes7.dex */
public class IoTDevicePosition implements DomainType {
    private Optional<Slot<String>> home = Optional.a();
    private Optional<Slot<String>> room = Optional.a();
    private Optional<Slot<String>> area = Optional.a();

    public Optional<Slot<String>> getArea() {
        return this.area;
    }

    public Optional<Slot<String>> getHome() {
        return this.home;
    }

    public Optional<Slot<String>> getRoom() {
        return this.room;
    }

    public IoTDevicePosition setArea(Slot<String> slot) {
        this.area = Optional.e(slot);
        return this;
    }

    public IoTDevicePosition setHome(Slot<String> slot) {
        this.home = Optional.e(slot);
        return this;
    }

    public IoTDevicePosition setRoom(Slot<String> slot) {
        this.room = Optional.e(slot);
        return this;
    }
}
