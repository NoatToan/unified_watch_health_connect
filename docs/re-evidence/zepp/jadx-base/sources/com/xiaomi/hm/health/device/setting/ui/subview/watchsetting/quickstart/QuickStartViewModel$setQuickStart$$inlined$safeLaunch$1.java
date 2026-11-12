package com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.quickstart;

import com.huami.bluetooth.profile.channel.module.settings.SettingsModule;
import com.huami.bluetooth.profile.channel.module.settings.entity.general.General;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.StringEnum;
import com.huami.devicex.R;
import com.xiaomi.hm.health.device.setting.network.WatchSettingsManager;
import com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.SettingsExtsKt;
import com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.WatchSettingExtsKt;
import com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.loading.LoadingVo;
import com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.quickstart.QuickStartViewModel.b;
import com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.quickstart.QuickStartViewModel.c;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0001*\u00020\u0000H\u008a@¨\u0006\u0002"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "com/xiaomi/hm/health/devicex/manage/coroutines/ExtKt$safeLaunch$2", "<anonymous>"}, k = 3, mv = {1, 5, 1})
@DebugMetadata(c = "com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.quickstart.QuickStartViewModel$setQuickStart$$inlined$safeLaunch$1", f = "QuickStartViewModel.kt", i = {0, 1}, l = {71, 90}, m = "invokeSuspend", n = {"value", "value"}, s = {"L$0", "L$0"})
public final class QuickStartViewModel$setQuickStart$$inlined$safeLaunch$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int a;
    private /* synthetic */ Object b;
    public final /* synthetic */ QuickStartViewModel c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QuickStartViewModel$setQuickStart$$inlined$safeLaunch$1(Continuation continuation, QuickStartViewModel quickStartViewModel, int i, int i2) {
        super(2, continuation);
        this.c = quickStartViewModel;
        this.d = i;
        this.e = i2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        QuickStartViewModel$setQuickStart$$inlined$safeLaunch$1 quickStartViewModel$setQuickStart$$inlined$safeLaunch$1 = new QuickStartViewModel$setQuickStart$$inlined$safeLaunch$1(continuation, this.c, this.d, this.e);
        quickStartViewModel$setQuickStart$$inlined$safeLaunch$1.b = obj;
        return quickStartViewModel$setQuickStart$$inlined$safeLaunch$1;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((QuickStartViewModel$setQuickStart$$inlined$safeLaunch$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00b1 A[PHI: r1
      0x00b1: PHI (r1v14 java.lang.String) = (r1v5 java.lang.String), (r1v15 java.lang.String) binds: [B:23:0x0078, B:41:0x00af] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:45:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:47:0x00ce A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:48:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:50:0x0108  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        String str;
        boolean zBooleanValue;
        MainCoroutineDispatcher main;
        QuickStartViewModel.b bVar;
        String str2;
        Object coroutine_suspended = a.getCOROUTINE_SUSPENDED();
        int i = this.a;
        if (i != 0) {
            if (i == 1) {
                str = (String) this.b;
                ResultKt.throwOnFailure(obj);
            } else {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str2 = (String) this.b;
                ResultKt.throwOnFailure(obj);
            }
            WatchSettingsManager.modify$default(WatchSettingExtsKt.getWatchSettingManager(), false, this.c.new c(str2), 1, null);
            LoadingVo.Companion.postCancelMsg$default(LoadingVo.INSTANCE, this.c.getLoadingLiveData(), null, 2, null);
            this.c.getQuickStartIndexLiveData().postValue(new Pair<>(Boxing.boxInt(this.c.type), Boxing.boxInt(this.d)));
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(obj);
        StringEnum stringEnumA = this.c.a();
        ArrayList<String> enums = stringEnumA == null ? null : stringEnumA.getEnums();
        if (enums == null || enums.isEmpty()) {
            LoadingVo.INSTANCE.postFailMsg(this.c.getLoadingLiveData(), R.string.long_sit_set_failed);
        } else {
            str = enums.get(this.d);
            StringEnum stringEnum = new StringEnum(str, 0, null, false, 14, null);
            SettingsModule settingsModule = this.c.settingsModule;
            if (settingsModule == null) {
                zBooleanValue = false;
            } else {
                General general = new General();
                int i2 = this.c.type;
                if (i2 == 1) {
                    general.setLongPressSideApp(stringEnum);
                } else if (i2 == 2) {
                    general.setLongPressUpApp(stringEnum);
                } else if (i2 == 3) {
                    general.setClickDownApp(stringEnum);
                } else if (i2 == 4) {
                    general.setClickSelectApp(stringEnum);
                }
                Unit unit = Unit.INSTANCE;
                this.b = str;
                this.a = 1;
                obj = SettingsExtsKt.write(settingsModule, general, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            if (zBooleanValue) {
                main = Dispatchers.getMain();
                bVar = this.c.new b(str, null);
                this.b = str;
                this.a = 2;
                if (BuildersKt.withContext(main, bVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                str2 = str;
                WatchSettingsManager.modify$default(WatchSettingExtsKt.getWatchSettingManager(), false, this.c.new c(str2), 1, null);
                LoadingVo.Companion.postCancelMsg$default(LoadingVo.INSTANCE, this.c.getLoadingLiveData(), null, 2, null);
                this.c.getQuickStartIndexLiveData().postValue(new Pair<>(Boxing.boxInt(this.c.type), Boxing.boxInt(this.d)));
            } else {
                LoadingVo.INSTANCE.postFailMsg(this.c.getLoadingLiveData(), R.string.long_sit_set_failed);
                this.c.getQuickStartIndexLiveData().postValue(new Pair<>(Boxing.boxInt(this.c.type), Boxing.boxInt(this.e)));
            }
        }
        return Unit.INSTANCE;
        Boolean bool = (Boolean) obj;
        if (bool == null) {
            zBooleanValue = false;
        } else {
            zBooleanValue = bool.booleanValue();
        }
        if (zBooleanValue) {
            main = Dispatchers.getMain();
            bVar = this.c.new b(str, null);
            this.b = str;
            this.a = 2;
            if (BuildersKt.withContext(main, bVar, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            str2 = str;
            WatchSettingsManager.modify$default(WatchSettingExtsKt.getWatchSettingManager(), false, this.c.new c(str2), 1, null);
            LoadingVo.Companion.postCancelMsg$default(LoadingVo.INSTANCE, this.c.getLoadingLiveData(), null, 2, null);
            this.c.getQuickStartIndexLiveData().postValue(new Pair<>(Boxing.boxInt(this.c.type), Boxing.boxInt(this.d)));
        } else {
            LoadingVo.INSTANCE.postFailMsg(this.c.getLoadingLiveData(), R.string.long_sit_set_failed);
            this.c.getQuickStartIndexLiveData().postValue(new Pair<>(Boxing.boxInt(this.c.type), Boxing.boxInt(this.e)));
        }
        return Unit.INSTANCE;
    }
}
