package com.huami.bloodoxygen.core.utils;

import android.content.Context;
import com.huami.bloodoxygen.core.local.database.entity.OriginOsaEvent;
import com.huami.bloodoxygen.core.local.database.entity.OriginOsaProcess;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0004H\u0002J\u001e\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u00042\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\tH\u0002J\u000e\u0010\r\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0004J+\u0010\u0012\u001a\u0004\u0018\u00010\u0004*\b\u0012\u0004\u0012\u00020\u000e0\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0010\u0010\u0011J+\u0010\u0012\u001a\u0004\u0018\u00010\u0004*\b\u0012\u0004\u0012\u00020\u00130\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0014\u0010\u0011R\u0016\u0010\u0016\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0015¨\u0006\u0019"}, d2 = {"Lcom/huami/bloodoxygen/core/utils/FileUtils;", "", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", "a", "path", "", "b", "", "dataList", "", "c", "deleteFile", "Lcom/huami/bloodoxygen/core/local/database/entity/OriginOsaProcess;", "fileName", "writeToCsvOriginOsaProcess", "(Ljava/util/List;Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;", "writeToCsv", "Lcom/huami/bloodoxygen/core/local/database/entity/OriginOsaEvent;", "writeToCsvOriginOsaEvent", "Ljava/lang/String;", "TAG", "<init>", "()V", "core_release"}, k = 1, mv = {1, 5, 1})
public final class FileUtils {

    @NotNull
    public static final FileUtils INSTANCE = new FileUtils();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private static final String TAG = "FileUtils";

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
            return "List<OriginOsaProcess>.writeToCsv error " + this.a.getMessage();
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
            return "List<OriginOsaEvent>.writeToCsv error " + this.a.getMessage();
        }
    }

    private FileUtils() {
    }

    private final String a(Context context) {
        return context.getCacheDir().getAbsolutePath() + File.separator;
    }

    private final boolean b(String path) {
        return new File(path).exists();
    }

    private final void c(String path, List<String> dataList) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream(new File(path));
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream);
        BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter);
        Iterator<String> it2 = dataList.iterator();
        while (it2.hasNext()) {
            bufferedWriter.append((CharSequence) it2.next()).append((CharSequence) "\r\n");
        }
        bufferedWriter.close();
        outputStreamWriter.close();
        fileOutputStream.close();
    }

    public final boolean deleteFile(@NotNull String path) {
        return new File(path).delete();
    }

    @JvmName(name = "writeToCsvOriginOsaEvent")
    @Nullable
    public final String writeToCsvOriginOsaEvent(@NotNull List<OriginOsaEvent> list, @NotNull Context context, @NotNull String str) {
        Object objM3845constructorimpl;
        try {
            Result.Companion companion = Result.Companion;
            FileUtils fileUtils = INSTANCE;
            String str2 = fileUtils.a(context) + str;
            if (fileUtils.b(str2)) {
                throw new Exception("file " + str2 + " exists");
            }
            ArrayList arrayList = new ArrayList();
            for (OriginOsaEvent originOsaEvent : list) {
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                arrayList.add(String.format("%d,%d,%s,%s,%d", Arrays.copyOf(new Object[]{Long.valueOf(originOsaEvent.getUtcTimestamp() / ((long) 1000)), Integer.valueOf(originOsaEvent.getSpo2Decrease()), CollectionsKt___CollectionsKt.joinToString$default(originOsaEvent.getSpo2(), ";", null, null, 0, null, null, 62, null), CollectionsKt___CollectionsKt.joinToString$default(originOsaEvent.getHr(), ";", null, null, 0, null, null, 62, null), Integer.valueOf(originOsaEvent.getDeviceSource())}, 5)));
            }
            arrayList.add(0, "timestamp,spo2Decrease,spo2,hrs,deviceSource");
            Unit unit = Unit.INSTANCE;
            fileUtils.c(str2, arrayList);
            objM3845constructorimpl = Result.m3845constructorimpl(str2);
            Throwable thM3848exceptionOrNullimpl = Result.m3848exceptionOrNullimpl(objM3845constructorimpl);
            if (thM3848exceptionOrNullimpl != null) {
                HMLog.info(TAG, new b(thM3848exceptionOrNullimpl));
            }
            if (Result.m3850isFailureimpl(objM3845constructorimpl)) {
                objM3845constructorimpl = null;
            }
            return (String) objM3845constructorimpl;
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th));
        }
    }

    @JvmName(name = "writeToCsvOriginOsaProcess")
    @Nullable
    public final String writeToCsvOriginOsaProcess(@NotNull List<OriginOsaProcess> list, @NotNull Context context, @NotNull String str) {
        Object objM3845constructorimpl;
        try {
            Result.Companion companion = Result.Companion;
            FileUtils fileUtils = INSTANCE;
            String str2 = fileUtils.a(context) + str;
            if (fileUtils.b(str2)) {
                throw new Exception("file " + str2 + " exists");
            }
            ArrayList arrayList = new ArrayList();
            for (OriginOsaProcess originOsaProcess : list) {
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                arrayList.add(String.format("%d,%d,%d,%d,%s,%s,%s,%s", Arrays.copyOf(new Object[]{Long.valueOf(originOsaProcess.getUtcTimestamp() / ((long) 1000)), Integer.valueOf(originOsaProcess.getSpo2()), Integer.valueOf(originOsaProcess.getDuration()), Integer.valueOf(originOsaProcess.getDeviceSource()), CollectionsKt___CollectionsKt.joinToString$default(originOsaProcess.getSpo2High(), ";", null, null, 0, null, null, 62, null), CollectionsKt___CollectionsKt.joinToString$default(originOsaProcess.getSpo2Low(), ";", null, null, 0, null, null, 62, null), CollectionsKt___CollectionsKt.joinToString$default(originOsaProcess.getSignalQuality(), ";", null, null, 0, null, null, 62, null), CollectionsKt___CollectionsKt.joinToString$default(originOsaProcess.getExtended(), ";", null, null, 0, null, null, 62, null)}, 8)));
            }
            arrayList.add(0, "timestamp,spo2,validTimeSeconds,deviceSource,spo2High,spo2Low,signalQuality,extended");
            Unit unit = Unit.INSTANCE;
            fileUtils.c(str2, arrayList);
            objM3845constructorimpl = Result.m3845constructorimpl(str2);
            Throwable thM3848exceptionOrNullimpl = Result.m3848exceptionOrNullimpl(objM3845constructorimpl);
            if (thM3848exceptionOrNullimpl != null) {
                HMLog.info(TAG, new a(thM3848exceptionOrNullimpl));
            }
            if (Result.m3850isFailureimpl(objM3845constructorimpl)) {
                objM3845constructorimpl = null;
            }
            return (String) objM3845constructorimpl;
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th));
        }
    }
}
