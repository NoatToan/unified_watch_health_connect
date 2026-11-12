package androidx.health.connect.client.units;

import androidx.core.text.util.LocalePreferences;
import com.huawei.phoneservice.faq.base.constants.FaqConstants;
import com.huawei.watchface.utils.constants.WatchFaceConstant;
import defpackage.enumEntries;
import defpackage.yyv;
import defpackage.zcm;
import defpackage.zcp;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.jvm.JvmStatic;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u00162\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0002\u0016\u0017B\u0019\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0011\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0000H\u0096\u0002J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u000f\u001a\u0004\u0018\u00010\u0012H\u0096\u0002J\b\u0010\u0013\u001a\u00020\u000eH\u0016J\b\u0010\u0014\u001a\u00020\u0015H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\u00038G¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0011\u0010\u000b\u001a\u00020\u00038G¢\u0006\u0006\u001a\u0004\b\f\u0010\n¨\u0006\u0018"}, d2 = {"Landroidx/health/connect/client/units/Temperature;", "", "value", "", "type", "Landroidx/health/connect/client/units/Temperature$Type;", "<init>", "(DLandroidx/health/connect/client/units/Temperature$Type;)V", "inCelsius", "getCelsius", "()D", "inFahrenheit", "getFahrenheit", "compareTo", "", "other", "equals", "", "", WatchFaceConstant.HASHCODE, "toString", "", "Companion", FaqConstants.FAQ_UPLOAD_FLAG, "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class Temperature implements Comparable<Temperature> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Type type;
    private final double value;

    private Temperature(double d, Type type) {
        this.value = d;
        this.type = type;
    }

    public final double getCelsius() {
        int i = WhenMappings.$EnumSwitchMapping$0[this.type.ordinal()];
        if (i == 1) {
            return this.value;
        }
        if (i != 2) {
            throw new yyv();
        }
        return (this.value - 32.0d) / 1.8d;
    }

    public final double getFahrenheit() {
        int i = WhenMappings.$EnumSwitchMapping$0[this.type.ordinal()];
        if (i == 1) {
            return (this.value * 1.8d) + 32.0d;
        }
        if (i != 2) {
            throw new yyv();
        }
        return this.value;
    }

    @Override // java.lang.Comparable
    public int compareTo(Temperature other) {
        zcp.c(other, "");
        if (this.type == other.type) {
            return Double.compare(this.value, other.value);
        }
        return Double.compare(getCelsius(), other.getCelsius());
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Temperature)) {
            return false;
        }
        Temperature temperature = (Temperature) other;
        if (this.type == temperature.type) {
            return this.value == temperature.value;
        }
        return getCelsius() == temperature.getCelsius();
    }

    public int hashCode() {
        return Double.hashCode(getCelsius());
    }

    public String toString() {
        return this.value + ' ' + this.type.getTitle();
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0010\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007¨\u0006\t"}, d2 = {"Landroidx/health/connect/client/units/Temperature$Companion;", "", "<init>", "()V", LocalePreferences.TemperatureUnit.CELSIUS, "Landroidx/health/connect/client/units/Temperature;", "value", "", "fahrenheit", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @JvmStatic
        public final Temperature celsius(double value) {
            return new Temperature(value, Type.CELSIUS, null);
        }

        @JvmStatic
        public final Temperature fahrenheit(double value) {
            return new Temperature(value, Type.FAHRENHEIT, null);
        }

        public /* synthetic */ Companion(zcm zcmVar) {
            this();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0012\u0010\u0006\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tj\u0002\b\u0004j\u0002\b\u0005¨\u0006\n"}, d2 = {"Landroidx/health/connect/client/units/Temperature$Type;", "", "<init>", "(Ljava/lang/String;I)V", "CELSIUS", "FAHRENHEIT", "title", "", "getTitle", "()Ljava/lang/String;", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    static final abstract class Type {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Type[] $VALUES;
        public static final Type CELSIUS = new CELSIUS("CELSIUS", 0);
        public static final Type FAHRENHEIT = new FAHRENHEIT("FAHRENHEIT", 1);

        public abstract String getTitle();

        @Metadata(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"androidx/health/connect/client/units/Temperature.Type.CELSIUS", "Landroidx/health/connect/client/units/Temperature$Type;", "title", "", "getTitle", "()Ljava/lang/String;", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        static final class CELSIUS extends Type {
            private final String title;

            CELSIUS(String str, int i) {
                super(str, i, null);
                this.title = "Celsius";
            }

            @Override // androidx.health.connect.client.units.Temperature.Type
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

        @Metadata(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"androidx/health/connect/client/units/Temperature.Type.FAHRENHEIT", "Landroidx/health/connect/client/units/Temperature$Type;", "title", "", "getTitle", "()Ljava/lang/String;", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        static final class FAHRENHEIT extends Type {
            private final String title;

            FAHRENHEIT(String str, int i) {
                super(str, i, null);
                this.title = "Fahrenheit";
            }

            @Override // androidx.health.connect.client.units.Temperature.Type
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
            return new Type[]{CELSIUS, FAHRENHEIT};
        }
    }

    @JvmStatic
    public static final Temperature fahrenheit(double d) {
        return INSTANCE.fahrenheit(d);
    }

    @JvmStatic
    public static final Temperature celsius(double d) {
        return INSTANCE.celsius(d);
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Type.values().length];
            try {
                iArr[Type.CELSIUS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Type.FAHRENHEIT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public /* synthetic */ Temperature(double d, Type type, zcm zcmVar) {
        this(d, type);
    }
}
