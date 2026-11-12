package com.xiaomi.hm.health.homepage.cards;

import android.app.Activity;
import android.content.Context;
import androidx.arch.core.util.Function;
import androidx.p008lifecycle.FlowLiveDataConversions;
import androidx.p008lifecycle.LiveData;
import androidx.p008lifecycle.Transformations;
import com.huami.module.homepage.cards.service.CardAssistService;
import com.huami.tools.analytics.DbUtils;
import com.huami.watch.companion.config.Config;
import com.huami.watch.companion.update.UpdateManager;
import com.huami.watch.util.Util;
import com.xiaomi.hm.health.device.HMDeviceConfig;
import com.xiaomi.hm.health.healthdata.ui.detail.temperature.utils.TempUtils;
import com.xiaomi.hm.health.homepage.status.card.DataNotifier;
import com.xiaomi.hm.health.homepage.status.card.DataNotifiers;
import com.xiaomi.hm.health.homepage.status.card.InvalidateLiveData;
import com.xiaomi.hm.health.ui.heartrate.HeartRateUtils;
import com.xiaomi.hm.health.ui.pai.PaiHelper;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\b2\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\b2\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u000e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\n0\bH\u0016J\u000e\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\n0\bH\u0016J\u000e\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\n0\bH\u0016J\u000e\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\n0\bH\u0016J\u000e\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\n0\bH\u0016J\u0010\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u0005H\u0016J\u000e\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\n0\bH\u0016J\u000e\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00030\bH\u0016J\u000e\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\n0\bH\u0016J\b\u0010\u0018\u001a\u00020\u0017H\u0016J\u0010\u0010\u001b\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\u0019H\u0016J\b\u0010\u001c\u001a\u00020\u0003H\u0016¨\u0006\u001f"}, d2 = {"Lcom/xiaomi/hm/health/homepage/cards/CardAssistServiceImpl;", "Lcom/huami/module/homepage/cards/service/CardAssistService;", "Landroidx/lifecycle/LiveData;", "", "a", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "getPaiEnabled", "Lkotlinx/coroutines/flow/Flow;", "isPaiEnabled", "", "openPaiSetting", "fullHeartRateIsOpen", "isOpenFullHeartRate", "deviceBindNotifiers", "loginNotifier", "unitChangeNotifier", "timeChangeNotifier", "loginOrDeviceBindListener", "openHeartRateSetting", "personInfoChangeNotifier", "stressSwitchChangeNotifier", "dataDownloadFinishedNotifier", "", "getTempUnit", "Landroid/app/Activity;", "activity", "checkAppUpdate", "currentBindDeviceIsL66", "<init>", "()V", "app_midongPlayRelease"}, k = 1, mv = {1, 5, 1})
public final class CardAssistServiceImpl implements CardAssistService {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u008a@"}, d2 = {"", "isSupportPai", "paiEnable", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.homepage.cards.CardAssistServiceImpl$isPaiEnabled$1", f = "CardAssistServiceImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function3<Boolean, Boolean, Continuation<? super Boolean>, Object> {
        public int a;
        public /* synthetic */ boolean b;
        public /* synthetic */ boolean c;

        public a(Continuation<? super a> continuation) {
            super(3, continuation);
        }

        @Nullable
        public final Object a(boolean z, boolean z2, @Nullable Continuation<? super Boolean> continuation) {
            a aVar = new a(continuation);
            aVar.b = z;
            aVar.c = z2;
            return aVar.invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Boolean bool2, Continuation<? super Boolean> continuation) {
            return a(bool.booleanValue(), bool2.booleanValue(), continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return Boxing.boxBoolean(this.b && this.c);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u008a@"}, d2 = {"", "<anonymous parameter 0>", "<anonymous parameter 1>", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.homepage.cards.CardAssistServiceImpl$loginOrDeviceBindListener$1", f = "CardAssistServiceImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Function3<Unit, Unit, Continuation<? super Unit>, Object> {
        public int a;

        public b(Continuation<? super b> continuation) {
            super(3, continuation);
        }

        @Override // kotlin.jvm.functions.Function3
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@NotNull Unit unit, @NotNull Unit unit2, @Nullable Continuation<? super Unit> continuation) {
            return new b(continuation).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return Unit.INSTANCE;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/flow/FlowCollector;", "", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.homepage.cards.CardAssistServiceImpl$stressSwitchChangeNotifier$1", f = "CardAssistServiceImpl.kt", i = {}, l = {104}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements Function2<FlowCollector<? super Boolean>, Continuation<? super Unit>, Object> {
        public int a;
        private /* synthetic */ Object b;

        public c(Continuation<? super c> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            c cVar = new c(continuation);
            cVar.b = obj;
            return cVar;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull FlowCollector<? super Boolean> flowCollector, @Nullable Continuation<? super Unit> continuation) {
            return ((c) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                FlowCollector flowCollector = (FlowCollector) this.b;
                Boolean boolBoxBoolean = Boxing.boxBoolean(false);
                this.a = 1;
                if (flowCollector.emit(boolBoxBoolean, this) == coroutine_suspended) {
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

    private final LiveData<Boolean> a() {
        final DataNotifier deviceBoundNotifier = DataNotifiers.INSTANCE.getDeviceBoundNotifier();
        return Transformations.map(new InvalidateLiveData<Boolean>(deviceBoundNotifier) { // from class: com.xiaomi.hm.health.homepage.cards.CardAssistServiceImpl$isSupportPai$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.xiaomi.hm.health.homepage.status.card.InvalidateLiveData
            @NotNull
            public Boolean loadData() {
                return Boolean.valueOf(HMDeviceConfig.hasBoundPai());
            }
        }.asLiveData(), new Function<Boolean, Boolean>() { // from class: com.xiaomi.hm.health.homepage.cards.CardAssistServiceImpl$isSupportPai$$inlined$map$1
            @Override // androidx.arch.core.util.Function
            public final Boolean apply(Boolean bool) {
                Boolean bool2 = bool;
                return Boolean.valueOf(bool2 == null ? false : bool2.booleanValue());
            }
        });
    }

    @Override // com.huami.module.homepage.cards.service.CardAssistService
    public void checkAppUpdate(@NotNull Activity activity) {
        if (Config.isBuildOversea()) {
            Util.toPlayStore(activity);
        } else {
            UpdateManager.getInstance().checkUpdate(true, activity);
        }
    }

    @Override // com.huami.module.homepage.cards.service.CardAssistService
    public boolean currentBindDeviceIsL66() {
        return false;
    }

    @Override // com.huami.module.homepage.cards.service.CardAssistService
    @NotNull
    public Flow<Unit> dataDownloadFinishedNotifier() {
        return FlowLiveDataConversions.asFlow(InvalidateLiveData.INSTANCE.listen(DataNotifiers.INSTANCE.getDataDownloadFinishedNotifier()));
    }

    @Override // com.huami.module.homepage.cards.service.CardAssistService
    @NotNull
    public Flow<Unit> deviceBindNotifiers() {
        return FlowLiveDataConversions.asFlow(InvalidateLiveData.INSTANCE.listen(DataNotifiers.INSTANCE.getDeviceBoundNotifier()));
    }

    @Override // com.huami.module.homepage.cards.service.CardAssistService
    public boolean fullHeartRateIsOpen(@NotNull Context context) {
        return HeartRateUtils.INSTANCE.isOpenFullHr(context);
    }

    @Override // com.huami.module.homepage.cards.service.CardAssistService
    public boolean getPaiEnabled(@NotNull Context context) {
        return HeartRateUtils.INSTANCE.isOpenFullHr(context) && HMDeviceConfig.hasBoundPai();
    }

    @Override // com.huami.module.homepage.cards.service.CardAssistService
    public int getTempUnit() {
        return TempUtils.INSTANCE.getTempUnit();
    }

    @Override // com.huami.module.homepage.cards.service.CardAssistService
    @NotNull
    public Flow<Boolean> isOpenFullHeartRate(@NotNull final Context context) {
        return FlowLiveDataConversions.asFlow(Transformations.map(new InvalidateLiveData<Boolean>(DataNotifiers.INSTANCE.getFullHeartRateSwitchNotifier()) { // from class: com.xiaomi.hm.health.homepage.cards.CardAssistServiceImpl.isOpenFullHeartRate.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.xiaomi.hm.health.homepage.status.card.InvalidateLiveData
            @NotNull
            public Boolean loadData() {
                return Boolean.valueOf(HeartRateUtils.INSTANCE.isOpenFullHr(context));
            }
        }.asLiveData(), new Function<Boolean, Boolean>() { // from class: com.xiaomi.hm.health.homepage.cards.CardAssistServiceImpl$isOpenFullHeartRate$$inlined$map$1
            @Override // androidx.arch.core.util.Function
            public final Boolean apply(Boolean bool) {
                Boolean bool2 = bool;
                return Boolean.valueOf(bool2 == null ? false : bool2.booleanValue());
            }
        }));
    }

    @Override // com.huami.module.homepage.cards.service.CardAssistService
    @NotNull
    public Flow<Boolean> isPaiEnabled(@NotNull Context context) {
        return FlowKt.flowCombine(FlowLiveDataConversions.asFlow(a()), isOpenFullHeartRate(context), new a(null));
    }

    @Override // com.huami.module.homepage.cards.service.CardAssistService
    @NotNull
    public Flow<Unit> loginNotifier() {
        return FlowLiveDataConversions.asFlow(InvalidateLiveData.INSTANCE.listen(DataNotifiers.INSTANCE.getLoginNotifier()));
    }

    @Override // com.huami.module.homepage.cards.service.CardAssistService
    @NotNull
    public Flow<Unit> loginOrDeviceBindListener() {
        return FlowKt.flowCombine(deviceBindNotifiers(), loginNotifier(), new b(null));
    }

    @Override // com.huami.module.homepage.cards.service.CardAssistService
    public void openHeartRateSetting(@NotNull Context context) {
        openPaiSetting(context);
    }

    @Override // com.huami.module.homepage.cards.service.CardAssistService
    public void openPaiSetting(@NotNull Context context) {
        PaiHelper.INSTANCE.enableFullHeartRate(context);
    }

    @Override // com.huami.module.homepage.cards.service.CardAssistService
    @NotNull
    public Flow<Unit> personInfoChangeNotifier() {
        return FlowLiveDataConversions.asFlow(InvalidateLiveData.INSTANCE.listen(DataNotifiers.INSTANCE.getPersonInfoChangedNotifier()));
    }

    @Override // com.huami.module.homepage.cards.service.CardAssistService
    @NotNull
    public Flow<Boolean> stressSwitchChangeNotifier() {
        return FlowKt.flow(new c(null));
    }

    @Override // com.huami.module.homepage.cards.service.CardAssistService
    @NotNull
    public Flow<Unit> timeChangeNotifier() {
        return FlowLiveDataConversions.asFlow(InvalidateLiveData.INSTANCE.listen(DataNotifiers.INSTANCE.getTimeChangedNotifier()));
    }

    @Override // com.huami.module.homepage.cards.service.CardAssistService
    @NotNull
    public Flow<Unit> unitChangeNotifier() {
        return FlowLiveDataConversions.asFlow(InvalidateLiveData.INSTANCE.listen(DataNotifiers.INSTANCE.getUnitNotifier()));
    }
}
