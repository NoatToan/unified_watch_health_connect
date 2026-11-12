package androidx.health.connect.client.units;

import com.huawei.phoneservice.faq.base.constants.FaqConstants;
import com.huawei.watchface.utils.constants.WatchFaceConstant;
import defpackage.enumEntries;
import defpackage.zae;
import defpackage.zcm;
import defpackage.zcp;
import defpackage.zdm;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.jvm.JvmStatic;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u00192\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0002\u0019\u001aB\u0019\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\r\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0002J\r\u0010\u000e\u001a\u00020\u0000H\u0000¢\u0006\u0002\b\u000fJ\u0011\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0000H\u0096\u0002J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0012\u001a\u0004\u0018\u00010\u0015H\u0096\u0002J\b\u0010\u0016\u001a\u00020\u0011H\u0016J\b\u0010\u0017\u001a\u00020\u0018H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\u00038G¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0011\u0010\u000b\u001a\u00020\u00038G¢\u0006\u0006\u001a\u0004\b\f\u0010\n¨\u0006\u001b"}, d2 = {"Landroidx/health/connect/client/units/BloodGlucose;", "", "value", "", "type", "Landroidx/health/connect/client/units/BloodGlucose$Type;", "<init>", "(DLandroidx/health/connect/client/units/BloodGlucose$Type;)V", "inMillimolesPerLiter", "getMillimolesPerLiter", "()D", "inMilligramsPerDeciliter", "getMilligramsPerDeciliter", "get", "zero", "zero$connect_client_release", "compareTo", "", "other", "equals", "", "", WatchFaceConstant.HASHCODE, "toString", "", "Companion", FaqConstants.FAQ_UPLOAD_FLAG, "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class BloodGlucose implements Comparable<BloodGlucose> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final Map<Type, BloodGlucose> ZEROS;
    private final Type type;
    private final double value;

    private BloodGlucose(double d, Type type) {
        this.value = d;
        this.type = type;
    }

    public final double getMillimolesPerLiter() {
        return this.value * this.type.getMillimolesPerLiterPerUnit();
    }

    public final double getMilligramsPerDeciliter() {
        return get(Type.MILLIGRAMS_PER_DECILITER);
    }

    private final double get(Type type) {
        return this.type == type ? this.value : getMillimolesPerLiter() / type.getMillimolesPerLiterPerUnit();
    }

    public final BloodGlucose zero$connect_client_release() {
        return (BloodGlucose) zae.d(ZEROS, this.type);
    }

    @Override // java.lang.Comparable
    public int compareTo(BloodGlucose other) {
        zcp.c(other, "");
        if (this.type == other.type) {
            return Double.compare(this.value, other.value);
        }
        return Double.compare(getMillimolesPerLiter(), other.getMillimolesPerLiter());
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BloodGlucose)) {
            return false;
        }
        BloodGlucose bloodGlucose = (BloodGlucose) other;
        if (this.type == bloodGlucose.type) {
            return this.value == bloodGlucose.value;
        }
        return getMillimolesPerLiter() == bloodGlucose.getMillimolesPerLiter();
    }

    public int hashCode() {
        return Double.hashCode(getMillimolesPerLiter());
    }

    public String toString() {
        return this.value + ' ' + this.type.getTitle();
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\nH\u0007J\u0010\u0010\u000b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\nH\u0007R\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Landroidx/health/connect/client/units/BloodGlucose$Companion;", "", "<init>", "()V", "ZEROS", "", "Landroidx/health/connect/client/units/BloodGlucose$Type;", "Landroidx/health/connect/client/units/BloodGlucose;", "millimolesPerLiter", "value", "", "milligramsPerDeciliter", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @JvmStatic
        public final BloodGlucose millimolesPerLiter(double value) {
            return new BloodGlucose(value, Type.MILLIMOLES_PER_LITER, null);
        }

        @JvmStatic
        public final BloodGlucose milligramsPerDeciliter(double value) {
            return new BloodGlucose(value, Type.MILLIGRAMS_PER_DECILITER, null);
        }

        public /* synthetic */ Companion(zcm zcmVar) {
            this();
        }
    }

    static {
        Type[] typeArrValues = Type.values();
        LinkedHashMap linkedHashMap = new LinkedHashMap(zdm.c(zae.e(typeArrValues.length), 16));
        for (Type type : typeArrValues) {
            linkedHashMap.put(type, new BloodGlucose(0.0d, type));
        }
        ZEROS = linkedHashMap;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0012\u0010\u0006\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0012\u0010\n\u001a\u00020\u000bX¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rj\u0002\b\u0004j\u0002\b\u0005¨\u0006\u000e"}, d2 = {"Landroidx/health/connect/client/units/BloodGlucose$Type;", "", "<init>", "(Ljava/lang/String;I)V", "MILLIMOLES_PER_LITER", "MILLIGRAMS_PER_DECILITER", "millimolesPerLiterPerUnit", "", "getMillimolesPerLiterPerUnit", "()D", "title", "", "getTitle", "()Ljava/lang/String;", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    static final abstract class Type {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Type[] $VALUES;
        public static final Type MILLIMOLES_PER_LITER = new MILLIMOLES_PER_LITER("MILLIMOLES_PER_LITER", 0);
        public static final Type MILLIGRAMS_PER_DECILITER = new MILLIGRAMS_PER_DECILITER("MILLIGRAMS_PER_DECILITER", 1);

        public abstract double getMillimolesPerLiterPerUnit();

        public abstract String getTitle();

        @Metadata(d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"androidx/health/connect/client/units/BloodGlucose.Type.MILLIMOLES_PER_LITER", "Landroidx/health/connect/client/units/BloodGlucose$Type;", "millimolesPerLiterPerUnit", "", "getMillimolesPerLiterPerUnit", "()D", "title", "", "getTitle", "()Ljava/lang/String;", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        static final class MILLIMOLES_PER_LITER extends Type {
            private final double millimolesPerLiterPerUnit;

            MILLIMOLES_PER_LITER(String str, int i) {
                super(str, i, null);
                this.millimolesPerLiterPerUnit = 1.0d;
            }

            @Override // androidx.health.connect.client.units.BloodGlucose.Type
            public double getMillimolesPerLiterPerUnit() {
                return this.millimolesPerLiterPerUnit;
            }

            @Override // androidx.health.connect.client.units.BloodGlucose.Type
            public String getTitle() {
                return "mmol/L";
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

        @Metadata(d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"androidx/health/connect/client/units/BloodGlucose.Type.MILLIGRAMS_PER_DECILITER", "Landroidx/health/connect/client/units/BloodGlucose$Type;", "millimolesPerLiterPerUnit", "", "getMillimolesPerLiterPerUnit", "()D", "title", "", "getTitle", "()Ljava/lang/String;", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        static final class MILLIGRAMS_PER_DECILITER extends Type {
            private final double millimolesPerLiterPerUnit;
            private final String title;

            MILLIGRAMS_PER_DECILITER(String str, int i) {
                super(str, i, null);
                this.millimolesPerLiterPerUnit = 0.05555555555555555d;
                this.title = "mg/dL";
            }

            @Override // androidx.health.connect.client.units.BloodGlucose.Type
            public double getMillimolesPerLiterPerUnit() {
                return this.millimolesPerLiterPerUnit;
            }

            @Override // androidx.health.connect.client.units.BloodGlucose.Type
            public String getTitle() {
                return this.title;
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
            return new Type[]{MILLIMOLES_PER_LITER, MILLIGRAMS_PER_DECILITER};
        }
    }

    @JvmStatic
    public static final BloodGlucose millimolesPerLiter(double d) {
        return INSTANCE.millimolesPerLiter(d);
    }

    @JvmStatic
    public static final BloodGlucose milligramsPerDeciliter(double d) {
        return INSTANCE.milligramsPerDeciliter(d);
    }

    public /* synthetic */ BloodGlucose(double d, Type type, zcm zcmVar) {
        this(d, type);
    }
}
