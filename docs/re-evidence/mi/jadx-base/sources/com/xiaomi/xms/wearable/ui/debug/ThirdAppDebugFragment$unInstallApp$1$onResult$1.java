package com.xiaomi.xms.wearable.ui.debug;

import com.xiaomi.xms.wearable.db.WatchAppRepository;
import defpackage.lg1;
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
@DebugMetadata(c = "com.xiaomi.xms.wearable.ui.debug.ThirdAppDebugFragment$unInstallApp$1$onResult$1", f = "ThirdAppDebugFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class ThirdAppDebugFragment$unInstallApp$1$onResult$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $did;
    int label;
    final /* synthetic */ ThirdAppDebugFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ThirdAppDebugFragment$unInstallApp$1$onResult$1(ThirdAppDebugFragment thirdAppDebugFragment, String str, Continuation<? super ThirdAppDebugFragment$unInstallApp$1$onResult$1> continuation) {
        super(2, continuation);
        this.this$0 = thirdAppDebugFragment;
        this.$did = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ThirdAppDebugFragment$unInstallApp$1$onResult$1(this.this$0, this.$did, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        lg1.d("uninstallApp success");
        this.this$0.getMBinding().E.setText("uninstallApp success");
        WatchAppRepository companion = WatchAppRepository.INSTANCE.getInstance();
        String str = this.$did;
        String str2 = this.this$0.pkgName;
        Intrinsics.checkNotNull(str2);
        companion.deleteWatchApp(str, str2);
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ThirdAppDebugFragment$unInstallApp$1$onResult$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
