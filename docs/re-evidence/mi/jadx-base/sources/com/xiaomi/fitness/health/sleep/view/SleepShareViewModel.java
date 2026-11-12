package com.xiaomi.fitness.health.sleep.view;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import com.xiaomi.fit.data.common.util.UrlConstants;
import com.xiaomi.fitness.ShareUtil;
import com.xiaomi.fitness.account.extensions.AccountManagerExtKt;
import com.xiaomi.fitness.account.manager.AccountCoreInfo;
import com.xiaomi.fitness.account.user.UserInfoManager;
import com.xiaomi.fitness.base.BasicDataViewModel;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import com.xiaomi.fitness.health.sleep.view.SleepShareViewModel;
import defpackage.fxi;
import defpackage.im9;
import defpackage.kfi;
import defpackage.kq2;
import java.io.File;
import java.lang.ref.WeakReference;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0014\u001a\u00020\u0015J\u0006\u0010\u0016\u001a\u00020\u0015J\u0016\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bR\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u0019\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u000b¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\"\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u000e\"\u0004\b\u0012\u0010\u0013¨\u0006\u001d"}, d2 = {"Lcom/xiaomi/fitness/health/sleep/view/SleepShareViewModel;", "Lcom/xiaomi/fitness/base/BasicDataViewModel;", "<init>", "()V", "userInfoManager", "Lcom/xiaomi/fitness/account/user/UserInfoManager;", "getUserInfoManager", "()Lcom/xiaomi/fitness/account/user/UserInfoManager;", "userInfoManager$delegate", "Lkotlin/Lazy;", "qrBitmapLiveData", "Landroidx/lifecycle/MutableLiveData;", "Landroid/graphics/Bitmap;", "getQrBitmapLiveData", "()Landroidx/lifecycle/MutableLiveData;", "accountInfoLiveData", "Lcom/xiaomi/fitness/account/manager/AccountCoreInfo;", "getAccountInfoLiveData", "setAccountInfoLiveData", "(Landroidx/lifecycle/MutableLiveData;)V", "requestQRBitmap", "", "requestUserInfo", "shareViaMore", LifecycleConstantKt.TYPE_ACTIVITY, "Landroidx/fragment/app/FragmentActivity;", "view", "Landroid/view/View;", "Companion", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SleepShareViewModel extends BasicDataViewModel {

    @NotNull
    public static final String TAG = "SleepShareViewModel";

    /* JADX INFO: renamed from: userInfoManager$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy userInfoManager = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: iym
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return SleepShareViewModel.userInfoManager_delegate$lambda$0();
        }
    });

    @NotNull
    private final MutableLiveData<Bitmap> qrBitmapLiveData = new MutableLiveData<>();

    @NotNull
    private MutableLiveData<AccountCoreInfo> accountInfoLiveData = new MutableLiveData<>();

    /* JADX INFO: renamed from: com.xiaomi.fitness.health.sleep.view.SleepShareViewModel$requestQRBitmap$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.health.sleep.view.SleepShareViewModel$requestQRBitmap$1", f = "SleepShareViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $filePathName;
        int label;
        final /* synthetic */ SleepShareViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(String str, SleepShareViewModel sleepShareViewModel, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$filePathName = str;
            this.this$0 = sleepShareViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$filePathName, this.this$0, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            Bitmap bitmapDecodeResource = BitmapFactory.decodeResource(ApplicationExtKt.getApplication().getResources(), fxi.f18350a);
            Intrinsics.checkNotNullExpressionValue(bitmapDecodeResource, "decodeResource(...)");
            Bitmap bitmapC = kfi.c(UrlConstants.INSTANCE.getQRCodeDownloadHtmlUrl(), ExtUtilsKt.getDp(Boxing.boxInt(50)), -16777216, bitmapDecodeResource);
            kq2.c(bitmapC, this.$filePathName);
            this.this$0.getQrBitmapLiveData().postValue(bitmapC);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.health.sleep.view.SleepShareViewModel$requestUserInfo$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.health.sleep.view.SleepShareViewModel$requestUserInfo$1", f = "SleepShareViewModel.kt", i = {}, l = {62}, m = "invokeSuspend", n = {}, s = {})
    public static final class C25351 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        public C25351(Continuation<? super C25351> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return SleepShareViewModel.this.new C25351(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                UserInfoManager userInfoManager = SleepShareViewModel.this.getUserInfoManager();
                this.label = 1;
                obj = UserInfoManager.getMiAccountCoreInfo$default(userInfoManager, false, this, 1, null);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            SleepShareViewModel.this.getAccountInfoLiveData().postValue((AccountCoreInfo) obj);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C25351) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.health.sleep.view.SleepShareViewModel$shareViaMore$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.health.sleep.view.SleepShareViewModel$shareViaMore$1", f = "SleepShareViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class C25361 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ FragmentActivity $activity;
        final /* synthetic */ View $view;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C25361(View view, FragmentActivity fragmentActivity, Continuation<? super C25361> continuation) {
            super(2, continuation);
            this.$view = view;
            this.$activity = fragmentActivity;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C25361(this.$view, this.$activity, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            ShareUtil.INSTANCE.shareBitmapViaMore(new WeakReference<>(this.$activity), ShareUtil.loadBitmapFromView$default(this.$view, 0, 0, 6, null));
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C25361) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final UserInfoManager getUserInfoManager() {
        return (UserInfoManager) this.userInfoManager.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UserInfoManager userInfoManager_delegate$lambda$0() {
        return AccountManagerExtKt.getInstance(UserInfoManager.INSTANCE);
    }

    @NotNull
    public final MutableLiveData<AccountCoreInfo> getAccountInfoLiveData() {
        return this.accountInfoLiveData;
    }

    @NotNull
    public final MutableLiveData<Bitmap> getQrBitmapLiveData() {
        return this.qrBitmapLiveData;
    }

    public final void requestQRBitmap() {
        String str = im9.K() + File.separator + "qrLogo.jpg";
        Bitmap bitmapDecodeFile = BitmapFactory.decodeFile(str);
        if (bitmapDecodeFile == null) {
            BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new AnonymousClass1(str, this, null), 3, null);
        } else {
            this.qrBitmapLiveData.postValue(bitmapDecodeFile);
        }
    }

    public final void requestUserInfo() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new C25351(null), 3, null);
    }

    public final void setAccountInfoLiveData(@NotNull MutableLiveData<AccountCoreInfo> mutableLiveData) {
        Intrinsics.checkNotNullParameter(mutableLiveData, "<set-?>");
        this.accountInfoLiveData = mutableLiveData;
    }

    public final void shareViaMore(@NotNull FragmentActivity activity, @NotNull View view) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(view, "view");
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new C25361(view, activity, null), 2, null);
    }
}
