package com.huami.bluetooth.profile.channel.module.customvibrate;

import com.huami.bluetooth.profile.channel.ChannelApi;
import com.huami.bluetooth.profile.channel.module.BaseModule;
import com.huami.bluetooth.profile.channel.module.annotation.ChannelModule;
import com.huami.bluetooth.profile.channel.module.base.ModuleRequest;
import com.huami.bluetooth.profile.channel.module.base.ResponsePredict;
import com.huami.bluetooth.profile.channel.module.base.Success;
import com.huami.bluetooth.utils.ByteUtilsKt;
import com.xiaomi.hm.health.bt.debug.Debug;
import com.xiaomi.hm.health.bt.model.HMVibrateInfo;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@ChannelModule(id = 24)
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u000e2\u00020\u00012\u00020\u0002:\u0001\u000eB\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0011\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¨\u0006\u000f"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/customvibrate/MotorVibrateModule;", "Lcom/huami/bluetooth/profile/channel/module/BaseModule;", "Lcom/huami/bluetooth/profile/channel/module/customvibrate/CustomVibrateApi;", "", "queryVersion", "()Ljava/lang/Byte;", "Lcom/xiaomi/hm/health/bt/model/HMVibrateInfo;", "vibrateInfo", "", "setCustomVibrate", "Lcom/huami/bluetooth/profile/channel/ChannelApi;", "channelApi", "<init>", "(Lcom/huami/bluetooth/profile/channel/ChannelApi;)V", "Companion", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class MotorVibrateModule extends BaseModule implements CustomVibrateApi {

    @NotNull
    private static final String g = "MotorVibrateModule";

    public MotorVibrateModule(@NotNull ChannelApi channelApi) {
        super(channelApi);
    }

    @Override // com.huami.bluetooth.profile.channel.module.customvibrate.CustomVibrateApi
    @Nullable
    public Byte queryVersion() {
        Object objM3845constructorimpl;
        ModuleRequest moduleRequest = new ModuleRequest(new MotorVibrateCommand.QueryVersionCommand(), new ResponsePredict() { // from class: com.huami.bluetooth.profile.channel.module.customvibrate.MotorVibrateModule$queryVersion$request$1
            @Override // com.huami.bluetooth.profile.channel.module.base.ResponsePredict
            public boolean predict(@NotNull ModuleRequest request, @NotNull byte[] response) {
                return ArraysKt___ArraysKt.first(new MotorVibrateCommand.QueryVersionResponseCommand().getOrg.cybergarage.http.HTTP.CONTENT_RANGE_BYTES java.lang.String()) == ArraysKt___ArraysKt.first(response);
            }
        }, 0L, null, false, 28, null);
        try {
            Result.Companion companion = Result.Companion;
            objM3845constructorimpl = Result.m3845constructorimpl(Byte.valueOf(((byte[]) ((Success) sendRequest(moduleRequest)).getData())[1]));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th));
        }
        Throwable thM3848exceptionOrNullimpl = Result.m3848exceptionOrNullimpl(objM3845constructorimpl);
        if (thM3848exceptionOrNullimpl != null) {
            Debug.fi(g, Intrinsics.stringPlus("queryVersion: ", thM3848exceptionOrNullimpl));
        }
        if (Result.m3850isFailureimpl(objM3845constructorimpl)) {
            objM3845constructorimpl = null;
        }
        return (Byte) objM3845constructorimpl;
    }

    @Override // com.huami.bluetooth.profile.channel.module.customvibrate.CustomVibrateApi
    public boolean setCustomVibrate(@NotNull HMVibrateInfo vibrateInfo) {
        Object objM3845constructorimpl;
        byte[] moduleBleBytes = vibrateInfo.toModuleBleBytes();
        if (moduleBleBytes == null) {
            return false;
        }
        ModuleRequest moduleRequest = new ModuleRequest(new MotorVibrateCommand.SetMotorVibrateParametersCommand().withBytes(moduleBleBytes), new ResponsePredict() { // from class: com.huami.bluetooth.profile.channel.module.customvibrate.MotorVibrateModule$setCustomVibrate$request$1
            @Override // com.huami.bluetooth.profile.channel.module.base.ResponsePredict
            public boolean predict(@NotNull ModuleRequest request, @NotNull byte[] response) {
                return ArraysKt___ArraysKt.first(new MotorVibrateCommand.SetMotorVibrateParametersResponseCommand().getOrg.cybergarage.http.HTTP.CONTENT_RANGE_BYTES java.lang.String()) == ArraysKt___ArraysKt.first(response);
            }
        }, 0L, null, false, 28, null);
        try {
            Result.Companion companion = Result.Companion;
            objM3845constructorimpl = Result.m3845constructorimpl(Boolean.valueOf(ByteUtilsKt.toBoolean(((byte[]) ((Success) sendRequest(moduleRequest)).getData())[1])));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th));
        }
        Throwable thM3848exceptionOrNullimpl = Result.m3848exceptionOrNullimpl(objM3845constructorimpl);
        if (thM3848exceptionOrNullimpl != null) {
            Debug.fi(g, Intrinsics.stringPlus("set motor: ", thM3848exceptionOrNullimpl));
        }
        Boolean bool = Boolean.FALSE;
        if (Result.m3850isFailureimpl(objM3845constructorimpl)) {
            objM3845constructorimpl = bool;
        }
        return ((Boolean) objM3845constructorimpl).booleanValue();
    }
}
