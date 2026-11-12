package com.xiaomi.fitness.common.unit;

import defpackage.zlq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public class LengthUnit {
    static final float C0 = 1.0f;
    static final float C1 = 100.0f;
    static final float C2 = 100000.0f;
    public static final LengthUnit CENTIMETER = new a("CENTIMETER", 0);
    public static final LengthUnit METER = new b("METER", 1);
    public static final LengthUnit KILOMETER = new c("KILOMETER", 2);
    private static final /* synthetic */ LengthUnit[] $VALUES = $values();

    public final enum a extends LengthUnit {
        @Override // com.xiaomi.fitness.common.unit.LengthUnit
        public float convert(float f, LengthUnit lengthUnit) {
            return lengthUnit.toCentimeter(f);
        }

        @Override // com.xiaomi.fitness.common.unit.LengthUnit
        public float toCentimeter(float f) {
            return f;
        }

        @Override // com.xiaomi.fitness.common.unit.LengthUnit
        public float toKilometer(float f) {
            return f / LengthUnit.C2;
        }

        @Override // com.xiaomi.fitness.common.unit.LengthUnit
        public float toMeter(float f) {
            return f / 100.0f;
        }

        public a(String str, int i) {
            super(str, i);
        }
    }

    public final enum b extends LengthUnit {
        @Override // com.xiaomi.fitness.common.unit.LengthUnit
        public float convert(float f, LengthUnit lengthUnit) {
            return lengthUnit.toMeter(f);
        }

        @Override // com.xiaomi.fitness.common.unit.LengthUnit
        public float toCentimeter(float f) {
            return zlq.a(f, 100.0f);
        }

        @Override // com.xiaomi.fitness.common.unit.LengthUnit
        public float toKilometer(float f) {
            return f / 1000.0f;
        }

        @Override // com.xiaomi.fitness.common.unit.LengthUnit
        public float toMeter(float f) {
            return f;
        }

        public b(String str, int i) {
            super(str, i);
        }
    }

    public final enum c extends LengthUnit {
        @Override // com.xiaomi.fitness.common.unit.LengthUnit
        public float convert(float f, LengthUnit lengthUnit) {
            return lengthUnit.toKilometer(f);
        }

        @Override // com.xiaomi.fitness.common.unit.LengthUnit
        public float toCentimeter(float f) {
            return zlq.a(f, LengthUnit.C2);
        }

        @Override // com.xiaomi.fitness.common.unit.LengthUnit
        public float toKilometer(float f) {
            return f;
        }

        @Override // com.xiaomi.fitness.common.unit.LengthUnit
        public float toMeter(float f) {
            return zlq.a(f, 1000.0f);
        }

        public c(String str, int i) {
            super(str, i);
        }
    }

    private static /* synthetic */ LengthUnit[] $values() {
        return new LengthUnit[]{CENTIMETER, METER, KILOMETER};
    }

    public static LengthUnit valueOf(String str) {
        return (LengthUnit) Enum.valueOf(LengthUnit.class, str);
    }

    public static LengthUnit[] values() {
        return (LengthUnit[]) $VALUES.clone();
    }

    public float convert(float f, LengthUnit lengthUnit) {
        throw new AbstractMethodError();
    }

    public float toCentimeter(float f) {
        throw new AbstractMethodError();
    }

    public float toKilometer(float f) {
        throw new AbstractMethodError();
    }

    public float toMeter(float f) {
        throw new AbstractMethodError();
    }

    private LengthUnit(String str, int i) {
        super(str, i);
    }
}
