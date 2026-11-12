package com.garmin.android.ancs;

import com.garmin.android.gncs.settings.SmartNotificationsConfig;
import ih2.b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class ANCSGetNotificationAttributesRequest extends ANCSCommandMessage {
    private static final int ATTRIBUTE_ID_LENGTH = 1;
    private static final int ATTRIBUTE_MAX_LEN_LENGTH = 2;
    private static final int NOTIFICATION_ID_LENGTH = 4;
    public final List<ANCSNotificationAttribute> attributes;
    public final long notificationId;

    /* JADX INFO: renamed from: com.garmin.android.ancs.ANCSGetNotificationAttributesRequest$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$garmin$android$ancs$ANCSMessageBase$NotificationAttributeID;

        static {
            int[] iArr = new int[ANCSMessageBase.NotificationAttributeID.values().length];
            $SwitchMap$com$garmin$android$ancs$ANCSMessageBase$NotificationAttributeID = iArr;
            try {
                iArr[ANCSMessageBase.NotificationAttributeID.APP_IDENTIFIER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$garmin$android$ancs$ANCSMessageBase$NotificationAttributeID[ANCSMessageBase.NotificationAttributeID.MESSAGE_SIZE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$garmin$android$ancs$ANCSMessageBase$NotificationAttributeID[ANCSMessageBase.NotificationAttributeID.DATE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$garmin$android$ancs$ANCSMessageBase$NotificationAttributeID[ANCSMessageBase.NotificationAttributeID.POSITIVE_ACTION_LABEL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$garmin$android$ancs$ANCSMessageBase$NotificationAttributeID[ANCSMessageBase.NotificationAttributeID.NEGATIVE_ACTION_LABEL.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$garmin$android$ancs$ANCSMessageBase$NotificationAttributeID[ANCSMessageBase.NotificationAttributeID.MEDIA_OBJECT_COUNT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$garmin$android$ancs$ANCSMessageBase$NotificationAttributeID[ANCSMessageBase.NotificationAttributeID.TITLE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$garmin$android$ancs$ANCSMessageBase$NotificationAttributeID[ANCSMessageBase.NotificationAttributeID.SUBTITLE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$garmin$android$ancs$ANCSMessageBase$NotificationAttributeID[ANCSMessageBase.NotificationAttributeID.MESSAGE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$com$garmin$android$ancs$ANCSMessageBase$NotificationAttributeID[ANCSMessageBase.NotificationAttributeID.PHONE_NUMBER.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$com$garmin$android$ancs$ANCSMessageBase$NotificationAttributeID[ANCSMessageBase.NotificationAttributeID.CONVERSATION_ID.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$com$garmin$android$ancs$ANCSMessageBase$NotificationAttributeID[ANCSMessageBase.NotificationAttributeID.ACTIONS.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ANCSGetNotificationAttributesRequest(byte[] bArr) throws ANCSInvalidParameterException, ANCSInvalidCommandException, ANCSInvalidFormatException {
        ANCSMessageBase.CommandID commandID = ANCSMessageBase.CommandID.GET_NOTIFICATION_ATTRIBUTES;
        super(commandID);
        if (ANCSMessageBase.getByte(bArr, 0) != commandID.f28618id) {
            throw new ANCSInvalidCommandException(ANCSMessageBase.getByte(bArr, 0));
        }
        try {
            this.notificationId = ANCSMessageBase.getInt(bArr, 1);
            try {
                List<ANCSNotificationAttribute> listUnmodifiableList = Collections.unmodifiableList(parseAttributes(bArr));
                this.attributes = listUnmodifiableList;
                if (listUnmodifiableList.isEmpty()) {
                    throw new ANCSInvalidParameterException("No attributes specified");
                }
            } catch (Exception e4) {
                throw new ANCSInvalidFormatException("Failed to parse attributes", e4);
            }
        } catch (Exception e14) {
            throw new ANCSInvalidFormatException("Failed to parse notification ID", e14);
        }
    }

    private static List<ANCSNotificationAttribute> parseAttributes(byte[] bArr) {
        byte b14;
        byte b15;
        ArrayList arrayList = new ArrayList();
        int i14 = 5;
        while (i14 < bArr.length) {
            ANCSMessageBase.NotificationAttributeID notificationAttributeIDFromId = ANCSMessageBase.NotificationAttributeID.fromId(ANCSMessageBase.getByte(bArr, i14));
            int i15 = i14 + 1;
            short s8 = 0;
            switch (AnonymousClass1.$SwitchMap$com$garmin$android$ancs$ANCSMessageBase$NotificationAttributeID[notificationAttributeIDFromId.ordinal()]) {
                case 7:
                case 8:
                case 9:
                case 10:
                case 11:
                    i14 += 3;
                    b14 = 0;
                    b15 = 0;
                    s8 = ANCSMessageBase.getShort(bArr, i15);
                    break;
                case 12:
                    s8 = ANCSMessageBase.getByte(bArr, i15);
                    int i16 = i14 + 3;
                    byte b16 = ANCSMessageBase.getByte(bArr, i14 + 2);
                    i14 += 4;
                    b15 = ANCSMessageBase.getByte(bArr, i16);
                    b14 = b16;
                    break;
                default:
                    i14 = i15;
                    b14 = 0;
                    b15 = 0;
                    break;
            }
            arrayList.add(new ANCSNotificationAttribute(notificationAttributeIDFromId, s8, b14, b15, null));
        }
        return arrayList;
    }

    @Override // com.garmin.android.ancs.ANCSCommandMessage
    public void dump() {
        StringBuilder sb3 = new StringBuilder("ANCSGetNotificationAttributesRequest\n    NotificationId: ");
        sb3.append(this.notificationId);
        sb3.append('\n');
        if (SmartNotificationsConfig.getInstance().isVerboseLoggingEnabled()) {
            sb3.append("    Attributes >>>\n");
            for (ANCSNotificationAttribute aNCSNotificationAttribute : this.attributes) {
                sb3.append("        ID: ");
                sb3.append(aNCSNotificationAttribute.notificationAttributeId);
                sb3.append('\n');
                ANCSMessageBase.NotificationAttributeID notificationAttributeID = aNCSNotificationAttribute.notificationAttributeId;
                if (notificationAttributeID == ANCSMessageBase.NotificationAttributeID.TITLE || notificationAttributeID == ANCSMessageBase.NotificationAttributeID.SUBTITLE || notificationAttributeID == ANCSMessageBase.NotificationAttributeID.MESSAGE || notificationAttributeID == ANCSMessageBase.NotificationAttributeID.PHONE_NUMBER || notificationAttributeID == ANCSMessageBase.NotificationAttributeID.CONVERSATION_ID || notificationAttributeID == ANCSMessageBase.NotificationAttributeID.ACTIONS) {
                    sb3.append("        MaxLength: ");
                    sb3.append(aNCSNotificationAttribute.maxLength);
                    sb3.append('\n');
                }
                if (aNCSNotificationAttribute.notificationAttributeId == ANCSMessageBase.NotificationAttributeID.ACTIONS) {
                    sb3.append("        MaxActions: ");
                    sb3.append(aNCSNotificationAttribute.maxActions);
                    sb3.append("\n        ActionFlags: ");
                    sb3.append(aNCSNotificationAttribute.actionFlags);
                    sb3.append('\n');
                }
            }
        }
        b.b(sb3.toString());
    }

    @Override // com.garmin.android.ancs.ANCSMessageBase
    public byte[] serialize() {
        byte[] bArr = new byte[size()];
        ANCSMessageBase.putByte(bArr, 0, this.commandId.f28618id);
        ANCSMessageBase.putInt(bArr, 1, (int) this.notificationId);
        int i14 = 5;
        for (ANCSNotificationAttribute aNCSNotificationAttribute : this.attributes) {
            ANCSMessageBase.putByte(bArr, i14, aNCSNotificationAttribute.notificationAttributeId.f28620id);
            int i15 = i14 + 1;
            switch (AnonymousClass1.$SwitchMap$com$garmin$android$ancs$ANCSMessageBase$NotificationAttributeID[aNCSNotificationAttribute.notificationAttributeId.ordinal()]) {
                case 7:
                case 8:
                case 9:
                case 10:
                case 11:
                    ANCSMessageBase.putShort(bArr, i15, (short) aNCSNotificationAttribute.maxLength);
                    i14 += 3;
                    break;
                case 12:
                    ANCSMessageBase.putByte(bArr, i15, (byte) aNCSNotificationAttribute.maxLength);
                    int i16 = i14 + 3;
                    ANCSMessageBase.putByte(bArr, i14 + 2, (byte) aNCSNotificationAttribute.maxActions);
                    i14 += 4;
                    ANCSMessageBase.putByte(bArr, i16, (byte) aNCSNotificationAttribute.actionFlags);
                    break;
                default:
                    i14 = i15;
                    break;
            }
        }
        return bArr;
    }

    @Override // com.garmin.android.ancs.ANCSMessageBase
    public int size() {
        Iterator<ANCSNotificationAttribute> it = this.attributes.iterator();
        int i14 = 5;
        while (it.hasNext()) {
            int i15 = i14 + 1;
            switch (AnonymousClass1.$SwitchMap$com$garmin$android$ancs$ANCSMessageBase$NotificationAttributeID[it.next().notificationAttributeId.ordinal()]) {
                case 7:
                case 8:
                case 9:
                case 10:
                case 11:
                    i14 += 3;
                    break;
                case 12:
                    i14 += 4;
                    break;
                default:
                    i14 = i15;
                    break;
            }
        }
        return i14;
    }

    public ANCSGetNotificationAttributesRequest(long j8, List<ANCSNotificationAttribute> list) {
        super(ANCSMessageBase.CommandID.GET_NOTIFICATION_ATTRIBUTES);
        this.notificationId = j8;
        this.attributes = Collections.unmodifiableList(list);
    }
}
