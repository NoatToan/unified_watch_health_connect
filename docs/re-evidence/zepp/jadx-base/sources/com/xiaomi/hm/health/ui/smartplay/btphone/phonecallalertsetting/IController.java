package com.xiaomi.hm.health.ui.smartplay.btphone.phonecallalertsetting;

import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\bf\u0018\u00002\u00020\u0001:\u0001\u0015J\u0013\u0010\u0003\u001a\u00020\u0002H¦@ø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004J\u0013\u0010\u0005\u001a\u00020\u0002H¦@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0004J\u0013\u0010\u0006\u001a\u00020\u0002H¦@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0004J\u001b\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H¦@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u000e\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\fH&J\u0013\u0010\u000f\u001a\u00020\u0002H¦@ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0004J\u0013\u0010\u0010\u001a\u00020\u0002H¦@ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0004J\u0013\u0010\u0011\u001a\u00020\u0002H¦@ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0004J\u0013\u0010\u0012\u001a\u00020\u0002H¦@ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0004J\u0010\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u0002H&\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0016"}, d2 = {"Lcom/xiaomi/hm/health/ui/smartplay/btphone/phonecallalertsetting/IController;", "", "", "open", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "restore", "close", "Lcom/xiaomi/hm/health/ui/smartplay/btphone/phonecallalertsetting/AuthStatus;", "authStatus", "", "updateAuthStatus", "(Lcom/xiaomi/hm/health/ui/smartplay/btphone/phonecallalertsetting/AuthStatus;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/xiaomi/hm/health/ui/smartplay/btphone/phonecallalertsetting/IController$IListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setListener", "needShow", "supportShowByCondition", "needConditionShow", "conditionShow", "enable", "setDeviceEnable", "IListener", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public interface IController {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0006"}, d2 = {"Lcom/xiaomi/hm/health/ui/smartplay/btphone/phonecallalertsetting/IController$IListener;", "", "Lcom/xiaomi/hm/health/ui/smartplay/btphone/phonecallalertsetting/SettingType;", "type", "", "onOpenFailed", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
    public interface IListener {
        void onOpenFailed(@NotNull SettingType type);
    }

    @Nullable
    Object close(@NotNull Continuation<? super Boolean> continuation);

    @Nullable
    Object conditionShow(@NotNull Continuation<? super Boolean> continuation);

    @Nullable
    Object needConditionShow(@NotNull Continuation<? super Boolean> continuation);

    @Nullable
    Object needShow(@NotNull Continuation<? super Boolean> continuation);

    @Nullable
    Object open(@NotNull Continuation<? super Boolean> continuation);

    @Nullable
    Object restore(@NotNull Continuation<? super Boolean> continuation);

    void setDeviceEnable(boolean enable);

    void setListener(@NotNull IListener listener);

    @Nullable
    Object supportShowByCondition(@NotNull Continuation<? super Boolean> continuation);

    @Nullable
    Object updateAuthStatus(@NotNull AuthStatus authStatus, @NotNull Continuation<? super Unit> continuation);
}
