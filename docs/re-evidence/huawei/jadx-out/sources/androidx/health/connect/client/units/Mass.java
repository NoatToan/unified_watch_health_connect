package androidx.health.connect.client.units;

import com.huawei.phoneservice.faq.base.constants.FaqConstants;
import com.huawei.watchface.utils.constants.WatchFaceConstant;
import defpackage.enumEntries;
import defpackage.zae;
import defpackage.zcm;
import defpackage.zcp;
import defpackage.zdm;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.jvm.JvmStatic;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 !2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0002!\"B\u0019\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0002J\r\u0010\u0016\u001a\u00020\u0000H\u0000¢\u0006\u0002\b\u0017J\u0011\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0000H\u0096\u0002J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001a\u001a\u0004\u0018\u00010\u001dH\u0096\u0002J\b\u0010\u001e\u001a\u00020\u0019H\u0016J\b\u0010\u001f\u001a\u00020 H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\u00038G¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0011\u0010\u000b\u001a\u00020\u00038G¢\u0006\u0006\u001a\u0004\b\f\u0010\nR\u0011\u0010\r\u001a\u00020\u00038G¢\u0006\u0006\u001a\u0004\b\u000e\u0010\nR\u0011\u0010\u000f\u001a\u00020\u00038G¢\u0006\u0006\u001a\u0004\b\u0010\u0010\nR\u0011\u0010\u0011\u001a\u00020\u00038G¢\u0006\u0006\u001a\u0004\b\u0012\u0010\nR\u0011\u0010\u0013\u001a\u00020\u00038G¢\u0006\u0006\u001a\u0004\b\u0014\u0010\n¨\u0006#"}, d2 = {"Landroidx/health/connect/client/units/Mass;", "", "value", "", "type", "Landroidx/health/connect/client/units/Mass$Type;", "<init>", "(DLandroidx/health/connect/client/units/Mass$Type;)V", "inGrams", "getGrams", "()D", "inKilograms", "getKilograms", "inMilligrams", "getMilligrams", "inMicrograms", "getMicrograms", "inOunces", "getOunces", "inPounds", "getPounds", "get", "zero", "zero$connect_client_release", "compareTo", "", "other", "equals", "", "", WatchFaceConstant.HASHCODE, "toString", "", "Companion", FaqConstants.FAQ_UPLOAD_FLAG, "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class Mass implements Comparable<Mass> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final Map<Type, Mass> ZEROS;
    private final Type type;
    private final double value;

    private Mass(double d, Type type) {
        this.value = d;
        this.type = type;
    }

    public final double getGrams() {
        return this.value * this.type.getGramsPerUnit();
    }

    public final double getKilograms() {
        return get(Type.KILOGRAMS);
    }

    public final double getMilligrams() {
        return get(Type.MILLIGRAMS);
    }

    public final double getMicrograms() {
        return get(Type.MICROGRAMS);
    }

    public final double getOunces() {
        return get(Type.OUNCES);
    }

    public final double getPounds() {
        return get(Type.POUNDS);
    }

    private final double get(Type type) {
        return this.type == type ? this.value : getGrams() / type.getGramsPerUnit();
    }

    public final Mass zero$connect_client_release() {
        return (Mass) zae.d(ZEROS, this.type);
    }

    @Override // java.lang.Comparable
    public int compareTo(Mass other) {
        zcp.c(other, "");
        if (this.type == other.type) {
            return Double.compare(this.value, other.value);
        }
        return Double.compare(getGrams(), other.getGrams());
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Mass)) {
            return false;
        }
        Mass mass = (Mass) other;
        if (this.type == mass.type) {
            return this.value == mass.value;
        }
        return getGrams() == mass.getGrams();
    }

    public int hashCode() {
        return Double.hashCode(getGrams());
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.value);
        sb.append(' ');
        String lowerCase = this.type.name().toLowerCase(Locale.ROOT);
        zcp.b((Object) lowerCase, "");
        sb.append(lowerCase);
        return sb.toString();
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\nH\u0007J\u0010\u0010\u000b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\nH\u0007J\u0010\u0010\f\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\nH\u0007J\u0010\u0010\r\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\nH\u0007J\u0010\u0010\u000e\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\nH\u0007J\u0010\u0010\u000f\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\nH\u0007R\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Landroidx/health/connect/client/units/Mass$Companion;", "", "<init>", "()V", "ZEROS", "", "Landroidx/health/connect/client/units/Mass$Type;", "Landroidx/health/connect/client/units/Mass;", "grams", "value", "", "kilograms", "milligrams", "micrograms", "ounces", "pounds", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @JvmStatic
        public final Mass grams(double value) {
            return new Mass(value, Type.GRAMS, null);
        }

        @JvmStatic
        public final Mass kilograms(double value) {
            return new Mass(value, Type.KILOGRAMS, null);
        }

        @JvmStatic
        public final Mass milligrams(double value) {
            return new Mass(value, Type.MILLIGRAMS, null);
        }

        @JvmStatic
        public final Mass micrograms(double value) {
            return new Mass(value, Type.MICROGRAMS, null);
        }

        @JvmStatic
        public final Mass ounces(double value) {
            return new Mass(value, Type.OUNCES, null);
        }

        @JvmStatic
        public final Mass pounds(double value) {
            return new Mass(value, Type.POUNDS, null);
        }

        public /* synthetic */ Companion(zcm zcmVar) {
            this();
        }
    }

    static {
        Type[] typeArrValues = Type.values();
        LinkedHashMap linkedHashMap = new LinkedHashMap(zdm.c(zae.e(typeArrValues.length), 16));
        for (Type type : typeArrValues) {
            linkedHashMap.put(type, new Mass(0.0d, type));
        }
        ZEROS = linkedHashMap;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\n\u0002\u0010\u0006\n\u0002\b\u0003\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0012\u0010\n\u001a\u00020\u000bX¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rj\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\u000e"}, d2 = {"Landroidx/health/connect/client/units/Mass$Type;", "", "<init>", "(Ljava/lang/String;I)V", "GRAMS", "KILOGRAMS", "MILLIGRAMS", "MICROGRAMS", "OUNCES", "POUNDS", "gramsPerUnit", "", "getGramsPerUnit", "()D", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    static final abstract class Type {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Type[] $VALUES;
        public static final Type GRAMS = new GRAMS("GRAMS", 0);
        public static final Type KILOGRAMS = new KILOGRAMS("KILOGRAMS", 1);
        public static final Type MILLIGRAMS = new MILLIGRAMS("MILLIGRAMS", 2);
        public static final Type MICROGRAMS = new MICROGRAMS("MICROGRAMS", 3);
        public static final Type OUNCES = new OUNCES("OUNCES", 4);
        public static final Type POUNDS = new POUNDS("POUNDS", 5);

        public abstract double getGramsPerUnit();

        @Metadata(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"androidx/health/connect/client/units/Mass.Type.GRAMS", "Landroidx/health/connect/client/units/Mass$Type;", "gramsPerUnit", "", "getGramsPerUnit", "()D", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        static final class GRAMS extends Type {
            private final double gramsPerUnit;

            GRAMS(String str, int i) {
                super(str, i, null);
                this.gramsPerUnit = 1.0d;
            }

            @Override // androidx.health.connect.client.units.Mass.Type
            public double getGramsPerUnit() {
                return this.gramsPerUnit;
            }
        }

        private Type(String str, int i) {
            super(str, i);
        }

        static {
            Type[] typeArr$values = $values();
            $VALUES = typeArr$values;
            $ENTRIES = enumEntries.c(typeArr$values);
        }

        @Metadata(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"androidx/health/connect/client/units/Mass.Type.KILOGRAMS", "Landroidx/health/connect/client/units/Mass$Type;", "gramsPerUnit", "", "getGramsPerUnit", "()D", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        static final class KILOGRAMS extends Type {
            private final double gramsPerUnit;

            KILOGRAMS(String str, int i) {
                super(str, i, null);
                this.gramsPerUnit = 1000.0d;
            }

            @Override // androidx.health.connect.client.units.Mass.Type
            public double getGramsPerUnit() {
                return this.gramsPerUnit;
            }
        }

        @Metadata(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"androidx/health/connect/client/units/Mass.Type.MILLIGRAMS", "Landroidx/health/connect/client/units/Mass$Type;", "gramsPerUnit", "", "getGramsPerUnit", "()D", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        static final class MILLIGRAMS extends Type {
            private final double gramsPerUnit;

            MILLIGRAMS(String str, int i) {
                super(str, i, null);
                this.gramsPerUnit = 0.001d;
            }

            @Override // androidx.health.connect.client.units.Mass.Type
            public double getGramsPerUnit() {
                return this.gramsPerUnit;
            }
        }

        @Metadata(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"androidx/health/connect/client/units/Mass.Type.MICROGRAMS", "Landroidx/health/connect/client/units/Mass$Type;", "gramsPerUnit", "", "getGramsPerUnit", "()D", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        static final class MICROGRAMS extends Type {
            private final double gramsPerUnit;

            MICROGRAMS(String str, int i) {
                super(str, i, null);
                this.gramsPerUnit = 1.0E-6d;
            }

            @Override // androidx.health.connect.client.units.Mass.Type
            public double getGramsPerUnit() {
                return this.gramsPerUnit;
            }
        }

        @Metadata(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"androidx/health/connect/client/units/Mass.Type.OUNCES", "Landroidx/health/connect/client/units/Mass$Type;", "gramsPerUnit", "", "getGramsPerUnit", "()D", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        static final class OUNCES extends Type {
            private final double gramsPerUnit;

            OUNCES(String str, int i) {
                super(str, i, null);
                this.gramsPerUnit = 28.34952d;
            }

            @Override // androidx.health.connect.client.units.Mass.Type
            public double getGramsPerUnit() {
                return this.gramsPerUnit;
            }
        }

        @Metadata(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"androidx/health/connect/client/units/Mass.Type.POUNDS", "Landroidx/health/connect/client/units/Mass$Type;", "gramsPerUnit", "", "getGramsPerUnit", "()D", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        static final class POUNDS extends Type {
            private final double gramsPerUnit;

            POUNDS(String str, int i) {
                super(str, i, null);
                this.gramsPerUnit = 453.59237d;
            }

            @Override // androidx.health.connect.client.units.Mass.Type
            public double getGramsPerUnit() {
                return this.gramsPerUnit;
            }
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) $VALUES.clone();
        }

        public static EnumEntries<Type> getEntries() {
            return $ENTRIES;
        }

        public /* synthetic */ Type(String str, int i, zcm zcmVar) {
            this(str, i);
        }

        private static final /* synthetic */ Type[] $values() {
            return new Type[]{GRAMS, KILOGRAMS, MILLIGRAMS, MICROGRAMS, OUNCES, POUNDS};
        }
    }

    @JvmStatic
    public static final Mass pounds(double d) {
        return INSTANCE.pounds(d);
    }

    @JvmStatic
    public static final Mass ounces(double d) {
        return INSTANCE.ounces(d);
    }

    @JvmStatic
    public static final Mass milligrams(double d) {
        return INSTANCE.milligrams(d);
    }

    @JvmStatic
    public static final Mass micrograms(double d) {
        return INSTANCE.micrograms(d);
    }

    @JvmStatic
    public static final Mass kilograms(double d) {
        return INSTANCE.kilograms(d);
    }

    @JvmStatic
    public static final Mass grams(double d) {
        return INSTANCE.grams(d);
    }

    public /* synthetic */ Mass(double d, Type type, zcm zcmVar) {
        this(d, type);
    }
}
