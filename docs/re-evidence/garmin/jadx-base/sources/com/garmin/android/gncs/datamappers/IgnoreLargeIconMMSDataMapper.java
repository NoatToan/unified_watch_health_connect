package com.garmin.android.gncs.datamappers;

import android.content.Context;
import android.os.Bundle;
import ch.qos.logback.core.CoreConstants;
import com.airbnb.lottie.animation.keyframe.a;
import com.garmin.android.gncs.GNCSNotificationInfo;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u0005¢\u0006\u0002\u0010\u0002J*\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\fH\u0014¨\u0006\u000e"}, d2 = {"Lcom/garmin/android/gncs/datamappers/IgnoreLargeIconMMSDataMapper;", "Lcom/garmin/android/gncs/datamappers/ConfigurableDataMapper;", "()V", "populateMedia", "", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/content/Context;", "notificationInfo", "Lcom/garmin/android/gncs/GNCSNotificationInfo;", "extras", "Landroid/os/Bundle;", "ignoreLargeIcon", "", "Companion", "gncs-all-modules_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class IgnoreLargeIconMMSDataMapper extends ConfigurableDataMapper {
    public static final String TAG = "MMS# IgnoreLargeIconMMSDataMapper: ";

    @Override // com.garmin.android.gncs.datamappers.GenericDataMapper, com.garmin.android.gncs.datamappers.AbstractDataMapper
    public void populateMedia(Context context, GNCSNotificationInfo notificationInfo, Bundle extras, boolean ignoreLargeIcon) {
        context.getClass();
        notificationInfo.getClass();
        a.s("MMS# IgnoreLargeIconMMSDataMapper:  populateMedia for [", notificationInfo.notificationKey, "] ");
        super.populateMedia(context, notificationInfo, extras, true);
    }
}
