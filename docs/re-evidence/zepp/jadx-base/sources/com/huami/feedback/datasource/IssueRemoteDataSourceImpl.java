package com.huami.feedback.datasource;

import com.google.gson.Gson;
import com.google.gson.JsonParser;
import com.google.gson.reflect.TypeToken;
import com.huami.feedback.entity.Issue;
import com.huami.http.ConverterKt;
import com.huami.http.HttpKit;
import com.huami.http.HttpKitKtxKt;
import com.huami.network.hmnetwork.config.HMAppConfig;
import com.huami.network.hmnetwork.server.HMServerDef;
import com.huami.network.hmnetwork.webapi.HMWebUtil;
import com.huami.tools.log.HMLog;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.r;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.StringCompanionObject;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \r2\u00020\u00012\u00020\u0002:\u0001\rB\u0011\u0012\b\b\u0002\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\n\u001a\u00020\u00078\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000e"}, d2 = {"Lcom/huami/feedback/datasource/IssueRemoteDataSourceImpl;", "Lcom/huami/feedback/datasource/IssueRemoteDataSource;", "Lcom/huami/http/HttpKit;", "", "Lcom/huami/feedback/entity/Issue;", "issue", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlinx/coroutines/CoroutineDispatcher;", "a", "Lkotlinx/coroutines/CoroutineDispatcher;", "dispatcher", "<init>", "(Lkotlinx/coroutines/CoroutineDispatcher;)V", "Companion", "feedback-impl_release"}, k = 1, mv = {1, 5, 1})
public final class IssueRemoteDataSourceImpl implements IssueRemoteDataSource, HttpKit {

    @NotNull
    private static final String b = "apps/%s/settings";

    @NotNull
    private static final String c = "appName";

    @NotNull
    private static final String d = "settingName";

    @NotNull
    private static final String e = "user_feedback_model_v2";

    @NotNull
    private static final String f = "mode";

    @NotNull
    private static final String g = "SINGLE";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final CoroutineDispatcher dispatcher;

    /* JADX INFO: renamed from: com.huami.feedback.datasource.IssueRemoteDataSourceImpl$issue$2, reason: invalid class name */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "Lcom/huami/feedback/entity/Issue;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.feedback.datasource.IssueRemoteDataSourceImpl$issue$2", f = "IssueRemoteDataSourceImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super List<? extends Issue>>, Object> {
        public int a;
        private /* synthetic */ Object b;

        /* JADX INFO: renamed from: com.huami.feedback.datasource.IssueRemoteDataSourceImpl$issue$2$a */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function0<String> {
            public final /* synthetic */ Throwable a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Throwable th) {
                super(0);
                this.a = th;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final String getA() {
                return Intrinsics.stringPlus("请求问题类型出错：", this.a);
            }
        }

        public AnonymousClass2(Continuation<? super AnonymousClass2> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            AnonymousClass2 anonymousClass2 = IssueRemoteDataSourceImpl.this.new AnonymousClass2(continuation);
            anonymousClass2.b = obj;
            return anonymousClass2;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super List<? extends Issue>> continuation) {
            return invoke2(coroutineScope, (Continuation<? super List<Issue>>) continuation);
        }

        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super List<Issue>> continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object objM3845constructorimpl;
            kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            if (this.a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String url = HMServerDef.getUrl(String.format("apps/%s/settings", Arrays.copyOf(new Object[]{HMAppConfig.getPackageName()}, 1)));
            Map mapMapOf = r.mapOf(TuplesKt.to("appName", HMAppConfig.getPackageName()), TuplesKt.to("settingName", IssueRemoteDataSourceImpl.e), TuplesKt.to("mode", "SINGLE"));
            IssueRemoteDataSourceImpl issueRemoteDataSourceImpl = IssueRemoteDataSourceImpl.this;
            try {
                Result.Companion companion = Result.Companion;
                objM3845constructorimpl = Result.m3845constructorimpl((List) new Gson().fromJson(new JsonParser().parse(ConverterKt.responseToJsonStr(HttpKitKtxKt.httpGet(issueRemoteDataSourceImpl, url, mapMapOf, HMWebUtil.getSystemHeader()))).getAsJsonObject().get(IssueRemoteDataSourceImpl.e).getAsString(), new TypeToken<List<? extends Issue>>() { // from class: com.huami.feedback.datasource.IssueRemoteDataSourceImpl$issue$2$invokeSuspend$lambda-0$$inlined$genericType$1
                }.getType()));
            } catch (Throwable th) {
                Result.Companion companion2 = Result.Companion;
                objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th));
            }
            Throwable thM3848exceptionOrNullimpl = Result.m3848exceptionOrNullimpl(objM3845constructorimpl);
            if (thM3848exceptionOrNullimpl != null) {
                HMLog.warn$default("feedback", null, new a(thM3848exceptionOrNullimpl), 2, null);
            }
            return Result.m3850isFailureimpl(objM3845constructorimpl) ? CollectionsKt__CollectionsKt.emptyList() : objM3845constructorimpl;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public IssueRemoteDataSourceImpl() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public IssueRemoteDataSourceImpl(@NotNull CoroutineDispatcher coroutineDispatcher) {
        this.dispatcher = coroutineDispatcher;
    }

    @Override // com.huami.http.HttpKit
    @NotNull
    public HttpUrl baseUrl() {
        return HttpKit.DefaultImpls.baseUrl(this);
    }

    @Override // com.huami.feedback.datasource.IssueRemoteDataSource
    @Nullable
    public Object issue(@NotNull Continuation<? super List<Issue>> continuation) {
        return BuildersKt.withContext(this.dispatcher, new AnonymousClass2(null), continuation);
    }

    @Override // com.huami.http.HttpKit
    @NotNull
    public OkHttpClient okHttpClient() {
        return HttpKit.DefaultImpls.okHttpClient(this);
    }

    public /* synthetic */ IssueRemoteDataSourceImpl(CoroutineDispatcher coroutineDispatcher, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? Dispatchers.getIO() : coroutineDispatcher);
    }
}
