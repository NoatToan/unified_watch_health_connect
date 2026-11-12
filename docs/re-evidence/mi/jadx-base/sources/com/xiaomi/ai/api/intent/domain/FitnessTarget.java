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
import com.xiaomi.fit.fitness.export.data.FitnessPersistKey;
import defpackage.c4h;
import defpackage.zsd;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes7.dex */
public class FitnessTarget<T extends EntityType> extends IntentionEntity<T, general> {

    @Required
    private T entity_type;

    @Required
    private Slot<Fitness.FitnessMode> mode;
    private Optional<Slot<Double>> goal = Optional.a();
    private Optional<Slot<Fitness.UnitType>> unit = Optional.a();

    public FitnessTarget() {
    }

    public static FitnessTarget read(zsd zsdVar, Optional<String> optional) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
        FitnessTarget fitnessTarget = new FitnessTarget(IntentUtils.readEntityType(zsdVar, AIApiConstants.FitnessTarget.NAME, optional));
        fitnessTarget.setMode(IntentUtils.readSlot(zsdVar.w("mode"), Fitness.FitnessMode.class));
        if (zsdVar.z(FitnessPersistKey.Rainbow)) {
            fitnessTarget.setGoal(IntentUtils.readSlot(zsdVar.w(FitnessPersistKey.Rainbow), Double.class));
        }
        if (zsdVar.z("unit")) {
            fitnessTarget.setUnit(IntentUtils.readSlot(zsdVar.w("unit"), Fitness.UnitType.class));
        }
        return fitnessTarget;
    }

    public static zsd write(FitnessTarget fitnessTarget) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        c4h c4hVar = (c4h) IntentUtils.writeEntityType(fitnessTarget.entity_type);
        c4hVar.f0("mode", IntentUtils.writeSlot(fitnessTarget.mode));
        if (fitnessTarget.goal.c()) {
            c4hVar.f0(FitnessPersistKey.Rainbow, IntentUtils.writeSlot(fitnessTarget.goal.b()));
        }
        if (fitnessTarget.unit.c()) {
            c4hVar.f0("unit", IntentUtils.writeSlot(fitnessTarget.unit.b()));
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

    public Optional<Slot<Double>> getGoal() {
        return this.goal;
    }

    @Required
    public Slot<Fitness.FitnessMode> getMode() {
        return this.mode;
    }

    public Optional<Slot<Fitness.UnitType>> getUnit() {
        return this.unit;
    }

    @Required
    public FitnessTarget setEntityType(T t) {
        this.entity_type = t;
        return this;
    }

    public FitnessTarget setGoal(Slot<Double> slot) {
        this.goal = Optional.e(slot);
        return this;
    }

    @Required
    public FitnessTarget setMode(Slot<Fitness.FitnessMode> slot) {
        this.mode = slot;
        return this;
    }

    public FitnessTarget setUnit(Slot<Fitness.UnitType> slot) {
        this.unit = Optional.e(slot);
        return this;
    }

    public FitnessTarget(T t) {
        this.entity_type = t;
    }

    public FitnessTarget(T t, Slot<Fitness.FitnessMode> slot) {
        this.entity_type = t;
        this.mode = slot;
    }
}
