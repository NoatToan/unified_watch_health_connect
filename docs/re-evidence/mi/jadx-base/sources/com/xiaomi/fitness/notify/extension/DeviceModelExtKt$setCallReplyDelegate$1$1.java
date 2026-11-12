package com.xiaomi.fitness.notify.extension;

import com.huami.bluetooth.profile.channel.module.call_reply.CallReplyDelegate;
import com.huami.bluetooth.profile.channel.module.call_reply.ReplyMsg;
import com.huami.bluetooth.profile.channel.module.call_reply.SmsPermission;
import com.xiaomi.fitness.baseui.utils.PermissionsUtil;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.device.manager.export.HuamiApiCaller;
import com.xiaomi.fitness.notify.extension.DeviceModelExtKt$setCallReplyDelegate$1$1;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\b\u0010\b\u001a\u00020\u0003H\u0016¨\u0006\t"}, d2 = {"com/xiaomi/fitness/notify/extension/DeviceModelExtKt$setCallReplyDelegate$1$1", "Lcom/huami/bluetooth/profile/channel/module/call_reply/CallReplyDelegate;", "requestCallReply", "", "phoneNo", "", "msg", "Lcom/huami/bluetooth/profile/channel/module/call_reply/ReplyMsg;", "requestSmsPermission", "notify_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class DeviceModelExtKt$setCallReplyDelegate$1$1 implements CallReplyDelegate {
    final /* synthetic */ HuamiApiCaller $apiCaller;

    public DeviceModelExtKt$setCallReplyDelegate$1$1(HuamiApiCaller huamiApiCaller) {
        this.$apiCaller = huamiApiCaller;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit requestCallReply$lambda$0(HuamiApiCaller apiCaller, boolean z) {
        Intrinsics.checkNotNullParameter(apiCaller, "$apiCaller");
        apiCaller.sendReplyResult(z);
        return Unit.INSTANCE;
    }

    @Override // com.huami.bluetooth.profile.channel.module.call_reply.CallReplyDelegate
    public void requestCallReply(String phoneNo, ReplyMsg msg) {
        Intrinsics.checkNotNullParameter(phoneNo, "phoneNo");
        Intrinsics.checkNotNullParameter(msg, "msg");
        if (PermissionsUtil.shouldRequestPermission(new String[]{"android.permission.SEND_SMS"})) {
            this.$apiCaller.sendReplyResult(false);
            return;
        }
        String content = msg.getContent();
        final HuamiApiCaller huamiApiCaller = this.$apiCaller;
        DeviceModelExtKt.sendSms(phoneNo, content, new Function1() { // from class: pa6
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return DeviceModelExtKt$setCallReplyDelegate$1$1.requestCallReply$lambda$0(huamiApiCaller, ((Boolean) obj).booleanValue());
            }
        });
    }

    @Override // com.huami.bluetooth.profile.channel.module.call_reply.CallReplyDelegate
    public void requestSmsPermission() {
        boolean z = !PermissionsUtil.shouldRequestPermission(new String[]{"android.permission.SEND_SMS"});
        if (z) {
            SmsPermission.Authorized authorized = SmsPermission.Authorized.INSTANCE;
        } else {
            SmsPermission.Unauthorized unauthorized = SmsPermission.Unauthorized.INSTANCE;
        }
        Logger.d("setCallReplyDelegate requestSmsPermission:" + z, new Object[0]);
        this.$apiCaller.sendSmsPermission(z);
    }
}
