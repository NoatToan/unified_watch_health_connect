package defpackage;

import com.mibi.sdk.component.Constants;
import com.smarthome.core.modelconfig.PluginDeviceInfo;
import com.xiaomi.fitness.sport_eco.SportConstants;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\u0018BI\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0013\u001a\u00020\u000f\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\u0004\u0012\u0006\u0010\r\u001a\u00020\u0004¢\u0006\u0004\b\u0016\u0010\u0017J\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u0017\u0010\u000b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\bR\u0017\u0010\r\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u000e\u0010\b¨\u0006\u0019"}, d2 = {"Let;", "Ldt;", "", "toString", "", "spo2High", "[B", PluginDeviceInfo.FICONOFFLINE, "()[B", "spo2Low", PluginDeviceInfo.FBLUETOOTHPAIR, "signalQuality", PluginDeviceInfo.FICONOFF, "extend", PluginDeviceInfo.FICONON, "", "version", "", SportConstants.KEY_TIMESTAMP, "spo2", "", "time", "<init>", "(IJIB[B[B[B[B)V", PluginDeviceInfo.FMODEL, "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public final class et extends dt {

    @NotNull
    public static final a i = new a(null);
    public final int d;

    @NotNull
    public final byte[] e;

    @NotNull
    public final byte[] f;

    @NotNull
    public final byte[] g;

    @NotNull
    public final byte[] h;

    @Metadata(bv = {}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0016\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\tR\u0014\u0010\u000b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\tR\u0014\u0010\f\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\tR\u0014\u0010\r\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\t¨\u0006\u0010"}, d2 = {"Let$a;", "", "", Constants.KEY_RECHARGE_VALUES, "", "Let;", PluginDeviceInfo.FMODEL, "", "EXTEND_SIZE", "I", "OSA_SPO2_HIGH_SIZE", "OSA_SPO2_LOW_SIZE", "SIGNAL_QUALITY_SIZE", "VERSION", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Nullable
        public final List<et> a(@NotNull byte[] values) {
            Intrinsics.checkNotNullParameter(values, "values");
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < values.length; i += 30) {
                long jV = tet.v(values, i, 4);
                byte b2 = values[i + 4];
                byte b3 = values[i + 5];
                byte[] bArr = new byte[6];
                System.arraycopy(values, i + 6, bArr, 0, 6);
                byte[] bArr2 = new byte[6];
                System.arraycopy(values, i + 12, bArr2, 0, 6);
                byte[] bArr3 = new byte[8];
                System.arraycopy(values, i + 18, bArr3, 0, 8);
                byte[] bArr4 = new byte[4];
                System.arraycopy(values, i + 26, bArr4, 0, 4);
                arrayList.add(new et(2, jV, b2, b3, bArr, bArr2, bArr3, bArr4));
            }
            return arrayList;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public et(int i2, long j, int i3, byte b2, @NotNull byte[] spo2High, @NotNull byte[] spo2Low, @NotNull byte[] signalQuality, @NotNull byte[] extend) {
        super(j, i3, b2);
        Intrinsics.checkNotNullParameter(spo2High, "spo2High");
        Intrinsics.checkNotNullParameter(spo2Low, "spo2Low");
        Intrinsics.checkNotNullParameter(signalQuality, "signalQuality");
        Intrinsics.checkNotNullParameter(extend, "extend");
        this.d = i2;
        this.e = spo2High;
        this.f = spo2Low;
        this.g = signalQuality;
        this.h = extend;
    }

    @NotNull
    /* JADX INFO: renamed from: c, reason: from getter */
    public final byte[] getH() {
        return this.h;
    }

    @NotNull
    /* JADX INFO: renamed from: d, reason: from getter */
    public final byte[] getG() {
        return this.g;
    }

    @NotNull
    /* JADX INFO: renamed from: e, reason: from getter */
    public final byte[] getE() {
        return this.e;
    }

    @NotNull
    /* JADX INFO: renamed from: f, reason: from getter */
    public final byte[] getF() {
        return this.f;
    }

    @Override // defpackage.dt
    @NotNull
    public String toString() {
        return "Spo2OsaDataExtends: \nversion: " + this.d + " \ntimeStamp: " + getTimeStamp() + " \nspo2: " + getF15904a() + " \ntime: " + ((int) getF15905b()) + " \nspo2high: " + tet.x(this.e) + " \nspo2Low: " + tet.x(this.f) + " \nsignalQuality: " + tet.x(this.g) + " \nextend: " + tet.x(this.h);
    }
}
