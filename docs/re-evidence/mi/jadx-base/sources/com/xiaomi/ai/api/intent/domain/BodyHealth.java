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
public class BodyHealth<T extends EntityType> extends IntentionEntity<T, general> {

    @Required
    private Slot<HealthCategory> category;

    @Required
    private T entity_type;
    private Optional<Slot<Miai.Datetime>> datetime = Optional.a();
    private Optional<Slot<Fitness.FitnessMode>> mode = Optional.a();

    public enum HealthCategory {
        Unknown(0, "Unknown"),
        HeartRate(1, "HeartRate"),
        Energy(2, "Energy"),
        Pressure(3, "Pressure"),
        Sleep(4, "Sleep"),
        Standing(5, "Standing"),
        Steps(6, "Steps"),
        OxygenUptake(7, "OxygenUptake"),
        Calories(8, "Calories"),
        Oxygen(9, "Oxygen"),
        Distance(10, "Distance"),
        Time(11, "Time"),
        Freq(12, "Freq"),
        SleepTime(13, "SleepTime"),
        SleepScore(14, "SleepScore"),
        SleepGeneral(15, "SleepGeneral"),
        GasPressure(16, "GasPressure"),
        Height(17, "Height"),
        SportRecord(18, "SportRecord"),
        BloodOxygen(19, "BloodOxygen"),
        TrainingExercise(20, "TrainingExercise"),
        WomenHealth(21, "WomenHealth"),
        ActivityGoal(22, "ActivityGoal"),
        ActivityRecord(23, "ActivityRecord"),
        SportMode(24, "SportMode"),
        DeepSleepTime(25, "DeepSleepTime"),
        ShallowSleepTime(26, "ShallowSleepTime"),
        EyeMoveTime(27, "EyeMoveTime"),
        FallSleepTime(28, "FallSleepTime"),
        WakeTime(29, "WakeTime");

        private int id;
        private String name;

        HealthCategory(int i, String str) {
            this.id = i;
            this.name = str;
        }

        public static HealthCategory find(String str) {
            for (HealthCategory healthCategory : values()) {
                if (healthCategory.name.equals(str)) {
                    return healthCategory;
                }
            }
            if (values().length > 0) {
                return values()[0];
            }
            return null;
        }

        public static HealthCategory read(String str) {
            return find(str);
        }

        public static String write(HealthCategory healthCategory) {
            return healthCategory.getName();
        }

        public int getId() {
            return this.id;
        }

        public String getName() {
            return this.name;
        }
    }

    public static class left implements EntityType {
        public static left read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            return new left();
        }

        public static c4h write(left leftVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            return IntentUtils.objectMapper.createObjectNode();
        }
    }

    public static class sleep implements EntityType {
        private Optional<Slot<Boolean>> time = Optional.a();
        private Optional<Slot<Boolean>> score = Optional.a();

        public static sleep read(zsd zsdVar) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
            sleep sleepVar = new sleep();
            if (zsdVar.z("time")) {
                sleepVar.setTime(IntentUtils.readSlot(zsdVar.w("time"), Boolean.class));
            }
            if (zsdVar.z("score")) {
                sleepVar.setScore(IntentUtils.readSlot(zsdVar.w("score"), Boolean.class));
            }
            return sleepVar;
        }

        public static c4h write(sleep sleepVar) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
            c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
            if (sleepVar.time.c()) {
                c4hVarCreateObjectNode.f0("time", IntentUtils.writeSlot(sleepVar.time.b()));
            }
            if (sleepVar.score.c()) {
                c4hVarCreateObjectNode.f0("score", IntentUtils.writeSlot(sleepVar.score.b()));
            }
            return c4hVarCreateObjectNode;
        }

        public Optional<Slot<Boolean>> getScore() {
            return this.score;
        }

        public Optional<Slot<Boolean>> getTime() {
            return this.time;
        }

        public sleep setScore(Slot<Boolean> slot) {
            this.score = Optional.e(slot);
            return this;
        }

        public sleep setTime(Slot<Boolean> slot) {
            this.time = Optional.e(slot);
            return this;
        }
    }

    public BodyHealth() {
    }

    public static BodyHealth read(zsd zsdVar, Optional<String> optional) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
        BodyHealth bodyHealth = new BodyHealth(IntentUtils.readEntityType(zsdVar, AIApiConstants.BodyHealth.NAME, optional));
        bodyHealth.setCategory(IntentUtils.readSlot(zsdVar.w("category"), HealthCategory.class));
        if (zsdVar.z("datetime")) {
            bodyHealth.setDatetime(IntentUtils.readSlot(zsdVar.w("datetime"), Miai.Datetime.class));
        }
        if (zsdVar.z("mode")) {
            bodyHealth.setMode(IntentUtils.readSlot(zsdVar.w("mode"), Fitness.FitnessMode.class));
        }
        return bodyHealth;
    }

    public static zsd write(BodyHealth bodyHealth) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        c4h c4hVar = (c4h) IntentUtils.writeEntityType(bodyHealth.entity_type);
        c4hVar.f0("category", IntentUtils.writeSlot(bodyHealth.category));
        if (bodyHealth.datetime.c()) {
            c4hVar.f0("datetime", IntentUtils.writeSlot(bodyHealth.datetime.b()));
        }
        if (bodyHealth.mode.c()) {
            c4hVar.f0("mode", IntentUtils.writeSlot(bodyHealth.mode.b()));
        }
        return c4hVar;
    }

    @Override // com.xiaomi.ai.api.intent.IntentionEntity
    public T __1() {
        return this.entity_type;
    }

    @Required
    public Slot<HealthCategory> getCategory() {
        return this.category;
    }

    public Optional<Slot<Miai.Datetime>> getDatetime() {
        return this.datetime;
    }

    @Required
    public T getEntityType() {
        return this.entity_type;
    }

    public Optional<Slot<Fitness.FitnessMode>> getMode() {
        return this.mode;
    }

    @Required
    public BodyHealth setCategory(Slot<HealthCategory> slot) {
        this.category = slot;
        return this;
    }

    public BodyHealth setDatetime(Slot<Miai.Datetime> slot) {
        this.datetime = Optional.e(slot);
        return this;
    }

    @Required
    public BodyHealth setEntityType(T t) {
        this.entity_type = t;
        return this;
    }

    public BodyHealth setMode(Slot<Fitness.FitnessMode> slot) {
        this.mode = Optional.e(slot);
        return this;
    }

    public BodyHealth(T t) {
        this.entity_type = t;
    }

    public BodyHealth(T t, Slot<HealthCategory> slot) {
        this.entity_type = t;
        this.category = slot;
    }
}
