package com.xiaomi.fitness.devicesettings.bluttooth.falldetection;

import defpackage.eg4;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.xiaomi.fitness.devicesettings.bluttooth.falldetection.EmergencyContactListFragment$requestSyncMIUISosContacts$1$1$1", f = "EmergencyContactListFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class EmergencyContactListFragment$requestSyncMIUISosContacts$1$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $did;
    final /* synthetic */ List<eg4> $it;
    int label;
    final /* synthetic */ EmergencyContactListFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EmergencyContactListFragment$requestSyncMIUISosContacts$1$1$1(EmergencyContactListFragment emergencyContactListFragment, String str, List<eg4> list, Continuation<? super EmergencyContactListFragment$requestSyncMIUISosContacts$1$1$1> continuation) {
        super(2, continuation);
        this.this$0 = emergencyContactListFragment;
        this.$did = str;
        this.$it = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new EmergencyContactListFragment$requestSyncMIUISosContacts$1$1$1(this.this$0, this.$did, this.$it, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        this.this$0.showSyncMIUISosContactsDialog(this.$did, this.$it);
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((EmergencyContactListFragment$requestSyncMIUISosContacts$1$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
