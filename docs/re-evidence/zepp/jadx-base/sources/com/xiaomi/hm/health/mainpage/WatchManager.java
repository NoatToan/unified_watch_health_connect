package com.xiaomi.hm.health.mainpage;

import android.content.Context;
import android.os.Build;
import androidx.fragment.app.FragmentActivity;
import androidx.p008lifecycle.LifecycleOwnerKt;
import com.huami.lib.v2.ZeppPermissionManagerKt;
import com.huami.tools.analytics.DbUtils;
import com.huami.watch.companion.device.DeviceManager;
import com.huami.watch.companion.initial.InitialState;
import com.huami.watch.companion.notification.NotificationManager;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.device.HMDeviceManager;
import com.xiaomi.hm.health.device.amazfit_watch.HMWatchLogic;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0007\u001a\u00020\u0006J\u000e\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b¨\u0006\r"}, d2 = {"Lcom/xiaomi/hm/health/mainpage/WatchManager;", "", "Landroidx/fragment/app/FragmentActivity;", "activity", "", "checkWatchManager", "", "hasBoundWatch", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "checkNeedToShowNLSTip", "<init>", "()V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class WatchManager {

    @NotNull
    public static final WatchManager INSTANCE = new WatchManager();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.mainpage.WatchManager$checkWatchManager$1", f = "WatchManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ FragmentActivity b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(FragmentActivity fragmentActivity, Continuation<? super a> continuation) {
            super(2, continuation);
            this.b = fragmentActivity;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new a(this.b, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            WatchManager watchManager = WatchManager.INSTANCE;
            if (watchManager.hasBoundWatch()) {
                HMWatchLogic.getInstance().getWatchSettingProperties();
                if (Build.VERSION.SDK_INT < 31 || ZeppPermissionManagerKt.hasPermission(this.b, "android.permission.BLUETOOTH_CONNECT", "android.permission.BLUETOOTH_SCAN")) {
                    watchManager.checkNeedToShowNLSTip(this.b);
                }
                NotificationManager.getManager(this.b).getSmartFilter().asyncPullSmartFilterList();
            }
            return Unit.INSTANCE;
        }
    }

    private WatchManager() {
    }

    public final void checkNeedToShowNLSTip(@NotNull Context context) {
        if (InitialState.isNeedShowNLSTip() && DeviceManager.getManager(context).hasBoundDevice()) {
            NotificationManager manager = NotificationManager.getManager(context);
            boolean zIsSystemNLSPermissionEnabled = manager.isSystemNLSPermissionEnabled(context);
            boolean zIsUserON = manager.isUserON();
            if (zIsSystemNLSPermissionEnabled || !zIsUserON) {
                return;
            }
            InitialState.toEnableSystemNLSPermissionTip(context);
            InitialState.setNeedShowNLSTip(false);
        }
    }

    public final void checkWatchManager(@NotNull FragmentActivity activity) {
        e.f(LifecycleOwnerKt.getLifecycleScope(activity), Dispatchers.getIO(), null, new a(activity, null), 2, null);
    }

    public final boolean hasBoundWatch() {
        return HMDeviceManager.getInstance().hasBound(HMDeviceType.WATCH);
    }
}
