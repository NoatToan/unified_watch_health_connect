package com.huami.device.event.br;

import com.huami.tools.log.HMLog;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u0000 \b2\u00020\u0001:\u0001\tB\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\n"}, d2 = {"Lcom/huami/device/event/br/DefReceiver;", "Lcom/huami/device/event/br/DeviceLifeBroadCastReceiver;", "Lcom/huami/device/event/br/DeviceInfoParcel;", "info", "", "handleStatus", "<init>", "()V", "Companion", "a", "devicelifeevent_release"}, k = 1, mv = {1, 4, 0})
public final class DefReceiver extends DeviceLifeBroadCastReceiver {

    @NotNull
    public static final String TAG = "DefReceiver";

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 0})
    public static final class b extends Lambda implements Function0<String> {
        public final /* synthetic */ DeviceInfoParcel a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(DeviceInfoParcel deviceInfoParcel) {
            super(0);
            this.a = deviceInfoParcel;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final String invoke() {
            return "info [" + this.a.getStatus() + "] ==> " + this.a;
        }
    }

    @Override // com.huami.device.event.br.DeviceLifeBroadCastReceiver
    public void handleStatus(@NotNull DeviceInfoParcel info) {
        HMLog.debug(TAG, new b(info));
    }
}
