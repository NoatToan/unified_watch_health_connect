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

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0001\u0012B/\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u000f\u001a\u00020\t\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\u0013"}, d2 = {"Lit;", "Lht;", "", "toString", "", "spo2History", "[B", PluginDeviceInfo.FDESC, "()[B", "", "version", "", SportConstants.KEY_TIMESTAMP, "", "isAutomaticOxygen", "spo2", "<init>", "(IJZI[B)V", PluginDeviceInfo.FMODEL, "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public final class it extends ht {

    @NotNull
    public static final a f = new a(null);
    public final int d;

    @NotNull
    public final byte[] e;

    @Metadata(bv = {}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0016\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\t¨\u0006\r"}, d2 = {"Lit$a;", "", "", Constants.KEY_RECHARGE_VALUES, "", "Lit;", PluginDeviceInfo.FMODEL, "", "POINT_SPO2_SIZE", "I", "VERSION", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Nullable
        public final List<it> a(@NotNull byte[] values) {
            Intrinsics.checkNotNullParameter(values, "values");
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < values.length; i += 65) {
                long jV = tet.v(values, i, 4);
                byte b2 = values[i + 4];
                byte b3 = (byte) (b2 & (-128));
                byte b4 = (byte) (b2 & 127);
                byte[] bArr = new byte[60];
                System.arraycopy(values, i + 5, bArr, 0, 60);
                arrayList.add(new it(2, jV, b3 != 0, b4, bArr));
            }
            return arrayList;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public it(int i, long j, boolean z, int i2, @NotNull byte[] spo2History) {
        super(j, i2, z);
        Intrinsics.checkNotNullParameter(spo2History, "spo2History");
        this.d = i;
        this.e = spo2History;
    }

    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public final byte[] getE() {
        return this.e;
    }

    @Override // defpackage.ht
    @NotNull
    public String toString() {
        return "Spo2PointDataExtends: \nversion: " + this.d + " \ntimeStamp: " + getTimeStamp() + " \nspo2: " + getF20418a() + " \nspo2History: " + tet.x(this.e);
    }
}
