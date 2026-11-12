package com.xiaomi.hm.health.ui.pai.hrsetting;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import androidx.p008lifecycle.CoroutineLiveDataKt;
import androidx.p008lifecycle.LiveData;
import androidx.p008lifecycle.LiveDataScope;
import com.huami.device.feature.health.HealthDetect;
import com.huami.device.feature.health.user.HealthConfig;
import com.huami.mifit.analytics.Analytics;
import com.huami.mifit.analytics.builder.CountEventBuilder;
import com.huami.tools.analytics.DbUtils;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.bt.device.HMMiLiDevice;
import com.xiaomi.hm.health.device.HMDeviceManager;
import com.xiaomi.hm.health.device.event.StatEvent;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.GlobalScope;
import kotlinx.coroutines.e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u001a\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\n"}, d2 = {"Lcom/xiaomi/hm/health/ui/pai/hrsetting/NoPaiGTHeartRateSetting;", "Lcom/xiaomi/hm/health/ui/pai/hrsetting/IHrSettingWrap;", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", "showHrSetting", "Landroidx/lifecycle/LiveData;", "setHeartRate", "<init>", "()V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class NoPaiGTHeartRateSetting implements IHrSettingWrap {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.ui.pai.hrsetting.NoPaiGTHeartRateSetting$setHeartRate$1", f = "NoPaiGTHeartRateSetting.kt", i = {}, l = {41}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public int a;

        public a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new a(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                HealthConfig healthConfig = HealthDetect.INSTANCE.getHealthConfig();
                this.a = 1;
                if (healthConfig.openDeviceAlldayHrMessure(1, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, d2 = {"Landroidx/lifecycle/LiveDataScope;", "", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.ui.pai.hrsetting.NoPaiGTHeartRateSetting$setHeartRate$2", f = "NoPaiGTHeartRateSetting.kt", i = {}, l = {46}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Function2<LiveDataScope<Boolean>, Continuation<? super Unit>, Object> {
        public int a;
        private /* synthetic */ Object b;

        public b(Continuation<? super b> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@NotNull LiveDataScope<Boolean> liveDataScope, @Nullable Continuation<? super Unit> continuation) {
            return ((b) create(liveDataScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            b bVar = new b(continuation);
            bVar.b = obj;
            return bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                LiveDataScope liveDataScope = (LiveDataScope) this.b;
                Boolean boolBoxBoolean = Boxing.boxBoolean(true);
                this.a = 1;
                if (liveDataScope.emit(boolBoxBoolean, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @Override // com.huami.pai.ui.hrsetting.IHeartRateSetting
    @Nullable
    public LiveData<Boolean> setHeartRate(@Nullable Context context) {
        if (!(context instanceof FragmentActivity)) {
            return null;
        }
        HMBaseDevice device = HMDeviceManager.getInstance().getDevice(HMDeviceType.MILI);
        if (!(device instanceof HMMiLiDevice)) {
            return null;
        }
        if (!((HMMiLiDevice) device).isConnected()) {
            showOpenResultDialog(context, false);
            return null;
        }
        e.f(GlobalScope.INSTANCE, Dispatchers.getIO(), null, new a(null), 2, null);
        showOpenResultDialog(context, true);
        Analytics.recordEvent(new CountEventBuilder(StatEvent.SPORT_PAI_C).addExtra("tp", StatEvent.ALLOW_GUIDE));
        return CoroutineLiveDataKt.liveData$default((CoroutineContext) null, 0L, new b(null), 3, (Object) null);
    }

    @Override // com.huami.pai.ui.hrsetting.IHeartRateSetting
    public boolean showHrSetting(@NotNull Context context) {
        return false;
    }

    @Override // com.xiaomi.hm.health.ui.pai.hrsetting.IHrSettingWrap
    public void showOpenResultDialog(@Nullable Context context, int i, int i2) {
        IHrSettingWrap.DefaultImpls.showOpenResultDialog(this, context, i, i2);
    }

    @Override // com.xiaomi.hm.health.ui.pai.hrsetting.IHrSettingWrap
    public void showToastShort(@Nullable Context context, int i) {
        IHrSettingWrap.DefaultImpls.showToastShort(this, context, i);
    }

    @Override // com.xiaomi.hm.health.ui.pai.hrsetting.IHrSettingWrap
    public void showOpenResultDialog(@Nullable Context context, boolean z) {
        IHrSettingWrap.DefaultImpls.showOpenResultDialog(this, context, z);
    }
}
