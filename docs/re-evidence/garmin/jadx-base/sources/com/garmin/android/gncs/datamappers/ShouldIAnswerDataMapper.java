package com.garmin.android.gncs.datamappers;

import android.content.Context;
import com.garmin.android.gncs.GNCSNotificationInfo;
import com.garmin.android.gncs.persistence.GNCSNotificationAction;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class ShouldIAnswerDataMapper extends DialerDataMapper {
    @Override // com.garmin.android.gncs.datamappers.DialerDataMapper, com.garmin.android.gncs.datamappers.ConfigurableDataMapper, com.garmin.android.gncs.datamappers.GenericDataMapper, com.garmin.android.gncs.datamappers.AbstractDataMapper
    public void mapSimpleActions(Context context, GNCSNotificationInfo gNCSNotificationInfo) {
        if (gNCSNotificationInfo.type != GNCSNotificationInfo.NotificationType.INCOMING_CALL) {
            super.mapSimpleActions(context, gNCSNotificationInfo);
            return;
        }
        List<GNCSNotificationAction> noReplyActions = gNCSNotificationInfo.getNoReplyActions();
        if (noReplyActions.size() != 2) {
            super.mapSimpleActions(context, gNCSNotificationInfo);
            return;
        }
        gNCSNotificationInfo.positiveActionIndex = 0;
        gNCSNotificationInfo.positiveAction = noReplyActions.get(0).title;
        noReplyActions.get(gNCSNotificationInfo.positiveActionIndex).actionType = GNCSNotificationAction.ActionType.POSITIVE;
        gNCSNotificationInfo.negativeActionIndex = 1;
        gNCSNotificationInfo.negativeAction = noReplyActions.get(1).title;
        noReplyActions.get(gNCSNotificationInfo.negativeActionIndex).actionType = GNCSNotificationAction.ActionType.NEGATIVE;
    }
}
