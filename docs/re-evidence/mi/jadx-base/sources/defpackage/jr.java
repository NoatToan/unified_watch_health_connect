package defpackage;

import android.text.TextUtils;
import com.huami.bluetooth.profile.channel.module.assistant.response.Response;
import com.huami.bluetooth.profile.channel.module.schedule.ScheduleApi;
import com.huami.bluetooth.profile.channel.module.schedule.model.ScheduleModel;
import com.huami.bluetooth.profile.channel.module.schedule.model.ScheduleStatus;
import com.smarthome.core.modelconfig.PluginDeviceInfo;
import com.xiaomi.passport.utils.LoginPreferenceConfig;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {}, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001:\u0001,B\u000f\u0012\u0006\u0010)\u001a\u00020\u0001¢\u0006\u0004\b*\u0010+J!\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007J!\u0010\f\u001a\u00020\u000b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0096@ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJ!\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u000e\u001a\u00020\tH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J'\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\bH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\rJ\b\u0010\u0014\u001a\u00020\u0011H\u0016J#\u0010\u0018\u001a\u00020\u000b2\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\u0010\u0017\u001a\u0004\u0018\u00010\u0011H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J/\u0010\u001a\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\b\u0018\u00010\u00042\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\rJ!\u0010\u001c\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\b\u0018\u00010\u0004H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ#\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u00042\b\u0010\u001e\u001a\u0004\u0018\u00010\u0005H\u0096@ø\u0001\u0000¢\u0006\u0004\b \u0010!J\u0010\u0010$\u001a\u00020\u000b2\u0006\u0010#\u001a\u00020\"H\u0016J\u0010\u0010$\u001a\u00020\u000b2\u0006\u0010#\u001a\u00020%H\u0016J\u0015\u0010&\u001a\u0004\u0018\u00010\u001fH\u0096@ø\u0001\u0000¢\u0006\u0004\b&\u0010\u001dJ'\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00020\bH\u0096@ø\u0001\u0000¢\u0006\u0004\b(\u0010\r\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006-"}, d2 = {"Ljr;", "Lcom/huami/bluetooth/profile/channel/module/schedule/ScheduleApi;", "Lcom/huami/bluetooth/profile/channel/module/schedule/model/ScheduleModel;", "item", "Lcom/huami/bluetooth/profile/channel/module/assistant/response/Response;", "", "addOrUpdate", "(Lcom/huami/bluetooth/profile/channel/module/schedule/model/ScheduleModel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "", "ids", "", "clearDataChangedStatus", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "id", "delete", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "sourceList", "deleteBySource", "moduleId", "", "msg", "errorCode", "onError", "(Ljava/lang/String;Ljava/lang/Integer;)V", "queryData", "Lcom/huami/bluetooth/profile/channel/module/schedule/model/ScheduleStatus;", "queryDataChanged", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "enableSchedule", "Lnr;", "queryProtocolVersion", "(Ljava/lang/Boolean;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkr;", "callback", LoginPreferenceConfig.TYPE_REGISTER, "Le6;", "requestCacheVersion", "items", "syncDataToDevice", "api", "<init>", "(Lcom/huami/bluetooth/profile/channel/module/schedule/ScheduleApi;)V", PluginDeviceInfo.FMODEL, "btData_wearRelease"}, k = 1, mv = {1, 7, 1})
public final class jr implements ScheduleApi {

    @NotNull
    public static final a u = new a(null);

    @NotNull
    public final ScheduleApi t;

    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Ljr$a;", "", "", "TAG", "Ljava/lang/String;", "<init>", "()V", "btData_wearRelease"}, k = 1, mv = {1, 7, 1})
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public jr(@NotNull ScheduleApi api) {
        Intrinsics.checkNotNullParameter(api, "api");
        this.t = api;
    }

    @Override // com.huami.bluetooth.profile.channel.module.schedule.ScheduleApi
    @Nullable
    public Object addOrUpdate(@NotNull ScheduleModel scheduleModel, @NotNull Continuation<? super Response<Boolean>> continuation) {
        t5t.d("ScheduleApi", "addOrUpdate schedule:" + scheduleModel);
        return this.t.addOrUpdate(scheduleModel, continuation);
    }

    @Override // com.huami.bluetooth.profile.channel.module.schedule.ScheduleApi
    @Nullable
    public Object clearDataChangedStatus(@NotNull List<Long> list, @NotNull Continuation<? super Unit> continuation) {
        t5t.d("ScheduleApi", "clearDataChangedStatus, ids:" + TextUtils.join(",", list));
        Object objClearDataChangedStatus = this.t.clearDataChangedStatus(list, continuation);
        return objClearDataChangedStatus == IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objClearDataChangedStatus : Unit.INSTANCE;
    }

    @Override // com.huami.bluetooth.profile.channel.module.schedule.ScheduleApi
    @Nullable
    public Object delete(long j, @NotNull Continuation<? super Response<Boolean>> continuation) {
        t5t.d("ScheduleApi", "delete schedule:" + j);
        return this.t.delete(j, continuation);
    }

    @Override // com.huami.bluetooth.profile.channel.module.schedule.ScheduleApi
    @Nullable
    public Object deleteBySource(@NotNull List<Integer> list, @NotNull Continuation<? super Response<Boolean>> continuation) {
        return this.t.deleteBySource(list, continuation);
    }

    @Override // com.huami.bluetooth.profile.channel.module.schedule.ScheduleApi
    public int moduleId() {
        return this.t.moduleId();
    }

    @Override // com.huami.bluetooth.profile.channel.module.schedule.ScheduleApi
    public void onError(@Nullable String msg, @Nullable Integer errorCode) {
        this.t.onError(msg, errorCode);
    }

    @Override // com.huami.bluetooth.profile.channel.module.schedule.ScheduleApi
    @Nullable
    public Object queryData(@NotNull List<Long> list, @NotNull Continuation<? super Response<List<ScheduleModel>>> continuation) {
        t5t.d("ScheduleApi", "querySchedule, ids:" + TextUtils.join(",", list));
        return this.t.queryData(list, continuation);
    }

    @Override // com.huami.bluetooth.profile.channel.module.schedule.ScheduleApi
    @Nullable
    public Object queryDataChanged(@NotNull Continuation<? super Response<List<ScheduleStatus>>> continuation) {
        t5t.d("ScheduleApi", "queryDataChanged");
        return this.t.queryDataChanged(continuation);
    }

    @Override // com.huami.bluetooth.profile.channel.module.schedule.ScheduleApi
    @Nullable
    public Object queryProtocolVersion(@Nullable Boolean bool, @NotNull Continuation<? super Response<ScheduleVersion>> continuation) {
        t5t.d("ScheduleApi", "queryProtocolVersion");
        return this.t.queryProtocolVersion(bool, continuation);
    }

    @Override // com.huami.bluetooth.profile.channel.module.schedule.ScheduleApi
    public void register(@NotNull kr callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.t.register(callback);
    }

    @Override // com.huami.bluetooth.profile.channel.module.schedule.ScheduleApi
    @Nullable
    public Object requestCacheVersion(@NotNull Continuation<? super ScheduleVersion> continuation) {
        return this.t.requestCacheVersion(continuation);
    }

    @Override // com.huami.bluetooth.profile.channel.module.schedule.ScheduleApi
    @Nullable
    public Object syncDataToDevice(@NotNull List<ScheduleModel> list, @NotNull Continuation<? super Response<Boolean>> continuation) {
        t5t.d("ScheduleApi", "syncDataToDevice, items:" + TextUtils.join(",", list));
        return this.t.syncDataToDevice(list, continuation);
    }

    @Override // com.huami.bluetooth.profile.channel.module.schedule.ScheduleApi
    public void register(@NotNull e6 callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.t.register(callback);
    }
}
