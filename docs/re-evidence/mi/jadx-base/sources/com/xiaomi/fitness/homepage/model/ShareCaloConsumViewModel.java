package com.xiaomi.fitness.homepage.model;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.view.View;
import androidx.lifecycle.CoroutineLiveDataKt;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.LiveDataScope;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import com.xiaomi.fit.data.common.util.UrlConstants;
import com.xiaomi.fit.fitness.export.api.repository.IHomeDataRepository;
import com.xiaomi.fit.fitness.export.api.repository.IRepositoryProvider;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyCalorieReport;
import com.xiaomi.fit.fitness.export.data.aggregation.DailyStepReport;
import com.xiaomi.fit.fitness.export.data.annotation.HomeDataType;
import com.xiaomi.fitness.ShareUtil;
import com.xiaomi.fitness.account.manager.AccountCoreInfo;
import com.xiaomi.fitness.account.user.UserInfoManager;
import com.xiaomi.fitness.baseui.AbsViewModel;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.extensions.AnyExtKt;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.extensions.ResourceExtKt;
import com.xiaomi.fitness.common.utils.ExtUtilsKt;
import com.xiaomi.fitness.homepage.model.ShareCaloConsumViewModel;
import com.xiaomi.fitness.util.CalorieUtils;
import defpackage.c0j;
import defpackage.kfi;
import defpackage.o3r;
import defpackage.pni;
import defpackage.pz6;
import defpackage.qxi;
import java.lang.ref.WeakReference;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 52\u00020\u0001:\u00015B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u001b\u001a\u00020\u001cJ\b\u0010\u001d\u001a\u00020\u001eH\u0002J4\u0010\u001f\u001a\u00020\u001c2\u0006\u0010 \u001a\u00020!2$\u0010\"\u001a \u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\u001c0#J6\u0010%\u001a\u00020\u001c2\u0006\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020)2\u0006\u0010 \u001a\u00020!2\b\b\u0002\u0010*\u001a\u00020+2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u001c0,J$\u0010-\u001a\u00020\u001c2\u0006\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020)2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u001c0,J,\u0010.\u001a\u00020\u001c2\u0006\u0010/\u001a\u00020'2\u0006\u0010(\u001a\u00020)2\u0012\u0010\"\u001a\u000e\u0012\u0004\u0012\u000201\u0012\u0004\u0012\u00020\u001c00H\u0002J,\u00102\u001a\u00020\u001c2\u0006\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020)2\u0006\u0010 \u001a\u00020!2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u001c0,J\f\u00103\u001a\b\u0012\u0004\u0012\u00020104R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001e\u0010\n\u001a\u00020\u000b8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\"\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R \u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0014\"\u0004\b\u001a\u0010\u0016¨\u00066"}, d2 = {"Lcom/xiaomi/fitness/homepage/model/ShareCaloConsumViewModel;", "Lcom/xiaomi/fitness/baseui/AbsViewModel;", "<init>", "()V", "mUserInfoManager", "Lcom/xiaomi/fitness/account/user/UserInfoManager;", "getMUserInfoManager", "()Lcom/xiaomi/fitness/account/user/UserInfoManager;", "setMUserInfoManager", "(Lcom/xiaomi/fitness/account/user/UserInfoManager;)V", "repoProvider", "Lcom/xiaomi/fit/fitness/export/api/repository/IRepositoryProvider;", "getRepoProvider", "()Lcom/xiaomi/fit/fitness/export/api/repository/IRepositoryProvider;", "setRepoProvider", "(Lcom/xiaomi/fit/fitness/export/api/repository/IRepositoryProvider;)V", "xiaomiCoreInfo", "Landroidx/lifecycle/MutableLiveData;", "Lcom/xiaomi/fitness/account/manager/AccountCoreInfo;", "getXiaomiCoreInfo", "()Landroidx/lifecycle/MutableLiveData;", "setXiaomiCoreInfo", "(Landroidx/lifecycle/MutableLiveData;)V", "shareStatusLiveData", "", "getShareStatusLiveData", "setShareStatusLiveData", "loadAccountInfo", "", "getHomeDataRepo", "Lcom/xiaomi/fit/fitness/export/api/repository/IHomeDataRepository;", "loadStandAndStepType", "lifecycleOwner", "Landroidx/lifecycle/LifecycleOwner;", "success", "Lkotlin/Function4;", "", "shareToWX", LifecycleConstantKt.TYPE_ACTIVITY, "Landroid/app/Activity;", "view", "Landroid/view/View;", "isFriend", "", "Lkotlin/Function0;", "shareMore", "createBitmap", "context", "Lkotlin/Function1;", "Landroid/graphics/Bitmap;", "saveSharePic", "getCommonQrCodeBitmapLiveData", "Landroidx/lifecycle/LiveData;", "Companion", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ShareCaloConsumViewModel extends AbsViewModel {
    public static final int STATUS_DEFAULT = 0;
    public static final int STATUS_PREVIEW = 1;
    public UserInfoManager mUserInfoManager;
    public IRepositoryProvider repoProvider;

    @NotNull
    private MutableLiveData<AccountCoreInfo> xiaomiCoreInfo = new MutableLiveData<>();

    @NotNull
    private MutableLiveData<Integer> shareStatusLiveData = new MutableLiveData<>();

    /* JADX INFO: renamed from: com.xiaomi.fitness.homepage.model.ShareCaloConsumViewModel$createBitmap$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.homepage.model.ShareCaloConsumViewModel$createBitmap$1", f = "ShareCaloConsumViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function1<Bitmap, Unit> $success;
        final /* synthetic */ View $view;
        int label;

        /* JADX INFO: renamed from: com.xiaomi.fitness.homepage.model.ShareCaloConsumViewModel$createBitmap$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.xiaomi.fitness.homepage.model.ShareCaloConsumViewModel$createBitmap$1$1", f = "ShareCaloConsumViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class C06391 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ Bitmap $contentBitamp;
            final /* synthetic */ Function1<Bitmap, Unit> $success;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C06391(Function1<? super Bitmap, Unit> function1, Bitmap bitmap, Continuation<? super C06391> continuation) {
                super(2, continuation);
                this.$success = function1;
                this.$contentBitamp = bitmap;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C06391(this.$success, this.$contentBitamp, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                this.$success.invoke2(this.$contentBitamp);
                return Unit.INSTANCE;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C06391) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(View view, Function1<? super Bitmap, Unit> function1, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$view = view;
            this.$success = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$view, this.$success, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            AnyExtKt.main$default(null, new C06391(this.$success, ShareUtil.loadBitmapFromView$default(this.$view, 0, 0, 6, null), null), 1, null);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.homepage.model.ShareCaloConsumViewModel$getCommonQrCodeBitmapLiveData$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n"}, d2 = {"<anonymous>", "", "Landroidx/lifecycle/LiveDataScope;", "Landroid/graphics/Bitmap;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.homepage.model.ShareCaloConsumViewModel$getCommonQrCodeBitmapLiveData$1", f = "ShareCaloConsumViewModel.kt", i = {}, l = {153}, m = "invokeSuspend", n = {}, s = {})
    public static final class C25791 extends SuspendLambda implements Function2<LiveDataScope<Bitmap>, Continuation<? super Unit>, Object> {
        final /* synthetic */ Bitmap $qrCodeBitmap;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C25791(Bitmap bitmap, Continuation<? super C25791> continuation) {
            super(2, continuation);
            this.$qrCodeBitmap = bitmap;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C25791 c25791 = new C25791(this.$qrCodeBitmap, continuation);
            c25791.L$0 = obj;
            return c25791;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(LiveDataScope<Bitmap> liveDataScope, Continuation<? super Unit> continuation) {
            return ((C25791) create(liveDataScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                LiveDataScope liveDataScope = (LiveDataScope) this.L$0;
                Bitmap bitmap = this.$qrCodeBitmap;
                Intrinsics.checkNotNull(bitmap);
                this.label = 1;
                if (liveDataScope.emit(bitmap, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    private final void createBitmap(Activity context, View view, Function1<? super Bitmap, Unit> success) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new AnonymousClass1(view, success, null), 2, null);
    }

    private final IHomeDataRepository getHomeDataRepo() {
        return getRepoProvider().getHomeDataRepository();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit loadAccountInfo$lambda$0(ShareCaloConsumViewModel this$0, AccountCoreInfo accountCoreInfo) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.xiaomiCoreInfo.postValue(accountCoreInfo);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit loadStandAndStepType$lambda$1(Function4 success, Map map) {
        Intrinsics.checkNotNullParameter(success, "$success");
        Object obj = map.get(HomeDataType.STEP);
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.xiaomi.fit.fitness.export.data.aggregation.DailyStepReport");
        DailyStepReport dailyStepReport = (DailyStepReport) obj;
        String strA = pz6.a(dailyStepReport.getDistance());
        String quantityString = ApplicationExtKt.getApplication().getResources().getQuantityString(qxi.w, dailyStepReport.getSteps(), Integer.valueOf(dailyStepReport.getSteps()));
        Intrinsics.checkNotNullExpressionValue(quantityString, "getQuantityString(...)");
        String string = ResourceExtKt.getString(c0j.Pc, strA, quantityString);
        Object obj2 = map.get(HomeDataType.CALORIE);
        Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type com.xiaomi.fit.fitness.export.data.aggregation.DailyCalorieReport");
        DailyCalorieReport dailyCalorieReport = (DailyCalorieReport) obj2;
        String quantityString2 = ApplicationExtKt.getApplication().getResources().getQuantityString(qxi.d0, dailyCalorieReport.getCalories(), Integer.valueOf(dailyCalorieReport.getCalories()));
        Intrinsics.checkNotNullExpressionValue(quantityString2, "getQuantityString(...)");
        Pair<String, String> shareCaloConsum = CalorieUtils.INSTANCE.getShareCaloConsum(dailyCalorieReport.getCalories());
        success.invoke(string, quantityString2, shareCaloConsum.component1(), shareCaloConsum.component2());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit saveSharePic$lambda$4(Activity activity, LifecycleOwner lifecycleOwner, Function0 success, Bitmap it) {
        Intrinsics.checkNotNullParameter(activity, "$activity");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "$lifecycleOwner");
        Intrinsics.checkNotNullParameter(success, "$success");
        Intrinsics.checkNotNullParameter(it, "it");
        ShareUtil.saveImageToGallery(activity, it, LifecycleOwnerKt.getLifecycleScope(lifecycleOwner), false, false);
        success.invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit shareMore$lambda$3(Function0 success, Activity activity, Bitmap it) {
        Intrinsics.checkNotNullParameter(success, "$success");
        Intrinsics.checkNotNullParameter(activity, "$activity");
        Intrinsics.checkNotNullParameter(it, "it");
        success.invoke();
        ShareUtil.INSTANCE.shareBitmapViaMore(new WeakReference<>(activity), it);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void shareToWX$default(ShareCaloConsumViewModel shareCaloConsumViewModel, Activity activity, View view, LifecycleOwner lifecycleOwner, boolean z, Function0 function0, int i, Object obj) {
        if ((i & 8) != 0) {
            z = false;
        }
        shareCaloConsumViewModel.shareToWX(activity, view, lifecycleOwner, z, function0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit shareToWX$lambda$2(Function0 success, Activity activity, boolean z, Bitmap it) {
        Intrinsics.checkNotNullParameter(success, "$success");
        Intrinsics.checkNotNullParameter(activity, "$activity");
        Intrinsics.checkNotNullParameter(it, "it");
        success.invoke();
        o3r.i().v(activity, it, activity.getString(c0j.f4794a), "", z ? o3r.k() : o3r.j());
        return Unit.INSTANCE;
    }

    @NotNull
    public final LiveData<Bitmap> getCommonQrCodeBitmapLiveData() {
        return CoroutineLiveDataKt.liveData$default((CoroutineContext) null, 0L, new C25791(kfi.b(UrlConstants.INSTANCE.getQRCodeDownloadHtmlUrl(), ExtUtilsKt.getDp(44), -16777216, 0, BitmapFactory.decodeResource(ApplicationExtKt.getApplication().getResources(), pni.T1)), null), 3, (Object) null);
    }

    @NotNull
    public final UserInfoManager getMUserInfoManager() {
        UserInfoManager userInfoManager = this.mUserInfoManager;
        if (userInfoManager != null) {
            return userInfoManager;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mUserInfoManager");
        return null;
    }

    @NotNull
    public final IRepositoryProvider getRepoProvider() {
        IRepositoryProvider iRepositoryProvider = this.repoProvider;
        if (iRepositoryProvider != null) {
            return iRepositoryProvider;
        }
        Intrinsics.throwUninitializedPropertyAccessException("repoProvider");
        return null;
    }

    @NotNull
    public final MutableLiveData<Integer> getShareStatusLiveData() {
        return this.shareStatusLiveData;
    }

    @NotNull
    public final MutableLiveData<AccountCoreInfo> getXiaomiCoreInfo() {
        return this.xiaomiCoreInfo;
    }

    public final void loadAccountInfo() {
        getMUserInfoManager().getAccountCoreInfo(false, new Function1() { // from class: f4m
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return ShareCaloConsumViewModel.loadAccountInfo$lambda$0(this.f17396a, (AccountCoreInfo) obj);
            }
        });
    }

    public final void loadStandAndStepType(@NotNull LifecycleOwner lifecycleOwner, @NotNull final Function4<? super String, ? super String, ? super String, ? super String, Unit> success) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        Intrinsics.checkNotNullParameter(success, "success");
        getHomeDataRepo().getHomeData(CollectionsKt__CollectionsKt.listOf((Object[]) new HomeDataType[]{HomeDataType.STEP, HomeDataType.CALORIE})).observe(lifecycleOwner, new ShareCaloConsumViewModel$sam$androidx_lifecycle_Observer$0(new Function1() { // from class: j4m
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return ShareCaloConsumViewModel.loadStandAndStepType$lambda$1(success, (Map) obj);
            }
        }));
    }

    public final void saveSharePic(@NotNull final Activity activity, @NotNull View view, @NotNull final LifecycleOwner lifecycleOwner, @NotNull final Function0<Unit> success) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        Intrinsics.checkNotNullParameter(success, "success");
        createBitmap(activity, view, new Function1() { // from class: g4m
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return ShareCaloConsumViewModel.saveSharePic$lambda$4(activity, lifecycleOwner, success, (Bitmap) obj);
            }
        });
    }

    public final void setMUserInfoManager(@NotNull UserInfoManager userInfoManager) {
        Intrinsics.checkNotNullParameter(userInfoManager, "<set-?>");
        this.mUserInfoManager = userInfoManager;
    }

    public final void setRepoProvider(@NotNull IRepositoryProvider iRepositoryProvider) {
        Intrinsics.checkNotNullParameter(iRepositoryProvider, "<set-?>");
        this.repoProvider = iRepositoryProvider;
    }

    public final void setShareStatusLiveData(@NotNull MutableLiveData<Integer> mutableLiveData) {
        Intrinsics.checkNotNullParameter(mutableLiveData, "<set-?>");
        this.shareStatusLiveData = mutableLiveData;
    }

    public final void setXiaomiCoreInfo(@NotNull MutableLiveData<AccountCoreInfo> mutableLiveData) {
        Intrinsics.checkNotNullParameter(mutableLiveData, "<set-?>");
        this.xiaomiCoreInfo = mutableLiveData;
    }

    public final void shareMore(@NotNull final Activity activity, @NotNull View view, @NotNull final Function0<Unit> success) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(success, "success");
        createBitmap(activity, view, new Function1() { // from class: h4m
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return ShareCaloConsumViewModel.shareMore$lambda$3(success, activity, (Bitmap) obj);
            }
        });
    }

    public final void shareToWX(@NotNull final Activity activity, @NotNull View view, @NotNull LifecycleOwner lifecycleOwner, final boolean isFriend, @NotNull final Function0<Unit> success) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "lifecycleOwner");
        Intrinsics.checkNotNullParameter(success, "success");
        createBitmap(activity, view, new Function1() { // from class: i4m
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return ShareCaloConsumViewModel.shareToWX$lambda$2(success, activity, isFriend, (Bitmap) obj);
            }
        });
    }
}
