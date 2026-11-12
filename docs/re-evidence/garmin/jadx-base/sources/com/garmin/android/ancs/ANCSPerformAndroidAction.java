package com.garmin.android.ancs;

import com.garmin.android.gncs.SmartNotificationsUtil;
import ih2.b;

/* JADX INFO: loaded from: classes7.dex */
public class ANCSPerformAndroidAction extends ANCSCommandMessage {
    private static final int ACTION_ID_LENGTH = 1;
    private static final int NOTIFICATION_ID_LENGTH = 4;
    public final int actionId;
    public final long notificationId;
    public final String text;

    /* JADX WARN: Illegal instructions before constructor call */
    public ANCSPerformAndroidAction(byte[] bArr) throws ANCSInvalidCommandException, ANCSInvalidFormatException {
        ANCSMessageBase.CommandID commandID = ANCSMessageBase.CommandID.PERFORM_ANDROID_ACTION;
        super(commandID);
        if (ANCSMessageBase.getByte(bArr, 0) != commandID.f28618id) {
            throw new ANCSInvalidCommandException(ANCSMessageBase.getByte(bArr, 0));
        }
        try {
            this.notificationId = ANCSMessageBase.getInt(bArr, 1);
            this.actionId = ANCSMessageBase.getByte(bArr, 5);
            String string = 6 < bArr.length ? ANCSMessageBase.getString(bArr, 6) : null;
            this.text = string;
            b.b("ANCSPerformAndroidAction Text : " + string + "\nbytes.length : " + bArr.length);
        } catch (Exception e4) {
            throw new ANCSInvalidFormatException("Failed to perform Android action", e4);
        }
    }

    @Override // com.garmin.android.ancs.ANCSCommandMessage
    public void dump() {
        b.b("ANCSPerformAndroidAction\n    NotificationId: " + this.notificationId + "\n    ActionId: " + this.actionId + "\n    Text: " + ((Object) SmartNotificationsUtil.obfuscateIfNeeded(this.text)));
    }

    @Override // com.garmin.android.ancs.ANCSMessageBase
    public byte[] serialize() {
        byte[] bArr = new byte[size()];
        ANCSMessageBase.putByte(bArr, 0, this.commandId.f28618id);
        ANCSMessageBase.putInt(bArr, 1, (int) this.notificationId);
        ANCSMessageBase.putByte(bArr, 5, (byte) this.actionId);
        String str = this.text;
        if (str != null) {
            ANCSMessageBase.putString(bArr, 6, str);
        }
        return bArr;
    }

    @Override // com.garmin.android.ancs.ANCSMessageBase
    public int size() {
        String str = this.text;
        return (str != null ? str.getBytes().length + 1 : 0) + 6;
    }

    public ANCSPerformAndroidAction(long j8, int i14, String str) {
        super(ANCSMessageBase.CommandID.PERFORM_ANDROID_ACTION);
        this.notificationId = j8;
        this.actionId = i14;
        this.text = str;
    }
}
