package com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.dnd;

import com.huami.bluetooth.profile.channel.module.settings.SettingsModule;
import com.huami.bluetooth.profile.channel.module.settings.entity.general.General;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.EnumData;
import com.huami.devicex.R;
import com.xiaomi.hm.health.device.setting.network.WatchSettingsManager;
import com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.SettingsExtsKt;
import com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.WatchSettingExtsKt;
import com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.dnd.DndModeViewModel.a;
import com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.loading.LoadingVo;
import com.xiaomi.hm.health.thirdbind.tencent.QQLogin;
import kotlin.Metadata;
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
@DebugMetadata(c = "com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.dnd.DndModeViewModel$pushDndModeToDevice$$inlined$safeLaunch$1", f = "DndModeViewModel.kt", i = {1}, l = {64, 69}, m = "invokeSuspend", n = {QQLogin.KEY_RESULT}, s = {"I$0"})
public final class DndModeViewModel$pushDndModeToDevice$$inlined$safeLaunch$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int a;
    private /* synthetic */ Object b;
    public final /* synthetic */ DndModeViewModel c;
    public final /* synthetic */ int d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DndModeViewModel$pushDndModeToDevice$$inlined$safeLaunch$1(Continuation continuation, DndModeViewModel dndModeViewModel, int i) {
        super(2, continuation);
        this.c = dndModeViewModel;
        this.d = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        DndModeViewModel$pushDndModeToDevice$$inlined$safeLaunch$1 dndModeViewModel$pushDndModeToDevice$$inlined$safeLaunch$1 = new DndModeViewModel$pushDndModeToDevice$$inlined$safeLaunch$1(continuation, this.c, this.d);
        dndModeViewModel$pushDndModeToDevice$$inlined$safeLaunch$1.b = obj;
        return dndModeViewModel$pushDndModeToDevice$$inlined$safeLaunch$1;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((DndModeViewModel$pushDndModeToDevice$$inlined$safeLaunch$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0031  */
    /* JADX WARN: Code duplicated, block: B:21:0x0058  */
    /* JADX WARN: Code duplicated, block: B:23:0x006f A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:24:0x0070  */
    /* JADX WARN: Code duplicated, block: B:26:0x008c  */
    /* JADX WARN: Code duplicated, block: B:29:0x00a1  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v16 */
    /* JADX WARN: Type inference failed for: r10v20 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        boolean z;
        MainCoroutineDispatcher main;
        DndModeViewModel.a aVar;
        int i;
        boolean zBooleanValue;
        ?? r10;
        Object coroutine_suspended = a.getCOROUTINE_SUSPENDED();
        int i2 = this.a;
        if (i2 != 0) {
            if (i2 == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i = this.e;
                ResultKt.throwOnFailure(obj);
            }
            LoadingVo.Companion.postSuccessMsg$default(LoadingVo.INSTANCE, this.c.getLoadingLiveData(), null, 2, null);
            WatchSettingsManager.modify$default(WatchSettingExtsKt.getWatchSettingManager(), false, new DndModeViewModel.b(this.d), 1, null);
            r10 = i;
            this.c.getWriteResultLiveData().postValue(Boxing.boxBoolean(r10 != 0));
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(obj);
        SettingsModule settingsModule = this.c.settingsModule;
        if (settingsModule == null) {
            z = false;
        } else {
            General general = new General();
            general.setDndMode(new EnumData(this.d));
            Unit unit = Unit.INSTANCE;
            this.a = 1;
            obj = SettingsExtsKt.write(settingsModule, general, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        if (z) {
            main = Dispatchers.getMain();
            aVar = this.c.new a(this.d, null);
            this.e = z ? 1 : 0;
            this.a = 2;
            if (BuildersKt.withContext(main, aVar, this) == coroutine_suspended) {
                z = zBooleanValue;
                return coroutine_suspended;
            }
            z = zBooleanValue;
            i = z ? 1 : 0;
            LoadingVo.Companion.postSuccessMsg$default(LoadingVo.INSTANCE, this.c.getLoadingLiveData(), null, 2, null);
            WatchSettingsManager.modify$default(WatchSettingExtsKt.getWatchSettingManager(), false, new DndModeViewModel.b(this.d), 1, null);
            r10 = i;
        } else {
            z = zBooleanValue;
            LoadingVo.INSTANCE.postFailMsg(this.c.getLoadingLiveData(), R.string.long_sit_set_failed);
            r10 = z;
        }
        this.c.getWriteResultLiveData().postValue(Boxing.boxBoolean(r10 != 0));
        return Unit.INSTANCE;
        Boolean bool = (Boolean) obj;
        if (bool == null) {
            z = false;
        } else {
            zBooleanValue = bool.booleanValue();
        }
        if (z) {
            main = Dispatchers.getMain();
            aVar = this.c.new a(this.d, null);
            this.e = z ? 1 : 0;
            this.a = 2;
            if (BuildersKt.withContext(main, aVar, this) == coroutine_suspended) {
                z = zBooleanValue;
                return coroutine_suspended;
            }
            z = zBooleanValue;
            i = z ? 1 : 0;
            LoadingVo.Companion.postSuccessMsg$default(LoadingVo.INSTANCE, this.c.getLoadingLiveData(), null, 2, null);
            WatchSettingsManager.modify$default(WatchSettingExtsKt.getWatchSettingManager(), false, new DndModeViewModel.b(this.d), 1, null);
            r10 = i;
        } else {
            z = zBooleanValue;
            LoadingVo.INSTANCE.postFailMsg(this.c.getLoadingLiveData(), R.string.long_sit_set_failed);
            r10 = z;
        }
        this.c.getWriteResultLiveData().postValue(Boxing.boxBoolean(r10 != 0));
        return Unit.INSTANCE;
    }
}
