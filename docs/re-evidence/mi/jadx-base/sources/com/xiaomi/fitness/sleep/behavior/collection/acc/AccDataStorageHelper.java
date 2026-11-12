package com.xiaomi.fitness.sleep.behavior.collection.acc;

import android.content.Context;
import com.xiaomi.fitness.common.log.Logger;
import com.xiaomi.fitness.common.utils.FileUtils;
import com.xiaomi.fitness.sleep.behavior.BehaviorConfiguration;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u000b\b\u0000\u0018\u0000 !2\u00020\u0001:\u0001!B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011J\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00050\u00132\u0006\u0010\u0010\u001a\u00020\u0011J\u000e\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011J \u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u0017H\u0007J\b\u0010\u001a\u001a\u00020\u000fH\u0003J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u001c\u001a\u00020\u0005H\u0002J\u001a\u0010\u001d\u001a\u00020\u000f2\u0006\u0010\u001e\u001a\u00020\u00172\b\u0010\u001f\u001a\u0004\u0018\u00010\u000bH\u0002J\u0010\u0010 \u001a\u00020\u00052\u0006\u0010\u001c\u001a\u00020\u0005H\u0002R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\""}, d2 = {"Lcom/xiaomi/fitness/sleep/behavior/collection/acc/AccDataStorageHelper;", "", "<init>", "()V", "fileX", "Ljava/io/File;", "fileY", "fileZ", "currentDataSize", "", "fileXPrintWriter", "Ljava/io/PrintWriter;", "fileYPrintWriter", "fileZPrinterWriter", "initAccConfig", "", "context", "Landroid/content/Context;", "stopAccDataStorage", "", "clearAccOutputData", "writeAccData", "accX", "", "accY", "accZ", "flushAllAccData", "getPrinterWriter", "file", "writeBufferToFile", "data", "writer", "renameAccDataFiles", "Companion", "sleep-trace_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class AccDataStorageHelper {

    @NotNull
    private static final String ACC_FILE_NAME_FORMAT = "Acc%s.txt";
    private static final int BUFFER_SIZE = 512;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String TAG = "AccDataStorageHelper";
    private int currentDataSize;

    @Nullable
    private File fileX;

    @Nullable
    private PrintWriter fileXPrintWriter;

    @Nullable
    private File fileY;

    @Nullable
    private PrintWriter fileYPrintWriter;

    @Nullable
    private File fileZ;

    @Nullable
    private PrintWriter fileZPrinterWriter;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fJ\u0016\u0010\r\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000R\u0011\u0010\u000f\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0012\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0011R\u0011\u0010\u0014\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0011R\u0014\u0010\u0016\u001a\u00020\u00058BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0011¨\u0006\u0018"}, d2 = {"Lcom/xiaomi/fitness/sleep/behavior/collection/acc/AccDataStorageHelper$Companion;", "", "<init>", "()V", "ACC_FILE_NAME_FORMAT", "", "TAG", "BUFFER_SIZE", "", "getSnailAccCollectorDir", "Ljava/io/File;", "context", "Landroid/content/Context;", "getSnailAccCollectFile", "fileName", "snailAccXFileName", "getSnailAccXFileName", "()Ljava/lang/String;", "snailAccYFileName", "getSnailAccYFileName", "snailAccZFileName", "getSnailAccZFileName", "accDirName", "getAccDirName", "sleep-trace_chinaProductRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String getAccDirName() {
            return BehaviorConfiguration.SNAIL_COLLECTOR_ACC_DIR_NAME;
        }

        @NotNull
        public final File getSnailAccCollectFile(@NotNull Context context, @NotNull String fileName) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(fileName, "fileName");
            return FileUtils.INSTANCE.getFileInFilesPath(context, getAccDirName(), fileName);
        }

        @NotNull
        public final File getSnailAccCollectorDir(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            return new File(context.getFilesDir().getPath(), getAccDirName());
        }

        @NotNull
        public final String getSnailAccXFileName() {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String str = String.format(Locale.US, AccDataStorageHelper.ACC_FILE_NAME_FORMAT, Arrays.copyOf(new Object[]{"X"}, 1));
            Intrinsics.checkNotNullExpressionValue(str, "format(...)");
            return str;
        }

        @NotNull
        public final String getSnailAccYFileName() {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String str = String.format(Locale.US, AccDataStorageHelper.ACC_FILE_NAME_FORMAT, Arrays.copyOf(new Object[]{"Y"}, 1));
            Intrinsics.checkNotNullExpressionValue(str, "format(...)");
            return str;
        }

        @NotNull
        public final String getSnailAccZFileName() {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String str = String.format(Locale.US, AccDataStorageHelper.ACC_FILE_NAME_FORMAT, Arrays.copyOf(new Object[]{"Z"}, 1));
            Intrinsics.checkNotNullExpressionValue(str, "format(...)");
            return str;
        }
    }

    private final void flushAllAccData() {
        PrintWriter printWriter = this.fileXPrintWriter;
        if (printWriter != null) {
            Intrinsics.checkNotNull(printWriter);
            printWriter.flush();
        }
        PrintWriter printWriter2 = this.fileYPrintWriter;
        if (printWriter2 != null) {
            Intrinsics.checkNotNull(printWriter2);
            printWriter2.flush();
        }
        PrintWriter printWriter3 = this.fileZPrinterWriter;
        if (printWriter3 != null) {
            Intrinsics.checkNotNull(printWriter3);
            printWriter3.flush();
        }
    }

    private final PrintWriter getPrinterWriter(File file) {
        if (!file.exists()) {
            return null;
        }
        try {
            return new PrintWriter(new BufferedWriter(new FileWriter(file, true)));
        } catch (IOException unused) {
            Logger.e(TAG, "getPrinterWriter fail, error message:" + file.getName());
            return null;
        }
    }

    private final File renameAccDataFiles(File file) {
        String str = file.getAbsolutePath() + System.currentTimeMillis();
        if (FileUtils.INSTANCE.rename(file, str)) {
            file = new File(str);
        }
        file.deleteOnExit();
        return file;
    }

    private final void writeBufferToFile(float data, PrintWriter writer) {
        if (writer == null) {
            return;
        }
        writer.println(data);
    }

    public final void clearAccOutputData(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        FileUtils.INSTANCE.deleteFile(INSTANCE.getSnailAccCollectorDir(context));
        this.fileXPrintWriter = null;
        this.fileYPrintWriter = null;
        this.fileZPrinterWriter = null;
        this.currentDataSize = 0;
        Logger.i(TAG, "clearAccOutputData");
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0031  */
    /* JADX WARN: Code duplicated, block: B:16:0x0050  */
    /* JADX WARN: Code duplicated, block: B:6:0x0012  */
    public final void initAccConfig(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        File file = this.fileX;
        if (file != null) {
            Intrinsics.checkNotNull(file);
            if (!file.exists()) {
                FileUtils fileUtils = FileUtils.INSTANCE;
                Companion companion = INSTANCE;
                this.fileX = fileUtils.createFileInFilesPath(context, companion.getAccDirName(), companion.getSnailAccXFileName());
            }
        } else {
            FileUtils fileUtils2 = FileUtils.INSTANCE;
            Companion companion2 = INSTANCE;
            this.fileX = fileUtils2.createFileInFilesPath(context, companion2.getAccDirName(), companion2.getSnailAccXFileName());
        }
        File file2 = this.fileY;
        if (file2 != null) {
            Intrinsics.checkNotNull(file2);
            if (!file2.exists()) {
                FileUtils fileUtils3 = FileUtils.INSTANCE;
                Companion companion3 = INSTANCE;
                this.fileY = fileUtils3.createFileInFilesPath(context, companion3.getAccDirName(), companion3.getSnailAccYFileName());
            }
        } else {
            FileUtils fileUtils4 = FileUtils.INSTANCE;
            Companion companion4 = INSTANCE;
            this.fileY = fileUtils4.createFileInFilesPath(context, companion4.getAccDirName(), companion4.getSnailAccYFileName());
        }
        File file3 = this.fileZ;
        if (file3 != null) {
            Intrinsics.checkNotNull(file3);
            if (!file3.exists()) {
                FileUtils fileUtils5 = FileUtils.INSTANCE;
                Companion companion5 = INSTANCE;
                this.fileZ = fileUtils5.createFileInFilesPath(context, companion5.getAccDirName(), companion5.getSnailAccZFileName());
            }
        } else {
            FileUtils fileUtils6 = FileUtils.INSTANCE;
            Companion companion6 = INSTANCE;
            this.fileZ = fileUtils6.createFileInFilesPath(context, companion6.getAccDirName(), companion6.getSnailAccZFileName());
        }
        if (this.fileXPrintWriter == null) {
            File file4 = this.fileX;
            Intrinsics.checkNotNull(file4);
            this.fileXPrintWriter = getPrinterWriter(file4);
        }
        if (this.fileYPrintWriter == null) {
            File file5 = this.fileY;
            Intrinsics.checkNotNull(file5);
            this.fileYPrintWriter = getPrinterWriter(file5);
        }
        if (this.fileZPrinterWriter == null) {
            File file6 = this.fileZ;
            Intrinsics.checkNotNull(file6);
            this.fileZPrinterWriter = getPrinterWriter(file6);
        }
    }

    @NotNull
    public final List<File> stopAccDataStorage(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        PrintWriter printWriter = this.fileXPrintWriter;
        if (printWriter != null) {
            Intrinsics.checkNotNull(printWriter);
            printWriter.close();
        }
        PrintWriter printWriter2 = this.fileYPrintWriter;
        if (printWriter2 != null) {
            Intrinsics.checkNotNull(printWriter2);
            printWriter2.close();
        }
        PrintWriter printWriter3 = this.fileZPrinterWriter;
        if (printWriter3 != null) {
            Intrinsics.checkNotNull(printWriter3);
            printWriter3.close();
        }
        ArrayList arrayList = new ArrayList();
        Companion companion = INSTANCE;
        File snailAccCollectFile = companion.getSnailAccCollectFile(context, companion.getSnailAccXFileName());
        File snailAccCollectFile2 = companion.getSnailAccCollectFile(context, companion.getSnailAccYFileName());
        File snailAccCollectFile3 = companion.getSnailAccCollectFile(context, companion.getSnailAccZFileName());
        if (snailAccCollectFile.exists()) {
            arrayList.add(renameAccDataFiles(snailAccCollectFile));
        }
        if (snailAccCollectFile2.exists()) {
            arrayList.add(renameAccDataFiles(snailAccCollectFile2));
        }
        if (snailAccCollectFile3.exists()) {
            arrayList.add(renameAccDataFiles(snailAccCollectFile3));
        }
        return arrayList;
    }

    public final void writeAccData(float accX, float accY, float accZ) {
        writeBufferToFile(accX, this.fileXPrintWriter);
        writeBufferToFile(accY, this.fileYPrintWriter);
        writeBufferToFile(accZ, this.fileZPrinterWriter);
        int i = this.currentDataSize + 1;
        this.currentDataSize = i;
        if (i >= 512) {
            flushAllAccData();
            this.currentDataSize = 0;
        }
    }
}
