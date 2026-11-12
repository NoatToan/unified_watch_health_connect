package com.garmin.android.ancs;

import b71.i;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class ANCSNotificationActions extends ANCSMessageBase {
    private static final int ACTIONS_COUNT_LENGTH = 1;
    public final List<ANCSNotificationAction> actions;

    public ANCSNotificationActions(byte[] bArr) throws Exception {
        try {
            this.actions = Collections.unmodifiableList(parseActions(bArr));
        } catch (Exception e4) {
            if (!(e4 instanceof ANCSInvalidFormatException) && !(e4 instanceof ANCSInvalidParameterException)) {
                throw new ANCSInvalidFormatException("Failed to parse notification actions", e4);
            }
            throw e4;
        }
    }

    private static List<ANCSNotificationAction> parseActions(byte[] bArr) throws ANCSInvalidParameterException {
        byte b14 = ANCSMessageBase.getByte(bArr, 0);
        ArrayList arrayList = new ArrayList(b14);
        int size = 1;
        while (size < bArr.length) {
            ANCSNotificationAction aNCSNotificationAction = new ANCSNotificationAction(bArr, size);
            arrayList.add(aNCSNotificationAction);
            size += aNCSNotificationAction.size();
        }
        if (b14 == arrayList.size()) {
            return arrayList;
        }
        StringBuilder sbI = i.i(b14, "Expect ", " actions, got ");
        sbI.append(arrayList.size());
        throw new ANCSInvalidParameterException(sbI.toString());
    }

    @Override // com.garmin.android.ancs.ANCSMessageBase
    public byte[] serialize() {
        byte[] bArr = new byte[size()];
        ANCSMessageBase.putByte(bArr, 0, (byte) this.actions.size());
        Iterator<ANCSNotificationAction> it = this.actions.iterator();
        int length = 1;
        while (it.hasNext()) {
            byte[] bArrSerialize = it.next().serialize();
            ANCSMessageBase.putBytes(bArr, length, bArrSerialize);
            length += bArrSerialize.length;
        }
        return bArr;
    }

    @Override // com.garmin.android.ancs.ANCSMessageBase
    public int size() {
        Iterator<ANCSNotificationAction> it = this.actions.iterator();
        int size = 1;
        while (it.hasNext()) {
            size += it.next().size();
        }
        return size;
    }

    public ANCSNotificationActions(int i14, List<ANCSNotificationAction> list) {
        this.actions = Collections.unmodifiableList(list.size() >= i14 ? list.subList(0, i14) : list);
    }
}
