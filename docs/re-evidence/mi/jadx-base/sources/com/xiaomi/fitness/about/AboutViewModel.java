package com.xiaomi.fitness.about;

import android.content.Intent;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import com.xiaomi.fitness.about.AboutViewModel;
import com.xiaomi.fitness.about.bean.LogOffResult;
import com.xiaomi.fitness.about.request.AboutRequest;
import com.xiaomi.fitness.account.manager.AccountManager;
import com.xiaomi.fitness.active.pk.export.ActivePkPageExtKt;
import com.xiaomi.fitness.active.pk.export.IPkExport;
import com.xiaomi.fitness.baseui.BaseViewModel;
import com.xiaomi.fitness.baseui.view.BaseActivity;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.ToastUtil;
import com.xiaomi.fitness.login.export.CheckerUserSettingManager;
import com.xiaomi.fitness.login.export.CheckerUserSettingManagerExtKt;
import com.xiaomi.fitness.net.response.ApiException;
import com.xiaomi.fitness.relative.export.IRelativeCareAccessApi;
import com.xiaomi.fitness.relative.export.RelativeCareAccessExtKt;
import com.xiaomi.fitness.webview.WebViewActivity;
import defpackage.lzi;
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
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0006\u0010\u000b\u001a\u00020\fJ\u0006\u0010'\u001a\u00020(J@\u0010)\u001a\u00020(2\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020\u000f2\u0012\u0010-\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020(0.2\u0014\b\u0002\u0010/\u001a\u000e\u0012\u0004\u0012\u000200\u0012\u0004\u0012\u00020(0.J\f\u00101\u001a\b\u0012\u0004\u0012\u00020\u001802J\f\u00103\u001a\b\u0012\u0004\u0012\u00020\f02R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR \u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R \u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\f0\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0011\"\u0004\b\u0016\u0010\u0013R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082D¢\u0006\u0002\n\u0000R\u0014\u0010\u0019\u001a\u00020\u0018X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u001e\u0010\u001c\u001a\u00020\u001d8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R!\u0010\"\u001a\b\u0012\u0004\u0012\u00020#0\u000e8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b$\u0010\u0011¨\u00064"}, d2 = {"Lcom/xiaomi/fitness/about/AboutViewModel;", "Lcom/xiaomi/fitness/baseui/BaseViewModel;", "Lcom/xiaomi/fitness/about/AboutModel;", "<init>", "()V", "mAccountManager", "Lcom/xiaomi/fitness/account/manager/AccountManager;", "getMAccountManager", "()Lcom/xiaomi/fitness/account/manager/AccountManager;", "setMAccountManager", "(Lcom/xiaomi/fitness/account/manager/AccountManager;)V", "isLogin", "", "showDialog", "Landroidx/lifecycle/MutableLiveData;", "", "getShowDialog", "()Landroidx/lifecycle/MutableLiveData;", "setShowDialog", "(Landroidx/lifecycle/MutableLiveData;)V", "showLoading", "getShowLoading", "setShowLoading", "VERIFY_FAILURE_CODE", "", "LOG_OFF_REQUEST_CODE", "getLOG_OFF_REQUEST_CODE", "()I", "mAboutRequest", "Lcom/xiaomi/fitness/about/request/AboutRequest;", "getMAboutRequest", "()Lcom/xiaomi/fitness/about/request/AboutRequest;", "setMAboutRequest", "(Lcom/xiaomi/fitness/about/request/AboutRequest;)V", "cacheEmitter", "", "getCacheEmitter", "cacheEmitter$delegate", "Lkotlin/Lazy;", "clearCache", "", "logOff", LifecycleConstantKt.TYPE_ACTIVITY, "Lcom/xiaomi/fitness/baseui/view/BaseActivity;", "identityToken", "success", "Lkotlin/Function1;", "error", "Lcom/xiaomi/fitness/net/response/ApiException;", "queryProcessPkCountLiveData", "Landroidx/lifecycle/LiveData;", "hasOngoingRelativeRelationshipLiveData", "about_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class AboutViewModel extends BaseViewModel<AboutModel> {
    public AboutRequest mAboutRequest;
    public AccountManager mAccountManager;

    @NotNull
    private MutableLiveData<String> showDialog = new MutableLiveData<>();

    @NotNull
    private MutableLiveData<Boolean> showLoading = new MutableLiveData<>();
    private final int VERIFY_FAILURE_CODE = -4005001;
    private final int LOG_OFF_REQUEST_CODE = 1;

    /* JADX INFO: renamed from: cacheEmitter$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy cacheEmitter = LazyKt__LazyJVMKt.lazy(new Function0() { // from class: mz
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return AboutViewModel.cacheEmitter_delegate$lambda$0();
        }
    });

    /* JADX INFO: renamed from: com.xiaomi.fitness.about.AboutViewModel$clearCache$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.about.AboutViewModel$clearCache$1", f = "AboutViewModel.kt", i = {}, l = {49}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return AboutViewModel.this.new AnonymousClass1(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineDispatcher io2 = Dispatchers.getIO();
                AboutViewModel$clearCache$1$size$1 aboutViewModel$clearCache$1$size$1 = new AboutViewModel$clearCache$1$size$1(null);
                this.label = 1;
                obj = BuildersKt.withContext(io2, aboutViewModel$clearCache$1$size$1, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            AboutViewModel.this.getCacheEmitter().setValue(Boxing.boxLong(((Number) obj).longValue()));
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MutableLiveData cacheEmitter_delegate$lambda$0() {
        return new MutableLiveData();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void logOff$default(AboutViewModel aboutViewModel, BaseActivity baseActivity, String str, Function1 function1, Function1 function2, int i, Object obj) {
        if ((i & 8) != 0) {
            function2 = new Function1() { // from class: iz
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj2) {
                    return AboutViewModel.logOff$lambda$1((ApiException) obj2);
                }
            };
        }
        aboutViewModel.logOff(baseActivity, str, function1, function2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit logOff$lambda$1(ApiException it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit logOff$lambda$2(BaseActivity activity, AboutViewModel this$0, LogOffResult it) {
        Intrinsics.checkNotNullParameter(activity, "$activity");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        if (it.getLogoff_success()) {
            CheckerUserSettingManager.DefaultImpls.startSplashActivity$default(CheckerUserSettingManagerExtKt.getInstance(CheckerUserSettingManager.INSTANCE), activity, null, 2, null);
        }
        CheckerUserSettingManagerExtKt.getInstance(CheckerUserSettingManager.INSTANCE).reportRemovePrivacyAgreeTime();
        Logger.d(this$0.getTAG(), "logoffresult is " + it + " report remove privacy agree success ");
        this$0.showLoading.setValue(Boolean.FALSE);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit logOff$lambda$4(final AboutViewModel this$0, BaseActivity activity, ApiException it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(activity, "$activity");
        Intrinsics.checkNotNullParameter(it, "it");
        Logger.d(this$0.getTAG(), "it error " + it);
        if (it.getErrorCode() == this$0.VERIFY_FAILURE_CODE) {
            String message = it.getMessage();
            Logger.i(this$0.getTAG(), "positiveButton is " + message);
            Intent intent = new Intent();
            intent.setClass(activity, WebViewActivity.class);
            intent.putExtra(WebViewActivity.SHOW_TITLE_BAR, false);
            intent.putExtra(WebViewActivity.TITLE_BAR_MATCH_STATUS_BAR, true);
            intent.putExtra("URL", message);
            activity.startForActivityResult(intent, new Function2() { // from class: lz
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AboutViewModel.logOff$lambda$4$lambda$3(this.f25568a, ((Integer) obj).intValue(), (Intent) obj2);
                }
            });
        } else {
            ToastUtil.INSTANCE.showToast(lzi.X);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit logOff$lambda$4$lambda$3(AboutViewModel this$0, int i, Intent intent) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Logger.i(this$0.getTAG(), "requestCode is " + i);
        this$0.showLoading.setValue(Boolean.FALSE);
        String stringExtra = intent != null ? intent.getStringExtra("MESSAGE") : null;
        if (stringExtra != null) {
            Logger.i(this$0.getTAG(), "identifyToken is " + stringExtra);
            this$0.showDialog.setValue(stringExtra);
        }
        if (i == this$0.LOG_OFF_REQUEST_CODE) {
            String stringExtra2 = intent != null ? intent.getStringExtra("MESSAGE") : null;
            if (stringExtra2 != null) {
                Logger.i(this$0.getTAG(), "identifyToken is " + stringExtra2);
                this$0.showDialog.setValue(stringExtra2);
            }
        }
        return Unit.INSTANCE;
    }

    public final void clearCache() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new AnonymousClass1(null), 3, null);
    }

    @NotNull
    public final MutableLiveData<Long> getCacheEmitter() {
        return (MutableLiveData) this.cacheEmitter.getValue();
    }

    public final int getLOG_OFF_REQUEST_CODE() {
        return this.LOG_OFF_REQUEST_CODE;
    }

    @NotNull
    public final AboutRequest getMAboutRequest() {
        AboutRequest aboutRequest = this.mAboutRequest;
        if (aboutRequest != null) {
            return aboutRequest;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mAboutRequest");
        return null;
    }

    @NotNull
    public final AccountManager getMAccountManager() {
        AccountManager accountManager = this.mAccountManager;
        if (accountManager != null) {
            return accountManager;
        }
        Intrinsics.throwUninitializedPropertyAccessException("mAccountManager");
        return null;
    }

    @NotNull
    public final MutableLiveData<String> getShowDialog() {
        return this.showDialog;
    }

    @NotNull
    public final MutableLiveData<Boolean> getShowLoading() {
        return this.showLoading;
    }

    @NotNull
    public final LiveData<Boolean> hasOngoingRelativeRelationshipLiveData() {
        return RelativeCareAccessExtKt.getINSTANCE(IRelativeCareAccessApi.INSTANCE).hasOnGoingRelativeRelationship();
    }

    public final boolean isLogin() {
        return getMAccountManager().isLogin();
    }

    public final void logOff(@NotNull final BaseActivity activity, @NotNull String identityToken, @NotNull Function1<? super Boolean, Unit> success, @NotNull Function1<? super ApiException, Unit> error) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(identityToken, "identityToken");
        Intrinsics.checkNotNullParameter(success, "success");
        Intrinsics.checkNotNullParameter(error, "error");
        this.showLoading.setValue(Boolean.TRUE);
        getMAboutRequest().logOffService(ViewModelKt.getViewModelScope(this), identityToken, new Function1() { // from class: jz
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return AboutViewModel.logOff$lambda$2(activity, this, (LogOffResult) obj);
            }
        }, new Function1() { // from class: kz
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return AboutViewModel.logOff$lambda$4(this.f24430a, activity, (ApiException) obj);
            }
        });
    }

    @NotNull
    public final LiveData<Integer> queryProcessPkCountLiveData() {
        return ActivePkPageExtKt.getINSTANCE(IPkExport.INSTANCE).getPkCountInProgress();
    }

    public final void setMAboutRequest(@NotNull AboutRequest aboutRequest) {
        Intrinsics.checkNotNullParameter(aboutRequest, "<set-?>");
        this.mAboutRequest = aboutRequest;
    }

    public final void setMAccountManager(@NotNull AccountManager accountManager) {
        Intrinsics.checkNotNullParameter(accountManager, "<set-?>");
        this.mAccountManager = accountManager;
    }

    public final void setShowDialog(@NotNull MutableLiveData<String> mutableLiveData) {
        Intrinsics.checkNotNullParameter(mutableLiveData, "<set-?>");
        this.showDialog = mutableLiveData;
    }

    public final void setShowLoading(@NotNull MutableLiveData<Boolean> mutableLiveData) {
        Intrinsics.checkNotNullParameter(mutableLiveData, "<set-?>");
        this.showLoading = mutableLiveData;
    }
}
