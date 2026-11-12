package com.huami.device.core.sync.report.service;

import com.huami.device.core.sync.SyncCenterFactory;
import com.huami.device.core.sync.report.ReportJobItem;
import com.huami.message.utils.MessageRecorderEventHelper;
import com.huami.tools.log.HMLog;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.util.Iterator;
import java.util.LinkedList;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.io.CloseableKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0004H\u0016R\u001c\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001c\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\tR\u001d\u0010\u0010\u001a\u00020\u000b8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001d\u0010\u0015\u001a\u00020\u00118B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\r\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0018"}, d2 = {"Lcom/huami/device/core/sync/report/service/StoreServiceImpl;", "Lcom/huami/device/core/sync/report/service/StoreServiceApi;", "Lcom/huami/device/core/sync/report/ReportJobItem;", "rs", "", MessageRecorderEventHelper.OtherPagerHelper.FROM_PUSH, "flush", "Ljava/util/LinkedList;", "reportDataList", "Ljava/util/LinkedList;", "saveList", "Ljava/io/File;", "outFile$delegate", "Lkotlin/Lazy;", "getOutFile", "()Ljava/io/File;", "outFile", "Lcom/huami/device/core/sync/report/service/FormatApi;", "formatter$delegate", "getFormatter", "()Lcom/huami/device/core/sync/report/service/FormatApi;", "formatter", "<init>", "()V", "sync-center_release"}, k = 1, mv = {1, 5, 1})
public final class StoreServiceImpl implements StoreServiceApi {

    @NotNull
    private final LinkedList<ReportJobItem> reportDataList = new LinkedList<>();

    @NotNull
    private final LinkedList<ReportJobItem> saveList = new LinkedList<>();

    /* JADX INFO: renamed from: outFile$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy outFile = LazyKt__LazyJVMKt.lazy(new Function0<File>() { // from class: com.huami.device.core.sync.report.service.StoreServiceImpl$outFile$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final File invoke() {
            return new File(SyncCenterFactory.INSTANCE.getReportFilePath$sync_center_release());
        }
    });

    /* JADX INFO: renamed from: formatter$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy formatter = LazyKt__LazyJVMKt.lazy(new Function0<CSVFormatter>() { // from class: com.huami.device.core.sync.report.service.StoreServiceImpl$formatter$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final CSVFormatter invoke() {
            return new CSVFormatter();
        }
    });

    private final FormatApi getFormatter() {
        return (FormatApi) this.formatter.getValue();
    }

    private final File getOutFile() {
        return (File) this.outFile.getValue();
    }

    @Override // com.huami.device.core.sync.report.service.StoreServiceApi
    public void flush() {
        try {
            if (!getOutFile().exists()) {
                String parent = getOutFile().getParent();
                if (parent != null) {
                    File file = new File(parent);
                    if (!file.exists()) {
                        file.mkdirs();
                    }
                }
                getOutFile().createNewFile();
            }
            this.saveList.addAll(this.reportDataList);
            this.reportDataList.clear();
            Iterator<ReportJobItem> it2 = this.saveList.iterator();
            StringBuffer stringBuffer = new StringBuffer();
            while (it2.hasNext()) {
                stringBuffer.append(getFormatter().format(it2.next()));
                stringBuffer.append(',');
            }
            stringBuffer.append('\n');
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(getOutFile(), true));
            try {
                outputStreamWriter.write(stringBuffer.toString());
                Unit unit = Unit.INSTANCE;
                CloseableKt.closeFinally(outputStreamWriter, null);
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    CloseableKt.closeFinally(outputStreamWriter, th);
                    throw th2;
                }
            }
        } catch (Exception e) {
            HMLog.error$default(null, null, null, new Function0<String>() { // from class: com.huami.device.core.sync.report.service.StoreServiceImpl.flush.3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                @Nullable
                public final String invoke() {
                    return Intrinsics.stringPlus("error -> ", e);
                }
            }, 7, null);
        }
    }

    @Override // com.huami.device.core.sync.report.service.StoreServiceApi
    public void push(@Nullable final ReportJobItem rs) {
        if (rs != null) {
            this.reportDataList.add(rs);
        }
        HMLog.info$default(null, new Function0<String>() { // from class: com.huami.device.core.sync.report.service.StoreServiceImpl.push.2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final String invoke() {
                ReportJobItem reportJobItem = rs;
                return Intrinsics.stringPlus("--> ", reportJobItem == null ? null : reportJobItem.tozCsv());
            }
        }, 1, null);
    }
}
