package com.xiaomi.fitness.common.unit;

import defpackage.zlq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public class WeightUnit {
    static final float C0 = 1.0f;
    static final float C1 = 1000.0f;
    static final float C2 = 1000000.0f;
    static final float C3 = 50.0f;
    static final float C4 = 500.0f;
    static final float C5 = 453.59238f;
    public static final WeightUnit GRAM = new a("GRAM", 0);
    public static final WeightUnit KILOGRAM = new b("KILOGRAM", 1);
    public static final WeightUnit TON = new c("TON", 2);
    public static final WeightUnit LIANG = new d("LIANG", 3);
    public static final WeightUnit JIN = new e("JIN", 4);
    public static final WeightUnit POUND = new f("POUND", 5);
    private static final /* synthetic */ WeightUnit[] $VALUES = $values();

    public final enum a extends WeightUnit {
        @Override // com.xiaomi.fitness.common.unit.WeightUnit
        public float convert(float f, WeightUnit weightUnit) {
            return weightUnit.toGram(f);
        }

        @Override // com.xiaomi.fitness.common.unit.WeightUnit
        public float toGram(float f) {
            return f;
        }

        @Override // com.xiaomi.fitness.common.unit.WeightUnit
        public float toJin(float f) {
            return f / WeightUnit.C4;
        }

        @Override // com.xiaomi.fitness.common.unit.WeightUnit
        public float toKilogram(float f) {
            return f / 1000.0f;
        }

        @Override // com.xiaomi.fitness.common.unit.WeightUnit
        public float toLiang(float f) {
            return f / 50.0f;
        }

        @Override // com.xiaomi.fitness.common.unit.WeightUnit
        public float toPound(float f) {
            return f / WeightUnit.C5;
        }

        @Override // com.xiaomi.fitness.common.unit.WeightUnit
        public float toTon(float f) {
            return f / WeightUnit.C2;
        }

        public a(String str, int i) {
            super(str, i);
        }
    }

    public final enum b extends WeightUnit {
        @Override // com.xiaomi.fitness.common.unit.WeightUnit
        public float convert(float f, WeightUnit weightUnit) {
            return weightUnit.toKilogram(f);
        }

        @Override // com.xiaomi.fitness.common.unit.WeightUnit
        public float toGram(float f) {
            return zlq.a(f, 1000.0f);
        }

        @Override // com.xiaomi.fitness.common.unit.WeightUnit
        public float toJin(float f) {
            return f / 0.5f;
        }

        @Override // com.xiaomi.fitness.common.unit.WeightUnit
        public float toKilogram(float f) {
            return f;
        }

        @Override // com.xiaomi.fitness.common.unit.WeightUnit
        public float toLiang(float f) {
            return zlq.a(f, 20.0f);
        }

        @Override // com.xiaomi.fitness.common.unit.WeightUnit
        public float toPound(float f) {
            return zlq.a(f, 2.2046225f);
        }

        @Override // com.xiaomi.fitness.common.unit.WeightUnit
        public float toTon(float f) {
            return f / 1000.0f;
        }

        public b(String str, int i) {
            super(str, i);
        }
    }

    public final enum c extends WeightUnit {
        @Override // com.xiaomi.fitness.common.unit.WeightUnit
        public float convert(float f, WeightUnit weightUnit) {
            return weightUnit.toTon(f);
        }

        @Override // com.xiaomi.fitness.common.unit.WeightUnit
        public float toGram(float f) {
            return zlq.a(f, WeightUnit.C2);
        }

        @Override // com.xiaomi.fitness.common.unit.WeightUnit
        public float toJin(float f) {
            return f / 5.0E-4f;
        }

        @Override // com.xiaomi.fitness.common.unit.WeightUnit
        public float toKilogram(float f) {
            return zlq.a(f, 1000.0f);
        }

        @Override // com.xiaomi.fitness.common.unit.WeightUnit
        public float toLiang(float f) {
            return f / 5.0E-5f;
        }

        @Override // com.xiaomi.fitness.common.unit.WeightUnit
        public float toPound(float f) {
            return f / 4.5359237E-4f;
        }

        @Override // com.xiaomi.fitness.common.unit.WeightUnit
        public float toTon(float f) {
            return f;
        }

        public c(String str, int i) {
            super(str, i);
        }
    }

    public final enum d extends WeightUnit {
        @Override // com.xiaomi.fitness.common.unit.WeightUnit
        public float convert(float f, WeightUnit weightUnit) {
            return weightUnit.toLiang(f);
        }

        @Override // com.xiaomi.fitness.common.unit.WeightUnit
        public float toGram(float f) {
            return zlq.a(f, 50.0f);
        }

        @Override // com.xiaomi.fitness.common.unit.WeightUnit
        public float toJin(float f) {
            return f / 10.0f;
        }

        @Override // com.xiaomi.fitness.common.unit.WeightUnit
        public float toKilogram(float f) {
            return f / 20.0f;
        }

        @Override // com.xiaomi.fitness.common.unit.WeightUnit
        public float toLiang(float f) {
            return f;
        }

        @Override // com.xiaomi.fitness.common.unit.WeightUnit
        public float toPound(float f) {
            return f / 9.071848f;
        }

        @Override // com.xiaomi.fitness.common.unit.WeightUnit
        public float toTon(float f) {
            return f / 20000.0f;
        }

        public d(String str, int i) {
            super(str, i);
        }
    }

    public final enum e extends WeightUnit {
        @Override // com.xiaomi.fitness.common.unit.WeightUnit
        public float convert(float f, WeightUnit weightUnit) {
            return weightUnit.toJin(f);
        }

        @Override // com.xiaomi.fitness.common.unit.WeightUnit
        public float toGram(float f) {
            return zlq.a(f, WeightUnit.C4);
        }

        @Override // com.xiaomi.fitness.common.unit.WeightUnit
        public float toJin(float f) {
            return f;
        }

        @Override // com.xiaomi.fitness.common.unit.WeightUnit
        public float toKilogram(float f) {
            return f / 2.0f;
        }

        @Override // com.xiaomi.fitness.common.unit.WeightUnit
        public float toLiang(float f) {
            return zlq.a(f, 10.0f);
        }

        @Override // com.xiaomi.fitness.common.unit.WeightUnit
        public float toPound(float f) {
            return zlq.a(f, 1.1023113f);
        }

        @Override // com.xiaomi.fitness.common.unit.WeightUnit
        public float toTon(float f) {
            return f / 2000.0f;
        }

        public e(String str, int i) {
            super(str, i);
        }
    }

    public final enum f extends WeightUnit {
        @Override // com.xiaomi.fitness.common.unit.WeightUnit
        public float convert(float f, WeightUnit weightUnit) {
            return weightUnit.toPound(f);
        }

        @Override // com.xiaomi.fitness.common.unit.WeightUnit
        public float toGram(float f) {
            return zlq.a(f, WeightUnit.C5);
        }

        @Override // com.xiaomi.fitness.common.unit.WeightUnit
        public float toJin(float f) {
            return zlq.a(f, 0.9071848f);
        }

        @Override // com.xiaomi.fitness.common.unit.WeightUnit
        public float toKilogram(float f) {
            return f / 2.2046225f;
        }

        @Override // com.xiaomi.fitness.common.unit.WeightUnit
        public float toLiang(float f) {
            return zlq.a(f, 9.071848f);
        }

        @Override // com.xiaomi.fitness.common.unit.WeightUnit
        public float toPound(float f) {
            return f;
        }

        @Override // com.xiaomi.fitness.common.unit.WeightUnit
        public float toTon(float f) {
            return f / 2204.6226f;
        }

        public f(String str, int i) {
            super(str, i);
        }
    }

    private static /* synthetic */ WeightUnit[] $values() {
        return new WeightUnit[]{GRAM, KILOGRAM, TON, LIANG, JIN, POUND};
    }

    public static WeightUnit valueOf(String str) {
        return (WeightUnit) Enum.valueOf(WeightUnit.class, str);
    }

    public static WeightUnit[] values() {
        return (WeightUnit[]) $VALUES.clone();
    }

    public float convert(float f2, WeightUnit weightUnit) {
        throw new AbstractMethodError();
    }

    public float toGram(float f2) {
        throw new AbstractMethodError();
    }

    public float toJin(float f2) {
        throw new AbstractMethodError();
    }

    public float toKilogram(float f2) {
        throw new AbstractMethodError();
    }

    public float toLiang(float f2) {
        throw new AbstractMethodError();
    }

    public float toPound(float f2) {
        throw new AbstractMethodError();
    }

    public float toTon(float f2) {
        throw new AbstractMethodError();
    }

    private WeightUnit(String str, int i) {
        super(str, i);
    }
}
