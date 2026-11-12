package com.huami.assistant.ui.v2.repo;

import com.huami.bluetooth.profile.channel.module.schedule.ScheduleCallback;
import com.huami.bluetooth.profile.channel.module.schedule.model.ScheduleModel;
import com.huami.bluetooth.profile.channel.module.schedule.model.ScheduleVersion;
import com.huami.watch.notification.TransportUri;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H&J\u000e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&J\u0016\u0010\t\u001a\u00020\b2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0002H&J\u0010\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0003H&J\u0010\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0006H&J\u0016\u0010\u0011\u001a\u00020\u000b2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0002H&J\b\u0010\u0013\u001a\u00020\u0012H&J\u0010\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u0014H&¨\u0006\u0017"}, d2 = {"Lcom/huami/assistant/ui/v2/repo/ScheduleRpcApi;", "", "", "Lcom/huami/bluetooth/profile/channel/module/schedule/model/ScheduleModel;", "findAll", "findChanges", "", "ids", "", "clearDeviceChanges", "event", "", TransportUri.ACTION_ADD, "id", "deleteById", "", "sourceList", "deleteBySource", "Lcom/huami/bluetooth/profile/channel/module/schedule/model/ScheduleVersion;", "queryVersion", "Lcom/huami/bluetooth/profile/channel/module/schedule/ScheduleCallback;", "callback", "register", "assistant_release"}, k = 1, mv = {1, 5, 1})
public interface ScheduleRpcApi {
    boolean add(@NotNull ScheduleModel event);

    void clearDeviceChanges(@NotNull List<Long> ids);

    boolean deleteById(long id);

    boolean deleteBySource(@NotNull List<Integer> sourceList);

    @Nullable
    List<ScheduleModel> findAll();

    @NotNull
    List<ScheduleModel> findChanges();

    @NotNull
    ScheduleVersion queryVersion();

    void register(@NotNull ScheduleCallback callback);
}
