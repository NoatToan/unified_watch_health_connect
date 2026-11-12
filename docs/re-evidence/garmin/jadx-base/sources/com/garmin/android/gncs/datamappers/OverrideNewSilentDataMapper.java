package com.garmin.android.gncs.datamappers;

import android.os.Bundle;
import com.garmin.android.gncs.GNCSNotificationInfo;

/* JADX INFO: loaded from: classes11.dex */
public class OverrideNewSilentDataMapper extends ConfigurableDataMapper {
    @Override // com.garmin.android.gncs.datamappers.GenericDataMapper, com.garmin.android.gncs.datamappers.AbstractDataMapper
    public void mapStatus(GNCSNotificationInfo gNCSNotificationInfo, Bundle bundle, GNCSNotificationInfo gNCSNotificationInfo2) {
        super.mapStatus(gNCSNotificationInfo, bundle, gNCSNotificationInfo2);
        if (gNCSNotificationInfo.status == GNCSNotificationInfo.NotificationStatus.NEW_SILENT) {
            gNCSNotificationInfo.status = GNCSNotificationInfo.NotificationStatus.NEW;
        }
    }
}
