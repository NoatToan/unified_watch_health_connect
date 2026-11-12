package com.huami.bluetooth.profile.channel.module.activity;

import com.huami.bluetooth.profile.channel.module.activity.RealtimeActivityCallbackHolder;
import com.xiaomi.hm.health.bt.debug.Debug;
import com.xiaomi.hm.health.bt.profile.base.IRealtimeStepCallback;
import com.xiaomi.hm.health.bt.profile.base.RealtimeStep;
import defpackage.d76;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0006\u001a\u00020\u0004J\u000e\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007R\u0016\u0010\f\u001a\u00020\u00028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0016\u0010\u000e\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000bR\u0016\u0010\u0012\u001a\u00020\u000f8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, d2 = {"Lcom/huami/bluetooth/profile/channel/module/activity/RealtimeActivityCallbackHolder;", "", "Lcom/xiaomi/hm/health/bt/profile/base/IRealtimeStepCallback;", "callback", "", "registerRealtimeStepCallback", "unregisterRealtimeStepCallback", "", "byteArray", "onRealtimeActivity", "a", "Lcom/xiaomi/hm/health/bt/profile/base/IRealtimeStepCallback;", "defaultRealtimeStepCallback", "b", "realtimeStepCallback", "", "c", "Ljava/lang/String;", "TAG", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class RealtimeActivityCallbackHolder {

    @NotNull
    public static final RealtimeActivityCallbackHolder INSTANCE = new RealtimeActivityCallbackHolder();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private static final IRealtimeStepCallback defaultRealtimeStepCallback;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private static IRealtimeStepCallback realtimeStepCallback = null;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private static final String TAG = "RealtimeActivityCallbackHolder";

    static {
        d76 d76Var = new IRealtimeStepCallback() { // from class: d76
            @Override // com.xiaomi.hm.health.bt.profile.base.IRealtimeStepCallback
            public final void onStepChanged(RealtimeStep realtimeStep) {
                RealtimeActivityCallbackHolder.b(realtimeStep);
            }
        };
        defaultRealtimeStepCallback = d76Var;
        realtimeStepCallback = d76Var;
    }

    private RealtimeActivityCallbackHolder() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(RealtimeStep realtimeStep) {
        Debug.fi(TAG, "No IRealtimeStepCallback registered");
    }

    public final void onRealtimeActivity(@NotNull byte[] byteArray) {
        Object objM3845constructorimpl;
        try {
            Result.Companion companion = Result.Companion;
            realtimeStepCallback.onStepChanged(RealtimeStep.parseFrom(byteArray));
            objM3845constructorimpl = Result.m3845constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th));
        }
        Throwable thM3848exceptionOrNullimpl = Result.m3848exceptionOrNullimpl(objM3845constructorimpl);
        if (thM3848exceptionOrNullimpl != null) {
            Debug.fi(TAG, Intrinsics.stringPlus("Realtime step callback invoke failed ", thM3848exceptionOrNullimpl));
        }
    }

    public final void registerRealtimeStepCallback(@NotNull IRealtimeStepCallback callback) {
        realtimeStepCallback = callback;
    }

    public final void unregisterRealtimeStepCallback() {
        realtimeStepCallback = defaultRealtimeStepCallback;
    }
}
