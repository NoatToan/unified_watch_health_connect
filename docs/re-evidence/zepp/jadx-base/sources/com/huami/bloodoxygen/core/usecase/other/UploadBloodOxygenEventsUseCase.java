package com.huami.bloodoxygen.core.usecase.other;

import com.huami.bloodoxygen.core.remote.upload.IUploader;
import com.huami.bloodoxygen.core.utils.PackagefunctionKt;
import com.huami.tools.log.HMLog;
import com.tekartik.sqflite.Constant;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u001d\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\b¢\u0006\u0004\b\f\u0010\rJ\u0006\u0010\u0003\u001a\u00020\u0002R\u0016\u0010\u0007\u001a\u00020\u00048\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u001c\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\b8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000f"}, d2 = {"Lcom/huami/bloodoxygen/core/usecase/other/UploadBloodOxygenEventsUseCase;", "", "", Constant.METHOD_EXECUTE, "Lcom/huami/bloodoxygen/core/remote/upload/IUploader;", "a", "Lcom/huami/bloodoxygen/core/remote/upload/IUploader;", "uploader", "Lkotlin/Function0;", "b", "Lkotlin/jvm/functions/Function0;", "isSyncDataEnable", "<init>", "(Lcom/huami/bloodoxygen/core/remote/upload/IUploader;Lkotlin/jvm/functions/Function0;)V", "Companion", "core_release"}, k = 1, mv = {1, 5, 1})
public final class UploadBloodOxygenEventsUseCase {

    @NotNull
    private static final String c = "UploadBloodOxygenEventsUseCase";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final IUploader uploader;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Function0<Boolean> isSyncDataEnable;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "UploadBloodOxygenEventsUseCase isSyncDataEnable false";
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
            return "UploadBloodOxygenEventsUseCase execute";
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
        public final String invoke() {
            return "execute failed " + this.a.getMessage();
        }
    }

    public UploadBloodOxygenEventsUseCase(@NotNull IUploader iUploader, @NotNull Function0<Boolean> function0) {
        this.uploader = iUploader;
        this.isSyncDataEnable = function0;
    }

    public final boolean execute() {
        Object objM3845constructorimpl;
        if (!this.isSyncDataEnable.invoke().booleanValue()) {
            HMLog.info$default(null, a.a, 1, null);
            return true;
        }
        PackagefunctionKt.bloodOxygenDebugLog$default(null, b.a, 1, null);
        try {
            Result.Companion companion = Result.Companion;
            objM3845constructorimpl = Result.m3845constructorimpl(Boolean.valueOf(this.uploader.uploadAll()));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th));
        }
        Throwable thM3848exceptionOrNullimpl = Result.m3848exceptionOrNullimpl(objM3845constructorimpl);
        if (thM3848exceptionOrNullimpl != null) {
            HMLog.info(c, new c(thM3848exceptionOrNullimpl));
        }
        Boolean bool = Boolean.FALSE;
        if (Result.m3850isFailureimpl(objM3845constructorimpl)) {
            objM3845constructorimpl = bool;
        }
        return ((Boolean) objM3845constructorimpl).booleanValue();
    }
}
