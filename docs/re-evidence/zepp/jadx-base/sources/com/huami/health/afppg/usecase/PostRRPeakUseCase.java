package com.huami.health.afppg.usecase;

import android.content.Context;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.health.afppg.data.local.bean.RRPeak;
import com.huami.health.afppg.data.local.file.PPGFileOperator;
import com.huami.health.afppg.data.remote.AfPpgWebApi;
import com.huami.health.afppg.data.remote.dto.RawUrlResponse;
import com.huami.health.afppg.repository.PPGRepository;
import com.huami.health.afppg.service.PPGFilePathService;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import java.io.File;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB-\u0012\u0006\u0010\u0014\u001a\u00020\u0012\u0012\u0006\u0010\u0016\u001a\u00020\u0006\u0012\u0006\u0010\u0019\u001a\u00020\u0017\u0012\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00040\u001a¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0012\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\f\u0010\n\u001a\u00020\u0004*\u00020\u0006H\u0002J\u0018\u0010\r\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0006H\u0002J\u0010\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\u0002H\u0002J\f\u0010\u0010\u001a\u00020\u0004*\u00020\u0002H\u0002J\u0006\u0010\u0011\u001a\u00020\u0004R\u0016\u0010\u0014\u001a\u00020\u00128\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0013R\u0016\u0010\u0016\u001a\u00020\u00068\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0015R\u0016\u0010\u0019\u001a\u00020\u00178\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0018R\u001c\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00040\u001a8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u001b¨\u0006 "}, d2 = {"Lcom/huami/health/afppg/usecase/PostRRPeakUseCase;", "", "Lcom/huami/health/afppg/data/local/bean/RRPeak;", "rrPeak", "", "e", "", "f", "Ljava/io/File;", "g", "a", "data", "path", "c", "", GoogleApiAvailabilityLight.a, "b", "uploadRRPeak", "Landroid/content/Context;", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Ljava/lang/String;", "userId", "Lcom/huami/health/afppg/repository/PPGRepository;", "Lcom/huami/health/afppg/repository/PPGRepository;", "ppgRepository", "Lkotlin/Function0;", "Lkotlin/jvm/functions/Function0;", "isSyncDataEnabled", "<init>", "(Landroid/content/Context;Ljava/lang/String;Lcom/huami/health/afppg/repository/PPGRepository;Lkotlin/jvm/functions/Function0;)V", "Companion", "afppg-core_release"}, k = 1, mv = {1, 5, 1})
public final class PostRRPeakUseCase {

    @NotNull
    private static final String e = "af_ppg_PostRRPeakUserCase";
    private static final int f = 0;

    @NotNull
    private static final String g = "";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final Context context;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final String userId;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private final PPGRepository ppgRepository;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final Function0<Boolean> isSyncDataEnabled;

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
        public final String invoke() {
            return Intrinsics.stringPlus("postSummary uploadRRPeak error, ", this.a.getMessage());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public final /* synthetic */ Throwable a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Throwable th) {
            super(0);
            this.a = th;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return Intrinsics.stringPlus("updateSyncedState error, ", this.a.getMessage());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<String> {
        public final /* synthetic */ List<RRPeak> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(List<RRPeak> list) {
            super(0);
            this.a = list;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return Intrinsics.stringPlus("getUnsyncedRRData size: ", Integer.valueOf(this.a.size()));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<String> {
        public final /* synthetic */ Throwable a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Throwable th) {
            super(0);
            this.a = th;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return Intrinsics.stringPlus("uploadRRPeak, failed:  ", this.a.getMessage());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function0<String> {
        public final /* synthetic */ RRPeak a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(RRPeak rRPeak) {
            super(0);
            this.a = rRPeak;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return "upload raw file, server uri existed: " + this.a.getRawLocalPath() + ", id: " + this.a.getGeneratedTime();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class f extends Lambda implements Function0<String> {
        public final /* synthetic */ boolean a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(boolean z) {
            super(0);
            this.a = z;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return Intrinsics.stringPlus("zipFile delete result: ", Boolean.valueOf(this.a));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class g extends Lambda implements Function0<String> {
        public final /* synthetic */ Throwable a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(Throwable th) {
            super(0);
            this.a = th;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return Intrinsics.stringPlus("upload raw file, get rawUrl failed: ", this.a.getMessage());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class h extends Lambda implements Function0<String> {
        public final /* synthetic */ RRPeak a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(RRPeak rRPeak) {
            super(0);
            this.a = rRPeak;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return Intrinsics.stringPlus("post: raw file gone: ", Long.valueOf(this.a.getGeneratedTime()));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class i extends Lambda implements Function0<String> {
        public final /* synthetic */ RRPeak a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(RRPeak rRPeak) {
            super(0);
            this.a = rRPeak;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        public final String invoke() {
            return Intrinsics.stringPlus("post raw: filed to zip file: ", this.a.getRawLocalPath());
        }
    }

    public PostRRPeakUseCase(@NotNull Context context, @NotNull String str, @NotNull PPGRepository pPGRepository, @NotNull Function0<Boolean> function0) {
        this.context = context;
        this.userId = str;
        this.ppgRepository = pPGRepository;
        this.isSyncDataEnabled = function0;
    }

    private final boolean a(String str) {
        if ((str == null || str.length() == 0) || Intrinsics.areEqual(str, "0")) {
            return false;
        }
        File file = new File(str);
        return file.exists() && file.length() > 0;
    }

    private final boolean b(RRPeak rRPeak) {
        return !Intrinsics.areEqual(rRPeak.getRawDataURI(), "0");
    }

    private final boolean c(RRPeak data, String path) {
        Object objM3845constructorimpl;
        try {
            Result.Companion companion = Result.Companion;
            objM3845constructorimpl = Result.m3845constructorimpl(Boolean.valueOf(this.ppgRepository.uploadRRPeak(data, path)));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m3851isSuccessimpl(objM3845constructorimpl)) {
            boolean zBooleanValue = ((Boolean) objM3845constructorimpl).booleanValue();
            if (zBooleanValue) {
                d(data);
            }
            return zBooleanValue;
        }
        Throwable thM3848exceptionOrNullimpl = Result.m3848exceptionOrNullimpl(objM3845constructorimpl);
        if (thM3848exceptionOrNullimpl != null) {
            HMLog.error$default(e, null, null, new a(thM3848exceptionOrNullimpl), 6, null);
        }
        if (Result.m3848exceptionOrNullimpl(objM3845constructorimpl) != null) {
            objM3845constructorimpl = Boolean.FALSE;
        }
        return ((Boolean) objM3845constructorimpl).booleanValue();
    }

    private final void d(RRPeak data) {
        Object objM3845constructorimpl;
        try {
            Result.Companion companion = Result.Companion;
            this.ppgRepository.updateRRSyncedState(data.getDeviceSource(), data.getGeneratedTime());
            objM3845constructorimpl = Result.m3845constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th));
        }
        Throwable thM3848exceptionOrNullimpl = Result.m3848exceptionOrNullimpl(objM3845constructorimpl);
        if (thM3848exceptionOrNullimpl != null) {
            HMLog.error$default(e, null, null, new b(thM3848exceptionOrNullimpl), 6, null);
        }
    }

    private final boolean e(RRPeak rrPeak) {
        Object objM3845constructorimpl;
        try {
            Result.Companion companion = Result.Companion;
            String strF = f(rrPeak);
            if (strF.length() == 0) {
                return false;
            }
            objM3845constructorimpl = Result.m3845constructorimpl(Boolean.valueOf(c(rrPeak, strF)));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th));
        }
        Throwable thM3848exceptionOrNullimpl = Result.m3848exceptionOrNullimpl(objM3845constructorimpl);
        if (thM3848exceptionOrNullimpl != null) {
            HMLog.error$default(e, null, null, new d(thM3848exceptionOrNullimpl), 6, null);
        }
        if (Result.m3848exceptionOrNullimpl(objM3845constructorimpl) != null) {
            objM3845constructorimpl = Boolean.FALSE;
        }
        return ((Boolean) objM3845constructorimpl).booleanValue();
    }

    private final String f(RRPeak rrPeak) throws Exception {
        Object objM3845constructorimpl;
        Object objM3845constructorimpl2;
        if (b(rrPeak)) {
            HMLog.info(e, new e(rrPeak));
            return rrPeak.getRawDataURI();
        }
        File fileG = g(rrPeak);
        if (fileG == null) {
            throw new Exception(Intrinsics.stringPlus("upload raw file, failed to zip: ", Long.valueOf(rrPeak.getGeneratedTime())));
        }
        try {
            Result.Companion companion = Result.Companion;
            objM3845constructorimpl = Result.m3845constructorimpl(this.ppgRepository.fetchRRRawUrl(fileG.getName(), AfPpgWebApi.PARAM_FILE_TYPE_VALUE_RRPEAK));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th));
        }
        Throwable thM3848exceptionOrNullimpl = Result.m3848exceptionOrNullimpl(objM3845constructorimpl);
        if (thM3848exceptionOrNullimpl != null) {
            HMLog.error$default(e, null, null, new g(thM3848exceptionOrNullimpl), 6, null);
        }
        ResultKt.throwOnFailure(objM3845constructorimpl);
        RawUrlResponse rawUrlResponse = (RawUrlResponse) objM3845constructorimpl;
        String putURI = rawUrlResponse.getPutURI();
        String objectName = rawUrlResponse.getObjectName();
        try {
            Result.Companion companion3 = Result.Companion;
            if (!this.ppgRepository.uploadRRRawFile(putURI, fileG)) {
                return "";
            }
            this.ppgRepository.updateRRRawPath(rrPeak.getDeviceSource(), rrPeak.getGeneratedTime(), objectName);
            objM3845constructorimpl2 = Result.m3845constructorimpl(objectName);
        } catch (Throwable th2) {
            Result.Companion companion4 = Result.Companion;
            objM3845constructorimpl2 = Result.m3845constructorimpl(ResultKt.createFailure(th2));
        }
        if (Result.m3851isSuccessimpl(objM3845constructorimpl2)) {
            HMLog.debug(e, new f(fileG.delete()));
            PPGFilePathService.INSTANCE.deleteFile(rrPeak.getRawLocalPath());
        }
        return (String) (Result.m3848exceptionOrNullimpl(objM3845constructorimpl2) == null ? objM3845constructorimpl2 : "");
    }

    private final File g(RRPeak rrPeak) {
        Object objM3845constructorimpl;
        if (!a(rrPeak.getRawLocalPath())) {
            HMLog.error$default(e, null, null, new h(rrPeak), 6, null);
            return null;
        }
        PPGFileOperator pPGFileOperator = PPGFileOperator.INSTANCE;
        File rRPeakZipFile = pPGFileOperator.getRRPeakZipFile(this.context, this.userId, rrPeak.getGeneratedTime());
        List listListOf = kotlin.collections.e.listOf(new File(rrPeak.getRawLocalPath()));
        try {
            Result.Companion companion = Result.Companion;
            pPGFileOperator.zipFiles(listListOf, rRPeakZipFile);
            objM3845constructorimpl = Result.m3845constructorimpl(rRPeakZipFile);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m3848exceptionOrNullimpl(objM3845constructorimpl) != null) {
            HMLog.error$default(e, null, null, new i(rrPeak), 6, null);
        }
        return (File) (Result.m3850isFailureimpl(objM3845constructorimpl) ? null : objM3845constructorimpl);
    }

    public final boolean uploadRRPeak() {
        if (!this.isSyncDataEnabled.invoke().booleanValue()) {
            return false;
        }
        List<RRPeak> unsyncedRRData = this.ppgRepository.getUnsyncedRRData();
        if (unsyncedRRData == null || unsyncedRRData.isEmpty()) {
            return true;
        }
        HMLog.info(e, new c(unsyncedRRData));
        Iterator<T> it2 = unsyncedRRData.iterator();
        boolean z = true;
        while (it2.hasNext()) {
            z = z && e((RRPeak) it2.next());
            if (!z) {
                return false;
            }
        }
        return z;
    }
}
