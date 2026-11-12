package com.xiaomi.hm.health.device.setting.find;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
@DebugMetadata(c = "com.xiaomi.hm.health.device.setting.find.FindDeviceModel$handleShowType$3", f = "FindDeviceModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class FindDeviceModel$handleShowType$3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ PageType b;
    public final /* synthetic */ FindDeviceModel c;
    public final /* synthetic */ CompletableDeferred<PageType> d;

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PageType.values().length];
            iArr[PageType.ShowAlert.ordinal()] = 1;
            iArr[PageType.ShowShake.ordinal()] = 2;
            iArr[PageType.ShowUserChoice.ordinal()] = 3;
            iArr[PageType.None.ordinal()] = 4;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FindDeviceModel$handleShowType$3(PageType pageType, FindDeviceModel findDeviceModel, CompletableDeferred<PageType> completableDeferred, Continuation<? super FindDeviceModel$handleShowType$3> continuation) {
        super(2, continuation);
        this.b = pageType;
        this.c = findDeviceModel;
        this.d = completableDeferred;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new FindDeviceModel$handleShowType$3(this.b, this.c, this.d, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Unit> continuation) {
        return ((FindDeviceModel$handleShowType$3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        a.getCOROUTINE_SUSPENDED();
        if (this.a != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        int i = WhenMappings.$EnumSwitchMapping$0[this.b.ordinal()];
        if (i == 1) {
            IFindDevicePage page = this.c.getPage();
            if (page != null) {
                page.showDeviceAlertDialog(new DialogCancelHandler(this.d));
            }
            this.c.pageStatus = new FindDeviceModel.PageStatus(PageType.ShowAlert, this.d, false, 4, null);
        } else if (i == 2) {
            IFindDevicePage page2 = this.c.getPage();
            if (page2 != null) {
                page2.showDeviceShakeDialog(new DialogCancelHandler(this.d));
            }
            this.c.pageStatus = new FindDeviceModel.PageStatus(PageType.ShowShake, this.d, false, 4, null);
        } else if (i == 3) {
            IFindDevicePage page3 = this.c.getPage();
            if (page3 != null) {
                page3.showDeviceConHeadsetDialog(new AlertDialogChooseHandler(this.d));
            }
            this.c.pageStatus = new FindDeviceModel.PageStatus(PageType.ShowUserChoice, this.d, false, 4, null);
        }
        return Unit.INSTANCE;
    }
}
