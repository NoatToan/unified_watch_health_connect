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

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001:\u0001\u0007B!\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\u000f"}, d2 = {"Lht;", "Lcom/xiaomi/hm/health/bt/profile/gdsp/spo2/Spo2Data;", "", "toString", "", "spo2", "I", PluginDeviceInfo.FMODEL, "()I", "", SportConstants.KEY_TIMESTAMP, "", "isAutomaticOxygen", "<init>", "(JIZ)V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public class ht extends Spo2Data {

    @NotNull
    public static final a c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f20418a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f20419b;

    @Metadata(bv = {}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0016\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\b\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Lht$a;", "", "", Constants.KEY_RECHARGE_VALUES, "", "Lht;", PluginDeviceInfo.FMODEL, "", "VERSION", "I", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Nullable
        public final List<ht> a(@NotNull byte[] values) {
            Intrinsics.checkNotNullParameter(values, "values");
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < values.length; i += 5) {
                long jV = tet.v(values, i, 4);
                byte b2 = values[i + 4];
                arrayList.add(new ht(jV, (byte) (b2 & 127), ((byte) (b2 & (-128))) != 0));
            }
            return arrayList;
        }
    }

    public ht(long j, int i, boolean z) {
        super(j);
        this.f20418a = i;
        this.f20419b = z;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getF20418a() {
        return this.f20418a;
    }

    @NotNull
    public String toString() {
        return "Spo2PointData: \ntimeStamp: " + getTimeStamp() + " \nspo2: " + this.f20418a;
    }
}
