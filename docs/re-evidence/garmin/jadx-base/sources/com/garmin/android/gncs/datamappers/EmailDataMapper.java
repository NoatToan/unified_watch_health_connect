package com.garmin.android.gncs.datamappers;

import android.content.Context;
import com.garmin.android.gncs.GNCSParsedNotification;

/* JADX INFO: loaded from: classes11.dex */
public class EmailDataMapper extends ConfigurableDataMapper {
    @Override // com.garmin.android.gncs.datamappers.ConfigurableDataMapper, com.garmin.android.gncs.datamappers.GenericDataMapper, com.garmin.android.gncs.datamappers.AbstractDataMapper
    public void mapExtras(Context context, GNCSParsedNotification gNCSParsedNotification) {
        super.mapExtras(context, gNCSParsedNotification);
        gNCSParsedNotification.notificationInfo.subTitle = "";
    }
}
