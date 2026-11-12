package com.mi.health.appupgrade.net;

import com.mi.health.appupgrade.model.AppUpgradeRequestParams;
import com.mi.health.appupgrade.model.AppUpgradeResult;
import com.mi.health.appupgrade.model.AppVersionDetailParams;
import com.mi.health.appupgrade.model.AppVersionDetailResult;
import com.mi.health.appupgrade.net.AppUpgradeRequest;
import com.mibi.sdk.common.CommonConstants;
import com.xiaomi.fitness.common.utils.LocaleUtil;
import com.xiaomi.fitness.net.BaseRequest;
import com.xiaomi.fitness.net.HttpFlow;
import com.xiaomi.fitness.net.response.ApiException;
import com.xiaomi.fitness.net.response.BaseResult;
import com.xiaomi.fitness.net.scope.NetCoroutineScope;
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
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004JY\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000b2\u001c\u0010\f\u001a\u0018\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00060\u000fj\b\u0012\u0004\u0012\u00020\u000e`\r2\u0016\u0010\u0010\u001a\u0012\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00060\u000fj\u0002`\u0011¢\u0006\u0002\u0010\u0013JY\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000b2\u001c\u0010\f\u001a\u0018\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00060\u000fj\b\u0012\u0004\u0012\u00020\u000e`\r2\u0016\u0010\u0010\u001a\u0012\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00060\u000fj\u0002`\u0011¢\u0006\u0002\u0010\u0013¨\u0006\u0015"}, d2 = {"Lcom/mi/health/appupgrade/net/AppUpgradeRequest;", "Lcom/xiaomi/fitness/net/BaseRequest;", "Lcom/mi/health/appupgrade/net/AppUpgradeService;", "<init>", "()V", "getAppUpgrade", "", "packageName", "", CommonConstants.KEY_VERSION_NAME, CommonConstants.KEY_VERSION_CODE, "", "success", "Lcom/xiaomi/fitness/net/extensions/OnSuccess;", "Lcom/mi/health/appupgrade/model/AppUpgradeResult;", "Lkotlin/Function1;", "error", "Lcom/xiaomi/fitness/net/extensions/OnFail;", "Lcom/xiaomi/fitness/net/response/ApiException;", "(Ljava/lang/String;Ljava/lang/String;JLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "getAppUpgradeDetails", "appupgrade_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nAppUpgradeRequest.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AppUpgradeRequest.kt\ncom/mi/health/appupgrade/net/AppUpgradeRequest\n+ 2 BaseRequest.kt\ncom/xiaomi/fitness/net/BaseRequest\n*L\n1#1,59:1\n89#2,5:60\n89#2,5:65\n89#2,5:70\n*S KotlinDebug\n*F\n+ 1 AppUpgradeRequest.kt\ncom/mi/health/appupgrade/net/AppUpgradeRequest\n*L\n20#1:60,5\n33#1:65,5\n39#1:70,5\n*E\n"})
public final class AppUpgradeRequest extends BaseRequest<AppUpgradeService> {

    /* JADX INFO: renamed from: com.mi.health.appupgrade.net.AppUpgradeRequest$getAppUpgrade$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, d2 = {"<anonymous>", "Lcom/xiaomi/fitness/net/response/BaseResult;", "Lcom/mi/health/appupgrade/model/AppUpgradeResult;", "it", "Lcom/mi/health/appupgrade/net/AppUpgradeService;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.mi.health.appupgrade.net.AppUpgradeRequest$getAppUpgrade$1", f = "AppUpgradeRequest.kt", i = {}, l = {22}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<AppUpgradeService, Continuation<? super BaseResult<AppUpgradeResult>>, Object> {
        final /* synthetic */ String $packageName;
        final /* synthetic */ long $versionCode;
        final /* synthetic */ String $versionName;
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ AppUpgradeRequest this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(String str, String str2, long j, AppUpgradeRequest appUpgradeRequest, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$packageName = str;
            this.$versionName = str2;
            this.$versionCode = j;
            this.this$0 = appUpgradeRequest;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$packageName, this.$versionName, this.$versionCode, this.this$0, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(AppUpgradeService appUpgradeService, Continuation<? super BaseResult<AppUpgradeResult>> continuation) {
            return ((AnonymousClass1) create(appUpgradeService, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                AppUpgradeService appUpgradeService = (AppUpgradeService) this.L$0;
                String json = this.this$0.getMGson().toJson(new AppUpgradeRequestParams(this.$packageName, this.$versionName, this.$versionCode));
                Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
                String currentLocale$default = LocaleUtil.getCurrentLocale$default(LocaleUtil.INSTANCE, false, false, 3, null);
                this.label = 1;
                obj = appUpgradeService.getAppUpgrade(json, currentLocale$default, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return obj;
        }
    }

    /* JADX INFO: renamed from: com.mi.health.appupgrade.net.AppUpgradeRequest$getAppUpgradeDetails$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n"}, d2 = {"<anonymous>", "Lcom/xiaomi/fitness/net/response/BaseResult;", "Lcom/mi/health/appupgrade/model/AppUpgradeResult;", "it", "Lcom/mi/health/appupgrade/net/AppUpgradeService;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.mi.health.appupgrade.net.AppUpgradeRequest$getAppUpgradeDetails$1", f = "AppUpgradeRequest.kt", i = {}, l = {35}, m = "invokeSuspend", n = {}, s = {})
    public static final class C13931 extends SuspendLambda implements Function2<AppUpgradeService, Continuation<? super BaseResult<AppUpgradeResult>>, Object> {
        final /* synthetic */ String $packageName;
        final /* synthetic */ long $versionCode;
        final /* synthetic */ String $versionName;
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ AppUpgradeRequest this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13931(String str, String str2, long j, AppUpgradeRequest appUpgradeRequest, Continuation<? super C13931> continuation) {
            super(2, continuation);
            this.$packageName = str;
            this.$versionName = str2;
            this.$versionCode = j;
            this.this$0 = appUpgradeRequest;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C13931 c13931 = new C13931(this.$packageName, this.$versionName, this.$versionCode, this.this$0, continuation);
            c13931.L$0 = obj;
            return c13931;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(AppUpgradeService appUpgradeService, Continuation<? super BaseResult<AppUpgradeResult>> continuation) {
            return ((C13931) create(appUpgradeService, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                AppUpgradeService appUpgradeService = (AppUpgradeService) this.L$0;
                String json = this.this$0.getMGson().toJson(new AppUpgradeRequestParams(this.$packageName, this.$versionName, this.$versionCode));
                Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
                String currentLocale$default = LocaleUtil.getCurrentLocale$default(LocaleUtil.INSTANCE, false, false, 3, null);
                this.label = 1;
                obj = appUpgradeService.getAppUpgrade(json, currentLocale$default, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return obj;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getAppUpgradeDetails$lambda$1(String packageName, String versionName, AppUpgradeRequest this$0, Function1 error, final Function1 success, final AppUpgradeResult upgradeResult) {
        Intrinsics.checkNotNullParameter(packageName, "$packageName");
        Intrinsics.checkNotNullParameter(versionName, "$versionName");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(error, "$error");
        Intrinsics.checkNotNullParameter(success, "$success");
        Intrinsics.checkNotNullParameter(upgradeResult, "upgradeResult");
        if (upgradeResult.getNew_version() == -1) {
            new HttpFlow(new NetCoroutineScope(null, null, null, 7, null), this$0.getMService(), new AppUpgradeRequest$getAppUpgradeDetails$2$1(this$0, new AppVersionDetailParams(packageName, versionName, LocaleUtil.getCurrentLocale$default(LocaleUtil.INSTANCE, false, false, 3, null)), null)).error(error).success(new Function1() { // from class: di1
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return AppUpgradeRequest.getAppUpgradeDetails$lambda$1$lambda$0(success, upgradeResult, (AppVersionDetailResult) obj);
                }
            });
        } else {
            success.invoke2(upgradeResult);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getAppUpgradeDetails$lambda$1$lambda$0(Function1 success, AppUpgradeResult upgradeResult, AppVersionDetailResult it) {
        Intrinsics.checkNotNullParameter(success, "$success");
        Intrinsics.checkNotNullParameter(upgradeResult, "$upgradeResult");
        Intrinsics.checkNotNullParameter(it, "it");
        success.invoke2(new AppUpgradeResult(upgradeResult.getNew_version(), upgradeResult.getNew_version_name(), upgradeResult.getNew_version_code(), upgradeResult.getDownload_url(), it.getChange_log()));
        return Unit.INSTANCE;
    }

    public final void getAppUpgrade(@NotNull String packageName, @NotNull String versionName, long versionCode, @NotNull Function1<? super AppUpgradeResult, Unit> success, @NotNull Function1<? super ApiException, Unit> error) {
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        Intrinsics.checkNotNullParameter(versionName, "versionName");
        Intrinsics.checkNotNullParameter(success, "success");
        Intrinsics.checkNotNullParameter(error, "error");
        new HttpFlow(new NetCoroutineScope(null, null, null, 7, null), getMService(), new AnonymousClass1(packageName, versionName, versionCode, this, null)).error(error).success(success);
    }

    public final void getAppUpgradeDetails(@NotNull final String packageName, @NotNull final String versionName, long versionCode, @NotNull final Function1<? super AppUpgradeResult, Unit> success, @NotNull final Function1<? super ApiException, Unit> error) {
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        Intrinsics.checkNotNullParameter(versionName, "versionName");
        Intrinsics.checkNotNullParameter(success, "success");
        Intrinsics.checkNotNullParameter(error, "error");
        new HttpFlow(new NetCoroutineScope(null, null, null, 7, null), getMService(), new C13931(packageName, versionName, versionCode, this, null)).error(error).success(new Function1() { // from class: ei1
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return AppUpgradeRequest.getAppUpgradeDetails$lambda$1(packageName, versionName, this, error, success, (AppUpgradeResult) obj);
            }
        });
    }
}
