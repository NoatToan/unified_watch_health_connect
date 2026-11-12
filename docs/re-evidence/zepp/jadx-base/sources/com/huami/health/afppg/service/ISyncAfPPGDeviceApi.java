package com.huami.health.afppg.service;

import com.huami.health.afppg.model.AFPPGDataFragment;
import com.huami.health.afppg.model.AFPPGDeviceGeneralInfo;
import java.util.Calendar;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\b\u0010\u000e\u001a\u00020\rH&¨\u0006\u000f"}, d2 = {"Lcom/huami/health/afppg/service/ISyncAfPPGDeviceApi;", "", "Ljava/util/Calendar;", "syncTime", "", "Lcom/huami/health/afppg/model/AFPPGDataFragment;", "syncAfTimeStampFromDevice", "syncAfResultFromDevice", "syncRRPeakFromDevice", "syncAfPpgFromDevice", "syncAfAccFromDevice", "syncHighLowPpgFromDevice", "syncHighLowHRFromDevice", "Lcom/huami/health/afppg/model/AFPPGDeviceGeneralInfo;", "getDeviceInfo", "afppg-core_release"}, k = 1, mv = {1, 5, 1})
public interface ISyncAfPPGDeviceApi {
    @NotNull
    AFPPGDeviceGeneralInfo getDeviceInfo();

    @NotNull
    List<AFPPGDataFragment> syncAfAccFromDevice(@NotNull Calendar syncTime);

    @NotNull
    List<AFPPGDataFragment> syncAfPpgFromDevice(@NotNull Calendar syncTime);

    @NotNull
    List<AFPPGDataFragment> syncAfResultFromDevice(@NotNull Calendar syncTime);

    @NotNull
    List<AFPPGDataFragment> syncAfTimeStampFromDevice(@NotNull Calendar syncTime);

    @NotNull
    List<AFPPGDataFragment> syncHighLowHRFromDevice(@NotNull Calendar syncTime);

    @NotNull
    List<AFPPGDataFragment> syncHighLowPpgFromDevice(@NotNull Calendar syncTime);

    @NotNull
    List<AFPPGDataFragment> syncRRPeakFromDevice(@NotNull Calendar syncTime);
}
