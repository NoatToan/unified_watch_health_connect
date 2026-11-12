package com.xiaomi.ai.api.intent.domain;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.xiaomi.ai.api.common.Required;
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
public class Fitness<T extends EntityType> extends IntentionEntity<T, general> {

    @Required
    private Slot<FitnessMode> mode;
    private Optional<Slot<ReminderType>> reminder_type = Optional.a();
    private Optional<Slot<Double>> goal = Optional.a();
    private Optional<Slot<UnitType>> unit = Optional.a();

    public enum FitnessMode {
        RUNNING_INDOOR(0, "RUNNING_INDOOR"),
        RUNNING_OUTDOOR(1, "RUNNING_OUTDOOR"),
        WAKING_OUTDOOR(2, "WAKING_OUTDOOR"),
        SWIMMING_INDOOR(3, "SWIMMING_INDOOR"),
        SWIMMING_OUTDOOR(4, "SWIMMING_OUTDOOR"),
        BIKING_INDOOR(5, "BIKING_INDOOR"),
        BIKING_OUTDOOR(6, "BIKING_OUTDOOR"),
        CROSS_COUNTRY(7, "CROSS_COUNTRY"),
        ACTIVITY(8, "ACTIVITY"),
        ELLIPTICAL_TRAINER(9, "ELLIPTICAL_TRAINER"),
        SKIING(10, "SKIING"),
        TENNIS(11, "TENNIS"),
        FOOTBALL(12, "FOOTBALL"),
        JUMPING(13, "JUMPING"),
        CLIMBING(14, "CLIMBING"),
        BREATH_EXERCISE(15, "BREATH_EXERCISE"),
        ZUMBA(16, "ZUMBA"),
        FREE_BOXING(17, "FREE_BOXING"),
        DIRT_SKI(18, "DIRT_SKI"),
        BADMINTON(19, "BADMINTON"),
        YOGA(20, "YOGA"),
        BICYCLE_MOTOCROSS(21, "BICYCLE_MOTOCROSS"),
        DANCE(22, "DANCE"),
        KONGFU(23, "KONGFU"),
        GYMNASTICS(24, "GYMNASTICS"),
        THAI_BOXING(25, "THAI_BOXING"),
        TAI_CHI(26, "TAI_CHI"),
        TEAKWONDO(27, "TEAKWONDO"),
        STEP_TRAINING(28, "STEP_TRAINING"),
        STEPPER(29, "STEPPER"),
        SKIING_DOUBLE(30, "SKIING_DOUBLE"),
        WRESTLING(31, "WRESTLING"),
        HANDBALL(32, "HANDBALL"),
        INDOOR_FITNESS(33, "INDOOR_FITNESS"),
        INDOOR_SKATING(34, "INDOOR_SKATING"),
        ARCHERY(35, "ARCHERY"),
        MOUNTAIN_RIDE(36, "MOUNTAIN_RIDE"),
        SOFT_TRAINING(37, "SOFT_TRAINING"),
        JUDO(38, "JUDO"),
        BOXING(39, "BOXING"),
        PILATES(40, "PILATES"),
        TABLE_TENNIS(41, "TABLE_TENNIS"),
        TREADMILL(42, "TREADMILL"),
        CLIMBING_ROCK(43, "CLIMBING_ROCK"),
        VOLLEYBAL(44, "VOLLEYBAL"),
        CLIMBE(45, "CLIMBE"),
        GATEBALL(46, "GATEBALL"),
        HORSEMANSHIP(47, "HORSEMANSHIP"),
        ROLLER_SKATING(48, "ROLLER_SKATING"),
        WEIGHT_TRAINING(49, "WEIGHT_TRAINING"),
        SOFTBALL(50, "SOFTBALL"),
        BASKETBALL(51, "BASKETBALL"),
        STRETCHING(52, "STRETCHING"),
        KARATE(53, "KARATE"),
        HIPHOP(54, "HIPHOP"),
        SOCIAL_DANCING(55, "SOCIAL_DANCING"),
        SURFING(56, "SURFING"),
        FENCING(57, "FENCING"),
        MIXED_AEROBIC(58, "MIXED_AEROBIC"),
        ROWING_MACHINE(59, "ROWING_MACHINE"),
        OUTDOOR_SKATING(60, "OUTDOOR_SKATING"),
        CORE_TRAINING(61, "CORE_TRAINING"),
        SQUARE_DANCING(62, "SQUARE_DANCING"),
        MOUNTAIN_SKI(63, "MOUNTAIN_SKI"),
        HIIT(64, "HIIT"),
        YACHTING(65, "YACHTING"),
        BELLY_DANCE(66, "BELLY_DANCE"),
        FISHING(67, "FISHING"),
        SNOWBOARD_SKI(68, "SNOWBOARD_SKI"),
        HUNT(69, "HUNT"),
        CURLING(70, "CURLING"),
        SQUASH_RACKETS(71, "SQUASH_RACKETS"),
        BOWLING(72, "BOWLING"),
        BASEBALL(73, "BASEBALL"),
        CRICKET(74, "CRICKET"),
        BALLET(75, "BALLET"),
        Unknown(76, "Unknown");

        private int id;
        private String name;

        FitnessMode(int i, String str) {
            this.id = i;
            this.name = str;
        }

        public static FitnessMode find(String str) {
            for (FitnessMode fitnessMode : values()) {
                if (fitnessMode.name.equals(str)) {
                    return fitnessMode;
                }
            }
            if (values().length > 0) {
                return values()[0];
            }
            return null;
        }

        public static FitnessMode read(String str) {
            return find(str);
        }

        public static String write(FitnessMode fitnessMode) {
            return fitnessMode.getName();
        }

        public int getId() {
            return this.id;
        }

        public String getName() {
            return this.name;
        }
    }

    public enum ReminderType {
        CounterDown(1, "CounterDown"),
        Speed(2, "Speed");

        private int id;
        private String name;

        ReminderType(int i, String str) {
            this.id = i;
            this.name = str;
        }

        public static ReminderType find(String str) {
            for (ReminderType reminderType : values()) {
                if (reminderType.name.equals(str)) {
                    return reminderType;
                }
            }
            if (values().length > 0) {
                return values()[0];
            }
            return null;
        }

        public static ReminderType read(String str) {
            return find(str);
        }

        public static String write(ReminderType reminderType) {
            return reminderType.getName();
        }

        public int getId() {
            return this.id;
        }

        public String getName() {
            return this.name;
        }
    }

    public enum UnitType {
        METER(0, "METER"),
        KILOMETER(1, "KILOMETER"),
        HOUR(2, "HOUR"),
        MINUTE(3, "MINUTE"),
        SECOND(4, "SECOND"),
        KILOJOULE(5, "KILOJOULE"),
        KILOCALORIES(6, "KILOCALORIES"),
        FREQUENCY(7, "FREQUENCY"),
        PERCENT(8, "PERCENT"),
        CALORIES(9, "CALORIES"),
        QUATER(10, "QUATER");

        private int id;
        private String name;

        UnitType(int i, String str) {
            this.id = i;
            this.name = str;
        }

        public static UnitType find(String str) {
            for (UnitType unitType : values()) {
                if (unitType.name.equals(str)) {
                    return unitType;
                }
            }
            if (values().length > 0) {
                return values()[0];
            }
            return null;
        }

        public static UnitType read(String str) {
            return find(str);
        }

        public static String write(UnitType unitType) {
            return unitType.getName();
        }

        public int getId() {
            return this.id;
        }

        public String getName() {
            return this.name;
        }
    }

    public Fitness() {
    }

    public static Fitness read(zsd zsdVar, Optional<String> optional) throws IllegalAccessException, NoSuchMethodException, JsonProcessingException, InvocationTargetException {
        Fitness fitness = new Fitness();
        fitness.setMode(IntentUtils.readSlot(zsdVar.w("mode"), FitnessMode.class));
        if (zsdVar.z("reminder_type")) {
            fitness.setReminderType(IntentUtils.readSlot(zsdVar.w("reminder_type"), ReminderType.class));
        }
        if (zsdVar.z(FitnessPersistKey.Rainbow)) {
            fitness.setGoal(IntentUtils.readSlot(zsdVar.w(FitnessPersistKey.Rainbow), Double.class));
        }
        if (zsdVar.z("unit")) {
            fitness.setUnit(IntentUtils.readSlot(zsdVar.w("unit"), UnitType.class));
        }
        return fitness;
    }

    public static zsd write(Fitness fitness) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        c4h c4hVarCreateObjectNode = IntentUtils.objectMapper.createObjectNode();
        c4hVarCreateObjectNode.f0("mode", IntentUtils.writeSlot(fitness.mode));
        if (fitness.reminder_type.c()) {
            c4hVarCreateObjectNode.f0("reminder_type", IntentUtils.writeSlot(fitness.reminder_type.b()));
        }
        if (fitness.goal.c()) {
            c4hVarCreateObjectNode.f0(FitnessPersistKey.Rainbow, IntentUtils.writeSlot(fitness.goal.b()));
        }
        if (fitness.unit.c()) {
            c4hVarCreateObjectNode.f0("unit", IntentUtils.writeSlot(fitness.unit.b()));
        }
        return c4hVarCreateObjectNode;
    }

    @Override // com.xiaomi.ai.api.intent.IntentionEntity
    public T __1() {
        return new general();
    }

    public Optional<Slot<Double>> getGoal() {
        return this.goal;
    }

    @Required
    public Slot<FitnessMode> getMode() {
        return this.mode;
    }

    public Optional<Slot<ReminderType>> getReminderType() {
        return this.reminder_type;
    }

    public Optional<Slot<UnitType>> getUnit() {
        return this.unit;
    }

    public Fitness setGoal(Slot<Double> slot) {
        this.goal = Optional.e(slot);
        return this;
    }

    @Required
    public Fitness setMode(Slot<FitnessMode> slot) {
        this.mode = slot;
        return this;
    }

    public Fitness setReminderType(Slot<ReminderType> slot) {
        this.reminder_type = Optional.e(slot);
        return this;
    }

    public Fitness setUnit(Slot<UnitType> slot) {
        this.unit = Optional.e(slot);
        return this;
    }

    public Fitness(Slot<FitnessMode> slot) {
        this.mode = slot;
    }
}
