package com.huami.bluetooth.profile.channel.module.schedule;

import com.huami.bluetooth.profile.channel.module.assistant.response.Response;
import com.huami.bluetooth.profile.channel.module.schedule.model.ScheduleModel;
import com.huami.bluetooth.profile.channel.module.schedule.model.ScheduleStatus;
import com.smarthome.core.modelconfig.PluginDeviceInfo;
import com.xiaomi.passport.utils.LoginPreferenceConfig;
import defpackage.ScheduleVersion;
import defpackage.e6;
import defpackage.kr;
import java.io.Serializable;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000e\n\u0002\b\u0007\bf\u0018\u0000 )2\u00020\u0001:\u0001*J\b\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H&J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\bH&J%\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tH¦@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ!\u0010\u0011\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f\u0018\u00010\u000bH¦@ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012J/\u0010\u0016\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u000f\u0018\u00010\u000b2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u000fH¦@ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017J!\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\t0\u000b2\u0006\u0010\u0018\u001a\u00020\u0015H¦@ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ!\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\t0\u000b2\u0006\u0010\u001b\u001a\u00020\u0013H¦@ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ'\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\t0\u000b2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00020\u000fH¦@ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010\u0017J'\u0010!\u001a\b\u0012\u0004\u0012\u00020\t0\u000b2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00150\u000fH¦@ø\u0001\u0000¢\u0006\u0004\b!\u0010\u0017J!\u0010\"\u001a\u00020\u00062\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u000fH¦@ø\u0001\u0000¢\u0006\u0004\b\"\u0010\u0017J\u0015\u0010#\u001a\u0004\u0018\u00010\fH¦@ø\u0001\u0000¢\u0006\u0004\b#\u0010\u0012J#\u0010'\u001a\u00020\u00062\b\u0010%\u001a\u0004\u0018\u00010$2\b\u0010&\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b'\u0010(\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006+"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/schedule/ScheduleApi;", "Ljava/io/Serializable;", "", "moduleId", "Lkr;", "callback", "", LoginPreferenceConfig.TYPE_REGISTER, "Le6;", "", "enableSchedule", "Lcom/huami/bluetooth/profile/channel/module/assistant/response/Response;", "Lnr;", "queryProtocolVersion", "(Ljava/lang/Boolean;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "Lcom/huami/bluetooth/profile/channel/module/schedule/model/ScheduleStatus;", "queryDataChanged", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "ids", "Lcom/huami/bluetooth/profile/channel/module/schedule/model/ScheduleModel;", "queryData", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "item", "addOrUpdate", "(Lcom/huami/bluetooth/profile/channel/module/schedule/model/ScheduleModel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "id", "delete", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sourceList", "deleteBySource", "items", "syncDataToDevice", "clearDataChangedStatus", "requestCacheVersion", "", "msg", "errorCode", "onError", "(Ljava/lang/String;Ljava/lang/Integer;)V", "Companion", PluginDeviceInfo.FMODEL, "bluetooth_release"}, k = 1, mv = {1, 7, 1})
public interface ScheduleApi extends Serializable {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.f9868a;

    /* JADX INFO: renamed from: com.huami.bluetooth.profile.channel.module.schedule.ScheduleApi$a, reason: from kotlin metadata */
    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/schedule/ScheduleApi$a;", "", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ Companion f9868a = new Companion();
    }

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class b {
        public static /* synthetic */ Object a(ScheduleApi scheduleApi, Boolean bool, Continuation continuation, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: queryProtocolVersion");
            }
            if ((i & 1) != 0) {
                bool = null;
            }
            return scheduleApi.queryProtocolVersion(bool, continuation);
        }
    }

    @Nullable
    Object addOrUpdate(@NotNull ScheduleModel scheduleModel, @NotNull Continuation<? super Response<Boolean>> continuation);

    @Nullable
    Object clearDataChangedStatus(@NotNull List<Long> list, @NotNull Continuation<? super Unit> continuation);

    @Nullable
    Object delete(long j, @NotNull Continuation<? super Response<Boolean>> continuation);

    @Nullable
    Object deleteBySource(@NotNull List<Integer> list, @NotNull Continuation<? super Response<Boolean>> continuation);

    int moduleId();

    void onError(@Nullable String msg, @Nullable Integer errorCode);

    @Nullable
    Object queryData(@NotNull List<Long> list, @NotNull Continuation<? super Response<List<ScheduleModel>>> continuation);

    @Nullable
    Object queryDataChanged(@NotNull Continuation<? super Response<List<ScheduleStatus>>> continuation);

    @Nullable
    Object queryProtocolVersion(@Nullable Boolean bool, @NotNull Continuation<? super Response<ScheduleVersion>> continuation);

    void register(@NotNull e6 callback);

    void register(@NotNull kr callback);

    @Nullable
    Object requestCacheVersion(@NotNull Continuation<? super ScheduleVersion> continuation);

    @Nullable
    Object syncDataToDevice(@NotNull List<ScheduleModel> list, @NotNull Continuation<? super Response<Boolean>> continuation);
}
