package com.garmin.android.ancs;

import com.google.common.base.Ascii;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
public class ANCSNotificationSource extends ANCSMessageBase {
    private static final int CATEGORY_COUNT_LENGTH = 1;
    private static final int CATEGORY_ID_LENGTH = 1;
    private static final int EVENT_FLAGS_LENGTH = 1;
    private static final int EVENT_ID_LENGTH = 1;
    private static final int FEATURE_FLAGS_LENGTH = 1;
    private static final int MESSAGE_LENGTH = 9;
    private static final int NOTIFICATION_ID_LENGTH = 4;
    public final int categoryCount;
    public final ANCSMessageBase.CategoryID categoryId;
    public final Set<ANCSMessageBase.EventFlag> eventFlags;
    public final ANCSMessageBase.EventID eventId;
    public final Set<ANCSMessageBase.FeatureFlag> featureFlags;
    public final long notificationId;

    public ANCSNotificationSource(byte[] bArr) throws ANCSInvalidFormatException {
        try {
            this.eventId = ANCSMessageBase.EventID.fromId(ANCSMessageBase.getByte(bArr, 0));
            this.eventFlags = Collections.unmodifiableSet(ANCSMessageBase.EventFlag.fromFlags(ANCSMessageBase.getByte(bArr, 1)));
            this.categoryId = ANCSMessageBase.CategoryID.fromId(ANCSMessageBase.getByte(bArr, 2));
            this.categoryCount = ANCSMessageBase.getByte(bArr, 3);
            this.notificationId = ANCSMessageBase.getInt(bArr, 4);
            this.featureFlags = Collections.unmodifiableSet(ANCSMessageBase.FeatureFlag.fromFlags(ANCSMessageBase.getByte(bArr, 8)));
        } catch (Exception e4) {
            throw new ANCSInvalidFormatException("Failed to parse notification source", e4);
        }
    }

    @Override // com.garmin.android.ancs.ANCSMessageBase
    public byte[] serialize() {
        byte[] bArr = new byte[size()];
        byte b14 = 0;
        ANCSMessageBase.putByte(bArr, 0, this.eventId.f28619id);
        Iterator<ANCSMessageBase.EventFlag> it = this.eventFlags.iterator();
        byte b15 = 0;
        while (it.hasNext()) {
            b15 = (byte) (b15 | it.next().flag);
        }
        ANCSMessageBase.putByte(bArr, 1, b15);
        ANCSMessageBase.putByte(bArr, 2, this.categoryId.f28617id);
        int i14 = this.categoryCount;
        ANCSMessageBase.putByte(bArr, 3, i14 < 128 ? (byte) i14 : Ascii.DEL);
        ANCSMessageBase.putInt(bArr, 4, (int) this.notificationId);
        Iterator<ANCSMessageBase.FeatureFlag> it3 = this.featureFlags.iterator();
        while (it3.hasNext()) {
            b14 = (byte) (b14 | it3.next().flag);
        }
        ANCSMessageBase.putByte(bArr, 8, b14);
        return bArr;
    }

    @Override // com.garmin.android.ancs.ANCSMessageBase
    public int size() {
        return 9;
    }

    public ANCSNotificationSource(ANCSMessageBase.EventID eventID, Set<ANCSMessageBase.EventFlag> set, ANCSMessageBase.CategoryID categoryID, int i14, long j8, Set<ANCSMessageBase.FeatureFlag> set2) {
        this.eventId = eventID;
        this.eventFlags = Collections.unmodifiableSet(set);
        this.categoryId = categoryID;
        this.categoryCount = i14;
        this.notificationId = j8;
        this.featureFlags = Collections.unmodifiableSet(set2);
    }
}
