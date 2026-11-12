package androidx.health.connect.client.units;

import com.huawei.openalliance.ad.beans.parameter.RequestOptions;
import com.huawei.phoneservice.faq.base.constants.FaqConstants;
import com.huawei.pluginachievement.manager.model.ParsedFieldTag;
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
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u001d2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0002\u001d\u001eB\u0019\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0002J\r\u0010\u0012\u001a\u00020\u0000H\u0000¢\u0006\u0002\b\u0013J\u0011\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0000H\u0096\u0002J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0016\u001a\u0004\u0018\u00010\u0019H\u0096\u0002J\b\u0010\u001a\u001a\u00020\u0015H\u0016J\b\u0010\u001b\u001a\u00020\u001cH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\u00038G¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0011\u0010\u000b\u001a\u00020\u00038G¢\u0006\u0006\u001a\u0004\b\f\u0010\nR\u0011\u0010\r\u001a\u00020\u00038G¢\u0006\u0006\u001a\u0004\b\u000e\u0010\nR\u0011\u0010\u000f\u001a\u00020\u00038G¢\u0006\u0006\u001a\u0004\b\u0010\u0010\n¨\u0006\u001f"}, d2 = {"Landroidx/health/connect/client/units/Energy;", "", "value", "", "type", "Landroidx/health/connect/client/units/Energy$Type;", "<init>", "(DLandroidx/health/connect/client/units/Energy$Type;)V", "inCalories", "getCalories", "()D", "inKilocalories", "getKilocalories", "inJoules", "getJoules", "inKilojoules", "getKilojoules", "get", "zero", "zero$connect_client_release", "compareTo", "", "other", "equals", "", "", WatchFaceConstant.HASHCODE, "toString", "", "Companion", FaqConstants.FAQ_UPLOAD_FLAG, "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class Energy implements Comparable<Energy> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final Map<Type, Energy> ZEROS;
    private final Type type;
    private final double value;

    private Energy(double d, Type type) {
        this.value = d;
        this.type = type;
    }

    public final double getCalories() {
        return this.value * this.type.getCaloriesPerUnit();
    }

    public final double getKilocalories() {
        return get(Type.KILOCALORIES);
    }

    public final double getJoules() {
        return get(Type.JOULES);
    }

    public final double getKilojoules() {
        return get(Type.KILOJOULES);
    }

    private final double get(Type type) {
        return this.type == type ? this.value : getCalories() / type.getCaloriesPerUnit();
    }

    public final Energy zero$connect_client_release() {
        return (Energy) zae.d(ZEROS, this.type);
    }

    @Override // java.lang.Comparable
    public int compareTo(Energy other) {
        zcp.c(other, "");
        if (this.type == other.type) {
            return Double.compare(this.value, other.value);
        }
        return Double.compare(getCalories(), other.getCalories());
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Energy)) {
            return false;
        }
        Energy energy = (Energy) other;
        if (this.type == energy.type) {
            return this.value == energy.value;
        }
        return getCalories() == energy.getCalories();
    }

    public int hashCode() {
        return Double.hashCode(getCalories());
    }

    public String toString() {
        return this.value + ' ' + this.type.getTitle();
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\nH\u0007J\u0010\u0010\u000b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\nH\u0007J\u0010\u0010\f\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\nH\u0007J\u0010\u0010\r\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\nH\u0007R\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Landroidx/health/connect/client/units/Energy$Companion;", "", "<init>", "()V", "ZEROS", "", "Landroidx/health/connect/client/units/Energy$Type;", "Landroidx/health/connect/client/units/Energy;", "calories", "value", "", "kilocalories", "joules", "kilojoules", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @JvmStatic
        public final Energy calories(double value) {
            return new Energy(value, Type.CALORIES, null);
        }

        @JvmStatic
        public final Energy kilocalories(double value) {
            return new Energy(value, Type.KILOCALORIES, null);
        }

        @JvmStatic
        public final Energy joules(double value) {
            return new Energy(value, Type.JOULES, null);
        }

        @JvmStatic
        public final Energy kilojoules(double value) {
            return new Energy(value, Type.KILOJOULES, null);
        }

        public /* synthetic */ Companion(zcm zcmVar) {
            this();
        }
    }

    static {
        Type[] typeArrValues = Type.values();
        LinkedHashMap linkedHashMap = new LinkedHashMap(zdm.c(zae.e(typeArrValues.length), 16));
        for (Type type : typeArrValues) {
            linkedHashMap.put(type, new Energy(0.0d, type));
        }
        ZEROS = linkedHashMap;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0012\u0010\b\u001a\u00020\tX¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0012\u0010\f\u001a\u00020\rX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fj\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\u0010"}, d2 = {"Landroidx/health/connect/client/units/Energy$Type;", "", "<init>", "(Ljava/lang/String;I)V", "CALORIES", "KILOCALORIES", "JOULES", "KILOJOULES", "caloriesPerUnit", "", "getCaloriesPerUnit", "()D", "title", "", "getTitle", "()Ljava/lang/String;", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    static final abstract class Type {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Type[] $VALUES;
        public static final Type CALORIES = new CALORIES("CALORIES", 0);
        public static final Type KILOCALORIES = new KILOCALORIES("KILOCALORIES", 1);
        public static final Type JOULES = new JOULES("JOULES", 2);
        public static final Type KILOJOULES = new KILOJOULES("KILOJOULES", 3);

        public abstract double getCaloriesPerUnit();

        public abstract String getTitle();

        @Metadata(d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"androidx/health/connect/client/units/Energy.Type.CALORIES", "Landroidx/health/connect/client/units/Energy$Type;", "caloriesPerUnit", "", "getCaloriesPerUnit", "()D", "title", "", "getTitle", "()Ljava/lang/String;", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        static final class CALORIES extends Type {
            private final double caloriesPerUnit;
            private final String title;

            CALORIES(String str, int i) {
                super(str, i, null);
                this.caloriesPerUnit = 1.0d;
                this.title = "cal";
            }

            @Override // androidx.health.connect.client.units.Energy.Type
            public double getCaloriesPerUnit() {
                return this.caloriesPerUnit;
            }

            @Override // androidx.health.connect.client.units.Energy.Type
            public String getTitle() {
                return this.title;
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

        @Metadata(d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"androidx/health/connect/client/units/Energy.Type.KILOCALORIES", "Landroidx/health/connect/client/units/Energy$Type;", "caloriesPerUnit", "", "getCaloriesPerUnit", "()D", "title", "", "getTitle", "()Ljava/lang/String;", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        static final class KILOCALORIES extends Type {
            private final double caloriesPerUnit;
            private final String title;

            KILOCALORIES(String str, int i) {
                super(str, i, null);
                this.caloriesPerUnit = 1000.0d;
                this.title = ParsedFieldTag.K_CAL;
            }

            @Override // androidx.health.connect.client.units.Energy.Type
            public double getCaloriesPerUnit() {
                return this.caloriesPerUnit;
            }

            @Override // androidx.health.connect.client.units.Energy.Type
            public String getTitle() {
                return this.title;
            }
        }

        @Metadata(d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"androidx/health/connect/client/units/Energy.Type.JOULES", "Landroidx/health/connect/client/units/Energy$Type;", "caloriesPerUnit", "", "getCaloriesPerUnit", "()D", "title", "", "getTitle", "()Ljava/lang/String;", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        static final class JOULES extends Type {
            private final double caloriesPerUnit;
            private final String title;

            JOULES(String str, int i) {
                super(str, i, null);
                this.caloriesPerUnit = 0.2390057361d;
                this.title = RequestOptions.AD_CONTENT_CLASSIFICATION_J;
            }

            @Override // androidx.health.connect.client.units.Energy.Type
            public double getCaloriesPerUnit() {
                return this.caloriesPerUnit;
            }

            @Override // androidx.health.connect.client.units.Energy.Type
            public String getTitle() {
                return this.title;
            }
        }

        @Metadata(d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"androidx/health/connect/client/units/Energy.Type.KILOJOULES", "Landroidx/health/connect/client/units/Energy$Type;", "caloriesPerUnit", "", "getCaloriesPerUnit", "()D", "title", "", "getTitle", "()Ljava/lang/String;", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        static final class KILOJOULES extends Type {
            private final double caloriesPerUnit;
            private final String title;

            KILOJOULES(String str, int i) {
                super(str, i, null);
                this.caloriesPerUnit = 239.0057361d;
                this.title = "kJ";
            }

            @Override // androidx.health.connect.client.units.Energy.Type
            public double getCaloriesPerUnit() {
                return this.caloriesPerUnit;
            }

            @Override // androidx.health.connect.client.units.Energy.Type
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
            return new Type[]{CALORIES, KILOCALORIES, JOULES, KILOJOULES};
        }
    }

    @JvmStatic
    public static final Energy kilojoules(double d) {
        return INSTANCE.kilojoules(d);
    }

    @JvmStatic
    public static final Energy kilocalories(double d) {
        return INSTANCE.kilocalories(d);
    }

    @JvmStatic
    public static final Energy joules(double d) {
        return INSTANCE.joules(d);
    }

    @JvmStatic
    public static final Energy calories(double d) {
        return INSTANCE.calories(d);
    }

    public /* synthetic */ Energy(double d, Type type, zcm zcmVar) {
        this(d, type);
    }
}
