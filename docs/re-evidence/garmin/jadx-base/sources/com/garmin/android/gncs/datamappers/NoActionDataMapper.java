package com.garmin.android.gncs.datamappers;

import com.garmin.android.gncs.persistence.GNCSNotificationAction;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class NoActionDataMapper extends ConfigurableDataMapper {
    @Override // com.garmin.android.gncs.datamappers.ConfigurableDataMapper, com.garmin.android.gncs.datamappers.GenericDataMapper
    public int getSimpleActionIndex(List<GNCSNotificationAction> list) {
        return -1;
    }
}
