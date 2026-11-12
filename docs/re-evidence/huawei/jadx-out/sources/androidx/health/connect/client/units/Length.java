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
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u001f2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0002\u001f B\u0019\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0002J\r\u0010\u0014\u001a\u00020\u0000H\u0000¢\u0006\u0002\b\u0015J\u0011\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0000H\u0096\u0002J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u0018\u001a\u0004\u0018\u00010\u001bH\u0096\u0002J\b\u0010\u001c\u001a\u00020\u0017H\u0016J\b\u0010\u001d\u001a\u00020\u001eH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\u00038G¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0011\u0010\u000b\u001a\u00020\u00038G¢\u0006\u0006\u001a\u0004\b\f\u0010\nR\u0011\u0010\r\u001a\u00020\u00038G¢\u0006\u0006\u001a\u0004\b\u000e\u0010\nR\u0011\u0010\u000f\u001a\u00020\u00038G¢\u0006\u0006\u001a\u0004\b\u0010\u0010\nR\u0011\u0010\u0011\u001a\u00020\u00038G¢\u0006\u0006\u001a\u0004\b\u0012\u0010\n¨\u0006!"}, d2 = {"Landroidx/health/connect/client/units/Length;", "", "value", "", "type", "Landroidx/health/connect/client/units/Length$Type;", "<init>", "(DLandroidx/health/connect/client/units/Length$Type;)V", "inMeters", "getMeters", "()D", "inKilometers", "getKilometers", "inMiles", "getMiles", "inInches", "getInches", "inFeet", "getFeet", "get", "zero", "zero$connect_client_release", "compareTo", "", "other", "equals", "", "", WatchFaceConstant.HASHCODE, "toString", "", "Companion", FaqConstants.FAQ_UPLOAD_FLAG, "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class Length implements Comparable<Length> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final Map<Type, Length> ZEROS;
    private final Type type;
    private final double value;

    private Length(double d, Type type) {
        this.value = d;
        this.type = type;
    }

    public final double getMeters() {
        return this.value * this.type.getMetersPerUnit();
    }

    public final double getKilometers() {
        return get(Type.KILOMETERS);
    }

    public final double getMiles() {
        return get(Type.MILES);
    }

    public final double getInches() {
        return get(Type.INCHES);
    }

    public final double getFeet() {
        return get(Type.FEET);
    }

    private final double get(Type type) {
        return this.type == type ? this.value : getMeters() / type.getMetersPerUnit();
    }

    public final Length zero$connect_client_release() {
        return (Length) zae.d(ZEROS, this.type);
    }

    @Override // java.lang.Comparable
    public int compareTo(Length other) {
        zcp.c(other, "");
        if (this.type == other.type) {
            return Double.compare(this.value, other.value);
        }
        return Double.compare(getMeters(), other.getMeters());
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Length)) {
            return false;
        }
        Length length = (Length) other;
        if (this.type == length.type) {
            return this.value == length.value;
        }
        return getMeters() == length.getMeters();
    }

    public int hashCode() {
        return Double.hashCode(getMeters());
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

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\nH\u0007J\u0010\u0010\u000b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\nH\u0007J\u0010\u0010\f\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\nH\u0007J\u0010\u0010\r\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\nH\u0007J\u0010\u0010\u000e\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\nH\u0007R\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Landroidx/health/connect/client/units/Length$Companion;", "", "<init>", "()V", "ZEROS", "", "Landroidx/health/connect/client/units/Length$Type;", "Landroidx/health/connect/client/units/Length;", "meters", "value", "", "kilometers", "miles", "inches", "feet", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @JvmStatic
        public final Length meters(double value) {
            return new Length(value, Type.METERS, null);
        }

        @JvmStatic
        public final Length kilometers(double value) {
            return new Length(value, Type.KILOMETERS, null);
        }

        @JvmStatic
        public final Length miles(double value) {
            return new Length(value, Type.MILES, null);
        }

        @JvmStatic
        public final Length inches(double value) {
            return new Length(value, Type.INCHES, null);
        }

        @JvmStatic
        public final Length feet(double value) {
            return new Length(value, Type.FEET, null);
        }

        public /* synthetic */ Companion(zcm zcmVar) {
            this();
        }
    }

    static {
        Type[] typeArrValues = Type.values();
        LinkedHashMap linkedHashMap = new LinkedHashMap(zdm.c(zae.e(typeArrValues.length), 16));
        for (Type type : typeArrValues) {
            linkedHashMap.put(type, new Length(0.0d, type));
        }
        ZEROS = linkedHashMap;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\n\u0002\u0010\u0006\n\u0002\b\u0003\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0012\u0010\t\u001a\u00020\nX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fj\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\r"}, d2 = {"Landroidx/health/connect/client/units/Length$Type;", "", "<init>", "(Ljava/lang/String;I)V", "METERS", "KILOMETERS", "MILES", "INCHES", "FEET", "metersPerUnit", "", "getMetersPerUnit", "()D", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    static final abstract class Type {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Type[] $VALUES;
        public static final Type METERS = new METERS("METERS", 0);
        public static final Type KILOMETERS = new KILOMETERS("KILOMETERS", 1);
        public static final Type MILES = new MILES("MILES", 2);
        public static final Type INCHES = new INCHES("INCHES", 3);
        public static final Type FEET = new FEET("FEET", 4);

        public abstract double getMetersPerUnit();

        @Metadata(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"androidx/health/connect/client/units/Length.Type.METERS", "Landroidx/health/connect/client/units/Length$Type;", "metersPerUnit", "", "getMetersPerUnit", "()D", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        static final class METERS extends Type {
            private final double metersPerUnit;

            METERS(String str, int i) {
                super(str, i, null);
                this.metersPerUnit = 1.0d;
            }

            @Override // androidx.health.connect.client.units.Length.Type
            public double getMetersPerUnit() {
                return this.metersPerUnit;
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

        @Metadata(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"androidx/health/connect/client/units/Length.Type.KILOMETERS", "Landroidx/health/connect/client/units/Length$Type;", "metersPerUnit", "", "getMetersPerUnit", "()D", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        static final class KILOMETERS extends Type {
            private final double metersPerUnit;

            KILOMETERS(String str, int i) {
                super(str, i, null);
                this.metersPerUnit = 1000.0d;
            }

            @Override // androidx.health.connect.client.units.Length.Type
            public double getMetersPerUnit() {
                return this.metersPerUnit;
            }
        }

        @Metadata(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"androidx/health/connect/client/units/Length.Type.MILES", "Landroidx/health/connect/client/units/Length$Type;", "metersPerUnit", "", "getMetersPerUnit", "()D", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        static final class MILES extends Type {
            private final double metersPerUnit;

            MILES(String str, int i) {
                super(str, i, null);
                this.metersPerUnit = 1609.34d;
            }

            @Override // androidx.health.connect.client.units.Length.Type
            public double getMetersPerUnit() {
                return this.metersPerUnit;
            }
        }

        @Metadata(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"androidx/health/connect/client/units/Length.Type.INCHES", "Landroidx/health/connect/client/units/Length$Type;", "metersPerUnit", "", "getMetersPerUnit", "()D", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        static final class INCHES extends Type {
            private final double metersPerUnit;

            INCHES(String str, int i) {
                super(str, i, null);
                this.metersPerUnit = 0.0254d;
            }

            @Override // androidx.health.connect.client.units.Length.Type
            public double getMetersPerUnit() {
                return this.metersPerUnit;
            }
        }

        @Metadata(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"androidx/health/connect/client/units/Length.Type.FEET", "Landroidx/health/connect/client/units/Length$Type;", "metersPerUnit", "", "getMetersPerUnit", "()D", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        static final class FEET extends Type {
            private final double metersPerUnit;

            FEET(String str, int i) {
                super(str, i, null);
                this.metersPerUnit = 0.3048d;
            }

            @Override // androidx.health.connect.client.units.Length.Type
            public double getMetersPerUnit() {
                return this.metersPerUnit;
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
            return new Type[]{METERS, KILOMETERS, MILES, INCHES, FEET};
        }
    }

    @JvmStatic
    public static final Length miles(double d) {
        return INSTANCE.miles(d);
    }

    @JvmStatic
    public static final Length meters(double d) {
        return INSTANCE.meters(d);
    }

    @JvmStatic
    public static final Length kilometers(double d) {
        return INSTANCE.kilometers(d);
    }

    @JvmStatic
    public static final Length inches(double d) {
        return INSTANCE.inches(d);
    }

    @JvmStatic
    public static final Length feet(double d) {
        return INSTANCE.feet(d);
    }

    public /* synthetic */ Length(double d, Type type, zcm zcmVar) {
        this(d, type);
    }
}
