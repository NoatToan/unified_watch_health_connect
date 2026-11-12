package com.garmin.android.gncs.datamappers;

import android.content.Context;
import android.os.Bundle;
import com.garmin.android.ancs.ANCSMessageBase;
import com.garmin.android.gncs.GNCSNotificationInfo;
import com.garmin.android.gncs.GNCSParsedNotification;
import com.garmin.android.gncs.R;
import com.garmin.android.gncs.persistence.GNCSNotificationAction;
import com.garmin.android.gncs.telephony.TelephonyUtilKt;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes11.dex */
public class DialerDataMapper extends ConfigurableDataMapper {
    public static int getIncomingCallNotificationActionIndex(boolean z14, int i14) {
        if (i14 <= 0) {
            return -1;
        }
        if (i14 == 1) {
            return z14 ? 0 : -1;
        }
        return z14 ? 1 : 0;
    }

    @Override // com.garmin.android.gncs.datamappers.GenericDataMapper, com.garmin.android.gncs.datamappers.AbstractDataMapper
    public void mapAdvancedActions(GNCSParsedNotification gNCSParsedNotification, GNCSNotificationInfo gNCSNotificationInfo, Context context) {
        if (gNCSNotificationInfo.type != GNCSNotificationInfo.NotificationType.INCOMING_CALL || !TelephonyUtilKt.isDialerPackage(context, gNCSNotificationInfo.packageName)) {
            super.mapAdvancedActions(gNCSParsedNotification, gNCSNotificationInfo, context);
            return;
        }
        ArrayList arrayList = new ArrayList(3);
        gNCSNotificationInfo.actions = arrayList;
        arrayList.add(new GNCSNotificationAction(96, context.getString(R.string.accept_call), false, GNCSNotificationAction.ActionType.POSITIVE));
        gNCSNotificationInfo.actions.add(new GNCSNotificationAction(97, context.getString(R.string.decline_call), false, GNCSNotificationAction.ActionType.NEGATIVE));
        gNCSNotificationInfo.actions.add(new GNCSNotificationAction(95, context.getString(R.string.reply_call), true, GNCSNotificationAction.ActionType.NEUTRAL));
        gNCSNotificationInfo.extraFlags |= ANCSMessageBase.FeatureFlag.HAS_ANDROID_ACTIONS.flag;
    }

    @Override // com.garmin.android.gncs.datamappers.ConfigurableDataMapper, com.garmin.android.gncs.datamappers.GenericDataMapper, com.garmin.android.gncs.datamappers.AbstractDataMapper
    public void mapSimpleActions(Context context, GNCSNotificationInfo gNCSNotificationInfo) {
        if (gNCSNotificationInfo.actions.size() < 2 || !TelephonyUtilKt.isDialerPackage(context, gNCSNotificationInfo.packageName)) {
            return;
        }
        gNCSNotificationInfo.positiveActionIndex = 0;
        gNCSNotificationInfo.positiveAction = gNCSNotificationInfo.actions.get(0).title;
        gNCSNotificationInfo.negativeActionIndex = 1;
        gNCSNotificationInfo.negativeAction = gNCSNotificationInfo.actions.get(1).title;
    }

    @Override // com.garmin.android.gncs.datamappers.GenericDataMapper, com.garmin.android.gncs.datamappers.AbstractDataMapper
    public void mapStatus(GNCSNotificationInfo gNCSNotificationInfo, Bundle bundle, GNCSNotificationInfo gNCSNotificationInfo2) {
        super.mapStatus(gNCSNotificationInfo, bundle, gNCSNotificationInfo2);
        GNCSNotificationInfo.NotificationStatus notificationStatus = gNCSNotificationInfo.status;
        if (notificationStatus == GNCSNotificationInfo.NotificationStatus.NEW_SILENT || notificationStatus == GNCSNotificationInfo.NotificationStatus.UPDATED) {
            gNCSNotificationInfo.status = GNCSNotificationInfo.NotificationStatus.NEW;
        }
    }
}
