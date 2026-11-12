package com.xiaomi.fitness.access.misport;

import com.xiaomi.fitness.access.export.bean.MiSportData;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\u00020\u00042\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007H&¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0002H&¢\u0006\u0004\b\r\u0010\u0006J'\u0010\u000f\u001a\u00020\u00042\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u00072\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/xiaomi/fitness/access/misport/IMiSportImportView;", "", "", "status", "", "setMigrateStatus", "(I)V", "", "Lcom/xiaomi/fitness/access/export/bean/MiSportData$MiSportDataItem;", "dataList", "setDataList", "(Ljava/util/List;)V", "code", "postMigrateResult", "Lcom/xiaomi/fitness/access/export/bean/MiSportData$MiSportUpdateStatusItem;", "getDataStatus", "(Ljava/util/List;I)V", "access_chinaProductRelease"}, k = 1, mv = {2, 0, 0})
public interface IMiSportImportView {
    /* synthetic */ boolean cancelLoading();

    void getDataStatus(@Nullable List<? extends MiSportData.MiSportUpdateStatusItem> dataList, int status);

    /* synthetic */ void goBack();

    /* synthetic */ boolean isInValid();

    void postMigrateResult(int code);

    void setDataList(@Nullable List<? extends MiSportData.MiSportDataItem> dataList);

    void setMigrateStatus(int status);

    /* synthetic */ void showLoading();

    /* synthetic */ void showLoading(int i);

    /* synthetic */ void showLoading(boolean z);

    /* synthetic */ void showLoading(boolean z, int i);
}
