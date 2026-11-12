package com.xiaomi.fitness.common.unit;

import defpackage.zlq;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes6.dex */
public class EnergyUnit {
    static final float C0 = 1.0f;
    static final float C1 = 0.2389f;
    public static final EnergyUnit KCAL = new a("KCAL", 0);
    public static final EnergyUnit KJ = new b("KJ", 1);
    private static final /* synthetic */ EnergyUnit[] $VALUES = $values();

    public final enum a extends EnergyUnit {
        @Override // com.xiaomi.fitness.common.unit.EnergyUnit
        public float convert(float f, EnergyUnit energyUnit) {
            return energyUnit.toKJ(f);
        }

        @Override // com.xiaomi.fitness.common.unit.EnergyUnit
        public float toKJ(float f) {
            return zlq.a(f, 4.1858516f);
        }

        @Override // com.xiaomi.fitness.common.unit.EnergyUnit
        public float toKcal(float f) {
            return f;
        }

        public a(String str, int i) {
            super(str, i);
        }
    }

    public final enum b extends EnergyUnit {
        @Override // com.xiaomi.fitness.common.unit.EnergyUnit
        public float convert(float f, EnergyUnit energyUnit) {
            return energyUnit.toKJ(f);
        }

        @Override // com.xiaomi.fitness.common.unit.EnergyUnit
        public float toKJ(float f) {
            return f;
        }

        @Override // com.xiaomi.fitness.common.unit.EnergyUnit
        public float toKcal(float f) {
            return f / 4.1858516f;
        }

        public b(String str, int i) {
            super(str, i);
        }
    }

    private static /* synthetic */ EnergyUnit[] $values() {
        return new EnergyUnit[]{KCAL, KJ};
    }

    public static EnergyUnit valueOf(String str) {
        return (EnergyUnit) Enum.valueOf(EnergyUnit.class, str);
    }

    public static EnergyUnit[] values() {
        return (EnergyUnit[]) $VALUES.clone();
    }

    public float convert(float f, EnergyUnit energyUnit) {
        throw new AbstractMethodError();
    }

    public float toKJ(float f) {
        throw new AbstractMethodError();
    }

    public float toKcal(float f) {
        throw new AbstractMethodError();
    }

    private EnergyUnit(String str, int i) {
        super(str, i);
    }
}
