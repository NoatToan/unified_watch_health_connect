package com.huami.feedback.datasource;

import android.content.Context;
import android.os.Build;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.firebase.perf.network.FirebasePerfOkHttpClient;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.huami.account.UserLegalInfoManager;
import com.huami.feedback.api.UploadFileSetting;
import com.huami.feedback.entity.Contact;
import com.huami.feedback.entity.PostFeedbackInfoResult;
import com.huami.feedback.entity.UploadBaseParams;
import com.huami.feedback.entity.UploadDeviceInfo;
import com.huami.feedback.entity.UserForm;
import com.huami.feedback.sync.api.device.FeedbackDevice;
import com.huami.feedback.util.ErrorConstKt;
import com.huami.feedback.util.FeedbackException;
import com.huami.feedback.util.TextUtilKt;
import com.huami.feedback.util.Utils;
import com.huami.feedback.zepp.ui.FeedbackActivity;
import com.huami.http.ConverterKt;
import com.huami.http.HttpKit;
import com.huami.http.HttpKitKtxKt;
import com.huami.http.OkHttpKtxKt;
import com.huami.network.hmnetwork.config.HMAppConfig;
import com.huami.network.hmnetwork.server.HMServerDef;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.lab.webapi.HMUploadDeviceLogAPI;
import com.xiaomi.hm.health.ui.smartplay.appnotify.ContactSettingItemActivity;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.m;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import okhttp3.HttpUrl;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;
import org.koin.core.Koin;
import org.koin.core.component.KoinComponent;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 /2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001/B!\u0012\u0006\u0010'\u001a\u00020%\u0012\u0006\u0010)\u001a\u00020\u0011\u0012\b\b\u0002\u0010,\u001a\u00020*¢\u0006\u0004\b-\u0010.J \u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002J*\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000e\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002J\f\u0010\u0013\u001a\u00020\u0012*\u00020\u0011H\u0002J\u000e\u0010\u0014\u001a\u00020\n*\u0004\u0018\u00010\nH\u0002J\u0010\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u0015H\u0002J+\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ#\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001b\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\u001cH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010 J#\u0010#\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020\u00152\u0006\u0010\"\u001a\u00020\u0015H\u0096@ø\u0001\u0000¢\u0006\u0004\b#\u0010$R\u0016\u0010'\u001a\u00020%8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010&R\u0016\u0010)\u001a\u00020\u00118\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010(R\u0016\u0010,\u001a\u00020*8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010+\u0082\u0002\u0004\n\u0002\b\u0019¨\u00060"}, d2 = {"Lcom/huami/feedback/datasource/FileUploadDataSourceImpl;", "Lcom/huami/feedback/datasource/FileUploadDataSource;", "Lcom/huami/http/HttpKit;", "Lorg/koin/core/component/KoinComponent;", "Lcom/huami/feedback/entity/UploadBaseParams;", "baseParams", "Lcom/huami/feedback/entity/UploadDeviceInfo;", "uploadDeviceInfo", "Lcom/huami/feedback/entity/UserForm;", FeedbackActivity.KEY_USER_FORM, "", "e", "Lcom/huami/feedback/sync/api/device/FeedbackDevice;", "device", "sourceList", "Lcom/google/gson/JsonObject;", "b", "Lcom/huami/feedback/api/UploadFileSetting;", "Lcom/google/gson/JsonArray;", "a", "c", "", "loginID", GoogleApiAvailabilityLight.a, "Lcom/huami/feedback/entity/PostFeedbackInfoResult;", "postFeedbackInfo", "(Lcom/huami/feedback/entity/UploadBaseParams;Lcom/huami/feedback/entity/UserForm;Lcom/huami/feedback/entity/UploadDeviceInfo;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "putUrl", "Ljava/io/File;", "zipFile", "", "uploadLogFile", "(Ljava/lang/String;Ljava/io/File;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loginUID", "syncTime", "reportLogFileUploadResult", "(JJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroid/content/Context;", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Lcom/huami/feedback/api/UploadFileSetting;", "logFiles", "Lkotlinx/coroutines/CoroutineDispatcher;", "Lkotlinx/coroutines/CoroutineDispatcher;", "dispatcher", "<init>", "(Landroid/content/Context;Lcom/huami/feedback/api/UploadFileSetting;Lkotlinx/coroutines/CoroutineDispatcher;)V", "Companion", "feedback-impl_release"}, k = 1, mv = {1, 5, 1})
public final class FileUploadDataSourceImpl implements FileUploadDataSource, HttpKit, KoinComponent {

    @NotNull
    private static final String d = "users/%s/apps/%s/fileAccessURIs";

    @NotNull
    private static final String e = "users/%s/apps/%s/fileUploaded";

    @NotNull
    private static final String f = "release";

    @NotNull
    private static final String g = "develop";
    private static final long h = 0;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Context context;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final UploadFileSetting logFiles;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final CoroutineDispatcher dispatcher;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Lcom/huami/feedback/entity/PostFeedbackInfoResult;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.feedback.datasource.FileUploadDataSourceImpl$postFeedbackInfo$2", f = "FileUploadDataSourceImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super PostFeedbackInfoResult>, Object> {
        public int a;
        private /* synthetic */ Object b;
        public final /* synthetic */ UploadBaseParams d;
        public final /* synthetic */ UploadDeviceInfo e;
        public final /* synthetic */ UserForm f;

        /* JADX INFO: renamed from: com.huami.feedback.datasource.FileUploadDataSourceImpl$a$a, reason: collision with other inner class name */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class C0384a extends Lambda implements Function0<String> {
            public final /* synthetic */ Response a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0384a(Response response) {
                super(0);
                this.a = response;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final String getA() {
                return this.a.message();
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class b extends Lambda implements Function0<String> {
            public final /* synthetic */ String a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(String str) {
                super(0);
                this.a = str;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final String getA() {
                return Intrinsics.stringPlus("response:", this.a);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class c extends Lambda implements Function0<String> {
            public final /* synthetic */ Throwable a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(Throwable th) {
                super(0);
                this.a = th;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final String getA() {
                return Intrinsics.stringPlus("Read and parse response fail:", this.a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(UploadBaseParams uploadBaseParams, UploadDeviceInfo uploadDeviceInfo, UserForm userForm, Continuation<? super a> continuation) {
            super(2, continuation);
            this.d = uploadBaseParams;
            this.e = uploadDeviceInfo;
            this.f = userForm;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            a aVar = FileUploadDataSourceImpl.this.new a(this.d, this.e, this.f, continuation);
            aVar.b = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super PostFeedbackInfoResult> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object objM3845constructorimpl;
            PostFeedbackInfoResult postFeedbackInfoResult;
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            FileUploadDataSourceImpl fileUploadDataSourceImpl = FileUploadDataSourceImpl.this;
            UploadBaseParams uploadBaseParams = this.d;
            UploadDeviceInfo uploadDeviceInfo = this.e;
            UserForm userForm = this.f;
            try {
                Result.Companion companion = Result.Companion;
                Response responseHttpPost$default = HttpKitKtxKt.httpPost$default(fileUploadDataSourceImpl, fileUploadDataSourceImpl.d(uploadBaseParams.getLoginID()), OkHttpKtxKt.buildRequestJsonBody(fileUploadDataSourceImpl.e(uploadBaseParams, uploadDeviceInfo, userForm)), null, null, 12, null);
                if (!responseHttpPost$default.isSuccessful()) {
                    HMLog.info("feedback", new C0384a(responseHttpPost$default));
                    FeedbackException.INSTANCE.throwException(ErrorConstKt.SERVER_STAGE_1_FAILED, Intrinsics.stringPlus("意见反馈内容接口请求失败:", Boxing.boxInt(responseHttpPost$default.code())));
                }
                String strResponseToJsonStr = ConverterKt.responseToJsonStr(responseHttpPost$default);
                if (strResponseToJsonStr.length() == 0) {
                    FeedbackException.INSTANCE.throwException(ErrorConstKt.SERVER_STAGE_1_EMPTY_RESULT, "意见反馈内容接口返服务器返回数据为空");
                }
                HMLog.info("feedback", new b(strResponseToJsonStr));
                if (uploadDeviceInfo.getLogFile() == null) {
                    postFeedbackInfoResult = new PostFeedbackInfoResult(true, null, null, 6, null);
                } else {
                    JSONObject jSONObject = new JSONObject(strResponseToJsonStr);
                    String strOptString = jSONObject.optString("putURI");
                    JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(HMUploadDeviceLogAPI.a.b);
                    postFeedbackInfoResult = new PostFeedbackInfoResult(true, strOptString, jSONObjectOptJSONObject == null ? null : Boxing.boxLong(jSONObjectOptJSONObject.optLong("syncTime")));
                }
                objM3845constructorimpl = Result.m3845constructorimpl(postFeedbackInfoResult);
            } catch (Throwable th) {
                Result.Companion companion2 = Result.Companion;
                objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th));
            }
            Throwable thM3848exceptionOrNullimpl = Result.m3848exceptionOrNullimpl(objM3845constructorimpl);
            if (thM3848exceptionOrNullimpl != null) {
                HMLog.warn$default("feedback", null, new c(thM3848exceptionOrNullimpl), 2, null);
                if (thM3848exceptionOrNullimpl instanceof FeedbackException) {
                    throw thM3848exceptionOrNullimpl;
                }
                FeedbackException.INSTANCE.throwException(ErrorConstKt.SERVER_STAGE_1_EXCEPTION, Intrinsics.stringPlus("意见反馈内容接口请求异常:", thM3848exceptionOrNullimpl.getMessage()));
            }
            return Result.m3850isFailureimpl(objM3845constructorimpl) ? new PostFeedbackInfoResult(false, null, null, 6, null) : objM3845constructorimpl;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.feedback.datasource.FileUploadDataSourceImpl$reportLogFileUploadResult$2", f = "FileUploadDataSourceImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
        public int a;
        private /* synthetic */ Object b;
        public final /* synthetic */ String d;
        public final /* synthetic */ JsonObject e;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function0<String> {
            public final /* synthetic */ Response a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Response response) {
                super(0);
                this.a = response;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final String getA() {
                return "report upload file " + this.a.isSuccessful() + " : " + this.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, JsonObject jsonObject, Continuation<? super b> continuation) {
            super(2, continuation);
            this.d = str;
            this.e = jsonObject;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            b bVar = FileUploadDataSourceImpl.this.new b(this.d, this.e, continuation);
            bVar.b = obj;
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Boolean> continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object objM3845constructorimpl;
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            FileUploadDataSourceImpl fileUploadDataSourceImpl = FileUploadDataSourceImpl.this;
            String str = this.d;
            JsonObject jsonObject = this.e;
            try {
                Result.Companion companion = Result.Companion;
                Response responseHttpPut$default = HttpKitKtxKt.httpPut$default(fileUploadDataSourceImpl, str, OkHttpKtxKt.buildRequestJsonBody(jsonObject.toString()), null, null, 12, null);
                if (!responseHttpPut$default.isSuccessful()) {
                    HMLog.info("feedback", new a(responseHttpPut$default));
                    FeedbackException.INSTANCE.throwException(ErrorConstKt.SERVER_STAGE_3_FAILED, Intrinsics.stringPlus("意见反馈日志文件上传结果接口请求失败:", responseHttpPut$default));
                }
                objM3845constructorimpl = Result.m3845constructorimpl(Boxing.boxBoolean(responseHttpPut$default.isSuccessful()));
            } catch (Throwable th) {
                Result.Companion companion2 = Result.Companion;
                objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th));
            }
            Throwable thM3848exceptionOrNullimpl = Result.m3848exceptionOrNullimpl(objM3845constructorimpl);
            if (thM3848exceptionOrNullimpl != null) {
                if (thM3848exceptionOrNullimpl instanceof FeedbackException) {
                    throw thM3848exceptionOrNullimpl;
                }
                FeedbackException.INSTANCE.throwException(ErrorConstKt.SERVER_STAGE_3_EXCEPTION, "意见反馈同步日志上传结果接口请求异常");
            }
            return Result.m3850isFailureimpl(objM3845constructorimpl) ? Boxing.boxBoolean(false) : objM3845constructorimpl;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.feedback.datasource.FileUploadDataSourceImpl$uploadLogFile$2", f = "FileUploadDataSourceImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
        public int a;
        private /* synthetic */ Object b;
        public final /* synthetic */ File c;
        public final /* synthetic */ String d;
        public final /* synthetic */ FileUploadDataSourceImpl e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(File file, String str, FileUploadDataSourceImpl fileUploadDataSourceImpl, Continuation<? super c> continuation) {
            super(2, continuation);
            this.c = file;
            this.d = str;
            this.e = fileUploadDataSourceImpl;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            c cVar = new c(this.c, this.d, this.e, continuation);
            cVar.b = obj;
            return cVar;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Boolean> continuation) {
            return ((c) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            Object objM3845constructorimpl;
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            RequestBody requestBodyCreate = RequestBody.create((MediaType) null, this.c);
            String str = this.d;
            FileUploadDataSourceImpl fileUploadDataSourceImpl = this.e;
            try {
                Result.Companion companion = Result.Companion;
                Request requestBuild = new Request.Builder().put(requestBodyCreate).url(str).build();
                OkHttpClient.Builder builderNewBuilder = fileUploadDataSourceImpl.okHttpClient().newBuilder();
                TimeUnit timeUnit = TimeUnit.SECONDS;
                Response responseExecute = FirebasePerfOkHttpClient.execute(builderNewBuilder.connectTimeout(0L, timeUnit).writeTimeout(0L, timeUnit).readTimeout(0L, timeUnit).build().newCall(requestBuild));
                if (!responseExecute.isSuccessful()) {
                    FeedbackException.INSTANCE.throwException(ErrorConstKt.SERVER_STAGE_2_FAILED, Intrinsics.stringPlus("意见反馈日志文件上传接口失败:", Boxing.boxInt(responseExecute.code())));
                }
                objM3845constructorimpl = Result.m3845constructorimpl(Boxing.boxBoolean(responseExecute.isSuccessful()));
            } catch (Throwable th) {
                Result.Companion companion2 = Result.Companion;
                objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th));
            }
            Throwable thM3848exceptionOrNullimpl = Result.m3848exceptionOrNullimpl(objM3845constructorimpl);
            if (thM3848exceptionOrNullimpl != null) {
                if (thM3848exceptionOrNullimpl instanceof FeedbackException) {
                    throw thM3848exceptionOrNullimpl;
                }
                FeedbackException.INSTANCE.throwException(3006, Intrinsics.stringPlus("意见反馈日志文件上传接口异常:", thM3848exceptionOrNullimpl));
            }
            return Result.m3850isFailureimpl(objM3845constructorimpl) ? Boxing.boxBoolean(false) : objM3845constructorimpl;
        }
    }

    public FileUploadDataSourceImpl(@NotNull Context context, @NotNull UploadFileSetting uploadFileSetting, @NotNull CoroutineDispatcher coroutineDispatcher) {
        this.context = context;
        this.logFiles = uploadFileSetting;
        this.dispatcher = coroutineDispatcher;
    }

    private final JsonArray a(UploadFileSetting uploadFileSetting) {
        JsonArray jsonArray = new JsonArray();
        List<String> uploadSettings = uploadFileSetting.getUploadSettings();
        ArrayList arrayList = new ArrayList();
        for (Object obj : uploadSettings) {
            if (m.endsWith$default((String) obj, ".hprof", false, 2, null)) {
                arrayList.add(obj);
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            jsonArray.add((String) it2.next());
        }
        return jsonArray;
    }

    private final JsonObject b(UploadBaseParams baseParams, FeedbackDevice device, String sourceList, UserForm userForm) {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("appType", Utils.isReleaseVersion(this.context.getApplicationContext()) ? "release" : "develop");
        try {
            Result.Companion companion = Result.Companion;
            jsonObject.addProperty("appVersion", this.context.getPackageManager().getPackageInfo(this.context.getPackageName(), 0).versionName);
            Result.m3845constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            Result.m3845constructorimpl(ResultKt.createFailure(th));
        }
        Contact contact = userForm.getContact();
        if (contact != null) {
            jsonObject.addProperty(ContactSettingItemActivity.KEY_CONTACT, contact.getContactInfo());
            jsonObject.addProperty("contactType", contact.getContactType().name());
        }
        String description = userForm.getDescription();
        if (description == null) {
            description = "";
        }
        jsonObject.addProperty("content", TextUtilKt.formatIssueDescription(description));
        String str = Locale.getDefault().getLanguage() + '_' + ((Object) Locale.getDefault().getCountry());
        jsonObject.addProperty(UserLegalInfoManager.KEY_LANGUAGE, str);
        jsonObject.addProperty("location", str);
        jsonObject.addProperty("phoneModel", Intrinsics.stringPlus(Build.BRAND, Build.MODEL));
        jsonObject.addProperty("phoneSystem", Build.VERSION.RELEASE);
        jsonObject.addProperty("sourcelist", sourceList);
        if (device != null) {
            jsonObject.addProperty("deviceType", device.getDeviceType().getType());
            jsonObject.addProperty("deviceSource", device.getDeviceSource());
            jsonObject.addProperty("deviceFirmwareVersion", device.getFwVersion());
        }
        jsonObject.addProperty("type", String.valueOf(userForm.getIssueItem().getId()));
        jsonObject.addProperty("source", baseParams.getFromSource());
        String userName = baseParams.getUserName();
        if (userName != null) {
            JsonObject jsonObject2 = new JsonObject();
            jsonObject2.addProperty("name", userName);
            jsonObject2.add("hprofs", a(this.logFiles));
            jsonObject.addProperty("additionalInfo", jsonObject2.toString());
        }
        return jsonObject;
    }

    private final String c(String str) {
        return str == null ? "" : str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String d(long loginID) {
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        return HMServerDef.getUrl(String.format(Locale.getDefault(), "users/%s/apps/%s/fileAccessURIs", Arrays.copyOf(new Object[]{Long.valueOf(loginID), HMAppConfig.getPackageName()}, 2)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String e(UploadBaseParams baseParams, UploadDeviceInfo uploadDeviceInfo, UserForm userForm) {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("fileType", "LOG");
        File logFile = uploadDeviceInfo.getLogFile();
        jsonObject.addProperty("fileName", c(logFile == null ? null : logFile.getName()));
        jsonObject.add(HMUploadDeviceLogAPI.a.b, b(baseParams, uploadDeviceInfo.getSelectDevice(), uploadDeviceInfo.getSourceList(), userForm));
        return jsonObject.toString();
    }

    @Override // com.huami.http.HttpKit
    @NotNull
    public HttpUrl baseUrl() {
        return HttpKit.DefaultImpls.baseUrl(this);
    }

    @Override // org.koin.core.component.KoinComponent
    @NotNull
    public Koin getKoin() {
        return KoinComponent.DefaultImpls.getKoin(this);
    }

    @Override // com.huami.http.HttpKit
    @NotNull
    public OkHttpClient okHttpClient() {
        return HttpKit.DefaultImpls.okHttpClient(this);
    }

    @Override // com.huami.feedback.datasource.FileUploadDataSource
    @Nullable
    public Object postFeedbackInfo(@NotNull UploadBaseParams uploadBaseParams, @NotNull UserForm userForm, @NotNull UploadDeviceInfo uploadDeviceInfo, @NotNull Continuation<? super PostFeedbackInfoResult> continuation) {
        return BuildersKt.withContext(this.dispatcher, new a(uploadBaseParams, uploadDeviceInfo, userForm, null), continuation);
    }

    @Override // com.huami.feedback.datasource.FileUploadDataSource
    @Nullable
    public Object reportLogFileUploadResult(long j, long j2, @NotNull Continuation<? super Boolean> continuation) {
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String url = HMServerDef.getUrl(String.format(Locale.getDefault(), e, Arrays.copyOf(new Object[]{Boxing.boxLong(j), HMAppConfig.getPackageName()}, 2)));
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("fileType", "LOG");
        JsonObject jsonObject2 = new JsonObject();
        jsonObject2.addProperty("syncTime", Boxing.boxLong(j2));
        Unit unit = Unit.INSTANCE;
        jsonObject.add(HMUploadDeviceLogAPI.a.b, jsonObject2);
        return BuildersKt.withContext(this.dispatcher, new b(url, jsonObject, null), continuation);
    }

    @Override // com.huami.feedback.datasource.FileUploadDataSource
    @Nullable
    public Object uploadLogFile(@NotNull String str, @NotNull File file, @NotNull Continuation<? super Boolean> continuation) {
        return BuildersKt.withContext(this.dispatcher, new c(file, str, this, null), continuation);
    }

    public /* synthetic */ FileUploadDataSourceImpl(Context context, UploadFileSetting uploadFileSetting, CoroutineDispatcher coroutineDispatcher, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, uploadFileSetting, (i & 4) != 0 ? Dispatchers.getIO() : coroutineDispatcher);
    }
}
