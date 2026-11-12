package com.huami.bluetooth.profile.channel.module.base;

import android.os.ConditionVariable;
import androidx.annotation.WorkerThread;
import com.amazon.identity.auth.device.endpoint.AbstractJSONTokenResponse;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.huami.bluetooth.profile.channel.ChannelApi;
import com.huami.bluetooth.profile.channel.ChannelResponse;
import com.huami.bluetooth.profile.channel.module.BaseModule;
import com.huami.bluetooth.profile.channel.module.base.request.BtRequest;
import com.huami.bluetooth.profile.channel.module.base.request.BtResponse;
import com.huami.bluetooth.profile.channel.module.schedule.action.DataTransferCallback;
import com.xmlywind.sdk.common.mta.PointCategory;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB\u0017\u0012\u0006\u0010\u0018\u001a\u00020\u000b\u0012\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u000e\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0007R\u001c\u0010\u0010\u001a\u00020\u000b8\u0016@\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\"\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00120\u00118\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u001e"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/base/SimpleModule;", "Lcom/huami/bluetooth/profile/channel/module/BaseModule;", "", PointCategory.INIT, "Lcom/huami/bluetooth/profile/channel/module/schedule/action/DataTransferCallback;", "interceptor", "setInterceptor", "Lcom/huami/bluetooth/profile/channel/module/base/request/BtRequest;", "request", "Lcom/huami/bluetooth/profile/channel/module/base/request/BtResponse;", "sendRequest", "", "g", LogUtil.I, "getModule", "()I", "module", "", "Lcom/huami/bluetooth/profile/channel/module/base/IResponseCallback;", "h", "Ljava/util/Map;", "requests", "i", "Lcom/huami/bluetooth/profile/channel/module/schedule/action/DataTransferCallback;", "moduleId", "Lcom/huami/bluetooth/profile/channel/ChannelApi;", "channelController", "<init>", "(ILcom/huami/bluetooth/profile/channel/ChannelApi;)V", "Companion", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public class SimpleModule extends BaseModule {
    private static final long j = 3000;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final int module;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    private final Map<BtRequest, IResponseCallback> requests;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @Nullable
    private DataTransferCallback interceptor;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/bluetooth/profile/channel/ChannelResponse;", AbstractJSONTokenResponse.RESPONSE, "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function1<ChannelResponse, Unit> {
        public a() {
            super(1);
        }

        public final void a(@NotNull ChannelResponse channelResponse) {
            byte bFirst = ArraysKt___ArraysKt.first(channelResponse.getData());
            Map map = SimpleModule.this.requests;
            SimpleModule simpleModule = SimpleModule.this;
            for (Map.Entry entry : map.entrySet()) {
                BtRequest btRequest = (BtRequest) entry.getKey();
                IResponseCallback iResponseCallback = (IResponseCallback) entry.getValue();
                if (bFirst == btRequest.getAcceptedResponseTag()) {
                    iResponseCallback.onResult(channelResponse.getData());
                    simpleModule.requests.remove(btRequest);
                }
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(ChannelResponse channelResponse) {
            a(channelResponse);
            return Unit.INSTANCE;
        }
    }

    public SimpleModule(int i, @NotNull ChannelApi channelApi) {
        super(channelApi);
        this.module = i;
        this.requests = new LinkedHashMap();
    }

    @Override // com.huami.bluetooth.profile.channel.module.BaseModule
    public int getModule() {
        return this.module;
    }

    @Override // com.huami.bluetooth.profile.channel.module.BaseModule
    public void init() {
        BaseModule.registerCallback$default(this, getModule(), false, new a(), 2, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @WorkerThread
    @NotNull
    public final BtResponse sendRequest(@NotNull BtRequest request) {
        final ConditionVariable conditionVariable = new ConditionVariable();
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        this.requests.put(request, new IResponseCallback() { // from class: com.huami.bluetooth.profile.channel.module.base.SimpleModule.sendRequest.1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.huami.bluetooth.profile.channel.module.base.IResponseCallback
            public void onResult(@NotNull byte[] data) {
                DataTransferCallback dataTransferCallback = SimpleModule.this.interceptor;
                if (dataTransferCallback != null) {
                    dataTransferCallback.onReceive(data);
                }
                objectRef.element = data;
                conditionVariable.open();
            }
        });
        DataTransferCallback dataTransferCallback = this.interceptor;
        if (dataTransferCallback != null) {
            dataTransferCallback.onSend(request.getByteArray());
        }
        if (!BaseModule.syncSendData$default(this, request.getByteArray(), 0, 2, null)) {
            return new BtResponse(false, null, 2, null);
        }
        try {
            return conditionVariable.block(3000L) ? new BtResponse(true, (byte[]) objectRef.element) : new BtResponse(false, null, 2, null);
        } catch (Exception unused) {
            return new BtResponse(false, null, 2, null);
        }
    }

    public final void setInterceptor(@NotNull DataTransferCallback interceptor) {
        this.interceptor = interceptor;
    }
}
