package com.huami.feedback.autowork;

import android.content.Context;
import androidx.multidex.MultiDexExtractor;
import androidx.work.ListenableWorker;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.google.android.exoplayer2.metadata.id3.InternalFrame;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.account.service.AccountService;
import com.huami.account.service.AccountServiceExtKt;
import com.huami.feedback.ContactType;
import com.huami.feedback.autowork.UploadLogWork;
import com.huami.feedback.datasource.FileUploadDataSource;
import com.huami.feedback.entity.AdditionalInfoData;
import com.huami.feedback.entity.Contact;
import com.huami.feedback.entity.IssueItem;
import com.huami.feedback.entity.PostFeedbackInfoResult;
import com.huami.feedback.entity.UploadBaseParams;
import com.huami.feedback.entity.UploadDeviceInfo;
import com.huami.feedback.entity.UserForm;
import com.huami.feedback.log.utils.DateUtilKt;
import com.huami.feedback.util.FeedbackKeeper;
import com.huami.feedback.util.Utils;
import com.huami.feedback.util.UtilsKt;
import com.huami.koinstartup.KoinAdapterKt;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.baseutil.FileUtils;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.Koin;
import org.koin.core.component.KoinComponent;
import org.slf4j.helpers.MessageFormatter;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u001c2\u00020\u00012\u00020\u0002:\u0001\u001cB\u0017\u0012\u0006\u0010\u0017\u001a\u00020\u0014\u0012\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u0016\u0010\u0006\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0002J\u0010\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003H\u0002J-\u0010\u000e\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\f\u001a\u00020\u0004H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\bH\u0002J\b\u0010\u0013\u001a\u00020\u0012H\u0016R\u0016\u0010\u0017\u001a\u00020\u00148\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001d"}, d2 = {"Lcom/huami/feedback/autowork/UploadLogWork;", "Landroidx/work/Worker;", "Lorg/koin/core/component/KoinComponent;", "", "Ljava/io/File;", "appFiles", "f", GoogleApiAvailabilityLight.a, "", SDKConstants.PARAM_USER_ID, "", "userName", "zipFile", "", "c", "(JLjava/lang/String;Ljava/io/File;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "millis", "b", "Landroidx/work/ListenableWorker$Result;", "doWork", "Landroid/content/Context;", "a", "Landroid/content/Context;", "appContext", "Landroidx/work/WorkerParameters;", "workerParams", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "Companion", "feedback-impl_release"}, k = 1, mv = {1, 5, 1})
public final class UploadLogWork extends Worker implements KoinComponent {
    private static final int b = 86400000;
    private static final int c = 1000;
    private static final int d = 100000;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Context appContext;

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.feedback.autowork.UploadLogWork", f = "UploadLogWork.kt", i = {0, 0, 0, 1, 1, 1}, l = {139, 164, 166}, m = "doHttpUpload", n = {"zipFile", "uploadDataSource", SDKConstants.PARAM_USER_ID, "uploadDataSource", "result", SDKConstants.PARAM_USER_ID}, s = {"L$0", "L$1", "J$0", "L$0", "L$1", "J$0"})
    public static final class a extends ContinuationImpl {
        public long a;
        public Object b;
        public Object c;
        public /* synthetic */ Object d;
        public int f;

        public a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.d = obj;
            this.f |= Integer.MIN_VALUE;
            return UploadLogWork.this.c(0L, null, null, this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public static final b a = new b();

        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "自动上传用户反馈失败";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<String> {
        public final /* synthetic */ long a;
        public final /* synthetic */ UploadLogWork b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(long j, UploadLogWork uploadLogWork) {
            super(0);
            this.a = j;
            this.b = uploadLogWork;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "上次上传时间：" + this.a + InternalFrame.ID + this.b.b(this.a);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<String> {
        public final /* synthetic */ long a;
        public final /* synthetic */ UploadLogWork b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(long j, UploadLogWork uploadLogWork) {
            super(0);
            this.a = j;
            this.b = uploadLogWork;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "当前时间：" + this.a + "---" + this.b.b(this.a);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function0<String> {
        public static final e a = new e();

        public e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "上传日志间隔时间太短，本次任务不执行上传动作";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class f extends Lambda implements Function0<String> {
        public static final f a = new f();

        public f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "获取用户ID失败，重新尝试上传！";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class g extends Lambda implements Function0<String> {
        public static final g a = new g();

        public g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "没有符合要求的日志文件，不上传！";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "Landroidx/work/ListenableWorker$Result;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.feedback.autowork.UploadLogWork$doWork$6", f = "UploadLogWork.kt", i = {0}, l = {67}, m = "invokeSuspend", n = {"$this$runBlocking"}, s = {"L$0"})
    public static final class h extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super ListenableWorker.Result>, Object> {
        public int a;
        private /* synthetic */ Object b;
        public final /* synthetic */ AccountService d;
        public final /* synthetic */ File e;
        public final /* synthetic */ List<File> f;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function0<String> {
            public static final a a = new a();

            public a() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return "日志自动上传成功";
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class b extends Lambda implements Function0<String> {
            public final /* synthetic */ File a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(File file) {
                super(0);
                this.a = file;
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return Intrinsics.stringPlus("删除日志文件：", this.a.getName());
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public h(AccountService accountService, File file, List<? extends File> list, Continuation<? super h> continuation) {
            super(2, continuation);
            this.d = accountService;
            this.e = file;
            this.f = list;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            h hVar = UploadLogWork.this.new h(this.d, this.e, this.f, continuation);
            hVar.b = obj;
            return hVar;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super ListenableWorker.Result> continuation) {
            return ((h) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            ListenableWorker.Result resultRetry;
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.b;
                UploadLogWork uploadLogWork = UploadLogWork.this;
                long validUid = AccountServiceExtKt.getValidUid(this.d);
                String nickname = this.d.getCurrentProviderInfo().getNickname();
                File file = this.e;
                this.b = coroutineScope;
                this.a = 1;
                obj = uploadLogWork.c(validUid, nickname, file, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            if (((Boolean) obj).booleanValue()) {
                HMLog.info("feedback", a.a);
                FeedbackKeeper.INSTANCE.saveUploadLogTime();
                resultRetry = ListenableWorker.Result.success();
            } else {
                resultRetry = ListenableWorker.Result.retry();
            }
            File file2 = this.e;
            List<File> list = this.f;
            try {
                Result.Companion companion = Result.Companion;
                file2.delete();
                for (File file3 : list) {
                    HMLog.info("feedback", new b(file3));
                    file3.delete();
                }
                Result.m3845constructorimpl(Unit.INSTANCE);
            } catch (Throwable th) {
                Result.Companion companion2 = Result.Companion;
                Result.m3845constructorimpl(ResultKt.createFailure(th));
            }
            return resultRetry;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class i extends Lambda implements Function0<String> {
        public final /* synthetic */ File a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(File file) {
            super(0);
            this.a = file;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return Intrinsics.stringPlus("parse app log file name failed.Name:", this.a.getName());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class j extends Lambda implements Function0<String> {
        public static final j a = new j();

        public j() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "压缩日志文件失败！";
        }
    }

    public UploadLogWork(@NotNull Context context, @NotNull WorkerParameters workerParameters) {
        super(context, workerParameters);
        this.appContext = context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String b(long millis) {
        return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.getDefault()).format(new Date(millis));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:48:0x011f A[Catch: all -> 0x014c, TryCatch #0 {all -> 0x014c, blocks: (B:14:0x003c, B:53:0x0138, B:19:0x0053, B:46:0x0116, B:48:0x011f, B:22:0x0064, B:28:0x00da, B:30:0x00e2, B:32:0x00e7, B:34:0x00ed, B:39:0x00f7, B:42:0x00fe, B:54:0x0147, B:25:0x0089), top: B:63:0x0032 }] */
    /* JADX WARN: Code duplicated, block: B:50:0x0135 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:51:0x0136  */
    /* JADX WARN: Code duplicated, block: B:61:0x015e  */
    /* JADX WARN: Code duplicated, block: B:64:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x001d  */
    public final Object c(long j2, String str, File file, Continuation<? super Boolean> continuation) {
        a aVar;
        Object objM3845constructorimpl;
        FileUploadDataSource fileUploadDataSource;
        Object objPostFeedbackInfo;
        long j3;
        FileUploadDataSource fileUploadDataSource2;
        PostFeedbackInfoResult postFeedbackInfoResult;
        long jLongValue;
        Object obj;
        long j4 = j2;
        File file2 = file;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i2 = aVar.f;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                aVar.f = i2 - Integer.MIN_VALUE;
            } else {
                aVar = new a(continuation);
            }
        } else {
            aVar = new a(continuation);
        }
        a aVar2 = aVar;
        Object obj2 = aVar2.d;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i3 = aVar2.f;
        boolean z = true;
        try {
            if (i3 != 0) {
                if (i3 == 1) {
                    j4 = aVar2.a;
                    FileUploadDataSource fileUploadDataSource3 = (FileUploadDataSource) aVar2.c;
                    File file3 = (File) aVar2.b;
                    ResultKt.throwOnFailure(obj2);
                    fileUploadDataSource = fileUploadDataSource3;
                    file2 = file3;
                    objPostFeedbackInfo = obj2;
                } else {
                    if (i3 == 2) {
                        long j5 = aVar2.a;
                        postFeedbackInfoResult = (PostFeedbackInfoResult) aVar2.c;
                        FileUploadDataSource fileUploadDataSource4 = (FileUploadDataSource) aVar2.b;
                        ResultKt.throwOnFailure(obj2);
                        j3 = j5;
                        fileUploadDataSource2 = fileUploadDataSource4;
                        if (((Boolean) obj2).booleanValue()) {
                            jLongValue = postFeedbackInfoResult.getSyncTime().longValue();
                            aVar2.b = obj2;
                            aVar2.c = null;
                            aVar2.f = 3;
                            if (fileUploadDataSource2.reportLogFileUploadResult(j3, jLongValue, aVar2) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            obj = obj2;
                        }
                        objM3845constructorimpl = Result.m3845constructorimpl(Boxing.boxBoolean(((Boolean) obj2).booleanValue()));
                        if (Result.m3848exceptionOrNullimpl(objM3845constructorimpl) == null) {
                            return objM3845constructorimpl;
                        }
                        HMLog.error$default("feedback", null, null, b.a, 6, null);
                        return Boxing.boxBoolean(false);
                    }
                    if (i3 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    obj = aVar2.b;
                    ResultKt.throwOnFailure(obj2);
                }
                obj2 = obj;
                objM3845constructorimpl = Result.m3845constructorimpl(Boxing.boxBoolean(((Boolean) obj2).booleanValue()));
                if (Result.m3848exceptionOrNullimpl(objM3845constructorimpl) == null) {
                    return objM3845constructorimpl;
                }
                HMLog.error$default("feedback", null, null, b.a, 6, null);
                return Boxing.boxBoolean(false);
            }
            ResultKt.throwOnFailure(obj2);
            fileUploadDataSource = (FileUploadDataSource) getKoin().getScopeRegistry().getRootScope().get(Reflection.getOrCreateKotlinClass(FileUploadDataSource.class), null, null);
            Result.Companion companion = Result.Companion;
            UploadBaseParams uploadBaseParams = new UploadBaseParams(j4, str, "AppInternal");
            UserForm userForm = new UserForm(null, "", 100000, new IssueItem(100000, "", new AdditionalInfoData(true, false)), "app日志自动上传", new Contact(ContactType.EMAIL, ""), null, 0L, 128, null);
            UploadDeviceInfo uploadDeviceInfo = new UploadDeviceInfo(null, file2, MessageFormatter.c);
            aVar2.b = file2;
            aVar2.c = fileUploadDataSource;
            aVar2.a = j4;
            aVar2.f = 1;
            objPostFeedbackInfo = fileUploadDataSource.postFeedbackInfo(uploadBaseParams, userForm, uploadDeviceInfo, aVar2);
            if (objPostFeedbackInfo == coroutine_suspended) {
                return coroutine_suspended;
            }
            PostFeedbackInfoResult postFeedbackInfoResult2 = (PostFeedbackInfoResult) objPostFeedbackInfo;
            if (!postFeedbackInfoResult2.getSuccess()) {
                return Boxing.boxBoolean(false);
            }
            String uploadUrl = postFeedbackInfoResult2.getUploadUrl();
            if (uploadUrl != null && uploadUrl.length() != 0) {
                z = false;
            }
            if (!z && postFeedbackInfoResult2.getSyncTime() != null) {
                String uploadUrl2 = postFeedbackInfoResult2.getUploadUrl();
                aVar2.b = fileUploadDataSource;
                aVar2.c = postFeedbackInfoResult2;
                aVar2.a = j4;
                aVar2.f = 2;
                Object objUploadLogFile = fileUploadDataSource.uploadLogFile(uploadUrl2, file2, aVar2);
                if (objUploadLogFile == coroutine_suspended) {
                    return coroutine_suspended;
                }
                j3 = j4;
                fileUploadDataSource2 = fileUploadDataSource;
                obj2 = objUploadLogFile;
                postFeedbackInfoResult = postFeedbackInfoResult2;
                if (((Boolean) obj2).booleanValue()) {
                    jLongValue = postFeedbackInfoResult.getSyncTime().longValue();
                    aVar2.b = obj2;
                    aVar2.c = null;
                    aVar2.f = 3;
                    if (fileUploadDataSource2.reportLogFileUploadResult(j3, jLongValue, aVar2) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    obj = obj2;
                    obj2 = obj;
                }
                objM3845constructorimpl = Result.m3845constructorimpl(Boxing.boxBoolean(((Boolean) obj2).booleanValue()));
                if (Result.m3848exceptionOrNullimpl(objM3845constructorimpl) == null) {
                    return objM3845constructorimpl;
                }
                HMLog.error$default("feedback", null, null, b.a, 6, null);
                return Boxing.boxBoolean(false);
            }
            return Boxing.boxBoolean(false);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th));
        }
    }

    private final List<File> d() throws IOException {
        long j2 = 1000;
        final long jCurrentTimeMillis = (System.currentTimeMillis() / j2) * j2;
        final long j3 = jCurrentTimeMillis - ((long) 86400000);
        File[] fileArrListFiles = new File(FileUtils.getLogRootDir(this.appContext)).listFiles(new FilenameFilter() { // from class: b58
            @Override // java.io.FilenameFilter
            public final boolean accept(File file, String str) {
                return UploadLogWork.e(jCurrentTimeMillis, j3, file, str);
            }
        });
        if (fileArrListFiles == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(fileArrListFiles.length);
        for (File file : fileArrListFiles) {
            String dateFromSeconds = UtilsKt.getDateFromSeconds(file.getName());
            if (dateFromSeconds == null) {
                HMLog.warn$default("feedback", null, new i(file), 2, null);
            } else {
                File file2 = new File(FileUtils.getLogRootDir(this.appContext), dateFromSeconds);
                FileUtils.copyFile(file, file2);
                file = file2;
            }
            arrayList.add(file);
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean e(long j2, long j3, File file, String str) {
        return Intrinsics.areEqual(str, String.valueOf(j2)) || Intrinsics.areEqual(str, String.valueOf(j3));
    }

    private final File f(List<? extends File> appFiles) throws IOException {
        File file = new File(((Object) this.appContext.getFilesDir().getAbsolutePath()) + ((Object) File.separator) + "log_" + DateUtilKt.getFormatTimeDisplay() + MultiDexExtractor.EXTRACTED_SUFFIX);
        if (file.exists()) {
            file.delete();
        }
        file.createNewFile();
        Object[] array = appFiles.toArray(new File[0]);
        Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
        if (!Utils.zipFiles(file, (File[]) array)) {
            HMLog.warn$default("feedback", null, j.a, 2, null);
        }
        return file;
    }

    @Override // androidx.work.Worker
    @NotNull
    public ListenableWorker.Result doWork() throws IOException {
        long uploadLogTime = FeedbackKeeper.INSTANCE.getUploadLogTime();
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - uploadLogTime < 86400000) {
            HMLog.info("feedback", new c(uploadLogTime, this));
            HMLog.info("feedback", new d(jCurrentTimeMillis, this));
            HMLog.info("feedback", e.a);
            return ListenableWorker.Result.success();
        }
        AccountService accountService = (AccountService) KoinAdapterKt.getKoinProxy().getScopeRegistry().getRootScope().getOrNull(Reflection.getOrCreateKotlinClass(AccountService.class), null, null);
        if (accountService == null || AccountServiceExtKt.getValidUid(accountService) == -1) {
            HMLog.info("feedback", f.a);
            return ListenableWorker.Result.retry();
        }
        List<File> listD = d();
        if (!(listD == null || listD.isEmpty())) {
            return (ListenableWorker.Result) kotlinx.coroutines.d.b(null, new h(accountService, f(listD), listD, null), 1, null);
        }
        HMLog.info("feedback", g.a);
        return ListenableWorker.Result.success();
    }

    @Override // org.koin.core.component.KoinComponent
    @NotNull
    public Koin getKoin() {
        return KoinComponent.DefaultImpls.getKoin(this);
    }
}
