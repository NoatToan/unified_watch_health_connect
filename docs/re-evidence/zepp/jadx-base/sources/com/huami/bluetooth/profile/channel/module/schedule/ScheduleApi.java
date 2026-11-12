package com.huami.bluetooth.profile.channel.module.schedule;

import com.huami.bluetooth.profile.channel.module.assistant.response.Response;
import com.huami.bluetooth.profile.channel.module.schedule.action.DataTransferCallback;
import com.huami.bluetooth.profile.channel.module.schedule.model.ScheduleModel;
import com.huami.bluetooth.profile.channel.module.schedule.model.ScheduleStatus;
import com.huami.bluetooth.profile.channel.module.schedule.model.ScheduleVersion;
import java.io.Serializable;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000e\n\u0002\b\u0006\bf\u0018\u0000 )2\u00020\u0001:\u0001)J\b\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H&J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\bH&J%\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tH¦@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ!\u0010\u0011\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f\u0018\u00010\u000bH¦@ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012J/\u0010\u0016\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u000f\u0018\u00010\u000b2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u000fH¦@ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017J!\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\t0\u000b2\u0006\u0010\u0018\u001a\u00020\u0015H¦@ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ!\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\t0\u000b2\u0006\u0010\u001b\u001a\u00020\u0013H¦@ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ'\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\t0\u000b2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00020\u000fH¦@ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010\u0017J'\u0010!\u001a\b\u0012\u0004\u0012\u00020\t0\u000b2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00150\u000fH¦@ø\u0001\u0000¢\u0006\u0004\b!\u0010\u0017J!\u0010\"\u001a\u00020\u00062\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u000fH¦@ø\u0001\u0000¢\u0006\u0004\b\"\u0010\u0017J\u0015\u0010#\u001a\u0004\u0018\u00010\fH¦@ø\u0001\u0000¢\u0006\u0004\b#\u0010\u0012J#\u0010'\u001a\u00020\u00062\b\u0010%\u001a\u0004\u0018\u00010$2\b\u0010&\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b'\u0010(\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006*"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/schedule/ScheduleApi;", "Ljava/io/Serializable;", "", "moduleId", "Lcom/huami/bluetooth/profile/channel/module/schedule/ScheduleCallback;", "callback", "", "register", "Lcom/huami/bluetooth/profile/channel/module/schedule/action/DataTransferCallback;", "", "enableSchedule", "Lcom/huami/bluetooth/profile/channel/module/assistant/response/Response;", "Lcom/huami/bluetooth/profile/channel/module/schedule/model/ScheduleVersion;", "queryProtocolVersion", "(Ljava/lang/Boolean;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "Lcom/huami/bluetooth/profile/channel/module/schedule/model/ScheduleStatus;", "queryDataChanged", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "ids", "Lcom/huami/bluetooth/profile/channel/module/schedule/model/ScheduleModel;", "queryData", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "item", "addOrUpdate", "(Lcom/huami/bluetooth/profile/channel/module/schedule/model/ScheduleModel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "id", "delete", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sourceList", "deleteBySource", "items", "syncDataToDevice", "clearDataChangedStatus", "requestCacheVersion", "", "msg", "errorCode", "onError", "(Ljava/lang/String;Ljava/lang/Integer;)V", "Companion", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public interface ScheduleApi extends Serializable {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.a;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0016\u0010\u0005\u001a\u00020\u00028\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/schedule/ScheduleApi$Companion;", "", "", "b", "J", "serialVersionUID", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        public static final /* synthetic */ Companion a = new Companion();

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private static final long serialVersionUID = 1;

        private Companion() {
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public static final class DefaultImpls {
        public static /* synthetic */ Object queryProtocolVersion$default(ScheduleApi scheduleApi, Boolean bool, Continuation continuation, int i, Object obj) {
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

    void register(@NotNull ScheduleCallback callback);

    void register(@NotNull DataTransferCallback callback);

    @Nullable
    Object requestCacheVersion(@NotNull Continuation<? super ScheduleVersion> continuation);

    @Nullable
    Object syncDataToDevice(@NotNull List<ScheduleModel> list, @NotNull Continuation<? super Response<Boolean>> continuation);
}
