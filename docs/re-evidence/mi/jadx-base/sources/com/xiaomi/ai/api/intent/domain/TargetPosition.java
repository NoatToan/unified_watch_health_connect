package com.xiaomi.ai.api.intent.domain;

import com.xiaomi.ai.api.intent.DomainType;
import com.xiaomi.ai.api.intent.Slot;
import com.xiaomi.common.Optional;

/* JADX INFO: loaded from: classes7.dex */
public class TargetPosition implements DomainType {
    private Optional<Slot<String>> room = Optional.a();
    private Optional<Slot<String>> furniture = Optional.a();
    private Optional<Slot<SweepType>> type = Optional.a();
    private Optional<Slot<SweepDirection>> direction = Optional.a();

    public Optional<Slot<SweepDirection>> getDirection() {
        return this.direction;
    }

    public Optional<Slot<String>> getFurniture() {
        return this.furniture;
    }

    public Optional<Slot<String>> getRoom() {
        return this.room;
    }

    public Optional<Slot<SweepType>> getType() {
        return this.type;
    }

    public TargetPosition setDirection(Slot<SweepDirection> slot) {
        this.direction = Optional.e(slot);
        return this;
    }

    public TargetPosition setFurniture(Slot<String> slot) {
        this.furniture = Optional.e(slot);
        return this;
    }

    public TargetPosition setRoom(Slot<String> slot) {
        this.room = Optional.e(slot);
        return this;
    }

    public TargetPosition setType(Slot<SweepType> slot) {
        this.type = Optional.e(slot);
        return this;
    }
}
