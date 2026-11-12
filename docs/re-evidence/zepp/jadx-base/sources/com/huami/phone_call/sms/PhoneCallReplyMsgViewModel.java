package com.huami.phone_call.sms;

import androidx.exifinterface.media.ExifInterface;
import androidx.p008lifecycle.MutableLiveData;
import androidx.p008lifecycle.ViewModel;
import androidx.p008lifecycle.ViewModelKt;
import com.amazon.identity.auth.device.endpoint.AbstractJSONTokenResponse;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.bluetooth.profile.channel.module.assistant.response.Response;
import com.huami.bluetooth.profile.channel.module.assistant.response.Success;
import com.huami.bluetooth.profile.channel.module.call_reply.CallReplyApi;
import com.huami.bluetooth.profile.channel.module.call_reply.CallReplyModule;
import com.huami.bluetooth.profile.channel.module.call_reply.ReplyMsg;
import com.huami.bluetooth.profile.channel.module.call_reply.Version;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import com.xiaomi.hm.health.bt.device.HMMiLiProDevice;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u0000 62\u00020\u0001:\u0001\u001bB\u000f\u0012\u0006\u0010\u001d\u001a\u00020\u001a¢\u0006\u0004\b4\u00105J3\u0010\b\u001a\u00020\u0006\"\u0004\b\u0000\u0010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00060\u0005H\u0082\bJ&\u0010\u000b\u001a\u00020\u00062\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\t0\u00032\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\nH\u0002J\u0006\u0010\f\u001a\u00020\tJ\u0006\u0010\r\u001a\u00020\u0006J\u000e\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000eJ\u000e\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000eJ\u0014\u0010\u0014\u001a\u00020\u00062\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0012J\u001e\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0015R\u0016\u0010\u001d\u001a\u00020\u001a8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR%\u0010#\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u001f0\u001e8\u0006@\u0006¢\u0006\f\n\u0004\b\u000b\u0010 \u001a\u0004\b!\u0010\"R\u001f\u0010%\u001a\b\u0012\u0004\u0012\u00020\u000e0\u001e8\u0006@\u0006¢\u0006\f\n\u0004\b\b\u0010 \u001a\u0004\b$\u0010\"R\u001f\u0010(\u001a\b\u0012\u0004\u0012\u00020\t0\u001e8\u0006@\u0006¢\u0006\f\n\u0004\b&\u0010 \u001a\u0004\b'\u0010\"R\u0018\u0010,\u001a\u0004\u0018\u00010)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+R\u0018\u0010/\u001a\u0004\u0018\u00010-8B@\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010.R\u0013\u00103\u001a\u0002008F@\u0006¢\u0006\u0006\u001a\u0004\b1\u00102¨\u00067"}, d2 = {"Lcom/huami/phone_call/sms/PhoneCallReplyMsgViewModel;", "Landroidx/lifecycle/ViewModel;", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/huami/bluetooth/profile/channel/module/assistant/response/Response;", AbstractJSONTokenResponse.RESPONSE, "Lkotlin/Function1;", "", "successBlock", "c", "", "Lkotlin/Function0;", "b", "isFull", "queryData", "Lcom/huami/bluetooth/profile/channel/module/call_reply/ReplyMsg;", "msg", "addOrUpdate", "delete", "", "msgList", "sync", "", "title", "replyNo", "content", "sendMessage", "Lcom/huami/phone_call/sms/DeviceCenter;", "a", "Lcom/huami/phone_call/sms/DeviceCenter;", "deviceCenter", "Landroidx/lifecycle/MutableLiveData;", "", "Landroidx/lifecycle/MutableLiveData;", "getMsgLiveData", "()Landroidx/lifecycle/MutableLiveData;", "msgLiveData", "getAddOrUpdateLiveData", "addOrUpdateLiveData", GoogleApiAvailabilityLight.a, "getResultLiveData", "resultLiveData", "Lcom/huami/bluetooth/profile/channel/module/call_reply/Version;", "e", "Lcom/huami/bluetooth/profile/channel/module/call_reply/Version;", "version", "Lcom/huami/bluetooth/profile/channel/module/call_reply/CallReplyApi;", "()Lcom/huami/bluetooth/profile/channel/module/call_reply/CallReplyApi;", "api", "", "getMaxCount", "()I", "maxCount", "<init>", "(Lcom/huami/phone_call/sms/DeviceCenter;)V", "f", "phone_call_sms_release"}, k = 1, mv = {1, 5, 1})
public final class PhoneCallReplyMsgViewModel extends ViewModel {

    @Deprecated
    @NotNull
    public static final String TAG = "PhoneCallReplyMsgViewModel";

    @NotNull
    private static final a f = new a(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final DeviceCenter deviceCenter;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<List<ReplyMsg>> msgLiveData = new MutableLiveData<>(new ArrayList());

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<ReplyMsg> addOrUpdateLiveData = new MutableLiveData<>();

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final MutableLiveData<Boolean> resultLiveData = new MutableLiveData<>();

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    private Version version;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"com/huami/phone_call/sms/PhoneCallReplyMsgViewModel$a", "", "", "TAG", "Ljava/lang/String;", "<init>", "()V", "phone_call_sms_release"}, k = 1, mv = {1, 5, 1})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<Unit> {
        public final /* synthetic */ ReplyMsg b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(ReplyMsg replyMsg) {
            super(0);
            this.b = replyMsg;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            List<ReplyMsg> value = PhoneCallReplyMsgViewModel.this.getMsgLiveData().getValue();
            if (value == null) {
                value = new ArrayList<>();
            }
            ReplyMsg replyMsg = this.b;
            Iterator<ReplyMsg> it2 = value.iterator();
            int i = 0;
            while (true) {
                if (!it2.hasNext()) {
                    i = -1;
                    break;
                } else {
                    if (it2.next().getId() == replyMsg.getId()) {
                        break;
                    } else {
                        i++;
                    }
                }
            }
            if (i < 0) {
                value.add(this.b);
            } else {
                value.set(i, this.b);
            }
            PhoneCallReplyMsgViewModel.this.getAddOrUpdateLiveData().postValue(this.b);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<String> {
        public static final c a = new c();

        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "Device not HMMiLiProDevice";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<Unit> {
        public final /* synthetic */ ReplyMsg b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(ReplyMsg replyMsg) {
            super(0);
            this.b = replyMsg;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            List<ReplyMsg> value = PhoneCallReplyMsgViewModel.this.getMsgLiveData().getValue();
            if (value == null) {
                value = new ArrayList<>();
            }
            ReplyMsg replyMsg = this.b;
            Iterator<ReplyMsg> it2 = value.iterator();
            int i = 0;
            while (true) {
                if (!it2.hasNext()) {
                    i = -1;
                    break;
                } else {
                    if (it2.next().getId() == replyMsg.getId()) {
                        break;
                    } else {
                        i++;
                    }
                }
            }
            if (i >= 0) {
                value.remove(i);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function0<Unit> {
        public static final e a = new e();

        public e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class f extends Lambda implements Function0<Unit> {
        public final /* synthetic */ List<ReplyMsg> b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(List<ReplyMsg> list) {
            super(0);
            this.b = list;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            List<ReplyMsg> value = PhoneCallReplyMsgViewModel.this.getMsgLiveData().getValue();
            if (value == null) {
                return;
            }
            List<ReplyMsg> list = this.b;
            value.clear();
            value.addAll(list);
        }
    }

    public PhoneCallReplyMsgViewModel(@NotNull DeviceCenter deviceCenter) {
        this.deviceCenter = deviceCenter;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CallReplyApi a() {
        HMBaseDevice device = this.deviceCenter.getDevice();
        if (device == null) {
            return null;
        }
        if (!(device instanceof HMMiLiProDevice)) {
            HMLog.error$default(TAG, null, null, c.a, 6, null);
            return null;
        }
        CallReplyModule callReplyModule = (CallReplyModule) device.getChannelModule(CallReplyModule.class);
        if (callReplyModule == null) {
            return null;
        }
        return callReplyModule.loadApi();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b(Response<Boolean> response, Function0<Unit> successBlock) {
        if (response instanceof Success) {
            Success success = (Success) response;
            if (((Boolean) success.getData()).booleanValue()) {
                successBlock.invoke();
                this.resultLiveData.postValue((Boolean) success.getData());
                return;
            }
        }
        this.resultLiveData.postValue(Boolean.FALSE);
    }

    private final <T> void c(Response<T> response, Function1<? super T, Unit> successBlock) {
        if (!(response instanceof Success)) {
            getResultLiveData().postValue(Boolean.FALSE);
        } else {
            getResultLiveData().postValue(Boolean.TRUE);
            successBlock.invoke((Object) ((Success) response).getData());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void e(PhoneCallReplyMsgViewModel phoneCallReplyMsgViewModel, Response response, Function0 function0, int i, Object obj) {
        if ((i & 2) != 0) {
            function0 = e.a;
        }
        phoneCallReplyMsgViewModel.b(response, function0);
    }

    public static /* synthetic */ void f(PhoneCallReplyMsgViewModel phoneCallReplyMsgViewModel, Response response, Function1 function1, int i, Object obj) {
        if ((i & 2) != 0) {
            function1 = new Function1<T, Unit>() { // from class: com.huami.phone_call.sms.PhoneCallReplyMsgViewModel$postResult$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Object obj2) {
                    invoke2(obj2);
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(T t) {
                }
            };
        }
        if (!(response instanceof Success)) {
            phoneCallReplyMsgViewModel.getResultLiveData().postValue(Boolean.FALSE);
        } else {
            phoneCallReplyMsgViewModel.getResultLiveData().postValue(Boolean.TRUE);
            function1.invoke(((Success) response).getData());
        }
    }

    public final void addOrUpdate(@NotNull ReplyMsg msg) {
        kotlinx.coroutines.e.f(ViewModelKt.getViewModelScope(this), com.huami.phone_call.sms.ktx.ViewModelKt.getExceptionHandler().plus(Dispatchers.getIO()), null, new PhoneCallReplyMsgViewModel$addOrUpdate$$inlined$safeLaunch$1(null, this, msg), 2, null);
    }

    public final void delete(@NotNull ReplyMsg msg) {
        kotlinx.coroutines.e.f(ViewModelKt.getViewModelScope(this), com.huami.phone_call.sms.ktx.ViewModelKt.getExceptionHandler().plus(Dispatchers.getIO()), null, new PhoneCallReplyMsgViewModel$delete$$inlined$safeLaunch$1(null, this, msg), 2, null);
    }

    @NotNull
    public final MutableLiveData<ReplyMsg> getAddOrUpdateLiveData() {
        return this.addOrUpdateLiveData;
    }

    public final int getMaxCount() {
        Version version = this.version;
        if (version == null) {
            return 0;
        }
        return version.getMaxReplyMsgCount();
    }

    @NotNull
    public final MutableLiveData<List<ReplyMsg>> getMsgLiveData() {
        return this.msgLiveData;
    }

    @NotNull
    public final MutableLiveData<Boolean> getResultLiveData() {
        return this.resultLiveData;
    }

    public final boolean isFull() {
        List<ReplyMsg> value = this.msgLiveData.getValue();
        Integer numValueOf = value == null ? null : Integer.valueOf(value.size());
        return numValueOf != null && numValueOf.intValue() >= getMaxCount();
    }

    public final void queryData() {
        kotlinx.coroutines.e.f(ViewModelKt.getViewModelScope(this), com.huami.phone_call.sms.ktx.ViewModelKt.getExceptionHandler().plus(Dispatchers.getIO()), null, new PhoneCallReplyMsgViewModel$queryData$$inlined$safeLaunch$1(null, this), 2, null);
    }

    public final void sendMessage(@NotNull String title, @NotNull String replyNo, @NotNull String content) {
        kotlinx.coroutines.e.f(ViewModelKt.getViewModelScope(this), com.huami.phone_call.sms.ktx.ViewModelKt.getExceptionHandler().plus(Dispatchers.getIO()), null, new PhoneCallReplyMsgViewModel$sendMessage$$inlined$safeLaunch$1(null, this, title, replyNo, content), 2, null);
    }

    public final void sync(@NotNull List<ReplyMsg> msgList) {
        kotlinx.coroutines.e.f(ViewModelKt.getViewModelScope(this), com.huami.phone_call.sms.ktx.ViewModelKt.getExceptionHandler().plus(Dispatchers.getIO()), null, new PhoneCallReplyMsgViewModel$sync$$inlined$safeLaunch$1(null, this, msgList), 2, null);
    }
}
