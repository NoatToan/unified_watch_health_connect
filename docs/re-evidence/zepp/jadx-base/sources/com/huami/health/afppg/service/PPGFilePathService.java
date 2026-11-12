package com.huami.health.afppg.service;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import java.io.File;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J \u0010\r\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0002J\f\u0010\u000f\u001a\u00020\u000e*\u00020\nH\u0002J\u0010\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\u0007H\u0002J\u000e\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J \u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0007J\u001e\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nJ\u000e\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\nJ\u000e\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u0002R\u0016\u0010\u0018\u001a\u00020\n8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0017R\u0016\u0010\u0019\u001a\u00020\n8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u0017R\u0016\u0010\u001a\u001a\u00020\n8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0017¨\u0006\u001d"}, d2 = {"Lcom/huami/health/afppg/service/PPGFilePathService;", "", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", GoogleApiAvailabilityLight.a, "e", "Ljava/io/File;", "c", "dir", "", "subDir", "fileName", "b", "", "f", "a", "initDir", "getEcgPath", "getRRPath", "filePath", "deleteFile", "deleteAllFile", "Ljava/lang/String;", "RR_DIR", "KLA_DIR", "TAG", "<init>", "()V", "afppg-core_release"}, k = 1, mv = {1, 5, 1})
public final class PPGFilePathService {

    @NotNull
    public static final PPGFilePathService INSTANCE = new PPGFilePathService();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private static final String RR_DIR = "rrpeak";

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private static final String KLA_DIR = "kla";

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    private static final String TAG = "af_ppg_PPGFilePathService";

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
            return Intrinsics.stringPlus("deleteAllFiles  failed: ", this.a.getMessage());
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
            return " RR File not exists";
        }
    }

    private PPGFilePathService() {
    }

    private final boolean a(File dir) {
        File[] fileArrListFiles;
        File[] fileArrListFiles2 = dir.listFiles();
        if (fileArrListFiles2 == null) {
            return true;
        }
        boolean z = true;
        for (File file : fileArrListFiles2) {
            if (file != null && (fileArrListFiles = file.listFiles()) != null) {
                for (File file2 : fileArrListFiles) {
                    z = z && file2.delete();
                }
            }
            file.delete();
        }
        return z;
    }

    private final File b(File dir, String subDir, String fileName) {
        if (!TextUtils.isEmpty(subDir) && !new File(dir, subDir).exists()) {
            new File(dir, subDir).mkdir();
        }
        if (TextUtils.isEmpty(subDir)) {
            return TextUtils.isEmpty(fileName) ? dir : new File(dir, fileName);
        }
        if (TextUtils.isEmpty(fileName)) {
            return new File(dir, subDir);
        }
        return new File(dir.getPath() + '/' + subDir, fileName);
    }

    private final File c(Context context) {
        return new File(context.getFilesDir(), "rrpeak");
    }

    private final void d(Context context) {
        File file = new File(context.getFilesDir(), KLA_DIR);
        if (file.exists()) {
            return;
        }
        file.mkdirs();
    }

    private final void e(Context context) {
        File fileC = c(context);
        if (fileC.exists()) {
            return;
        }
        fileC.mkdirs();
    }

    private final boolean f(String str) {
        if ((str == null || str.length() == 0) || Intrinsics.areEqual(str, "0")) {
            return false;
        }
        File file = new File(str);
        return file.exists() && file.length() > 0;
    }

    public final boolean deleteAllFile(@NotNull Context context) {
        Object objM3845constructorimpl;
        try {
            Result.Companion companion = Result.Companion;
            PPGFilePathService pPGFilePathService = INSTANCE;
            objM3845constructorimpl = Result.m3845constructorimpl(Boolean.valueOf(pPGFilePathService.a(pPGFilePathService.c(context)) && pPGFilePathService.a(new File(context.getFilesDir(), KLA_DIR))));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th));
        }
        Throwable thM3848exceptionOrNullimpl = Result.m3848exceptionOrNullimpl(objM3845constructorimpl);
        if (thM3848exceptionOrNullimpl != null) {
            HMLog.error$default(TAG, null, null, new a(thM3848exceptionOrNullimpl), 6, null);
        }
        Boolean bool = Boolean.FALSE;
        if (Result.m3850isFailureimpl(objM3845constructorimpl)) {
            objM3845constructorimpl = bool;
        }
        return ((Boolean) objM3845constructorimpl).booleanValue();
    }

    public final void deleteFile(@NotNull String filePath) {
        if (f(filePath)) {
            new File(filePath).delete();
        } else {
            HMLog.info(TAG, b.a);
        }
    }

    @Deprecated(message = "")
    @NotNull
    public final File getEcgPath(@NotNull Context context, @NotNull String subDir, @NotNull String fileName) {
        return b(new File(context.getFilesDir(), KLA_DIR), subDir, fileName);
    }

    @NotNull
    public final File getRRPath(@NotNull Context context, @NotNull String subDir, @NotNull String fileName) {
        return b(c(context), subDir, fileName);
    }

    public final void initDir(@NotNull Context context) {
        d(context);
        e(context);
    }
}
