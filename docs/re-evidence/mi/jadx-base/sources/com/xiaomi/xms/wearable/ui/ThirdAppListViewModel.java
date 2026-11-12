package com.xiaomi.xms.wearable.ui;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import com.xiaomi.fitness.baseui.AbsViewModel;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.xms.wearable.bean.AppInfo;
import com.xiaomi.xms.wearable.db.WatchAppRepository;
import com.xiaomi.xms.wearable.db.entity.WatchAppCapability;
import com.xiaomi.xms.wearable.extensions.ExtensionsKt;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016J\u0006\u0010\u000e\u001a\u00020\u000fJ\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0082@¢\u0006\u0002\u0010\u0011R\u001d\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\t¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0012"}, d2 = {"Lcom/xiaomi/xms/wearable/ui/ThirdAppListViewModel;", "Lcom/xiaomi/fitness/baseui/AbsViewModel;", "<init>", "()V", "attach", "", "savedInstanceState", "Landroid/os/Bundle;", "appInfo", "Landroidx/lifecycle/MutableLiveData;", "", "Lcom/xiaomi/xms/wearable/bean/AppInfo;", "getAppInfo", "()Landroidx/lifecycle/MutableLiveData;", "loadAppList", "Lkotlinx/coroutines/Job;", "getAppList", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "xmswearable_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ThirdAppListViewModel extends AbsViewModel {

    @NotNull
    private final MutableLiveData<List<AppInfo>> appInfo = new MutableLiveData<>();

    /* JADX INFO: renamed from: com.xiaomi.xms.wearable.ui.ThirdAppListViewModel$getAppList$1, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.xms.wearable.ui.ThirdAppListViewModel", f = "ThirdAppListViewModel.kt", i = {0}, l = {32}, m = "getAppList", n = {"appList"}, s = {"L$0"})
    public static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return ThirdAppListViewModel.this.getAppList(this);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.xms.wearable.ui.ThirdAppListViewModel$getAppList$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.xms.wearable.ui.ThirdAppListViewModel$getAppList$2", f = "ThirdAppListViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ List<AppInfo> $appList;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(List<AppInfo> list, Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
            this.$appList = list;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass2(this.$appList, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            long jCurrentTimeMillis = System.currentTimeMillis();
            for (WatchAppCapability watchAppCapability : WatchAppRepository.INSTANCE.getInstance().getWatchAppCapabilities()) {
                Drawable appIcon = ExtensionsKt.getAppIcon(watchAppCapability.getPackageName());
                if (appIcon != null) {
                    this.$appList.add(new AppInfo(watchAppCapability.getPackageName(), appIcon, watchAppCapability.getAppName()));
                }
            }
            long jCurrentTimeMillis2 = System.currentTimeMillis();
            Logger.d("getAppList size = " + this.$appList.size() + " time cost = " + (jCurrentTimeMillis2 - jCurrentTimeMillis), new Object[0]);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.xms.wearable.ui.ThirdAppListViewModel$loadAppList$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.xms.wearable.ui.ThirdAppListViewModel$loadAppList$1", f = "ThirdAppListViewModel.kt", i = {}, l = {27}, m = "invokeSuspend", n = {}, s = {})
    public static final class C35081 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        Object L$0;
        int label;

        public C35081(Continuation<? super C35081> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return ThirdAppListViewModel.this.new C35081(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            MutableLiveData mutableLiveData;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                MutableLiveData<List<AppInfo>> appInfo = ThirdAppListViewModel.this.getAppInfo();
                ThirdAppListViewModel thirdAppListViewModel = ThirdAppListViewModel.this;
                this.L$0 = appInfo;
                this.label = 1;
                Object appList = thirdAppListViewModel.getAppList(this);
                if (appList == coroutine_suspended) {
                    return coroutine_suspended;
                }
                mutableLiveData = appInfo;
                obj = appList;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                mutableLiveData = (MutableLiveData) this.L$0;
                ResultKt.throwOnFailure(obj);
            }
            mutableLiveData.setValue(obj);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C35081) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object getAppList(Continuation<? super List<AppInfo>> continuation) {
        AnonymousClass1 anonymousClass1;
        if (continuation instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) continuation;
            int i = anonymousClass1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(continuation);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(continuation);
        }
        Object obj = anonymousClass1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = anonymousClass1.label;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            List list = (List) anonymousClass1.L$0;
            ResultKt.throwOnFailure(obj);
            return list;
        }
        ResultKt.throwOnFailure(obj);
        ArrayList arrayList = new ArrayList();
        CoroutineDispatcher io2 = Dispatchers.getIO();
        AnonymousClass2 anonymousClass2 = new AnonymousClass2(arrayList, null);
        anonymousClass1.L$0 = arrayList;
        anonymousClass1.label = 1;
        return BuildersKt.withContext(io2, anonymousClass2, anonymousClass1) == coroutine_suspended ? coroutine_suspended : arrayList;
    }

    @Override // com.xiaomi.fitness.baseui.AbsViewModel
    public void attach(@Nullable Bundle savedInstanceState) {
    }

    @NotNull
    public final MutableLiveData<List<AppInfo>> getAppInfo() {
        return this.appInfo;
    }

    @NotNull
    public final Job loadAppList() {
        return BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C35081(null), 3, null);
    }
}
