package defpackage;

import com.smarthome.core.modelconfig.PluginDeviceInfo;
import com.xiaomi.hm.health.bt.profile.gdsp.pressure.HMPressureData;
import java.util.ArrayList;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&J \u0010\b\u001a\u00020\u00022\u0016\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006H&J\u0010\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH&¨\u0006\f"}, d2 = {"Lki;", "", "", "onPressureStart", "Ljava/util/ArrayList;", "Lcom/xiaomi/hm/health/bt/profile/gdsp/pressure/HMPressureData;", "Lkotlin/collections/ArrayList;", "list", PluginDeviceInfo.FMODEL, "", "result", "onPressureStop", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public interface ki {
    void a(@NotNull ArrayList<HMPressureData> list);

    void onPressureStart();

    void onPressureStop(boolean result);
}
