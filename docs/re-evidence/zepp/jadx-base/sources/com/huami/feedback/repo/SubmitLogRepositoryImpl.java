package com.huami.feedback.repo;

import android.net.Uri;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.feedback.datasource.FileUploadDataSource;
import com.huami.feedback.datasource.LogFileDataSource;
import com.huami.feedback.entity.PostFeedbackInfoResult;
import com.huami.feedback.entity.UploadBaseParams;
import com.huami.feedback.entity.UploadDeviceInfo;
import com.huami.feedback.entity.UserForm;
import com.huami.feedback.sync.api.device.DevicesDataSource;
import com.huami.feedback.sync.api.device.FeedbackDevice;
import com.huami.feedback.zepp.ui.FeedbackActivity;
import com.huami.tools.log.HMLog;
import java.io.File;
import java.util.Iterator;
import java.util.List;
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
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 .2\u00020\u0001:\u0001.B\u001f\u0012\u0006\u0010%\u001a\u00020#\u0012\u0006\u0010(\u001a\u00020&\u0012\u0006\u0010+\u001a\u00020)¢\u0006\u0004\b,\u0010-J-\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0082@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ\f\u0010\u000b\u001a\u00020\b*\u00020\u0002H\u0002J%\u0010\u0010\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\f2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\b0\u000eH\u0082\bJ3\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\b\u0010\u0018\u001a\u00020\u0017H\u0002J\b\u0010\u0019\u001a\u00020\u0011H\u0002J\u0010\u0010\u001c\u001a\u00020\b2\u0006\u0010\u001b\u001a\u00020\u001aH\u0002J\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u001b\u001a\u00020\u001aH\u0002J5\u0010!\u001a\u00020\b2\u0006\u0010\u001e\u001a\u00020\u00132\b\u0010\u001f\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010 \u001a\u00020\u0011H\u0096@ø\u0001\u0000¢\u0006\u0004\b!\u0010\"R\u0016\u0010%\u001a\u00020#8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010$R\u0016\u0010(\u001a\u00020&8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010'R\u0016\u0010+\u001a\u00020)8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010*\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006/"}, d2 = {"Lcom/huami/feedback/repo/SubmitLogRepositoryImpl;", "Lcom/huami/feedback/repo/SubmitLogRepository;", "Lcom/huami/feedback/entity/PostFeedbackInfoResult;", "postResult", "Lcom/huami/feedback/entity/UploadBaseParams;", "baseParams", "Ljava/io/File;", "zipFile", "", "e", "(Lcom/huami/feedback/entity/PostFeedbackInfoResult;Lcom/huami/feedback/entity/UploadBaseParams;Ljava/io/File;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", GoogleApiAvailabilityLight.a, "", "times", "Lkotlin/Function1;", "action", "f", "", "url", "", "syncTime", "g", "(Ljava/io/File;Lcom/huami/feedback/entity/UploadBaseParams;Ljava/lang/String;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "b", "a", "Lcom/huami/feedback/entity/UserForm;", FeedbackActivity.KEY_USER_FORM, "c", "h", SDKConstants.PARAM_USER_ID, "userName", FeedbackActivity.KEY_FEEDBACK_SOURCE, "submitLog", "(JLjava/lang/String;Lcom/huami/feedback/entity/UserForm;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/huami/feedback/datasource/LogFileDataSource;", "Lcom/huami/feedback/datasource/LogFileDataSource;", "logFileDataSource", "Lcom/huami/feedback/datasource/FileUploadDataSource;", "Lcom/huami/feedback/datasource/FileUploadDataSource;", "fileUploadDataSource", "Lcom/huami/feedback/sync/api/device/DevicesDataSource;", "Lcom/huami/feedback/sync/api/device/DevicesDataSource;", "devicesDataSource", "<init>", "(Lcom/huami/feedback/datasource/LogFileDataSource;Lcom/huami/feedback/datasource/FileUploadDataSource;Lcom/huami/feedback/sync/api/device/DevicesDataSource;)V", "Companion", "feedback-impl_release"}, k = 1, mv = {1, 5, 1})
public final class SubmitLogRepositoryImpl implements SubmitLogRepository {
    private static final int d = 3;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final LogFileDataSource logFileDataSource;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final FileUploadDataSource fileUploadDataSource;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final DevicesDataSource devicesDataSource;

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.feedback.repo.SubmitLogRepositoryImpl", f = "SubmitLogRepositoryImpl.kt", i = {0}, l = {63}, m = "reportResult", n = {"this"}, s = {"L$0"})
    public static final class a extends ContinuationImpl {
        public Object a;
        public /* synthetic */ Object b;
        public int d;

        public a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.b = obj;
            this.d |= Integer.MIN_VALUE;
            return SubmitLogRepositoryImpl.this.e(null, null, null, this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.feedback.repo.SubmitLogRepositoryImpl$submitLog$2", f = "SubmitLogRepositoryImpl.kt", i = {0, 0}, l = {46, 51}, m = "invokeSuspend", n = {"zipFile", "baseParams"}, s = {"L$0", "L$1"})
    public static final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
        public Object a;
        public Object b;
        public int c;
        public final /* synthetic */ UserForm e;
        public final /* synthetic */ FeedbackDevice f;
        public final /* synthetic */ long g;
        public final /* synthetic */ String h;
        public final /* synthetic */ String i;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class a extends Lambda implements Function0<String> {
            public static final a a = new a();

            public a() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                return "start submit....";
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(UserForm userForm, FeedbackDevice feedbackDevice, long j, String str, String str2, Continuation<? super b> continuation) {
            super(2, continuation);
            this.e = userForm;
            this.f = feedbackDevice;
            this.g = j;
            this.h = str;
            this.i = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return SubmitLogRepositoryImpl.this.new b(this.e, this.f, this.g, this.h, this.i, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Boolean> continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
            File file;
            UploadBaseParams uploadBaseParams;
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.c;
            if (i != 0) {
                if (i == 1) {
                    uploadBaseParams = (UploadBaseParams) this.b;
                    file = (File) this.a;
                    ResultKt.throwOnFailure(obj);
                } else {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
            }
            ResultKt.throwOnFailure(obj);
            HMLog.info("feedback", a.a);
            File fileH = SubmitLogRepositoryImpl.this.h(this.e);
            UploadDeviceInfo uploadDeviceInfo = new UploadDeviceInfo(this.f, fileH, SubmitLogRepositoryImpl.this.a());
            UploadBaseParams uploadBaseParams2 = new UploadBaseParams(this.g, this.h, this.i);
            FileUploadDataSource fileUploadDataSource = SubmitLogRepositoryImpl.this.fileUploadDataSource;
            UserForm userForm = this.e;
            this.a = fileH;
            this.b = uploadBaseParams2;
            this.c = 1;
            Object objPostFeedbackInfo = fileUploadDataSource.postFeedbackInfo(uploadBaseParams2, userForm, uploadDeviceInfo, this);
            if (objPostFeedbackInfo == coroutine_suspended) {
                return coroutine_suspended;
            }
            file = fileH;
            obj = objPostFeedbackInfo;
            uploadBaseParams = uploadBaseParams2;
            SubmitLogRepositoryImpl submitLogRepositoryImpl = SubmitLogRepositoryImpl.this;
            this.a = null;
            this.b = null;
            this.c = 2;
            obj = submitLogRepositoryImpl.e((PostFeedbackInfoResult) obj, uploadBaseParams, file, this);
            return obj == coroutine_suspended ? coroutine_suspended : obj;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.huami.feedback.repo.SubmitLogRepositoryImpl", f = "SubmitLogRepositoryImpl.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 0}, l = {119, 122}, m = "uploadFileAndReport", n = {"this", "zipFile", "baseParams", "url", "this_$iv", "retryTime$iv", "exception$iv", "syncTime", "times$iv"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "J$0", "I$0"})
    public static final class c extends ContinuationImpl {
        public Object a;
        public Object b;
        public Object c;
        public Object d;
        public Object e;
        public Object f;
        public Object g;
        public long h;
        public int i;
        public /* synthetic */ Object j;
        public int l;

        public c(Continuation<? super c> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.j = obj;
            this.l |= Integer.MIN_VALUE;
            return SubmitLogRepositoryImpl.this.g(null, null, null, 0L, this);
        }
    }

    public SubmitLogRepositoryImpl(@NotNull LogFileDataSource logFileDataSource, @NotNull FileUploadDataSource fileUploadDataSource, @NotNull DevicesDataSource devicesDataSource) {
        this.logFileDataSource = logFileDataSource;
        this.fileUploadDataSource = fileUploadDataSource;
        this.devicesDataSource = devicesDataSource;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String a() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        for (FeedbackDevice feedbackDevice : this.devicesDataSource.getActiveDevices()) {
            jSONObject.put(feedbackDevice.getDeviceType().getType(), feedbackDevice.getDeviceSource());
            jSONObject.put("deviceSN", feedbackDevice.getDeviceSN());
        }
        return jSONObject.toString();
    }

    private final void b() {
        LogFileDataSource logFileDataSource = this.logFileDataSource;
        logFileDataSource.deleteAppLogFile();
        logFileDataSource.deleteDeviceLogFile();
        logFileDataSource.deleteOtherSettingsFile();
    }

    private final boolean c(UserForm userForm) {
        if (!userForm.getIssueItem().getAdditionalInfo().getDefaultSelectAppLog() && !userForm.getIssueItem().getAdditionalInfo().getDefaultSelectDeviceLog()) {
            List<Uri> images = userForm.getImages();
            if (images == null || images.isEmpty()) {
                return false;
            }
        }
        return true;
    }

    private final boolean d(PostFeedbackInfoResult postFeedbackInfoResult) {
        if (postFeedbackInfoResult.getSuccess()) {
            String uploadUrl = postFeedbackInfoResult.getUploadUrl();
            if (!(uploadUrl == null || uploadUrl.length() == 0) && postFeedbackInfoResult.getSyncTime() != null) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object e(PostFeedbackInfoResult postFeedbackInfoResult, UploadBaseParams uploadBaseParams, File file, Continuation<? super Boolean> continuation) throws Throwable {
        a aVar;
        boolean success;
        SubmitLogRepositoryImpl submitLogRepositoryImpl;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i = aVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                aVar.d = i - Integer.MIN_VALUE;
            } else {
                aVar = new a(continuation);
            }
        } else {
            aVar = new a(continuation);
        }
        a aVar2 = aVar;
        Object objG = aVar2.b;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i2 = aVar2.d;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objG);
            if (d(postFeedbackInfoResult)) {
                String uploadUrl = postFeedbackInfoResult.getUploadUrl();
                long jLongValue = postFeedbackInfoResult.getSyncTime().longValue();
                aVar2.a = this;
                aVar2.d = 1;
                objG = g(file, uploadBaseParams, uploadUrl, jLongValue, aVar2);
                if (objG == coroutine_suspended) {
                    return coroutine_suspended;
                }
                submitLogRepositoryImpl = this;
            } else {
                success = postFeedbackInfoResult.getSuccess();
            }
            return Boxing.boxBoolean(success);
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        submitLogRepositoryImpl = (SubmitLogRepositoryImpl) aVar2.a;
        ResultKt.throwOnFailure(objG);
        Boolean bool = (Boolean) objG;
        if (bool.booleanValue()) {
            submitLogRepositoryImpl.b();
        }
        success = bool.booleanValue();
        return Boxing.boxBoolean(success);
    }

    private final boolean f(int times, Function1<? super Integer, Boolean> action) throws Throwable {
        Throwable th;
        int i;
        Object objM3845constructorimpl;
        boolean z = false;
        Throwable th2 = null;
        int i2 = 0;
        while (!z && i2 < times) {
            try {
                Result.Companion companion = Result.Companion;
                i = i2 + 1;
                try {
                    objM3845constructorimpl = Result.m3845constructorimpl(Boolean.valueOf(action.invoke(Integer.valueOf(i2)).booleanValue()));
                } catch (Throwable th3) {
                    th = th3;
                    Result.Companion companion2 = Result.Companion;
                    objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th));
                }
            } catch (Throwable th4) {
                int i3 = i2;
                th = th4;
                i = i3;
            }
            Throwable thM3848exceptionOrNullimpl = Result.m3848exceptionOrNullimpl(objM3845constructorimpl);
            if (thM3848exceptionOrNullimpl != null && i == times - 1) {
                th2 = thM3848exceptionOrNullimpl;
            }
            Boolean bool = Boolean.FALSE;
            if (Result.m3850isFailureimpl(objM3845constructorimpl)) {
                objM3845constructorimpl = bool;
            }
            boolean zBooleanValue = ((Boolean) objM3845constructorimpl).booleanValue();
            i2 = i;
            z = zBooleanValue;
        }
        if (th2 == null) {
            return z;
        }
        throw th2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't wrap try/catch for region: R(3:55|24|(1:26)(10:27|28|33|(2:35|(1:37))(1:38)|39|(1:41)|42|(1:22)|43|(1:(2:46|(1:48))(2:50|51))(1:52))) */
    /* JADX WARN: Code duplicated, block: B:22:0x0083  */
    /* JADX WARN: Code duplicated, block: B:35:0x0103  */
    /* JADX WARN: Code duplicated, block: B:37:0x010b  */
    /* JADX WARN: Code duplicated, block: B:38:0x010e  */
    /* JADX WARN: Code duplicated, block: B:41:0x011b  */
    /* JADX WARN: Code duplicated, block: B:45:0x012d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:46:0x012f  */
    /* JADX WARN: Code duplicated, block: B:48:0x014e A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:50:0x0150  */
    /* JADX WARN: Code duplicated, block: B:52:0x0156  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00cc, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00cd, code lost:
    
        r16 = r15;
        r15 = r1;
        r1 = r16;
        r17 = r14;
        r14 = r3;
        r3 = r5;
        r5 = r9;
        r18 = r13;
        r13 = r4;
        r4 = r8;
        r8 = r11;
        r11 = r18;
        r12 = r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00e0, code lost:
    
        r6 = kotlin.Result.Companion;
        r0 = kotlin.Result.m3845constructorimpl(kotlin.ResultKt.createFailure(r0));
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v4, types: [T, java.lang.Throwable] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x00aa -> B:28:0x00bd). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(File file, UploadBaseParams uploadBaseParams, String str, long j, Continuation<? super Boolean> continuation) throws Throwable {
        c cVar;
        SubmitLogRepositoryImpl submitLogRepositoryImpl;
        long j2;
        c cVar2;
        SubmitLogRepositoryImpl submitLogRepositoryImpl2;
        SubmitLogRepositoryImpl submitLogRepositoryImpl3;
        Ref.IntRef intRef;
        Ref.ObjectRef objectRef;
        boolean zBooleanValue;
        int i;
        File file2;
        String str2;
        Object obj;
        UploadBaseParams uploadBaseParams2;
        Object objM3845constructorimpl;
        Throwable th;
        int i2;
        File file3;
        ?? M3848exceptionOrNullimpl;
        File file4;
        Boolean boolBoxBoolean;
        if (continuation instanceof c) {
            cVar = (c) continuation;
            int i3 = cVar.l;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                cVar.l = i3 - Integer.MIN_VALUE;
                submitLogRepositoryImpl = this;
            } else {
                submitLogRepositoryImpl = this;
                cVar = submitLogRepositoryImpl.new c(continuation);
            }
        } else {
            submitLogRepositoryImpl = this;
            cVar = submitLogRepositoryImpl.new c(continuation);
        }
        Object objReportLogFileUploadResult = cVar.j;
        Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
        int i4 = cVar.l;
        int i5 = 1;
        if (i4 == 0) {
            ResultKt.throwOnFailure(objReportLogFileUploadResult);
            j2 = j;
            cVar2 = cVar;
            submitLogRepositoryImpl2 = submitLogRepositoryImpl;
            submitLogRepositoryImpl3 = submitLogRepositoryImpl2;
            intRef = new Ref.IntRef();
            objectRef = new Ref.ObjectRef();
            zBooleanValue = false;
            i = 3;
            file2 = file;
            str2 = str;
            obj = coroutine_suspended;
            uploadBaseParams2 = uploadBaseParams;
            if (zBooleanValue) {
            }
            th = (Throwable) objectRef.element;
            if (th == null) {
                throw th;
            }
            if (zBooleanValue) {
                return Boxing.boxBoolean(false);
            }
            FileUploadDataSource fileUploadDataSource = submitLogRepositoryImpl2.fileUploadDataSource;
            long loginID = uploadBaseParams2.getLoginID();
            cVar2.a = null;
            cVar2.b = null;
            cVar2.c = null;
            cVar2.d = null;
            cVar2.e = null;
            cVar2.f = null;
            cVar2.g = null;
            cVar2.l = 2;
            objReportLogFileUploadResult = fileUploadDataSource.reportLogFileUploadResult(loginID, j2, cVar2);
            if (objReportLogFileUploadResult == obj) {
                return obj;
            }
        } else if (i4 == 1) {
            int i6 = cVar.i;
            long j3 = cVar.h;
            objectRef = (Ref.ObjectRef) cVar.g;
            Ref.IntRef intRef2 = (Ref.IntRef) cVar.f;
            SubmitLogRepositoryImpl submitLogRepositoryImpl4 = (SubmitLogRepositoryImpl) cVar.e;
            String str3 = (String) cVar.d;
            UploadBaseParams uploadBaseParams3 = (UploadBaseParams) cVar.c;
            File file5 = (File) cVar.b;
            SubmitLogRepositoryImpl submitLogRepositoryImpl5 = (SubmitLogRepositoryImpl) cVar.a;
            try {
                ResultKt.throwOnFailure(objReportLogFileUploadResult);
            } catch (Throwable th2) {
                Result.Companion companion = Result.Companion;
                objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th2));
                file3 = file5;
                cVar2 = cVar;
                SubmitLogRepositoryImpl submitLogRepositoryImpl6 = submitLogRepositoryImpl5;
                obj = coroutine_suspended;
                uploadBaseParams2 = uploadBaseParams3;
                submitLogRepositoryImpl3 = submitLogRepositoryImpl4;
                long j4 = j3;
                i = i6;
                submitLogRepositoryImpl2 = submitLogRepositoryImpl6;
                str2 = str3;
                intRef = intRef2;
                j2 = j4;
                M3848exceptionOrNullimpl = Result.m3848exceptionOrNullimpl(objM3845constructorimpl);
                if (M3848exceptionOrNullimpl != 0) {
                    file4 = file3;
                    if (intRef.element == i - 1) {
                        objectRef.element = M3848exceptionOrNullimpl;
                    }
                } else {
                    file4 = file3;
                }
                boolBoxBoolean = Boxing.boxBoolean(false);
                if (Result.m3850isFailureimpl(objM3845constructorimpl)) {
                    objM3845constructorimpl = boolBoxBoolean;
                }
                zBooleanValue = ((Boolean) objM3845constructorimpl).booleanValue();
                file2 = file4;
                i5 = 1;
                if (zBooleanValue) {
                }
                th = (Throwable) objectRef.element;
                if (th == null) {
                    throw th;
                }
                if (zBooleanValue) {
                    return Boxing.boxBoolean(false);
                }
                FileUploadDataSource fileUploadDataSource2 = submitLogRepositoryImpl2.fileUploadDataSource;
                long loginID2 = uploadBaseParams2.getLoginID();
                cVar2.a = null;
                cVar2.b = null;
                cVar2.c = null;
                cVar2.d = null;
                cVar2.e = null;
                cVar2.f = null;
                cVar2.g = null;
                cVar2.l = 2;
                objReportLogFileUploadResult = fileUploadDataSource2.reportLogFileUploadResult(loginID2, j2, cVar2);
                if (objReportLogFileUploadResult == obj) {
                    return obj;
                }
                return objReportLogFileUploadResult;
            }
            objM3845constructorimpl = Result.m3845constructorimpl(Boxing.boxBoolean(((Boolean) objReportLogFileUploadResult).booleanValue()));
            file3 = file5;
            cVar2 = cVar;
            SubmitLogRepositoryImpl submitLogRepositoryImpl7 = submitLogRepositoryImpl5;
            obj = coroutine_suspended;
            uploadBaseParams2 = uploadBaseParams3;
            submitLogRepositoryImpl3 = submitLogRepositoryImpl4;
            long j5 = j3;
            i = i6;
            submitLogRepositoryImpl2 = submitLogRepositoryImpl7;
            str2 = str3;
            intRef = intRef2;
            j2 = j5;
            M3848exceptionOrNullimpl = Result.m3848exceptionOrNullimpl(objM3845constructorimpl);
            if (M3848exceptionOrNullimpl != 0) {
                file4 = file3;
                if (intRef.element == i - 1) {
                    objectRef.element = M3848exceptionOrNullimpl;
                }
            } else {
                file4 = file3;
            }
            boolBoxBoolean = Boxing.boxBoolean(false);
            if (Result.m3850isFailureimpl(objM3845constructorimpl)) {
                objM3845constructorimpl = boolBoxBoolean;
            }
            zBooleanValue = ((Boolean) objM3845constructorimpl).booleanValue();
            file2 = file4;
            i5 = 1;
            if (!zBooleanValue || (i2 = intRef.element) >= i) {
                th = (Throwable) objectRef.element;
                if (th == null) {
                    throw th;
                }
                if (zBooleanValue) {
                    return Boxing.boxBoolean(false);
                }
                FileUploadDataSource fileUploadDataSource3 = submitLogRepositoryImpl2.fileUploadDataSource;
                long loginID3 = uploadBaseParams2.getLoginID();
                cVar2.a = null;
                cVar2.b = null;
                cVar2.c = null;
                cVar2.d = null;
                cVar2.e = null;
                cVar2.f = null;
                cVar2.g = null;
                cVar2.l = 2;
                objReportLogFileUploadResult = fileUploadDataSource3.reportLogFileUploadResult(loginID3, j2, cVar2);
                if (objReportLogFileUploadResult == obj) {
                    return obj;
                }
            } else {
                Result.Companion companion2 = Result.Companion;
                intRef.element = i2 + 1;
                FileUploadDataSource fileUploadDataSource4 = submitLogRepositoryImpl2.fileUploadDataSource;
                cVar2.a = submitLogRepositoryImpl2;
                cVar2.b = file2;
                cVar2.c = uploadBaseParams2;
                cVar2.d = str2;
                cVar2.e = submitLogRepositoryImpl3;
                cVar2.f = intRef;
                cVar2.g = objectRef;
                cVar2.h = j2;
                cVar2.i = i;
                cVar2.l = i5;
                objReportLogFileUploadResult = fileUploadDataSource4.uploadLogFile(str2, file2, cVar2);
                if (objReportLogFileUploadResult == obj) {
                    return obj;
                }
                c cVar3 = cVar2;
                file5 = file2;
                cVar = cVar3;
                SubmitLogRepositoryImpl submitLogRepositoryImpl8 = submitLogRepositoryImpl3;
                uploadBaseParams3 = uploadBaseParams2;
                coroutine_suspended = obj;
                submitLogRepositoryImpl5 = submitLogRepositoryImpl2;
                Ref.IntRef intRef3 = intRef;
                str3 = str2;
                i6 = i;
                j3 = j2;
                intRef2 = intRef3;
                submitLogRepositoryImpl4 = submitLogRepositoryImpl8;
                objM3845constructorimpl = Result.m3845constructorimpl(Boxing.boxBoolean(((Boolean) objReportLogFileUploadResult).booleanValue()));
                file3 = file5;
                cVar2 = cVar;
                SubmitLogRepositoryImpl submitLogRepositoryImpl9 = submitLogRepositoryImpl5;
                obj = coroutine_suspended;
                uploadBaseParams2 = uploadBaseParams3;
                submitLogRepositoryImpl3 = submitLogRepositoryImpl4;
                long j6 = j3;
                i = i6;
                submitLogRepositoryImpl2 = submitLogRepositoryImpl9;
                str2 = str3;
                intRef = intRef2;
                j2 = j6;
                M3848exceptionOrNullimpl = Result.m3848exceptionOrNullimpl(objM3845constructorimpl);
                if (M3848exceptionOrNullimpl != 0) {
                    file4 = file3;
                    if (intRef.element == i - 1) {
                        objectRef.element = M3848exceptionOrNullimpl;
                    }
                } else {
                    file4 = file3;
                }
                boolBoxBoolean = Boxing.boxBoolean(false);
                if (Result.m3850isFailureimpl(objM3845constructorimpl)) {
                    objM3845constructorimpl = boolBoxBoolean;
                }
                zBooleanValue = ((Boolean) objM3845constructorimpl).booleanValue();
                file2 = file4;
                i5 = 1;
                if (zBooleanValue) {
                }
                th = (Throwable) objectRef.element;
                if (th == null) {
                    throw th;
                }
                if (zBooleanValue) {
                    return Boxing.boxBoolean(false);
                }
                FileUploadDataSource fileUploadDataSource5 = submitLogRepositoryImpl2.fileUploadDataSource;
                long loginID4 = uploadBaseParams2.getLoginID();
                cVar2.a = null;
                cVar2.b = null;
                cVar2.c = null;
                cVar2.d = null;
                cVar2.e = null;
                cVar2.f = null;
                cVar2.g = null;
                cVar2.l = 2;
                objReportLogFileUploadResult = fileUploadDataSource5.reportLogFileUploadResult(loginID4, j2, cVar2);
                if (objReportLogFileUploadResult == obj) {
                    return obj;
                }
            }
        } else {
            if (i4 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objReportLogFileUploadResult);
        }
        return objReportLogFileUploadResult;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final File h(UserForm userForm) {
        if (c(userForm)) {
            return this.logFileDataSource.getLogZipFile(userForm);
        }
        return null;
    }

    @Override // com.huami.feedback.repo.SubmitLogRepository
    @Nullable
    public Object submitLog(long j, @Nullable String str, @NotNull UserForm userForm, @NotNull String str2, @NotNull Continuation<? super Boolean> continuation) {
        Object next;
        Iterator<T> it2 = this.devicesDataSource.getActiveDevices().iterator();
        while (it2.hasNext()) {
            next = it2.next();
            if (((FeedbackDevice) next).getDeviceType() == userForm.getDeviceType()) {
                return BuildersKt.withContext(Dispatchers.getIO(), new b(userForm, (FeedbackDevice) next, j, str, str2, null), continuation);
            }
        }
        next = null;
        return BuildersKt.withContext(Dispatchers.getIO(), new b(userForm, (FeedbackDevice) next, j, str, str2, null), continuation);
    }
}
