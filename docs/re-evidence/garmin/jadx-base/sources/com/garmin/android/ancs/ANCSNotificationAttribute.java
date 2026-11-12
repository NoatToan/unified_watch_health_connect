package com.garmin.android.ancs;

import vb.h;

/* JADX INFO: loaded from: classes7.dex */
public class ANCSNotificationAttribute extends ANCSAttribute {
    public final ANCSMessageBase.NotificationAttributeID notificationAttributeId;

    /* JADX INFO: renamed from: com.garmin.android.ancs.ANCSNotificationAttribute$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$garmin$android$ancs$ANCSMessageBase$NotificationAttributeID;

        static {
            int[] iArr = new int[ANCSMessageBase.NotificationAttributeID.values().length];
            $SwitchMap$com$garmin$android$ancs$ANCSMessageBase$NotificationAttributeID = iArr;
            try {
                iArr[ANCSMessageBase.NotificationAttributeID.TITLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$garmin$android$ancs$ANCSMessageBase$NotificationAttributeID[ANCSMessageBase.NotificationAttributeID.SUBTITLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$garmin$android$ancs$ANCSMessageBase$NotificationAttributeID[ANCSMessageBase.NotificationAttributeID.MESSAGE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$garmin$android$ancs$ANCSMessageBase$NotificationAttributeID[ANCSMessageBase.NotificationAttributeID.PHONE_NUMBER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$garmin$android$ancs$ANCSMessageBase$NotificationAttributeID[ANCSMessageBase.NotificationAttributeID.ACTIONS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$garmin$android$ancs$ANCSMessageBase$NotificationAttributeID[ANCSMessageBase.NotificationAttributeID.APP_IDENTIFIER.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$garmin$android$ancs$ANCSMessageBase$NotificationAttributeID[ANCSMessageBase.NotificationAttributeID.MESSAGE_SIZE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$garmin$android$ancs$ANCSMessageBase$NotificationAttributeID[ANCSMessageBase.NotificationAttributeID.DATE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$garmin$android$ancs$ANCSMessageBase$NotificationAttributeID[ANCSMessageBase.NotificationAttributeID.POSITIVE_ACTION_LABEL.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$com$garmin$android$ancs$ANCSMessageBase$NotificationAttributeID[ANCSMessageBase.NotificationAttributeID.NEGATIVE_ACTION_LABEL.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$com$garmin$android$ancs$ANCSMessageBase$NotificationAttributeID[ANCSMessageBase.NotificationAttributeID.MEDIA_OBJECT_COUNT.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$com$garmin$android$ancs$ANCSMessageBase$NotificationAttributeID[ANCSMessageBase.NotificationAttributeID.CONVERSATION_ID.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    public ANCSNotificationAttribute(ANCSMessageBase.NotificationAttributeID notificationAttributeID, int i14, int i15, int i16, byte[] bArr) {
        super(i14, i15, i16, bArr);
        int i17 = AnonymousClass1.$SwitchMap$com$garmin$android$ancs$ANCSMessageBase$NotificationAttributeID[notificationAttributeID.ordinal()];
        if ((i17 == 1 || i17 == 2 || i17 == 3 || i17 == 4 || i17 == 5) && i14 <= 0) {
            h.w();
            throw null;
        }
        this.notificationAttributeId = notificationAttributeID;
    }
}
