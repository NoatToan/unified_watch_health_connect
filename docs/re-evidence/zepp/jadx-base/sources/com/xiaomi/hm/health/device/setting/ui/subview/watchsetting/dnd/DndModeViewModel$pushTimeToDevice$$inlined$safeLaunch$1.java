package com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.dnd;

import com.huami.bluetooth.profile.channel.module.settings.SettingsModule;
import com.huami.bluetooth.profile.channel.module.settings.entity.general.General;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.Time;
import com.huami.devicex.R;
import com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.SettingsExtsKt;
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
@DebugMetadata(c = "com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.dnd.DndModeViewModel$pushTimeToDevice$$inlined$safeLaunch$1", f = "DndModeViewModel.kt", i = {1}, l = {64, 70}, m = "invokeSuspend", n = {QQLogin.KEY_RESULT}, s = {"I$0"})
public final class DndModeViewModel$pushTimeToDevice$$inlined$safeLaunch$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int a;
    private /* synthetic */ Object b;
    public final /* synthetic */ DndModeViewModel c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ Time e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DndModeViewModel$pushTimeToDevice$$inlined$safeLaunch$1(Continuation continuation, DndModeViewModel dndModeViewModel, boolean z, Time time) {
        super(2, continuation);
        this.c = dndModeViewModel;
        this.d = z;
        this.e = time;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        DndModeViewModel$pushTimeToDevice$$inlined$safeLaunch$1 dndModeViewModel$pushTimeToDevice$$inlined$safeLaunch$1 = new DndModeViewModel$pushTimeToDevice$$inlined$safeLaunch$1(continuation, this.c, this.d, this.e);
        dndModeViewModel$pushTimeToDevice$$inlined$safeLaunch$1.b = obj;
        return dndModeViewModel$pushTimeToDevice$$inlined$safeLaunch$1;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((DndModeViewModel$pushTimeToDevice$$inlined$safeLaunch$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0031  */
    /* JADX WARN: Code duplicated, block: B:25:0x005d  */
    /* JADX WARN: Code duplicated, block: B:27:0x0082 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:28:0x0083  */
    /* JADX WARN: Code duplicated, block: B:30:0x0086  */
    /* JADX WARN: Code duplicated, block: B:33:0x009b  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v11 */
    /* JADX WARN: Type inference failed for: r11v14 */
    /* JADX WARN: Type inference failed for: r11v18 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        boolean z;
        MainCoroutineDispatcher main;
        DndModeViewModel.c cVar;
        int i;
        boolean zBooleanValue;
        ?? r11;
        Object coroutine_suspended = a.getCOROUTINE_SUSPENDED();
        int i2 = this.a;
        if (i2 != 0) {
            if (i2 == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i = this.f;
                ResultKt.throwOnFailure(obj);
            }
            r11 = i;
            this.c.getWriteResultLiveData().postValue(Boxing.boxBoolean(r11 != 0));
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(obj);
        SettingsModule settingsModule = this.c.settingsModule;
        if (settingsModule == null) {
            z = false;
        } else {
            General general = new General();
            if (this.d) {
                general.setDndStartTime(this.e);
            } else {
                general.setDndStopTime(this.e);
            }
            Unit unit = Unit.INSTANCE;
            this.a = 1;
            obj = SettingsExtsKt.write(settingsModule, general, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        if (z) {
            LoadingVo.Companion.postCancelMsg$default(LoadingVo.INSTANCE, this.c.getLoadingLiveData(), null, 2, null);
            main = Dispatchers.getMain();
            cVar = new DndModeViewModel.c(this.d, this.c, this.e, null);
            this.f = z ? 1 : 0;
            this.a = 2;
            if (BuildersKt.withContext(main, cVar, this) == coroutine_suspended) {
                z = zBooleanValue;
                return coroutine_suspended;
            }
            z = zBooleanValue;
            i = z ? 1 : 0;
            r11 = i;
        } else {
            z = zBooleanValue;
            LoadingVo.INSTANCE.postFailMsg(this.c.getLoadingLiveData(), R.string.long_sit_set_failed);
            r11 = z;
        }
        this.c.getWriteResultLiveData().postValue(Boxing.boxBoolean(r11 != 0));
        return Unit.INSTANCE;
        Boolean bool = (Boolean) obj;
        if (bool == null) {
            z = false;
        } else {
            zBooleanValue = bool.booleanValue();
        }
        if (z) {
            LoadingVo.Companion.postCancelMsg$default(LoadingVo.INSTANCE, this.c.getLoadingLiveData(), null, 2, null);
            main = Dispatchers.getMain();
            cVar = new DndModeViewModel.c(this.d, this.c, this.e, null);
            this.f = z ? 1 : 0;
            this.a = 2;
            if (BuildersKt.withContext(main, cVar, this) == coroutine_suspended) {
                z = zBooleanValue;
                return coroutine_suspended;
            }
            z = zBooleanValue;
            i = z ? 1 : 0;
            r11 = i;
        } else {
            z = zBooleanValue;
            LoadingVo.INSTANCE.postFailMsg(this.c.getLoadingLiveData(), R.string.long_sit_set_failed);
            r11 = z;
        }
        this.c.getWriteResultLiveData().postValue(Boxing.boxBoolean(r11 != 0));
        return Unit.INSTANCE;
    }
}
