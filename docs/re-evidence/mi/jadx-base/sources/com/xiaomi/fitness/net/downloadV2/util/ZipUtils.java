package com.xiaomi.fitness.net.downloadV2.util;

import com.xiaomi.fitness.common.log.Logger;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IteratorsJVMKt;
import kotlin.io.ByteStreamsKt;
import kotlin.io.CloseableKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/xiaomi/fitness/net/downloadV2/util/ZipUtils;", "", "<init>", "()V", "TAG", "", "unzip", "", "zipFilePath", "targetDirPath", "net_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nZipUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ZipUtils.kt\ncom/xiaomi/fitness/net/downloadV2/util/ZipUtils\n+ 2 Iterators.kt\nkotlin/collections/CollectionsKt__IteratorsKt\n*L\n1#1,63:1\n32#2,2:64\n*S KotlinDebug\n*F\n+ 1 ZipUtils.kt\ncom/xiaomi/fitness/net/downloadV2/util/ZipUtils\n*L\n27#1:64,2\n*E\n"})
public final class ZipUtils {

    @NotNull
    public static final ZipUtils INSTANCE = new ZipUtils();

    @NotNull
    private static final String TAG = "ZipUtils";

    private ZipUtils() {
    }

    public final boolean unzip(@NotNull String zipFilePath, @NotNull String targetDirPath) {
        Intrinsics.checkNotNullParameter(zipFilePath, "zipFilePath");
        Intrinsics.checkNotNullParameter(targetDirPath, "targetDirPath");
        try {
            File file = new File(targetDirPath);
            if (!file.exists()) {
                file.mkdirs();
            }
            ZipFile zipFile = new ZipFile(zipFilePath);
            try {
                Enumeration<? extends ZipEntry> enumerationEntries = zipFile.entries();
                Intrinsics.checkNotNullExpressionValue(enumerationEntries, "entries(...)");
                Iterator it = CollectionsKt__IteratorsJVMKt.iterator(enumerationEntries);
                while (it.hasNext()) {
                    ZipEntry zipEntry = (ZipEntry) it.next();
                    String name = zipEntry.getName();
                    File file2 = new File(file, name);
                    if (!zipEntry.isDirectory()) {
                        Intrinsics.checkNotNull(name);
                        if (!StringsKt__StringsKt.endsWith$default((CharSequence) name, '/', false, 2, (Object) null)) {
                            File parentFile = file2.getParentFile();
                            if (parentFile != null && !parentFile.exists()) {
                                parentFile.mkdirs();
                            }
                            BufferedInputStream bufferedInputStream = new BufferedInputStream(zipFile.getInputStream(zipEntry));
                            try {
                                BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file2));
                                try {
                                    ByteStreamsKt.copyTo$default(bufferedInputStream, bufferedOutputStream, 0, 2, null);
                                    Unit unit = Unit.INSTANCE;
                                    CloseableKt.closeFinally(bufferedOutputStream, null);
                                    CloseableKt.closeFinally(bufferedInputStream, null);
                                } catch (Throwable th) {
                                    try {
                                        throw th;
                                    } catch (Throwable th2) {
                                        CloseableKt.closeFinally(bufferedOutputStream, th);
                                        throw th2;
                                    }
                                }
                            } catch (Throwable th3) {
                                try {
                                    throw th3;
                                } catch (Throwable th4) {
                                    CloseableKt.closeFinally(bufferedInputStream, th3);
                                    throw th4;
                                }
                            }
                        }
                    }
                    if (!file2.exists()) {
                        file2.mkdirs();
                    }
                }
                Unit unit2 = Unit.INSTANCE;
                CloseableKt.closeFinally(zipFile, null);
                return true;
            } catch (Throwable th5) {
                try {
                    throw th5;
                } catch (Throwable th6) {
                    CloseableKt.closeFinally(zipFile, th5);
                    throw th6;
                }
            }
        } catch (Exception e) {
            Logger.i(TAG, "unzip failed. error=" + e);
            return false;
        }
    }
}
