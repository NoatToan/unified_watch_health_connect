package com.huami.device.core.agps.impl.store;

import com.huami.tools.log.HMLog;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\b"}, d2 = {"Lcom/huami/device/core/agps/impl/store/FileUtil;", "", "Ljava/io/File;", "file", "", "deleteFile", "<init>", "()V", "agps-impl_release"}, k = 1, mv = {1, 4, 0})
public final class FileUtil {
    public static final FileUtil INSTANCE = new FileUtil();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "invoke", "()Ljava/lang/String;", "<anonymous>"}, k = 3, mv = {1, 4, 0})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ File a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(File file) {
            super(0);
            this.a = file;
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final String invoke() {
            return "Delete file error: " + this.a.getAbsoluteFile();
        }
    }

    private FileUtil() {
    }

    public final boolean deleteFile(@NotNull File file) {
        try {
            File[] fileArrListFiles = file.listFiles();
            if (fileArrListFiles != null) {
                for (File file2 : fileArrListFiles) {
                    if (file2.isDirectory()) {
                        if (!INSTANCE.deleteFile(file2)) {
                            return false;
                        }
                    } else if (!file2.delete()) {
                        return false;
                    }
                }
            }
            return file.delete();
        } catch (Throwable th) {
            HMLog.error("", "FileUtil", th, new a(file));
            return false;
        }
    }
}
