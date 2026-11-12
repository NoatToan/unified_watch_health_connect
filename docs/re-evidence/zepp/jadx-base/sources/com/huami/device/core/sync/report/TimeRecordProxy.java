package com.huami.device.core.sync.report;

import com.huami.device.core.sync.SyncCenterFactory;
import com.huami.device.core.sync.api.type.JobType;
import com.huami.device.core.sync.api.type.SyncJob;
import com.huami.device.core.sync.report.speed.RateDto;
import com.huami.device.core.sync.report.speed.TransferRateService;
import com.xmlywind.sdk.common.mta.PointCategory;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016J\b\u0010\n\u001a\u00020\tH\u0016R\u0016\u0010\u000b\u001a\u00020\u00018\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001d\u0010\n\u001a\u00020\t8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Lcom/huami/device/core/sync/report/TimeRecordProxy;", "Lcom/huami/device/core/sync/api/type/SyncJob;", "Lcom/huami/device/core/sync/report/ReportApi;", "Lcom/huami/device/core/sync/api/type/JobType;", "findType", "", "maxTime", "", "start", "Lcom/huami/device/core/sync/report/ReportJobItem;", PointCategory.REPORT, "job", "Lcom/huami/device/core/sync/api/type/SyncJob;", "report$delegate", "Lkotlin/Lazy;", "getReport", "()Lcom/huami/device/core/sync/report/ReportJobItem;", "<init>", "(Lcom/huami/device/core/sync/api/type/SyncJob;)V", "sync-center_release"}, k = 1, mv = {1, 5, 1})
public final class TimeRecordProxy implements SyncJob, ReportApi {

    @NotNull
    private final SyncJob job;

    /* JADX INFO: renamed from: report$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy report = LazyKt__LazyJVMKt.lazy(new Function0<ReportJobItem>() { // from class: com.huami.device.core.sync.report.TimeRecordProxy.report.2
        {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final ReportJobItem invoke() {
            return new ReportJobItem(TimeRecordProxy.this.job.findType().getValue(), TimeRecordProxy.this.job.getClass().getSimpleName(), -1L, -1L, -1L, null, 32, null);
        }
    });

    public TimeRecordProxy(@NotNull SyncJob syncJob) {
        this.job = syncJob;
    }

    private final ReportJobItem getReport() {
        return (ReportJobItem) this.report.getValue();
    }

    @Override // com.huami.device.core.sync.api.type.SyncJob
    @NotNull
    public JobType findType() {
        return this.job.findType();
    }

    @Override // com.huami.device.core.sync.api.type.SyncJob
    public long maxTime() {
        return this.job.maxTime();
    }

    @Override // com.huami.device.core.sync.report.ReportApi
    @NotNull
    public ReportJobItem report() {
        RateDto rateDtoFindByType;
        TransferRateService transferRateService$sync_center_release = SyncCenterFactory.INSTANCE.getTransferRateService$sync_center_release();
        ReportJobItem reportJobItemCopy = null;
        if (transferRateService$sync_center_release != null && (rateDtoFindByType = transferRateService$sync_center_release.findByType(this.job.findType())) != null) {
            ReportJobItem report = getReport();
            reportJobItemCopy = report.copy((7 & 1) != 0 ? report.jobId : 0, (7 & 2) != 0 ? report.name : null, (7 & 4) != 0 ? report.cost : 0L, (7 & 8) != 0 ? report.dataSize : rateDtoFindByType.getDataSize(), (7 & 16) != 0 ? report.bleCost : rateDtoFindByType.getBleCost(), (7 & 32) != 0 ? report.data : rateDtoFindByType.getSubTasks());
        }
        return reportJobItemCopy == null ? getReport() : reportJobItemCopy;
    }

    @Override // com.huami.device.core.sync.api.type.SyncJob
    public void start() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.job.start();
        getReport().setCost(System.currentTimeMillis() - jCurrentTimeMillis);
    }
}
