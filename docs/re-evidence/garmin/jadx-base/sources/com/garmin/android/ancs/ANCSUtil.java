package com.garmin.android.ancs;

import com.garmin.android.gncs.GNCSNotificationInfo;
import com.garmin.android.gncs.persistence.GNCSNotificationAction;
import ih2.b;
import java.util.HashSet;

/* JADX INFO: loaded from: classes7.dex */
class ANCSUtil {

    /* JADX INFO: renamed from: com.garmin.android.ancs.ANCSUtil$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$garmin$android$gncs$persistence$GNCSNotificationAction$ActionType;

        static {
            int[] iArr = new int[GNCSNotificationAction.ActionType.values().length];
            $SwitchMap$com$garmin$android$gncs$persistence$GNCSNotificationAction$ActionType = iArr;
            try {
                iArr[GNCSNotificationAction.ActionType.POSITIVE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$garmin$android$gncs$persistence$GNCSNotificationAction$ActionType[GNCSNotificationAction.ActionType.NEGATIVE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$garmin$android$gncs$persistence$GNCSNotificationAction$ActionType[GNCSNotificationAction.ActionType.NEUTRAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static ANCSNotificationAction fromGncsNotificationAction(GNCSNotificationAction gNCSNotificationAction, int i14) {
        HashSet hashSet = new HashSet();
        if (gNCSNotificationAction.requiresInput) {
            hashSet.add(ANCSNotificationAction.ActionFlag.REQUEST_INPUT);
        }
        int i15 = AnonymousClass1.$SwitchMap$com$garmin$android$gncs$persistence$GNCSNotificationAction$ActionType[gNCSNotificationAction.actionType.ordinal()];
        if (i15 == 1) {
            hashSet.add(ANCSNotificationAction.ActionFlag.POSITIVE_ACTION);
        } else if (i15 == 2) {
            hashSet.add(ANCSNotificationAction.ActionFlag.NEGATIVE_ACTION);
        }
        if (gNCSNotificationAction.dismissAction) {
            hashSet.add(ANCSNotificationAction.ActionFlag.DISMISS_ACTION);
        }
        return new ANCSNotificationAction((byte) gNCSNotificationAction.id, hashSet, gNCSNotificationAction.title, i14);
    }

    public static ANCSMessageBase.CategoryID getCategoryForNotificationType(GNCSNotificationInfo.NotificationType notificationType) {
        for (ANCSMessageBase.CategoryID categoryID : ANCSMessageBase.CategoryID.values()) {
            if (categoryID.f28617id == notificationType.f49893id) {
                return categoryID;
            }
        }
        b.b("ANCSUtil.getCategoryForNotificationType -> unknown notification type: " + notificationType + ", mapped to OTHER");
        return ANCSMessageBase.CategoryID.OTHER;
    }
}
