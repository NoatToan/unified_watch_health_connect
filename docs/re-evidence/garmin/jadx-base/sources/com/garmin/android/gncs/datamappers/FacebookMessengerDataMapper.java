package com.garmin.android.gncs.datamappers;

import android.os.Bundle;
import com.garmin.android.gncs.GNCSNotificationInfo;
import ih2.b;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u0005¢\u0006\u0002\u0010\u0002J$\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\u0006H\u0014¨\u0006\u000b"}, d2 = {"Lcom/garmin/android/gncs/datamappers/FacebookMessengerDataMapper;", "Lcom/garmin/android/gncs/datamappers/GenericDataMapper;", "()V", "mapStatus", "", "ni", "Lcom/garmin/android/gncs/GNCSNotificationInfo;", "extras", "Landroid/os/Bundle;", "existing", "Companion", "gncs-all-modules_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class FacebookMessengerDataMapper extends GenericDataMapper {
    private static final String TAG = "FacebookMessengerDataMapper: ";

    @Override // com.garmin.android.gncs.datamappers.GenericDataMapper, com.garmin.android.gncs.datamappers.AbstractDataMapper
    public void mapStatus(GNCSNotificationInfo ni3, Bundle extras, GNCSNotificationInfo existing) {
        ni3.getClass();
        if (GNCSNotificationInfo.NotificationStatus.REMOVED != (existing != null ? existing.status : null)) {
            super.mapStatus(ni3, extras, existing);
            return;
        }
        ni3.status = GNCSNotificationInfo.NotificationStatus.NEW;
        b.b("FacebookMessengerDataMapper: mapStatus -> shouldSendToDevice incoming set to NEW, incoming type " + ni3.type.name());
        ni3.statusTimestamp = System.currentTimeMillis();
    }
}
