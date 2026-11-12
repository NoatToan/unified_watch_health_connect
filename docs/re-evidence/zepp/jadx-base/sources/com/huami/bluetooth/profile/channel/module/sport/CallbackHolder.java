package com.huami.bluetooth.profile.channel.module.sport;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.huami.bluetooth.profile.channel.module.sport.CallbackHolder;
import com.huami.bluetooth.utils.BufByteDecoder;
import com.xiaomi.hm.health.bt.debug.Debug;
import com.xiaomi.hm.health.bt.profile.sport.IHMSportListener;
import com.xiaomi.hm.health.bt.profile.sport.SportCommand;
import com.xiaomi.hm.health.bt.profile.sport.SportConfig;
import com.xiaomi.hm.health.bt.profile.sport.SportKind;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.cybergarage.http.HTTP;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\"\u0010\n\u001a\u00020\u00042\u001a\u0010\t\u001a\u0016\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b\u0012\u0004\u0012\u00020\u00040\u0006J\u000e\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bJ\u000e\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000eR\u0016\u0010\u0013\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R*\u0010\u0016\u001a\u0016\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b\u0012\u0004\u0012\u00020\u00040\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0016\u0010\u001a\u001a\u00020\u00178\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001d"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/sport/CallbackHolder;", "", "Lcom/xiaomi/hm/health/bt/profile/sport/IHMSportListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "", "registerControlCallback", "Lkotlin/Function2;", "", "Lcom/xiaomi/hm/health/bt/profile/sport/SportConfig;", "callback", "registerInitCallback", "", "command", "onCommand", "", HTTP.CONTENT_RANGE_BYTES, "onInitCommand", "a", "Lcom/xiaomi/hm/health/bt/profile/sport/IHMSportListener;", "controlCallback", "b", "Lkotlin/jvm/functions/Function2;", "initCallback", "", "c", "Ljava/lang/String;", "TAG", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class CallbackHolder {

    @NotNull
    public static final CallbackHolder INSTANCE = new CallbackHolder();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private static IHMSportListener controlCallback = new IHMSportListener() { // from class: uh0
        @Override // com.xiaomi.hm.health.bt.profile.sport.IHMSportListener
        public final void onSportCommand(SportCommand sportCommand) {
            CallbackHolder.b(sportCommand);
        }
    };

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private static Function2<? super Integer, ? super SportConfig, Unit> initCallback = a.a;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private static final String TAG = "CallbackHolder";

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\n"}, d2 = {"", "<anonymous parameter 0>", "Lcom/xiaomi/hm/health/bt/profile/sport/SportConfig;", "<anonymous parameter 1>", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function2<Integer, SportConfig, Unit> {
        public static final a a = new a();

        public a() {
            super(2);
        }

        public final void a(int i, @Nullable SportConfig sportConfig) {
            Debug.fi(CallbackHolder.TAG, "No init callback registered");
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Integer num, SportConfig sportConfig) {
            a(num.intValue(), sportConfig);
            return Unit.INSTANCE;
        }
    }

    private CallbackHolder() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(SportCommand sportCommand) {
        Debug.fi(TAG, "No  command callback registered");
    }

    public final void onCommand(byte command) {
        Object objM3845constructorimpl;
        try {
            Result.Companion companion = Result.Companion;
            SportCommand sportCommandFindKeyByValue = SportSupplementPanelModuleKt.findKeyByValue(SportSupplementPanelModuleKt.getControlCommandMap(), command);
            if (sportCommandFindKeyByValue == null) {
                Debug.fi(TAG, "Unrecognized command");
            } else {
                controlCallback.onSportCommand(sportCommandFindKeyByValue);
            }
            objM3845constructorimpl = Result.m3845constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th));
        }
        Throwable thM3848exceptionOrNullimpl = Result.m3848exceptionOrNullimpl(objM3845constructorimpl);
        if (thM3848exceptionOrNullimpl != null) {
            Debug.fi(TAG, Intrinsics.stringPlus("Command callback invoke exception:", thM3848exceptionOrNullimpl));
        }
    }

    public final void onInitCommand(@NotNull byte[] bytes) {
        Object objM3845constructorimpl;
        try {
            Result.Companion companion = Result.Companion;
            SportConfig sportConfig = null;
            BufByteDecoder bufByteDecoder = new BufByteDecoder(bytes, 0, 2, null);
            int i = bufByteDecoder.readByte();
            if (i != 1) {
                boolean z = bufByteDecoder.readBoolean();
                int i2 = bufByteDecoder.readByte();
                boolean z2 = bufByteDecoder.readBoolean();
                SportConfig sportConfig2 = new SportConfig(SportKind.from((byte) i2), 1, z);
                sportConfig2.setAutoRecognizeSport(z2);
                sportConfig = sportConfig2;
            }
            initCallback.invoke(Integer.valueOf(i), sportConfig);
            objM3845constructorimpl = Result.m3845constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th));
        }
        Throwable thM3848exceptionOrNullimpl = Result.m3848exceptionOrNullimpl(objM3845constructorimpl);
        if (thM3848exceptionOrNullimpl != null) {
            Debug.fi(TAG, Intrinsics.stringPlus("Init callback invoke exception:", thM3848exceptionOrNullimpl));
        }
    }

    @NotNull
    public final void registerControlCallback(@NotNull IHMSportListener listener) {
        controlCallback = listener;
    }

    public final void registerInitCallback(@NotNull Function2<? super Integer, ? super SportConfig, Unit> callback) {
        initCallback = callback;
    }
}
