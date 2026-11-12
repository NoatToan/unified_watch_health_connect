package com.huami.bluetooth.profile.channel.module.customvibrate;

import com.huami.bluetooth.profile.channel.module.a;
import com.smarthome.core.modelconfig.PluginDeviceInfo;
import defpackage.MotorVibrateCommand;
import defpackage.c3;
import defpackage.d4;
import defpackage.fu;
import defpackage.nl;
import defpackage.ol;
import defpackage.qos;
import defpackage.qq;
import defpackage.r3;
import defpackage.r5;
import defpackage.t5t;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \u000f2\u00020\u00012\u00020\u0002:\u0001\u0010B\u000f\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0011\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0016¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u0011"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/customvibrate/MotorVibrateModule;", "Lcom/huami/bluetooth/profile/channel/module/a;", "Lr5;", "", "queryVersion", "()Ljava/lang/Byte;", "Lqos;", "vibrateInfo", "", "setCustomVibrate", "(Lqos;)Z", "Lr3;", "channelApi", "<init>", "(Lr3;)V", "Companion", PluginDeviceInfo.FMODEL, "bluetooth_release"}, k = 1, mv = {1, 7, 1})
@d4(id = 24)
public final class MotorVibrateModule extends a implements r5 {

    @NotNull
    private static final String TAG = "MotorVibrateModule";

    @Metadata(bv = {}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\b"}, d2 = {"com/huami/bluetooth/profile/channel/module/customvibrate/MotorVibrateModule$b", "Lqq;", "Lnl;", "request", "", com.xiaomi.onetrack.api.b.I, "", "predict", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static final class b implements qq {
        @Override // defpackage.qq
        public boolean predict(@NotNull nl request, @NotNull byte[] response) {
            Intrinsics.checkNotNullParameter(request, "request");
            Intrinsics.checkNotNullParameter(response, "response");
            return ArraysKt___ArraysKt.first(new MotorVibrateCommand.c().getF34884a()) == ArraysKt___ArraysKt.first(response);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\b"}, d2 = {"com/huami/bluetooth/profile/channel/module/customvibrate/MotorVibrateModule$c", "Lqq;", "Lnl;", "request", "", com.xiaomi.onetrack.api.b.I, "", "predict", "bluetooth_release"}, k = 1, mv = {1, 7, 1})
    public static final class c implements qq {
        @Override // defpackage.qq
        public boolean predict(@NotNull nl request, @NotNull byte[] response) {
            Intrinsics.checkNotNullParameter(request, "request");
            Intrinsics.checkNotNullParameter(response, "response");
            return ArraysKt___ArraysKt.first(new MotorVibrateCommand.e().getF34884a()) == ArraysKt___ArraysKt.first(response);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MotorVibrateModule(@NotNull r3 channelApi) {
        super(channelApi);
        Intrinsics.checkNotNullParameter(channelApi, "channelApi");
    }

    @Nullable
    public Byte queryVersion() {
        Object objM886constructorimpl;
        nl nlVar = new nl(new MotorVibrateCommand.b(), new b(), 0L, null, false, 28, null);
        try {
            Result.Companion companion = Result.Companion;
            ol<byte[]> olVarSendRequest = sendRequest(nlVar);
            Intrinsics.checkNotNull(olVarSendRequest, "null cannot be cast to non-null type com.huami.bluetooth.profile.channel.module.base.Success<kotlin.ByteArray>");
            objM886constructorimpl = Result.m886constructorimpl(Byte.valueOf(((byte[]) ((fu) olVarSendRequest).a())[1]));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            objM886constructorimpl = Result.m886constructorimpl(ResultKt.createFailure(th));
        }
        Throwable thM889exceptionOrNullimpl = Result.m889exceptionOrNullimpl(objM886constructorimpl);
        if (thM889exceptionOrNullimpl != null) {
            t5t.d(TAG, "queryVersion: " + thM889exceptionOrNullimpl);
        }
        if (Result.m892isFailureimpl(objM886constructorimpl)) {
            objM886constructorimpl = null;
        }
        return (Byte) objM886constructorimpl;
    }

    @Override // defpackage.r5
    public boolean setCustomVibrate(@NotNull qos vibrateInfo) {
        Object objM886constructorimpl;
        Intrinsics.checkNotNullParameter(vibrateInfo, "vibrateInfo");
        byte[] bArrD = vibrateInfo.d();
        if (bArrD == null) {
            return false;
        }
        nl nlVar = new nl(new MotorVibrateCommand.d().withBytes(bArrD), new c(), 0L, null, false, 28, null);
        try {
            Result.Companion companion = Result.Companion;
            ol<byte[]> olVarSendRequest = sendRequest(nlVar);
            Intrinsics.checkNotNull(olVarSendRequest, "null cannot be cast to non-null type com.huami.bluetooth.profile.channel.module.base.Success<kotlin.ByteArray>");
            objM886constructorimpl = Result.m886constructorimpl(Boolean.valueOf(c3.a(((byte[]) ((fu) olVarSendRequest).a())[1])));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            objM886constructorimpl = Result.m886constructorimpl(ResultKt.createFailure(th));
        }
        Throwable thM889exceptionOrNullimpl = Result.m889exceptionOrNullimpl(objM886constructorimpl);
        if (thM889exceptionOrNullimpl != null) {
            t5t.d(TAG, "set motor: " + thM889exceptionOrNullimpl);
        }
        Boolean bool = Boolean.FALSE;
        if (Result.m892isFailureimpl(objM886constructorimpl)) {
            objM886constructorimpl = bool;
        }
        return ((Boolean) objM886constructorimpl).booleanValue();
    }
}
