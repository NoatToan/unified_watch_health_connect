package com.garmin.android.gncs.datamappers;

import android.os.Bundle;
import com.garmin.android.gncs.GNCSNotificationInfo;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J$\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\t2\b\u0010\n\u001a\u0004\u0018\u00010\u0004H\u0014R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/garmin/android/gncs/datamappers/GoogleNowDataMapper;", "Lcom/garmin/android/gncs/datamappers/ConfigurableDataMapper;", "()V", "lastNotification", "Lcom/garmin/android/gncs/GNCSNotificationInfo;", "mapStatus", "", "ni", "extras", "Landroid/os/Bundle;", "existing", "gncs-all-modules_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class GoogleNowDataMapper extends ConfigurableDataMapper {
    private GNCSNotificationInfo lastNotification;

    @Override // com.garmin.android.gncs.datamappers.GenericDataMapper, com.garmin.android.gncs.datamappers.AbstractDataMapper
    public void mapStatus(GNCSNotificationInfo ni3, Bundle extras, GNCSNotificationInfo existing) {
        ni3.getClass();
        super.mapStatus(ni3, extras, existing);
        if (ni3.contentMatches(this.lastNotification, false)) {
            ni3.status = GNCSNotificationInfo.NotificationStatus.UPDATED;
        }
        this.lastNotification = ni3;
    }
}
