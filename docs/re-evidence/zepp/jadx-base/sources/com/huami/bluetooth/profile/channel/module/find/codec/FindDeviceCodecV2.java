package com.huami.bluetooth.profile.channel.module.find.codec;

import com.huami.bluetooth.profile.channel.module.base.CmdResponse;
import com.huami.bluetooth.profile.channel.module.base.ModuleResult;
import com.huami.bluetooth.profile.channel.module.base.ModuleResultKt;
import com.huami.bluetooth.profile.channel.module.find.DeviceFindStatus;
import com.huami.bluetooth.profile.channel.module.find.FindErrorCode;
import com.huami.tools.log.HMLog;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0014\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¨\u0006\n"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/find/codec/FindDeviceCodecV2;", "", "Lcom/huami/bluetooth/profile/channel/module/base/ModuleResult;", "", "originResponse", "Lcom/huami/bluetooth/profile/channel/module/find/DeviceFindStatus;", "decodeFindStatus", "<init>", "()V", "Companion", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class FindDeviceCodecV2 {

    @NotNull
    private static final String a = "FindDeviceCodecV2";

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "find status cmd return unsuccess";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public static final b a = new b();

        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "decode Find status failed as body is empty";
        }
    }

    @NotNull
    public final DeviceFindStatus decodeFindStatus(@NotNull ModuleResult<byte[]> originResponse) {
        CmdResponse cmdResponse = (CmdResponse) ModuleResultKt.peel(Decoder.INSTANCE.decode(originResponse));
        if (cmdResponse == null) {
            return DeviceFindStatus.Unknown;
        }
        if (cmdResponse.getCode() != FindErrorCode.OK.INSTANCE.getCode()) {
            HMLog.info(a, a.a);
            return DeviceFindStatus.Unknown;
        }
        byte[] body = cmdResponse.getBody();
        if (body != null) {
            if (!(body.length == 0)) {
                byte bFirst = ArraysKt___ArraysKt.first(body);
                if (bFirst == 1) {
                    return DeviceFindStatus.Shake;
                }
                if (bFirst != 2) {
                    return bFirst != 3 ? DeviceFindStatus.Unknown : DeviceFindStatus.ConnectHeadset;
                }
                return DeviceFindStatus.Alert;
            }
        }
        HMLog.info(a, b.a);
        return DeviceFindStatus.Unknown;
    }
}
