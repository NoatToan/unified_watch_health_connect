package com.xiaomi.fitness.health.ecg.web;

import android.accounts.OperationCanceledException;
import android.app.Application;
import android.content.Intent;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.webkit.JavascriptInterface;
import android.webkit.WebStorage;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import com.mibi.sdk.common.account.AccountInteractActivity;
import com.xiaomi.account.openauth.XMAuthericationException;
import com.xiaomi.account.openauth.XiaomiOAuthFuture;
import com.xiaomi.account.openauth.XiaomiOAuthResults;
import com.xiaomi.account.openauth.XiaomiOAuthorize;
import com.xiaomi.accountsdk.request.NetworkUtils;
import com.xiaomi.fit.fitness.export.data.item.EcgMedicalItemReport;
import com.xiaomi.fitness.account.api.bean.UserProfile;
import com.xiaomi.fitness.account.extensions.AccountManagerExtKt;
import com.xiaomi.fitness.account.manager.AccountCoreInfo;
import com.xiaomi.fitness.account.user.UserInfoManager;
import com.xiaomi.fitness.baseui.common.BaseFragmentExKt;
import com.xiaomi.fitness.baseui.common.FragmentParams;
import com.xiaomi.fitness.baseui.dialog.CommonDialog;
import com.xiaomi.fitness.common.app.LifecycleConstantKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.MarketUtil;
import com.xiaomi.fitness.common.utils.UIUtils;
import com.xiaomi.fitness.common.utils.model.PackageNameWrapper;
import com.xiaomi.fitness.health.ecg.EcgAnalyzeRepository;
import com.xiaomi.fitness.health.ecg.EcgAnalyzeServiceAuthFragment;
import com.xiaomi.fitness.health.ecg.EcgItemDetailActivity;
import com.xiaomi.fitness.health.ecg.EcgViewModel;
import com.xiaomi.fitness.health.ecg.SelectEcgForAnalyzingFragment;
import com.xiaomi.fitness.health.ecg.data.EcgConstantsKt;
import com.xiaomi.fitness.health.ecg.data.EcgReportShareModel;
import com.xiaomi.fitness.health.ecg.push.EcgSchemaHandler;
import com.xiaomi.fitness.health.ecg.util.EcgExtKt;
import com.xiaomi.fitness.health.ecg.util.EcgTrackHelper;
import defpackage.dih;
import defpackage.i4b;
import defpackage.jbr;
import defpackage.jui;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.io.ByteStreamsKt;
import kotlin.io.CloseableKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0016\n\u0002\u0010\u0015\n\u0002\b\u0003\b\u0007\u0018\u0000 A2\u00020\u0001:\u0001AB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0014J\u0010\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\b\u0010\u0017\u001a\u00020\u0011H\u0016J\b\u0010\u0018\u001a\u00020\u0011H\u0016J\b\u0010\u0019\u001a\u00020\u0011H\u0016J\b\u0010\u001a\u001a\u00020\u0011H\u0016J\u0010\u0010\u001b\u001a\u00020\u00112\u0006\u0010\u001c\u001a\u00020\u0007H\u0007J\b\u0010\u001d\u001a\u00020\u0007H\u0007J\b\u0010\u001e\u001a\u00020\u0007H\u0007J\b\u0010\u001f\u001a\u00020\u0007H\u0007J\u0010\u0010 \u001a\u00020\u00112\u0006\u0010!\u001a\u00020\"H\u0007J\b\u0010#\u001a\u00020\u0011H\u0007J\b\u0010$\u001a\u00020\u0011H\u0007J\b\u0010%\u001a\u00020\"H\u0007J\"\u0010&\u001a\u00020\u00112\u0006\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020(2\b\u0010*\u001a\u0004\u0018\u00010\u0016H\u0014J\b\u0010+\u001a\u00020\u0011H\u0007J\u0010\u0010,\u001a\u00020\u00112\u0006\u0010-\u001a\u00020\u0007H\u0007J\u0012\u0010.\u001a\u00020\"2\b\u0010/\u001a\u0004\u0018\u00010\u0007H\u0007J\u0010\u00100\u001a\u00020\u00112\u0006\u00101\u001a\u00020\u0007H\u0016J\b\u00102\u001a\u00020\u0011H\u0002J\u0010\u00103\u001a\u00020\u00112\u0006\u00104\u001a\u00020\"H\u0002J\u0010\u00105\u001a\u00020\u00072\u0006\u00106\u001a\u00020\"H\u0002J\b\u00107\u001a\u00020\u0011H\u0007J\u0018\u00108\u001a\u00020\u00112\u0006\u00109\u001a\u00020\u00072\u0006\u0010:\u001a\u00020(H\u0002J\u000e\u0010;\u001a\u00020\u0007H\u0082@¢\u0006\u0002\u0010<J\u0010\u0010=\u001a\u00020\u00112\u0006\u0010>\u001a\u00020?H\u0002J\b\u0010@\u001a\u00020\u0011H\u0014R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082.¢\u0006\u0002\n\u0000R\u001e\u0010\n\u001a\u00020\u000b8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006B"}, d2 = {"Lcom/xiaomi/fitness/health/ecg/web/EcgWebViewActivity;", "Lcom/xiaomi/fitness/webview/WebViewActivity;", "<init>", "()V", "ecgMeasureReport", "Lcom/xiaomi/fit/fitness/export/data/item/EcgMedicalItemReport;", "pageOrigin", "", "ecgViewModel", "Lcom/xiaomi/fitness/health/ecg/EcgViewModel;", "ecgAnalyzeRepository", "Lcom/xiaomi/fitness/health/ecg/EcgAnalyzeRepository;", "getEcgAnalyzeRepository", "()Lcom/xiaomi/fitness/health/ecg/EcgAnalyzeRepository;", "setEcgAnalyzeRepository", "(Lcom/xiaomi/fitness/health/ecg/EcgAnalyzeRepository;)V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "initDataFromIntent", "intent", "Landroid/content/Intent;", "addJavascriptInterfaceCustom", "onBackPressed", "showServerErrorView", "initView", "requestOAuthCode", "requestParams", "getEcgAuthData", "accessTokenExpired", "getEcgServiceData", "onSubmitAnalyzeResult", "success", "", "exitPage", "jumpEcgAuthFragment", "shouldShowAppAuthPage", "onActivityResult", AccountInteractActivity.KEY_REQUEST_CODE, "", "resultCode", "data", "jumpSelectEcgReportFragment", "shareEcgReport", "ecgReportShareModelJsonStr", "isThirdPartyApkInstalled", "jsonData", "loadUrl", "url", "goBack", "setAppAuthResult", "accepted", "fetchAuthDataJson", "needRefresh", "jumpEcgItemDetailPage", "downloadEcgReportAndOpenShareSheet", "srcUrl", "fileType", "getEcgDataJson", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchOAuthCode", "scopeArray", "", LifecycleConstantKt.ON_DESTROY, "Companion", "health_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class EcgWebViewActivity extends Hilt_EcgWebViewActivity {

    @NotNull
    public static final String ECG_ITEM_PAGE_ORIGIN = "ecg_item";

    @NotNull
    public static final String ORIGIN = "origin";

    @NotNull
    public static final String TAG = "EcgWeb";
    public EcgAnalyzeRepository ecgAnalyzeRepository;

    @Nullable
    private EcgMedicalItemReport ecgMeasureReport;
    private EcgViewModel ecgViewModel;

    @Nullable
    private String pageOrigin;

    /* JADX INFO: renamed from: com.xiaomi.fitness.health.ecg.web.EcgWebViewActivity$downloadEcgReportAndOpenShareSheet$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.health.ecg.web.EcgWebViewActivity$downloadEcgReportAndOpenShareSheet$1", f = "EcgWebViewActivity.kt", i = {1}, l = {320, 329, 337, 337, 337}, m = "invokeSuspend", n = {"fileTypeStr"}, s = {"L$0"})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ int $fileType;
        final /* synthetic */ CommonDialog $loadingDialog;
        final /* synthetic */ File $outputFile;
        final /* synthetic */ String $srcUrl;
        Object L$0;
        int label;
        final /* synthetic */ EcgWebViewActivity this$0;

        /* JADX INFO: renamed from: com.xiaomi.fitness.health.ecg.web.EcgWebViewActivity$downloadEcgReportAndOpenShareSheet$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.xiaomi.fitness.health.ecg.web.EcgWebViewActivity$downloadEcgReportAndOpenShareSheet$1$1", f = "EcgWebViewActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class C05971 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ CommonDialog $loadingDialog;
            int label;
            final /* synthetic */ EcgWebViewActivity this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C05971(CommonDialog commonDialog, EcgWebViewActivity ecgWebViewActivity, Continuation<? super C05971> continuation) {
                super(2, continuation);
                this.$loadingDialog = commonDialog;
                this.this$0 = ecgWebViewActivity;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C05971(this.$loadingDialog, this.this$0, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                this.$loadingDialog.showIfNeed(this.this$0.getSupportFragmentManager());
                return Unit.INSTANCE;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C05971) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX INFO: renamed from: com.xiaomi.fitness.health.ecg.web.EcgWebViewActivity$downloadEcgReportAndOpenShareSheet$1$3, reason: invalid class name */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.xiaomi.fitness.health.ecg.web.EcgWebViewActivity$downloadEcgReportAndOpenShareSheet$1$3", f = "EcgWebViewActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class AnonymousClass3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ CommonDialog $loadingDialog;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass3(CommonDialog commonDialog, Continuation<? super AnonymousClass3> continuation) {
                super(2, continuation);
                this.$loadingDialog = commonDialog;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass3(this.$loadingDialog, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                this.$loadingDialog.dismiss();
                return Unit.INSTANCE;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX INFO: renamed from: com.xiaomi.fitness.health.ecg.web.EcgWebViewActivity$downloadEcgReportAndOpenShareSheet$1$4, reason: invalid class name */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.xiaomi.fitness.health.ecg.web.EcgWebViewActivity$downloadEcgReportAndOpenShareSheet$1$4", f = "EcgWebViewActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class AnonymousClass4 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ CommonDialog $loadingDialog;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass4(CommonDialog commonDialog, Continuation<? super AnonymousClass4> continuation) {
                super(2, continuation);
                this.$loadingDialog = commonDialog;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass4(this.$loadingDialog, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                this.$loadingDialog.dismiss();
                return Unit.INSTANCE;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass4) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(String str, int i, EcgWebViewActivity ecgWebViewActivity, File file, CommonDialog commonDialog, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$srcUrl = str;
            this.$fileType = i;
            this.this$0 = ecgWebViewActivity;
            this.$outputFile = file;
            this.$loadingDialog = commonDialog;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$srcUrl, this.$fileType, this.this$0, this.$outputFile, this.$loadingDialog, continuation);
        }

        /* JADX WARN: Code duplicated, block: B:35:0x00a3  */
        /* JADX WARN: Code duplicated, block: B:37:0x00b8 A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Throwable th;
            InputStream inputStreamOpenStream;
            FileOutputStream fileOutputStream;
            String fileTypeStr;
            MainCoroutineDispatcher main;
            AnonymousClass4 anonymousClass4;
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                try {
                    try {
                        try {
                            if (i != 0) {
                                if (i == 1) {
                                    ResultKt.throwOnFailure(obj);
                                } else if (i == 2) {
                                    fileTypeStr = (String) this.L$0;
                                    ResultKt.throwOnFailure(obj);
                                    EcgExtKt.shareByShareSheet(this.this$0, this.$outputFile, fileTypeStr);
                                    if (this.$loadingDialog.isShowing()) {
                                        main = Dispatchers.getMain();
                                        anonymousClass4 = new AnonymousClass4(this.$loadingDialog, null);
                                        this.L$0 = null;
                                        this.label = 3;
                                        if (BuildersKt.withContext(main, anonymousClass4, this) == coroutine_suspended) {
                                            return coroutine_suspended;
                                        }
                                    }
                                } else {
                                    if (i != 3 && i != 4) {
                                        if (i != 5) {
                                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                        }
                                        th = (Throwable) this.L$0;
                                        ResultKt.throwOnFailure(obj);
                                        throw th;
                                    }
                                    ResultKt.throwOnFailure(obj);
                                }
                                return Unit.INSTANCE;
                            }
                            ResultKt.throwOnFailure(obj);
                            MainCoroutineDispatcher main2 = Dispatchers.getMain();
                            C05971 c05971 = new C05971(this.$loadingDialog, this.this$0, null);
                            this.label = 1;
                            if (BuildersKt.withContext(main2, c05971, this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            Intrinsics.checkNotNull(inputStreamOpenStream);
                            ByteStreamsKt.copyTo$default(inputStreamOpenStream, fileOutputStream, 0, 2, null);
                            CloseableKt.closeFinally(fileOutputStream, null);
                            CloseableKt.closeFinally(inputStreamOpenStream, null);
                            fileTypeStr = EcgExtKt.getFileTypeStr(this.$fileType);
                            MainCoroutineDispatcher main3 = Dispatchers.getMain();
                            AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.$loadingDialog, null);
                            this.L$0 = fileTypeStr;
                            this.label = 2;
                            if (BuildersKt.withContext(main3, anonymousClass3, this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            EcgExtKt.shareByShareSheet(this.this$0, this.$outputFile, fileTypeStr);
                            if (this.$loadingDialog.isShowing()) {
                                main = Dispatchers.getMain();
                                anonymousClass4 = new AnonymousClass4(this.$loadingDialog, null);
                                this.L$0 = null;
                                this.label = 3;
                                if (BuildersKt.withContext(main, anonymousClass4, this) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            }
                            return Unit.INSTANCE;
                        } catch (Throwable th2) {
                            try {
                                throw th2;
                            } catch (Throwable th3) {
                                CloseableKt.closeFinally(fileOutputStream, th2);
                                throw th3;
                            }
                        }
                        fileOutputStream = new FileOutputStream(this.$outputFile);
                    } catch (Throwable th4) {
                        try {
                            throw th4;
                        } catch (Throwable th5) {
                            CloseableKt.closeFinally(inputStreamOpenStream, th4);
                            throw th5;
                        }
                    }
                    inputStreamOpenStream = new URL(this.$srcUrl).openStream();
                } catch (Exception e) {
                    Logger.e("downloadFileFromUrl e=" + e, new Object[0]);
                    if (this.$loadingDialog.isShowing()) {
                        MainCoroutineDispatcher main4 = Dispatchers.getMain();
                        AnonymousClass4 anonymousClass5 = new AnonymousClass4(this.$loadingDialog, null);
                        this.L$0 = null;
                        this.label = 4;
                        if (BuildersKt.withContext(main4, anonymousClass5, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                }
            } catch (Throwable th6) {
                if (!this.$loadingDialog.isShowing()) {
                    throw th6;
                }
                MainCoroutineDispatcher main5 = Dispatchers.getMain();
                AnonymousClass4 anonymousClass6 = new AnonymousClass4(this.$loadingDialog, null);
                this.L$0 = th6;
                this.label = 5;
                if (BuildersKt.withContext(main5, anonymousClass6, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                th = th6;
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.health.ecg.web.EcgWebViewActivity$fetchOAuthCode$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.health.ecg.web.EcgWebViewActivity$fetchOAuthCode$1", f = "EcgWebViewActivity.kt", i = {}, l = {408, 408, 408, 408, 408, 408}, m = "invokeSuspend", n = {}, s = {})
    public static final class C24651 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ XiaomiOAuthFuture<XiaomiOAuthResults> $future;
        Object L$0;
        int label;
        final /* synthetic */ EcgWebViewActivity this$0;

        /* JADX INFO: renamed from: com.xiaomi.fitness.health.ecg.web.EcgWebViewActivity$fetchOAuthCode$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.xiaomi.fitness.health.ecg.web.EcgWebViewActivity$fetchOAuthCode$1$1", f = "EcgWebViewActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class C05981 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ Ref.ObjectRef<String> $codeResult;
            int label;
            final /* synthetic */ EcgWebViewActivity this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C05981(Ref.ObjectRef<String> objectRef, EcgWebViewActivity ecgWebViewActivity, Continuation<? super C05981> continuation) {
                super(2, continuation);
                this.$codeResult = objectRef;
                this.this$0 = ecgWebViewActivity;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C05981(this.$codeResult, this.this$0, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                Logger.i(EcgWebViewActivity.TAG, "setOAuthCode code:" + ((Object) this.$codeResult.element));
                this.this$0.getWebView().loadUrl("javascript:setOAuthCode('" + ((Object) this.$codeResult.element) + "');");
                EcgTrackHelper.INSTANCE.trackOauthAuthorizeResult(StringsKt__StringsKt.isBlank(this.$codeResult.element) ^ true);
                return Unit.INSTANCE;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C05981) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C24651(XiaomiOAuthFuture<XiaomiOAuthResults> xiaomiOAuthFuture, EcgWebViewActivity ecgWebViewActivity, Continuation<? super C24651> continuation) {
            super(2, continuation);
            this.$future = xiaomiOAuthFuture;
            this.this$0 = ecgWebViewActivity;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C24651(this.$future, this.this$0, continuation);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure(obj);
                    Ref.ObjectRef objectRef = new Ref.ObjectRef();
                    String str = "";
                    objectRef.element = "";
                    try {
                        try {
                            try {
                                try {
                                    try {
                                        XiaomiOAuthResults result = this.$future.getResult();
                                        if (result.hasError()) {
                                            Logger.e(EcgWebViewActivity.TAG, "getOauthError code:" + result.getErrorCode() + ";" + result.getErrorMessage());
                                        } else {
                                            String code = result.getCode();
                                            objectRef.element = code == null ? str : code;
                                            Logger.e(EcgWebViewActivity.TAG, "getOauthSuccess code:" + code);
                                        }
                                        MainCoroutineDispatcher main = Dispatchers.getMain();
                                        C05981 c05981 = new C05981(objectRef, this.this$0, null);
                                        this.label = 1;
                                        if (BuildersKt.withContext(main, c05981, this) == coroutine_suspended) {
                                            return coroutine_suspended;
                                        }
                                    } catch (OperationCanceledException e) {
                                        Logger.e(EcgWebViewActivity.TAG, "getOauthOperationCanceledException " + e);
                                        MainCoroutineDispatcher main2 = Dispatchers.getMain();
                                        C05981 c05982 = new C05981(objectRef, this.this$0, null);
                                        this.label = 3;
                                        if (BuildersKt.withContext(main2, c05982, this) == coroutine_suspended) {
                                            return coroutine_suspended;
                                        }
                                    }
                                } catch (Exception e2) {
                                    Logger.e(EcgWebViewActivity.TAG, "getOauthException " + e2);
                                    MainCoroutineDispatcher main3 = Dispatchers.getMain();
                                    C05981 c05983 = new C05981(objectRef, this.this$0, null);
                                    this.label = 5;
                                    if (BuildersKt.withContext(main3, c05983, this) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                }
                            } catch (IOException e3) {
                                Logger.e(EcgWebViewActivity.TAG, "getOauthIOException " + e3);
                                MainCoroutineDispatcher main4 = Dispatchers.getMain();
                                C05981 c05984 = new C05981(objectRef, this.this$0, null);
                                this.label = 2;
                                if (BuildersKt.withContext(main4, c05984, this) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                            }
                        } catch (XMAuthericationException e4) {
                            Logger.e(EcgWebViewActivity.TAG, "getOauthXMAuthericationException " + e4);
                            MainCoroutineDispatcher main5 = Dispatchers.getMain();
                            C05981 c05985 = new C05981(objectRef, this.this$0, null);
                            this.label = 4;
                            if (BuildersKt.withContext(main5, c05985, this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        }
                    } catch (Throwable th) {
                        MainCoroutineDispatcher main6 = Dispatchers.getMain();
                        C05981 c05986 = new C05981(objectRef, this.this$0, null);
                        this.L$0 = th;
                        this.label = 6;
                        if (BuildersKt.withContext(main6, c05986, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        throw th;
                    }
                    break;
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                    ResultKt.throwOnFailure(obj);
                    break;
                case 6:
                    Throwable th2 = (Throwable) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    throw th2;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C24651) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.fitness.health.ecg.web.EcgWebViewActivity$getEcgDataJson$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.health.ecg.web.EcgWebViewActivity", f = "EcgWebViewActivity.kt", i = {0, 0}, l = {365}, m = "getEcgDataJson", n = {"report", EcgSchemaHandler.PARAM_MEASURE_TIME}, s = {"L$0", "I$0"})
    public static final class C24661 extends ContinuationImpl {
        float F$0;
        float F$1;
        int I$0;
        int I$1;
        long J$0;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        int label;
        /* synthetic */ Object result;

        public C24661(Continuation<? super C24661> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return EcgWebViewActivity.this.getEcgDataJson(this);
        }
    }

    private final void downloadEcgReportAndOpenShareSheet(String srcUrl, int fileType) {
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), Dispatchers.getIO(), null, new AnonymousClass1(srcUrl, fileType, this, EcgExtKt.getDesFile(fileType), new CommonDialog.c("share pdf").setCustomLayoutId(jui.o).create(), null), 2, null);
    }

    private final String fetchAuthDataJson(boolean needRefresh) {
        EcgAuthData ecgAuthData = (EcgAuthData) BuildersKt__BuildersKt.runBlocking$default(null, new EcgWebViewActivity$fetchAuthDataJson$ecgAuthData$1(this, needRefresh, null), 1, null);
        Logger.i(TAG, "fetchAuthDataJson[" + needRefresh + "] result " + ecgAuthData);
        String json = i4b.a().toJson(ecgAuthData);
        Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
        return json;
    }

    private final void fetchOAuthCode(int[] scopeArray) {
        XiaomiOAuthFuture<XiaomiOAuthResults> xiaomiOAuthFutureStartGetOAuthCode = new XiaomiOAuthorize().setAppId(EcgConstantsKt.OAUTH_HLW_APP_ID).setRedirectUrl(EcgConstantsKt.getHlwUrl("oauth_redirect_url")).setNoMiui(false).setSkipConfirm(true).setHideQrApps(Boolean.TRUE).setScope(scopeArray).startGetOAuthCode(this);
        Intrinsics.checkNotNullExpressionValue(xiaomiOAuthFutureStartGetOAuthCode, "startGetOAuthCode(...)");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this), Dispatchers.getIO(), null, new C24651(xiaomiOAuthFutureStartGetOAuthCode, this, null), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:39:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:40:0x00be  */
    /* JADX WARN: Code duplicated, block: B:43:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:44:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:46:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:47:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:50:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:53:0x0116 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:54:0x0117  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object getEcgDataJson(Continuation<? super String> continuation) {
        C24661 c24661;
        String str;
        String userId;
        String avatarAddress;
        float height;
        float weight;
        int age;
        String sex;
        Integer numBoxInt;
        String sid;
        long measureTime;
        Object recordData;
        String str2;
        String str3;
        int i;
        long j;
        int i2;
        String str4;
        Integer num;
        float f;
        float f2;
        EcgMedicalItemReport ecgMedicalItemReport;
        List listEmptyList;
        if (continuation instanceof C24661) {
            c24661 = (C24661) continuation;
            int i3 = c24661.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c24661.label = i3 - Integer.MIN_VALUE;
            } else {
                c24661 = new C24661(continuation);
            }
        } else {
            c24661 = new C24661(continuation);
        }
        Object obj = c24661.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i4 = c24661.label;
        if (i4 == 0) {
            ResultKt.throwOnFailure(obj);
            if (this.ecgMeasureReport == null) {
                return "";
            }
            UserInfoManager.Companion companion = UserInfoManager.INSTANCE;
            UserProfile userProfile = AccountManagerExtKt.getInstance(companion).getUserProfile(true);
            AccountCoreInfo accountCoreInfoLoadAccountCoreInfo = AccountManagerExtKt.getInstance(companion).loadAccountCoreInfo();
            EcgMedicalItemReport ecgMedicalItemReport2 = this.ecgMeasureReport;
            Intrinsics.checkNotNull(ecgMedicalItemReport2);
            int measureTime2 = ecgMedicalItemReport2.getMeasureTime() < 30 ? (int) ecgMedicalItemReport2.getMeasureTime() : 30;
            String userName = accountCoreInfoLoadAccountCoreInfo != null ? accountCoreInfoLoadAccountCoreInfo.getUserName() : null;
            if (userName == null || StringsKt__StringsKt.isBlank(userName)) {
                if (accountCoreInfoLoadAccountCoreInfo == null || (userId = accountCoreInfoLoadAccountCoreInfo.getUserId()) == null) {
                    str = "";
                }
                if (accountCoreInfoLoadAccountCoreInfo != null) {
                    avatarAddress = accountCoreInfoLoadAccountCoreInfo.getAvatarAddress();
                } else {
                    avatarAddress = null;
                }
                height = userProfile.getHeight();
                weight = userProfile.getWeight();
                age = userProfile.getAge();
                sex = userProfile.getSex();
                if (Intrinsics.areEqual(sex, "male")) {
                    numBoxInt = Boxing.boxInt(1);
                } else if (Intrinsics.areEqual(sex, "female")) {
                    numBoxInt = Boxing.boxInt(2);
                } else {
                    numBoxInt = null;
                }
                sid = ecgMedicalItemReport2.getSid();
                if (sid == null) {
                    sid = "";
                }
                measureTime = ecgMedicalItemReport2.getMeasureTime();
                int measureDuration = ecgMedicalItemReport2.getMeasureDuration();
                c24661.L$0 = ecgMedicalItemReport2;
                c24661.L$1 = str;
                c24661.L$2 = avatarAddress;
                c24661.L$3 = numBoxInt;
                c24661.L$4 = sid;
                c24661.I$0 = measureTime2;
                c24661.F$0 = height;
                c24661.F$1 = weight;
                c24661.I$1 = age;
                c24661.J$0 = measureTime;
                c24661.label = 1;
                recordData = ecgMedicalItemReport2.getRecordData(measureDuration, 1, c24661);
                if (recordData == coroutine_suspended) {
                    return coroutine_suspended;
                }
                str2 = avatarAddress;
                str3 = str;
                i = age;
                j = measureTime;
                i2 = measureTime2;
                str4 = sid;
                num = numBoxInt;
                f = weight;
                f2 = height;
                obj = recordData;
                ecgMedicalItemReport = ecgMedicalItemReport2;
            } else {
                userId = accountCoreInfoLoadAccountCoreInfo != null ? accountCoreInfoLoadAccountCoreInfo.getUserName() : null;
                Intrinsics.checkNotNull(userId);
            }
            str = userId;
            if (accountCoreInfoLoadAccountCoreInfo != null) {
                avatarAddress = accountCoreInfoLoadAccountCoreInfo.getAvatarAddress();
            } else {
                avatarAddress = null;
            }
            height = userProfile.getHeight();
            weight = userProfile.getWeight();
            age = userProfile.getAge();
            sex = userProfile.getSex();
            if (Intrinsics.areEqual(sex, "male")) {
                numBoxInt = Boxing.boxInt(1);
            } else if (Intrinsics.areEqual(sex, "female")) {
                numBoxInt = Boxing.boxInt(2);
            } else {
                numBoxInt = null;
            }
            sid = ecgMedicalItemReport2.getSid();
            if (sid == null) {
                sid = "";
            }
            measureTime = ecgMedicalItemReport2.getMeasureTime();
            int measureDuration2 = ecgMedicalItemReport2.getMeasureDuration();
            c24661.L$0 = ecgMedicalItemReport2;
            c24661.L$1 = str;
            c24661.L$2 = avatarAddress;
            c24661.L$3 = numBoxInt;
            c24661.L$4 = sid;
            c24661.I$0 = measureTime2;
            c24661.F$0 = height;
            c24661.F$1 = weight;
            c24661.I$1 = age;
            c24661.J$0 = measureTime;
            c24661.label = 1;
            recordData = ecgMedicalItemReport2.getRecordData(measureDuration2, 1, c24661);
            if (recordData == coroutine_suspended) {
                return coroutine_suspended;
            }
            str2 = avatarAddress;
            str3 = str;
            i = age;
            j = measureTime;
            i2 = measureTime2;
            str4 = sid;
            num = numBoxInt;
            f = weight;
            f2 = height;
            obj = recordData;
            ecgMedicalItemReport = ecgMedicalItemReport2;
        } else {
            if (i4 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            long j2 = c24661.J$0;
            int i5 = c24661.I$1;
            f = c24661.F$1;
            f2 = c24661.F$0;
            int i6 = c24661.I$0;
            String str5 = (String) c24661.L$4;
            Integer num2 = (Integer) c24661.L$3;
            String str6 = (String) c24661.L$2;
            String str7 = (String) c24661.L$1;
            ecgMedicalItemReport = (EcgMedicalItemReport) c24661.L$0;
            ResultKt.throwOnFailure(obj);
            j = j2;
            i = i5;
            i2 = i6;
            str2 = str6;
            str3 = str7;
            str4 = str5;
            num = num2;
        }
        float[] fArr = (float[]) obj;
        if (fArr == null || (listEmptyList = ArraysKt___ArraysKt.toList(fArr)) == null) {
            listEmptyList = CollectionsKt__CollectionsKt.emptyList();
        }
        String json = i4b.a().toJson(new EcgServiceData(str3, str2, Boxing.boxFloat(f2), Boxing.boxFloat(f), Boxing.boxInt(i), num, ecgMedicalItemReport.getAvgHr(), str4, ecgMedicalItemReport.getSampleFrequency(), j, i2, listEmptyList));
        Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
        return json;
    }

    private final void goBack() {
        if (NetworkUtils.isNetworkConnected(this)) {
            getWebView().loadUrl("javascript:goBack();");
        } else {
            finish();
        }
    }

    private final void setAppAuthResult(boolean accepted) {
        Logger.i(TAG, "setAppAuthResult accepted=" + accepted);
        getWebView().loadUrl("javascript:setAppAuthResult('" + accepted + "');");
    }

    @JavascriptInterface
    @NotNull
    public final String accessTokenExpired() {
        Logger.i(TAG, "js:accessTokenExpired");
        return fetchAuthDataJson(true);
    }

    @Override // com.xiaomi.fitness.webview.WebViewActivity
    public void addJavascriptInterfaceCustom() {
        super.addJavascriptInterfaceCustom();
        getWebView().addJavascriptInterface(this, "ecgNative");
    }

    @JavascriptInterface
    public final void exitPage() {
        Logger.i(TAG, "js:exitPage");
        finish();
    }

    @NotNull
    public final EcgAnalyzeRepository getEcgAnalyzeRepository() {
        EcgAnalyzeRepository ecgAnalyzeRepository = this.ecgAnalyzeRepository;
        if (ecgAnalyzeRepository != null) {
            return ecgAnalyzeRepository;
        }
        Intrinsics.throwUninitializedPropertyAccessException("ecgAnalyzeRepository");
        return null;
    }

    @JavascriptInterface
    @NotNull
    public final String getEcgAuthData() {
        Logger.i(TAG, "js:getEcgAuthData");
        return fetchAuthDataJson(false);
    }

    @JavascriptInterface
    @NotNull
    public final String getEcgServiceData() {
        Logger.i(TAG, "js:getEcgServiceData");
        return (String) BuildersKt__BuildersKt.runBlocking$default(null, new EcgWebViewActivity$getEcgServiceData$result$1(this, null), 1, null);
    }

    @Override // com.xiaomi.fitness.webview.WebViewActivity
    public void initDataFromIntent(@NotNull Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        super.initDataFromIntent(intent);
        this.ecgMeasureReport = (EcgMedicalItemReport) intent.getSerializableExtra(EcgConstantsKt.PARAM_REPORT);
        this.pageOrigin = intent.getStringExtra("origin");
        Logger.i(TAG, "ecgReport " + this.ecgMeasureReport);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.xiaomi.fitness.webview.WebViewActivity
    public void initView() {
        super.initView();
        if (UIUtils.INSTANCE.isTablet()) {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
            ((jbr) getMBinding()).C.getLayoutParams().height = displayMetrics.heightPixels;
            ((jbr) getMBinding()).C.requestLayout();
        }
    }

    @JavascriptInterface
    public final boolean isThirdPartyApkInstalled(@Nullable String jsonData) {
        String packageName = ((PackageNameWrapper) i4b.a().fromJson(jsonData, PackageNameWrapper.class)).getPackageName();
        Application application = getApplication();
        Intrinsics.checkNotNullExpressionValue(application, "getApplication(...)");
        return MarketUtil.checkAppInstalled(application, packageName);
    }

    @JavascriptInterface
    public final void jumpEcgAuthFragment() {
        FragmentParams fragmentParamsB = new FragmentParams.b().e(EcgAnalyzeServiceAuthFragment.class).c(null).a(true).b();
        Intrinsics.checkNotNullExpressionValue(fragmentParamsB, "build(...)");
        dih.a().h(this, fragmentParamsB, 100);
    }

    @JavascriptInterface
    public final void jumpEcgItemDetailPage() {
        Intent intent = new Intent(this, (Class<?>) EcgItemDetailActivity.class);
        intent.putExtra(EcgConstantsKt.PARAM_REPORT, this.ecgMeasureReport);
        startActivity(intent);
        finish();
    }

    @JavascriptInterface
    public final void jumpSelectEcgReportFragment() {
        BaseFragmentExKt.gotoFragmentPage(this, SelectEcgForAnalyzingFragment.class, null, true);
    }

    @Override // com.xiaomi.fitness.webview.WebViewActivity, defpackage.iqc
    public void loadUrl(@NotNull String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        HashMap map = new HashMap();
        map.put("Referer", EcgConstantsKt.getHlwUrl("wechat_pay_referer"));
        getWebView().loadUrl(url, map);
    }

    @Override // com.xiaomi.fitness.webview.WebViewActivity, androidx.fragment.app.FragmentActivity, androidx.p004activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        Object extras;
        Bundle extras2;
        super.onActivityResult(requestCode, resultCode, data);
        if (data == null || (extras = data.getExtras()) == null) {
            extras = AbstractJsonLexerKt.NULL;
        }
        Logger.i(TAG, "onActivityResult requestCode=" + requestCode + " resultCode=" + resultCode + " bundle=" + extras);
        if (resultCode != 123 || data == null || (extras2 = data.getExtras()) == null) {
            return;
        }
        setAppAuthResult(extras2.getBoolean(EcgAnalyzeServiceAuthFragment.KEY_APP_AGREEMENT_ACCEPTED, false));
    }

    @Override // com.xiaomi.fitness.webview.WebViewActivity, com.xiaomi.fitness.baseui.view.BaseActivity, androidx.p004activity.ComponentActivity, android.app.Activity
    /* JADX INFO: renamed from: onBackPressed */
    public void lambda$onCreate$0() {
        goBack();
    }

    @Override // com.xiaomi.fitness.webview.WebViewActivity, com.xiaomi.fitness.webview.Hilt_WebViewActivity, com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseViewModelActivity, com.xiaomi.fitness.baseui.view.BaseActivity, miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.p004activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.ecgViewModel = (EcgViewModel) new ViewModelProvider(this).get(EcgViewModel.class);
    }

    @Override // com.xiaomi.fitness.webview.WebViewActivity, com.xiaomi.fitness.webview.Hilt_WebViewActivity, com.xiaomi.fitness.baseui.view.BaseBindingActivity, com.xiaomi.fitness.baseui.view.BaseViewModelActivity, miuix.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        WebStorage.getInstance().deleteAllData();
    }

    @JavascriptInterface
    public final void onSubmitAnalyzeResult(boolean success) {
        EcgMedicalItemReport ecgMedicalItemReport;
        Logger.i(TAG, "js:onSubmitAnalyzeResult " + success);
        if (!success || (ecgMedicalItemReport = this.ecgMeasureReport) == null) {
            return;
        }
        Intrinsics.checkNotNull(ecgMedicalItemReport);
        ecgMedicalItemReport.setInterpretStatus(1);
        EcgViewModel ecgViewModel = this.ecgViewModel;
        if (ecgViewModel == null) {
            Intrinsics.throwUninitializedPropertyAccessException("ecgViewModel");
            ecgViewModel = null;
        }
        EcgMedicalItemReport ecgMedicalItemReport2 = this.ecgMeasureReport;
        Intrinsics.checkNotNull(ecgMedicalItemReport2);
        ecgViewModel.updateEcgReport(ecgMedicalItemReport2);
    }

    @JavascriptInterface
    public final void requestOAuthCode(@NotNull String requestParams) {
        int[] intArray;
        List<Integer> scopeList;
        Intrinsics.checkNotNullParameter(requestParams, "requestParams");
        Logger.i(TAG, "js:requestOAuthCode " + requestParams);
        RequestParams requestParams2 = (RequestParams) i4b.a().fromJson(requestParams, RequestParams.class);
        if (requestParams2 == null || (scopeList = requestParams2.getScopeList()) == null || (intArray = CollectionsKt___CollectionsKt.toIntArray(scopeList)) == null) {
            intArray = new int[0];
        }
        fetchOAuthCode(intArray);
    }

    public final void setEcgAnalyzeRepository(@NotNull EcgAnalyzeRepository ecgAnalyzeRepository) {
        Intrinsics.checkNotNullParameter(ecgAnalyzeRepository, "<set-?>");
        this.ecgAnalyzeRepository = ecgAnalyzeRepository;
    }

    @JavascriptInterface
    public final void shareEcgReport(@NotNull String ecgReportShareModelJsonStr) {
        Intrinsics.checkNotNullParameter(ecgReportShareModelJsonStr, "ecgReportShareModelJsonStr");
        EcgReportShareModel ecgReportShareModel = (EcgReportShareModel) i4b.a().fromJson(ecgReportShareModelJsonStr, EcgReportShareModel.class);
        downloadEcgReportAndOpenShareSheet(ecgReportShareModel.getUrl(), ecgReportShareModel.getFileType());
    }

    @JavascriptInterface
    public final boolean shouldShowAppAuthPage() {
        Boolean bool = (Boolean) BuildersKt__BuildersKt.runBlocking$default(null, new EcgWebViewActivity$shouldShowAppAuthPage$result$1(this, null), 1, null);
        Logger.i(TAG, "shouldShowAppAuthPage result=" + bool);
        return Intrinsics.areEqual(bool, Boolean.TRUE);
    }

    @Override // com.xiaomi.fitness.webview.WebViewActivity, defpackage.iqc
    public void showServerErrorView() {
        super.showServerErrorView();
        Logger.i(TAG, "server error..");
    }
}
