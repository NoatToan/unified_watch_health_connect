package androidx.health.connect.client.units;

import com.huawei.watchface.utils.constants.WatchFaceConstant;
import defpackage.zcm;
import defpackage.zcp;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0010\u0006\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u0000 \u00142\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0014B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\t\u001a\u00020\u0000H\u0000¢\u0006\u0002\b\nJ\u0011\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0000H\u0096\u0002J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\r\u001a\u0004\u0018\u00010\u0010H\u0096\u0002J\b\u0010\u0011\u001a\u00020\fH\u0016J\b\u0010\u0012\u001a\u00020\u0013H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u00038G¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\u0015"}, d2 = {"Landroidx/health/connect/client/units/Pressure;", "", "value", "", "<init>", "(D)V", "inMillimetersOfMercury", "getMillimetersOfMercury", "()D", "zero", "zero$connect_client_release", "compareTo", "", "other", "equals", "", "", WatchFaceConstant.HASHCODE, "toString", "", "Companion", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class Pressure implements Comparable<Pressure> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final Pressure ZERO = new Pressure(0.0d);
    private final double value;

    private Pressure(double d) {
        this.value = d;
    }

    /* JADX INFO: renamed from: getMillimetersOfMercury, reason: from getter */
    public final double getValue() {
        return this.value;
    }

    public final Pressure zero$connect_client_release() {
        return ZERO;
    }

    @Override // java.lang.Comparable
    public int compareTo(Pressure other) {
        zcp.c(other, "");
        return Double.compare(this.value, other.value);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof Pressure) && this.value == ((Pressure) other).value;
    }

    public int hashCode() {
        return Double.hashCode(this.value);
    }

    public String toString() {
        return this.value + " mmHg";
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Landroidx/health/connect/client/units/Pressure$Companion;", "", "<init>", "()V", "ZERO", "Landroidx/health/connect/client/units/Pressure;", "millimetersOfMercury", "value", "", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @JvmStatic
        public final Pressure millimetersOfMercury(double value) {
            return new Pressure(value, null);
        }

        public /* synthetic */ Companion(zcm zcmVar) {
            this();
        }
    }

    @JvmStatic
    public static final Pressure millimetersOfMercury(double d) {
        return INSTANCE.millimetersOfMercury(d);
    }

    public /* synthetic */ Pressure(double d, zcm zcmVar) {
        this(d);
    }
}
