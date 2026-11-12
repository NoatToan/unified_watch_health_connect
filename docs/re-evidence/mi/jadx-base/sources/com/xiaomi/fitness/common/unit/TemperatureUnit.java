package com.xiaomi.fitness.common.unit;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public class TemperatureUnit {
    public static final TemperatureUnit DEGREE_CENTIGRADE = new a("DEGREE_CENTIGRADE", 0);
    public static final TemperatureUnit FAHRENHEIT = new b("FAHRENHEIT", 1);
    private static final /* synthetic */ TemperatureUnit[] $VALUES = $values();

    public final enum a extends TemperatureUnit {
        @Override // com.xiaomi.fitness.common.unit.TemperatureUnit
        public float convert(float f, TemperatureUnit temperatureUnit) {
            return temperatureUnit.toDegreeCentigrade(f);
        }

        @Override // com.xiaomi.fitness.common.unit.TemperatureUnit
        public float toDegreeCentigrade(float f) {
            return f;
        }

        @Override // com.xiaomi.fitness.common.unit.TemperatureUnit
        public float toFahrenheit(float f) {
            return (f * 1.8f) + 32.0f;
        }

        public a(String str, int i) {
            super(str, i);
        }
    }

    public final enum b extends TemperatureUnit {
        @Override // com.xiaomi.fitness.common.unit.TemperatureUnit
        public float convert(float f, TemperatureUnit temperatureUnit) {
            return temperatureUnit.toFahrenheit(f);
        }

        @Override // com.xiaomi.fitness.common.unit.TemperatureUnit
        public float toDegreeCentigrade(float f) {
            return (f - 32.0f) / 1.8f;
        }

        @Override // com.xiaomi.fitness.common.unit.TemperatureUnit
        public float toFahrenheit(float f) {
            return f;
        }

        public b(String str, int i) {
            super(str, i);
        }
    }

    private static /* synthetic */ TemperatureUnit[] $values() {
        return new TemperatureUnit[]{DEGREE_CENTIGRADE, FAHRENHEIT};
    }

    public static TemperatureUnit valueOf(String str) {
        return (TemperatureUnit) Enum.valueOf(TemperatureUnit.class, str);
    }

    public static TemperatureUnit[] values() {
        return (TemperatureUnit[]) $VALUES.clone();
    }

    public float convert(float f, TemperatureUnit temperatureUnit) {
        throw new AbstractMethodError();
    }

    public float toDegreeCentigrade(float f) {
        throw new AbstractMethodError();
    }

    public float toFahrenheit(float f) {
        throw new AbstractMethodError();
    }

    private TemperatureUnit(String str, int i) {
        super(str, i);
    }
}
