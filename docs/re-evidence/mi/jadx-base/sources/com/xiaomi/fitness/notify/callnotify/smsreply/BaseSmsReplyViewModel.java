package com.xiaomi.fitness.notify.callnotify.smsreply;

import android.os.Bundle;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import com.google.gson.Gson;
import com.xiaomi.fitness.baseui.AbsViewModel;
import com.xiaomi.fitness.common.log.Logger;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u0000 .2\u00020\u0001:\u0001.B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010$H\u0016J\u0006\u0010%\u001a\u00020\"J$\u0010\f\u001a\u00020\"2\u001a\u0010&\u001a\u0016\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u0012\u0004\u0012\u00020\"0'H&J\u0014\u0010(\u001a\u00020\"2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u000b0\nJ0\u0010)\u001a\u00020\"2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0018\u0010&\u001a\u0014\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\"0*H&J\u000e\u0010+\u001a\u00020\"2\u0006\u0010,\u001a\u00020\u0014J*\u0010-\u001a\u00020\"2\u0006\u0010,\u001a\u00020\u00142\u0018\u0010&\u001a\u0014\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\"0*H&R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u001f\u0010\b\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n0\t¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0019\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\t¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0019\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\rR$\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0014@DX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R$\u0010\u001a\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0014@DX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0017\"\u0004\b\u001c\u0010\u0019R\u001a\u0010\u001d\u001a\u00020\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 ¨\u0006/"}, d2 = {"Lcom/xiaomi/fitness/notify/callnotify/smsreply/BaseSmsReplyViewModel;", "Lcom/xiaomi/fitness/baseui/AbsViewModel;", "<init>", "()V", "TAG", "", "getTAG", "()Ljava/lang/String;", "smsList", "Landroidx/lifecycle/MutableLiveData;", "", "Lcom/xiaomi/fitness/notify/callnotify/smsreply/SmsAdapter$Sms;", "getSmsList", "()Landroidx/lifecycle/MutableLiveData;", "syncState", "", "getSyncState", "deleteState", "getDeleteState", "value", "", "minSmsCount", "getMinSmsCount", "()I", "setMinSmsCount", "(I)V", "maxSmsCount", "getMaxSmsCount", "setMaxSmsCount", "isSyncing", "()Z", "setSyncing", "(Z)V", "attach", "", "savedInstanceState", "Landroid/os/Bundle;", "loadDeviceSmsList", "callback", "Lkotlin/Function1;", "syncSmsList", "doSyncSmsList", "Lkotlin/Function2;", "deleteSms", "id", "doDeleteSms", "Companion", "notify_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class BaseSmsReplyViewModel extends AbsViewModel {
    private static final int MAXIMUM_SMS_COUNT = 10;
    private static final int MINIMUM_SMS_COUNT = 1;
    private boolean isSyncing;

    @NotNull
    private final String TAG = "BaseSmsReplyViewModel";

    @NotNull
    private final MutableLiveData<List<SmsAdapter.Sms>> smsList = new MutableLiveData<>();

    @NotNull
    private final MutableLiveData<Boolean> syncState = new MutableLiveData<>();

    @NotNull
    private final MutableLiveData<Boolean> deleteState = new MutableLiveData<>();
    private int minSmsCount = 1;
    private int maxSmsCount = 10;

    /* JADX INFO: renamed from: com.xiaomi.fitness.notify.callnotify.smsreply.BaseSmsReplyViewModel$deleteSms$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.notify.callnotify.smsreply.BaseSmsReplyViewModel$deleteSms$1", f = "BaseSmsReplyViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ int $id;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(int i, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$id = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$0(BaseSmsReplyViewModel baseSmsReplyViewModel, int i, boolean z, int i2) {
            Logger.i(baseSmsReplyViewModel.getTAG(), "deleteSms " + i + " result:" + z + " " + i2);
            baseSmsReplyViewModel.getDeleteState().postValue(Boolean.valueOf(z));
            return Unit.INSTANCE;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return BaseSmsReplyViewModel.this.new AnonymousClass1(this.$id, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            final BaseSmsReplyViewModel baseSmsReplyViewModel = BaseSmsReplyViewModel.this;
            final int i = this.$id;
            baseSmsReplyViewModel.doDeleteSms(i, new Function2() { // from class: com.xiaomi.fitness.notify.callnotify.smsreply.a
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return BaseSmsReplyViewModel.AnonymousClass1.invokeSuspend$lambda$0(baseSmsReplyViewModel, i, ((Boolean) obj2).booleanValue(), ((Integer) obj3).intValue());
                }
            });
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.notify.callnotify.smsreply.BaseSmsReplyViewModel$loadDeviceSmsList$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.notify.callnotify.smsreply.BaseSmsReplyViewModel$loadDeviceSmsList$1", f = "BaseSmsReplyViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class C27221 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        public C27221(Continuation<? super C27221> continuation) {
            super(2, continuation);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$0(BaseSmsReplyViewModel baseSmsReplyViewModel, List list) {
            Logger.d(baseSmsReplyViewModel.getTAG(), "getSmsList " + new Gson().toJson(list));
            baseSmsReplyViewModel.getSmsList().postValue(list);
            return Unit.INSTANCE;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return BaseSmsReplyViewModel.this.new C27221(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            final BaseSmsReplyViewModel baseSmsReplyViewModel = BaseSmsReplyViewModel.this;
            baseSmsReplyViewModel.getSmsList(new Function1() { // from class: com.xiaomi.fitness.notify.callnotify.smsreply.b
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj2) {
                    return BaseSmsReplyViewModel.C27221.invokeSuspend$lambda$0(baseSmsReplyViewModel, (List) obj2);
                }
            });
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C27221) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.notify.callnotify.smsreply.BaseSmsReplyViewModel$syncSmsList$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.notify.callnotify.smsreply.BaseSmsReplyViewModel$syncSmsList$1", f = "BaseSmsReplyViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class C27231 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ List<SmsAdapter.Sms> $smsList;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C27231(List<SmsAdapter.Sms> list, Continuation<? super C27231> continuation) {
            super(2, continuation);
            this.$smsList = list;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$0(BaseSmsReplyViewModel baseSmsReplyViewModel, boolean z, int i) {
            Logger.i(baseSmsReplyViewModel.getTAG(), "syncSmsList result:" + z + " " + i);
            baseSmsReplyViewModel.getSyncState().postValue(Boolean.valueOf(z));
            return Unit.INSTANCE;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return BaseSmsReplyViewModel.this.new C27231(this.$smsList, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            Logger.d(BaseSmsReplyViewModel.this.getTAG(), "syncSmsList " + new Gson().toJson(this.$smsList));
            final BaseSmsReplyViewModel baseSmsReplyViewModel = BaseSmsReplyViewModel.this;
            baseSmsReplyViewModel.doSyncSmsList(this.$smsList, new Function2() { // from class: com.xiaomi.fitness.notify.callnotify.smsreply.c
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return BaseSmsReplyViewModel.C27231.invokeSuspend$lambda$0(baseSmsReplyViewModel, ((Boolean) obj2).booleanValue(), ((Integer) obj3).intValue());
                }
            });
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C27231) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @Override // com.xiaomi.fitness.baseui.AbsViewModel
    public void attach(@Nullable Bundle savedInstanceState) {
    }

    public final void deleteSms(int id) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new AnonymousClass1(id, null), 2, null);
    }

    public abstract void doDeleteSms(int id, @NotNull Function2<? super Boolean, ? super Integer, Unit> callback);

    public abstract void doSyncSmsList(@NotNull List<SmsAdapter.Sms> smsList, @NotNull Function2<? super Boolean, ? super Integer, Unit> callback);

    @NotNull
    public final MutableLiveData<Boolean> getDeleteState() {
        return this.deleteState;
    }

    public final int getMaxSmsCount() {
        return this.maxSmsCount;
    }

    public final int getMinSmsCount() {
        return this.minSmsCount;
    }

    @NotNull
    public final MutableLiveData<List<SmsAdapter.Sms>> getSmsList() {
        return this.smsList;
    }

    public abstract void getSmsList(@NotNull Function1<? super List<SmsAdapter.Sms>, Unit> callback);

    @NotNull
    public final MutableLiveData<Boolean> getSyncState() {
        return this.syncState;
    }

    @NotNull
    public String getTAG() {
        return this.TAG;
    }

    /* JADX INFO: renamed from: isSyncing, reason: from getter */
    public final boolean getIsSyncing() {
        return this.isSyncing;
    }

    public final void loadDeviceSmsList() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new C27221(null), 2, null);
    }

    public final void setMaxSmsCount(int i) {
        Logger.i(getTAG(), "change maxSmsCount to " + i);
        this.maxSmsCount = i;
    }

    public final void setMinSmsCount(int i) {
        this.minSmsCount = i;
    }

    public final void setSyncing(boolean z) {
        this.isSyncing = z;
    }

    public final void syncSmsList(@NotNull List<SmsAdapter.Sms> smsList) {
        Intrinsics.checkNotNullParameter(smsList, "smsList");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new C27231(smsList, null), 2, null);
    }
}
