package defpackage;

import com.smarthome.core.modelconfig.PluginDeviceInfo;
import com.xiaomi.fitness.devicesettings.bluttooth.todo.miui.MiuiCursorConstants;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(bv = {}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H&J\b\u0010\b\u001a\u00020\u0004H&J\b\u0010\t\u001a\u00020\u0004H&J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nH&J\b\u0010\f\u001a\u00020\u0004H\u0016J\b\u0010\r\u001a\u00020\u0004H\u0016¨\u0006\u000e"}, d2 = {"Le7;", "", "", "uniqueId", "", PluginDeviceInfo.FMODEL, "", MiuiCursorConstants.CONTENT, PluginDeviceInfo.FICONOFF, PluginDeviceInfo.FICONON, "Lsk;", "request", "onAlarmDelay", "onAlarmCancel", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public interface e7 {
    void a(int uniqueId);

    void a(int uniqueId, @NotNull String content);

    void a(@NotNull LogoRequest request);

    void c();

    void d();

    void onAlarmCancel();

    void onAlarmDelay();
}
