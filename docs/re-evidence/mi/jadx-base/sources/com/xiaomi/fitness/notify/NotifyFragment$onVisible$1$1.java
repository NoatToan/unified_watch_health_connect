package com.xiaomi.fitness.notify;

import com.xiaomi.fitness.common.extensions.AnyExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.notify.di.NotifyStartExtKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.xiaomi.fitness.notify.NotifyFragment$onVisible$1$1", f = "NotifyFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class NotifyFragment$onVisible$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ boolean $hasNotificationListenersEnabled;
    int label;
    final /* synthetic */ NotifyFragment this$0;

    /* JADX INFO: renamed from: com.xiaomi.fitness.notify.NotifyFragment$onVisible$1$1$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.notify.NotifyFragment$onVisible$1$1$1", f = "NotifyFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final /* synthetic */ NotifyFragment this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(NotifyFragment notifyFragment, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = notifyFragment;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$0(NotifyFragment notifyFragment) {
            notifyFragment.isRemindPermissionDialogShow = false;
            notifyFragment.openNotification();
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$1(NotifyFragment notifyFragment) {
            notifyFragment.isRemindPermissionDialogShow = false;
            notifyFragment.finish();
            return Unit.INSTANCE;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            this.this$0.dismissDialog();
            Logger.i(NotifyFragment.TAG, "showDialog");
            if (!this.this$0.isRemindPermissionDialogShow) {
                this.this$0.isRemindPermissionDialogShow = true;
                final NotifyFragment notifyFragment = this.this$0;
                Function0 function0 = new Function0() { // from class: com.xiaomi.fitness.notify.a
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return NotifyFragment$onVisible$1$1.AnonymousClass1.invokeSuspend$lambda$0(notifyFragment);
                    }
                };
                final NotifyFragment notifyFragment2 = this.this$0;
                notifyFragment.showPermissionRemindDialog(function0, new Function0() { // from class: com.xiaomi.fitness.notify.b
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return NotifyFragment$onVisible$1$1.AnonymousClass1.invokeSuspend$lambda$1(notifyFragment2);
                    }
                });
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.notify.NotifyFragment$onVisible$1$1$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.notify.NotifyFragment$onVisible$1$1$2", f = "NotifyFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final /* synthetic */ NotifyFragment this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(NotifyFragment notifyFragment, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.this$0 = notifyFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(this.this$0, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            Logger.d(NotifyFragment.TAG, " onResume " + (this.this$0.isInit && this.this$0.isOpenInRemind) + " ");
            if (this.this$0.isInit && this.this$0.isOpenInRemind) {
                NotifyStartExtKt.getNotificationManagerImpl().updateNotifyRemindState(true);
            } else {
                NotifyStartExtKt.getNotificationManagerImpl().updateNotifyRemindState(NotifyStartExtKt.getNotificationManagerImpl().isNotifySwitchStatusEnable());
            }
            if (this.this$0.isToOpenNotificationListener) {
                this.this$0.isToOpenNotificationListener = false;
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NotifyFragment$onVisible$1$1(boolean z, NotifyFragment notifyFragment, Continuation<? super NotifyFragment$onVisible$1$1> continuation) {
        super(2, continuation);
        this.$hasNotificationListenersEnabled = z;
        this.this$0 = notifyFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new NotifyFragment$onVisible$1$1(this.$hasNotificationListenersEnabled, this.this$0, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        if (this.$hasNotificationListenersEnabled) {
            AnyExtKt.main$default(null, new AnonymousClass2(this.this$0, null), 1, null);
        } else {
            AnyExtKt.main$default(null, new AnonymousClass1(this.this$0, null), 1, null);
        }
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((NotifyFragment$onVisible$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
