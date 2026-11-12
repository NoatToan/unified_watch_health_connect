package com.xiaomi.fitness.feedback.bugreport;

import android.net.Uri;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import com.xiaomi.fitness.baseui.BaseViewModel;
import com.xiaomi.fitness.common.extensions.ApplicationExtKt;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.feedback.bugreport.FeedbackViewModel;
import com.xiaomi.fitness.feedback.export.data.FeedBackModelData;
import com.xiaomi.fitness.feedback.export.data.UploadFileModel;
import com.xiaomi.fitness.feedback.request.FeedbackRequest;
import com.xiaomi.fitness.feedback.ui.FeedbackModel;
import com.xiaomi.fitness.feedback.util.UploadFileUtil;
import com.xiaomi.fitness.net.response.ApiException;
import com.xiaomi.fitness.user.info.export.CollectReportManagerExtKt;
import com.xiaomi.fitness.user.info.export.ICollectReportManager;
import com.xiaomi.fitness.util.SportRecordBundleKey;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.io.CloseableKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004J:\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u000b2\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00130\u00162\u0014\b\u0002\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00130\u0016H\u0002J \u0010\u0019\u001a\u00020\u00132\u0006\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u000fJ*\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u000f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0002J\u000e\u0010!\u001a\u00020\u00132\u0006\u0010\"\u001a\u00020#J\u000e\u0010$\u001a\u00020\u000f2\u0006\u0010\"\u001a\u00020#J\u0018\u0010%\u001a\u00020\u000b2\b\u0010&\u001a\u0004\u0018\u00010\u000f2\u0006\u0010'\u001a\u00020#R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u000fX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u000e\u0010 \u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006("}, d2 = {"Lcom/xiaomi/fitness/feedback/bugreport/FeedbackViewModel;", "Lcom/xiaomi/fitness/baseui/BaseViewModel;", "Lcom/xiaomi/fitness/feedback/ui/FeedbackModel;", "<init>", "()V", "mFeedbackRequest", "Lcom/xiaomi/fitness/feedback/request/FeedbackRequest;", "uploadFileResult", "Lcom/xiaomi/fitness/feedback/export/data/UploadFileModel$UploadFileResult;", "uploadResult", "Landroidx/lifecycle/MutableLiveData;", "", "getUploadResult", "()Landroidx/lifecycle/MutableLiveData;", "TAG", "", "getTAG", "()Ljava/lang/String;", "getUploadFileInfo", "", "showLoading", "success", "Lkotlin/Function1;", "error", "Lcom/xiaomi/fitness/net/response/ApiException;", "uploadInfo", "isUploadFile", "feedBackModel", "Lcom/xiaomi/fitness/feedback/export/data/FeedBackModelData;", "logPath", "extraFile", "Ljava/io/File;", "isZipUpLoading", "copyFileToLog", SportRecordBundleKey.BUNDLE_PARAM_URI, "Landroid/net/Uri;", "getDestPath", "copyInputStreamForPath", "path", "dataUri", "feedback_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nFeedbackViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FeedbackViewModel.kt\ncom/xiaomi/fitness/feedback/bugreport/FeedbackViewModel\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,181:1\n1#2:182\n*E\n"})
public final class FeedbackViewModel extends BaseViewModel<FeedbackModel> {
    private volatile boolean isZipUpLoading;

    @Nullable
    private UploadFileModel.UploadFileResult uploadFileResult;

    @NotNull
    private final FeedbackRequest mFeedbackRequest = new FeedbackRequest();

    @NotNull
    private final MutableLiveData<Boolean> uploadResult = new MutableLiveData<>();

    @NotNull
    private final String TAG = "FeedbackViewModel";

    /* JADX INFO: renamed from: com.xiaomi.fitness.feedback.bugreport.FeedbackViewModel$uploadInfo$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.xiaomi.fitness.feedback.bugreport.FeedbackViewModel$uploadInfo$1", f = "FeedbackViewModel.kt", i = {}, l = {69}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ FeedBackModelData $feedBackModel;
        int label;

        /* JADX INFO: renamed from: com.xiaomi.fitness.feedback.bugreport.FeedbackViewModel$uploadInfo$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "com.xiaomi.fitness.feedback.bugreport.FeedbackViewModel$uploadInfo$1$1", f = "FeedbackViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class C05741 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ FeedBackModelData $feedBackModel;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C05741(FeedBackModelData feedBackModelData, Continuation<? super C05741> continuation) {
                super(2, continuation);
                this.$feedBackModel = feedBackModelData;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new C05741(this.$feedBackModel, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                ICollectReportManager collectReportManagerExtKt = CollectReportManagerExtKt.getInstance(ICollectReportManager.INSTANCE);
                FeedBackModelData.Contact contact = this.$feedBackModel.getContact();
                String phone = contact != null ? contact.getPhone() : null;
                FeedBackModelData.Contact contact2 = this.$feedBackModel.getContact();
                collectReportManagerExtKt.collectPhoneAndEmailInfo(phone, contact2 != null ? contact2.getEmail() : null);
                return Unit.INSTANCE;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((C05741) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(FeedBackModelData feedBackModelData, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.$feedBackModel = feedBackModelData;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.$feedBackModel, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineDispatcher io2 = Dispatchers.getIO();
                C05741 c05741 = new C05741(this.$feedBackModel, null);
                this.label = 1;
                if (BuildersKt.withContext(io2, c05741, this) == coroutine_suspended) {
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

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    private final void getUploadFileInfo(boolean showLoading, final Function1<? super UploadFileModel.UploadFileResult, Unit> success, Function1<? super ApiException, Unit> error) {
        UploadFileModel.UploadFileResult uploadFileResult = this.uploadFileResult;
        if (uploadFileResult != null) {
            Intrinsics.checkNotNull(uploadFileResult);
            if (uploadFileResult.getUrl() != null) {
                return;
            }
        }
        this.mFeedbackRequest.getUploadFileInfo(ViewModelKt.getViewModelScope(this), "feedback", "zip", new Function1() { // from class: mk9
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return FeedbackViewModel.getUploadFileInfo$lambda$1(this.f26951a, success, (UploadFileModel.UploadFileResult) obj);
            }
        }, error);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void getUploadFileInfo$default(FeedbackViewModel feedbackViewModel, boolean z, Function1 function1, Function1 function2, int i, Object obj) {
        if ((i & 4) != 0) {
            function2 = new Function1() { // from class: lk9
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj2) {
                    return FeedbackViewModel.getUploadFileInfo$lambda$0((ApiException) obj2);
                }
            };
        }
        feedbackViewModel.getUploadFileInfo(z, function1, function2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getUploadFileInfo$lambda$0(ApiException it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit getUploadFileInfo$lambda$1(FeedbackViewModel this$0, Function1 success, UploadFileModel.UploadFileResult it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(success, "$success");
        Intrinsics.checkNotNullParameter(it, "it");
        this$0.uploadFileResult = it;
        Logger.i(this$0.getTAG(), "Result it is " + it);
        success.invoke2(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit uploadInfo$lambda$6(FeedBackModelData feedBackModel, final boolean z, final FeedbackViewModel this$0, final String logPath, final File file, UploadFileModel.UploadFileResult it) {
        UploadFileModel.UploadFileResult uploadFileResult;
        Intrinsics.checkNotNullParameter(feedBackModel, "$feedBackModel");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(logPath, "$logPath");
        Intrinsics.checkNotNullParameter(it, "it");
        if (AppUtil.INSTANCE.isPlayChannel()) {
            feedBackModel.setModule_id(273);
        }
        if (z && (uploadFileResult = this$0.uploadFileResult) != null) {
            Intrinsics.checkNotNull(uploadFileResult);
            feedBackModel.setLogfile(uploadFileResult.getObj_name());
        }
        Logger.i(this$0.getTAG(), "FeedBackModelData.logfile it is " + feedBackModel.getLogfile() + "logPath = " + logPath);
        Logger.i(this$0.getTAG(), "feedBackModel it is " + feedBackModel + ", model is " + feedBackModel.getModel() + ", content is" + feedBackModel.getContent() + ", did is" + feedBackModel.getDid() + ", medal is" + feedBackModel.getModel() + ", contact is" + feedBackModel.getContact() + ", version_code is" + feedBackModel.getVersion_code() + ", feedBackModel.module_id is " + feedBackModel.getModule_id() + ", wideTageid is " + feedBackModel.getMi_wide_tag_id() + ", subtagid is " + feedBackModel.getMi_tag_id());
        this$0.mFeedbackRequest.feedback(ViewModelKt.getViewModelScope(this$0), feedBackModel, new Function1() { // from class: pk9
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return FeedbackViewModel.uploadInfo$lambda$6$lambda$4(this.f30491a, z, logPath, file, (String) obj);
            }
        }, new Function1() { // from class: qk9
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return FeedbackViewModel.uploadInfo$lambda$6$lambda$5(this.f31589a, (ApiException) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit uploadInfo$lambda$6$lambda$4(FeedbackViewModel this$0, boolean z, String logPath, File file, String it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(logPath, "$logPath");
        Intrinsics.checkNotNullParameter(it, "it");
        this$0.uploadResult.postValue(Boolean.TRUE);
        Logger.i(this$0.getTAG(), "uploadInfo success " + this$0.uploadFileResult);
        UploadFileModel.UploadFileResult uploadFileResult = this$0.uploadFileResult;
        if (uploadFileResult != null) {
            Intrinsics.checkNotNull(uploadFileResult);
            String obj_name = uploadFileResult.getObj_name();
            if (obj_name != null) {
                UploadFileModel.UploadFileResult uploadFileResult2 = this$0.uploadFileResult;
                Intrinsics.checkNotNull(uploadFileResult2);
                String url = uploadFileResult2.getUrl();
                if (url != null) {
                    UploadFileUtil.INSTANCE.uploadLogFile(z, obj_name, url, logPath, file);
                }
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit uploadInfo$lambda$6$lambda$5(FeedbackViewModel this$0, ApiException it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        Logger.i(this$0.getTAG(), "uploadInfo error " + it);
        this$0.uploadResult.postValue(Boolean.FALSE);
        this$0.uploadFileResult = null;
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit uploadInfo$lambda$7(FeedbackViewModel this$0, ApiException it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        Logger.e(this$0.getTAG(), "getUploadFileInfo error " + it);
        this$0.uploadResult.postValue(Boolean.FALSE);
        this$0.uploadFileResult = null;
        return Unit.INSTANCE;
    }

    public final void copyFileToLog(@NotNull Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        copyInputStreamForPath(getDestPath(uri), uri);
    }

    public final boolean copyInputStreamForPath(@Nullable String path, @NotNull Uri dataUri) {
        Intrinsics.checkNotNullParameter(dataUri, "dataUri");
        try {
            InputStream inputStreamOpenInputStream = ApplicationExtKt.getApplication().getContentResolver().openInputStream(dataUri);
            try {
                File file = new File(path);
                if (!file.getParentFile().exists()) {
                    file.getParentFile().mkdirs();
                }
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                try {
                    byte[] bArr = new byte[1024];
                    while (true) {
                        Intrinsics.checkNotNull(inputStreamOpenInputStream);
                        int i = inputStreamOpenInputStream.read(bArr);
                        if (i == -1) {
                            fileOutputStream.flush();
                            CloseableKt.closeFinally(fileOutputStream, null);
                            CloseableKt.closeFinally(inputStreamOpenInputStream, null);
                            return true;
                        }
                        fileOutputStream.write(bArr, 0, i);
                        try {
                            throw th;
                        } catch (Throwable th) {
                            CloseableKt.closeFinally(inputStreamOpenInputStream, th);
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    try {
                        throw th2;
                    } catch (Throwable th3) {
                        CloseableKt.closeFinally(fileOutputStream, th2);
                        throw th3;
                    }
                }
            } catch (Throwable th4) {
                throw th4;
            }
        } catch (Exception e) {
            Logger.e(getTAG(), e);
            return false;
        }
    }

    @NotNull
    public final String getDestPath(@NotNull Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        String lastPathSegment = uri.getLastPathSegment();
        Intrinsics.checkNotNull(lastPathSegment);
        String separator = File.separator;
        Intrinsics.checkNotNullExpressionValue(separator, "separator");
        String strSubstring = lastPathSegment.substring(StringsKt__StringsKt.lastIndexOf$default((CharSequence) lastPathSegment, separator, 0, false, 6, (Object) null) + 1);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        String feedBackDestDir = UploadFileUtil.INSTANCE.getFeedBackDestDir();
        if (!StringsKt__StringsKt.contains$default((CharSequence) strSubstring, (CharSequence) ".", false, 2, (Object) null)) {
            strSubstring = strSubstring + ".jpg";
        }
        return feedBackDestDir + separator + strSubstring;
    }

    @Override // com.xiaomi.fitness.baseui.BaseViewModel
    @NotNull
    public String getTAG() {
        return this.TAG;
    }

    @NotNull
    public final MutableLiveData<Boolean> getUploadResult() {
        return this.uploadResult;
    }

    public final void uploadInfo(boolean isUploadFile, @NotNull FeedBackModelData feedBackModel, @Nullable String logPath) {
        Intrinsics.checkNotNullParameter(feedBackModel, "feedBackModel");
        if (logPath != null) {
            Logger.i(getTAG(), "will uploadInfo isUploadFile is " + isUploadFile + " logPath is " + logPath + " feedBackModel " + feedBackModel);
            uploadInfo(isUploadFile, feedBackModel, logPath, null);
        }
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new AnonymousClass1(feedBackModel, null), 3, null);
    }

    private final void uploadInfo(final boolean isUploadFile, final FeedBackModelData feedBackModel, final String logPath, final File extraFile) {
        Logger.i(getTAG(), "logPath=" + logPath + ", extraFile=" + extraFile + ", isUploadFile=" + isUploadFile);
        getUploadFileInfo(true, new Function1() { // from class: nk9
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return FeedbackViewModel.uploadInfo$lambda$6(feedBackModel, isUploadFile, this, logPath, extraFile, (UploadFileModel.UploadFileResult) obj);
            }
        }, new Function1() { // from class: ok9
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return FeedbackViewModel.uploadInfo$lambda$7(this.f29241a, (ApiException) obj);
            }
        });
    }
}
