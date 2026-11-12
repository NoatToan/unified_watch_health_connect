package com.garmin.android.gncs;

import android.os.Bundle;
import com.garmin.android.gncs.persistence.GNCSNotificationAction;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0002\u0010\u000bR\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/garmin/android/gncs/GNCSParsedNotification;", "", "notificationInfo", "Lcom/garmin/android/gncs/GNCSNotificationInfo;", "existingInfo", "extras", "Landroid/os/Bundle;", "actions", "", "Lcom/garmin/android/gncs/persistence/GNCSNotificationAction;", "wearableActions", "(Lcom/garmin/android/gncs/GNCSNotificationInfo;Lcom/garmin/android/gncs/GNCSNotificationInfo;Landroid/os/Bundle;Ljava/util/List;Ljava/util/List;)V", "gncs-all-modules_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class GNCSParsedNotification {
    public final List<GNCSNotificationAction> actions;
    public final GNCSNotificationInfo existingInfo;
    public final Bundle extras;
    public final GNCSNotificationInfo notificationInfo;
    public final List<GNCSNotificationAction> wearableActions;

    public GNCSParsedNotification(GNCSNotificationInfo gNCSNotificationInfo, GNCSNotificationInfo gNCSNotificationInfo2, Bundle bundle, List<GNCSNotificationAction> list, List<GNCSNotificationAction> list2) {
        gNCSNotificationInfo.getClass();
        list.getClass();
        list2.getClass();
        this.notificationInfo = gNCSNotificationInfo;
        this.existingInfo = gNCSNotificationInfo2;
        this.extras = bundle;
        this.actions = list;
        this.wearableActions = list2;
    }
}
