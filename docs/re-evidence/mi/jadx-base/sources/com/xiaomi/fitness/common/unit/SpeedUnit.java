package com.xiaomi.fitness.common.unit;

import defpackage.zlq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public class SpeedUnit {
    static final float C0 = 1.0f;
    static final float C1 = 3.6f;
    public static final SpeedUnit KM_PER_HOUR = new a("KM_PER_HOUR", 0);
    public static final SpeedUnit METER_PER_SECOND = new b("METER_PER_SECOND", 1);
    private static final /* synthetic */ SpeedUnit[] $VALUES = $values();

    public final enum a extends SpeedUnit {
        @Override // com.xiaomi.fitness.common.unit.SpeedUnit
        public float convert(float f, SpeedUnit speedUnit) {
            return speedUnit.toKMPerHour(f);
        }

        @Override // com.xiaomi.fitness.common.unit.SpeedUnit
        public float toKMPerHour(float f) {
            return f;
        }

        @Override // com.xiaomi.fitness.common.unit.SpeedUnit
        public float toMeterPerSecond(float f) {
            return f / SpeedUnit.C1;
        }

        public a(String str, int i) {
            super(str, i);
        }
    }

    public final enum b extends SpeedUnit {
        @Override // com.xiaomi.fitness.common.unit.SpeedUnit
        public float convert(float f, SpeedUnit speedUnit) {
            return speedUnit.toMeterPerSecond(f);
        }

        @Override // com.xiaomi.fitness.common.unit.SpeedUnit
        public float toKMPerHour(float f) {
            return zlq.a(f, SpeedUnit.C1);
        }

        @Override // com.xiaomi.fitness.common.unit.SpeedUnit
        public float toMeterPerSecond(float f) {
            return f;
        }

        public b(String str, int i) {
            super(str, i);
        }
    }

    private static /* synthetic */ SpeedUnit[] $values() {
        return new SpeedUnit[]{KM_PER_HOUR, METER_PER_SECOND};
    }

    public static SpeedUnit valueOf(String str) {
        return (SpeedUnit) Enum.valueOf(SpeedUnit.class, str);
    }

    public static SpeedUnit[] values() {
        return (SpeedUnit[]) $VALUES.clone();
    }

    public float convert(float f, SpeedUnit speedUnit) {
        throw new AbstractMethodError();
    }

    public float toKMPerHour(float f) {
        throw new AbstractMethodError();
    }

    public float toMeterPerSecond(float f) {
        throw new AbstractMethodError();
    }

    private SpeedUnit(String str, int i) {
        super(str, i);
    }
}
