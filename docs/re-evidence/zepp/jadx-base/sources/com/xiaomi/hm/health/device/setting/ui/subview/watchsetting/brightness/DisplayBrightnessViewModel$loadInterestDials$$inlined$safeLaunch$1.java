package com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.brightness;

import com.huami.devicex.funapi.ManagerFunctionsKt;
import com.huami.http.HttpError;
import com.huami.tools.log.HMLog;
import com.huami.watchfacesstore.bean.MyWatchFaceBean;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.brightness.DisplayBrightnessViewModel.e;
import com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.brightness.interest.vo.InterestWatchFaceVo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0001*\u00020\u0000H\u008a@¨\u0006\u0002"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "com/xiaomi/hm/health/devicex/manage/coroutines/ExtKt$safeLaunch$2", "<anonymous>"}, k = 3, mv = {1, 5, 1})
@DebugMetadata(c = "com.xiaomi.hm.health.device.setting.ui.subview.watchsetting.brightness.DisplayBrightnessViewModel$loadInterestDials$$inlined$safeLaunch$1", f = "DisplayBrightnessViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class DisplayBrightnessViewModel$loadInterestDials$$inlined$safeLaunch$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int a;
    private /* synthetic */ Object b;
    public final /* synthetic */ DisplayBrightnessViewModel c;
    public final /* synthetic */ ArrayList d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DisplayBrightnessViewModel$loadInterestDials$$inlined$safeLaunch$1(Continuation continuation, DisplayBrightnessViewModel displayBrightnessViewModel, ArrayList arrayList) {
        super(2, continuation);
        this.c = displayBrightnessViewModel;
        this.d = arrayList;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        DisplayBrightnessViewModel$loadInterestDials$$inlined$safeLaunch$1 displayBrightnessViewModel$loadInterestDials$$inlined$safeLaunch$1 = new DisplayBrightnessViewModel$loadInterestDials$$inlined$safeLaunch$1(continuation, this.c, this.d);
        displayBrightnessViewModel$loadInterestDials$$inlined$safeLaunch$1.b = obj;
        return displayBrightnessViewModel$loadInterestDials$$inlined$safeLaunch$1;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((DisplayBrightnessViewModel$loadInterestDials$$inlined$safeLaunch$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) throws HttpError {
        Object next;
        a.getCOROUTINE_SUSPENDED();
        if (this.a != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        List<MyWatchFaceBean> myWatchList = this.c.c().getMyWatchList(String.valueOf(ManagerFunctionsKt.getDeviceManagerApi().getBoundDeviceSource(HMDeviceType.MILI).getValue()), CollectionsKt___CollectionsKt.joinToString$default(this.d, ",", null, null, 0, null, null, 62, null));
        HMLog.info("DisplayBrightnessViewModel", this.c.new e());
        DisplayBrightnessViewModel displayBrightnessViewModel = this.c;
        ArrayList<String> arrayList = this.d;
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
        for (String str : arrayList) {
            Iterator<T> it2 = myWatchList.iterator();
            do {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                }
                next = it2.next();
            } while (!Boxing.boxBoolean(Intrinsics.areEqual(String.valueOf(((MyWatchFaceBean) next).getBuiltinId()), str)).booleanValue());
            MyWatchFaceBean myWatchFaceBean = (MyWatchFaceBean) next;
            arrayList2.add(myWatchFaceBean == null ? new InterestWatchFaceVo(str, str, "") : new InterestWatchFaceVo(str, myWatchFaceBean.getName(), myWatchFaceBean.getImage()));
        }
        displayBrightnessViewModel.watchFaceVos = arrayList2;
        this.c.getWatchSkinBeansLiveData().postValue(this.c.getWatchFaceVos());
        return Unit.INSTANCE;
    }
}
