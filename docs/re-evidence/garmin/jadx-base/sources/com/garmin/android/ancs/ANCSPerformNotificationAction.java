package com.garmin.android.ancs;

import ih2.b;

/* JADX INFO: loaded from: classes7.dex */
public class ANCSPerformNotificationAction extends ANCSCommandMessage {
    private static final int ACTION_ID_LENGTH = 1;
    private static final int NOTIFICATION_ID_LENGTH = 4;
    public final ANCSMessageBase.ActionID actionId;
    public final long notificationId;

    /* JADX WARN: Illegal instructions before constructor call */
    public ANCSPerformNotificationAction(byte[] bArr) throws ANCSInvalidCommandException, ANCSInvalidFormatException {
        ANCSMessageBase.CommandID commandID = ANCSMessageBase.CommandID.PERFORM_NOTIFICATION_ACTION;
        super(commandID);
        if (ANCSMessageBase.getByte(bArr, 0) != commandID.f28618id) {
            throw new ANCSInvalidCommandException(ANCSMessageBase.getByte(bArr, 0));
        }
        try {
            this.notificationId = ANCSMessageBase.getInt(bArr, 1);
            this.actionId = ANCSMessageBase.ActionID.fromId(ANCSMessageBase.getByte(bArr, 5));
        } catch (Exception e4) {
            throw new ANCSInvalidFormatException("Failed to perform notification action", e4);
        }
    }

    @Override // com.garmin.android.ancs.ANCSCommandMessage
    public void dump() {
        b.b("ANCSPerformNotificationAction\n    NotificationId: " + this.notificationId + "\n    ActionId: " + this.actionId);
    }

    @Override // com.garmin.android.ancs.ANCSMessageBase
    public byte[] serialize() {
        byte[] bArr = new byte[size()];
        ANCSMessageBase.putByte(bArr, 0, this.commandId.f28618id);
        ANCSMessageBase.putInt(bArr, 1, (int) this.notificationId);
        ANCSMessageBase.putByte(bArr, 5, this.actionId.f28615id);
        return bArr;
    }

    @Override // com.garmin.android.ancs.ANCSMessageBase
    public int size() {
        return 6;
    }

    public ANCSPerformNotificationAction(long j8, ANCSMessageBase.ActionID actionID) {
        super(ANCSMessageBase.CommandID.PERFORM_NOTIFICATION_ACTION);
        this.notificationId = j8;
        this.actionId = actionID;
    }
}
