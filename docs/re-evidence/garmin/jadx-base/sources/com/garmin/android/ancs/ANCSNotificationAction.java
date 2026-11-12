package com.garmin.android.ancs;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
public class ANCSNotificationAction extends ANCSMessageBase {
    private static final int ACTION_FLAG_LENGTH = 1;
    private static final int ACTION_ID_LENGTH = 1;
    private static final int TITLE_LENGTH = 1;
    public final Set<ActionFlag> actionFlags;
    public final byte actionId;
    private final int maxTitleLength;
    public final String title;

    public enum ActionFlag {
        REQUEST_INPUT((byte) 1),
        POSITIVE_ACTION((byte) 2),
        NEGATIVE_ACTION((byte) 4),
        DISMISS_ACTION((byte) 8);

        public final byte flag;

        ActionFlag(byte b14) {
            this.flag = b14;
        }

        public static EnumSet<ActionFlag> fromFlags(byte b14) {
            EnumSet<ActionFlag> enumSetNoneOf = EnumSet.noneOf(ActionFlag.class);
            for (ActionFlag actionFlag : values()) {
                byte b15 = actionFlag.flag;
                if ((b15 & b14) == b15) {
                    enumSetNoneOf.add(actionFlag);
                }
            }
            return enumSetNoneOf;
        }
    }

    public ANCSNotificationAction(byte[] bArr, int i14) throws ANCSInvalidFormatException {
        try {
            this.actionId = ANCSMessageBase.getByte(bArr, i14);
            this.actionFlags = Collections.unmodifiableSet(ActionFlag.fromFlags(ANCSMessageBase.getByte(bArr, i14 + 1)));
            byte b14 = ANCSMessageBase.getByte(bArr, i14 + 2);
            this.maxTitleLength = b14;
            this.title = new String(bArr, i14 + 3, b14, Charset.defaultCharset());
        } catch (Exception e4) {
            throw new ANCSInvalidFormatException("Failed to parse notification action", e4);
        }
    }

    @Override // com.garmin.android.ancs.ANCSMessageBase
    public byte[] serialize() {
        byte[] bArr = new byte[size()];
        ANCSMessageBase.putByte(bArr, 0, this.actionId);
        Iterator<ActionFlag> it = this.actionFlags.iterator();
        byte b14 = 0;
        while (it.hasNext()) {
            b14 = (byte) (b14 | it.next().flag);
        }
        ANCSMessageBase.putByte(bArr, 1, b14);
        byte[] bytes = this.title.getBytes();
        int length = bytes.length;
        int i14 = this.maxTitleLength;
        if (length > i14) {
            bytes = Arrays.copyOfRange(bytes, 0, i14);
        }
        ANCSMessageBase.putByte(bArr, 2, (byte) bytes.length);
        ANCSMessageBase.putBytes(bArr, 3, bytes);
        return bArr;
    }

    @Override // com.garmin.android.ancs.ANCSMessageBase
    public int size() {
        return Math.min(this.title.getBytes().length, this.maxTitleLength) + 3;
    }

    public ANCSNotificationAction(byte[] bArr) {
        this(bArr, 0);
    }

    public ANCSNotificationAction(byte b14, Set<ActionFlag> set, String str, int i14) {
        this.actionId = b14;
        this.actionFlags = Collections.unmodifiableSet(set);
        this.title = str;
        this.maxTitleLength = i14;
    }
}
