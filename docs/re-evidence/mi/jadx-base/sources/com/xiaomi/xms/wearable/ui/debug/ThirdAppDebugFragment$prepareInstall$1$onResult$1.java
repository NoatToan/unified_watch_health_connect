package com.xiaomi.xms.wearable.ui.debug;

import com.xiaomi.fitness.baseui.view.PageState;
import com.xiaomi.xms.wearable.ui.appshop.manager.AppStatusManager;
import defpackage.lg1;
import java.io.File;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.xiaomi.xms.wearable.ui.debug.ThirdAppDebugFragment$prepareInstall$1$onResult$1", f = "ThirdAppDebugFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class ThirdAppDebugFragment$prepareInstall$1$onResult$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $filePath;
    final /* synthetic */ Integer $result;
    int label;
    final /* synthetic */ ThirdAppDebugFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ThirdAppDebugFragment$prepareInstall$1$onResult$1(Integer num, ThirdAppDebugFragment thirdAppDebugFragment, String str, Continuation<? super ThirdAppDebugFragment$prepareInstall$1$onResult$1> continuation) {
        super(2, continuation);
        this.$result = num;
        this.this$0 = thirdAppDebugFragment;
        this.$filePath = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ThirdAppDebugFragment$prepareInstall$1$onResult$1(this.$result, this.this$0, this.$filePath, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        Integer num = this.$result;
        if (num != null) {
            ThirdAppDebugFragment thirdAppDebugFragment = this.this$0;
            String str = this.$filePath;
            int iIntValue = num.intValue();
            lg1.d("prepareInstallApp success");
            thirdAppDebugFragment.getMBinding().E.setText("预安装成功， 开始发送文件");
            AppStatusManager instance = AppStatusManager.INSTANCE.getINSTANCE();
            String str2 = thirdAppDebugFragment.pkgName;
            Intrinsics.checkNotNull(str2);
            instance.addStatusListener(str2, thirdAppDebugFragment.mAppStatusListener);
            thirdAppDebugFragment.dismissDialogForce();
            PageState.DefaultImpls.showLoading$default(thirdAppDebugFragment, "发送文件中", 0, false, 2, null);
            thirdAppDebugFragment.sendThirdAppFile(new File(str), iIntValue);
        }
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ThirdAppDebugFragment$prepareInstall$1$onResult$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
