package com.huami.applet.extension;

import java.io.File;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.io.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\u001a\u000e\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u0000\u001a\f\u0010\u0004\u001a\u00020\u0003*\u00020\u0000H\u0000\u001a\f\u0010\u0005\u001a\u00020\u0003*\u00020\u0000H\u0000\u001a\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0006*\u00020\u0000H\u0000¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Ljava/io/File;", "", "readFileContent", "", "createOrExistsDir", "createOrExistsFile", "", "filesSize", "(Ljava/io/File;)Ljava/lang/Long;", "applet_release"}, k = 2, mv = {1, 5, 1})
public final class FileExtKt {
    public static final boolean createOrExistsDir(@NotNull File file) {
        return file.exists() ? file.isDirectory() : file.mkdirs();
    }

    public static final boolean createOrExistsFile(@NotNull File file) {
        Object objM3845constructorimpl;
        if (!createOrExistsDir(file.getParentFile())) {
            return false;
        }
        if (file.exists()) {
            return file.isFile();
        }
        try {
            Result.Companion companion = Result.Companion;
            objM3845constructorimpl = Result.m3845constructorimpl(Boolean.valueOf(file.createNewFile()));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th));
        }
        Boolean bool = Boolean.FALSE;
        if (Result.m3850isFailureimpl(objM3845constructorimpl)) {
            objM3845constructorimpl = bool;
        }
        return ((Boolean) objM3845constructorimpl).booleanValue();
    }

    @Nullable
    public static final Long filesSize(@NotNull File file) {
        Object objM3845constructorimpl;
        try {
            Result.Companion companion = Result.Companion;
            long length = 0;
            if (file.isDirectory()) {
                File[] fileArrListFiles = file.listFiles();
                int i = 0;
                int length2 = fileArrListFiles.length - 1;
                if (length2 >= 0) {
                    while (true) {
                        int i2 = i + 1;
                        length += fileArrListFiles[i].isDirectory() ? filesSize(fileArrListFiles[i]).longValue() : fileArrListFiles[i].length();
                        if (i2 > length2) {
                            break;
                        }
                        i = i2;
                    }
                }
            } else {
                length = file.length();
            }
            objM3845constructorimpl = Result.m3845constructorimpl(Long.valueOf(length));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th));
        }
        Throwable thM3848exceptionOrNullimpl = Result.m3848exceptionOrNullimpl(objM3845constructorimpl);
        if (thM3848exceptionOrNullimpl != null) {
            thM3848exceptionOrNullimpl.printStackTrace();
        }
        if (Result.m3850isFailureimpl(objM3845constructorimpl)) {
            objM3845constructorimpl = null;
        }
        return (Long) objM3845constructorimpl;
    }

    @Nullable
    public static final String readFileContent(@NotNull File file) {
        Object objM3845constructorimpl;
        try {
            Result.Companion companion = Result.Companion;
            objM3845constructorimpl = Result.m3845constructorimpl(c.readText$default(file, null, 1, null));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            objM3845constructorimpl = Result.m3845constructorimpl(ResultKt.createFailure(th));
        }
        Throwable thM3848exceptionOrNullimpl = Result.m3848exceptionOrNullimpl(objM3845constructorimpl);
        if (thM3848exceptionOrNullimpl != null) {
            thM3848exceptionOrNullimpl.printStackTrace();
        }
        return (String) (Result.m3850isFailureimpl(objM3845constructorimpl) ? null : objM3845constructorimpl);
    }
}
