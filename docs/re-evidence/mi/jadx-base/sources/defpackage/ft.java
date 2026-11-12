package defpackage;

import com.mibi.sdk.component.Constants;
import com.smarthome.core.modelconfig.PluginDeviceInfo;
import com.xiaomi.fitness.sport_eco.SportConstants;
import com.xiaomi.hm.health.bt.profile.gdsp.spo2.Spo2Data;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(bv = {}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001:\u0001\u000fB1\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0004\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000e\u001a\u00020\t¢\u0006\u0004\b\u0013\u0010\u0014J\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u000e\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000b\u001a\u0004\b\u000f\u0010\r¨\u0006\u0015"}, d2 = {"Lft;", "Lcom/xiaomi/hm/health/bt/profile/gdsp/spo2/Spo2Data;", "", "toString", "", "spo2Decrease", "I", PluginDeviceInfo.FICONON, "()I", "", "spo2", "[B", PluginDeviceInfo.FDESC, "()[B", "hr", PluginDeviceInfo.FMODEL, "version", "", SportConstants.KEY_TIMESTAMP, "<init>", "(IJI[B[B)V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public class ft extends Spo2Data {

    @NotNull
    public static final a e = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f18169a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f18170b;

    @NotNull
    public final byte[] c;

    @NotNull
    public final byte[] d;

    @Metadata(bv = {}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rJ\u0016\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\tR\u0014\u0010\u000b\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\t¨\u0006\u000e"}, d2 = {"Lft$a;", "", "", Constants.KEY_RECHARGE_VALUES, "", "Lft;", PluginDeviceInfo.FMODEL, "", "HR_SIZE", "I", "SPO2_SIZE", "VERSION", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Nullable
        public final List<ft> a(@NotNull byte[] values) {
            Intrinsics.checkNotNullParameter(values, "values");
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < values.length; i += 485) {
                long jV = tet.v(values, i, 4);
                byte b2 = values[i + 4];
                byte[] bArr = new byte[240];
                System.arraycopy(values, i + 5, bArr, 0, 240);
                byte[] bArr2 = new byte[240];
                System.arraycopy(values, i + 245, bArr2, 0, 240);
                arrayList.add(new ft(2, jV, b2, bArr, bArr2));
            }
            return arrayList;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ft(int i, long j, int i2, @NotNull byte[] spo2, @NotNull byte[] hr) {
        super(j);
        Intrinsics.checkNotNullParameter(spo2, "spo2");
        Intrinsics.checkNotNullParameter(hr, "hr");
        this.f18169a = i;
        this.f18170b = i2;
        this.c = spo2;
        this.d = hr;
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final byte[] getD() {
        return this.d;
    }

    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public final byte[] getC() {
        return this.c;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getF18170b() {
        return this.f18170b;
    }

    @NotNull
    public String toString() {
        return "Spo2OsaEventData: \ntimeStamp: " + getTimeStamp() + " \nspo2Decrease: " + this.f18170b + " \nspo2: " + tet.x(this.c) + " \nhr: " + tet.x(this.d);
    }
}
