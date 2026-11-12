package defpackage;

import com.huami.bluetooth.profile.channel.module.assistant.response.Response;
import com.huami.bluetooth.profile.channel.module.schedule.model.ScheduleModel;
import com.huami.bluetooth.profile.channel.module.schedule.model.ScheduleStatus;
import com.smarthome.core.modelconfig.PluginDeviceInfo;
import com.xiaomi.onetrack.api.b;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001c\u0010\u0007\u001a\u00020\u00062\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002H&J\u0016\u0010\t\u001a\u00020\u00062\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\b0\u0002H&J\u0016\u0010\n\u001a\u00020\u00062\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\b0\u0002H&J\u0016\u0010\u000b\u001a\u00020\u00062\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\b0\u0002H&J#\u0010\u0010\u001a\u00020\u00062\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH&¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\t\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0012H&¨\u0006\u0014"}, d2 = {"Lkr;", "", "Lcom/huami/bluetooth/profile/channel/module/assistant/response/Response;", "", "Lcom/huami/bluetooth/profile/channel/module/schedule/model/ScheduleModel;", b.I, "", PluginDeviceInfo.FICONOFF, "", PluginDeviceInfo.FMODEL, PluginDeviceInfo.FICONON, PluginDeviceInfo.FDESC, "", "msg", "", "code", "onError", "(Ljava/lang/String;Ljava/lang/Integer;)V", "Lcom/huami/bluetooth/profile/channel/module/schedule/model/ScheduleStatus;", "item", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public interface kr {
    void a(@NotNull Response<Boolean> response);

    void a(@NotNull ScheduleStatus item);

    void b(@NotNull Response<Boolean> response);

    void c(@NotNull Response<Boolean> response);

    void d(@NotNull Response<List<ScheduleModel>> response);

    void onError(@Nullable String msg, @Nullable Integer code);
}
