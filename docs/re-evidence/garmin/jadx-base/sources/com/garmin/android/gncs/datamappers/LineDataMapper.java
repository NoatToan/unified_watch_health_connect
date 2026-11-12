package com.garmin.android.gncs.datamappers;

import android.os.Bundle;
import com.garmin.android.gncs.GNCSNotificationInfo;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J$\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\u0006H\u0014¨\u0006\n"}, d2 = {"Lcom/garmin/android/gncs/datamappers/LineDataMapper;", "Lcom/garmin/android/gncs/datamappers/ConfigurableDataMapper;", "()V", "mapStatus", "", "ni", "Lcom/garmin/android/gncs/GNCSNotificationInfo;", "extras", "Landroid/os/Bundle;", "existing", "gncs-all-modules_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class LineDataMapper extends ConfigurableDataMapper {
    @Override // com.garmin.android.gncs.datamappers.GenericDataMapper, com.garmin.android.gncs.datamappers.AbstractDataMapper
    public void mapStatus(GNCSNotificationInfo ni3, Bundle extras, GNCSNotificationInfo existing) {
        ni3.getClass();
        super.mapStatus(ni3, extras, existing);
        if ((ni3.notificationFlags & 2) != 0 && ni3.priority < 1) {
            ni3.priority = 1;
        }
        if (s.g(ni3.category, "call") && ni3.status == GNCSNotificationInfo.NotificationStatus.NEW_SILENT) {
            ni3.status = GNCSNotificationInfo.NotificationStatus.NEW;
        }
        if (ni3.isGroupSummary() || extras == null || !extras.containsKey("line.sticker.id")) {
            return;
        }
        ni3.status = GNCSNotificationInfo.NotificationStatus.NEW;
    }
}
