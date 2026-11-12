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
@Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\nB\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u000b"}, d2 = {"Lgt;", "Lcom/xiaomi/hm/health/bt/profile/gdsp/spo2/Spo2Data;", "", "toString", "", SportConstants.KEY_TIMESTAMP, "", "descend", "<init>", "(JI)V", PluginDeviceInfo.FMODEL, "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public final class gt extends Spo2Data {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a f19308b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f19309a;

    @Metadata(bv = {}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0016\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\b\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Lgt$a;", "", "", Constants.KEY_RECHARGE_VALUES, "", "Lgt;", PluginDeviceInfo.FMODEL, "", "VERSION", "I", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Nullable
        public final List<gt> a(@NotNull byte[] values) {
            Intrinsics.checkNotNullParameter(values, "values");
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < values.length; i += 5) {
                arrayList.add(new gt(tet.v(values, i, 4), values[i + 4]));
            }
            return arrayList;
        }
    }

    public gt(long j, int i) {
        super(j);
        this.f19309a = i;
    }

    @NotNull
    public String toString() {
        return "Spo2OsaEventYorkData: \ntimeStamp: " + getTimeStamp() + " \ndescend: " + this.f19309a;
    }
}
