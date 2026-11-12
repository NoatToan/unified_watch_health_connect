package com.garmin.android.gncs.datamappers;

import android.content.Context;
import android.net.Uri;
import ch.qos.logback.core.CoreConstants;
import com.airbnb.lottie.animation.keyframe.a;
import com.garmin.android.gncs.GNCSNotificationInfo;
import com.garmin.android.gncs.SmartNotificationsUtil;
import ih2.b;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u0005¢\u0006\u0002\u0010\u0002J \u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0014¨\u0006\f"}, d2 = {"Lcom/garmin/android/gncs/datamappers/ImageValidateDataMapper;", "Lcom/garmin/android/gncs/datamappers/ConfigurableDataMapper;", "()V", "addImagesToMMSNotification", "", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/content/Context;", "notificationInfo", "Lcom/garmin/android/gncs/GNCSNotificationInfo;", "imageUri", "Landroid/net/Uri;", "Companion", "gncs-all-modules_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class ImageValidateDataMapper extends ConfigurableDataMapper {
    public static final String TAG = "MMS# ImageValidateDataMapper: ";

    @Override // com.garmin.android.gncs.datamappers.GenericDataMapper, com.garmin.android.gncs.datamappers.AbstractDataMapper
    public void addImagesToMMSNotification(Context context, GNCSNotificationInfo notificationInfo, Uri imageUri) {
        context.getClass();
        notificationInfo.getClass();
        imageUri.getClass();
        b.b("MMS# ImageValidateDataMapper:  addImagesToMMSNotification for [" + notificationInfo.notificationKey + "] ");
        if (SmartNotificationsUtil.isImageAccessible(context, imageUri)) {
            a.s("MMS# ImageValidateDataMapper:   Valid Image. Adding image to [", notificationInfo.notificationKey, "] ");
            super.addImagesToMMSNotification(context, notificationInfo, imageUri);
        } else {
            b.b("MMS# ImageValidateDataMapper:  Skipping invalid Image " + imageUri + "  ");
        }
    }
}
