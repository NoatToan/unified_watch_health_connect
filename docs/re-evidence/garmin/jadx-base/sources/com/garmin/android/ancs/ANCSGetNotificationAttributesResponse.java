package com.garmin.android.ancs;

import com.garmin.android.gncs.SmartNotificationsUtil;
import com.garmin.android.gncs.settings.SmartNotificationsConfig;
import ih2.b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class ANCSGetNotificationAttributesResponse extends ANCSCommandMessage {
    private static final int ATTRIBUTE_ID_LENGTH = 1;
    private static final int ATTRIBUTE_MAX_LEN_LENGTH = 2;
    private static final int NOTIFICATION_ID_LENGTH = 4;
    public final List<ANCSNotificationAttribute> attributes;
    public final long notificationId;

    /* JADX WARN: Illegal instructions before constructor call */
    public ANCSGetNotificationAttributesResponse(byte[] bArr) throws ANCSInvalidParameterException, ANCSInvalidCommandException, ANCSInvalidFormatException {
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
        ArrayList arrayList = new ArrayList();
        int i14 = 5;
        while (i14 < bArr.length) {
            ANCSMessageBase.NotificationAttributeID notificationAttributeIDFromId = ANCSMessageBase.NotificationAttributeID.fromId(ANCSMessageBase.getByte(bArr, i14));
            short s8 = ANCSMessageBase.getShort(bArr, i14 + 1);
            int i15 = i14 + 3;
            byte[] bytes = s8 > 0 ? ANCSMessageBase.getBytes(bArr, i15, s8) : null;
            i14 = i15 + s8;
            if (s8 == 0 && (notificationAttributeIDFromId == ANCSMessageBase.NotificationAttributeID.TITLE || notificationAttributeIDFromId == ANCSMessageBase.NotificationAttributeID.SUBTITLE || notificationAttributeIDFromId == ANCSMessageBase.NotificationAttributeID.CONVERSATION_ID || notificationAttributeIDFromId == ANCSMessageBase.NotificationAttributeID.MESSAGE || notificationAttributeIDFromId == ANCSMessageBase.NotificationAttributeID.PHONE_NUMBER)) {
                s8 = 50;
            }
            arrayList.add(new ANCSNotificationAttribute(notificationAttributeIDFromId, s8, 0, 0, bytes));
        }
        return arrayList;
    }

    @Override // com.garmin.android.ancs.ANCSCommandMessage
    public void dump() {
        StringBuilder sb3 = new StringBuilder("ANCSGetNotificationAttributesResponse\n    NotificationId: ");
        sb3.append(this.notificationId);
        sb3.append('\n');
        if (SmartNotificationsConfig.getInstance().isVerboseLoggingEnabled()) {
            sb3.append("    Attributes >>>\n");
            for (ANCSNotificationAttribute aNCSNotificationAttribute : this.attributes) {
                sb3.append("        ID: ");
                sb3.append(aNCSNotificationAttribute.notificationAttributeId);
                sb3.append("\n        Value: ");
                sb3.append(SmartNotificationsUtil.obfuscatePayloadIfNeeded(aNCSNotificationAttribute.getValue(aNCSNotificationAttribute.notificationAttributeId != ANCSMessageBase.NotificationAttributeID.ACTIONS)));
                sb3.append('\n');
            }
        }
        b.b(sb3.toString());
    }

    @Override // com.garmin.android.ancs.ANCSMessageBase
    public byte[] serialize() {
        byte[] bArr = new byte[size()];
        ANCSMessageBase.putByte(bArr, 0, this.commandId.f28618id);
        ANCSMessageBase.putInt(bArr, 1, (int) this.notificationId);
        int length = 5;
        for (ANCSNotificationAttribute aNCSNotificationAttribute : this.attributes) {
            ANCSMessageBase.putByte(bArr, length, aNCSNotificationAttribute.notificationAttributeId.f28620id);
            int i14 = length + 1;
            byte[] value = aNCSNotificationAttribute.getValue(aNCSNotificationAttribute.notificationAttributeId != ANCSMessageBase.NotificationAttributeID.ACTIONS);
            ANCSMessageBase.putShort(bArr, i14, (short) value.length);
            int i15 = length + 3;
            ANCSMessageBase.putBytes(bArr, i15, value);
            length = i15 + value.length;
        }
        return bArr;
    }

    @Override // com.garmin.android.ancs.ANCSMessageBase
    public int size() {
        int valueLength = 5;
        for (ANCSNotificationAttribute aNCSNotificationAttribute : this.attributes) {
            valueLength = valueLength + 3 + aNCSNotificationAttribute.getValueLength(aNCSNotificationAttribute.notificationAttributeId != ANCSMessageBase.NotificationAttributeID.ACTIONS);
        }
        return valueLength;
    }

    public ANCSGetNotificationAttributesResponse(long j8, List<ANCSNotificationAttribute> list) {
        super(ANCSMessageBase.CommandID.GET_NOTIFICATION_ATTRIBUTES);
        this.notificationId = j8;
        this.attributes = Collections.unmodifiableList(list);
    }
}
