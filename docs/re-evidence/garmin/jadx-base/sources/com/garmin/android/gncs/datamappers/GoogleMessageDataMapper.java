package com.garmin.android.gncs.datamappers;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.gncs.GNCSNotificationInfo;
import com.garmin.android.gncs.GNCSParsedNotification;
import com.garmin.android.gncs.persistence.GNCSNotificationAction;
import java.util.ArrayList;
import java.util.List;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J \u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0014¨\u0006\u000b"}, d2 = {"Lcom/garmin/android/gncs/datamappers/GoogleMessageDataMapper;", "Lcom/garmin/android/gncs/datamappers/ConfigurableDataMapper;", "()V", "mapAdvancedActions", "", "pn", "Lcom/garmin/android/gncs/GNCSParsedNotification;", "ni", "Lcom/garmin/android/gncs/GNCSNotificationInfo;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/content/Context;", "gncs-all-modules_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class GoogleMessageDataMapper extends ConfigurableDataMapper {
    @Override // com.garmin.android.gncs.datamappers.GenericDataMapper, com.garmin.android.gncs.datamappers.AbstractDataMapper
    public void mapAdvancedActions(GNCSParsedNotification pn3, GNCSNotificationInfo ni3, Context context) {
        pn3.getClass();
        ni3.getClass();
        context.getClass();
        super.mapAdvancedActions(pn3, ni3, context);
        List<GNCSNotificationAction> list = ni3.actions;
        ArrayList arrayList = new ArrayList();
        list.getClass();
        for (Object obj : list) {
            GNCSNotificationAction gNCSNotificationAction = (GNCSNotificationAction) obj;
            if (gNCSNotificationAction.dismissAction || gNCSNotificationAction.requiresInput || gNCSNotificationAction.id == 99) {
                arrayList.add(obj);
            }
        }
        ni3.actions = arrayList;
    }
}
